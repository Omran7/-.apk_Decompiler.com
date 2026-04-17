package f;

import B.b;
import B.o;
import F3.g;
import G.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.C0289v;
import com.mtma.criminal.city.R;
import i.C0573c;
import i.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.C0671K0;
import k.C0738t;
import k.C0740u;
import k.a1;
import k.f1;
import z.e;

/* renamed from: f.i  reason: case insensitive filesystem */
public abstract class C0518i extends C0289v implements C0519j {

    /* renamed from: H  reason: collision with root package name */
    public z f7785H;

    public C0518i() {
        ((C0738t) this.d.d).f("androidx:appcompat", new C0516g(this));
        g(new C0517h(this));
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        z zVar = (z) n();
        zVar.v();
        ((ViewGroup) zVar.f7833J.findViewById(16908290)).addView(view, layoutParams);
        zVar.f7869v.a(zVar.f7868u.getCallback());
    }

    public void attachBaseContext(Context context) {
        Configuration configuration;
        z zVar = (z) n();
        zVar.f7847X = true;
        int i2 = zVar.f7851b0;
        if (i2 == -100) {
            i2 = n.f7790b;
        }
        int B6 = zVar.B(context, i2);
        if (n.b(context) && n.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (n.f7796r) {
                    try {
                        j jVar = n.f7791c;
                        if (jVar == null) {
                            if (n.d == null) {
                                n.d = j.a(e.e(context));
                            }
                            if (!n.d.f805a.f806a.isEmpty()) {
                                n.f7791c = n.d;
                            }
                        } else if (!jVar.equals(n.d)) {
                            j jVar2 = n.f7791c;
                            n.d = jVar2;
                            e.d(context, jVar2.f805a.f806a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!n.f7793f) {
                n.f7789a.execute(new g(context, 1));
            }
        }
        j m6 = z.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(z.q(context, B6, m6, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0573c) {
            try {
                ((C0573c) context).a(z.q(context, B6, m6, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (z.s0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f6 = configuration3.fontScale;
                    float f7 = configuration4.fontScale;
                    if (f6 != f7) {
                        configuration.fontScale = f7;
                    }
                    int i5 = configuration3.mcc;
                    int i6 = configuration4.mcc;
                    if (i5 != i6) {
                        configuration.mcc = i6;
                    }
                    int i7 = configuration3.mnc;
                    int i8 = configuration4.mnc;
                    if (i7 != i8) {
                        configuration.mnc = i8;
                    }
                    int i9 = Build.VERSION.SDK_INT;
                    t.a(configuration3, configuration4, configuration);
                    int i10 = configuration3.touchscreen;
                    int i11 = configuration4.touchscreen;
                    if (i10 != i11) {
                        configuration.touchscreen = i11;
                    }
                    int i12 = configuration3.keyboard;
                    int i13 = configuration4.keyboard;
                    if (i12 != i13) {
                        configuration.keyboard = i13;
                    }
                    int i14 = configuration3.keyboardHidden;
                    int i15 = configuration4.keyboardHidden;
                    if (i14 != i15) {
                        configuration.keyboardHidden = i15;
                    }
                    int i16 = configuration3.navigation;
                    int i17 = configuration4.navigation;
                    if (i16 != i17) {
                        configuration.navigation = i17;
                    }
                    int i18 = configuration3.navigationHidden;
                    int i19 = configuration4.navigationHidden;
                    if (i18 != i19) {
                        configuration.navigationHidden = i19;
                    }
                    int i20 = configuration3.orientation;
                    int i21 = configuration4.orientation;
                    if (i20 != i21) {
                        configuration.orientation = i21;
                    }
                    int i22 = configuration3.screenLayout & 15;
                    int i23 = configuration4.screenLayout & 15;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 192;
                    int i25 = configuration4.screenLayout & 192;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.screenLayout & 48;
                    int i27 = configuration4.screenLayout & 48;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.screenLayout & 768;
                    int i29 = configuration4.screenLayout & 768;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    if (i9 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 3);
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 12);
                        }
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration q6 = z.q(context, B6, m6, configuration, true);
            C0573c cVar = new C0573c(context, 2131952160);
            cVar.a(q6);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        o.a(theme);
                    } else {
                        synchronized (b.f141e) {
                            if (!b.g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", (Class[]) null);
                                    b.f142f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e6) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e6);
                                }
                                b.g = true;
                            }
                            Method method = b.f142f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, (Object[]) null);
                                } catch (IllegalAccessException | InvocationTargetException e7) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e7);
                                    b.f142f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        o();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        o();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int i2) {
        z zVar = (z) n();
        zVar.v();
        return zVar.f7868u.findViewById(i2);
    }

    public final MenuInflater getMenuInflater() {
        Context context;
        z zVar = (z) n();
        if (zVar.f7872y == null) {
            zVar.z();
            J j6 = zVar.f7871x;
            if (j6 != null) {
                context = j6.T0();
            } else {
                context = zVar.f7867t;
            }
            zVar.f7872y = new h(context);
        }
        return zVar.f7872y;
    }

    public final Resources getResources() {
        int i2 = f1.f9298a;
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        z zVar = (z) n();
        if (zVar.f7871x != null) {
            zVar.z();
            zVar.f7871x.getClass();
            zVar.A(0);
        }
    }

    public final n n() {
        if (this.f7785H == null) {
            m mVar = n.f7789a;
            this.f7785H = new z(this, (Window) null, this, this);
        }
        return this.f7785H;
    }

    public final J o() {
        z zVar = (z) n();
        zVar.z();
        return zVar.f7871x;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z zVar = (z) n();
        if (zVar.f7838O && zVar.f7832I) {
            zVar.z();
            J j6 = zVar.f7871x;
            if (j6 != null) {
                j6.V0(j6.f7736p.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0740u a6 = C0740u.a();
        Context context = zVar.f7867t;
        synchronized (a6) {
            C0671K0 k02 = a6.f9391a;
            synchronized (k02) {
                n.g gVar = (n.g) k02.f9197b.get(context);
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        zVar.f7850a0 = new Configuration(zVar.f7867t.getResources().getConfiguration());
        zVar.k(false, false);
    }

    public void onDestroy() {
        super.onDestroy();
        n().d();
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        J o6 = o();
        if (menuItem.getItemId() != 16908332 || o6 == null || (((a1) o6.f7740t).f9258b & 4) == 0) {
            return false;
        }
        Intent a6 = e.a(this);
        if (a6 == null) {
            return false;
        }
        if (shouldUpRecreateTask(a6)) {
            ArrayList arrayList = new ArrayList();
            Intent a7 = e.a(this);
            if (a7 == null) {
                a7 = e.a(this);
            }
            if (a7 != null) {
                ComponentName component = a7.getComponent();
                if (component == null) {
                    component = a7.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b6 = e.b(this, component);
                    while (b6 != null) {
                        arrayList.add(size, b6);
                        b6 = e.b(this, b6.getComponent());
                    }
                    arrayList.add(a7);
                } catch (PackageManager.NameNotFoundException e6) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e6);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!A.h.startActivities(this, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    startActivity(intent);
                }
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a6);
            return true;
        }
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((z) n()).v();
    }

    public final void onPostResume() {
        super.onPostResume();
        z zVar = (z) n();
        zVar.z();
        J j6 = zVar.f7871x;
        if (j6 != null) {
            j6.f7731I = true;
        }
    }

    public void onStart() {
        super.onStart();
        ((z) n()).k(true, false);
    }

    public void onStop() {
        super.onStop();
        z zVar = (z) n();
        zVar.z();
        J j6 = zVar.f7871x;
        if (j6 != null) {
            j6.f7731I = false;
            i.j jVar = j6.f7730H;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        n().j(charSequence);
    }

    public final void openOptionsMenu() {
        o();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i2) {
        j();
        n().g(i2);
    }

    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((z) n()).f7852c0 = i2;
    }

    public void setContentView(View view) {
        j();
        n().h(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        n().i(view, layoutParams);
    }

    public final void onContentChanged() {
    }
}
