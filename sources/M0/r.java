package m0;

import android.view.View;
import com.google.android.gms.common.api.f;
import java.util.List;
import k5.C0770g;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10038a;

    /* renamed from: b  reason: collision with root package name */
    public int f10039b;

    /* renamed from: c  reason: collision with root package name */
    public int f10040c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f10041e;

    /* renamed from: f  reason: collision with root package name */
    public int f10042f;
    public int g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public int f10043i;

    /* renamed from: j  reason: collision with root package name */
    public int f10044j;

    /* renamed from: k  reason: collision with root package name */
    public List f10045k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10046l;

    public final void a(View view) {
        int b6;
        int size = this.f10045k.size();
        View view2 = null;
        int i2 = f.API_PRIORITY_OTHER;
        for (int i5 = 0; i5 < size; i5++) {
            View view3 = ((T) this.f10045k.get(i5)).f9893a;
            C0805G g5 = (C0805G) view3.getLayoutParams();
            if (view3 != view && !g5.f9861a.i() && (b6 = (g5.f9861a.b() - this.d) * this.f10041e) >= 0 && b6 < i2) {
                view2 = view3;
                if (b6 == 0) {
                    break;
                }
                i2 = b6;
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((C0805G) view2.getLayoutParams()).f9861a.b();
        }
    }

    public final View b(C0770g gVar) {
        List list = this.f10045k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = ((T) this.f10045k.get(i2)).f9893a;
                C0805G g5 = (C0805G) view.getLayoutParams();
                if (!g5.f9861a.i() && this.d == g5.f9861a.b()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = gVar.n(this.d, Long.MAX_VALUE).f9893a;
        this.d += this.f10041e;
        return view2;
    }
}
