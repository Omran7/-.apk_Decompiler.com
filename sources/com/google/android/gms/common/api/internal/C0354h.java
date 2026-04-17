package com.google.android.gms.common.api.internal;

import B1.c;
import I1.b;
import X4.d;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0384m;
import com.google.android.gms.common.internal.C0390t;
import com.google.android.gms.common.internal.C0391u;
import com.google.android.gms.common.internal.C0392v;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import h0.C0552a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n.f;
import z1.C1132b;
import z1.e;

/* renamed from: com.google.android.gms.common.api.internal.h  reason: case insensitive filesystem */
public final class C0354h implements Handler.Callback {

    /* renamed from: p  reason: collision with root package name */
    public static final Status f6089p = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (C1132b) null);

    /* renamed from: q  reason: collision with root package name */
    public static final Status f6090q = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (C1132b) null);

    /* renamed from: r  reason: collision with root package name */
    public static final Object f6091r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static C0354h f6092s;

    /* renamed from: a  reason: collision with root package name */
    public long f6093a = 10000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6094b = false;

    /* renamed from: c  reason: collision with root package name */
    public C0392v f6095c;
    public c d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f6096e;

    /* renamed from: f  reason: collision with root package name */
    public final e f6097f;
    public final d g;
    public final AtomicInteger h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f6098i;

    /* renamed from: j  reason: collision with root package name */
    public final ConcurrentHashMap f6099j;

    /* renamed from: k  reason: collision with root package name */
    public E f6100k;

    /* renamed from: l  reason: collision with root package name */
    public final f f6101l;

    /* renamed from: m  reason: collision with root package name */
    public final f f6102m;

    /* renamed from: n  reason: collision with root package name */
    public final zau f6103n;

    /* renamed from: o  reason: collision with root package name */
    public volatile boolean f6104o;

    public C0354h(Context context, Looper looper) {
        e eVar = e.d;
        boolean z3 = true;
        this.h = new AtomicInteger(1);
        this.f6098i = new AtomicInteger(0);
        this.f6099j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f6100k = null;
        this.f6101l = new f(0);
        this.f6102m = new f(0);
        this.f6104o = true;
        this.f6096e = context;
        zau zau = new zau(looper, this);
        this.f6103n = zau;
        this.f6097f = eVar;
        this.g = new d(9);
        PackageManager packageManager = context.getPackageManager();
        if (G1.c.f828f == null) {
            G1.c.f828f = Boolean.valueOf((!G1.c.d() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : z3);
        }
        if (G1.c.f828f.booleanValue()) {
            this.f6104o = false;
        }
        zau.sendMessage(zau.obtainMessage(6));
    }

    public static void a() {
        synchronized (f6091r) {
            try {
                C0354h hVar = f6092s;
                if (hVar != null) {
                    hVar.f6098i.incrementAndGet();
                    zau zau = hVar.f6103n;
                    zau.sendMessageAtFrontOfQueue(zau.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C0347a aVar, C1132b bVar) {
        return new Status(17, C0552a.p("API: ", aVar.f6074b.f6012c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f12802c, bVar);
    }

    public static C0354h h(Context context) {
        C0354h hVar;
        HandlerThread handlerThread;
        synchronized (f6091r) {
            if (f6092s == null) {
                synchronized (C0384m.f6198a) {
                    try {
                        handlerThread = C0384m.f6200c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            C0384m.f6200c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = C0384m.f6200c;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = e.f12809c;
                f6092s = new C0354h(applicationContext, looper);
            }
            hVar = f6092s;
        }
        return hVar;
    }

    public final void b(E e6) {
        synchronized (f6091r) {
            try {
                if (this.f6100k != e6) {
                    this.f6100k = e6;
                    this.f6101l.clear();
                }
                this.f6101l.addAll(e6.f6022e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f6094b) {
            return false;
        }
        C0391u uVar = (C0391u) C0390t.e().f6216a;
        if (uVar != null && !uVar.f6218b) {
            return false;
        }
        int i2 = ((SparseIntArray) this.g.f4209b).get(203400000, -1);
        if (i2 == -1 || i2 == 0) {
            return true;
        }
        return false;
    }

    public final boolean d(C1132b bVar, int i2) {
        boolean z3;
        e eVar = this.f6097f;
        eVar.getClass();
        Context context = this.f6096e;
        if (b.o0(context)) {
            return false;
        }
        int i5 = bVar.f12801b;
        PendingIntent pendingIntent = bVar.f12802c;
        if (i5 == 0 || pendingIntent == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            pendingIntent = null;
            Intent a6 = eVar.a(i5, context, (String) null);
            if (a6 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a6, 201326592);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i6 = GoogleApiActivity.f5998b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        eVar.g(context, i5, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
        return true;
    }

    public final H f(l lVar) {
        ConcurrentHashMap concurrentHashMap = this.f6099j;
        C0347a apiKey = lVar.getApiKey();
        H h6 = (H) concurrentHashMap.get(apiKey);
        if (h6 == null) {
            h6 = new H(this, lVar);
            concurrentHashMap.put(apiKey, h6);
        }
        if (h6.f6029b.requiresSignIn()) {
            this.f6102m.add(apiKey);
        }
        h6.n();
        return h6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, com.google.android.gms.common.api.l r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L_0x007d
            com.google.android.gms.common.api.internal.a r3 = r11.getApiKey()
            boolean r11 = r8.c()
            if (r11 != 0) goto L_0x000d
            goto L_0x004b
        L_0x000d:
            com.google.android.gms.common.internal.t r11 = com.google.android.gms.common.internal.C0390t.e()
            java.lang.Object r11 = r11.f6216a
            com.google.android.gms.common.internal.u r11 = (com.google.android.gms.common.internal.C0391u) r11
            r0 = 1
            if (r11 == 0) goto L_0x004d
            boolean r1 = r11.f6218b
            if (r1 == 0) goto L_0x004b
            java.util.concurrent.ConcurrentHashMap r1 = r8.f6099j
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.common.api.internal.H r1 = (com.google.android.gms.common.api.internal.H) r1
            if (r1 == 0) goto L_0x0048
            com.google.android.gms.common.api.g r2 = r1.f6029b
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.C0377f
            if (r4 == 0) goto L_0x004b
            com.google.android.gms.common.internal.f r2 = (com.google.android.gms.common.internal.C0377f) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L_0x0048
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L_0x0048
            com.google.android.gms.common.internal.j r11 = com.google.android.gms.common.api.internal.N.a(r1, r2, r10)
            if (r11 == 0) goto L_0x004b
            int r2 = r1.f6037m
            int r2 = r2 + r0
            r1.f6037m = r2
            boolean r0 = r11.f6180c
            goto L_0x004d
        L_0x0048:
            boolean r0 = r11.f6219c
            goto L_0x004d
        L_0x004b:
            r10 = 0
            goto L_0x0069
        L_0x004d:
            com.google.android.gms.common.api.internal.N r11 = new com.google.android.gms.common.api.internal.N
            r1 = 0
            if (r0 == 0) goto L_0x0058
            long r4 = java.lang.System.currentTimeMillis()
            goto L_0x0059
        L_0x0058:
            r4 = r1
        L_0x0059:
            if (r0 == 0) goto L_0x0061
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6 = r0
            goto L_0x0062
        L_0x0061:
            r6 = r1
        L_0x0062:
            r0 = r11
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r11
        L_0x0069:
            if (r10 == 0) goto L_0x007d
            com.google.android.gms.tasks.Task r9 = r9.getTask()
            com.google.android.gms.internal.base.zau r11 = r8.f6103n
            r11.getClass()
            G.g r0 = new G.g
            r1 = 4
            r0.<init>(r11, r1)
            r9.addOnCompleteListener((java.util.concurrent.Executor) r0, r10)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0354h.g(com.google.android.gms.tasks.TaskCompletionSource, int, com.google.android.gms.common.api.l):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0320  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r15) {
        /*
            r14 = this;
            int r0 = r15.what
            com.google.android.gms.internal.base.zau r1 = r14.f6103n
            java.util.concurrent.ConcurrentHashMap r2 = r14.f6099j
            com.google.android.gms.common.internal.w r7 = com.google.android.gms.common.internal.C0393w.f6223b
            r3 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r5 = "GoogleApiManager"
            r9 = 17
            r10 = 0
            r6 = 0
            r11 = 1
            switch(r0) {
                case 1: goto L_0x03f4;
                case 2: goto L_0x03e9;
                case 3: goto L_0x03c8;
                case 4: goto L_0x038f;
                case 5: goto L_0x0324;
                case 6: goto L_0x029f;
                case 7: goto L_0x0296;
                case 8: goto L_0x038f;
                case 9: goto L_0x0276;
                case 10: goto L_0x024f;
                case 11: goto L_0x01f1;
                case 12: goto L_0x01dc;
                case 13: goto L_0x038f;
                case 14: goto L_0x01b4;
                case 15: goto L_0x0180;
                case 16: goto L_0x00fd;
                case 17: goto L_0x00d3;
                case 18: goto L_0x002b;
                case 19: goto L_0x0027;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown message id: "
            r15.<init>(r1)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            android.util.Log.w(r5, r15)
            return r6
        L_0x0027:
            r14.f6094b = r6
            goto L_0x0426
        L_0x002b:
            java.lang.Object r15 = r15.obj
            com.google.android.gms.common.api.internal.O r15 = (com.google.android.gms.common.api.internal.O) r15
            long r2 = r15.f6053c
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            com.google.android.gms.common.internal.s r2 = r15.f6051a
            int r12 = r15.f6052b
            if (r0 != 0) goto L_0x0062
            com.google.android.gms.common.internal.v r15 = new com.google.android.gms.common.internal.v
            com.google.android.gms.common.internal.s[] r0 = new com.google.android.gms.common.internal.C0389s[]{r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r15.<init>(r12, r0)
            B1.c r0 = r14.d
            if (r0 != 0) goto L_0x005b
            B1.c r0 = new B1.c
            com.google.android.gms.common.api.k r8 = com.google.android.gms.common.api.k.f6119c
            com.google.android.gms.common.api.i r6 = B1.c.f339a
            android.content.Context r4 = r14.f6096e
            r5 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r14.d = r0
        L_0x005b:
            B1.c r0 = r14.d
            r0.c(r15)
            goto L_0x0426
        L_0x0062:
            com.google.android.gms.common.internal.v r0 = r14.f6095c
            if (r0 == 0) goto L_0x00b5
            java.util.List r3 = r0.f6222b
            int r0 = r0.f6221a
            if (r0 != r12) goto L_0x008a
            if (r3 == 0) goto L_0x0077
            int r0 = r3.size()
            int r3 = r15.d
            if (r0 < r3) goto L_0x0077
            goto L_0x008a
        L_0x0077:
            com.google.android.gms.common.internal.v r0 = r14.f6095c
            java.util.List r3 = r0.f6222b
            if (r3 != 0) goto L_0x0084
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f6222b = r3
        L_0x0084:
            java.util.List r0 = r0.f6222b
            r0.add(r2)
            goto L_0x00b5
        L_0x008a:
            r1.removeMessages(r9)
            com.google.android.gms.common.internal.v r0 = r14.f6095c
            if (r0 == 0) goto L_0x00b5
            int r3 = r0.f6221a
            if (r3 > 0) goto L_0x009b
            boolean r3 = r14.c()
            if (r3 == 0) goto L_0x00b3
        L_0x009b:
            B1.c r3 = r14.d
            if (r3 != 0) goto L_0x00ae
            B1.c r13 = new B1.c
            com.google.android.gms.common.api.k r8 = com.google.android.gms.common.api.k.f6119c
            android.content.Context r4 = r14.f6096e
            r5 = 0
            com.google.android.gms.common.api.i r6 = B1.c.f339a
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r14.d = r13
        L_0x00ae:
            B1.c r3 = r14.d
            r3.c(r0)
        L_0x00b3:
            r14.f6095c = r10
        L_0x00b5:
            com.google.android.gms.common.internal.v r0 = r14.f6095c
            if (r0 != 0) goto L_0x0426
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            com.google.android.gms.common.internal.v r2 = new com.google.android.gms.common.internal.v
            r2.<init>(r12, r0)
            r14.f6095c = r2
            android.os.Message r0 = r1.obtainMessage(r9)
            long r2 = r15.f6053c
            r1.sendMessageDelayed(r0, r2)
            goto L_0x0426
        L_0x00d3:
            com.google.android.gms.common.internal.v r15 = r14.f6095c
            if (r15 == 0) goto L_0x0426
            int r0 = r15.f6221a
            if (r0 > 0) goto L_0x00e1
            boolean r0 = r14.c()
            if (r0 == 0) goto L_0x00f9
        L_0x00e1:
            B1.c r0 = r14.d
            if (r0 != 0) goto L_0x00f4
            B1.c r0 = new B1.c
            com.google.android.gms.common.api.k r8 = com.google.android.gms.common.api.k.f6119c
            android.content.Context r4 = r14.f6096e
            r5 = 0
            com.google.android.gms.common.api.i r6 = B1.c.f339a
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r14.d = r0
        L_0x00f4:
            B1.c r0 = r14.d
            r0.c(r15)
        L_0x00f9:
            r14.f6095c = r10
            goto L_0x0426
        L_0x00fd:
            java.lang.Object r15 = r15.obj
            com.google.android.gms.common.api.internal.I r15 = (com.google.android.gms.common.api.internal.I) r15
            com.google.android.gms.common.api.internal.a r0 = r15.f6039a
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0426
            com.google.android.gms.common.api.internal.a r0 = r15.f6039a
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.common.api.internal.H r0 = (com.google.android.gms.common.api.internal.H) r0
            java.util.ArrayList r1 = r0.f6035k
            boolean r1 = r1.remove(r15)
            if (r1 == 0) goto L_0x0426
            com.google.android.gms.common.api.internal.h r1 = r0.f6038n
            com.google.android.gms.internal.base.zau r2 = r1.f6103n
            r3 = 15
            r2.removeMessages(r3, r15)
            com.google.android.gms.internal.base.zau r1 = r1.f6103n
            r2 = 16
            r1.removeMessages(r2, r15)
            java.util.LinkedList r1 = r0.f6028a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L_0x0138:
            boolean r4 = r3.hasNext()
            z1.d r5 = r15.f6040b
            if (r4 == 0) goto L_0x0167
            java.lang.Object r4 = r3.next()
            com.google.android.gms.common.api.internal.Z r4 = (com.google.android.gms.common.api.internal.Z) r4
            boolean r7 = r4 instanceof com.google.android.gms.common.api.internal.M
            if (r7 == 0) goto L_0x0138
            r7 = r4
            com.google.android.gms.common.api.internal.M r7 = (com.google.android.gms.common.api.internal.M) r7
            z1.d[] r7 = r7.g(r0)
            if (r7 == 0) goto L_0x0138
            int r8 = r7.length
            r9 = r6
        L_0x0155:
            if (r9 >= r8) goto L_0x0138
            r10 = r7[r9]
            boolean r10 = com.google.android.gms.common.internal.I.j(r10, r5)
            if (r10 == 0) goto L_0x0165
            if (r9 < 0) goto L_0x0138
            r2.add(r4)
            goto L_0x0138
        L_0x0165:
            int r9 = r9 + r11
            goto L_0x0155
        L_0x0167:
            int r15 = r2.size()
        L_0x016b:
            if (r6 >= r15) goto L_0x0426
            java.lang.Object r0 = r2.get(r6)
            com.google.android.gms.common.api.internal.Z r0 = (com.google.android.gms.common.api.internal.Z) r0
            r1.remove(r0)
            com.google.android.gms.common.api.w r3 = new com.google.android.gms.common.api.w
            r3.<init>(r5)
            r0.b(r3)
            int r6 = r6 + r11
            goto L_0x016b
        L_0x0180:
            java.lang.Object r15 = r15.obj
            com.google.android.gms.common.api.internal.I r15 = (com.google.android.gms.common.api.internal.I) r15
            com.google.android.gms.common.api.internal.a r0 = r15.f6039a
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0426
            com.google.android.gms.common.api.internal.a r0 = r15.f6039a
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.common.api.internal.H r0 = (com.google.android.gms.common.api.internal.H) r0
            java.util.ArrayList r1 = r0.f6035k
            boolean r15 = r1.contains(r15)
            if (r15 != 0) goto L_0x019e
            goto L_0x0426
        L_0x019e:
            boolean r15 = r0.f6034j
            if (r15 != 0) goto L_0x0426
            com.google.android.gms.common.api.g r15 = r0.f6029b
            boolean r15 = r15.isConnected()
            if (r15 != 0) goto L_0x01af
            r0.n()
            goto L_0x0426
        L_0x01af:
            r0.f()
            goto L_0x0426
        L_0x01b4:
            java.lang.Object r15 = r15.obj
            com.google.android.gms.common.api.internal.F r15 = (com.google.android.gms.common.api.internal.F) r15
            com.google.android.gms.common.api.internal.a r0 = r15.f6024a
            boolean r1 = r2.containsKey(r0)
            com.google.android.gms.tasks.TaskCompletionSource r15 = r15.f6025b
            if (r1 != 0) goto L_0x01c9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r15.setResult(r0)
            goto L_0x0426
        L_0x01c9:
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.common.api.internal.H r0 = (com.google.android.gms.common.api.internal.H) r0
            boolean r0 = r0.m(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.setResult(r0)
            goto L_0x0426
        L_0x01dc:
            java.lang.Object r0 = r15.obj
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0426
            java.lang.Object r15 = r15.obj
            java.lang.Object r15 = r2.get(r15)
            com.google.android.gms.common.api.internal.H r15 = (com.google.android.gms.common.api.internal.H) r15
            r15.m(r11)
            goto L_0x0426
        L_0x01f1:
            java.lang.Object r0 = r15.obj
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0426
            java.lang.Object r15 = r15.obj
            java.lang.Object r15 = r2.get(r15)
            com.google.android.gms.common.api.internal.H r15 = (com.google.android.gms.common.api.internal.H) r15
            com.google.android.gms.common.api.internal.h r0 = r15.f6038n
            com.google.android.gms.internal.base.zau r1 = r0.f6103n
            com.google.android.gms.common.internal.I.c(r1)
            boolean r1 = r15.f6034j
            if (r1 == 0) goto L_0x0426
            if (r1 == 0) goto L_0x0222
            com.google.android.gms.common.api.internal.h r1 = r15.f6038n
            com.google.android.gms.internal.base.zau r2 = r1.f6103n
            r3 = 11
            com.google.android.gms.common.api.internal.a r4 = r15.f6030c
            r2.removeMessages(r3, r4)
            com.google.android.gms.internal.base.zau r1 = r1.f6103n
            r2 = 9
            r1.removeMessages(r2, r4)
            r15.f6034j = r6
        L_0x0222:
            int r1 = z1.f.f12810a
            android.content.Context r2 = r0.f6096e
            z1.e r0 = r0.f6097f
            int r0 = r0.c(r2, r1)
            r1 = 18
            if (r0 != r1) goto L_0x023a
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 21
            java.lang.String r2 = "Connection timed out waiting for Google Play services update to complete."
            r0.<init>(r1, r2, r10, r10)
            goto L_0x0243
        L_0x023a:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 22
            java.lang.String r2 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r1, r2, r10, r10)
        L_0x0243:
            r15.d(r0)
            com.google.android.gms.common.api.g r15 = r15.f6029b
            java.lang.String r0 = "Timing out connection while resuming."
            r15.disconnect(r0)
            goto L_0x0426
        L_0x024f:
            n.f r15 = r14.f6102m
            r15.getClass()
            n.a r0 = new n.a
            r0.<init>((n.f) r15)
        L_0x0259:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0271
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.a r1 = (com.google.android.gms.common.api.internal.C0347a) r1
            java.lang.Object r1 = r2.remove(r1)
            com.google.android.gms.common.api.internal.H r1 = (com.google.android.gms.common.api.internal.H) r1
            if (r1 == 0) goto L_0x0259
            r1.r()
            goto L_0x0259
        L_0x0271:
            r15.clear()
            goto L_0x0426
        L_0x0276:
            java.lang.Object r0 = r15.obj
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x0426
            java.lang.Object r15 = r15.obj
            java.lang.Object r15 = r2.get(r15)
            com.google.android.gms.common.api.internal.H r15 = (com.google.android.gms.common.api.internal.H) r15
            com.google.android.gms.common.api.internal.h r0 = r15.f6038n
            com.google.android.gms.internal.base.zau r0 = r0.f6103n
            com.google.android.gms.common.internal.I.c(r0)
            boolean r0 = r15.f6034j
            if (r0 == 0) goto L_0x0426
            r15.n()
            goto L_0x0426
        L_0x0296:
            java.lang.Object r15 = r15.obj
            com.google.android.gms.common.api.l r15 = (com.google.android.gms.common.api.l) r15
            r14.f(r15)
            goto L_0x0426
        L_0x029f:
            android.content.Context r15 = r14.f6096e
            android.content.Context r0 = r15.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L_0x0426
            android.content.Context r15 = r15.getApplicationContext()
            android.app.Application r15 = (android.app.Application) r15
            com.google.android.gms.common.api.internal.C0349c.b(r15)
            com.google.android.gms.common.api.internal.c r15 = com.google.android.gms.common.api.internal.C0349c.f6081e
            com.google.android.gms.common.api.internal.G r0 = new com.google.android.gms.common.api.internal.G
            r0.<init>(r14, r6)
            r15.a(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.f6083b
            boolean r1 = r0.get()
            java.util.concurrent.atomic.AtomicBoolean r15 = r15.f6082a
            if (r1 != 0) goto L_0x031a
            java.lang.Boolean r1 = G1.c.f829i
            if (r1 != 0) goto L_0x02fa
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x02d9
            boolean r1 = android.os.Process.isIsolated()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x02f8
        L_0x02d9:
            java.lang.Class<android.os.Process> r1 = android.os.Process.class
            java.lang.String r2 = "isIsolated"
            com.google.android.gms.internal.common.zzj[] r5 = new com.google.android.gms.internal.common.zzj[r6]     // Catch:{ ReflectiveOperationException -> 0x02f6 }
            java.lang.Object r1 = com.google.android.gms.internal.common.zzl.zza(r1, r2, r5)     // Catch:{ ReflectiveOperationException -> 0x02f6 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ ReflectiveOperationException -> 0x02f6 }
            java.lang.String r5 = "expected a non-null reference"
            if (r1 == 0) goto L_0x02ec
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ ReflectiveOperationException -> 0x02f6 }
            goto L_0x02f8
        L_0x02ec:
            com.google.android.gms.internal.common.zzac r1 = new com.google.android.gms.internal.common.zzac     // Catch:{ ReflectiveOperationException -> 0x02f6 }
            java.lang.String r2 = com.google.android.gms.internal.common.zzab.zza(r5, r2)     // Catch:{ ReflectiveOperationException -> 0x02f6 }
            r1.<init>(r2)     // Catch:{ ReflectiveOperationException -> 0x02f6 }
            throw r1     // Catch:{ ReflectiveOperationException -> 0x02f6 }
        L_0x02f6:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x02f8:
            G1.c.f829i = r1
        L_0x02fa:
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0318
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            android.app.ActivityManager.getMyMemoryState(r1)
            boolean r0 = r0.getAndSet(r11)
            if (r0 != 0) goto L_0x031a
            int r0 = r1.importance
            r1 = 100
            if (r0 <= r1) goto L_0x031a
            r15.set(r11)
            goto L_0x031a
        L_0x0318:
            r15 = r11
            goto L_0x031e
        L_0x031a:
            boolean r15 = r15.get()
        L_0x031e:
            if (r15 != 0) goto L_0x0426
            r14.f6093a = r3
            goto L_0x0426
        L_0x0324:
            int r0 = r15.arg1
            java.lang.Object r15 = r15.obj
            z1.b r15 = (z1.C1132b) r15
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0332:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0343
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.internal.H r2 = (com.google.android.gms.common.api.internal.H) r2
            int r3 = r2.h
            if (r3 != r0) goto L_0x0332
            goto L_0x0344
        L_0x0343:
            r2 = r10
        L_0x0344:
            if (r2 == 0) goto L_0x037d
            int r0 = r15.f12801b
            r1 = 13
            if (r0 != r1) goto L_0x0372
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            z1.e r3 = r14.f6097f
            r3.getClass()
            java.util.concurrent.atomic.AtomicBoolean r3 = z1.i.f12814a
            java.lang.String r0 = z1.C1132b.v(r0)
            java.lang.String r3 = "Error resolution was canceled by the user, original error message: "
            java.lang.String r4 = ": "
            java.lang.StringBuilder r0 = h0.C0552a.t(r3, r0, r4)
            java.lang.String r15 = r15.d
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r1.<init>(r9, r15, r10, r10)
            r2.d(r1)
            goto L_0x0426
        L_0x0372:
            com.google.android.gms.common.api.internal.a r0 = r2.f6030c
            com.google.android.gms.common.api.Status r15 = e(r0, r15)
            r2.d(r15)
            goto L_0x0426
        L_0x037d:
            java.lang.String r15 = "Could not find API instance "
            java.lang.String r1 = " while trying to fail enqueued calls."
            java.lang.String r15 = h0.C0552a.k(r0, r15, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            android.util.Log.wtf(r5, r15, r0)
            goto L_0x0426
        L_0x038f:
            java.lang.Object r15 = r15.obj
            com.google.android.gms.common.api.internal.P r15 = (com.google.android.gms.common.api.internal.P) r15
            com.google.android.gms.common.api.l r0 = r15.f6056c
            com.google.android.gms.common.api.internal.a r0 = r0.getApiKey()
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.common.api.internal.H r0 = (com.google.android.gms.common.api.internal.H) r0
            if (r0 != 0) goto L_0x03a7
            com.google.android.gms.common.api.l r0 = r15.f6056c
            com.google.android.gms.common.api.internal.H r0 = r14.f(r0)
        L_0x03a7:
            com.google.android.gms.common.api.g r1 = r0.f6029b
            boolean r1 = r1.requiresSignIn()
            com.google.android.gms.common.api.internal.Z r2 = r15.f6054a
            if (r1 == 0) goto L_0x03c4
            java.util.concurrent.atomic.AtomicInteger r1 = r14.f6098i
            int r1 = r1.get()
            int r15 = r15.f6055b
            if (r1 == r15) goto L_0x03c4
            com.google.android.gms.common.api.Status r15 = f6089p
            r2.a(r15)
            r0.r()
            goto L_0x0426
        L_0x03c4:
            r0.o(r2)
            goto L_0x0426
        L_0x03c8:
            java.util.Collection r15 = r2.values()
            java.util.Iterator r15 = r15.iterator()
        L_0x03d0:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0426
            java.lang.Object r0 = r15.next()
            com.google.android.gms.common.api.internal.H r0 = (com.google.android.gms.common.api.internal.H) r0
            com.google.android.gms.common.api.internal.h r1 = r0.f6038n
            com.google.android.gms.internal.base.zau r1 = r1.f6103n
            com.google.android.gms.common.internal.I.c(r1)
            r0.f6036l = r10
            r0.n()
            goto L_0x03d0
        L_0x03e9:
            java.lang.Object r15 = r15.obj
            r15.getClass()
            java.lang.ClassCastException r15 = new java.lang.ClassCastException
            r15.<init>()
            throw r15
        L_0x03f4:
            java.lang.Object r15 = r15.obj
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r11 == r15) goto L_0x03ff
            goto L_0x0401
        L_0x03ff:
            r3 = 10000(0x2710, double:4.9407E-320)
        L_0x0401:
            r14.f6093a = r3
            r15 = 12
            r1.removeMessages(r15)
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0410:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0426
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.internal.a r2 = (com.google.android.gms.common.api.internal.C0347a) r2
            android.os.Message r2 = r1.obtainMessage(r15, r2)
            long r3 = r14.f6093a
            r1.sendMessageDelayed(r2, r3)
            goto L_0x0410
        L_0x0426:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0354h.handleMessage(android.os.Message):boolean");
    }

    public final void i(C1132b bVar, int i2) {
        if (!d(bVar, i2)) {
            zau zau = this.f6103n;
            zau.sendMessage(zau.obtainMessage(5, i2, 0, bVar));
        }
    }
}
