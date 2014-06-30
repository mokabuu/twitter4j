import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import java.util.List;

public class timeline_twitter {
	public static void main(String[] arg) throws TwitterException {
		Twitter twitter = new TwitterFactory().getInstance();
		User user = twitter.verifyCredentials();
		
	    List<Status> statuses = twitter.getHomeTimeline();
	    System.out.println("@" + user.getScreenName() + "のタイムライン");
	    for (Status status : statuses) {
	        System.out.println(status.getUser().getName() + ":" +
	                           status.getText());
	  }
	}
}
