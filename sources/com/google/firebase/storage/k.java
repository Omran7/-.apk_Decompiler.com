package com.google.firebase.storage;

import D2.l;
import P4.c;
import android.app.Activity;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

public abstract class k extends a {

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap f6933j;

    /* renamed from: a  reason: collision with root package name */
    public final Object f6934a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final o f6935b = new o(this, 128, new g(this, 0));

    /* renamed from: c  reason: collision with root package name */
    public final o f6936c = new o(this, 64, new g(this, 1));
    public final o d = new o(this, 448, new g(this, 2));

    /* renamed from: e  reason: collision with root package name */
    public final o f6937e = new o(this, 256, new g(this, 3));

    /* renamed from: f  reason: collision with root package name */
    public final o f6938f = new o(this, -465, new l(25));
    public final o g = new o(this, 16, new l(25));
    public volatile int h = 1;

    /* renamed from: i  reason: collision with root package name */
    public p f6939i;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        f6933j = hashMap2;
        hashMap.put(1, new HashSet(Arrays.asList(new Integer[]{16, 256})));
        hashMap.put(2, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(4, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        hashMap.put(16, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap.put(64, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        hashMap2.put(1, new HashSet(Arrays.asList(new Integer[]{2, 64})));
        hashMap2.put(2, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(4, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        hashMap2.put(8, new HashSet(Arrays.asList(new Integer[]{16, 64, 128})));
        hashMap2.put(32, new HashSet(Arrays.asList(new Integer[]{256, 64, 128})));
    }

    public static String d(int i2) {
        if (i2 == 1) {
            return "INTERNAL_STATE_NOT_STARTED";
        }
        if (i2 == 2) {
            return "INTERNAL_STATE_QUEUED";
        }
        if (i2 == 4) {
            return "INTERNAL_STATE_IN_PROGRESS";
        }
        if (i2 == 8) {
            return "INTERNAL_STATE_PAUSING";
        }
        if (i2 == 16) {
            return "INTERNAL_STATE_PAUSED";
        }
        if (i2 == 32) {
            return "INTERNAL_STATE_CANCELING";
        }
        if (i2 == 64) {
            return "INTERNAL_STATE_FAILURE";
        }
        if (i2 == 128) {
            return "INTERNAL_STATE_SUCCESS";
        }
        if (i2 != 256) {
            return "Unknown Internal State!";
        }
        return "INTERNAL_STATE_CANCELED";
    }

    public final Task a(Executor executor, Continuation continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.d.a((Activity) null, executor, new j(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        I.g(onCanceledListener);
        this.f6937e.a((Activity) null, (Executor) null, onCanceledListener);
        return this;
    }

    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        I.g(onCompleteListener);
        this.d.a((Activity) null, (Executor) null, onCompleteListener);
        return this;
    }

    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        I.g(onFailureListener);
        this.f6936c.a((Activity) null, (Executor) null, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        I.g(onSuccessListener);
        this.f6935b.a((Activity) null, (Executor) null, onSuccessListener);
        return this;
    }

    public final void b() {
        if (!isComplete() && (this.h & 16) == 0 && this.h != 2 && !g(256)) {
            g(64);
        }
    }

    public final p c() {
        p pVar = this.f6939i;
        if (pVar != null) {
            return pVar;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f6939i == null) {
            this.f6939i = f();
        }
        return this.f6939i;
    }

    public final Task continueWith(Continuation continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.a((Activity) null, (Executor) null, new i(this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task continueWithTask(Continuation continuation) {
        return a((Executor) null, continuation);
    }

    public abstract void e();

    public final p f() {
        Exception exc;
        p pVar;
        synchronized (this.f6934a) {
            q qVar = (q) this;
            if (qVar.f6965u != null) {
                exc = qVar.f6965u;
            } else {
                exc = qVar.f6966v;
            }
            e b6 = e.b(exc, qVar.f6967w);
            qVar.f6957m.get();
            pVar = new p(qVar, b6);
        }
        return pVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        return true;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = " isUser: false from state:"
            java.lang.String r1 = " isUser: false from state:"
            java.lang.String r2 = "unable to change internal state to: "
            java.lang.String r3 = "changed internal state to: "
            int[] r11 = new int[]{r11}
            java.util.HashMap r4 = f6933j
            java.lang.Object r5 = r10.f6934a
            monitor-enter(r5)
            r6 = 0
            r7 = r11[r6]     // Catch:{ all -> 0x004b }
            int r8 = r10.h     // Catch:{ all -> 0x004b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x004b }
            java.lang.Object r4 = r4.get(r8)     // Catch:{ all -> 0x004b }
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch:{ all -> 0x004b }
            r8 = 2
            if (r4 == 0) goto L_0x00b5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004b }
            boolean r4 = r4.contains(r9)     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x00b5
            r10.h = r7     // Catch:{ all -> 0x004b }
            int r11 = r10.h     // Catch:{ all -> 0x004b }
            if (r11 == r8) goto L_0x004e
            r0 = 4
            if (r11 == r0) goto L_0x0067
            r0 = 16
            if (r11 == r0) goto L_0x0067
            r0 = 64
            if (r11 == r0) goto L_0x0067
            r0 = 128(0x80, float:1.794E-43)
            if (r11 == r0) goto L_0x0067
            r0 = 256(0x100, float:3.59E-43)
            if (r11 == r0) goto L_0x0047
            goto L_0x0067
        L_0x0047:
            r10.e()     // Catch:{ all -> 0x004b }
            goto L_0x0067
        L_0x004b:
            r11 = move-exception
            goto L_0x00f0
        L_0x004e:
            com.google.firebase.storage.l r11 = com.google.firebase.storage.l.f6940c     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r11.f6942b     // Catch:{ all -> 0x004b }
            monitor-enter(r0)     // Catch:{ all -> 0x004b }
            java.util.HashMap r11 = r11.f6941a     // Catch:{ all -> 0x00b2 }
            r2 = r10
            com.google.firebase.storage.q r2 = (com.google.firebase.storage.q) r2     // Catch:{ all -> 0x00b2 }
            com.google.firebase.storage.f r2 = r2.f6955k     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b2 }
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00b2 }
            r4.<init>(r10)     // Catch:{ all -> 0x00b2 }
            r11.put(r2, r4)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
        L_0x0067:
            com.google.firebase.storage.o r11 = r10.f6935b     // Catch:{ all -> 0x004b }
            r11.g()     // Catch:{ all -> 0x004b }
            com.google.firebase.storage.o r11 = r10.f6936c     // Catch:{ all -> 0x004b }
            r11.g()     // Catch:{ all -> 0x004b }
            com.google.firebase.storage.o r11 = r10.f6937e     // Catch:{ all -> 0x004b }
            r11.g()     // Catch:{ all -> 0x004b }
            com.google.firebase.storage.o r11 = r10.d     // Catch:{ all -> 0x004b }
            r11.g()     // Catch:{ all -> 0x004b }
            com.google.firebase.storage.o r11 = r10.g     // Catch:{ all -> 0x004b }
            r11.g()     // Catch:{ all -> 0x004b }
            com.google.firebase.storage.o r11 = r10.f6938f     // Catch:{ all -> 0x004b }
            r11.g()     // Catch:{ all -> 0x004b }
            java.lang.String r11 = "StorageTask"
            r0 = 3
            boolean r11 = android.util.Log.isLoggable(r11, r0)     // Catch:{ all -> 0x004b }
            if (r11 == 0) goto L_0x00af
            java.lang.String r11 = "StorageTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r0.<init>(r3)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = d(r7)     // Catch:{ all -> 0x004b }
            r0.append(r2)     // Catch:{ all -> 0x004b }
            r0.append(r1)     // Catch:{ all -> 0x004b }
            int r1 = r10.h     // Catch:{ all -> 0x004b }
            java.lang.String r1 = d(r1)     // Catch:{ all -> 0x004b }
            r0.append(r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x004b }
            android.util.Log.d(r11, r0)     // Catch:{ all -> 0x004b }
        L_0x00af:
            monitor-exit(r5)     // Catch:{ all -> 0x004b }
            r6 = 1
            goto L_0x00ef
        L_0x00b2:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
            throw r11     // Catch:{ all -> 0x004b }
        L_0x00b5:
            java.lang.String r1 = "StorageTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r3.<init>(r2)     // Catch:{ all -> 0x004b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r2.<init>()     // Catch:{ all -> 0x004b }
            r11 = r11[r6]     // Catch:{ all -> 0x004b }
            java.lang.String r11 = d(r11)     // Catch:{ all -> 0x004b }
            r2.append(r11)     // Catch:{ all -> 0x004b }
            java.lang.String r11 = ", "
            r2.append(r11)     // Catch:{ all -> 0x004b }
            int r11 = r2.length()     // Catch:{ all -> 0x004b }
            int r11 = r11 - r8
            java.lang.String r11 = r2.substring(r6, r11)     // Catch:{ all -> 0x004b }
            r3.append(r11)     // Catch:{ all -> 0x004b }
            r3.append(r0)     // Catch:{ all -> 0x004b }
            int r11 = r10.h     // Catch:{ all -> 0x004b }
            java.lang.String r11 = d(r11)     // Catch:{ all -> 0x004b }
            r3.append(r11)     // Catch:{ all -> 0x004b }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x004b }
            android.util.Log.w(r1, r11)     // Catch:{ all -> 0x004b }
            monitor-exit(r5)     // Catch:{ all -> 0x004b }
        L_0x00ef:
            return r6
        L_0x00f0:
            monitor-exit(r5)     // Catch:{ all -> 0x004b }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.k.g(int):boolean");
    }

    public final Exception getException() {
        if (c() == null) {
            return null;
        }
        return c().f6951a;
    }

    public final Object getResult() {
        if (c() != null) {
            e eVar = c().f6951a;
            if (eVar == null) {
                return c();
            }
            throw new RuntimeExecutionException(eVar);
        }
        throw new IllegalStateException();
    }

    public final boolean isCanceled() {
        if (this.h == 256) {
            return true;
        }
        return false;
    }

    public final boolean isComplete() {
        if ((this.h & 448) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSuccessful() {
        if ((this.h & 128) != 0) {
            return true;
        }
        return false;
    }

    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f6935b.a((Activity) null, (Executor) null, new c(successContinuation, taskCompletionSource, cancellationTokenSource, 1));
        return taskCompletionSource.getTask();
    }

    public final Task continueWithTask(Executor executor, Continuation continuation) {
        return a(executor, continuation);
    }

    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        I.g(onCanceledListener);
        I.g(executor);
        this.f6937e.a((Activity) null, executor, onCanceledListener);
        return this;
    }

    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        I.g(onCompleteListener);
        I.g(executor);
        this.d.a((Activity) null, executor, onCompleteListener);
        return this;
    }

    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        I.g(onFailureListener);
        I.g(executor);
        this.f6936c.a((Activity) null, executor, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        I.g(executor);
        I.g(onSuccessListener);
        this.f6935b.a((Activity) null, executor, onSuccessListener);
        return this;
    }

    public final Task continueWith(Executor executor, Continuation continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.a((Activity) null, executor, new i(this, continuation, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        I.g(onCanceledListener);
        I.g(activity);
        this.f6937e.a(activity, (Executor) null, onCanceledListener);
        return this;
    }

    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        I.g(onCompleteListener);
        I.g(activity);
        this.d.a(activity, (Executor) null, onCompleteListener);
        return this;
    }

    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        I.g(onFailureListener);
        I.g(activity);
        this.f6936c.a(activity, (Executor) null, onFailureListener);
        return this;
    }

    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        I.g(activity);
        I.g(onSuccessListener);
        this.f6935b.a(activity, (Executor) null, onSuccessListener);
        return this;
    }

    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f6935b.a((Activity) null, executor, new c(successContinuation, taskCompletionSource, cancellationTokenSource, 1));
        return taskCompletionSource.getTask();
    }

    public final Object getResult(Class cls) {
        if (c() == null) {
            throw new IllegalStateException();
        } else if (!cls.isInstance(c().f6951a)) {
            e eVar = c().f6951a;
            if (eVar == null) {
                return c();
            }
            throw new RuntimeExecutionException(eVar);
        } else {
            throw ((Throwable) cls.cast(c().f6951a));
        }
    }
}
