package R2;

import G1.c;
import K3.b;
import T1.C;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.C0349c;
import com.google.android.gms.common.internal.I;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import g3.C0549b;
import g3.l;
import h3.m;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n.d;
import n.e;
import n.j;

public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f2488j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final e f2489k = new j(0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f2490a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2491b;

    /* renamed from: c  reason: collision with root package name */
    public final m f2492c;
    public final g3.e d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f2493e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f2494f = new AtomicBoolean();
    public final l g;
    public final b h;

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f2495i = new CopyOnWriteArrayList();

    public i(Context context, String str, m mVar) {
        List<String> list;
        new CopyOnWriteArrayList();
        this.f2490a = context;
        I.d(str);
        this.f2491b = str;
        this.f2492c = mVar;
        a aVar = FirebaseInitProvider.f6913a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        Class<ComponentDiscoveryService> cls = ComponentDiscoveryService.class;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String next : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList2.add(next.substring(31));
                }
            }
            list = arrayList2;
        }
        for (String bVar : list) {
            arrayList.add(new L3.b(bVar, 1));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        m mVar2 = m.f8150a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.add(new L3.b(new FirebaseCommonRegistrar(), 2));
        arrayList3.add(new L3.b(new ExecutorsRegistrar(), 2));
        arrayList4.add(C0549b.c(context, Context.class, new Class[0]));
        arrayList4.add(C0549b.c(this, i.class, new Class[0]));
        arrayList4.add(C0549b.c(mVar, m.class, new Class[0]));
        C c3 = new C(27);
        if (G.m.a(context) && FirebaseInitProvider.f6914b.get()) {
            arrayList4.add(C0549b.c(aVar, a.class, new Class[0]));
        }
        g3.e eVar = new g3.e(arrayList3, arrayList4, c3);
        this.d = eVar;
        Trace.endSection();
        this.g = new l(new d(this, context, 0));
        this.h = eVar.c(H3.e.class);
        a(new e(this));
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f2488j) {
            try {
                Iterator it2 = ((d) f2489k.values()).iterator();
                while (it2.hasNext()) {
                    i iVar = (i) it2.next();
                    iVar.b();
                    arrayList.add(iVar.f2491b);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static i e() {
        i iVar;
        synchronized (f2488j) {
            try {
                iVar = (i) f2489k.get("[DEFAULT]");
                if (iVar != null) {
                    ((H3.e) iVar.h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + c.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static i f(String str) {
        i iVar;
        String str2;
        synchronized (f2488j) {
            try {
                iVar = (i) f2489k.get(str.trim());
                if (iVar != null) {
                    ((H3.e) iVar.h.get()).c();
                } else {
                    ArrayList d6 = d();
                    if (d6.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", d6);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static i i(Context context) {
        synchronized (f2488j) {
            try {
                if (f2489k.containsKey("[DEFAULT]")) {
                    i e6 = e();
                    return e6;
                }
                m a6 = m.a(context);
                if (a6 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                i j6 = j(context, a6);
                return j6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [com.google.android.gms.common.api.internal.b, java.lang.Object] */
    public static i j(Context context, m mVar) {
        i iVar;
        AtomicReference atomicReference = g.f2485a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = g.f2485a;
            if (atomicReference2.get() == null) {
                ? obj = new Object();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, obj)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        C0349c.b(application);
                        C0349c.f6081e.a(obj);
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f2488j) {
            e eVar = f2489k;
            I.i("FirebaseApp name " + "[DEFAULT]" + " already exists!", !eVar.containsKey("[DEFAULT]"));
            I.h(context, "Application context cannot be null.");
            iVar = new i(context, "[DEFAULT]", mVar);
            eVar.put("[DEFAULT]", iVar);
        }
        iVar.h();
        return iVar;
    }

    public final void a(f fVar) {
        b();
        if (this.f2493e.get() && C0349c.f6081e.f6082a.get()) {
            fVar.a(true);
        }
        this.f2495i.add(fVar);
    }

    public final void b() {
        I.i("FirebaseApp was deleted", !this.f2494f.get());
    }

    public final Object c(Class cls) {
        b();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        iVar.b();
        return this.f2491b.equals(iVar.f2491b);
    }

    public final String g() {
        String str;
        StringBuilder sb = new StringBuilder();
        b();
        byte[] bytes = this.f2491b.getBytes(Charset.defaultCharset());
        String str2 = null;
        if (bytes == null) {
            str = null;
        } else {
            str = Base64.encodeToString(bytes, 11);
        }
        sb.append(str);
        sb.append("+");
        b();
        byte[] bytes2 = this.f2492c.f2501b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str2 = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void h() {
        HashMap hashMap;
        if (!G.m.a(this.f2490a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb.append(this.f2491b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f2490a;
            AtomicReference atomicReference = h.f2486b;
            if (atomicReference.get() == null) {
                h hVar = new h(context);
                while (!atomicReference.compareAndSet((Object) null, hVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(hVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        b();
        sb2.append(this.f2491b);
        Log.i("FirebaseApp", sb2.toString());
        g3.e eVar = this.d;
        b();
        boolean equals = "[DEFAULT]".equals(this.f2491b);
        AtomicReference atomicReference2 = eVar.f8022f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (eVar) {
                    hashMap = new HashMap(eVar.f8018a);
                }
                eVar.i(hashMap, equals);
                break;
            }
        }
        ((H3.e) this.h.get()).c();
    }

    public final int hashCode() {
        return this.f2491b.hashCode();
    }

    public final String toString() {
        X4.d dVar = new X4.d((Object) this);
        dVar.c(this.f2491b, "name");
        dVar.c(this.f2492c, "options");
        return dVar.toString();
    }
}
