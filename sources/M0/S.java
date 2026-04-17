package m0;

import K.O;
import U.d;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.crypto.tink.shaded.protobuf.C0407l;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public int f9886a;

    /* renamed from: b  reason: collision with root package name */
    public int f9887b;

    /* renamed from: c  reason: collision with root package name */
    public OverScroller f9888c;
    public Interpolator d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9889e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9890f = false;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9891p;

    public S(RecyclerView recyclerView) {
        this.f9891p = recyclerView;
        d dVar = RecyclerView.f5325D0;
        this.d = dVar;
        this.f9888c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f9889e) {
            this.f9890f = true;
            return;
        }
        RecyclerView recyclerView = this.f9891p;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = O.f1352a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i2, int i5, int i6, BaseInterpolator baseInterpolator) {
        boolean z3;
        int i7;
        int i8;
        RecyclerView recyclerView = this.f9891p;
        if (i6 == Integer.MIN_VALUE) {
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i5);
            if (abs > abs2) {
                z3 = true;
            } else {
                z3 = false;
            }
            int sqrt = (int) Math.sqrt((double) 0);
            int sqrt2 = (int) Math.sqrt((double) ((i5 * i5) + (i2 * i2)));
            if (z3) {
                i7 = recyclerView.getWidth();
            } else {
                i7 = recyclerView.getHeight();
            }
            int i9 = i7 / 2;
            float f6 = (float) i7;
            float f7 = (float) i9;
            float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f6) - 0.5f) * 0.47123894f))) * f7) + f7;
            if (sqrt > 0) {
                i8 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z3) {
                    abs = abs2;
                }
                i8 = (int) (((((float) abs) / f6) + 1.0f) * 300.0f);
            }
            i6 = Math.min(i8, 2000);
        }
        int i10 = i6;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f5325D0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f9888c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f9887b = 0;
        this.f9886a = 0;
        recyclerView.setScrollState(2);
        this.f9888c.startScroll(0, 0, i2, i5, i10);
        a();
    }

    public final void run() {
        int i2;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        RecyclerView recyclerView = this.f9891p;
        if (recyclerView.f5378u == null) {
            recyclerView.removeCallbacks(this);
            this.f9888c.abortAnimation();
            return;
        }
        this.f9890f = false;
        this.f9889e = true;
        recyclerView.m();
        OverScroller overScroller = this.f9888c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i9 = currX - this.f9886a;
            int i10 = currY - this.f9887b;
            this.f9886a = currX;
            this.f9887b = currY;
            int[] iArr = recyclerView.f5385x0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r6 = recyclerView.r(i9, i10, 1, iArr, (int[]) null);
            int[] iArr2 = recyclerView.f5385x0;
            if (r6) {
                i9 -= iArr2[0];
                i10 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i9, i10);
            }
            if (recyclerView.f5376t != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i9, i10, iArr2);
                int i11 = iArr2[0];
                int i12 = iArr2[1];
                int i13 = i9 - i11;
                int i14 = i10 - i12;
                C0827t tVar = recyclerView.f5378u.f9852e;
                if (tVar != null && !tVar.d && tVar.f10053e) {
                    int b6 = recyclerView.f5365l0.b();
                    if (b6 == 0) {
                        tVar.i();
                    } else if (tVar.f10050a >= b6) {
                        tVar.f10050a = b6 - 1;
                        tVar.g(i11, i12);
                    } else {
                        tVar.g(i11, i12);
                    }
                }
                i6 = i11;
                i5 = i13;
                i2 = i14;
                i7 = i12;
            } else {
                i5 = i9;
                i2 = i10;
                i7 = 0;
                i6 = 0;
            }
            if (!recyclerView.f5380v.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f5385x0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i15 = i7;
            recyclerView.s(i6, i7, i5, i2, (int[]) null, 1, iArr3);
            int i16 = i5 - iArr2[0];
            int i17 = i2 - iArr2[1];
            if (!(i6 == 0 && i15 == 0)) {
                recyclerView.t(i6, i15);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (overScroller.isFinished() || ((z3 || i16 != 0) && (z4 || i17 != 0))) {
                z5 = true;
            } else {
                z5 = false;
            }
            C0827t tVar2 = recyclerView.f5378u.f9852e;
            if ((tVar2 == null || !tVar2.d) && z5) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i16 < 0) {
                        i8 = -currVelocity;
                    } else if (i16 > 0) {
                        i8 = currVelocity;
                    } else {
                        i8 = 0;
                    }
                    if (i17 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i17 <= 0) {
                        currVelocity = 0;
                    }
                    if (i8 < 0) {
                        recyclerView.v();
                        if (recyclerView.f5338M.isFinished()) {
                            recyclerView.f5338M.onAbsorb(-i8);
                        }
                    } else if (i8 > 0) {
                        recyclerView.w();
                        if (recyclerView.f5340O.isFinished()) {
                            recyclerView.f5340O.onAbsorb(i8);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f5339N.isFinished()) {
                            recyclerView.f5339N.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f5341P.isFinished()) {
                            recyclerView.f5341P.onAbsorb(currVelocity);
                        }
                    }
                    if (!(i8 == 0 && currVelocity == 0)) {
                        WeakHashMap weakHashMap = O.f1352a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0407l lVar = recyclerView.f5364k0;
                int[] iArr4 = (int[]) lVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                lVar.f6831c = 0;
            } else {
                a();
                C0821m mVar = recyclerView.f5363j0;
                if (mVar != null) {
                    mVar.a(recyclerView, i6, i15);
                }
            }
        }
        C0827t tVar3 = recyclerView.f5378u.f9852e;
        if (tVar3 != null && tVar3.d) {
            tVar3.g(0, 0);
        }
        this.f9889e = false;
        if (this.f9890f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = O.f1352a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.c0(1);
    }
}
