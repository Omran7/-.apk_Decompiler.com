package m0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    public int f9912a;

    /* renamed from: b  reason: collision with root package name */
    public int f9913b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9914c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9915e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f9916f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public X(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f9912a = -1;
        this.f9913b = Integer.MIN_VALUE;
        this.f9914c = false;
        this.d = false;
        this.f9915e = false;
        int[] iArr = this.f9916f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
