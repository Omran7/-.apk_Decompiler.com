package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzq  reason: invalid package */
final class zzq extends zzm {
    private final Matcher zza;

    public zzq(Matcher matcher) {
        this.zza = (Matcher) zzw.zza(matcher);
    }

    public final int zza() {
        return this.zza.end();
    }

    public final int zzb() {
        return this.zza.start();
    }

    public final boolean zzc() {
        return this.zza.matches();
    }

    public final boolean zza(int i2) {
        return this.zza.find(i2);
    }
}
