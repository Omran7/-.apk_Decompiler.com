package com.google.firebase.iid;

import I3.a;
import I3.c;
import I3.d;
import I3.e;
import I3.h;
import I3.k;
import J2.o;
import K3.b;
import R2.i;
import R2.m;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

@Deprecated
public class FirebaseInstanceId {

    /* renamed from: i  reason: collision with root package name */
    public static final long f6889i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static h f6890j;

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6891k = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: l  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6892l;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f6893a;

    /* renamed from: b  reason: collision with root package name */
    public final i f6894b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6895c;
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final h f6896e;

    /* renamed from: f  reason: collision with root package name */
    public final L3.e f6897f;
    public boolean g = false;
    public final ArrayList h = new ArrayList();

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, J2.o] */
    public FirebaseInstanceId(i iVar, b bVar, b bVar2, L3.e eVar) {
        iVar.b();
        e eVar2 = new e(iVar.f2490a, 0);
        ThreadPoolExecutor n02 = R2.b.n0();
        ThreadPoolExecutor n03 = R2.b.n0();
        if (e.b(iVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (f6890j == null) {
                        iVar.b();
                        f6890j = new h(iVar.f2490a);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.f6894b = iVar;
            this.f6895c = eVar2;
            iVar.b();
            y1.b bVar3 = new y1.b(iVar.f2490a);
            ? obj = new Object();
            obj.f1317a = iVar;
            obj.f1318b = eVar2;
            obj.f1319c = bVar3;
            obj.d = bVar;
            obj.f1320e = bVar2;
            obj.f1321f = eVar;
            this.d = obj;
            this.f6893a = n03;
            this.f6896e = new h(n02);
            this.f6897f = eVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static Object a(Task task) {
        I.h(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener((Executor) a.f1161c, new c(countDownLatch, 0));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public static void c(i iVar) {
        iVar.b();
        m mVar = iVar.f2492c;
        I.e(mVar.g, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        iVar.b();
        String str = mVar.f2501b;
        I.e(str, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        iVar.b();
        String str2 = mVar.f2500a;
        I.e(str2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        iVar.b();
        I.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        iVar.b();
        I.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", f6891k.matcher(str2).matches());
    }

    public static void d(Runnable runnable, long j6) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f6892l == null) {
                    f6892l = new ScheduledThreadPoolExecutor(1, new H1.a("FirebaseInstanceId"));
                }
                f6892l.schedule(runnable, j6, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseInstanceId getInstance(i iVar) {
        c(iVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) iVar.c(FirebaseInstanceId.class);
        I.h(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public final String b() {
        String b6 = e.b(this.f6894b);
        c(this.f6894b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                return ((d) Tasks.await(e(b6), 30000, TimeUnit.MILLISECONDS)).f1168a;
            } catch (ExecutionException e6) {
                Throwable cause = e6.getCause();
                if (cause instanceof IOException) {
                    if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                        synchronized (this) {
                            f6890j.i();
                        }
                    }
                    throw ((IOException) cause);
                } else if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else {
                    throw new IOException(e6);
                }
            } catch (InterruptedException | TimeoutException unused) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("MAIN_THREAD");
        }
    }

    public final Task e(String str) {
        return Tasks.forResult(null).continueWithTask(this.f6893a, new I3.b(this, str, "*"));
    }

    public final String f() {
        c(this.f6894b);
        I3.i g5 = g(e.b(this.f6894b), "*");
        if (j(g5)) {
            synchronized (this) {
                if (!this.g) {
                    i(0);
                }
            }
        }
        if (g5 != null) {
            return g5.f1182a;
        }
        int i2 = I3.i.f1181e;
        return null;
    }

    public final I3.i g(String str, String str2) {
        String str3;
        I3.i b6;
        h hVar = f6890j;
        i iVar = this.f6894b;
        iVar.b();
        if ("[DEFAULT]".equals(iVar.f2491b)) {
            str3 = "";
        } else {
            str3 = iVar.g();
        }
        synchronized (hVar) {
            b6 = I3.i.b(((SharedPreferences) hVar.f1179b).getString(h.f(str3, str, str2), (String) null));
        }
        return b6;
    }

    public final boolean h() {
        int i2;
        e eVar = this.f6895c;
        synchronized (eVar) {
            i2 = eVar.f1173f;
            if (i2 == 0) {
                PackageManager packageManager = ((Context) eVar.f1170b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!G1.c.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null) {
                            if (queryIntentServices.size() > 0) {
                                eVar.f1173f = 1;
                                i2 = 1;
                            }
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null) {
                        if (queryBroadcastReceivers.size() > 0) {
                            eVar.f1173f = 2;
                            i2 = 2;
                        }
                    }
                    Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                    if (G1.c.d()) {
                        eVar.f1173f = 2;
                        i2 = 2;
                    } else {
                        eVar.f1173f = 1;
                        i2 = 1;
                    }
                }
            }
        }
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void i(long j6) {
        d(new k(this, Math.min(Math.max(30, j6 + j6), f6889i)), j6);
        this.g = true;
    }

    public final boolean j(I3.i iVar) {
        if (iVar == null) {
            return true;
        }
        String a6 = this.f6895c.a();
        if (System.currentTimeMillis() > iVar.f1184c + I3.i.d || !a6.equals(iVar.f1183b)) {
            return true;
        }
        return false;
    }
}
