package T1;

import B0.H;
import G.c;
import H4.d;
import H4.g;
import I3.h;
import K.O;
import K1.e;
import K4.u;
import L.t;
import T4.f;
import Y4.D;
import Y4.E;
import Z4.j;
import Z4.l;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0280l;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.C0288u;
import androidx.fragment.app.F;
import androidx.fragment.app.I;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.z;
import b4.m;
import b5.n;
import c.C0326a;
import c.C0327b;
import com.google.android.gms.common.internal.C0376e;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.activities.r;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0423c;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.fragments.gangBase.o;
import com.mtma.criminal.city.fragments.gangBase.s;
import com.mtma.criminal.city.fragments.gangBase.v;
import com.mtma.criminal.city.utils.C0453x;
import com.mtma.criminal.city.utils.C0454y;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.v0;
import d5.k;
import e4.C0503c;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import j4.C0626h;
import j4.C0641q;
import j4.M0;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import r3.b;

public final class A implements q, T, r0, J, z, C0327b, c, t, m, C0376e, C0453x, C0454y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2795a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2796b;

    public /* synthetic */ A(Object obj, int i2) {
        this.f2795a = i2;
        this.f2796b = obj;
    }

    public static String k(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    private final void r(C0587c cVar) {
        C0586b c3 = cVar.c();
        while (true) {
            Iterator it2 = c3.f8276a;
            boolean hasNext = it2.hasNext();
            U4.c cVar2 = (U4.c) this.f2796b;
            if (hasNext) {
                v3.q qVar = (v3.q) it2.next();
                C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                C0586b c6 = new C0587c(E6, v3.m.t(qVar.f12305b)).c();
                while (true) {
                    Iterator it3 = c6.f8276a;
                    if (it3.hasNext()) {
                        v3.q qVar2 = (v3.q) it3.next();
                        c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                        try {
                            n nVar = (n) b.c(n.class, v3.m.t(qVar2.f12305b).f12296a.getValue());
                            if (!nVar.isLocked()) {
                                if (nVar.getType() == 7) {
                                    if (nVar.getId() >= 2026) {
                                        if (nVar.getId() > 2029) {
                                        }
                                    }
                                }
                                if (nVar.isUsedInArming()) {
                                    nVar.setCount(nVar.getCount() - 1);
                                }
                                if (nVar.getCount() > 0) {
                                    if (E6.F().equals(e.y(14))) {
                                        cVar2.s0.add(0, D.v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(0))) {
                                        cVar2.f3750t0.add(0, D.j(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(1))) {
                                        cVar2.f3751u0.add(0, D.b(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(10))) {
                                        cVar2.f3752v0.add(D.k(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(11))) {
                                        cVar2.f3753w0.add(D.d(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(3))) {
                                        cVar2.f3754x0.add(D.l(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(9))) {
                                        cVar2.f3755y0.add(D.q(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(2))) {
                                        cVar2.f3756z0.add(D.i(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(8))) {
                                        cVar2.f3724A0.add(D.w(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(4))) {
                                        cVar2.f3725B0.add(D.g(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(5))) {
                                        cVar2.f3726C0.add(D.h(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(18))) {
                                        cVar2.f3727D0.add(0, D.n(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(12))) {
                                        cVar2.f3728E0.add(D.t(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(7))) {
                                        cVar2.f3730G0.add(D.o(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(13))) {
                                        cVar2.f3729F0.add(D.u(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(15))) {
                                        cVar2.f3731H0.add(0, D.p(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(16))) {
                                        cVar2.f3732I0.add(0, D.c(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(17))) {
                                        cVar2.f3733J0.add(0, D.m(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (E6.F().equals(e.y(6))) {
                                        cVar2.f3734K0.add(D.e(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            a.q("Exception from try-catch block inside ", "c", " in displayStockItems method.", e6, "c");
                        }
                    }
                }
            } else {
                Context context = cVar2.f3735d0;
                ArrayList arrayList = cVar2.f3749r0;
                M0 m02 = new M0(context, (List) arrayList, 3, cVar2.f3736e0);
                cVar2.f3747p0 = m02;
                cVar2.f3740i0.setAdapter(m02);
                arrayList.clear();
                arrayList.addAll(cVar2.s0);
                arrayList.addAll(cVar2.f3750t0);
                arrayList.addAll(cVar2.f3751u0);
                arrayList.addAll(cVar2.f3731H0);
                arrayList.addAll(cVar2.f3732I0);
                arrayList.addAll(cVar2.f3752v0);
                arrayList.addAll(cVar2.f3753w0);
                arrayList.addAll(cVar2.f3754x0);
                arrayList.addAll(cVar2.f3755y0);
                arrayList.addAll(cVar2.f3756z0);
                arrayList.addAll(cVar2.f3724A0);
                arrayList.addAll(cVar2.f3725B0);
                arrayList.addAll(cVar2.f3726C0);
                arrayList.addAll(cVar2.f3727D0);
                arrayList.addAll(cVar2.f3728E0);
                arrayList.addAll(cVar2.f3729F0);
                arrayList.addAll(cVar2.f3730G0);
                arrayList.addAll(cVar2.f3733J0);
                arrayList.addAll(cVar2.f3734K0);
                cVar2.f3747p0.notifyDataSetChanged();
                R2.b.w(false);
                cVar2.f3740i0.setEmptyView(cVar2.f3739h0);
                return;
            }
        }
    }

    public static A s(String str) {
        G0 g02;
        if (TextUtils.isEmpty(str) || str.length() > 1) {
            g02 = G0.UNINITIALIZED;
        } else {
            g02 = J0.c(str.charAt(0));
        }
        return new A((Object) g02, 0);
    }

    public void B(C0588d dVar) {
        switch (this.f2795a) {
            case 5:
                f fVar = (f) this.f2796b;
                com.bumptech.glide.c.s0(fVar.f3616d0, (String) null, (String) null);
                R2.b.w(false);
                fVar.f3621i0.setEmptyView(fVar.f3620h0);
                return;
            case zzaky.zzf.zzf /*6*/:
                U4.c cVar = (U4.c) this.f2796b;
                com.bumptech.glide.c.s0(cVar.f3735d0, (String) null, (String) null);
                R2.b.w(false);
                cVar.f3740i0.setEmptyView(cVar.f3739h0);
                return;
            case 9:
                X4.a aVar = (X4.a) this.f2796b;
                X4.c cVar2 = aVar.f4190b;
                cVar2.f4205o0 = false;
                cVar2.f4203m0.setVisibility(8);
                com.bumptech.glide.c.s0(aVar.f4190b.f4194d0, (String) null, (String) null);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                g gVar = (g) this.f2796b;
                X4.c cVar3 = (X4.c) gVar.f1032c;
                cVar3.f4205o0 = false;
                cVar3.f4203m0.setVisibility(8);
                com.bumptech.glide.c.s0(((X4.c) gVar.f1032c).f4194d0, (String) null, (String) null);
                return;
            default:
                return;
        }
    }

    public void a(l lVar) {
        o oVar = (o) this.f2796b;
        oVar.f7241p0.setProgress(0);
        oVar.f7235j0.setText(R.string.zero);
        oVar.f7238m0.setText("");
        oVar.f7238m0.clearFocus();
        boolean z3 = lVar.isAllProcessSuccess;
        Context context = oVar.f7229d0;
        if (z3) {
            Long valueOf = Long.valueOf(lVar.gangMoneyAfterChange);
            oVar.f7247w0 = valueOf;
            oVar.f7233h0.setText(U.a(valueOf.longValue()));
            Iterator it2 = oVar.p().f5000c.v().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0286s sVar = (C0286s) it2.next();
                if (sVar instanceof C0429i) {
                    C0429i iVar = (C0429i) sVar;
                    long longValue = oVar.f7247w0.longValue();
                    iVar.f7186C0.setGold(longValue);
                    ((TextView) iVar.f7203m0.getRootView().findViewWithTag("gold_view_tag")).setText(U.a(longValue));
                    break;
                }
            }
            R2.b.w(false);
            R2.b.M0(R.raw.money_get);
            a.k(MyApplication.f7090a, R.string.toast_successfully, context);
            return;
        }
        R2.b.w(false);
        if (!lVar.isPlayerMoneyChanged) {
            com.bumptech.glide.c.y0(context);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, context, (String) null);
        }
    }

    public boolean b(View view) {
        int i2;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f2796b;
        boolean z3 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = O.f1352a;
        if (view.getLayoutDirection() == 1) {
            z3 = true;
        }
        int i5 = swipeDismissBehavior.d;
        if ((i5 != 0 || !z3) && (i5 != 1 || z3)) {
            i2 = view.getWidth();
        } else {
            i2 = -view.getWidth();
        }
        view.offsetLeftAndRight(i2);
        view.setAlpha(0.0f);
        return true;
    }

    public void c(boolean z3) {
        h hVar = (h) this.f2796b;
        if (z3) {
            W4.g gVar = (W4.g) hVar.f1180c;
            View view = (View) hVar.f1179b;
            gVar.f4113m0 = false;
            TextView textView = (TextView) view.findViewById(R.id.item_work_office_details_timer);
            ((ImageView) view.findViewById(R.id.item_work_office_details_button_image)).setImageResource(R.drawable.button_gray);
            textView.setVisibility(0);
            W4.g.Z(textView);
            gVar.a0(gVar.s(R.string.get_salary_message, U.a((long) ((e.S(20) + 1.0d) * ((double) ((E) gVar.f4114n0.get(gVar.f4111k0)).f4319e)))), -1, false);
            R2.b.M0(R.raw.money_get);
            Q.b(9, d5.o.getAccountObject().getId(), (long) 1);
            R2.b.w(false);
            return;
        }
        R2.b.w(false);
        a.n(MyApplication.f7090a, R.string.can_not_get_salary_twice, ((W4.g) hVar.f1180c).f4104d0, (String) null);
    }

    public void d() {
        ((androidx.fragment.app.U) this.f2796b).a();
    }

    public void e(Object obj) {
        C0326a aVar = (C0326a) obj;
        I i2 = (I) this.f2796b;
        F f6 = (F) i2.f4988C.pollFirst();
        if (f6 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        S3.z zVar = i2.f5000c;
        String str = f6.f4978a;
        C0286s r6 = zVar.r(str);
        if (r6 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        r6.z(f6.f4979b, aVar.f5560a, aVar.f5561b);
    }

    public void f(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        v vVar = (v) this.f2796b;
        if (z3) {
            R2.b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, vVar.f7285d0, R.raw.add_new_item);
            return;
        }
        R2.b.w(false);
        if (!z4) {
            a.n(MyApplication.f7090a, R.string.level_lower_requirements, vVar.f7285d0, (String) null);
        } else if (z5) {
            a.n(MyApplication.f7090a, R.string.already_in_gang, vVar.f7285d0, (String) null);
        } else if (!z6) {
            a.n(MyApplication.f7090a, R.string.dialog_wait_two_hours_before_creating_new_gang, vVar.f7285d0, (String) null);
        } else if (z7) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_join_request_sent_before, vVar.f7285d0, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, vVar.f7285d0, (String) null);
        }
    }

    public void g(Object obj) {
        if (((C0307s) obj) != null) {
            C0280l lVar = (C0280l) this.f2796b;
            if (lVar.f5122i0) {
                View R5 = lVar.R();
                if (R5.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (lVar.f5126m0 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + lVar.f5126m0);
                    }
                    lVar.f5126m0.setContentView(R5);
                }
            }
        }
    }

    public void h(boolean z3, k kVar) {
        Object obj = this.f2796b;
        switch (this.f2795a) {
            case 12:
                u uVar = (u) obj;
                ((X4.h) ((d) ((K4.h) ((S3.t) uVar.f1612c).f2700b).f1523c).f1024b).f4230p0.setVisibility(8);
                StartActivity startActivity = (StartActivity) ((X4.h) ((d) ((K4.h) ((S3.t) uVar.f1612c).f2700b).f1523c).f1024b).l();
                if (startActivity != null) {
                    startActivity.r();
                }
                try {
                    com.bumptech.glide.d.W0(d5.o.getAccountObject().getId(), MyApplication.f7090a.getApplicationContext().getString(R.string.welcome_message_for_beta_version));
                    return;
                } catch (Exception e6) {
                    a.q("Exception from try-catch block inside ", "h", " in addListenerToAppInfo method.", e6, "h");
                    return;
                }
            default:
                ((r) obj).f7077a.f7039T = true;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, J2.o] */
    public J2.o i() {
        ? obj = new Object();
        obj.f1317a = H.e("");
        obj.f1318b = H.e("");
        obj.f1319c = H.e("");
        obj.d = H.e("");
        obj.f1320e = H.e("");
        obj.f1321f = H.e(Collections.emptyMap());
        J2.o oVar = (J2.o) this.f2796b;
        com.google.android.gms.common.internal.I.g(oVar);
        obj.f1317a = (H) oVar.f1317a;
        obj.f1318b = (H) oVar.f1318b;
        obj.f1319c = (H) oVar.f1319c;
        obj.d = (H) oVar.d;
        obj.f1320e = (H) oVar.f1320e;
        obj.f1321f = (H) oVar.f1321f;
        return obj;
    }

    public void j(long j6) {
        a.c(C0592h.b().e(), "serverData").d(new com.mtma.criminal.city.fragments.gangBase.I(new u((Object) this, j6, 4), 2));
    }

    public void l() {
        ((C0288u) this.f2796b).f5195s.K();
    }

    public Object n() {
        Object obj = this.f2796b;
        switch (this.f2795a) {
            case 18:
                Type type = (Type) obj;
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return new EnumMap((Class) type2);
                    }
                    throw new RuntimeException("Invalid EnumMap type: " + type.toString());
                }
                throw new RuntimeException("Invalid EnumMap type: " + type.toString());
            default:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance((Object[]) null);
                } catch (InstantiationException e6) {
                    throw new RuntimeException("Failed to invoke constructor '" + C0503c.b(constructor) + "' with no args", e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to invoke constructor '" + C0503c.b(constructor) + "' with no args", e7.getCause());
                } catch (IllegalAccessException e8) {
                    com.bumptech.glide.c cVar = C0503c.f7669a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e8);
                }
        }
    }

    public void q(j jVar) {
        boolean z3 = jVar.isAllProcessSuccess;
        C0423c cVar = (C0423c) this.f2796b;
        if (!z3) {
            R2.b.w(false);
            if (!jVar.isGangDataValid) {
                if (jVar.isGangNameTooShort) {
                    com.bumptech.glide.c.s0(cVar.f7162d0, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_less_than_number_of_letters, new Object[]{4}), (String) null);
                } else if (jVar.isGangNameTooLong) {
                    com.bumptech.glide.c.s0(cVar.f7162d0, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_more_than_number_of_letters, new Object[]{15}), (String) null);
                } else if (!jVar.isGangTagEqualToThreeLetters) {
                    a.n(MyApplication.f7090a, R.string.gang_tag_must_be_three_letters, cVar.f7162d0, (String) null);
                }
            } else if (!jVar.isPlayerHasRequirements) {
                if (!jVar.hasRequiredLevel) {
                    a.n(MyApplication.f7090a, R.string.level_lower_requirements, cVar.f7162d0, (String) null);
                } else if (jVar.isCurrentlyInGang) {
                    a.n(MyApplication.f7090a, R.string.already_in_gang, cVar.f7162d0, (String) null);
                } else if (!jVar.isTimeAllowToJoinNewGang) {
                    a.n(MyApplication.f7090a, R.string.dialog_wait_two_hours_before_creating_new_gang, cVar.f7162d0, (String) null);
                }
            } else if (jVar.isGangDataAlreadyExist) {
                if (jVar.isNameAlreadyExist) {
                    a.n(MyApplication.f7090a, R.string.gang_name_already_exist, cVar.f7162d0, (String) null);
                } else if (jVar.isTagAlreadyExist) {
                    a.n(MyApplication.f7090a, R.string.gang_tag_already_exist, cVar.f7162d0, (String) null);
                }
            } else if (!jVar.isCashChanged) {
                com.bumptech.glide.c.x0(cVar.f7162d0);
            } else {
                a.n(MyApplication.f7090a, R.string.unknown_error, cVar.f7162d0, (String) null);
            }
        } else if (cVar.f7171m0 == null) {
            R2.b.w(false);
            v0.e(cVar.f7162d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
            R2.b.M0(R.raw.add_new_item);
            d5.o.setGangObject(jVar.gangObject);
            C0423c.V(cVar);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            cVar.f7171m0.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            com.google.firebase.storage.f a6 = com.google.firebase.storage.c.a().c().a(R2.b.Z()).a("gangs").a(jVar.gangObject.getId()).a("gangsPic");
            com.google.firebase.storage.f a7 = a6.a(jVar.gangObject.getId() + ".jpg");
            a7.k(byteArray).a((Executor) null, new X4.d(this, a7, 11)).addOnCompleteListener(new K4.h(this, jVar, 4));
        }
    }

    public void t() {
        E1 e12 = (E1) this.f2796b;
        e12.o();
        C0212u0 u0Var = (C0212u0) e12.f398a;
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        G1.b bVar = u0Var.f3501w;
        bVar.getClass();
        if (h0Var.x(System.currentTimeMillis())) {
            C0174h0 h0Var2 = u0Var.f3495q;
            C0212u0.i(h0Var2);
            h0Var2.f3328v.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3180w.a("Detected application was in foreground");
                bVar.getClass();
                x(System.currentTimeMillis());
            }
        }
    }

    public void u(C0587c cVar) {
        char c3;
        boolean z3;
        C0587c cVar2 = cVar;
        Class<Integer> cls = Integer.class;
        char c6 = 4;
        Object obj = this.f2796b;
        switch (this.f2795a) {
            case 5:
                C0586b c7 = cVar.c();
                while (true) {
                    Iterator it2 = c7.f8276a;
                    f fVar = (f) obj;
                    if (it2.hasNext()) {
                        v3.q qVar = (v3.q) it2.next();
                        C0590f E6 = c7.f8277b.f8279b.E(qVar.f12304a.f12280a);
                        C0586b c8 = new C0587c(E6, v3.m.t(qVar.f12305b)).c();
                        while (true) {
                            Iterator it3 = c8.f8276a;
                            if (it3.hasNext()) {
                                v3.q qVar2 = (v3.q) it3.next();
                                c8.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                                try {
                                    n nVar = (n) b.c(n.class, v3.m.t(qVar2.f12305b).f12296a.getValue());
                                    nVar.setCount(nVar.getCount() + nVar.getCountInBag());
                                    if (nVar.isUsedInMuseum()) {
                                        if (nVar.getMuseumPositions().size() != nVar.getCount()) {
                                            nVar.setCount(nVar.getCount() - nVar.getMuseumPositions().size());
                                        }
                                    }
                                    if (E6.F().equals(e.y(14))) {
                                        try {
                                            D v6 = D.v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked());
                                            v6.f4305p = nVar.isUsedInMuseum();
                                            v6.f4299j = nVar.getMuseumPositions();
                                            fVar.f3631t0.add(0, v6);
                                        } catch (Exception e6) {
                                            e = e6;
                                            c3 = 4;
                                            a.q("Exception from try-catch block inside ", "f", " in displayStockItems method.", e, "f");
                                            c6 = c3;
                                        }
                                    } else if (E6.F().equals(e.y(0))) {
                                        D j6 = D.j(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        j6.f4305p = nVar.isUsedInMuseum();
                                        j6.f4299j = nVar.getMuseumPositions();
                                        fVar.f3632u0.add(0, j6);
                                    } else if (E6.F().equals(e.y(1))) {
                                        D b6 = D.b(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        b6.f4305p = nVar.isUsedInMuseum();
                                        b6.f4299j = nVar.getMuseumPositions();
                                        fVar.f3633v0.add(0, b6);
                                    } else if (E6.F().equals(e.y(10))) {
                                        D k6 = D.k(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        k6.f4305p = nVar.isUsedInMuseum();
                                        k6.f4299j = nVar.getMuseumPositions();
                                        fVar.f3634w0.add(k6);
                                    } else if (E6.F().equals(e.y(11))) {
                                        D d = D.d(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        d.f4305p = nVar.isUsedInMuseum();
                                        d.f4299j = nVar.getMuseumPositions();
                                        fVar.f3635x0.add(d);
                                    } else if (E6.F().equals(e.y(3))) {
                                        D l6 = D.l(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        l6.f4305p = nVar.isUsedInMuseum();
                                        l6.f4299j = nVar.getMuseumPositions();
                                        fVar.f3636y0.add(l6);
                                    } else if (E6.F().equals(e.y(9))) {
                                        D q6 = D.q(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        q6.f4305p = nVar.isUsedInMuseum();
                                        q6.f4299j = nVar.getMuseumPositions();
                                        fVar.f3637z0.add(q6);
                                    } else if (E6.F().equals(e.y(2))) {
                                        D i2 = D.i(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        i2.f4305p = nVar.isUsedInMuseum();
                                        i2.f4299j = nVar.getMuseumPositions();
                                        fVar.f3605A0.add(i2);
                                    } else if (E6.F().equals(e.y(8))) {
                                        D w6 = D.w(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                        w6.f4305p = nVar.isUsedInMuseum();
                                        w6.f4299j = nVar.getMuseumPositions();
                                        fVar.f3606B0.add(w6);
                                    } else {
                                        c3 = 4;
                                        try {
                                            if (E6.F().equals(e.y(4))) {
                                                D g = D.g(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                g.f4305p = nVar.isUsedInMuseum();
                                                g.f4299j = nVar.getMuseumPositions();
                                                fVar.f3607C0.add(g);
                                            } else if (E6.F().equals(e.y(5))) {
                                                D h = D.h(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                h.f4305p = nVar.isUsedInMuseum();
                                                h.f4299j = nVar.getMuseumPositions();
                                                fVar.f3608D0.add(h);
                                            } else if (E6.F().equals(e.y(18))) {
                                                D n2 = D.n(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                n2.f4305p = nVar.isUsedInMuseum();
                                                n2.f4299j = nVar.getMuseumPositions();
                                                fVar.f3609E0.add(0, n2);
                                            } else if (E6.F().equals(e.y(12))) {
                                                D t6 = D.t(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                t6.f4305p = nVar.isUsedInMuseum();
                                                t6.f4299j = nVar.getMuseumPositions();
                                                fVar.f3610F0.add(t6);
                                            } else if (E6.F().equals(e.y(7))) {
                                                D o6 = D.o(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                o6.f4305p = nVar.isUsedInMuseum();
                                                o6.f4299j = nVar.getMuseumPositions();
                                                fVar.f3612H0.add(o6);
                                            } else if (E6.F().equals(e.y(13))) {
                                                D u6 = D.u(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                u6.f4305p = nVar.isUsedInMuseum();
                                                u6.f4299j = nVar.getMuseumPositions();
                                                fVar.f3611G0.add(u6);
                                            } else if (E6.F().equals(e.y(15))) {
                                                D p6 = D.p(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                p6.f4305p = nVar.isUsedInMuseum();
                                                p6.f4299j = nVar.getMuseumPositions();
                                                fVar.f3613I0.add(0, p6);
                                            } else if (E6.F().equals(e.y(16))) {
                                                D c9 = D.c(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                c9.f4305p = nVar.isUsedInMuseum();
                                                c9.f4299j = nVar.getMuseumPositions();
                                                fVar.f3614J0.add(0, c9);
                                            } else if (E6.F().equals(e.y(17))) {
                                                D m6 = D.m(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                m6.f4305p = nVar.isUsedInMuseum();
                                                m6.f4299j = nVar.getMuseumPositions();
                                                fVar.f3615K0.add(0, m6);
                                            } else if (E6.F().equals(e.y(6))) {
                                                D e7 = D.e(nVar.getId(), nVar.getCount(), nVar.isLocked());
                                                e7.f4305p = nVar.isUsedInMuseum();
                                                e7.f4299j = nVar.getMuseumPositions();
                                                fVar.L0.add(e7);
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            a.q("Exception from try-catch block inside ", "f", " in displayStockItems method.", e, "f");
                                            c6 = c3;
                                        }
                                        c6 = c3;
                                    }
                                    c3 = 4;
                                } catch (Exception e9) {
                                    e = e9;
                                    c3 = c6;
                                    a.q("Exception from try-catch block inside ", "f", " in displayStockItems method.", e, "f");
                                    c6 = c3;
                                }
                                c6 = c3;
                            }
                        }
                    } else {
                        fVar.f3630r0 = 1;
                        ArrayList arrayList = fVar.s0;
                        M0 m02 = new M0(fVar.f3616d0, (List) arrayList, fVar.f3630r0, fVar.f3617e0);
                        fVar.f3628p0 = m02;
                        fVar.f3621i0.setAdapter(m02);
                        arrayList.clear();
                        arrayList.addAll(fVar.f3631t0);
                        arrayList.addAll(fVar.f3632u0);
                        arrayList.addAll(fVar.f3633v0);
                        arrayList.addAll(fVar.f3613I0);
                        arrayList.addAll(fVar.f3614J0);
                        arrayList.addAll(fVar.f3634w0);
                        arrayList.addAll(fVar.f3635x0);
                        arrayList.addAll(fVar.f3636y0);
                        arrayList.addAll(fVar.f3637z0);
                        arrayList.addAll(fVar.f3605A0);
                        arrayList.addAll(fVar.f3606B0);
                        arrayList.addAll(fVar.f3607C0);
                        arrayList.addAll(fVar.f3608D0);
                        arrayList.addAll(fVar.f3609E0);
                        arrayList.addAll(fVar.f3610F0);
                        arrayList.addAll(fVar.f3611G0);
                        arrayList.addAll(fVar.f3612H0);
                        arrayList.addAll(fVar.f3615K0);
                        arrayList.addAll(fVar.L0);
                        fVar.f3628p0.notifyDataSetChanged();
                        R2.b.w(false);
                        fVar.f3621i0.setEmptyView(fVar.f3620h0);
                        return;
                    }
                }
            case zzaky.zzf.zzf /*6*/:
                r(cVar);
                return;
            case 9:
                X4.a aVar = (X4.a) obj;
                if (cVar.g()) {
                    X4.c cVar3 = aVar.f4190b;
                    cVar3.f4205o0 = false;
                    cVar3.f4203m0.setVisibility(8);
                    X4.c cVar4 = aVar.f4190b;
                    cVar4.f4200j0.setError(cVar4.r(R.string.wrong_password));
                    cVar4.f4200j0.requestFocus();
                    return;
                }
                X4.c cVar5 = aVar.f4190b;
                cVar5.f4205o0 = false;
                cVar5.f4203m0.setVisibility(8);
                X4.c cVar6 = aVar.f4190b;
                cVar6.f4199i0.setError(cVar6.r(R.string.email_not_exist));
                cVar6.f4199i0.requestFocus();
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                try {
                    z3 = ((Boolean) cVar2.a("disabled").f(Boolean.class)).booleanValue();
                } catch (Exception e10) {
                    a.q("Exception from try-catch block ", "c", " when get current server number (ignore it, default value added by sharedPreference).", e10, "c");
                    z3 = false;
                }
                g gVar = (g) obj;
                if (z3) {
                    ((X4.c) gVar.f1032c).f4203m0.setVisibility(8);
                    com.bumptech.glide.c.t0(((X4.c) gVar.f1032c).f4194d0);
                    return;
                }
                int v02 = com.bumptech.glide.d.v0(1, "server_number");
                try {
                    v02 = ((Integer) cVar2.a("currentOpenedServer").f(cls)).intValue();
                } catch (Exception e11) {
                    a.q("Exception from try-catch block ", "c", " when get current server number (ignore it, default value is server 0 or 1 depend on debug or release mode).", e11, "c");
                }
                String valueOf = String.valueOf(v02);
                String str = (String) cVar2.a("serverIds").a(valueOf).f(String.class);
                if (str != null) {
                    C0592h.b().e().E("Servers").E(valueOf).E("players").E(str).E("accountObject").E("deviceId").I(e.u()).addOnSuccessListener(new H4.f(this, valueOf, str, 2));
                    return;
                }
                X4.c cVar7 = (X4.c) gVar.f1032c;
                cVar7.f4205o0 = false;
                cVar7.f4203m0.setVisibility(8);
                com.bumptech.glide.c.s0(((X4.c) gVar.f1032c).f4194d0, (String) null, (String) null);
                return;
            case 26:
                s sVar = (s) obj;
                if (cVar.g()) {
                    C0586b c10 = cVar.c();
                    while (true) {
                        Iterator it4 = c10.f8276a;
                        if (it4.hasNext()) {
                            v3.q qVar3 = (v3.q) it4.next();
                            c10.f8277b.f8279b.E(qVar3.f12304a.f12280a);
                            sVar.f7269j0.add(0, (b5.k) b.c(b5.k.class, v3.m.t(qVar3.f12305b).f12296a.getValue()));
                        } else {
                            sVar.f7266g0.setAdapter(new C0641q(sVar.f7263d0, sVar.f7269j0, 1, 4));
                        }
                    }
                }
                sVar.f7266g0.setEmptyView(sVar.f7267h0);
                R2.b.w(false);
                return;
            case 28:
                com.mtma.criminal.city.fragments.gangBase.A a6 = (com.mtma.criminal.city.fragments.gangBase.A) obj;
                if (cVar.g()) {
                    C0586b c11 = cVar.c();
                    boolean z4 = false;
                    while (true) {
                        Iterator it5 = c11.f8276a;
                        if (it5.hasNext()) {
                            v3.q qVar4 = (v3.q) it5.next();
                            C0590f E7 = c11.f8277b.f8279b.E(qVar4.f12304a.f12280a);
                            v3.m t7 = v3.m.t(qVar4.f12305b);
                            if (!z4) {
                                a6.f7100k0 = E7.F();
                                z4 = true;
                            }
                            a6.f7098i0.add(0, (b5.f) b.c(b5.f.class, t7.f12296a.getValue()));
                        } else {
                            Context context = a6.f7093d0;
                            ArrayList arrayList2 = a6.f7098i0;
                            C0626h hVar = new C0626h(context, arrayList2, 1);
                            a6.f7099j0 = hVar;
                            a6.f7096g0.setAdapter(hVar);
                            if (arrayList2.size() == 8) {
                                a6.f7101l0 = true;
                            }
                        }
                    }
                } else {
                    a6.f7101l0 = false;
                }
                a.o(MyApplication.f7090a, R.string.empty_gangs, a6.f7097h0);
                a6.f7096g0.setEmptyView(a6.f7097h0);
                R2.b.w(false);
                return;
            default:
                if (cVar.g()) {
                    ArrayList arrayList3 = new ArrayList();
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    C0586b c12 = cVar.c();
                    while (true) {
                        Iterator it6 = c12.f8276a;
                        if (it6.hasNext()) {
                            v3.q qVar5 = (v3.q) it6.next();
                            C0590f E8 = c12.f8277b.f8279b.E(qVar5.f12304a.f12280a);
                            v3.m t8 = v3.m.t(qVar5.f12305b);
                            String F = E8.F();
                            hashMap.put(F, (Integer) b.c(cls, t8.f12296a.getValue()));
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            o3.d.c(C0592h.b().e(), "players", F, "mainStatesObject").d(new com.mtma.criminal.city.fragments.gangBase.E(hashMap2, F, taskCompletionSource, 3));
                            arrayList3.add(taskCompletionSource.getTask());
                            o3.d.c(C0592h.b().e(), "players", F, "gangObject").d(new com.mtma.criminal.city.fragments.gangBase.E(hashMap3, F, taskCompletionSource2, 4));
                            arrayList3.add(taskCompletionSource2.getTask());
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList3).addOnCompleteListener(new E4.b(this, hashMap, hashMap2, hashMap3, 3));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }

    public void v(String str, String str2, Bundle bundle) {
        switch (this.f2795a) {
            case 2:
                boolean isEmpty = TextUtils.isEmpty(str);
                C0157b1 b1Var = (C0157b1) this.f2796b;
                if (isEmpty) {
                    ((C0212u0) b1Var.f398a).f3501w.getClass();
                    b1Var.y("auto", "_err", bundle, true, true, System.currentTimeMillis());
                    return;
                }
                b1Var.getClass();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                boolean isEmpty2 = TextUtils.isEmpty(str);
                T1 t12 = (T1) this.f2796b;
                if (isEmpty2) {
                    C0212u0 u0Var = t12.f3070u;
                    if (u0Var != null) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3172f.b(str2, "AppId not known when logging event");
                        return;
                    }
                    return;
                }
                t12.f().y(new C0221x0(this, str, str2, bundle));
                return;
        }
    }

    public void w(long j6, boolean z3) {
        E1 e12 = (E1) this.f2796b;
        e12.o();
        e12.s();
        C0212u0 u0Var = (C0212u0) e12.f398a;
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        boolean x6 = h0Var.x(j6);
        C0174h0 h0Var2 = u0Var.f3495q;
        if (x6) {
            C0212u0.i(h0Var2);
            h0Var2.f3328v.a(true);
            u0Var.n().w();
        }
        C0212u0.i(h0Var2);
        h0Var2.f3332z.b(j6);
        if (h0Var2.f3328v.b()) {
            x(j6);
        }
    }

    public void x(long j6) {
        E1 e12 = (E1) this.f2796b;
        e12.o();
        C0212u0 u0Var = (C0212u0) e12.f398a;
        if (u0Var.a()) {
            C0174h0 h0Var = u0Var.f3495q;
            C0212u0.i(h0Var);
            h0Var.f3332z.b(j6);
            u0Var.f3501w.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3180w.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j7 = j6 / 1000;
            Long valueOf = Long.valueOf(j7);
            C0157b1 b1Var = u0Var.f3503y;
            C0212u0.j(b1Var);
            b1Var.J(j6, valueOf, "auto", "_sid");
            C0212u0.i(h0Var);
            h0Var.f3311A.b(j7);
            h0Var.f3328v.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j7);
            C0212u0.j(b1Var);
            b1Var.A("auto", "_s", bundle, j6);
            String C6 = h0Var.F.C();
            if (!TextUtils.isEmpty(C6)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", C6);
                C0212u0.j(b1Var);
                b1Var.A("auto", "_ssr", bundle2, j6);
            }
        }
    }

    public A(B0.A a6) {
        this.f2795a = 20;
        this.f2796b = Collections.unmodifiableMap(new HashMap(a6.f175a));
    }

    public A(TextView textView) {
        this.f2795a = 7;
        this.f2796b = new W.g(textView);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, J2.o] */
    public A(JSONObject jSONObject, com.google.firebase.storage.f fVar) {
        this.f2795a = 22;
        ? obj = new Object();
        obj.f1317a = H.e("");
        obj.f1318b = H.e("");
        obj.f1319c = H.e("");
        obj.d = H.e("");
        obj.f1320e = H.e("");
        obj.f1321f = H.e(Collections.emptyMap());
        this.f2796b = obj;
        jSONObject.optString("generation");
        jSONObject.optString("name");
        jSONObject.optString("bucket");
        jSONObject.optString("metageneration");
        jSONObject.optString("timeCreated");
        jSONObject.optString("updated");
        jSONObject.optLong("size");
        jSONObject.optString("md5Hash");
        if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject2.getString(next);
                if (!((H) obj.f1321f).f200b) {
                    obj.f1321f = H.f(new HashMap());
                }
                ((Map) ((H) obj.f1321f).f201c).put(next, string);
            }
        }
        String k6 = k(jSONObject, "contentType");
        if (k6 != null) {
            obj.f1317a = H.f(k6);
        }
        String k7 = k(jSONObject, "cacheControl");
        if (k7 != null) {
            obj.f1318b = H.f(k7);
        }
        String k8 = k(jSONObject, "contentDisposition");
        if (k8 != null) {
            obj.f1319c = H.f(k8);
        }
        String k9 = k(jSONObject, "contentEncoding");
        if (k9 != null) {
            obj.d = H.f(k9);
        }
        String k10 = k(jSONObject, "contentLanguage");
        if (k10 != null) {
            obj.f1320e = H.f(k10);
        }
        ((J2.o) this.f2796b).getClass();
    }

    private final void m(C0588d dVar) {
    }

    private final void o(C0588d dVar) {
    }

    private final void p(C0588d dVar) {
    }
}
