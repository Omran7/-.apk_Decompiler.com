package T1;

import B0.H;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import n1.C0854a;

/* renamed from: T1.y1  reason: case insensitive filesystem */
public final class C0225y1 extends O1 {
    public final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final C0171g0 f3544e;

    /* renamed from: f  reason: collision with root package name */
    public final C0171g0 f3545f;

    /* renamed from: p  reason: collision with root package name */
    public final C0171g0 f3546p;

    /* renamed from: q  reason: collision with root package name */
    public final C0171g0 f3547q;

    /* renamed from: r  reason: collision with root package name */
    public final C0171g0 f3548r;

    /* renamed from: s  reason: collision with root package name */
    public final C0171g0 f3549s;

    public C0225y1(T1 t12) {
        super(t12);
        C0174h0 h0Var = ((C0212u0) this.f398a).f3495q;
        C0212u0.i(h0Var);
        this.f3544e = new C0171g0(h0Var, "last_delete_stale", 0);
        C0174h0 h0Var2 = ((C0212u0) this.f398a).f3495q;
        C0212u0.i(h0Var2);
        this.f3545f = new C0171g0(h0Var2, "last_delete_stale_batch", 0);
        C0174h0 h0Var3 = ((C0212u0) this.f398a).f3495q;
        C0212u0.i(h0Var3);
        this.f3546p = new C0171g0(h0Var3, "backoff", 0);
        C0174h0 h0Var4 = ((C0212u0) this.f398a).f3495q;
        C0212u0.i(h0Var4);
        this.f3547q = new C0171g0(h0Var4, "last_upload", 0);
        C0174h0 h0Var5 = ((C0212u0) this.f398a).f3495q;
        C0212u0.i(h0Var5);
        this.f3548r = new C0171g0(h0Var5, "last_upload_attempt", 0);
        C0174h0 h0Var6 = ((C0212u0) this.f398a).f3495q;
        C0212u0.i(h0Var6);
        this.f3549s = new C0171g0(h0Var6, "midnight_offset", 0);
    }

    public final Pair s(String str) {
        C0222x1 x1Var;
        H h;
        o();
        C0212u0 u0Var = (C0212u0) this.f398a;
        u0Var.f3501w.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.d;
        C0222x1 x1Var2 = (C0222x1) hashMap.get(str);
        if (x1Var2 == null || elapsedRealtime >= x1Var2.f3539c) {
            G g = H.f2895b;
            C0170g gVar = u0Var.f3494p;
            long w6 = gVar.w(str, g) + elapsedRealtime;
            try {
                h = C0854a.a(u0Var.f3489a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (x1Var2 != null) {
                    try {
                        if (elapsedRealtime < x1Var2.f3539c + gVar.w(str, H.f2898c)) {
                            return new Pair(x1Var2.f3537a, Boolean.valueOf(x1Var2.f3538b));
                        }
                    } catch (Exception e6) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3179v.b(e6, "Unable to get advertising id");
                        x1Var = new C0222x1(w6, "", false);
                    }
                }
                h = null;
            }
            if (h == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = (String) h.f201c;
            boolean z4 = h.f200b;
            if (str2 != null) {
                x1Var = new C0222x1(w6, str2, z4);
            } else {
                x1Var = new C0222x1(w6, "", z4);
            }
            hashMap.put(str, x1Var);
            return new Pair(x1Var.f3537a, Boolean.valueOf(x1Var.f3538b));
        }
        return new Pair(x1Var2.f3537a, Boolean.valueOf(x1Var2.f3538b));
    }

    public final String t(String str, boolean z3) {
        String str2;
        o();
        if (z3) {
            str2 = (String) s(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest z4 = Y1.z();
        if (z4 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, z4.digest(str2.getBytes()))});
    }

    public final void r() {
    }
}
