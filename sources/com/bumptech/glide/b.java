package com.bumptech.glide;

import B0.q;
import C0.g;
import D0.f;
import T1.A;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.emoji2.text.v;
import androidx.fragment.app.D;
import com.bumptech.glide.manager.k;
import com.bumptech.glide.manager.o;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n.e;

public final class b implements ComponentCallbacks2 {

    /* renamed from: q  reason: collision with root package name */
    public static volatile b f5725q;

    /* renamed from: r  reason: collision with root package name */
    public static volatile boolean f5726r;

    /* renamed from: a  reason: collision with root package name */
    public final C0.b f5727a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5728b;

    /* renamed from: c  reason: collision with root package name */
    public final e f5729c;
    public final g d;

    /* renamed from: e  reason: collision with root package name */
    public final k f5730e;

    /* renamed from: f  reason: collision with root package name */
    public final v f5731f;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f5732p = new ArrayList();

    public b(Context context, q qVar, f fVar, C0.b bVar, g gVar, k kVar, v vVar, D d6, e eVar, List list, ArrayList arrayList, R2.b bVar2, A a6) {
        this.f5727a = bVar;
        this.d = gVar;
        this.f5728b = fVar;
        this.f5730e = kVar;
        this.f5731f = vVar;
        this.f5729c = new e(context, gVar, new o(this, arrayList, bVar2), new H3.f(18), d6, eVar, list, qVar, a6);
    }

