package f;

import E2.f;
import G.k;
import K.D;
import K.O;
import K.X;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.mtma.criminal.city.R;
import e.C0476a;
import i.C0571a;
import i.C0573c;
import i.h;
import j.g;
import j.i;
import j.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0692V0;
import k.C0710f;
import k.C0718j;
import k.C0721k0;
import k.C0723l0;
import k.C0740u;
import k.a1;
import k.i1;
import n.j;
import z.e;

public final class z extends n implements i, LayoutInflater.Factory2 {

    /* renamed from: q0  reason: collision with root package name */
    public static final j f7823q0 = new j(0);

    /* renamed from: r0  reason: collision with root package name */
    public static final int[] f7824r0 = {16842836};
    public static final boolean s0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: A  reason: collision with root package name */
    public C0721k0 f7825A;

    /* renamed from: B  reason: collision with root package name */
    public p f7826B;

    /* renamed from: C  reason: collision with root package name */
    public q f7827C;

    /* renamed from: D  reason: collision with root package name */
    public C0571a f7828D;

    /* renamed from: E  reason: collision with root package name */
    public ActionBarContextView f7829E;
    public PopupWindow F;

    /* renamed from: G  reason: collision with root package name */
    public o f7830G;

    /* renamed from: H  reason: collision with root package name */
    public X f7831H = null;

    /* renamed from: I  reason: collision with root package name */
    public boolean f7832I;

    /* renamed from: J  reason: collision with root package name */
    public ViewGroup f7833J;

    /* renamed from: K  reason: collision with root package name */
    public TextView f7834K;

    /* renamed from: L  reason: collision with root package name */
    public View f7835L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f7836M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f7837N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f7838O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f7839P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f7840Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f7841R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f7842S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f7843T;

    /* renamed from: U  reason: collision with root package name */
    public y[] f7844U;

    /* renamed from: V  reason: collision with root package name */
    public y f7845V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f7846W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f7847X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f7848Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f7849Z;

    /* renamed from: a0  reason: collision with root package name */
    public Configuration f7850a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f7851b0 = -100;

    /* renamed from: c0  reason: collision with root package name */
    public int f7852c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f7853d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7854e0;

    /* renamed from: f0  reason: collision with root package name */
    public w f7855f0;

    /* renamed from: g0  reason: collision with root package name */
    public w f7856g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f7857h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7858i0;

    /* renamed from: j0  reason: collision with root package name */
    public final o f7859j0 = new o(this, 0);

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7860k0;

    /* renamed from: l0  reason: collision with root package name */
    public Rect f7861l0;

    /* renamed from: m0  reason: collision with root package name */
    public Rect f7862m0;

    /* renamed from: n0  reason: collision with root package name */
    public C f7863n0;

    /* renamed from: o0  reason: collision with root package name */
    public OnBackInvokedDispatcher f7864o0;

    /* renamed from: p0  reason: collision with root package name */
    public OnBackInvokedCallback f7865p0;

    /* renamed from: s  reason: collision with root package name */
    public final Object f7866s;

    /* renamed from: t  reason: collision with root package name */
    public final Context f7867t;

    /* renamed from: u  reason: collision with root package name */
    public Window f7868u;

    /* renamed from: v  reason: collision with root package name */
    public v f7869v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f7870w;

    /* renamed from: x  reason: collision with root package name */
    public J f7871x;

    /* renamed from: y  reason: collision with root package name */
    public h f7872y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f7873z;

