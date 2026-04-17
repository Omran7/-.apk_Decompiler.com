package j4;

import K4.k;
import Y4.n;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import e5.C0509f;
import f.C0518i;
import o3.d;

/* renamed from: j4.a0  reason: case insensitive filesystem */
public final class C0613a0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8971a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f8972b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0615b0 f8973c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0613a0(C0615b0 b0Var, ViewGroup viewGroup, n nVar, int i2) {
        super(viewGroup);
        this.f8971a = i2;
        this.f8973c = b0Var;
        this.f8972b = nVar;
    }

    public final void onClick(View view) {
        switch (this.f8971a) {
            case 0:
                super.onClick(view);
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, new k(this.f8973c.f8978b, this.f8972b.f4401a), (String) null, 1);
                a.j(b6, false);
                return;
            case 1:
                super.onClick(view);
                C0615b0.a(this.f8973c, this.f8972b, 0);
                return;
            default:
                super.onClick(view);
                C0615b0.a(this.f8973c, this.f8972b, 1);
                return;
        }
    }
}
