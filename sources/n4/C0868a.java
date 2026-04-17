package n4;

import C4.a;
import R2.b;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import e5.C0509f;

/* renamed from: n4.a  reason: case insensitive filesystem */
public final class C0868a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10354b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0868a(a aVar, View view, int i2) {
        super(view);
        this.f10353a = i2;
        this.f10354b = aVar;
    }

    public final void onClick(View view) {
        switch (this.f10353a) {
            case 0:
                super.onClick(view);
                a aVar = this.f10354b;
                C0269a aVar2 = new C0269a(aVar.p());
                aVar2.f(R.id.activity_main_body_frame_layout, new c((MainActivity) aVar.f470f0), (String) null, 1);
                aVar2.e(false);
                b.N0();
                return;
            default:
                super.onClick(view);
                a aVar3 = this.f10354b;
                C0269a aVar4 = new C0269a(aVar3.p());
                aVar4.h(aVar3);
                aVar4.e(false);
                return;
        }
    }
}
