package j4;

import J.a;
import R2.b;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;

public final /* synthetic */ class C0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M0 f8852a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8853b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8854c;
    public final /* synthetic */ int d;

    public /* synthetic */ C0(M0 m02, int i2, int i5, int i6) {
        this.f8852a = m02;
        this.f8853b = i2;
        this.f8854c = i5;
        this.d = i6;
    }

    public final void accept(Object obj) {
        M0 m02 = this.f8852a;
        m02.getClass();
        if (((Boolean) obj).booleanValue()) {
            android.support.v4.media.session.a.O(new D0(m02, this.f8853b, this.f8854c, this.d));
            return;
        }
        b.w(false);
        c.s0(m02.f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection), (String) null);
    }
}
