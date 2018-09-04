package twitter.data.twitterDemo.model;

import lombok.Data;

@Data
public class TweetRequest {
    private String query;
    private int count;
}
