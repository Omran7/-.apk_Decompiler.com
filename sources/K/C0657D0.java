package k;

import B4.a;
import B4.b;
import K4.r;
import Q.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.f;
import e.C0476a;
import j.C0598A;
import java.lang.reflect.Method;

/* renamed from: k.D0  reason: case insensitive filesystem */
public class C0657D0 implements C0598A {

    /* renamed from: J  reason: collision with root package name */
    public static final Method f9152J;

    /* renamed from: K  reason: collision with root package name */
    public static final Method f9153K;

    /* renamed from: A  reason: collision with root package name */
    public final C0655C0 f9154A = new C0655C0(this, 1);

    /* renamed from: B  reason: collision with root package name */
    public final b f9155B = new b(this, 6);

    /* renamed from: C  reason: collision with root package name */
    public final a f9156C = new a(this, 10);

    /* renamed from: D  reason: collision with root package name */
    public final C0655C0 f9157D = new C0655C0(this, 0);

    /* renamed from: E  reason: collision with root package name */
    public final Handler f9158E;
    public final Rect F = new Rect();

    /* renamed from: G  reason: collision with root package name */
    public Rect f9159G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f9160H;

    /* renamed from: I  reason: collision with root package name */
    public final C0652B f9161I;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9162a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f9163b;

    /* renamed from: c  reason: collision with root package name */
    public C0739t0 f9164c;
    public final int d = -2;

    /* renamed from: e  reason: collision with root package name */
    public int f9165e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f9166f;

    /* renamed from: p  reason: collision with root package name */
    public int f9167p;

    /* renamed from: q  reason: collision with root package name */
    public final int f9168q = 1002;

    /* renamed from: r  reason: collision with root package name */
    public boolean f9169r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9170s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9171t;

    /* renamed from: u  reason: collision with root package name */
    public int f9172u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final int f9173v = f.API_PRIORITY_OTHER;

    /* renamed from: w  reason: collision with root package name */
    public r f9174w;

    /* renamed from: x  reason: collision with root package name */
    public View f9175x;

    /* renamed from: y  reason: collision with root package name */
    public AdapterView.OnItemClickListener f9176y;

