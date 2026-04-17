package m0;

import K.C0075o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import k5.C0770g;

/* renamed from: m0.w  reason: case insensitive filesystem */
public final class C0830w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f10066a;

    public /* synthetic */ C0830w(RecyclerView recyclerView) {
        this.f10066a = recyclerView;
    }

    public void a(C0809a aVar) {
        int i2 = aVar.f9921a;
        RecyclerView recyclerView = this.f10066a;
        if (i2 == 1) {
            recyclerView.f5378u.W(aVar.f9922b, aVar.f9923c);
        } else if (i2 == 2) {
            recyclerView.f5378u.Z(aVar.f9922b, aVar.f9923c);
        } else if (i2 == 4) {
            recyclerView.f5378u.a0(aVar.f9922b, aVar.f9923c);
        } else if (i2 == 8) {
            recyclerView.f5378u.Y(aVar.f9922b, aVar.f9923c);
        }
    }

    public T b(int i2) {
        RecyclerView recyclerView = this.f10066a;
        int v6 = recyclerView.f5356e.v();
        int i5 = 0;
        T t6 = null;
        while (true) {
            if (i5 >= v6) {
                break;
            }
            T I6 = RecyclerView.I(recyclerView.f5356e.t(i5));
            if (I6 != null && !I6.i() && I6.f9895c == i2) {
                if (!((ArrayList) recyclerView.f5356e.d).contains(I6.f9893a)) {
                    t6 = I6;
                    break;
                }
                t6 = I6;
            }
            i5++;
        }
        if (t6 != null && !((ArrayList) recyclerView.f5356e.d).contains(t6.f9893a)) {
            return t6;
        }
        return null;
    }

    public void c(int i2, int i5) {
        int i6;
        int i7;
        RecyclerView recyclerView = this.f10066a;
        int v6 = recyclerView.f5356e.v();
        int i8 = i5 + i2;
        for (int i9 = 0; i9 < v6; i9++) {
            View t6 = recyclerView.f5356e.t(i9);
            T I6 = RecyclerView.I(t6);
            if (I6 != null && !I6.p() && (i7 = I6.f9895c) >= i2 && i7 < i8) {
                I6.a(2);
                I6.a(1024);
                ((C0805G) t6.getLayoutParams()).f9863c = true;
            }
        }
        C0770g gVar = recyclerView.f5351b;
        ArrayList arrayList = (ArrayList) gVar.f9494e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t7 = (T) arrayList.get(size);
            if (t7 != null && (i6 = t7.f9895c) >= i2 && i6 < i8) {
                t7.a(2);
                gVar.g(size);
            }
        }
        recyclerView.f5370p0 = true;
    }

    public void d(int i2, int i5) {
        RecyclerView recyclerView = this.f10066a;
        int v6 = recyclerView.f5356e.v();
        for (int i6 = 0; i6 < v6; i6++) {
            T I6 = RecyclerView.I(recyclerView.f5356e.t(i6));
            if (I6 != null && !I6.p() && I6.f9895c >= i2) {
                I6.m(i5, false);
                recyclerView.f5365l0.f9879f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f5351b.f9494e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            T t6 = (T) arrayList.get(i7);
            if (t6 != null && t6.f9895c >= i2) {
                t6.m(i5, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5368o0 = true;
    }

    public void e(int i2, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f10066a;
        int v6 = recyclerView.f5356e.v();
        int i13 = -1;
        if (i2 < i5) {
            i8 = i2;
            i7 = i5;
            i6 = -1;
        } else {
            i7 = i2;
            i8 = i5;
            i6 = 1;
        }
        for (int i14 = 0; i14 < v6; i14++) {
            T I6 = RecyclerView.I(recyclerView.f5356e.t(i14));
            if (I6 != null && (i12 = I6.f9895c) >= i8 && i12 <= i7) {
                if (i12 == i2) {
                    I6.m(i5 - i2, false);
                } else {
                    I6.m(i6, false);
                }
                recyclerView.f5365l0.f9879f = true;
            }
        }
        C0770g gVar = recyclerView.f5351b;
        gVar.getClass();
        if (i2 < i5) {
            i10 = i2;
            i9 = i5;
        } else {
            i9 = i2;
            i10 = i5;
            i13 = 1;
        }
        ArrayList arrayList = (ArrayList) gVar.f9494e;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            T t6 = (T) arrayList.get(i15);
            if (t6 != null && (i11 = t6.f9895c) >= i10 && i11 <= i9) {
                if (i11 == i2) {
                    t6.m(i5 - i2, false);
                } else {
                    t6.m(i13, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f5368o0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(m0.T r9, K.C0075o r10, K.C0075o r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f10066a
            r0.getClass()
            r1 = 0
            r9.o(r1)
            m0.C r1 = r0.f5342Q
            r2 = r1
            m0.h r2 = (m0.C0816h) r2
            if (r10 == 0) goto L_0x0029
            r2.getClass()
            int r4 = r10.f1411a
            int r6 = r11.f1411a
            if (r4 != r6) goto L_0x001f
            int r1 = r10.f1412b
            int r3 = r11.f1412b
            if (r1 == r3) goto L_0x0029
        L_0x001f:
            int r5 = r10.f1412b
            int r7 = r11.f1412b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L_0x0038
        L_0x0029:
            r2.l(r9)
            android.view.View r10 = r9.f9893a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f9974i
            r10.add(r9)
            r9 = 1
        L_0x0038:
            if (r9 == 0) goto L_0x003d
            r0.S()
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C0830w.f(m0.T, K.o, K.o):void");
    }

    public void g(T t6, C0075o oVar, C0075o oVar2) {
        int i2;
        int i5;
        boolean z3;
        RecyclerView recyclerView = this.f10066a;
        recyclerView.f5351b.o(t6);
        recyclerView.f(t6);
        t6.o(false);
        C0816h hVar = (C0816h) recyclerView.f5342Q;
        hVar.getClass();
        int i6 = oVar.f1411a;
        int i7 = oVar.f1412b;
        View view = t6.f9893a;
        if (oVar2 == null) {
            i2 = view.getLeft();
        } else {
            i2 = oVar2.f1411a;
        }
        int i8 = i2;
        if (oVar2 == null) {
            i5 = view.getTop();
        } else {
            i5 = oVar2.f1412b;
        }
        int i9 = i5;
        if (t6.i() || (i6 == i8 && i7 == i9)) {
            hVar.l(t6);
            hVar.h.add(t6);
            z3 = true;
        } else {
            view.layout(i8, i9, view.getWidth() + i8, view.getHeight() + i9);
            z3 = hVar.g(t6, i6, i7, i8, i9);
        }
        if (z3) {
            recyclerView.S();
        }
    }
}
