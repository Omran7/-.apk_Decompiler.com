package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import e3.C0495c;
import e3.m;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafh  reason: invalid package */
public final class zzafh<ResultT, CallbackT> implements zzaey<ResultT> {
    private final zzaex<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzafh(zzaex<ResultT, CallbackT> zzaex, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzaex;
        this.zzb = taskCompletionSource;
    }

    public final void zza(ResultT resultt, Status status) {
        m mVar;
        I.h(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzaex<ResultT, CallbackT> zzaex = this.zza;
            if (zzaex.zzq != null) {
                TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
                FirebaseAuth instance = FirebaseAuth.getInstance(zzaex.zzc);
                zzaex<ResultT, CallbackT> zzaex2 = this.zza;
                zzaaj zzaaj = zzaex2.zzq;
                if ("reauthenticateWithCredential".equals(zzaex2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    mVar = this.zza.zzd;
                } else {
                    mVar = null;
                }
                taskCompletionSource.setException(zzaei.zza(instance, zzaaj, mVar));
                return;
            }
            C0495c cVar = zzaex.zzn;
            if (cVar != null) {
                this.zzb.setException(zzaei.zza(status, cVar, zzaex.zzo, zzaex.zzp));
            } else {
                this.zzb.setException(zzaei.zza(status));
            }
        } else {
            this.zzb.setResult(resultt);
        }
    }
}
