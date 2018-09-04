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

    @Bean
    public TwitterFactory twitterFactory() {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("5p2c79lE8s1bO9eYOxRpYZZrc")
                .setOAuthConsumerSecret("SMIqg08NZx29qbRiYMADEWUq1Xly1XCIYbzQrNCabxgSPtyjAt")
                .setOAuthAccessToken("1020737729150308352-18PfIOaJ8Lvz4PmggEOllSEAQEc2dv")
                .setOAuthAccessTokenSecret("Aml0VcpfBBMq8D5StNeuulTJnIRNelBQQP9RyHFuR3GuQ");
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf;
    }

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
