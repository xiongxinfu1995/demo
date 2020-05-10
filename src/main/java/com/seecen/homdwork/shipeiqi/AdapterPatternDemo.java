package com.seecen.homdwork.shipeiqi;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "龙卷风.mp3");
        audioPlayer.play("mp4", "大鱼.mp4");
        audioPlayer.play("vlc", "永远永远.vlc");
        audioPlayer.play("avi", "借.avi");

    }
}
