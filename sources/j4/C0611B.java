package j4;

import R2.b;
import Y4.f;
import a5.C0264a;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.H;

/* renamed from: j4.B  reason: case insensitive filesystem */
public final /* synthetic */ class C0611B implements H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0610A f8843a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8844b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8845c;
    public final /* synthetic */ int d;

    public /* synthetic */ C0611B(C0610A a6, boolean z3, int i2, int i5) {
        this.f8843a = a6;
        this.f8844b = z3;
        this.f8845c = i2;
        this.d = i5;
    }

    public final void a(C0264a aVar) {
        String str;
        C0610A a6 = this.f8843a;
        a6.getClass();
        b.w(false);
        boolean z3 = aVar.isAllProcessSuccess;
        boolean z4 = this.f8844b;
        int i2 = this.f8845c;
        C c3 = a6.f8837b;
        if (!z3) {
            if (z4) {
                str = MyApplication.f7090a.getApplicationContext().getString(R.string.crime_failed_tool_lost, new Object[]{MyApplication.f7090a.getApplicationContext().getString(((f) ((D) ((A2.f) c3.f8851c).d).getItem(i2)).f4346a)});
                D d6 = (D) ((A2.f) c3.f8851c).d;
                d6.d = this.d;
                d6.notifyDataSetChanged();
            } else {
                str = MyApplication.f7090a.getApplicationContext().getString(R.string.crime_failed, new Object[]{MyApplication.f7090a.getApplicationContext().getString(((f) ((D) ((A2.f) c3.f8851c).d).getItem(i2)).f4346a)});
            }
            D.b((D) ((A2.f) c3.f8851c).d, i2, str);
        } else if (z4) {
            c.s0(((D) ((A2.f) c3.f8851c).d).f8856a, MyApplication.f7090a.getApplicationContext().getString(R.string.crime_failed_tool_lost_go_to_hospital, new Object[]{MyApplication.f7090a.getApplicationContext().getString(((f) ((D) ((A2.f) c3.f8851c).d).getItem(i2)).f4346a)}), (String) null);
        } else {
            c.s0(((D) ((A2.f) c3.f8851c).d).f8856a, MyApplication.f7090a.getApplicationContext().getString(R.string.crime_failed_go_to_hospital, new Object[]{MyApplication.f7090a.getApplicationContext().getString(((f) ((D) ((A2.f) c3.f8851c).d).getItem(i2)).f4346a)}), (String) null);
        }
    }
}
