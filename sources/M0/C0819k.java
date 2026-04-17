package m0;

import K.O;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import d2.C0462a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0737s0;

/* renamed from: m0.k  reason: case insensitive filesystem */
public final class C0819k extends C0802D {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f9987C = {16842919};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f9988D = new int[0];

    /* renamed from: A  reason: collision with root package name */
    public int f9989A;

    /* renamed from: B  reason: collision with root package name */
    public final C0737s0 f9990B;

    /* renamed from: a  reason: collision with root package name */
    public final int f9991a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9992b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f9993c;
    public final Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9994e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9995f;
    public final StateListDrawable g;
    public final Drawable h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9996i;

    /* renamed from: j  reason: collision with root package name */
    public final int f9997j;

    /* renamed from: k  reason: collision with root package name */
    public int f9998k;

    /* renamed from: l  reason: collision with root package name */
    public int f9999l;

    /* renamed from: m  reason: collision with root package name */
    public float f10000m;

    /* renamed from: n  reason: collision with root package name */
    public int f10001n;

    /* renamed from: o  reason: collision with root package name */
    public int f10002o;

    /* renamed from: p  reason: collision with root package name */
    public float f10003p;

    /* renamed from: q  reason: collision with root package name */
    public int f10004q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f10005r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f10006s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10007t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10008u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f10009v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f10010w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f10011x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f10012y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f10013z;

    public C0819k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i5, int i6) {
        boolean z3 = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f10013z = ofFloat;
        this.f9989A = 0;
        C0737s0 s0Var = new C0737s0(this, 6);
        this.f9990B = s0Var;
        C0817i iVar = new C0817i(this);
        this.f9993c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.f9994e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f9995f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f9996i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f9997j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f9991a = i5;
        this.f9992b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0818j(this));
        ofFloat.addUpdateListener(new C0462a(this, 1));
        RecyclerView recyclerView2 = this.f10006s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                C0804F f6 = recyclerView2.f5378u;
                if (f6 != null) {
                    f6.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f5380v;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() != 2 ? false : z3);
                }
                recyclerView2.N();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f10006s;
                recyclerView3.f5382w.remove(this);
                if (recyclerView3.f5384x == this) {
                    recyclerView3.f5384x = null;
                }
                ArrayList arrayList2 = this.f10006s.f5367n0;
                if (arrayList2 != null) {
                    arrayList2.remove(iVar);
                }
                this.f10006s.removeCallbacks(s0Var);
            }
            this.f10006s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f10006s.f5382w.add(this);
                this.f10006s.h(iVar);
            }
        }
    }

    public static int e(float f6, float f7, int[] iArr, int i2, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i2 - i6;
        int i9 = (int) (((f7 - f6) / ((float) i7)) * ((float) i8));
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i2 = this.f10004q;
        RecyclerView recyclerView2 = this.f10006s;
        if (i2 != recyclerView2.getWidth() || this.f10005r != recyclerView2.getHeight()) {
            this.f10004q = recyclerView2.getWidth();
            this.f10005r = recyclerView2.getHeight();
            f(0);
        } else if (this.f9989A != 0) {
            if (this.f10007t) {
                int i5 = this.f10004q;
                int i6 = this.f9994e;
                int i7 = i5 - i6;
                int i8 = this.f9999l;
                int i9 = this.f9998k;
                int i10 = i8 - (i9 / 2);
                StateListDrawable stateListDrawable = this.f9993c;
                stateListDrawable.setBounds(0, 0, i6, i9);
                int i11 = this.f10005r;
                int i12 = this.f9995f;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i12, i11);
                WeakHashMap weakHashMap = O.f1352a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i6, (float) i10);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate((float) (-i6), (float) (-i10));
                } else {
                    canvas.translate((float) i7, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i10);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i7), (float) (-i10));
                }
            }
            if (this.f10008u) {
                int i13 = this.f10005r;
                int i14 = this.f9996i;
                int i15 = i13 - i14;
                int i16 = this.f10002o;
                int i17 = this.f10001n;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable2 = this.g;
                stateListDrawable2.setBounds(0, 0, i17, i14);
                int i19 = this.f10004q;
                int i20 = this.f9997j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i19, i20);
                canvas.translate(0.0f, (float) i15);
                drawable2.draw(canvas);
                canvas.translate((float) i18, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i18), (float) (-i15));
            }
        }
    }

    public final boolean c(float f6, float f7) {
        if (f7 >= ((float) (this.f10005r - this.f9996i))) {
            int i2 = this.f10002o;
            int i5 = this.f10001n;
            if (f6 < ((float) (i2 - (i5 / 2))) || f6 > ((float) ((i5 / 2) + i2))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean d(float f6, float f7) {
        boolean z3;
        RecyclerView recyclerView = this.f10006s;
        WeakHashMap weakHashMap = O.f1352a;
        if (recyclerView.getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i2 = this.f9994e;
        if (z3) {
            if (f6 > ((float) (i2 / 2))) {
                return false;
            }
        } else if (f6 < ((float) (this.f10004q - i2))) {
            return false;
        }
        int i5 = this.f9999l;
        int i6 = this.f9998k / 2;
        if (f7 < ((float) (i5 - i6)) || f7 > ((float) (i6 + i5))) {
            return false;
        }
        return true;
    }

    public final void f(int i2) {
        C0737s0 s0Var = this.f9990B;
        StateListDrawable stateListDrawable = this.f9993c;
        if (i2 == 2 && this.f10009v != 2) {
            stateListDrawable.setState(f9987C);
            this.f10006s.removeCallbacks(s0Var);
        }
        if (i2 == 0) {
            this.f10006s.invalidate();
        } else {
            g();
        }
        if (this.f10009v == 2 && i2 != 2) {
            stateListDrawable.setState(f9988D);
            this.f10006s.removeCallbacks(s0Var);
            this.f10006s.postDelayed(s0Var, (long) 1200);
        } else if (i2 == 1) {
            this.f10006s.removeCallbacks(s0Var);
            this.f10006s.postDelayed(s0Var, (long) 1500);
        }
        this.f10009v = i2;
    }

    public final void g() {
        int i2 = this.f9989A;
        ValueAnimator valueAnimator = this.f10013z;
        if (i2 != 0) {
            if (i2 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f9989A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }
}
