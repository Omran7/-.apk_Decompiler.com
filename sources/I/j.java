package i;

import K.X;
import R2.b;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8233a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f8234b = -1;

    /* renamed from: c  reason: collision with root package name */
    public BaseInterpolator f8235c;
    public b d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8236e;

    /* renamed from: f  reason: collision with root package name */
    public final i f8237f = new i(this);

    public final void a() {
        if (this.f8236e) {
            Iterator it2 = this.f8233a.iterator();
            while (it2.hasNext()) {
                ((X) it2.next()).b();
            }
            this.f8236e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.f8236e) {
            Iterator it2 = this.f8233a.iterator();
            while (it2.hasNext()) {
                X x6 = (X) it2.next();
                long j6 = this.f8234b;
                if (j6 >= 0) {
                    x6.c(j6);
                }
                BaseInterpolator baseInterpolator = this.f8235c;
                if (!(baseInterpolator == null || (view = (View) x6.f1362a.get()) == null)) {
                    view.animate().setInterpolator(baseInterpolator);
                }
                if (this.d != null) {
                    x6.d(this.f8237f);
                }
                View view2 = (View) x6.f1362a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f8236e = true;
        }
    }
}
