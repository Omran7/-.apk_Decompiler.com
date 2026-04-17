package T1;

import D0.d;
import G1.c;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import h0.C0552a;
import java.io.IOException;
import java.util.Map;

public final class W implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3130a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f3131b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3132c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3133e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3134f;

    /* renamed from: p  reason: collision with root package name */
    public final Object f3135p;

    public W(Z z3, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f3131b = i2;
        this.f3132c = str;
        this.d = obj;
        this.f3133e = obj2;
        this.f3134f = obj3;
        this.f3135p = z3;
    }

    public final void run() {
        boolean z3;
        switch (this.f3130a) {
            case 0:
                Z z4 = (Z) this.f3135p;
                C0174h0 h0Var = ((C0212u0) z4.f398a).f3495q;
                C0212u0.i(h0Var);
                if (h0Var.f2825b) {
                    if (z4.f3170c == 0) {
                        C0170g gVar = ((C0212u0) z4.f398a).f3494p;
                        if (gVar.f3294e == null) {
                            synchronized (gVar) {
                                try {
                                    if (gVar.f3294e == null) {
                                        C0212u0 u0Var = (C0212u0) gVar.f398a;
                                        ApplicationInfo applicationInfo = u0Var.f3489a.getApplicationInfo();
                                        String b6 = c.b();
                                        if (applicationInfo != null) {
                                            String str = applicationInfo.processName;
                                            if (str == null || !str.equals(b6)) {
                                                z3 = false;
                                            } else {
                                                z3 = true;
                                            }
                                            gVar.f3294e = Boolean.valueOf(z3);
                                        }
                                        if (gVar.f3294e == null) {
                                            gVar.f3294e = Boolean.TRUE;
                                            Z z5 = u0Var.f3496r;
                                            C0212u0.k(z5);
                                            z5.f3172f.a("My process not in the list of running processes");
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        if (gVar.f3294e.booleanValue()) {
                            z4.f3170c = 'C';
                        } else {
                            z4.f3170c = 'c';
                        }
                    }
                    if (z4.d < 0) {
                        ((C0212u0) z4.f398a).f3494p.v();
                        z4.d = 119002;
                    }
                    char charAt = "01VDIWEA?".charAt(this.f3131b);
                    char c3 = z4.f3170c;
                    long j6 = z4.d;
                    String str2 = this.f3132c;
                    String x6 = Z.x(true, str2, this.d, this.f3133e, this.f3134f);
                    StringBuilder sb = new StringBuilder("2");
                    sb.append(charAt);
                    sb.append(c3);
                    sb.append(j6);
                    String r6 = C0552a.r(sb, ":", x6);
                    if (r6.length() > 1024) {
                        r6 = str2.substring(0, 1024);
                    }
                    d dVar = h0Var.f3321f;
                    if (dVar != null) {
                        C0174h0 h0Var2 = (C0174h0) dVar.f492e;
                        h0Var2.o();
                        if (((C0174h0) dVar.f492e).t().getLong((String) dVar.f490b, 0) == 0) {
                            dVar.d();
                        }
                        if (r6 == null) {
                            r6 = "";
                        }
                        SharedPreferences t6 = h0Var2.t();
                        String str3 = (String) dVar.f491c;
                        long j7 = t6.getLong(str3, 0);
                        int i2 = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
                        String str4 = (String) dVar.d;
                        if (i2 <= 0) {
                            SharedPreferences.Editor edit = h0Var2.t().edit();
                            edit.putString(str4, r6);
                            edit.putLong(str3, 1);
                            edit.apply();
                            return;
                        }
                        Y1 y12 = ((C0212u0) h0Var2.f398a).f3499u;
                        C0212u0.i(y12);
                        long j8 = j7 + 1;
                        SharedPreferences.Editor edit2 = h0Var2.t().edit();
                        if ((y12.A().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j8) {
                            edit2.putString(str4, r6);
                        }
                        edit2.putLong(str3, j8);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, z4.z(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((C0156b0) this.d).d(this.f3132c, this.f3131b, (IOException) this.f3133e, (byte[]) this.f3134f, (Map) this.f3135p);
                return;
        }
    }

    public /* synthetic */ W(String str, C0156b0 b0Var, int i2, IOException iOException, byte[] bArr, Map map) {
        I.g(b0Var);
        this.d = b0Var;
        this.f3131b = i2;
        this.f3133e = iOException;
        this.f3134f = bArr;
        this.f3132c = str;
        this.f3135p = map;
    }
}
