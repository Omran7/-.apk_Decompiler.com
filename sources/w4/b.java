package W4;

import android.view.View;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import e5.C0509f;

public final class b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f4091b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, View view, int i2) {
        super(view);
        this.f4090a = i2;
        this.f4091b = gVar;
    }

    public final void onClick(View view) {
        switch (this.f4090a) {
            case 0:
                super.onClick(view);
                g gVar = this.f4091b;
                gVar.a0(gVar.r(R.string.can_not_return_to_old_work), -1, false);
                return;
            case 1:
                super.onClick(view);
                g gVar2 = this.f4091b;
                C0269a aVar = new C0269a(gVar2.p());
                aVar.h(gVar2);
                aVar.e(false);
                return;
            case 2:
                super.onClick(view);
                g gVar3 = this.f4091b;
                C0269a aVar2 = new C0269a(gVar3.p());
                aVar2.h(gVar3);
                aVar2.e(false);
                C0269a aVar3 = new C0269a(gVar3.p());
                aVar3.f(R.id.activity_main_body_frame_layout, new h(gVar3.f4104d0), (String) null, 1);
                a.j(aVar3, false);
                return;
            default:
                super.onClick(view);
                int jobType = o.getWorkObject().getJobType();
                g gVar4 = this.f4091b;
                if (jobType != -1) {
                    gVar4.a0(gVar4.r(R.string.you_will_lost_all_work_before), 0, true);
                    return;
                }
                gVar4.getClass();
                g.V(gVar4);
                return;
        }
    }
}
