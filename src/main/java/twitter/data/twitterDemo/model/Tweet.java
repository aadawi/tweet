package twitter.data.twitterDemo.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Tweet {
    private String created_at;
    private float id;
    private String id_str;
    private String text;
    private boolean truncated;
    Entities EntitiesObject;
    private String source;
    private String in_reply_to_status_id = null;
    private String in_reply_to_status_id_str = null;
    private String in_reply_to_user_id = null;
    private String in_reply_to_user_id_str = null;
    private String in_reply_to_screen_name = null;
    User UserObject;
    private String geo = null;
    private String coordinates = null;
    private String place = null;
    private String contributors = null;
    private boolean is_quote_status;
    private float retweet_count;
    private float favorite_count;
    private boolean favorited;
    private boolean retweeted;
    private String lang;


}
