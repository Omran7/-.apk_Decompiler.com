package com.mtma.criminal.city.utils;

import J.a;

public final /* synthetic */ class X implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f7382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f7383b;

    public /* synthetic */ X(a aVar, boolean z3) {
        this.f7382a = aVar;
        this.f7383b = z3;
    }

    public final void run() {
        this.f7382a.accept(Boolean.valueOf(this.f7383b));
    }
}
