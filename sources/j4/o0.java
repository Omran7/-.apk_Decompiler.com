package j4;

import R2.b;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.p0;

public final class o0 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9070c;
    public final /* synthetic */ Z d;

    public /* synthetic */ o0(Z z3, int i2, int i5, int i6) {
        this.f9068a = i6;
        this.d = z3;
        this.f9069b = i2;
        this.f9070c = i5;
    }

    public final void o(int i2) {
        switch (this.f9068a) {
            case 0:
                Z z3 = this.d;
                int i5 = this.f9069b;
                if (i2 < i5) {
                    c.s0(z3.f8965b, MyApplication.f7090a.getApplicationContext().getString(R.string.no_free_space_in_stock), (String) null);
                    b.w(false);
                    return;
                }
                int i6 = z3.f8966c;
                int i7 = this.f9070c;
                if (i6 == 3 || i6 == 4 || i6 == 5) {
                    Z.a(z3, i7);
                    return;
                } else {
                    Z.b(z3, i7, i5);
                    return;
                }
            default:
                Z z4 = this.d;
                int i8 = this.f9069b;
                if (i2 < i8) {
                    c.s0(z4.f8965b, MyApplication.f7090a.getApplicationContext().getString(R.string.no_enough_space_in_bag), (String) null);
                    b.w(false);
                    return;
                }
                int i9 = z4.f8966c;
                int i10 = this.f9070c;
                if (i9 == 3 || i9 == 4 || i9 == 5) {
                    Z.a(z4, i10);
                    return;
                } else {
                    Z.b(z4, i10, i8);
                    return;
                }
        }
    }
}