    /* JADX INFO: finally extract failed */
    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f5725q == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext().getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (InstantiationException e6) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            }
            synchronized (b.class) {
                if (f5725q == null) {
                    if (!f5726r) {
                        f5726r = true;
                        try {
                            b(context, generatedAppGlideModule);
                            f5726r = false;
                        } catch (Throwable th) {
                            f5726r = false;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return f5725q;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: U0.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: D0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: D0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: s2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: C0.i} */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, E0.b] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, E0.b] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, E0.b] */
    /* JADX WARNING: type inference failed for: r6v7, types: [D0.h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v3, types: [java.lang.Object, E0.b] */
    /* JADX WARNING: type inference failed for: r10v3, types: [n.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0342  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r32, com.bumptech.glide.GeneratedAppGlideModule r33) {
        /*
            n.e r10 = new n.e
            r1 = 0
            r10.<init>(r1)
            B0.A r2 = new B0.A
            r0 = 2
            r2.<init>((int) r0)
            androidx.fragment.app.D r9 = new androidx.fragment.app.D
            r0 = 6
            r9.<init>((int) r0)
            android.content.Context r15 = r32.getApplicationContext()
            java.util.Collections.emptyList()
            java.lang.String r0 = "Got app info metadata: "
            java.lang.String r3 = "ManifestParser"
            r4 = 3
            boolean r5 = android.util.Log.isLoggable(r3, r4)
            if (r5 == 0) goto L_0x0029
            java.lang.String r5 = "Loading Glide modules"
            android.util.Log.d(r3, r5)
        L_0x0029:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r5 = 2
            android.content.pm.PackageManager r6 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.String r7 = r15.getPackageName()     // Catch:{ NameNotFoundException -> 0x005c }
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x005c }
            if (r6 == 0) goto L_0x0094
            android.os.Bundle r7 = r6.metaData     // Catch:{ NameNotFoundException -> 0x005c }
            if (r7 != 0) goto L_0x0044
            goto L_0x0094
        L_0x0044:
            boolean r7 = android.util.Log.isLoggable(r3, r5)     // Catch:{ NameNotFoundException -> 0x005c }
            if (r7 == 0) goto L_0x005e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x005c }
            r7.<init>(r0)     // Catch:{ NameNotFoundException -> 0x005c }
            android.os.Bundle r0 = r6.metaData     // Catch:{ NameNotFoundException -> 0x005c }
            r7.append(r0)     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.String r0 = r7.toString()     // Catch:{ NameNotFoundException -> 0x005c }
            android.util.Log.v(r3, r0)     // Catch:{ NameNotFoundException -> 0x005c }
            goto L_0x005e
        L_0x005c:
            r0 = move-exception
            goto L_0x00a0
        L_0x005e:
            android.os.Bundle r0 = r6.metaData     // Catch:{ NameNotFoundException -> 0x005c }
            java.util.Set r0 = r0.keySet()     // Catch:{ NameNotFoundException -> 0x005c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NameNotFoundException -> 0x005c }
        L_0x0068:
            boolean r7 = r0.hasNext()     // Catch:{ NameNotFoundException -> 0x005c }
            if (r7 == 0) goto L_0x0088
            java.lang.Object r7 = r0.next()     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.String r8 = "GlideModule"
            android.os.Bundle r11 = r6.metaData     // Catch:{ NameNotFoundException -> 0x005c }
            java.lang.Object r11 = r11.get(r7)     // Catch:{ NameNotFoundException -> 0x005c }
            boolean r8 = r8.equals(r11)     // Catch:{ NameNotFoundException -> 0x005c }
            if (r8 != 0) goto L_0x0083
            goto L_0x0068
        L_0x0083:
            android.support.v4.media.session.a.o0(r7)     // Catch:{ NameNotFoundException -> 0x005c }
            r0 = 0
            throw r0     // Catch:{ NameNotFoundException -> 0x005c }
        L_0x0088:
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch:{ NameNotFoundException -> 0x005c }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "Finished loading Glide modules"
            android.util.Log.d(r3, r0)     // Catch:{ NameNotFoundException -> 0x005c }
            goto L_0x00ac
        L_0x0094:
            boolean r0 = android.util.Log.isLoggable(r3, r4)     // Catch:{ NameNotFoundException -> 0x005c }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = "Got null app info metadata"
            android.util.Log.d(r3, r0)     // Catch:{ NameNotFoundException -> 0x005c }
            goto L_0x00ac
        L_0x00a0:
            r6 = 6
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto L_0x00ac
            java.lang.String r6 = "Failed to parse glide modules"
            android.util.Log.e(r3, r6, r0)
        L_0x00ac:
            if (r33 == 0) goto L_0x00ce
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00ce
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r0 = r12.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            java.lang.ClassCastException r0 = o3.d.e(r0)
            throw r0
        L_0x00ce:
            java.lang.String r0 = "Glide"
            boolean r0 = android.util.Log.isLoggable(r0, r4)
            if (r0 == 0) goto L_0x00e6
            java.util.Iterator r0 = r12.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x00e1
            goto L_0x00e6
        L_0x00e1:
            java.lang.ClassCastException r0 = o3.d.e(r0)
            throw r0
        L_0x00e6:
            java.util.Iterator r0 = r12.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x0342
            E0.b r0 = new E0.b
            r0.<init>()
            int r3 = E0.e.f585c
            r4 = 4
            if (r3 != 0) goto L_0x0108
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            int r3 = r3.availableProcessors()
            int r3 = java.lang.Math.min(r4, r3)
            E0.e.f585c = r3
        L_0x0108:
            int r18 = E0.e.f585c
            java.lang.String r3 = "source"
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x033a
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r22 = new java.util.concurrent.PriorityBlockingQueue
            r22.<init>()
            E0.c r8 = new E0.c
            r8.<init>(r0, r3, r1)
            r19 = 0
            r16 = r6
            r17 = r18
            r21 = r7
            r23 = r8
            r16.<init>(r17, r18, r19, r21, r22, r23)
            E0.e r0 = new E0.e
            r0.<init>(r6)
            E0.b r3 = new E0.b
            r3.<init>()
            java.lang.String r6 = "disk-cache"
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 != 0) goto L_0x0332
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.PriorityBlockingQueue r25 = new java.util.concurrent.PriorityBlockingQueue
            r25.<init>()
            E0.c r11 = new E0.c
            r13 = 1
            r11.<init>(r3, r6, r13)
            r22 = 0
            r19 = r8
            r20 = r13
            r21 = r13
            r24 = r7
            r26 = r11
            r19.<init>(r20, r21, r22, r24, r25, r26)
            E0.e r3 = new E0.e
            r3.<init>(r8)
            int r6 = E0.e.f585c
            if (r6 != 0) goto L_0x0172
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            int r6 = r6.availableProcessors()
            int r6 = java.lang.Math.min(r4, r6)
            E0.e.f585c = r6
        L_0x0172:
            int r6 = E0.e.f585c
            r8 = 1
            if (r6 < r4) goto L_0x017a
            r21 = r5
            goto L_0x017c
        L_0x017a:
            r21 = r8
        L_0x017c:
            E0.b r4 = new E0.b
            r4.<init>()
            java.lang.String r5 = "animation"
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x032a
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.PriorityBlockingQueue r25 = new java.util.concurrent.PriorityBlockingQueue
            r25.<init>()
            E0.c r11 = new E0.c
            r11.<init>(r4, r5, r8)
            r22 = 0
            r19 = r6
            r20 = r21
            r24 = r7
            r26 = r11
            r19.<init>(r20, r21, r22, r24, r25, r26)
            E0.e r4 = new E0.e
            r4.<init>(r6)
            D0.g r5 = new D0.g
            r5.<init>(r15)
            D0.h r6 = new D0.h
            r6.<init>()
            android.content.Context r8 = r5.f496a
            android.app.ActivityManager r11 = r5.f497b
            boolean r13 = r11.isLowRamDevice()
            if (r13 == 0) goto L_0x01be
            r13 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x01c0
        L_0x01be:
            r13 = 4194304(0x400000, float:5.877472E-39)
        L_0x01c0:
            r6.f501c = r13
            int r14 = r11.getMemoryClass()
            r16 = 1048576(0x100000, float:1.469368E-39)
            int r14 = r14 * r16
            boolean r16 = r11.isLowRamDevice()
            float r14 = (float) r14
            if (r16 == 0) goto L_0x01d5
            r16 = 1051260355(0x3ea8f5c3, float:0.33)
            goto L_0x01d8
        L_0x01d5:
            r16 = 1053609165(0x3ecccccd, float:0.4)
        L_0x01d8:
            float r14 = r14 * r16
            int r14 = java.lang.Math.round(r14)
            U3.c r1 = r5.f498c
            java.lang.Object r1 = r1.f3713b
            android.util.DisplayMetrics r1 = (android.util.DisplayMetrics) r1
            r32 = r12
            int r12 = r1.widthPixels
            int r1 = r1.heightPixels
            int r12 = r12 * r1
            int r12 = r12 * 4
            float r1 = (float) r12
            float r5 = r5.d
            float r12 = r1 * r5
            int r12 = java.lang.Math.round(r12)
            r17 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r17
            int r1 = java.lang.Math.round(r1)
            r18 = r10
            int r10 = r14 - r13
            r30 = r9
            int r9 = r1 + r12
            if (r9 > r10) goto L_0x020d
            r6.f500b = r1
            r6.f499a = r12
            goto L_0x0220
        L_0x020d:
            float r1 = (float) r10
            float r10 = r5 + r17
            float r1 = r1 / r10
            float r17 = r17 * r1
            int r10 = java.lang.Math.round(r17)
            r6.f500b = r10
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            r6.f499a = r1
        L_0x0220:
            java.lang.String r1 = "MemorySizeCalculator"
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r1, r5)
            if (r5 == 0) goto L_0x0293
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "Calculation complete, Calculated memory cache size: "
            r5.<init>(r10)
            int r10 = r6.f500b
            r12 = r2
            r17 = r3
            long r2 = (long) r10
            java.lang.String r2 = android.text.format.Formatter.formatFileSize(r8, r2)
            r5.append(r2)
            java.lang.String r2 = ", pool size: "
            r5.append(r2)
            int r2 = r6.f499a
            long r2 = (long) r2
            java.lang.String r2 = android.text.format.Formatter.formatFileSize(r8, r2)
            r5.append(r2)
            java.lang.String r2 = ", byte array size: "
            r5.append(r2)
            long r2 = (long) r13
            java.lang.String r2 = android.text.format.Formatter.formatFileSize(r8, r2)
            r5.append(r2)
            java.lang.String r2 = ", memory class limited? "
            r5.append(r2)
            if (r9 <= r14) goto L_0x0262
            r2 = 1
            goto L_0x0263
        L_0x0262:
            r2 = 0
        L_0x0263:
            r5.append(r2)
            java.lang.String r2 = ", max size: "
            r5.append(r2)
            long r2 = (long) r14
            java.lang.String r2 = android.text.format.Formatter.formatFileSize(r8, r2)
            r5.append(r2)
            java.lang.String r2 = ", memoryClass: "
            r5.append(r2)
            int r2 = r11.getMemoryClass()
            r5.append(r2)
            java.lang.String r2 = ", isLowMemoryDevice: "
            r5.append(r2)
            boolean r2 = r11.isLowRamDevice()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.d(r1, r2)
            goto L_0x0296
        L_0x0293:
            r12 = r2
            r17 = r3
        L_0x0296:
            androidx.emoji2.text.v r8 = new androidx.emoji2.text.v
            r1 = 8
            r8.<init>((int) r1)
            int r1 = r6.f499a
            if (r1 <= 0) goto L_0x02a9
            C0.i r2 = new C0.i
            long r9 = (long) r1
            r2.<init>(r9)
            r5 = r2
            goto L_0x02b0
        L_0x02a9:
            s2.e r1 = new s2.e
            r2 = 3
            r1.<init>((int) r2)
            r5 = r1
        L_0x02b0:
            C0.g r9 = new C0.g
            int r1 = r6.f501c
            r9.<init>(r1)
            D0.f r10 = new D0.f
            int r1 = r6.f500b
            long r1 = (long) r1
            r10.<init>(r1)
            x1.i r1 = new x1.i
            r2 = 3
            r1.<init>((android.content.Context) r15, (int) r2)
            B0.q r3 = new B0.q
            E0.e r2 = new E0.e
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.SynchronousQueue r25 = new java.util.concurrent.SynchronousQueue
            r25.<init>()
            E0.c r11 = new E0.c
            E0.b r13 = new E0.b
            r13.<init>()
            java.lang.String r14 = "source-unlimited"
            r31 = r8
            r8 = 0
            r11.<init>(r13, r14, r8)
            long r22 = E0.e.f584b
            r20 = 0
            r21 = 2147483647(0x7fffffff, float:NaN)
            r19 = r6
            r24 = r7
            r26 = r11
            r19.<init>(r20, r21, r22, r24, r25, r26)
            r2.<init>(r6)
            r23 = r3
            r24 = r10
            r25 = r1
            r26 = r17
            r27 = r0
            r28 = r2
            r29 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29)
            java.util.List r11 = java.util.Collections.emptyList()
            T1.A r14 = new T1.A
            r14.<init>((B0.A) r12)
            com.bumptech.glide.manager.k r7 = new com.bumptech.glide.manager.k
            r7.<init>()
            com.bumptech.glide.b r0 = new com.bumptech.glide.b
            r1 = r0
            r2 = r15
            r4 = r10
            r6 = r9
            r8 = r31
            r9 = r30
            r10 = r18
            r12 = r32
            r13 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.registerComponentCallbacks(r0)
            f5725q = r0
            return
        L_0x032a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: animation"
            r0.<init>(r1)
            throw r0
        L_0x0332:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: disk-cache"
            r0.<init>(r1)
            throw r0
        L_0x033a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: source"
            r0.<init>(r1)
            throw r0
        L_0x0342:
            java.lang.ClassCastException r0 = o3.d.e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.b(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public static l c(Context context) {
        U0.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f5730e.b(context);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        U0.o.a();
        this.f5728b.e(0);
        this.f5727a.l();
        g gVar = this.d;
        synchronized (gVar) {
            gVar.b(0);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onTrimMemory(int r9) {
        /*
            r8 = this;
            U0.o.a()
            java.util.ArrayList r0 = r8.f5732p
            monitor-enter(r0)
            java.util.ArrayList r1 = r8.f5732p     // Catch:{ all -> 0x001c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001c }
        L_0x000c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x001c }
            com.bumptech.glide.l r2 = (com.bumptech.glide.l) r2     // Catch:{ all -> 0x001c }
            r2.getClass()     // Catch:{ all -> 0x001c }
            goto L_0x000c
        L_0x001c:
            r9 = move-exception
            goto L_0x0067
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            D0.f r1 = r8.f5728b
            r1.getClass()
            r0 = 15
            r2 = 20
            r3 = 40
            if (r9 < r3) goto L_0x0032
            r4 = 0
            r1.e(r4)
            goto L_0x0040
        L_0x0032:
            if (r9 >= r2) goto L_0x0036
            if (r9 != r0) goto L_0x0040
        L_0x0036:
            monitor-enter(r1)
            long r4 = r1.f3689a     // Catch:{ all -> 0x0064 }
            monitor-exit(r1)
            r6 = 2
            long r4 = r4 / r6
            r1.e(r4)
        L_0x0040:
            C0.b r1 = r8.f5727a
            r1.h(r9)
            C0.g r4 = r8.d
            monitor-enter(r4)
            if (r9 < r3) goto L_0x0054
            monitor-enter(r4)     // Catch:{ all -> 0x0061 }
            r9 = 0
            r4.b(r9)     // Catch:{ all -> 0x0051 }
            monitor-exit(r4)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x0051:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r9     // Catch:{ all -> 0x0061 }
        L_0x0054:
            if (r9 >= r2) goto L_0x0058
            if (r9 != r0) goto L_0x005f
        L_0x0058:
            int r9 = r4.f410e     // Catch:{ all -> 0x0061 }
            int r9 = r9 / 2
            r4.b(r9)     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r4)
            return
        L_0x0061:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0061 }
            throw r9
        L_0x0064:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r9
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.onTrimMemory(int):void");
    }
}
