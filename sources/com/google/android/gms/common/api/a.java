package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0380i;

public abstract class a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, C0380i iVar, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, iVar, obj, (C0353g) mVar, (r) nVar);
    }

    public g buildClient(Context context, Looper looper, C0380i iVar, Object obj, C0353g gVar, r rVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
