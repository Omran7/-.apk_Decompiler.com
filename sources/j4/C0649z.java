package j4;

import A2.f;
import R2.b;
import a5.C0264a;
import android.content.Context;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.H;
import com.mtma.criminal.city.utils.o0;

/* renamed from: j4.z  reason: case insensitive filesystem */
public final class C0649z implements o0, H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C f9135a;

    public /* synthetic */ C0649z(C c3) {
        this.f9135a = c3;
    }

    public void a(C0264a aVar) {
        b.w(false);
        boolean z3 = aVar.isAllProcessSuccess;
        C c3 = this.f9135a;
        if (z3) {
            Context context = ((D) ((f) c3.f8851c).d).f8856a;
            Context applicationContext = MyApplication.f7090a.getApplicationContext();
            Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
            f fVar = (f) c3.f8851c;
            c.s0(context, applicationContext.getString(R.string.crime_failed_go_to_prison, new Object[]{applicationContext2.getString(((Y4.f) ((D) fVar.d).getItem(fVar.f29b)).f4346a)}), (String) null);
            return;
        }
        Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
        Context applicationContext4 = MyApplication.f7090a.getApplicationContext();
        f fVar2 = (f) c3.f8851c;
        String string = applicationContext3.getString(R.string.crime_failed, new Object[]{applicationContext4.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a)});
        f fVar3 = (f) c3.f8851c;
        D.b((D) fVar3.d, fVar3.f29b, string);
    }

    public void d(int i2, boolean z3) {
        String str;
        b.w(false);
        C c3 = this.f9135a;
        if (z3) {
            Context applicationContext = MyApplication.f7090a.getApplicationContext();
            Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
            f fVar = (f) c3.f8851c;
            str = applicationContext.getString(R.string.crime_failed_tool_lost, new Object[]{applicationContext2.getString(((Y4.f) ((D) fVar.d).getItem(fVar.f29b)).f4346a)});
        } else {
            Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext4 = MyApplication.f7090a.getApplicationContext();
            f fVar2 = (f) c3.f8851c;
            str = applicationContext3.getString(R.string.crime_failed, new Object[]{applicationContext4.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a)});
        }
        f fVar3 = (f) c3.f8851c;
        D.b((D) fVar3.d, fVar3.f29b, str);
        D d = (D) ((f) c3.f8851c).d;
        d.d = i2;
        d.notifyDataSetChanged();
    }
}
