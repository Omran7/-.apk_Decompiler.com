package m0;

import android.view.View;
import androidx.emoji2.text.g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.f;

/* renamed from: m0.v  reason: case insensitive filesystem */
public final class C0829v extends C0806H {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f10063a;

    /* renamed from: b  reason: collision with root package name */
    public final W f10064b = new W(this);

    /* renamed from: c  reason: collision with root package name */
    public C0828u f10065c;
    public C0828u d;

    public static int b(View view, g gVar) {
        return ((gVar.c(view) / 2) + gVar.e(view)) - ((gVar.l() / 2) + gVar.k());
    }

    public static View c(C0804F f6, g gVar) {
        int v6 = f6.v();
        View view = null;
        if (v6 == 0) {
            return null;
        }
        int l6 = (gVar.l() / 2) + gVar.k();
        int i2 = f.API_PRIORITY_OTHER;
        for (int i5 = 0; i5 < v6; i5++) {
            View u6 = f6.u(i5);
            int abs = Math.abs(((gVar.c(u6) / 2) + gVar.e(u6)) - l6);
            if (abs < i2) {
                view = u6;
                i2 = abs;
            }
        }
        return view;
    }

    public final int[] a(C0804F f6, View view) {
        int[] iArr = new int[2];
        if (f6.d()) {
            iArr[0] = b(view, d(f6));
        } else {
            iArr[0] = 0;
        }
        if (f6.e()) {
            iArr[1] = b(view, e(f6));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final g d(C0804F f6) {
        C0828u uVar = this.d;
        if (uVar == null || ((C0804F) uVar.f4930b) != f6) {
            this.d = new C0828u(f6, 0);
        }
        return this.d;
    }

    public final g e(C0804F f6) {
        C0828u uVar = this.f10065c;
        if (uVar == null || ((C0804F) uVar.f4930b) != f6) {
            this.f10065c = new C0828u(f6, 1);
        }
        return this.f10065c;
    }

    public final void f() {
        C0804F layoutManager;
        View view;
        RecyclerView recyclerView = this.f10063a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.e()) {
                view = c(layoutManager, e(layoutManager));
            } else if (layoutManager.d()) {
                view = c(layoutManager, d(layoutManager));
            } else {
                view = null;
            }
            if (view != null) {
                int[] a6 = a(layoutManager, view);
                int i2 = a6[0];
                if (i2 != 0 || a6[1] != 0) {
                    this.f10063a.Z(i2, a6[1], false);
                }
            }
        }
    }
}
