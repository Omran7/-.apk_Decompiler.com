package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import e3.u;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafc  reason: invalid package */
final class zzafc implements zzafe {
    private final /* synthetic */ Status zza;

    public zzafc(zzaez zzaez, Status status) {
        this.zza = status;
    }

    public final void zza(u uVar, Object... objArr) {
        uVar.onVerificationFailed(zzaei.zza(this.zza));
    }
}
