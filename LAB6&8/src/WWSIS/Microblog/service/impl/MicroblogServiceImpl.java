package WWSIS.Microblog.service.impl;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import WWSIS.Microblog.dao.FollowerDao;
import WWSIS.Microblog.dao.UserDao;
import WWSIS.Microblog.dao.PostDao;
import WWSIS.Microblog.model.Follower;
import WWSIS.Microblog.model.User;
import WWSIS.Microblog.model.Post;
import WWSIS.Microblog.service.MicroblogService;

//@Service
public class MicroblogServiceImpl implements MicroblogService{ 
public String createPost(String username, Post post) {
		
		BlogUser blogUser = findBlogUserByUsername(username);
		String errorMessage = "";

		if(blogUser != null) {
			post.setBlogUser(blogUser);
			post.setCreatedDate(new Date());
			
			try {
				postRepository.save(post);
			} catch(DataIntegrityViolationException ex) {
				logger.error("DataIntegrityViolationException when saving post for user " + username + ".", ex);
				errorMessage = "Could not save post for user \"" + username + "\".";
			} catch(RuntimeException ex) {
				logger.error("RuntimeException when saving post for user " + username + ".", ex);
				errorMessage = "Could not save post for user \"" + username + "\".  An unexpected problem occurred when trying to save the data.";			
			}
		} else {
			errorMessage = "Could not save post because the user \"" + username + "\" could not be found.";
		}
		
		return errorMessage;
	}
	
	public List<PostDao> getFollowersPostsForUser(String username, Date createdAfter) {
		List<String> following = getFollowingList(username);
		// get posts for yourself as well
		following.add(username);
		
		List<Post> posts = null;
		try {
			posts = postRepository.findByUsernameIn(following, createdAfter);
		} catch(RuntimeException ex) {
			logger.error("RuntimeException when getting posts for these users: " + StringUtils.join(following, ", ") + ".", ex);
		}
		return PostDao.createUserPosts(posts);
	}
	
	public Page<Post> getAllPostsForUsers(List<String> usernames, int pageNumber) {
		Page<Post> posts = null;
		try {
			posts = postRepository.findByUsernameIn(usernames, new PageRequest(pageNumber, POSTS_PER_PAGE));
		} catch(RuntimeException ex) {
			logger.error("RuntimeException when getting posts for these users (paged): " + StringUtils.join(usernames, ", ") + ".", ex);
		}
		return posts;
	}
	
	public Page<Post> getAllFollowersPostsForUser(String username, int pageNumber) {
		List<String> following = getFollowingList(username);
		// get posts for yourself as well
		following.add(username);
		return getAllPostsForUsers(following, pageNumber);
	}
	
	public String addFollower(String targetUsername, String followerUsername) {
		String errorMessage = "";
		BlogUser targetBlogUser = findBlogUserByUsername(targetUsername);
		BlogUser followerBlogUser = findBlogUserByUsername(followerUsername);
		Follower follower = new Follower();
		FollowerKey followerKey = new FollowerKey();
		followerKey.setTarget(targetBlogUser);
		followerKey.setFollower(followerBlogUser);
		follower.setFollowerKey(followerKey);
		
		try {
			followerRepository.save(follower);
		} catch(RuntimeException ex) {
			logger.error("RuntimeException when the user \"" + followerUsername + "\" tried to follow \"" + targetUsername + "\".", ex);
			errorMessage = "The user \"" + followerUsername + "\" could not follow \"" + targetUsername + "\".  An unexpected problem occurred when trying to save the data.";			
		}
		return errorMessage;
	}
	
	public List<String> getFollowingList(String username) {
		List<String> followingList = null;
		
		try {
			followingList = followerRepository.findByFollowerUsername(username);
		} catch(RuntimeException ex) {
			logger.error("RuntimeException when finding list of this users followers: " + username + ".", ex);
		}
		return followingList;
		}
	}