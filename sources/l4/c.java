package L4;

import Y4.D;
import android.content.Context;
import android.view.View;
import com.mtma.criminal.city.utils.v0;
import e5.C0509f;

public final class c extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1739a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f1740b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f1741c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, View view, D d, int i2) {
        super(view);
        this.f1739a = i2;
        this.f1741c = dVar;
        this.f1740b = d;
    }

    public final void onClick(View view) {
        switch (this.f1739a) {
            case 0:
                super.onClick(view);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                Context context = this.f1741c.f1754d0;
                v0.a(this.f1740b, context, iArr[1] * 3);
                return;
            case 1:
                super.onClick(view);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                Context context2 = this.f1741c.f1754d0;
                v0.a(this.f1740b, context2, iArr2[1] * 3);
                return;
            case 2:
                super.onClick(view);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                Context context3 = this.f1741c.f1754d0;
                v0.a(this.f1740b, context3, iArr3[1] * 3);
                return;
            default:
                super.onClick(view);
                int[] iArr4 = new int[2];
                view.getLocationInWindow(iArr4);
                Context context4 = this.f1741c.f1754d0;
                v0.a(this.f1740b, context4, iArr4[1] * 3);
                return;
        }
    }
}
