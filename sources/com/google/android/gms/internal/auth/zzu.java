package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.tasks.TaskCompletionSource;
import o1.C0892b;

public final /* synthetic */ class zzu implements C0366u {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ C0892b zzb;

    public /* synthetic */ zzu(zzab zzab, C0892b bVar) {
        this.zza = zzab;
        this.zzb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzab = this.zza;
        C0892b bVar = this.zzb;
        ((zzp) ((zzi) obj).getService()).zze(new zzz(zzab, (TaskCompletionSource) obj2), bVar);
    }
}
