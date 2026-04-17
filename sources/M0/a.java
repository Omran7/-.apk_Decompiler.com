package M0;

import B0.D;
import C0.b;
import C0.g;
import D0.c;
import H3.f;
import I3.h;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import z0.C1129e;
import z0.i;
import z0.k;

public final class a implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final f f1776f = new f(13);
    public static final c g = new c(1);

    /* renamed from: a  reason: collision with root package name */
    public final Context f1777a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1778b;

    /* renamed from: c  reason: collision with root package name */
    public final c f1779c = g;
    public final f d;

    /* renamed from: e  reason: collision with root package name */
    public final h f1780e;

    public a(Context context, ArrayList arrayList, b bVar, g gVar) {
        f fVar = f1776f;
        this.f1777a = context.getApplicationContext();
        this.f1778b = arrayList;
        this.d = fVar;
        this.f1780e = new h(bVar, gVar, 18, false);
    }

    public static int d(y0.b bVar, int i2, int i5) {
        int i6;
        int min = Math.min(bVar.g / i5, bVar.f12624f / i2);
        if (min == 0) {
            i6 = 0;
        } else {
            i6 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i6);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder h = com.google.android.gms.internal.measurement.a.h("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i2, "x");
            h.append(i5);
            h.append("], actual dimens: [");
            h.append(bVar.f12624f);
            h.append("x");
            h.append(bVar.g);
            h.append("]");
            Log.v("BufferGifDecoder", h.toString());
        }
        return max;
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        y0.c cVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        c cVar2 = this.f1779c;
        synchronized (cVar2) {
            try {
                y0.c cVar3 = (y0.c) cVar2.f488a.poll();
                if (cVar3 == null) {
                    cVar3 = new y0.c();
                }
                cVar = cVar3;
                cVar.f12629b = null;
                Arrays.fill(cVar.f12628a, (byte) 0);
                cVar.f12630c = new y0.b();
                cVar.d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                cVar.f12629b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                cVar.f12629b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        try {
            return c(byteBuffer, i2, i5, cVar, iVar);
        } finally {
            this.f1779c.a(cVar);
        }
    }

    public final boolean b(Object obj, i iVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) iVar.c(i.f1815b)).booleanValue() || C1129e.c(this.f1778b, byteBuffer) != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final K0.c c(java.nio.ByteBuffer r17, int r18, int r19, y0.c r20, z0.i r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = 1
            java.lang.String r2 = "Decoded GIF from stream in "
            java.lang.String r3 = "BufferGifDecoder"
            int r4 = U0.i.f3686b
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            r6 = 2
            y0.b r7 = r20.b()     // Catch:{ all -> 0x00b7 }
            int r8 = r7.f12622c     // Catch:{ all -> 0x00b7 }
            r9 = 0
            if (r8 <= 0) goto L_0x00b9
            int r8 = r7.f12621b     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x001d
            goto L_0x00b9
        L_0x001d:
            z0.h r8 = M0.i.f1814a     // Catch:{ all -> 0x00b7 }
            r10 = r21
            java.lang.Object r8 = r10.c(r8)     // Catch:{ all -> 0x00b7 }
            z0.a r10 = z0.C1125a.f12786b     // Catch:{ all -> 0x00b7 }
            if (r8 != r10) goto L_0x0033
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x0030 }
        L_0x002b:
            r13 = r18
            r14 = r19
            goto L_0x0036
        L_0x0030:
            r0 = move-exception
            goto L_0x00d3
        L_0x0033:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00b7 }
            goto L_0x002b
        L_0x0036:
            int r10 = d(r7, r13, r14)     // Catch:{ all -> 0x00b7 }
            H3.f r11 = r1.d     // Catch:{ all -> 0x00b7 }
            I3.h r12 = r1.f1780e     // Catch:{ all -> 0x00b7 }
            r11.getClass()     // Catch:{ all -> 0x00b7 }
            y0.d r15 = new y0.d     // Catch:{ all -> 0x00b7 }
            r11 = r17
            r15.<init>(r12, r7, r11, r10)     // Catch:{ all -> 0x00b7 }
            r15.c(r8)     // Catch:{ all -> 0x00b7 }
            int r7 = r15.f12638k     // Catch:{ all -> 0x00b7 }
            int r7 = r7 + r0
            y0.b r8 = r15.f12639l     // Catch:{ all -> 0x00b7 }
            int r8 = r8.f12622c     // Catch:{ all -> 0x00b7 }
            int r7 = r7 % r8
            r15.f12638k = r7     // Catch:{ all -> 0x00b7 }
            android.graphics.Bitmap r7 = r15.b()     // Catch:{ all -> 0x00b7 }
            if (r7 != 0) goto L_0x0075
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L_0x0074
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            double r4 = U0.i.a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L_0x0074:
            return r9
        L_0x0075:
            M0.c r8 = new M0.c     // Catch:{ all -> 0x00b7 }
            android.content.Context r9 = r1.f1777a     // Catch:{ all -> 0x00b7 }
            M0.b r12 = new M0.b     // Catch:{ all -> 0x00b7 }
            M0.h r11 = new M0.h     // Catch:{ all -> 0x00b7 }
            com.bumptech.glide.b r9 = com.bumptech.glide.b.a(r9)     // Catch:{ all -> 0x00b7 }
            r10 = r11
            r6 = r11
            r11 = r9
            r9 = r12
            r12 = r15
            r13 = r18
            r14 = r19
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b7 }
            r7 = 0
            r9.<init>(r6, r7)     // Catch:{ all -> 0x00b7 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b7 }
            K0.c r6 = new K0.c     // Catch:{ all -> 0x00b7 }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x00b7 }
            r7 = 2
            boolean r0 = android.util.Log.isLoggable(r3, r7)
            if (r0 == 0) goto L_0x00b4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            double r4 = U0.i.a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L_0x00b4:
            return r6
        L_0x00b5:
            r6 = 2
            goto L_0x00d3
        L_0x00b7:
            r0 = move-exception
            goto L_0x00b5
        L_0x00b9:
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            double r4 = U0.i.a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L_0x00d2:
            return r9
        L_0x00d3:
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto L_0x00ec
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            double r4 = U0.i.a(r4)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            android.util.Log.v(r3, r2)
        L_0x00ec:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.a.c(java.nio.ByteBuffer, int, int, y0.c, z0.i):K0.c");
    }
}
