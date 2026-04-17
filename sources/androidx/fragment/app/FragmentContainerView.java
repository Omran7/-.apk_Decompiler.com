package androidx.fragment.app;

import K.B;
import K.O;
import K.v0;
import Y.a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.mtma.criminal.city.R;
import h0.C0552a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.j;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4981a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4982b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4983c;
    public boolean d = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        j.e(context, "context");
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4244b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    public final void a(View view) {
        if (this.f4982b.contains(view)) {
            this.f4981a.add(view);
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        C0286s sVar;
        j.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof C0286s) {
            sVar = (C0286s) tag;
        } else {
            sVar = null;
        }
        if (sVar != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        v0 v0Var;
        j.e(windowInsets, "insets");
        v0 g = v0.g((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4983c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            j.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            v0Var = v0.g((View) null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = O.f1352a;
            WindowInsets f6 = g.f();
            if (f6 != null) {
                WindowInsets b6 = B.b(this, f6);
                if (!b6.equals(f6)) {
                    g = v0.g(this, b6);
                }
            }
            v0Var = g;
        }
        if (!v0Var.f1432a.m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = O.f1352a;
                WindowInsets f7 = v0Var.f();
                if (f7 != null) {
                    WindowInsets a6 = B.a(childAt, f7);
                    if (!a6.equals(f7)) {
                        v0.g(childAt, a6);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (this.d) {
            Iterator it2 = this.f4981a.iterator();
            while (it2.hasNext()) {
                super.drawChild(canvas, (View) it2.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j6) {
        j.e(canvas, "canvas");
        j.e(view, "child");
        if (this.d) {
            ArrayList arrayList = this.f4981a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    public final void endViewTransition(View view) {
        j.e(view, "view");
        this.f4982b.remove(view);
        if (this.f4981a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends C0286s> F getFragment() {
        C0289v vVar;
        C0286s sVar;
        I i2;
        View view = this;
        while (true) {
            vVar = null;
            if (view == null) {
                sVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof C0286s) {
                sVar = (C0286s) tag;
            } else {
                sVar = null;
            }
            if (sVar != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        if (sVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof C0289v) {
                    vVar = (C0289v) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (vVar != null) {
                i2 = vVar.l();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (sVar.v()) {
            i2 = sVar.m();
        } else {
            throw new IllegalStateException("The Fragment " + sVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return i2.z(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j.e(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                j.d(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeView(View view) {
        j.e(view, "view");
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        j.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i2);
    }

    public final void removeViewInLayout(View view) {
        j.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i2, int i5) {
        int i6 = i2 + i5;
        for (int i7 = i2; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            j.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i2, i5);
    }

    public final void removeViewsInLayout(int i2, int i5) {
        int i6 = i2 + i5;
        for (int i7 = i2; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            j.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i2, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.d = z3;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        j.e(onApplyWindowInsetsListener, "listener");
        this.f4983c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        j.e(view, "view");
        if (view.getParent() == this) {
            this.f4982b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, I i2) {
        super(context, attributeSet);
        View view;
        j.e(context, "context");
        j.e(attributeSet, "attrs");
        j.e(i2, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4244b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        C0286s z3 = i2.z(id);
        if (classAttribute != null && z3 == null) {
            if (id == -1) {
                throw new IllegalStateException(C0552a.o("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C C6 = i2.C();
            context.getClassLoader();
            C0286s a6 = C6.a(classAttribute);
            j.d(a6, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a6.f5157L = true;
            C0288u uVar = a6.f5148B;
            if ((uVar == null ? null : uVar.f5192p) != null) {
                a6.f5157L = true;
            }
            C0269a aVar = new C0269a(i2);
            aVar.f5081p = true;
            a6.f5158M = this;
            aVar.f(getId(), a6, string, 1);
            if (!aVar.g) {
                aVar.h = false;
                I i5 = aVar.f5082q;
                if (i5.f5014t != null && !i5.f4991G) {
                    i5.w(true);
                    aVar.a(i5.f4993I, i5.f4994J);
                    i5.f4999b = true;
                    try {
                        i5.P(i5.f4993I, i5.f4994J);
                        i5.d();
                        i5.a0();
                        if (i5.f4992H) {
                            i5.f4992H = false;
                            i5.Y();
                        }
                        ((HashMap) i5.f5000c.f2712c).values().removeAll(Collections.singleton((Object) null));
                    } catch (Throwable th) {
                        i5.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it2 = i2.f5000c.t().iterator();
        while (it2.hasNext()) {
            O o6 = (O) it2.next();
            C0286s sVar = o6.f5048c;
            if (sVar.F == getId() && (view = sVar.f5159N) != null && view.getParent() == null) {
                sVar.f5158M = this;
                o6.b();
            }
        }
    }
}
