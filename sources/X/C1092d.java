package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import o3.d;
import w.C1053a;

/* renamed from: x.d  reason: case insensitive filesystem */
public final class C1092d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public C1089a f12491a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12492b = false;

    /* renamed from: c  reason: collision with root package name */
    public final int f12493c = 0;
    public final int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final int f12494e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final int f12495f = -1;
    public final int g = 0;
    public int h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f12496i;

    /* renamed from: j  reason: collision with root package name */
    public int f12497j;

    /* renamed from: k  reason: collision with root package name */
    public View f12498k;

    /* renamed from: l  reason: collision with root package name */
    public View f12499l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12500m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12501n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f12502o = new Rect();

    public C1092d() {
        super(-2, -2);
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.f12500m;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f12501n;
    }

    public C1092d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1089a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1053a.f12333b);
        this.f12493c = obtainStyledAttributes.getInteger(0, 0);
        this.f12495f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f12494e = obtainStyledAttributes.getInteger(6, -1);
        this.g = obtainStyledAttributes.getInt(5, 0);
        this.h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f12492b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f4853C;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f4853C;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f4855E;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f4854D);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (C1089a) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e6) {
                    throw new RuntimeException(d.i("Could not inflate Behavior subclass ", string), e6);
                }
            }
            this.f12491a = aVar;
        }
        obtainStyledAttributes.recycle();
        C1089a aVar2 = this.f12491a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public C1092d(C1092d dVar) {
        super(dVar);
    }

    public C1092d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C1092d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
