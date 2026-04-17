package com.google.firebase.storage;

import com.google.android.gms.common.api.Status;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final e f6951a;

    public p(q qVar, e eVar) {
        if (eVar != null) {
            this.f6951a = eVar;
        } else if (qVar.isCanceled()) {
            this.f6951a = e.a(Status.f6006r);
        } else if (qVar.h == 64) {
            this.f6951a = e.a(Status.f6004p);
        } else {
            this.f6951a = null;
        }
    }
}
