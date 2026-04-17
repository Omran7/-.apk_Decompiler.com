package B0;

import A2.f;
import H4.e;
import I0.B;
import K4.u;
import L.t;
import N0.a;
import R2.b;
import Y4.A;
import Y4.D;
import Y4.g;
import a1.C0258c;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.C0434d;
import com.mtma.criminal.city.utils.C0445o;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.L;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.S;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.b0;
import com.mtma.criminal.city.utils.i0;
import com.mtma.criminal.city.utils.o0;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.v0;
import d5.C0473f;
import d5.C0475h;
import d5.j;
import d5.k;
import d5.m;
import d5.o;
import d5.r;
import f.C0511b;
import f.C0515f;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.C0595k;
import i3.n;
import i3.p;
import i3.q;
import j4.C0612a;
import j4.C0615b0;
import j4.C0626h;
import j4.C0639o;
import j4.C0640p;
import j4.F;
import j4.G;
import j4.H;
import j4.Z;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p4.C0923f;
import z0.i;

public final class l implements q, a, o0, p, J, r0, t, T, S {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f245a;

    /* renamed from: b  reason: collision with root package name */
    public final int f246b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f247c;

    public /* synthetic */ l(int i2, Object obj, int i5) {
        this.f245a = i5;
        this.f246b = i2;
        this.f247c = obj;
    }

