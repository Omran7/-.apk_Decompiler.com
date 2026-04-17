package m0;

import android.graphics.Rect;
import android.view.View;
import androidx.emoji2.text.g;

/* renamed from: m0.u  reason: case insensitive filesystem */
public final class C0828u extends g {
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0828u(C0804F f6, int i2) {
        super(f6);
        this.d = i2;
    }

    public final int b(View view) {
        switch (this.d) {
            case 0:
                ((C0804F) this.f4930b).getClass();
                return view.getRight() + ((C0805G) view.getLayoutParams()).f9862b.right + ((C0805G) view.getLayoutParams()).rightMargin;
            default:
                ((C0804F) this.f4930b).getClass();
                return view.getBottom() + ((C0805G) view.getLayoutParams()).f9862b.bottom + ((C0805G) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.d) {
            case 0:
                C0805G g = (C0805G) view.getLayoutParams();
                ((C0804F) this.f4930b).getClass();
                return C0804F.A(view) + g.leftMargin + g.rightMargin;
            default:
                C0805G g5 = (C0805G) view.getLayoutParams();
                ((C0804F) this.f4930b).getClass();
                return C0804F.z(view) + g5.topMargin + g5.bottomMargin;
        }
    }

    public final int d(View view) {
        switch (this.d) {
            case 0:
                C0805G g = (C0805G) view.getLayoutParams();
                ((C0804F) this.f4930b).getClass();
                return C0804F.z(view) + g.topMargin + g.bottomMargin;
            default:
                C0805G g5 = (C0805G) view.getLayoutParams();
                ((C0804F) this.f4930b).getClass();
                return C0804F.A(view) + g5.leftMargin + g5.rightMargin;
        }
    }

    public final int e(View view) {
        switch (this.d) {
            case 0:
                ((C0804F) this.f4930b).getClass();
                return (view.getLeft() - ((C0805G) view.getLayoutParams()).f9862b.left) - ((C0805G) view.getLayoutParams()).leftMargin;
            default:
                ((C0804F) this.f4930b).getClass();
                return (view.getTop() - ((C0805G) view.getLayoutParams()).f9862b.top) - ((C0805G) view.getLayoutParams()).topMargin;
        }
    }

    public final int f() {
        switch (this.d) {
            case 0:
                return ((C0804F) this.f4930b).f9859n;
            default:
                return ((C0804F) this.f4930b).f9860o;
        }
    }

    public final int g() {
        switch (this.d) {
            case 0:
                C0804F f6 = (C0804F) this.f4930b;
                return f6.f9859n - f6.F();
            default:
                C0804F f7 = (C0804F) this.f4930b;
                return f7.f9860o - f7.D();
        }
    }

    public final int h() {
        switch (this.d) {
            case 0:
                return ((C0804F) this.f4930b).F();
            default:
                return ((C0804F) this.f4930b).D();
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((C0804F) this.f4930b).f9857l;
            default:
                return ((C0804F) this.f4930b).f9858m;
        }
    }

    public final int j() {
        switch (this.d) {
            case 0:
                return ((C0804F) this.f4930b).f9858m;
            default:
                return ((C0804F) this.f4930b).f9857l;
        }
    }

    public final int k() {
        switch (this.d) {
            case 0:
                return ((C0804F) this.f4930b).E();
            default:
                return ((C0804F) this.f4930b).G();
        }
    }

    public final int l() {
        switch (this.d) {
            case 0:
                C0804F f6 = (C0804F) this.f4930b;
                return (f6.f9859n - f6.E()) - f6.F();
            default:
                C0804F f7 = (C0804F) this.f4930b;
                return (f7.f9860o - f7.G()) - f7.D();
        }
    }

    public final int n(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f4931c;
                ((C0804F) this.f4930b).K(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f4931c;
                ((C0804F) this.f4930b).K(view, rect2);
                return rect2.bottom;
        }
    }

    public final int o(View view) {
        switch (this.d) {
            case 0:
                Rect rect = (Rect) this.f4931c;
                ((C0804F) this.f4930b).K(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f4931c;
                ((C0804F) this.f4930b).K(view, rect2);
                return rect2.top;
        }
    }

    public final void p(int i2) {
        switch (this.d) {
            case 0:
                ((C0804F) this.f4930b).O(i2);
                return;
            default:
                ((C0804F) this.f4930b).P(i2);
                return;
        }
    }
}
