package com.google.firebase.messaging;

import I3.e;
import I3.g;
import J2.o;
import J3.a;
import K3.b;
import R2.i;
import S3.A;
import S3.C0151l;
import S3.E;
import S3.F;
import S3.m;
import S3.n;
import S3.p;
import S3.q;
import S3.r;
import U3.c;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y1.d;
import y1.h;
import y1.k;
import y1.l;

public class FirebaseMessaging {

    /* renamed from: k  reason: collision with root package name */
    public static final long f6900k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: l  reason: collision with root package name */
    public static c f6901l;

    /* renamed from: m  reason: collision with root package name */
    public static b f6902m = new n(0);

    /* renamed from: n  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6903n;

    /* renamed from: a  reason: collision with root package name */
    public final i f6904a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6905b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6906c;
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final C0151l f6907e;

    /* renamed from: f  reason: collision with root package name */
    public final r f6908f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;

    /* renamed from: i  reason: collision with root package name */
    public final e f6909i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6910j = false;

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, J2.o] */
    /* JADX WARNING: type inference failed for: r11v2, types: [S3.r, java.lang.Object] */
    public FirebaseMessaging(i iVar, a aVar, b bVar, b bVar2, L3.e eVar, b bVar3, E3.c cVar) {
        i iVar2 = iVar;
        a aVar2 = aVar;
        iVar.b();
        Context context = iVar2.f2490a;
        e eVar2 = new e(context, 1);
        iVar.b();
        y1.b bVar4 = new y1.b(iVar2.f2490a);
        ? obj = new Object();
        obj.f1317a = iVar2;
        obj.f1318b = eVar2;
        obj.f1319c = bVar4;
        obj.d = bVar;
        obj.f1320e = bVar2;
        obj.f1321f = eVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new H1.a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new H1.a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new H1.a("Firebase-Messaging-File-Io"));
        f6902m = bVar3;
        this.f6904a = iVar2;
        this.f6905b = aVar2;
        ? obj2 = new Object();
        obj2.d = this;
        obj2.f2694b = cVar;
        this.f6908f = obj2;
        iVar.b();
        Context context2 = iVar2.f2490a;
        this.f6906c = context2;
        m mVar = new m();
        this.f6909i = eVar2;
        this.d = obj;
        this.f6907e = new C0151l(newSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        iVar.b();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(mVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar2 != null) {
            ((g) aVar2).f1177a.h.add(new S3.o(this));
        }
        scheduledThreadPoolExecutor.execute(new p(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new H1.a("Firebase-Messaging-Topics-Io"));
        int i2 = F.f2620j;
        Tasks.call(scheduledThreadPoolExecutor2, new E(context2, scheduledThreadPoolExecutor2, this, eVar2, obj)).addOnSuccessListener((Executor) scheduledThreadPoolExecutor, new q(this, 0));
        scheduledThreadPoolExecutor.execute(new p(this, 1));
    }

    public static void b(Runnable runnable, long j6) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f6903n == null) {
                    f6903n = new ScheduledThreadPoolExecutor(1, new H1.a("TAG"));
                }
                f6903n.schedule(runnable, j6, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized c c(Context context) {
        c cVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f6901l == null) {
                    f6901l = new c(context);
                }
                cVar = f6901l;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return cVar;
    }

    public static synchronized FirebaseMessaging getInstance(i iVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) iVar.c(FirebaseMessaging.class);
            I.h(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        a aVar = this.f6905b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(((g) aVar).a());
            } catch (InterruptedException | ExecutionException e6) {
                throw new IOException(e6);
            }
        } else {
            A d6 = d();
            if (!i(d6)) {
                return d6.f2603a;
            }
            String c3 = e.c(this.f6904a);
            C0151l lVar = this.f6907e;
            synchronized (lVar) {
                task = (Task) ((n.e) lVar.f2684b).get(c3);
                if (task == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Making new request for: " + c3);
                    }
                    o oVar = this.d;
                    task = oVar.n(oVar.s(e.c((i) oVar.f1317a), "*", new Bundle())).onSuccessTask(this.h, new F3.b(this, c3, d6, 1)).continueWithTask((ExecutorService) lVar.f2683a, new A4.c((Object) lVar, (Object) c3, 1));
                    ((n.e) lVar.f2684b).put(c3, task);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + c3);
                }
            }
            try {
                return (String) Tasks.await(task);
            } catch (InterruptedException | ExecutionException e7) {
                throw new IOException(e7);
            }
        }
    }

    public final A d() {
        String str;
        A b6;
        c c3 = c(this.f6906c);
        i iVar = this.f6904a;
        iVar.b();
        if ("[DEFAULT]".equals(iVar.f2491b)) {
            str = "";
        } else {
            str = iVar.g();
        }
        String c6 = e.c(this.f6904a);
        synchronized (c3) {
            b6 = A.b(((SharedPreferences) c3.f3713b).getString(str + "|T|" + c6 + "|*", (String) null));
        }
        return b6;
    }

    public final void e() {
        Task task;
        int i2;
        y1.b bVar = (y1.b) this.d.f1319c;
        if (bVar.f12653c.b() >= 241100000) {
            l a6 = l.a(bVar.f12652b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (a6) {
                i2 = a6.f12677a;
                a6.f12677a = i2 + 1;
            }
            task = a6.b(new k(i2, 5, bundle, 1)).continueWith(h.f12663c, d.f12658c);
        } else {
            task = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        task.addOnSuccessListener((Executor) this.g, new q(this, 1));
    }

    public final void f(String str) {
        i iVar = this.f6904a;
        iVar.b();
        if ("[DEFAULT]".equals(iVar.f2491b)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                iVar.b();
                sb.append(iVar.f2491b);
                Log.d("FirebaseMessaging", sb.toString());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C0151l(this.f6906c).b(intent);
        }
    }

    public final boolean g() {
        boolean z3;
        boolean z4;
        Context context = this.f6906c;
        com.bumptech.glide.d.H0(context);
        if (Build.VERSION.SDK_INT >= 29) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
                return false;
            } else if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                return false;
            } else {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "GMS core is set for proxying");
                }
                if (this.f6904a.c(T2.a.class) != null) {
                    return true;
                }
                if (!com.bumptech.glide.c.m() || f6902m == null) {
                    return false;
                }
                return true;
            }
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        } else {
            Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            return false;
        }
    }

    public final synchronized void h(long j6) {
        b(new I3.k(this, Math.min(Math.max(30, 2 * j6), f6900k)), j6);
        this.f6910j = true;
    }

    public final boolean i(A a6) {
        if (a6 != null) {
            String a7 = this.f6909i.a();
            if (System.currentTimeMillis() > a6.f2605c + A.d || !a7.equals(a6.f2604b)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
