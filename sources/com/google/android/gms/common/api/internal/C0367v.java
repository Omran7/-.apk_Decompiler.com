package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.v  reason: case insensitive filesystem */
public final class C0367v extends C0355i {

    /* renamed from: a  reason: collision with root package name */
    public final C0351e f6111a;

    public C0367v(C0351e eVar) {
        this.f6111a = eVar;
    }

    public final void onResult(Status status) {
        this.f6111a.setResult(status);
    }
}
