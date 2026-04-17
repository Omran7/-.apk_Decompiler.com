package e1;

import M0.g;
import android.os.Handler;
import android.os.Looper;

/* renamed from: e1.c  reason: case insensitive filesystem */
public final class C0484c implements C0483b {

    /* renamed from: b  reason: collision with root package name */
    public static C0484c f7572b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f7573a;

    public C0484c() {
        this.f7573a = new Object();
        new Handler(Looper.getMainLooper(), new g(this, 1));
    }

    public Object get() {
        return this.f7573a;
    }

    public C0484c(Object obj) {
        this.f7573a = obj;
    }
}
