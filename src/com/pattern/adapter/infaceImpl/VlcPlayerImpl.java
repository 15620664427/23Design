package com.pattern.adapter.infaceImpl;

import com.pattern.adapter.inface.AdvancedMediaPlayer;

public class VlcPlayerImpl implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("正常播放器-播放vic格式"+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
