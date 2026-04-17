package j4;

import F3.e;
import F3.h;
import J.a;
import R2.b;
import Y4.D;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import d5.o;
import java.util.HashMap;

public final /* synthetic */ class B0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M0 f8846a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f8847b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8848c;
    public final /* synthetic */ long d;

    public /* synthetic */ B0(M0 m02, D d6, int i2, long j6) {
        this.f8846a = m02;
        this.f8847b = d6;
        this.f8848c = i2;
        this.d = j6;
    }

    public final void accept(Object obj) {
        M0 m02 = this.f8846a;
        m02.getClass();
        if (((Boolean) obj).booleanValue()) {
            e eVar = new e((Object) m02, 19);
            HashMap hashMap = new HashMap();
            hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
            hashMap.put("playerId", o.getAccountObject().getId());
            hashMap.put("stallCellNumber", Integer.valueOf(m02.f8921c));
            D d6 = this.f8847b;
            hashMap.put("materialType", Integer.valueOf(d6.f4294b));
            hashMap.put("materialId", Integer.valueOf(d6.f4293a));
            hashMap.put("materialLevel", Integer.valueOf(d6.f4298i));
            hashMap.put("isGun", Boolean.valueOf(d6.f4307r));
            hashMap.put("materialCount", Integer.valueOf(this.f8848c));
            hashMap.put("materialCost", Long.valueOf(this.d));
            h.b().a("addMaterialToStallCell").q(hashMap).addOnCompleteListener(new C0451v(eVar, 9));
            return;
        }
        b.w(false);
        c.s0(m02.f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection), (String) null);
    }
}
