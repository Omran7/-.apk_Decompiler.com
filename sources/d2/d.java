package D2;

import B0.C0009h;
import C2.a;
import C2.b;
import C2.k;
import J2.f;
import J2.g;
import J2.p;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import s2.e;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final C0009h f513a;

    /* renamed from: b  reason: collision with root package name */
    public final e f514b;

    /* renamed from: c  reason: collision with root package name */
    public final e f515c;

    public d(C0009h hVar) {
        this.f513a = hVar;
        boolean isEmpty = ((M2.a) hVar.d).f1820a.isEmpty();
        e eVar = p.f1322a;
        if (!isEmpty) {
            f fVar = (f) g.f1302b.f1304a.get();
            fVar = fVar == null ? g.f1303c : fVar;
            p.a(hVar);
            fVar.getClass();
            this.f514b = eVar;
            this.f515c = eVar;
            return;
        }
        this.f514b = eVar;
        this.f515c = eVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        e eVar = this.f514b;
        C0009h hVar = this.f513a;
        try {
            byte[] bArr4 = ((k) hVar.f229c).f446c;
            if (bArr4 == null) {
                bArr3 = null;
            } else {
                bArr3 = Arrays.copyOf(bArr4, bArr4.length);
            }
            byte[] i2 = com.bumptech.glide.d.i(bArr3, ((a) ((k) hVar.f229c).f445b).a(bArr, bArr2));
            int i5 = ((k) hVar.f229c).f448f;
            int length = bArr.length;
            eVar.getClass();
            return i2;
        } catch (GeneralSecurityException e6) {
            eVar.getClass();
            throw e6;
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C0009h hVar = this.f513a;
        e eVar = this.f515c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (k kVar : hVar.y(copyOf)) {
                try {
                    byte[] b6 = ((a) kVar.f445b).b(copyOfRange, bArr2);
                    eVar.getClass();
                    return b6;
                } catch (GeneralSecurityException e6) {
                    Logger logger = e.f516a;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e6);
                }
            }
        }
        for (k kVar2 : hVar.y(b.f433a)) {
            try {
                byte[] b7 = ((a) kVar2.f445b).b(bArr, bArr2);
                eVar.getClass();
                return b7;
            } catch (GeneralSecurityException unused) {
            }
        }
        eVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
