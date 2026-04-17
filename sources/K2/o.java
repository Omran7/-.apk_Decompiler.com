package K2;

import B0.C0009h;
import C2.b;
import C2.j;
import C2.k;
import J2.f;
import J2.g;
import J2.p;
import M2.a;
import O2.r0;
import com.bumptech.glide.d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import s2.e;

public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    public final C0009h f1495a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1496b;

    /* renamed from: c  reason: collision with root package name */
    public final e f1497c;

    public o(C0009h hVar) {
        this.f1495a = hVar;
        boolean isEmpty = ((a) hVar.d).f1820a.isEmpty();
        e eVar = p.f1322a;
        if (!isEmpty) {
            f fVar = (f) g.f1302b.f1304a.get();
            fVar = fVar == null ? g.f1303c : fVar;
            p.a(hVar);
            fVar.getClass();
            this.f1496b = eVar;
            this.f1497c = eVar;
            return;
        }
        this.f1496b = eVar;
        this.f1497c = eVar;
    }

    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        e eVar = this.f1497c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            C0009h hVar = this.f1495a;
            for (k kVar : hVar.y(copyOf)) {
                if (kVar.f447e.equals(r0.LEGACY)) {
                    bArr3 = d.i(bArr2, p.f1499b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((j) kVar.f445b).a(copyOfRange, bArr3);
                    int length2 = bArr3.length;
                    eVar.getClass();
                    return;
                } catch (GeneralSecurityException e6) {
                    Logger logger = p.f1498a;
                    logger.info("tag prefix matches a key, but cannot verify: " + e6);
                }
            }
            for (k kVar2 : hVar.y(b.f433a)) {
                try {
                    ((j) kVar2.f445b).a(bArr, bArr2);
                    int length3 = bArr2.length;
                    eVar.getClass();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            eVar.getClass();
            throw new GeneralSecurityException("invalid MAC");
        }
        eVar.getClass();
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArr2;
        e eVar = this.f1496b;
        C0009h hVar = this.f1495a;
        if (((k) hVar.f229c).f447e.equals(r0.LEGACY)) {
            bArr = d.i(bArr, p.f1499b);
        }
        try {
            byte[] bArr3 = ((k) hVar.f229c).f446c;
            if (bArr3 == null) {
                bArr2 = null;
            } else {
                bArr2 = Arrays.copyOf(bArr3, bArr3.length);
            }
            byte[] i2 = d.i(bArr2, ((j) ((k) hVar.f229c).f445b).b(bArr));
            int i5 = ((k) hVar.f229c).f448f;
            int length = bArr.length;
            eVar.getClass();
            return i2;
        } catch (GeneralSecurityException e6) {
            eVar.getClass();
            throw e6;
        }
    }
}
