package com.google.android.gms.common.api;

import z1.d;

public final class w extends UnsupportedOperationException {

    /* renamed from: a  reason: collision with root package name */
    public final d f6123a;

    public w(d dVar) {
        this.f6123a = dVar;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f6123a));
    }
}