    public z(Context context, Window window, C0519j jVar, Object obj) {
        C0518i iVar = null;
        this.f7867t = context;
        this.f7866s = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C0518i)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        iVar = (C0518i) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (iVar != null) {
                this.f7851b0 = ((z) iVar.n()).f7851b0;
            }
        }
        if (this.f7851b0 == -100) {
            j jVar2 = f7823q0;
            Integer num = (Integer) jVar2.get(this.f7866s.getClass().getName());
            if (num != null) {
                this.f7851b0 = num.intValue();
                jVar2.remove(this.f7866s.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0740u.d();
    }

    public static G.j m(Context context) {
        G.j jVar;
        G.j jVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (jVar = n.f7791c) == null) {
            return null;
        }
        G.j b6 = t.b(context.getApplicationContext().getResources().getConfiguration());
        k kVar = jVar.f805a;
        if (kVar.f806a.isEmpty()) {
            jVar2 = G.j.f804b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i2 = 0;
            while (true) {
                if (i2 >= b6.f805a.f806a.size() + kVar.f806a.size()) {
                    break;
                }
                if (i2 < kVar.f806a.size()) {
                    locale = kVar.f806a.get(i2);
                } else {
                    locale = b6.f805a.f806a.get(i2 - kVar.f806a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i2++;
            }
            jVar2 = new G.j(new k(G.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (jVar2.f805a.f806a.isEmpty()) {
            return b6;
        }
        return jVar2;
    }

    public static Configuration q(Context context, int i2, G.j jVar, Configuration configuration, boolean z3) {
        int i5;
        if (i2 == 1) {
            i5 = 16;
        } else if (i2 == 2) {
            i5 = 32;
        } else if (z3) {
            i5 = 0;
        } else {
            i5 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & -49);
        if (jVar != null) {
            t.d(configuration2, jVar);
        }
        return configuration2;
    }

    public final void A(int i2) {
        this.f7858i0 = (1 << i2) | this.f7858i0;
        if (!this.f7857h0) {
            View decorView = this.f7868u.getDecorView();
            o oVar = this.f7859j0;
            WeakHashMap weakHashMap = O.f1352a;
            decorView.postOnAnimation(oVar);
            this.f7857h0 = true;
        }
    }

    public final int B(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        if (this.f7856g0 == null) {
                            this.f7856g0 = new w(this, context);
                        }
                        return this.f7856g0.i();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return x(context).i();
            }
        }
        return i2;
    }

    public final boolean C() {
        C0723l0 l0Var;
        C0692V0 v02;
        m mVar;
        boolean z3 = this.f7846W;
        this.f7846W = false;
        y y6 = y(0);
        if (y6.f7819m) {
            if (!z3) {
                p(y6, true);
            }
            return true;
        }
        C0571a aVar = this.f7828D;
        if (aVar != null) {
            aVar.a();
            return true;
        }
        z();
        J j6 = this.f7871x;
        if (j6 == null || (l0Var = j6.f7740t) == null || (v02 = ((a1) l0Var).f9257a.f4809U) == null || v02.f9238b == null) {
            return false;
        }
        C0692V0 v03 = ((a1) l0Var).f9257a.f4809U;
        if (v03 == null) {
            mVar = null;
        } else {
            mVar = v03.f9238b;
        }
        if (mVar != null) {
            mVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0152, code lost:
        if (r3 != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0172, code lost:
        if (r3.f8713f.getCount() > 0) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(f.y r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.f7819m
            if (r2 != 0) goto L_0x01d6
            boolean r2 = r0.f7849Z
            if (r2 == 0) goto L_0x000e
            goto L_0x01d6
        L_0x000e:
            int r2 = r1.f7810a
            android.content.Context r3 = r0.f7867t
            if (r2 != 0) goto L_0x0024
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0024
            return
        L_0x0024:
            android.view.Window r4 = r0.f7868u
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L_0x0039
            j.k r6 = r1.h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L_0x0039
            r0.p(r1, r5)
            return
        L_0x0039:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r17.F(r18, r19)
            if (r6 != 0) goto L_0x004b
            return
        L_0x004b:
            f.x r6 = r1.f7813e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L_0x0068
            boolean r9 = r1.f7820n
            if (r9 == 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01ad
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L_0x01ad
            r10 = r6
            goto L_0x01ae
        L_0x0068:
            if (r6 != 0) goto L_0x00e3
            r17.z()
            f.J r6 = r0.f7871x
            if (r6 == 0) goto L_0x0076
            android.content.Context r6 = r6.T0()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r6
        L_0x007b:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            r10 = 2130903044(0x7f030004, float:1.7412895E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L_0x009c
            r9.applyStyle(r10, r5)
        L_0x009c:
            r10 = 2130903990(0x7f0303b6, float:1.7414814E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto L_0x00aa
            r9.applyStyle(r6, r5)
            goto L_0x00b0
        L_0x00aa:
            r6 = 2131952148(0x7f130214, float:1.954073E38)
            r9.applyStyle(r6, r5)
        L_0x00b0:
            i.c r6 = new i.c
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.f7816j = r6
            int[] r3 = e.C0476a.f7538j
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            r6 = 86
            int r6 = r3.getResourceId(r6, r7)
            r1.f7811b = r6
            int r6 = r3.getResourceId(r5, r7)
            r1.d = r6
            r3.recycle()
            f.x r3 = new f.x
            i.c r6 = r1.f7816j
            r3.<init>(r0, r6)
            r1.f7813e = r3
            r3 = 81
            r1.f7812c = r3
            goto L_0x00f2
        L_0x00e3:
            boolean r3 = r1.f7820n
            if (r3 == 0) goto L_0x00f2
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x00f2
            f.x r3 = r1.f7813e
            r3.removeAllViews()
        L_0x00f2:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x00f9
            r1.f7814f = r3
            goto L_0x0154
        L_0x00f9:
            j.k r3 = r1.h
            if (r3 != 0) goto L_0x00ff
            goto L_0x01d4
        L_0x00ff:
            f.q r3 = r0.f7827C
            if (r3 != 0) goto L_0x010a
            f.q r3 = new f.q
            r3.<init>(r0)
            r0.f7827C = r3
        L_0x010a:
            f.q r3 = r0.f7827C
            j.g r6 = r1.f7815i
            if (r6 != 0) goto L_0x0122
            j.g r6 = new j.g
            i.c r9 = r1.f7816j
            r6.<init>(r9)
            r1.f7815i = r6
            r6.f8712e = r3
            j.k r3 = r1.h
            android.content.Context r9 = r3.f8726a
            r3.b(r6, r9)
        L_0x0122:
            j.g r3 = r1.f7815i
            f.x r6 = r1.f7813e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.d
            if (r9 != 0) goto L_0x014e
            android.view.LayoutInflater r9 = r3.f8710b
            r10 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.d = r6
            j.f r6 = r3.f8713f
            if (r6 != 0) goto L_0x0142
            j.f r6 = new j.f
            r6.<init>(r3)
            r3.f8713f = r6
        L_0x0142:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.d
            j.f r9 = r3.f8713f
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.d
            r6.setOnItemClickListener(r3)
        L_0x014e:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.d
            r1.f7814f = r3
            if (r3 == 0) goto L_0x01d4
        L_0x0154:
            android.view.View r3 = r1.f7814f
            if (r3 != 0) goto L_0x015a
            goto L_0x01d4
        L_0x015a:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L_0x015f
            goto L_0x0174
        L_0x015f:
            j.g r3 = r1.f7815i
            j.f r6 = r3.f8713f
            if (r6 != 0) goto L_0x016c
            j.f r6 = new j.f
            r6.<init>(r3)
            r3.f8713f = r6
        L_0x016c:
            j.f r3 = r3.f8713f
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x01d4
        L_0x0174:
            android.view.View r3 = r1.f7814f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0181
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L_0x0181:
            int r6 = r1.f7811b
            f.x r9 = r1.f7813e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f7814f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x0199
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f7814f
            r6.removeView(r9)
        L_0x0199:
            f.x r6 = r1.f7813e
            android.view.View r9 = r1.f7814f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f7814f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L_0x01ad
            android.view.View r3 = r1.f7814f
            r3.requestFocus()
        L_0x01ad:
            r10 = r8
        L_0x01ae:
            r1.f7818l = r7
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r6 = r1.f7812c
            r3.gravity = r6
            int r6 = r1.d
            r3.windowAnimations = r6
            f.x r6 = r1.f7813e
            r4.addView(r6, r3)
            r1.f7819m = r5
            if (r2 != 0) goto L_0x01d3
            r17.H()
        L_0x01d3:
            return
        L_0x01d4:
            r1.f7820n = r5
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.z.D(f.y, android.view.KeyEvent):void");
    }

    public final boolean E(y yVar, int i2, KeyEvent keyEvent) {
        j.k kVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((yVar.f7817k || F(yVar, keyEvent)) && (kVar = yVar.h) != null) {
            return kVar.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(y yVar, KeyEvent keyEvent) {
        boolean z3;
        int i2;
        boolean z4;
        C0721k0 k0Var;
        C0721k0 k0Var2;
        C0721k0 k0Var3;
        Resources.Theme theme;
        C0721k0 k0Var4;
        if (this.f7849Z) {
            return false;
        }
        if (yVar.f7817k) {
            return true;
        }
        y yVar2 = this.f7845V;
        if (!(yVar2 == null || yVar2 == yVar)) {
            p(yVar2, false);
        }
        Window.Callback callback = this.f7868u.getCallback();
        int i5 = yVar.f7810a;
        if (callback != null) {
            yVar.g = callback.onCreatePanelView(i5);
        }
        if (i5 == 0 || i5 == 108) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && (k0Var4 = this.f7825A) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k0Var4;
            actionBarOverlayLayout.k();
            ((a1) actionBarOverlayLayout.f4753e).f9265l = true;
        }
        if (yVar.g == null) {
            j.k kVar = yVar.h;
            if (kVar == null || yVar.f7821o) {
                if (kVar == null) {
                    Context context = this.f7867t;
                    if ((i5 == 0 || i5 == 108) && this.f7825A != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0573c cVar = new C0573c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    j.k kVar2 = new j.k(context);
                    kVar2.f8729e = this;
                    j.k kVar3 = yVar.h;
                    if (kVar2 != kVar3) {
                        if (kVar3 != null) {
                            kVar3.r(yVar.f7815i);
                        }
                        yVar.h = kVar2;
                        g gVar = yVar.f7815i;
                        if (gVar != null) {
                            kVar2.b(gVar, kVar2.f8726a);
                        }
                    }
                    if (yVar.h == null) {
                        return false;
                    }
                }
                if (z3 && (k0Var3 = this.f7825A) != null) {
                    if (this.f7826B == null) {
                        this.f7826B = new p(this);
                    }
                    ((ActionBarOverlayLayout) k0Var3).l(yVar.h, this.f7826B);
                }
                yVar.h.w();
                if (!callback.onCreatePanelMenu(i5, yVar.h)) {
                    j.k kVar4 = yVar.h;
                    if (kVar4 != null) {
                        if (kVar4 != null) {
                            kVar4.r(yVar.f7815i);
                        }
                        yVar.h = null;
                    }
                    if (z3 && (k0Var2 = this.f7825A) != null) {
                        ((ActionBarOverlayLayout) k0Var2).l((j.k) null, this.f7826B);
                    }
                    return false;
                }
                yVar.f7821o = false;
            }
            yVar.h.w();
            Bundle bundle = yVar.f7822p;
            if (bundle != null) {
                yVar.h.s(bundle);
                yVar.f7822p = null;
            }
            if (!callback.onPreparePanel(0, yVar.g, yVar.h)) {
                if (z3 && (k0Var = this.f7825A) != null) {
                    ((ActionBarOverlayLayout) k0Var).l((j.k) null, this.f7826B);
                }
                yVar.h.v();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            yVar.h.setQwertyMode(z4);
            yVar.h.v();
        }
        yVar.f7817k = true;
        yVar.f7818l = false;
        this.f7845V = yVar;
        return true;
    }

    public final void G() {
        if (this.f7832I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f7864o0 != null && (y(0).f7819m || this.f7828D != null)) {
                z3 = true;
            }
            if (z3 && this.f7865p0 == null) {
                this.f7865p0 = u.b(this.f7864o0, this);
            } else if (!z3 && (onBackInvokedCallback = this.f7865p0) != null) {
                u.c(this.f7864o0, onBackInvokedCallback);
                this.f7865p0 = null;
            }
        }
    }

    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f7867t);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof z)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void c() {
        String str;
        this.f7847X = true;
        k(false, true);
        w();
        Object obj = this.f7866s;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = e.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e6) {
                throw new IllegalArgumentException(e6);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                J j6 = this.f7871x;
                if (j6 == null) {
                    this.f7860k0 = true;
                } else if (!j6.f7743w) {
                    a1 a1Var = (a1) j6.f7740t;
                    int i2 = a1Var.f9258b;
                    j6.f7743w = true;
                    a1Var.a((i2 & -5) | 4);
                }
            }
            synchronized (n.f7795q) {
                n.e(this);
                n.f7794p.add(new WeakReference(this));
            }
        }
        this.f7850a0 = new Configuration(this.f7867t.getResources().getConfiguration());
        this.f7848Y = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f7866s
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = f.n.f7795q
            monitor-enter(r0)
            f.n.e(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f7857h0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f7868u
            android.view.View r0 = r0.getDecorView()
            f.o r1 = r3.f7859j0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f7849Z = r0
            int r0 = r3.f7851b0
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f7866s
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            n.j r0 = f7823q0
            java.lang.Object r1 = r3.f7866s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f7851b0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            n.j r0 = f7823q0
            java.lang.Object r1 = r3.f7866s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            f.w r0 = r3.f7855f0
            if (r0 == 0) goto L_0x0063
            r0.c()
        L_0x0063:
            f.w r0 = r3.f7856g0
            if (r0 == 0) goto L_0x006a
            r0.c()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.z.d():void");
    }

    public final boolean f(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f7842S && i2 == 108) {
            return false;
        }
        if (this.f7838O && i2 == 1) {
            this.f7838O = false;
        }
        if (i2 == 1) {
            G();
            this.f7842S = true;
            return true;
        } else if (i2 == 2) {
            G();
            this.f7836M = true;
            return true;
        } else if (i2 == 5) {
            G();
            this.f7837N = true;
            return true;
        } else if (i2 == 10) {
            G();
            this.f7840Q = true;
            return true;
        } else if (i2 == 108) {
            G();
            this.f7838O = true;
            return true;
        } else if (i2 != 109) {
            return this.f7868u.requestFeature(i2);
        } else {
            G();
            this.f7839P = true;
            return true;
        }
    }

    public final void g(int i2) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f7833J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f7867t).inflate(i2, viewGroup);
        this.f7869v.a(this.f7868u.getCallback());
    }

    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f7833J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f7869v.a(this.f7868u.getCallback());
    }

    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f7833J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f7869v.a(this.f7868u.getCallback());
    }

    public final void j(CharSequence charSequence) {
        this.f7873z = charSequence;
        C0721k0 k0Var = this.f7825A;
        if (k0Var != null) {
            k0Var.setWindowTitle(charSequence);
            return;
        }
        J j6 = this.f7871x;
        if (j6 != null) {
            a1 a1Var = (a1) j6.f7740t;
            if (!a1Var.g) {
                a1Var.h = charSequence;
                if ((a1Var.f9258b & 8) != 0) {
                    Toolbar toolbar = a1Var.f9257a;
                    toolbar.setTitle(charSequence);
                    if (a1Var.g) {
                        O.m(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.f7834K;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0101 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(boolean r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.f7849Z
            r3 = 0
            if (r0 == 0) goto L_0x000a
            return r3
        L_0x000a:
            int r0 = r1.f7851b0
            r4 = -100
            if (r0 == r4) goto L_0x0012
        L_0x0010:
            r4 = r0
            goto L_0x0015
        L_0x0012:
            int r0 = f.n.f7790b
            goto L_0x0010
        L_0x0015:
            android.content.Context r5 = r1.f7867t
            int r0 = r1.B(r5, r4)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            r8 = 0
            if (r6 >= r7) goto L_0x0027
            G.j r7 = m(r5)
            goto L_0x0028
        L_0x0027:
            r7 = r8
        L_0x0028:
            if (r18 != 0) goto L_0x0038
            if (r7 == 0) goto L_0x0038
            android.content.res.Resources r7 = r5.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            G.j r7 = f.t.b(r7)
        L_0x0038:
            android.content.res.Configuration r9 = q(r5, r0, r7, r8, r3)
            boolean r0 = r1.f7854e0
            java.lang.Object r10 = r1.f7866s
            r11 = 1
            if (r0 != 0) goto L_0x0076
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0076
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            if (r0 != 0) goto L_0x004f
            r0 = r3
            goto L_0x007a
        L_0x004f:
            r12 = 29
            if (r6 < r12) goto L_0x0056
            r6 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0058
        L_0x0056:
            r6 = 786432(0xc0000, float:1.102026E-39)
        L_0x0058:
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x006c }
            java.lang.Class r13 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x006c }
            r12.<init>(r5, r13)     // Catch:{ NameNotFoundException -> 0x006c }
            android.content.pm.ActivityInfo r0 = r0.getActivityInfo(r12, r6)     // Catch:{ NameNotFoundException -> 0x006c }
            if (r0 == 0) goto L_0x0076
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x006c }
            r1.f7853d0 = r0     // Catch:{ NameNotFoundException -> 0x006c }
            goto L_0x0076
        L_0x006c:
            r0 = move-exception
            java.lang.String r6 = "AppCompatDelegate"
            java.lang.String r12 = "Exception while getting ActivityInfo"
            android.util.Log.d(r6, r12, r0)
            r1.f7853d0 = r3
        L_0x0076:
            r1.f7854e0 = r11
            int r0 = r1.f7853d0
        L_0x007a:
            android.content.res.Configuration r6 = r1.f7850a0
            if (r6 != 0) goto L_0x0086
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
        L_0x0086:
            int r12 = r6.uiMode
            r12 = r12 & 48
            int r13 = r9.uiMode
            r13 = r13 & 48
            G.j r6 = f.t.b(r6)
            if (r7 != 0) goto L_0x0096
            r7 = r8
            goto L_0x009a
        L_0x0096:
            G.j r7 = f.t.b(r9)
        L_0x009a:
            if (r12 == r13) goto L_0x009e
            r12 = r2
            goto L_0x009f
        L_0x009e:
            r12 = r3
        L_0x009f:
            if (r7 == 0) goto L_0x00a9
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x00a9
            r12 = r12 | 8196(0x2004, float:1.1485E-41)
        L_0x00a9:
            int r6 = ~r0
            r6 = r6 & r12
            r14 = 28
            if (r6 == 0) goto L_0x00fe
            if (r17 == 0) goto L_0x00fe
            boolean r6 = r1.f7847X
            if (r6 == 0) goto L_0x00fe
            boolean r6 = s0
            if (r6 != 0) goto L_0x00bd
            boolean r6 = r1.f7848Y
            if (r6 == 0) goto L_0x00fe
        L_0x00bd:
            boolean r6 = r10 instanceof android.app.Activity
            if (r6 == 0) goto L_0x00fe
            r6 = r10
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r15 = r6.isChild()
            if (r15 != 0) goto L_0x00fe
            int r15 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r15 < r3) goto L_0x00e3
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x00e3
            android.view.Window r3 = r6.getWindow()
            android.view.View r3 = r3.getDecorView()
            int r9 = r9.getLayoutDirection()
            r3.setLayoutDirection(r9)
        L_0x00e3:
            if (r15 < r14) goto L_0x00e9
            r6.recreate()
            goto L_0x00fc
        L_0x00e9:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r9 = r6.getMainLooper()
            r3.<init>(r9)
            A4.a r9 = new A4.a
            r15 = 23
            r9.<init>(r6, r15)
            r3.post(r9)
        L_0x00fc:
            r3 = r11
            goto L_0x00ff
        L_0x00fe:
            r3 = 0
        L_0x00ff:
            if (r3 != 0) goto L_0x021f
            if (r12 == 0) goto L_0x021f
            r0 = r0 & r12
            if (r0 != r12) goto L_0x0108
            r3 = r11
            goto L_0x0109
        L_0x0108:
            r3 = 0
        L_0x0109:
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Configuration r9 = new android.content.res.Configuration
            android.content.res.Configuration r0 = r6.getConfiguration()
            r9.<init>(r0)
            android.content.res.Configuration r0 = r6.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & -49
            r0 = r0 | r13
            r9.uiMode = r0
            if (r7 == 0) goto L_0x0126
            f.t.d(r9, r7)
        L_0x0126:
            r6.updateConfiguration(r9, r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r0 >= r13) goto L_0x01e1
            if (r0 < r14) goto L_0x0133
            goto L_0x01e1
        L_0x0133:
            boolean r0 = R2.b.f2480s
            java.lang.String r13 = "ResourcesFlusher"
            if (r0 != 0) goto L_0x014f
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r14 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r14)     // Catch:{ NoSuchFieldException -> 0x0147 }
            R2.b.f2479r = r0     // Catch:{ NoSuchFieldException -> 0x0147 }
            r0.setAccessible(r11)     // Catch:{ NoSuchFieldException -> 0x0147 }
            goto L_0x014d
        L_0x0147:
            r0 = move-exception
            java.lang.String r14 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r13, r14, r0)
        L_0x014d:
            R2.b.f2480s = r11
        L_0x014f:
            java.lang.reflect.Field r0 = R2.b.f2479r
            if (r0 != 0) goto L_0x0155
            goto L_0x01e1
        L_0x0155:
            java.lang.Object r0 = r0.get(r6)     // Catch:{ IllegalAccessException -> 0x015b }
            r6 = r0
            goto L_0x0163
        L_0x015b:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r13, r0, r6)
            r6 = r8
        L_0x0163:
            if (r6 != 0) goto L_0x0167
            goto L_0x01e1
        L_0x0167:
            boolean r0 = R2.b.d
            if (r0 != 0) goto L_0x0183
            java.lang.Class r0 = r6.getClass()     // Catch:{ NoSuchFieldException -> 0x017b }
            java.lang.String r14 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r14)     // Catch:{ NoSuchFieldException -> 0x017b }
            R2.b.f2474c = r0     // Catch:{ NoSuchFieldException -> 0x017b }
            r0.setAccessible(r11)     // Catch:{ NoSuchFieldException -> 0x017b }
            goto L_0x0181
        L_0x017b:
            r0 = move-exception
            java.lang.String r14 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r13, r14, r0)
        L_0x0181:
            R2.b.d = r11
        L_0x0183:
            java.lang.reflect.Field r0 = R2.b.f2474c
            if (r0 == 0) goto L_0x0194
            java.lang.Object r0 = r0.get(r6)     // Catch:{ IllegalAccessException -> 0x018d }
            r6 = r0
            goto L_0x0195
        L_0x018d:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r13, r0, r6)
        L_0x0194:
            r6 = r8
        L_0x0195:
            if (r6 == 0) goto L_0x01e1
            boolean r0 = R2.b.f2476f
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = "android.content.res.ThemedResourceCache"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x01a4 }
            R2.b.f2475e = r0     // Catch:{ ClassNotFoundException -> 0x01a4 }
            goto L_0x01aa
        L_0x01a4:
            r0 = move-exception
            java.lang.String r14 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r13, r14, r0)
        L_0x01aa:
            R2.b.f2476f = r11
        L_0x01ac:
            java.lang.Class r0 = R2.b.f2475e
            if (r0 != 0) goto L_0x01b1
            goto L_0x01e1
        L_0x01b1:
            boolean r14 = R2.b.f2478q
            if (r14 != 0) goto L_0x01c9
            java.lang.String r14 = "mUnthemedEntries"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r14)     // Catch:{ NoSuchFieldException -> 0x01c1 }
            R2.b.f2477p = r0     // Catch:{ NoSuchFieldException -> 0x01c1 }
            r0.setAccessible(r11)     // Catch:{ NoSuchFieldException -> 0x01c1 }
            goto L_0x01c7
        L_0x01c1:
            r0 = move-exception
            java.lang.String r14 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r13, r14, r0)
        L_0x01c7:
            R2.b.f2478q = r11
        L_0x01c9:
            java.lang.reflect.Field r0 = R2.b.f2477p
            if (r0 != 0) goto L_0x01ce
            goto L_0x01e1
        L_0x01ce:
            java.lang.Object r0 = r0.get(r6)     // Catch:{ IllegalAccessException -> 0x01d6 }
            android.util.LongSparseArray r0 = (android.util.LongSparseArray) r0     // Catch:{ IllegalAccessException -> 0x01d6 }
            r8 = r0
            goto L_0x01dc
        L_0x01d6:
            r0 = move-exception
            java.lang.String r6 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r13, r6, r0)
        L_0x01dc:
            if (r8 == 0) goto L_0x01e1
            r8.clear()
        L_0x01e1:
            int r0 = r1.f7852c0
            if (r0 == 0) goto L_0x01f1
            r5.setTheme(r0)
            android.content.res.Resources$Theme r0 = r5.getTheme()
            int r6 = r1.f7852c0
            r0.applyStyle(r6, r11)
        L_0x01f1:
            if (r3 == 0) goto L_0x0220
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0220
            r0 = r10
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r3 = r0 instanceof androidx.lifecycle.C0307s
            if (r3 == 0) goto L_0x0213
            r3 = r0
            androidx.lifecycle.s r3 = (androidx.lifecycle.C0307s) r3
            androidx.lifecycle.u r3 = r3.h()
            androidx.lifecycle.n r3 = r3.f5278c
            androidx.lifecycle.n r6 = androidx.lifecycle.C0303n.f5270c
            int r3 = r3.compareTo(r6)
            if (r3 < 0) goto L_0x0220
            r0.onConfigurationChanged(r9)
            goto L_0x0220
        L_0x0213:
            boolean r3 = r1.f7848Y
            if (r3 == 0) goto L_0x0220
            boolean r3 = r1.f7849Z
            if (r3 != 0) goto L_0x0220
            r0.onConfigurationChanged(r9)
            goto L_0x0220
        L_0x021f:
            r11 = r3
        L_0x0220:
            if (r11 == 0) goto L_0x0233
            boolean r0 = r10 instanceof f.C0518i
            if (r0 == 0) goto L_0x0233
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x022d
            r0 = r10
            f.i r0 = (f.C0518i) r0
        L_0x022d:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0233
            f.i r10 = (f.C0518i) r10
        L_0x0233:
            if (r7 == 0) goto L_0x0244
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            G.j r0 = f.t.b(r0)
            f.t.c(r0)
        L_0x0244:
            if (r4 != 0) goto L_0x024e
            E2.f r0 = r1.x(r5)
            r0.n()
            goto L_0x0255
        L_0x024e:
            f.w r0 = r1.f7855f0
            if (r0 == 0) goto L_0x0255
            r0.c()
        L_0x0255:
            r0 = 3
            if (r4 != r0) goto L_0x0269
            f.w r0 = r1.f7856g0
            if (r0 != 0) goto L_0x0263
            f.w r0 = new f.w
            r0.<init>((f.z) r1, (android.content.Context) r5)
            r1.f7856g0 = r0
        L_0x0263:
            f.w r0 = r1.f7856g0
            r0.n()
            goto L_0x0270
        L_0x0269:
            f.w r0 = r1.f7856g0
            if (r0 == 0) goto L_0x0270
            r0.c()
        L_0x0270:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f.z.k(boolean, boolean):boolean");
    }

    public final void l(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f7868u == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof v)) {
                v vVar = new v(this, callback);
                this.f7869v = vVar;
                window.setCallback(vVar);
                int[] iArr = f7824r0;
                Context context = this.f7867t;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    C0740u a6 = C0740u.a();
                    synchronized (a6) {
                        drawable = a6.f9391a.d(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f7868u = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f7864o0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f7865p0) == null)) {
                        u.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f7865p0 = null;
                    }
                    Object obj = this.f7866s;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f7864o0 = u.a(activity);
                            H();
                            return;
                        }
                    }
                    this.f7864o0 = null;
                    H();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void n(int i2, y yVar, j.k kVar) {
        if (kVar == null) {
            if (yVar == null && i2 >= 0) {
                y[] yVarArr = this.f7844U;
                if (i2 < yVarArr.length) {
                    yVar = yVarArr[i2];
                }
            }
            if (yVar != null) {
                kVar = yVar.h;
            }
        }
        if ((yVar == null || yVar.f7819m) && !this.f7849Z) {
            v vVar = this.f7869v;
            Window.Callback callback = this.f7868u.getCallback();
            vVar.getClass();
            try {
                vVar.d = true;
                callback.onPanelClosed(i2, kVar);
                vVar.d = false;
            } catch (Throwable th) {
                vVar.d = false;
                throw th;
            }
        }
    }

    public final void o(j.k kVar) {
        C0718j jVar;
        if (!this.f7843T) {
            this.f7843T = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f7825A;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((a1) actionBarOverlayLayout.f4753e).f9257a.f4812a;
            if (!(actionMenuView == null || (jVar = actionMenuView.f4768C) == null)) {
                jVar.c();
                C0710f fVar = jVar.f9320C;
                if (fVar != null && fVar.b()) {
                    fVar.f8788i.dismiss();
                }
            }
            Window.Callback callback = this.f7868u.getCallback();
            if (callback != null && !this.f7849Z) {
                callback.onPanelClosed(108, kVar);
            }
            this.f7843T = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0115, code lost:
        if (r2.equals("ImageButton") == false) goto L_0x009d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = 3
            r6 = -1
            r7 = 4
            r8 = 1
            f.C r0 = r1.f7863n0
            r9 = 0
            if (r0 != 0) goto L_0x0061
            int[] r0 = e.C0476a.f7538j
            android.content.Context r10 = r1.f7867t
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0)
            r11 = 116(0x74, float:1.63E-43)
            java.lang.String r11 = r0.getString(r11)
            r0.recycle()
            if (r11 != 0) goto L_0x002c
            f.C r0 = new f.C
            r0.<init>()
            r1.f7863n0 = r0
            goto L_0x0061
        L_0x002c:
            java.lang.ClassLoader r0 = r10.getClassLoader()     // Catch:{ all -> 0x0041 }
            java.lang.Class r0 = r0.loadClass(r11)     // Catch:{ all -> 0x0041 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r9)     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.newInstance(r9)     // Catch:{ all -> 0x0041 }
            f.C r0 = (f.C) r0     // Catch:{ all -> 0x0041 }
            r1.f7863n0 = r0     // Catch:{ all -> 0x0041 }
            goto L_0x0061
        L_0x0041:
            r0 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Failed to instantiate custom view inflater "
            r10.<init>(r12)
            r10.append(r11)
            java.lang.String r11 = ". Falling back to default."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "AppCompatDelegate"
            android.util.Log.i(r11, r10, r0)
            f.C r0 = new f.C
            r0.<init>()
            r1.f7863n0 = r0
        L_0x0061:
            f.C r0 = r1.f7863n0
            int r10 = k.f1.f9298a
            r0.getClass()
            int[] r10 = e.C0476a.f7552x
            r15 = 0
            android.content.res.TypedArray r10 = r3.obtainStyledAttributes(r4, r10, r15, r15)
            int r11 = r10.getResourceId(r7, r15)
            if (r11 == 0) goto L_0x007c
            java.lang.String r12 = "AppCompatViewInflater"
            java.lang.String r13 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r12, r13)
        L_0x007c:
            r10.recycle()
            if (r11 == 0) goto L_0x0092
            boolean r10 = r3 instanceof i.C0573c
            if (r10 == 0) goto L_0x008c
            r10 = r3
            i.c r10 = (i.C0573c) r10
            int r10 = r10.f8182a
            if (r10 == r11) goto L_0x0092
        L_0x008c:
            i.c r10 = new i.c
            r10.<init>(r3, r11)
            goto L_0x0093
        L_0x0092:
            r10 = r3
        L_0x0093:
            r19.getClass()
            int r11 = r19.hashCode()
            switch(r11) {
                case -1946472170: goto L_0x013c;
                case -1455429095: goto L_0x0130;
                case -1346021293: goto L_0x0124;
                case -938935918: goto L_0x0118;
                case -937446323: goto L_0x010f;
                case -658531749: goto L_0x0104;
                case -339785223: goto L_0x00f9;
                case 776382189: goto L_0x00ee;
                case 799298502: goto L_0x00e1;
                case 1125864064: goto L_0x00d4;
                case 1413872058: goto L_0x00c7;
                case 1601505219: goto L_0x00ba;
                case 1666676343: goto L_0x00ad;
                case 2001146706: goto L_0x00a0;
                default: goto L_0x009d;
            }
        L_0x009d:
            r7 = r6
            goto L_0x0147
        L_0x00a0:
            java.lang.String r7 = "Button"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00a9
            goto L_0x009d
        L_0x00a9:
            r7 = 13
            goto L_0x0147
        L_0x00ad:
            java.lang.String r7 = "EditText"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00b6
            goto L_0x009d
        L_0x00b6:
            r7 = 12
            goto L_0x0147
        L_0x00ba:
            java.lang.String r7 = "CheckBox"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00c3
            goto L_0x009d
        L_0x00c3:
            r7 = 11
            goto L_0x0147
        L_0x00c7:
            java.lang.String r7 = "AutoCompleteTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00d0
            goto L_0x009d
        L_0x00d0:
            r7 = 10
            goto L_0x0147
        L_0x00d4:
            java.lang.String r7 = "ImageView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00dd
            goto L_0x009d
        L_0x00dd:
            r7 = 9
            goto L_0x0147
        L_0x00e1:
            java.lang.String r7 = "ToggleButton"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00ea
            goto L_0x009d
        L_0x00ea:
            r7 = 8
            goto L_0x0147
        L_0x00ee:
            java.lang.String r7 = "RadioButton"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x00f7
            goto L_0x009d
        L_0x00f7:
            r7 = 7
            goto L_0x0147
        L_0x00f9:
            java.lang.String r7 = "Spinner"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0102
            goto L_0x009d
        L_0x0102:
            r7 = 6
            goto L_0x0147
        L_0x0104:
            java.lang.String r7 = "SeekBar"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x010d
            goto L_0x009d
        L_0x010d:
            r7 = 5
            goto L_0x0147
        L_0x010f:
            java.lang.String r11 = "ImageButton"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L_0x0147
            goto L_0x009d
        L_0x0118:
            java.lang.String r7 = "TextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0122
            goto L_0x009d
        L_0x0122:
            r7 = r5
            goto L_0x0147
        L_0x0124:
            java.lang.String r7 = "MultiAutoCompleteTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x012e
            goto L_0x009d
        L_0x012e:
            r7 = 2
            goto L_0x0147
        L_0x0130:
            java.lang.String r7 = "CheckedTextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x013a
            goto L_0x009d
        L_0x013a:
            r7 = r8
            goto L_0x0147
        L_0x013c:
            java.lang.String r7 = "RatingBar"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0146
            goto L_0x009d
        L_0x0146:
            r7 = 0
        L_0x0147:
            switch(r7) {
                case 0: goto L_0x0198;
                case 1: goto L_0x0192;
                case 2: goto L_0x018c;
                case 3: goto L_0x0187;
                case 4: goto L_0x017e;
                case 5: goto L_0x0178;
                case 6: goto L_0x0172;
                case 7: goto L_0x016d;
                case 8: goto L_0x0167;
                case 9: goto L_0x0161;
                case 10: goto L_0x015c;
                case 11: goto L_0x0157;
                case 12: goto L_0x0151;
                case 13: goto L_0x014c;
                default: goto L_0x014a;
            }
        L_0x014a:
            r7 = r9
            goto L_0x019d
        L_0x014c:
            k.q r7 = r0.b(r10, r4)
            goto L_0x019d
        L_0x0151:
            k.w r7 = new k.w
            r7.<init>(r10, r4)
            goto L_0x019d
        L_0x0157:
            k.r r7 = r0.c(r10, r4)
            goto L_0x019d
        L_0x015c:
            k.o r7 = r0.a(r10, r4)
            goto L_0x019d
        L_0x0161:
            k.z r7 = new k.z
            r7.<init>(r10, r4, r15)
            goto L_0x019d
        L_0x0167:
            k.i0 r7 = new k.i0
            r7.<init>(r10, r4)
            goto L_0x019d
        L_0x016d:
            k.D r7 = r0.d(r10, r4)
            goto L_0x019d
        L_0x0172:
            k.Q r7 = new k.Q
            r7.<init>(r10, r4)
            goto L_0x019d
        L_0x0178:
            k.G r7 = new k.G
            r7.<init>(r10, r4)
            goto L_0x019d
        L_0x017e:
            k.y r7 = new k.y
            r11 = 2130903677(0x7f03027d, float:1.7414179E38)
            r7.<init>(r10, r4, r11)
            goto L_0x019d
        L_0x0187:
            k.b0 r7 = r0.e(r10, r4)
            goto L_0x019d
        L_0x018c:
            k.A r7 = new k.A
            r7.<init>(r10, r4)
            goto L_0x019d
        L_0x0192:
            k.s r7 = new k.s
            r7.<init>(r10, r4)
            goto L_0x019d
        L_0x0198:
            k.E r7 = new k.E
            r7.<init>(r10, r4)
        L_0x019d:
            if (r7 != 0) goto L_0x01ed
            if (r3 == r10) goto L_0x01ed
            java.lang.Object[] r3 = r0.f7709a
            java.lang.String r7 = "view"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x01b1
            java.lang.String r2 = "class"
            java.lang.String r2 = r4.getAttributeValue(r9, r2)
        L_0x01b1:
            r3[r15] = r10     // Catch:{ Exception -> 0x01e8, all -> 0x01d2 }
            r3[r8] = r4     // Catch:{ Exception -> 0x01e8, all -> 0x01d2 }
            r7 = 46
            int r7 = r2.indexOf(r7)     // Catch:{ Exception -> 0x01e8, all -> 0x01d2 }
            if (r6 != r7) goto L_0x01d9
            r6 = r15
        L_0x01be:
            java.lang.String[] r7 = f.C.g     // Catch:{ Exception -> 0x01e8, all -> 0x01d2 }
            if (r6 >= r5) goto L_0x01d4
            r7 = r7[r6]     // Catch:{ Exception -> 0x01e8, all -> 0x01d2 }
            android.view.View r7 = r0.f(r10, r2, r7)     // Catch:{ Exception -> 0x01e8, all -> 0x01d2 }
            if (r7 == 0) goto L_0x01d0
            r3[r15] = r9
            r3[r8] = r9
            r9 = r7
            goto L_0x01ec
        L_0x01d0:
            int r6 = r6 + r8
            goto L_0x01be
        L_0x01d2:
            r0 = move-exception
            goto L_0x01e3
        L_0x01d4:
            r3[r15] = r9
            r3[r8] = r9
            goto L_0x01ec
        L_0x01d9:
            android.view.View r0 = r0.f(r10, r2, r9)     // Catch:{ Exception -> 0x01e8, all -> 0x01d2 }
            r3[r15] = r9
            r3[r8] = r9
            r9 = r0
            goto L_0x01ec
        L_0x01e3:
            r3[r15] = r9
            r3[r8] = r9
            throw r0
        L_0x01e8:
            r3[r15] = r9
            r3[r8] = r9
        L_0x01ec:
            r7 = r9
        L_0x01ed:
            if (r7 == 0) goto L_0x028c
            android.content.Context r0 = r7.getContext()
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0215
            boolean r2 = r7.hasOnClickListeners()
            if (r2 != 0) goto L_0x01fe
            goto L_0x0215
        L_0x01fe:
            int[] r2 = f.C.f7706c
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r2)
            java.lang.String r2 = r0.getString(r15)
            if (r2 == 0) goto L_0x0212
            f.B r3 = new f.B
            r3.<init>(r7, r2)
            r7.setOnClickListener(r3)
        L_0x0212:
            r0.recycle()
        L_0x0215:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 <= r2) goto L_0x021d
            goto L_0x028c
        L_0x021d:
            int[] r0 = f.C.d
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r3 = r0.hasValue(r15)
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r3 == 0) goto L_0x0248
            boolean r3 = r0.getBoolean(r15, r15)
            java.util.WeakHashMap r6 = K.O.f1352a
            K.y r6 = new K.y
            r12 = 2131298467(0x7f0908a3, float:1.8214908E38)
            r16 = 2
            r11 = r6
            r13 = r5
            r14 = r15
            r8 = r15
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r6.d(r7, r3)
            goto L_0x0249
        L_0x0248:
            r8 = r15
        L_0x0249:
            r0.recycle()
            int[] r0 = f.C.f7707e
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r3 = r0.hasValue(r8)
            if (r3 == 0) goto L_0x025f
            java.lang.String r3 = r0.getString(r8)
            K.O.m(r7, r3)
        L_0x025f:
            r0.recycle()
            int[] r0 = f.C.f7708f
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r4, r0)
            boolean r3 = r0.hasValue(r8)
            if (r3 == 0) goto L_0x0289
            boolean r3 = r0.getBoolean(r8, r8)
            java.util.WeakHashMap r4 = K.O.f1352a
            K.y r4 = new K.y
            r12 = 2131298472(0x7f0908a8, float:1.8214918E38)
            r16 = 0
            r11 = r4
            r13 = r5
            r14 = r8
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r4.d(r7, r2)
        L_0x0289:
            r0.recycle()
        L_0x028c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f.z.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(y yVar, boolean z3) {
        x xVar;
        C0721k0 k0Var;
        C0718j jVar;
        if (z3 && yVar.f7810a == 0 && (k0Var = this.f7825A) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k0Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((a1) actionBarOverlayLayout.f4753e).f9257a.f4812a;
            if (!(actionMenuView == null || (jVar = actionMenuView.f4768C) == null || !jVar.f())) {
                o(yVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f7867t.getSystemService("window");
        if (!(windowManager == null || !yVar.f7819m || (xVar = yVar.f7813e) == null)) {
            windowManager.removeView(xVar);
            if (z3) {
                n(yVar.f7810a, yVar, (j.k) null);
            }
        }
        yVar.f7817k = false;
        yVar.f7818l = false;
        yVar.f7819m = false;
        yVar.f7814f = null;
        yVar.f7820n = true;
        if (this.f7845V == yVar) {
            this.f7845V = null;
        }
        if (yVar.f7810a == 0) {
            H();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6.f() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(j.k r6) {
        /*
            r5 = this;
            k.k0 r6 = r5.f7825A
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x00e8
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.l0 r6 = r6.f4753e
            k.a1 r6 = (k.a1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f9257a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x00e8
            androidx.appcompat.widget.ActionMenuView r6 = r6.f4812a
            if (r6 == 0) goto L_0x00e8
            boolean r6 = r6.f4767B
            if (r6 == 0) goto L_0x00e8
            android.content.Context r6 = r5.f7867t
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x004a
            k.k0 r6 = r5.f7825A
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.l0 r6 = r6.f4753e
            k.a1 r6 = (k.a1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f9257a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f4812a
            if (r6 == 0) goto L_0x00e8
            k.j r6 = r6.f4768C
            if (r6 == 0) goto L_0x00e8
            k.h r2 = r6.f9321D
            if (r2 != 0) goto L_0x004a
            boolean r6 = r6.f()
            if (r6 == 0) goto L_0x00e8
        L_0x004a:
            android.view.Window r6 = r5.f7868u
            android.view.Window$Callback r6 = r6.getCallback()
            k.k0 r2 = r5.f7825A
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            k.l0 r2 = r2.f4753e
            k.a1 r2 = (k.a1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f9257a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f4812a
            if (r2 == 0) goto L_0x006d
            k.j r2 = r2.f4768C
            if (r2 == 0) goto L_0x006d
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x006d
            r2 = r1
            goto L_0x006e
        L_0x006d:
            r2 = r0
        L_0x006e:
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x0099
            k.k0 r1 = r5.f7825A
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = (androidx.appcompat.widget.ActionBarOverlayLayout) r1
            r1.k()
            k.l0 r1 = r1.f4753e
            k.a1 r1 = (k.a1) r1
            androidx.appcompat.widget.Toolbar r1 = r1.f9257a
            androidx.appcompat.widget.ActionMenuView r1 = r1.f4812a
            if (r1 == 0) goto L_0x008b
            k.j r1 = r1.f4768C
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.c()
        L_0x008b:
            boolean r1 = r5.f7849Z
            if (r1 != 0) goto L_0x00f5
            f.y r0 = r5.y(r0)
            j.k r0 = r0.h
            r6.onPanelClosed(r3, r0)
            goto L_0x00f5
        L_0x0099:
            if (r6 == 0) goto L_0x00f5
            boolean r2 = r5.f7849Z
            if (r2 != 0) goto L_0x00f5
            boolean r2 = r5.f7857h0
            if (r2 == 0) goto L_0x00b6
            int r2 = r5.f7858i0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x00b6
            android.view.Window r1 = r5.f7868u
            android.view.View r1 = r1.getDecorView()
            f.o r2 = r5.f7859j0
            r1.removeCallbacks(r2)
            r2.run()
        L_0x00b6:
            f.y r1 = r5.y(r0)
            j.k r2 = r1.h
            if (r2 == 0) goto L_0x00f5
            boolean r4 = r1.f7821o
            if (r4 != 0) goto L_0x00f5
            android.view.View r4 = r1.g
            boolean r0 = r6.onPreparePanel(r0, r4, r2)
            if (r0 == 0) goto L_0x00f5
            j.k r0 = r1.h
            r6.onMenuOpened(r3, r0)
            k.k0 r6 = r5.f7825A
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            k.l0 r6 = r6.f4753e
            k.a1 r6 = (k.a1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f9257a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f4812a
            if (r6 == 0) goto L_0x00f5
            k.j r6 = r6.f4768C
            if (r6 == 0) goto L_0x00f5
            r6.l()
            goto L_0x00f5
        L_0x00e8:
            f.y r6 = r5.y(r0)
            r6.f7820n = r1
            r5.p(r6, r0)
            r0 = 0
            r5.D(r6, r0)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.z.r(j.k):void");
    }

    public final boolean s(j.k kVar, MenuItem menuItem) {
        int i2;
        y yVar;
        Window.Callback callback = this.f7868u.getCallback();
        if (callback != null && !this.f7849Z) {
            j.k k6 = kVar.k();
            y[] yVarArr = this.f7844U;
            if (yVarArr != null) {
                i2 = yVarArr.length;
            } else {
                i2 = 0;
            }
            int i5 = 0;
            while (true) {
                if (i5 < i2) {
                    yVar = yVarArr[i5];
                    if (yVar != null && yVar.h == k6) {
                        break;
                    }
                    i5++;
                } else {
                    yVar = null;
                    break;
                }
            }
            if (yVar != null) {
                return callback.onMenuItemSelected(yVar.f7810a, menuItem);
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00db, code lost:
        if (r7.c() != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0101, code lost:
        if (r7.l() != false) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f7866s
            boolean r1 = r0 instanceof K.C0070j
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof f.C0515f
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f7868u
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = K1.e.k(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L_0x003d
            f.v r0 = r6.f7869v
            android.view.Window r4 = r6.f7868u
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f7805c = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f7805c = r1
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f7805c = r1
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x006f
            if (r0 == r5) goto L_0x0060
            if (r0 == r3) goto L_0x004d
            goto L_0x006c
        L_0x004d:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x014c
            f.y r0 = r6.y(r1)
            boolean r1 = r0.f7819m
            if (r1 != 0) goto L_0x014c
            r6.F(r0, r7)
            goto L_0x014c
        L_0x0060:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r2 = r1
        L_0x006a:
            r6.f7846W = r2
        L_0x006c:
            r2 = r1
            goto L_0x014c
        L_0x006f:
            if (r0 == r5) goto L_0x0146
            if (r0 == r3) goto L_0x0074
            goto L_0x006c
        L_0x0074:
            i.a r0 = r6.f7828D
            if (r0 == 0) goto L_0x007a
            goto L_0x014c
        L_0x007a:
            f.y r0 = r6.y(r1)
            k.k0 r3 = r6.f7825A
            android.content.Context r4 = r6.f7867t
            if (r3 == 0) goto L_0x0104
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            k.l0 r3 = r3.f4753e
            k.a1 r3 = (k.a1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f9257a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x0104
            androidx.appcompat.widget.ActionMenuView r3 = r3.f4812a
            if (r3 == 0) goto L_0x0104
            boolean r3 = r3.f4767B
            if (r3 == 0) goto L_0x0104
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x0104
            k.k0 r3 = r6.f7825A
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            k.l0 r3 = r3.f4753e
            k.a1 r3 = (k.a1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f9257a
            androidx.appcompat.widget.ActionMenuView r3 = r3.f4812a
            if (r3 == 0) goto L_0x00de
            k.j r3 = r3.f4768C
            if (r3 == 0) goto L_0x00de
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x00de
            k.k0 r7 = r6.f7825A
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            k.l0 r7 = r7.f4753e
            k.a1 r7 = (k.a1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f9257a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f4812a
            if (r7 == 0) goto L_0x0124
            k.j r7 = r7.f4768C
            if (r7 == 0) goto L_0x0124
            boolean r7 = r7.c()
            if (r7 == 0) goto L_0x0124
        L_0x00dd:
            goto L_0x0122
        L_0x00de:
            boolean r3 = r6.f7849Z
            if (r3 != 0) goto L_0x0124
            boolean r7 = r6.F(r0, r7)
            if (r7 == 0) goto L_0x0124
            k.k0 r7 = r6.f7825A
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            k.l0 r7 = r7.f4753e
            k.a1 r7 = (k.a1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f9257a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f4812a
            if (r7 == 0) goto L_0x0124
            k.j r7 = r7.f4768C
            if (r7 == 0) goto L_0x0124
            boolean r7 = r7.l()
            if (r7 == 0) goto L_0x0124
            goto L_0x00dd
        L_0x0104:
            boolean r3 = r0.f7819m
            if (r3 != 0) goto L_0x0126
            boolean r5 = r0.f7818l
            if (r5 == 0) goto L_0x010d
            goto L_0x0126
        L_0x010d:
            boolean r3 = r0.f7817k
            if (r3 == 0) goto L_0x0124
            boolean r3 = r0.f7821o
            if (r3 == 0) goto L_0x011c
            r0.f7817k = r1
            boolean r3 = r6.F(r0, r7)
            goto L_0x011d
        L_0x011c:
            r3 = r2
        L_0x011d:
            if (r3 == 0) goto L_0x0124
            r6.D(r0, r7)
        L_0x0122:
            r7 = r2
            goto L_0x012a
        L_0x0124:
            r7 = r1
            goto L_0x012a
        L_0x0126:
            r6.p(r0, r2)
            r7 = r3
        L_0x012a:
            if (r7 == 0) goto L_0x014c
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x013e
            r7.playSoundEffect(r1)
            goto L_0x014c
        L_0x013e:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x014c
        L_0x0146:
            boolean r7 = r6.C()
            if (r7 == 0) goto L_0x006c
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.z.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i2) {
        y y6 = y(i2);
        if (y6.h != null) {
            Bundle bundle = new Bundle();
            y6.h.t(bundle);
            if (bundle.size() > 0) {
                y6.f7822p = bundle;
            }
            y6.h.w();
            y6.h.clear();
        }
        y6.f7821o = true;
        y6.f7820n = true;
        if ((i2 == 108 || i2 == 0) && this.f7825A != null) {
            y y7 = y(0);
            y7.f7817k = false;
            F(y7, (KeyEvent) null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f7832I) {
            int[] iArr = C0476a.f7538j;
            Context context2 = this.f7867t;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    f(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    f(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    f(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    f(10);
                }
                this.f7841R = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                w();
                this.f7868u.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (this.f7842S) {
                    viewGroup = this.f7840Q ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.f7841R) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.f7839P = false;
                    this.f7838O = false;
                } else if (this.f7838O) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C0573c(context2, typedValue.resourceId);
                    } else {
                        context = context2;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    C0721k0 k0Var = (C0721k0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f7825A = k0Var;
                    k0Var.setWindowCallback(this.f7868u.getCallback());
                    if (this.f7839P) {
                        ((ActionBarOverlayLayout) this.f7825A).j(109);
                    }
                    if (this.f7836M) {
                        ((ActionBarOverlayLayout) this.f7825A).j(2);
                    }
                    if (this.f7837N) {
                        ((ActionBarOverlayLayout) this.f7825A).j(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    p pVar = new p(this);
                    WeakHashMap weakHashMap = O.f1352a;
                    D.u(viewGroup, pVar);
                    if (this.f7825A == null) {
                        this.f7834K = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    boolean z3 = i1.f9315a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, (Object[]) null);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e6) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
                    } catch (IllegalAccessException e7) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f7868u.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f7868u.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new q(this));
                    this.f7833J = viewGroup;
                    Object obj = this.f7866s;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f7873z;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        C0721k0 k0Var2 = this.f7825A;
                        if (k0Var2 != null) {
                            k0Var2.setWindowTitle(charSequence);
                        } else {
                            J j6 = this.f7871x;
                            if (j6 != null) {
                                a1 a1Var = (a1) j6.f7740t;
                                if (!a1Var.g) {
                                    a1Var.h = charSequence;
                                    if ((a1Var.f9258b & 8) != 0) {
                                        Toolbar toolbar = a1Var.f9257a;
                                        toolbar.setTitle(charSequence);
                                        if (a1Var.g) {
                                            O.m(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.f7834K;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f7833J.findViewById(16908290);
                    View decorView = this.f7868u.getDecorView();
                    contentFrameLayout2.f4785p.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f7832I = true;
                    y y6 = y(0);
                    if (!this.f7849Z && y6.h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f7838O + ", windowActionBarOverlay: " + this.f7839P + ", android:windowIsFloating: " + this.f7841R + ", windowActionModeOverlay: " + this.f7840Q + ", windowNoTitle: " + this.f7842S + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void w() {
        if (this.f7868u == null) {
            Object obj = this.f7866s;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f7868u == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final f x(Context context) {
        if (this.f7855f0 == null) {
            if (c1.i.f5603e == null) {
                Context applicationContext = context.getApplicationContext();
                c1.i.f5603e = new c1.i(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f7855f0 = new w(this, c1.i.f5603e);
        }
        return this.f7855f0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: f.y[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: f.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: f.y[]} */
    /* JADX WARNING: type inference failed for: r2v1, types: [f.y, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.y y(int r5) {
        /*
            r4 = this;
            f.y[] r0 = r4.f7844U
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.length
            if (r2 > r5) goto L_0x0015
        L_0x0008:
            int r2 = r5 + 1
            f.y[] r2 = new f.y[r2]
            if (r0 == 0) goto L_0x0012
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L_0x0012:
            r4.f7844U = r2
            r0 = r2
        L_0x0015:
            r2 = r0[r5]
            if (r2 != 0) goto L_0x0024
            f.y r2 = new f.y
            r2.<init>()
            r2.f7810a = r5
            r2.f7820n = r1
            r0[r5] = r2
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.z.y(int):f.y");
    }

    public final void z() {
        int i2;
        v();
        if (this.f7838O && this.f7871x == null) {
            Object obj = this.f7866s;
            if (obj instanceof Activity) {
                this.f7871x = new J((Activity) obj, this.f7839P);
            } else if (obj instanceof Dialog) {
                this.f7871x = new J((Dialog) obj);
            }
            J j6 = this.f7871x;
            if (j6 != null) {
                boolean z3 = this.f7860k0;
                if (!j6.f7743w) {
                    if (z3) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    a1 a1Var = (a1) j6.f7740t;
                    int i5 = a1Var.f9258b;
                    j6.f7743w = true;
                    a1Var.a((i2 & 4) | (i5 & -5));
                }
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
