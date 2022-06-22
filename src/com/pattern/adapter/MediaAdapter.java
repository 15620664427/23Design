package com.pattern.adapter;

import com.pattern.adapter.inface.AdvancedMediaPlayer;
import com.pattern.adapter.inface.MediaPlayer;
import com.pattern.adapter.infaceImpl.Mp4PlayerImpl;
import com.pattern.adapter.infaceImpl.VlcPlayerImpl;

/**
 * 适配类 实现 原始接口
 * 适配器模式主要就在此类  1、实现源系统
 */
public class MediaAdapter implements MediaPlayer {

    //引入-适配接口
    AdvancedMediaPlayer advancedMediaPlayer;

    //根据文件类型实例化播放器
    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayerImpl();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4PlayerImpl();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if (audioType.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
