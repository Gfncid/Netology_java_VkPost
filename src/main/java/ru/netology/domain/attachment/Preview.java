package ru.netology.domain.attachment;

public class Preview {
    private DocPhoto photo;
    private DocGraffiti graffiti;
    private DocAudioMessage audioMessage;

    public DocPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(DocPhoto photo) {
        this.photo = photo;
    }

    public DocGraffiti getGraffiti() {
        return graffiti;
    }

    public void setGraffiti(DocGraffiti graffiti) {
        this.graffiti = graffiti;
    }

    public DocAudioMessage getAudioMessage() {
        return audioMessage;
    }

    public void setAudio_message(DocAudioMessage audioMessage) {
        this.audioMessage = audioMessage;
    }
}
