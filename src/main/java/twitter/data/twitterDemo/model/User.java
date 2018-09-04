package twitter.data.twitterDemo.model;

import lombok.Data;

@Data
public class User {
    private float id;
    private String id_str;
    private String name;
    private String screen_name;
    private String location;
    private String description;
    private String url = null;
    Entities EntitiesObject;
    private float followers_count;
    private float friends_count;
    private float listed_count;
    private String created_at;
    private float favourites_count;
    private String utc_offset = null;
    private String time_zone = null;
    private boolean geo_enabled;
    private boolean verified;
    private float statuses_count;
    private String lang;
    private boolean contributors_enabled;
    private boolean is_translator;
    private boolean is_translation_enabled;
    private String profile_background_color;
    private String profile_background_image_url = null;
    private String profile_background_image_url_https = null;
    private boolean profile_background_tile;
    private String profile_image_url;
    private String profile_image_url_https;
    private String profile_link_color;
    private String profile_sidebar_border_color;
    private String profile_sidebar_fill_color;
    private String profile_text_color;
    private boolean profile_use_background_image;
    private boolean has_extended_profile;
    private boolean default_profile;
    private boolean default_profile_image;
    private boolean following;
    private boolean follow_request_sent;
    private boolean notifications;
    private String translator_type;


}