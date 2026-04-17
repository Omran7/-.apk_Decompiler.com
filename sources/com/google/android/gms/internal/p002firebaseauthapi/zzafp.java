package com.google.android.gms.internal.p002firebaseauthapi;

import G1.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.I;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafp  reason: invalid package */
public final class zzafp {
    private final String zza;
    private final String zzb;

    public zzafp(Context context) {
        this(context, context.getPackageName());
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    private zzafp(Context context, String str) {
        I.g(context);
        I.d(str);
        this.zza = str;
        try {
            byte[] c3 = c.c(context, str);
            if (c3 == null) {
                Log.e("FBA-PackageInfo", "single cert required: " + str);
                this.zzb = null;
                return;
            }
            this.zzb = c.a(c3);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }
}
