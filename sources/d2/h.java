package D2;

import C0.a;
import C2.j;
import J2.c;
import J2.d;
import O2.B;
import O2.C;
import O2.C0118h;
import O2.C0119i;
import O2.C0120j;
import O2.C0122l;
import O2.C0123m;
import O2.C0124n;
import O2.C0125o;
import O2.C0126p;
import O2.C0128s;
import O2.C0129t;
import O2.C0130u;
import O2.C0131v;
import O2.C0133x;
import O2.C0134y;
import O2.C0135z;
import O2.D;
import O2.F;
import O2.J;
import O2.O;
import O2.Q;
import O2.S;
import O2.T;
import O2.U;
import O2.V;
import O2.X;
import O2.m0;
import O2.p0;
import O2.r;
import O2.u0;
import P2.l;
import P2.p;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

public final class h extends d {
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Class cls, f[] fVarArr, int i2) {
        super(cls, fVarArr);
        this.d = i2;
    }

    public static c h(int i2, int i5) {
        C0128s C6 = C0129t.C();
        C6.e();
        C0129t.z((C0129t) C6.f6859b, i2);
        C0130u B6 = C0131v.B();
        B6.e();
        C0131v.y((C0131v) B6.f6859b);
        C6.e();
        C0129t.y((C0129t) C6.f6859b, (C0131v) B6.b());
        return new c((C0129t) C6.b(), i5);
    }

    public static c i(int i2, int i5, int i6) {
        O o6 = O.SHA256;
        C0123m D4 = C0124n.D();
        C0125o B6 = C0126p.B();
        B6.e();
        C0126p.y((C0126p) B6.f6859b);
        D4.e();
        C0124n.y((C0124n) D4.f6859b, (C0126p) B6.b());
        D4.e();
        C0124n.z((C0124n) D4.f6859b, i2);
        S D6 = T.D();
        U D7 = V.D();
        D7.e();
        V.y((V) D7.f6859b, o6);
        D7.e();
        V.z((V) D7.f6859b, i5);
        D6.e();
        T.y((T) D6.f6859b, (V) D7.b());
        D6.e();
        T.z((T) D6.f6859b, 32);
        C0119i C6 = C0120j.C();
        C6.e();
        C0120j.y((C0120j) C6.f6859b, (C0124n) D4.b());
        C6.e();
        C0120j.z((C0120j) C6.f6859b, (T) D6.b());
        return new c((C0120j) C6.b(), i6);
    }

    public static c j(int i2, int i5) {
        C0134y A6 = C0135z.A();
        A6.e();
        C0135z.y((C0135z) A6.f6859b, i2);
        return new c((C0135z) A6.b(), i5);
    }

    public static c k(int i2, int i5) {
        C A6 = D.A();
        A6.e();
        D.y((D) A6.f6859b, i2);
        return new c((D) A6.b(), i5);
    }

    public int a() {
        switch (this.d) {
            case 0:
                return 2;
            case 2:
                return 2;
            default:
                return super.a();
        }
    }

    public final String b() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case zzaky.zzf.zzf /*6*/:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case zzaky.zzf.zzg /*7*/:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    public final a d() {
        switch (this.d) {
            case 0:
                return new g(this);
            case 1:
                return new g(this, (byte) 0);
            case 2:
                return new g(this, 0);
            case 3:
                return new g(this, 0);
            case 4:
                return new g(this, 0);
            case 5:
                return new g(this, (byte) 0, false);
            case zzaky.zzf.zzf /*6*/:
                return new g(this, (byte) 0, (byte) 0);
            case zzaky.zzf.zzg /*7*/:
                return new g(this, (byte) 0, 0);
            default:
                return new g(this, (byte) 0, 0);
        }
    }

    public final X e() {
        switch (this.d) {
            case 0:
                return X.SYMMETRIC;
            case 1:
                return X.SYMMETRIC;
            case 2:
                return X.SYMMETRIC;
            case 3:
                return X.SYMMETRIC;
            case 4:
                return X.SYMMETRIC;
            case 5:
                return X.REMOTE;
            case zzaky.zzf.zzf /*6*/:
                return X.REMOTE;
            case zzaky.zzf.zzg /*7*/:
                return X.SYMMETRIC;
            default:
                return X.SYMMETRIC;
        }
    }

    public final C0396a f(C0404i iVar) {
        switch (this.d) {
            case 0:
                return C0118h.F(iVar, C0411p.a());
            case 1:
                return r.F(iVar, C0411p.a());
            case 2:
                return C0133x.D(iVar, C0411p.a());
            case 3:
                return B.D(iVar, C0411p.a());
            case 4:
                return J.D(iVar, C0411p.a());
            case 5:
                return m0.D(iVar, C0411p.a());
            case zzaky.zzf.zzf /*6*/:
                return p0.D(iVar, C0411p.a());
            case zzaky.zzf.zzg /*7*/:
                return u0.D(iVar, C0411p.a());
            default:
                return F.D(iVar, C0411p.a());
        }
    }

    public final void g(C0396a aVar) {
        switch (this.d) {
            case 0:
                C0118h hVar = (C0118h) aVar;
                p.c(hVar.D());
                f[] fVarArr = {new f(1, l.class)};
                HashMap hashMap = new HashMap();
                int i2 = 0;
                while (i2 < 1) {
                    f fVar = fVarArr[i2];
                    boolean containsKey = hashMap.containsKey(fVar.f518a);
                    Class cls = fVar.f518a;
                    if (!containsKey) {
                        hashMap.put(cls, fVar);
                        i2++;
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
                    }
                }
                Class cls2 = fVarArr[0].f518a;
                Collections.unmodifiableMap(hashMap);
                C0122l B6 = hVar.B();
                p.c(B6.E());
                p.a(B6.C().size());
                C0126p D4 = B6.D();
                if (D4.A() < 12 || D4.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(11, j.class)};
                HashMap hashMap2 = new HashMap();
                f fVar2 = fVarArr2[0];
                boolean containsKey2 = hashMap2.containsKey(fVar2.f518a);
                Class cls3 = fVar2.f518a;
                if (!containsKey2) {
                    hashMap2.put(cls3, fVar2);
                    Class cls4 = fVarArr2[0].f518a;
                    Collections.unmodifiableMap(hashMap2);
                    Q C6 = hVar.C();
                    p.c(C6.E());
                    if (C6.C().size() >= 16) {
                        K2.c.j(C6.D());
                        return;
                    }
                    throw new GeneralSecurityException("key too short");
                }
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
            case 1:
                r rVar = (r) aVar;
                p.c(rVar.D());
                p.a(rVar.B().size());
                if (rVar.C().A() != 12 && rVar.C().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                C0133x xVar = (C0133x) aVar;
                p.c(xVar.B());
                p.a(xVar.A().size());
                return;
            case 3:
                B b6 = (B) aVar;
                p.c(b6.B());
                p.a(b6.A().size());
                return;
            case 4:
                J j6 = (J) aVar;
                p.c(j6.B());
                if (j6.A().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 5:
                p.c(((m0) aVar).B());
                return;
            case zzaky.zzf.zzf /*6*/:
                p.c(((p0) aVar).B());
                return;
            case zzaky.zzf.zzg /*7*/:
                u0 u0Var = (u0) aVar;
                p.c(u0Var.B());
                if (u0Var.A().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                F f6 = (F) aVar;
                p.c(f6.B());
                if (f6.A().size() != 64) {
                    throw new InvalidKeyException("invalid key size: " + f6.A().size() + ". Valid keys must have 64 bytes.");
                }
                return;
        }
    }
}
