package S3;

import A4.h;
import B0.H;
import H4.f;
import H4.g;
import K1.e;
import K4.r;
import K4.u;
import R2.b;
import T1.A;
import T1.C0156b0;
import T1.C0173h;
import T1.C0192n0;
import T1.C0212u0;
import T1.I0;
import T1.T1;
import T1.X;
import T1.Z;
import T4.d;
import U4.a;
import a1.C0258c;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.I;
import androidx.lifecycle.O;
import androidx.lifecycle.S;
import b4.m;
import b5.k;
import c0.C0337c;
import c0.C0338d;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.E;
import com.mtma.criminal.city.fragments.gangBase.v;
import com.mtma.criminal.city.utils.B;
import com.mtma.criminal.city.utils.C0436f;
import com.mtma.criminal.city.utils.C0450u;
import com.mtma.criminal.city.utils.C0452w;
import com.mtma.criminal.city.utils.C0454y;
import com.mtma.criminal.city.utils.D;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.r0;
import d5.C0472e;
import d5.i;
import d5.o;
import e5.C0505b;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.C0595k;
import i3.n;
import i3.p;
import i3.q;
import j4.A0;
import j4.C0621e0;
import j4.M0;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import kotlin.jvm.internal.j;
import n3.C0866g;
import org.json.JSONArray;
import org.json.JSONException;

public final class t implements zzr, C0156b0, q, J, r0, m, S, T, p, D {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2699a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2700b;

    public /* synthetic */ t(Object obj, int i2) {
        this.f2699a = i2;
        this.f2700b = obj;
    }

    public static boolean p(Bundle bundle) {
        if ("1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    public static String y(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public void A(I0 i02, C0173h hVar) {
        ((EnumMap) this.f2700b).put(i02, hVar);
    }

    public void B(C0588d dVar) {
        switch (this.f2699a) {
            case 5:
                c.s0(((d) this.f2700b).f3587d0, (String) null, (String) null);
                b.w(false);
                return;
            case zzaky.zzf.zzf /*6*/:
                c.s0(((a) this.f2700b).f3715d0, (String) null, (String) null);
                b.w(false);
                return;
            case zzaky.zzf.zzg /*7*/:
                V4.a aVar = (V4.a) this.f2700b;
                c.s0(aVar.f3781d0, (String) null, (String) null);
                b.w(false);
                aVar.f3784g0.setEmptyView(aVar.f3783f0);
                return;
            case 10:
                return;
            case 12:
                f fVar = (f) this.f2700b;
                X4.c cVar = (X4.c) ((g) ((A) fVar.d).f2796b).f1032c;
                cVar.f4205o0 = false;
                cVar.f4203m0.setVisibility(8);
                c.s0(((X4.c) ((g) ((A) fVar.d).f2796b).f1032c).f4194d0, (String) null, (String) null);
                return;
            case 13:
            case 21:
            case 22:
            case 23:
            case 24:
                return;
            default:
                ((C0454y) ((X4.d) this.f2700b).f4210c).f(false, true, false, true, false);
                return;
        }
    }

    public O b(Class cls, C0337c cVar) {
        O o6 = null;
        for (C0338d dVar : (C0338d[]) this.f2700b) {
            if (dVar.f5578a.equals(cls)) {
                o6 = (O) I.f5228a.invoke(cVar);
            }
        }
        if (o6 != null) {
            return o6;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public void c(boolean z3) {
        if (z3) {
            K4.g gVar = (K4.g) this.f2700b;
            o.setCrimeObject((C0472e) gVar.f1520c);
            ((C0436f) gVar.d).f7408e.c(true);
            c.k0(o.getAccountObject().getId(), new k(23, ((C0472e) gVar.f1520c).getLastOpenedCrimeType(), 0));
        }
    }

    public void d(String str, int i2, IOException iOException, byte[] bArr, Map map) {
        ((T1) this.f2700b).t(str, i2, iOException, bArr, map);
    }

    public void e(boolean z3, i iVar) {
        C0258c cVar = (C0258c) this.f2700b;
        if (z3) {
            int i2 = cVar.f4550b;
            int i5 = cVar.f4550b;
            long j6 = cVar.f4551c;
            if (i2 == 2006) {
                com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject", "courageDoubleEffectEndTime").I(Long.valueOf(b.K(i5) + j6)).addOnSuccessListener(new B(this, 0));
            } else if (i2 == 2007) {
                com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject", "healthDoubleEffectEndTime").I(Long.valueOf(b.K(i5) + j6)).addOnSuccessListener(new B(this, 1));
            }
            b.w(false);
            b.M0(R.raw.add_new_item);
            com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.toast_successfully, ((com.mtma.criminal.city.utils.A) cVar.d).f7340b);
            return;
        }
        b.w(false);
        if (iVar != null) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_use_herb_material, ((com.mtma.criminal.city.utils.A) cVar.d).f7340b, (String) null);
            return;
        }
        c.s0(((com.mtma.criminal.city.utils.A) cVar.d).f7340b, (String) null, (String) null);
    }

