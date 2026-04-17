package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: k.o0  reason: case insensitive filesystem */
public abstract class C0729o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f9351a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f9352b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f9353c;
    public static final boolean d = true;

    static {
        Class<AdapterView> cls = AdapterView.class;
        Class<AbsListView> cls2 = AbsListView.class;
        try {
            Class cls3 = Integer.TYPE;
            Class cls4 = Boolean.TYPE;
            Class cls5 = Float.TYPE;
            Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, cls4, cls5, cls5});
            f9351a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
            f9352b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
            f9353c = declaredMethod3;
            declaredMethod3.setAccessible(true);
        } catch (NoSuchMethodException e6) {
            e6.printStackTrace();
        }
    }
}
