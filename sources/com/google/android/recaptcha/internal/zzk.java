package com.google.android.recaptcha.internal;

import G5.C;
import G5.F;
import G5.I;
import I1.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m5.C0846e;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzk extends h implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzl, zzek zzek, long j6, zzsc zzsc, d dVar) {
        super(2, dVar);
        this.zzb = zzl;
        this.zzc = zzek;
        this.zzd = j6;
        this.zze = zzsc;
    }

    public final d create(Object obj, d dVar) {
        zzk zzk = new zzk(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzk.zzf = obj;
        return zzk;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        zzen zzen;
        Object obj2;
        a aVar = a.f11033a;
        if (this.zza != 0) {
            zzen = (zzen) this.zzf;
            b.I0(obj);
        } else {
            b.I0(obj);
            C c3 = (C) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzek = this.zzc;
            zzek.zzc(zzek.zzd());
            zzen zzf2 = zzek.zzf(30);
            ArrayList arrayList = new ArrayList();
            for (zze zzj : this.zzb.zzd()) {
                arrayList.add(F.c(c3, new zzj(zzj, this.zzd, this.zze, (d) null)));
            }
            I[] iArr = (I[]) arrayList.toArray(new I[0]);
            this.zzf = zzf2;
            this.zza = 1;
            obj = F.d((I[]) Arrays.copyOf(iArr, iArr.length), this);
            if (obj == aVar) {
                return aVar;
            }
            zzen = zzf2;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!(((C0847f) it2.next()).f10198a instanceof C0846e)) {
                        zzen.zza();
                        obj2 = C0849h.f10203c;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        zzbd zzbd = new zzbd(zzbb.zzb, zzba.zzY, (String) null);
        zzen.zzb(zzbd);
        obj2 = b.r(zzbd);
        return new C0847f(obj2);
    }
}
