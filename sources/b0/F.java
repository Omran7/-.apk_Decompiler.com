package B0;

import C0.e;
import C0.f;
import C0.g;
import C0.j;
import U0.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import z0.C1130f;
import z0.i;
import z0.m;

public final class F implements C1130f {

    /* renamed from: j  reason: collision with root package name */
    public static final k f192j = new k(50);

    /* renamed from: b  reason: collision with root package name */
    public final g f193b;

    /* renamed from: c  reason: collision with root package name */
    public final C1130f f194c;
    public final C1130f d;

    /* renamed from: e  reason: collision with root package name */
    public final int f195e;

    /* renamed from: f  reason: collision with root package name */
    public final int f196f;
    public final Class g;
    public final i h;

    /* renamed from: i  reason: collision with root package name */
    public final m f197i;

    public F(g gVar, C1130f fVar, C1130f fVar2, int i2, int i5, m mVar, Class cls, i iVar) {
        this.f193b = gVar;
        this.f194c = fVar;
        this.d = fVar2;
        this.f195e = i2;
        this.f196f = i5;
        this.f197i = mVar;
        this.g = cls;
        this.h = iVar;
    }

    public final void a(MessageDigest messageDigest) {
        Object e6;
        g gVar = this.f193b;
        Class<byte[]> cls = byte[].class;
        synchronized (gVar) {
            f fVar = gVar.f408b;
            j jVar = (j) ((ArrayDeque) fVar.f398a).poll();
            if (jVar == null) {
                jVar = fVar.p();
            }
            e eVar = (e) jVar;
            eVar.f404b = 8;
            eVar.f405c = cls;
            e6 = gVar.e(eVar, cls);
        }
        byte[] bArr = (byte[]) e6;
        ByteBuffer.wrap(bArr).putInt(this.f195e).putInt(this.f196f).array();
        this.d.a(messageDigest);
        this.f194c.a(messageDigest);
        messageDigest.update(bArr);
        m mVar = this.f197i;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        k kVar = f192j;
        Class cls2 = this.g;
        byte[] bArr2 = (byte[]) kVar.a(cls2);
        if (bArr2 == null) {
            bArr2 = cls2.getName().getBytes(C1130f.f12789a);
            kVar.d(cls2, bArr2);
        }
        messageDigest.update(bArr2);
        this.f193b.g(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (B0.F) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof B0.F
            r1 = 0
            if (r0 == 0) goto L_0x0046
            B0.F r4 = (B0.F) r4
            int r0 = r4.f196f
            int r2 = r3.f196f
            if (r2 != r0) goto L_0x0046
            int r0 = r3.f195e
            int r2 = r4.f195e
            if (r0 != r2) goto L_0x0046
            z0.m r0 = r3.f197i
            z0.m r2 = r4.f197i
            boolean r0 = U0.o.b(r0, r2)
            if (r0 == 0) goto L_0x0046
            java.lang.Class r0 = r3.g
            java.lang.Class r2 = r4.g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            z0.f r0 = r3.f194c
            z0.f r2 = r4.f194c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            z0.f r0 = r3.d
            z0.f r2 = r4.d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            z0.i r0 = r3.h
            z0.i r4 = r4.h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0046
            r1 = 1
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.F.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.f194c.hashCode() * 31)) * 31) + this.f195e) * 31) + this.f196f;
        m mVar = this.f197i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        int hashCode2 = this.g.hashCode();
        return this.h.f12794b.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f194c + ", signature=" + this.d + ", width=" + this.f195e + ", height=" + this.f196f + ", decodedResourceClass=" + this.g + ", transformation='" + this.f197i + "', options=" + this.h + '}';
    }
}
