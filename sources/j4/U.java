package j4;

import R2.b;
import Y4.D;
import Y4.m;
import Z4.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.a;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import b5.f;
import c1.i;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.utils.J;
import d5.k;
import f.C0518i;
import v2.l;

public final class U implements J {

    /* renamed from: a  reason: collision with root package name */
    public final int f8949a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8950b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8951c;
    public final Object d;

    public U(H h, int i2, o oVar, int i5) {
        this.d = h;
        this.f8949a = i2;
        this.f8951c = oVar;
        this.f8950b = i5;
    }

    public void h(boolean z3, k kVar) {
        String str;
        int i2;
        String string;
        H h = (H) this.d;
        o oVar = (o) this.f8951c;
        ((m) h.getItem(this.f8949a)).f4400f = oVar.membersIdsJoinedMilitia;
        h.notifyDataSetChanged();
        String str2 = oVar.membersIdsJoinedMilitia;
        int i5 = this.f8950b;
        if (str2 == null || str2.isEmpty()) {
            int W5 = a.W(i5);
            if (oVar.crystalId != 0) {
                string = MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_militia_rewards_with_crystal_and_respect, new Object[]{Integer.valueOf(a.U()), Integer.valueOf(a.V(i5)), Integer.valueOf(a.R(i5)), Integer.valueOf(a.T(i5)), MyApplication.f7090a.getApplicationContext().getString(D.g(oVar.crystalId, 0, false).f4295c), Integer.valueOf(a.W(i5))});
            } else {
                string = MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_militia_rewards_with_respect, new Object[]{Integer.valueOf(a.U()), Integer.valueOf(a.V(i5)), Integer.valueOf(a.R(i5)), Integer.valueOf(a.W(i5))});
            }
            String str3 = string;
            i2 = W5;
            str = str3;
        } else {
            if (oVar.crystalId != 0) {
                str = MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_militia_rewards_with_crystal, new Object[]{Integer.valueOf(a.U()), Integer.valueOf(a.V(i5)), Integer.valueOf(a.R(i5)), Integer.valueOf(a.T(i5)), MyApplication.f7090a.getApplicationContext().getString(D.g(oVar.crystalId, 0, false).f4295c)});
            } else {
                str = MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_militia_rewards, new Object[]{Integer.valueOf(a.U()), Integer.valueOf(a.V(i5)), Integer.valueOf(a.R(i5))});
            }
            i2 = 0;
        }
        b.w(false);
        Context context = h.f8883b;
        c.s0(context, str, (String) null);
        for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
            if (sVar instanceof C0429i) {
                C0429i iVar = (C0429i) sVar;
                int V5 = a.V(i5);
                f fVar = iVar.f7186C0;
                fVar.setLoyalty(fVar.getLoyalty() + ((long) V5));
                ((TextView) iVar.f7203m0.getRootView().findViewWithTag("loyalty_view_tag")).setText(com.mtma.criminal.city.utils.U.a(iVar.f7186C0.getLoyalty()));
                if (i2 != 0) {
                    f fVar2 = iVar.f7186C0;
                    long j6 = (long) i2;
                    fVar2.setRespect(fVar2.getRespect() + j6);
                    ((TextView) iVar.f7203m0.getRootView().findViewWithTag("total_respect_view_tag")).setText(com.mtma.criminal.city.utils.U.a(iVar.f7186C0.getRespect()));
                    f fVar3 = iVar.f7186C0;
                    fVar3.setAvailableRespect(fVar3.getAvailableRespect() + j6);
                    ((TextView) iVar.f7203m0.getRootView().findViewWithTag("available_respect_view_tag")).setText(com.mtma.criminal.city.utils.U.a(iVar.f7186C0.getAvailableRespect()));
                }
            }
        }
    }

    public U(l lVar, i iVar) {
        this.f8951c = new SparseArray();
        this.d = lVar;
        TypedArray typedArray = (TypedArray) iVar.f5606c;
        this.f8949a = typedArray.getResourceId(28, 0);
        this.f8950b = typedArray.getResourceId(52, 0);
    }
}
