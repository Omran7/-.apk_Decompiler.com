package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zban  reason: invalid package */
public final /* synthetic */ class zban implements C0366u {
    public final /* synthetic */ zbaq zba;
    public final /* synthetic */ AuthorizationRequest zbb;

    public /* synthetic */ zban(zbaq zbaq, AuthorizationRequest authorizationRequest) {
        this.zba = zbaq;
        this.zbb = authorizationRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbaq zbaq = this.zba;
        AuthorizationRequest authorizationRequest = this.zbb;
        zbap zbap = new zbap(zbaq, (TaskCompletionSource) obj2);
        I.g(authorizationRequest);
        ((zbaa) ((zbw) obj).getService()).zbc(zbap, authorizationRequest);
    }
}
