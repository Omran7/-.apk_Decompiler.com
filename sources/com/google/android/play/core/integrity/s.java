package com.google.android.play.core.integrity;

import D0.e;
import android.content.Context;
import y2.g;
import y2.i;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final s f6726a = this;

    /* renamed from: b  reason: collision with root package name */
    private final i f6727b;

    /* renamed from: c  reason: collision with root package name */
    private final i f6728c;
    private final i d;

    /* renamed from: e  reason: collision with root package name */
    private final i f6729e;

    /* renamed from: f  reason: collision with root package name */
    private final i f6730f;

    public s(Context context, r rVar) {
        if (context != null) {
            e eVar = new e(context, 14);
            this.f6727b = eVar;
            g b6 = g.b(ac.f6628a);
            this.f6728c = b6;
            au auVar = new au(eVar, l.f6719a);
            this.d = auVar;
            g b7 = g.b(new al(eVar, b6, auVar, l.f6719a));
            this.f6729e = b7;
            this.f6730f = g.b(new ab(b7));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f6730f.a();
    }
}
