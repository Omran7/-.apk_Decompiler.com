package com.mtma.criminal.city.fragments.gangBase;

import A2.f;
import B0.C0004c;
import B0.H;
import B0.l;
import F0.C0015e;
import H4.e;
import K4.h;
import R2.b;
import S3.t;
import T1.B1;
import T1.C0217w;
import T4.d;
import a1.C0258c;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.A;
import com.mtma.criminal.city.utils.C0433c;
import com.mtma.criminal.city.utils.C0434d;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.D;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.M;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.f0;
import com.mtma.criminal.city.utils.h0;
import com.mtma.criminal.city.utils.i0;
import com.mtma.criminal.city.utils.o0;
import com.mtma.criminal.city.utils.v0;
import d5.C0469b;
import d5.C0473f;
import d5.o;
import e1.C0483b;
import e1.C0484c;
import e2.C0485a;
import f.C0518i;
import f3.C0539p;
import f3.u;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.C0595k;
import i3.n;
import i3.p;
import i3.q;
import j.k;
import j.m;
import j4.C0615b0;
import j4.F;
import j4.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import k.C0659E0;
import l4.i;

public final class I implements q, D, J, p, C0434d, i0, T, o0, C0485a, Continuation, C0659E0, C0483b, C0433c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7142a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7143b;

    public /* synthetic */ I(Object obj, int i2) {
        this.f7142a = i2;
        this.f7143b = obj;
    }

    public void B(C0588d dVar) {
        int i2 = this.f7142a;
    }

    public void a(boolean z3, C0469b bVar) {
        if (z3) {
            a.n(MyApplication.f7090a, R.string.plane_removed_from_arming, ((F) ((e) this.f7143b).f1026b).f8871c.f8875b, (String) null);
        }
    }

    public void c(boolean z3) {
        switch (this.f7142a) {
            case 14:
                f fVar = (f) this.f7143b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, (Context) fVar.f30c, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, (Context) fVar.f30c, (String) null);
                return;
            case 15:
                if (z3) {
                    android.support.v4.media.session.a.E0("stockSpace", 100, new K(this, 11));
                    return;
                }
                b.w(false);
                h0 h0Var = (h0) this.f7143b;
                boolean equals = h0Var.f7421c.equals("gold");
                Context context = h0Var.f7420b;
                if (equals) {
                    c.y0(context);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context, (String) null);
                    return;
                }
            case 17:
                b.w(false);
                b.M0(R.raw.add_new_item);
                A a6 = (A) this.f7143b;
                a.k(MyApplication.f7090a, R.string.toast_successfully, a6.f7340b);
                if (a6.f7341c.f4293a == 701) {
                    for (C0286s sVar : ((C0518i) a6.f7340b).l().f5000c.v()) {
                        if (sVar instanceof i) {
                            ((i) sVar).d0();
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                l lVar = (l) this.f7143b;
                if (z3) {
                    C0615b0 b0Var = (C0615b0) lVar.f247c;
                    int i2 = C0615b0.f8976e;
                    b0Var.clear();
                    b0Var.addAll(c.Q(b0Var.f8979c, true));
                    b0Var.notifyDataSetChanged();
                    b.w(false);
                    b.M0(R.raw.money_pay);
                    return;
                }
                b.w(false);
                c.s0(((C0615b0) lVar.f247c).f8978b, (String) null, (String) null);
                return;
        }
    }

    public void d(int i2, boolean z3) {
        switch (this.f7142a) {
            case 8:
                y1.l lVar = (y1.l) this.f7143b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, (Context) lVar.f12678b, R.raw.add_new_item);
                    F3.e eVar = (F3.e) lVar.f12679c;
                    if (eVar != null) {
                        eVar.d(lVar.f12677a, true);
                        return;
                    }
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, (Context) lVar.f12678b, (String) null);
                F3.e eVar2 = (F3.e) lVar.f12679c;
                if (eVar2 != null) {
                    eVar2.d(lVar.f12677a, false);
                    return;
                }
                return;
            default:
                K k6 = (K) this.f7143b;
                if (z3) {
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    v0.e(((D0.e) k6.f7360b).f494b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                    Q.b(88, o.getAccountObject().getId(), (long) 1);
                    for (C0286s sVar : ((C0518i) ((D0.e) k6.f7360b).f494b).l().f5000c.v()) {
                        if (sVar instanceof R4.i) {
                            Iterator it2 = sVar.m().f5000c.v().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C0286s sVar2 = (C0286s) it2.next();
                                    if (sVar2 instanceof d) {
                                        d dVar = (d) sVar2;
                                        dVar.getClass();
                                        if (o.getStockObject().getMuseumSpace() > dVar.f3598o0.getCount()) {
                                            int museumSpace = o.getStockObject().getMuseumSpace() - dVar.f3598o0.getCount();
                                            for (int i5 = 0; i5 < museumSpace; i5++) {
                                                ArrayList arrayList = dVar.f3595l0;
                                                arrayList.add(arrayList.size() - 1, Y4.D.f());
                                                dVar.f3596m0.add(Y4.D.f());
                                            }
                                            dVar.f3597n0.notifyDataSetChanged();
                                            dVar.f3598o0.notifyDataSetChanged();
                                        }
                                    }
                                }
                            }
                        } else if (sVar instanceof Q4.a) {
                            ((Q4.a) sVar).V(2013);
                        }
                    }
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((D0.e) k6.f7360b).f494b, (String) null);
                return;
        }
    }

    public void e(boolean z3, d5.i iVar) {
        int i2;
        switch (this.f7142a) {
            case 3:
                C0258c cVar = (C0258c) this.f7143b;
                if (z3) {
                    int i5 = cVar.f4550b;
                    A a6 = (A) cVar.d;
                    if (i5 == 610 || i5 == 603) {
                        int i6 = a6.f7341c.f4293a;
                        if (i6 == 610) {
                            i2 = 300;
                        } else if (i6 == 603) {
                            i2 = 100;
                        } else {
                            i2 = 0;
                        }
                        com.bumptech.glide.d.m1(0, i2, false, new l((Object) this, i2, 9));
                        return;
                    }
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    v0.e(a6.f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                    Q.b(93, o.getAccountObject().getId(), (long) 1);
                    return;
                }
                b.w(false);
                if (iVar != null) {
                    a.n(MyApplication.f7090a, R.string.can_not_use_herb, ((A) cVar.d).f7340b, (String) null);
                    return;
                }
                c.s0(((A) cVar.d).f7340b, (String) null, (String) null);
                return;
            default:
                C0258c cVar2 = (C0258c) this.f7143b;
                if (!z3) {
                    b.w(false);
                    if (iVar != null) {
                        a.n(MyApplication.f7090a, R.string.can_not_use_plate, ((A) cVar2.d).f7340b, (String) null);
                        return;
                    }
                    c.s0(((A) cVar2.d).f7340b, (String) null, (String) null);
                    return;
                } else if (cVar2.f4550b == 5005) {
                    com.bumptech.glide.d.m1(0, 100, false, new t(this, 28));
                    return;
                } else {
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    a.k(MyApplication.f7090a, R.string.toast_successfully, ((A) cVar2.d).f7340b);
                    return;
                }
        }
    }

    public H f(C0595k kVar) {
        switch (this.f7142a) {
            case zzaky.zzf.zzg:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                if (((Boolean) kVar.c(Boolean.class)).booleanValue()) {
                    return b.a();
                }
                kVar.d(Boolean.TRUE);
                return b.W0(kVar);
            default:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                kVar.a("lastSeen").d(n.f8294a);
                return b.W0(kVar);
        }
    }

    public void g(k kVar, m mVar) {
        ((j.e) this.f7143b).f8695f.removeCallbacksAndMessages(kVar);
    }

    public Object get() {
        String packageName = ((Context) ((C0484c) this.f7143b).f7573a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void h(boolean z3, d5.k kVar) {
        switch (this.f7142a) {
            case zzaky.zzf.zzf:
                M m6 = (M) this.f7143b;
                if (z3) {
                    b.w(false);
                    v0.e(m6.f7366c, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                    b.M0(R.raw.add_new_item);
                    Q.b(3, o.getAccountObject().getId(), (long) 1);
                    Q.b(4, o.getAccountObject().getId(), (long) I1.b.k0(m6.f7365b));
                    for (C0286s sVar : ((C0518i) m6.f7366c).l().f5000c.v()) {
                        if (sVar instanceof i) {
                            ((i) sVar).d0();
                            return;
                        }
                    }
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, m6.f7366c, (String) null);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                C0015e eVar = (C0015e) this.f7143b;
                if (z3) {
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    a.k(MyApplication.f7090a, R.string.toast_successfully, eVar.f683b);
                    return;
                }
                b.w(false);
                if (kVar.getPowerCurrent() + 500 > 5000) {
                    c.s0(eVar.f683b, MyApplication.f7090a.getApplicationContext().getString(R.string.power_rich_maximum_limit, new Object[]{5000}), (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, eVar.f683b, (String) null);
                return;
            case 12:
                h0 h0Var = (h0) this.f7143b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, h0Var.f7420b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (kVar.getCourageCurrent() >= com.bumptech.glide.d.d0()) {
                    a.n(MyApplication.f7090a, R.string.current_courage_is_full, h0Var.f7420b, (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, h0Var.f7420b, (String) null);
                return;
            default:
                C0015e eVar2 = (C0015e) this.f7143b;
                if (z3) {
                    b.w(false);
                    a.l(MyApplication.f7090a, R.string.toast_successfully, eVar2.f683b, R.raw.add_new_item);
                    return;
                }
                b.w(false);
                if (kVar.getNobilityCurrent() >= 100) {
                    a.n(MyApplication.f7090a, R.string.current_nobility_is_full, eVar2.f683b, (String) null);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, eVar2.f683b, (String) null);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: j.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(j.k r10, j.m r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f7143b
            j.e r0 = (j.e) r0
            android.os.Handler r1 = r0.f8695f
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.f8697q
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            j.d r6 = (j.d) r6
            j.k r6 = r6.f8682b
            if (r10 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = r5
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            j.d r2 = (j.d) r2
        L_0x0035:
            r5 = r2
            T1.x0 r1 = new T1.x0
            r8 = 10
            r3 = r1
            r4 = r9
            r6 = r11
            r7 = r10
            r3.<init>((java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (int) r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r11 = r0.f8695f
            r11.postAtTime(r1, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.fragments.gangBase.I.k(j.k, j.m):void");
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        switch (this.f7142a) {
            case zzaky.zzf.zzg:
                K k6 = (K) this.f7143b;
                Class<Boolean> cls = Boolean.class;
                if (dVar != null || !cVar.b() || !z3) {
                    k6.l(false, ((Boolean) cVar.f(cls)).booleanValue());
                    return;
                } else {
                    k6.l(true, ((Boolean) cVar.f(cls)).booleanValue());
                    return;
                }
            default:
                if (dVar == null && z3 && cVar.b()) {
                    a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "lastSeen").d(new K(this, 15));
                    return;
                }
                return;
        }
    }

    public void p(Z4.f fVar) {
        boolean z3 = fVar.isAllProcessSuccess;
        K4.l lVar = (K4.l) this.f7143b;
        if (z3) {
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, (Context) lVar.f1578e, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (!fVar.isGangDataValid) {
            if (fVar.isGangNameTooShort) {
                c.s0((Context) lVar.f1578e, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_less_than_number_of_letters, new Object[]{4}), (String) null);
            } else if (fVar.isGangNameTooLong) {
                c.s0((Context) lVar.f1578e, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_more_than_number_of_letters, new Object[]{15}), (String) null);
            } else if (!fVar.isGangTagEqualToThreeLetters) {
                a.n(MyApplication.f7090a, R.string.gang_tag_must_be_three_letters, (Context) lVar.f1578e, (String) null);
            }
        } else if (fVar.isGangDataAlreadyExist) {
            if (fVar.isNameAlreadyExist) {
                a.n(MyApplication.f7090a, R.string.gang_name_already_exist, (Context) lVar.f1578e, (String) null);
            } else if (fVar.isTagAlreadyExist) {
                a.n(MyApplication.f7090a, R.string.gang_tag_already_exist, (Context) lVar.f1578e, (String) null);
            }
        } else if (!fVar.isCurrentPlayerBoss) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_take_that_action, (Context) lVar.f1578e, (String) null);
        } else if (!fVar.isGoldChanged) {
            c.y0((Context) lVar.f1578e);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error, (Context) lVar.f1578e, (String) null);
        }
    }

    public void q(Z4.t tVar) {
        boolean z3 = tVar.isAllProcessSuccess;
        Z z4 = (Z) this.f7143b;
        if (z3) {
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, z4.f8965b, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (tVar.isNewBossSameCurrentPlayer) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_you_are_boss_already, z4.f8965b, (String) null);
        } else if (!tVar.isCurrentPlayerIsBoss) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_position_not_allowed_to_take_action, z4.f8965b, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, z4.f8965b, (String) null);
        }
    }

    public Object then(Task task) {
        switch (this.f7142a) {
            case 22:
                u uVar = RecaptchaActivity.f6884J;
                Uri.Builder buildUpon = ((Uri) this.f7143b).buildUpon();
                if (task.isSuccessful()) {
                    Z2.c cVar = (Z2.c) task.getResult();
                    R2.k kVar = cVar.f4484b;
                    if (kVar != null) {
                        Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(kVar)));
                    }
                    buildUpon.fragment("fac=" + cVar.f4483a);
                } else {
                    String message = task.getException().getMessage();
                    Log.e("RecaptchaActivity", "Unexpected error getting App Check token: " + message);
                }
                return buildUpon.build();
            default:
                if (task.isSuccessful()) {
                    return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.f7143b);
                }
                Exception exception = task.getException();
                com.google.android.gms.common.internal.I.g(exception);
                if (!(exception instanceof C0539p)) {
                    return Tasks.forException(exception);
                }
                if (Log.isLoggable("RecaptchaHandler", 4)) {
                    String message2 = exception.getMessage();
                    Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + message2);
                }
                return Tasks.forResult("");
        }
    }

    public void u(C0587c cVar) {
        C0587c cVar2 = cVar;
        switch (this.f7142a) {
            case 0:
                boolean g = cVar.g();
                J j6 = (J) this.f7143b;
                boolean z3 = false;
                if (g) {
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap = new HashMap();
                    C0586b c3 = cVar.c();
                    while (true) {
                        Iterator it2 = c3.f8276a;
                        if (it2.hasNext()) {
                            v3.q qVar = (v3.q) it2.next();
                            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            v3.m t6 = v3.m.t(qVar.f12305b);
                            if (!z3) {
                                j6.f7152l0 = (Long) r3.b.c(Long.class, t6.f12296a.getValue());
                                z3 = true;
                            }
                            String F = E6.F();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            o3.d.c(C0592h.b().e(), "players", F, "mainStatesObject").d(new E(hashMap, F, taskCompletionSource, 6));
                            arrayList.add(taskCompletionSource.getTask());
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new B4.d((q) this, cVar2, hashMap, 6));
                            return;
                        }
                    }
                } else {
                    j6.f7153m0 = false;
                    v0.e(j6.f7144d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    b.M0(R.raw.error_loading);
                    b.w(false);
                    return;
                }
            case 1:
                String firebaseKeyNode = o.getEstateObject().getFirebaseKeyNode();
                int id = o.getEstateObject().getId();
                C0473f fVar = (C0473f) cVar2.f(C0473f.class);
                C0590f fVar2 = (C0590f) this.f7143b;
                fVar2.E("id").I(0);
                fVar2.E("estateOwnerId").I(o.getAccountObject().getId());
                C0590f E7 = fVar2.E("used");
                Boolean bool = Boolean.TRUE;
                E7.I(bool);
                fVar2.E("spouseUsed").I(Boolean.valueOf(fVar.isSpouseUsed()));
                fVar2.E("firebaseKeyNode").I("--defaultEstate");
                fVar2.E("fixedModificationList").I((Object) null);
                fVar2.E("servantContractsStartTimeInMilliList").I((Object) null);
                o.setEstateObject(new C0473f(fVar.getId(), "--defaultEstate", o.getAccountObject().getId(), true, fVar.isSpouseUsed(), fVar.getFixedModificationList(), fVar.getServantContractsStartTimeInMilliList(), -1));
                fVar2.E("allOwnEstates").E("--defaultEstate").E("used").I(bool);
                fVar2.E("allOwnEstates").E(firebaseKeyNode).E("used").I(Boolean.FALSE);
                c.k0(o.getAccountObject().getId(), new b5.k(3, id, -1));
                if (Y4.D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4313x == 2) {
                    android.support.v4.media.session.a.u0(15, false, (C0433c) null);
                    return;
                }
                return;
            case 2:
                Class<Integer> cls = Integer.class;
                try {
                    int intValue = ((Integer) cVar2.a("serverNumber").f(cls)).intValue();
                    int intValue2 = ((Integer) cVar2.a("maximumLevel").f(cls)).intValue();
                    long longValue = ((Long) cVar2.a("createdTime").f(Long.class)).longValue();
                    f fVar3 = new f(MyApplication.f7090a.getApplicationContext());
                    fVar3.w();
                    o0.a aVar = (o0.a) o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar3.e()).edit();
                    aVar.putString("server_name", (String) cVar2.a("serverName").f(String.class));
                    aVar.putInt("server_number", intValue);
                    aVar.putInt("server_maximum_level", intValue2);
                    aVar.putLong("server_created_time", longValue);
                    aVar.apply();
                    K4.u uVar = (K4.u) this.f7143b;
                    switch (uVar.f1610a) {
                        case 4:
                            com.bumptech.glide.d.b(uVar.f1611b, new t(uVar, 11));
                            return;
                        default:
                            com.bumptech.glide.d.b(uVar.f1611b, new T1.A((Object) uVar, 12));
                            return;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 5:
                int i2 = (cVar.d() > 1 ? 1 : (cVar.d() == 1 ? 0 : -1));
                C0004c cVar3 = (C0004c) this.f7143b;
                if (i2 > 0) {
                    a.d((C0590f) ((c1.i) ((K) ((h) cVar3.f212b).f1523c).f7360b).f5606c, "mainStatesObject", "nickName").I((String) ((h) cVar3.f212b).f1522b).addOnCompleteListener(new C0451v(this, 5));
                    return;
                }
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, (Context) ((A4.i) ((c1.i) ((K) ((h) cVar3.f212b).f1523c).f7360b).d).d, R.raw.add_new_item);
                return;
            case 9:
                int i5 = (cVar.d() > 1 ? 1 : (cVar.d() == 1 ? 0 : -1));
                C0004c cVar4 = (C0004c) this.f7143b;
                if (i5 > 0) {
                    a.d((C0590f) ((c1.i) ((K) ((h) cVar4.f212b).f1523c).f7360b).f5606c, "mainStatesObject", "nickName").I((String) ((h) cVar4.f212b).f1522b).addOnCompleteListener(new C0451v(this, 8));
                    return;
                }
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, ((f0) ((c1.i) ((K) ((h) cVar4.f212b).f1523c).f7360b).d).f7410b, R.raw.add_new_item);
                return;
            default:
                long longValue2 = ((Long) cVar2.f(Long.class)).longValue();
                long j7 = longValue2 / 1000;
                if (j7 < c.f5744o - 10) {
                    int i6 = c.f5749t + 1;
                    c.f5749t = i6;
                    if (i6 >= 5) {
                        K1.e.a(longValue2);
                    }
                }
                new Handler().postDelayed(new C0217w(this, j7, 3), ((B1) this.f7143b).f2810c);
                return;
        }
    }

    public I(int i2) {
        this.f7142a = i2;
        switch (i2) {
            case 26:
                this.f7143b = new Handler(Looper.getMainLooper());
                return;
            default:
                return;
        }
    }

    private final void b(C0588d dVar) {
    }

    private final void i(C0588d dVar) {
    }

    private final void j(C0588d dVar) {
    }

    private final void m(C0588d dVar) {
    }

    private final void n(C0588d dVar) {
    }

    private final void o(C0588d dVar) {
    }
}
