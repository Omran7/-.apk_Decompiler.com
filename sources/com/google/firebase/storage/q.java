package com.google.firebase.storage;

import B2.a;
import G1.b;
import J2.o;
import R2.i;
import T1.C;
import V3.d;
import V3.e;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import f3.C0524a;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public final class q extends k {

    /* renamed from: A  reason: collision with root package name */
    public static final Random f6952A = new Random();

    /* renamed from: B  reason: collision with root package name */
    public static final C f6953B = new C(25);

    /* renamed from: C  reason: collision with root package name */
    public static final b f6954C = b.f823a;

    /* renamed from: k  reason: collision with root package name */
    public final f f6955k;

    /* renamed from: l  reason: collision with root package name */
    public final d f6956l;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicLong f6957m = new AtomicLong(0);

    /* renamed from: n  reason: collision with root package name */
    public final C0524a f6958n;

    /* renamed from: o  reason: collision with root package name */
    public final b3.b f6959o;

    /* renamed from: p  reason: collision with root package name */
    public int f6960p = 262144;

    /* renamed from: q  reason: collision with root package name */
    public final e f6961q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6962r;

    /* renamed from: s  reason: collision with root package name */
    public volatile o f6963s;

    /* renamed from: t  reason: collision with root package name */
    public volatile Uri f6964t;

    /* renamed from: u  reason: collision with root package name */
    public volatile Exception f6965u;

    /* renamed from: v  reason: collision with root package name */
    public volatile Exception f6966v;

    /* renamed from: w  reason: collision with root package name */
    public volatile int f6967w;

    /* renamed from: x  reason: collision with root package name */
    public volatile String f6968x;

    /* renamed from: y  reason: collision with root package name */
    public volatile long f6969y;

    /* renamed from: z  reason: collision with root package name */
    public int f6970z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: b3.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(com.google.firebase.storage.f r9, byte[] r10) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            r8.f6957m = r0
            r0 = 262144(0x40000, float:3.67342E-40)
            r8.f6960p = r0
            r0 = 0
            r8.f6964t = r0
            r8.f6965u = r0
            r8.f6966v = r0
            r1 = 0
            r8.f6967w = r1
            r8.f6970z = r1
            com.google.android.gms.common.internal.I.g(r9)
            com.google.android.gms.common.internal.I.g(r10)
            com.google.firebase.storage.c r1 = r9.f6923b
            r8.f6955k = r9
            r8.f6963s = r0
            K3.b r9 = r1.f6916b
            if (r9 == 0) goto L_0x0034
            java.lang.Object r9 = r9.get()
            f3.a r9 = (f3.C0524a) r9
            r4 = r9
            goto L_0x0035
        L_0x0034:
            r4 = r0
        L_0x0035:
            r8.f6958n = r4
            K3.b r9 = r1.f6917c
            if (r9 == 0) goto L_0x0042
            java.lang.Object r9 = r9.get()
            r0 = r9
            b3.b r0 = (b3.b) r0
        L_0x0042:
            r5 = r0
            r8.f6959o = r5
            V3.d r9 = new V3.d
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r10)
            r9.<init>(r0)
            r8.f6956l = r9
            r9 = 1
            r8.f6962r = r9
            r9 = 60000(0xea60, double:2.9644E-319)
            r8.f6969y = r9
            V3.e r9 = new V3.e
            R2.i r10 = r1.f6915a
            r10.b()
            android.content.Context r3 = r10.f2490a
            r6 = 600000(0x927c0, double:2.964394E-318)
            r2 = r9
            r2.<init>(r3, r4, r5, r6)
            r8.f6961q = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.q.<init>(com.google.firebase.storage.f, byte[]):void");
    }

    public final void e() {
        W3.e eVar;
        this.f6961q.f3778e = true;
        if (this.f6964t != null) {
            eVar = new W3.e(this.f6955k.j(), this.f6955k.f6923b.f6915a, this.f6964t, 0);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            c.f5733a.execute(new a(this, eVar, 24, false));
        }
        this.f6965u = e.a(Status.f6006r);
    }

    public final boolean h(W3.d dVar) {
        try {
            Log.d("UploadTask", "Waiting " + this.f6970z + " milliseconds");
            f6953B.getClass();
            Thread.sleep((long) (this.f6970z + f6952A.nextInt(250)));
            String g02 = com.bumptech.glide.d.g0(this.f6958n);
            String f02 = com.bumptech.glide.d.f0(this.f6959o);
            i iVar = this.f6955k.f6923b.f6915a;
            iVar.b();
            dVar.m(iVar.f2490a, g02, f02);
            boolean i2 = i(dVar);
            if (i2) {
                this.f6970z = 0;
            }
            return i2;
        } catch (InterruptedException e6) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.f6966v = e6;
            return false;
        }
    }

    public final boolean i(W3.c cVar) {
        int i2 = cVar.f4079e;
        this.f6961q.getClass();
        if (e.a(i2)) {
            i2 = -2;
        }
        this.f6967w = i2;
        this.f6966v = cVar.f4076a;
        this.f6968x = cVar.i("X-Goog-Upload-Status");
        int i5 = this.f6967w;
        if ((i5 == 308 || (i5 >= 200 && i5 < 300)) && this.f6966v == null) {
            return true;
        }
        return false;
    }

    public final boolean j(boolean z3) {
        long j6;
        W3.e eVar = new W3.e(this.f6955k.j(), this.f6955k.f6923b.f6915a, this.f6964t, 1);
        if ("final".equals(this.f6968x)) {
            return false;
        }
        if (z3) {
            this.f6961q.b(eVar);
            if (!i(eVar)) {
                return false;
            }
        } else {
            String g02 = com.bumptech.glide.d.g0(this.f6958n);
            String f02 = com.bumptech.glide.d.f0(this.f6959o);
            i iVar = this.f6955k.f6923b.f6915a;
            iVar.b();
            eVar.m(iVar.f2490a, g02, f02);
            if (!i(eVar)) {
                return false;
            }
        }
        if ("final".equals(eVar.i("X-Goog-Upload-Status"))) {
            this.f6965u = new IOException("The server has terminated the upload session");
            return false;
        }
        String i2 = eVar.i("X-Goog-Upload-Size-Received");
        if (!TextUtils.isEmpty(i2)) {
            j6 = Long.parseLong(i2);
        } else {
            j6 = 0;
        }
        long j7 = this.f6957m.get();
        int i5 = (j7 > j6 ? 1 : (j7 == j6 ? 0 : -1));
        if (i5 > 0) {
            this.f6965u = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        } else if (i5 >= 0) {
            return true;
        } else {
            try {
                long j8 = j6 - j7;
                if (((long) this.f6956l.a((int) j8)) != j8) {
                    this.f6965u = new IOException("Unexpected end of stream encountered.");
                    return false;
                } else if (this.f6957m.compareAndSet(j7, j6)) {
                    return true;
                } else {
                    Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
                    this.f6965u = new IllegalStateException("uploaded bytes changed unexpectedly.");
                    return false;
                }
            } catch (IOException e6) {
                Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e6);
                this.f6965u = e6;
                return false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r17 = this;
            r1 = r17
            V3.e r0 = r1.f6961q
            r2 = 0
            r0.f3778e = r2
            r3 = 4
            boolean r0 = r1.g(r3)
            java.lang.String r4 = "UploadTask"
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "The upload cannot continue as it is not in a valid state."
            android.util.Log.d(r4, r0)
            return
        L_0x0016:
            com.google.firebase.storage.f r0 = r1.f6955k
            android.net.Uri r5 = r0.f6922a
            java.lang.String r6 = r5.getPath()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            r8 = 0
            if (r7 != 0) goto L_0x0050
            java.lang.String r7 = "/"
            boolean r9 = r6.equals(r7)
            if (r9 == 0) goto L_0x002e
            goto L_0x0050
        L_0x002e:
            r9 = 47
            int r9 = r6.lastIndexOf(r9)
            r10 = -1
            if (r9 != r10) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            java.lang.String r7 = r6.substring(r2, r9)
        L_0x003c:
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r7)
            android.net.Uri r5 = r5.build()
            com.google.firebase.storage.f r6 = new com.google.firebase.storage.f
            com.google.firebase.storage.c r0 = r0.f6923b
            r6.<init>(r5, r0)
            goto L_0x0051
        L_0x0050:
            r6 = r8
        L_0x0051:
            if (r6 != 0) goto L_0x005c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile..."
            r0.<init>(r5)
            r1.f6965u = r0
        L_0x005c:
            java.lang.Exception r0 = r1.f6965u
            if (r0 == 0) goto L_0x0061
            return
        L_0x0061:
            android.net.Uri r0 = r1.f6964t
            if (r0 != 0) goto L_0x0130
            J2.o r0 = r1.f6963s
            if (r0 == 0) goto L_0x0074
            J2.o r0 = r1.f6963s
            java.lang.Object r0 = r0.f1317a
            B0.H r0 = (B0.H) r0
            java.lang.Object r0 = r0.f201c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0075
        L_0x0074:
            r0 = r8
        L_0x0075:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x007d
            java.lang.String r0 = "application/octet-stream"
        L_0x007d:
            W3.e r2 = new W3.e
            com.google.firebase.storage.f r5 = r1.f6955k
            B0.h r5 = r5.j()
            com.google.firebase.storage.f r6 = r1.f6955k
            com.google.firebase.storage.c r6 = r6.f6923b
            R2.i r6 = r6.f6915a
            J2.o r7 = r1.f6963s
            if (r7 == 0) goto L_0x010e
            J2.o r7 = r1.f6963s
            r7.getClass()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.Object r9 = r7.f1317a
            B0.H r9 = (B0.H) r9
            boolean r10 = r9.f200b
            if (r10 == 0) goto L_0x00aa
            java.lang.Object r9 = r9.f201c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "contentType"
            r8.put(r10, r9)
        L_0x00aa:
            java.lang.Object r9 = r7.f1321f
            B0.H r9 = (B0.H) r9
            boolean r9 = r9.f200b
            if (r9 == 0) goto L_0x00c4
            org.json.JSONObject r9 = new org.json.JSONObject
            java.lang.Object r10 = r7.f1321f
            B0.H r10 = (B0.H) r10
            java.lang.Object r10 = r10.f201c
            java.util.Map r10 = (java.util.Map) r10
            r9.<init>(r10)
            java.lang.String r10 = "metadata"
            r8.put(r10, r9)
        L_0x00c4:
            java.lang.Object r9 = r7.f1318b
            B0.H r9 = (B0.H) r9
            boolean r10 = r9.f200b
            if (r10 == 0) goto L_0x00d5
            java.lang.Object r9 = r9.f201c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "cacheControl"
            r8.put(r10, r9)
        L_0x00d5:
            java.lang.Object r9 = r7.f1319c
            B0.H r9 = (B0.H) r9
            boolean r10 = r9.f200b
            if (r10 == 0) goto L_0x00e6
            java.lang.Object r9 = r9.f201c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "contentDisposition"
            r8.put(r10, r9)
        L_0x00e6:
            java.lang.Object r9 = r7.d
            B0.H r9 = (B0.H) r9
            boolean r10 = r9.f200b
            if (r10 == 0) goto L_0x00f7
            java.lang.Object r9 = r9.f201c
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "contentEncoding"
            r8.put(r10, r9)
        L_0x00f7:
            java.lang.Object r7 = r7.f1320e
            B0.H r7 = (B0.H) r7
            boolean r9 = r7.f200b
            if (r9 == 0) goto L_0x0108
            java.lang.Object r7 = r7.f201c
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = "contentLanguage"
            r8.put(r9, r7)
        L_0x0108:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r8)
            r8 = r7
        L_0x010e:
            r2.<init>((B0.C0009h) r5, (R2.i) r6, (org.json.JSONObject) r8, (java.lang.String) r0)
            V3.e r0 = r1.f6961q
            r0.b(r2)
            boolean r0 = r1.i(r2)
            if (r0 != 0) goto L_0x011d
            goto L_0x0133
        L_0x011d:
            java.lang.String r0 = "X-Goog-Upload-URL"
            java.lang.String r0 = r2.i(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0133
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.f6964t = r0
            goto L_0x0133
        L_0x0130:
            r1.j(r2)
        L_0x0133:
            boolean r0 = r17.m()
        L_0x0137:
            if (r0 == 0) goto L_0x01ff
            java.lang.String r2 = "Unable to parse resulting metadata from upload:"
            java.lang.String r0 = "Increasing chunk size to "
            java.lang.String r5 = "Resetting chunk size to "
            V3.d r6 = r1.f6956l     // Catch:{ IOException -> 0x0191 }
            int r7 = r1.f6960p     // Catch:{ IOException -> 0x0191 }
            r6.b(r7)     // Catch:{ IOException -> 0x0191 }
            int r6 = r1.f6960p     // Catch:{ IOException -> 0x0191 }
            V3.d r7 = r1.f6956l     // Catch:{ IOException -> 0x0191 }
            int r7 = r7.f3772c     // Catch:{ IOException -> 0x0191 }
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ IOException -> 0x0191 }
            W3.d r7 = new W3.d     // Catch:{ IOException -> 0x0191 }
            com.google.firebase.storage.f r8 = r1.f6955k     // Catch:{ IOException -> 0x0191 }
            B0.h r9 = r8.j()     // Catch:{ IOException -> 0x0191 }
            com.google.firebase.storage.f r8 = r1.f6955k     // Catch:{ IOException -> 0x0191 }
            com.google.firebase.storage.c r8 = r8.f6923b     // Catch:{ IOException -> 0x0191 }
            R2.i r10 = r8.f6915a     // Catch:{ IOException -> 0x0191 }
            android.net.Uri r11 = r1.f6964t     // Catch:{ IOException -> 0x0191 }
            V3.d r8 = r1.f6956l     // Catch:{ IOException -> 0x0191 }
            byte[] r12 = r8.f3771b     // Catch:{ IOException -> 0x0191 }
            java.util.concurrent.atomic.AtomicLong r8 = r1.f6957m     // Catch:{ IOException -> 0x0191 }
            long r13 = r8.get()     // Catch:{ IOException -> 0x0191 }
            V3.d r8 = r1.f6956l     // Catch:{ IOException -> 0x0191 }
            boolean r15 = r8.d     // Catch:{ IOException -> 0x0191 }
            r8 = r7
            r16 = r15
            r15 = r6
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)     // Catch:{ IOException -> 0x0191 }
            boolean r8 = r1.h(r7)     // Catch:{ IOException -> 0x0191 }
            if (r8 != 0) goto L_0x0193
            r0 = 262144(0x40000, float:3.67342E-40)
            r1.f6960p = r0     // Catch:{ IOException -> 0x0191 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0191 }
            int r2 = r1.f6960p     // Catch:{ IOException -> 0x0191 }
            r0.append(r2)     // Catch:{ IOException -> 0x0191 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0191 }
            android.util.Log.d(r4, r0)     // Catch:{ IOException -> 0x0191 }
            goto L_0x01f4
        L_0x0191:
            r0 = move-exception
            goto L_0x01ed
        L_0x0193:
            java.util.concurrent.atomic.AtomicLong r5 = r1.f6957m     // Catch:{ IOException -> 0x0191 }
            long r8 = (long) r6     // Catch:{ IOException -> 0x0191 }
            r5.getAndAdd(r8)     // Catch:{ IOException -> 0x0191 }
            V3.d r5 = r1.f6956l     // Catch:{ IOException -> 0x0191 }
            boolean r8 = r5.d     // Catch:{ IOException -> 0x0191 }
            if (r8 != 0) goto L_0x01be
            r5.a(r6)     // Catch:{ IOException -> 0x0191 }
            int r2 = r1.f6960p     // Catch:{ IOException -> 0x0191 }
            r5 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 >= r5) goto L_0x01f4
            int r2 = r2 * 2
            r1.f6960p = r2     // Catch:{ IOException -> 0x0191 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0191 }
            int r0 = r1.f6960p     // Catch:{ IOException -> 0x0191 }
            r2.append(r0)     // Catch:{ IOException -> 0x0191 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0191 }
            android.util.Log.d(r4, r0)     // Catch:{ IOException -> 0x0191 }
            goto L_0x01f4
        L_0x01be:
            T1.A r0 = new T1.A     // Catch:{ JSONException -> 0x01d8 }
            org.json.JSONObject r5 = r7.h()     // Catch:{ JSONException -> 0x01d8 }
            com.google.firebase.storage.f r6 = r1.f6955k     // Catch:{ JSONException -> 0x01d8 }
            r0.<init>((org.json.JSONObject) r5, (com.google.firebase.storage.f) r6)     // Catch:{ JSONException -> 0x01d8 }
            J2.o r0 = r0.i()     // Catch:{ JSONException -> 0x01d8 }
            r1.f6963s = r0     // Catch:{ JSONException -> 0x01d8 }
            r1.g(r3)     // Catch:{ IOException -> 0x0191 }
            r0 = 128(0x80, float:1.794E-43)
            r1.g(r0)     // Catch:{ IOException -> 0x0191 }
            goto L_0x01f4
        L_0x01d8:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x0191 }
            java.lang.String r2 = r7.f4080f     // Catch:{ IOException -> 0x0191 }
            r5.append(r2)     // Catch:{ IOException -> 0x0191 }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException -> 0x0191 }
            android.util.Log.e(r4, r2, r0)     // Catch:{ IOException -> 0x0191 }
            r1.f6965u = r0     // Catch:{ IOException -> 0x0191 }
            goto L_0x01f4
        L_0x01ed:
            java.lang.String r2 = "Unable to read bytes for uploading"
            android.util.Log.e(r4, r2, r0)
            r1.f6965u = r0
        L_0x01f4:
            boolean r0 = r17.m()
            if (r0 == 0) goto L_0x0137
            r1.g(r3)
            goto L_0x0137
        L_0x01ff:
            boolean r0 = r1.f6962r
            if (r0 == 0) goto L_0x0217
            int r0 = r1.h
            r2 = 16
            if (r0 == r2) goto L_0x0217
            V3.d r0 = r1.f6956l     // Catch:{ IOException -> 0x0211 }
            java.io.ByteArrayInputStream r0 = r0.f3770a     // Catch:{ IOException -> 0x0211 }
            r0.close()     // Catch:{ IOException -> 0x0211 }
            goto L_0x0217
        L_0x0211:
            r0 = move-exception
            java.lang.String r2 = "Unable to close stream."
            android.util.Log.e(r4, r2, r0)
        L_0x0217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.storage.q.k():void");
    }

    public final boolean l() {
        if (!"final".equals(this.f6968x)) {
            return true;
        }
        if (this.f6965u == null) {
            this.f6965u = new IOException("The server has terminated the upload session", this.f6966v);
        }
        g(64);
        return false;
    }

    public final boolean m() {
        boolean z3;
        if (this.h == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.f6965u = new InterruptedException();
            g(64);
            return false;
        } else if (this.h == 32) {
            g(256);
            return false;
        } else if (this.h == 8) {
            g(16);
            return false;
        } else if (!l()) {
            return false;
        } else {
            if (this.f6964t == null) {
                if (this.f6965u == null) {
                    this.f6965u = new IllegalStateException("Unable to obtain an upload URL.");
                }
                g(64);
                return false;
            } else if (this.f6965u != null) {
                g(64);
                return false;
            } else {
                if (this.f6966v != null || this.f6967w < 200 || this.f6967w >= 300) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b bVar = f6954C;
                bVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime() + this.f6969y;
                bVar.getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + ((long) this.f6970z);
                if (z3) {
                    if (elapsedRealtime2 > elapsedRealtime || !j(true)) {
                        if (l()) {
                            g(64);
                        }
                        return false;
                    }
                    this.f6970z = Math.max(this.f6970z * 2, 1000);
                }
                return true;
            }
        }
    }
}
