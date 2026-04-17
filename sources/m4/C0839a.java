package m4;

import R2.b;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.R;
import e5.C0509f;

/* renamed from: m4.a  reason: case insensitive filesystem */
public final class C0839a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10164a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0840b f10165b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0839a(C0840b bVar, View view, int i2) {
        super(view);
        this.f10164a = i2;
        this.f10165b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f10164a) {
            case 0:
                super.onClick(view);
                C0840b bVar = this.f10165b;
                C0269a aVar = new C0269a(bVar.p());
                aVar.f(R.id.activity_main_body_frame_layout, new C0841c(bVar.f10166d0, bVar.f10167e0), (String) null, 1);
                aVar.e(false);
                b.N0();
                return;
            default:
                super.onClick(view);
                C0840b bVar2 = this.f10165b;
                C0269a aVar2 = new C0269a(bVar2.p());
                aVar2.h(bVar2);
                aVar2.e(false);
                return;
        }
    }
}
