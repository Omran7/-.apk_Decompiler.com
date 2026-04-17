package f;

import A.h;
import C.g;
import K.B;
import K.C0076p;
import K.E;
import K.O;
import K.k0;
import K.l0;
import K.m0;
import K.n0;
import K.v0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.mtma.criminal.city.R;
import j.k;
import j.v;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.h1;
import k.i1;

public final class p implements C0076p, v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f7799a;

    public /* synthetic */ p(z zVar) {
        this.f7799a = zVar;
    }

    public void a(k kVar, boolean z3) {
        this.f7799a.o(kVar);
    }

    public v0 b(View view, v0 v0Var) {
        int i2;
        boolean z3;
        v0 v0Var2;
        n0 n0Var;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i9;
        View view2 = view;
        v0 v0Var3 = v0Var;
        int d = v0Var.d();
        z zVar = this.f7799a;
        zVar.getClass();
        int d6 = v0Var.d();
        ActionBarContextView actionBarContextView = zVar.f7829E;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i2 = 0;
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) zVar.f7829E.getLayoutParams();
            boolean z5 = true;
            if (zVar.f7829E.isShown()) {
                if (zVar.f7861l0 == null) {
                    zVar.f7861l0 = new Rect();
                    zVar.f7862m0 = new Rect();
                }
                Rect rect = zVar.f7861l0;
                Rect rect2 = zVar.f7862m0;
                rect.set(v0Var.b(), v0Var.d(), v0Var.c(), v0Var.a());
                ViewGroup viewGroup = zVar.f7833J;
                Class<Rect> cls = Rect.class;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z6 = i1.f9315a;
                    h1.a(viewGroup, rect, rect2);
                } else {
                    if (!i1.f9315a) {
                        i1.f9315a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{cls, cls});
                            i1.f9316b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                i1.f9316b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = i1.f9316b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, new Object[]{rect, rect2});
                        } catch (Exception e6) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = zVar.f7833J;
                WeakHashMap weakHashMap = O.f1352a;
                v0 a6 = E.a(viewGroup2);
                if (a6 == null) {
                    i6 = 0;
                } else {
                    i6 = a6.b();
                }
                if (a6 == null) {
                    i7 = 0;
                } else {
                    i7 = a6.c();
                }
                if (marginLayoutParams2.topMargin == i10 && marginLayoutParams2.leftMargin == i11 && marginLayoutParams2.rightMargin == i12) {
                    z4 = false;
                } else {
                    marginLayoutParams2.topMargin = i10;
                    marginLayoutParams2.leftMargin = i11;
                    marginLayoutParams2.rightMargin = i12;
                    z4 = true;
                }
                Context context = zVar.f7867t;
                if (i10 <= 0 || zVar.f7835L != null) {
                    View view3 = zVar.f7835L;
                    if (!(view3 == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams()).height == (i9 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7))) {
                        marginLayoutParams.height = i9;
                        marginLayoutParams.leftMargin = i6;
                        marginLayoutParams.rightMargin = i7;
                        zVar.f7835L.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view4 = new View(context);
                    zVar.f7835L = view4;
                    view4.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = i7;
                    zVar.f7833J.addView(zVar.f7835L, -1, layoutParams);
                }
                View view5 = zVar.f7835L;
                if (view5 == null) {
                    z5 = false;
                }
                if (z5 && view5.getVisibility() != 0) {
                    View view6 = zVar.f7835L;
                    if ((view6.getWindowSystemUiVisibility() & 8192) != 0) {
                        i8 = h.getColor(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        i8 = h.getColor(context, R.color.abc_decor_view_status_guard);
                    }
                    view6.setBackgroundColor(i8);
                }
                if (!zVar.f7840Q && z5) {
                    d6 = 0;
                }
                z3 = z5;
                z5 = z4;
                i2 = 0;
            } else {
                i2 = 0;
                if (marginLayoutParams2.topMargin != 0) {
                    marginLayoutParams2.topMargin = 0;
                    z3 = false;
                } else {
                    z3 = false;
                    z5 = false;
                }
            }
            if (z5) {
                zVar.f7829E.setLayoutParams(marginLayoutParams2);
            }
        }
        View view7 = zVar.f7835L;
        if (view7 != null) {
            if (z3) {
                i5 = i2;
            } else {
                i5 = 8;
            }
            view7.setVisibility(i5);
        }
        if (d != d6) {
            int b6 = v0Var.b();
            int c3 = v0Var.c();
            int a7 = v0Var.a();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                n0Var = new m0(v0Var3);
            } else if (i13 >= 29) {
                n0Var = new l0(v0Var3);
            } else {
                n0Var = new k0(v0Var3);
            }
            n0Var.g(g.b(b6, d6, c3, a7));
            v0Var2 = n0Var.b();
        } else {
            v0Var2 = v0Var3;
        }
        WeakHashMap weakHashMap2 = O.f1352a;
        WindowInsets f6 = v0Var2.f();
        if (f6 == null) {
            return v0Var2;
        }
        WindowInsets b7 = B.b(view2, f6);
        if (!b7.equals(f6)) {
            return v0.g(view2, b7);
        }
        return v0Var2;
    }

    public boolean p(k kVar) {
        Window.Callback callback = this.f7799a.f7868u.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }
}
