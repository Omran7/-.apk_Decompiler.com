package com.google.android.gms.internal.p002firebaseauthapi;

import K1.e;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.C0495c;
import f3.C0528e;
import f3.v;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacx  reason: invalid package */
final class zzacx extends zzaex<Void, v> {
    private final zzait zzu;

    public zzacx(C0495c cVar, String str) {
        super(2);
        I.h(cVar, "credential cannot be null");
        this.zzu = e.x0(cVar, str).zza(false);
    }

    public final String zza() {
        return "reauthenticateWithCredential";
    }

    public final void zzb() {
        C0528e zza = zzach.zza(this.zzc, this.zzk);
        if (((C0528e) this.zzd).f7921b.f7913a.equalsIgnoreCase(zza.f7921b.f7913a)) {
            ((v) this.zze).a(this.zzj, zza);
            zzb(null);
            return;
        }
        zza(new Status(17024, (String) null, (PendingIntent) null, (C1132b) null));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, (zzaed) this.zzb);
    }
}
