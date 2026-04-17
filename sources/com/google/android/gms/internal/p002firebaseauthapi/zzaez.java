package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.PendingIntent;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import e3.C0495c;
import e3.s;
import f3.C0533j;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaez  reason: invalid package */
final class zzaez implements zzaed {
    final /* synthetic */ zzaex zza;

    public zzaez(zzaex zzaex) {
        this.zza = zzaex;
    }

    public final void zza(Status status) {
        String str = status.f6008b;
        if (str != null) {
            if (str.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089, (String) null, (PendingIntent) null, (C1132b) null);
            } else if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090, (String) null, (PendingIntent) null, (C1132b) null);
            }
        }
        zzaex zzaex = this.zza;
        if (zzaex.zza == 8) {
            zzaex.zzu = true;
            zza((zzafe) new zzafc(this, status));
            return;
        }
        zzaex.zza(zzaex, status);
        this.zza.zza(status);
    }

    public final void zzb(String str) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 8;
        I.i("Unexpected response type " + i2, z3);
        zza((zzafe) new zzafb(this, str));
    }

    public final void zzc(String str) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 7;
        I.i("Unexpected response type " + i2, z3);
        zzaex.zza(this.zza);
    }

    public final void zzb() {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 6;
        I.i("Unexpected response type " + i2, z3);
        zzaex.zza(this.zza);
    }

    public final void zzc() {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 9;
        I.i("Unexpected response type " + i2, z3);
        zzaex.zza(this.zza);
    }

    private final void zza(zzafe zzafe) {
        this.zza.zzi.execute(new zzaff(this, zzafe));
    }

    private final void zza(Status status, C0495c cVar, String str, String str2) {
        zzaex.zza(this.zza, status);
        zzaex zzaex = this.zza;
        zzaex.zzn = cVar;
        zzaex.zzo = str;
        zzaex.zzp = str2;
        C0533j jVar = zzaex.zzf;
        if (jVar != null) {
            jVar.zza(status);
        }
        this.zza.zza(status);
    }

    public final void zza(String str) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 8;
        I.i("Unexpected response type " + i2, z3);
        this.zza.zzu = true;
        zza((zzafe) new zzafd(this, str));
    }

    public final void zza(zzagn zzagn) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 3;
        I.i("Unexpected response type " + i2, z3);
        zzaex zzaex = this.zza;
        zzaex.zzl = zzagn;
        zzaex.zza(zzaex);
    }

    public final void zza() {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 5;
        I.i("Unexpected response type " + i2, z3);
        zzaex.zza(this.zza);
    }

    public final void zza(zzaak zzaak) {
        zza(zzaak.zza(), zzaak.zzb(), zzaak.zzc(), zzaak.zzd());
    }

    public final void zza(zzaaj zzaaj) {
        zzaex zzaex = this.zza;
        zzaex.zzq = zzaaj;
        zzaex.zza(c.G0("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zza(Status status, s sVar) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 2;
        I.i("Unexpected response type " + i2, z3);
        zza(status, sVar, (String) null, (String) null);
    }

    public final void zza(zzahj zzahj) {
        zzaex zzaex = this.zza;
        zzaex.zzs = zzahj;
        zzaex.zza(zzaex);
    }

    public final void zza(zzahk zzahk) {
        zzaex zzaex = this.zza;
        zzaex.zzr = zzahk;
        zzaex.zza(zzaex);
    }

    public final void zza(zzahn zzahn, zzahc zzahc) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 2;
        I.i("Unexpected response type: " + i2, z3);
        zzaex zzaex = this.zza;
        zzaex.zzj = zzahn;
        zzaex.zzk = zzahc;
        zzaex.zza(zzaex);
    }

    public final void zza(zzahx zzahx) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 4;
        I.i("Unexpected response type " + i2, z3);
        zzaex zzaex = this.zza;
        zzaex.zzm = zzahx;
        zzaex.zza(zzaex);
    }

    public final void zza(zzahy zzahy) {
        zzaex.zza(this.zza);
    }

    public final void zza(zzaij zzaij) {
        zzaex zzaex = this.zza;
        zzaex.zzt = zzaij;
        zzaex.zza(zzaex);
    }

    public final void zza(zzahn zzahn) {
        int i2 = this.zza.zza;
        boolean z3 = true;
        if (i2 != 1) {
            z3 = false;
        }
        I.i("Unexpected response type: " + i2, z3);
        zzaex zzaex = this.zza;
        zzaex.zzj = zzahn;
        zzaex.zza(zzaex);
    }

    public final void zza(s sVar) {
        int i2 = this.zza.zza;
        boolean z3 = i2 == 8;
        I.i("Unexpected response type " + i2, z3);
        this.zza.zzu = true;
        zza((zzafe) new zzafa(this, sVar));
    }
}
