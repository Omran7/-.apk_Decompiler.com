package m0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: m0.i  reason: case insensitive filesystem */
public final class C0817i extends C0807I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0819k f9984a;

    public C0817i(C0819k kVar) {
        this.f9984a = kVar;
    }

    public final void b(RecyclerView recyclerView, int i2, int i5) {
        boolean z3;
        boolean z4;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0819k kVar = this.f9984a;
        int computeVerticalScrollRange = kVar.f10006s.computeVerticalScrollRange();
        int i6 = kVar.f10005r;
        int i7 = computeVerticalScrollRange - i6;
        int i8 = kVar.f9991a;
        if (i7 <= 0 || i6 < i8) {
            z3 = false;
        } else {
            z3 = true;
        }
        kVar.f10007t = z3;
        int computeHorizontalScrollRange = kVar.f10006s.computeHorizontalScrollRange();
        int i9 = kVar.f10004q;
        if (computeHorizontalScrollRange - i9 <= 0 || i9 < i8) {
            z4 = false;
        } else {
            z4 = true;
        }
        kVar.f10008u = z4;
        boolean z5 = kVar.f10007t;
        if (z5 || z4) {
            if (z5) {
                float f6 = (float) i6;
                kVar.f9999l = (int) ((((f6 / 2.0f) + ((float) computeVerticalScrollOffset)) * f6) / ((float) computeVerticalScrollRange));
                kVar.f9998k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
            }
            if (kVar.f10008u) {
                float f7 = (float) computeHorizontalScrollOffset;
                float f8 = (float) i9;
                kVar.f10002o = (int) ((((f8 / 2.0f) + f7) * f8) / ((float) computeHorizontalScrollRange));
                kVar.f10001n = Math.min(i9, (i9 * i9) / computeHorizontalScrollRange);
            }
            int i10 = kVar.f10009v;
            if (i10 == 0 || i10 == 1) {
                kVar.f(1);
            }
        } else if (kVar.f10009v != 0) {
            kVar.f(0);
        }
    }
}
