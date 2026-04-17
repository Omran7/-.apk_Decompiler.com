package R0;

import Q0.f;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2461a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2462b;

    public e(f fVar) {
        this.f2462b = new WeakReference(fVar);
    }

    public final boolean onPreDraw() {
        int i2;
        switch (this.f2461a) {
            case 0:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                f fVar = (f) ((WeakReference) this.f2462b).get();
                if (fVar == null) {
                    return true;
                }
                ArrayList arrayList = fVar.f2464b;
                if (arrayList.isEmpty()) {
                    return true;
                }
                ImageView imageView = fVar.f2463a;
                int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                int i5 = 0;
                if (layoutParams != null) {
                    i2 = layoutParams.width;
                } else {
                    i2 = 0;
                }
                int a6 = fVar.a(imageView.getWidth(), i2, paddingRight);
                int paddingBottom = imageView.getPaddingBottom() + imageView.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    i5 = layoutParams2.height;
                }
                int a7 = fVar.a(imageView.getHeight(), i5, paddingBottom);
                if (a6 <= 0 && a6 != Integer.MIN_VALUE) {
                    return true;
                }
                if (a7 <= 0 && a7 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it2 = new ArrayList(arrayList).iterator();
                while (it2.hasNext()) {
                    ((f) ((c) it2.next())).n(a6, a7);
                }
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(fVar.f2465c);
                }
                fVar.f2465c = null;
                arrayList.clear();
                return true;
            default:
                ((CoordinatorLayout) this.f2462b).p(0);
                return true;
        }
    }

    public e(CoordinatorLayout coordinatorLayout) {
        this.f2462b = coordinatorLayout;
    }
}
