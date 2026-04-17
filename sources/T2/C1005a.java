package t2;

import I1.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: t2.a  reason: case insensitive filesystem */
public final class C1005a extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f11745p;

    /* renamed from: q  reason: collision with root package name */
    public final SideSheetBehavior f11746q;

    public /* synthetic */ C1005a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f11745p = i2;
        this.f11746q = sideSheetBehavior;
    }

    public final boolean E0(View view, float f6) {
        switch (this.f11745p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f11746q;
                float abs = Math.abs((f6 * sideSheetBehavior.f6491k) + ((float) view.getLeft()));
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                    return true;
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f11746q;
                float abs2 = Math.abs((f6 * sideSheetBehavior2.f6491k) + ((float) view.getRight()));
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    public final int H() {
        switch (this.f11745p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f11746q;
                return Math.max(0, sideSheetBehavior.f6494n + sideSheetBehavior.f6495o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f11746q;
                return Math.max(0, (sideSheetBehavior2.f6493m - sideSheetBehavior2.f6492l) - sideSheetBehavior2.f6495o);
        }
    }

    public final void J0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i5) {
        switch (this.f11745p) {
            case 0:
                if (i2 <= this.f11746q.f6493m) {
                    marginLayoutParams.leftMargin = i5;
                    return;
                }
                return;
            default:
                int i6 = this.f11746q.f6493m;
                if (i2 <= i6) {
                    marginLayoutParams.rightMargin = i6 - i2;
                    return;
                }
                return;
        }
    }

    public final int M() {
        switch (this.f11745p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f11746q;
                return (-sideSheetBehavior.f6492l) - sideSheetBehavior.f6495o;
            default:
                return this.f11746q.f6493m;
        }
    }

    public final int P() {
        switch (this.f11745p) {
            case 0:
                return this.f11746q.f6495o;
            default:
                return this.f11746q.f6493m;
        }
    }

    public final int R() {
        switch (this.f11745p) {
            case 0:
                return -this.f11746q.f6492l;
            default:
                return H();
        }
    }

    public final int S(View view) {
        switch (this.f11745p) {
            case 0:
                return view.getRight() + this.f11746q.f6495o;
            default:
                return view.getLeft() - this.f11746q.f6495o;
        }
    }

    public final int W(CoordinatorLayout coordinatorLayout) {
        switch (this.f11745p) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int c0() {
        switch (this.f11745p) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final int k(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f11745p) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float l(int i2) {
        switch (this.f11745p) {
            case 0:
                float M6 = (float) M();
                return (((float) i2) - M6) / (((float) H()) - M6);
            default:
                float f6 = (float) this.f11746q.f6493m;
                return (f6 - ((float) i2)) / (f6 - ((float) H()));
        }
    }

    public final boolean m0(float f6) {
        switch (this.f11745p) {
            case 0:
                return f6 > 0.0f;
            default:
                return f6 < 0.0f;
        }
    }

    public final boolean q0(View view) {
        switch (this.f11745p) {
            case 0:
                if (view.getRight() < (H() - M()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (H() + this.f11746q.f6493m) / 2) {
                    return true;
                }
                return false;
        }
    }

    public final boolean r0(float f6, float f7) {
        switch (this.f11745p) {
            case 0:
                if (Math.abs(f6) > Math.abs(f7)) {
                    float abs = Math.abs(f6);
                    this.f11746q.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f6) > Math.abs(f7)) {
                    float abs2 = Math.abs(f6);
                    this.f11746q.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
