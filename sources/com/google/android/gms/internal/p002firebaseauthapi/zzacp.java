package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.m;
import e3.q;
import f3.C0523A;
import f3.C0528e;
import f3.v;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacp  reason: invalid package */
final class zzacp extends zzaex<C0523A, v> {
    private final q zzu;
    private final String zzv;
    private final String zzw;

    public zzacp(q qVar, String str, String str2) {
        super(2);
        I.g(qVar);
        throw null;
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        m mVar = this.zzd;
        if (mVar == null || ((C0528e) mVar).f7921b.f7913a.equalsIgnoreCase(zza.f7921b.f7913a)) {
            ((v) this.zze).a(this.zzj, zza);
            zzb(new C0523A(zza));
            return;
        }
        zza(new Status(17024, (String) null, (PendingIntent) null, (C1132b) null));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzv, (q) null, this.zzw, (zzaed) this.zzb);
    }
}
