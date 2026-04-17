package K;

import C.g;
import I3.e;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class f0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a  reason: collision with root package name */
    public final e f1384a;

    /* renamed from: b  reason: collision with root package name */
    public List f1385b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f1386c;
    public final HashMap d = new HashMap();

    public f0(e eVar) {
        super(0);
        this.f1384a = eVar;
    }

    public final i0 a(WindowInsetsAnimation windowInsetsAnimation) {
        i0 i0Var = (i0) this.d.get(windowInsetsAnimation);
        if (i0Var == null) {
            i0Var = new i0(0, (Interpolator) null, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                i0Var.f1397a = new g0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, i0Var);
        }
        return i0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        e eVar = this.f1384a;
        a(windowInsetsAnimation);
        ((View) eVar.f1171c).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        e eVar = this.f1384a;
        a(windowInsetsAnimation);
        int[] iArr = (int[]) eVar.d;
        ((View) eVar.f1171c).getLocationOnScreen(iArr);
        eVar.f1172e = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f1386c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1386c = arrayList2;
            this.f1385b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j6 = e0.j(list.get(size));
            i0 a6 = a(j6);
            a6.f1397a.d(j6.getFraction());
            this.f1386c.add(a6);
        }
        e eVar = this.f1384a;
        v0 g = v0.g((View) null, windowInsets);
        eVar.f(g, this.f1385b);
        return g.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        e eVar = this.f1384a;
        a(windowInsetsAnimation);
        g c3 = g.c(bounds.getLowerBound());
        g c6 = g.c(bounds.getUpperBound());
        View view = (View) eVar.f1171c;
        int[] iArr = (int[]) eVar.d;
        view.getLocationOnScreen(iArr);
        int i2 = eVar.f1172e - iArr[1];
        eVar.f1173f = i2;
        view.setTranslationY((float) i2);
        e0.m();
        return e0.h(c3.d(), c6.d());
    }
}
