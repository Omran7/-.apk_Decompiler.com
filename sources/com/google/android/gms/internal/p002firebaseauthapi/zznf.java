package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznf  reason: invalid package */
public final class zznf implements zzbx {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zznf(Context context, String str, String str2) {
        if (str != null) {
            this.zzb = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public final void zza(zzvq zzvq) {
        if (!this.zza.putString(this.zzb, zzzr.zza(zzvq.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public final void zza(zzxc zzxc) {
        if (!this.zza.putString(this.zzb, zzzr.zza(zzxc.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
