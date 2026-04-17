package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

final class zzo extends zzx {
    final /* synthetic */ boolean zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzo(zzz zzz, o oVar, boolean z3) {
        super(oVar);
        this.zza = z3;
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzI(this.zza);
        setResult(Status.f6002e);
    }
}
