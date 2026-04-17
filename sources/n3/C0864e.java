package n3;

import X4.d;
import android.os.Build;
import c1.i;
import com.mtma.criminal.city.fragments.gangBase.I;
import j3.e;
import q3.b;
import u3.C1031a;

/* renamed from: n3.e  reason: case insensitive filesystem */
public final class C0864e {

    /* renamed from: a  reason: collision with root package name */
    public C1031a f10265a;

    /* renamed from: b  reason: collision with root package name */
    public I f10266b;

    /* renamed from: c  reason: collision with root package name */
    public e f10267c;
    public e d;

    /* renamed from: e  reason: collision with root package name */
    public i f10268e;

    /* renamed from: f  reason: collision with root package name */
    public String f10269f;
    public String g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public R2.i f10270i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10271j;

    /* renamed from: k  reason: collision with root package name */
    public d f10272k;

    public final b a() {
        i iVar = this.f10268e;
        if (iVar != null) {
            return (b) iVar.f5605b;
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public final i b(String str) {
        return new i(18, (Object) this.f10265a, str, (String) null);
    }

    public final d c() {
        if (this.f10272k == null) {
            synchronized (this) {
                this.f10272k = new d(this.f10270i);
            }
        }
        return this.f10272k;
    }

    public final void d() {
        if (this.f10265a == null) {
            c().getClass();
            this.f10265a = new C1031a(this.h);
        }
        c();
        if (this.g == null) {
            c().getClass();
            this.g = o3.d.i("Firebase/5/21.0.0/", Build.VERSION.SDK_INT + "/Android");
        }
        if (this.f10266b == null) {
            c().getClass();
            this.f10266b = new I(26);
        }
        if (this.f10268e == null) {
            d dVar = this.f10272k;
            dVar.getClass();
            this.f10268e = new i(dVar, b("RunLoop"));
        }
        if (this.f10269f == null) {
            this.f10269f = "default";
        }
        com.google.android.gms.common.internal.I.h(this.f10267c, "You must register an authTokenProvider before initializing Context.");
        com.google.android.gms.common.internal.I.h(this.d, "You must register an appCheckTokenProvider before initializing Context.");
    }
}
