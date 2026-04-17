package K;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: K.l  reason: case insensitive filesystem */
public final class C0072l {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f1404a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f1405b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f1406c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1407e;

    public C0072l(ViewGroup viewGroup) {
        this.f1406c = viewGroup;
    }

    public final boolean a(float f6, float f7, boolean z3) {
        ViewParent e6;
        if (!this.d || (e6 = e(0)) == null) {
            return false;
        }
        try {
            return U.a(e6, this.f1406c, f6, f7, z3);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedFling", e7);
            return false;
        }
    }

    public final boolean b(float f6, float f7) {
        ViewParent e6;
        if (!this.d || (e6 = e(0)) == null) {
            return false;
        }
        try {
            return U.b(e6, this.f1406c, f6, f7);
        } catch (AbstractMethodError e7) {
            Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreFling", e7);
            return false;
        }
    }

    public final boolean c(int i2, int i5, int i6, int[] iArr, int[] iArr2) {
        ViewParent e6;
        int i7;
        int i8;
        int[] iArr3;
        int i9 = i2;
        int i10 = i5;
        int i11 = i6;
        int[] iArr4 = iArr2;
        if (!this.d || (e6 = e(i11)) == null) {
            return false;
        }
        if (i9 != 0 || i10 != 0) {
            ViewGroup viewGroup = this.f1406c;
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                i8 = iArr4[0];
                i7 = iArr4[1];
            } else {
                i8 = 0;
                i7 = 0;
            }
            if (iArr == null) {
                if (this.f1407e == null) {
                    this.f1407e = new int[2];
                }
                iArr3 = this.f1407e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            if (e6 instanceof C0073m) {
                ((C0073m) e6).c(viewGroup, i2, i5, iArr3, i6);
            } else if (i11 == 0) {
                try {
                    U.c(e6, viewGroup, i9, i10, iArr3);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedPreScroll", e7);
                }
            }
            if (iArr4 != null) {
                viewGroup.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i8;
                iArr4[1] = iArr4[1] - i7;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final boolean d(int i2, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent e6;
        int i9;
        int i10;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i11 = i8;
        if (!this.d || (e6 = e(i11)) == null) {
            return false;
        }
        if (i2 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f1406c;
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            i10 = iArr4[0];
            i9 = iArr4[1];
        } else {
            i10 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            if (this.f1407e == null) {
                this.f1407e = new int[2];
            }
            int[] iArr5 = this.f1407e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        if (e6 instanceof C0074n) {
            ((C0074n) e6).d(viewGroup, i2, i5, i6, i7, i8, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i6;
            iArr3[1] = iArr3[1] + i7;
            if (e6 instanceof C0073m) {
                ((C0073m) e6).e(viewGroup, i2, i5, i6, i7, i8);
            } else if (i11 == 0) {
                try {
                    U.d(e6, viewGroup, i2, i5, i6, i7);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onNestedScroll", e7);
                }
            }
        }
        if (iArr4 != null) {
            viewGroup.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i10;
            iArr4[1] = iArr4[1] - i9;
        }
        return true;
    }

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f1404a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f1405b;
    }

    public final boolean f(int i2) {
        if (e(i2) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i2, int i5) {
        boolean z3;
        if (f(i5)) {
            return true;
        }
        if (this.d) {
            View view = this.f1406c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof C0073m;
                if (z4) {
                    z3 = ((C0073m) parent).f(view2, view, i2, i5);
                } else {
                    if (i5 == 0) {
                        try {
                            z3 = U.f(parent, view2, view, i2);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                        }
                    }
                    z3 = false;
                }
                if (z3) {
                    if (i5 == 0) {
                        this.f1404a = parent;
                    } else if (i5 == 1) {
                        this.f1405b = parent;
                    }
                    if (z4) {
                        ((C0073m) parent).a(view2, view, i2, i5);
                    } else if (i5 == 0) {
                        try {
                            U.e(parent, view2, view, i2);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e7);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i2) {
        ViewParent e6 = e(i2);
        if (e6 != null) {
            boolean z3 = e6 instanceof C0073m;
            ViewGroup viewGroup = this.f1406c;
            if (z3) {
                ((C0073m) e6).b(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    U.g(e6, viewGroup);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + e6 + " does not implement interface method onStopNestedScroll", e7);
                }
            }
            if (i2 == 0) {
                this.f1404a = null;
            } else if (i2 == 1) {
                this.f1405b = null;
            }
        }
    }
}
