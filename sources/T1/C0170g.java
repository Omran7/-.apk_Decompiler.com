package T1;

import C0.a;
import I1.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import java.lang.reflect.InvocationTargetException;

/* renamed from: T1.g  reason: case insensitive filesystem */
public final class C0170g extends a {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f3292b;

    /* renamed from: c  reason: collision with root package name */
    public String f3293c;
    public C0167f d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f3294e;

    public final String A(String str, G g) {
        if (TextUtils.isEmpty(str)) {
            return (String) g.a((Object) null);
        }
        return (String) g.a(this.d.a(str, g.f2832a));
    }

    public final boolean B(String str, G g) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) g.a((Object) null)).booleanValue();
        }
        String a6 = this.d.a(str, g.f2832a);
        if (TextUtils.isEmpty(a6)) {
            return ((Boolean) g.a((Object) null)).booleanValue();
        }
        return ((Boolean) g.a(Boolean.valueOf("1".equals(a6)))).booleanValue();
    }

    public final boolean C() {
        Boolean z3 = z("google_analytics_automatic_screen_reporting_enabled");
        if (z3 == null || z3.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        ((C0212u0) this.f398a).getClass();
        Boolean z3 = z("firebase_analytics_collection_deactivated");
        if (z3 == null || !z3.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean q(String str) {
        return "1".equals(this.d.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean r() {
        if (this.f3292b == null) {
            Boolean z3 = z("app_measurement_lite");
            this.f3292b = z3;
            if (z3 == null) {
                this.f3292b = Boolean.FALSE;
            }
        }
        if (this.f3292b.booleanValue() || !((C0212u0) this.f398a).f3492e) {
            return true;
        }
        return false;
    }

    public final String s(String str) {
        Class<String> cls = String.class;
        C0212u0 u0Var = (C0212u0) this.f398a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            I.g(str2);
            return str2;
        } catch (ClassNotFoundException e6) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3172f.b(e6, "Could not find SystemProperties class");
            return "";
        } catch (NoSuchMethodException e7) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.b(e7, "Could not find SystemProperties.get() method");
            return "";
        } catch (IllegalAccessException e8) {
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3172f.b(e8, "Could not access SystemProperties.get()");
            return "";
        } catch (InvocationTargetException e9) {
            Z z6 = u0Var.f3496r;
            C0212u0.k(z6);
            z6.f3172f.b(e9, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double t(String str, G g) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) g.a((Object) null)).doubleValue();
        }
        String a6 = this.d.a(str, g.f2832a);
        if (TextUtils.isEmpty(a6)) {
            return ((Double) g.a((Object) null)).doubleValue();
        }
        try {
            return ((Double) g.a(Double.valueOf(Double.parseDouble(a6)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) g.a((Object) null)).doubleValue();
        }
    }

    public final int u(String str, G g) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) g.a((Object) null)).intValue();
        }
        String a6 = this.d.a(str, g.f2832a);
        if (TextUtils.isEmpty(a6)) {
            return ((Integer) g.a((Object) null)).intValue();
        }
        try {
            return ((Integer) g.a(Integer.valueOf(Integer.parseInt(a6)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) g.a((Object) null)).intValue();
        }
    }

    public final long v() {
        ((C0212u0) this.f398a).getClass();
        return 119002;
    }

    public final long w(String str, G g) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) g.a((Object) null)).longValue();
        }
        String a6 = this.d.a(str, g.f2832a);
        if (TextUtils.isEmpty(a6)) {
            return ((Long) g.a((Object) null)).longValue();
        }
        try {
            return ((Long) g.a(Long.valueOf(Long.parseLong(a6)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) g.a((Object) null)).longValue();
        }
    }

    public final Bundle x() {
        C0212u0 u0Var = (C0212u0) this.f398a;
        try {
            Context context = u0Var.f3489a;
            Context context2 = u0Var.f3489a;
            PackageManager packageManager = context.getPackageManager();
            Z z3 = u0Var.f3496r;
            if (packageManager == null) {
                C0212u0.k(z3);
                z3.f3172f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo h = c.a(context2).h(128, context2.getPackageName());
            if (h != null) {
                return h.metaData;
            }
            C0212u0.k(z3);
            z3.f3172f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.b(e6, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final G0 y(String str, boolean z3) {
        Object obj;
        I.d(str);
        Bundle x6 = x();
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (x6 == null) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3172f.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = x6.get(str);
        }
        G0 g02 = G0.UNINITIALIZED;
        if (obj == null) {
            return g02;
        }
        if (Boolean.TRUE.equals(obj)) {
            return G0.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return G0.DENIED;
        }
        if (z3 && "eu_consent_policy".equals(obj)) {
            return G0.POLICY;
        }
        Z z5 = u0Var.f3496r;
        C0212u0.k(z5);
        z5.f3175r.b(str, "Invalid manifest metadata for");
        return g02;
    }

    public final Boolean z(String str) {
        I.d(str);
        Bundle x6 = x();
        if (x6 == null) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!x6.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(x6.getBoolean(str));
        }
    }
}
