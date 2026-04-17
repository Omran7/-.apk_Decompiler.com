package i3;

import R2.i;
import S3.r;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import n3.C0864e;
import n3.C0866g;
import n3.m;
import n3.n;
import n3.o;
import q3.g;
import q3.l;

/* renamed from: i3.h  reason: case insensitive filesystem */
public final class C0592h {

    /* renamed from: a  reason: collision with root package name */
    public final n f8283a;

    /* renamed from: b  reason: collision with root package name */
    public final C0864e f8284b;

    /* renamed from: c  reason: collision with root package name */
    public m f8285c;

    public C0592h(C0864e eVar, n nVar) {
        this.f8283a = nVar;
        this.f8284b = eVar;
    }

    public static C0592h b() {
        i e6 = i.e();
        e6.b();
        R2.m mVar = e6.f2492c;
        String str = mVar.f2502c;
        if (str == null) {
            e6.b();
            String str2 = mVar.g;
            if (str2 != null) {
                StringBuilder sb = new StringBuilder("https://");
                e6.b();
                sb.append(str2);
                sb.append("-default-rtdb.firebaseio.com");
                str = sb.toString();
            } else {
                throw new RuntimeException("Failed to get FirebaseDatabase instance: Can't determine Firebase Database URL. Be sure to include a Project ID in your configuration.");
            }
        }
        return c(e6, str);
    }

    public static synchronized C0592h c(i iVar, String str) {
        C0592h a6;
        synchronized (C0592h.class) {
            if (!TextUtils.isEmpty(str)) {
                C0593i iVar2 = (C0593i) iVar.c(C0593i.class);
                I.h(iVar2, "Firebase Database component is not present.");
                g d = l.d(str);
                if (d.f11093b.isEmpty()) {
                    a6 = iVar2.a(d.f11092a);
                } else {
                    throw new RuntimeException("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + d.f11093b.toString());
                }
            } else {
                throw new RuntimeException("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
        }
        return a6;
    }

    public static C0592h d() {
        return c(i.e(), "https://criminal-city-second.firebaseio.com");
    }

    public final synchronized void a() {
        if (this.f8285c == null) {
            this.f8283a.getClass();
            this.f8285c = o.a(this.f8284b, this.f8283a);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [S3.r, i3.f] */
    public final C0590f e() {
        a();
        return new r(this.f8285c, C0866g.d);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [S3.r, i3.f] */
    public final C0590f f(String str) {
        a();
        q3.m.c(str);
        return new r(this.f8285c, new C0866g(str));
    }
}
