package f3;

import C1.a;
import com.google.android.gms.internal.p002firebaseauthapi.zze;
import h0.C0552a;

/* renamed from: f3.h  reason: case insensitive filesystem */
public final class C0531h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f7938f = new a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    public volatile long f7939a;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f7940b;

    /* renamed from: c  reason: collision with root package name */
    public long f7941c;
    public zze d;

    /* renamed from: e  reason: collision with root package name */
    public B2.a f7942e;

    public final void a() {
        f7938f.e(C0552a.m("Scheduling refresh for ", this.f7939a - this.f7941c), new Object[0]);
        this.d.removeCallbacks(this.f7942e);
        this.f7940b = Math.max((this.f7939a - System.currentTimeMillis()) - this.f7941c, 0) / 1000;
        this.d.postDelayed(this.f7942e, this.f7940b * 1000);
    }
}
