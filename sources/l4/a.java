package L4;

import K4.o;
import R2.b;
import android.content.Context;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0433c;
import com.mtma.criminal.city.utils.p0;
import d5.C0469b;
import f.C0518i;
import java.util.ArrayList;

public final /* synthetic */ class a implements p0, C0433c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1734a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1735b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1736c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a(d dVar, int i2, boolean z3, int i5) {
        this.f1734a = i5;
        this.f1735b = dVar;
        this.f1736c = i2;
        this.d = z3;
    }

    public void a(boolean z3, C0469b bVar) {
        MyApplication myApplication;
        int i2;
        d dVar = this.f1735b;
        Context context = dVar.f1754d0;
        if (z3) {
            b.w(false);
            b.M0(R.raw.arming_equipment);
            com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.toast_successfully, context);
            ArrayList arrayList = dVar.f1750H0;
            int i5 = this.f1736c;
            boolean z4 = this.d;
            if (i5 == 0) {
                d.b0(arrayList, z4);
                d.b0(dVar.f1751I0, z4);
            } else if (i5 == 1) {
                d.b0(arrayList, z4);
                d.b0(dVar.f1752J0, z4);
            } else if (i5 == 15) {
                d.b0(dVar.f1753K0, z4);
            } else if (i5 == 16) {
                d.b0(dVar.L0, z4);
            }
            dVar.Z();
            dVar.W();
            for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                if (sVar instanceof o) {
                    o oVar = (o) sVar;
                    oVar.Z();
                    oVar.b0();
                    oVar.a0();
                    return;
                }
            }
            return;
        }
        b.w(false);
        if (bVar != null) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.already_not_used_in_arming;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        com.google.android.gms.internal.measurement.a.n(myApplication, i2, context, (String) null);
    }

    public void o(int i2) {
        switch (this.f1734a) {
            case 0:
                d dVar = this.f1735b;
                if (i2 > 0) {
                    dVar.getClass();
                    int i5 = this.f1736c;
                    boolean z3 = this.d;
                    android.support.v4.media.session.a.u0(i5, z3, new a(dVar, i5, z3, 2));
                    return;
                }
                dVar.getClass();
                b.w(false);
                c.s0(dVar.f1754d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_enough_space_in_stock), (String) null);
                return;
            default:
                d dVar2 = this.f1735b;
                if (i2 > 0) {
                    dVar2.getClass();
                    int i6 = this.f1736c;
                    boolean z4 = this.d;
                    android.support.v4.media.session.a.u0(i6, z4, new a(dVar2, i6, z4, 2));
                    return;
                }
                dVar2.getClass();
                b.w(false);
                c.s0(dVar2.f1754d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_enough_space_in_bag), (String) null);
                return;
        }
    }
}
