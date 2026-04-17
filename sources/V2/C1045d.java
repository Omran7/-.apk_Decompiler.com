package v2;

import A4.b;
import K1.e;
import Z1.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.mtma.criminal.city.R;

/* renamed from: v2.d  reason: case insensitive filesystem */
public final class C1045d extends m {

    /* renamed from: e  reason: collision with root package name */
    public final int f12170e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12171f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f12172i;

    /* renamed from: j  reason: collision with root package name */
    public final b f12173j = new b(this, 2);

    /* renamed from: k  reason: collision with root package name */
    public final C1042a f12174k = new C1042a(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f12175l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f12176m;

    public C1045d(l lVar) {
        super(lVar);
        this.f12170e = e.n0(R.attr.motionDurationShort3, 100, lVar.getContext());
        this.f12171f = e.n0(R.attr.motionDurationShort3, 150, lVar.getContext());
        this.g = e.o0(lVar.getContext(), R.attr.motionEasingLinearInterpolator, a.f4469a);
        this.h = e.o0(lVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.d);
    }

    public final void a() {
        if (this.f12218b.f12215y == null) {
            t(u());
        }
    }

    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    public final View.OnFocusChangeListener e() {
        return this.f12174k;
    }

    public final View.OnClickListener f() {
        return this.f12173j;
    }

    public final View.OnFocusChangeListener g() {
        return this.f12174k;
    }

    public final void m(EditText editText) {
        this.f12172i = editText;
        this.f12217a.setEndIconVisible(u());
    }

    public final void p(boolean z3) {
        if (this.f12218b.f12215y != null) {
            t(z3);
        }
    }

    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration((long) this.f12171f);
        ofFloat.addUpdateListener(new C1043b(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f12170e;
        ofFloat2.setDuration((long) i2);
        ofFloat2.addUpdateListener(new C1043b(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12175l = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f12175l.addListener(new C1044c(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration((long) i2);
        ofFloat3.addUpdateListener(new C1043b(this, 0));
        this.f12176m = ofFloat3;
        ofFloat3.addListener(new C1044c(this, 1));
    }

    public final void s() {
        EditText editText = this.f12172i;
        if (editText != null) {
            editText.post(new A4.a(this, 20));
        }
    }

    public final void t(boolean z3) {
        boolean z4;
        if (this.f12218b.d() == z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && !this.f12175l.isRunning()) {
            this.f12176m.cancel();
            this.f12175l.start();
            if (z4) {
                this.f12175l.end();
            }
        } else if (!z3) {
            this.f12175l.cancel();
            this.f12176m.start();
            if (z4) {
                this.f12176m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f12172i;
        if (editText == null || ((!editText.hasFocus() && !this.d.hasFocus()) || this.f12172i.getText().length() <= 0)) {
            return false;
        }
        return true;
    }
}
