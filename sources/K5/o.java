package k5;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;

public abstract class o extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public AccessibilityManager f9572A;

    /* renamed from: B  reason: collision with root package name */
    public int f9573B;

    /* renamed from: C  reason: collision with root package name */
    public long f9574C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f9575D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f9576E;
    public C0764a F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f9577G;

    /* renamed from: a  reason: collision with root package name */
    public int f9578a;

    /* renamed from: b  reason: collision with root package name */
    public int f9579b;

    /* renamed from: c  reason: collision with root package name */
    public int f9580c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f9581e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9582f;

    /* renamed from: p  reason: collision with root package name */
    public int f9583p;

    /* renamed from: q  reason: collision with root package name */
    public int f9584q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9585r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9586s;

    /* renamed from: t  reason: collision with root package name */
    public int f9587t;

    /* renamed from: u  reason: collision with root package name */
    public long f9588u;

    /* renamed from: v  reason: collision with root package name */
    public int f9589v;

    /* renamed from: w  reason: collision with root package name */
    public long f9590w;

    /* renamed from: x  reason: collision with root package name */
    public View f9591x;

    /* renamed from: y  reason: collision with root package name */
    public int f9592y;

    /* renamed from: z  reason: collision with root package name */
    public int f9593z;

    public final void a() {
        boolean z3;
        boolean z4;
        boolean z5;
        Adapter adapter = getAdapter();
        boolean z6 = true;
        if (adapter == null || adapter.getCount() == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3 || !this.f9576E) {
            z4 = false;
        } else {
            z4 = true;
        }
        super.setFocusableInTouchMode(z4);
        if (!z3 || !this.f9575D) {
            z5 = false;
        } else {
            z5 = true;
        }
        super.setFocusable(z5);
        if (this.f9591x != null) {
            if (adapter != null && !adapter.isEmpty()) {
                z6 = false;
            }
            g(z6);
        }
    }

    public final void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public final void b() {
        if (this.f9589v != this.f9573B || this.f9590w != this.f9574C) {
            if (this.f9572A.isEnabled()) {
                if (this.f9585r || this.f9577G) {
                    if (this.F == null) {
                        this.F = new C0764a((C0773j) this, 2);
                    }
                    post(this.F);
                } else if (this.f9572A.isEnabled() && getSelectedItemPosition() >= 0) {
                    sendAccessibilityEvent(4);
                }
            }
            this.f9573B = this.f9589v;
            this.f9574C = this.f9590w;
        }
    }

    public final int c(View view) {
        while (true) {
            try {
                View view2 = (View) view.getParent();
                if (view2.equals(this)) {
                    break;
                }
                view = view2;
            } catch (ClassCastException unused) {
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).equals(view)) {
                return this.f9578a + i2;
            }
        }
        return -1;
    }

    public boolean canAnimate() {
        if (!super.canAnimate() || this.f9592y <= 0) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        int count;
        Adapter adapter = getAdapter();
        if (adapter == null || (count = adapter.getCount()) <= 0) {
            return false;
        }
        if (getFirstVisiblePosition() > 0 || getLastVisiblePosition() < count - 1) {
            return true;
        }
        return false;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View selectedView = getSelectedView();
        if (selectedView == null || selectedView.getVisibility() != 0 || !selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
            return false;
        }
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public abstract int e(int i2, boolean z3);

    public final void f() {
        if (getChildCount() > 0) {
            this.f9582f = true;
            this.f9581e = (long) this.f9584q;
            int i2 = this.f9589v;
            if (i2 >= 0) {
                View childAt = getChildAt(i2 - this.f9578a);
                this.d = this.f9588u;
                this.f9580c = this.f9587t;
                if (childAt != null) {
                    this.f9579b = childAt.getLeft();
                }
                this.f9583p = 0;
                return;
            }
            View childAt2 = getChildAt(0);
            Adapter adapter = getAdapter();
            int i5 = this.f9578a;
            if (i5 < 0 || i5 >= adapter.getCount()) {
                this.d = -1;
            } else {
                this.d = adapter.getItemId(this.f9578a);
            }
            this.f9580c = this.f9578a;
            if (childAt2 != null) {
                this.f9579b = childAt2.getLeft();
            }
            this.f9583p = 1;
        }
    }

    public final void g(boolean z3) {
        if (z3) {
            View view = this.f9591x;
            if (view != null) {
                view.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.f9586s) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        View view2 = this.f9591x;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        setVisibility(0);
    }

    public abstract Adapter getAdapter();

    @ViewDebug.CapturedViewProperty
    public int getCount() {
        return this.f9592y;
    }

    public View getEmptyView() {
        return this.f9591x;
    }

    public int getFirstVisiblePosition() {
        return this.f9578a;
    }

    public int getLastVisiblePosition() {
        return (getChildCount() + this.f9578a) - 1;
    }

    public final C0775l getOnItemClickListener() {
        return null;
    }

    public final C0776m getOnItemLongClickListener() {
        return null;
    }

    public final n getOnItemSelectedListener() {
        return null;
    }

    public Object getSelectedItem() {
        Adapter adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        if (adapter == null || adapter.getCount() <= 0 || selectedItemPosition < 0) {
            return null;
        }
        return adapter.getItem(selectedItemPosition);
    }

    @ViewDebug.CapturedViewProperty
    public long getSelectedItemId() {
        return this.f9588u;
    }

    @ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.f9587t;
    }

    public abstract View getSelectedView();

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.F);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(o.class.getName());
        accessibilityEvent.setScrollable(d());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            accessibilityEvent.setEnabled(selectedView.isEnabled());
        }
        accessibilityEvent.setCurrentItemIndex(getSelectedItemPosition());
        accessibilityEvent.setFromIndex(getFirstVisiblePosition());
        accessibilityEvent.setToIndex(getLastVisiblePosition());
        accessibilityEvent.setItemCount(getCount());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(o.class.getName());
        accessibilityNodeInfo.setScrollable(d());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            accessibilityNodeInfo.setEnabled(selectedView.isEnabled());
        }
    }

    public void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        this.f9584q = getWidth();
    }

    public final boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (!super.onRequestSendAccessibilityEvent(view, accessibilityEvent)) {
            return false;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        onInitializeAccessibilityEvent(obtain);
        view.dispatchPopulateAccessibilityEvent(obtain);
        accessibilityEvent.appendRecord(obtain);
        return true;
    }

    public final void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public final void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public final void removeViewAt(int i2) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract void setAdapter(Adapter adapter);

    public void setEmptyView(View view) {
        this.f9591x = view;
        boolean z3 = true;
        if (view != null && view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        Adapter adapter = getAdapter();
        if (adapter != null && !adapter.isEmpty()) {
            z3 = false;
        }
        g(z3);
    }

    public void setFocusable(boolean z3) {
        boolean z4;
        Adapter adapter = getAdapter();
        boolean z5 = true;
        if (adapter == null || adapter.getCount() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f9575D = z3;
        if (!z3) {
            this.f9576E = false;
        }
        if (!z3 || z4) {
            z5 = false;
        }
        super.setFocusable(z5);
    }

    public void setFocusableInTouchMode(boolean z3) {
        boolean z4;
        Adapter adapter = getAdapter();
        boolean z5 = false;
        if (adapter == null || adapter.getCount() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f9576E = z3;
        if (z3) {
            this.f9575D = true;
        }
        if (z3 && !z4) {
            z5 = true;
        }
        super.setFocusableInTouchMode(z5);
    }

    public void setNextSelectedPositionInt(int i2) {
        long j6;
        this.f9587t = i2;
        Adapter adapter = getAdapter();
        if (adapter == null || i2 < 0) {
            j6 = Long.MIN_VALUE;
        } else {
            j6 = adapter.getItemId(i2);
        }
        this.f9588u = j6;
        if (this.f9582f && this.f9583p == 0 && i2 >= 0) {
            this.f9580c = i2;
            this.d = j6;
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemLongClickListener(C0776m mVar) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
    }

    public void setSelectedPositionInt(int i2) {
        long j6;
        this.f9589v = i2;
        Adapter adapter = getAdapter();
        if (adapter == null || i2 < 0) {
            j6 = Long.MIN_VALUE;
        } else {
            j6 = adapter.getItemId(i2);
        }
        this.f9590w = j6;
    }

    public abstract void setSelection(int i2);

    public final void addView(View view, int i2) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void setOnItemClickListener(C0775l lVar) {
    }

    public void setOnItemSelectedListener(n nVar) {
    }
}
