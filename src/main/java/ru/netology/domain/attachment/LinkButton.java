package ru.netology.domain.attachment;

public class LinkButton {
    private String title;
    private ButtonAction action;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ButtonAction getAction() {
        return action;
    }

    public void setAction(ButtonAction action) {
        this.action = action;
    }
}
