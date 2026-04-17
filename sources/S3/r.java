package S3;

import P3.a;
import T1.C0174h0;
import X4.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.I;
import com.google.firebase.messaging.FirebaseMessaging;
import h0.C0552a;
import i3.C0585a;
import i3.q;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import n3.C0859D;
import n3.C0860a;
import n3.C0865f;
import n3.C0866g;
import n3.H;
import n3.m;
import q3.i;
import q3.l;
import s3.C0968f;
import s3.C0969g;
import v3.C1046a;
import v3.C1048c;
import v3.j;
import v3.k;
import v3.n;
import v3.p;
import v3.s;
import v3.t;
import v3.w;
import v3.x;
import x0.b;
import x0.c;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2693a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2694b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2695c;
    public Object d;

    public r(C0174h0 h0Var, String str) {
        this.d = h0Var;
        I.d(str);
        this.f2694b = str;
    }

    public static void A(C0968f fVar) {
        if (fVar.e() && fVar.c() && fVar.d()) {
            if (!fVar.d() || fVar.f11534b == 0) {
                throw new IllegalArgumentException("Can't combine startAt(), startAfter(), endAt(), endBefore(), and limit(). Use limitToFirst() or limitToLast() instead");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
        if (z0.C1129e.d(r5.f11535c) != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void B(s3.C0968f r5) {
        /*
            v3.l r0 = r5.g
            v3.n r1 = v3.n.f12299a
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "Cannot get index end value if start has not been set"
            java.lang.String r2 = "Cannot get index start value if start has not been set"
            if (r0 == 0) goto L_0x0086
            boolean r0 = r5.e()
            java.lang.String r3 = "You must use startAt(String value), startAfter(String value), endAt(String value), endBefore(String value) or equalTo(String value) in combination with orderByKey(). Other type of values or using the version with 2 parameters is not supported"
            if (r0 == 0) goto L_0x004b
            boolean r0 = r5.e()
            if (r0 == 0) goto L_0x0045
            v3.s r0 = r5.f11535c
            boolean r2 = r5.e()
            if (r2 == 0) goto L_0x003d
            v3.c r2 = r5.d
            v3.c r4 = v3.C1048c.f12278b
            if (r2 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = r4
        L_0x002c:
            boolean r2 = com.google.android.gms.common.internal.I.j(r2, r4)
            if (r2 == 0) goto L_0x0037
            boolean r0 = r0 instanceof v3.w
            if (r0 == 0) goto L_0x0037
            goto L_0x004b
        L_0x0037:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r3)
            throw r5
        L_0x003d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot get index start name if start has not been set"
            r5.<init>(r0)
            throw r5
        L_0x0045:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
        L_0x004b:
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x0080
            v3.s r0 = r5.f11536e
            boolean r1 = r5.c()
            if (r1 == 0) goto L_0x0078
            v3.c r5 = r5.f11537f
            v3.c r1 = v3.C1048c.f12279c
            if (r5 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r5 = r1
        L_0x0067:
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0072
            boolean r5 = r0 instanceof v3.w
            if (r5 == 0) goto L_0x0072
            goto L_0x00ce
        L_0x0072:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r3)
            throw r5
        L_0x0078:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot get index end name if start has not been set"
            r5.<init>(r0)
            throw r5
        L_0x0080:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r1)
            throw r5
        L_0x0086:
            v3.l r0 = r5.g
            v3.u r3 = v3.u.f12308a
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r5.e()
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r5.e()
            if (r0 == 0) goto L_0x00a5
            v3.s r0 = r5.f11535c
            boolean r0 = z0.C1129e.d(r0)
            if (r0 == 0) goto L_0x00c0
            goto L_0x00ab
        L_0x00a5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r2)
            throw r5
        L_0x00ab:
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x00c8
            v3.s r5 = r5.f11536e
            boolean r5 = z0.C1129e.d(r5)
            if (r5 == 0) goto L_0x00c0
            goto L_0x00ce
        L_0x00c0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "When using orderByPriority(), values provided to startAt(), startAfter(), endAt(), endBefore(), or equalTo() must be valid priorities."
            r5.<init>(r0)
            throw r5
        L_0x00c8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r1)
            throw r5
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.r.B(s3.f):void");
    }

    public String C() {
        if (!this.f2693a) {
            this.f2693a = true;
            this.f2695c = ((C0174h0) this.d).t().getString((String) this.f2694b, (String) null);
        }
        return (String) this.f2695c;
    }

    public void D(String str) {
        SharedPreferences.Editor edit = ((C0174h0) this.d).t().edit();
        edit.putString((String) this.f2694b, str);
        edit.apply();
        this.f2695c = str;
    }

    public void a() {
        c.c((c) this.d, this, false);
    }

    public void b(C0585a aVar) {
        c(new C0860a((m) this.f2694b, aVar, l()));
    }

    public void c(C0865f fVar) {
        H h = H.f10253b;
        synchronized (h.f10254a) {
            try {
                List list = (List) h.f10254a.get(fVar);
                if (list == null) {
                    list = new ArrayList();
                    h.f10254a.put(fVar, list);
                }
                list.add(fVar);
                if (!fVar.e().b()) {
                    C0865f a6 = fVar.a(C0969g.a(fVar.e().f11538a));
                    List list2 = (List) h.f10254a.get(a6);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        h.f10254a.put(a6, list2);
                    }
                    list2.add(fVar);
                }
                boolean z3 = true;
                fVar.f10275c = true;
                l.c(!fVar.f10273a.get());
                if (fVar.f10274b != null) {
                    z3 = false;
                }
                l.c(z3);
                fVar.f10274b = h;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((m) this.f2694b).o(new i3.m(this, fVar, 1));
    }

    public void d(q qVar) {
        c(new C0859D((m) this.f2694b, new d(this, qVar, 19), l()));
    }

    public r e(String str, double d6) {
        return g(str, new j(Double.valueOf(d6), k.f12295e));
    }

    public r f(String str, String str2) {
        s sVar;
        if (str != null) {
            sVar = new w(str, k.f12295e);
        } else {
            sVar = k.f12295e;
        }
        return g(str2, sVar);
    }

    public r g(String str, s sVar) {
        C1048c cVar;
        boolean z3;
        q3.m.a(str);
        if (sVar.h() || sVar.isEmpty()) {
            if (str != null) {
                cVar = C1048c.e(str);
            } else {
                cVar = null;
            }
            C0968f fVar = (C0968f) this.d;
            if (!fVar.c()) {
                if (sVar.h() || sVar.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                l.c(z3);
                l.c(!(sVar instanceof p));
                C0968f a6 = fVar.a();
                a6.f11536e = sVar;
                a6.f11537f = cVar;
                A(a6);
                B(a6);
                l.c(a6.f());
                return new r((m) this.f2694b, (C0866g) this.f2695c, a6, this.f2693a);
            }
            throw new IllegalArgumentException("Can't call endAt() or equalTo() multiple times");
        }
        throw new IllegalArgumentException("Can only use simple values for endAt()");
    }

    public r h(String str) {
        String str2 = "[MIN_NAME]";
        if (str == null || !((C0968f) this.d).g.equals(n.f12299a)) {
            return f(str, str2);
        }
        Random random = i.f11094a;
        q3.m.a(str);
        Integer g = l.g(str);
        if (g == null) {
            StringBuilder sb = new StringBuilder(str);
            if (sb.charAt(sb.length() - 1) != '-') {
                sb.setCharAt(sb.length() - 1, "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(sb.length() - 1)) - 1));
                sb.append(new String(new char[(786 - sb.length())]).replace("\u0000", "z"));
                str2 = sb.toString();
            } else if (sb.length() == 1) {
                str2 = String.valueOf(f.API_PRIORITY_OTHER);
            } else {
                str2 = sb.substring(0, sb.length() - 1);
            }
        } else if (g.intValue() != Integer.MIN_VALUE) {
            str2 = String.valueOf(g.intValue() - 1);
        }
        return f(str2, (String) null);
    }

    public r i(String str) {
        z();
        return x(str, (String) null).f(str, (String) null);
    }

    public r j() {
        z();
        Boolean bool = Boolean.TRUE;
        k kVar = k.f12295e;
        return y((String) null, new C1046a(bool, kVar)).g((String) null, new C1046a(bool, kVar));
    }

    public File k() {
        File file;
        synchronized (((c) this.d)) {
            try {
                b bVar = (b) this.f2694b;
                if (bVar.f12510f == this) {
                    if (!bVar.f12509e) {
                        ((boolean[]) this.f2695c)[0] = true;
                    }
                    file = bVar.d[0];
                    ((c) this.d).f12511a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C0969g l() {
        return new C0969g((C0866g) this.f2695c, (C0968f) this.d);
    }

    public synchronized void m() {
        try {
            if (!this.f2693a) {
                Boolean t6 = t();
                this.f2695c = t6;
                if (t6 == null) {
                    D2.l lVar = new D2.l(19);
                    g3.j jVar = (g3.j) ((E3.c) this.f2694b);
                    jVar.a(jVar.f8033c, lVar);
                }
                this.f2693a = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized boolean n() {
        boolean z3;
        boolean z4;
        try {
            m();
            Boolean bool = (Boolean) this.f2695c;
            if (bool != null) {
                z3 = bool.booleanValue();
            } else {
                R2.i iVar = ((FirebaseMessaging) this.d).f6904a;
                iVar.b();
                a aVar = (a) iVar.g.get();
                synchronized (aVar) {
                    z4 = aVar.f2183a;
                }
                z3 = z4;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z3;
    }

    public r o(int i2) {
        if (i2 > 0) {
            C0968f fVar = (C0968f) this.d;
            if (!fVar.d()) {
                C0968f a6 = fVar.a();
                a6.f11533a = Integer.valueOf(i2);
                a6.f11534b = 1;
                return new r((m) this.f2694b, (C0866g) this.f2695c, a6, this.f2693a);
            }
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        throw new IllegalArgumentException("Limit must be a positive integer!");
    }

    public r p(int i2) {
        if (i2 > 0) {
            C0968f fVar = (C0968f) this.d;
            if (!fVar.d()) {
                C0968f a6 = fVar.a();
                a6.f11533a = Integer.valueOf(i2);
                a6.f11534b = 2;
                return new r((m) this.f2694b, (C0866g) this.f2695c, a6, this.f2693a);
            }
            throw new IllegalArgumentException("Can't call limitToLast on query with previously set limit!");
        }
        throw new IllegalArgumentException("Limit must be a positive integer!");
    }

    public r q(String str) {
        if (str == null) {
            throw new NullPointerException("Key can't be null");
        } else if (str.equals("$key") || str.equals(".key")) {
            throw new IllegalArgumentException(C0552a.o("Can't use '", str, "' as path, please use orderByKey() instead!"));
        } else if (str.equals("$priority") || str.equals(".priority")) {
            throw new IllegalArgumentException(C0552a.o("Can't use '", str, "' as path, please use orderByPriority() instead!"));
        } else if (str.equals("$value") || str.equals(".value")) {
            throw new IllegalArgumentException(C0552a.o("Can't use '", str, "' as path, please use orderByValue() instead!"));
        } else {
            q3.m.b(str);
            if (!this.f2693a) {
                C0866g gVar = new C0866g(str);
                if (gVar.size() != 0) {
                    t tVar = new t(gVar);
                    C0968f a6 = ((C0968f) this.d).a();
                    a6.g = tVar;
                    return new r((m) this.f2694b, (C0866g) this.f2695c, a6, true);
                }
                throw new IllegalArgumentException("Can't use empty path, use orderByValue() instead!");
            }
            throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
        }
    }

    public r r() {
        if (!this.f2693a) {
            n nVar = n.f12299a;
            C0968f a6 = ((C0968f) this.d).a();
            a6.g = nVar;
            B(a6);
            return new r((m) this.f2694b, (C0866g) this.f2695c, a6, true);
        }
        throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
    }

    public r s() {
        if (!this.f2693a) {
            x xVar = x.f12313a;
            C0968f a6 = ((C0968f) this.d).a();
            a6.g = xVar;
            return new r((m) this.f2694b, (C0866g) this.f2695c, a6, true);
        }
        throw new IllegalArgumentException("You can't combine multiple orderBy calls!");
    }

    public Boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        R2.i iVar = ((FirebaseMessaging) this.d).f6904a;
        iVar.b();
        Context context = iVar.f2490a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void u(C0585a aVar) {
        if (aVar != null) {
            v(new C0860a((m) this.f2694b, aVar, l()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }

    public void v(C0865f fVar) {
        H h = H.f10253b;
        synchronized (h.f10254a) {
            try {
                List list = (List) h.f10254a.get(fVar);
                if (list != null && !list.isEmpty()) {
                    if (fVar.e().b()) {
                        HashSet hashSet = new HashSet();
                        for (int size = list.size() - 1; size >= 0; size--) {
                            C0865f fVar2 = (C0865f) list.get(size);
                            if (!hashSet.contains(fVar2.e())) {
                                hashSet.add(fVar2.e());
                                fVar2.h();
                            }
                        }
                    } else {
                        ((C0865f) list.get(0)).h();
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        ((m) this.f2694b).o(new i3.m(this, fVar, 0));
    }

    public r w(String str) {
        String str2 = "[MAX_KEY]";
        if (str == null || !((C0968f) this.d).g.equals(n.f12299a)) {
            return x(str, str2);
        }
        Random random = i.f11094a;
        q3.m.a(str);
        Integer g = l.g(str);
        if (g == null) {
            StringBuilder sb = new StringBuilder(str);
            if (sb.length() < 786) {
                sb.append('-');
                str2 = sb.toString();
            } else {
                int length = sb.length() - 1;
                while (length >= 0 && sb.charAt(length) == 'z') {
                    length--;
                }
                if (length != -1) {
                    int i2 = length + 1;
                    sb.replace(length, i2, String.valueOf("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(length)) + 1)));
                    str2 = sb.substring(0, i2);
                }
            }
        } else if (g.intValue() == Integer.MAX_VALUE) {
            str2 = String.valueOf('-');
        } else {
            str2 = String.valueOf(g.intValue() + 1);
        }
        return x(str2, (String) null);
    }

    public r x(String str, String str2) {
        s sVar;
        if (str != null) {
            sVar = new w(str, k.f12295e);
        } else {
            sVar = k.f12295e;
        }
        return y(str2, sVar);
    }

    public r y(String str, s sVar) {
        C1048c cVar;
        boolean z3;
        q3.m.a(str);
        if (sVar.h() || sVar.isEmpty()) {
            C0968f fVar = (C0968f) this.d;
            if (!fVar.e()) {
                if (str == null) {
                    cVar = null;
                } else if (str.equals("[MIN_NAME]")) {
                    cVar = C1048c.f12278b;
                } else if (str.equals("[MAX_KEY]")) {
                    cVar = C1048c.f12279c;
                } else {
                    cVar = C1048c.e(str);
                }
                if (sVar.h() || sVar.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                l.c(z3);
                l.c(!(sVar instanceof p));
                C0968f a6 = fVar.a();
                a6.f11535c = sVar;
                a6.d = cVar;
                A(a6);
                B(a6);
                l.c(a6.f());
                return new r((m) this.f2694b, (C0866g) this.f2695c, a6, this.f2693a);
            }
            throw new IllegalArgumentException("Can't call startAt(), startAfte(), or equalTo() multiple times");
        }
        throw new IllegalArgumentException("Can only use simple values for startAt() and startAfter()");
    }

    public void z() {
        C0968f fVar = (C0968f) this.d;
        if (fVar.e()) {
            throw new IllegalArgumentException("Cannot combine equalTo() with startAt() or startAfter()");
        } else if (fVar.c()) {
            throw new IllegalArgumentException("Cannot combine equalTo() with endAt() or endBefore()");
        }
    }

    public r(m mVar, C0866g gVar, C0968f fVar, boolean z3) {
        this.f2694b = mVar;
        this.f2695c = gVar;
        this.d = fVar;
        this.f2693a = z3;
        l.b("Validation of queries failed.", fVar.f());
    }

    public r(m mVar, C0866g gVar) {
        this.f2694b = mVar;
        this.f2695c = gVar;
        this.d = C0968f.h;
        this.f2693a = false;
    }

    public r(c cVar, b bVar) {
        boolean[] zArr;
        this.d = cVar;
        this.f2694b = bVar;
        if (bVar.f12509e) {
            zArr = null;
        } else {
            zArr = new boolean[cVar.f12516p];
        }
        this.f2695c = zArr;
    }
}
