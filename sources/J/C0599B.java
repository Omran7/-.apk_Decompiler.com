package j;

import K4.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.N;
import com.mtma.criminal.city.R;
import k.C0657D0;
import k.C0667I0;
import k.C0739t0;

/* renamed from: j.B  reason: case insensitive filesystem */
public final class C0599B extends s implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A  reason: collision with root package name */
    public int f8644A;

    /* renamed from: B  reason: collision with root package name */
    public int f8645B = 0;

    /* renamed from: C  reason: collision with root package name */
    public boolean f8646C;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8647b;

    /* renamed from: c  reason: collision with root package name */
    public final k f8648c;
    public final h d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8649e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8650f;

    /* renamed from: p  reason: collision with root package name */
    public final int f8651p;

    /* renamed from: q  reason: collision with root package name */
    public final C0667I0 f8652q;

    /* renamed from: r  reason: collision with root package name */
    public final e f8653r = new e(this, 6);

    /* renamed from: s  reason: collision with root package name */
    public final N f8654s = new N(this, 2);

    /* renamed from: t  reason: collision with root package name */
    public t f8655t;

    /* renamed from: u  reason: collision with root package name */
    public View f8656u;

    /* renamed from: v  reason: collision with root package name */
    public View f8657v;

    /* renamed from: w  reason: collision with root package name */
    public v f8658w;

    /* renamed from: x  reason: collision with root package name */
    public ViewTreeObserver f8659x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8660y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8661z;

    /* JADX WARNING: type inference failed for: r6v1, types: [k.I0, k.D0] */
    public C0599B(int i2, Context context, View view, k kVar, boolean z3) {
        this.f8647b = context;
        this.f8648c = kVar;
        this.f8649e = z3;
        this.d = new h(kVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f8651p = i2;
        Resources resources = context.getResources();
        this.f8650f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f8656u = view;
        this.f8652q = new C0657D0(context, (AttributeSet) null, i2);
        kVar.b(this, context);
    }

    public final void a(k kVar, boolean z3) {
        if (kVar == this.f8648c) {
            dismiss();
            v vVar = this.f8658w;
            if (vVar != null) {
                vVar.a(kVar, z3);
            }
        }
    }

    public final boolean b() {
        if (this.f8660y || !this.f8652q.f9161I.isShowing()) {
            return false;
        }
        return true;
    }

    public final void c() {
        View view;
        boolean z3;
        Rect rect;
        if (!b()) {
            if (this.f8660y || (view = this.f8656u) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f8657v = view;
            C0667I0 i02 = this.f8652q;
            i02.f9161I.setOnDismissListener(this);
            i02.f9176y = this;
            i02.f9160H = true;
            i02.f9161I.setFocusable(true);
            View view2 = this.f8657v;
            if (this.f8659x == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f8659x = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8653r);
            }
            view2.addOnAttachStateChangeListener(this.f8654s);
            i02.f9175x = view2;
            i02.f9172u = this.f8645B;
            boolean z4 = this.f8661z;
            Context context = this.f8647b;
            h hVar = this.d;
            if (!z4) {
                this.f8644A = s.m(hVar, context, this.f8650f);
                this.f8661z = true;
            }
            i02.r(this.f8644A);
            i02.f9161I.setInputMethodMode(2);
            Rect rect2 = this.f8781a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            i02.f9159G = rect;
            i02.c();
            C0739t0 t0Var = i02.f9164c;
            t0Var.setOnKeyListener(this);
            if (this.f8646C) {
                k kVar = this.f8648c;
                if (kVar.f8737v != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, t0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(kVar.f8737v);
                    }
                    frameLayout.setEnabled(false);
                    t0Var.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            i02.p(hVar);
            i02.c();
        }
    }

    public final void dismiss() {
        if (b()) {
            this.f8652q.dismiss();
        }
    }

    public final void e() {
        this.f8661z = false;
        h hVar = this.d;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    public final C0739t0 f() {
        return this.f8652q.f9164c;
    }

    public final boolean h() {
        return false;
    }

    public final void j(v vVar) {
        this.f8658w = vVar;
    }

    public final boolean k(C0600C c3) {
        if (c3.hasVisibleItems()) {
            View view = this.f8657v;
            u uVar = new u(this.f8651p, this.f8647b, view, c3, this.f8649e);
            v vVar = this.f8658w;
            uVar.h = vVar;
            s sVar = uVar.f8788i;
            if (sVar != null) {
                sVar.j(vVar);
            }
            boolean u6 = s.u(c3);
            uVar.g = u6;
            s sVar2 = uVar.f8788i;
            if (sVar2 != null) {
                sVar2.o(u6);
            }
            uVar.f8789j = this.f8655t;
            this.f8655t = null;
            this.f8648c.c(false);
            C0667I0 i02 = this.f8652q;
            int i2 = i02.f9166f;
            int n2 = i02.n();
            if ((Gravity.getAbsoluteGravity(this.f8645B, this.f8656u.getLayoutDirection()) & 7) == 5) {
                i2 += this.f8656u.getWidth();
            }
            if (!uVar.b()) {
                if (uVar.f8786e != null) {
                    uVar.d(i2, n2, true, true);
                }
            }
            v vVar2 = this.f8658w;
            if (vVar2 != null) {
                vVar2.p(c3);
            }
            return true;
        }
        return false;
    }

    public final void n(View view) {
        this.f8656u = view;
    }

    public final void o(boolean z3) {
        this.d.f8716c = z3;
    }

    public final void onDismiss() {
        this.f8660y = true;
        this.f8648c.c(true);
        ViewTreeObserver viewTreeObserver = this.f8659x;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f8659x = this.f8657v.getViewTreeObserver();
            }
            this.f8659x.removeGlobalOnLayoutListener(this.f8653r);
            this.f8659x = null;
        }
        this.f8657v.removeOnAttachStateChangeListener(this.f8654s);
        t tVar = this.f8655t;
        if (tVar != null) {
            tVar.onDismiss();
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void p(int i2) {
        this.f8645B = i2;
    }

    public final void q(int i2) {
        this.f8652q.f9166f = i2;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f8655t = (t) onDismissListener;
    }

    public final void s(boolean z3) {
        this.f8646C = z3;
    }

    public final void t(int i2) {
        this.f8652q.i(i2);
    }

    public final void l(k kVar) {
    }
}
