package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import h0.C0552a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import k.C0738t;
import kotlin.jvm.internal.j;
import n0.C0851a;
import n0.C0853c;
import o3.d;

public final class Recreator implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final C0853c f5411a;

    public Recreator(C0853c cVar) {
        this.f5411a = cVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        if (mVar == C0302m.ON_CREATE) {
            sVar.h().f(this);
            C0853c cVar = this.f5411a;
            Bundle c3 = cVar.a().c("androidx.savedstate.Restarter");
            if (c3 != null) {
                ArrayList<String> stringArrayList = c3.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String next : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(C0851a.class);
                            j.d(asSubclass, "{\n                Class.…class.java)\n            }");
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                                    j.d(newInstance, "{\n                constr…wInstance()\n            }");
                                    C0851a aVar = (C0851a) newInstance;
                                    if (cVar instanceof U) {
                                        T e6 = ((U) cVar).e();
                                        C0738t a6 = cVar.a();
                                        e6.getClass();
                                        LinkedHashMap linkedHashMap = e6.f5258a;
                                        Iterator it2 = new HashSet(linkedHashMap.keySet()).iterator();
                                        while (it2.hasNext()) {
                                            String str = (String) it2.next();
                                            j.e(str, "key");
                                            O o6 = (O) linkedHashMap.get(str);
                                            j.b(o6);
                                            J.a(o6, a6, cVar.h());
                                        }
                                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                            a6.g();
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e7) {
                                    throw new RuntimeException(d.i("Failed to instantiate ", next), e7);
                                }
                            } catch (NoSuchMethodException e8) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                            }
                        } catch (ClassNotFoundException e9) {
                            throw new RuntimeException(C0552a.o("Class ", next, " wasn't found"), e9);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
