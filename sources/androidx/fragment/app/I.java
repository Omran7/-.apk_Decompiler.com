package androidx.fragment.app;

import B0.C0004c;
import B0.C0009h;
import I1.b;
import S3.z;
import X4.d;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.B;
import androidx.activity.C;
import androidx.activity.C0268c;
import androidx.lifecycle.C0303n;
import c.C0333h;
import com.mtma.criminal.city.R;
import h0.C0552a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.j;

public final class I {

    /* renamed from: A  reason: collision with root package name */
    public C0333h f4986A;

    /* renamed from: B  reason: collision with root package name */
    public C0333h f4987B;

    /* renamed from: C  reason: collision with root package name */
    public ArrayDeque f4988C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f4989D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f4990E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f4991G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f4992H;

    /* renamed from: I  reason: collision with root package name */
    public ArrayList f4993I;

    /* renamed from: J  reason: collision with root package name */
    public ArrayList f4994J;

    /* renamed from: K  reason: collision with root package name */
    public ArrayList f4995K;

    /* renamed from: L  reason: collision with root package name */
    public K f4996L;

    /* renamed from: M  reason: collision with root package name */
    public final C0004c f4997M;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4998a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f4999b;

    /* renamed from: c  reason: collision with root package name */
    public final z f5000c = new z(9);
    public ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f5001e;

    /* renamed from: f  reason: collision with root package name */
    public final y f5002f = new y(this);
    public B g;
    public final C h = new C(this);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f5003i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map f5004j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map f5005k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final d f5006l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList f5007m;

    /* renamed from: n  reason: collision with root package name */
    public final z f5008n;

    /* renamed from: o  reason: collision with root package name */
    public final z f5009o;

    /* renamed from: p  reason: collision with root package name */
    public final z f5010p;

    /* renamed from: q  reason: collision with root package name */
    public final z f5011q;

    /* renamed from: r  reason: collision with root package name */
    public final B f5012r;

    /* renamed from: s  reason: collision with root package name */
    public int f5013s;

    /* renamed from: t  reason: collision with root package name */
    public C0288u f5014t;

    /* renamed from: u  reason: collision with root package name */
    public b f5015u;

    /* renamed from: v  reason: collision with root package name */
    public C0286s f5016v;

    /* renamed from: w  reason: collision with root package name */
    public C0286s f5017w;

    /* renamed from: x  reason: collision with root package name */
    public final C f5018x;

    /* renamed from: y  reason: collision with root package name */
    public final D f5019y;

    /* renamed from: z  reason: collision with root package name */
    public C0333h f5020z;

    public I() {
        Collections.synchronizedMap(new HashMap());
        this.f5006l = new d(this);
        this.f5007m = new CopyOnWriteArrayList();
        this.f5008n = new z(this, 0);
        this.f5009o = new z(this, 1);
        this.f5010p = new z(this, 2);
        this.f5011q = new z(this, 3);
        this.f5012r = new B(this);
        this.f5013s = -1;
        this.f5018x = new C(this);
        this.f5019y = new D(0);
        this.f4988C = new ArrayDeque();
        this.f4997M = new C0004c((Object) this, 18);
    }

