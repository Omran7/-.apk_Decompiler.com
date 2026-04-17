package m0;

import K.C0062b;
import L.j;
import U3.c;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import k5.C0770g;

public final class U extends C0062b {
    public final V d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakHashMap f9908e = new WeakHashMap();

    public U(V v6) {
        this.d = v6;
    }

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0062b bVar = (C0062b) this.f9908e.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return this.f1369a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final c b(View view) {
        C0062b bVar = (C0062b) this.f9908e.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0062b bVar = (C0062b) this.f9908e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, j jVar) {
        V v6 = this.d;
        boolean K6 = v6.d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f1369a;
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f1702a;
        if (!K6) {
            RecyclerView recyclerView = v6.d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, jVar);
                C0062b bVar = (C0062b) this.f9908e.get(view);
                if (bVar != null) {
                    bVar.d(view, jVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0062b bVar = (C0062b) this.f9908e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0062b bVar = (C0062b) this.f9908e.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.f1369a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i2, Bundle bundle) {
        V v6 = this.d;
        if (!v6.d.K()) {
            RecyclerView recyclerView = v6.d;
            if (recyclerView.getLayoutManager() != null) {
                C0062b bVar = (C0062b) this.f9908e.get(view);
                if (bVar != null) {
                    if (bVar.g(view, i2, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i2, bundle)) {
                    return true;
                }
                C0770g gVar = recyclerView.getLayoutManager().f9850b.f5351b;
                return false;
            }
        }
        return super.g(view, i2, bundle);
    }

    public final void h(View view, int i2) {
        C0062b bVar = (C0062b) this.f9908e.get(view);
        if (bVar != null) {
            bVar.h(view, i2);
        } else {
            super.h(view, i2);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0062b bVar = (C0062b) this.f9908e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
