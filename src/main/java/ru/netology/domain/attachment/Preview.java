package ru.netology.domain.attachment;

public class Preview {
    private DocPhoto photo;
    private DocGraffiti graffiti;
    private DocAudio_message audio_message;

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

    public DocAudio_message getAudio_message() {
        return audio_message;
    }

    public void setAudio_message(DocAudio_message audio_message) {
        this.audio_message = audio_message;
    }
}
