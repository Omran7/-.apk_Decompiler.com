package m0;

import K.C0062b;
import L.j;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import k5.C0770g;

public final class V extends C0062b {
    public final RecyclerView d;

    /* renamed from: e  reason: collision with root package name */
    public final U f9909e;

    public V(RecyclerView recyclerView) {
        this.d = recyclerView;
        U u6 = this.f9909e;
        if (u6 != null) {
            this.f9909e = u6;
        } else {
            this.f9909e = new U(this);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.K()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().T(accessibilityEvent);
            }
        }
    }

    public final void d(View view, j jVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1369a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f1702a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.K() && recyclerView.getLayoutManager() != null) {
            C0804F layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f9850b;
            C0770g gVar = recyclerView2.f5351b;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f9850b.canScrollHorizontally(-1)) {
                jVar.a(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f9850b.canScrollVertically(1) || layoutManager.f9850b.canScrollHorizontally(1)) {
                jVar.a(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            P p6 = recyclerView2.f5365l0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(gVar, p6), layoutManager.x(gVar, p6), false, 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r4 = r3.d
            boolean r0 = r4.K()
            r1 = 0
            if (r0 != 0) goto L_0x008d
            m0.F r0 = r4.getLayoutManager()
            if (r0 == 0) goto L_0x008d
            m0.F r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f9850b
            k5.g r2 = r0.f5351b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L_0x0058
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L_0x002a
            r5 = r1
            r0 = r5
            goto L_0x0081
        L_0x002a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L_0x003f
            int r0 = r4.f9860o
            int r2 = r4.G()
            int r0 = r0 - r2
            int r2 = r4.D()
            int r0 = r0 - r2
            int r0 = -r0
            goto L_0x0040
        L_0x003f:
            r0 = r1
        L_0x0040:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f9850b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L_0x0056
            int r5 = r4.f9859n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x0081
        L_0x0056:
            r5 = r1
            goto L_0x0081
        L_0x0058:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L_0x006c
            int r5 = r4.f9860o
            int r0 = r4.G()
            int r5 = r5 - r0
            int r0 = r4.D()
            int r5 = r5 - r0
            r0 = r5
            goto L_0x006d
        L_0x006c:
            r0 = r1
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f9850b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L_0x0056
            int r5 = r4.f9859n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
        L_0x0081:
            if (r0 != 0) goto L_0x0087
            if (r5 != 0) goto L_0x0087
            r6 = r1
            goto L_0x008c
        L_0x0087:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f9850b
            r4.Z(r5, r0, r6)
        L_0x008c:
            return r6
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.V.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
