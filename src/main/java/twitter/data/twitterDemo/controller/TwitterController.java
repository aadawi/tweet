package twitter.data.twitterDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import twitter.data.twitterDemo.model.TweetRequest;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

@RestController
public class TwitterController {


    @Autowired
    private TwitterFactory twitterFactory;

    @PostMapping(path = "/find")
    public List<Status> findTweets(@RequestBody  TweetRequest tweetRequest) {

        Query query = new Query();
        query.setCount(tweetRequest.getCount());
        query.setQuery(tweetRequest.getQuery());
        query.resultType(Query.ResultType.recent);

        try {
            QueryResult queryResult = twitterFactory.getInstance().search().search(query);
            return queryResult.getTweets();
        } catch (TwitterException e) {
            e.printStackTrace();
            return null;
        }
    }
}
