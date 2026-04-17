package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.c;
import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabo  reason: invalid package */
final class zzabo implements zzafn<zzaij> {
    private final /* synthetic */ zzaig zza;
    private final /* synthetic */ zzaeg zzb;

    public zzabo(zzaam zzaam, zzaig zzaig, zzaeg zzaeg) {
        this.zza = zzaig;
        this.zzb = zzaeg;
    }

    public final void zza(String str) {
        this.zzb.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaij zzaij = (zzaij) obj;
        zzaig zzaig = this.zza;
        if (zzaig instanceof zzaik) {
            this.zzb.zzb(zzaij.zza());
        } else if (zzaig instanceof zzaim) {
            this.zzb.zza(zzaij);
        } else {
            throw new IllegalArgumentException(C0552a.o("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was ", this.zza.getClass().getName(), "."));
        }
    }
}
