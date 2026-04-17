package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import java.util.Iterator;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzu extends h implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzsc, zzv zzv, d dVar) {
        super(2, dVar);
        this.zzd = zzsc;
        this.zze = zzv;
    }

    public final d create(Object obj, d dVar) {
        return new zzu(this.zzd, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        zzse zzse;
        Iterator it2;
        a aVar = a.f11033a;
        if (this.zzc != 0) {
            it2 = (Iterator) this.zzb;
            zzse = (zzse) this.zza;
            b.I0(obj);
        } else {
            b.I0(obj);
            if (!this.zzd.zzS()) {
                return new C0847f(b.r(new zzbd(zzbb.zzb, zzba.zzab, (String) null)));
            }
            zzse = this.zzd.zzj();
            if (zzse.zzi().zzd() == 0) {
                return new C0847f(b.r(new zzbd(zzbb.zzb, zzba.zzab, (String) null)));
            }
            this.zze.zzc = zzse.zzi();
            it2 = this.zze.zzb.iterator();
        }
        while (it2.hasNext()) {
            this.zza = zzse;
            this.zzb = it2;
            this.zzc = 1;
            if (((zzy) it2.next()).zzd(zzse, this) == aVar) {
                return aVar;
            }
        }
        return new C0847f(C0849h.f10203c);
    }
}
