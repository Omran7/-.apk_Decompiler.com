package y2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import w0.C1067n;

/* renamed from: y2.d  reason: case insensitive filesystem */
public final class C1113d {

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f12691o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f12692a;

    /* renamed from: b  reason: collision with root package name */
    public final z f12693b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12694c;
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f12695e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f12696f = new Object();
    public boolean g;
    public final Intent h;

    /* renamed from: i  reason: collision with root package name */
    public final D f12697i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference f12698j;

    /* renamed from: k  reason: collision with root package name */
    public final B f12699k = new B(this);

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f12700l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public C1067n f12701m;

    /* renamed from: n  reason: collision with root package name */
    public IInterface f12702n;

    public C1113d(Context context, z zVar, String str, Intent intent, D d6) {
        this.f12692a = context;
        this.f12693b = zVar;
        this.f12694c = str;
        this.h = intent;
        this.f12697i = d6;
        this.f12698j = new WeakReference((Object) null);
    }

    public static void b(C1113d dVar, C1109A a6) {
        IInterface iInterface = dVar.f12702n;
        ArrayList arrayList = dVar.d;
        z zVar = dVar.f12693b;
        if (iInterface == null && !dVar.g) {
            zVar.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(a6);
            C1067n nVar = new C1067n(dVar, 1);
            dVar.f12701m = nVar;
            dVar.g = true;
            if (!dVar.f12692a.bindService(dVar.h, nVar, 1)) {
                zVar.b("Failed to bind to the service.", new Object[0]);
                dVar.g = false;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((C1109A) it2.next()).a(new RuntimeException("Failed to bind to the service."));
                }
                arrayList.clear();
            }
        } else if (dVar.g) {
            zVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(a6);
        } else {
            a6.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f12691o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f12694c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12694c, 10);
                    handlerThread.start();
                    hashMap.put(this.f12694c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f12694c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(C1109A a6, TaskCompletionSource taskCompletionSource) {
        a().post(new C(this, a6.c(), taskCompletionSource, a6));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f12696f) {
            this.f12695e.remove(taskCompletionSource);
        }
        a().post(new C1112c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f12695e;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((TaskCompletionSource) it2.next()).trySetException(new RemoteException(String.valueOf(this.f12694c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
