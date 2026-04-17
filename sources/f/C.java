package f;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mtma.criminal.city.R;
import java.lang.reflect.Constructor;
import k.C0656D;
import k.C0703b0;
import k.C0728o;
import k.C0732q;
import k.C0734r;
import n.j;

public class C {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f7705b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7706c = {16843375};
    public static final int[] d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f7707e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f7708f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final j h = new j(0);

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f7709a = new Object[2];

    public C0728o a(Context context, AttributeSet attributeSet) {
        return new C0728o(context, attributeSet);
    }

    public C0732q b(Context context, AttributeSet attributeSet) {
        return new C0732q(context, attributeSet, R.attr.buttonStyle);
    }

    public C0734r c(Context context, AttributeSet attributeSet) {
        return new C0734r(context, attributeSet, R.attr.checkboxStyle);
    }

    public C0656D d(Context context, AttributeSet attributeSet) {
        return new C0656D(context, attributeSet);
    }

    public C0703b0 e(Context context, AttributeSet attributeSet) {
        return new C0703b0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        j jVar = h;
        Constructor<? extends U> constructor = (Constructor) jVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f7705b);
            jVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f7709a);
    }
}
