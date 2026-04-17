package com.mtma.criminal.city.utils;

import A2.f;
import B0.l;
import D0.e;
import K4.h;
import K4.u;
import R2.b;
import T1.B1;
import Y4.D;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.fragment.app.C0286s;
import b5.n;
import c1.i;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import d5.C0475h;
import d5.k;
import d5.o;
import e3.C0493a;
import e3.m;
import f.C0518i;
import f3.C0528e;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import j4.A0;
import j4.C0625g0;
import j4.C0626h;
import j4.F;
import j4.G;
import j4.M0;
import j4.Z;
import j4.p0;
import j4.r;
import j4.x0;
import java.util.ArrayList;

public final class K implements J, i0, o0, T, D, q, r0, Continuation, C0454y, q0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7359a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f7360b;

    public /* synthetic */ K(int i2) {
        this.f7359a = i2;
    }

    public void B(C0588d dVar) {
        int i2 = this.f7359a;
    }

    public void a(boolean z3, n nVar) {
        p0 p0Var = (p0) this.f7360b;
        if (z3) {
            x0 x0Var = (x0) p0Var.f9075b;
            D d = x0Var.f9128b;
            int i2 = d.h;
            int i5 = x0Var.f9127a;
            A0 a02 = x0Var.f9129c;
            if (i2 > i5) {
                ((D) a02.getItem(a02.getPosition(d))).h = nVar.getCountInBag();
            } else {
                a02.remove(d);
            }
            x0 x0Var2 = (x0) p0Var.f9075b;
            x0Var2.f9129c.notifyDataSetChanged();
            b.w(false);
            b.M0(R.raw.add_new_item);
            A0 a03 = x0Var2.f9129c;
            v0.e(a03.f8839a, a03.getContext().getString(R.string.toast_successfully));
            return;
        }
        b.w(false);
        int countInBag = nVar.getCountInBag();
        x0 x0Var3 = (x0) p0Var.f9075b;
        int i6 = x0Var3.f9127a;
        x0 x0Var4 = (x0) p0Var.f9075b;
        if (countInBag < i6) {
            a.n(MyApplication.f7090a, R.string.no_enough_items, x0Var3.f9129c.f8839a, (String) null);
            A0 a04 = x0Var4.f9129c;
            ((D) a04.getItem(a04.getPosition(x0Var4.f9128b))).h = nVar.getCountInBag();
            x0Var4.f9129c.notifyDataSetChanged();
            return;
        }
        int stockFreeSpace = o.getStockObject().getStockFreeSpace();
        int i7 = x0Var4.f9127a;
        A0 a05 = x0Var4.f9129c;
        if (stockFreeSpace < i7) {
            a.n(MyApplication.f7090a, R.string.no_enough_space_in_stock, a05.f8839a, (String) null);
            return;
        }
        a.n(MyApplication.f7090a, R.string.unknown_error_try_again, a05.f8839a, (String) null);
    }

    public void c(boolean z3) {
        switch (this.f7359a) {
            case 3:
                e eVar = (e) this.f7360b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, eVar.f494b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, eVar.f494b, (String) null);
                return;
            case zzaky.zzf.zzg:
                int i2 = 0;
                if (z3) {
                    if (o.getMainStatesObject().getGender() == 0) {
                        i2 = 1;
                    }
                    a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "gender").I(Integer.valueOf(i2)).addOnCompleteListener(new d0(i2, this));
                    return;
                }
                b.w(false);
                e0 e0Var = (e0) this.f7360b;
                boolean equals = e0Var.f7403b.equals("gold");
                Context context = e0Var.d;
                if (equals) {
                    c.y0(context);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context, (String) null);
                    return;
                }
            case 8:
                i iVar = (i) this.f7360b;
                if (z3) {
                    a.d((C0590f) iVar.f5606c, "mainStatesObject", "nickName").I((String) iVar.f5605b).addOnCompleteListener(new h(this, o.getMainStatesObject().getNickName(), 7));
                    return;
                }
                b.w(false);
                boolean equals2 = ((f0) iVar.d).d.equals("gold");
                f0 f0Var = (f0) iVar.d;
                if (equals2) {
                    c.y0(f0Var.f7410b);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, f0Var.f7410b, (String) null);
                return;
            case 13:
                if (z3) {
                    android.support.v4.media.session.a.E0("museumSpace", 1, new I(this, 16));
                    return;
                }
                b.w(false);
                c.y0(((e) this.f7360b).f494b);
                return;
            case 22:
                F f6 = (F) this.f7360b;
                if (z3) {
                    f6.f8871c.remove(f6.f8870b);
                    G g = f6.f8871c;
                    g.notifyDataSetChanged();
                    b.w(false);
                    b.M0(R.raw.money_get);
                    v0.e(g.f8875b, g.getContext().getString(R.string.toast_successfully));
                    d.i1();
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, f6.f8871c.f8875b, (String) null);
                return;
            default:
                l lVar = (l) this.f7360b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, ((Z) lVar.f247c).f8965b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((Z) lVar.f247c).f8965b, (String) null);
                return;
        }
    }

    public void d(int i2, boolean z3) {
        switch (this.f7359a) {
            case 4:
                int i5 = 0;
                if (z3) {
                    if (o.getMainStatesObject().getGender() == 0) {
                        i5 = 1;
                    }
                    a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "gender").I(Integer.valueOf(i5)).addOnSuccessListener(new L(this, i5, 0));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.toast_not_enough_items, ((C0439i) this.f7360b).f7423b, (String) null);
                return;
            case 5:
                i iVar = (i) this.f7360b;
                if (z3) {
                    a.d((C0590f) iVar.f5606c, "mainStatesObject", "nickName").I((String) iVar.f5605b).addOnCompleteListener(new h(this, o.getMainStatesObject().getNickName(), 6));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.toast_not_enough_items, (Context) ((A4.i) iVar.d).d, (String) null);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                I i6 = (I) this.f7360b;
                if (z3) {
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    a.k(MyApplication.f7090a, R.string.toast_successfully, ((h0) i6.f7143b).f7420b);
                    for (C0286s sVar : ((C0518i) ((h0) i6.f7143b).f7420b).l().f5000c.v()) {
                        if (sVar instanceof Q4.a) {
                            ((Q4.a) sVar).V(2010);
                        }
                    }
                    return;
                }
                b.w(false);
                if (i2 + 100 > 10000) {
                    c.s0(((h0) i6.f7143b).f7420b, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_maximum_sock_space, new Object[]{10000}), (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((h0) i6.f7143b).f7420b, (String) null);
                return;
            case 12:
                M m6 = (M) this.f7360b;
                if (z3) {
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    a.k(MyApplication.f7090a, R.string.toast_successfully, m6.f7366c);
                    for (C0286s sVar2 : ((C0518i) m6.f7366c).l().f5000c.v()) {
                        if (sVar2 instanceof R4.i) {
                            for (C0286s sVar3 : sVar2.m().f5000c.v()) {
                                if (sVar3 instanceof U4.a) {
                                    U4.a aVar = (U4.a) sVar3;
                                    aVar.getClass();
                                    if (o.getStockObject().getStallSpace() > aVar.f3721j0.getCount() - 1) {
                                        int stallSpace = o.getStockObject().getStallSpace() - (aVar.f3721j0.getCount() - 1);
                                        for (int i7 = 0; i7 < stallSpace; i7++) {
                                            ArrayList arrayList = aVar.f3720i0;
                                            arrayList.add(arrayList.size() - 1, D.f());
                                        }
                                        aVar.f3721j0.notifyDataSetChanged();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, m6.f7366c, (String) null);
                return;
            default:
                f fVar = (f) this.f7360b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, ((Z) fVar.d).f8965b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (android.support.v4.media.session.a.z().equals("count") && o.getStockObject().getStockFreeSpace() < fVar.f29b) {
                    a.n(MyApplication.f7090a, R.string.no_enough_space_in_stock, ((Z) fVar.d).f8965b, (String) null);
                    return;
                } else if (!android.support.v4.media.session.a.z().equals("countInBag") || o.getStockObject().getBagFreeSpace() >= fVar.f29b) {
                    a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((Z) fVar.d).f8965b, (String) null);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.no_enough_space_in_bag, ((Z) fVar.d).f8965b, (String) null);
                    return;
                }
        }
    }

    public void e(boolean z3, d5.i iVar) {
        u uVar = (u) this.f7360b;
        if (z3) {
            int i2 = ((g0) uVar.f1612c).f7413a;
            long j6 = uVar.f1611b;
            g0 g0Var = (g0) uVar.f1612c;
            if (i2 == 2006) {
                a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "courageDoubleEffectEndTime").I(Long.valueOf(b.K(g0Var.f7413a) + j6));
            } else if (i2 == 2007) {
                a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "healthDoubleEffectEndTime").I(Long.valueOf(b.K(g0Var.f7413a) + j6));
            }
            b.w(false);
            b.M0(R.raw.add_new_item);
            a.k(MyApplication.f7090a, R.string.toast_successfully, g0Var.f7414b);
            return;
        }
        b.w(false);
        if (iVar != null) {
            a.n(MyApplication.f7090a, R.string.can_not_use_herb_material, ((g0) uVar.f1612c).f7414b, (String) null);
            return;
        }
        c.s0(((g0) uVar.f1612c).f7414b, (String) null, (String) null);
    }

    public void f(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C0626h hVar = (C0626h) this.f7360b;
        if (z3) {
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, hVar.f9018b, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (!z4) {
            a.n(MyApplication.f7090a, R.string.level_lower_requirements, hVar.f9018b, (String) null);
        } else if (z5) {
            a.n(MyApplication.f7090a, R.string.already_in_gang, hVar.f9018b, (String) null);
        } else if (!z6) {
            a.n(MyApplication.f7090a, R.string.dialog_wait_two_hours_before_creating_new_gang, hVar.f9018b, (String) null);
        } else if (z7) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_join_request_sent_before, hVar.f9018b, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, hVar.f9018b, (String) null);
        }
    }

    public void h(boolean z3, k kVar) {
        switch (this.f7359a) {
            case 0:
                e eVar = (e) this.f7360b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, eVar.f494b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (kVar.getPowerCurrent() >= d.A0()) {
                    a.n(MyApplication.f7090a, R.string.current_power_is_full, eVar.f494b, (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, eVar.f494b, (String) null);
                return;
            case 1:
                e eVar2 = (e) this.f7360b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, eVar2.f494b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (kVar.getCourageCurrent() >= d.d0()) {
                    a.n(MyApplication.f7090a, R.string.current_courage_is_full, eVar2.f494b, (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, eVar2.f494b, (String) null);
                return;
            case 2:
                e eVar3 = (e) this.f7360b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, eVar3.f494b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (kVar.getNobilityCurrent() >= 100) {
                    a.n(MyApplication.f7090a, R.string.current_nobility_is_full, eVar3.f494b, (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, eVar3.f494b, (String) null);
                return;
            default:
                h0 h0Var = (h0) this.f7360b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, h0Var.f7420b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (kVar.getPowerCurrent() >= d.A0()) {
                    a.n(MyApplication.f7090a, R.string.current_power_is_full, h0Var.f7420b, (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, h0Var.f7420b, (String) null);
                return;
        }
    }

    public void i(long j6, boolean z3) {
        p0 p0Var = (p0) this.f7360b;
        if (z3) {
            String id = o.getAccountObject().getId();
            String z4 = android.support.v4.media.session.a.z();
            D d = (D) ((X4.d) p0Var.f9075b).f4209b;
            android.support.v4.media.session.a.B0(d.f4293a, d.f4294b, d.f4298i, 1, new p0(this, 0), id, z4, true);
            return;
        }
        b.w(false);
        if (I1.b.m(j6) || j6 == -1) {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((Z) ((X4.d) p0Var.f9075b).f4210c).f8965b, (String) null);
            return;
        }
        a.n(MyApplication.f7090a, R.string.can_not_buy_same_package_twice_wait_to_start_year, ((Z) ((X4.d) p0Var.f9075b).f4210c).f8965b, (String) null);
    }

    public void j(long j6) {
        a.v(a.c(C0592h.b().e(), "players"), "workObject").H(new u((Object) this, j6, 11));
    }

    public void k(ArrayList arrayList, boolean z3) {
        M m6 = (M) this.f7360b;
        if (z3) {
            b.w(false);
            b.M0(R.raw.add_new_item);
            a.k(MyApplication.f7090a, R.string.toast_successfully, m6.f7366c);
            return;
        }
        b.w(false);
        boolean contains = arrayList.contains(Integer.valueOf(m6.f7365b));
        Context context = m6.f7366c;
        if (contains) {
            a.n(MyApplication.f7090a, R.string.already_have_museum_background, context, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, context, (String) null);
        }
    }

    public void l(boolean z3, boolean z4) {
        l lVar = (l) this.f7360b;
        if (z3) {
            ((r) lVar.f247c).f9084c.clear();
            int i2 = 0;
            while (true) {
                r rVar = (r) lVar.f247c;
                int i5 = lVar.f246b;
                if (i2 < ((Y4.q) rVar.getItem(i5)).f4416c.size()) {
                    rVar.f9084c.add(Boolean.FALSE);
                    int intValue = ((Integer) ((Y4.q) rVar.getItem(i5)).d.get(i2)).intValue();
                    if (((Integer) ((Y4.q) rVar.getItem(i5)).f4416c.get(i2)).intValue() == -100) {
                        U.g(o.getAccountObject().getId(), "gold", (long) intValue, new C0625g0(this, i2, 0));
                    } else if (((Integer) ((Y4.q) rVar.getItem(i5)).f4416c.get(i2)).intValue() == -101) {
                        U.g(o.getAccountObject().getId(), "cash", (long) intValue, new C0625g0(this, i2, 1));
                    } else if (((Integer) ((Y4.q) rVar.getItem(i5)).f4416c.get(i2)).intValue() == -102) {
                        U.g(o.getAccountObject().getId(), "check", (long) intValue, new C0625g0(this, i2, 2));
                    } else {
                        D s6 = D.s(((Integer) ((Y4.q) rVar.getItem(i5)).f4416c.get(i2)).intValue(), 0, 1);
                        android.support.v4.media.session.a.B0(s6.f4293a, s6.f4294b, s6.f4298i, intValue, new C0625g0(this, i2, 3), o.getAccountObject().getId(), "count", false);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            b.w(false);
            if (z4) {
                c.s0(((r) lVar.f247c).f9083b, MyApplication.f7090a.getApplicationContext().getString(R.string.level_rewards_collected_before), (String) null);
                ArrayList<Boolean> levelRewardsCollectState = o.getPrizeObject().getLevelRewardsCollectState();
                Boolean bool = Boolean.TRUE;
                int i6 = lVar.f246b;
                levelRewardsCollectState.set(i6, bool);
                r rVar2 = (r) lVar.f247c;
                ((Y4.q) rVar2.getItem(i6)).f4415b = true;
                rVar2.notifyDataSetChanged();
                b0.b();
                return;
            }
            c.s0(((r) lVar.f247c).f9083b, (String) null, (String) null);
        }
    }

    public void m(boolean z3, boolean z4, C0475h hVar, C0475h hVar2) {
        M m6 = (M) this.f7360b;
        if (z3) {
            b.w(false);
            b.M0(R.raw.add_new_item);
            a.k(MyApplication.f7090a, R.string.toast_successfully, m6.f7366c);
            return;
        }
        b.w(false);
        a.n(MyApplication.f7090a, R.string.unknown_error_try_again, m6.f7366c, (String) null);
    }

    public Object then(Task task) {
        switch (this.f7359a) {
            case 17:
                FirebaseAuth instance = FirebaseAuth.getInstance(R2.i.f(((C0528e) ((m) this.f7360b)).f7922c));
                String str = ((e3.n) task.getResult()).f7649a;
                com.google.android.gms.common.internal.I.g(str);
                instance.getClass();
                com.google.android.gms.common.internal.I.d(str);
                return instance.f6865e.zza(instance.f6862a, (C0493a) null, str);
            case 18:
                int i2 = GenericIdpActivity.f6881J;
                Uri.Builder buildUpon = ((Uri) this.f7360b).buildUpon();
                if (task.isSuccessful()) {
                    Z2.c cVar = (Z2.c) task.getResult();
                    R2.k kVar = cVar.f4484b;
                    if (kVar != null) {
                        Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(kVar)));
                    }
                    buildUpon.fragment("fac=" + cVar.f4483a);
                } else {
                    String message = task.getException().getMessage();
                    Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + message);
                }
                return buildUpon.build();
            default:
                boolean isSuccessful = task.isSuccessful();
                I1.b bVar = (I1.b) this.f7360b;
                if (isSuccessful) {
                    return bVar.R0((String) task.getResult());
                }
                Exception exception = task.getException();
                com.google.android.gms.common.internal.I.g(exception);
                String message2 = exception.getMessage();
                Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + message2 + "\n\n Failing open with a fake token.");
                return bVar.R0("NO_RECAPTCHA");
        }
    }

    public void u(C0587c cVar) {
        long j6;
        switch (this.f7359a) {
            case 15:
                long longValue = ((Long) cVar.f(Long.class)).longValue();
                long j7 = longValue / 1000;
                if (j7 < c.f5744o - 10) {
                    int i2 = c.f5749t + 1;
                    c.f5749t = i2;
                    if (i2 >= 5) {
                        K1.e.a(longValue);
                    }
                }
                if (c.Z()) {
                    j6 = 0;
                } else {
                    j6 = 3000;
                }
                new Handler().postDelayed(new B1(this, j7, j6, 1), j6);
                return;
            default:
                n nVar = (n) cVar.f(n.class);
                M0 m02 = (M0) this.f7360b;
                if (nVar == null) {
                    b.w(false);
                    a.n(MyApplication.f7090a, R.string.items_not_exist_anymore, m02.f8919a, (String) null);
                    return;
                }
                nVar.setUsedInMuseum(true);
                nVar.getMuseumPositions().add(Integer.valueOf(m02.f8921c));
                m02.f8923f.E("itemsInStock").E(K1.e.y(nVar.getType())).E(K1.e.x(nVar.getId(), nVar.getLevel())).I(nVar).addOnSuccessListener(new R.b(this, 6));
                return;
        }
    }

    public /* synthetic */ K(Object obj, int i2) {
        this.f7359a = i2;
        this.f7360b = obj;
    }

    private final void b(C0588d dVar) {
    }

    private final void g(C0588d dVar) {
    }
}
