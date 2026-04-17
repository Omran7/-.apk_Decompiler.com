package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0496d;
import f3.C0523A;
import f3.C0528e;
import f3.v;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadc  reason: invalid package */
final class zzadc extends zzaex<C0523A, v> {
    private final zzagp zzu;

    public zzadc(C0496d dVar, String str) {
        super(2);
        I.h(dVar, "credential cannot be null or empty");
        this.zzu = new zzagp(dVar, (String) null, str);
    }

    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        if (((C0528e) this.zzd).f7921b.f7913a.equalsIgnoreCase(zza.f7921b.f7913a)) {
            ((v) this.zze).a(this.zzj, zza);
            zzb(new C0523A(zza));
            return;
        }
        zza(new Status(17024, (String) null, (PendingIntent) null, (C1132b) null));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
