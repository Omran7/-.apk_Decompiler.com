package com.google.android.gms.internal.p002firebaseauthapi;

import C1.a;
import R2.i;
import android.content.Context;
import com.google.android.gms.common.internal.I;
import e3.C0492C;
import e3.q;
import e3.s;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaef  reason: invalid package */
public final class zzaef {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaam zzb;
    private final zzafu zzc;

    public zzaef(i iVar, ScheduledExecutorService scheduledExecutorService) {
        I.g(iVar);
        iVar.b();
        Context context = iVar.f2490a;
        I.g(context);
        this.zzb = new zzaam(new zzaet(iVar, zzaeu.zza()));
        this.zzc = new zzafu(context, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzaed zzaed) {
        I.d(str);
        I.g(zzaed);
        this.zzb.zza(str, str2, new zzaeg(zzaed, zza));
    }

    public final void zzb(String str, String str2, zzaed zzaed) {
        I.d(str);
        I.d(str2);
        I.g(zzaed);
        this.zzb.zzb(str, str2, new zzaeg(zzaed, zza));
    }

    public final void zzc(String str, String str2, zzaed zzaed) {
        I.d(str);
        I.d(str2);
        I.g(zzaed);
        this.zzb.zzc(str, str2, new zzaeg(zzaed, zza));
    }

    public final void zzd(String str, String str2, zzaed zzaed) {
        I.d(str);
        I.g(zzaed);
        this.zzb.zzd(str, str2, new zzaeg(zzaed, zza));
    }

    public final void zze(String str, String str2, zzaed zzaed) {
        I.d(str);
        this.zzb.zze(str, str2, new zzaeg(zzaed, zza));
    }

    public final void zzf(String str, String str2, zzaed zzaed) {
        I.d(str);
        I.d(str2);
        I.g(zzaed);
        this.zzb.zzf(str, str2, new zzaeg(zzaed, zza));
    }

    public final void zze(String str, zzaed zzaed) {
        I.d(str);
        I.g(zzaed);
        this.zzb.zzf(str, new zzaeg(zzaed, zza));
    }

    public final void zza(zzahu zzahu, zzaed zzaed) {
        I.g(zzahu);
        I.d(zzahu.zzb());
        I.g(zzaed);
        this.zzb.zza(zzahu, new zzaeg(zzaed, zza));
    }

    public final void zzd(String str, zzaed zzaed) {
        I.g(zzaed);
        this.zzb.zze(str, new zzaeg(zzaed, zza));
    }

    public final void zzb(String str, zzaed zzaed) {
        I.d(str);
        I.g(zzaed);
        this.zzb.zzb(str, new zzaeg(zzaed, zza));
    }

    public final void zzc(String str, zzaed zzaed) {
        I.d(str);
        I.g(zzaed);
        this.zzb.zzc(str, new zzaeg(zzaed, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaed zzaed) {
        I.d(str);
        I.d(str2);
        I.g(zzaed);
        this.zzb.zza(str, str2, str3, str4, new zzaeg(zzaed, zza));
    }

    public final void zzb(zzahe zzahe, zzaed zzaed) {
        I.g(zzahe);
        I.d(zzahe.zzc());
        I.g(zzaed);
        this.zzb.zzb(zzahe, new zzaeg(zzaed, zza));
    }

    public final void zzc(zzahe zzahe, zzaed zzaed) {
        I.g(zzahe);
        this.zzb.zzc(zzahe, new zzaeg(zzaed, zza));
    }

    public final void zza(String str, zzaed zzaed) {
        I.d(str);
        I.g(zzaed);
        this.zzb.zza(str, new zzaeg(zzaed, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaed zzaed) {
        I.d(str);
        I.d(str2);
        I.g(zzaed);
        this.zzb.zzb(str, str2, str3, str4, new zzaeg(zzaed, zza));
    }

    public final void zza(q qVar, String str, String str2, String str3, zzaed zzaed) {
        I.g(qVar);
        throw null;
    }

    public final void zza(String str, q qVar, String str2, zzaed zzaed) {
        I.d(str);
        I.g(qVar);
        throw null;
    }

    public final void zza(zzahg zzahg, zzaed zzaed) {
        I.g(zzahg);
        this.zzb.zza(zzahg, new zzaeg(zzaed, zza));
    }

    public final void zza(zzahl zzahl, zzaed zzaed) {
        I.g(zzahl);
        this.zzb.zza(zzahl, new zzaeg(zzaed, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaed zzaed) {
        I.d(str);
        I.d(str2);
        I.d(str3);
        I.g(zzaed);
        this.zzb.zza(str, str2, str3, str4, str5, new zzaeg(zzaed, zza));
    }

    public final void zza(String str, zzait zzait, zzaed zzaed) {
        I.d(str);
        I.g(zzait);
        I.g(zzaed);
        this.zzb.zza(str, zzait, new zzaeg(zzaed, zza));
    }

    public final void zza(zzahr zzahr, zzaed zzaed) {
        I.g(zzaed);
        I.g(zzahr);
        String zzb2 = zzahr.zzb();
        I.d(zzb2);
        this.zzb.zza(zzb2, zzahr.zza(), new zzaeg(zzaed, zza));
    }

    public final void zza(zzahw zzahw, zzaed zzaed) {
        I.g(zzahw);
        this.zzb.zza(zzahw, new zzaeg(zzaed, zza));
    }

    public final void zza(zzahe zzahe, zzaed zzaed) {
        I.g(zzahe);
        I.d(zzahe.zzd());
        I.g(zzaed);
        this.zzb.zza(zzahe, new zzaeg(zzaed, zza));
    }

    public final void zza(zzaib zzaib, zzaed zzaed) {
        I.g(zzaed);
        I.g(zzaib);
        String zzd = zzaib.zzd();
        zzaeg zzaeg = new zzaeg(zzaed, zza);
        if (this.zzc.zzc(zzd)) {
            if (zzaib.zze()) {
                this.zzc.zzb(zzd);
            } else {
                this.zzc.zzb(zzaeg, zzd);
                return;
            }
        }
        long zzb2 = zzaib.zzb();
        boolean zzf = zzaib.zzf();
        if (zza(zzb2, zzf)) {
            zzaib.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzaeg, zzb2, zzf);
        this.zzb.zza(zzaib, this.zzc.zza(zzaeg, zzd));
    }

    public final void zza(zzaif zzaif, zzaed zzaed) {
        I.g(zzaif);
        I.g(zzaed);
        this.zzb.zzd(zzaif.zza(), new zzaeg(zzaed, zza));
    }

    public final void zza(zzait zzait, zzaed zzaed) {
        I.g(zzait);
        I.g(zzaed);
        this.zzb.zza(zzait, new zzaeg(zzaed, zza));
    }

    public final void zza(zzaiu zzaiu, zzaed zzaed) {
        I.g(zzaiu);
        I.g(zzaed);
        this.zzb.zza(zzaiu, new zzaeg(zzaed, zza));
    }

    public final void zza(zzagp zzagp, zzaed zzaed) {
        I.g(zzaed);
        I.g(zzagp.zzb());
        this.zzb.zza(zzagp.zzb(), zzagp.zzc(), new zzaeg(zzaed, zza));
    }

    public final void zza(zzaai zzaai, zzaed zzaed) {
        I.g(zzaed);
        I.g(zzaai);
        s zza2 = zzaai.zza();
        I.g(zza2);
        this.zzb.zza(zzafo.zza(zza2), new zzaeg(zzaed, zza));
    }

    public final void zza(String str, String str2, String str3, long j6, boolean z3, boolean z4, String str4, String str5, String str6, boolean z5, zzaed zzaed) {
        String str7 = str2;
        String str8 = str;
        I.e(str, "idToken should not be empty.");
        I.g(zzaed);
        zzaeg zzaeg = new zzaeg(zzaed, zza);
        if (this.zzc.zzc(str2)) {
            if (z3) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaeg, str2);
                return;
            }
        }
        zzaik zza2 = zzaik.zza(str, str2, str3, str4, str5, str6, (String) null);
        long j7 = j6;
        if (zza(j6, z5)) {
            zza2.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaeg, j6, z5);
        this.zzb.zza((zzaig) zza2, this.zzc.zza(zzaeg, str2));
    }

    public final void zza(zzaah zzaah, zzaed zzaed) {
        I.g(zzaah);
        I.g(zzaed);
        String str = zzaah.zzb().d;
        zzaeg zzaeg = new zzaeg(zzaed, zza);
        if (this.zzc.zzc(str)) {
            if (zzaah.zzh()) {
                this.zzc.zzb(str);
            } else {
                this.zzc.zzb(zzaeg, str);
                return;
            }
        }
        long zza2 = zzaah.zza();
        boolean zzi = zzaah.zzi();
        zzaii zza3 = zzaii.zza(zzaah.zze(), zzaah.zzb().f7658a, zzaah.zzb().d, zzaah.zzd(), zzaah.zzg(), zzaah.zzf(), zzaah.zzc());
        if (zza(zza2, zzi)) {
            zza3.zza(new zzage(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzaeg, zza2, zzi);
        this.zzb.zza(zza3, this.zzc.zza(zzaeg, str));
    }

    public final void zza(zzaim zzaim, zzaed zzaed) {
        I.g(zzaed);
        this.zzb.zza((zzaig) zzaim, new zzaeg(zzaed, zza));
    }

    public final void zza(String str, String str2, String str3, zzaed zzaed) {
        I.e(str, "cachedTokenState should not be empty.");
        I.e(str2, "uid should not be empty.");
        I.g(zzaed);
        this.zzb.zza(str, str2, str3, new zzaeg(zzaed, zza));
    }

    public final void zza(String str, C0492C c3, zzaed zzaed) {
        I.d(str);
        I.g(c3);
        I.g(zzaed);
        this.zzb.zza(str, c3, new zzaeg(zzaed, zza));
    }

    private static boolean zza(long j6, boolean z3) {
        if (j6 > 0 && z3) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
