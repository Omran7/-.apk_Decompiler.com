package com.google.android.recaptcha.internal;

import G5.C;
import I1.b;
import android.os.Build;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;
import z1.f;

final class zzdh extends h implements p {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdt, d dVar) {
        super(2, dVar);
        this.zzb = zzdt;
    }

    public final d create(Object obj, d dVar) {
        return new zzdh(this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            int zza2 = new zzbs(f.f12811b).zza(this.zzb.zzr());
            zzdt zzdt = this.zzb;
            String zzp = zzdt.zza;
            String packageName = zzdt.zzr().getPackageName();
            String zzd = this.zzb.zzb.zzd();
            zzbf zzc = this.zzb.zzt();
            int i5 = Build.VERSION.SDK_INT;
            String zza3 = zzc.zza();
            zztn zzf = zzto.zzf();
            zzf.zzt(zzp);
            zzf.zzq(packageName);
            zzf.zzu(zza2);
            zzf.zzr("18.6.1");
            zzf.zzs(zzd);
            zzf.zzf(String.valueOf(i5));
            zzf.zze(zza3);
            zzdt zzdt2 = this.zzb;
            zzff zzg = zzdt.zzg(zzdt2);
            String zzb2 = zzdt.zzd(zzdt2).zzb();
            this.zza = 1;
            obj = zzg.zzc(zzb2, (zzto) zzf.zzk(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
