package H2;

import B0.C0009h;
import C2.c;
import C2.k;
import J2.f;
import J2.g;
import J2.p;
import M2.a;
import com.bumptech.glide.d;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import s2.e;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final C0009h f997a;

    /* renamed from: b  reason: collision with root package name */
    public final e f998b;

    /* renamed from: c  reason: collision with root package name */
    public final e f999c;

    public b(C0009h hVar) {
        this.f997a = hVar;
        boolean isEmpty = ((a) hVar.d).f1820a.isEmpty();
        e eVar = p.f1322a;
        if (!isEmpty) {
            f fVar = (f) g.f1302b.f1304a.get();
            fVar = fVar == null ? g.f1303c : fVar;
            p.a(hVar);
            fVar.getClass();
            this.f998b = eVar;
            this.f999c = eVar;
            return;
        }
        this.f998b = eVar;
        this.f999c = eVar;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        e eVar = this.f998b;
        C0009h hVar = this.f997a;
        try {
            byte[] bArr4 = ((k) hVar.f229c).f446c;
            if (bArr4 == null) {
                bArr3 = null;
            } else {
                bArr3 = Arrays.copyOf(bArr4, bArr4.length);
            }
            byte[] i2 = d.i(bArr3, ((c) ((k) hVar.f229c).f445b).a(bArr, bArr2));
            int i5 = ((k) hVar.f229c).f448f;
            eVar.getClass();
            return i2;
        } catch (GeneralSecurityException e6) {
            eVar.getClass();
            throw e6;
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C0009h hVar = this.f997a;
        e eVar = this.f999c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (k kVar : hVar.y(copyOf)) {
                try {
                    byte[] b6 = ((c) kVar.f445b).b(copyOfRange, bArr2);
                    eVar.getClass();
                    return b6;
                } catch (GeneralSecurityException e6) {
                    Logger logger = c.f1000a;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e6);
                }
            }
        }
        for (k kVar2 : hVar.y(C2.b.f433a)) {
            try {
                byte[] b7 = ((c) kVar2.f445b).b(bArr, bArr2);
                eVar.getClass();
                return b7;
            } catch (GeneralSecurityException unused) {
            }
        }
        eVar.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