    public H f(C0595k kVar) {
        Object b6 = kVar.b();
        long j6 = 1;
        C0450u uVar = (C0450u) this.f2700b;
        if (b6 == null) {
            kVar.a("goldBullion").d(Long.valueOf(uVar.f7475a + 1));
            kVar.a("lastUpdatedTimeInMilli").d(n.f8294a);
            return b.W0(kVar);
        }
        Class<Long> cls = Long.class;
        long longValue = ((Long) kVar.a("lastUpdatedTimeInMilli").c(cls)).longValue();
        if (longValue >= uVar.f7476b && longValue < uVar.f7477c) {
            j6 = ((Long) kVar.a("goldBullion").c(cls)).longValue();
        }
        kVar.a("goldBullion").d(Long.valueOf(j6 + uVar.f7475a));
        kVar.a("lastUpdatedTimeInMilli").d(n.f8294a);
        return b.W0(kVar);
    }

    public boolean g(String str) {
        String o6 = o(str);
        if ("1".equals(o6) || Boolean.parseBoolean(o6)) {
            return true;
        }
        return false;
    }

    public void h(boolean z3, d5.k kVar) {
        switch (this.f2699a) {
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                u uVar = (u) this.f2700b;
                ((X4.c) ((g) ((A) ((f) ((t) ((A) uVar.f1612c).f2796b).f2700b).d).f2796b).f1032c).f4203m0.setVisibility(8);
                StartActivity startActivity = (StartActivity) ((X4.c) ((g) ((A) ((f) ((t) ((A) uVar.f1612c).f2796b).f2700b).d).f2796b).f1032c).l();
                if (startActivity != null) {
                    startActivity.r();
                    return;
                }
                return;
            default:
                com.mtma.criminal.city.fragments.gangBase.I i2 = (com.mtma.criminal.city.fragments.gangBase.I) this.f2700b;
                if (z3) {
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.toast_successfully, ((com.mtma.criminal.city.utils.A) ((C0258c) i2.f7143b).d).f7340b);
                    return;
                }
                b.w(false);
                if (kVar.getPowerCurrent() + 100 > 5000) {
                    c.s0(((com.mtma.criminal.city.utils.A) ((C0258c) i2.f7143b).d).f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.power_rich_maximum_limit, new Object[]{5000}), (String) null);
                    return;
                }
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((com.mtma.criminal.city.utils.A) ((C0258c) i2.f7143b).d).f7340b, (String) null);
                return;
        }
    }

    public Integer i(String str) {
        String o6 = o(str);
        if (TextUtils.isEmpty(o6)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(o6));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + y(str) + "(" + o6 + ") into an int");
            return null;
        }
    }

    public void j(long j6) {
        com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "serverData").d(new com.mtma.criminal.city.fragments.gangBase.I(new u((Object) this, j6, 5), 2));
    }

    public JSONArray k(String str) {
        String o6 = o(str);
        if (TextUtils.isEmpty(o6)) {
            return null;
        }
        try {
            return new JSONArray(o6);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + y(str) + ": " + o6 + ", falling back to default");
            return null;
        }
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        C0450u uVar = (C0450u) this.f2700b;
        if (dVar != null || !cVar.b() || !z3) {
            uVar.d.a(uVar.f7475a, "goldBullion", false);
        } else {
            uVar.d.a(uVar.f7475a, "goldBullion", true);
        }
    }

    public String m(Resources resources, String str, String str2) {
        String[] strArr;
        String o6 = o(str2);
        if (!TextUtils.isEmpty(o6)) {
            return o6;
        }
        String o7 = o(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(o7)) {
            return null;
        }
        int identifier = resources.getIdentifier(o7, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", y(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray k6 = k(str2.concat("_loc_args"));
        if (k6 == null) {
            strArr = null;
        } else {
            int length = k6.length();
            strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = k6.optString(i2);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e6) {
            Log.w("NotificationParams", "Missing format argument for " + y(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e6);
            return null;
        }
    }

    public Object n() {
        switch (this.f2699a) {
            case 17:
                Class cls = (Class) this.f2700b;
                try {
                    return b4.u.f5559a.a(cls);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e6);
                }
            default:
                Type type = (Type) this.f2700b;
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    throw new RuntimeException("Invalid EnumSet type: " + type.toString());
                }
                throw new RuntimeException("Invalid EnumSet type: " + type.toString());
        }
    }

    public String o(String str) {
        String str2;
        Bundle bundle = (Bundle) this.f2700b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public String toString() {
        switch (this.f2699a) {
            case 1:
                StringBuilder sb = new StringBuilder("1");
                for (I0 i02 : I0.values()) {
                    C0173h hVar = (C0173h) ((EnumMap) this.f2700b).get(i02);
                    if (hVar == null) {
                        hVar = C0173h.UNSET;
                    }
                    sb.append(hVar.f3309a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(C0587c cVar) {
        int i2;
        int i5;
        int i6;
        int i7;
        int i8;
        C0587c cVar2 = cVar;
        Class<b5.n> cls = b5.n.class;
        Class<String> cls2 = String.class;
        int i9 = 1;
        int i10 = 0;
        Object obj = this.f2700b;
        switch (this.f2699a) {
            case 5:
                int i11 = 0;
                while (true) {
                    d dVar = (d) obj;
                    if (i11 < o.getStockObject().getMuseumSpace()) {
                        dVar.f3595l0.add(Y4.D.f());
                        i11++;
                    } else {
                        C0586b c3 = cVar.c();
                        int i12 = 0;
                        while (true) {
                            Iterator it2 = c3.f8276a;
                            if (it2.hasNext()) {
                                v3.q qVar = (v3.q) it2.next();
                                C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                                C0587c cVar3 = new C0587c(E6, v3.m.t(qVar.f12305b));
                                if (E6.F() != null) {
                                    C0586b c6 = cVar3.c();
                                    int i13 = i12;
                                    while (true) {
                                        Iterator it3 = c6.f8276a;
                                        if (it3.hasNext()) {
                                            v3.q qVar2 = (v3.q) it3.next();
                                            c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                                            try {
                                                b5.n nVar = (b5.n) r3.b.c(cls, v3.m.t(qVar2.f12305b).f12296a.getValue());
                                                nVar.setCount(nVar.getCount() + nVar.getCountInBag());
                                                if (nVar.isUsedInMuseum()) {
                                                    if (nVar.getMuseumPositions() != null) {
                                                        if (nVar.getMuseumPositions().size() > nVar.getCount()) {
                                                            try {
                                                                int size = nVar.getMuseumPositions().size() - nVar.getCount();
                                                                ArrayList<Integer> museumPositions = nVar.getMuseumPositions();
                                                                Integer num = museumPositions.get(i10);
                                                                while (i10 < size) {
                                                                    try {
                                                                        Iterator<Integer> it4 = museumPositions.iterator();
                                                                        while (it4.hasNext()) {
                                                                            Integer next = it4.next();
                                                                            if (next.intValue() > num.intValue()) {
                                                                                num = next;
                                                                            }
                                                                        }
                                                                        try {
                                                                            museumPositions.remove(num);
                                                                            i10++;
                                                                            i2 = 1;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            i8 = 1;
                                                                            i6 = i8;
                                                                            com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "d", " in displayMuseumData method.", e, "d");
                                                                            i2 = i6;
                                                                            i10 = 0;
                                                                        }
                                                                    } catch (Exception e7) {
                                                                        e = e7;
                                                                        i8 = i2;
                                                                        i6 = i8;
                                                                        com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "d", " in displayMuseumData method.", e, "d");
                                                                        i2 = i6;
                                                                        i10 = 0;
                                                                    }
                                                                }
                                                                if (museumPositions.size() < i2) {
                                                                    dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("museumPositions").I((Object) null);
                                                                    dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("usedInMuseum").I(Boolean.FALSE);
                                                                    i2 = 1;
                                                                    i10 = 0;
                                                                } else {
                                                                    dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("museumPositions").I(museumPositions);
                                                                    nVar.setMuseumPositions(museumPositions);
                                                                }
                                                            } catch (Exception e8) {
                                                                e = e8;
                                                                i6 = 1;
                                                                com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "d", " in displayMuseumData method.", e, "d");
                                                                i2 = i6;
                                                                i10 = 0;
                                                            }
                                                        }
                                                        try {
                                                            Y4.D r6 = Y4.D.r(nVar);
                                                            int i14 = 0;
                                                            while (i14 < r6.f4299j.size()) {
                                                                int intValue = ((Integer) r6.f4299j.get(i14)).intValue();
                                                                if (((Y4.D) dVar.f3595l0.get(intValue)).equals(Y4.D.f())) {
                                                                    ArrayList arrayList = dVar.f3595l0;
                                                                    arrayList.remove(intValue);
                                                                    arrayList.add(intValue, r6);
                                                                    i7 = 1;
                                                                    i13++;
                                                                } else {
                                                                    i6 = 1;
                                                                    try {
                                                                        if (r6.f4299j.size() > 1) {
                                                                            ArrayList arrayList2 = r6.f4299j;
                                                                            arrayList2.remove(i14);
                                                                            i14--;
                                                                            dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("museumPositions").I(arrayList2);
                                                                        } else {
                                                                            dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("museumPositions").I((Object) null);
                                                                            dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("usedInMuseum").I(Boolean.FALSE);
                                                                        }
                                                                        i7 = 1;
                                                                    } catch (Exception e9) {
                                                                        e = e9;
                                                                        com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "d", " in displayMuseumData method.", e, "d");
                                                                        i2 = i6;
                                                                        i10 = 0;
                                                                    }
                                                                }
                                                                i14 += i7;
                                                            }
                                                            i6 = 1;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            i6 = 1;
                                                        }
                                                        i2 = i6;
                                                        i10 = 0;
                                                    }
                                                }
                                                i6 = i2;
                                                dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("usedInMuseum").I(Boolean.FALSE);
                                                try {
                                                    dVar.f3599p0.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).E("museumPositions").I((Object) null);
                                                } catch (Exception e11) {
                                                    e = e11;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                i6 = i2;
                                                com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "d", " in displayMuseumData method.", e, "d");
                                                i2 = i6;
                                                i10 = 0;
                                            }
                                            i2 = i6;
                                            i10 = 0;
                                        } else {
                                            i5 = i2;
                                            i12 = i13;
                                        }
                                    }
                                } else {
                                    i5 = i2;
                                }
                                i9 = i5;
                                i10 = 0;
                            } else {
                                dVar.f3591h0.setVisibility(0);
                                dVar.f3591h0.setImageResource(android.support.v4.media.session.a.X(o.getStockObject().getMuseumBackgroundIdSelected()));
                                dVar.f3592i0.setText(dVar.s(R.string.slash_between_two_number, Integer.valueOf(i12), Integer.valueOf(o.getStockObject().getMuseumSpace())));
                                ArrayList arrayList3 = dVar.f3596m0;
                                ArrayList arrayList4 = dVar.f3595l0;
                                arrayList3.addAll(arrayList4);
                                int i15 = dVar.f3600q0;
                                Context context = dVar.f3587d0;
                                C0621e0 e0Var = new C0621e0(context, arrayList3, 0, i15);
                                dVar.f3598o0 = e0Var;
                                dVar.f3590g0.setAdapter((ListAdapter) e0Var);
                                arrayList4.add(Y4.D.a());
                                M0 m02 = new M0(context, arrayList4);
                                dVar.f3597n0 = m02;
                                dVar.f3589f0.setAdapter(m02);
                                dVar.f3597n0.registerDataSetObserver(new r(dVar, 3));
                                b.w(false);
                                return;
                            }
                        }
                    }
                }
            case zzaky.zzf.zzf /*6*/:
                int i16 = 0;
                while (true) {
                    a aVar = (a) obj;
                    if (i16 < o.getStockObject().getStallSpace()) {
                        aVar.f3720i0.add(Y4.D.f());
                        i16++;
                    } else {
                        C0586b c7 = cVar.c();
                        while (true) {
                            Iterator it5 = c7.f8276a;
                            if (it5.hasNext()) {
                                v3.q qVar3 = (v3.q) it5.next();
                                C0590f E7 = c7.f8277b.f8279b.E(qVar3.f12304a.f12280a);
                                v3.m t6 = v3.m.t(qVar3.f12305b);
                                try {
                                    int parseInt = Integer.parseInt(E7.F().replace("cell-", ""));
                                    b5.m mVar = (b5.m) r3.b.c(b5.m.class, t6.f12296a.getValue());
                                    Y4.D s6 = Y4.D.s(mVar.getId(), mVar.getLevel(), mVar.getCount());
                                    s6.f4297f = mVar.getCost();
                                    aVar.f3720i0.set(parseInt, s6);
                                } catch (Exception e13) {
                                    com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "a", " in displayStallData method.", e13, "a");
                                }
                            } else {
                                aVar.f3719h0.setText(aVar.s(R.string.slash_between_two_number, Long.valueOf(cVar.d()), Integer.valueOf(o.getStockObject().getStallSpace())));
                                ArrayList arrayList5 = aVar.f3720i0;
                                arrayList5.add(Y4.D.a());
                                M0 m03 = new M0(aVar.f3715d0, arrayList5, 2);
                                aVar.f3721j0 = m03;
                                aVar.f3717f0.setAdapter(m03);
                                aVar.f3721j0.registerDataSetObserver(new r(aVar, 5));
                                b.w(false);
                                return;
                            }
                        }
                    }
                }
            case zzaky.zzf.zzg /*7*/:
                C0586b c8 = cVar.c();
                while (true) {
                    Iterator it6 = c8.f8276a;
                    V4.a aVar2 = (V4.a) obj;
                    if (it6.hasNext()) {
                        v3.q qVar4 = (v3.q) it6.next();
                        C0590f E8 = c8.f8277b.f8279b.E(qVar4.f12304a.f12280a);
                        C0586b c9 = new C0587c(E8, v3.m.t(qVar4.f12305b)).c();
                        while (true) {
                            Iterator it7 = c9.f8276a;
                            if (it7.hasNext()) {
                                v3.q qVar5 = (v3.q) it7.next();
                                c9.f8277b.f8279b.E(qVar5.f12304a.f12280a);
                                try {
                                    b5.n nVar2 = (b5.n) r3.b.c(cls, v3.m.t(qVar5.f12305b).f12296a.getValue());
                                    if (nVar2.isUsedInArming()) {
                                        nVar2.setCount(nVar2.getCount() - 1);
                                    }
                                    if (nVar2.getCount() > 0) {
                                        if (E8.F().equals(e.y(14))) {
                                            aVar2.f3787j0.add(0, Y4.D.v(nVar2.getId(), nVar2.getCount(), nVar2.getLevel(), nVar2.isLocked()));
                                        } else if (E8.F().equals(e.y(0))) {
                                            Y4.D j6 = Y4.D.j(nVar2.getId(), nVar2.getCount(), nVar2.isLocked());
                                            if (j6.f4303n) {
                                                aVar2.f3788k0.add(0, j6);
                                            }
                                        } else if (E8.F().equals(e.y(1))) {
                                            Y4.D b6 = Y4.D.b(nVar2.getId(), nVar2.getCount(), nVar2.isLocked());
                                            if (b6.f4303n) {
                                                aVar2.f3789l0.add(0, b6);
                                            }
                                        }
                                    }
                                } catch (Exception e14) {
                                    com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "a", " in displayStockItems method.", e14, "a");
                                }
                            }
                        }
                    } else {
                        aVar2.f3786i0.addAll(aVar2.f3787j0);
                        ArrayList arrayList6 = aVar2.f3786i0;
                        arrayList6.addAll(aVar2.f3788k0);
                        arrayList6.addAll(aVar2.f3789l0);
                        aVar2.f3784g0.setAdapter(new A0(aVar2.f3781d0, arrayList6, 1));
                        b.w(false);
                        aVar2.f3784g0.setEmptyView(aVar2.f3783f0);
                        return;
                    }
                }
            case 10:
                X4.c cVar4 = (X4.c) obj;
                if (cVar.g()) {
                    C0586b c10 = cVar.c();
                    while (true) {
                        Iterator it8 = c10.f8276a;
                        if (it8.hasNext()) {
                            v3.q qVar6 = (v3.q) it8.next();
                            String str = (String) new C0587c(c10.f8277b.f8279b.E(qVar6.f12304a.f12280a).E("email"), v3.m.t(v3.m.t(qVar6.f12305b).f12296a.f(new C0866g("email")))).f(cls2);
                            if (str != null && Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                                cVar4.V(str, cVar4.f4207q0);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    cVar4.f4205o0 = true;
                    cVar4.f4203m0.setVisibility(8);
                    cVar4.f4199i0.setError(cVar4.r(R.string.user_name_not_exist));
                    cVar4.f4199i0.requestFocus();
                    return;
                }
                break;
            case 12:
                f fVar = (f) obj;
                if (cVar.g()) {
                    d5.u uVar = (d5.u) cVar2.f(d5.u.class);
                    if (uVar == null) {
                        X4.c cVar5 = (X4.c) ((g) ((A) fVar.d).f2796b).f1032c;
                        cVar5.f4205o0 = false;
                        cVar5.f4203m0.setVisibility(8);
                        c.s0(((X4.c) ((g) ((A) fVar.d).f2796b).f1032c).f4194d0, (String) null, (String) null);
                        return;
                    } else if (uVar.getAccountObject().isBannedFromSystem()) {
                        c.r0(((X4.c) ((g) ((A) fVar.d).f2796b).f1032c).f4194d0);
                        return;
                    } else {
                        o.setPlayerObject(uVar);
                        c.s(false, new A((Object) this, 10));
                        return;
                    }
                } else {
                    X4.c cVar6 = (X4.c) ((g) ((A) fVar.d).f2796b).f1032c;
                    cVar6.f4205o0 = false;
                    cVar6.f4203m0.setVisibility(8);
                    c.s0(((X4.c) ((g) ((A) fVar.d).f2796b).f1032c).f4194d0, (String) null, (String) null);
                    return;
                }
            case 13:
                P4.d dVar2 = (P4.d) obj;
                if (cVar.g()) {
                    C0586b c11 = cVar.c();
                    while (true) {
                        Iterator it9 = c11.f8276a;
                        if (it9.hasNext()) {
                            v3.q qVar7 = (v3.q) it9.next();
                            String str2 = (String) new C0587c(c11.f8277b.f8279b.E(qVar7.f12304a.f12280a).E("email"), v3.m.t(v3.m.t(qVar7.f12305b).f12296a.f(new C0866g("email")))).f(cls2);
                            if (str2 != null && Patterns.EMAIL_ADDRESS.matcher(str2).matches()) {
                                ((C0590f) dVar2.f2200l0).q("email").i(str2).d(new X4.d(dVar2, str2, 0));
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    dVar2.f2196h0 = false;
                    ((LinearLayout) dVar2.f2199k0).setVisibility(8);
                    ((EditText) dVar2.f2198j0).setError(dVar2.r(R.string.user_name_not_exist));
                    ((EditText) dVar2.f2198j0).requestFocus();
                    return;
                }
                break;
            case 21:
                com.mtma.criminal.city.activities.t tVar = (com.mtma.criminal.city.activities.t) obj;
                if (cVar.b()) {
                    StartActivity startActivity = tVar.f7081b.f7028I;
                    if (!c.f5741l) {
                        c.f5741l = true;
                        C0505b bVar = new C0505b(startActivity, R.layout.dialog_ok_cancle);
                        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
                        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
                        relativeLayout.setVisibility(0);
                        textView.setText(R.string.alert);
                        textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, startActivity.getTheme()));
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_device_banned_from_system);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_ok_button_text)).setText(R.string.close_button);
                        relativeLayout.setOnClickListener(new com.mtma.criminal.city.activities.u(relativeLayout, bVar, startActivity, 4));
                        bVar.show();
                        return;
                    }
                    return;
                }
                StartActivity startActivity2 = tVar.f7081b;
                boolean z3 = StartActivity.f7025b0;
                startActivity2.getClass();
                if (!StartActivity.f7026c0) {
                    StartActivity.f7026c0 = true;
                    C0505b bVar2 = new C0505b(startActivity2.f7028I, R.layout.dialog_beta_version_code);
                    ImageView imageView = (ImageView) bVar2.findViewById(R.id.dialog_beta_version_code_copy_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar2.findViewById(R.id.dialog_beta_version_exit_button);
                    String u6 = e.u();
                    ((TextView) bVar2.findViewById(R.id.dialog_beta_version_code_field)).setText(u6);
                    String string = startActivity2.getString(R.string.beta_version_description);
                    SpannableString spannableString = new SpannableString(string);
                    spannableString.setSpan(new ForegroundColorSpan(startActivity2.f7028I.getResources().getColor(R.color.fight_red_text, startActivity2.f7028I.getTheme())), 0, string.indexOf(":") + 1, 18);
                    ((TextView) bVar2.findViewById(R.id.dialog_beta_version_description)).setText(spannableString);
                    imageView.setOnClickListener(new h(startActivity2, imageView, u6, 7));
                    relativeLayout2.setOnClickListener(new com.mtma.criminal.city.activities.u(startActivity2, relativeLayout2, bVar2, 2));
                    bVar2.show();
                }
                C0592h.b().e().E("BetaVersion").E("new_devices").E(e.u()).I("");
                return;
            case 22:
                v vVar = (v) ((t) obj).f2700b;
                v.V(vVar, (String) cVar2.f(cls2), vVar.f7283G0);
                return;
            case 23:
                if (cVar.b()) {
                    b5.f fVar2 = (b5.f) cVar2.f(b5.f.class);
                    v vVar2 = (v) obj;
                    vVar2.f7283G0 = fVar2;
                    if (fVar2 != null) {
                        Map<String, Integer> membersWithPositions = fVar2.getMembersWithPositions();
                        ArrayList arrayList7 = new ArrayList();
                        for (Map.Entry next2 : membersWithPositions.entrySet()) {
                            if (next2.getValue().equals(0)) {
                                arrayList7.add(next2.getKey());
                            }
                        }
                        String str3 = (String) arrayList7.get(0);
                        if (com.google.android.gms.internal.measurement.a.t(str3)) {
                            v.V(vVar2, o.getMainStatesObject().getNickName(), vVar2.f7283G0);
                            return;
                        } else {
                            o3.d.d(C0592h.b().e(), "players", str3, "mainStatesObject", "nickName").d(new t(this, 22));
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 24:
                com.mtma.criminal.city.fragments.gangBase.J j7 = (com.mtma.criminal.city.fragments.gangBase.J) obj;
                if (cVar.g()) {
                    ArrayList arrayList8 = new ArrayList();
                    HashMap hashMap = new HashMap();
                    C0586b c12 = cVar.c();
                    while (true) {
                        Iterator it10 = c12.f8276a;
                        if (it10.hasNext()) {
                            v3.q qVar8 = (v3.q) it10.next();
                            C0590f E9 = c12.f8277b.f8279b.E(qVar8.f12304a.f12280a);
                            v3.m t7 = v3.m.t(qVar8.f12305b);
                            if (i10 == 0) {
                                j7.f7152l0 = (Long) r3.b.c(Long.class, t7.f12296a.getValue());
                                i10 = 1;
                            }
                            String F = E9.F();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            o3.d.c(C0592h.b().e(), "players", F, "mainStatesObject").d(new E(hashMap, F, taskCompletionSource, 5));
                            arrayList8.add(taskCompletionSource.getTask());
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList8).addOnCompleteListener(new B4.d((q) this, cVar2, hashMap, 5));
                            return;
                        }
                    }
                } else {
                    j7.f7153m0 = false;
                    j7.f7148h0.setEmptyView(j7.f7147g0);
                    b.w(false);
                    return;
                }
            default:
                X4.d dVar3 = (X4.d) obj;
                if (cVar.b()) {
                    ((C0454y) dVar3.f4210c).f(false, true, false, true, true);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                Map map = n.f8294a;
                hashMap2.put("gangRequests/" + ((String) dVar3.f4209b) + "/" + o.getAccountObject().getId(), map);
                hashMap2.put("playerRequests/" + o.getAccountObject().getId() + "/" + ((String) dVar3.f4209b), map);
                C0592h.b().e().E(b.Z()).E("gangs").J(hashMap2).addOnSuccessListener(new H4.e(this, 14)).addOnFailureListener(new C0452w(this, 0));
                return;
        }
    }

    public Bundle x() {
        Bundle bundle = (Bundle) this.f2700b;
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle.keySet()) {
            if (!next.startsWith("google.c.a.") && !next.equals("from")) {
                bundle2.remove(next);
            }
        }
        return bundle2;
    }

    public void z(I0 i02, int i2) {
        C0173h hVar = C0173h.UNSET;
        if (i2 != -30) {
            if (i2 != -20) {
                if (i2 == -10) {
                    hVar = C0173h.MANIFEST;
                } else if (i2 != 0) {
                    if (i2 == 30) {
                        hVar = C0173h.INITIALIZATION;
                    }
                }
            }
            hVar = C0173h.API;
        } else {
            hVar = C0173h.TCF;
        }
        ((EnumMap) this.f2700b).put(i02, hVar);
    }

    public void zza(int i2, String str, List list, boolean z3, boolean z4) {
        X x6;
        int i5 = i2 - 1;
        C0192n0 n0Var = (C0192n0) this.f2700b;
        if (i5 == 0) {
            Z z5 = ((C0212u0) n0Var.f398a).f3496r;
            C0212u0.k(z5);
            x6 = z5.f3179v;
        } else if (i5 != 1) {
            if (i5 == 3) {
                Z z6 = ((C0212u0) n0Var.f398a).f3496r;
                C0212u0.k(z6);
                x6 = z6.f3180w;
            } else if (i5 != 4) {
                Z z7 = ((C0212u0) n0Var.f398a).f3496r;
                C0212u0.k(z7);
                x6 = z7.f3178u;
            } else if (z3) {
                Z z8 = ((C0212u0) n0Var.f398a).f3496r;
                C0212u0.k(z8);
                x6 = z8.f3176s;
            } else if (!z4) {
                Z z9 = ((C0212u0) n0Var.f398a).f3496r;
                C0212u0.k(z9);
                x6 = z9.f3177t;
            } else {
                Z z10 = ((C0212u0) n0Var.f398a).f3496r;
                C0212u0.k(z10);
                x6 = z10.f3175r;
            }
        } else if (z3) {
            Z z11 = ((C0212u0) n0Var.f398a).f3496r;
            C0212u0.k(z11);
            x6 = z11.f3173p;
        } else if (!z4) {
            Z z12 = ((C0212u0) n0Var.f398a).f3496r;
            C0212u0.k(z12);
            x6 = z12.f3174q;
        } else {
            Z z13 = ((C0212u0) n0Var.f398a).f3496r;
            C0212u0.k(z13);
            x6 = z13.f3172f;
        }
        int size = list.size();
        if (size == 1) {
            x6.b(list.get(0), str);
        } else if (size == 2) {
            x6.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            x6.a(str);
        } else {
            x6.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public t() {
        this.f2699a = 1;
        this.f2700b = new EnumMap(I0.class);
    }

    public t(EnumMap enumMap) {
        this.f2699a = 1;
        EnumMap enumMap2 = new EnumMap(I0.class);
        this.f2700b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public t(Bundle bundle) {
        this.f2699a = 0;
        this.f2700b = new Bundle(bundle);
    }

    public t(C0338d[] dVarArr) {
        this.f2699a = 19;
        j.e(dVarArr, "initializers");
        this.f2700b = dVarArr;
    }

    public t(EditText editText) {
        this.f2699a = 8;
        this.f2700b = new I3.h(editText);
    }

    private final void q(C0588d dVar) {
    }

    private final void r(C0588d dVar) {
    }

    private final void s(C0588d dVar) {
    }

    private final void t(C0588d dVar) {
    }

    private final void v(C0588d dVar) {
    }

    private final void w(C0588d dVar) {
    }
}
