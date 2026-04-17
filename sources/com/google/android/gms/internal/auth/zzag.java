package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0350d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import p1.C0910d;
import p1.C0912f;

final class zzag extends C0350d {
    final /* synthetic */ Account zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzal, i iVar, o oVar, Account account) {
        super(iVar, oVar);
        this.zza = account;
    }

    public final s createFailedResult(Status status) {
        return new zzak(status);
    }

    public final void doExecute(b bVar) {
        zzaf zzaf = new zzaf(this);
        Account account = this.zza;
        C0910d dVar = (C0910d) ((C0912f) ((zzam) bVar).getService());
        Parcel zza2 = dVar.zza();
        zzc.zze(zza2, zzaf);
        zzc.zzd(zza2, account);
        dVar.zzc(3, zza2);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((s) obj);
    }
}
