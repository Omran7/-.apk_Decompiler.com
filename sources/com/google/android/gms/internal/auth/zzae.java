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

final class zzae extends C0350d {
    final /* synthetic */ String zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzal, i iVar, o oVar, String str) {
        super(iVar, oVar);
        this.zza = str;
    }

    public final /* synthetic */ s createFailedResult(Status status) {
        return new zzai(status, (Account) null);
    }

    public final void doExecute(b bVar) {
        zzad zzad = new zzad(this);
        String str = this.zza;
        C0910d dVar = (C0910d) ((C0912f) ((zzam) bVar).getService());
        Parcel zza2 = dVar.zza();
        zzc.zze(zza2, zzad);
        zza2.writeString(str);
        dVar.zzc(2, zza2);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((s) obj);
    }
}
