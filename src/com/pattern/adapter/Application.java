package com.pattern.adapter;

import com.pattern.adapter.inface.MediaPlayer;
import com.pattern.adapter.infaceImpl.AudioPlayerImpl;

/**
 * 主方法
 */
public class Application {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayerImpl();
        mediaPlayer.play("mp3","mp3111");
        mediaPlayer.play("mp4","mp4222");
        mediaPlayer.play("vlc","vlc333");
        mediaPlayer.play("jpg","jpg4444");
    }
}
