package i3;

import B2.a;
import H.j;
import S3.r;
import T1.C0221x0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.regex.Pattern;
import n3.C0858C;
import n3.C0861b;
import n3.C0866g;
import q3.f;
import q3.i;
import q3.k;
import q3.l;
import q3.m;
import r3.b;
import v3.C1048c;
import v3.s;
import z0.C1129e;

/* renamed from: i3.f  reason: case insensitive filesystem */
public final class C0590f extends r {
    /* JADX WARNING: type inference failed for: r0v3, types: [S3.r, i3.f] */
    public final C0590f E(String str) {
        if (str != null) {
            C0866g gVar = (C0866g) this.f2695c;
            if (gVar.isEmpty()) {
                m.c(str);
            } else {
                m.b(str);
            }
            return new r((n3.m) this.f2694b, gVar.t(new C0866g(str)));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
    }

    public final String F() {
        C0866g gVar = (C0866g) this.f2695c;
        if (gVar.isEmpty()) {
            return null;
        }
        return gVar.y().f12280a;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [S3.r, i3.f] */
    public final C0590f G() {
        boolean z3;
        boolean z4;
        String sb;
        boolean z5 = true;
        long e6 = ((n3.m) this.f2694b).f10300b.e();
        Random random = i.f11094a;
        synchronized (i.class) {
            try {
                if (e6 == i.f11095b) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i.f11095b = e6;
                char[] cArr = new char[8];
                StringBuilder sb2 = new StringBuilder(20);
                for (int i2 = 7; i2 >= 0; i2--) {
                    cArr[i2] = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt((int) (e6 % 64));
                    e6 /= 64;
                }
                if (e6 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                l.c(z4);
                sb2.append(cArr);
                if (!z3) {
                    for (int i5 = 0; i5 < 12; i5++) {
                        i.f11096c[i5] = i.f11094a.nextInt(64);
                    }
                } else {
                    int i6 = 11;
                    while (true) {
                        if (i6 < 0) {
                            break;
                        }
                        int[] iArr = i.f11096c;
                        int i7 = iArr[i6];
                        if (i7 != 63) {
                            iArr[i6] = i7 + 1;
                            break;
                        }
                        iArr[i6] = 0;
                        i6--;
                    }
                }
                for (int i8 = 0; i8 < 12; i8++) {
                    sb2.append("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt(i.f11096c[i8]));
                }
                if (sb2.length() != 20) {
                    z5 = false;
                }
                l.c(z5);
                sb = sb2.toString();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new r((n3.m) this.f2694b, ((C0866g) this.f2695c).v(C1048c.e(sb)));
    }

    public final void H(p pVar) {
        m.e((C0866g) this.f2695c);
        ((n3.m) this.f2694b).o(new a(this, pVar, 29, false));
    }

    public final Task I(Object obj) {
        C0866g gVar = (C0866g) this.f2695c;
        s e6 = C1129e.e(gVar, (Object) null);
        m.e(gVar);
        new C0858C(gVar).g(obj);
        Object g = b.g(obj);
        m.d(g);
        s a6 = android.support.v4.media.session.a.a(g, e6);
        char[] cArr = l.f11100a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k kVar = new k(taskCompletionSource);
        Task task = taskCompletionSource.getTask();
        ((n3.m) this.f2694b).o(new j(this, a6, new f(task, kVar), 16, false));
        return task;
    }

    public final Task J(HashMap hashMap) {
        boolean z3;
        String str;
        s sVar;
        Object g = b.g(hashMap);
        l.c(g instanceof Map);
        Map map = (Map) g;
        Pattern pattern = m.f11101a;
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            C0866g gVar = new C0866g((String) entry.getKey());
            Object value = entry.getValue();
            new C0858C(((C0866g) this.f2695c).t(gVar)).g(value);
            if (!gVar.isEmpty()) {
                str = gVar.y().f12280a;
            } else {
                str = "";
            }
            if (str.equals(".sv") || str.equals(".value")) {
                throw new RuntimeException("Path '" + gVar + "' contains disallowed child name: " + str);
            }
            if (str.equals(".priority")) {
                sVar = C1129e.e(gVar, value);
            } else {
                sVar = android.support.v4.media.session.a.a(value, v3.k.f12295e);
            }
            m.d(value);
            treeMap.put(gVar, sVar);
        }
        C0866g gVar2 = null;
        for (C0866g gVar3 : treeMap.keySet()) {
            if (gVar2 == null || gVar2.compareTo(gVar3) < 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            l.c(z3);
            if (gVar2 == null || !gVar2.x(gVar3)) {
                gVar2 = gVar3;
            } else {
                throw new RuntimeException("Path '" + gVar2 + "' is an ancestor of '" + gVar3 + "' in an update.");
            }
        }
        C0861b y6 = C0861b.y(treeMap);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k kVar = new k(taskCompletionSource);
        Task task = taskCompletionSource.getTask();
        ((n3.m) this.f2694b).o(new C0221x0((Object) this, (Object) y6, (Object) new f(task, kVar), (Object) map, 9));
        return task;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0590f) || !toString().equals(obj.toString())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [S3.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f2695c
            n3.g r0 = (n3.C0866g) r0
            n3.g r0 = r0.A()
            java.lang.Object r1 = r4.f2694b
            n3.m r1 = (n3.m) r1
            if (r0 == 0) goto L_0x0014
            i3.f r2 = new i3.f
            r2.<init>((n3.m) r1, (n3.C0866g) r0)
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 != 0) goto L_0x001e
            n3.n r0 = r1.f10299a
            java.lang.String r0 = r0.toString()
            return r0
        L_0x001e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            java.lang.String r1 = r4.F()     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            java.lang.String r2 = "+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replace(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0049 }
            return r0
        L_0x0049:
            r0 = move-exception
            i3.e r1 = new i3.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to URLEncode key: "
            r2.<init>(r3)
            java.lang.String r3 = r4.F()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C0590f.toString():java.lang.String");
    }
}
