package H5;

import B2.a;
import G5.A;
import G5.C0035i;
import G5.C0040l;
import G5.F;
import G5.F0;
import G5.K;
import G5.N;
import G5.P;
import G5.x0;
import I5.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import o3.d;
import o5.i;

public final class e extends A implements K {

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1071c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1072e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1073f;

    public e(Handler handler, String str, boolean z3) {
        e eVar;
        this.f1071c = handler;
        this.d = str;
        this.f1072e = z3;
        if (z3) {
            eVar = this;
        } else {
            eVar = new e(handler, str, true);
        }
        this.f1073f = eVar;
    }

    public final P c(long j6, F0 f02, i iVar) {
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f1071c.postDelayed(f02, j6)) {
            return new c(this, f02);
        }
        l(iVar, f02);
        return x0.f959a;
    }

    public final void d(long j6, C0040l lVar) {
        a aVar = new a((Object) lVar, (Object) this, 5);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f1071c.postDelayed(aVar, j6)) {
            d dVar = new d(this, aVar, 0);
            lVar.getClass();
            lVar.u(new C0035i(dVar, 1));
            return;
        }
        l(lVar.f923e, aVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.f1071c == this.f1071c && eVar.f1072e == this.f1072e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int identityHashCode = System.identityHashCode(this.f1071c);
        if (this.f1072e) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return identityHashCode ^ i2;
    }

    public final void j(i iVar, Runnable runnable) {
        if (!this.f1071c.post(runnable)) {
            l(iVar, runnable);
        }
    }

    public final boolean k() {
        if (!this.f1072e || !j.a(Looper.myLooper(), this.f1071c.getLooper())) {
            return true;
        }
        return false;
    }

    public final void l(i iVar, Runnable runnable) {
        F.e(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        N.f878b.j(iVar, runnable);
    }

    public final String toString() {
        String str;
        e eVar;
        K5.e eVar2 = N.f877a;
        e eVar3 = o.f1276a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f1073f;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            if (this == eVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = this.f1071c.toString();
        }
        if (this.f1072e) {
            return d.f(str2, ".immediate");
        }
        return str2;
    }

    public e(Handler handler) {
        this(handler, (String) null, false);
    }
}
