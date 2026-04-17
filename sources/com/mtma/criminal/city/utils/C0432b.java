package com.mtma.criminal.city.utils;

import A2.f;
import B0.H;
import K.Y;
import R2.b;
import a5.C0264a;
import android.content.Context;
import androidx.appcompat.widget.ActionBarContextView;
import b5.n;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.C0469b;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.p;
import j4.C0610A;
import j4.C0647x;
import j4.C0648y;
import j4.D;

/* renamed from: com.mtma.criminal.city.utils.b  reason: case insensitive filesystem */
public final class C0432b implements p, o0, T, H, Y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7391a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7392b;

    /* renamed from: c  reason: collision with root package name */
    public int f7393c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0432b(o0 o0Var, boolean z3, int i2, int i5) {
        this.f7391a = i5;
        this.d = o0Var;
        this.f7392b = z3;
        this.f7393c = i2;
    }

    public void a(C0264a aVar) {
        String str;
        b.w(false);
        boolean z3 = aVar.isAllProcessSuccess;
        boolean z4 = this.f7392b;
        C0610A a6 = (C0610A) this.d;
        if (!z3) {
            if (z4) {
                Context applicationContext = MyApplication.f7090a.getApplicationContext();
                Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                f fVar = (f) a6.f8837b.f8851c;
                str = applicationContext.getString(R.string.crime_failed_tool_lost, new Object[]{applicationContext2.getString(((Y4.f) ((D) fVar.d).getItem(fVar.f29b)).f4346a)});
                D d6 = (D) ((f) a6.f8837b.f8851c).d;
                d6.d = this.f7393c;
                d6.notifyDataSetChanged();
            } else {
                Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
                Context applicationContext4 = MyApplication.f7090a.getApplicationContext();
                f fVar2 = (f) a6.f8837b.f8851c;
                str = applicationContext3.getString(R.string.crime_failed, new Object[]{applicationContext4.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a)});
            }
            f fVar3 = (f) a6.f8837b.f8851c;
            D.b((D) fVar3.d, fVar3.f29b, str);
        } else if (z4) {
            Context context = ((D) ((f) a6.f8837b.f8851c).d).f8856a;
            Context applicationContext5 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext6 = MyApplication.f7090a.getApplicationContext();
            f fVar4 = (f) a6.f8837b.f8851c;
            c.s0(context, applicationContext5.getString(R.string.crime_failed_tool_lost_go_to_prison, new Object[]{applicationContext6.getString(((Y4.f) ((D) fVar4.d).getItem(fVar4.f29b)).f4346a)}), (String) null);
        } else {
            Context context2 = ((D) ((f) a6.f8837b.f8851c).d).f8856a;
            Context applicationContext7 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext8 = MyApplication.f7090a.getApplicationContext();
            f fVar5 = (f) a6.f8837b.f8851c;
            c.s0(context2, applicationContext7.getString(R.string.crime_failed_go_to_prison, new Object[]{applicationContext8.getString(((Y4.f) ((D) fVar5.d).getItem(fVar5.f29b)).f4346a)}), (String) null);
        }
    }

    public void b() {
        if (!this.f7392b) {
            ActionBarContextView actionBarContextView = (ActionBarContextView) this.d;
            actionBarContextView.f4725f = null;
            C0432b.super.setVisibility(this.f7393c);
        }
    }

    public void c(boolean z3) {
        String str;
        String str2;
        b.w(false);
        boolean z4 = this.f7392b;
        C0648y yVar = (C0648y) this.d;
        if (z4) {
            if (z3) {
                Context applicationContext = MyApplication.f7090a.getApplicationContext();
                Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                f fVar = (f) yVar.f9131b.f8851c;
                str2 = applicationContext.getString(R.string.crime_success_got_reward_tool_lost, new Object[]{applicationContext2.getString(((Y4.f) ((D) fVar.d).getItem(fVar.f29b)).f4346a), MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_word_cash, new Object[]{U.c(yVar.f9130a)})});
            } else {
                Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
                Context applicationContext4 = MyApplication.f7090a.getApplicationContext();
                f fVar2 = (f) yVar.f9131b.f8851c;
                str2 = applicationContext3.getString(R.string.crime_success_tool_lost, new Object[]{applicationContext4.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a)});
            }
            f fVar3 = (f) yVar.f9131b.f8851c;
            D.b((D) fVar3.d, fVar3.f29b, str2);
            D d6 = (D) ((f) yVar.f9131b.f8851c).d;
            d6.d = this.f7393c;
            d6.notifyDataSetChanged();
            return;
        }
        if (z3) {
            Context applicationContext5 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext6 = MyApplication.f7090a.getApplicationContext();
            f fVar4 = (f) yVar.f9131b.f8851c;
            str = applicationContext5.getString(R.string.crime_success_got_reward, new Object[]{applicationContext6.getString(((Y4.f) ((D) fVar4.d).getItem(fVar4.f29b)).f4346a), MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_word_cash, new Object[]{U.c(yVar.f9130a)})});
        } else {
            Context applicationContext7 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext8 = MyApplication.f7090a.getApplicationContext();
            f fVar5 = (f) yVar.f9131b.f8851c;
            str = applicationContext7.getString(R.string.crime_success, new Object[]{applicationContext8.getString(((Y4.f) ((D) fVar5.d).getItem(fVar5.f29b)).f4346a)});
        }
        f fVar6 = (f) yVar.f9131b.f8851c;
        D.b((D) fVar6.d, fVar6.f29b, str);
    }

    public void d(int i2, boolean z3) {
        String str;
        String str2;
        b.w(false);
        boolean z4 = this.f7392b;
        C0647x xVar = (C0647x) this.d;
        if (z4) {
            if (z3) {
                Context applicationContext = MyApplication.f7090a.getApplicationContext();
                Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                f fVar = (f) xVar.f9126c.f8851c;
                str2 = applicationContext.getString(R.string.crime_success_got_reward_tool_lost, new Object[]{applicationContext2.getString(((Y4.f) ((D) fVar.d).getItem(fVar.f29b)).f4346a), MyApplication.f7090a.getApplicationContext().getString(Y4.D.s(xVar.f9125b, 0, 1).f4295c)});
            } else {
                Context applicationContext3 = MyApplication.f7090a.getApplicationContext();
                Context applicationContext4 = MyApplication.f7090a.getApplicationContext();
                f fVar2 = (f) xVar.f9126c.f8851c;
                str2 = applicationContext3.getString(R.string.crime_success_tool_lost, new Object[]{applicationContext4.getString(((Y4.f) ((D) fVar2.d).getItem(fVar2.f29b)).f4346a)});
            }
            f fVar3 = (f) xVar.f9126c.f8851c;
            D.b((D) fVar3.d, fVar3.f29b, str2);
            D d6 = (D) ((f) xVar.f9126c.f8851c).d;
            d6.d = this.f7393c;
            d6.notifyDataSetChanged();
            return;
        }
        if (z3) {
            Context applicationContext5 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext6 = MyApplication.f7090a.getApplicationContext();
            f fVar4 = (f) xVar.f9126c.f8851c;
            str = applicationContext5.getString(R.string.crime_success_got_reward, new Object[]{applicationContext6.getString(((Y4.f) ((D) fVar4.d).getItem(fVar4.f29b)).f4346a), MyApplication.f7090a.getApplicationContext().getString(Y4.D.s(xVar.f9125b, 0, 1).f4295c)});
        } else {
            Context applicationContext7 = MyApplication.f7090a.getApplicationContext();
            Context applicationContext8 = MyApplication.f7090a.getApplicationContext();
            f fVar5 = (f) xVar.f9126c.f8851c;
            str = applicationContext7.getString(R.string.crime_success, new Object[]{applicationContext8.getString(((Y4.f) ((D) fVar5.d).getItem(fVar5.f29b)).f4346a)});
        }
        f fVar6 = (f) xVar.f9126c.f8851c;
        D.b((D) fVar6.d, fVar6.f29b, str);
    }

    public void e() {
        this.f7392b = true;
    }

    public H f(C0595k kVar) {
        switch (this.f7391a) {
            case 0:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                C0469b bVar = (C0469b) kVar.c(C0469b.class);
                if (!this.f7392b) {
                    int i2 = this.f7393c;
                    if (i2 == 1 || i2 == 14) {
                        if (bVar.getArmorId() == -1 && bVar.getArmorLevel() == 0) {
                            return b.a();
                        }
                        kVar.a("armorId").d(-1);
                        kVar.a("armorLevel").d(0);
                    } else if (i2 == 15) {
                        if (bVar.getSpecialEquipmentId() == -1) {
                            return b.a();
                        }
                        kVar.a("specialEquipmentId").d(-1);
                    } else if (i2 == 16) {
                        if (bVar.getBioChemicalId() == -1) {
                            return b.a();
                        }
                        kVar.a("bioChemicalId").d(-1);
                    }
                } else if (bVar.getGunId() == -1 && bVar.getGunLevel() == 0) {
                    return b.a();
                } else {
                    kVar.a("gunId").d(-1);
                    kVar.a("gunLevel").d(0);
                }
                return b.W0(kVar);
            default:
                int i5 = this.f7393c;
                boolean z3 = this.f7392b;
                if ((z3 && o.getStockObject().getBagFreeSpace() < i5) || (!z3 && o.getStockObject().getStockFreeSpace() < i5)) {
                    return b.a();
                }
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                n nVar = (n) kVar.c(n.class);
                int count = nVar.getCount();
                int countInBag = nVar.getCountInBag();
                boolean isUsedInArming = nVar.isUsedInArming();
                if ((z3 && count - i5 < 0) || ((z3 && isUsedInArming && count - i5 < 1) || (!z3 && countInBag - i5 < 0))) {
                    return b.a();
                }
                if (z3) {
                    nVar.setCount(count - i5);
                    nVar.setCountInBag(countInBag + i5);
                } else {
                    nVar.setCount(count + i5);
                    nVar.setCountInBag(countInBag - i5);
                }
                kVar.d(nVar);
                return b.W0(kVar);
        }
    }

    public void g() {
        C0432b.super.setVisibility(0);
        this.f7392b = false;
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        switch (this.f7391a) {
            case 0:
                C0469b bVar = (C0469b) cVar.f(C0469b.class);
                C0433c cVar2 = (C0433c) this.d;
                if (dVar == null && z3 && cVar.b()) {
                    o.setArmingObject(bVar);
                    if (cVar2 != null) {
                        cVar2.a(true, bVar);
                        return;
                    }
                    return;
                } else if (cVar2 != null) {
                    cVar2.a(false, bVar);
                    return;
                } else {
                    return;
                }
            default:
                q0 q0Var = (q0) this.d;
                Class<n> cls = n.class;
                if (dVar != null || !z3 || !cVar.b()) {
                    q0Var.a(false, (n) cVar.f(cls));
                    return;
                } else {
                    q0Var.a(true, (n) cVar.f(cls));
                    return;
                }
        }
    }

    public /* synthetic */ C0432b(boolean z3, int i2, Object obj, int i5) {
        this.f7391a = i5;
        this.f7392b = z3;
        this.f7393c = i2;
        this.d = obj;
    }

    public C0432b(ActionBarContextView actionBarContextView) {
        this.f7391a = 5;
        this.d = actionBarContextView;
        this.f7392b = false;
    }
}
