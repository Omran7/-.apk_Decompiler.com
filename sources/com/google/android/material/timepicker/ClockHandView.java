package com.google.android.material.timepicker;

import K.O;
import K1.e;
import Y1.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator f6598a = new ValueAnimator();

    /* renamed from: b  reason: collision with root package name */
    public boolean f6599b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6600c = new ArrayList();
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6601e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f6602f;

    /* renamed from: p  reason: collision with root package name */
    public final RectF f6603p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6604q;

    /* renamed from: r  reason: collision with root package name */
    public float f6605r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6606s;

    /* renamed from: t  reason: collision with root package name */
    public double f6607t;

    /* renamed from: u  reason: collision with root package name */
    public int f6608u;

    /* renamed from: v  reason: collision with root package name */
    public int f6609v;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f6602f = paint;
        this.f6603p = new RectF();
        this.f6609v = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4250e, R.attr.materialClockStyle, 2131952738);
        e.n0(R.attr.motionDurationLong2, 200, context);
        e.o0(context, R.attr.motionEasingEmphasizedInterpolator, Z1.a.f4470b);
        this.f6608u = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f6604q = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f6601e = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = O.f1352a;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int a(int i2) {
        if (i2 == 2) {
            return Math.round(((float) this.f6608u) * 0.66f);
        }
        return this.f6608u;
    }

    public final void b(float f6) {
        ValueAnimator valueAnimator = this.f6598a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f7 = f6 % 360.0f;
        this.f6605r = f7;
        this.f6607t = Math.toRadians((double) (f7 - 90.0f));
        float a6 = (float) a(this.f6609v);
        float cos = (((float) Math.cos(this.f6607t)) * a6) + ((float) (getWidth() / 2));
        float sin = (a6 * ((float) Math.sin(this.f6607t))) + ((float) (getHeight() / 2));
        float f8 = (float) this.d;
        this.f6603p.set(cos - f8, sin - f8, cos + f8, sin + f8);
        Iterator it2 = this.f6600c.iterator();
        while (it2.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it2.next());
            if (Math.abs(clockFaceView.f6596P - f7) > 0.001f) {
                clockFaceView.f6596P = f7;
                clockFaceView.m();
            }
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int a6 = a(this.f6609v);
        float f6 = (float) width;
        float f7 = (float) a6;
        float f8 = (float) height;
        Paint paint = this.f6602f;
        paint.setStrokeWidth(0.0f);
        int i2 = this.d;
        canvas.drawCircle((((float) Math.cos(this.f6607t)) * f7) + f6, (f7 * ((float) Math.sin(this.f6607t))) + f8, (float) i2, paint);
        double sin = Math.sin(this.f6607t);
        double d6 = (double) ((float) (a6 - i2));
        paint.setStrokeWidth((float) this.f6604q);
        canvas.drawLine(f6, f8, (float) (width + ((int) (Math.cos(this.f6607t) * d6))), (float) (height + ((int) (d6 * sin))), paint);
        canvas.drawCircle(f6, f8, this.f6601e, paint);
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        if (!this.f6598a.isRunning()) {
            b(this.f6605r);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        boolean z6 = false;
        if (actionMasked == 0) {
            this.f6606s = false;
            z3 = true;
            z4 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z4 = this.f6606s;
            if (this.f6599b) {
                if (((float) Math.hypot((double) (x6 - ((float) (getWidth() / 2))), (double) (y6 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics())) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                this.f6609v = i2;
            }
            z3 = false;
        } else {
            z4 = false;
            z3 = false;
        }
        boolean z7 = this.f6606s;
        int degrees = (int) Math.toDegrees(Math.atan2((double) (y6 - ((float) (getHeight() / 2))), (double) (x6 - ((float) (getWidth() / 2)))));
        int i5 = degrees + 90;
        if (i5 < 0) {
            i5 = degrees + 450;
        }
        float f6 = (float) i5;
        if (this.f6605r != f6) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z3 || !z5) {
            if (z5 || z4) {
                b(f6);
            }
            this.f6606s = z7 | z6;
            return true;
        }
        z6 = true;
        this.f6606s = z7 | z6;
        return true;
    }
}
