package com.google.firebase.analytics;

import L3.d;
import L3.e;
import R2.i;
import S2.a;
import T1.C0160c1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f6860b;

    /* renamed from: a  reason: collision with root package name */
    public final zzff f6861a;

    public FirebaseAnalytics(zzff zzff) {
        I.g(zzff);
        this.f6861a = zzff;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f6860b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f6860b == null) {
                        f6860b = new FirebaseAnalytics(zzff.zzg(context, (String) null, (String) null, (String) null, (Bundle) null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f6860b;
    }

    public static C0160c1 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzff zzg = zzff.zzg(context, (String) null, (String) null, (String) null, bundle);
        if (zzg == null) {
            return null;
        }
        return new a(zzg);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f1716m;
            return (String) Tasks.await(((d) i.e().c(e.class)).c(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e6) {
            throw new IllegalStateException(e6.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f6861a.zzH(zzdj.zza(activity), str, str2);
    }
}
