package com.mtma.criminal.city.utils;

import B0.l;
import R2.b;
import Y4.g;
import a3.C0261a;
import android.content.Context;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.C0473f;
import d5.C0475h;
import d5.o;
import f.C0518i;
import j4.C0612a;
import j4.H;

public final class L implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7362b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7363c;

    public /* synthetic */ L(Object obj, int i2, int i5) {
        this.f7361a = i5;
        this.f7363c = obj;
        this.f7362b = i2;
    }

    public final void onSuccess(Object obj) {
        switch (this.f7361a) {
            case 0:
                Void voidR = (Void) obj;
                o.getMainStatesObject().setGender(this.f7362b);
                b.w(false);
                b.M0(R.raw.add_new_item);
                a.k(MyApplication.f7090a, R.string.toast_successfully, ((C0439i) ((K) this.f7363c).f7360b).f7423b);
                return;
            case 1:
                Void voidR2 = (Void) obj;
                if (a.t(((C0261a) this.f7363c).f4562b)) {
                    o.getSkillsObject().setMeritsFromMedals(this.f7362b);
                    return;
                }
                return;
            case 2:
                Void voidR3 = (Void) obj;
                l lVar = (l) this.f7363c;
                int i2 = lVar.f246b;
                ((g) ((H) lVar.f247c).getItem(i2)).f4353f = true;
                H h = (H) lVar.f247c;
                if (((g) h.getItem(i2)).g) {
                    ((g) h.getItem(i2)).h = c.f5744o * 1000;
                }
                h.notifyDataSetChanged();
                o.getEstateObject().getServantContractsStartTimeInMilliList().set(this.f7362b, Long.valueOf(c.f5744o * 1000));
                Q.b(62, o.getAccountObject().getId(), (long) 1);
                Q.b(59, o.getAccountObject().getId(), (long) b.N((C0473f) null));
                d.i1();
                b.w(false);
                b.M0(R.raw.money_get);
                String string = h.getContext().getString(R.string.toast_successfully);
                Context context = h.f8883b;
                v0.e(context, string);
                for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                    if (sVar instanceof K4.o) {
                        ((K4.o) sVar).Z();
                        return;
                    }
                }
                return;
            default:
                Void voidR4 = (Void) obj;
                C0475h gymObject = o.getGymObject();
                int i5 = this.f7362b;
                gymObject.setSelectedGymLesson(i5);
                b.w(false);
                b.M0(R.raw.add_new_item);
                int i6 = 0;
                while (true) {
                    C0612a aVar = (C0612a) this.f7363c;
                    if (i6 < aVar.getCount()) {
                        if (i6 == i5) {
                            ((Y4.o) aVar.getItem(i6)).f4410f = true;
                        } else {
                            ((Y4.o) aVar.getItem(i6)).f4410f = false;
                        }
                        i6++;
                    } else {
                        aVar.notifyDataSetChanged();
                        return;
                    }
                }
        }
    }
}