    public void B(C0588d dVar) {
        int i2 = this.f245a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.widget.ArrayAdapter} */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f.C0515f a() {
        /*
            r11 = this;
            f.f r0 = new f.f
            java.lang.Object r1 = r11.f247c
            f.b r1 = (f.C0511b) r1
            android.view.ContextThemeWrapper r2 = r1.f7749a
            int r3 = r11.f246b
            r0.<init>(r2, r3)
            android.view.View r2 = r1.f7752e
            f.e r3 = r0.f7781f
            if (r2 == 0) goto L_0x0016
            r3.f7770n = r2
            goto L_0x0036
        L_0x0016:
            java.lang.CharSequence r2 = r1.d
            if (r2 == 0) goto L_0x0023
            r3.d = r2
            android.widget.TextView r4 = r3.f7768l
            if (r4 == 0) goto L_0x0023
            r4.setText(r2)
        L_0x0023:
            android.graphics.drawable.Drawable r2 = r1.f7751c
            if (r2 == 0) goto L_0x0036
            r3.f7766j = r2
            android.widget.ImageView r4 = r3.f7767k
            if (r4 == 0) goto L_0x0036
            r5 = 0
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r3.f7767k
            r4.setImageDrawable(r2)
        L_0x0036:
            java.lang.CharSequence[] r2 = r1.h
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x0040
            java.lang.Object r2 = r1.f7754i
            if (r2 == 0) goto L_0x007f
        L_0x0040:
            int r2 = r3.f7774r
            android.view.LayoutInflater r6 = r1.f7750b
            android.view.View r2 = r6.inflate(r2, r5)
            androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController$RecycleListView) r2
            boolean r6 = r1.f7756k
            if (r6 == 0) goto L_0x0051
            int r6 = r3.f7775s
            goto L_0x0053
        L_0x0051:
            int r6 = r3.f7776t
        L_0x0053:
            java.lang.Object r7 = r1.f7754i
            if (r7 == 0) goto L_0x0058
            goto L_0x0064
        L_0x0058:
            f.d r7 = new f.d
            java.lang.CharSequence[] r8 = r1.h
            android.view.ContextThemeWrapper r9 = r1.f7749a
            r10 = 16908308(0x1020014, float:2.3877285E-38)
            r7.<init>(r9, r6, r10, r8)
        L_0x0064:
            r3.f7771o = r7
            int r6 = r1.f7757l
            r3.f7772p = r6
            android.content.DialogInterface$OnClickListener r6 = r1.f7755j
            if (r6 == 0) goto L_0x0076
            f.a r6 = new f.a
            r6.<init>(r1, r3)
            r2.setOnItemClickListener(r6)
        L_0x0076:
            boolean r6 = r1.f7756k
            if (r6 == 0) goto L_0x007d
            r2.setChoiceMode(r4)
        L_0x007d:
            r3.f7763e = r2
        L_0x007f:
            boolean r2 = r1.f7753f
            r0.setCancelable(r2)
            boolean r2 = r1.f7753f
            if (r2 == 0) goto L_0x008b
            r0.setCanceledOnTouchOutside(r4)
        L_0x008b:
            r0.setOnCancelListener(r5)
            r0.setOnDismissListener(r5)
            android.content.DialogInterface$OnKeyListener r1 = r1.g
            if (r1 == 0) goto L_0x0098
            r0.setOnKeyListener(r1)
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.l.a():f.f");
    }

    public boolean b(View view) {
        ((BottomSheetBehavior) this.f247c).B(this.f246b);
        return true;
    }

    public void c(boolean z3) {
        switch (this.f245a) {
            case 20:
                f fVar = (f) this.f247c;
                if (z3) {
                    int currentCity = o.getLocationObject().getCurrentCity();
                    int i2 = this.f246b;
                    if (currentCity != 0) {
                        D d = (D) fVar.f30c;
                        if (d.f4304o) {
                            C0639o oVar = (C0639o) fVar.d;
                            ((D) oVar.getItem(oVar.getPosition(d))).h = i2 + 1;
                            ((C0639o) fVar.d).f9066b.Y((D) fVar.f30c, 2);
                            b.w(false);
                            b.M0(R.raw.money_get);
                            C0639o oVar2 = (C0639o) fVar.d;
                            v0.e(oVar2.f9065a, oVar2.getContext().getString(R.string.toast_successfully));
                            return;
                        }
                    }
                    C0639o oVar3 = (C0639o) fVar.d;
                    ((D) oVar3.getItem(oVar3.getPosition((D) fVar.f30c))).h = i2;
                    ((C0639o) fVar.d).f9066b.Y((D) fVar.f30c, 2);
                    b.w(false);
                    b.M0(R.raw.money_get);
                    C0639o oVar22 = (C0639o) fVar.d;
                    v0.e(oVar22.f9065a, oVar22.getContext().getString(R.string.toast_successfully));
                    return;
                }
                b.w(false);
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((C0639o) fVar.d).f9065a, (String) null);
                return;
            case 21:
                F f6 = (F) this.f247c;
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C0473f(0, new ArrayList(), new ArrayList()));
                    Boolean bool = Boolean.FALSE;
                    arrayList.add(new C0473f(1, new ArrayList(Collections.singletonList(bool)), new ArrayList()));
                    arrayList.add(new C0473f(2, new ArrayList(Collections.singletonList(bool)), new ArrayList()));
                    arrayList.add(new C0473f(3, new ArrayList(Collections.singletonList(bool)), new ArrayList(Collections.singletonList(-1L))));
                    arrayList.add(new C0473f(4, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(5, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(6, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(7, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(8, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(9, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(10, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(11, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(12, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(13, new ArrayList(Arrays.asList(new Boolean[]{bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(14, new ArrayList(Arrays.asList(new Boolean[]{bool, bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(15, new ArrayList(Arrays.asList(new Boolean[]{bool, bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    arrayList.add(new C0473f(16, new ArrayList(Arrays.asList(new Boolean[]{bool, bool, bool})), new ArrayList(Arrays.asList(new Long[]{-1L, -1L}))));
                    C0473f fVar2 = (C0473f) arrayList.get(f6.f8870b.f4356c);
                    fVar2.setEstateOwnerId(o.getAccountObject().getId());
                    ((C0590f) f6.f8871c.f8878f).E("allOwnEstates").G().I(fVar2).addOnSuccessListener(new e(this, 22));
                    return;
                }
                b.w(false);
                c.x0(f6.f8871c.f8875b);
                return;
            case 22:
                int i5 = 0;
                H h = (H) this.f247c;
                if (z3) {
                    C0590f v6 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "estateObject");
                    int i6 = this.f246b;
                    boolean z4 = ((g) h.getItem(i6)).g;
                    String str = (String) h.f8885e;
                    if (z4) {
                        if ((h.getCount() == 4 && i6 == 3) || (h.getCount() == 5 && i6 == 4)) {
                            i5 = 1;
                        }
                        C0590f E6 = v6.E("servantContractsStartTimeInMilliList").E(String.valueOf(i5));
                        Map map = n.f8294a;
                        E6.I(map);
                        v6.E("allOwnEstates").E(str).E("servantContractsStartTimeInMilliList").E(String.valueOf(i5)).I(map).addOnSuccessListener(new L(this, i5, 2));
                        return;
                    }
                    C0590f E7 = v6.E("fixedModificationList").E(String.valueOf(i6));
                    Boolean bool2 = Boolean.TRUE;
                    E7.I(bool2);
                    v6.E("allOwnEstates").E(str).E("fixedModificationList").E(String.valueOf(i6)).I(bool2).addOnSuccessListener(new e(this, 24));
                    return;
                }
                b.w(false);
                c.x0(h.f8883b);
                return;
            case 24:
                int i7 = this.f246b;
                if (z3) {
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "gymObject", "gymLessonsOpenedStatesList").E(String.valueOf(i7)).I(Boolean.TRUE).addOnCompleteListener(new C0451v(this, 16));
                    return;
                }
                b.w(false);
                long cash = o.getMoneyObject().getCash();
                C0612a aVar = (C0612a) this.f247c;
                int i8 = (cash > ((Y4.o) aVar.getItem(i7)).f4409e ? 1 : (cash == ((Y4.o) aVar.getItem(i7)).f4409e ? 0 : -1));
                MainActivity mainActivity = aVar.f8970b;
                if (i8 < 0) {
                    c.x0(mainActivity);
                    return;
                } else {
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.unknown_error_try_again, mainActivity, (String) null);
                    return;
                }
            case 27:
                C0615b0 b0Var = (C0615b0) this.f247c;
                if (z3) {
                    com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "schoolObject").H(new U0.b(b0Var.f8979c, ((A) b0Var.getItem(this.f246b)).f4274a, (Object) new I(this, 29), 2));
                    return;
                }
                b.w(false);
                c.x0(b0Var.f8978b);
                return;
            default:
                if (z3) {
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "upgradeObject", "emblem").H(new l(this.f246b, (Object) new K(this, 27), 17));
                    return;
                }
                b.w(false);
                c.y0(((Z) this.f247c).f8965b);
                return;
        }
    }

    public void d(int i2, boolean z3) {
        W4.g gVar = (W4.g) this.f247c;
        if (z3) {
            gVar.b0();
            return;
        }
        b.w(false);
        Context applicationContext = MyApplication.f7090a.getApplicationContext();
        int i5 = this.f246b;
        c.s0(gVar.f4104d0, MyApplication.f7090a.getApplicationContext().getString(R.string.promotion_need_certification, new Object[]{applicationContext.getString(D.s(i5, 0, 1).f4295c), MyApplication.f7090a.getApplicationContext().getString(b.F(i5))}), (String) null);
    }

    public H f(C0595k kVar) {
        int i2;
        String str;
        Object obj;
        Object obj2;
        C0475h hVar;
        C0595k kVar2 = kVar;
        Class<Integer> cls = Integer.class;
        int i5 = this.f246b;
        switch (this.f245a) {
            case zzaky.zzf.zzg /*7*/:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                int intValue = ((Integer) kVar2.c(cls)).intValue() + i5;
                if (intValue < 0) {
                    return b.a();
                }
                kVar2.d(Integer.valueOf(intValue));
                return b.W0(kVar);
            case 8:
                C0475h hVar2 = (C0475h) kVar2.c(C0475h.class);
                if (hVar2 == null) {
                    return b.W0(kVar);
                }
                switch (i5) {
                    case 2034:
                    case 2035:
                    case 2036:
                    case 2037:
                    case 2038:
                    case 2039:
                    case 2040:
                    case 2041:
                    case 2042:
                    case 2043:
                    case 2044:
                    case 2045:
                        i2 = 1000;
                        break;
                    case 2046:
                    case 2047:
                    case 2048:
                    case 2049:
                    case 2050:
                    case 2051:
                    case 2052:
                    case 2053:
                    case 2054:
                    case 2055:
                    case 2056:
                    case 2057:
                        i2 = 10000;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                String str2 = "";
                switch (i5) {
                    case 2034:
                    case 2041:
                    case 2044:
                    case 2046:
                    case 2053:
                    case 2056:
                        str = "defense";
                        break;
                    case 2035:
                    case 2038:
                    case 2045:
                    case 2047:
                    case 2050:
                    case 2057:
                        str = "speed";
                        break;
                    case 2036:
                    case 2039:
                    case 2042:
                    case 2048:
                    case 2051:
                    case 2054:
                        str = "dexterity";
                        break;
                    case 2037:
                    case 2040:
                    case 2043:
                    case 2049:
                    case 2052:
                    case 2055:
                        str = "strength";
                        break;
                    default:
                        str = str2;
                        break;
                }
                switch (i5) {
                    case 2034:
                    case 2035:
                    case 2036:
                    case 2046:
                    case 2047:
                    case 2048:
                        str2 = "strength";
                        break;
                    case 2037:
                    case 2038:
                    case 2039:
                    case 2049:
                    case 2050:
                    case 2051:
                        str2 = "defense";
                        break;
                    case 2040:
                    case 2041:
                    case 2042:
                    case 2052:
                    case 2053:
                    case 2054:
                        str2 = "speed";
                        break;
                    case 2043:
                    case 2044:
                    case 2045:
                    case 2055:
                    case 2056:
                    case 2057:
                        str2 = "dexterity";
                        break;
                }
                String[] strArr = {str, str2};
                String str3 = strArr[0];
                String str4 = strArr[1];
                if (str3.equals("strength")) {
                    obj2 = "dexterity";
                    obj = "speed";
                    if (hVar2.getStrength() - ((double) i2) < 0.0d) {
                        kVar2.a(str3).d(0);
                        C0595k a6 = kVar2.a(str4);
                        double strength = hVar2.getStrength();
                        Map map = n.f8294a;
                        Double valueOf = Double.valueOf(strength);
                        HashMap hashMap = new HashMap();
                        hashMap.put("increment", valueOf);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(".sv", Collections.unmodifiableMap(hashMap));
                        a6.d(Collections.unmodifiableMap(hashMap2));
                        return b.W0(kVar);
                    }
                } else {
                    obj2 = "dexterity";
                    obj = "speed";
                }
                if (str3.equals("defense")) {
                    hVar = hVar2;
                    if (hVar2.getDefense() - ((double) i2) < 0.0d) {
                        kVar2.a(str3).d(0);
                        C0595k a7 = kVar2.a(str4);
                        double defense = hVar.getDefense();
                        Map map2 = n.f8294a;
                        Double valueOf2 = Double.valueOf(defense);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("increment", valueOf2);
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put(".sv", Collections.unmodifiableMap(hashMap3));
                        a7.d(Collections.unmodifiableMap(hashMap4));
                        return b.W0(kVar);
                    }
                } else {
                    hVar = hVar2;
                }
                if (!str3.equals(obj) || hVar.getSpeed() - ((double) i2) >= 0.0d) {
                    if (!str3.equals(obj2) || hVar.getDexterity() - ((double) i2) >= 0.0d) {
                        C0595k a8 = kVar2.a(str3);
                        Map map3 = n.f8294a;
                        Long valueOf3 = Long.valueOf((long) (-i2));
                        HashMap hashMap5 = new HashMap();
                        hashMap5.put("increment", valueOf3);
                        HashMap hashMap6 = new HashMap();
                        hashMap6.put(".sv", Collections.unmodifiableMap(hashMap5));
                        a8.d(Collections.unmodifiableMap(hashMap6));
                        C0595k a9 = kVar2.a(str4);
                        Long valueOf4 = Long.valueOf((long) i2);
                        HashMap hashMap7 = new HashMap();
                        hashMap7.put("increment", valueOf4);
                        HashMap hashMap8 = new HashMap();
                        hashMap8.put(".sv", Collections.unmodifiableMap(hashMap7));
                        a9.d(Collections.unmodifiableMap(hashMap8));
                    } else {
                        kVar2.a(str3).d(0);
                        C0595k a10 = kVar2.a(str4);
                        double dexterity = hVar.getDexterity();
                        Map map4 = n.f8294a;
                        Double valueOf5 = Double.valueOf(dexterity);
                        HashMap hashMap9 = new HashMap();
                        hashMap9.put("increment", valueOf5);
                        HashMap hashMap10 = new HashMap();
                        hashMap10.put(".sv", Collections.unmodifiableMap(hashMap9));
                        a10.d(Collections.unmodifiableMap(hashMap10));
                    }
                    return b.W0(kVar);
                }
                kVar2.a(str3).d(0);
                C0595k a11 = kVar2.a(str4);
                double speed = hVar.getSpeed();
                Map map5 = n.f8294a;
                Double valueOf6 = Double.valueOf(speed);
                HashMap hashMap11 = new HashMap();
                hashMap11.put("increment", valueOf6);
                HashMap hashMap12 = new HashMap();
                hashMap12.put(".sv", Collections.unmodifiableMap(hashMap11));
                a11.d(Collections.unmodifiableMap(hashMap12));
                return b.W0(kVar);
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                if (kVar.b() == null) {
                    kVar2.d(Integer.valueOf(i5));
                    return b.W0(kVar);
                } else if (((Integer) kVar2.c(cls)).intValue() == i5) {
                    return b.a();
                } else {
                    kVar2.d(Integer.valueOf(i5));
                    return b.W0(kVar);
                }
            case 12:
                m mVar = (m) kVar2.c(m.class);
                if (mVar == null) {
                    return b.W0(kVar);
                }
                if (mVar.getGold() - i5 < 0 || U.d(i5) == 0) {
                    return b.a();
                }
                mVar.setGold(mVar.getGold() - i5);
                mVar.setCash(U.d(i5) + mVar.getCash());
                kVar2.d(mVar);
                return b.W0(kVar);
            case 13:
                if (kVar.b() == null) {
                    kVar2.d(n.f8294a);
                    return b.W0(kVar);
                } else if (!I1.b.m(((Long) kVar2.c(Long.class)).longValue())) {
                    return b.a();
                } else {
                    kVar2.d(n.f8294a);
                    return b.W0(kVar);
                }
            case 14:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                kVar2.d(Integer.valueOf(((Integer) kVar2.c(cls)).intValue() + i5));
                return b.W0(kVar);
            case 15:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                kVar2.d(Integer.valueOf(((Integer) kVar2.c(cls)).intValue() + 1));
                return b.W0(kVar);
            case 16:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                r rVar = (r) kVar2.c(r.class);
                if (rVar == null) {
                    return b.a();
                }
                o.setSkillsObject(rVar);
                int meritSkillLevel = rVar.getMeritSkillLevel(i5) + 1;
                if (meritSkillLevel > 10 || K1.e.q() < meritSkillLevel) {
                    return b.a();
                }
                rVar.getMeritsSkills().put(K1.e.w(i5), Integer.valueOf(meritSkillLevel));
                kVar2.d(rVar);
                return b.W0(kVar);
            default:
                if (kVar.b() == null) {
                    return b.W0(kVar);
                }
                int intValue2 = ((Integer) kVar2.c(cls)).intValue() + i5;
                if (intValue2 < 0) {
                    return b.a();
                }
                kVar2.d(Integer.valueOf(intValue2));
                return b.W0(kVar);
        }
    }

