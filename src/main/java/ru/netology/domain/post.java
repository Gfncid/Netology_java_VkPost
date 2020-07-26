package ru.netology.domain;

public class post {
    private int id;
    private int owner_id;
    private int from_id;
    private int created_by;
    private int date;
    private String text;
    private int reply_owner_id;
    private int reply_post_id;
    private int friends_only;
    private String copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private CommentsInfo commentsInfo;
    private String post_type;
    private Post_source post_source;
    private Geo geo;
    private int signer_id;
    private boolean can_pin;
    private boolean can_delete;
    private boolean can_edit;
    private boolean is_pinned;
    private boolean marked_as_ads;
    private boolean is_favorite;
    private int postponed_id;

}
