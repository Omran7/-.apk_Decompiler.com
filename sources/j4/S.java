package j4;

import K1.e;
import R2.b;
import Y4.C;
import Z4.n;
import Z4.o;
import android.content.Context;
import android.widget.ArrayAdapter;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.fragments.gangBase.w;
import com.mtma.criminal.city.utils.U;
import f.C0518i;

public final /* synthetic */ class S {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f8945c;

    public /* synthetic */ S(ArrayAdapter arrayAdapter, int i2, int i5) {
        this.f8945c = arrayAdapter;
        this.f8943a = i2;
        this.f8944b = i5;
    }

    public void a(n nVar) {
        MyApplication myApplication;
        int i2;
        C0617c0 c0Var = (C0617c0) this.f8945c;
        c0Var.getClass();
        boolean z3 = nVar.isAllProcessSuccess;
        Context context = c0Var.f8984a;
        if (z3) {
            c0Var.f8987e = nVar.newGangAvailableRespect;
            c0Var.d = nVar.newGangCash;
            ((C) c0Var.getItem(this.f8943a)).f4288e = nVar.newLevel;
            c0Var.notifyDataSetChanged();
            for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                if (sVar instanceof C0429i) {
                    C0429i iVar = (C0429i) sVar;
                    int i5 = nVar.newLevel;
                    long j6 = c0Var.f8987e;
                    long j7 = c0Var.d;
                    iVar.f7186C0.getSkillsLevel().put(e.w(this.f8944b), Integer.valueOf(i5));
                    iVar.f7186C0.setAvailableRespect(j6);
                    iVar.W(j7);
                    iVar.X(0, (String) null);
                } else if (sVar instanceof w) {
                    w wVar = (w) sVar;
                    long j8 = c0Var.f8987e;
                    long j9 = c0Var.d;
                    if (wVar.f7313j0 != j8) {
                        wVar.f7313j0 = j8;
                        wVar.f7319p0.setText(U.a(j8));
                        b.c(wVar.f7319p0, 3);
                    }
                    if (wVar.f7314k0 != j9) {
                        wVar.f7314k0 = j9;
                        wVar.f7320q0.setText(U.a(j9));
                        b.c(wVar.f7320q0, 3);
                    }
                    long j10 = wVar.f7315l0;
                    long j11 = c0Var.f8986c;
                    if (j10 != j11) {
                        wVar.f7315l0 = j11;
                        wVar.f7321r0.setText(U.a(j11));
                        b.c(wVar.f7321r0, 3);
                    }
                }
            }
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, context, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (nVar.isReachToMaximumLevel) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.toast_gang_skill_reach_maximum_for_current_gang_level;
        } else if (!nVar.isCurrentPlayerBoss) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_only_boss_can_take_that_action;
        } else if (!nVar.isGangRespectEnough) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_has_not_respect_improvement_requirements;
        } else if (!nVar.isGangCashEnough) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_not_has_enough_cash;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.n(myApplication, i2, context, (String) null);
    }

    public void b(o oVar) {
        MyApplication myApplication;
        int i2;
        H h = (H) this.f8945c;
        h.getClass();
        if (oVar.isAllProcessSuccess) {
            d.l1((long) android.support.v4.media.session.a.U(), new U(h, this.f8943a, oVar, this.f8944b));
            return;
        }
        b.w(false);
        boolean z3 = oVar.isPlayerAlreadyJoined;
        Context context = h.f8883b;
        if (z3) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_already_joined_to_militia;
        } else if (!oVar.isPlayerMainStatesChanged) {
            c.p(context, 2002);
            return;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.n(myApplication, i2, context, (String) null);
    }
}