    public void g(boolean z3, m mVar) {
        G g = (G) this.f247c;
        if (z3) {
            b.w(false);
            b.M0(R.raw.money_get);
            com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.toast_successfully, g.f8875b);
            return;
        }
        b.w(false);
        if (mVar.getGold() < this.f246b) {
            c.y0(g.f8875b);
            return;
        }
        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error_try_again, g.f8875b, (String) null);
    }

    public void h(boolean z3, k kVar) {
        I i2 = (I) this.f247c;
        if (z3) {
            b.w(false);
            b.M0(R.raw.add_new_item);
            v0.e(((com.mtma.criminal.city.utils.A) ((C0258c) i2.f7143b).d).f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
            Q.b(93, o.getAccountObject().getId(), (long) 1);
            return;
        }
        b.w(false);
        if (kVar.getPowerCurrent() + this.f246b > 5000) {
            c.s0(((com.mtma.criminal.city.utils.A) ((C0258c) i2.f7143b).d).f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.power_rich_maximum_limit, new Object[]{5000}), (String) null);
            return;
        }
        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error_try_again, ((com.mtma.criminal.city.utils.A) ((C0258c) i2.f7143b).d).f7340b, (String) null);
    }

    public D i(D d, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) d.get()).compress((Bitmap.CompressFormat) this.f247c, this.f246b, byteArrayOutputStream);
        d.d();
        return new B(byteArrayOutputStream.toByteArray());
    }

    public void j(long j6) {
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "mainStatesObject").H(new u((Object) this, j6, 7));
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        switch (this.f245a) {
            case zzaky.zzf.zzg /*7*/:
                Class<Integer> cls = Integer.class;
                o.getChatObject().setSpeakersNumber((long) ((Integer) cVar.f(cls)).intValue());
                C0434d dVar2 = (C0434d) this.f247c;
                if (dVar != null || !cVar.b() || !z3) {
                    dVar2.d(((Integer) cVar.f(cls)).intValue(), false);
                    return;
                } else {
                    dVar2.d(((Integer) cVar.f(cls)).intValue(), true);
                    return;
                }
            case 8:
                C0475h hVar = new C0475h(o.getGymObject().getStrength(), o.getGymObject().getDefense(), o.getGymObject().getSpeed(), o.getGymObject().getDexterity());
                C0475h hVar2 = (C0475h) cVar.f(C0475h.class);
                K k6 = (K) this.f247c;
                if (dVar != null || !z3 || !cVar.b()) {
                    k6.m(false, false, hVar, hVar2);
                    return;
                }
                o.setGymObject(hVar2);
                k6.m(true, false, hVar, hVar2);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                f fVar = (f) this.f247c;
                if (dVar == null && z3 && cVar.b()) {
                    ((Integer) cVar.f(Integer.class)).getClass();
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) fVar.f30c;
                        if (i2 < arrayList.size()) {
                            ((C0590f) arrayList.get(i2)).I((Object) null);
                            i2++;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(c.f5744o);
                            C0590f c3 = com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players");
                            com.mtma.criminal.city.utils.G g = (com.mtma.criminal.city.utils.G) fVar.d;
                            sb.append(c3.E(g.f7356c).E("medalsObject").E("allMedalsList").G().F());
                            com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E(g.f7356c).E("medalsObject").E("allMedalsList").E(sb.toString()).I(new b5.i(g.d, fVar.f29b)).addOnSuccessListener(new e(fVar, 15));
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                m mVar = (m) cVar.f(m.class);
                l lVar = (l) this.f247c;
                if (dVar != null || !cVar.b() || !z3) {
                    lVar.g(false, mVar);
                    return;
                }
                o.setMoneyObject(mVar);
                lVar.g(true, mVar);
                return;
            case 13:
                K k7 = (K) this.f247c;
                int i5 = this.f246b;
                Class<Long> cls2 = Long.class;
                if (dVar == null && z3 && cVar.b()) {
                    Long l6 = (Long) cVar.f(cls2);
                    long longValue = l6.longValue();
                    o.getStockObject().getTimeBuyPackages().put(K1.e.x(i5, 0), l6);
                    k7.i(longValue, true);
                    return;
                } else if (cVar.b()) {
                    k7.i(((Long) cVar.f(cls2)).longValue(), false);
                    o.getStockObject().getTimeBuyPackages().put(K1.e.x(i5, 0), (Long) cVar.f(cls2));
                    return;
                } else {
                    k7.i(-1, false);
                    return;
                }
            case 14:
                o.getSkillsObject().setMeritsFromChecksOrItems(((Integer) cVar.f(Integer.class)).intValue());
                i0 i0Var = (i0) this.f247c;
                if (dVar != null || !z3 || !cVar.b()) {
                    i0Var.c(false);
                    return;
                } else {
                    i0Var.c(true);
                    return;
                }
            case 15:
                int intValue = ((Integer) cVar.f(Integer.class)).intValue();
                int i6 = this.f246b;
                if (i6 == 703) {
                    o.getSkillsObject().setStrengthCards(intValue);
                } else if (i6 == 701) {
                    o.getSkillsObject().setDefenseCards(intValue);
                } else if (i6 == 702) {
                    o.getSkillsObject().setSpeedCards(intValue);
                } else if (i6 == 704) {
                    o.getSkillsObject().setDexterityCards(intValue);
                }
                I i7 = (I) this.f247c;
                if (dVar != null || !z3 || !cVar.b()) {
                    i7.c(false);
                    return;
                } else {
                    i7.c(true);
                    return;
                }
            case 16:
                r rVar = (r) cVar.f(r.class);
                U0.b bVar = (U0.b) this.f247c;
                if (dVar != null || !z3 || !cVar.b()) {
                    bVar.a(false, rVar);
                    return;
                }
                o.setSkillsObject(rVar);
                bVar.a(true, rVar);
                return;
            default:
                o.getUpgradeObject().setEmblem(((Integer) cVar.f(Integer.class)).intValue());
                K k8 = (K) this.f247c;
                if (dVar != null || !z3 || !cVar.b()) {
                    k8.c(false);
                    return;
                } else {
                    k8.c(true);
                    return;
                }
        }
    }

    public void o(Z4.c cVar) {
        boolean z3 = cVar.isAllProcessSuccess;
        C0923f fVar = (C0923f) this.f247c;
        if (z3) {
            for (int i2 = 0; i2 < fVar.f11028t0.size(); i2++) {
                ((D) fVar.f11029u0.get(i2)).h -= this.f246b;
            }
            C0923f.V(fVar);
            C0640p pVar = fVar.f11030v0;
            pVar.d = fVar.f11027r0;
            pVar.notifyDataSetChanged();
            b.w(false);
            b.M0(R.raw.add_new_item);
            v0.e(fVar.f11013d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
            Q.b(87, o.getAccountObject().getId(), (long) 1);
        } else {
            b.w(false);
            if (!cVar.isMaterialCountsEnough) {
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.do_not_have_converting_requirements, fVar.f11013d0, (String) null);
            } else {
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error, fVar.f11013d0, (String) null);
            }
        }
        fVar.f11031w0 = false;
    }

    public void u(C0587c cVar) {
        int i2;
        C0587c cVar2 = cVar;
        Class<j> cls = j.class;
        int i5 = this.f246b;
        Object obj = this.f247c;
        switch (this.f245a) {
            case 2:
                j jVar = (j) cVar2.f(cls);
                l lVar = (l) obj;
                if (jVar == null) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_player_now, ((K4.k) lVar.f247c).f1553d0, (String) null);
                    ((K4.k) lVar.f247c).X0 = false;
                    return;
                } else if (jVar.getCurrentPlace() == 1) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_player_in_hospital, ((K4.k) lVar.f247c).f1553d0, (String) null);
                    ((K4.k) lVar.f247c).X0 = false;
                    return;
                } else if (jVar.getCurrentPlace() == 2) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_player_in_prison, ((K4.k) lVar.f247c).f1553d0, (String) null);
                    ((K4.k) lVar.f247c).X0 = false;
                    return;
                } else if (jVar.getCurrentPlace() == 3) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_player_in_plane, ((K4.k) lVar.f247c).f1553d0, (String) null);
                    ((K4.k) lVar.f247c).X0 = false;
                    return;
                } else if (jVar.getCurrentPlace() == 4) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_player_in_tunnel, ((K4.k) lVar.f247c).f1553d0, (String) null);
                    ((K4.k) lVar.f247c).X0 = false;
                    return;
                } else if (jVar.getCurrentPlace() != 0) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_player_now, ((K4.k) lVar.f247c).f1553d0, (String) null);
                    ((K4.k) lVar.f247c).X0 = false;
                    return;
                } else if (i5 == jVar.getCurrentCity()) {
                    d.m1(0, -lVar.f246b, false, new U3.c((Object) this, 16));
                    return;
                } else {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_player_not_in_same_city, ((K4.k) lVar.f247c).f1553d0, (String) null);
                    ((K4.k) lVar.f247c).X0 = false;
                    return;
                }
            case 3:
                j jVar2 = (j) cVar2.f(cls);
                K4.k kVar = (K4.k) obj;
                if (jVar2 == null) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_from_your_state, kVar.f1553d0, (String) null);
                    kVar.X0 = false;
                    return;
                } else if (jVar2.getCurrentPlace() == 1) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_from_hospital, kVar.f1553d0, (String) null);
                    kVar.X0 = false;
                    return;
                } else if (jVar2.getCurrentPlace() == 2) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_from_prison, kVar.f1553d0, (String) null);
                    kVar.X0 = false;
                    return;
                } else if (jVar2.getCurrentPlace() == 3) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_from_plane, kVar.f1553d0, (String) null);
                    kVar.X0 = false;
                    return;
                } else if (jVar2.getCurrentPlace() == 4) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_from_tunnel, kVar.f1553d0, (String) null);
                    kVar.X0 = false;
                    return;
                } else if (jVar2.getCurrentPlace() == 0) {
                    kVar.f1544Q0.E("locationObject").d(new l((Object) this, jVar2.getCurrentCity(), 2));
                    return;
                } else {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_fight_from_your_state, kVar.f1553d0, (String) null);
                    kVar.X0 = false;
                    return;
                }
            case 23:
                j jVar3 = (j) cVar2.f(cls);
                f fVar = (f) obj;
                if (jVar3 == null) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_fight_player_now, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
                    C0626h hVar = (C0626h) fVar.d;
                    hVar.f9019c = false;
                    hVar.remove((Y4.i) fVar.f30c);
                    hVar.notifyDataSetChanged();
                    return;
                } else if (jVar3.getCurrentPlace() == 1) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_fight_player_in_hospital, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
                    C0626h hVar2 = (C0626h) fVar.d;
                    hVar2.f9019c = false;
                    hVar2.remove((Y4.i) fVar.f30c);
                    hVar2.notifyDataSetChanged();
                    return;
                } else if (jVar3.getCurrentPlace() == 2) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_fight_player_in_prison, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
                    C0626h hVar3 = (C0626h) fVar.d;
                    hVar3.f9019c = false;
                    hVar3.remove((Y4.i) fVar.f30c);
                    hVar3.notifyDataSetChanged();
                    return;
                } else if (jVar3.getCurrentPlace() == 3) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_fight_player_in_plane, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
                    C0626h hVar4 = (C0626h) fVar.d;
                    hVar4.f9019c = false;
                    hVar4.remove((Y4.i) fVar.f30c);
                    hVar4.notifyDataSetChanged();
                    return;
                } else if (jVar3.getCurrentPlace() == 4) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_fight_player_in_tunnel, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
                    C0626h hVar5 = (C0626h) fVar.d;
                    hVar5.f9019c = false;
                    hVar5.remove((Y4.i) fVar.f30c);
                    hVar5.notifyDataSetChanged();
                    return;
                } else if (jVar3.getCurrentPlace() != 0) {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_fight_player_now, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
                    C0626h hVar6 = (C0626h) fVar.d;
                    hVar6.f9019c = false;
                    hVar6.remove((Y4.i) fVar.f30c);
                    hVar6.notifyDataSetChanged();
                    return;
                } else if (i5 == jVar3.getCurrentCity()) {
                    int i6 = fVar.f29b;
                    d.m1(0, -i6, false, new C0445o((Object) this, (Object) (Y4.i) fVar.f30c, i6));
                    return;
                } else {
                    b.w(false);
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_fight_player_not_in_same_city, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
                    C0626h hVar7 = (C0626h) fVar.d;
                    hVar7.f9019c = false;
                    hVar7.remove((Y4.i) fVar.f30c);
                    hVar7.notifyDataSetChanged();
                    return;
                }
            default:
                try {
                    i2 = ((Integer) cVar2.f(Integer.class)).intValue();
                } catch (Exception e6) {
                    int i7 = j4.r.d;
                    com.google.android.gms.internal.measurement.a.q("Exception from try-catch block inside ", "r", " in collectRewards method.", e6, "r");
                    i2 = -1;
                }
                if (i2 != -1) {
                    j4.r rVar = (j4.r) obj;
                    if (i2 < ((Y4.q) rVar.getItem(i5)).f4414a) {
                        b.w(false);
                        c.s0(rVar.f9083b, MyApplication.f7090a.getApplicationContext().getString(R.string.not_reach_the_level_needed), (String) null);
                        return;
                    }
                    K k6 = new K(this, 24);
                    ArrayList arrayList = b0.f7394a;
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "prizeObject", "levelRewardsCollectState").E(String.valueOf(i5)).H(new I(k6, 7));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ l(Object obj, int i2, int i5) {
        this.f245a = i5;
        this.f247c = obj;
        this.f246b = i2;
    }

    public l() {
        this.f245a = 4;
        this.f247c = Bitmap.CompressFormat.JPEG;
        this.f246b = 100;
    }

    public l(Context context) {
        this.f245a = 19;
        int g = C0515f.g(context, 0);
        this.f247c = new C0511b(new ContextThemeWrapper(context, C0515f.g(context, g)));
        this.f246b = g;
    }

    private final void e(C0588d dVar) {
    }

    private final void k(C0588d dVar) {
    }

    private final void m(C0588d dVar) {
    }

    private final void n(C0588d dVar) {
    }
}
