package K2;

import C0.a;
import J2.c;
import O2.C0111a;
import O2.C0112b;
import O2.C0113c;
import O2.C0114d;
import O2.C0115e;
import O2.C0116f;
import P2.o;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b extends a {
    public final C0396a i(C0396a aVar) {
        C0114d dVar = (C0114d) aVar;
        C0111a E6 = C0112b.E();
        E6.e();
        C0112b.y((C0112b) E6.f6859b);
        byte[] a6 = o.a(dVar.A());
        C0403h v6 = C0404i.v(a6, 0, a6.length);
        E6.e();
        C0112b.z((C0112b) E6.f6859b, v6);
        C0116f B6 = dVar.B();
        E6.e();
        C0112b.A((C0112b) E6.f6859b, B6);
        return (C0112b) E6.b();
    }

    public final Map k() {
        HashMap hashMap = new HashMap();
        C0113c C6 = C0114d.C();
        C6.e();
        C0114d.y((C0114d) C6.f6859b);
        C0115e B6 = C0116f.B();
        B6.e();
        C0116f.y((C0116f) B6.f6859b);
        C6.e();
        C0114d.z((C0114d) C6.f6859b, (C0116f) B6.b());
        hashMap.put("AES_CMAC", new c((C0114d) C6.b(), 1));
        C0113c C7 = C0114d.C();
        C7.e();
        C0114d.y((C0114d) C7.f6859b);
        C0115e B7 = C0116f.B();
        B7.e();
        C0116f.y((C0116f) B7.f6859b);
        C7.e();
        C0114d.z((C0114d) C7.f6859b, (C0116f) B7.b());
        hashMap.put("AES256_CMAC", new c((C0114d) C7.b(), 1));
        C0113c C8 = C0114d.C();
        C8.e();
        C0114d.y((C0114d) C8.f6859b);
        C0115e B8 = C0116f.B();
        B8.e();
        C0116f.y((C0116f) B8.f6859b);
        C8.e();
        C0114d.z((C0114d) C8.f6859b, (C0116f) B8.b());
        hashMap.put("AES256_CMAC_RAW", new c((C0114d) C8.b(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final C0396a m(C0404i iVar) {
        return C0114d.D(iVar, C0411p.a());
    }

    public final void n(C0396a aVar) {
        C0114d dVar = (C0114d) aVar;
        c.i(dVar.B());
        if (dVar.A() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
