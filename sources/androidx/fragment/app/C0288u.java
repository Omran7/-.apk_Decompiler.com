package androidx.fragment.app;

import I1.b;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import k.C0738t;
import n0.C0853c;

/* renamed from: androidx.fragment.app.u  reason: case insensitive filesystem */
public final class C0288u extends b implements U, C0307s, C0853c, L {

    /* renamed from: p  reason: collision with root package name */
    public final C0289v f5192p;

    /* renamed from: q  reason: collision with root package name */
    public final C0289v f5193q;

    /* renamed from: r  reason: collision with root package name */
    public final Handler f5194r;

    /* renamed from: s  reason: collision with root package name */
    public final I f5195s = new I();

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0289v f5196t;

    public C0288u(C0289v vVar) {
        this.f5196t = vVar;
        Handler handler = new Handler();
        this.f5192p = vVar;
        this.f5193q = vVar;
        this.f5194r = handler;
    }

    public final C0738t a() {
        return (C0738t) this.f5196t.d.d;
    }

    public final T e() {
        return this.f5196t.e();
    }

    public final C0309u h() {
        return this.f5196t.f5198D;
    }

    public final View v0(int i2) {
        return this.f5196t.findViewById(i2);
    }

    public final boolean y0() {
        Window window = this.f5196t.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }

    public final void b() {
    }
}
