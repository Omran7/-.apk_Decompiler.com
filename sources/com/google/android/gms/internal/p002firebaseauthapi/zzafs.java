package com.google.android.gms.internal.p002firebaseauthapi;

import R2.k;
import e3.s;
import e3.t;
import e3.u;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafs  reason: invalid package */
final class zzafs extends u {
    private final /* synthetic */ u zza;
    private final /* synthetic */ String zzb;

    public zzafs(u uVar, String str) {
        this.zza = uVar;
        this.zzb = str;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzaft.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, t tVar) {
        this.zza.onCodeSent(str, tVar);
    }

    public final void onVerificationCompleted(s sVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(sVar);
    }

    public final void onVerificationFailed(k kVar) {
        zzaft.zza.remove(this.zzb);
        this.zza.onVerificationFailed(kVar);
    }
}
