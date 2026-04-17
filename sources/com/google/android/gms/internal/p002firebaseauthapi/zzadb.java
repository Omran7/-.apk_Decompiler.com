package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0528e;
import f3.v;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadb  reason: invalid package */
final class zzadb extends zzaex<Void, v> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzadb(String str, String str2, String str3, String str4) {
        super(2);
        I.e(str, "email cannot be null or empty");
        I.e(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    public final String zza() {
        return "reauthenticateWithEmailPassword";
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
        zzaef.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
