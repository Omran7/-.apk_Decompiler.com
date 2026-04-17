package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.k;
import m5.C0849h;
import x5.p;

final class zzgr extends k implements p {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgd, String str, int i2) {
        super(2);
        this.zza = zzgd;
        this.zzb = str;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i2 = this.zzc;
        if (i2 != -1) {
            this.zza.zzc().zze(i2, objArr);
        }
        return C0849h.f10203c;
    }
}
