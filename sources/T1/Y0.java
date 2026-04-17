package T1;

import android.os.Bundle;

public final class Y0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f3156a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3157b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f3158c;
    public final /* synthetic */ Bundle d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3159e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f3160f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ boolean f3161p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3162q;

    public Y0(C0157b1 b1Var, String str, String str2, long j6, Bundle bundle, boolean z3, boolean z4, boolean z5) {
        this.f3156a = str;
        this.f3157b = str2;
        this.f3158c = j6;
        this.d = bundle;
        this.f3159e = z3;
        this.f3160f = z4;
        this.f3161p = z5;
        this.f3162q = b1Var;
    }

    public final void run() {
        this.f3162q.B(this.f3156a, this.f3157b, this.f3158c, this.d, this.f3159e, this.f3160f, this.f3161p);
    }
}
