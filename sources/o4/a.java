package O4;

import android.view.View;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.R;
import e5.C0509f;

public final class a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2111b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, View view, int i2) {
        super(view);
        this.f2110a = i2;
        this.f2111b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f2110a) {
            case 0:
                super.onClick(view);
                b bVar = this.f2111b;
                C0269a aVar = new C0269a(bVar.p());
                aVar.h(bVar);
                aVar.e(false);
                C0269a aVar2 = new C0269a(bVar.p());
                aVar2.f(R.id.activity_main_body_frame_layout, new J4.a(bVar.f2112d0, 1), (String) null, 1);
                com.google.android.gms.internal.measurement.a.j(aVar2, false);
                return;
            default:
                super.onClick(view);
                b bVar2 = this.f2111b;
                C0269a aVar3 = new C0269a(bVar2.p());
                aVar3.h(bVar2);
                aVar3.e(false);
                return;
        }
    }
}
