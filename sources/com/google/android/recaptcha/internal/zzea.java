package com.google.android.recaptcha.internal;

import G5.C0046s;
import G5.r;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.l;

final class zzea extends h implements l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ r zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzec, long j6, r rVar, d dVar) {
        super(1, dVar);
        this.zzc = zzec;
        this.zzd = j6;
        this.zze = rVar;
    }

    public final d create(d dVar) {
        return new zzea(this.zzc, this.zzd, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((d) obj)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        zzbd e6;
        zzen zzen;
        zzen zzen2;
        a aVar = a.f11033a;
        int i2 = this.zzb;
        if (i2 == 0) {
            b.I0(obj);
            zzen zzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzc2 = this.zzc.zza;
                long j6 = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzc2.zzo(j6, this);
                if (zzo != aVar) {
                    Object obj2 = zzo;
                    zzen2 = zzf;
                    obj = obj2;
                }
                return aVar;
            } catch (zzbd e7) {
                zzbd zzbd = e7;
                zzen = zzf;
                e6 = zzbd;
                this.zzc.zzd = e6;
                zzen.zzb(e6);
                throw e6;
            }
        } else if (i2 != 1) {
            zzen = (zzen) this.zza;
            try {
                b.I0(obj);
                zzen.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(((C0046s) this.zze).A(C0849h.f10203c));
            } catch (zzbd e8) {
                e6 = e8;
            }
        } else {
            zzen2 = (zzen) this.zza;
            try {
                b.I0(obj);
            } catch (zzbd e9) {
                e6 = e9;
                zzen = zzen2;
            }
        }
        zzsc zzsc = (zzsc) obj;
        this.zzc.zze = zzsc;
        zzdt zzc3 = this.zzc.zza;
        long j7 = this.zzd;
        this.zza = zzen2;
        this.zzb = 2;
        if (zzc3.zzn(zzsc, j7, this) != aVar) {
            zzen = zzen2;
            zzen.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((C0046s) this.zze).A(C0849h.f10203c));
        }
        return aVar;
    }
}
