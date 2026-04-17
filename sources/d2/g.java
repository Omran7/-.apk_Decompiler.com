package D2;

import C0.a;
import C2.j;
import J2.d;
import K2.c;
import O2.A;
import O2.B;
import O2.C0117g;
import O2.C0118h;
import O2.C0120j;
import O2.C0121k;
import O2.C0122l;
import O2.C0124n;
import O2.C0126p;
import O2.C0127q;
import O2.C0129t;
import O2.C0131v;
import O2.C0132w;
import O2.C0133x;
import O2.C0135z;
import O2.D;
import O2.E;
import O2.F;
import O2.G;
import O2.H;
import O2.I;
import O2.J;
import O2.L;
import O2.O;
import O2.P;
import O2.Q;
import O2.T;
import O2.V;
import O2.l0;
import O2.m0;
import O2.n0;
import O2.o0;
import O2.p0;
import O2.q0;
import O2.r;
import O2.t0;
import O2.u0;
import O2.v0;
import P2.l;
import P2.o;
import P2.p;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.crypto.tink.shaded.protobuf.C0396a;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f520b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f521c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b6, boolean z3) {
        super((Object) n0.class);
        this.f521c = hVar;
    }

    public final C0396a i(C0396a aVar) {
        switch (this.f520b) {
            case 0:
                C0120j jVar = (C0120j) aVar;
                f[] fVarArr = {new f(1, l.class)};
                HashMap hashMap = new HashMap();
                int length = fVarArr.length;
                int i2 = 0;
                while (i2 < length) {
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
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f518a;
                }
                Collections.unmodifiableMap(hashMap);
                C0124n A6 = jVar.A();
                C0121k F = C0122l.F();
                C0126p C6 = A6.C();
                F.e();
                C0122l.z((C0122l) F.f6859b, C6);
                byte[] a6 = o.a(A6.B());
                C0403h v6 = C0404i.v(a6, 0, a6.length);
                F.e();
                C0122l.A((C0122l) F.f6859b, v6);
                F.e();
                C0122l.y((C0122l) F.f6859b);
                C0122l lVar = (C0122l) F.b();
                f[] fVarArr2 = {new f(11, j.class)};
                HashMap hashMap2 = new HashMap();
                int length2 = fVarArr2.length;
                int i5 = 0;
                while (i5 < length2) {
                    f fVar2 = fVarArr2[i5];
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f518a);
                    Class cls3 = fVar2.f518a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, fVar2);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f518a;
                }
                Collections.unmodifiableMap(hashMap2);
                T B6 = jVar.B();
                P F6 = Q.F();
                F6.e();
                Q.y((Q) F6.f6859b);
                V C7 = B6.C();
                F6.e();
                Q.z((Q) F6.f6859b, C7);
                byte[] a7 = o.a(B6.B());
                C0403h v7 = C0404i.v(a7, 0, a7.length);
                F6.e();
                Q.A((Q) F6.f6859b, v7);
                C0117g E6 = C0118h.E();
                E6.e();
                C0118h.z((C0118h) E6.f6859b, lVar);
                E6.e();
                C0118h.A((C0118h) E6.f6859b, (Q) F6.b());
                ((h) this.f521c).getClass();
                E6.e();
                C0118h.y((C0118h) E6.f6859b);
                return (C0118h) E6.b();
            case 1:
                C0129t tVar = (C0129t) aVar;
                C0127q E7 = r.E();
                byte[] a8 = o.a(tVar.A());
                C0403h v8 = C0404i.v(a8, 0, a8.length);
                E7.e();
                r.A((r) E7.f6859b, v8);
                C0131v B7 = tVar.B();
                E7.e();
                r.z((r) E7.f6859b, B7);
                ((h) this.f521c).getClass();
                E7.e();
                r.y((r) E7.f6859b);
                return (r) E7.b();
            case 2:
                C0132w C8 = C0133x.C();
                byte[] a9 = o.a(((C0135z) aVar).z());
                C0403h v9 = C0404i.v(a9, 0, a9.length);
                C8.e();
                C0133x.z((C0133x) C8.f6859b, v9);
                ((h) this.f521c).getClass();
                C8.e();
                C0133x.y((C0133x) C8.f6859b);
                return (C0133x) C8.b();
            case 3:
                A C9 = B.C();
                byte[] a10 = o.a(((D) aVar).z());
                C0403h v10 = C0404i.v(a10, 0, a10.length);
                C9.e();
                B.z((B) C9.f6859b, v10);
                ((h) this.f521c).getClass();
                C9.e();
                B.y((B) C9.f6859b);
                return (B) C9.b();
            case 4:
                L l6 = (L) aVar;
                I C10 = J.C();
                ((h) this.f521c).getClass();
                C10.e();
                J.y((J) C10.f6859b);
                byte[] a11 = o.a(32);
                C0403h v11 = C0404i.v(a11, 0, a11.length);
                C10.e();
                J.z((J) C10.f6859b, v11);
                return (J) C10.b();
            case 5:
                l0 C11 = m0.C();
                C11.e();
                m0.z((m0) C11.f6859b, (n0) aVar);
                ((h) this.f521c).getClass();
                C11.e();
                m0.y((m0) C11.f6859b);
                return (m0) C11.b();
            case zzaky.zzf.zzf /*6*/:
                o0 C12 = p0.C();
                C12.e();
                p0.z((p0) C12.f6859b, (q0) aVar);
                ((h) this.f521c).getClass();
                C12.e();
                p0.y((p0) C12.f6859b);
                return (p0) C12.b();
            case zzaky.zzf.zzg /*7*/:
                v0 v0Var = (v0) aVar;
                t0 C13 = u0.C();
                ((h) this.f521c).getClass();
                C13.e();
                u0.y((u0) C13.f6859b);
                byte[] a12 = o.a(32);
                C0403h v12 = C0404i.v(a12, 0, a12.length);
                C13.e();
                u0.z((u0) C13.f6859b, v12);
                return (u0) C13.b();
            case 8:
                E C14 = F.C();
                byte[] a13 = o.a(((H) aVar).z());
                C0403h v13 = C0404i.v(a13, 0, a13.length);
                C14.e();
                F.z((F) C14.f6859b, v13);
                ((h) this.f521c).getClass();
                C14.e();
                F.y((F) C14.f6859b);
                return (F) C14.b();
            default:
                T t6 = (T) aVar;
                P F7 = Q.F();
                ((c) this.f521c).getClass();
                F7.e();
                Q.y((Q) F7.f6859b);
                V C15 = t6.C();
                F7.e();
                Q.z((Q) F7.f6859b, C15);
                byte[] a14 = o.a(t6.B());
                C0403h v14 = C0404i.v(a14, 0, a14.length);
                F7.e();
                Q.A((Q) F7.f6859b, v14);
                return (Q) F7.b();
        }
    }

    public Map k() {
        switch (this.f520b) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("AES128_CTR_HMAC_SHA256", h.i(16, 16, 1));
                hashMap.put("AES128_CTR_HMAC_SHA256_RAW", h.i(16, 16, 3));
                hashMap.put("AES256_CTR_HMAC_SHA256", h.i(32, 32, 1));
                hashMap.put("AES256_CTR_HMAC_SHA256_RAW", h.i(32, 32, 3));
                return Collections.unmodifiableMap(hashMap);
            case 1:
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_EAX", h.h(16, 1));
                hashMap2.put("AES128_EAX_RAW", h.h(16, 3));
                hashMap2.put("AES256_EAX", h.h(32, 1));
                hashMap2.put("AES256_EAX_RAW", h.h(32, 3));
                return Collections.unmodifiableMap(hashMap2);
            case 2:
                HashMap hashMap3 = new HashMap();
                hashMap3.put("AES128_GCM", h.j(16, 1));
                hashMap3.put("AES128_GCM_RAW", h.j(16, 3));
                hashMap3.put("AES256_GCM", h.j(32, 1));
                hashMap3.put("AES256_GCM_RAW", h.j(32, 3));
                return Collections.unmodifiableMap(hashMap3);
            case 3:
                HashMap hashMap4 = new HashMap();
                hashMap4.put("AES128_GCM_SIV", h.k(16, 1));
                hashMap4.put("AES128_GCM_SIV_RAW", h.k(16, 3));
                hashMap4.put("AES256_GCM_SIV", h.k(32, 1));
                hashMap4.put("AES256_GCM_SIV_RAW", h.k(32, 3));
                return Collections.unmodifiableMap(hashMap4);
            case 4:
                HashMap hashMap5 = new HashMap();
                hashMap5.put("CHACHA20_POLY1305", new J2.c(L.y(), 1));
                hashMap5.put("CHACHA20_POLY1305_RAW", new J2.c(L.y(), 3));
                return Collections.unmodifiableMap(hashMap5);
            case zzaky.zzf.zzg /*7*/:
                HashMap hashMap6 = new HashMap();
                hashMap6.put("XCHACHA20_POLY1305", new J2.c(v0.y(), 1));
                hashMap6.put("XCHACHA20_POLY1305_RAW", new J2.c(v0.y(), 3));
                return Collections.unmodifiableMap(hashMap6);
            case 8:
                HashMap hashMap7 = new HashMap();
                G A6 = H.A();
                A6.e();
                H.y((H) A6.f6859b);
                hashMap7.put("AES256_SIV", new J2.c((H) A6.b(), 1));
                G A7 = H.A();
                A7.e();
                H.y((H) A7.f6859b);
                hashMap7.put("AES256_SIV_RAW", new J2.c((H) A7.b(), 3));
                return Collections.unmodifiableMap(hashMap7);
            case 9:
                HashMap hashMap8 = new HashMap();
                O o6 = O.SHA256;
                hashMap8.put("HMAC_SHA256_128BITTAG", c.h(32, 16, o6, 1));
                hashMap8.put("HMAC_SHA256_128BITTAG_RAW", c.h(32, 16, o6, 3));
                hashMap8.put("HMAC_SHA256_256BITTAG", c.h(32, 32, o6, 1));
                hashMap8.put("HMAC_SHA256_256BITTAG_RAW", c.h(32, 32, o6, 3));
                O o7 = O.SHA512;
                hashMap8.put("HMAC_SHA512_128BITTAG", c.h(64, 16, o7, 1));
                hashMap8.put("HMAC_SHA512_128BITTAG_RAW", c.h(64, 16, o7, 3));
                hashMap8.put("HMAC_SHA512_256BITTAG", c.h(64, 32, o7, 1));
                hashMap8.put("HMAC_SHA512_256BITTAG_RAW", c.h(64, 32, o7, 3));
                hashMap8.put("HMAC_SHA512_512BITTAG", c.h(64, 64, o7, 1));
                hashMap8.put("HMAC_SHA512_512BITTAG_RAW", c.h(64, 64, o7, 3));
                return Collections.unmodifiableMap(hashMap8);
            default:
                return super.k();
        }
    }

    public final C0396a m(C0404i iVar) {
        switch (this.f520b) {
            case 0:
                return C0120j.D(iVar, C0411p.a());
            case 1:
                return C0129t.D(iVar, C0411p.a());
            case 2:
                return C0135z.B(iVar, C0411p.a());
            case 3:
                return D.B(iVar, C0411p.a());
            case 4:
                return L.z(iVar, C0411p.a());
            case 5:
                return n0.A(iVar, C0411p.a());
            case zzaky.zzf.zzf /*6*/:
                return q0.C(iVar, C0411p.a());
            case zzaky.zzf.zzg /*7*/:
                return v0.z(iVar, C0411p.a());
            case 8:
                return H.B(iVar, C0411p.a());
            default:
                return T.E(iVar, C0411p.a());
        }
    }

    public final void n(C0396a aVar) {
        switch (this.f520b) {
            case 0:
                C0120j jVar = (C0120j) aVar;
                f[] fVarArr = {new f(1, l.class)};
                HashMap hashMap = new HashMap();
                int length = fVarArr.length;
                int i2 = 0;
                while (i2 < length) {
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
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f518a;
                }
                Collections.unmodifiableMap(hashMap);
                C0124n A6 = jVar.A();
                p.a(A6.B());
                C0126p C6 = A6.C();
                if (C6.A() < 12 || C6.A() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(11, j.class)};
                HashMap hashMap2 = new HashMap();
                int length2 = fVarArr2.length;
                int i5 = 0;
                while (i5 < length2) {
                    f fVar2 = fVarArr2[i5];
                    boolean containsKey2 = hashMap2.containsKey(fVar2.f518a);
                    Class cls3 = fVar2.f518a;
                    if (!containsKey2) {
                        hashMap2.put(cls3, fVar2);
                        i5++;
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
                    }
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f518a;
                }
                Collections.unmodifiableMap(hashMap2);
                T B6 = jVar.B();
                if (B6.B() >= 16) {
                    c.j(B6.C());
                    p.a(jVar.A().B());
                    return;
                }
                throw new GeneralSecurityException("key too short");
            case 1:
                C0129t tVar = (C0129t) aVar;
                p.a(tVar.A());
                if (tVar.B().A() != 12 && tVar.B().A() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                p.a(((C0135z) aVar).z());
                return;
            case 3:
                p.a(((D) aVar).z());
                return;
            case 4:
                L l6 = (L) aVar;
                return;
            case 5:
                n0 n0Var = (n0) aVar;
                return;
            case zzaky.zzf.zzf /*6*/:
                q0 q0Var = (q0) aVar;
                if (q0Var.A().isEmpty() || !q0Var.B()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case zzaky.zzf.zzg /*7*/:
                v0 v0Var = (v0) aVar;
                return;
            case 8:
                H h = (H) aVar;
                if (h.z() != 64) {
                    throw new InvalidAlgorithmParameterException("invalid key size: " + h.z() + ". Valid keys must have 64 bytes.");
                }
                return;
            default:
                T t6 = (T) aVar;
                if (t6.B() >= 16) {
                    c.j(t6.C());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b6, byte b7) {
        super((Object) q0.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, char c3) {
        super((Object) C0135z.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b6) {
        super((Object) C0129t.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, int i2) {
        super((Object) D.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, short s6) {
        super((Object) L.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b6, char c3) {
        super((Object) v0.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, byte b6, int i2) {
        super((Object) H.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super((Object) C0120j.class);
        this.f521c = hVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(c cVar) {
        super((Object) T.class);
        this.f521c = cVar;
    }
}
