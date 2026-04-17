package com.google.android.recaptcha.internal;

import G5.C;
import G5.C0046s;
import G5.F;
import G5.r;
import I1.b;
import kotlin.jvm.internal.m;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzam extends h implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzan, zzen zzen, d dVar) {
        super(2, dVar);
        this.zzc = zzan;
        this.zzd = zzen;
    }

    public final d create(Object obj, d dVar) {
        return new zzam(this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [kotlin.jvm.internal.m, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Exception e6;
        m mVar;
        Object obj2 = a.f11033a;
        if (this.zzb != 0) {
            mVar = (m) this.zza;
            try {
                b.I0(obj);
            } catch (Exception e7) {
                e6 = e7;
            }
        } else {
            b.I0(obj);
            ? obj3 = new Object();
            try {
                zzal zzal = new zzal(this.zzc, this.zzd, obj3, (d) null);
                this.zza = obj3;
                this.zzb = 1;
                if (F.x(60000, zzal, this) == obj2) {
                    return obj2;
                }
            } catch (Exception e8) {
                Exception exc = e8;
                mVar = obj3;
                e6 = exc;
                r zzf = this.zzc.zzf();
                Throwable th = (Throwable) mVar.f9656a;
                if (th == null) {
                    th = e6;
                }
                ((C0046s) zzf).L(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e6.getMessage()));
                return C0849h.f10203c;
            }
        }
        return C0849h.f10203c;
    }
}
