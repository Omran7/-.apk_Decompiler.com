package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0350d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import p1.C0910d;
import p1.C0912f;

final class zzac extends C0350d {
    final /* synthetic */ boolean zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzal, i iVar, o oVar, boolean z3) {
        super(iVar, oVar);
        this.zza = z3;
    }

    public final s createFailedResult(Status status) {
        return new zzaj(status);
    }

    public final void doExecute(b bVar) {
        boolean z3 = this.zza;
        C0910d dVar = (C0910d) ((C0912f) ((zzam) bVar).getService());
        Parcel zza2 = dVar.zza();
        zzc.zzc(zza2, z3);
        dVar.zzc(1, zza2);
        setResult(new zzaj(Status.f6002e));
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((s) obj);
    }
}
