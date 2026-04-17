package com.google.android.material.timepicker;

import K.C0062b;
import L.e;
import L.i;
import L.j;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.mtma.criminal.city.R;

public final class c extends C0062b {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1369a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f1702a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.d.f6587G.get(intValue - 1));
        }
        jVar.i(i.a(0, 1, intValue, view.isSelected(), 1));
        accessibilityNodeInfo.setClickable(true);
        jVar.b(e.f1691e);
    }

    public final boolean g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.g(view, i2, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.d;
        view.getHitRect(clockFaceView.f6585D);
        float centerX = (float) clockFaceView.f6585D.centerX();
        float centerY = (float) clockFaceView.f6585D.centerY();
        clockFaceView.f6584C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f6584C.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
