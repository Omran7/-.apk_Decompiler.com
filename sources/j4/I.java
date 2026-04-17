package j4;

import A2.f;
import K4.k;
import R2.b;
import Y4.i;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import d5.o;
import e5.C0509f;
import f.C0518i;
import o3.d;

public final class I extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f8891b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0626h f8892c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(C0626h hVar, ViewGroup viewGroup, i iVar, int i2) {
        super(viewGroup);
        this.f8890a = i2;
        this.f8892c = hVar;
        this.f8891b = iVar;
    }

    public final void onClick(View view) {
        int i2;
        C0286s sVar;
        switch (this.f8890a) {
            case 0:
                super.onClick(view);
                C0626h hVar = this.f8892c;
                if (!hVar.f9019c) {
                    hVar.f9019c = true;
                    if (b.i0(608)) {
                        i2 = 10;
                    } else {
                        i2 = 20;
                    }
                    if (o.getMainStatesObject().getPowerCurrent() < i2) {
                        c.p((MainActivity) hVar.f9018b, 2001);
                        hVar.f9019c = false;
                        return;
                    }
                    a.v(a.c(a.e(true), "players"), "locationObject").d(new f((Object) hVar, (Object) this.f8891b, i2, 12));
                    return;
                }
                return;
            default:
                super.onClick(view);
                i iVar = this.f8891b;
                boolean t6 = a.t(iVar.f4366a);
                C0626h hVar2 = this.f8892c;
                if (t6) {
                    sVar = new K4.o((MainActivity) hVar2.f9018b);
                } else {
                    sVar = new k((MainActivity) hVar2.f9018b, iVar.f4366a);
                }
                androidx.fragment.app.I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                a.j(b6, false);
                return;
        }
    }
}
