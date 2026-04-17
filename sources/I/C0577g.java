package i;

import E.a;
import K.C0071k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import h0.C0552a;
import j.m;
import j.n;
import j.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: i.g  reason: case insensitive filesystem */
public final class C0577g {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f8196A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f8197B;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f8198C = null;

    /* renamed from: D  reason: collision with root package name */
    public PorterDuff.Mode f8199D = null;

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ h f8200E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f8201a;

    /* renamed from: b  reason: collision with root package name */
    public int f8202b;

    /* renamed from: c  reason: collision with root package name */
    public int f8203c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f8204e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8205f;
    public boolean g;
    public boolean h;

    /* renamed from: i  reason: collision with root package name */
    public int f8206i;

    /* renamed from: j  reason: collision with root package name */
    public int f8207j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f8208k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f8209l;

    /* renamed from: m  reason: collision with root package name */
    public int f8210m;

    /* renamed from: n  reason: collision with root package name */
    public char f8211n;

    /* renamed from: o  reason: collision with root package name */
    public int f8212o;

    /* renamed from: p  reason: collision with root package name */
    public char f8213p;

    /* renamed from: q  reason: collision with root package name */
    public int f8214q;

    /* renamed from: r  reason: collision with root package name */
    public int f8215r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8216s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8217t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8218u;

    /* renamed from: v  reason: collision with root package name */
    public int f8219v;

    /* renamed from: w  reason: collision with root package name */
    public int f8220w;

    /* renamed from: x  reason: collision with root package name */
    public String f8221x;

    /* renamed from: y  reason: collision with root package name */
    public String f8222y;

    /* renamed from: z  reason: collision with root package name */
    public n f8223z;

    public C0577g(h hVar, Menu menu) {
        this.f8200E = hVar;
        this.f8201a = menu;
        this.f8202b = 0;
        this.f8203c = 0;
        this.d = 0;
        this.f8204e = 0;
        this.f8205f = true;
        this.g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f8200E.f8228c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e6) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [i.f, android.view.MenuItem$OnMenuItemClickListener, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z3;
        MenuItem enabled = menuItem.setChecked(this.f8216s).setVisible(this.f8217t).setEnabled(this.f8218u);
        boolean z4 = false;
        if (this.f8215r >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        enabled.setCheckable(z3).setTitleCondensed(this.f8209l).setIcon(this.f8210m);
        int i2 = this.f8219v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f8222y;
        h hVar = this.f8200E;
        if (str != null) {
            if (!hVar.f8228c.isRestricted()) {
                if (hVar.d == null) {
                    hVar.d = h.a(hVar.f8228c);
                }
                Object obj = hVar.d;
                String str2 = this.f8222y;
                ? obj2 = new Object();
                obj2.f8194a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f8195b = cls.getMethod(str2, C0576f.f8193c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e6) {
                    StringBuilder t6 = C0552a.t("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    t6.append(cls.getName());
                    InflateException inflateException = new InflateException(t6.toString());
                    inflateException.initCause(e6);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f8215r >= 2) {
            if (menuItem instanceof m) {
                m mVar = (m) menuItem;
                mVar.f8750G = (mVar.f8750G & -5) | 4;
            } else if (menuItem instanceof r) {
                r rVar = (r) menuItem;
                try {
                    Method method = rVar.d;
                    a aVar = rVar.f8780c;
                    if (method == null) {
                        rVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    rVar.d.invoke(aVar, new Object[]{Boolean.TRUE});
                } catch (Exception e7) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
                }
            }
        }
        String str3 = this.f8221x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f8224e, hVar.f8226a));
            z4 = true;
        }
        int i5 = this.f8220w;
        if (i5 > 0) {
            if (!z4) {
                menuItem.setActionView(i5);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        n nVar = this.f8223z;
        if (nVar != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).b(nVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f8196A;
        boolean z5 = menuItem instanceof a;
        if (z5) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0071k.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f8197B;
        if (z5) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0071k.m(menuItem, charSequence2);
        }
        char c3 = this.f8211n;
        int i6 = this.f8212o;
        if (z5) {
            ((a) menuItem).setAlphabeticShortcut(c3, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0071k.g(menuItem, c3, i6);
        }
        char c6 = this.f8213p;
        int i7 = this.f8214q;
        if (z5) {
            ((a) menuItem).setNumericShortcut(c6, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0071k.k(menuItem, c6, i7);
        }
        PorterDuff.Mode mode = this.f8199D;
        if (mode != null) {
            if (z5) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0071k.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f8198C;
        if (colorStateList == null) {
            return;
        }
        if (z5) {
            ((a) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0071k.i(menuItem, colorStateList);
        }
    }
}
