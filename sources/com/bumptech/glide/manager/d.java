package com.bumptech.glide.manager;

import B2.a;
import U0.o;
import android.view.View;
import android.view.ViewTreeObserver;

public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f5829a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f5830b;

    public d(e eVar, View view) {
        this.f5830b = eVar;
        this.f5829a = view;
    }

    public final void onDraw() {
        o.f().post(new a(this, this, 23, false));
    }
}
