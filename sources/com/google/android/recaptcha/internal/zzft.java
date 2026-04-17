package com.google.android.recaptcha.internal;

import G5.A;
import G5.C;
import G5.F;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import m5.C0849h;
import o5.d;
import p5.a;

public final class zzft implements zzfo {
    private final C zza;
    private final zzgf zzb;
    /* access modifiers changed from: private */
    public final zzhx zzc;
    private final Map zzd;

    public zzft(C c3, zzgf zzgf, zzhx zzhx, Map map) {
        this.zza = c3;
        this.zzb = zzgf;
        this.zzc = zzhx;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzft, zzuf zzuf, zzgd zzgd) {
        zzjh zzb2 = zzjh.zzb();
        int zza2 = zzgd.zza();
        zzgx zzgx = (zzgx) zzft.zzd.get(Integer.valueOf(zzuf.zzf()));
        if (zzgx != null) {
            int zzg = zzuf.zzg();
            zzue[] zzueArr = (zzue[]) zzuf.zzj().toArray(new zzue[0]);
            zzgx.zza(zzg, zzgd, (zzue[]) Arrays.copyOf(zzueArr, zzueArr.length));
            if (zza2 == zzgd.zza()) {
                zzgd.zzg(zzgd.zza() + 1);
            }
            zzb2.zzf();
            long zza3 = zzb2.zza(TimeUnit.MICROSECONDS);
            int i2 = zzbk.zza;
            int zzk = zzuf.zzk();
            if (zzk != 1) {
                zzbk.zza(zzk - 2, zza3);
                return;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        throw new zzce(5, 2, (Throwable) null);
    }

    /* access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgd, d dVar) {
        Object f6 = F.f(new zzfq(zzgd, list, this, (d) null), dVar);
        if (f6 == a.f11033a) {
            return f6;
        }
        return C0849h.f10203c;
    }

    /* access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgd, d dVar) {
        Object f6 = F.f(new zzfr(exc, zzgd, this, (d) null), dVar);
        if (f6 == a.f11033a) {
            return f6;
        }
        return C0849h.f10203c;
    }

    public final void zza(String str) {
        F.q(this.zza, (A) null, new zzfs(new zzgd(this.zzb), this, str, (d) null), 3);
    }
}
