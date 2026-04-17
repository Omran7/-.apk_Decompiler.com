package R2;

import A.h;
import K3.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import g3.C0549b;
import g3.e;
import g3.p;
import java.util.Collections;
import java.util.HashSet;

public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2482b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2483c;

    public /* synthetic */ d(Object obj, Object obj2, int i2) {
        this.f2481a = i2;
        this.f2482b = obj;
        this.f2483c = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [P3.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, J2.o] */
    public final Object get() {
        boolean z3;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z4;
        switch (this.f2481a) {
            case 0:
                i iVar = (i) this.f2482b;
                String g = iVar.g();
                E3.b bVar = (E3.b) iVar.d.a(E3.b.class);
                ? obj = new Object();
                Context createDeviceProtectedStorageContext = h.createDeviceProtectedStorageContext((Context) this.f2483c);
                SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + g, 0);
                boolean z5 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z3 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                        if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                            z5 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    z3 = z5;
                }
                obj.f2183a = z3;
                return obj;
            default:
                e eVar = (e) this.f2482b;
                eVar.getClass();
                C0549b bVar2 = (C0549b) this.f2483c;
                g3.d dVar = bVar2.f8017f;
                ? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (g3.h hVar : bVar2.f8015c) {
                    int i2 = hVar.f8030c;
                    if (i2 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i5 = hVar.f8029b;
                    p pVar = hVar.f8028a;
                    if (z4) {
                        if (i5 == 2) {
                            hashSet4.add(pVar);
                        } else {
                            hashSet.add(pVar);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(pVar);
                    } else if (i5 == 2) {
                        hashSet5.add(pVar);
                    } else {
                        hashSet2.add(pVar);
                    }
                }
                if (!bVar2.g.isEmpty()) {
                    hashSet.add(p.a(E3.b.class));
                }
                obj2.f1317a = Collections.unmodifiableSet(hashSet);
                obj2.f1318b = Collections.unmodifiableSet(hashSet2);
                obj2.f1319c = Collections.unmodifiableSet(hashSet3);
                obj2.d = Collections.unmodifiableSet(hashSet4);
                obj2.f1320e = Collections.unmodifiableSet(hashSet5);
                obj2.f1321f = eVar;
                return dVar.f(obj2);
        }
    }
}
