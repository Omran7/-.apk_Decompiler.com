package D2;

import Q2.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import x1.i;

public final class t extends b {
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Object, D2.t] */
    public static t b(j jVar, i iVar, Integer num) {
        j jVar2 = j.f530n;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        } else if (jVar != jVar2 || num == null) {
            a aVar = (a) iVar.f12553b;
            if (aVar.f2433a.length == 32) {
                if (jVar == jVar2) {
                    a.a(new byte[0]);
                } else if (jVar == j.f529m) {
                    a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
                } else if (jVar == j.f528l) {
                    a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown Variant: " + jVar);
                }
                return new Object();
            }
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f2433a.length);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
    }
}
