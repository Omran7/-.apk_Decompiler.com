package T1;

import D0.d;
import S3.r;
import S3.z;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.I;

/* renamed from: T1.h0  reason: case insensitive filesystem */
public final class C0174h0 extends E0 {

    /* renamed from: J  reason: collision with root package name */
    public static final Pair f3310J = new Pair("", 0L);

    /* renamed from: A  reason: collision with root package name */
    public final C0171g0 f3311A = new C0171g0(this, "session_id", 0);

    /* renamed from: B  reason: collision with root package name */
    public boolean f3312B;

    /* renamed from: C  reason: collision with root package name */
    public final C0168f0 f3313C;

    /* renamed from: D  reason: collision with root package name */
    public final C0168f0 f3314D;

    /* renamed from: E  reason: collision with root package name */
    public final C0171g0 f3315E;
    public final r F;

    /* renamed from: G  reason: collision with root package name */
    public final r f3316G;

    /* renamed from: H  reason: collision with root package name */
    public final C0171g0 f3317H;

    /* renamed from: I  reason: collision with root package name */
    public final z f3318I;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f3319c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f3320e;

    /* renamed from: f  reason: collision with root package name */
    public d f3321f;

    /* renamed from: p  reason: collision with root package name */
    public final C0171g0 f3322p = new C0171g0(this, "first_open_time", 0);

    /* renamed from: q  reason: collision with root package name */
    public final r f3323q;

    /* renamed from: r  reason: collision with root package name */
    public String f3324r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3325s;

    /* renamed from: t  reason: collision with root package name */
    public long f3326t;

    /* renamed from: u  reason: collision with root package name */
    public final C0171g0 f3327u = new C0171g0(this, "session_timeout", 1800000);

    /* renamed from: v  reason: collision with root package name */
    public final C0168f0 f3328v = new C0168f0(this, "start_new_session", true);

    /* renamed from: w  reason: collision with root package name */
    public final r f3329w = new r(this, "non_personalized_ads");

    /* renamed from: x  reason: collision with root package name */
    public final z f3330x = new z(this, "last_received_uri_timestamps_by_source");

    /* renamed from: y  reason: collision with root package name */
    public final C0168f0 f3331y = new C0168f0(this, "allow_remote_dynamite", false);

    /* renamed from: z  reason: collision with root package name */
    public final C0171g0 f3332z = new C0171g0(this, "last_pause_time", 0);

    public C0174h0(C0212u0 u0Var) {
        super(u0Var);
        I.d("app_install_time");
        this.f3323q = new r(this, "app_instance_id");
        this.f3313C = new C0168f0(this, "app_backgrounded", false);
        this.f3314D = new C0168f0(this, "deep_link_retrieval_complete", false);
        this.f3315E = new C0171g0(this, "deep_link_retrieval_attempts", 0);
        this.F = new r(this, "firebase_feature_rollouts");
        this.f3316G = new r(this, "deferred_attribution_cache");
        this.f3317H = new C0171g0(this, "deferred_attribution_cache_timestamp", 0);
        this.f3318I = new z(this, "default_event_parameters");
    }

    public final boolean p() {
        return true;
    }

    public final SharedPreferences s() {
        o();
        q();
        if (this.f3320e == null) {
            synchronized (this.d) {
                try {
                    if (this.f3320e == null) {
                        C0212u0 u0Var = (C0212u0) this.f398a;
                        String str = u0Var.f3489a.getPackageName() + "_preferences";
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3180w.b(str, "Default prefs file");
                        this.f3320e = u0Var.f3489a.getSharedPreferences(str, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f3320e;
    }

    public final SharedPreferences t() {
        o();
        q();
        I.g(this.f3319c);
        return this.f3319c;
    }

    public final SparseArray u() {
        Bundle J5 = this.f3330x.J();
        int[] intArray = J5.getIntArray("uriSources");
        long[] longArray = J5.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            Z z3 = ((C0212u0) this.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3172f.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i2 = 0; i2 < intArray.length; i2++) {
            sparseArray.put(intArray[i2], Long.valueOf(longArray[i2]));
        }
        return sparseArray;
    }

    public final J0 v() {
        o();
        return J0.e(t().getInt("consent_source", 100), t().getString("consent_settings", "G1"));
    }

    public final void w(boolean z3) {
        o();
        Z z4 = ((C0212u0) this.f398a).f3496r;
        C0212u0.k(z4);
        z4.f3180w.b(Boolean.valueOf(z3), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = t().edit();
        edit.putBoolean("deferred_analytics_collection", z3);
        edit.apply();
    }

    public final boolean x(long j6) {
        if (j6 - this.f3327u.a() > this.f3332z.a()) {
            return true;
        }
        return false;
    }

    public final boolean y(F1 f12) {
        o();
        String string = t().getString("stored_tcf_param", "");
        String c3 = f12.c();
        if (c3.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = t().edit();
        edit.putString("stored_tcf_param", c3);
        edit.apply();
        return true;
    }
}
