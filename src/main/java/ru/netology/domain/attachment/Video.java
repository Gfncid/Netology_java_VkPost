package ru.netology.domain.attachment;

public class Video {
    private int id;
    private int owner_id;
    private String title;
    private String description;
    private int duration;
    private String photo_130;
    private String photo_320;
    private String photo_640;
    private String photo_800;
    private String photo_1280;
    private String first_frame_130;
    private String first_frame_320;
    private String first_frame_640;
    private String first_frame_800;
    private String first_frame_1280;
    private int date;
    private int adding_date;
    private int viewsInfo;
    private int commentsInfo;
    private String player;
    private String platform;
    private boolean can_edit;
    private boolean can_add;
    private boolean is_private;
    private String access_key;
    private boolean processing;
    private boolean live;
    private boolean upcoming;
    private boolean is_favorite;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPhoto_130() {
        return photo_130;
    }

    public void setPhoto_130(String photo_130) {
        this.photo_130 = photo_130;
    }

    public String getPhoto_320() {
        return photo_320;
    }

    public void setPhoto_320(String photo_320) {
        this.photo_320 = photo_320;
    }

    public String getPhoto_640() {
        return photo_640;
    }

    public void setPhoto_640(String photo_640) {
        this.photo_640 = photo_640;
    }

    public String getPhoto_800() {
        return photo_800;
    }

    public void setPhoto_800(String photo_800) {
        this.photo_800 = photo_800;
    }

    public String getPhoto_1280() {
        return photo_1280;
    }

    public void setPhoto_1280(String photo_1280) {
        this.photo_1280 = photo_1280;
    }

    public String getFirst_frame_130() {
        return first_frame_130;
    }

    public void setFirst_frame_130(String first_frame_130) {
        this.first_frame_130 = first_frame_130;
    }

    public String getFirst_frame_320() {
        return first_frame_320;
    }

    public void setFirst_frame_320(String first_frame_320) {
        this.first_frame_320 = first_frame_320;
    }

    public String getFirst_frame_640() {
        return first_frame_640;
    }

    public void setFirst_frame_640(String first_frame_640) {
        this.first_frame_640 = first_frame_640;
    }

    public String getFirst_frame_800() {
        return first_frame_800;
    }

    public void setFirst_frame_800(String first_frame_800) {
        this.first_frame_800 = first_frame_800;
    }

    public String getFirst_frame_1280() {
        return first_frame_1280;
    }

    public void setFirst_frame_1280(String first_frame_1280) {
        this.first_frame_1280 = first_frame_1280;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAdding_date() {
        return adding_date;
    }

    public void setAdding_date(int adding_date) {
        this.adding_date = adding_date;
    }

    public int getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(int viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isCan_edit() {
        return can_edit;
    }

    public void setCan_edit(boolean can_edit) {
        this.can_edit = can_edit;
    }

    public boolean isCan_add() {
        return can_add;
    }

    public void setCan_add(boolean can_add) {
        this.can_add = can_add;
    }

    public boolean isIs_private() {
        return is_private;
    }

    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    public String getAccess_key() {
        return access_key;
    }

    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }

    public boolean isProcessing() {
        return processing;
    }

    public void setProcessing(boolean processing) {
        this.processing = processing;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public boolean isIs_favorite() {
        return is_favorite;
    }

    public void setIs_favorite(boolean is_favorite) {
        this.is_favorite = is_favorite;
    }
}
