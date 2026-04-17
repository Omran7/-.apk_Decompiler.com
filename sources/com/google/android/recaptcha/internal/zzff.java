package com.google.android.recaptcha.internal;

import F5.i;
import G5.F;
import com.bumptech.glide.d;
import m5.C0844c;
import m5.C0848g;

public final class zzff {
    private final C0844c zza = d.N0(zzfc.zza);
    private final C0844c zzb = d.N0(zzfd.zza);
    private final C0844c zzc = d.N0(zzfe.zza);

    public zzff() {
        int i2 = zzav.zza;
    }

    public static final /* synthetic */ zzfk zzb(zzff zzff) {
        return (zzfk) ((C0848g) zzff.zza).a();
    }

    public static /* synthetic */ Object zze(zzff zzff, zzsc zzsc, zzek zzek, o5.d dVar) {
        zzen zzf;
        try {
            String zzl = zzsc.zzl();
            String zzM = zzsc.zzM();
            zzaq zzf2 = zzff.zzf();
            String str = null;
            if (zzf2 != null && zzf2.zzd(zzM)) {
                zzen zzf3 = zzek.zzf(25);
                try {
                    String zza2 = zzff.zzf().zza(zzM);
                    if (zza2 != null) {
                        zzf3.zza();
                        str = zza2;
                    }
                } catch (Exception e6) {
                    zzf3.zzb(new zzbd(zzbb.zzk, zzba.zzR, e6.getMessage()));
                }
                zzf3.zzb(new zzbd(zzbb.zzk, zzba.zzS, (String) null));
            }
            if (str == null) {
                zzaq zzf4 = zzff.zzf();
                if (zzf4 != null) {
                    zzf4.zzb();
                }
                zzf = zzek.zzf(23);
                str = zzff.zzg().zzb(zzl);
                zzf.zza();
                zzen zzf5 = zzek.zzf(24);
                try {
                    zzaq zzf6 = zzff.zzf();
                    if (zzf6 != null) {
                        zzf6.zzc(zzM, str);
                    }
                    zzf5.zza();
                } catch (Exception e7) {
                    zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e7.getMessage()));
                }
            }
            return i.V0(zzsc.zzk(), "JAVASCRIPT_TAG", str);
        } catch (zzbd e8) {
            zzf.zzb(e8);
            throw e8;
        } catch (Exception e9) {
            if (e9 instanceof zzbd) {
                throw e9;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e9.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) ((C0848g) this.zzb).a();
    }

    /* access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) ((C0848g) this.zzc).a();
    }

    public final Object zzc(String str, zzto zzto, o5.d dVar) {
        return F.f(new zzfb(this, str, zzto, (o5.d) null), dVar);
    }

    public final Object zzd(zzsc zzsc, zzek zzek, o5.d dVar) {
        return zze(this, zzsc, zzek, dVar);
    }
}
