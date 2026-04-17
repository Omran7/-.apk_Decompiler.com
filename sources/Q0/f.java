package Q0;

import B0.C0009h;
import B0.D;
import B0.p;
import B0.q;
import B0.u;
import B0.y;
import I1.b;
import R0.c;
import S0.a;
import U0.g;
import U0.i;
import U0.o;
import V0.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.e;
import com.mtma.criminal.city.utils.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import q.C0928e;
import z0.C1130f;

public final class f implements c, c {

    /* renamed from: C  reason: collision with root package name */
    public static final boolean f2360C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A  reason: collision with root package name */
    public final RuntimeException f2361A;

    /* renamed from: B  reason: collision with root package name */
    public int f2362B;

    /* renamed from: a  reason: collision with root package name */
    public final String f2363a;

    /* renamed from: b  reason: collision with root package name */
    public final d f2364b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2365c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2366e;

    /* renamed from: f  reason: collision with root package name */
    public final e f2367f;
    public final Object g;
    public final Class h;

    /* renamed from: i  reason: collision with root package name */
    public final a f2368i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2369j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2370k;

    /* renamed from: l  reason: collision with root package name */
    public final com.bumptech.glide.f f2371l;

    /* renamed from: m  reason: collision with root package name */
    public final R0.d f2372m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f2373n;

    /* renamed from: o  reason: collision with root package name */
    public final a f2374o;

    /* renamed from: p  reason: collision with root package name */
    public final T2.c f2375p;

    /* renamed from: q  reason: collision with root package name */
    public D f2376q;

    /* renamed from: r  reason: collision with root package name */
    public C0009h f2377r;

    /* renamed from: s  reason: collision with root package name */
    public long f2378s;

    /* renamed from: t  reason: collision with root package name */
    public volatile q f2379t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f2380u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f2381v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f2382w;

    /* renamed from: x  reason: collision with root package name */
    public int f2383x;

    /* renamed from: y  reason: collision with root package name */
    public int f2384y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2385z;

