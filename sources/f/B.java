package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import h0.C0552a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class B implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f7702a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7703b;

    /* renamed from: c  reason: collision with root package name */
    public Method f7704c;
    public Context d;

    public B(View view, String str) {
        this.f7702a = view;
        this.f7703b = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f7704c == null) {
            View view2 = this.f7702a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f7703b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                            this.f7704c = method;
                            this.d = context;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder t6 = C0552a.t("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    t6.append(view2.getClass());
                    t6.append(str);
                    throw new IllegalStateException(t6.toString());
                }
            }
        }
        try {
            this.f7704c.invoke(this.d, new Object[]{view});
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (InvocationTargetException e7) {
            throw new IllegalStateException("Could not execute method for android:onClick", e7);
        }
    }
}
