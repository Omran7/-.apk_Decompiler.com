package G5;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import x5.l;

/* renamed from: G5.t  reason: case insensitive filesystem */
public final class C0047t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f944a;

    /* renamed from: b  reason: collision with root package name */
    public final C0037j f945b;

    /* renamed from: c  reason: collision with root package name */
    public final l f946c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f947e;

    public C0047t(Object obj, C0037j jVar, l lVar, Object obj2, Throwable th) {
        this.f944a = obj;
        this.f945b = jVar;
        this.f946c = lVar;
        this.d = obj2;
        this.f947e = th;
    }

    public static C0047t a(C0047t tVar, C0037j jVar, CancellationException cancellationException, int i2) {
        Object obj = tVar.f944a;
        if ((i2 & 2) != 0) {
            jVar = tVar.f945b;
        }
        C0037j jVar2 = jVar;
        l lVar = tVar.f946c;
        Object obj2 = tVar.d;
        Throwable th = cancellationException;
        if ((i2 & 16) != 0) {
            th = tVar.f947e;
        }
        tVar.getClass();
        return new C0047t(obj, jVar2, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0047t)) {
            return false;
        }
        C0047t tVar = (C0047t) obj;
        if (j.a(this.f944a, tVar.f944a) && j.a(this.f945b, tVar.f945b) && j.a(this.f946c, tVar.f946c) && j.a(this.d, tVar.d) && j.a(this.f947e, tVar.f947e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        Object obj = this.f944a;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int i9 = i2 * 31;
        C0037j jVar = this.f945b;
        if (jVar == null) {
            i5 = 0;
        } else {
            i5 = jVar.hashCode();
        }
        int i10 = (i9 + i5) * 31;
        l lVar = this.f946c;
        if (lVar == null) {
            i6 = 0;
        } else {
            i6 = lVar.hashCode();
        }
        int i11 = (i10 + i6) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            i7 = 0;
        } else {
            i7 = obj2.hashCode();
        }
        int i12 = (i11 + i7) * 31;
        Throwable th = this.f947e;
        if (th != null) {
            i8 = th.hashCode();
        }
        return i12 + i8;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f944a + ", cancelHandler=" + this.f945b + ", onCancellation=" + this.f946c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f947e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0047t(Object obj, C0037j jVar, l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : jVar, (i2 & 4) != 0 ? null : lVar, (Object) null, (Throwable) (i2 & 16) != 0 ? null : cancellationException);
    }
}
