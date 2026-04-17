package D2;

import Q2.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import x1.i;

public final class x extends b {
    /* JADX WARNING: type inference failed for: r4v6, types: [D2.x, java.lang.Object] */
    public static x b(j jVar, i iVar, Integer num) {
        j jVar2 = j.f533q;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        } else if (jVar != jVar2 || num == null) {
            a aVar = (a) iVar.f12553b;
            if (aVar.f2433a.length == 32) {
                if (jVar == jVar2) {
                    a.a(new byte[0]);
                } else if (jVar == j.f532p) {
                    a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (jVar == j.f531o) {
                    a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: " + jVar);
                }
                return new Object();
            }
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f2433a.length);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }
}
