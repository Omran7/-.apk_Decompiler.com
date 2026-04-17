package com.google.android.recaptcha.internal;

import G5.C;
import G5.F;
import G5.I;
import I1.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m5.C0846e;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzh extends h implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzl, String str, long j6, d dVar) {
        super(2, dVar);
        this.zzb = zzl;
        this.zzc = str;
        this.zzd = j6;
    }

    public final d create(Object obj, d dVar) {
        zzh zzh = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzh.zze = obj;
        return zzh;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        zzen zzen;
        zzen zzen2;
        a aVar = a.f11033a;
        if (this.zza != 0) {
            zzen = (zzen) this.zze;
            b.I0(obj);
        } else {
            b.I0(obj);
            C c3 = (C) this.zze;
            zzek zza2 = this.zzb.zzb;
            if (zza2 != null) {
                zza2.zzc(this.zzc);
                zzen2 = zza2.zzf(31);
            } else {
                zzen2 = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zze2 : this.zzb.zzd()) {
                if (zze2.zzl()) {
                    arrayList.add(F.c(c3, new zzg(zze2, this.zzc, this.zzd, (d) null)));
                }
            }
            I[] iArr = (I[]) arrayList.toArray(new I[0]);
            this.zze = zzen2;
            this.zza = 1;
            obj = F.d((I[]) Arrays.copyOf(iArr, iArr.length), this);
            if (obj == aVar) {
                return aVar;
            }
            zzen = zzen2;
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        for (C0847f fVar : (List) obj) {
            Object obj2 = fVar.f10198a;
            if (!(obj2 instanceof C0846e)) {
                zzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsi = (zzsi) zzf.zzk();
        if (zzen != null) {
            zzen.zza();
        }
        return zzsi;
    }
}
