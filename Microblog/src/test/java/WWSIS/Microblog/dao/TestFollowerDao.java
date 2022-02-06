package WWSIS.Microblog.dao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import WWSIS.Microblog.model.Follower;
import WWSIS.Microblog.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-test.xml"})
@Transactional
@Rollback(true)

public class TestFollowerDao {
@Autowired
FollowerDao followerDAO;
@Autowired
UserDao userDAO;
//followee
User newFollowee;
//follower
User newFollower;
@Before public void setUp(setUp followerDAO) {
	this.followerDAO = userDAO
}
@Test public void testAddFollower(testAddFollower testAddFollower) {
	this.testAddFollower = newFollower;
	}
}