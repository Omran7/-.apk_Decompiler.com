package com.google.android.recaptcha.internal;

import G3.c;
import G5.C0024c0;
import G5.C0034h0;
import G5.C0036i0;
import G5.C0043o;
import G5.C0045q;
import G5.C0046s;
import G5.C0048u;
import G5.I;
import G5.P;
import G5.p0;
import G5.r;
import G5.s0;
import G5.t0;
import G5.u0;
import G5.v0;
import R2.b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import o5.d;
import o5.g;
import o5.h;
import o5.i;
import p5.a;
import s2.e;
import x5.l;
import x5.p;

public final class zzbw implements I {
    private final /* synthetic */ r zza;

    public zzbw(r rVar) {
        this.zza = rVar;
    }

    public final C0043o attachChild(C0045q qVar) {
        return this.zza.attachChild(qVar);
    }

    public final Object await(d dVar) {
        Object h = ((C0046s) this.zza).h(dVar);
        a aVar = a.f11033a;
        return h;
    }

    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    public final Object fold(Object obj, p pVar) {
        v0 v0Var = (v0) this.zza;
        v0Var.getClass();
        j.e(pVar, "operation");
        return pVar.invoke(obj, v0Var);
    }

    public final g get(h hVar) {
        v0 v0Var = (v0) this.zza;
        v0Var.getClass();
        return b.B(v0Var, hVar);
    }

    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    public final E5.d getChildren() {
        return this.zza.getChildren();
    }

    public final Object getCompleted() {
        return ((C0046s) this.zza).p();
    }

    public final Throwable getCompletionExceptionOrNull() {
        return ((v0) this.zza).getCompletionExceptionOrNull();
    }

    public final h getKey() {
        return this.zza.getKey();
    }

    public final L5.b getOnAwait() {
        C0046s sVar = (C0046s) this.zza;
        sVar.getClass();
        kotlin.jvm.internal.p.a(3, s0.f943a);
        kotlin.jvm.internal.p.a(3, t0.f948a);
        return new c(sVar);
    }

    public final L5.a getOnJoin() {
        v0 v0Var = (v0) this.zza;
        v0Var.getClass();
        kotlin.jvm.internal.p.a(3, u0.f951a);
        return new e(v0Var);
    }

    public final C0034h0 getParent() {
        v0 v0Var = (v0) this.zza;
        v0Var.getClass();
        C0043o oVar = (C0043o) v0.f955b.get(v0Var);
        if (oVar != null) {
            return oVar.getParent();
        }
        return null;
    }

    public final P invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    public final boolean isActive() {
        return this.zza.isActive();
    }

    public final boolean isCancelled() {
        Object u6 = ((v0) this.zza).u();
        if ((u6 instanceof C0048u) || ((u6 instanceof p0) && ((p0) u6).d())) {
            return true;
        }
        return false;
    }

    public final boolean isCompleted() {
        return !(((v0) this.zza).u() instanceof C0024c0);
    }

    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    public final i minusKey(h hVar) {
        return this.zza.minusKey(hVar);
    }

    public final C0034h0 plus(C0034h0 h0Var) {
        this.zza.getClass();
        return h0Var;
    }

    public final boolean start() {
        return this.zza.start();
    }

    public final boolean cancel(Throwable th) {
        v0 v0Var = (v0) this.zza;
        v0Var.getClass();
        C0036i0 i0Var = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                i0Var = (CancellationException) th;
            }
            if (i0Var == null) {
                i0Var = new C0036i0(v0Var.k(), th, v0Var);
            }
        } else {
            i0Var = new C0036i0(v0Var.k(), (Throwable) null, v0Var);
        }
        v0Var.i(i0Var);
        return true;
    }

    public final P invokeOnCompletion(boolean z3, boolean z4, l lVar) {
        return this.zza.invokeOnCompletion(z3, z4, lVar);
    }

    public final i plus(i iVar) {
        return this.zza.plus(iVar);
    }

    public final /* synthetic */ void cancel() {
        ((v0) this.zza).cancel((CancellationException) null);
    }
}
