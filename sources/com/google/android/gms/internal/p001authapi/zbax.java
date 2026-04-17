package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import t1.C0991f;

/* renamed from: com.google.android.gms.internal.auth-api.zbax  reason: invalid package */
public final /* synthetic */ class zbax implements C0366u {
    public final /* synthetic */ zbbg zba;
    public final /* synthetic */ C0991f zbb;

    public /* synthetic */ zbax(zbbg zbbg, C0991f fVar) {
        this.zba = zbbg;
        this.zbb = fVar;
    }

    public final void accept(Object obj, Object obj2) {
        zbbg zbbg = this.zba;
        C0991f fVar = this.zbb;
        zbbc zbbc = new zbbc(zbbg, (TaskCompletionSource) obj2);
        I.g(fVar);
        ((zbam) ((zbbh) obj).getService()).zbc(zbbc, fVar);
    }
}