    /* JADX WARNING: type inference failed for: r3v2, types: [V0.d, java.lang.Object] */
    public f(Context context, e eVar, Object obj, Object obj2, Class cls, a aVar, int i2, int i5, com.bumptech.glide.f fVar, R0.d dVar, ArrayList arrayList, d dVar2, q qVar, a aVar2) {
        String str;
        e eVar2 = eVar;
        T2.c cVar = g.f3683a;
        if (f2360C) {
            str = String.valueOf(hashCode());
        } else {
            str = null;
        }
        this.f2363a = str;
        this.f2364b = new Object();
        this.f2365c = obj;
        this.f2366e = context;
        this.f2367f = eVar2;
        this.g = obj2;
        this.h = cls;
        this.f2368i = aVar;
        this.f2369j = i2;
        this.f2370k = i5;
        this.f2371l = fVar;
        this.f2372m = dVar;
        this.f2373n = arrayList;
        this.d = dVar2;
        this.f2379t = qVar;
        this.f2374o = aVar2;
        this.f2375p = cVar;
        this.f2362B = 1;
        if (this.f2361A == null && ((Map) eVar2.h.f2796b).containsKey(com.bumptech.glide.d.class)) {
            this.f2361A = new RuntimeException("Glide request origin trace");
        }
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.f2365c) {
            if (this.f2362B == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final void b() {
        if (!this.f2385z) {
            this.f2364b.a();
            this.f2372m.a(this);
            C0009h hVar = this.f2377r;
            if (hVar != null) {
                synchronized (((q) hVar.d)) {
                    ((u) hVar.f228b).g((f) hVar.f229c);
                }
                this.f2377r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable c() {
        if (this.f2381v == null) {
            a aVar = this.f2368i;
            aVar.getClass();
            this.f2381v = null;
            int i2 = aVar.f2343f;
            if (i2 > 0) {
                aVar.getClass();
                Context context = this.f2366e;
                this.f2381v = com.bumptech.glide.d.j0(context, context, i2, context.getTheme());
            }
        }
        return this.f2381v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r5.f2379t.getClass();
        B0.q.f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2365c
            monitor-enter(r0)
            boolean r1 = r5.f2385z     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0042
            V0.d r1 = r5.f2364b     // Catch:{ all -> 0x0013 }
            r1.a()     // Catch:{ all -> 0x0013 }
            int r1 = r5.f2362B     // Catch:{ all -> 0x0013 }
            r2 = 6
            if (r1 != r2) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x004a
        L_0x0015:
            r5.b()     // Catch:{ all -> 0x0013 }
            B0.D r1 = r5.f2376q     // Catch:{ all -> 0x0013 }
            r3 = 0
            if (r1 == 0) goto L_0x0020
            r5.f2376q = r3     // Catch:{ all -> 0x0013 }
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            Q0.d r3 = r5.d     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.c(r5)     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0034
        L_0x002b:
            R0.d r3 = r5.f2372m     // Catch:{ all -> 0x0013 }
            android.graphics.drawable.Drawable r4 = r5.c()     // Catch:{ all -> 0x0013 }
            r3.h(r4)     // Catch:{ all -> 0x0013 }
        L_0x0034:
            r5.f2362B = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0041
            B0.q r0 = r5.f2379t
            r0.getClass()
            B0.q.f(r1)
        L_0x0041:
            return
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x0013 }
            throw r1     // Catch:{ all -> 0x0013 }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.f.clear():void");
    }

    public final boolean d() {
        boolean z3;
        synchronized (this.f2365c) {
            if (this.f2362B == 6) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final boolean e(c cVar) {
        int i2;
        int i5;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.f fVar;
        int i6;
        int i7;
        int i8;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.f fVar2;
        int i9;
        boolean z3;
        boolean z4;
        c cVar2 = cVar;
        if (!(cVar2 instanceof f)) {
            return false;
        }
        synchronized (this.f2365c) {
            try {
                i2 = this.f2369j;
                i5 = this.f2370k;
                obj = this.g;
                cls = this.h;
                aVar = this.f2368i;
                fVar = this.f2371l;
                ArrayList arrayList = this.f2373n;
                if (arrayList != null) {
                    i6 = arrayList.size();
                } else {
                    i6 = 0;
                }
            } finally {
                while (true) {
                }
            }
        }
        f fVar3 = (f) cVar2;
        synchronized (fVar3.f2365c) {
            try {
                i7 = fVar3.f2369j;
                i8 = fVar3.f2370k;
                obj2 = fVar3.g;
                cls2 = fVar3.h;
                aVar2 = fVar3.f2368i;
                fVar2 = fVar3.f2371l;
                ArrayList arrayList2 = fVar3.f2373n;
                if (arrayList2 != null) {
                    i9 = arrayList2.size();
                } else {
                    i9 = 0;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (i2 == i7 && i5 == i8) {
            char[] cArr = o.f3697a;
            if (obj != null) {
                z3 = obj.equals(obj2);
            } else if (obj2 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && cls.equals(cls2)) {
                if (aVar != null) {
                    z4 = aVar.f(aVar2);
                } else if (aVar2 == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && fVar == fVar2 && i6 == i9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        d dVar = this.d;
        if (dVar == null || !dVar.f().a()) {
            return true;
        }
        return false;
    }

    public final void g() {
        synchronized (this.f2365c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f2365c
            monitor-enter(r0)
            boolean r1 = r7.f2385z     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x00d0
            V0.d r1 = r7.f2364b     // Catch:{ all -> 0x002d }
            r1.a()     // Catch:{ all -> 0x002d }
            int r1 = U0.i.f3686b     // Catch:{ all -> 0x002d }
            long r1 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x002d }
            r7.f2378s = r1     // Catch:{ all -> 0x002d }
            java.lang.Object r1 = r7.g     // Catch:{ all -> 0x002d }
            r2 = 3
            r3 = 5
            if (r1 != 0) goto L_0x004d
            int r1 = r7.f2369j     // Catch:{ all -> 0x002d }
            int r4 = r7.f2370k     // Catch:{ all -> 0x002d }
            boolean r1 = U0.o.i(r1, r4)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0030
            int r1 = r7.f2369j     // Catch:{ all -> 0x002d }
            r7.f2383x = r1     // Catch:{ all -> 0x002d }
            int r1 = r7.f2370k     // Catch:{ all -> 0x002d }
            r7.f2384y = r1     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r1 = move-exception
            goto L_0x00d8
        L_0x0030:
            android.graphics.drawable.Drawable r1 = r7.f2382w     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x003c
            Q0.a r1 = r7.f2368i     // Catch:{ all -> 0x002d }
            r1.getClass()     // Catch:{ all -> 0x002d }
            r1 = 0
            r7.f2382w = r1     // Catch:{ all -> 0x002d }
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r7.f2382w     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0041
            r2 = r3
        L_0x0041:
            B0.y r1 = new B0.y     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Received null model"
            r1.<init>(r3)     // Catch:{ all -> 0x002d }
            r7.j(r1, r2)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x004d:
            int r1 = r7.f2362B     // Catch:{ all -> 0x002d }
            r4 = 2
            if (r1 == r4) goto L_0x00c8
            r5 = 0
            r6 = 4
            if (r1 != r6) goto L_0x005d
            B0.D r1 = r7.f2376q     // Catch:{ all -> 0x002d }
            r7.l(r1, r3, r5)     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x005d:
            java.util.ArrayList r1 = r7.f2373n     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x0062
            goto L_0x0073
        L_0x0062:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002d }
        L_0x0066:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x002d }
            com.mtma.criminal.city.utils.Z r3 = (com.mtma.criminal.city.utils.Z) r3     // Catch:{ all -> 0x002d }
            goto L_0x0066
        L_0x0073:
            r7.f2362B = r2     // Catch:{ all -> 0x002d }
            int r1 = r7.f2369j     // Catch:{ all -> 0x002d }
            int r3 = r7.f2370k     // Catch:{ all -> 0x002d }
            boolean r1 = U0.o.i(r1, r3)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0087
            int r1 = r7.f2369j     // Catch:{ all -> 0x002d }
            int r3 = r7.f2370k     // Catch:{ all -> 0x002d }
            r7.n(r1, r3)     // Catch:{ all -> 0x002d }
            goto L_0x008c
        L_0x0087:
            R0.d r1 = r7.f2372m     // Catch:{ all -> 0x002d }
            r1.e(r7)     // Catch:{ all -> 0x002d }
        L_0x008c:
            int r1 = r7.f2362B     // Catch:{ all -> 0x002d }
            if (r1 == r4) goto L_0x0092
            if (r1 != r2) goto L_0x00a8
        L_0x0092:
            Q0.d r1 = r7.d     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x009c
            boolean r1 = r1.j(r7)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x009d
        L_0x009c:
            r5 = 1
        L_0x009d:
            if (r5 == 0) goto L_0x00a8
            R0.d r1 = r7.f2372m     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r2 = r7.c()     // Catch:{ all -> 0x002d }
            r1.f(r2)     // Catch:{ all -> 0x002d }
        L_0x00a8:
            boolean r1 = f2360C     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x00c6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r1.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x002d }
            long r2 = r7.f2378s     // Catch:{ all -> 0x002d }
            double r2 = U0.i.a(r2)     // Catch:{ all -> 0x002d }
            r1.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x002d }
            r7.i(r1)     // Catch:{ all -> 0x002d }
        L_0x00c6:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x00c8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            throw r1     // Catch:{ all -> 0x002d }
        L_0x00d0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            throw r1     // Catch:{ all -> 0x002d }
        L_0x00d8:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.f.h():void");
    }

    public final void i(String str) {
        StringBuilder b6 = C0928e.b(str, " this: ");
        b6.append(this.f2363a);
        Log.v("GlideRequest", b6.toString());
    }

    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f2365c) {
            int i2 = this.f2362B;
            if (i2 != 2) {
                if (i2 != 3) {
                    z3 = false;
                }
            }
            z3 = true;
        }
        return z3;
    }

    public final void j(y yVar, int i2) {
        Drawable drawable;
        this.f2364b.a();
        synchronized (this.f2365c) {
            try {
                yVar.getClass();
                int i5 = this.f2367f.f5764i;
                if (i5 <= i2) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.f2383x + "x" + this.f2384y + "]", yVar);
                    if (i5 <= 4) {
                        yVar.d();
                    }
                }
                this.f2377r = null;
                this.f2362B = 5;
                d dVar = this.d;
                if (dVar != null) {
                    dVar.b(this);
                }
                boolean z3 = true;
                this.f2385z = true;
                ArrayList arrayList = this.f2373n;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        f();
                        ((Z) it2.next()).getClass();
                    }
                }
                d dVar2 = this.d;
                if (dVar2 != null) {
                    if (!dVar2.j(this)) {
                        z3 = false;
                    }
                }
                if (z3) {
                    if (this.g == null) {
                        if (this.f2382w == null) {
                            this.f2368i.getClass();
                            this.f2382w = null;
                        }
                        drawable = this.f2382w;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.f2380u == null) {
                            a aVar = this.f2368i;
                            aVar.getClass();
                            this.f2380u = null;
                            int i6 = aVar.f2342e;
                            if (i6 > 0) {
                                this.f2368i.getClass();
                                Context context = this.f2366e;
                                this.f2380u = com.bumptech.glide.d.j0(context, context, i6, context.getTheme());
                            }
                        }
                        drawable = this.f2380u;
                    }
                    if (drawable == null) {
                        drawable = c();
                    }
                    this.f2372m.b(drawable);
                }
                this.f2385z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean k() {
        boolean z3;
        synchronized (this.f2365c) {
            if (this.f2362B == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final void l(D d6, int i2, boolean z3) {
        Object obj;
        String str;
        this.f2364b.a();
        D d7 = null;
        try {
            synchronized (this.f2365c) {
                this.f2377r = null;
                if (d6 == null) {
                    j(new y("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                    return;
                }
                Object obj2 = d6.get();
                if (obj2 != null) {
                    if (this.h.isAssignableFrom(obj2.getClass())) {
                        d dVar = this.d;
                        if (dVar == null || dVar.i(this)) {
                            try {
                                m(d6, obj2, i2);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } else {
                            try {
                                this.f2376q = null;
                                this.f2362B = 4;
                                this.f2379t.getClass();
                                q.f(d6);
                                return;
                            } catch (Throwable th2) {
                                d7 = d6;
                                th = th2;
                                throw th;
                            }
                        }
                    }
                }
                this.f2376q = null;
                StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                sb.append(this.h);
                sb.append(" but instead got ");
                if (obj2 != null) {
                    obj = obj2.getClass();
                } else {
                    obj = "";
                }
                sb.append(obj);
                sb.append("{");
                sb.append(obj2);
                sb.append("} inside Resource{");
                sb.append(d6);
                sb.append("}.");
                if (obj2 != null) {
                    str = "";
                } else {
                    str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                }
                sb.append(str);
                j(new y(sb.toString()), 5);
                this.f2379t.getClass();
                q.f(d6);
            }
        } catch (Throwable th3) {
            if (d7 != null) {
                this.f2379t.getClass();
                q.f(d7);
            }
            throw th3;
        }
    }

    public final void m(D d6, Object obj, int i2) {
        f();
        this.f2362B = 4;
        this.f2376q = d6;
        if (this.f2367f.f5764i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + o3.d.m(i2) + " for " + this.g + " with size [" + this.f2383x + "x" + this.f2384y + "] in " + i.a(this.f2378s) + " ms");
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.l(this);
        }
        this.f2385z = true;
        try {
            ArrayList arrayList = this.f2373n;
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Z z3 = (Z) it2.next();
                    switch (z3.f7384a) {
                        case 0:
                            Drawable drawable = (Drawable) obj;
                            b.B0(z3.f7385b);
                            break;
                        default:
                            Drawable drawable2 = (Drawable) obj;
                            b.z0(z3.f7385b);
                            break;
                    }
                }
            }
            this.f2374o.getClass();
            this.f2372m.i(obj);
            this.f2385z = false;
        } catch (Throwable th) {
            this.f2385z = false;
            throw th;
        }
    }

    public final void n(int i2, int i5) {
        Object obj;
        int i6;
        z0.i iVar;
        boolean z3;
        String str;
        int i7 = i2;
        int i8 = i5;
        this.f2364b.a();
        Object obj2 = this.f2365c;
        synchronized (obj2) {
            try {
                boolean z4 = f2360C;
                if (z4) {
                    i("Got onSizeReady in " + i.a(this.f2378s));
                }
                if (this.f2362B == 3) {
                    this.f2362B = 2;
                    float f6 = this.f2368i.f2340b;
                    if (i7 != Integer.MIN_VALUE) {
                        i7 = Math.round(((float) i7) * f6);
                    }
                    this.f2383x = i7;
                    if (i8 == Integer.MIN_VALUE) {
                        i6 = i8;
                    } else {
                        i6 = Math.round(f6 * ((float) i8));
                    }
                    this.f2384y = i6;
                    if (z4) {
                        i("finished setup for calling load in " + i.a(this.f2378s));
                    }
                    q qVar = this.f2379t;
                    e eVar = this.f2367f;
                    Object obj3 = this.g;
                    a aVar = this.f2368i;
                    C1130f fVar = aVar.f2347s;
                    int i9 = this.f2383x;
                    int i10 = this.f2384y;
                    Class cls = aVar.f2351w;
                    Class cls2 = this.h;
                    com.bumptech.glide.f fVar2 = this.f2371l;
                    p pVar = aVar.f2341c;
                    U0.d dVar = aVar.f2350v;
                    boolean z5 = aVar.f2348t;
                    String str2 = "finished onSizeReady in ";
                    boolean z6 = aVar.f2354z;
                    Object obj4 = obj2;
                    try {
                        iVar = aVar.f2349u;
                        z3 = aVar.f2344p;
                        obj = obj4;
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        obj = obj4;
                        throw th;
                    }
                    try {
                        C0009h a6 = qVar.a(eVar, obj3, fVar, i9, i10, cls, cls2, fVar2, pVar, dVar, z5, z6, iVar, z3, aVar.f2338A, this, this.f2375p);
                        this.f2377r = a6;
                        if (this.f2362B != 2) {
                            this.f2377r = null;
                        }
                        if (z4) {
                            i(str + i.a(this.f2378s));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f2365c) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
