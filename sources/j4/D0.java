package j4;

import F3.h;
import R2.b;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0449t;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.p0;
import d5.o;
import java.util.HashMap;

public final /* synthetic */ class D0 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M0 f8860a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8861b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8862c;
    public final /* synthetic */ int d;

    public /* synthetic */ D0(M0 m02, int i2, int i5, int i6) {
        this.f8860a = m02;
        this.f8861b = i2;
        this.f8862c = i5;
        this.d = i6;
    }

    public final void o(int i2) {
        M0 m02 = this.f8860a;
        m02.getClass();
        if (i2 < this.f8861b) {
            c.s0(m02.f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_free_space_in_stock), (String) null);
            b.w(false);
            return;
        }
        int i5 = this.f8862c;
        C0449t tVar = new C0449t(m02, i5, 2);
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", o.getAccountObject().getId());
        hashMap.put("stallCellNumber", Integer.valueOf(i5));
        hashMap.put("materialId", Integer.valueOf(this.d));
        h.b().a("removeMaterialFromStallCell").q(hashMap).addOnCompleteListener(new C0451v(tVar, 10));
    }
}
