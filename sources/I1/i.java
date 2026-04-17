package i1;

import android.content.Context;
import d1.f;
import j1.C0607c;
import j1.d;
import java.util.concurrent.Executor;
import k1.C0758c;
import l1.C0780a;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8267a;

    /* renamed from: b  reason: collision with root package name */
    public final f f8268b;

    /* renamed from: c  reason: collision with root package name */
    public final d f8269c;
    public final d d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f8270e;

    /* renamed from: f  reason: collision with root package name */
    public final C0758c f8271f;
    public final C0780a g;
    public final C0780a h;

    /* renamed from: i  reason: collision with root package name */
    public final C0607c f8272i;

    public i(Context context, f fVar, d dVar, d dVar2, Executor executor, C0758c cVar, C0780a aVar, C0780a aVar2, C0607c cVar2) {
        this.f8267a = context;
        this.f8268b = fVar;
        this.f8269c = dVar;
        this.d = dVar2;
        this.f8270e = executor;
        this.f8271f = cVar;
        this.g = aVar;
        this.h = aVar2;
        this.f8272i = cVar2;
    }

    /* JADX WARNING: type inference failed for: r2v52, types: [java.lang.Object, k.e1] */
    /* JADX WARNING: type inference failed for: r4v35, types: [java.lang.Object, k.e1] */
    /* JADX WARNING: type inference failed for: r3v22, types: [java.lang.Object, J2.o] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0399 A[Catch:{ IOException -> 0x03a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x037b A[Catch:{ IOException -> 0x03a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x038b A[Catch:{ IOException -> 0x03a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(c1.j r46, int r47) {
        /*
            r45 = this;
            r7 = r45
            r8 = r46
            r9 = 1
            r1 = 0
            d1.f r0 = r7.f8268b
            java.lang.String r2 = r8.f5607a
            d1.g r2 = r0.a(r2)
            r5 = 0
        L_0x0010:
            i1.g r0 = new i1.g
            r0.<init>(r7, r8, r1)
            k1.c r10 = r7.f8271f
            j1.g r10 = (j1.g) r10
            java.lang.Object r0 = r10.m(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0473
            i1.g r0 = new i1.g
            r0.<init>(r7, r8, r9)
            java.lang.Object r0 = r10.m(r0)
            r11 = r0
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r0 = r11.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x003c
            return
        L_0x003c:
            r0 = 3
            r13 = -1
            byte[] r15 = r8.f5608b
            if (r2 != 0) goto L_0x0054
            java.lang.String r4 = "Uploader"
            java.lang.String r12 = "Unknown backend for %s, deleting event batch for it..."
            android.support.v4.media.session.a.o(r8, r4, r12)
            d1.a r4 = new d1.a
            r4.<init>(r0, r13)
            r32 = r2
        L_0x0051:
            r1 = 2
            goto L_0x03e0
        L_0x0054:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r12 = r11.iterator()
        L_0x005d:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x0071
            java.lang.Object r16 = r12.next()
            r3 = r16
            j1.b r3 = (j1.C0606b) r3
            c1.h r3 = r3.f8802c
            r4.add(r3)
            goto L_0x005d
        L_0x0071:
            if (r15 == 0) goto L_0x0075
            r3 = r9
            goto L_0x0076
        L_0x0075:
            r3 = r1
        L_0x0076:
            java.lang.String r12 = "proto"
            if (r3 == 0) goto L_0x00e2
            j1.c r3 = r7.f8272i
            java.util.Objects.requireNonNull(r3)
            F3.e r9 = new F3.e
            r0 = 12
            r9.<init>((java.lang.Object) r3, (int) r0)
            java.lang.Object r0 = r10.m(r9)
            f1.a r0 = (f1.C0521a) r0
            J2.o r3 = new J2.o
            r3.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r3.f1320e = r9
            l1.a r9 = r7.g
            long r17 = r9.g()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r3.f1319c = r9
            l1.a r9 = r7.h
            long r17 = r9.g()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r3.d = r9
            java.lang.String r9 = "GDT_CLIENT_METRICS"
            r3.f1317a = r9
            c1.l r9 = new c1.l
            Z0.c r13 = new Z0.c
            r13.<init>(r12)
            r0.getClass()
            B0.h r14 = c1.n.f5618a
            r14.getClass()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r14.t(r0, r1)     // Catch:{ IOException -> 0x00cb }
        L_0x00cb:
            byte[] r0 = r1.toByteArray()
            r9.<init>(r13, r0)
            r3.f1318b = r9
            c1.h r0 = r3.k()
            r1 = r2
            a1.d r1 = (a1.d) r1
            c1.h r0 = r1.a(r0)
            r4.add(r0)
        L_0x00e2:
            r0 = r2
            a1.d r0 = (a1.d) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r3 = r4.iterator()
        L_0x00ee:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0118
            java.lang.Object r4 = r3.next()
            c1.h r4 = (c1.h) r4
            java.lang.String r9 = r4.f5598a
            boolean r13 = r1.containsKey(r9)
            if (r13 != 0) goto L_0x010e
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r4)
            r1.put(r9, r13)
            goto L_0x00ee
        L_0x010e:
            java.lang.Object r9 = r1.get(r9)
            java.util.List r9 = (java.util.List) r9
            r9.add(r4)
            goto L_0x00ee
        L_0x0118:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0125:
            boolean r4 = r1.hasNext()
            java.lang.String r14 = "CctTransportBackend"
            if (r4 == 0) goto L_0x033a
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r20 = r4.getValue()
            r9 = r20
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            java.lang.Object r9 = r9.get(r13)
            c1.h r9 = (c1.h) r9
            b1.w r19 = b1.w.f5508a
            l1.a r13 = r0.f4556f
            long r23 = r13.g()
            l1.a r13 = r0.f4555e
            long r25 = r13.g()
            java.lang.String r13 = "sdk-version"
            int r13 = r9.b(r13)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r13)
            java.lang.String r13 = "model"
            java.lang.String r29 = r9.a(r13)
            java.lang.String r13 = "hardware"
            java.lang.String r30 = r9.a(r13)
            java.lang.String r13 = "device"
            java.lang.String r31 = r9.a(r13)
            java.lang.String r13 = "product"
            java.lang.String r32 = r9.a(r13)
            java.lang.String r13 = "os-uild"
            java.lang.String r33 = r9.a(r13)
            java.lang.String r13 = "manufacturer"
            java.lang.String r34 = r9.a(r13)
            java.lang.String r13 = "fingerprint"
            java.lang.String r35 = r9.a(r13)
            java.lang.String r13 = "country"
            java.lang.String r37 = r9.a(r13)
            java.lang.String r13 = "locale"
            java.lang.String r36 = r9.a(r13)
            java.lang.String r13 = "mcc_mnc"
            java.lang.String r38 = r9.a(r13)
            java.lang.String r13 = "application_build"
            java.lang.String r39 = r9.a(r13)
            b1.h r9 = new b1.h
            r27 = r9
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            b1.j r13 = new b1.j
            r13.<init>(r9)
            java.lang.Object r9 = r4.getKey()     // Catch:{ NumberFormatException -> 0x01bb }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01bb }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01bb }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x01bb }
            r28 = r9
            r29 = 0
            goto L_0x01c5
        L_0x01bb:
            java.lang.Object r9 = r4.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r29 = r9
            r28 = 0
        L_0x01c5:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01d4:
            boolean r21 = r4.hasNext()
            if (r21 == 0) goto L_0x031a
            java.lang.Object r21 = r4.next()
            r31 = r1
            r1 = r21
            c1.h r1 = (c1.h) r1
            r32 = r2
            c1.l r2 = r1.f5600c
            r21 = r4
            Z0.c r4 = r2.f5615a
            Z0.c r8 = new Z0.c
            r8.<init>(r12)
            boolean r8 = r4.equals(r8)
            byte[] r2 = r2.f5616b
            if (r8 == 0) goto L_0x0203
            k.e1 r4 = new k.e1
            r4.<init>()
            r4.d = r2
            r33 = r12
            goto L_0x0225
        L_0x0203:
            Z0.c r8 = new Z0.c
            r33 = r12
            java.lang.String r12 = "json"
            r8.<init>(r12)
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L_0x02f8
            java.lang.String r4 = new java.lang.String
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            r4.<init>(r2, r8)
            k.e1 r2 = new k.e1
            r2.<init>()
            r2.f9293e = r4
            r4 = r2
        L_0x0225:
            long r7 = r1.d
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r4.f9290a = r2
            long r7 = r1.f5601e
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r4.f9292c = r2
            java.util.HashMap r2 = r1.f5602f
            java.lang.String r7 = "tz-offset"
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0244
            r7 = 0
            goto L_0x024c
        L_0x0244:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r7 = r2.longValue()
        L_0x024c:
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r4.f9294f = r2
            java.lang.String r2 = "net-type"
            int r2 = r1.b(r2)
            android.util.SparseArray r7 = b1.u.f5506a
            java.lang.Object r2 = r7.get(r2)
            b1.u r2 = (b1.u) r2
            java.lang.String r7 = "mobile-subtype"
            int r7 = r1.b(r7)
            android.util.SparseArray r8 = b1.t.f5504a
            java.lang.Object r7 = r8.get(r7)
            b1.t r7 = (b1.t) r7
            b1.n r8 = new b1.n
            r8.<init>(r2, r7)
            r4.f9295p = r8
            java.lang.Integer r1 = r1.f5599b
            if (r1 == 0) goto L_0x027b
            r4.f9291b = r1
        L_0x027b:
            java.lang.Object r1 = r4.f9290a
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 != 0) goto L_0x0284
            java.lang.String r1 = " eventTimeMs"
            goto L_0x0286
        L_0x0284:
            java.lang.String r1 = ""
        L_0x0286:
            java.lang.Object r2 = r4.f9292c
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L_0x0292
            java.lang.String r2 = " eventUptimeMs"
            java.lang.String r1 = r1.concat(r2)
        L_0x0292:
            java.lang.Object r2 = r4.f9294f
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 != 0) goto L_0x029e
            java.lang.String r2 = " timezoneOffsetSeconds"
            java.lang.String r1 = o3.d.f(r1, r2)
        L_0x029e:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x02ec
            b1.k r1 = new b1.k
            java.lang.Object r2 = r4.f9290a
            java.lang.Long r2 = (java.lang.Long) r2
            long r35 = r2.longValue()
            java.lang.Object r2 = r4.f9291b
            r37 = r2
            java.lang.Integer r37 = (java.lang.Integer) r37
            java.lang.Object r2 = r4.f9292c
            java.lang.Long r2 = (java.lang.Long) r2
            long r38 = r2.longValue()
            java.lang.Object r2 = r4.d
            r40 = r2
            byte[] r40 = (byte[]) r40
            java.lang.Object r2 = r4.f9293e
            r41 = r2
            java.lang.String r41 = (java.lang.String) r41
            java.lang.Object r2 = r4.f9294f
            java.lang.Long r2 = (java.lang.Long) r2
            long r42 = r2.longValue()
            java.lang.Object r2 = r4.f9295p
            r44 = r2
            b1.n r44 = (b1.n) r44
            r34 = r1
            r34.<init>(r35, r37, r38, r40, r41, r42, r44)
            r9.add(r1)
        L_0x02de:
            r7 = r45
            r8 = r46
            r4 = r21
            r1 = r31
            r2 = r32
            r12 = r33
            goto L_0x01d4
        L_0x02ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x02f8:
            java.lang.String r1 = android.support.v4.media.session.a.f0(r14)
            r2 = 5
            boolean r7 = android.util.Log.isLoggable(r1, r2)
            if (r7 == 0) goto L_0x02de
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Received event of unsupported encoding "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = ". Skipping..."
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.w(r1, r4)
            goto L_0x02de
        L_0x031a:
            r31 = r1
            r32 = r2
            r33 = r12
            b1.l r1 = new b1.l
            r22 = r1
            r27 = r13
            r30 = r9
            r22.<init>(r23, r25, r27, r28, r29, r30)
            r3.add(r1)
            r7 = r45
            r8 = r46
            r1 = r31
            r2 = r32
            r12 = r33
            goto L_0x0125
        L_0x033a:
            r32 = r2
            r2 = 5
            b1.i r1 = new b1.i
            r1.<init>(r3)
            java.net.URL r3 = r0.d
            if (r15 == 0) goto L_0x0364
            a1.a r4 = a1.C0256a.a(r15)     // Catch:{ IllegalArgumentException -> 0x0359 }
            java.lang.String r7 = r4.f4545b     // Catch:{ IllegalArgumentException -> 0x0359 }
            if (r7 == 0) goto L_0x034f
            goto L_0x0350
        L_0x034f:
            r7 = 0
        L_0x0350:
            java.lang.String r4 = r4.f4544a     // Catch:{ IllegalArgumentException -> 0x0359 }
            if (r4 == 0) goto L_0x0365
            java.net.URL r3 = a1.d.b(r4)     // Catch:{ IllegalArgumentException -> 0x0359 }
            goto L_0x0365
        L_0x0359:
            d1.a r0 = new d1.a
            r1 = 3
            r2 = -1
            r0.<init>(r1, r2)
        L_0x0361:
            r4 = r0
            goto L_0x0051
        L_0x0364:
            r7 = 0
        L_0x0365:
            a1.b r4 = new a1.b     // Catch:{ IOException -> 0x03a4 }
            r4.<init>(r3, r1, r7)     // Catch:{ IOException -> 0x03a4 }
            F3.e r1 = new F3.e     // Catch:{ IOException -> 0x03a4 }
            r3 = 6
            r1.<init>((java.lang.Object) r0, (int) r3)     // Catch:{ IOException -> 0x03a4 }
            r13 = r2
        L_0x0371:
            a1.c r0 = r1.c(r4)     // Catch:{ IOException -> 0x03a4 }
            java.lang.Object r2 = r0.d     // Catch:{ IOException -> 0x03a4 }
            java.net.URL r2 = (java.net.URL) r2     // Catch:{ IOException -> 0x03a4 }
            if (r2 == 0) goto L_0x038b
            java.lang.String r3 = "Following redirect to: %s"
            android.support.v4.media.session.a.o(r2, r14, r3)     // Catch:{ IOException -> 0x03a4 }
            a1.b r3 = new a1.b     // Catch:{ IOException -> 0x03a4 }
            b1.i r7 = r4.f4547b     // Catch:{ IOException -> 0x03a4 }
            java.lang.String r4 = r4.f4548c     // Catch:{ IOException -> 0x03a4 }
            r3.<init>(r2, r7, r4)     // Catch:{ IOException -> 0x03a4 }
            r4 = r3
            goto L_0x038c
        L_0x038b:
            r4 = 0
        L_0x038c:
            if (r4 == 0) goto L_0x0393
            int r13 = r13 + -1
            r2 = 1
            if (r13 >= r2) goto L_0x0371
        L_0x0393:
            int r1 = r0.f4550b     // Catch:{ IOException -> 0x03a4 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x03a6
            long r0 = r0.f4551c     // Catch:{ IOException -> 0x03a4 }
            d1.a r2 = new d1.a     // Catch:{ IOException -> 0x03a4 }
            r3 = 1
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x03a4 }
            r4 = r2
            goto L_0x0051
        L_0x03a4:
            r0 = move-exception
            goto L_0x03d2
        L_0x03a6:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x03c9
            r0 = 404(0x194, float:5.66E-43)
            if (r1 != r0) goto L_0x03af
            goto L_0x03c9
        L_0x03af:
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x03c0
            d1.a r0 = new d1.a     // Catch:{ IOException -> 0x03bc }
            r1 = -1
            r3 = 4
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x03a4 }
            goto L_0x0361
        L_0x03bc:
            r0 = move-exception
            r1 = -1
            goto L_0x03d2
        L_0x03c0:
            r1 = -1
            d1.a r0 = new d1.a     // Catch:{ IOException -> 0x03a4 }
            r3 = 3
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x03a4 }
            goto L_0x0361
        L_0x03c9:
            d1.a r0 = new d1.a     // Catch:{ IOException -> 0x03a4 }
            r1 = 2
            r2 = -1
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x03a4 }
            goto L_0x0361
        L_0x03d2:
            java.lang.String r1 = "Could not make request to the backend"
            android.support.v4.media.session.a.q(r0, r14, r1)
            d1.a r0 = new d1.a
            r1 = 2
            r2 = -1
            r0.<init>(r1, r2)
            r4 = r0
        L_0x03e0:
            int r0 = r4.f7502a
            if (r0 != r1) goto L_0x03fd
            h3.b r0 = new h3.b
            r1 = r0
            r2 = r45
            r3 = r11
            r4 = r46
            r1.<init>(r2, r3, r4, r5)
            r10.m(r0)
            r1 = 1
            int r0 = r47 + 1
            i1.d r3 = r2.d
            r7 = r46
            r3.a(r7, r0, r1)
            return
        L_0x03fd:
            r1 = 1
            r2 = r45
            r7 = r46
            A4.c r3 = new A4.c
            r8 = 7
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r11, (int) r8)
            r10.m(r3)
            if (r0 != r1) goto L_0x0421
            long r0 = r4.f7503b
            long r5 = java.lang.Math.max(r5, r0)
            if (r15 == 0) goto L_0x041f
            F3.e r0 = new F3.e
            r1 = 14
            r0.<init>((java.lang.Object) r2, (int) r1)
            r10.m(r0)
        L_0x041f:
            r4 = 1
            goto L_0x046b
        L_0x0421:
            r1 = 4
            if (r0 != r1) goto L_0x041f
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x042d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0460
            java.lang.Object r3 = r1.next()
            j1.b r3 = (j1.C0606b) r3
            c1.h r3 = r3.f8802c
            java.lang.String r3 = r3.f5598a
            boolean r4 = r0.containsKey(r3)
            if (r4 != 0) goto L_0x044c
            r4 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r0.put(r3, r8)
            goto L_0x042d
        L_0x044c:
            r4 = 1
            java.lang.Object r8 = r0.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = r8 + r4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.put(r3, r8)
            goto L_0x042d
        L_0x0460:
            r4 = 1
            A4.c r1 = new A4.c
            r3 = 8
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r0, (int) r3)
            r10.m(r1)
        L_0x046b:
            r9 = r4
            r8 = r7
            r1 = 0
            r7 = r2
            r2 = r32
            goto L_0x0010
        L_0x0473:
            r2 = r7
            r7 = r8
            i1.h r0 = new i1.h
            r0.<init>(r2, r5, r7)
            r10.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.i.a(c1.j, int):void");
    }
}
