package j4;

import R2.b;
import Y4.D;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.o0;
import d5.j;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.q;

public final class x0 implements o0, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f9128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A0 f9129c;

    public x0(A0 a02, D d, int i2) {
        this.f9129c = a02;
        this.f9128b = d;
        this.f9127a = i2;
    }

    public void d(int i2, boolean z3) {
        long j6;
        if (z3) {
            D d = this.f9128b;
            int i5 = d.f4294b;
            int i6 = this.f9127a;
            if (i5 == 9) {
                long j7 = d.g;
                if (j7 != 0) {
                    j6 = ((long) i6) * j7;
                } else {
                    j6 = d.f4297f * ((long) i6);
                }
            } else {
                j6 = (d.f4297f / 2) * ((long) i6);
            }
            U.g(o.getAccountObject().getId(), "cash", j6, new p0(this, 2));
            return;
        }
        b.w(false);
        a.n(MyApplication.f7090a, R.string.no_enough_items, this.f9129c.f8839a, (String) null);
    }

    public void u(C0587c cVar) {
        j jVar = (j) cVar.f(j.class);
        A0 a02 = this.f9129c;
        if (jVar == null) {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, a02.f8839a, (String) null);
        } else if (jVar.getCurrentCity() == 0 && jVar.getCurrentPlace() == 0) {
            android.support.v4.media.session.a.O(new p0(this, 3));
        } else {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, a02.f8839a, (String) null);
        }
    }

    public x0(A0 a02, int i2, D d) {
        this.f9129c = a02;
        this.f9127a = i2;
        this.f9128b = d;
    }

    public void B(C0588d dVar) {
    }
}
