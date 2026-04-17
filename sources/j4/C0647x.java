package j4;

import A2.f;
import R2.b;
import Y4.D;
import android.content.Context;
import android.support.v4.media.session.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0432b;
import com.mtma.criminal.city.utils.o0;
import d5.o;

/* renamed from: j4.x  reason: case insensitive filesystem */
public final class C0647x implements o0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C f9126c;

    public /* synthetic */ C0647x(C c3, int i2, int i5) {
        this.f9124a = i5;
        this.f9126c = c3;
        this.f9125b = i2;
    }

    public final void d(int i2, boolean z3) {
        String str;
        String str2;
        switch (this.f9124a) {
            case 0:
                C c3 = this.f9126c;
                int i5 = this.f9125b;
                if (i5 == -1) {
                    b.w(false);
                    if (z3) {
                        Context applicationContext = MyApplication.f7090a.getApplicationContext();
                        Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                        f fVar = (f) c3.f8851c;
                        str = applicationContext.getString(R.string.crime_success_tool_lost, new Object[]{applicationContext2.getString(((Y4.f) ((D) fVar.d).getItem(fVar.f29b)).f4346a)});
                        D d = (D) ((f) c3.f8851c).d;
                        d.d = i2;
                        d.notifyDataSetChanged();
                    } else {
                        Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
                        Context applicationContext4 = MyApplication.f7090a.getApplicationContext();
                        f fVar2 = (f) c3.f8851c;
                        str = applicationContext3.getString(R.string.crime_success, new Object[]{applicationContext4.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a)});
                    }
                    f fVar3 = (f) c3.f8851c;
                    D.b((D) fVar3.d, fVar3.f29b, str);
                    return;
                }
                D s6 = D.s(i5, 0, 1);
                a.B0(s6.f4293a, s6.f4294b, s6.f4298i, 1, new C0432b((o0) this, z3, i2, 2), o.getAccountObject().getId(), (String) ((f) c3.f8851c).f30c, false);
                return;
            default:
                b.w(false);
                C c6 = this.f9126c;
                if (z3) {
                    Context applicationContext5 = MyApplication.f7090a.getApplicationContext();
                    Context applicationContext6 = MyApplication.f7090a.getApplicationContext();
                    f fVar4 = (f) c6.f8851c;
                    str2 = applicationContext5.getString(R.string.crime_success_got_reward, new Object[]{applicationContext6.getString(((Y4.f) ((D) fVar4.d).getItem(fVar4.f29b)).f4346a), MyApplication.f7090a.getApplicationContext().getString(D.s(this.f9125b, 0, 1).f4295c)});
                } else {
                    Context applicationContext7 = MyApplication.f7090a.getApplicationContext();
                    Context applicationContext8 = MyApplication.f7090a.getApplicationContext();
                    f fVar5 = (f) c6.f8851c;
                    str2 = applicationContext7.getString(R.string.crime_success, new Object[]{applicationContext8.getString(((Y4.f) ((D) fVar5.d).getItem(fVar5.f29b)).f4346a)});
                }
                f fVar6 = (f) c6.f8851c;
                D.b((D) fVar6.d, fVar6.f29b, str2);
                return;
        }
    }
}
