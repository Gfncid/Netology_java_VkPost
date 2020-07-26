package ru.netology.domain;

public class Post {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public int getFriends_only() {
        return friends_only;
    }

    public void setFriends_only(int friends_only) {
        this.friends_only = friends_only;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public Post_source getPost_source() {
        return post_source;
    }

    public void setPost_source(Post_source post_source) {
        this.post_source = post_source;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSigner_id() {
        return signer_id;
    }

    public void setSigner_id(int signer_id) {
        this.signer_id = signer_id;
    }

    public boolean isCan_pin() {
        return can_pin;
    }

    public void setCan_pin(boolean can_pin) {
        this.can_pin = can_pin;
    }

    public boolean isCan_delete() {
        return can_delete;
    }

    public void setCan_delete(boolean can_delete) {
        this.can_delete = can_delete;
    }

    public boolean isCan_edit() {
        return can_edit;
    }

    public void setCan_edit(boolean can_edit) {
        this.can_edit = can_edit;
    }

    public boolean isIs_pinned() {
        return is_pinned;
    }

    public void setIs_pinned(boolean is_pinned) {
        this.is_pinned = is_pinned;
    }

    public boolean isMarked_as_ads() {
        return marked_as_ads;
    }

    public void setMarked_as_ads(boolean marked_as_ads) {
        this.marked_as_ads = marked_as_ads;
    }

    public boolean isIs_favorite() {
        return is_favorite;
    }

    public void setIs_favorite(boolean is_favorite) {
        this.is_favorite = is_favorite;
    }

    public int getPostponed_id() {
        return postponed_id;
    }

    public void setPostponed_id(int postponed_id) {
        this.postponed_id = postponed_id;
    }
}
