package com.pattern.adapter.infaceImpl;

import com.pattern.adapter.MediaAdapter;
import com.pattern.adapter.inface.MediaPlayer;

public class AudioPlayerImpl implements MediaPlayer {
    //原系统引入适配器
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // System.out.println("正常播放器-播放mp3格式");

        if (audioType.equals("mp3")) {
            System.out.println("正常播放器-播放mp3格式" + fileName);
        } else if (audioType.equals("mp4") || audioType.equals("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("不能支持格式播放" + fileName);
        }

    }
}
