package f;

import I1.b;
import K.B;
import K.D;
import K.O;
import K.V;
import K.X;
import X4.d;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.fragments.gangBase.I;
import e.C0476a;
import i.i;
import i.j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0677N0;
import k.C0704c;
import k.C0723l0;
import k.a1;

public final class J extends b implements C0704c {

    /* renamed from: N  reason: collision with root package name */
    public static final AccelerateInterpolator f7722N = new AccelerateInterpolator();

    /* renamed from: O  reason: collision with root package name */
    public static final DecelerateInterpolator f7723O = new DecelerateInterpolator();

    /* renamed from: A  reason: collision with root package name */
    public boolean f7724A;

    /* renamed from: B  reason: collision with root package name */
    public final ArrayList f7725B = new ArrayList();

    /* renamed from: C  reason: collision with root package name */
    public int f7726C = 0;

    /* renamed from: D  reason: collision with root package name */
    public boolean f7727D = true;

    /* renamed from: E  reason: collision with root package name */
    public boolean f7728E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f7729G = true;

    /* renamed from: H  reason: collision with root package name */
    public j f7730H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f7731I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f7732J;

    /* renamed from: K  reason: collision with root package name */
    public final H f7733K = new H(this, 0);

    /* renamed from: L  reason: collision with root package name */
    public final H f7734L = new H(this, 1);

    /* renamed from: M  reason: collision with root package name */
    public final I f7735M = new I(this, 21);

    /* renamed from: p  reason: collision with root package name */
    public Context f7736p;

    /* renamed from: q  reason: collision with root package name */
    public Context f7737q;

    /* renamed from: r  reason: collision with root package name */
    public ActionBarOverlayLayout f7738r;

    /* renamed from: s  reason: collision with root package name */
    public ActionBarContainer f7739s;

    /* renamed from: t  reason: collision with root package name */
    public C0723l0 f7740t;

    /* renamed from: u  reason: collision with root package name */
    public ActionBarContextView f7741u;

    /* renamed from: v  reason: collision with root package name */
    public final View f7742v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7743w;

    /* renamed from: x  reason: collision with root package name */
    public I f7744x;

    /* renamed from: y  reason: collision with root package name */
    public I f7745y;

    /* renamed from: z  reason: collision with root package name */
    public d f7746z;

