package com.google.android.recaptcha.internal;

import G5.C;
import G5.F;
import I1.b;
import java.util.List;
import m5.C0849h;
import n5.C0875g;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzfq extends h implements p {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgd, List list, zzft zzft, d dVar) {
        super(2, dVar);
        this.zzb = zzgd;
        this.zzc = list;
        this.zzd = zzft;
    }

    public final d create(Object obj, d dVar) {
        zzfq zzfq = new zzfq(this.zzb, this.zzc, this.zzd, dVar);
        zzfq.zze = obj;
        return zzfq;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        C0849h hVar = C0849h.f10203c;
        b.I0(obj);
        if (i2 == 0) {
            C c3 = (C) this.zze;
            while (true) {
                zzgd zzgd = this.zzb;
                if (zzgd.zza() < 0) {
                    break;
                }
                if (zzgd.zza() >= this.zzc.size() || !F.m(c3)) {
                    break;
                }
                zzuf zzuf = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzuf, this.zzb);
                } catch (Exception e6) {
                    zzuf.zzk();
                    new Integer(zzuf.zzg());
                    C0875g.U0(zzuf.zzj(), (String) null, (String) null, (String) null, new zzfp(this.zzd), 31);
                    zzft zzft = this.zzd;
                    zzgd zzgd2 = this.zzb;
                    this.zza = 1;
                    if (zzft.zzh(e6, zzgd2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return hVar;
    }
}
