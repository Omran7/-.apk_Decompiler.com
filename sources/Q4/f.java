package q4;

import P4.i;
import R2.b;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import e5.C0509f;

public final class f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f11121b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, View view, int i2) {
        super(view);
        this.f11120a = i2;
        this.f11121b = iVar;
    }

    public final void onClick(View view) {
        switch (this.f11120a) {
            case 0:
                super.onClick(view);
                i iVar = this.f11121b;
                e eVar = new e((MainActivity) iVar.f2228h0, 0);
                C0269a aVar = new C0269a(iVar.p());
                aVar.f(R.id.activity_main_body_frame_layout, eVar, (String) null, 1);
                aVar.c();
                aVar.e(false);
                b.N0();
                return;
            default:
                super.onClick(view);
                i iVar2 = this.f11121b;
                C0269a aVar2 = new C0269a(iVar2.p());
                aVar2.h(iVar2);
                aVar2.e(false);
                return;
        }
    }
}
