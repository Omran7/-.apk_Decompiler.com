package androidx.fragment.app;

import S3.t;
import W0.u;
import androidx.activity.m;
import c.C0327b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.fragment.app.p  reason: case insensitive filesystem */
public final class C0284p extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f5134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f5136c;
    public final /* synthetic */ C0327b d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0286s f5137e;

    public C0284p(C0286s sVar, t tVar, AtomicReference atomicReference, u uVar, C0327b bVar) {
        this.f5137e = sVar;
        this.f5134a = tVar;
        this.f5135b = atomicReference;
        this.f5136c = uVar;
        this.d = bVar;
    }

    public final void a() {
        m mVar;
        StringBuilder sb = new StringBuilder("fragment_");
        C0286s sVar = this.f5137e;
        sb.append(sVar.f5177e);
        sb.append("_rq#");
        sb.append(sVar.f5171Z.getAndIncrement());
        String sb2 = sb.toString();
        C0286s sVar2 = (C0286s) this.f5134a.f2700b;
        C0288u uVar = sVar2.f5148B;
        if (uVar != null) {
            mVar = uVar.f5196t.f4649r;
        } else {
            mVar = sVar2.P().f4649r;
        }
        this.f5135b.set(mVar.d(sb2, sVar, this.f5136c, this.d));
    }
}
