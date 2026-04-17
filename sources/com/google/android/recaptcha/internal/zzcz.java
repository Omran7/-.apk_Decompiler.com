package com.google.android.recaptcha.internal;

import I1.b;
import com.google.android.recaptcha.RecaptchaAction;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzcz extends h implements p {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdc, long j6, RecaptchaAction recaptchaAction, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzdc;
        this.zzc = j6;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdc = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j6 = this.zzc;
            zzcn zza2 = zzdc.zzb;
            this.zza = 1;
            obj = zza2.zza(str, recaptchaAction, j6, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new C0847f((String) obj);
    }
}
