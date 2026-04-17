package t0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public m f11686a;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f11687b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: t0.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01e0 A[EDGE_INSN: B:130:0x01e0->B:87:0x01e0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
            r17 = this;
            r0 = r17
            android.widget.FrameLayout r1 = r0.f11687b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            r2.removeOnPreDrawListener(r0)
            r1.removeOnAttachStateChangeListener(r0)
            java.util.ArrayList r1 = t0.q.f11690c
            android.widget.FrameLayout r3 = r0.f11687b
            boolean r1 = r1.remove(r3)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            return r8
        L_0x001a:
            n.e r1 = t0.q.b()
            java.lang.Object r2 = r1.get(r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 != 0) goto L_0x0030
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.put(r3, r2)
        L_0x002e:
            r5 = 0
            goto L_0x003b
        L_0x0030:
            int r5 = r2.size()
            if (r5 <= 0) goto L_0x002e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
        L_0x003b:
            t0.m r9 = r0.f11686a
            r2.add(r9)
            t0.o r2 = new t0.o
            r2.<init>(r0, r1)
            r9.a(r2)
            r1 = 0
            r9.h(r3, r1)
            if (r5 == 0) goto L_0x0062
            java.util.Iterator r2 = r5.iterator()
        L_0x0052:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0062
            java.lang.Object r5 = r2.next()
            t0.m r5 = (t0.m) r5
            r5.z(r3)
            goto L_0x0052
        L_0x0062:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.f11677t = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.f11678u = r2
            S3.z r2 = r9.f11673p
            S3.z r5 = r9.f11674q
            n.e r6 = new n.e
            java.lang.Object r7 = r2.f2711b
            n.e r7 = (n.e) r7
            r6.<init>(r7)
            n.e r7 = new n.e
            java.lang.Object r10 = r5.f2711b
            n.e r10 = (n.e) r10
            r7.<init>(r10)
            r10 = r1
        L_0x0087:
            int[] r11 = r9.f11676s
            int r12 = r11.length
            if (r10 >= r12) goto L_0x01e0
            r11 = r11[r10]
            if (r11 == r8) goto L_0x019f
            r12 = 2
            if (r11 == r12) goto L_0x014e
            r12 = 3
            if (r11 == r12) goto L_0x00f6
            r12 = 4
            if (r11 == r12) goto L_0x009c
        L_0x0099:
            r1 = r2
            goto L_0x01d7
        L_0x009c:
            java.lang.Object r11 = r2.d
            n.g r11 = (n.g) r11
            int r12 = r11.e()
            r13 = r1
        L_0x00a5:
            if (r13 >= r12) goto L_0x0099
            java.lang.Object r14 = r11.f(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x00ee
            boolean r15 = r9.u(r14)
            if (r15 == 0) goto L_0x00ee
            r16 = r2
            long r1 = r11.c(r13)
            java.lang.Object r15 = r5.d
            n.g r15 = (n.g) r15
            java.lang.Object r1 = r15.b(r1)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x00f0
            boolean r2 = r9.u(r1)
            if (r2 == 0) goto L_0x00f0
            java.lang.Object r2 = r6.get(r14)
            t0.u r2 = (t0.u) r2
            java.lang.Object r15 = r7.get(r1)
            t0.u r15 = (t0.u) r15
            if (r2 == 0) goto L_0x00f0
            if (r15 == 0) goto L_0x00f0
            java.util.ArrayList r4 = r9.f11677t
            r4.add(r2)
            java.util.ArrayList r2 = r9.f11678u
            r2.add(r15)
            r6.remove(r14)
            r7.remove(r1)
            goto L_0x00f0
        L_0x00ee:
            r16 = r2
        L_0x00f0:
            int r13 = r13 + 1
            r2 = r16
            r1 = 0
            goto L_0x00a5
        L_0x00f6:
            r1 = r2
            java.lang.Object r2 = r1.f2712c
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            java.lang.Object r4 = r5.f2712c
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            int r11 = r2.size()
            r12 = 0
        L_0x0104:
            if (r12 >= r11) goto L_0x01d7
            java.lang.Object r13 = r2.valueAt(r12)
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L_0x0148
            boolean r14 = r9.u(r13)
            if (r14 == 0) goto L_0x0148
            int r14 = r2.keyAt(r12)
            java.lang.Object r14 = r4.get(r14)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0148
            boolean r15 = r9.u(r14)
            if (r15 == 0) goto L_0x0148
            java.lang.Object r15 = r6.get(r13)
            t0.u r15 = (t0.u) r15
            java.lang.Object r16 = r7.get(r14)
            r8 = r16
            t0.u r8 = (t0.u) r8
            if (r15 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            java.util.ArrayList r0 = r9.f11677t
            r0.add(r15)
            java.util.ArrayList r0 = r9.f11678u
            r0.add(r8)
            r6.remove(r13)
            r7.remove(r14)
        L_0x0148:
            int r12 = r12 + 1
            r0 = r17
            r8 = 1
            goto L_0x0104
        L_0x014e:
            r1 = r2
            java.lang.Object r0 = r1.f2713e
            n.e r0 = (n.e) r0
            java.lang.Object r2 = r5.f2713e
            n.e r2 = (n.e) r2
            int r4 = r0.f10226c
            r8 = 0
        L_0x015a:
            if (r8 >= r4) goto L_0x01d7
            java.lang.Object r11 = r0.j(r8)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x019c
            boolean r12 = r9.u(r11)
            if (r12 == 0) goto L_0x019c
            java.lang.Object r12 = r0.f(r8)
            java.lang.Object r12 = r2.get(r12)
            android.view.View r12 = (android.view.View) r12
            if (r12 == 0) goto L_0x019c
            boolean r13 = r9.u(r12)
            if (r13 == 0) goto L_0x019c
            java.lang.Object r13 = r6.get(r11)
            t0.u r13 = (t0.u) r13
            java.lang.Object r14 = r7.get(r12)
            t0.u r14 = (t0.u) r14
            if (r13 == 0) goto L_0x019c
            if (r14 == 0) goto L_0x019c
            java.util.ArrayList r15 = r9.f11677t
            r15.add(r13)
            java.util.ArrayList r13 = r9.f11678u
            r13.add(r14)
            r6.remove(r11)
            r7.remove(r12)
        L_0x019c:
            int r8 = r8 + 1
            goto L_0x015a
        L_0x019f:
            r1 = r2
            int r0 = r6.f10226c
            r2 = 1
            int r0 = r0 - r2
        L_0x01a4:
            if (r0 < 0) goto L_0x01d7
            java.lang.Object r2 = r6.f(r0)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x01d4
            boolean r4 = r9.u(r2)
            if (r4 == 0) goto L_0x01d4
            java.lang.Object r2 = r7.remove(r2)
            t0.u r2 = (t0.u) r2
            if (r2 == 0) goto L_0x01d4
            android.view.View r4 = r2.f11695b
            boolean r4 = r9.u(r4)
            if (r4 == 0) goto L_0x01d4
            java.lang.Object r4 = r6.h(r0)
            t0.u r4 = (t0.u) r4
            java.util.ArrayList r8 = r9.f11677t
            r8.add(r4)
            java.util.ArrayList r4 = r9.f11678u
            r4.add(r2)
        L_0x01d4:
            int r0 = r0 + -1
            goto L_0x01a4
        L_0x01d7:
            int r10 = r10 + 1
            r0 = r17
            r2 = r1
            r1 = 0
            r8 = 1
            goto L_0x0087
        L_0x01e0:
            r0 = 0
        L_0x01e1:
            int r1 = r6.f10226c
            if (r0 >= r1) goto L_0x0201
            java.lang.Object r1 = r6.j(r0)
            t0.u r1 = (t0.u) r1
            android.view.View r2 = r1.f11695b
            boolean r2 = r9.u(r2)
            if (r2 == 0) goto L_0x01fe
            java.util.ArrayList r2 = r9.f11677t
            r2.add(r1)
            java.util.ArrayList r1 = r9.f11678u
            r2 = 0
            r1.add(r2)
        L_0x01fe:
            int r0 = r0 + 1
            goto L_0x01e1
        L_0x0201:
            r1 = 0
        L_0x0202:
            int r0 = r7.f10226c
            if (r1 >= r0) goto L_0x0224
            java.lang.Object r0 = r7.j(r1)
            t0.u r0 = (t0.u) r0
            android.view.View r2 = r0.f11695b
            boolean r2 = r9.u(r2)
            if (r2 == 0) goto L_0x0220
            java.util.ArrayList r2 = r9.f11678u
            r2.add(r0)
            java.util.ArrayList r0 = r9.f11677t
            r2 = 0
            r0.add(r2)
            goto L_0x0221
        L_0x0220:
            r2 = 0
        L_0x0221:
            int r1 = r1 + 1
            goto L_0x0202
        L_0x0224:
            n.e r0 = t0.m.q()
            int r1 = r0.f10226c
            android.view.WindowId r2 = r3.getWindowId()
            r4 = 1
            int r1 = r1 - r4
        L_0x0230:
            if (r1 < 0) goto L_0x0294
            java.lang.Object r4 = r0.f(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x0291
            java.lang.Object r5 = r0.get(r4)
            t0.j r5 = (t0.j) r5
            if (r5 == 0) goto L_0x0291
            android.view.View r6 = r5.f11650a
            if (r6 == 0) goto L_0x0291
            android.view.WindowId r7 = r5.d
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x0291
            r7 = 1
            t0.u r8 = r9.s(r6, r7)
            t0.u r10 = r9.o(r6, r7)
            if (r8 != 0) goto L_0x0268
            if (r10 != 0) goto L_0x0268
            S3.z r7 = r9.f11674q
            java.lang.Object r7 = r7.f2711b
            n.e r7 = (n.e) r7
            java.lang.Object r6 = r7.get(r6)
            r10 = r6
            t0.u r10 = (t0.u) r10
        L_0x0268:
            if (r8 != 0) goto L_0x026c
            if (r10 == 0) goto L_0x0291
        L_0x026c:
            t0.u r6 = r5.f11652c
            t0.m r5 = r5.f11653e
            boolean r6 = r5.t(r6, r10)
            if (r6 == 0) goto L_0x0291
            t0.m r5 = r5.p()
            r5.getClass()
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x028e
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x028a
            goto L_0x028e
        L_0x028a:
            r0.remove(r4)
            goto L_0x0291
        L_0x028e:
            r4.cancel()
        L_0x0291:
            int r1 = r1 + -1
            goto L_0x0230
        L_0x0294:
            S3.z r4 = r9.f11673p
            S3.z r5 = r9.f11674q
            java.util.ArrayList r6 = r9.f11677t
            java.util.ArrayList r7 = r9.f11678u
            r2 = r9
            r2.m(r3, r4, r5, r6, r7)
            r9.A()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.p.onPreDraw():boolean");
    }

    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f11687b;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = q.f11690c;
        FrameLayout frameLayout2 = this.f11687b;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) q.b().get(frameLayout2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).z(frameLayout2);
            }
        }
        this.f11686a.i(true);
    }

    public final void onViewAttachedToWindow(View view) {
    }
}
