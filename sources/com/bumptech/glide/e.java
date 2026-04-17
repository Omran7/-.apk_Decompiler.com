package com.bumptech.glide;

import B0.q;
import C0.g;
import H3.f;
import S0.b;
import T1.A;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.D;
import com.bumptech.glide.manager.o;
import java.util.List;
import z1.j;

public final class e extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final a f5758k;

    /* renamed from: a  reason: collision with root package name */
    public final g f5759a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5760b;

    /* renamed from: c  reason: collision with root package name */
    public final f f5761c;
    public final D d;

    /* renamed from: e  reason: collision with root package name */
    public final List f5762e;

    /* renamed from: f  reason: collision with root package name */
    public final n.e f5763f;
    public final q g;
    public final A h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5764i = 4;

    /* renamed from: j  reason: collision with root package name */
    public Q0.e f5765j;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.bumptech.glide.a, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.f5724a = b.f2600a;
        f5758k = obj;
    }

    public e(Context context, g gVar, o oVar, f fVar, D d6, n.e eVar, List list, q qVar, A a6) {
        super(context.getApplicationContext());
        this.f5759a = gVar;
        this.f5761c = fVar;
        this.d = d6;
        this.f5762e = list;
        this.f5763f = eVar;
        this.g = qVar;
        this.h = a6;
        this.f5760b = new j((Object) oVar);
    }

    public final h a() {
        return (h) this.f5760b.get();
    }
}
