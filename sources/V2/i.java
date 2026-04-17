package v2;

import A4.b;
import F3.e;
import K.O;
import K.V;
import K.W;
import L.j;
import Z1.a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;

public final class i extends m {

    /* renamed from: e  reason: collision with root package name */
    public final int f12182e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12183f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;

    /* renamed from: i  reason: collision with root package name */
    public final b f12184i = new b(this, 3);

    /* renamed from: j  reason: collision with root package name */
    public final C1042a f12185j = new C1042a(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public final e f12186k = new e((Object) this, 23);

    /* renamed from: l  reason: collision with root package name */
    public boolean f12187l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12188m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12189n;

    /* renamed from: o  reason: collision with root package name */
    public long f12190o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f12191p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f12192q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f12193r;

    public i(l lVar) {
        super(lVar);
        this.f12183f = K1.e.n0(R.attr.motionDurationShort3, 67, lVar.getContext());
        this.f12182e = K1.e.n0(R.attr.motionDurationShort3, 50, lVar.getContext());
        this.g = K1.e.o0(lVar.getContext(), R.attr.motionEasingLinearInterpolator, a.f4469a);
    }

    public final void a() {
        if (this.f12191p.isTouchExplorationEnabled() && K1.e.c0(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new A4.a(this, 21));
    }

    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    public final View.OnFocusChangeListener e() {
        return this.f12185j;
    }

    public final View.OnClickListener f() {
        return this.f12184i;
    }

    public final e h() {
        return this.f12186k;
    }

    public final boolean i(int i2) {
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return this.f12187l;
    }

    public final boolean l() {
        return this.f12189n;
    }

    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new G4.b(this, 6));
            this.h.setOnDismissListener(new h(this));
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.f12217a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!K1.e.c0(editText) && this.f12191p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = O.f1352a;
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void n(j jVar) {
        boolean z3;
        boolean c02 = K1.e.c0(this.h);
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f1702a;
        if (!c02) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z3 = accessibilityNodeInfo.isShowingHintText();
        } else {
            z3 = jVar.e(4);
        }
        if (z3) {
            jVar.j((String) null);
        }
    }

    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z3;
        if (this.f12191p.isEnabled() && !K1.e.c0(this.h)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f12189n && !this.h.isPopupShowing()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z3) {
                u();
                this.f12188m = true;
                this.f12190o = System.currentTimeMillis();
            }
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) this.f12183f);
        ofFloat.addUpdateListener(new V(this));
        this.f12193r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) this.f12182e);
        ofFloat2.addUpdateListener(new V(this));
        this.f12192q = ofFloat2;
        ofFloat2.addListener(new W((Object) this, 10));
        this.f12191p = (AccessibilityManager) this.f12219c.getSystemService("accessibility");
    }

    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            this.h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
        }
    }

    public final void t(boolean z3) {
        if (this.f12189n != z3) {
            this.f12189n = z3;
            this.f12193r.cancel();
            this.f12192q.start();
        }
    }

    public final void u() {
        boolean z3;
        if (this.h != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f12190o;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                this.f12188m = false;
            }
            if (!this.f12188m) {
                t(!this.f12189n);
                if (this.f12189n) {
                    this.h.requestFocus();
                    this.h.showDropDown();
                    return;
                }
                this.h.dismissDropDown();
                return;
            }
            this.f12188m = false;
        }
    }
}
