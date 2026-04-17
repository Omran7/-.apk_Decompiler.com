package com.google.android.play.core.integrity;

import D0.e;
import android.content.Context;
import y2.g;
import y2.i;

final class w implements aw {

    /* renamed from: a  reason: collision with root package name */
    private final w f6732a = this;

    /* renamed from: b  reason: collision with root package name */
    private final i f6733b;

    /* renamed from: c  reason: collision with root package name */
    private final i f6734c;
    private final i d;

    /* renamed from: e  reason: collision with root package name */
    private final i f6735e;

    /* renamed from: f  reason: collision with root package name */
    private final i f6736f;
    private final i g;

    public w(Context context, v vVar) {
        if (context != null) {
            e eVar = new e(context, 14);
            this.f6733b = eVar;
            g b6 = g.b(bb.f6676a);
            this.f6734c = b6;
            au auVar = new au(eVar, n.f6724a);
            this.d = auVar;
            g b7 = g.b(new bp(eVar, b6, auVar, n.f6724a));
            this.f6735e = b7;
            g b8 = g.b(new bu(b7));
            this.f6736f = b8;
            this.g = g.b(new ba(b7, b8));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }
}
