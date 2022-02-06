package WWSIS.Microblog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int postId;
    @Column(name="creator_name", nullable = false)
    private String creatorName;
    @Column(name="creator_lastname", nullable = false)
    private String creatorlastname;
    @Column(name="creator_email", nullable = false)
    private String creatorEmail;
    @Column(name="time_of_creation", nullable = false)
    private Timestamp timeOfCreation;
    @Column(name="post_content", nullable = false)
    private String postContent;

    public Post(int postId, String creatorName, String creatorlastname, String creatorEmail,Timestamp timeOfCreation ,String postContent) {
        this.postId = postId;
        this.creatorName = creatorName;
        this.creatorlastname = creatorlastname;
        this.creatorEmail = creatorEmail;
        this.timeOfCreation = timeOfCreation;
        this.postContent = postContent;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreatorlastname() {
        return creatorlastname;
    }

    public void setCreatorlastname(String creatorlastname) {
        this.creatorlastname = creatorlastname;
    }

    public String getCreatorEmail() {
        return creatorEmail;
    }

    public void setCreatorEmail(String creatorEmail) {
        this.creatorEmail = creatorEmail;
    }

    public Timestamp getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(Timestamp timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}