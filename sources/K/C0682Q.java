package k;

import K4.e;
import R2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: k.Q  reason: case insensitive filesystem */
public final class C0682Q extends Spinner {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f9220r = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final C0730p f9221a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9222b;

    /* renamed from: c  reason: collision with root package name */
    public final C0666I f9223c;
    public SpinnerAdapter d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9224e;

    /* renamed from: f  reason: collision with root package name */
    public final C0680P f9225f;

    /* renamed from: p  reason: collision with root package name */
    public int f9226p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f9227q = new Rect();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (r7 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0682Q(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130904103(0x7f030427, float:1.7415043E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f9227q = r1
            android.content.Context r1 = r12.getContext()
            k.C0681P0.a(r12, r1)
            int[] r1 = e.C0476a.f7549u
            c1.i r2 = c1.i.A(r13, r14, r1, r0)
            k.p r3 = new k.p
            r3.<init>(r12)
            r12.f9221a = r3
            java.lang.Object r3 = r2.f5606c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L_0x0035
            i.c r6 = new i.c
            r6.<init>(r13, r4)
            r12.f9222b = r6
            goto L_0x0037
        L_0x0035:
            r12.f9222b = r13
        L_0x0037:
            r4 = -1
            r6 = 0
            int[] r7 = f9220r     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch:{ Exception -> 0x0057, all -> 0x0054 }
            boolean r8 = r7.hasValue(r5)     // Catch:{ Exception -> 0x004e }
            if (r8 == 0) goto L_0x0050
            int r4 = r7.getInt(r5, r5)     // Catch:{ Exception -> 0x004e }
            goto L_0x0050
        L_0x004a:
            r13 = move-exception
            r6 = r7
            goto L_0x00d5
        L_0x004e:
            r8 = move-exception
            goto L_0x0059
        L_0x0050:
            r7.recycle()
            goto L_0x0063
        L_0x0054:
            r13 = move-exception
            goto L_0x00d5
        L_0x0057:
            r8 = move-exception
            r7 = r6
        L_0x0059:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x0063
            goto L_0x0050
        L_0x0063:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x009d
            if (r4 == r8) goto L_0x006a
            goto L_0x00aa
        L_0x006a:
            k.N r4 = new k.N
            android.content.Context r9 = r12.f9222b
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f9222b
            c1.i r1 = c1.i.A(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f5606c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f9226p = r9
            android.graphics.drawable.Drawable r9 = r1.n(r8)
            r4.h(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f9209L = r7
            r1.G()
            r12.f9225f = r4
            k.I r1 = new k.I
            r1.<init>(r12, r12, r4)
            r12.f9223c = r1
            goto L_0x00aa
        L_0x009d:
            k.K r1 = new k.K
            r1.<init>(r12)
            r12.f9225f = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f9194c = r4
        L_0x00aa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto L_0x00c1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493128(0x7f0c0108, float:1.8609727E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00c1:
            r2.G()
            r12.f9224e = r8
            android.widget.SpinnerAdapter r13 = r12.d
            if (r13 == 0) goto L_0x00cf
            r12.setAdapter((android.widget.SpinnerAdapter) r13)
            r12.d = r6
        L_0x00cf:
            k.p r13 = r12.f9221a
            r13.d(r14, r0)
            return
        L_0x00d5:
            if (r6 == 0) goto L_0x00da
            r6.recycle()
        L_0x00da:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0682Q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        Rect rect = this.f9227q;
        drawable.getPadding(rect);
        return i5 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9221a;
        if (pVar != null) {
            pVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            return p6.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            return p6.n();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f9225f != null) {
            return this.f9226p;
        }
        return super.getDropDownWidth();
    }

    public final C0680P getInternalPopup() {
        return this.f9225f;
    }

    public Drawable getPopupBackground() {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            return p6.d();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f9222b;
    }

    public CharSequence getPrompt() {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            return p6.o();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9221a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9221a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0680P p6 = this.f9225f;
        if (p6 != null && p6.b()) {
            p6.dismiss();
        }
    }

    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        if (this.f9225f != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0678O o6 = (C0678O) parcelable;
        super.onRestoreInstanceState(o6.getSuperState());
        if (o6.f9214a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new e(this, 7));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, k.O] */
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        C0680P p6 = this.f9225f;
        if (p6 == null || !p6.b()) {
            z3 = false;
        } else {
            z3 = true;
        }
        baseSavedState.f9214a = z3;
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0666I i2 = this.f9223c;
        if (i2 == null || !i2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        C0680P p6 = this.f9225f;
        if (p6 == null) {
            return super.performClick();
        }
        if (p6.b()) {
            return true;
        }
        this.f9225f.m(getTextDirection(), getTextAlignment());
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9221a;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9221a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            p6.j(i2);
            p6.l(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            p6.i(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f9225f != null) {
            this.f9226p = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            p6.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(b.J(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            p6.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9221a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9221a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ListAdapter, k.L, java.lang.Object] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9224e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        C0680P p6 = this.f9225f;
        if (p6 != null) {
            Context context = this.f9222b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.f9200a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f9201b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C0668J.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            p6.p(obj);
        }
    }
}