    public static boolean F(C0286s sVar) {
        sVar.getClass();
        Iterator it2 = sVar.f5149C.f5000c.u().iterator();
        boolean z3 = false;
        while (it2.hasNext()) {
            C0286s sVar2 = (C0286s) it2.next();
            if (sVar2 != null) {
                z3 = F(sVar2);
                continue;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(C0286s sVar) {
        if (sVar == null) {
            return true;
        }
        if (!sVar.f5156K || (sVar.f5147A != null && !H(sVar.f5150D))) {
            return false;
        }
        return true;
    }

    public static boolean I(C0286s sVar) {
        if (sVar == null) {
            return true;
        }
        I i2 = sVar.f5147A;
        if (!sVar.equals(i2.f5017w) || !I(i2.f5016v)) {
            return false;
        }
        return true;
    }

    public static void X(C0286s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + sVar);
        }
        if (sVar.f5153H) {
            sVar.f5153H = false;
            sVar.f5163R = !sVar.f5163R;
        }
    }

    public final C0286s A(String str) {
        z zVar = this.f5000c;
        ArrayList arrayList = (ArrayList) zVar.f2711b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0286s sVar = (C0286s) arrayList.get(size);
            if (sVar != null && str.equals(sVar.f5152G)) {
                return sVar;
            }
        }
        for (O o6 : ((HashMap) zVar.f2712c).values()) {
            if (o6 != null) {
                C0286s sVar2 = o6.f5048c;
                if (str.equals(sVar2.f5152G)) {
                    return sVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup B(C0286s sVar) {
        ViewGroup viewGroup = sVar.f5158M;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (sVar.F > 0 && this.f5015u.y0()) {
            View v02 = this.f5015u.v0(sVar.F);
            if (v02 instanceof ViewGroup) {
                return (ViewGroup) v02;
            }
        }
        return null;
    }

    public final C C() {
        C0286s sVar = this.f5016v;
        if (sVar != null) {
            return sVar.f5147A.C();
        }
        return this.f5018x;
    }

    public final D D() {
        C0286s sVar = this.f5016v;
        if (sVar != null) {
            return sVar.f5147A.D();
        }
        return this.f5019y;
    }

    public final void E(C0286s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + sVar);
        }
        if (!sVar.f5153H) {
            sVar.f5153H = true;
            sVar.f5163R = true ^ sVar.f5163R;
            W(sVar);
        }
    }

    public final boolean G() {
        C0286s sVar = this.f5016v;
        if (sVar == null) {
            return true;
        }
        if (!sVar.v() || !this.f5016v.p().G()) {
            return false;
        }
        return true;
    }

    public final void J(int i2, boolean z3) {
        HashMap hashMap;
        C0288u uVar;
        if (this.f5014t == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z3 || i2 != this.f5013s) {
            this.f5013s = i2;
            z zVar = this.f5000c;
            Iterator it2 = ((ArrayList) zVar.f2711b).iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                hashMap = (HashMap) zVar.f2712c;
                if (!hasNext) {
                    break;
                }
                O o6 = (O) hashMap.get(((C0286s) it2.next()).f5177e);
                if (o6 != null) {
                    o6.k();
                }
            }
            for (O o7 : hashMap.values()) {
                if (o7 != null) {
                    o7.k();
                    C0286s sVar = o7.f5048c;
                    if (sVar.f5184u && !sVar.x()) {
                        zVar.B(o7);
                    }
                }
            }
            Y();
            if (this.f4989D && (uVar = this.f5014t) != null && this.f5013s == 7) {
                uVar.f5196t.invalidateOptionsMenu();
                this.f4989D = false;
            }
        }
    }

    public final void K() {
        if (this.f5014t != null) {
            this.f4990E = false;
            this.F = false;
            this.f4996L.f5031i = false;
            for (C0286s sVar : this.f5000c.v()) {
                if (sVar != null) {
                    sVar.f5149C.K();
                }
            }
        }
    }

    public final boolean L() {
        return M(-1, 0);
    }

    public final boolean M(int i2, int i5) {
        x(false);
        w(true);
        C0286s sVar = this.f5017w;
        if (sVar != null && i2 < 0 && sVar.m().L()) {
            return true;
        }
        boolean N6 = N(i2, i5, this.f4993I, this.f4994J);
        if (N6) {
            this.f4999b = true;
            try {
                P(this.f4993I, this.f4994J);
            } finally {
                d();
            }
        }
        a0();
        if (this.f4992H) {
            this.f4992H = false;
            Y();
        }
        ((HashMap) this.f5000c.f2712c).values().removeAll(Collections.singleton((Object) null));
        return N6;
    }

    public final boolean N(int i2, int i5, ArrayList arrayList, ArrayList arrayList2) {
        boolean z3;
        if ((i5 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList3 = this.d;
        int i6 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i2 < 0) {
                i6 = z3 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    C0269a aVar = (C0269a) this.d.get(size);
                    if (i2 >= 0 && i2 == aVar.f5084s) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z3) {
                        while (size > 0) {
                            C0269a aVar2 = (C0269a) this.d.get(size - 1);
                            if (i2 < 0 || i2 != aVar2.f5084s) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.d.size() - 1) {
                        size++;
                    }
                }
                i6 = size;
            }
        }
        if (i6 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i6; size2--) {
            arrayList.add((C0269a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(C0286s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + sVar + " nesting=" + sVar.f5189z);
        }
        boolean x6 = sVar.x();
        if (!sVar.f5154I || !x6) {
            z zVar = this.f5000c;
            synchronized (((ArrayList) zVar.f2711b)) {
                ((ArrayList) zVar.f2711b).remove(sVar);
            }
            sVar.f5183t = false;
            if (F(sVar)) {
                this.f4989D = true;
            }
            sVar.f5184u = true;
            W(sVar);
        }
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i5 = 0;
                while (i2 < size) {
                    if (!((C0269a) arrayList.get(i2)).f5081p) {
                        if (i5 != i2) {
                            y(i5, i2, arrayList, arrayList2);
                        }
                        i5 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0269a) arrayList.get(i5)).f5081p) {
                                i5++;
                            }
                        }
                        y(i2, i5, arrayList, arrayList2);
                        i2 = i5 - 1;
                    }
                    i2++;
                }
                if (i5 != size) {
                    y(i5, size, arrayList, arrayList2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [androidx.fragment.app.P, java.lang.Object] */
    public final void Q(Parcelable parcelable) {
        int i2;
        d dVar;
        int i5;
        boolean z3;
        O o6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String next : bundle3.keySet()) {
            if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                bundle2.setClassLoader(this.f5014t.f5193q.getClassLoader());
                this.f5005k.put(next.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String next2 : bundle3.keySet()) {
            if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                bundle.setClassLoader(this.f5014t.f5193q.getClassLoader());
                arrayList.add((M) bundle.getParcelable("state"));
            }
        }
        z zVar = this.f5000c;
        HashMap hashMap = (HashMap) zVar.d;
        hashMap.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            M m6 = (M) it2.next();
            hashMap.put(m6.f5033b, m6);
        }
        J j6 = (J) bundle3.getParcelable("state");
        if (j6 != null) {
            HashMap hashMap2 = (HashMap) zVar.f2712c;
            hashMap2.clear();
            Iterator it3 = j6.f5021a.iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                i2 = 2;
                dVar = this.f5006l;
                if (!hasNext) {
                    break;
                }
                M m7 = (M) ((HashMap) zVar.d).remove((String) it3.next());
                if (m7 != null) {
                    C0286s sVar = (C0286s) this.f4996L.d.get(m7.f5033b);
                    if (sVar != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + sVar);
                        }
                        o6 = new O(dVar, zVar, sVar, m7);
                    } else {
                        o6 = new O(this.f5006l, this.f5000c, this.f5014t.f5193q.getClassLoader(), C(), m7);
                    }
                    C0286s sVar2 = o6.f5048c;
                    sVar2.f5147A = this;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + sVar2.f5177e + "): " + sVar2);
                    }
                    o6.m(this.f5014t.f5193q.getClassLoader());
                    zVar.z(o6);
                    o6.f5049e = this.f5013s;
                }
            }
            K k6 = this.f4996L;
            k6.getClass();
            Iterator it4 = new ArrayList(k6.d.values()).iterator();
            while (it4.hasNext()) {
                C0286s sVar3 = (C0286s) it4.next();
                if (hashMap2.get(sVar3.f5177e) == null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + sVar3 + " that was not found in the set of active Fragments " + j6.f5021a);
                    }
                    this.f4996L.e(sVar3);
                    sVar3.f5147A = this;
                    O o7 = new O(dVar, zVar, sVar3);
                    o7.f5049e = 1;
                    o7.k();
                    sVar3.f5184u = true;
                    o7.k();
                }
            }
            ArrayList<String> arrayList2 = j6.f5022b;
            ((ArrayList) zVar.f2711b).clear();
            if (arrayList2 != null) {
                for (String str : arrayList2) {
                    C0286s q6 = zVar.q(str);
                    if (q6 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + q6);
                        }
                        zVar.e(q6);
                    } else {
                        throw new IllegalStateException(C0552a.o("No instantiated fragment for (", str, ")"));
                    }
                }
            }
            if (j6.f5023c != null) {
                this.d = new ArrayList(j6.f5023c.length);
                int i6 = 0;
                while (true) {
                    C0270b[] bVarArr = j6.f5023c;
                    if (i6 >= bVarArr.length) {
                        break;
                    }
                    C0270b bVar = bVarArr[i6];
                    bVar.getClass();
                    C0269a aVar = new C0269a(this);
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        int[] iArr = bVar.f5085a;
                        if (i7 >= iArr.length) {
                            break;
                        }
                        ? obj = new Object();
                        int i9 = i7 + 1;
                        obj.f5050a = iArr[i7];
                        if (Log.isLoggable("FragmentManager", i2)) {
                            Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i8 + " base fragment #" + iArr[i9]);
                        }
                        obj.h = C0303n.values()[bVar.f5087c[i8]];
                        obj.f5055i = C0303n.values()[bVar.d[i8]];
                        int i10 = i7 + 2;
                        if (iArr[i9] != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        obj.f5052c = z3;
                        int i11 = iArr[i10];
                        obj.d = i11;
                        int i12 = iArr[i7 + 3];
                        obj.f5053e = i12;
                        int i13 = i7 + 5;
                        int i14 = iArr[i7 + 4];
                        obj.f5054f = i14;
                        i7 += 6;
                        int i15 = iArr[i13];
                        obj.g = i15;
                        aVar.f5070b = i11;
                        aVar.f5071c = i12;
                        aVar.d = i14;
                        aVar.f5072e = i15;
                        aVar.b(obj);
                        i8++;
                        i2 = 2;
                    }
                    aVar.f5073f = bVar.f5088e;
                    aVar.f5074i = bVar.f5089f;
                    aVar.g = true;
                    aVar.f5075j = bVar.f5091q;
                    aVar.f5076k = bVar.f5092r;
                    aVar.f5077l = bVar.f5093s;
                    aVar.f5078m = bVar.f5094t;
                    aVar.f5079n = bVar.f5095u;
                    aVar.f5080o = bVar.f5096v;
                    aVar.f5081p = bVar.f5097w;
                    aVar.f5084s = bVar.f5090p;
                    int i16 = 0;
                    while (true) {
                        ArrayList arrayList3 = bVar.f5086b;
                        if (i16 >= arrayList3.size()) {
                            break;
                        }
                        String str2 = (String) arrayList3.get(i16);
                        if (str2 != null) {
                            ((P) aVar.f5069a.get(i16)).f5051b = zVar.q(str2);
                        }
                        i16++;
                    }
                    aVar.d(1);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder s6 = C0552a.s(i6, "restoreAllState: back stack #", " (index ");
                        s6.append(aVar.f5084s);
                        s6.append("): ");
                        s6.append(aVar);
                        Log.v("FragmentManager", s6.toString());
                        PrintWriter printWriter = new PrintWriter(new S());
                        aVar.g("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.d.add(aVar);
                    i6++;
                    i2 = 2;
                }
                i5 = 0;
            } else {
                i5 = 0;
                this.d = null;
            }
            this.f5003i.set(j6.d);
            String str3 = j6.f5024e;
            if (str3 != null) {
                C0286s q7 = zVar.q(str3);
                this.f5017w = q7;
                q(q7);
            }
            ArrayList arrayList4 = j6.f5025f;
            if (arrayList4 != null) {
                for (int i17 = i5; i17 < arrayList4.size(); i17++) {
                    this.f5004j.put((String) arrayList4.get(i17), (C0271c) j6.f5026p.get(i17));
                }
            }
            this.f4988C = new ArrayDeque(j6.f5027q);
        }
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.os.Parcelable, java.lang.Object, androidx.fragment.app.J] */
    public final Bundle R() {
        int i2;
        ArrayList arrayList;
        C0270b[] bVarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it2 = e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0276h hVar = (C0276h) it2.next();
            if (hVar.f5112e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                hVar.f5112e = false;
                hVar.c();
            }
        }
        Iterator it3 = e().iterator();
        while (it3.hasNext()) {
            ((C0276h) it3.next()).e();
        }
        x(true);
        this.f4990E = true;
        this.f4996L.f5031i = true;
        z zVar = this.f5000c;
        zVar.getClass();
        HashMap hashMap = (HashMap) zVar.f2712c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it4 = hashMap.values().iterator();
        while (true) {
            Bundle bundle2 = null;
            if (!it4.hasNext()) {
                break;
            }
            O o6 = (O) it4.next();
            if (o6 != null) {
                C0286s sVar = o6.f5048c;
                M m6 = new M(sVar);
                if (sVar.f5172a <= -1 || m6.f5043v != null) {
                    m6.f5043v = sVar.f5174b;
                } else {
                    Bundle bundle3 = new Bundle();
                    sVar.J(bundle3);
                    sVar.f5170Y.g(bundle3);
                    bundle3.putParcelable("android:support:fragments", sVar.f5149C.R());
                    o6.f5046a.r(false);
                    if (!bundle3.isEmpty()) {
                        bundle2 = bundle3;
                    }
                    if (sVar.f5159N != null) {
                        o6.o();
                    }
                    if (sVar.f5176c != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", sVar.f5176c);
                    }
                    if (sVar.d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", sVar.d);
                    }
                    if (!sVar.f5161P) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", sVar.f5161P);
                    }
                    m6.f5043v = bundle2;
                    if (sVar.f5180q != null) {
                        if (bundle2 == null) {
                            m6.f5043v = new Bundle();
                        }
                        m6.f5043v.putString("android:target_state", sVar.f5180q);
                        int i5 = sVar.f5181r;
                        if (i5 != 0) {
                            m6.f5043v.putInt("android:target_req_state", i5);
                        }
                    }
                }
                M m7 = (M) ((HashMap) o6.f5047b.d).put(sVar.f5177e, m6);
                C0286s sVar2 = o6.f5048c;
                arrayList2.add(sVar2.f5177e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + sVar2 + ": " + sVar2.f5174b);
                }
            }
        }
        z zVar2 = this.f5000c;
        zVar2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) zVar2.d).values());
        if (!arrayList3.isEmpty()) {
            z zVar3 = this.f5000c;
            synchronized (((ArrayList) zVar3.f2711b)) {
                try {
                    if (((ArrayList) zVar3.f2711b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) zVar3.f2711b).size());
                        Iterator it5 = ((ArrayList) zVar3.f2711b).iterator();
                        while (it5.hasNext()) {
                            C0286s sVar3 = (C0286s) it5.next();
                            arrayList.add(sVar3.f5177e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + sVar3.f5177e + "): " + sVar3);
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            ArrayList arrayList4 = this.d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                bVarArr = null;
            } else {
                bVarArr = new C0270b[size];
                for (i2 = 0; i2 < size; i2++) {
                    bVarArr[i2] = new C0270b((C0269a) this.d.get(i2));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder s6 = C0552a.s(i2, "saveAllState: adding back stack #", ": ");
                        s6.append(this.d.get(i2));
                        Log.v("FragmentManager", s6.toString());
                    }
                }
            }
            ? obj = new Object();
            obj.f5024e = null;
            ArrayList arrayList5 = new ArrayList();
            obj.f5025f = arrayList5;
            ArrayList arrayList6 = new ArrayList();
            obj.f5026p = arrayList6;
            obj.f5021a = arrayList2;
            obj.f5022b = arrayList;
            obj.f5023c = bVarArr;
            obj.d = this.f5003i.get();
            C0286s sVar4 = this.f5017w;
            if (sVar4 != null) {
                obj.f5024e = sVar4.f5177e;
            }
            arrayList5.addAll(this.f5004j.keySet());
            arrayList6.addAll(this.f5004j.values());
            obj.f5027q = new ArrayList(this.f4988C);
            bundle.putParcelable("state", obj);
            for (String str : this.f5005k.keySet()) {
                bundle.putBundle(o3.d.i("result_", str), (Bundle) this.f5005k.get(str));
            }
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                M m8 = (M) it6.next();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", m8);
                bundle.putBundle("fragment_" + m8.f5033b, bundle4);
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final void S() {
        synchronized (this.f4998a) {
            try {
                if (this.f4998a.size() == 1) {
                    this.f5014t.f5194r.removeCallbacks(this.f4997M);
                    this.f5014t.f5194r.post(this.f4997M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(C0286s sVar, boolean z3) {
        ViewGroup B6 = B(sVar);
        if (B6 != null && (B6 instanceof FragmentContainerView)) {
            ((FragmentContainerView) B6).setDrawDisappearingViewsLast(!z3);
        }
    }

    public final void U(C0286s sVar, C0303n nVar) {
        if (!sVar.equals(this.f5000c.q(sVar.f5177e)) || !(sVar.f5148B == null || sVar.f5147A == this)) {
            throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
        }
        sVar.f5166U = nVar;
    }

    public final void V(C0286s sVar) {
        if (sVar != null) {
            if (!sVar.equals(this.f5000c.q(sVar.f5177e)) || !(sVar.f5148B == null || sVar.f5147A == this)) {
                throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        C0286s sVar2 = this.f5017w;
        this.f5017w = sVar;
        q(sVar2);
        q(this.f5017w);
    }

    public final void W(C0286s sVar) {
        int i2;
        int i5;
        int i6;
        int i7;
        ViewGroup B6 = B(sVar);
        if (B6 != null) {
            C0285q qVar = sVar.f5162Q;
            boolean z3 = false;
            if (qVar == null) {
                i2 = 0;
            } else {
                i2 = qVar.f5139b;
            }
            if (qVar == null) {
                i5 = 0;
            } else {
                i5 = qVar.f5140c;
            }
            int i8 = i5 + i2;
            if (qVar == null) {
                i6 = 0;
            } else {
                i6 = qVar.d;
            }
            int i9 = i6 + i8;
            if (qVar == null) {
                i7 = 0;
            } else {
                i7 = qVar.f5141e;
            }
            if (i7 + i9 > 0) {
                if (B6.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    B6.setTag(R.id.visible_removing_fragment_view_tag, sVar);
                }
                C0286s sVar2 = (C0286s) B6.getTag(R.id.visible_removing_fragment_view_tag);
                C0285q qVar2 = sVar.f5162Q;
                if (qVar2 != null) {
                    z3 = qVar2.f5138a;
                }
                if (sVar2.f5162Q != null) {
                    sVar2.k().f5138a = z3;
                }
            }
        }
    }

    public final void Y() {
        Iterator it2 = this.f5000c.t().iterator();
        while (it2.hasNext()) {
            O o6 = (O) it2.next();
            C0286s sVar = o6.f5048c;
            if (sVar.f5160O) {
                if (this.f4999b) {
                    this.f4992H = true;
                } else {
                    sVar.f5160O = false;
                    o6.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new S());
        C0288u uVar = this.f5014t;
        if (uVar != null) {
            try {
                uVar.f5196t.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e6) {
                Log.e("FragmentManager", "Failed dumping state", e6);
            }
        } else {
            try {
                u("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
            }
        }
        throw illegalStateException;
    }

    public final O a(C0286s sVar) {
        String str = sVar.f5165T;
        if (str != null) {
            Z.d.c(sVar, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + sVar);
        }
        O f6 = f(sVar);
        sVar.f5147A = this;
        z zVar = this.f5000c;
        zVar.z(f6);
        if (!sVar.f5154I) {
            zVar.e(sVar);
            sVar.f5184u = false;
            if (sVar.f5159N == null) {
                sVar.f5163R = false;
            }
            if (F(sVar)) {
                this.f4989D = true;
            }
        }
        return f6;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [x5.a, kotlin.jvm.internal.i] */
    /* JADX WARNING: type inference failed for: r1v10, types: [x5.a, kotlin.jvm.internal.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        r0 = r4.h;
        r1 = r4.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r1 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r1 <= 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (I(r4.f5016v) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r0.f4604a = r2;
        r0 = r0.f4606c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r0 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a0() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f4998a
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.f4998a     // Catch:{ all -> 0x0019 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0019 }
            r2 = 1
            if (r1 != 0) goto L_0x001b
            androidx.activity.C r1 = r4.h     // Catch:{ all -> 0x0019 }
            r1.f4604a = r2     // Catch:{ all -> 0x0019 }
            kotlin.jvm.internal.i r1 = r1.f4606c     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0017
            r1.invoke()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r1 = move-exception
            goto L_0x003f
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            androidx.activity.C r0 = r4.h
            java.util.ArrayList r1 = r4.d
            r3 = 0
            if (r1 == 0) goto L_0x0028
            int r1 = r1.size()
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 <= 0) goto L_0x0034
            androidx.fragment.app.s r1 = r4.f5016v
            boolean r1 = I(r1)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = r3
        L_0x0035:
            r0.f4604a = r2
            kotlin.jvm.internal.i r0 = r0.f4606c
            if (r0 == 0) goto L_0x003e
            r0.invoke()
        L_0x003e:
            return
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.I.a0():void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.fragment.app.s] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.C0288u r5, I1.b r6, androidx.fragment.app.C0286s r7) {
        /*
            r4 = this;
            androidx.fragment.app.u r0 = r4.f5014t
            if (r0 != 0) goto L_0x0193
            r4.f5014t = r5
            r4.f5015u = r6
            r4.f5016v = r7
            java.util.concurrent.CopyOnWriteArrayList r6 = r4.f5007m
            if (r7 == 0) goto L_0x0017
            androidx.fragment.app.E r0 = new androidx.fragment.app.E
            r0.<init>(r7)
            r6.add(r0)
            goto L_0x001c
        L_0x0017:
            if (r5 == 0) goto L_0x001c
            r6.add(r5)
        L_0x001c:
            androidx.fragment.app.s r6 = r4.f5016v
            if (r6 == 0) goto L_0x0023
            r4.a0()
        L_0x0023:
            if (r5 == 0) goto L_0x0037
            androidx.fragment.app.v r6 = r5.f5196t
            androidx.activity.B r6 = r6.i()
            r4.g = r6
            if (r7 == 0) goto L_0x0031
            r0 = r7
            goto L_0x0032
        L_0x0031:
            r0 = r5
        L_0x0032:
            androidx.activity.C r1 = r4.h
            r6.a(r0, r1)
        L_0x0037:
            r6 = 0
            if (r7 == 0) goto L_0x0059
            androidx.fragment.app.I r5 = r7.f5147A
            androidx.fragment.app.K r5 = r5.f4996L
            java.util.HashMap r0 = r5.f5029e
            java.lang.String r1 = r7.f5177e
            java.lang.Object r1 = r0.get(r1)
            androidx.fragment.app.K r1 = (androidx.fragment.app.K) r1
            if (r1 != 0) goto L_0x0056
            androidx.fragment.app.K r1 = new androidx.fragment.app.K
            boolean r5 = r5.g
            r1.<init>(r5)
            java.lang.String r5 = r7.f5177e
            r0.put(r5, r1)
        L_0x0056:
            r4.f4996L = r1
            goto L_0x008e
        L_0x0059:
            if (r5 == 0) goto L_0x0087
            androidx.fragment.app.v r5 = r5.f5196t
            androidx.lifecycle.T r5 = r5.e()
            B0.h r0 = new B0.h
            androidx.emoji2.text.v r1 = androidx.fragment.app.K.f5028j
            r0.<init>((androidx.lifecycle.T) r5, (androidx.lifecycle.S) r1)
            java.lang.Class<androidx.fragment.app.K> r5 = androidx.fragment.app.K.class
            java.lang.String r1 = r5.getCanonicalName()
            if (r1 == 0) goto L_0x007f
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = r2.concat(r1)
            androidx.lifecycle.O r5 = r0.v(r5, r1)
            androidx.fragment.app.K r5 = (androidx.fragment.app.K) r5
            r4.f4996L = r5
            goto L_0x008e
        L_0x007f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x0087:
            androidx.fragment.app.K r5 = new androidx.fragment.app.K
            r5.<init>(r6)
            r4.f4996L = r5
        L_0x008e:
            androidx.fragment.app.K r5 = r4.f4996L
            boolean r0 = r4.f4990E
            if (r0 != 0) goto L_0x0098
            boolean r0 = r4.F
            if (r0 == 0) goto L_0x0099
        L_0x0098:
            r6 = 1
        L_0x0099:
            r5.f5031i = r6
            S3.z r6 = r4.f5000c
            r6.f2713e = r5
            androidx.fragment.app.u r5 = r4.f5014t
            if (r5 == 0) goto L_0x00bd
            if (r7 != 0) goto L_0x00bd
            k.t r5 = r5.a()
            androidx.activity.f r6 = new androidx.activity.f
            r0 = 2
            r6.<init>(r4, r0)
            java.lang.String r0 = "android:support:fragments"
            r5.f(r0, r6)
            android.os.Bundle r5 = r5.c(r0)
            if (r5 == 0) goto L_0x00bd
            r4.Q(r5)
        L_0x00bd:
            androidx.fragment.app.u r5 = r4.f5014t
            if (r5 == 0) goto L_0x0126
            androidx.fragment.app.v r5 = r5.f5196t
            if (r7 == 0) goto L_0x00d3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r7.f5177e
            java.lang.String r1 = ":"
            java.lang.String r6 = h0.C0552a.r(r6, r0, r1)
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r6 = ""
        L_0x00d5:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r6 = o3.d.i(r0, r6)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = o3.d.f(r6, r0)
            W0.u r1 = new W0.u
            r2 = 4
            r1.<init>(r2)
            T1.A r2 = new T1.A
            r3 = 15
            r2.<init>((java.lang.Object) r4, (int) r3)
            androidx.activity.m r5 = r5.f4649r
            c.h r0 = r5.c(r0, r1, r2)
            r4.f5020z = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = o3.d.f(r6, r0)
            W0.u r1 = new W0.u
            r2 = 1
            r1.<init>(r2)
            androidx.fragment.app.A r2 = new androidx.fragment.app.A
            r3 = 1
            r2.<init>(r4, r3)
            c.h r0 = r5.c(r0, r1, r2)
            r4.f4986A = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r6 = o3.d.f(r6, r0)
            W0.u r0 = new W0.u
            r1 = 3
            r0.<init>(r1)
            androidx.fragment.app.A r1 = new androidx.fragment.app.A
            r2 = 0
            r1.<init>(r4, r2)
            c.h r5 = r5.c(r6, r0, r1)
            r4.f4987B = r5
        L_0x0126:
            androidx.fragment.app.u r5 = r4.f5014t
            if (r5 == 0) goto L_0x0131
            androidx.fragment.app.v r5 = r5.f5196t
            androidx.fragment.app.z r6 = r4.f5008n
            r5.f(r6)
        L_0x0131:
            androidx.fragment.app.u r5 = r4.f5014t
            if (r5 == 0) goto L_0x0146
            androidx.fragment.app.v r5 = r5.f5196t
            androidx.fragment.app.z r6 = r4.f5009o
            r5.getClass()
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.j.e(r6, r0)
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f4651t
            r5.add(r6)
        L_0x0146:
            androidx.fragment.app.u r5 = r4.f5014t
            if (r5 == 0) goto L_0x015b
            androidx.fragment.app.v r5 = r5.f5196t
            androidx.fragment.app.z r6 = r4.f5010p
            r5.getClass()
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.j.e(r6, r0)
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f4653v
            r5.add(r6)
        L_0x015b:
            androidx.fragment.app.u r5 = r4.f5014t
            if (r5 == 0) goto L_0x0170
            androidx.fragment.app.v r5 = r5.f5196t
            androidx.fragment.app.z r6 = r4.f5011q
            r5.getClass()
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.j.e(r6, r0)
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.f4654w
            r5.add(r6)
        L_0x0170:
            androidx.fragment.app.u r5 = r4.f5014t
            if (r5 == 0) goto L_0x0192
            if (r7 != 0) goto L_0x0192
            androidx.fragment.app.v r5 = r5.f5196t
            androidx.fragment.app.B r6 = r4.f5012r
            r5.getClass()
            java.lang.String r7 = "provider"
            kotlin.jvm.internal.j.e(r6, r7)
            B0.h r5 = r5.f4644c
            java.lang.Object r7 = r5.f229c
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            r7.add(r6)
            java.lang.Object r5 = r5.f228b
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
        L_0x0192:
            return
        L_0x0193:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.I.b(androidx.fragment.app.u, I1.b, androidx.fragment.app.s):void");
    }

    public final void c(C0286s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + sVar);
        }
        if (sVar.f5154I) {
            sVar.f5154I = false;
            if (!sVar.f5183t) {
                this.f5000c.e(sVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "add from attach: " + sVar);
                }
                if (F(sVar)) {
                    this.f4989D = true;
                }
            }
        }
    }

    public final void d() {
        this.f4999b = false;
        this.f4994J.clear();
        this.f4993I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it2 = this.f5000c.t().iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroup = ((O) it2.next()).f5048c.f5158M;
            if (viewGroup != null) {
                hashSet.add(C0276h.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final O f(C0286s sVar) {
        String str = sVar.f5177e;
        z zVar = this.f5000c;
        O o6 = (O) ((HashMap) zVar.f2712c).get(str);
        if (o6 != null) {
            return o6;
        }
        O o7 = new O(this.f5006l, zVar, sVar);
        o7.m(this.f5014t.f5193q.getClassLoader());
        o7.f5049e = this.f5013s;
        return o7;
    }

    public final void g(C0286s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + sVar);
        }
        if (!sVar.f5154I) {
            sVar.f5154I = true;
            if (sVar.f5183t) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "remove from detach: " + sVar);
                }
                z zVar = this.f5000c;
                synchronized (((ArrayList) zVar.f2711b)) {
                    ((ArrayList) zVar.f2711b).remove(sVar);
                }
                sVar.f5183t = false;
                if (F(sVar)) {
                    this.f4989D = true;
                }
                W(sVar);
            }
        }
    }

    public final void h(boolean z3) {
        if (!z3 || this.f5014t == null) {
            for (C0286s sVar : this.f5000c.v()) {
                if (sVar != null) {
                    sVar.f5157L = true;
                    if (z3) {
                        sVar.f5149C.h(true);
                    }
                }
            }
            return;
        }
        Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final boolean i() {
        boolean z3;
        if (this.f5013s < 1) {
            return false;
        }
        for (C0286s sVar : this.f5000c.v()) {
            if (sVar != null) {
                if (!sVar.f5153H) {
                    z3 = sVar.f5149C.i();
                } else {
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z3;
        if (this.f5013s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (C0286s sVar : this.f5000c.v()) {
            if (sVar != null && H(sVar)) {
                if (!sVar.f5153H) {
                    z3 = sVar.f5149C.j();
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sVar);
                    z4 = true;
                }
            }
        }
        if (this.f5001e != null) {
            for (int i2 = 0; i2 < this.f5001e.size(); i2++) {
                C0286s sVar2 = (C0286s) this.f5001e.get(i2);
                if (arrayList == null || !arrayList.contains(sVar2)) {
                    sVar2.getClass();
                }
            }
        }
        this.f5001e = arrayList;
        return z4;
    }

    public final void k() {
        boolean z3 = true;
        this.f4991G = true;
        x(true);
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0276h) it2.next()).e();
        }
        C0288u uVar = this.f5014t;
        z zVar = this.f5000c;
        if (uVar != null) {
            z3 = ((K) zVar.f2713e).h;
        } else {
            C0289v vVar = uVar.f5193q;
            if (vVar != null) {
                z3 = true ^ vVar.isChangingConfigurations();
            }
        }
        if (z3) {
            for (C0271c cVar : this.f5004j.values()) {
                for (String str : cVar.f5098a) {
                    K k6 = (K) zVar.f2713e;
                    k6.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    k6.d(str);
                }
            }
        }
        t(-1);
        C0288u uVar2 = this.f5014t;
        if (uVar2 != null) {
            C0289v vVar2 = uVar2.f5196t;
            z zVar2 = this.f5009o;
            vVar2.getClass();
            j.e(zVar2, "listener");
            vVar2.f4651t.remove(zVar2);
        }
        C0288u uVar3 = this.f5014t;
        if (uVar3 != null) {
            C0289v vVar3 = uVar3.f5196t;
            z zVar3 = this.f5008n;
            vVar3.getClass();
            j.e(zVar3, "listener");
            vVar3.f4650s.remove(zVar3);
        }
        C0288u uVar4 = this.f5014t;
        if (uVar4 != null) {
            C0289v vVar4 = uVar4.f5196t;
            z zVar4 = this.f5010p;
            vVar4.getClass();
            j.e(zVar4, "listener");
            vVar4.f4653v.remove(zVar4);
        }
        C0288u uVar5 = this.f5014t;
        if (uVar5 != null) {
            C0289v vVar5 = uVar5.f5196t;
            z zVar5 = this.f5011q;
            vVar5.getClass();
            j.e(zVar5, "listener");
            vVar5.f4654w.remove(zVar5);
        }
        C0288u uVar6 = this.f5014t;
        if (uVar6 != null) {
            C0289v vVar6 = uVar6.f5196t;
            B b6 = this.f5012r;
            vVar6.getClass();
            j.e(b6, "provider");
            C0009h hVar = vVar6.f4644c;
            ((CopyOnWriteArrayList) hVar.f229c).remove(b6);
            if (((HashMap) hVar.d).remove(b6) == null) {
                ((Runnable) hVar.f228b).run();
            } else {
                throw new ClassCastException();
            }
        }
        this.f5014t = null;
        this.f5015u = null;
        this.f5016v = null;
        if (this.g != null) {
            Iterator it3 = this.h.f4605b.iterator();
            while (it3.hasNext()) {
                ((C0268c) it3.next()).cancel();
            }
            this.g = null;
        }
        C0333h hVar2 = this.f5020z;
        if (hVar2 != null) {
            hVar2.b();
            this.f4986A.b();
            this.f4987B.b();
        }
    }

    public final void l(boolean z3) {
        if (!z3 || this.f5014t == null) {
            for (C0286s sVar : this.f5000c.v()) {
                if (sVar != null) {
                    sVar.f5157L = true;
                    if (z3) {
                        sVar.f5149C.l(true);
                    }
                }
            }
            return;
        }
        Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void m(boolean z3, boolean z4) {
        if (!z4 || this.f5014t == null) {
            for (C0286s sVar : this.f5000c.v()) {
                if (sVar != null && z4) {
                    sVar.f5149C.m(z3, true);
                }
            }
            return;
        }
        Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void n() {
        Iterator it2 = this.f5000c.u().iterator();
        while (it2.hasNext()) {
            C0286s sVar = (C0286s) it2.next();
            if (sVar != null) {
                sVar.w();
                sVar.f5149C.n();
            }
        }
    }

    public final boolean o() {
        boolean z3;
        if (this.f5013s < 1) {
            return false;
        }
        for (C0286s sVar : this.f5000c.v()) {
            if (sVar != null) {
                if (!sVar.f5153H) {
                    z3 = sVar.f5149C.o();
                } else {
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f5013s >= 1) {
            for (C0286s sVar : this.f5000c.v()) {
                if (sVar != null && !sVar.f5153H) {
                    sVar.f5149C.p();
                }
            }
        }
    }

    public final void q(C0286s sVar) {
        if (sVar != null) {
            if (sVar.equals(this.f5000c.q(sVar.f5177e))) {
                sVar.f5147A.getClass();
                boolean I6 = I(sVar);
                Boolean bool = sVar.f5182s;
                if (bool == null || bool.booleanValue() != I6) {
                    sVar.f5182s = Boolean.valueOf(I6);
                    I i2 = sVar.f5149C;
                    i2.a0();
                    i2.q(i2.f5017w);
                }
            }
        }
    }

    public final void r(boolean z3, boolean z4) {
        if (!z4 || this.f5014t == null) {
            for (C0286s sVar : this.f5000c.v()) {
                if (sVar != null && z4) {
                    sVar.f5149C.r(z3, true);
                }
            }
            return;
        }
        Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean s() {
        boolean z3;
        if (this.f5013s < 1) {
            return false;
        }
        boolean z4 = false;
        for (C0286s sVar : this.f5000c.v()) {
            if (sVar != null && H(sVar)) {
                if (!sVar.f5153H) {
                    z3 = sVar.f5149C.s();
                } else {
                    z3 = false;
                }
                if (z3) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    /* JADX INFO: finally extract failed */
    public final void t(int i2) {
        try {
            this.f4999b = true;
            for (O o6 : ((HashMap) this.f5000c.f2712c).values()) {
                if (o6 != null) {
                    o6.f5049e = i2;
                }
            }
            J(i2, false);
            Iterator it2 = e().iterator();
            while (it2.hasNext()) {
                ((C0276h) it2.next()).e();
            }
            this.f4999b = false;
            x(true);
        } catch (Throwable th) {
            this.f4999b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0286s sVar = this.f5016v;
        if (sVar != null) {
            sb.append(sVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f5016v)));
            sb.append("}");
        } else {
            C0288u uVar = this.f5014t;
            if (uVar != null) {
                sb.append(uVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f5014t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String f6 = o3.d.f(str, "    ");
        z zVar = this.f5000c;
        zVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = (HashMap) zVar.f2712c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O o6 : hashMap.values()) {
                printWriter.print(str);
                if (o6 != null) {
                    C0286s sVar = o6.f5048c;
                    printWriter.println(sVar);
                    sVar.j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) zVar.f2711b;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((C0286s) arrayList.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.f5001e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size2; i5++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(((C0286s) this.f5001e.get(i5)).toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                C0269a aVar = (C0269a) this.d.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(f6, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5003i.get());
        synchronized (this.f4998a) {
            try {
                int size4 = this.f4998a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i7 = 0; i7 < size4; i7++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.println((G) this.f4998a.get(i7));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5014t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5015u);
        if (this.f5016v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5016v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5013s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4990E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4991G);
        if (this.f4989D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4989D);
        }
    }

    public final void v(G g5, boolean z3) {
        if (!z3) {
            if (this.f5014t == null) {
                if (this.f4991G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (this.f4990E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4998a) {
            try {
                if (this.f5014t != null) {
                    this.f4998a.add(g5);
                    S();
                } else if (!z3) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z3) {
        if (this.f4999b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f5014t == null) {
            if (this.f4991G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f5014t.f5194r.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z3 && (this.f4990E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f4993I == null) {
            this.f4993I = new ArrayList();
            this.f4994J = new ArrayList();
        }
    }

    public final boolean x(boolean z3) {
        boolean z4;
        w(z3);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f4993I;
            ArrayList arrayList2 = this.f4994J;
            synchronized (this.f4998a) {
                if (this.f4998a.isEmpty()) {
                    z4 = false;
                } else {
                    try {
                        int size = this.f4998a.size();
                        z4 = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            z4 |= ((G) this.f4998a.get(i2)).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f4998a.clear();
                        this.f5014t.f5194r.removeCallbacks(this.f4997M);
                    }
                }
            }
            if (z4) {
                z5 = true;
                this.f4999b = true;
                try {
                    P(this.f4993I, this.f4994J);
                } finally {
                    d();
                }
            } else {
                a0();
                if (this.f4992H) {
                    this.f4992H = false;
                    Y();
                }
                ((HashMap) this.f5000c.f2712c).values().removeAll(Collections.singleton((Object) null));
                return z5;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: androidx.fragment.app.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(int r23, int r24, java.util.ArrayList r25, java.util.ArrayList r26) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            r2 = r25
            r3 = r23
            r4 = r26
            java.lang.Object r5 = r2.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0269a) r5
            boolean r5 = r5.f5081p
            java.util.ArrayList r6 = r1.f4995K
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.f4995K = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList r6 = r1.f4995K
            S3.z r7 = r1.f5000c
            java.util.List r8 = r7.v()
            r6.addAll(r8)
            androidx.fragment.app.s r6 = r1.f5017w
            r9 = r3
            r10 = 0
        L_0x0030:
            r11 = 1
            if (r9 >= r0) goto L_0x018a
            java.lang.Object r13 = r2.get(r9)
            androidx.fragment.app.a r13 = (androidx.fragment.app.C0269a) r13
            java.lang.Object r14 = r4.get(r9)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x013b
            java.util.ArrayList r14 = r1.f4995K
            r12 = 0
        L_0x0048:
            java.util.ArrayList r8 = r13.f5069a
            int r15 = r8.size()
            if (r12 >= r15) goto L_0x0138
            java.lang.Object r15 = r8.get(r12)
            androidx.fragment.app.P r15 = (androidx.fragment.app.P) r15
            int r3 = r15.f5050a
            if (r3 == r11) goto L_0x0124
            r11 = 2
            r4 = 9
            if (r3 == r11) goto L_0x00a1
            r11 = 3
            if (r3 == r11) goto L_0x0088
            r11 = 6
            if (r3 == r11) goto L_0x0088
            r11 = 7
            if (r3 == r11) goto L_0x0083
            r11 = 8
            if (r3 == r11) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            androidx.fragment.app.P r3 = new androidx.fragment.app.P
            r11 = 0
            r3.<init>(r4, r6, r11)
            r8.add(r12, r3)
            r3 = 1
            r15.f5052c = r3
            int r12 = r12 + 1
            androidx.fragment.app.s r3 = r15.f5051b
            r6 = r3
        L_0x007e:
            r20 = r7
            r2 = 1
            goto L_0x012c
        L_0x0083:
            r20 = r7
            r2 = 1
            goto L_0x0127
        L_0x0088:
            androidx.fragment.app.s r3 = r15.f5051b
            r14.remove(r3)
            androidx.fragment.app.s r3 = r15.f5051b
            if (r3 != r6) goto L_0x007e
            androidx.fragment.app.P r6 = new androidx.fragment.app.P
            r6.<init>(r4, r3)
            r8.add(r12, r6)
            int r12 = r12 + 1
            r20 = r7
            r2 = 1
            r6 = 0
            goto L_0x012c
        L_0x00a1:
            androidx.fragment.app.s r3 = r15.f5051b
            int r11 = r3.F
            int r17 = r14.size()
            r16 = 1
            int r17 = r17 + -1
            r4 = r17
            r17 = 0
        L_0x00b1:
            if (r4 < 0) goto L_0x0111
            java.lang.Object r19 = r14.get(r4)
            r20 = r7
            r7 = r19
            androidx.fragment.app.s r7 = (androidx.fragment.app.C0286s) r7
            int r2 = r7.F
            if (r2 != r11) goto L_0x0105
            if (r7 != r3) goto L_0x00c9
            r18 = r11
            r2 = 1
            r17 = 1
            goto L_0x0108
        L_0x00c9:
            if (r7 != r6) goto L_0x00dd
            androidx.fragment.app.P r2 = new androidx.fragment.app.P
            r18 = r11
            r6 = 0
            r11 = 9
            r2.<init>(r11, r7, r6)
            r8.add(r12, r2)
            int r12 = r12 + 1
            r2 = r6
            r6 = 0
            goto L_0x00e2
        L_0x00dd:
            r18 = r11
            r2 = 0
            r11 = 9
        L_0x00e2:
            androidx.fragment.app.P r11 = new androidx.fragment.app.P
            r21 = r6
            r6 = 3
            r11.<init>(r6, r7, r2)
            int r2 = r15.d
            r11.d = r2
            int r2 = r15.f5054f
            r11.f5054f = r2
            int r2 = r15.f5053e
            r11.f5053e = r2
            int r2 = r15.g
            r11.g = r2
            r8.add(r12, r11)
            r14.remove(r7)
            r2 = 1
            int r12 = r12 + r2
            r6 = r21
            goto L_0x0108
        L_0x0105:
            r18 = r11
            r2 = 1
        L_0x0108:
            int r4 = r4 + -1
            r2 = r25
            r11 = r18
            r7 = r20
            goto L_0x00b1
        L_0x0111:
            r20 = r7
            r2 = 1
            if (r17 == 0) goto L_0x011c
            r8.remove(r12)
            int r12 = r12 + -1
            goto L_0x012c
        L_0x011c:
            r15.f5050a = r2
            r15.f5052c = r2
            r14.add(r3)
            goto L_0x012c
        L_0x0124:
            r20 = r7
            r2 = r11
        L_0x0127:
            androidx.fragment.app.s r3 = r15.f5051b
            r14.add(r3)
        L_0x012c:
            int r12 = r12 + r2
            r3 = r23
            r4 = r26
            r11 = r2
            r7 = r20
            r2 = r25
            goto L_0x0048
        L_0x0138:
            r20 = r7
            goto L_0x0174
        L_0x013b:
            r20 = r7
            r2 = r11
            java.util.ArrayList r3 = r1.f4995K
            java.util.ArrayList r4 = r13.f5069a
            int r7 = r4.size()
            int r7 = r7 - r2
        L_0x0147:
            if (r7 < 0) goto L_0x0174
            java.lang.Object r8 = r4.get(r7)
            androidx.fragment.app.P r8 = (androidx.fragment.app.P) r8
            int r11 = r8.f5050a
            if (r11 == r2) goto L_0x016a
            r2 = 3
            if (r11 == r2) goto L_0x0164
            switch(r11) {
                case 6: goto L_0x0164;
                case 7: goto L_0x016b;
                case 8: goto L_0x0162;
                case 9: goto L_0x015f;
                case 10: goto L_0x015a;
                default: goto L_0x0159;
            }
        L_0x0159:
            goto L_0x0170
        L_0x015a:
            androidx.lifecycle.n r11 = r8.h
            r8.f5055i = r11
            goto L_0x0170
        L_0x015f:
            androidx.fragment.app.s r6 = r8.f5051b
            goto L_0x0170
        L_0x0162:
            r6 = 0
            goto L_0x0170
        L_0x0164:
            androidx.fragment.app.s r8 = r8.f5051b
            r3.add(r8)
            goto L_0x0170
        L_0x016a:
            r2 = 3
        L_0x016b:
            androidx.fragment.app.s r8 = r8.f5051b
            r3.remove(r8)
        L_0x0170:
            int r7 = r7 + -1
            r2 = 1
            goto L_0x0147
        L_0x0174:
            if (r10 != 0) goto L_0x017d
            boolean r2 = r13.g
            if (r2 == 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            r10 = 0
            goto L_0x017e
        L_0x017d:
            r10 = 1
        L_0x017e:
            int r9 = r9 + 1
            r3 = r23
            r2 = r25
            r4 = r26
            r7 = r20
            goto L_0x0030
        L_0x018a:
            r20 = r7
            java.util.ArrayList r2 = r1.f4995K
            r2.clear()
            if (r5 != 0) goto L_0x01d2
            int r2 = r1.f5013s
            r3 = 1
            if (r2 < r3) goto L_0x01d2
            r2 = r23
        L_0x019a:
            if (r2 >= r0) goto L_0x01d2
            r3 = r25
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.C0269a) r4
            java.util.ArrayList r4 = r4.f5069a
            java.util.Iterator r4 = r4.iterator()
        L_0x01aa:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01cd
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.P r5 = (androidx.fragment.app.P) r5
            androidx.fragment.app.s r5 = r5.f5051b
            if (r5 == 0) goto L_0x01c8
            androidx.fragment.app.I r6 = r5.f5147A
            if (r6 == 0) goto L_0x01c8
            androidx.fragment.app.O r5 = r1.f(r5)
            r6 = r20
            r6.z(r5)
            goto L_0x01ca
        L_0x01c8:
            r6 = r20
        L_0x01ca:
            r20 = r6
            goto L_0x01aa
        L_0x01cd:
            r6 = r20
            int r2 = r2 + 1
            goto L_0x019a
        L_0x01d2:
            r3 = r25
            r2 = r23
        L_0x01d6:
            r4 = -1
            if (r2 >= r0) goto L_0x03b3
            java.lang.Object r5 = r3.get(r2)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0269a) r5
            r6 = r26
            java.lang.Object r7 = r6.get(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "Unknown cmd: "
            if (r7 == 0) goto L_0x02dd
            r5.d(r4)
            java.util.ArrayList r4 = r5.f5069a
            int r7 = r4.size()
            r9 = 1
            int r7 = r7 - r9
        L_0x01fa:
            if (r7 < 0) goto L_0x02da
            java.lang.Object r10 = r4.get(r7)
            androidx.fragment.app.P r10 = (androidx.fragment.app.P) r10
            androidx.fragment.app.s r11 = r10.f5051b
            if (r11 == 0) goto L_0x0242
            androidx.fragment.app.q r12 = r11.f5162Q
            if (r12 != 0) goto L_0x020b
            goto L_0x0211
        L_0x020b:
            androidx.fragment.app.q r12 = r11.k()
            r12.f5138a = r9
        L_0x0211:
            int r9 = r5.f5073f
            r12 = 8194(0x2002, float:1.1482E-41)
            r13 = 4097(0x1001, float:5.741E-42)
            if (r9 == r13) goto L_0x022c
            if (r9 == r12) goto L_0x0229
            r12 = 4100(0x1004, float:5.745E-42)
            r13 = 8197(0x2005, float:1.1486E-41)
            if (r9 == r13) goto L_0x022c
            r14 = 4099(0x1003, float:5.744E-42)
            if (r9 == r14) goto L_0x022b
            if (r9 == r12) goto L_0x0229
            r12 = 0
            goto L_0x022c
        L_0x0229:
            r12 = r13
            goto L_0x022c
        L_0x022b:
            r12 = r14
        L_0x022c:
            androidx.fragment.app.q r9 = r11.f5162Q
            if (r9 != 0) goto L_0x0233
            if (r12 != 0) goto L_0x0233
            goto L_0x023a
        L_0x0233:
            r11.k()
            androidx.fragment.app.q r9 = r11.f5162Q
            r9.f5142f = r12
        L_0x023a:
            r11.k()
            androidx.fragment.app.q r9 = r11.f5162Q
            r9.getClass()
        L_0x0242:
            int r9 = r10.f5050a
            androidx.fragment.app.I r12 = r5.f5082q
            switch(r9) {
                case 1: goto L_0x02c4;
                case 2: goto L_0x0249;
                case 3: goto L_0x02b5;
                case 4: goto L_0x02a3;
                case 5: goto L_0x0290;
                case 6: goto L_0x0281;
                case 7: goto L_0x026e;
                case 8: goto L_0x0269;
                case 9: goto L_0x0265;
                case 10: goto L_0x025d;
                default: goto L_0x0249;
            }
        L_0x0249:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r3 = r10.f5050a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x025d:
            androidx.lifecycle.n r9 = r10.h
            r12.U(r11, r9)
        L_0x0262:
            r9 = 1
            goto L_0x02d6
        L_0x0265:
            r12.V(r11)
            goto L_0x0262
        L_0x0269:
            r9 = 0
            r12.V(r9)
            goto L_0x0262
        L_0x026e:
            int r9 = r10.d
            int r13 = r10.f5053e
            int r14 = r10.f5054f
            int r10 = r10.g
            r11.S(r9, r13, r14, r10)
            r9 = 1
            r12.T(r11, r9)
            r12.g(r11)
            goto L_0x0262
        L_0x0281:
            int r9 = r10.d
            int r13 = r10.f5053e
            int r14 = r10.f5054f
            int r10 = r10.g
            r11.S(r9, r13, r14, r10)
            r12.c(r11)
            goto L_0x0262
        L_0x0290:
            int r9 = r10.d
            int r13 = r10.f5053e
            int r14 = r10.f5054f
            int r10 = r10.g
            r11.S(r9, r13, r14, r10)
            r9 = 1
            r12.T(r11, r9)
            r12.E(r11)
            goto L_0x0262
        L_0x02a3:
            int r9 = r10.d
            int r13 = r10.f5053e
            int r14 = r10.f5054f
            int r10 = r10.g
            r11.S(r9, r13, r14, r10)
            r12.getClass()
            X(r11)
            goto L_0x0262
        L_0x02b5:
            int r9 = r10.d
            int r13 = r10.f5053e
            int r14 = r10.f5054f
            int r10 = r10.g
            r11.S(r9, r13, r14, r10)
            r12.a(r11)
            goto L_0x0262
        L_0x02c4:
            int r9 = r10.d
            int r13 = r10.f5053e
            int r14 = r10.f5054f
            int r10 = r10.g
            r11.S(r9, r13, r14, r10)
            r9 = 1
            r12.T(r11, r9)
            r12.O(r11)
        L_0x02d6:
            int r7 = r7 + -1
            goto L_0x01fa
        L_0x02da:
            r9 = 0
            goto L_0x03af
        L_0x02dd:
            r9 = 1
            r5.d(r9)
            java.util.ArrayList r4 = r5.f5069a
            int r7 = r4.size()
            r11 = 0
        L_0x02e8:
            if (r11 >= r7) goto L_0x02da
            java.lang.Object r9 = r4.get(r11)
            androidx.fragment.app.P r9 = (androidx.fragment.app.P) r9
            androidx.fragment.app.s r10 = r9.f5051b
            if (r10 == 0) goto L_0x0318
            androidx.fragment.app.q r12 = r10.f5162Q
            if (r12 != 0) goto L_0x02f9
            goto L_0x0300
        L_0x02f9:
            androidx.fragment.app.q r12 = r10.k()
            r13 = 0
            r12.f5138a = r13
        L_0x0300:
            int r12 = r5.f5073f
            androidx.fragment.app.q r13 = r10.f5162Q
            if (r13 != 0) goto L_0x0309
            if (r12 != 0) goto L_0x0309
            goto L_0x0310
        L_0x0309:
            r10.k()
            androidx.fragment.app.q r13 = r10.f5162Q
            r13.f5142f = r12
        L_0x0310:
            r10.k()
            androidx.fragment.app.q r12 = r10.f5162Q
            r12.getClass()
        L_0x0318:
            int r12 = r9.f5050a
            androidx.fragment.app.I r13 = r5.f5082q
            switch(r12) {
                case 1: goto L_0x0399;
                case 2: goto L_0x031f;
                case 3: goto L_0x038a;
                case 4: goto L_0x037b;
                case 5: goto L_0x0368;
                case 6: goto L_0x0359;
                case 7: goto L_0x0345;
                case 8: goto L_0x0340;
                case 9: goto L_0x033b;
                case 10: goto L_0x0333;
                default: goto L_0x031f;
            }
        L_0x031f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r3 = r9.f5050a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0333:
            androidx.lifecycle.n r9 = r9.f5055i
            r13.U(r10, r9)
        L_0x0338:
            r9 = 0
            goto L_0x03ab
        L_0x033b:
            r12 = 0
            r13.V(r12)
            goto L_0x0338
        L_0x0340:
            r12 = 0
            r13.V(r10)
            goto L_0x0338
        L_0x0345:
            r12 = 0
            int r14 = r9.d
            int r15 = r9.f5053e
            int r12 = r9.f5054f
            int r9 = r9.g
            r10.S(r14, r15, r12, r9)
            r9 = 0
            r13.T(r10, r9)
            r13.c(r10)
            goto L_0x0338
        L_0x0359:
            int r12 = r9.d
            int r14 = r9.f5053e
            int r15 = r9.f5054f
            int r9 = r9.g
            r10.S(r12, r14, r15, r9)
            r13.g(r10)
            goto L_0x0338
        L_0x0368:
            int r12 = r9.d
            int r14 = r9.f5053e
            int r15 = r9.f5054f
            int r9 = r9.g
            r10.S(r12, r14, r15, r9)
            r9 = 0
            r13.T(r10, r9)
            X(r10)
            goto L_0x0338
        L_0x037b:
            int r12 = r9.d
            int r14 = r9.f5053e
            int r15 = r9.f5054f
            int r9 = r9.g
            r10.S(r12, r14, r15, r9)
            r13.E(r10)
            goto L_0x0338
        L_0x038a:
            int r12 = r9.d
            int r14 = r9.f5053e
            int r15 = r9.f5054f
            int r9 = r9.g
            r10.S(r12, r14, r15, r9)
            r13.O(r10)
            goto L_0x0338
        L_0x0399:
            int r12 = r9.d
            int r14 = r9.f5053e
            int r15 = r9.f5054f
            int r9 = r9.g
            r10.S(r12, r14, r15, r9)
            r9 = 0
            r13.T(r10, r9)
            r13.a(r10)
        L_0x03ab:
            int r11 = r11 + 1
            goto L_0x02e8
        L_0x03af:
            int r2 = r2 + 1
            goto L_0x01d6
        L_0x03b3:
            r6 = r26
            int r2 = r0 + -1
            java.lang.Object r2 = r6.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r5 = r23
        L_0x03c3:
            if (r5 >= r0) goto L_0x040e
            java.lang.Object r7 = r3.get(r5)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0269a) r7
            if (r2 == 0) goto L_0x03ed
            java.util.ArrayList r8 = r7.f5069a
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
        L_0x03d5:
            if (r8 < 0) goto L_0x040b
            java.util.ArrayList r9 = r7.f5069a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.P r9 = (androidx.fragment.app.P) r9
            androidx.fragment.app.s r9 = r9.f5051b
            if (r9 == 0) goto L_0x03ea
            androidx.fragment.app.O r9 = r1.f(r9)
            r9.k()
        L_0x03ea:
            int r8 = r8 + -1
            goto L_0x03d5
        L_0x03ed:
            java.util.ArrayList r7 = r7.f5069a
            java.util.Iterator r7 = r7.iterator()
        L_0x03f3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x040b
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.P r8 = (androidx.fragment.app.P) r8
            androidx.fragment.app.s r8 = r8.f5051b
            if (r8 == 0) goto L_0x03f3
            androidx.fragment.app.O r8 = r1.f(r8)
            r8.k()
            goto L_0x03f3
        L_0x040b:
            int r5 = r5 + 1
            goto L_0x03c3
        L_0x040e:
            int r5 = r1.f5013s
            r7 = 1
            r1.J(r5, r7)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r7 = r23
        L_0x041b:
            if (r7 >= r0) goto L_0x044c
            java.lang.Object r8 = r3.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0269a) r8
            java.util.ArrayList r8 = r8.f5069a
            java.util.Iterator r8 = r8.iterator()
        L_0x0429:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0449
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.P r9 = (androidx.fragment.app.P) r9
            androidx.fragment.app.s r9 = r9.f5051b
            if (r9 == 0) goto L_0x0429
            android.view.ViewGroup r9 = r9.f5158M
            if (r9 == 0) goto L_0x0429
            androidx.fragment.app.D r10 = r22.D()
            androidx.fragment.app.h r9 = androidx.fragment.app.C0276h.f(r9, r10)
            r5.add(r9)
            goto L_0x0429
        L_0x0449:
            int r7 = r7 + 1
            goto L_0x041b
        L_0x044c:
            java.util.Iterator r5 = r5.iterator()
        L_0x0450:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x049b
            java.lang.Object r7 = r5.next()
            androidx.fragment.app.h r7 = (androidx.fragment.app.C0276h) r7
            r7.d = r2
            java.util.ArrayList r8 = r7.f5110b
            monitor-enter(r8)
            r7.g()     // Catch:{ all -> 0x048f }
            r9 = 0
            r7.f5112e = r9     // Catch:{ all -> 0x048f }
            java.util.ArrayList r10 = r7.f5110b     // Catch:{ all -> 0x048f }
            int r10 = r10.size()     // Catch:{ all -> 0x048f }
            int r10 = r10 + -1
        L_0x046f:
            if (r10 < 0) goto L_0x0494
            java.util.ArrayList r11 = r7.f5110b     // Catch:{ all -> 0x048f }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x048f }
            androidx.fragment.app.U r11 = (androidx.fragment.app.U) r11     // Catch:{ all -> 0x048f }
            androidx.fragment.app.s r12 = r11.f5066c     // Catch:{ all -> 0x048f }
            android.view.View r12 = r12.f5159N     // Catch:{ all -> 0x048f }
            int r12 = h0.C0552a.c(r12)     // Catch:{ all -> 0x048f }
            int r13 = r11.f5064a     // Catch:{ all -> 0x048f }
            r14 = 2
            if (r13 != r14) goto L_0x0491
            if (r12 == r14) goto L_0x0491
            androidx.fragment.app.s r10 = r11.f5066c     // Catch:{ all -> 0x048f }
            androidx.fragment.app.q r10 = r10.f5162Q     // Catch:{ all -> 0x048f }
            r7.f5112e = r9     // Catch:{ all -> 0x048f }
            goto L_0x0494
        L_0x048f:
            r0 = move-exception
            goto L_0x0499
        L_0x0491:
            int r10 = r10 + -1
            goto L_0x046f
        L_0x0494:
            monitor-exit(r8)     // Catch:{ all -> 0x048f }
            r7.c()
            goto L_0x0450
        L_0x0499:
            monitor-exit(r8)     // Catch:{ all -> 0x048f }
            throw r0
        L_0x049b:
            r2 = r23
        L_0x049d:
            if (r2 >= r0) goto L_0x04bd
            java.lang.Object r5 = r3.get(r2)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0269a) r5
            java.lang.Object r7 = r6.get(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x04b7
            int r7 = r5.f5084s
            if (r7 < 0) goto L_0x04b7
            r5.f5084s = r4
        L_0x04b7:
            r5.getClass()
            int r2 = r2 + 1
            goto L_0x049d
        L_0x04bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.I.y(int, int, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final C0286s z(int i2) {
        z zVar = this.f5000c;
        ArrayList arrayList = (ArrayList) zVar.f2711b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0286s sVar = (C0286s) arrayList.get(size);
            if (sVar != null && sVar.f5151E == i2) {
                return sVar;
            }
        }
        for (O o6 : ((HashMap) zVar.f2712c).values()) {
            if (o6 != null) {
                C0286s sVar2 = o6.f5048c;
                if (sVar2.f5151E == i2) {
                    return sVar2;
                }
            }
        }
        return null;
    }
}
