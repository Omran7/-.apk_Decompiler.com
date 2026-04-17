package k;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import com.mtma.criminal.city.fragments.gangBase.I;
import j.k;
import j.m;
import java.lang.reflect.Method;

/* renamed from: k.I0  reason: case insensitive filesystem */
public final class C0667I0 extends C0657D0 implements C0659E0 {

    /* renamed from: M  reason: collision with root package name */
    public static final Method f9190M;

    /* renamed from: L  reason: collision with root package name */
    public I f9191L;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f9190M = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public final void g(k kVar, m mVar) {
        I i2 = this.f9191L;
        if (i2 != null) {
            i2.g(kVar, mVar);
        }
    }

    public final void k(k kVar, m mVar) {
        I i2 = this.f9191L;
        if (i2 != null) {
            i2.k(kVar, mVar);
        }
    }

    public final C0739t0 q(Context context, boolean z3) {
        C0665H0 h02 = new C0665H0(context, z3);
        h02.setHoverListener(this);
        return h02;
    }
}
