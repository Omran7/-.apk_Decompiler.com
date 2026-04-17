package com.google.android.gms.common.api.internal;

import G.g;
import android.os.Looper;
import com.google.android.gms.common.internal.I;

/* renamed from: com.google.android.gms.common.api.internal.p  reason: case insensitive filesystem */
public final class C0362p {

    /* renamed from: a  reason: collision with root package name */
    public final g f6108a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f6109b;

    /* renamed from: c  reason: collision with root package name */
    public volatile C0360n f6110c;

    public C0362p(Looper looper, Object obj, String str) {
        this.f6108a = new g(looper);
        I.h(obj, "Listener must not be null");
        this.f6109b = obj;
        I.d(str);
        this.f6110c = new C0360n(obj, str);
    }

    public final void a(C0361o oVar) {
        this.f6108a.execute(new b0(this, oVar));
    }
}
