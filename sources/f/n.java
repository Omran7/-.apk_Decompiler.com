package f;

import G.j;
import T2.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import n.C0850a;
import n.f;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final m f7789a = new m(new c(3));

    /* renamed from: b  reason: collision with root package name */
    public static final int f7790b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static j f7791c = null;
    public static j d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f7792e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f7793f = false;

    /* renamed from: p  reason: collision with root package name */
    public static final f f7794p = new f(0);

    /* renamed from: q  reason: collision with root package name */
    public static final Object f7795q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static final Object f7796r = new Object();

    public static boolean b(Context context) {
        if (f7792e == null) {
            try {
                int i2 = E.f7710a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, E.class), D.a() | 128).metaData;
                if (bundle != null) {
                    f7792e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f7792e = Boolean.FALSE;
            }
        }
        return f7792e.booleanValue();
    }

    public static void e(z zVar) {
        synchronized (f7795q) {
            try {
                f fVar = f7794p;
                fVar.getClass();
                C0850a aVar = new C0850a(fVar);
                while (aVar.hasNext()) {
                    n nVar = (n) ((WeakReference) aVar.next()).get();
                    if (nVar == zVar || nVar == null) {
                        aVar.remove();
                    }
                }
            } finally {
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i2);

    public abstract void g(int i2);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
