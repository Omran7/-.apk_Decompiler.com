package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import c0.C0337c;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import k.C0738t;
import kotlin.jvm.internal.j;
import n0.C0853c;

public final class M implements S {

    /* renamed from: a  reason: collision with root package name */
    public final Application f5239a;

    /* renamed from: b  reason: collision with root package name */
    public final Q f5240b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f5241c;
    public final C0309u d;

    /* renamed from: e  reason: collision with root package name */
    public final C0738t f5242e;

    public M(Application application, C0853c cVar, Bundle bundle) {
        Q q6;
        this.f5242e = cVar.a();
        this.d = cVar.h();
        this.f5241c = bundle;
        this.f5239a = application;
        if (application != null) {
            if (Q.f5251e == null) {
                Q.f5251e = new Q(application);
            }
            q6 = Q.f5251e;
            j.b(q6);
        } else {
            q6 = new Q((Application) null);
        }
        this.f5240b = q6;
    }

    public final O a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final O b(Class cls, C0337c cVar) {
        Constructor constructor;
        P p6 = P.f5249b;
        LinkedHashMap linkedHashMap = cVar.f5577a;
        String str = (String) linkedHashMap.get(p6);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        } else if (linkedHashMap.get(J.f5229a) != null && linkedHashMap.get(J.f5230b) != null) {
            Application application = (Application) linkedHashMap.get(P.f5248a);
            boolean isAssignableFrom = C0290a.class.isAssignableFrom(cls);
            if (!isAssignableFrom || application == null) {
                constructor = N.a(cls, N.f5244b);
            } else {
                constructor = N.a(cls, N.f5243a);
            }
            if (constructor == null) {
                return this.f5240b.b(cls, cVar);
            }
            if (!isAssignableFrom || application == null) {
                return N.b(cls, constructor, J.c(cVar));
            }
            return N.b(cls, constructor, application, J.c(cVar));
        } else if (this.d != null) {
            return c(cls, str);
        } else {
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: androidx.lifecycle.SavedStateHandleController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: androidx.lifecycle.SavedStateHandleController} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.lifecycle.SavedStateHandleController} */
    /* JADX WARNING: type inference failed for: r9v13, types: [androidx.lifecycle.P, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.O c(java.lang.Class r8, java.lang.String r9) {
        /*
            r7 = this;
            androidx.lifecycle.u r0 = r7.d
            if (r0 == 0) goto L_0x00ae
            java.lang.Class<androidx.lifecycle.a> r1 = androidx.lifecycle.C0290a.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L_0x0017
            android.app.Application r2 = r7.f5239a
            if (r2 == 0) goto L_0x0017
            java.util.List r2 = androidx.lifecycle.N.f5243a
            java.lang.reflect.Constructor r2 = androidx.lifecycle.N.a(r8, r2)
            goto L_0x001d
        L_0x0017:
            java.util.List r2 = androidx.lifecycle.N.f5244b
            java.lang.reflect.Constructor r2 = androidx.lifecycle.N.a(r8, r2)
        L_0x001d:
            if (r2 != 0) goto L_0x003f
            android.app.Application r9 = r7.f5239a
            if (r9 == 0) goto L_0x002a
            androidx.lifecycle.Q r9 = r7.f5240b
            androidx.lifecycle.O r8 = r9.a(r8)
            goto L_0x003e
        L_0x002a:
            androidx.lifecycle.P r9 = androidx.lifecycle.P.f5250c
            if (r9 != 0) goto L_0x0035
            androidx.lifecycle.P r9 = new androidx.lifecycle.P
            r9.<init>()
            androidx.lifecycle.P.f5250c = r9
        L_0x0035:
            androidx.lifecycle.P r9 = androidx.lifecycle.P.f5250c
            kotlin.jvm.internal.j.b(r9)
            androidx.lifecycle.O r8 = r9.a(r8)
        L_0x003e:
            return r8
        L_0x003f:
            k.t r3 = r7.f5242e
            kotlin.jvm.internal.j.b(r3)
            android.os.Bundle r4 = r7.f5241c
            android.os.Bundle r5 = r3.c(r9)
            java.lang.Class[] r6 = androidx.lifecycle.H.f5223f
            androidx.lifecycle.H r4 = androidx.lifecycle.J.b(r5, r4)
            androidx.lifecycle.SavedStateHandleController r5 = new androidx.lifecycle.SavedStateHandleController
            r5.<init>(r9, r4)
            r5.b(r0, r3)
            androidx.lifecycle.n r9 = r0.f5278c
            androidx.lifecycle.n r6 = androidx.lifecycle.C0303n.f5269b
            if (r9 == r6) goto L_0x0070
            androidx.lifecycle.n r6 = androidx.lifecycle.C0303n.d
            int r9 = r9.compareTo(r6)
            if (r9 < 0) goto L_0x0067
            goto L_0x0070
        L_0x0067:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r9 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r9.<init>(r0, r3)
            r0.a(r9)
            goto L_0x0073
        L_0x0070:
            r3.g()
        L_0x0073:
            if (r1 == 0) goto L_0x0082
            android.app.Application r9 = r7.f5239a
            if (r9 == 0) goto L_0x0082
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r4}
            androidx.lifecycle.O r8 = androidx.lifecycle.N.b(r8, r2, r9)
            goto L_0x008a
        L_0x0082:
            java.lang.Object[] r9 = new java.lang.Object[]{r4}
            androidx.lifecycle.O r8 = androidx.lifecycle.N.b(r8, r2, r9)
        L_0x008a:
            java.lang.String r9 = "androidx.lifecycle.savedstate.vm.tag"
            java.util.HashMap r0 = r8.f5245a
            monitor-enter(r0)
            java.util.HashMap r1 = r8.f5245a     // Catch:{ all -> 0x009d }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x009f
            java.util.HashMap r2 = r8.f5245a     // Catch:{ all -> 0x009d }
            r2.put(r9, r5)     // Catch:{ all -> 0x009d }
            goto L_0x009f
        L_0x009d:
            r8 = move-exception
            goto L_0x00ac
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r5 = r1
        L_0x00a4:
            boolean r9 = r8.f5247c
            if (r9 == 0) goto L_0x00ab
            androidx.lifecycle.O.a(r5)
        L_0x00ab:
            return r8
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r8
        L_0x00ae:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.M.c(java.lang.Class, java.lang.String):androidx.lifecycle.O");
    }
}
