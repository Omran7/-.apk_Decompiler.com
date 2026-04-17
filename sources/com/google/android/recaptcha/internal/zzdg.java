package com.google.android.recaptcha.internal;

import G5.C;
import G5.E0;
import G5.F;
import I1.b;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzdg extends h implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdt, String str, long j6, zzsp zzsp, d dVar) {
        super(2, dVar);
        this.zzc = zzdt;
        this.zzd = str;
        this.zze = j6;
        this.zzf = zzsp;
    }

    public final d create(Object obj, d dVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        E0 e6;
        zzen zzen;
        zzbd e7;
        Exception e8;
        a aVar = a.f11033a;
        if (this.zzb != 0) {
            zzen = (zzen) this.zza;
            try {
                b.I0(obj);
            } catch (E0 e9) {
                e6 = e9;
            } catch (zzbd e10) {
                e7 = e10;
                zzbd zzb2 = this.zzc.zzs(e7, e7);
                zzen.zzb(zzb2);
                throw zzb2;
            } catch (Exception e11) {
                e8 = e11;
                zzbd zzb3 = this.zzc.zzs(e8, new zzbd(zzbb.zzc, zzba.zzZ, e8.getMessage()));
                zzen.zzb(zzb3);
                throw zzb3;
            }
        } else {
            b.I0(obj);
            zzen zzf2 = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j6 = this.zze;
                zzdf zzdf = new zzdf(this.zzc, this.zzf, zzf2, (d) null);
                this.zza = zzf2;
                this.zzb = 1;
                Object x6 = F.x(j6, zzdf, this);
                if (x6 == aVar) {
                    return aVar;
                }
                zzen = zzf2;
                obj = x6;
            } catch (E0 e12) {
                E0 e02 = e12;
                zzen = zzf2;
                e6 = e02;
                zzbd zzb4 = this.zzc.zzs(e6, new zzbd(zzbb.zzc, zzba.zzb, e6.getMessage()));
                zzen.zzb(zzb4);
                throw zzb4;
            } catch (zzbd e13) {
                zzbd zzbd = e13;
                zzen = zzf2;
                e7 = zzbd;
                zzbd zzb22 = this.zzc.zzs(e7, e7);
                zzen.zzb(zzb22);
                throw zzb22;
            } catch (Exception e14) {
                Exception exc = e14;
                zzen = zzf2;
                e8 = exc;
                zzbd zzb32 = this.zzc.zzs(e8, new zzbd(zzbb.zzc, zzba.zzZ, e8.getMessage()));
                zzen.zzb(zzb32);
                throw zzb32;
            }
        }
        return (zzsr) obj;
    }
}
