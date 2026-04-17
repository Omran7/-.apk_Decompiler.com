package y4;

import Y4.D;
import android.view.View;
import android.widget.RelativeLayout;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.v0;

/* renamed from: y4.c  reason: case insensitive filesystem */
public final class C1116c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f12716a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f12717b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0451v f12718c;

    public C1116c(C0451v vVar, RelativeLayout relativeLayout, D d) {
        this.f12718c = vVar;
        this.f12716a = relativeLayout;
        this.f12717b = d;
    }

    public final void onClick(View view) {
        int[] iArr = new int[2];
        this.f12716a.getLocationInWindow(iArr);
        int i2 = iArr[1];
        v0.a(this.f12717b, ((C1118e) this.f12718c.f7481b).f12723d0, i2);
    }
}
