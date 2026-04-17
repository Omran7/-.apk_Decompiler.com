package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.C0366u;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbar  reason: invalid package */
public final /* synthetic */ class zbar implements C0366u {
    public final /* synthetic */ zbaw zba;
    public final /* synthetic */ SaveAccountLinkingTokenRequest zbb;

    public /* synthetic */ zbar(zbaw zbaw, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.zba = zbaw;
        this.zbb = saveAccountLinkingTokenRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbaw zbaw = this.zba;
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.zbb;
        zbau zbau = new zbau(zbaw, (TaskCompletionSource) obj2);
        I.g(saveAccountLinkingTokenRequest);
        ((zbad) ((zbx) obj).getService()).zbc(zbau, saveAccountLinkingTokenRequest);
    }
}
