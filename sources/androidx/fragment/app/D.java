package androidx.fragment.app;

import R2.b;
import Y1.a;
import Z0.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import b4.m;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.manager.f;
import com.bumptech.glide.manager.g;
import com.bumptech.glide.manager.l;
import com.google.android.gms.common.api.internal.C0368w;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.play_billing.zzlk;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.r0;
import d5.i;
import d5.o;
import e1.C0483b;
import h0.C0552a;
import i1.C0583b;
import i1.C0584c;
import i3.C0585a;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;
import j.v;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import k0.C0754c;
import l1.C0780a;
import n3.C0857B;
import org.json.JSONObject;
import q3.h;
import s2.C0962a;
import s2.k;

public final class D implements m, g, f, l, C0368w, C0585a, r0, C0483b, v, C0754c, C0780a, q, h, e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4976a;

    public /* synthetic */ D(int i2) {
        this.f4976a = i2;
    }

    public static D h(Context context, int i2) {
        boolean z3;
        if (i2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        c.b("Cannot create a CalendarItemStyle with a styleResId of 0", z3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, a.f4256m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        d.a0(context, obtainStyledAttributes, 4);
        d.a0(context, obtainStyledAttributes, 9);
        d.a0(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0962a((float) 0)).a();
        obtainStyledAttributes.recycle();
        D d = new D(11);
        c.c(rect.left);
        c.c(rect.top);
        c.c(rect.right);
        c.c(rect.bottom);
        return d;
    }

    public Object apply(Object obj) {
        return ((zzlk) obj).zzh();
    }

    public void b(com.bumptech.glide.manager.h hVar) {
        hVar.j();
    }

    public void d(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case zzaky.zzf.zzf /*6*/:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case zzaky.zzf.zzg /*7*/:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public boolean f(Object obj) {
        switch (this.f4976a) {
            case 23:
                return ((C0857B) obj).f10242e;
            default:
                return true;
        }
    }

    public long g() {
        return System.currentTimeMillis();
    }

    public Object get() {
        D d = new D(21);
        HashMap hashMap = new HashMap();
        Z0.d dVar = Z0.d.f4466a;
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            hashMap.put(dVar, new C0584c(30000, 86400000, emptySet));
            Z0.d dVar2 = Z0.d.f4468c;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                hashMap.put(dVar2, new C0584c(1000, 86400000, emptySet2));
                Z0.d dVar3 = Z0.d.f4467b;
                if (Collections.emptySet() != null) {
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new i1.e[]{i1.e.f8256b})));
                    if (unmodifiableSet != null) {
                        hashMap.put(dVar3, new C0584c(86400000, 86400000, unmodifiableSet));
                        if (hashMap.keySet().size() >= Z0.d.values().length) {
                            new HashMap();
                            return new C0583b(d, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    public void i(C0587c cVar) {
        try {
            android.support.v4.media.session.a.A0(cVar.f8279b.F(), (C0587c) null);
        } catch (Exception e6) {
            int i2 = MainActivity.L0;
            C0552a.x(e6, "Exception from try-catch block inside inside the onChildRemoved method inside MainActivity in addListenerToStock method.", "MainActivity");
        }
    }

    public void j(long j6) {
        ArrayList<Integer> herbTypesList = o.getHerbObject().getHerbTypesList();
        ArrayList<Integer> herbIdsList = o.getHerbObject().getHerbIdsList();
        ArrayList<Long> herbUsingStartTimeList = o.getHerbObject().getHerbUsingStartTimeList();
        int i2 = 0;
        while (i2 < herbIdsList.size()) {
            if (j6 >= b.T(herbIdsList.get(i2).intValue()) + herbUsingStartTimeList.get(i2).longValue()) {
                herbTypesList.remove(i2);
                herbIdsList.remove(i2);
                herbUsingStartTimeList.remove(i2);
                com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("herbObject").I(new i(herbTypesList, herbIdsList, herbUsingStartTimeList));
                i2--;
            }
            i2++;
        }
    }

    public void k(C0587c cVar) {
        try {
            android.support.v4.media.session.a.A0(cVar.f8279b.F(), cVar);
        } catch (Exception e6) {
            int i2 = MainActivity.L0;
            C0552a.x(e6, "Exception from try-catch block inside inside the onChildAdded method inside MainActivity in addListenerToStock method.", "MainActivity");
        }
    }

    public void l(boolean z3) {
        switch (this.f4976a) {
            case 13:
                if (z3) {
                    c.k0(o.getAccountObject().getId(), new b5.k(2, o.getEstateObject().getId(), -1));
                    Q.b(d.z0(o.getEstateObject().getId()), o.getAccountObject().getId(), (long) 1);
                    return;
                }
                return;
            default:
                if (z3) {
                    U.g(o.getEstateObject().getEstateOwnerId(), "cash", -d.i0(o.getEstateObject().getId()), new androidx.emoji2.text.v(14));
                    return;
                }
                return;
        }
    }

    public void m() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public Object n() {
        switch (this.f4976a) {
            case 1:
                return new TreeSet();
            case 2:
                return new ArrayDeque();
            case 3:
                return new ConcurrentSkipListMap();
            case 4:
                return new TreeMap();
            default:
                return new b4.l(true);
        }
    }

    public boolean p(j.k kVar) {
        return false;
    }

    public void q(C0587c cVar) {
        try {
            android.support.v4.media.session.a.A0(cVar.f8279b.F(), cVar);
        } catch (Exception e6) {
            int i2 = MainActivity.L0;
            C0552a.x(e6, "Exception from try-catch block inside inside the onChildChanged method inside MainActivity in addListenerToStock method.", "MainActivity");
        }
    }

    public D(JSONObject jSONObject) {
        this.f4976a = 28;
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    public D(X4.d dVar, I i2) {
        this.f4976a = 9;
    }

    public void B(C0588d dVar) {
    }

    public void c(C0289v vVar) {
    }

    public void e(com.bumptech.glide.manager.h hVar) {
    }

    public void u(C0587c cVar) {
    }

    public void a(j.k kVar, boolean z3) {
    }
}
