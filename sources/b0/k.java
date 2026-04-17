package B0;

import F0.r;
import F0.s;
import N0.c;
import P0.a;
import U0.d;
import com.bumptech.glide.e;
import com.bumptech.glide.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z0.C1126b;
import z0.C1130f;
import z0.i;
import z0.m;
import z1.j;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f230a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f231b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public e f232c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public int f233e;

    /* renamed from: f  reason: collision with root package name */
    public int f234f;
    public Class g;
    public j h;

    /* renamed from: i  reason: collision with root package name */
    public i f235i;

    /* renamed from: j  reason: collision with root package name */
    public d f236j;

    /* renamed from: k  reason: collision with root package name */
    public Class f237k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f238l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f239m;

    /* renamed from: n  reason: collision with root package name */
    public C1130f f240n;

    /* renamed from: o  reason: collision with root package name */
    public f f241o;

    /* renamed from: p  reason: collision with root package name */
    public p f242p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f243q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f244r;

    public final ArrayList a() {
        boolean z3 = this.f239m;
        ArrayList arrayList = this.f231b;
        if (!z3) {
            this.f239m = true;
            arrayList.clear();
            ArrayList b6 = b();
            int size = b6.size();
            for (int i2 = 0; i2 < size; i2++) {
                r rVar = (r) b6.get(i2);
                if (!arrayList.contains(rVar.f704a)) {
                    arrayList.add(rVar.f704a);
                }
                int i5 = 0;
                while (true) {
                    List list = rVar.f705b;
                    if (i5 >= list.size()) {
                        break;
                    }
                    if (!arrayList.contains(list.get(i5))) {
                        arrayList.add(list.get(i5));
                    }
                    i5++;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z3 = this.f238l;
        ArrayList arrayList = this.f230a;
        if (!z3) {
            this.f238l = true;
            arrayList.clear();
            List f6 = this.f232c.a().f(this.d);
            int size = f6.size();
            for (int i2 = 0; i2 < size; i2++) {
                r a6 = ((s) f6.get(i2)).a(this.d, this.f233e, this.f234f, this.f235i);
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: U0.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: U0.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: U0.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final B0.B c(java.lang.Class r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            com.bumptech.glide.e r2 = r1.f232c
            com.bumptech.glide.h r9 = r2.a()
            java.lang.Class r10 = r1.g
            java.lang.Class r11 = r1.f237k
            P0.b r2 = r9.f5775i
            java.util.concurrent.atomic.AtomicReference r3 = r2.f2130b
            r12 = 0
            java.lang.Object r3 = r3.getAndSet(r12)
            U0.m r3 = (U0.m) r3
            if (r3 != 0) goto L_0x0020
            U0.m r3 = new U0.m
            r3.<init>()
        L_0x0020:
            r3.f3693a = r0
            r3.f3694b = r10
            r3.f3695c = r11
            n.e r4 = r2.f2129a
            monitor-enter(r4)
            n.e r5 = r2.f2129a     // Catch:{ all -> 0x0178 }
            java.lang.Object r5 = r5.get(r3)     // Catch:{ all -> 0x0178 }
            B0.B r5 = (B0.B) r5     // Catch:{ all -> 0x0178 }
            monitor-exit(r4)     // Catch:{ all -> 0x0178 }
            java.util.concurrent.atomic.AtomicReference r2 = r2.f2130b
            r2.set(r3)
            P0.b r2 = r9.f5775i
            r2.getClass()
            B0.B r2 = P0.b.f2128c
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0046
            goto L_0x0177
        L_0x0046:
            if (r5 != 0) goto L_0x0176
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            I3.h r2 = r9.f5772c
            java.util.ArrayList r2 = r2.n(r0, r10)
            java.util.Iterator r14 = r2.iterator()
        L_0x0057:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0147
            java.lang.Object r2 = r14.next()
            r15 = r2
            java.lang.Class r15 = (java.lang.Class) r15
            N0.c r2 = r9.f5774f
            java.util.ArrayList r2 = r2.b(r15, r11)
            java.util.Iterator r16 = r2.iterator()
        L_0x006e:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r16.next()
            r5 = r2
            java.lang.Class r5 = (java.lang.Class) r5
            I3.h r2 = r9.f5772c
            monitor-enter(r2)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x00cf }
            r6.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.Object r3 = r2.f1179b     // Catch:{ all -> 0x00cf }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x00cf }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00cf }
        L_0x008b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00cf }
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00cf }
            java.lang.Object r7 = r2.f1180c     // Catch:{ all -> 0x00cf }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ all -> 0x00cf }
            java.lang.Object r4 = r7.get(r4)     // Catch:{ all -> 0x00cf }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00cf }
            if (r4 != 0) goto L_0x00a4
            goto L_0x008b
        L_0x00a4:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00cf }
        L_0x00a8:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x00cf }
            if (r7 == 0) goto L_0x008b
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x00cf }
            P0.c r7 = (P0.c) r7     // Catch:{ all -> 0x00cf }
            java.lang.Class r8 = r7.f2131a     // Catch:{ all -> 0x00cf }
            boolean r8 = r8.isAssignableFrom(r0)     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x00c6
            java.lang.Class r8 = r7.f2132b     // Catch:{ all -> 0x00cf }
            boolean r8 = r15.isAssignableFrom(r8)     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x00c6
            r8 = 1
            goto L_0x00c7
        L_0x00c6:
            r8 = 0
        L_0x00c7:
            if (r8 == 0) goto L_0x00a8
            z0.k r7 = r7.f2133c     // Catch:{ all -> 0x00cf }
            r6.add(r7)     // Catch:{ all -> 0x00cf }
            goto L_0x00a8
        L_0x00cf:
            r0 = move-exception
            goto L_0x0145
        L_0x00d2:
            monitor-exit(r2)
            N0.c r3 = r9.f5774f
            monitor-enter(r3)
            boolean r2 = r5.isAssignableFrom(r15)     // Catch:{ all -> 0x0122 }
            if (r2 == 0) goto L_0x00e1
            N0.d r2 = N0.d.f1894b     // Catch:{ all -> 0x0122 }
            monitor-exit(r3)
        L_0x00df:
            r7 = r2
            goto L_0x010c
        L_0x00e1:
            java.util.ArrayList r2 = r3.f1893a     // Catch:{ all -> 0x0122 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0122 }
        L_0x00e7:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0122 }
            if (r4 == 0) goto L_0x0124
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0122 }
            N0.b r4 = (N0.b) r4     // Catch:{ all -> 0x0122 }
            java.lang.Class r7 = r4.f1890a     // Catch:{ all -> 0x0122 }
            boolean r7 = r7.isAssignableFrom(r15)     // Catch:{ all -> 0x0122 }
            if (r7 == 0) goto L_0x0105
            java.lang.Class r7 = r4.f1891b     // Catch:{ all -> 0x0122 }
            boolean r7 = r5.isAssignableFrom(r7)     // Catch:{ all -> 0x0122 }
            if (r7 == 0) goto L_0x0105
            r7 = 1
            goto L_0x0106
        L_0x0105:
            r7 = 0
        L_0x0106:
            if (r7 == 0) goto L_0x00e7
            N0.a r2 = r4.f1892c     // Catch:{ all -> 0x0122 }
            monitor-exit(r3)
            goto L_0x00df
        L_0x010c:
            B0.o r8 = new B0.o
            B0.h r4 = r9.f5776j
            r2 = r8
            r3 = r19
            r17 = r4
            r4 = r15
            r12 = r8
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r13.add(r12)
            r12 = 0
            goto L_0x006e
        L_0x0122:
            r0 = move-exception
            goto L_0x0143
        L_0x0124:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r2.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = "No transcoder registered to transcode from "
            r2.append(r4)     // Catch:{ all -> 0x0122 }
            r2.append(r15)     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = " to "
            r2.append(r4)     // Catch:{ all -> 0x0122 }
            r2.append(r5)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0122 }
            r0.<init>(r2)     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0143:
            monitor-exit(r3)     // Catch:{ all -> 0x0122 }
            throw r0
        L_0x0145:
            monitor-exit(r2)     // Catch:{ all -> 0x00cf }
            throw r0
        L_0x0147:
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x014f
            r12 = 0
            goto L_0x015c
        L_0x014f:
            B0.B r12 = new B0.B
            B0.h r7 = r9.f5776j
            r2 = r12
            r3 = r19
            r4 = r10
            r5 = r11
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x015c:
            P0.b r2 = r9.f5775i
            n.e r3 = r2.f2129a
            monitor-enter(r3)
            n.e r2 = r2.f2129a     // Catch:{ all -> 0x0173 }
            U0.m r4 = new U0.m     // Catch:{ all -> 0x0173 }
            r4.<init>(r0, r10, r11)     // Catch:{ all -> 0x0173 }
            if (r12 == 0) goto L_0x016c
            r0 = r12
            goto L_0x016e
        L_0x016c:
            B0.B r0 = P0.b.f2128c     // Catch:{ all -> 0x0173 }
        L_0x016e:
            r2.put(r4, r0)     // Catch:{ all -> 0x0173 }
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            goto L_0x0177
        L_0x0173:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0173 }
            throw r0
        L_0x0176:
            r12 = r5
        L_0x0177:
            return r12
        L_0x0178:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0178 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.k.c(java.lang.Class):B0.B");
    }

    public final C1126b d(Object obj) {
        C1126b bVar;
        c cVar = this.f232c.a().f5771b;
        Class<?> cls = obj.getClass();
        synchronized (cVar) {
            Iterator it2 = cVar.f1893a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    bVar = null;
                    break;
                }
                a aVar = (a) it2.next();
                if (aVar.f2126a.isAssignableFrom(cls)) {
                    bVar = aVar.f2127b;
                    break;
                }
            }
        }
        if (bVar != null) {
            return bVar;
        }
        Class<?> cls2 = obj.getClass();
        throw new RuntimeException("Failed to find source encoder for data class: " + cls2);
    }

    public final m e(Class cls) {
        m mVar = (m) this.f236j.get(cls);
        if (mVar == null) {
            Iterator it2 = ((b4.j) this.f236j.entrySet()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f236j.isEmpty() || !this.f243q) {
            return H0.c.f992b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
