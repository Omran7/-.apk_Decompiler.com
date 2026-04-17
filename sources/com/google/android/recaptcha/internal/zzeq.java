package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import java.util.Timer;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzeq extends h implements p {
    final /* synthetic */ zzes zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzes, d dVar) {
        super(2, dVar);
        this.zza = zzes;
    }

    public final d create(Object obj, d dVar) {
        return new zzeq(this.zza, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        b.I0(obj);
        zzes zzes = this.zza;
        synchronized (zzeo.class) {
            try {
                zzei zzb = zzes.zze;
                if (zzb != null && zzb.zzb() == 0) {
                    Timer zzc = zzes.zza;
                    if (zzc != null) {
                        zzc.cancel();
                    }
                    zzes.zza = null;
                }
                zzes.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return C0849h.f10203c;
    }
}
