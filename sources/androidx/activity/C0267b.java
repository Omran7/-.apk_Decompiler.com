package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.j;

/* renamed from: androidx.activity.b  reason: case insensitive filesystem */
public final class C0267b {

    /* renamed from: a  reason: collision with root package name */
    public final float f4613a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4614b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4615c;
    public final int d;

    public C0267b(BackEvent backEvent) {
        j.e(backEvent, "backEvent");
        C0266a aVar = C0266a.f4612a;
        float d6 = aVar.d(backEvent);
        float e6 = aVar.e(backEvent);
        float b6 = aVar.b(backEvent);
        int c3 = aVar.c(backEvent);
        this.f4613a = d6;
        this.f4614b = e6;
        this.f4615c = b6;
        this.d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f4613a + ", touchY=" + this.f4614b + ", progress=" + this.f4615c + ", swipeEdge=" + this.d + '}';
    }
}
