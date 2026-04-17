package com.google.android.recaptcha.internal;

import G5.C;
import G5.C0046s;
import G5.r;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzeb extends h implements p {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ r zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzec, r rVar, long j6, d dVar) {
        super(2, dVar);
        this.zzb = zzec;
        this.zzc = rVar;
        this.zzd = j6;
    }

    public final d create(Object obj, d dVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        if (this.zza != 0) {
            try {
                b.I0(obj);
            } catch (zzbd e6) {
                this.zzb.zzf = zzcm.zzd;
                ((C0046s) this.zzc).L(e6);
            }
        } else {
            b.I0(obj);
            zzbq zzbq = zzbq.zza;
            zzdz zzdz = new zzdz(this.zzb);
            zzea zzea = new zzea(this.zzb, this.zzd, this.zzc, (d) null);
            this.zza = 1;
            obj = zzbq.zza(zzdz, 100, 1000, 2.0d, zzea, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ((Boolean) obj).getClass();
        return C0849h.f10203c;
    }
}
