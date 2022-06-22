package com.pattern.adapter.infaceImpl;

import com.pattern.adapter.inface.AdvancedMediaPlayer;

public class Mp4PlayerImpl implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("正常播放器-播放mp4格式"+fileName);
    }
}
