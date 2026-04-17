package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import t1.C0995j;

/* renamed from: com.google.android.gms.internal.auth-api.zbay  reason: invalid package */
public final /* synthetic */ class zbay implements C0366u {
    public final /* synthetic */ zbbg zba;
    public final /* synthetic */ C0995j zbb;

    public /* synthetic */ zbay(zbbg zbbg, C0995j jVar) {
        this.zba = zbbg;
        this.zbb = jVar;
    }

    public final void accept(Object obj, Object obj2) {
        zbbg zbbg = this.zba;
        C0995j jVar = this.zbb;
        zbbe zbbe = new zbbe(zbbg, (TaskCompletionSource) obj2);
        I.g(jVar);
        ((zbam) ((zbbh) obj).getService()).zbe(zbbe, jVar);
    }
}
