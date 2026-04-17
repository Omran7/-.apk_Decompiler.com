package m0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: m0.t  reason: case insensitive filesystem */
public class C0827t {

    /* renamed from: a  reason: collision with root package name */
    public int f10050a = -1;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f10051b;

    /* renamed from: c  reason: collision with root package name */
    public C0804F f10052c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10053e;

    /* renamed from: f  reason: collision with root package name */
    public View f10054f;
    public final N g;
    public boolean h;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f10055i;

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f10056j;

    /* renamed from: k  reason: collision with root package name */
    public PointF f10057k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f10058l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10059m;

    /* renamed from: n  reason: collision with root package name */
    public float f10060n;

    /* renamed from: o  reason: collision with root package name */
    public int f10061o;

    /* renamed from: p  reason: collision with root package name */
    public int f10062p;

    /* JADX WARNING: type inference failed for: r1v0, types: [m0.N, java.lang.Object] */
    public C0827t(Context context) {
        ? obj = new Object();
        obj.d = -1;
        obj.f9874f = false;
        obj.g = 0;
        obj.f9870a = 0;
        obj.f9871b = 0;
        obj.f9872c = Integer.MIN_VALUE;
        obj.f9873e = null;
        this.g = obj;
        this.f10055i = new LinearInterpolator();
        this.f10056j = new DecelerateInterpolator();
        this.f10059m = false;
        this.f10061o = 0;
        this.f10062p = 0;
        this.f10058l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i2, int i5, int i6, int i7, int i8) {
        if (i8 == -1) {
            return i6 - i2;
        }
        if (i8 == 0) {
            int i9 = i6 - i2;
            if (i9 > 0) {
                return i9;
            }
            int i10 = i7 - i5;
            if (i10 < 0) {
                return i10;
            }
            return 0;
        } else if (i8 == 1) {
            return i7 - i5;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int b(View view, int i2) {
        C0804F f6 = this.f10052c;
        if (f6 == null || !f6.d()) {
            return 0;
        }
        C0805G g5 = (C0805G) view.getLayoutParams();
        return a((view.getLeft() - ((C0805G) view.getLayoutParams()).f9862b.left) - g5.leftMargin, view.getRight() + ((C0805G) view.getLayoutParams()).f9862b.right + g5.rightMargin, f6.E(), f6.f9859n - f6.F(), i2);
    }

    public int c(View view, int i2) {
        C0804F f6 = this.f10052c;
        if (f6 == null || !f6.e()) {
            return 0;
        }
        C0805G g5 = (C0805G) view.getLayoutParams();
        return a((view.getTop() - ((C0805G) view.getLayoutParams()).f9862b.top) - g5.topMargin, view.getBottom() + ((C0805G) view.getLayoutParams()).f9862b.bottom + g5.bottomMargin, f6.G(), f6.f9860o - f6.D(), i2);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int e(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.f10059m) {
            this.f10060n = d(this.f10058l);
            this.f10059m = true;
        }
        return (int) Math.ceil((double) (abs * this.f10060n));
    }

    public PointF f(int i2) {
        C0804F f6 = this.f10052c;
        if (f6 instanceof O) {
            return ((O) f6).a(i2);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + O.class.getCanonicalName());
        return null;
    }

    public final void g(int i2, int i5) {
        PointF f6;
        RecyclerView recyclerView = this.f10051b;
        int i6 = -1;
        if (this.f10050a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f10054f == null && this.f10052c != null && (f6 = f(this.f10050a)) != null) {
            float f7 = f6.x;
            if (!(f7 == 0.0f && f6.y == 0.0f)) {
                recyclerView.X((int) Math.signum(f7), (int) Math.signum(f6.y), (int[]) null);
            }
        }
        boolean z3 = false;
        this.d = false;
        View view = this.f10054f;
        N n2 = this.g;
        if (view != null) {
            this.f10051b.getClass();
            T I6 = RecyclerView.I(view);
            if (I6 != null) {
                i6 = I6.b();
            }
            if (i6 == this.f10050a) {
                View view2 = this.f10054f;
                P p6 = recyclerView.f5365l0;
                h(view2, n2);
                n2.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f10054f = null;
            }
        }
        if (this.f10053e) {
            P p7 = recyclerView.f5365l0;
            if (this.f10051b.f5378u.v() == 0) {
                i();
            } else {
                int i7 = this.f10061o;
                int i8 = i7 - i2;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.f10061o = i8;
                int i9 = this.f10062p;
                int i10 = i9 - i5;
                if (i9 * i10 <= 0) {
                    i10 = 0;
                }
                this.f10062p = i10;
                if (i8 == 0 && i10 == 0) {
                    PointF f8 = f(this.f10050a);
                    if (f8 != null) {
                        float f9 = f8.x;
                        if (!(f9 == 0.0f && f8.y == 0.0f)) {
                            float f10 = f8.y;
                            float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f9 * f9)));
                            float f11 = f8.x / sqrt;
                            f8.x = f11;
                            float f12 = f8.y / sqrt;
                            f8.y = f12;
                            this.f10057k = f8;
                            this.f10061o = (int) (f11 * 10000.0f);
                            this.f10062p = (int) (f12 * 10000.0f);
                            int e6 = e(10000);
                            LinearInterpolator linearInterpolator = this.f10055i;
                            n2.f9870a = (int) (((float) this.f10061o) * 1.2f);
                            n2.f9871b = (int) (((float) this.f10062p) * 1.2f);
                            n2.f9872c = (int) (((float) e6) * 1.2f);
                            n2.f9873e = linearInterpolator;
                            n2.f9874f = true;
                        }
                    }
                    n2.d = this.f10050a;
                    i();
                }
            }
            if (n2.d >= 0) {
                z3 = true;
            }
            n2.a(recyclerView);
            if (z3 && this.f10053e) {
                this.d = true;
                recyclerView.f5362i0.a();
            }
        }
    }

    public void h(View view, N n2) {
        int i2;
        int i5;
        int i6;
        PointF pointF = this.f10057k;
        int i7 = 0;
        if (pointF == null || pointF.x == 0.0f) {
            i2 = 0;
        } else if (i6 > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int b6 = b(view, i2);
        PointF pointF2 = this.f10057k;
        if (!(pointF2 == null || pointF2.y == 0.0f)) {
            i7 = i5 > 0 ? 1 : -1;
        }
        int c3 = c(view, i7);
        int ceil = (int) Math.ceil(((double) e((int) Math.sqrt((double) ((c3 * c3) + (b6 * b6))))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f10056j;
            n2.f9870a = -b6;
            n2.f9871b = -c3;
            n2.f9872c = ceil;
            n2.f9873e = decelerateInterpolator;
            n2.f9874f = true;
        }
    }

    public final void i() {
        if (this.f10053e) {
            this.f10053e = false;
            this.f10062p = 0;
            this.f10061o = 0;
            this.f10057k = null;
            this.f10051b.f5365l0.f9875a = -1;
            this.f10054f = null;
            this.f10050a = -1;
            this.d = false;
            C0804F f6 = this.f10052c;
            if (f6.f9852e == this) {
                f6.f9852e = null;
            }
            this.f10052c = null;
            this.f10051b = null;
        }
    }
}
