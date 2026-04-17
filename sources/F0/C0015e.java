package F0;

import R2.b;
import U0.h;
import android.app.Service;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.o0;

/* renamed from: F0.e  reason: case insensitive filesystem */
public final class C0015e implements t, C0017g, h, o0, T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f682a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f683b;

    public /* synthetic */ C0015e(Context context, int i2) {
        this.f682a = i2;
        this.f683b = context;
    }

    public Class b() {
        return Drawable.class;
    }

    public void c(boolean z3) {
        if (z3) {
            d.U0(2, new I(this, 13));
            return;
        }
        b.w(false);
        c.y0(this.f683b);
    }

    public void d(int i2, boolean z3) {
        if (z3) {
            d.m1(0, 500, false, new I(this, 11));
            return;
        }
        b.w(false);
        c.s0(this.f683b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
    }

    public s e(y yVar) {
        switch (this.f682a) {
            case 0:
                return new C0012b(this.f683b, (C0017g) this);
            case 1:
                return new o(this.f683b, 0);
            case 2:
                return new C0012b(this.f683b, yVar.a(Integer.class, AssetFileDescriptor.class));
            default:
                return new o(this.f683b, 2);
        }
    }

    public Object f(Resources resources, int i2, Resources.Theme theme) {
        Context context = this.f683b;
        return d.j0(context, context, i2, theme);
    }

    public /* bridge */ /* synthetic */ void g(Object obj) {
        Drawable drawable = (Drawable) obj;
    }

    public Object get() {
        return (ConnectivityManager) this.f683b.getSystemService("connectivity");
    }

    public C0015e(Service service) {
        this.f682a = 4;
        com.google.android.gms.common.internal.I.g(service);
        Context applicationContext = service.getApplicationContext();
        com.google.android.gms.common.internal.I.g(applicationContext);
        this.f683b = applicationContext;
    }
}
