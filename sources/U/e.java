package U;

import B0.C0004c;
import K.O;
import R2.b;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: v  reason: collision with root package name */
    public static final d f3652v = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public int f3653a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3654b;

    /* renamed from: c  reason: collision with root package name */
    public int f3655c = -1;
    public float[] d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f3656e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f3657f;
    public float[] g;
    public int[] h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f3658i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3659j;

    /* renamed from: k  reason: collision with root package name */
    public int f3660k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f3661l;

    /* renamed from: m  reason: collision with root package name */
    public final float f3662m;

    /* renamed from: n  reason: collision with root package name */
    public final float f3663n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3664o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f3665p;

    /* renamed from: q  reason: collision with root package name */
    public final b f3666q;

    /* renamed from: r  reason: collision with root package name */
    public View f3667r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3668s;

    /* renamed from: t  reason: collision with root package name */
    public final CoordinatorLayout f3669t;

    /* renamed from: u  reason: collision with root package name */
    public final C0004c f3670u = new C0004c((Object) this, 12);

    public e(Context context, CoordinatorLayout coordinatorLayout, b bVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (bVar != null) {
            this.f3669t = coordinatorLayout;
            this.f3666q = bVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3664o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3654b = viewConfiguration.getScaledTouchSlop();
            this.f3662m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3663n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3665p = new OverScroller(context, f3652v);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void a() {
        this.f3655c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3656e, 0.0f);
            Arrays.fill(this.f3657f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.f3658i, 0);
            Arrays.fill(this.f3659j, 0);
            this.f3660k = 0;
        }
        VelocityTracker velocityTracker = this.f3661l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3661l = null;
        }
    }

    public final void b(View view, int i2) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f3669t;
        if (parent == coordinatorLayout) {
            this.f3667r = view;
            this.f3655c = i2;
            this.f3666q.q0(view, i2);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
    }

    public final boolean c(View view, float f6, float f7) {
        boolean z3;
        boolean z4;
        if (view == null) {
            return false;
        }
        b bVar = this.f3666q;
        if (bVar.d0(view) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVar.e0() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && z4) {
            float f8 = f7 * f7;
            int i2 = this.f3654b;
            if (f8 + (f6 * f6) > ((float) (i2 * i2))) {
                return true;
            }
            return false;
        } else if (z3) {
            if (Math.abs(f6) > ((float) this.f3654b)) {
                return true;
            }
            return false;
        } else if (!z4 || Math.abs(f7) <= ((float) this.f3654b)) {
            return false;
        } else {
            return true;
        }
    }

    public final void d(int i2) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i5 = this.f3660k;
            int i6 = 1 << i2;
            if ((i5 & i6) != 0) {
                fArr[i2] = 0.0f;
                this.f3656e[i2] = 0.0f;
                this.f3657f[i2] = 0.0f;
                this.g[i2] = 0.0f;
                this.h[i2] = 0;
                this.f3658i[i2] = 0;
                this.f3659j[i2] = 0;
                this.f3660k = (~i6) & i5;
            }
        }
    }

    public final int e(int i2, int i5, int i6) {
        int i7;
        if (i2 == 0) {
            return 0;
        }
        int width = this.f3669t.getWidth();
        float f6 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f6) + f6;
        int abs = Math.abs(i5);
        if (abs > 0) {
            i7 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
        } else {
            i7 = (int) (((((float) Math.abs(i2)) / ((float) i6)) + 1.0f) * 256.0f);
        }
        return Math.min(i7, 600);
    }

    public final boolean f() {
        if (this.f3653a == 2) {
            OverScroller overScroller = this.f3665p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3667r.getLeft();
            int top = currY - this.f3667r.getTop();
            if (left != 0) {
                View view = this.f3667r;
                WeakHashMap weakHashMap = O.f1352a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3667r;
                WeakHashMap weakHashMap2 = O.f1352a;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3666q.s0(this.f3667r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3669t.post(this.f3670u);
            }
        }
        if (this.f3653a == 2) {
            return true;
        }
        return false;
    }

    public final View g(int i2, int i5) {
        CoordinatorLayout coordinatorLayout = this.f3669t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3666q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f3667r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f3667r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f3665p
            r11 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            r1.abortAnimation()
            r10.n(r11)
            return r11
        L_0x001e:
            android.view.View r12 = r10.f3667r
            float r0 = r10.f3663n
            int r0 = (int) r0
            float r6 = r10.f3662m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L_0x002e
            r13 = r11
            goto L_0x0035
        L_0x002e:
            if (r7 <= r6) goto L_0x0035
            if (r13 <= 0) goto L_0x0034
            r13 = r6
            goto L_0x0035
        L_0x0034:
            int r13 = -r6
        L_0x0035:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L_0x003d
        L_0x003b:
            r14 = r11
            goto L_0x0045
        L_0x003d:
            if (r7 <= r6) goto L_0x0045
            if (r14 <= 0) goto L_0x0043
            r14 = r6
            goto L_0x0045
        L_0x0043:
            int r11 = -r6
            goto L_0x003b
        L_0x0045:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L_0x005f
            float r11 = (float) r6
            float r6 = (float) r8
        L_0x005d:
            float r11 = r11 / r6
            goto L_0x0062
        L_0x005f:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L_0x005d
        L_0x0062:
            if (r14 == 0) goto L_0x0068
            float r0 = (float) r7
            float r6 = (float) r8
        L_0x0066:
            float r0 = r0 / r6
            goto L_0x006b
        L_0x0068:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L_0x0066
        L_0x006b:
            R2.b r6 = r10.f3666q
            int r12 = r6.d0(r12)
            int r12 = r10.e(r4, r13, r12)
            int r13 = r6.e0()
            int r13 = r10.e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.n(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: U.e.h(int, int, int, int):boolean");
    }

    public final boolean i(int i2) {
        if ((this.f3660k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i2;
        int i5 = 1;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3661l == null) {
            this.f3661l = VelocityTracker.obtain();
        }
        this.f3661l.addMovement(motionEvent);
        int i6 = 0;
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g5 = g((int) x6, (int) y6);
            l(x6, y6, pointerId);
            q(g5, pointerId);
            int i7 = this.h[pointerId];
        } else if (actionMasked != 1) {
            b bVar = this.f3666q;
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f3653a == 1) {
                        this.f3668s = true;
                        bVar.t0(this.f3667r, 0.0f, 0.0f);
                        this.f3668s = false;
                        if (this.f3653a == 1) {
                            n(0);
                        }
                    }
                    a();
                } else if (actionMasked == 5) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    float x7 = motionEvent.getX(actionIndex);
                    float y7 = motionEvent.getY(actionIndex);
                    l(x7, y7, pointerId2);
                    if (this.f3653a == 0) {
                        q(g((int) x7, (int) y7), pointerId2);
                        int i8 = this.h[pointerId2];
                        return;
                    }
                    int i9 = (int) x7;
                    int i10 = (int) y7;
                    View view = this.f3667r;
                    if (view != null) {
                        if (i9 < view.getLeft() || i9 >= view.getRight() || i10 < view.getTop() || i10 >= view.getBottom()) {
                            i5 = 0;
                        }
                        i6 = i5;
                    }
                    if (i6 != 0) {
                        q(this.f3667r, pointerId2);
                    }
                } else if (actionMasked == 6) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    if (this.f3653a == 1 && pointerId3 == this.f3655c) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (true) {
                            if (i6 >= pointerCount) {
                                i2 = -1;
                                break;
                            }
                            int pointerId4 = motionEvent.getPointerId(i6);
                            if (pointerId4 != this.f3655c) {
                                View g6 = g((int) motionEvent.getX(i6), (int) motionEvent.getY(i6));
                                View view2 = this.f3667r;
                                if (g6 == view2 && q(view2, pointerId4)) {
                                    i2 = this.f3655c;
                                    break;
                                }
                            }
                            i6++;
                        }
                        if (i2 == -1) {
                            k();
                        }
                    }
                    d(pointerId3);
                }
            } else if (this.f3653a != 1) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (i6 < pointerCount2) {
                    int pointerId5 = motionEvent.getPointerId(i6);
                    if (i(pointerId5)) {
                        float x8 = motionEvent.getX(i6);
                        float y8 = motionEvent.getY(i6);
                        float f6 = x8 - this.d[pointerId5];
                        float f7 = y8 - this.f3656e[pointerId5];
                        Math.abs(f6);
                        Math.abs(f7);
                        int i11 = this.h[pointerId5];
                        Math.abs(f7);
                        Math.abs(f6);
                        int i12 = this.h[pointerId5];
                        Math.abs(f6);
                        Math.abs(f7);
                        int i13 = this.h[pointerId5];
                        Math.abs(f7);
                        Math.abs(f6);
                        int i14 = this.h[pointerId5];
                        if (this.f3653a != 1) {
                            View g7 = g((int) x8, (int) y8);
                            if (c(g7, f6, f7) && q(g7, pointerId5)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i6++;
                }
                m(motionEvent);
            } else if (i(this.f3655c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3655c);
                float x9 = motionEvent.getX(findPointerIndex);
                float y9 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f3657f;
                int i15 = this.f3655c;
                int i16 = (int) (x9 - fArr[i15]);
                int i17 = (int) (y9 - this.g[i15]);
                int left = this.f3667r.getLeft() + i16;
                int top = this.f3667r.getTop() + i17;
                int left2 = this.f3667r.getLeft();
                int top2 = this.f3667r.getTop();
                if (i16 != 0) {
                    left = bVar.i(this.f3667r, left);
                    WeakHashMap weakHashMap = O.f1352a;
                    this.f3667r.offsetLeftAndRight(left - left2);
                }
                if (i17 != 0) {
                    top = bVar.j(this.f3667r, top);
                    WeakHashMap weakHashMap2 = O.f1352a;
                    this.f3667r.offsetTopAndBottom(top - top2);
                }
                if (!(i16 == 0 && i17 == 0)) {
                    bVar.s0(this.f3667r, left, top);
                }
                m(motionEvent);
            }
        } else {
            if (this.f3653a == 1) {
                k();
            }
            a();
        }
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f3661l;
        float f6 = this.f3662m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f3661l.getXVelocity(this.f3655c);
        float f7 = this.f3663n;
        float abs = Math.abs(xVelocity);
        float f8 = 0.0f;
        if (abs < f7) {
            xVelocity = 0.0f;
        } else if (abs > f6) {
            if (xVelocity > 0.0f) {
                xVelocity = f6;
            } else {
                xVelocity = -f6;
            }
        }
        float yVelocity = this.f3661l.getYVelocity(this.f3655c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f7) {
            if (abs2 > f6) {
                if (yVelocity <= 0.0f) {
                    f6 = -f6;
                }
                f8 = f6;
            } else {
                f8 = yVelocity;
            }
        }
        this.f3668s = true;
        this.f3666q.t0(this.f3667r, xVelocity, f8);
        this.f3668s = false;
        if (this.f3653a == 1) {
            n(0);
        }
    }

    public final void l(float f6, float f7, int i2) {
        float[] fArr = this.d;
        int i5 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i6 = i2 + 1;
            float[] fArr2 = new float[i6];
            float[] fArr3 = new float[i6];
            float[] fArr4 = new float[i6];
            float[] fArr5 = new float[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3656e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3657f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3658i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3659j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f3656e = fArr3;
            this.f3657f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.f3658i = iArr2;
            this.f3659j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f3657f[i2] = f6;
        fArr9[i2] = f6;
        float[] fArr10 = this.f3656e;
        this.g[i2] = f7;
        fArr10[i2] = f7;
        int[] iArr7 = this.h;
        int i7 = (int) f6;
        int i8 = (int) f7;
        CoordinatorLayout coordinatorLayout = this.f3669t;
        int left = coordinatorLayout.getLeft();
        int i9 = this.f3664o;
        if (i7 < left + i9) {
            i5 = 1;
        }
        if (i8 < coordinatorLayout.getTop() + i9) {
            i5 |= 4;
        }
        if (i7 > coordinatorLayout.getRight() - i9) {
            i5 |= 2;
        }
        if (i8 > coordinatorLayout.getBottom() - i9) {
            i5 |= 8;
        }
        iArr7[i2] = i5;
        this.f3660k |= 1 << i2;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (i(pointerId)) {
                float x6 = motionEvent.getX(i2);
                float y6 = motionEvent.getY(i2);
                this.f3657f[pointerId] = x6;
                this.g[pointerId] = y6;
            }
        }
    }

    public final void n(int i2) {
        this.f3669t.removeCallbacks(this.f3670u);
        if (this.f3653a != i2) {
            this.f3653a = i2;
            this.f3666q.r0(i2);
            if (this.f3653a == 0) {
                this.f3667r = null;
            }
        }
    }

    public final boolean o(int i2, int i5) {
        if (this.f3668s) {
            return h(i2, i5, (int) this.f3661l.getXVelocity(this.f3655c), (int) this.f3661l.getYVelocity(this.f3655c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        if (r12 != r11) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            int r3 = r18.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r17.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f3661l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f3661l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f3661l
            r4.addMovement(r1)
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x0118
            if (r2 == r4) goto L_0x0114
            if (r2 == r5) goto L_0x0067
            r7 = 3
            if (r2 == r7) goto L_0x0114
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r5 = 6
            if (r2 == r5) goto L_0x0034
            goto L_0x013c
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.d(r1)
            goto L_0x013c
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.l(r7, r1, r2)
            int r3 = r0.f3653a
            if (r3 != 0) goto L_0x0056
            int[] r1 = r0.h
            r1 = r1[r2]
            goto L_0x013c
        L_0x0056:
            if (r3 != r5) goto L_0x013c
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.g(r3, r1)
            android.view.View r3 = r0.f3667r
            if (r1 != r3) goto L_0x013c
            r0.q(r1, r2)
            goto L_0x013c
        L_0x0067:
            float[] r2 = r0.d
            if (r2 == 0) goto L_0x013c
            float[] r2 = r0.f3656e
            if (r2 != 0) goto L_0x0071
            goto L_0x013c
        L_0x0071:
            int r2 = r18.getPointerCount()
            r3 = r6
        L_0x0076:
            if (r3 >= r2) goto L_0x0110
            int r5 = r1.getPointerId(r3)
            boolean r7 = r0.i(r5)
            if (r7 != 0) goto L_0x0084
            goto L_0x010c
        L_0x0084:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.d
            r9 = r9[r5]
            float r9 = r7 - r9
            float[] r10 = r0.f3656e
            r10 = r10[r5]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.g(r7, r8)
            if (r7 == 0) goto L_0x00a8
            boolean r8 = r0.c(r7, r9, r10)
            if (r8 == 0) goto L_0x00a8
            r8 = r4
            goto L_0x00a9
        L_0x00a8:
            r8 = r6
        L_0x00a9:
            if (r8 == 0) goto L_0x00d6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            R2.b r13 = r0.f3666q
            int r12 = r13.i(r7, r12)
            int r14 = r7.getTop()
            int r15 = (int) r10
            int r15 = r15 + r14
            int r15 = r13.j(r7, r15)
            int r16 = r13.d0(r7)
            int r13 = r13.e0()
            if (r16 == 0) goto L_0x00cf
            if (r16 <= 0) goto L_0x00d6
            if (r12 != r11) goto L_0x00d6
        L_0x00cf:
            if (r13 == 0) goto L_0x0110
            if (r13 <= 0) goto L_0x00d6
            if (r15 != r14) goto L_0x00d6
            goto L_0x0110
        L_0x00d6:
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r9 = r0.h
            r9 = r9[r5]
            int r9 = r0.f3653a
            if (r9 != r4) goto L_0x0103
            goto L_0x0110
        L_0x0103:
            if (r8 == 0) goto L_0x010c
            boolean r5 = r0.q(r7, r5)
            if (r5 == 0) goto L_0x010c
            goto L_0x0110
        L_0x010c:
            int r3 = r3 + 1
            goto L_0x0076
        L_0x0110:
            r17.m(r18)
            goto L_0x013c
        L_0x0114:
            r17.a()
            goto L_0x013c
        L_0x0118:
            float r2 = r18.getX()
            float r3 = r18.getY()
            int r1 = r1.getPointerId(r6)
            r0.l(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.g(r2, r3)
            android.view.View r3 = r0.f3667r
            if (r2 != r3) goto L_0x0138
            int r3 = r0.f3653a
            if (r3 != r5) goto L_0x0138
            r0.q(r2, r1)
        L_0x0138:
            int[] r2 = r0.h
            r1 = r2[r1]
        L_0x013c:
            int r1 = r0.f3653a
            if (r1 != r4) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r4 = r6
        L_0x0142:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: U.e.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i2) {
        if (view == this.f3667r && this.f3655c == i2) {
            return true;
        }
        if (view == null || !this.f3666q.X0(view, i2)) {
            return false;
        }
        this.f3655c = i2;
        b(view, i2);
        return true;
    }
}
