package ru.netology.domain.attachment;

public class Link {
    private String url;
    private String title;
    private String caption;
    private Photo photo;
    private String preview_page;
    private String preview_url;
    private LinkProduct product;
    private LinkButton button;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public String getPreview_page() {
        return preview_page;
    }

    public void setPreview_page(String preview_page) {
        this.preview_page = preview_page;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public void setPreview_url(String preview_url) {
        this.preview_url = preview_url;
    }

    public LinkProduct getProduct() {
        return product;
    }

    public void setProduct(LinkProduct product) {
        this.product = product;
    }

    public LinkButton getButton() {
        return button;
    }

    public void setButton(LinkButton button) {
        this.button = button;
    }
}