    /* renamed from: z  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f9177z;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f9152J = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f9153K = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.widget.PopupWindow, k.B] */
    public C0657D0(Context context, AttributeSet attributeSet, int i2) {
        Drawable drawable;
        int resourceId;
        this.f9162a = context;
        this.f9158E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0476a.f7543o, i2, 0);
        this.f9166f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f9167p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f9169r = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0476a.f7547s, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            l.c(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(0);
        } else {
            drawable = R2.b.J(context, resourceId);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f9161I = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final int a() {
        return this.f9166f;
    }

    public final boolean b() {
        return this.f9161I.isShowing();
    }

    public final void c() {
        int i2;
        boolean z3;
        int i5;
        boolean z4;
        C0739t0 t0Var;
        int i6;
        int i7;
        int i8;
        int i9;
        C0739t0 t0Var2 = this.f9164c;
        C0652B b6 = this.f9161I;
        Context context = this.f9162a;
        if (t0Var2 == null) {
            C0739t0 q6 = q(context, !this.f9160H);
            this.f9164c = q6;
            q6.setAdapter(this.f9163b);
            this.f9164c.setOnItemClickListener(this.f9176y);
            this.f9164c.setFocusable(true);
            this.f9164c.setFocusableInTouchMode(true);
            this.f9164c.setOnItemSelectedListener(new C0751z0(this));
            this.f9164c.setOnScrollListener(this.f9156C);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f9177z;
            if (onItemSelectedListener != null) {
                this.f9164c.setOnItemSelectedListener(onItemSelectedListener);
            }
            b6.setContentView(this.f9164c);
        } else {
            ViewGroup viewGroup = (ViewGroup) b6.getContentView();
        }
        Drawable background = b6.getBackground();
        int i10 = 0;
        Rect rect = this.F;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i2 = rect.bottom + i11;
            if (!this.f9169r) {
                this.f9167p = -i11;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        if (b6.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        int a6 = C0651A0.a(b6, this.f9175x, this.f9167p, z3);
        int i12 = this.d;
        if (i12 == -1) {
            i5 = a6 + i2;
        } else {
            int i13 = this.f9165e;
            if (i13 == -2) {
                i8 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            } else if (i13 != -1) {
                i8 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                i8 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
            int a7 = this.f9164c.a(i8, a6);
            if (a7 > 0) {
                i9 = this.f9164c.getPaddingBottom() + this.f9164c.getPaddingTop() + i2;
            } else {
                i9 = 0;
            }
            i5 = a7 + i9;
        }
        if (this.f9161I.getInputMethodMode() == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        l.d(b6, this.f9168q);
        if (!b6.isShowing()) {
            int i14 = this.f9165e;
            if (i14 == -1) {
                i14 = -1;
            } else if (i14 == -2) {
                i14 = this.f9175x.getWidth();
            }
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = i5;
            }
            b6.setWidth(i14);
            b6.setHeight(i12);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f9152J;
                if (method != null) {
                    try {
                        method.invoke(b6, new Object[]{Boolean.TRUE});
                    } catch (Exception unused) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                C0653B0.b(b6, true);
            }
            b6.setOutsideTouchable(true);
            b6.setTouchInterceptor(this.f9155B);
            if (this.f9171t) {
                l.c(b6, this.f9170s);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = f9153K;
                if (method2 != null) {
                    try {
                        method2.invoke(b6, new Object[]{this.f9159G});
                    } catch (Exception e6) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                    }
                }
            } else {
                C0653B0.a(b6, this.f9159G);
            }
            b6.showAsDropDown(this.f9175x, this.f9166f, this.f9167p, this.f9172u);
            this.f9164c.setSelection(-1);
            if ((!this.f9160H || this.f9164c.isInTouchMode()) && (t0Var = this.f9164c) != null) {
                t0Var.setListSelectionHidden(true);
                t0Var.requestLayout();
            }
            if (!this.f9160H) {
                this.f9158E.post(this.f9157D);
            }
        } else if (this.f9175x.isAttachedToWindow()) {
            int i15 = this.f9165e;
            if (i15 == -1) {
                i15 = -1;
            } else if (i15 == -2) {
                i15 = this.f9175x.getWidth();
            }
            if (i12 == -1) {
                if (z4) {
                    i12 = i5;
                } else {
                    i12 = -1;
                }
                if (z4) {
                    if (this.f9165e == -1) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    b6.setWidth(i7);
                    b6.setHeight(0);
                } else {
                    if (this.f9165e == -1) {
                        i10 = -1;
                    }
                    b6.setWidth(i10);
                    b6.setHeight(-1);
                }
            } else if (i12 == -2) {
                i12 = i5;
            }
            b6.setOutsideTouchable(true);
            View view = this.f9175x;
            int i16 = this.f9166f;
            int i17 = this.f9167p;
            if (i15 < 0) {
                i15 = -1;
            }
            if (i12 < 0) {
                i6 = -1;
            } else {
                i6 = i12;
            }
            b6.update(view, i16, i17, i15, i6);
        }
    }

    public final Drawable d() {
        return this.f9161I.getBackground();
    }

    public final void dismiss() {
        C0652B b6 = this.f9161I;
        b6.dismiss();
        b6.setContentView((View) null);
        this.f9164c = null;
        this.f9158E.removeCallbacks(this.f9154A);
    }

    public final C0739t0 f() {
        return this.f9164c;
    }

    public final void h(Drawable drawable) {
        this.f9161I.setBackgroundDrawable(drawable);
    }

    public final void i(int i2) {
        this.f9167p = i2;
        this.f9169r = true;
    }

    public final void l(int i2) {
        this.f9166f = i2;
    }

    public final int n() {
        if (!this.f9169r) {
            return 0;
        }
        return this.f9167p;
    }

    public void p(ListAdapter listAdapter) {
        r rVar = this.f9174w;
        if (rVar == null) {
            this.f9174w = new r(this, 8);
        } else {
            ListAdapter listAdapter2 = this.f9163b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(rVar);
            }
        }
        this.f9163b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f9174w);
        }
        C0739t0 t0Var = this.f9164c;
        if (t0Var != null) {
            t0Var.setAdapter(this.f9163b);
        }
    }

    public C0739t0 q(Context context, boolean z3) {
        return new C0739t0(context, z3);
    }

    public final void r(int i2) {
        Drawable background = this.f9161I.getBackground();
        if (background != null) {
            Rect rect = this.F;
            background.getPadding(rect);
            this.f9165e = rect.left + rect.right + i2;
            return;
        }
        this.f9165e = i2;
    }
}
