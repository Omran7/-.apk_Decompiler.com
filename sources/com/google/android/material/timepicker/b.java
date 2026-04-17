package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6613a;

    public b(ClockFaceView clockFaceView) {
        this.f6613a = clockFaceView;
    }

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f6613a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f6584C.d) - clockFaceView.f6591K;
        if (height != clockFaceView.f6614A) {
            clockFaceView.f6614A = height;
            clockFaceView.l();
            int i2 = clockFaceView.f6614A;
            ClockHandView clockHandView = clockFaceView.f6584C;
            clockHandView.f6608u = i2;
            clockHandView.invalidate();
        }
        return true;
    }
}
