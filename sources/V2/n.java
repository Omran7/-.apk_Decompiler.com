package v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import k.C0703b0;

public final class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f12221b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12222c;
    public final /* synthetic */ TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f12223e;

    public n(p pVar, int i2, TextView textView, int i5, TextView textView2) {
        this.f12223e = pVar;
        this.f12220a = i2;
        this.f12221b = textView;
        this.f12222c = i5;
        this.d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        C0703b0 b0Var;
        int i2 = this.f12220a;
        p pVar = this.f12223e;
        pVar.f12237n = i2;
        pVar.f12235l = null;
        TextView textView = this.f12221b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f12222c == 1 && (b0Var = pVar.f12241r) != null) {
                b0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