    public J(Activity activity, boolean z3) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        U0(decorView);
        if (!z3) {
            this.f7742v = decorView.findViewById(16908290);
        }
    }

    public final void S0(boolean z3) {
        X x6;
        X x7;
        long j6;
        if (z3) {
            if (!this.F) {
                this.F = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7738r;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                W0(false);
            }
        } else if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7738r;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            W0(false);
        }
        if (this.f7739s.isLaidOut()) {
            if (z3) {
                a1 a1Var = (a1) this.f7740t;
                x7 = O.a(a1Var.f9257a);
                x7.a(0.0f);
                x7.c(100);
                x7.d(new i(a1Var, 4));
                x6 = this.f7741u.i(0, 200);
            } else {
                a1 a1Var2 = (a1) this.f7740t;
                X a6 = O.a(a1Var2.f9257a);
                a6.a(1.0f);
                a6.c(200);
                a6.d(new i(a1Var2, 0));
                X x8 = a6;
                x7 = this.f7741u.i(8, 100);
                x6 = x8;
            }
            j jVar = new j();
            ArrayList arrayList = jVar.f8233a;
            arrayList.add(x7);
            View view = (View) x7.f1362a.get();
            if (view != null) {
                j6 = view.animate().getDuration();
            } else {
                j6 = 0;
            }
            View view2 = (View) x6.f1362a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j6);
            }
            arrayList.add(x6);
            jVar.b();
        } else if (z3) {
            ((a1) this.f7740t).f9257a.setVisibility(4);
            this.f7741u.setVisibility(0);
        } else {
            ((a1) this.f7740t).f9257a.setVisibility(0);
            this.f7741u.setVisibility(8);
        }
    }

    public final Context T0() {
        if (this.f7737q == null) {
            TypedValue typedValue = new TypedValue();
            this.f7736p.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f7737q = new ContextThemeWrapper(this.f7736p, i2);
            } else {
                this.f7737q = this.f7736p;
            }
        }
        return this.f7737q;
    }

    public final void U0(View view) {
        C0723l0 l0Var;
        boolean z3;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f7738r = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof C0723l0) {
            l0Var = (C0723l0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            l0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f7740t = l0Var;
        this.f7741u = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f7739s = actionBarContainer;
        C0723l0 l0Var2 = this.f7740t;
        if (l0Var2 == null || this.f7741u == null || actionBarContainer == null) {
            throw new IllegalStateException(J.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((a1) l0Var2).f9257a.getContext();
        this.f7736p = context;
        if ((((a1) this.f7740t).f9258b & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f7743w = true;
        }
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.f7740t.getClass();
        V0(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f7736p.obtainStyledAttributes((AttributeSet) null, C0476a.f7532a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f7738r;
            if (actionBarOverlayLayout2.f4755p) {
                this.f7732J = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f7739s;
            WeakHashMap weakHashMap = O.f1352a;
            D.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void V0(boolean z3) {
        if (!z3) {
            ((a1) this.f7740t).getClass();
            this.f7739s.setTabContainer((C0677N0) null);
        } else {
            this.f7739s.setTabContainer((C0677N0) null);
            ((a1) this.f7740t).getClass();
        }
        this.f7740t.getClass();
        ((a1) this.f7740t).f9257a.setCollapsible(false);
        this.f7738r.setHasNonEmbeddedTabs(false);
    }

    public final void W0(boolean z3) {
        boolean z4;
        boolean z5 = this.f7728E;
        if (!this.F && z5) {
            z4 = false;
        } else {
            z4 = true;
        }
        View view = this.f7742v;
        V v6 = null;
        I i2 = this.f7735M;
        if (z4) {
            if (!this.f7729G) {
                this.f7729G = true;
                j jVar = this.f7730H;
                if (jVar != null) {
                    jVar.a();
                }
                this.f7739s.setVisibility(0);
                int i5 = this.f7726C;
                H h = this.f7734L;
                if (i5 != 0 || (!this.f7731I && !z3)) {
                    this.f7739s.setAlpha(1.0f);
                    this.f7739s.setTranslationY(0.0f);
                    if (this.f7727D && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    h.b();
                } else {
                    this.f7739s.setTranslationY(0.0f);
                    float f6 = (float) (-this.f7739s.getHeight());
                    if (z3) {
                        int[] iArr = {0, 0};
                        this.f7739s.getLocationInWindow(iArr);
                        f6 -= (float) iArr[1];
                    }
                    this.f7739s.setTranslationY(f6);
                    j jVar2 = new j();
                    X a6 = O.a(this.f7739s);
                    a6.e(0.0f);
                    View view2 = (View) a6.f1362a.get();
                    if (view2 != null) {
                        if (i2 != null) {
                            v6 = new V(i2, view2);
                        }
                        view2.animate().setUpdateListener(v6);
                    }
                    boolean z6 = jVar2.f8236e;
                    ArrayList arrayList = jVar2.f8233a;
                    if (!z6) {
                        arrayList.add(a6);
                    }
                    if (this.f7727D && view != null) {
                        view.setTranslationY(f6);
                        X a7 = O.a(view);
                        a7.e(0.0f);
                        if (!jVar2.f8236e) {
                            arrayList.add(a7);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f7723O;
                    boolean z7 = jVar2.f8236e;
                    if (!z7) {
                        jVar2.f8235c = decelerateInterpolator;
                    }
                    if (!z7) {
                        jVar2.f8234b = 250;
                    }
                    if (!z7) {
                        jVar2.d = h;
                    }
                    this.f7730H = jVar2;
                    jVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f7738r;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = O.f1352a;
                    B.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f7729G) {
            this.f7729G = false;
            j jVar3 = this.f7730H;
            if (jVar3 != null) {
                jVar3.a();
            }
            int i6 = this.f7726C;
            H h6 = this.f7733K;
            if (i6 != 0 || (!this.f7731I && !z3)) {
                h6.b();
                return;
            }
            this.f7739s.setAlpha(1.0f);
            this.f7739s.setTransitioning(true);
            j jVar4 = new j();
            float f7 = (float) (-this.f7739s.getHeight());
            if (z3) {
                int[] iArr2 = {0, 0};
                this.f7739s.getLocationInWindow(iArr2);
                f7 -= (float) iArr2[1];
            }
            X a8 = O.a(this.f7739s);
            a8.e(f7);
            View view3 = (View) a8.f1362a.get();
            if (view3 != null) {
                if (i2 != null) {
                    v6 = new V(i2, view3);
                }
                view3.animate().setUpdateListener(v6);
            }
            boolean z8 = jVar4.f8236e;
            ArrayList arrayList2 = jVar4.f8233a;
            if (!z8) {
                arrayList2.add(a8);
            }
            if (this.f7727D && view != null) {
                X a9 = O.a(view);
                a9.e(f7);
                if (!jVar4.f8236e) {
                    arrayList2.add(a9);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f7722N;
            boolean z9 = jVar4.f8236e;
            if (!z9) {
                jVar4.f8235c = accelerateInterpolator;
            }
            if (!z9) {
                jVar4.f8234b = 250;
            }
            if (!z9) {
                jVar4.d = h6;
            }
            this.f7730H = jVar4;
            jVar4.b();
        }
    }

    public J(Dialog dialog) {
        new ArrayList();
        U0(dialog.getWindow().getDecorView());
    }
}
