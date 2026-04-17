package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.C0530g;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzads  reason: invalid package */
final class zzads extends zzaex<Void, v> {
    private final String zzaa;
    private final String zzab;
    private final String zzac;
    private final boolean zzad;
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public zzads(C0530g gVar, String str, String str2, long j6, boolean z3, boolean z4, String str3, String str4, String str5, boolean z5) {
        super(8);
        I.g(gVar);
        I.d(str);
        String str6 = gVar.f7934a;
        I.d(str6);
        this.zzu = str6;
        this.zzv = str;
        this.zzw = str2;
        this.zzx = j6;
        this.zzy = z3;
        this.zzz = z4;
        this.zzaa = str3;
        this.zzab = str4;
        this.zzac = str5;
        this.zzad = z5;
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zzb() {
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzb);
    }
}
