package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

public final class x extends BasePendingResult {

    /* renamed from: a  reason: collision with root package name */
    public final Status f6124a;

    public x(Status status) {
        super((o) null);
        this.f6124a = status;
    }

    public final s createFailedResult(Status status) {
        return this.f6124a;
    }
}
