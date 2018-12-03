package twitter.data.twitterDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

@SpringBootApplication
public class TwitterDemoApplication {

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

	@Bean
	public TwitterStream twitterStream() {

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
				.setOAuthConsumerKey("5p2c79lE8s1bO9eYOxRpYZZrc")
				.setOAuthConsumerSecret("SMIqg08NZx29qbRiYMADEWUq1Xly1XCIYbzQrNCabxgSPtyjAt")
				.setOAuthAccessToken("1020737729150308352-18PfIOaJ8Lvz4PmggEOllSEAQEc2dv")
				.setOAuthAccessTokenSecret("Aml0VcpfBBMq8D5StNeuulTJnIRNelBQQP9RyHFuR3GuQ");

		TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
		return twitterStream;
	}

	public static void main(String[] args) {
		SpringApplication.run(TwitterDemoApplication.class, args);
	}

}
