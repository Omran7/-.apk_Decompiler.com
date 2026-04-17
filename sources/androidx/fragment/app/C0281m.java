package androidx.fragment.app;

import c.C0328c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.fragment.app.m  reason: case insensitive filesystem */
public final class C0281m extends C0328c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5131a;

    public C0281m(AtomicReference atomicReference) {
        this.f5131a = atomicReference;
    }

    public final void a(Object obj) {
        C0328c cVar = (C0328c) this.f5131a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
