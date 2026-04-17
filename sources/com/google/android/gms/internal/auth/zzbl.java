package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.tasks.TaskCompletionSource;
import v1.C1040a;

public final /* synthetic */ class zzbl implements C0366u {
    public final /* synthetic */ zzbo zza;
    public final /* synthetic */ C1040a zzb;

    public /* synthetic */ zzbl(zzbo zzbo, C1040a aVar) {
        this.zza = zzbo;
        this.zzb = aVar;
    }

    public final void accept(Object obj, Object obj2) {
        zzbo zzbo = this.zza;
        C1040a aVar = this.zzb;
        ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzbo, (TaskCompletionSource) obj2), aVar);
    }
}
