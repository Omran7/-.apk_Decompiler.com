package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzfb extends h implements p {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzff, String str, zzto zzto, d dVar) {
        super(2, dVar);
        this.zza = zzff;
        this.zzb = str;
        this.zzc = zzto;
    }

    public final d create(Object obj, d dVar) {
        return new zzfb(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        try {
            if (zzff.zzb(this.zza).zzb(this.zzb)) {
                return this.zza.zzg().zza(this.zzb, this.zzc);
            }
            throw new zzbd(zzbb.zzc, zzba.zzQ, (String) null);
        } catch (zzbd e6) {
            throw e6;
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e7.getMessage());
        }
    }
}
