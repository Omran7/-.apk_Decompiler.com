package androidx.lifecycle;

import B0.C0009h;
import S3.t;
import android.os.Bundle;
import c0.C0335a;
import c0.C0336b;
import c0.C0337c;
import c0.C0338d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import k.C0738t;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import n0.C0852b;
import n0.C0853c;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static final P f5229a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final P f5230b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final P f5231c = new Object();

    public static final void a(O o6, C0738t tVar, C0309u uVar) {
        Object obj;
        j.e(tVar, "registry");
        j.e(uVar, "lifecycle");
        HashMap hashMap = o6.f5245a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = o6.f5245a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f5257c) {
            savedStateHandleController.b(uVar, tVar);
            C0303n nVar = uVar.f5278c;
            if (nVar == C0303n.f5269b || nVar.compareTo(C0303n.d) >= 0) {
                tVar.g();
            } else {
                uVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(uVar, tVar));
            }
        }
    }

    public static H b(Bundle bundle, Bundle bundle2) {
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = parcelableArrayList.get(i2);
                j.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
            }
            return new H(linkedHashMap);
        } else if (bundle2 == null) {
            return new H();
        } else {
            HashMap hashMap = new HashMap();
            for (String next : bundle2.keySet()) {
                j.d(next, "key");
                hashMap.put(next, bundle2.get(next));
            }
            return new H(hashMap);
        }
    }

    public static final H c(C0337c cVar) {
        K k6;
        Bundle bundle;
        P p6 = f5229a;
        LinkedHashMap linkedHashMap = cVar.f5577a;
        C0853c cVar2 = (C0853c) linkedHashMap.get(p6);
        if (cVar2 != null) {
            U u6 = (U) linkedHashMap.get(f5230b);
            if (u6 != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f5231c);
                String str = (String) linkedHashMap.get(P.f5249b);
                if (str != null) {
                    C0852b d = cVar2.a().d();
                    if (d instanceof K) {
                        k6 = (K) d;
                    } else {
                        k6 = null;
                    }
                    if (k6 != null) {
                        L e6 = e(u6);
                        H h = (H) e6.d.get(str);
                        if (h != null) {
                            return h;
                        }
                        Class[] clsArr = H.f5223f;
                        k6.b();
                        Bundle bundle3 = k6.f5234c;
                        if (bundle3 != null) {
                            bundle = bundle3.getBundle(str);
                        } else {
                            bundle = null;
                        }
                        Bundle bundle4 = k6.f5234c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = k6.f5234c;
                        if (bundle5 != null && bundle5.isEmpty()) {
                            k6.f5234c = null;
                        }
                        H b6 = b(bundle, bundle2);
                        e6.d.put(str, b6);
                        return b6;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void d(C0853c cVar) {
        C0303n nVar = cVar.h().f5278c;
        if (nVar != C0303n.f5269b && nVar != C0303n.f5270c) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (cVar.a().d() == null) {
            K k6 = new K(cVar.a(), (U) cVar);
            cVar.a().f("androidx.lifecycle.internal.SavedStateHandlesProvider", k6);
            cVar.h().a(new SavedStateHandleAttacher(k6));
        }
    }

    public static final L e(U u6) {
        C0336b bVar;
        ArrayList arrayList = new ArrayList();
        n.f9657a.getClass();
        Class<L> cls = L.class;
        Class a6 = new e(cls).a();
        j.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new C0338d(a6));
        C0338d[] dVarArr = (C0338d[]) arrayList.toArray(new C0338d[0]);
        t tVar = new t((C0338d[]) Arrays.copyOf(dVarArr, dVarArr.length));
        T e6 = u6.e();
        if (u6 instanceof C0298i) {
            bVar = ((C0298i) u6).c();
        } else {
            bVar = C0335a.f5576b;
        }
        return (L) new C0009h(e6, (S) tVar, bVar).v(cls, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
