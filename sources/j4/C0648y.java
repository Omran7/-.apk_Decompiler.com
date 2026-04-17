package j4;

import A2.f;
import R2.b;
import android.content.Context;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0432b;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.o0;
import d5.o;

/* renamed from: j4.y  reason: case insensitive filesystem */
public final class C0648y implements o0, T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f9130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C f9131b;

    public /* synthetic */ C0648y(C c3, long j6) {
        this.f9131b = c3;
        this.f9130a = j6;
    }

    public void c(boolean z3) {
        String str;
        b.w(false);
        C c3 = this.f9131b;
        if (z3) {
            Context applicationContext = MyApplication.f7090a.getApplicationContext();
            Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
            f fVar = (f) c3.f8851c;
            str = applicationContext.getString(R.string.crime_success_got_reward, new Object[]{applicationContext2.getString(((Y4.f) ((D) fVar.d).getItem(fVar.f29b)).f4346a), MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_word_cash, new Object[]{U.c(this.f9130a)})});
        } else {
            Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext4 = MyApplication.f7090a.getApplicationContext();
            f fVar2 = (f) c3.f8851c;
            str = applicationContext3.getString(R.string.crime_success, new Object[]{applicationContext4.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a)});
        }
        f fVar3 = (f) c3.f8851c;
        D.b((D) fVar3.d, fVar3.f29b, str);
    }

    public void d(int i2, boolean z3) {
        U.g(o.getAccountObject().getId(), "cash", this.f9130a, new C0432b((o0) this, z3, i2, 3));
    }
}
