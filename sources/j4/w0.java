package j4;

import K1.e;
import Y4.D;
import android.view.View;
import android.widget.RelativeLayout;
import e5.C0505b;
import e5.C0509f;

public final class w0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f9120b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9121c;
    public final /* synthetic */ C0505b d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0505b f9122e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ A0 f9123f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w0(A0 a02, RelativeLayout relativeLayout, int i2, D d6, int i5, C0505b bVar, C0505b bVar2) {
        super(relativeLayout);
        this.f9123f = a02;
        this.f9119a = i2;
        this.f9120b = d6;
        this.f9121c = i5;
        this.d = bVar;
        this.f9122e = bVar2;
    }

    public final void onClick(View view) {
        super.onClick(view);
        D d6 = this.f9120b;
        A0 a02 = this.f9123f;
        int i2 = this.f9119a;
        if (i2 == 0) {
            e.v0(a02.f8839a, d6);
        } else if (i2 == 1) {
            A0.b(a02, this.f9121c, d6);
        }
        this.d.dismiss();
        a02.f8841c = false;
        C0505b bVar = this.f9122e;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
            a02.d = false;
        }
    }
}
