package a1;

import U3.c;
import android.content.Context;
import android.net.ConnectivityManager;
import b1.C0312a;
import b1.C0313b;
import b1.C0314c;
import b1.C0315d;
import b1.e;
import b1.f;
import b1.h;
import b1.i;
import b1.j;
import b1.k;
import b1.l;
import b1.n;
import b1.o;
import b1.q;
import b1.r;
import b1.s;
import b1.v;
import d1.g;
import java.net.MalformedURLException;
import java.net.URL;
import l1.C0780a;

public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public final c f4552a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f4553b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4554c;
    public final URL d = b(C0256a.f4541c);

    /* renamed from: e  reason: collision with root package name */
    public final C0780a f4555e;

    /* renamed from: f  reason: collision with root package name */
    public final C0780a f4556f;
    public final int g;

    public d(Context context, C0780a aVar, C0780a aVar2) {
        C3.d dVar = new C3.d();
        C0314c cVar = C0314c.f5460a;
        dVar.a(o.class, cVar);
        dVar.a(i.class, cVar);
        f fVar = f.f5470a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        C0315d dVar2 = C0315d.f5462a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        C0313b bVar = C0313b.f5450a;
        dVar.a(C0312a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f5465a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        b1.g gVar = b1.g.f5475a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.d = true;
        this.f4552a = new c((Object) dVar, 6);
        this.f4554c = context;
        this.f4553b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4555e = aVar2;
        this.f4556f = aVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException(o3.d.i("Invalid url: ", str), e6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        if (((b1.t) b1.t.f5504a.get(r0)) != null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c1.h a(c1.h r7) {
        /*
            r6 = this;
            android.net.ConnectivityManager r0 = r6.f4553b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            J2.o r7 = r7.c()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r2 = r7.f1320e
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r3 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L_0x011c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "sdk-version"
            r2.put(r4, r1)
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL
            r7.i(r1, r2)
            java.lang.String r1 = "hardware"
            java.lang.String r2 = android.os.Build.HARDWARE
            r7.i(r1, r2)
            java.lang.String r1 = "device"
            java.lang.String r2 = android.os.Build.DEVICE
            r7.i(r1, r2)
            java.lang.String r1 = "product"
            java.lang.String r2 = android.os.Build.PRODUCT
            r7.i(r1, r2)
            java.lang.String r1 = "os-uild"
            java.lang.String r2 = android.os.Build.ID
            r7.i(r1, r2)
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r7.i(r1, r2)
            java.lang.String r1 = "fingerprint"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r7.i(r1, r2)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r4 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r4)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.lang.Object r4 = r7.f1320e
            java.util.HashMap r4 = (java.util.HashMap) r4
            if (r4 == 0) goto L_0x0116
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r4.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x007a
            android.util.SparseArray r2 = b1.u.f5506a
            r2 = r1
            goto L_0x007e
        L_0x007a:
            int r2 = r0.getType()
        L_0x007e:
            java.lang.Object r4 = r7.f1320e
            java.util.HashMap r4 = (java.util.HashMap) r4
            if (r4 == 0) goto L_0x0110
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "net-type"
            r4.put(r5, r2)
            r2 = 0
            if (r0 != 0) goto L_0x0094
            android.util.SparseArray r0 = b1.t.f5504a
        L_0x0092:
            r0 = r2
            goto L_0x00a9
        L_0x0094:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x009f
            android.util.SparseArray r0 = b1.t.f5504a
            r0 = 100
            goto L_0x00a9
        L_0x009f:
            android.util.SparseArray r4 = b1.t.f5504a
            java.lang.Object r4 = r4.get(r0)
            b1.t r4 = (b1.t) r4
            if (r4 == 0) goto L_0x0092
        L_0x00a9:
            java.lang.Object r4 = r7.f1320e
            java.util.HashMap r4 = (java.util.HashMap) r4
            if (r4 == 0) goto L_0x010a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r4.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r7.i(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r7.i(r3, r0)
            android.content.Context r0 = r6.f4554c
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = r3.getSimOperator()
            java.lang.String r4 = "mcc_mnc"
            r7.i(r4, r3)
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00f4 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00f4 }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00f4 }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00f4 }
            goto L_0x00fc
        L_0x00f4:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            android.support.v4.media.session.a.q(r0, r2, r3)
        L_0x00fc:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "application_build"
            r7.i(r1, r0)
            c1.h r7 = r7.k()
            return r7
        L_0x010a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0110:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0116:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x011c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.d.a(c1.h):c1.h");
    }
}
