package m0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9943a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f9944b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f9945c = Integer.MIN_VALUE;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f9946e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f9947f;

    public c0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f9947f = staggeredGridLayoutManager;
        this.f9946e = i2;
    }

    public final void a() {
        ArrayList arrayList = this.f9943a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f9945c = this.f9947f.f5402r.b(view);
        ((Y) view.getLayoutParams()).getClass();
    }

    public final void b() {
        this.f9943a.clear();
        this.f9944b = Integer.MIN_VALUE;
        this.f9945c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        boolean z3 = this.f9947f.f5407w;
        ArrayList arrayList = this.f9943a;
        if (z3) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public final int d() {
        boolean z3 = this.f9947f.f5407w;
        ArrayList arrayList = this.f9943a;
        if (z3) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public final int e(int i2, int i5) {
        int i6;
        boolean z3;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f9947f;
        int k6 = staggeredGridLayoutManager.f5402r.k();
        int g = staggeredGridLayoutManager.f5402r.g();
        if (i5 > i2) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        while (i2 != i5) {
            View view = (View) this.f9943a.get(i2);
            int e6 = staggeredGridLayoutManager.f5402r.e(view);
            int b6 = staggeredGridLayoutManager.f5402r.b(view);
            boolean z4 = false;
            if (e6 <= g) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b6 >= k6) {
                z4 = true;
            }
            if (z3 && z4 && (e6 < k6 || b6 > g)) {
                return C0804F.H(view);
            }
            i2 += i6;
        }
        return -1;
    }

    public final int f(int i2) {
        int i5 = this.f9945c;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f9943a.size() == 0) {
            return i2;
        }
        a();
        return this.f9945c;
    }

    public final View g(int i2, int i5) {
        ArrayList arrayList = this.f9943a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f9947f;
        View view = null;
        if (i5 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f5407w && C0804F.H(view2) >= i2) || ((!staggeredGridLayoutManager.f5407w && C0804F.H(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                View view3 = (View) arrayList.get(i6);
                if ((staggeredGridLayoutManager.f5407w && C0804F.H(view3) <= i2) || ((!staggeredGridLayoutManager.f5407w && C0804F.H(view3) >= i2) || !view3.hasFocusable())) {
                    break;
                }
                i6++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i2) {
        int i5 = this.f9944b;
        if (i5 != Integer.MIN_VALUE) {
            return i5;
        }
        if (this.f9943a.size() == 0) {
            return i2;
        }
        View view = (View) this.f9943a.get(0);
        this.f9944b = this.f9947f.f5402r.e(view);
        ((Y) view.getLayoutParams()).getClass();
        return this.f9944b;
    }
}
