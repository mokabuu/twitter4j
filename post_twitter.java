import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

public class post_twitter {
	public static void main(String[] arg) throws TwitterException {
		Twitter twitter = new TwitterFactory().getInstance();
		User user = twitter.verifyCredentials();
		
        System.out.println("Name          ：" + user.getName());
        System.out.println("ScreenName：" + user.getScreenName());
        System.err.println("Follow　       ：" + user.getFriendsCount());
        System.out.println("Follower      ：" + user.getFollowersCount());
		
		Status status = twitter.updateStatus("JAVAから投稿");
	}
}
