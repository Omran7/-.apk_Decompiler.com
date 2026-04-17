package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzq implements C0366u {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzq(zzab zzab, String str) {
        this.zza = zzab;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzab = this.zza;
        ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzab, (TaskCompletionSource) obj2), this.zzb);
    }
}
