package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.j;

/* renamed from: androidx.activity.a  reason: case insensitive filesystem */
public final class C0266a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0266a f4612a = new Object();

    public final BackEvent a(float f6, float f7, float f8, int i2) {
        return new BackEvent(f6, f7, f8, i2);
    }

    public final float b(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
