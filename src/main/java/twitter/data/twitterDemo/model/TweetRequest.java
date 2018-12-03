package twitter.data.twitterDemo.model;

import lombok.Data;
import twitter4j.GeoLocation;

@Data
public class TweetRequest {
    private String query;
    private int count;
    private GeoLocation location;
}
