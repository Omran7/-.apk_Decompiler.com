package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzfh extends h implements p {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfj, zzbr zzbr, zzsp zzsp, d dVar) {
        super(2, dVar);
        this.zza = zzfj;
        this.zzb = zzbr;
        this.zzc = zzsp;
    }

    public final d create(Object obj, d dVar) {
        return new zzfh(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        zzew zzew = null;
        try {
            zzew = zzfj.zza(this.zza).zza(this.zzb.zzd());
            zzew.zzc();
            zzew.zze(this.zzc.zzd());
            zzsr zzsr = (zzsr) zzew.zza(zzsr.zzi());
            zzew.zzd();
            return zzsr;
        } catch (zzbd e6) {
            throw e6;
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzc, zzba.zzF, e7.getMessage());
        } catch (Throwable th) {
            if (zzew != null) {
                zzew.zzd();
            }
            throw th;
        }
    }
}
