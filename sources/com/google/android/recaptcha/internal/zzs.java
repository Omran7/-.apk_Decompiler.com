package com.google.android.recaptcha.internal;

import G5.A;
import G5.C;
import G5.C0034h0;
import G5.F;
import I1.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

final class zzs extends h implements p {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzv, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzv;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        zzs zzs = new zzs(this.zzb, this.zzc, dVar);
        zzs.zzd = obj;
        return zzs;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.f11033a;
        int i2 = this.zza;
        b.I0(obj);
        if (i2 == 0) {
            C c3 = (C) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzv = this.zzb;
            zzv.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List zzn = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object next : zzn) {
                if (((zzy) next).zzf()) {
                    arrayList3.add(next);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(F.q(c3, (A) null, new zzr((zzy) it2.next(), this.zzc, arrayList, (d) null), 3));
            }
            C0034h0[] h0VarArr = (C0034h0[]) arrayList2.toArray(new C0034h0[0]);
            this.zza = 1;
            if (F.p((C0034h0[]) Arrays.copyOf(h0VarArr, h0VarArr.length), this) == aVar) {
                return aVar;
            }
        }
        return new C0847f(this.zzb.zzq(this.zzc));
    }
}
