package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.PendingIntent;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import e3.C0492C;
import e3.C0496d;
import e3.G;
import z1.C1132b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaam  reason: invalid package */
public final class zzaam {
    /* access modifiers changed from: private */
    public final zzafl zza;

    public zzaam(zzafl zzafl) {
        I.g(zzafl);
        this.zza = zzafl;
    }

    public final void zzb(String str, String str2, zzaeg zzaeg) {
        I.d(str);
        I.d(str2);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzace(this, str2, zzaeg));
    }

    public final void zzc(String str, String str2, zzaeg zzaeg) {
        I.d(str);
        I.d(str2);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzacd(this, str2, zzaeg));
    }

    public final void zzd(String str, String str2, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaeg);
        this.zza.zza(new zzahu(str, (String) null, str2), (zzafn<zzahx>) new zzaav(this, zzaeg));
    }

    public final void zze(String str, String str2, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaeg);
        this.zza.zza(new zzagk(str, str2), (zzafn<zzagn>) new zzaat(this, zzaeg));
    }

    public final void zzf(String str, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzabi(this, zzaeg));
    }

    public static void zza(zzaam zzaam, zzaiv zzaiv, zzaeg zzaeg, zzafk zzafk) {
        Status status;
        if (zzaiv.zzo()) {
            G zzb = zzaiv.zzb();
            String zzc = zzaiv.zzc();
            String zzj = zzaiv.zzj();
            if (zzaiv.zzm()) {
                status = new Status(17012, (String) null, (PendingIntent) null, (C1132b) null);
            } else {
                status = c.G0(zzaiv.zzd());
            }
            zzaeg.zza(new zzaak(status, zzb, zzc, zzj));
            return;
        }
        zzaam.zza(new zzahn(zzaiv.zzi(), zzaiv.zze(), Long.valueOf(zzaiv.zza()), "Bearer"), zzaiv.zzh(), zzaiv.zzg(), Boolean.valueOf(zzaiv.zzn()), zzaiv.zzb(), zzaeg, zzafk);
    }

    public final void zzf(String str, String str2, zzaeg zzaeg) {
        I.d(str);
        I.d(str2);
        I.g(zzaeg);
        zza(str2, (zzafn<zzahn>) new zzabh(this, str, zzaeg));
    }

    private final void zzd(zzahe zzahe, zzaeg zzaeg) {
        I.g(zzahe);
        I.g(zzaeg);
        this.zza.zza(zzahe, (zzafn<zzahh>) new zzaca(this, zzaeg));
    }

    public final void zzb(String str, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaeg);
        this.zza.zza(new zzahb(str), (zzafn<zzahn>) new zzaal(this, zzaeg));
    }

    public final void zzc(String str, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzabt(this, zzaeg));
    }

    public final void zze(String str, zzaeg zzaeg) {
        I.g(zzaeg);
        this.zza.zza(new zzaie(str), (zzafn<zzaih>) new zzabz(this, zzaeg));
    }

    public final void zzc(zzahe zzahe, zzaeg zzaeg) {
        zzd(zzahe, zzaeg);
    }

    public final void zzd(String str, zzaeg zzaeg) {
        I.g(zzaeg);
        this.zza.zza(str, (zzafn<Void>) new zzabx(this, zzaeg));
    }

    public final void zzb(zzahe zzahe, zzaeg zzaeg) {
        I.d(zzahe.zzc());
        I.g(zzaeg);
        this.zza.zza(zzahe, (zzafn<zzahh>) new zzaaw(this, zzaeg));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaeg zzaeg) {
        I.d(str);
        I.d(str2);
        I.g(zzaeg);
        this.zza.zza(new zzaiw(str, str2, str3, str4), (zzafn<zzaiz>) new zzaan(this, zzaeg));
    }

    public static /* synthetic */ void zza(zzaam zzaam, zzaeg zzaeg, zzaie zzaie, zzafk zzafk) {
        I.g(zzaeg);
        I.g(zzaie);
        I.g(zzafk);
        zzaam.zza.zza(zzaie, (zzafn<zzaih>) new zzabb(zzaam, zzaeg, zzafk));
    }

    public static /* synthetic */ void zza(zzaam zzaam, zzaeg zzaeg, zzahn zzahn, zzaid zzaid, zzafk zzafk) {
        I.g(zzaeg);
        I.g(zzahn);
        I.g(zzaid);
        I.g(zzafk);
        zzaam.zza.zza(new zzaha(zzahn.zzc()), (zzafn<zzahd>) new zzaas(zzaam, zzafk, zzaeg, zzahn, zzaid));
    }

    public static /* synthetic */ void zza(zzaam zzaam, zzaeg zzaeg, zzahn zzahn, zzahc zzahc, zzaid zzaid, zzafk zzafk) {
        I.g(zzaeg);
        I.g(zzahn);
        I.g(zzahc);
        I.g(zzaid);
        I.g(zzafk);
        zzaam.zza.zza(zzaid, (zzafn<zzaic>) new zzaar(zzaam, zzaid, zzahc, zzaeg, zzahn, zzafk));
    }

    public final void zza(String str, String str2, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaeg);
        zzaid zzaid = new zzaid();
        zzaid.zze(str);
        zzaid.zzh(str2);
        this.zza.zza(zzaid, (zzafn<zzaic>) new zzacg(this, zzaeg));
    }

    public final void zza(zzahu zzahu, zzaeg zzaeg) {
        I.d(zzahu.zzb());
        I.g(zzaeg);
        this.zza.zza(zzahu, (zzafn<zzahx>) new zzaax(this, zzaeg));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaeg zzaeg) {
        I.d(str);
        I.d(str2);
        I.g(zzaeg);
        this.zza.zza(new zzaie(str, str2, (String) null, str3, str4, (String) null), (zzafn<zzaih>) new zzaao(this, zzaeg));
    }

    public final void zza(String str, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzabv(this, zzaeg));
    }

    private final void zza(String str, zzafn<zzahn> zzafn) {
        I.g(zzafn);
        I.d(str);
        zzahn zzb = zzahn.zzb(str);
        if (zzb.zzg()) {
            zzafn.zza(zzb);
            return;
        }
        this.zza.zza(new zzahb(zzb.zzd()), (zzafn<zzahn>) new zzacf(this, zzafn));
    }

    public final void zza(zzagr zzagr, String str, zzaeg zzaeg) {
        I.g(zzagr);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzabn(this, zzagr, zzaeg));
    }

    public final void zza(zzagt zzagt, zzaeg zzaeg) {
        I.g(zzagt);
        I.g(zzaeg);
        this.zza.zza(zzagt, (zzafn<zzags>) new zzabp(this, zzaeg));
    }

    /* access modifiers changed from: private */
    public final void zza(zzagp zzagp, zzaeg zzaeg) {
        I.g(zzagp);
        I.g(zzaeg);
        this.zza.zza(zzagp, (zzafn<zzago>) new zzaap(this, zzaeg));
    }

    /* access modifiers changed from: private */
    public final void zza(zzahn zzahn, String str, String str2, Boolean bool, G g, zzaeg zzaeg, zzafk zzafk) {
        I.g(zzahn);
        I.g(zzafk);
        I.g(zzaeg);
        this.zza.zza(new zzaha(zzahn.zzc()), (zzafn<zzahd>) new zzaau(this, zzafk, str2, str, bool, g, zzaeg, zzahn));
    }

    public final void zza(zzahg zzahg, zzaeg zzaeg) {
        I.g(zzahg);
        I.g(zzaeg);
        this.zza.zza(zzahg, (zzafn<zzahj>) new zzabu(this, zzaeg));
    }

    public final void zza(zzahl zzahl, zzaeg zzaeg) {
        I.g(zzahl);
        I.g(zzaeg);
        this.zza.zza(zzahl, (zzafn<zzahk>) new zzabr(this, zzaeg));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaeg zzaeg) {
        I.d(str);
        I.d(str2);
        I.d(str3);
        I.g(zzaeg);
        zza(str3, (zzafn<zzahn>) new zzabc(this, str, str2, str4, str5, zzaeg));
    }

    public final void zza(String str, zzait zzait, zzaeg zzaeg) {
        I.d(str);
        I.g(zzait);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzabg(this, zzait, zzaeg));
    }

    public final void zza(String str, zzaiy zzaiy, zzaeg zzaeg) {
        I.d(str);
        I.g(zzaiy);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzabe(this, zzaiy, zzaeg));
    }

    public final void zza(zzahw zzahw, zzaeg zzaeg) {
        this.zza.zza(zzahw, (zzafn<zzahy>) new zzacc(this, zzaeg));
    }

    public final void zza(zzahe zzahe, zzaeg zzaeg) {
        I.d(zzahe.zzd());
        I.g(zzaeg);
        zzd(zzahe, zzaeg);
    }

    public final void zza(zzaib zzaib, zzaeg zzaeg) {
        I.d(zzaib.zzd());
        I.g(zzaeg);
        this.zza.zza(zzaib, (zzafn<zzaia>) new zzaba(this, zzaeg));
    }

    public final void zza(zzait zzait, zzaeg zzaeg) {
        I.g(zzait);
        I.g(zzaeg);
        zzait.zzb(true);
        this.zza.zza(zzait, (zzafn<zzaiv>) new zzabl(this, zzaeg));
    }

    public final void zza(zzaiu zzaiu, zzaeg zzaeg) {
        I.g(zzaiu);
        I.g(zzaeg);
        this.zza.zza(zzaiu, (zzafn<zzaix>) new zzaay(this, zzaeg));
    }

    public final void zza(C0496d dVar, String str, zzaeg zzaeg) {
        I.g(dVar);
        I.g(zzaeg);
        if (dVar.f7643e) {
            zza(dVar.d, (zzafn<zzahn>) new zzaaq(this, dVar, str, zzaeg));
        } else {
            zza(new zzagp(dVar, (String) null, str), zzaeg);
        }
    }

    public final void zza(zzaiy zzaiy, zzaeg zzaeg) {
        I.g(zzaiy);
        I.g(zzaeg);
        this.zza.zza(zzaiy, (zzafn<zzajb>) new zzaaz(this, zzaeg));
    }

    public final void zza(zzaig zzaig, zzaeg zzaeg) {
        I.g(zzaig);
        I.g(zzaeg);
        this.zza.zza(zzaig, (zzafn<zzaij>) new zzabo(this, zzaig, zzaeg));
    }

    public final void zza(zzaii zzaii, zzaeg zzaeg) {
        I.g(zzaii);
        I.g(zzaeg);
        this.zza.zza(zzaii, (zzafn<zzail>) new zzabs(this, zzaeg));
    }

    public final void zza(String str, String str2, String str3, zzaeg zzaeg) {
        I.d(str);
        I.d(str2);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzabj(this, str2, str3, zzaeg));
    }

    public final void zza(String str, C0492C c3, zzaeg zzaeg) {
        I.d(str);
        I.g(c3);
        I.g(zzaeg);
        zza(str, (zzafn<zzahn>) new zzacb(this, c3, zzaeg));
    }
}
