package com.google.android.gms.internal.location;

import Q1.i;
import Q1.j;
import Q1.k;
import Q1.x;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

final class zzbh extends x {
    final /* synthetic */ i zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbh(zzbi zzbi, o oVar, i iVar, String str) {
        super(oVar);
        this.zza = iVar;
    }

    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        return new j(status, (k) null);
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzL(this.zza, this, (String) null);
    }
}
