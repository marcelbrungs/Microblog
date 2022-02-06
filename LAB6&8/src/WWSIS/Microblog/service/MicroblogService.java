package WWSIS.Microblog.service;
import java.util.Date;
import java.util.List;
import WWSIS.Microblog.model.Follower;
import WWSIS.Microblog.model.User;
import WWSIS.Microblog.model.Post;
public interface MicroblogService { 
	boolean userExists(String name);
	String registerUser(String username, String plainTextPassword);
	List<String> searchForName(String username);
	String createPost(String username, Post post);
	public class PostDaoImpl implements PostDao {
    	public String getUserTimeline(int uid) {
        return null;}
    	public String getMainTimeline(int uid) {
        return null;}
    	public String getAllMessages() {
        return null;}
    	public void addMessage(int uid) {}
}
	List<UserPostDto> getFollowersPostsForUser(String username, Date createdAfter);
	Page<Post> getAllPostsForUsers(List<String> usernames, int pageNumber);
	Page<Post> getAllFollowersPostsForUser(String username, int pageNumber);
	String addFollower(String targetUsername, String followerUsername);
	String removeFollower(String targetUsername, String followerUsername);
	List<String> getFollowingList(String username);
}
