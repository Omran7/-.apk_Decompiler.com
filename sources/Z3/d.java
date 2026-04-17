package Z3;

import b4.C0323f;
import c4.b;
import c4.c;
import c4.g;
import c4.h;
import c4.m;
import c4.o;
import c4.q;
import f4.C0543b;
import g4.C0551a;
import h4.C0567b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f4520a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f4521b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final X4.d f4522c;
    public final c d;

    /* renamed from: e  reason: collision with root package name */
    public final List f4523e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4524f;
    public final List g;
    public final List h;

    /* renamed from: i  reason: collision with root package name */
    public final List f4525i;

    public d() {
        C0323f fVar = C0323f.f5525c;
        Map emptyMap = Collections.emptyMap();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        X4.d dVar = new X4.d(emptyMap, emptyList4, 5, false);
        this.f4522c = dVar;
        this.f4524f = true;
        this.g = emptyList;
        this.h = emptyList2;
        this.f4525i = emptyList4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(q.f5692z);
        arrayList.add(h.f5642b);
        arrayList.add(fVar);
        arrayList.addAll(emptyList3);
        arrayList.add(q.f5682p);
        arrayList.add(q.g);
        arrayList.add(q.d);
        arrayList.add(q.f5673e);
        arrayList.add(q.f5674f);
        g gVar = q.f5677k;
        arrayList.add(new m(Long.TYPE, Long.class, gVar));
        arrayList.add(new m(Double.TYPE, Double.class, new a(0)));
        arrayList.add(new m(Float.TYPE, Float.class, new a(1)));
        arrayList.add(g.f5640b);
        arrayList.add(q.h);
        arrayList.add(q.f5675i);
        arrayList.add(new o(AtomicLong.class, new b(new b(gVar, 0), 2), 0));
        arrayList.add(new o(AtomicLongArray.class, new b(new b(gVar, 1), 2), 0));
        arrayList.add(q.f5676j);
        arrayList.add(q.f5678l);
        arrayList.add(q.f5683q);
        arrayList.add(q.f5684r);
        arrayList.add(new o(BigDecimal.class, q.f5679m, 0));
        arrayList.add(new o(BigInteger.class, q.f5680n, 0));
        arrayList.add(new o(b4.h.class, q.f5681o, 0));
        arrayList.add(q.f5685s);
        arrayList.add(q.f5686t);
        arrayList.add(q.f5688v);
        arrayList.add(q.f5689w);
        arrayList.add(q.f5691y);
        arrayList.add(q.f5687u);
        arrayList.add(q.f5671b);
        arrayList.add(c4.d.f5633b);
        arrayList.add(q.f5690x);
        if (C0543b.f7975a) {
            arrayList.add(C0543b.f7977c);
            arrayList.add(C0543b.f7976b);
            arrayList.add(C0543b.d);
        }
        arrayList.add(b.d);
        arrayList.add(q.f5670a);
        arrayList.add(new c(dVar, 0));
        arrayList.add(new c(dVar, 2));
        c cVar = new c(dVar, 1);
        this.d = cVar;
        arrayList.add(cVar);
        arrayList.add(q.f5669A);
        arrayList.add(new m(dVar, fVar, cVar, emptyList4));
        this.f4523e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            throw new IllegalArgumentException(d6 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        throw new java.lang.AssertionError("AssertionError (GSON 2.10.1): " + r6.getMessage(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw new java.lang.RuntimeException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c5, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c6, code lost:
        r7.f8154b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c8, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d A[ExcHandler: IOException (r6v14 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:3:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f A[ExcHandler: IllegalStateException (r6v13 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:3:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[SYNTHETIC, Splitter:B:24:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0 A[SYNTHETIC, Splitter:B:65:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[ExcHandler: AssertionError (r6v15 'e' java.lang.AssertionError A[CUSTOM_DECLARE]), Splitter:B:3:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.Class r6, java.lang.String r7) {
        /*
            r5 = this;
            g4.a r0 = new g4.a
            r0.<init>(r6)
            r1 = 0
            if (r7 != 0) goto L_0x000a
            goto L_0x007d
        L_0x000a:
            java.io.StringReader r2 = new java.io.StringReader
            r2.<init>(r7)
            h4.a r7 = new h4.a
            r7.<init>(r2)
            java.lang.String r2 = "AssertionError (GSON 2.10.1): "
            r3 = 1
            r7.f8154b = r3
            r4 = 0
            r7.C()     // Catch:{ EOFException -> 0x0056, IllegalStateException -> 0x002f, IOException -> 0x002d, AssertionError -> 0x002b }
            Z3.p r0 = r5.c(r0)     // Catch:{ EOFException -> 0x0031, IllegalStateException -> 0x002f, IOException -> 0x002d, AssertionError -> 0x002b }
            java.lang.Object r1 = r0.a(r7)     // Catch:{ EOFException -> 0x0031, IllegalStateException -> 0x002f, IOException -> 0x002d, AssertionError -> 0x002b }
        L_0x0025:
            r7.f8154b = r4
            goto L_0x005a
        L_0x0028:
            r6 = move-exception
            goto L_0x00c6
        L_0x002b:
            r6 = move-exception
            goto L_0x0034
        L_0x002d:
            r6 = move-exception
            goto L_0x004a
        L_0x002f:
            r6 = move-exception
            goto L_0x0050
        L_0x0031:
            r0 = move-exception
            r3 = r4
            goto L_0x0057
        L_0x0034:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0028 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x0028 }
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0028 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0028 }
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x004a:
            Z3.g r0 = new Z3.g     // Catch:{ all -> 0x0028 }
            r0.<init>(r6)     // Catch:{ all -> 0x0028 }
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0050:
            Z3.g r0 = new Z3.g     // Catch:{ all -> 0x0028 }
            r0.<init>(r6)     // Catch:{ all -> 0x0028 }
            throw r0     // Catch:{ all -> 0x0028 }
        L_0x0056:
            r0 = move-exception
        L_0x0057:
            if (r3 == 0) goto L_0x00c0
            goto L_0x0025
        L_0x005a:
            if (r1 == 0) goto L_0x007d
            int r7 = r7.C()     // Catch:{ c -> 0x006f, IOException -> 0x006d }
            r0 = 10
            if (r7 != r0) goto L_0x0065
            goto L_0x007d
        L_0x0065:
            Z3.g r6 = new Z3.g     // Catch:{ c -> 0x006f, IOException -> 0x006d }
            java.lang.String r7 = "JSON document was not fully consumed."
            r6.<init>(r7)     // Catch:{ c -> 0x006f, IOException -> 0x006d }
            throw r6     // Catch:{ c -> 0x006f, IOException -> 0x006d }
        L_0x006d:
            r6 = move-exception
            goto L_0x0071
        L_0x006f:
            r6 = move-exception
            goto L_0x0077
        L_0x0071:
            Z3.g r7 = new Z3.g
            r7.<init>(r6)
            throw r7
        L_0x0077:
            Z3.g r7 = new Z3.g
            r7.<init>(r6)
            throw r7
        L_0x007d:
            java.lang.Class r7 = java.lang.Integer.TYPE
            if (r6 != r7) goto L_0x0084
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            goto L_0x00bb
        L_0x0084:
            java.lang.Class r7 = java.lang.Float.TYPE
            if (r6 != r7) goto L_0x008b
            java.lang.Class<java.lang.Float> r6 = java.lang.Float.class
            goto L_0x00bb
        L_0x008b:
            java.lang.Class r7 = java.lang.Byte.TYPE
            if (r6 != r7) goto L_0x0092
            java.lang.Class<java.lang.Byte> r6 = java.lang.Byte.class
            goto L_0x00bb
        L_0x0092:
            java.lang.Class r7 = java.lang.Double.TYPE
            if (r6 != r7) goto L_0x0099
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            goto L_0x00bb
        L_0x0099:
            java.lang.Class r7 = java.lang.Long.TYPE
            if (r6 != r7) goto L_0x00a0
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            goto L_0x00bb
        L_0x00a0:
            java.lang.Class r7 = java.lang.Character.TYPE
            if (r6 != r7) goto L_0x00a7
            java.lang.Class<java.lang.Character> r6 = java.lang.Character.class
            goto L_0x00bb
        L_0x00a7:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            if (r6 != r7) goto L_0x00ae
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            goto L_0x00bb
        L_0x00ae:
            java.lang.Class r7 = java.lang.Short.TYPE
            if (r6 != r7) goto L_0x00b5
            java.lang.Class<java.lang.Short> r6 = java.lang.Short.class
            goto L_0x00bb
        L_0x00b5:
            java.lang.Class r7 = java.lang.Void.TYPE
            if (r6 != r7) goto L_0x00bb
            java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
        L_0x00bb:
            java.lang.Object r6 = r6.cast(r1)
            return r6
        L_0x00c0:
            Z3.g r6 = new Z3.g     // Catch:{ all -> 0x0028 }
            r6.<init>(r0)     // Catch:{ all -> 0x0028 }
            throw r6     // Catch:{ all -> 0x0028 }
        L_0x00c6:
            r7.f8154b = r4
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.d.b(java.lang.Class, java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [Z3.c, java.lang.Object] */
    public final p c(C0551a aVar) {
        boolean z3;
        ConcurrentHashMap concurrentHashMap = this.f4521b;
        p pVar = (p) concurrentHashMap.get(aVar);
        if (pVar != null) {
            return pVar;
        }
        ThreadLocal threadLocal = this.f4520a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z3 = true;
        } else {
            p pVar2 = (p) map.get(aVar);
            if (pVar2 != null) {
                return pVar2;
            }
            z3 = false;
        }
        try {
            ? obj = new Object();
            p pVar3 = null;
            obj.f4519a = null;
            map.put(aVar, obj);
            Iterator it2 = this.f4523e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                pVar3 = ((q) it2.next()).a(this, aVar);
                if (pVar3 != null) {
                    if (obj.f4519a == null) {
                        obj.f4519a = pVar3;
                        map.put(aVar, pVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (pVar3 != null) {
                if (z3) {
                    concurrentHashMap.putAll(map);
                }
                return pVar3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + aVar);
        } finally {
            if (z3) {
                threadLocal.remove();
            }
        }
    }

    public final C0567b d(Writer writer) {
        C0567b bVar = new C0567b(writer);
        bVar.f8174f = this.f4524f;
        bVar.f8173e = false;
        bVar.f8176q = false;
        return bVar;
    }

    public final String e(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                f(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                g(obj, cls, d(stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final void f(C0567b bVar) {
        h hVar = h.f4527a;
        boolean z3 = bVar.f8173e;
        bVar.f8173e = true;
        boolean z4 = bVar.f8174f;
        bVar.f8174f = this.f4524f;
        boolean z5 = bVar.f8176q;
        bVar.f8176q = false;
        try {
            o oVar = q.f5670a;
            g.d(bVar, hVar);
            bVar.f8173e = z3;
            bVar.f8174f = z4;
            bVar.f8176q = z5;
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        } catch (AssertionError e7) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e7.getMessage(), e7);
        } catch (Throwable th) {
            bVar.f8173e = z3;
            bVar.f8174f = z4;
            bVar.f8176q = z5;
            throw th;
        }
    }

    public final void g(Object obj, Class cls, C0567b bVar) {
        p c3 = c(new C0551a(cls));
        boolean z3 = bVar.f8173e;
        bVar.f8173e = true;
        boolean z4 = bVar.f8174f;
        bVar.f8174f = this.f4524f;
        boolean z5 = bVar.f8176q;
        bVar.f8176q = false;
        try {
            c3.b(bVar, obj);
            bVar.f8173e = z3;
            bVar.f8174f = z4;
            bVar.f8176q = z5;
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        } catch (AssertionError e7) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e7.getMessage(), e7);
        } catch (Throwable th) {
            bVar.f8173e = z3;
            bVar.f8174f = z4;
            bVar.f8176q = z5;
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f4523e + ",instanceCreators:" + this.f4522c + "}";
    }
}
