package WWSIS.Microblog.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="Follow")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int follower_id;
    private String follower_name;
    private String followerSurname;
    @Column(name="follower_name", nullable = true)
    private String followerName;
    @Column(name="follower_lastname", nullable = true)
    private String following;
    @Column(name="follower_email", nullable = true)
    private String followerEmail;
    @Column(name="start_following", nullable = true)
    private Timestamp startFollowing;


    public Follower(int follower_id, String follower_name, String followerlastname,String followerEmail, Timestamp startFollowing ) {
        this.follower_id = follower_id;
        this.follower_name = follower_name;
        this.followerlastname = followerlastname;
        this.followerEmail = followerEmail;
        this.startFollowing = startFollowing;
    }

    public int getFollower_id() {
        return follower_id;
    }

    public void setFollower_id(int follower_id) {
        this.follower_id = follower_id;
    }

    public String getFollower_name() {
        return follower_name;
    }

    public void setFollower_name(String follower_name) {
        this.follower_name = follower_name;
    }

    public String getFollowerlastname() {
        return followerlastname;
    }

    public void setFollowerlastname(String followerlastname) {
        this.followerlastname = followerlastname;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getFollowerEmail() {
        return followerEmail;
    }

    public void setFollowerEmail(String followerEmail) {
        this.followerEmail = followerEmail;
    }

    public Timestamp getStartFollowing() {
        return startFollowing;
    }

    public void setStartFollowing(Timestamp startFollowing) {
        this.startFollowing = startFollowing;
    }
}