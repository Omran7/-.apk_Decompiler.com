package K2;

import C0.a;
import C2.j;
import D2.f;
import D2.g;
import J2.d;
import J2.l;
import O2.C0112b;
import O2.C0114d;
import O2.C0116f;
import O2.O;
import O2.Q;
import O2.S;
import O2.T;
import O2.U;
import O2.V;
import O2.X;
import P2.p;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import java.security.GeneralSecurityException;

public final class c extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final l f1467e = new l(a.class, new D2.l(8));

    /* renamed from: f  reason: collision with root package name */
    public static final l f1468f = new l(j.class, new D2.l(10));
    public final /* synthetic */ int d = 1;

    public /* synthetic */ c(Class cls, f[] fVarArr) {
        super(cls, fVarArr);
    }

    public static J2.c h(int i2, int i5, O o6, int i6) {
        S D4 = T.D();
        U D6 = V.D();
        D6.e();
        V.y((V) D6.f6859b, o6);
        D6.e();
        V.z((V) D6.f6859b, i5);
        D4.e();
        T.y((T) D4.f6859b, (V) D6.b());
        D4.e();
        T.z((T) D4.f6859b, i2);
        return new J2.c((T) D4.b(), i6);
    }

    public static void i(C0116f fVar) {
        if (fVar.A() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (fVar.A() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void j(V v6) {
        if (v6.C() >= 10) {
            int ordinal = v6.B().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (v6.C() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (v6.C() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (v6.C() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (v6.C() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (v6.C() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public int a() {
        switch (this.d) {
            case 1:
                return 2;
            default:
                return super.a();
        }
    }

    public final String b() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    public final a d() {
        switch (this.d) {
            case 0:
                return new a((Object) C0114d.class);
            default:
                return new g(this);
        }
    }

    public final X e() {
        switch (this.d) {
            case 0:
                return X.SYMMETRIC;
            default:
                return X.SYMMETRIC;
        }
    }

    public final C0396a f(C0404i iVar) {
        switch (this.d) {
            case 0:
                return C0112b.F(iVar, C0411p.a());
            default:
                return Q.G(iVar, C0411p.a());
        }
    }

    public final void g(C0396a aVar) {
        switch (this.d) {
            case 0:
                C0112b bVar = (C0112b) aVar;
                p.c(bVar.D());
                if (bVar.B().size() == 32) {
                    i(bVar.C());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                Q q6 = (Q) aVar;
                p.c(q6.E());
                if (q6.C().size() >= 16) {
                    j(q6.D());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    public c() {
        super(Q.class, new f(11, j.class));
    }
}
