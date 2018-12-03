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


    @Autowired
    private TwitterStream twitterStream;

    @PostMapping(path = "/find")
    public List<Status> findTweets(@RequestBody  TweetRequest tweetRequest) {

        Query query = new Query();
        query.setCount(tweetRequest.getCount());
        query.setQuery(tweetRequest.getQuery());
        if (tweetRequest.getLocation() != null) {
            query.setGeoCode(tweetRequest.getLocation(), 30, Query.Unit.km);
        }
        query.resultType(Query.ResultType.recent);

        try {
            QueryResult queryResult = twitterFactory.getInstance().search().search(query);
//            twitterStream.cleanUp();
//            twitterStream.clearListeners();
//            twitterStream.shutdown();
//            String[] keywordsArray = { "amman" ,"jordan"};
//            double [][] locations = new double[][]{
//                    new double[]{31.9603117,35.7776314},
//                    new double[]{31.9809288,35.9955509},
//                    new double[]{31.6823217,35.8943307} ,
//                    new double[]{31.7192866,36.0342225}  };
//            FilterQuery filterQuery = new FilterQuery();
////            filterQuery.track(keywordsArray);
//            filterQuery.locations(locations);
//            filterQuery.filterLevel("low");
//
//            twitterStream.addListener(listener);
//            twitterStream.filter(filterQuery);


            return queryResult.getTweets();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    StatusListener listener = new StatusListener(){
        public void onStatus(Status status) {
            System.out.println(status.getId()+"  "+status.getRetweetCount()+"  "+status.getText());
        }
        public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {}
        public void onTrackLimitationNotice(int numberOfLimitedStatuses) {}

        @Override
        public void onScrubGeo(long l, long l1) {
            System.out.println("111");

        }

        @Override
        public void onStallWarning(StallWarning stallWarning) {
            System.out.println("222");
        }

        public void onException(Exception ex) {
            ex.printStackTrace();
        }
    };
}
