package com.mtma.criminal.city.utils;

import android.media.MediaPlayer;

public final class V implements MediaPlayer.OnCompletionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7379a;

    public /* synthetic */ V(int i2) {
        this.f7379a = i2;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        switch (this.f7379a) {
            case 0:
                mediaPlayer.reset();
                mediaPlayer.release();
                return;
            case 1:
                mediaPlayer.reset();
                mediaPlayer.release();
                return;
            case 2:
                mediaPlayer.reset();
                mediaPlayer.release();
                return;
            default:
                mediaPlayer.reset();
                mediaPlayer.release();
                return;
        }
    }
}
