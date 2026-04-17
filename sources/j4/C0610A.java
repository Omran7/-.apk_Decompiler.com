package j4;

import A2.f;
import K1.e;
import android.content.Context;
import android.support.v4.media.session.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0432b;
import com.mtma.criminal.city.utils.o0;
import d5.o;

/* renamed from: j4.A  reason: case insensitive filesystem */
public final class C0610A implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8836a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C f8837b;

    public /* synthetic */ C0610A(C c3, int i2) {
        this.f8836a = i2;
        this.f8837b = c3;
    }

    public final void d(int i2, boolean z3) {
        switch (this.f8836a) {
            case 0:
                String id = o.getAccountObject().getId();
                C c3 = this.f8837b;
                f fVar = (f) c3.f8851c;
                long d02 = a.d0(((D) fVar.d).f8857b, fVar.f29b);
                Context applicationContext = MyApplication.f7090a.getApplicationContext();
                f fVar2 = (f) c3.f8851c;
                e.b(id, d02, applicationContext.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a), new C0432b((o0) this, z3, i2, 4));
                return;
            default:
                String id2 = o.getAccountObject().getId();
                C c6 = this.f8837b;
                f fVar3 = (f) c6.f8851c;
                long d03 = a.d0(((D) fVar3.d).f8857b, fVar3.f29b);
                Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
                f fVar4 = (f) c6.f8851c;
                a.b(id2, d03, applicationContext2.getString(R.string.reason_to_go_hospital_from_crime, new Object[]{applicationContext3.getString(((Y4.f) ((D) fVar4.d).getItem(fVar4.f29b)).f4346a)}), new C0611B(this, z3, fVar4.f29b, i2));
                return;
        }
    }
}
