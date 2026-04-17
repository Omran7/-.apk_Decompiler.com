package androidx.emoji2.text;

import S3.z;
import V.a;
import java.nio.ByteBuffer;

public final class t {
    public static final ThreadLocal d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f4960a;

    /* renamed from: b  reason: collision with root package name */
    public final z f4961b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f4962c = 0;

    public t(z zVar, int i2) {
        this.f4961b = zVar;
        this.f4960a = i2;
    }

    public final int a(int i2) {
        a c3 = c();
        int a6 = c3.a(16);
        if (a6 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c3.d;
        int i5 = a6 + c3.f1342a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i5) + i5 + 4);
    }

    public final int b() {
        a c3 = c();
        int a6 = c3.a(16);
        if (a6 == 0) {
            return 0;
        }
        int i2 = a6 + c3.f1342a;
        return ((ByteBuffer) c3.d).getInt(((ByteBuffer) c3.d).getInt(i2) + i2);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, K.A] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V.a c() {
        /*
            r4 = this;
            java.lang.ThreadLocal r0 = d
            java.lang.Object r1 = r0.get()
            V.a r1 = (V.a) r1
            if (r1 != 0) goto L_0x0012
            V.a r1 = new V.a
            r1.<init>()
            r0.set(r1)
        L_0x0012:
            S3.z r0 = r4.f4961b
            java.lang.Object r0 = r0.f2711b
            V.b r0 = (V.b) r0
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L_0x005e
            int r3 = r0.f1342a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r2 = r4.f4960a
            int r2 = r2 * 4
            int r2 = r2 + r3
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            java.lang.Object r0 = r0.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.d = r0
            if (r0 == 0) goto L_0x0057
            r1.f1342a = r3
            int r0 = r0.getInt(r3)
            int r3 = r3 - r0
            r1.f1343b = r3
            java.lang.Object r0 = r1.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort(r3)
            r1.f1344c = r0
            goto L_0x005e
        L_0x0057:
            r0 = 0
            r1.f1342a = r0
            r1.f1343b = r0
            r1.f1344c = r0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.t.c():V.a");
    }

    public final String toString() {
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a c3 = c();
        int a6 = c3.a(4);
        if (a6 != 0) {
            i2 = ((ByteBuffer) c3.d).getInt(a6 + c3.f1342a);
        } else {
            i2 = 0;
        }
        sb.append(Integer.toHexString(i2));
        sb.append(", codepoints:");
        int b6 = b();
        for (int i5 = 0; i5 < b6; i5++) {
            sb.append(Integer.toHexString(a(i5)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
