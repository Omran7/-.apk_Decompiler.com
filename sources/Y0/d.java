package y0;

import C0.b;
import C0.g;
import I3.h;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int[] f12631a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12632b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final h f12633c;
    public ByteBuffer d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f12634e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f12635f;
    public byte[] g;
    public byte[] h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f12636i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f12637j;

    /* renamed from: k  reason: collision with root package name */
    public int f12638k;

    /* renamed from: l  reason: collision with root package name */
    public b f12639l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f12640m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f12641n;

    /* renamed from: o  reason: collision with root package name */
    public int f12642o;

    /* renamed from: p  reason: collision with root package name */
    public final int f12643p;

    /* renamed from: q  reason: collision with root package name */
    public final int f12644q;

    /* renamed from: r  reason: collision with root package name */
    public final int f12645r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f12646s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f12647t = Bitmap.Config.ARGB_8888;

    public d(h hVar, b bVar, ByteBuffer byteBuffer, int i2) {
        byte[] bArr;
        int[] iArr;
        this.f12633c = hVar;
        this.f12639l = new b();
        synchronized (this) {
            if (i2 > 0) {
                try {
                    int highestOneBit = Integer.highestOneBit(i2);
                    this.f12642o = 0;
                    this.f12639l = bVar;
                    this.f12638k = -1;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    this.d = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    this.d.order(ByteOrder.LITTLE_ENDIAN);
                    this.f12641n = false;
                    Iterator it2 = bVar.f12623e.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C1107a) it2.next()).g == 3) {
                                this.f12641n = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    this.f12643p = highestOneBit;
                    int i5 = bVar.f12624f;
                    this.f12645r = i5 / highestOneBit;
                    int i6 = bVar.g;
                    this.f12644q = i6 / highestOneBit;
                    int i7 = i5 * i6;
                    g gVar = (g) this.f12633c.f1180c;
                    if (gVar == null) {
                        bArr = new byte[i7];
                    } else {
                        bArr = (byte[]) gVar.c(i7, byte[].class);
                    }
                    this.f12636i = bArr;
                    h hVar2 = this.f12633c;
                    int i8 = this.f12645r * this.f12644q;
                    g gVar2 = (g) hVar2.f1180c;
                    if (gVar2 == null) {
                        iArr = new int[i8];
                    } else {
                        iArr = (int[]) gVar2.c(i8, int[].class);
                    }
                    this.f12637j = iArr;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
            }
        }
    }

    public final Bitmap a() {
        Bitmap.Config config;
        Boolean bool = this.f12646s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f12647t;
        }
        Bitmap c3 = ((b) this.f12633c.f1179b).c(this.f12645r, this.f12644q, config);
        c3.setHasAlpha(true);
        return c3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd A[Catch:{ all -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap b() {
        /*
            r9 = this;
            java.lang.String r0 = "Unable to decode frame, status="
            java.lang.String r1 = "No valid color table found for frame #"
            java.lang.String r2 = "Unable to decode frame, frameCount="
            monitor-enter(r9)
            y0.b r3 = r9.f12639l     // Catch:{ all -> 0x0014 }
            int r3 = r3.f12622c     // Catch:{ all -> 0x0014 }
            r4 = 3
            r5 = 1
            if (r3 <= 0) goto L_0x0017
            int r3 = r9.f12638k     // Catch:{ all -> 0x0014 }
            if (r3 >= 0) goto L_0x0040
            goto L_0x0017
        L_0x0014:
            r0 = move-exception
            goto L_0x00f2
        L_0x0017:
            java.lang.String r3 = "d"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0014 }
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = "d"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0014 }
            r6.<init>(r2)     // Catch:{ all -> 0x0014 }
            y0.b r2 = r9.f12639l     // Catch:{ all -> 0x0014 }
            int r2 = r2.f12622c     // Catch:{ all -> 0x0014 }
            r6.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = ", framePointer="
            r6.append(r2)     // Catch:{ all -> 0x0014 }
            int r2 = r9.f12638k     // Catch:{ all -> 0x0014 }
            r6.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0014 }
            android.util.Log.d(r3, r2)     // Catch:{ all -> 0x0014 }
        L_0x003e:
            r9.f12642o = r5     // Catch:{ all -> 0x0014 }
        L_0x0040:
            int r2 = r9.f12642o     // Catch:{ all -> 0x0014 }
            r3 = 0
            if (r2 == r5) goto L_0x00d5
            r6 = 2
            if (r2 != r6) goto L_0x004a
            goto L_0x00d5
        L_0x004a:
            r0 = 0
            r9.f12642o = r0     // Catch:{ all -> 0x0014 }
            byte[] r2 = r9.f12634e     // Catch:{ all -> 0x0014 }
            if (r2 != 0) goto L_0x0068
            I3.h r2 = r9.f12633c     // Catch:{ all -> 0x0014 }
            java.lang.Object r2 = r2.f1180c     // Catch:{ all -> 0x0014 }
            C0.g r2 = (C0.g) r2     // Catch:{ all -> 0x0014 }
            r7 = 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x005e
            byte[] r2 = new byte[r7]     // Catch:{ all -> 0x0014 }
            goto L_0x0066
        L_0x005e:
            java.lang.Class<byte[]> r8 = byte[].class
            java.lang.Object r2 = r2.c(r7, r8)     // Catch:{ all -> 0x0014 }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x0014 }
        L_0x0066:
            r9.f12634e = r2     // Catch:{ all -> 0x0014 }
        L_0x0068:
            y0.b r2 = r9.f12639l     // Catch:{ all -> 0x0014 }
            java.util.ArrayList r2 = r2.f12623e     // Catch:{ all -> 0x0014 }
            int r7 = r9.f12638k     // Catch:{ all -> 0x0014 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0014 }
            y0.a r2 = (y0.C1107a) r2     // Catch:{ all -> 0x0014 }
            int r7 = r9.f12638k     // Catch:{ all -> 0x0014 }
            int r7 = r7 - r5
            if (r7 < 0) goto L_0x0084
            y0.b r8 = r9.f12639l     // Catch:{ all -> 0x0014 }
            java.util.ArrayList r8 = r8.f12623e     // Catch:{ all -> 0x0014 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x0014 }
            y0.a r7 = (y0.C1107a) r7     // Catch:{ all -> 0x0014 }
            goto L_0x0085
        L_0x0084:
            r7 = r3
        L_0x0085:
            int[] r8 = r2.f12619k     // Catch:{ all -> 0x0014 }
            if (r8 == 0) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            y0.b r8 = r9.f12639l     // Catch:{ all -> 0x0014 }
            int[] r8 = r8.f12620a     // Catch:{ all -> 0x0014 }
        L_0x008e:
            r9.f12631a = r8     // Catch:{ all -> 0x0014 }
            if (r8 != 0) goto L_0x00b1
            java.lang.String r0 = "d"
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0014 }
            r2.<init>(r1)     // Catch:{ all -> 0x0014 }
            int r1 = r9.f12638k     // Catch:{ all -> 0x0014 }
            r2.append(r1)     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0014 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0014 }
        L_0x00ad:
            r9.f12642o = r5     // Catch:{ all -> 0x0014 }
            monitor-exit(r9)
            return r3
        L_0x00b1:
            boolean r1 = r2.f12616f     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x00cf
            int[] r1 = r9.f12632b     // Catch:{ all -> 0x0014 }
            int r3 = r8.length     // Catch:{ all -> 0x0014 }
            java.lang.System.arraycopy(r8, r0, r1, r0, r3)     // Catch:{ all -> 0x0014 }
            int[] r1 = r9.f12632b     // Catch:{ all -> 0x0014 }
            r9.f12631a = r1     // Catch:{ all -> 0x0014 }
            int r3 = r2.h     // Catch:{ all -> 0x0014 }
            r1[r3] = r0     // Catch:{ all -> 0x0014 }
            int r0 = r2.g     // Catch:{ all -> 0x0014 }
            if (r0 != r6) goto L_0x00cf
            int r0 = r9.f12638k     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x00cf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0014 }
            r9.f12646s = r0     // Catch:{ all -> 0x0014 }
        L_0x00cf:
            android.graphics.Bitmap r0 = r9.d(r2, r7)     // Catch:{ all -> 0x0014 }
            monitor-exit(r9)
            return r0
        L_0x00d5:
            java.lang.String r1 = "d"
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r1 = "d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0014 }
            r2.<init>(r0)     // Catch:{ all -> 0x0014 }
            int r0 = r9.f12642o     // Catch:{ all -> 0x0014 }
            r2.append(r0)     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0014 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0014 }
        L_0x00f0:
            monitor-exit(r9)
            return r3
        L_0x00f2:
            monitor-exit(r9)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.b():android.graphics.Bitmap");
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f12647t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v46, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f12626j == r1.h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v29, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap d(y0.C1107a r34, y0.C1107a r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            int[] r10 = r0.f12637j
            I3.h r11 = r0.f12633c
            r12 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f12640m
            if (r3 == 0) goto L_0x0018
            java.lang.Object r4 = r11.f1179b
            C0.b r4 = (C0.b) r4
            r4.f(r3)
        L_0x0018:
            r3 = 0
            r0.f12640m = r3
            java.util.Arrays.fill(r10, r12)
        L_0x001e:
            r13 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.g
            if (r3 != r13) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f12640m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r12)
        L_0x002c:
            r14 = 2
            if (r2 == 0) goto L_0x007e
            int r3 = r2.g
            if (r3 <= 0) goto L_0x007e
            if (r3 != r14) goto L_0x006c
            boolean r3 = r1.f12616f
            if (r3 != 0) goto L_0x0047
            y0.b r3 = r0.f12639l
            int r4 = r3.f12627k
            int[] r5 = r1.f12619k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f12626j
            int r5 = r1.h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r12
        L_0x0048:
            int r3 = r2.d
            int r5 = r0.f12643p
            int r3 = r3 / r5
            int r6 = r2.f12613b
            int r6 = r6 / r5
            int r7 = r2.f12614c
            int r7 = r7 / r5
            int r2 = r2.f12612a
            int r2 = r2 / r5
            int r5 = r0.f12645r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.f12645r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r3 != r13) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f12640m
            if (r2 == 0) goto L_0x007e
            int r8 = r0.f12645r
            int r9 = r0.f12644q
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.d
            int r3 = r1.f12618j
            r2.position(r3)
            int r2 = r1.f12614c
            int r3 = r1.d
            int r2 = r2 * r3
            byte[] r3 = r0.f12636i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a4
        L_0x0091:
            java.lang.Object r3 = r11.f1180c
            C0.g r3 = (C0.g) r3
            if (r3 != 0) goto L_0x009a
            byte[] r3 = new byte[r2]
            goto L_0x00a2
        L_0x009a:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.c(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a2:
            r0.f12636i = r3
        L_0x00a4:
            byte[] r3 = r0.f12636i
            short[] r4 = r0.f12635f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b0
            short[] r4 = new short[r5]
            r0.f12635f = r4
        L_0x00b0:
            short[] r4 = r0.f12635f
            byte[] r6 = r0.g
            if (r6 != 0) goto L_0x00ba
            byte[] r6 = new byte[r5]
            r0.g = r6
        L_0x00ba:
            byte[] r6 = r0.g
            byte[] r7 = r0.h
            if (r7 != 0) goto L_0x00c6
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.h = r7
        L_0x00c6:
            byte[] r7 = r0.h
            java.nio.ByteBuffer r8 = r0.d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r11 = r9 << r8
            int r15 = r11 + 1
            int r16 = r11 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            int r17 = r17 + -1
            r14 = r12
        L_0x00dd:
            if (r14 >= r11) goto L_0x00e9
            r4[r14] = r12
            byte r5 = (byte) r14
            r6[r14] = r5
            int r14 = r14 + 1
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x00dd
        L_0x00e9:
            byte[] r5 = r0.f12634e
            r27 = r8
            r14 = r12
            r20 = r14
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r28 = r24
            r29 = r28
            r25 = r16
            r26 = r17
            r19 = -1
        L_0x0102:
            r30 = 8
            if (r14 >= r2) goto L_0x01fa
            if (r20 != 0) goto L_0x013c
            java.nio.ByteBuffer r9 = r0.d
            byte r9 = r9.get()
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 > 0) goto L_0x0117
            r31 = r8
            r32 = r14
            goto L_0x012b
        L_0x0117:
            java.nio.ByteBuffer r13 = r0.d
            byte[] r12 = r0.f12634e
            r31 = r8
            int r8 = r13.remaining()
            int r8 = java.lang.Math.min(r9, r8)
            r32 = r14
            r14 = 0
            r13.get(r12, r14, r8)
        L_0x012b:
            if (r9 > 0) goto L_0x0137
            r8 = 3
            r0.f12642o = r8
            r22 = r10
            r12 = r24
            r14 = 0
            goto L_0x01ff
        L_0x0137:
            r20 = r9
            r21 = 0
            goto L_0x0140
        L_0x013c:
            r31 = r8
            r32 = r14
        L_0x0140:
            byte r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r22
            int r23 = r23 + r8
            int r22 = r22 + 8
            r8 = 1
            int r21 = r21 + 1
            r8 = -1
            int r20 = r20 + -1
            r9 = r19
            r12 = r22
            r13 = r25
            r8 = r27
            r14 = r32
            r19 = r5
            r5 = r28
        L_0x015e:
            if (r12 < r8) goto L_0x01e7
            r22 = r10
            r10 = r23 & r26
            int r23 = r23 >> r8
            int r12 = r12 - r8
            if (r10 != r11) goto L_0x0173
            r13 = r16
            r26 = r17
            r10 = r22
            r8 = r31
            r9 = -1
            goto L_0x015e
        L_0x0173:
            if (r10 != r15) goto L_0x018a
            r28 = r5
            r27 = r8
            r25 = r13
            r5 = r19
            r10 = r22
            r8 = r31
            r13 = 3
            r19 = r9
            r22 = r12
            r9 = 1
            r12 = 0
            goto L_0x0102
        L_0x018a:
            r25 = r12
            r12 = -1
            if (r9 != r12) goto L_0x019e
            byte r5 = r6[r10]
            r3[r24] = r5
            int r24 = r24 + 1
            int r14 = r14 + 1
            r5 = r10
            r9 = r5
            r10 = r22
            r12 = r25
            goto L_0x015e
        L_0x019e:
            if (r10 < r13) goto L_0x01a7
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r9
            goto L_0x01a8
        L_0x01a7:
            r5 = r10
        L_0x01a8:
            if (r5 < r11) goto L_0x01b3
            byte r12 = r6[r5]
            r7[r29] = r12
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01a8
        L_0x01b3:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r5
            r3[r24] = r12
        L_0x01ba:
            int r24 = r24 + 1
            int r14 = r14 + 1
            if (r29 <= 0) goto L_0x01c7
            int r29 = r29 + -1
            byte r27 = r7[r29]
            r3[r24] = r27
            goto L_0x01ba
        L_0x01c7:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r13 >= r5) goto L_0x01de
            short r9 = (short) r9
            r4[r13] = r9
            r6[r13] = r12
            int r13 = r13 + 1
            r9 = r13 & r26
            if (r9 != 0) goto L_0x01de
            if (r13 >= r5) goto L_0x01de
            int r8 = r8 + 1
            int r26 = r26 + r13
        L_0x01de:
            r9 = r10
            r10 = r22
            r12 = r25
            r5 = r27
            goto L_0x015e
        L_0x01e7:
            r28 = r5
            r27 = r8
            r22 = r12
            r25 = r13
            r5 = r19
            r8 = r31
            r12 = 0
            r13 = 3
            r19 = r9
            r9 = 1
            goto L_0x0102
        L_0x01fa:
            r22 = r10
            r14 = r12
            r12 = r24
        L_0x01ff:
            java.util.Arrays.fill(r3, r12, r2, r14)
            boolean r2 = r1.f12615e
            if (r2 != 0) goto L_0x0279
            int r2 = r0.f12643p
            r3 = 1
            if (r2 == r3) goto L_0x020d
            goto L_0x0279
        L_0x020d:
            int[] r2 = r0.f12637j
            int r3 = r1.d
            int r4 = r1.f12613b
            int r5 = r1.f12614c
            int r6 = r1.f12612a
            int r7 = r0.f12638k
            if (r7 != 0) goto L_0x021d
            r7 = 1
            goto L_0x021e
        L_0x021d:
            r7 = r14
        L_0x021e:
            int r8 = r0.f12645r
            byte[] r9 = r0.f12636i
            int[] r10 = r0.f12631a
            r12 = r14
            r11 = -1
        L_0x0226:
            if (r12 >= r3) goto L_0x025b
            int r13 = r12 + r4
            int r13 = r13 * r8
            int r15 = r13 + r6
            int r14 = r15 + r5
            int r13 = r13 + r8
            if (r13 >= r14) goto L_0x0233
            r14 = r13
        L_0x0233:
            int r13 = r1.f12614c
            int r13 = r13 * r12
        L_0x0236:
            if (r15 >= r14) goto L_0x0253
            r16 = r3
            byte r3 = r9[r13]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r11) goto L_0x024a
            r4 = r10[r4]
            if (r4 == 0) goto L_0x0249
            r2[r15] = r4
            goto L_0x024a
        L_0x0249:
            r11 = r3
        L_0x024a:
            int r13 = r13 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x0236
        L_0x0253:
            r16 = r3
            r17 = r4
            int r12 = r12 + 1
            r14 = 0
            goto L_0x0226
        L_0x025b:
            java.lang.Boolean r2 = r0.f12646s
            if (r2 == 0) goto L_0x0265
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x026e
        L_0x0265:
            java.lang.Boolean r2 = r0.f12646s
            if (r2 != 0) goto L_0x0270
            if (r7 == 0) goto L_0x0270
            r2 = -1
            if (r11 == r2) goto L_0x0270
        L_0x026e:
            r12 = 1
            goto L_0x0271
        L_0x0270:
            r12 = 0
        L_0x0271:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f12646s = r2
            goto L_0x0406
        L_0x0279:
            int[] r2 = r0.f12637j
            int r3 = r1.d
            int r4 = r0.f12643p
            int r3 = r3 / r4
            int r5 = r1.f12613b
            int r5 = r5 / r4
            int r6 = r1.f12614c
            int r6 = r6 / r4
            int r7 = r1.f12612a
            int r7 = r7 / r4
            int r8 = r0.f12638k
            if (r8 != 0) goto L_0x028f
            r14 = 1
            goto L_0x0290
        L_0x028f:
            r14 = 0
        L_0x0290:
            int r8 = r0.f12645r
            int r9 = r0.f12644q
            byte[] r10 = r0.f12636i
            int[] r11 = r0.f12631a
            java.lang.Boolean r12 = r0.f12646s
            r17 = r30
            r13 = 0
            r15 = 0
            r16 = 1
        L_0x02a0:
            if (r13 >= r3) goto L_0x03f2
            r35 = r12
            boolean r12 = r1.f12615e
            if (r12 == 0) goto L_0x02cf
            if (r15 < r3) goto L_0x02ca
            int r12 = r16 + 1
            r18 = r3
            r3 = 2
            if (r12 == r3) goto L_0x02c7
            r3 = 3
            if (r12 == r3) goto L_0x02c0
            r3 = 4
            if (r12 == r3) goto L_0x02ba
        L_0x02b7:
            r16 = r12
            goto L_0x02cc
        L_0x02ba:
            r16 = r12
            r15 = 1
            r17 = 2
            goto L_0x02cc
        L_0x02c0:
            r3 = 4
            r17 = r3
            r16 = r12
            r15 = 2
            goto L_0x02cc
        L_0x02c7:
            r3 = 4
            r15 = r3
            goto L_0x02b7
        L_0x02ca:
            r18 = r3
        L_0x02cc:
            int r3 = r15 + r17
            goto L_0x02d3
        L_0x02cf:
            r18 = r3
            r3 = r15
            r15 = r13
        L_0x02d3:
            int r15 = r15 + r5
            r12 = 1
            if (r4 != r12) goto L_0x02d9
            r12 = 1
            goto L_0x02da
        L_0x02d9:
            r12 = 0
        L_0x02da:
            if (r15 >= r9) goto L_0x03d2
            int r15 = r15 * r8
            int r19 = r15 + r7
            r20 = r3
            int r3 = r19 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02e7
            r3 = r15
        L_0x02e7:
            int r15 = r13 * r4
            r21 = r5
            int r5 = r1.f12614c
            int r15 = r15 * r5
            if (r12 == 0) goto L_0x031a
            r12 = r35
            r5 = r19
        L_0x02f4:
            if (r5 >= r3) goto L_0x0310
            r23 = r6
            byte r6 = r10[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r11[r6]
            if (r6 == 0) goto L_0x0303
            r2[r5] = r6
            goto L_0x030a
        L_0x0303:
            if (r14 == 0) goto L_0x030a
            if (r12 != 0) goto L_0x030a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r12 = r6
        L_0x030a:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f4
        L_0x0310:
            r23 = r6
        L_0x0312:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e0
        L_0x031a:
            r23 = r6
            int r5 = r3 - r19
            int r5 = r5 * r4
            int r5 = r5 + r15
            r12 = r35
            r6 = r19
        L_0x0324:
            if (r6 >= r3) goto L_0x0312
            r19 = r3
            int r3 = r1.f12614c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0339:
            int r8 = r0.f12643p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x036e
            byte[] r8 = r0.f12636i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0370
            if (r7 >= r5) goto L_0x0370
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f12631a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0369
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0369:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0339
        L_0x036e:
            r32 = r9
        L_0x0370:
            int r3 = r3 + r15
            r7 = r3
        L_0x0372:
            int r8 = r0.f12643p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x03a3
            byte[] r8 = r0.f12636i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x03a3
            if (r7 >= r5) goto L_0x03a3
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f12631a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x03a0
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x03a0:
            int r7 = r7 + 1
            goto L_0x0372
        L_0x03a3:
            if (r28 != 0) goto L_0x03a7
            r3 = 0
            goto L_0x03b9
        L_0x03a7:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b9:
            if (r3 == 0) goto L_0x03be
            r2[r6] = r3
            goto L_0x03c5
        L_0x03be:
            if (r14 == 0) goto L_0x03c5
            if (r12 != 0) goto L_0x03c5
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r12 = r3
        L_0x03c5:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r19
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x0324
        L_0x03d2:
            r20 = r3
            r21 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r12 = r35
        L_0x03e0:
            int r13 = r13 + 1
            r3 = r18
            r15 = r20
            r5 = r21
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a0
        L_0x03f2:
            r35 = r12
            java.lang.Boolean r2 = r0.f12646s
            if (r2 != 0) goto L_0x0406
            if (r35 != 0) goto L_0x03fc
            r12 = 0
            goto L_0x0400
        L_0x03fc:
            boolean r12 = r35.booleanValue()
        L_0x0400:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f12646s = r2
        L_0x0406:
            boolean r2 = r0.f12641n
            if (r2 == 0) goto L_0x042a
            int r1 = r1.g
            if (r1 == 0) goto L_0x0411
            r2 = 1
            if (r1 != r2) goto L_0x042a
        L_0x0411:
            android.graphics.Bitmap r1 = r0.f12640m
            if (r1 != 0) goto L_0x041b
            android.graphics.Bitmap r1 = r33.a()
            r0.f12640m = r1
        L_0x041b:
            android.graphics.Bitmap r1 = r0.f12640m
            int r7 = r0.f12645r
            int r8 = r0.f12644q
            r3 = 0
            r5 = 0
            r6 = 0
            r2 = r22
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x042a:
            android.graphics.Bitmap r9 = r33.a()
            int r7 = r0.f12645r
            int r8 = r0.f12644q
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r22
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.d(y0.a, y0.a):android.graphics.Bitmap");
    }
}
