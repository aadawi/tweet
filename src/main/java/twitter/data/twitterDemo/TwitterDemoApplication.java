package twitter.data.twitterDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TwitterDemoApplication {

//	@Bean
//	public TwitterFactory twitterFactory(){
//
//		ConfigurationBuilder cb = new ConfigurationBuilder();
//		cb.setDebugEnabled(true)
//				.setOAuthConsumerKey("5p2c79lE8s1bO9eYOxRpYZZrc")
//				.setOAuthConsumerSecret("SMIqg08NZx29qbRiYMADEWUq1Xly1XCIYbzQrNCabxgSPtyjAt")
//				.setOAuthAccessToken("1020737729150308352-18PfIOaJ8Lvz4PmggEOllSEAQEc2dv")
//				.setOAuthAccessTokenSecret("Aml0VcpfBBMq8D5StNeuulTJnIRNelBQQP9RyHFuR3GuQ");
//		TwitterFactory tf = new TwitterFactory(cb.build());
//		return tf;
//	}

	public static void main(String[] args) {
		SpringApplication.run(TwitterDemoApplication.class, args);
	}
//
//	@PostConstruct
//	public void testTwitter (){
//		System.out.println("Start Validate");
//		try {
//			Query query = new Query();
//			query.setCount(1);
//			query.setQuery("Amman");
//
//
//			QueryResult queryResult = twitterFactory.search().search(query);
//			queryResult.getTweets().forEach(tweet  ->{
//				System.out.println(tweet.getText());
//			});
//
////			twitter.getHomeTimeline().forEach(obj ->{
////				System.out.println(obj.getText());
////				System.out.println("id:"+obj.getId());
////				System.out.println("is retweeted:"+obj.isRetweeted());
////				System.out.println("user:"+obj.getUser().getName());
////			});
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//		System.out.println("End Validate");
//	}


}
