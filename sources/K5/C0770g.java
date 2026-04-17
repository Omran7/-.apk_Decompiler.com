package k5;

import K.C0062b;
import K.O;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.C0407l;
import h0.C0552a;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import m0.C0801C;
import m0.C0804F;
import m0.C0808J;
import m0.C0816h;
import m0.K;
import m0.T;
import m0.U;
import m0.V;
import n.h;
import n.k;

/* renamed from: k5.g  reason: case insensitive filesystem */
public final class C0770g {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f9491a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f9492b;

    /* renamed from: c  reason: collision with root package name */
    public int f9493c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public Object f9494e;

    /* renamed from: f  reason: collision with root package name */
    public Object f9495f;
    public Object g;
    public final /* synthetic */ ViewGroup h;

    public C0770g(HListView hListView) {
        this.h = hListView;
        this.f9494e = new View[0];
    }

    public static boolean m(int i2) {
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public void a(View view, int i2) {
        C0767d dVar = (C0767d) view.getLayoutParams();
        if (dVar != null) {
            dVar.d = i2;
            int i5 = dVar.f9487a;
            boolean hasTransientState = view.hasTransientState();
            if (!m(i5) || hasTransientState) {
                if (i5 != -2 || hasTransientState) {
                    if (this.f9492b == null) {
                        this.f9492b = new ArrayList();
                    }
                    this.f9492b.add(view);
                }
                if (hasTransientState) {
                    if (((k) this.g) == null) {
                        this.g = new k();
                    }
                    view.onStartTemporaryDetach();
                    ((k) this.g).g(i2, view);
                    return;
                }
                return;
            }
            view.onStartTemporaryDetach();
            if (this.d == 1) {
                this.f9491a.add(view);
            } else {
                ((ArrayList[]) this.f9495f)[i5].add(view);
            }
            view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        }
    }

    public void b(T t6, boolean z3) {
        C0062b bVar;
        RecyclerView.j(t6);
        RecyclerView recyclerView = (RecyclerView) this.h;
        V v6 = recyclerView.s0;
        if (v6 != null) {
            U u6 = v6.f9909e;
            View view = t6.f9893a;
            if (u6 != null) {
                bVar = (C0062b) u6.f9908e.remove(view);
            } else {
                bVar = null;
            }
            O.l(view, bVar);
        }
        if (z3 && recyclerView.f5365l0 != null) {
            recyclerView.f5358f.v(t6);
        }
        t6.f9907r = null;
        K e6 = e();
        e6.getClass();
        int i2 = t6.f9897f;
        ArrayList arrayList = e6.a(i2).f9864a;
        if (((C0808J) e6.f9867a.get(i2)).f9865b > arrayList.size()) {
            t6.n();
            arrayList.add(t6);
        }
    }

    public void c() {
        int i2 = this.d;
        HListView hListView = (HListView) this.h;
        if (i2 == 1) {
            ArrayList arrayList = this.f9491a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                hListView.removeDetachedView((View) arrayList.remove((size - 1) - i5), false);
            }
        } else {
            for (int i6 = 0; i6 < i2; i6++) {
                ArrayList arrayList2 = ((ArrayList[]) this.f9495f)[i6];
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    hListView.removeDetachedView((View) arrayList2.remove((size2 - 1) - i7), false);
                }
            }
        }
        k kVar = (k) this.g;
        if (kVar != null) {
            kVar.b();
        }
    }

    public int d(int i2) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i2 < 0 || i2 >= recyclerView.f5365l0.b()) {
            StringBuilder s6 = C0552a.s(i2, "invalid position ", ". State item count is ");
            s6.append(recyclerView.f5365l0.b());
            s6.append(recyclerView.y());
            throw new IndexOutOfBoundsException(s6.toString());
        } else if (!recyclerView.f5365l0.g) {
            return i2;
        } else {
            return recyclerView.d.h(i2, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [m0.K, java.lang.Object] */
    public K e() {
        if (((K) this.g) == null) {
            ? obj = new Object();
            obj.f9867a = new SparseArray();
            obj.f9868b = 0;
            this.g = obj;
        }
        return (K) this.g;
    }

    public void f() {
        ArrayList arrayList = (ArrayList) this.f9494e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f5323B0;
        C0407l lVar = ((RecyclerView) this.h).f5364k0;
        int[] iArr2 = (int[]) lVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        lVar.f6831c = 0;
    }

    public void g(int i2) {
        ArrayList arrayList = (ArrayList) this.f9494e;
        b((T) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    public void h(View view) {
        T I6 = RecyclerView.I(view);
        boolean k6 = I6.k();
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (k6) {
            recyclerView.removeDetachedView(view, false);
        }
        if (I6.j()) {
            I6.f9903n.o(I6);
        } else if (I6.q()) {
            I6.f9899j &= -33;
        }
        i(I6);
        if (recyclerView.f5342Q != null && !I6.h()) {
            recyclerView.f5342Q.d(I6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(m0.T r12) {
        /*
            r11 = this;
            boolean r0 = r12.j()
            r1 = 0
            r2 = 1
            android.view.ViewGroup r3 = r11.h
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            android.view.View r4 = r12.f9893a
            if (r0 != 0) goto L_0x00f6
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0016
            goto L_0x00f6
        L_0x0016:
            boolean r0 = r12.k()
            if (r0 != 0) goto L_0x00db
            boolean r0 = r12.p()
            if (r0 != 0) goto L_0x00c3
            int r0 = r12.f9899j
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0032
            java.util.WeakHashMap r0 = K.O.f1352a
            boolean r0 = r4.hasTransientState()
            if (r0 == 0) goto L_0x0032
            r0 = r2
            goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            m0.y r4 = r3.f5376t
            boolean r4 = r12.h()
            if (r4 == 0) goto L_0x00b3
            int r4 = r11.d
            if (r4 <= 0) goto L_0x00a9
            r4 = 526(0x20e, float:7.37E-43)
            boolean r4 = r12.d(r4)
            if (r4 != 0) goto L_0x00a9
            java.lang.Object r4 = r11.f9494e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r6 = r11.d
            if (r5 < r6) goto L_0x005a
            if (r5 <= 0) goto L_0x005a
            r11.g(r1)
            int r5 = r5 + -1
        L_0x005a:
            int[] r6 = androidx.recyclerview.widget.RecyclerView.f5323B0
            if (r5 <= 0) goto L_0x00a4
            com.google.crypto.tink.shaded.protobuf.l r6 = r3.f5364k0
            int r7 = r12.f9895c
            java.lang.Object r8 = r6.d
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L_0x007b
            int r8 = r6.f6831c
            int r8 = r8 * 2
            r9 = r1
        L_0x006d:
            if (r9 >= r8) goto L_0x007b
            java.lang.Object r10 = r6.d
            int[] r10 = (int[]) r10
            r10 = r10[r9]
            if (r10 != r7) goto L_0x0078
            goto L_0x00a4
        L_0x0078:
            int r9 = r9 + 2
            goto L_0x006d
        L_0x007b:
            int r5 = r5 - r2
        L_0x007c:
            if (r5 < 0) goto L_0x00a3
            java.lang.Object r6 = r4.get(r5)
            m0.T r6 = (m0.T) r6
            int r6 = r6.f9895c
            com.google.crypto.tink.shaded.protobuf.l r7 = r3.f5364k0
            java.lang.Object r8 = r7.d
            int[] r8 = (int[]) r8
            if (r8 == 0) goto L_0x00a3
            int r8 = r7.f6831c
            int r8 = r8 * 2
            r9 = r1
        L_0x0093:
            if (r9 >= r8) goto L_0x00a3
            java.lang.Object r10 = r7.d
            int[] r10 = (int[]) r10
            r10 = r10[r9]
            if (r10 != r6) goto L_0x00a0
            int r5 = r5 + -1
            goto L_0x007c
        L_0x00a0:
            int r9 = r9 + 2
            goto L_0x0093
        L_0x00a3:
            int r5 = r5 + r2
        L_0x00a4:
            r4.add(r5, r12)
            r4 = r2
            goto L_0x00aa
        L_0x00a9:
            r4 = r1
        L_0x00aa:
            if (r4 != 0) goto L_0x00b1
            r11.b(r12, r2)
        L_0x00af:
            r1 = r4
            goto L_0x00b4
        L_0x00b1:
            r2 = r1
            goto L_0x00af
        L_0x00b3:
            r2 = r1
        L_0x00b4:
            m0.a0 r3 = r3.f5358f
            r3.v(r12)
            if (r1 != 0) goto L_0x00c2
            if (r2 != 0) goto L_0x00c2
            if (r0 == 0) goto L_0x00c2
            r0 = 0
            r12.f9907r = r0
        L_0x00c2:
            return
        L_0x00c3:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            r0.<init>(r1)
            java.lang.String r1 = r3.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L_0x00db:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = r3.y()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
            throw r0
        L_0x00f6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Scrapped or attached views may not be recycled. isScrap:"
            r5.<init>(r6)
            boolean r12 = r12.j()
            r5.append(r12)
            java.lang.String r12 = " isAttached:"
            r5.append(r12)
            android.view.ViewParent r12 = r4.getParent()
            if (r12 == 0) goto L_0x0112
            r1 = r2
        L_0x0112:
            r5.append(r1)
            java.lang.String r12 = r3.y()
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C0770g.i(m0.T):void");
    }

    public void j() {
        ArrayList arrayList = this.f9492b;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((HListView) this.h).removeDetachedView((View) this.f9492b.get(i2), false);
            }
            this.f9492b.clear();
        }
    }

    public void k() {
        boolean z3;
        HListView hListView;
        View[] viewArr = (View[]) this.f9494e;
        int i2 = 0;
        if (this.d > 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = this.f9491a;
        int length = viewArr.length - 1;
        while (true) {
            hListView = (HListView) this.h;
            if (length < 0) {
                break;
            }
            View view = viewArr[length];
            if (view != null) {
                C0767d dVar = (C0767d) view.getLayoutParams();
                int i5 = dVar.f9487a;
                viewArr[length] = null;
                boolean hasTransientState = view.hasTransientState();
                if (!m(i5) || hasTransientState) {
                    if (i5 != -2 || hasTransientState) {
                        hListView.removeDetachedView(view, false);
                    }
                    if (hasTransientState) {
                        if (((k) this.g) == null) {
                            this.g = new k();
                        }
                        ((k) this.g).g(this.f9493c + length, view);
                    }
                } else {
                    if (z3) {
                        arrayList = ((ArrayList[]) this.f9495f)[i5];
                    }
                    view.onStartTemporaryDetach();
                    dVar.d = this.f9493c + length;
                    arrayList.add(view);
                    view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
                }
            }
            length--;
        }
        int length2 = ((View[]) this.f9494e).length;
        int i6 = this.d;
        ArrayList[] arrayListArr = (ArrayList[]) this.f9495f;
        for (int i7 = 0; i7 < i6; i7++) {
            ArrayList arrayList2 = arrayListArr[i7];
            int size = arrayList2.size();
            int i8 = size - length2;
            int i9 = size - 1;
            int i10 = 0;
            while (i10 < i8) {
                hListView.removeDetachedView((View) arrayList2.remove(i9), false);
                i10++;
                i9--;
            }
        }
        if (((k) this.g) != null) {
            while (i2 < ((k) this.g).h()) {
                if (!((View) ((k) this.g).i(i2)).hasTransientState()) {
                    k kVar = (k) this.g;
                    Object[] objArr = kVar.f10229c;
                    Object obj = objArr[i2];
                    Object obj2 = h.f10223b;
                    if (obj != obj2) {
                        objArr[i2] = obj2;
                        kVar.f10227a = true;
                    }
                    i2--;
                }
                i2++;
            }
        }
    }

    public void l(View view) {
        C0801C c3;
        T I6 = RecyclerView.I(view);
        boolean d6 = I6.d(12);
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (!d6 && I6.l() && (c3 = recyclerView.f5342Q) != null) {
            C0816h hVar = (C0816h) c3;
            if (I6.c().isEmpty() && hVar.g && !I6.g()) {
                if (this.f9492b == null) {
                    this.f9492b = new ArrayList();
                }
                I6.f9903n = this;
                I6.f9904o = true;
                this.f9492b.add(I6);
                return;
            }
        }
        if (!I6.g() || I6.i() || recyclerView.f5376t.f10069b) {
            I6.f9903n = this;
            I6.f9904o = false;
            this.f9491a.add(I6);
            return;
        }
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.y());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: m0.T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: m0.T} */
    /* JADX WARNING: type inference failed for: r2v42, types: [java.lang.Object, K.o] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01cf, code lost:
        if (r11.f9897f != 0) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02cd, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0411, code lost:
        if (r11.g() == false) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x043b, code lost:
        if ((r14 + r12) >= r27) goto L_0x0414;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x051a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0.T n(int r26, long r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = -1
            r3 = 1
            android.view.ViewGroup r4 = r1.h
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r0 < 0) goto L_0x0522
            m0.P r5 = r4.f5365l0
            int r5 = r5.b()
            if (r0 >= r5) goto L_0x0522
            m0.P r5 = r4.f5365l0
            boolean r6 = r5.g
            r8 = 0
            r9 = 32
            if (r6 == 0) goto L_0x0086
            java.util.ArrayList r6 = r1.f9492b
            if (r6 == 0) goto L_0x007f
            int r6 = r6.size()
            if (r6 != 0) goto L_0x0028
            goto L_0x007f
        L_0x0028:
            r10 = r8
        L_0x0029:
            if (r10 >= r6) goto L_0x0045
            java.util.ArrayList r11 = r1.f9492b
            java.lang.Object r11 = r11.get(r10)
            m0.T r11 = (m0.T) r11
            boolean r12 = r11.q()
            if (r12 != 0) goto L_0x0043
            int r12 = r11.b()
            if (r12 != r0) goto L_0x0043
            r11.a(r9)
            goto L_0x0080
        L_0x0043:
            int r10 = r10 + r3
            goto L_0x0029
        L_0x0045:
            m0.y r10 = r4.f5376t
            boolean r10 = r10.f10069b
            if (r10 == 0) goto L_0x007f
            F3.k r10 = r4.d
            int r10 = r10.h(r0, r8)
            if (r10 <= 0) goto L_0x007f
            m0.y r11 = r4.f5376t
            int r11 = r11.a()
            if (r10 >= r11) goto L_0x007f
            m0.y r11 = r4.f5376t
            long r10 = r11.b(r10)
            r12 = r8
        L_0x0062:
            if (r12 >= r6) goto L_0x007f
            java.util.ArrayList r13 = r1.f9492b
            java.lang.Object r13 = r13.get(r12)
            m0.T r13 = (m0.T) r13
            boolean r14 = r13.q()
            if (r14 != 0) goto L_0x007d
            long r14 = r13.f9896e
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x007d
            r13.a(r9)
            r11 = r13
            goto L_0x0080
        L_0x007d:
            int r12 = r12 + r3
            goto L_0x0062
        L_0x007f:
            r11 = 0
        L_0x0080:
            if (r11 == 0) goto L_0x0084
            r6 = r3
            goto L_0x0088
        L_0x0084:
            r6 = r8
            goto L_0x0088
        L_0x0086:
            r6 = r8
            r11 = 0
        L_0x0088:
            java.lang.Object r10 = r1.f9494e
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.ArrayList r12 = r1.f9491a
            if (r11 != 0) goto L_0x022b
            int r11 = r12.size()
            r13 = r8
        L_0x0095:
            if (r13 >= r11) goto L_0x00c1
            java.lang.Object r14 = r12.get(r13)
            m0.T r14 = (m0.T) r14
            boolean r15 = r14.q()
            if (r15 != 0) goto L_0x00bf
            int r15 = r14.b()
            if (r15 != r0) goto L_0x00bf
            boolean r15 = r14.g()
            if (r15 != 0) goto L_0x00bf
            boolean r15 = r5.g
            if (r15 != 0) goto L_0x00b9
            boolean r15 = r14.i()
            if (r15 != 0) goto L_0x00bf
        L_0x00b9:
            r14.a(r9)
            r11 = r14
            goto L_0x01ad
        L_0x00bf:
            int r13 = r13 + r3
            goto L_0x0095
        L_0x00c1:
            c1.i r11 = r4.f5356e
            java.lang.Object r11 = r11.d
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r13 = r11.size()
            r14 = r8
        L_0x00cc:
            if (r14 >= r13) goto L_0x00ed
            java.lang.Object r15 = r11.get(r14)
            android.view.View r15 = (android.view.View) r15
            m0.T r16 = androidx.recyclerview.widget.RecyclerView.I(r15)
            int r7 = r16.b()
            if (r7 != r0) goto L_0x00eb
            boolean r7 = r16.g()
            if (r7 != 0) goto L_0x00eb
            boolean r7 = r16.i()
            if (r7 != 0) goto L_0x00eb
            goto L_0x00ee
        L_0x00eb:
            int r14 = r14 + r3
            goto L_0x00cc
        L_0x00ed:
            r15 = 0
        L_0x00ee:
            if (r15 == 0) goto L_0x0186
            m0.T r7 = androidx.recyclerview.widget.RecyclerView.I(r15)
            c1.i r11 = r4.f5356e
            java.lang.Object r13 = r11.f5605b
            m0.x r13 = (m0.C0831x) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.f10067a
            int r13 = r13.indexOfChild(r15)
            if (r13 < 0) goto L_0x0172
            java.lang.Object r14 = r11.f5606c
            K4.u r14 = (K4.u) r14
            boolean r16 = r14.e(r13)
            if (r16 == 0) goto L_0x015e
            r14.a(r13)
            r11.L(r15)
            c1.i r11 = r4.f5356e
            java.lang.Object r13 = r11.f5605b
            m0.x r13 = (m0.C0831x) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.f10067a
            int r13 = r13.indexOfChild(r15)
            if (r13 != r2) goto L_0x0122
        L_0x0120:
            r13 = r2
            goto L_0x0132
        L_0x0122:
            java.lang.Object r11 = r11.f5606c
            K4.u r11 = (K4.u) r11
            boolean r14 = r11.e(r13)
            if (r14 == 0) goto L_0x012d
            goto L_0x0120
        L_0x012d:
            int r11 = r11.b(r13)
            int r13 = r13 - r11
        L_0x0132:
            if (r13 == r2) goto L_0x0143
            c1.i r11 = r4.f5356e
            r11.e(r13)
            r1.l(r15)
            r11 = 8224(0x2020, float:1.1524E-41)
            r7.a(r11)
            r11 = r7
            goto L_0x01ad
        L_0x0143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = r4.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x015e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0172:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0186:
            int r7 = r10.size()
            r11 = r8
        L_0x018b:
            if (r11 >= r7) goto L_0x01ac
            java.lang.Object r13 = r10.get(r11)
            m0.T r13 = (m0.T) r13
            boolean r14 = r13.g()
            if (r14 != 0) goto L_0x01aa
            int r14 = r13.b()
            if (r14 != r0) goto L_0x01aa
            boolean r14 = r13.e()
            if (r14 != 0) goto L_0x01aa
            r10.remove(r11)
            r11 = r13
            goto L_0x01ad
        L_0x01aa:
            int r11 = r11 + r3
            goto L_0x018b
        L_0x01ac:
            r11 = 0
        L_0x01ad:
            if (r11 == 0) goto L_0x022b
            boolean r7 = r11.i()
            if (r7 == 0) goto L_0x01b8
            boolean r7 = r5.g
            goto L_0x01e6
        L_0x01b8:
            int r7 = r11.f9895c
            if (r7 < 0) goto L_0x0210
            m0.y r13 = r4.f5376t
            int r13 = r13.a()
            if (r7 >= r13) goto L_0x0210
            boolean r7 = r5.g
            if (r7 != 0) goto L_0x01d3
            m0.y r7 = r4.f5376t
            r7.getClass()
            int r7 = r11.f9897f
            if (r7 == 0) goto L_0x01d3
        L_0x01d1:
            r7 = r8
            goto L_0x01e6
        L_0x01d3:
            m0.y r7 = r4.f5376t
            boolean r13 = r7.f10069b
            if (r13 == 0) goto L_0x01e5
            long r13 = r11.f9896e
            int r15 = r11.f9895c
            long r15 = r7.b(r15)
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x01d1
        L_0x01e5:
            r7 = r3
        L_0x01e6:
            if (r7 != 0) goto L_0x020e
            r7 = 4
            r11.a(r7)
            boolean r7 = r11.j()
            if (r7 == 0) goto L_0x01fd
            android.view.View r7 = r11.f9893a
            r4.removeDetachedView(r7, r8)
            k5.g r7 = r11.f9903n
            r7.o(r11)
            goto L_0x0209
        L_0x01fd:
            boolean r7 = r11.q()
            if (r7 == 0) goto L_0x0209
            int r7 = r11.f9899j
            r7 = r7 & -33
            r11.f9899j = r7
        L_0x0209:
            r1.i(r11)
            r11 = 0
            goto L_0x022b
        L_0x020e:
            r6 = r3
            goto L_0x022b
        L_0x0210:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = r4.y()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x022b:
            r18 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r11 != 0) goto L_0x039b
            F3.k r7 = r4.d
            int r7 = r7.h(r0, r8)
            if (r7 < 0) goto L_0x039d
            m0.y r13 = r4.f5376t
            int r13 = r13.a()
            if (r7 >= r13) goto L_0x039d
            m0.y r13 = r4.f5376t
            r13.getClass()
            m0.y r13 = r4.f5376t
            boolean r14 = r13.f10069b
            if (r14 == 0) goto L_0x02d7
            long r13 = r13.b(r7)
            int r11 = r12.size()
            int r11 = r11 - r3
        L_0x0258:
            if (r11 < 0) goto L_0x02a7
            java.lang.Object r24 = r12.get(r11)
            r15 = r24
            m0.T r15 = (m0.T) r15
            long r2 = r15.f9896e
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x02a3
            boolean r2 = r15.q()
            if (r2 != 0) goto L_0x02a3
            int r2 = r15.f9897f
            if (r2 != 0) goto L_0x0289
            r15.a(r9)
            boolean r2 = r15.i()
            if (r2 == 0) goto L_0x0287
            boolean r2 = r5.g
            if (r2 != 0) goto L_0x0287
            int r2 = r15.f9899j
            r2 = r2 & -15
            r2 = r2 | 2
            r15.f9899j = r2
        L_0x0287:
            r11 = r15
            goto L_0x02d2
        L_0x0289:
            r12.remove(r11)
            android.view.View r2 = r15.f9893a
            r4.removeDetachedView(r2, r8)
            m0.T r2 = androidx.recyclerview.widget.RecyclerView.I(r2)
            r3 = 0
            r2.f9903n = r3
            r2.f9904o = r8
            int r3 = r2.f9899j
            r3 = r3 & -33
            r2.f9899j = r3
            r1.i(r2)
        L_0x02a3:
            r2 = -1
            int r11 = r11 + r2
            r3 = 1
            goto L_0x0258
        L_0x02a7:
            int r2 = r10.size()
            r3 = 1
            int r2 = r2 - r3
        L_0x02ad:
            if (r2 < 0) goto L_0x02cd
            java.lang.Object r3 = r10.get(r2)
            m0.T r3 = (m0.T) r3
            long r11 = r3.f9896e
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x02cf
            boolean r9 = r3.e()
            if (r9 != 0) goto L_0x02cf
            int r9 = r3.f9897f
            if (r9 != 0) goto L_0x02ca
            r10.remove(r2)
            r11 = r3
            goto L_0x02d2
        L_0x02ca:
            r1.g(r2)
        L_0x02cd:
            r11 = 0
            goto L_0x02d2
        L_0x02cf:
            r3 = -1
            int r2 = r2 + r3
            goto L_0x02ad
        L_0x02d2:
            if (r11 == 0) goto L_0x02d7
            r11.f9895c = r7
            r6 = 1
        L_0x02d7:
            if (r11 != 0) goto L_0x0317
            m0.K r2 = r25.e()
            android.util.SparseArray r2 = r2.f9867a
            java.lang.Object r2 = r2.get(r8)
            m0.J r2 = (m0.C0808J) r2
            if (r2 == 0) goto L_0x030e
            java.util.ArrayList r2 = r2.f9864a
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x030e
            int r3 = r2.size()
            r7 = 1
            int r3 = r3 - r7
        L_0x02f5:
            if (r3 < 0) goto L_0x030e
            java.lang.Object r7 = r2.get(r3)
            m0.T r7 = (m0.T) r7
            boolean r7 = r7.e()
            if (r7 != 0) goto L_0x030b
            java.lang.Object r2 = r2.remove(r3)
            r3 = r2
            m0.T r3 = (m0.T) r3
            goto L_0x030f
        L_0x030b:
            r7 = -1
            int r3 = r3 + r7
            goto L_0x02f5
        L_0x030e:
            r3 = 0
        L_0x030f:
            if (r3 == 0) goto L_0x0316
            r3.n()
            int[] r2 = androidx.recyclerview.widget.RecyclerView.f5323B0
        L_0x0316:
            r11 = r3
        L_0x0317:
            if (r11 != 0) goto L_0x039b
            long r2 = r4.getNanoTime()
            int r7 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x033c
            java.lang.Object r7 = r1.g
            m0.K r7 = (m0.K) r7
            m0.J r7 = r7.a(r8)
            long r9 = r7.f9866c
            int r7 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x0337
            long r9 = r9 + r2
            int r7 = (r9 > r27 ? 1 : (r9 == r27 ? 0 : -1))
            if (r7 >= 0) goto L_0x0335
            goto L_0x0337
        L_0x0335:
            r7 = r8
            goto L_0x0338
        L_0x0337:
            r7 = 1
        L_0x0338:
            if (r7 != 0) goto L_0x033c
            r9 = 0
            return r9
        L_0x033c:
            r9 = 0
            m0.y r7 = r4.f5376t
            r7.getClass()
            java.lang.String r10 = "RV CreateView"
            int r11 = G.l.f807a     // Catch:{ all -> 0x038b }
            android.os.Trace.beginSection(r10)     // Catch:{ all -> 0x038b }
            m0.T r11 = r7.d(r4)     // Catch:{ all -> 0x038b }
            android.view.View r7 = r11.f9893a
            android.view.ViewParent r10 = r7.getParent()     // Catch:{ all -> 0x038b }
            if (r10 != 0) goto L_0x038d
            r11.f9897f = r8     // Catch:{ all -> 0x038b }
            android.os.Trace.endSection()
            int[] r10 = androidx.recyclerview.widget.RecyclerView.f5323B0
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.D(r7)
            if (r7 == 0) goto L_0x0369
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r10.<init>(r7)
            r11.f9894b = r10
        L_0x0369:
            long r12 = r4.getNanoTime()
            java.lang.Object r7 = r1.g
            m0.K r7 = (m0.K) r7
            long r12 = r12 - r2
            m0.J r2 = r7.a(r8)
            long r14 = r2.f9866c
            int r3 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r3 != 0) goto L_0x037d
            goto L_0x0388
        L_0x037d:
            r16 = 4
            long r14 = r14 / r16
            r22 = 3
            long r14 = r14 * r22
            long r12 = r12 / r16
            long r12 = r12 + r14
        L_0x0388:
            r2.f9866c = r12
            goto L_0x03bf
        L_0x038b:
            r0 = move-exception
            goto L_0x0395
        L_0x038d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038b }
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch:{ all -> 0x038b }
            throw r0     // Catch:{ all -> 0x038b }
        L_0x0395:
            int r2 = G.l.f807a
            android.os.Trace.endSection()
            throw r0
        L_0x039b:
            r9 = 0
            goto L_0x03bf
        L_0x039d:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "Inconsistency detected. Invalid item position "
            java.lang.String r6 = "(offset:"
            java.lang.String r8 = ").state:"
            java.lang.StringBuilder r0 = com.google.android.gms.internal.measurement.a.h(r3, r0, r6, r7, r8)
            int r3 = r5.b()
            r0.append(r3)
            java.lang.String r3 = r4.y()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x03bf:
            if (r6 == 0) goto L_0x03ed
            boolean r2 = r5.g
            if (r2 != 0) goto L_0x03ed
            r2 = 8192(0x2000, float:1.14794E-41)
            boolean r2 = r11.d(r2)
            if (r2 == 0) goto L_0x03ed
            int r2 = r11.f9899j
            r2 = r2 & -8193(0xffffffffffffdfff, float:NaN)
            r11.f9899j = r2
            boolean r2 = r5.f9881j
            if (r2 == 0) goto L_0x03ed
            m0.C0801C.b(r11)
            m0.C r2 = r4.f5342Q
            r11.c()
            r2.getClass()
            K.o r2 = new K.o
            r2.<init>()
            r2.a(r11)
            r4.T(r11, r2)
        L_0x03ed:
            boolean r2 = r5.g
            android.view.View r3 = r11.f9893a
            if (r2 == 0) goto L_0x03fc
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x03fc
            r11.g = r0
            goto L_0x0414
        L_0x03fc:
            boolean r2 = r11.f()
            if (r2 == 0) goto L_0x0418
            int r2 = r11.f9899j
            r2 = r2 & 2
            if (r2 == 0) goto L_0x040a
            r2 = 1
            goto L_0x040b
        L_0x040a:
            r2 = r8
        L_0x040b:
            if (r2 != 0) goto L_0x0418
            boolean r2 = r11.g()
            if (r2 == 0) goto L_0x0414
            goto L_0x0418
        L_0x0414:
            r0 = r8
            r2 = 1
            goto L_0x04f3
        L_0x0418:
            F3.k r2 = r4.d
            int r2 = r2.h(r0, r8)
            r11.f9907r = r4
            int r7 = r11.f9897f
            long r12 = r4.getNanoTime()
            int r10 = (r27 > r20 ? 1 : (r27 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x043d
            java.lang.Object r10 = r1.g
            m0.K r10 = (m0.K) r10
            m0.J r7 = r10.a(r7)
            long r14 = r7.d
            int r7 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x043d
            long r14 = r14 + r12
            int r7 = (r14 > r27 ? 1 : (r14 == r27 ? 0 : -1))
            if (r7 >= 0) goto L_0x0414
        L_0x043d:
            m0.y r7 = r4.f5376t
            r7.getClass()
            r11.f9895c = r2
            boolean r10 = r7.f10069b
            if (r10 == 0) goto L_0x044e
            long r14 = r7.b(r2)
            r11.f9896e = r14
        L_0x044e:
            int r10 = r11.f9899j
            r10 = r10 & -520(0xfffffffffffffdf8, float:NaN)
            r14 = 1
            r10 = r10 | r14
            r11.f9899j = r10
            int r10 = G.l.f807a
            java.lang.String r10 = "RV OnBindView"
            android.os.Trace.beginSection(r10)
            r11.c()
            r7.c(r11, r2)
            java.util.ArrayList r2 = r11.f9900k
            if (r2 == 0) goto L_0x046a
            r2.clear()
        L_0x046a:
            int r2 = r11.f9899j
            r2 = r2 & -1025(0xfffffffffffffbff, float:NaN)
            r11.f9899j = r2
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r7 = r2 instanceof m0.C0805G
            if (r7 == 0) goto L_0x047d
            m0.G r2 = (m0.C0805G) r2
            r7 = 1
            r2.f9863c = r7
        L_0x047d:
            android.os.Trace.endSection()
            long r14 = r4.getNanoTime()
            java.lang.Object r2 = r1.g
            m0.K r2 = (m0.K) r2
            int r7 = r11.f9897f
            long r14 = r14 - r12
            m0.J r2 = r2.a(r7)
            long r12 = r2.d
            int r7 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r7 != 0) goto L_0x0496
            goto L_0x04a1
        L_0x0496:
            r16 = 4
            long r12 = r12 / r16
            r18 = 3
            long r12 = r12 * r18
            long r14 = r14 / r16
            long r14 = r14 + r12
        L_0x04a1:
            r2.d = r14
            android.view.accessibility.AccessibilityManager r2 = r4.f5332G
            if (r2 == 0) goto L_0x04af
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x04af
            r2 = 1
            goto L_0x04b0
        L_0x04af:
            r2 = r8
        L_0x04b0:
            if (r2 == 0) goto L_0x04eb
            java.util.WeakHashMap r2 = K.O.f1352a
            int r2 = r3.getImportantForAccessibility()
            if (r2 != 0) goto L_0x04bf
            r2 = 1
            r3.setImportantForAccessibility(r2)
            goto L_0x04c0
        L_0x04bf:
            r2 = 1
        L_0x04c0:
            m0.V r7 = r4.s0
            if (r7 != 0) goto L_0x04c5
            goto L_0x04ec
        L_0x04c5:
            m0.U r7 = r7.f9909e
            if (r7 == 0) goto L_0x04e7
            android.view.View$AccessibilityDelegate r10 = K.O.c(r3)
            if (r10 != 0) goto L_0x04d0
            goto L_0x04de
        L_0x04d0:
            boolean r9 = r10 instanceof K.C0061a
            if (r9 == 0) goto L_0x04d9
            K.a r10 = (K.C0061a) r10
            K.b r9 = r10.f1363a
            goto L_0x04de
        L_0x04d9:
            K.b r9 = new K.b
            r9.<init>(r10)
        L_0x04de:
            if (r9 == 0) goto L_0x04e7
            if (r9 == r7) goto L_0x04e7
            java.util.WeakHashMap r10 = r7.f9908e
            r10.put(r3, r9)
        L_0x04e7:
            K.O.l(r3, r7)
            goto L_0x04ec
        L_0x04eb:
            r2 = 1
        L_0x04ec:
            boolean r5 = r5.g
            if (r5 == 0) goto L_0x04f2
            r11.g = r0
        L_0x04f2:
            r0 = r2
        L_0x04f3:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            if (r5 != 0) goto L_0x0503
            android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
            m0.G r4 = (m0.C0805G) r4
            r3.setLayoutParams(r4)
            goto L_0x0516
        L_0x0503:
            boolean r7 = r4.checkLayoutParams(r5)
            if (r7 != 0) goto L_0x0513
            android.view.ViewGroup$LayoutParams r4 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r5)
            m0.G r4 = (m0.C0805G) r4
            r3.setLayoutParams(r4)
            goto L_0x0516
        L_0x0513:
            r4 = r5
            m0.G r4 = (m0.C0805G) r4
        L_0x0516:
            r4.f9861a = r11
            if (r6 == 0) goto L_0x051e
            if (r0 == 0) goto L_0x051e
            r3 = r2
            goto L_0x051f
        L_0x051e:
            r3 = r8
        L_0x051f:
            r4.d = r3
            return r11
        L_0x0522:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = "Invalid item position "
            java.lang.String r5 = "("
            java.lang.String r6 = "). Item count:"
            java.lang.StringBuilder r0 = com.google.android.gms.internal.measurement.a.h(r3, r0, r5, r0, r6)
            m0.P r3 = r4.f5365l0
            int r3 = r3.b()
            r0.append(r3)
            java.lang.String r3 = r4.y()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C0770g.n(int, long):m0.T");
    }

    public void o(T t6) {
        if (t6.f9904o) {
            this.f9492b.remove(t6);
        } else {
            this.f9491a.remove(t6);
        }
        t6.f9903n = null;
        t6.f9904o = false;
        t6.f9899j &= -33;
    }

    public void p() {
        int i2;
        C0804F f6 = ((RecyclerView) this.h).f5378u;
        if (f6 != null) {
            i2 = f6.f9855j;
        } else {
            i2 = 0;
        }
        this.d = this.f9493c + i2;
        ArrayList arrayList = (ArrayList) this.f9494e;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.d; size--) {
            g(size);
        }
    }

    public C0770g(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f9491a = arrayList;
        this.f9492b = null;
        this.f9494e = new ArrayList();
        this.f9495f = Collections.unmodifiableList(arrayList);
        this.f9493c = 2;
        this.d = 2;
    }
}
