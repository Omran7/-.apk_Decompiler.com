package K;

import D.a;
import H.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.mtma.criminal.city.utils.s0;
import com.mtma.criminal.city.utils.t0;
import com.mtma.criminal.city.utils.u0;
import g2.C0547a;
import g2.c;
import java.util.ArrayList;
import t0.m;
import u0.C1018e;
import v2.i;

public final class W extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1361b;

    public /* synthetic */ W(Object obj, int i2) {
        this.f1360a = i2;
        this.f1361b = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f1360a) {
            case 0:
                ((Y) this.f1361b).e();
                return;
            case zzaky.zzf.zzg /*7*/:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1361b;
                actionBarOverlayLayout.F = null;
                actionBarOverlayLayout.f4758s = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f1360a) {
            case 0:
                ((Y) this.f1361b).b();
                return;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f1361b).h = null;
                return;
            case 2:
                super.onAnimationEnd(animator);
                j jVar = (j) this.f1361b;
                ((ViewGroup) jVar.f986c).removeView((View) jVar.f985b);
                u0 u0Var = (u0) jVar.d;
                if (u0Var != null) {
                    u0Var.a();
                    return;
                }
                return;
            case 3:
                super.onAnimationEnd(animator);
                s0 s0Var = (s0) this.f1361b;
                s0Var.d.removeView(s0Var.f7468c);
                return;
            case 4:
                super.onAnimationEnd(animator);
                s0 s0Var2 = (s0) this.f1361b;
                s0Var2.d.removeView(s0Var2.f7468c);
                return;
            case 5:
                super.onAnimationEnd(animator);
                t0 t0Var = (t0) this.f1361b;
                t0Var.f7473b.removeView(t0Var.f7474c);
                return;
            case zzaky.zzf.zzf /*6*/:
                super.onAnimationEnd(animator);
                t0 t0Var2 = (t0) this.f1361b;
                t0Var2.f7473b.removeView(t0Var2.f7474c);
                return;
            case zzaky.zzf.zzg /*7*/:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1361b;
                actionBarOverlayLayout.F = null;
                actionBarOverlayLayout.f4758s = false;
                return;
            case 8:
                ((m) this.f1361b).n();
                animator.removeListener(this);
                return;
            case 9:
                C1018e eVar = (C1018e) this.f1361b;
                ArrayList arrayList = new ArrayList(eVar.f11786e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((C0547a) arrayList.get(i2)).f7983b.f8005x;
                    if (colorStateList != null) {
                        a.h(eVar, colorStateList);
                    }
                }
                return;
            default:
                i iVar = (i) this.f1361b;
                iVar.q();
                iVar.f12193r.start();
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f1360a) {
            case 0:
                ((Y) this.f1361b).g();
                return;
            case 9:
                C1018e eVar = (C1018e) this.f1361b;
                ArrayList arrayList = new ArrayList(eVar.f11786e);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    c cVar = ((C0547a) arrayList.get(i2)).f7983b;
                    ColorStateList colorStateList = cVar.f8005x;
                    if (colorStateList != null) {
                        a.g(eVar, colorStateList.getColorForState(cVar.f7990B, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public W(Y y6, View view) {
        this.f1360a = 0;
        this.f1361b = y6;
    }
}
