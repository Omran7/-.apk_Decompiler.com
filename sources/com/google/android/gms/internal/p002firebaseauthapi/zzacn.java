package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0532i;
import f3.v;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacn  reason: invalid package */
final class zzacn extends zzaex<C0532i, v> {
    private final String zzu;
    private final String zzv;

    public zzacn(String str, String str2) {
        super(3);
        I.e(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    public final void zzb() {
        List list;
        if (this.zzl.zza() == null) {
            list = zzaj.zzh();
        } else {
            list = this.zzl.zza();
            I.g(list);
        }
        zzb(new C0532i(list));
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zze(this.zzu, this.zzv, this.zzb);
    }
}
