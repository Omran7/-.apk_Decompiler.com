package com.google.android.gms.common.internal;

import z1.C1132b;

public final class J extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final C1132b f6142a;

    public J(C1132b bVar) {
        boolean z3;
        if (bVar.f12801b == 0 || bVar.f12802c == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        I.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", z3);
        this.f6142a = bVar;
    }
}
