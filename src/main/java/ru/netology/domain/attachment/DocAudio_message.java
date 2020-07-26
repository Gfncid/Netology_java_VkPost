package ru.netology.domain.attachment;

public class DocAudio_message {
    private int duration;
    private int waveform[];
    private String link_ogg;
    private String link_mp3;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int[] getWaveform() {
        return waveform;
    }

    public void setWaveform(int[] waveform) {
        this.waveform = waveform;
    }

    public String getLink_ogg() {
        return link_ogg;
    }

    public void setLink_ogg(String link_ogg) {
        this.link_ogg = link_ogg;
    }

    public String getLink_mp3() {
        return link_mp3;
    }

    public void setLink_mp3(String link_mp3) {
        this.link_mp3 = link_mp3;
    }
}
