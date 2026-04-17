package D2;

import C2.n;
import J2.i;
import J2.k;
import K2.m;
import O2.B;
import O2.C0118h;
import O2.C0133x;
import O2.J;
import O2.m0;
import O2.p0;
import O2.r;
import O2.s0;
import O2.u0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public abstract class a {
    static {
        Class<C2.a> cls = C2.a.class;
        f[] fVarArr = {new f(0, cls)};
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < 1) {
            f fVar = fVarArr[i2];
            boolean containsKey = hashMap.containsKey(fVar.f518a);
            Class cls2 = fVar.f518a;
            if (!containsKey) {
                hashMap.put(cls2, fVar);
                i2++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
        }
        Class cls3 = fVarArr[0].f518a;
        Collections.unmodifiableMap(hashMap);
        f[] fVarArr2 = {new f(3, cls)};
        HashMap hashMap2 = new HashMap();
        f fVar2 = fVarArr2[0];
        boolean containsKey2 = hashMap2.containsKey(fVar2.f518a);
        Class cls4 = fVar2.f518a;
        if (!containsKey2) {
            hashMap2.put(cls4, fVar2);
            Class cls5 = fVarArr2[0].f518a;
            Collections.unmodifiableMap(hashMap2);
            f[] fVarArr3 = {new f(4, cls)};
            HashMap hashMap3 = new HashMap();
            f fVar3 = fVarArr3[0];
            boolean containsKey3 = hashMap3.containsKey(fVar3.f518a);
            Class cls6 = fVar3.f518a;
            if (!containsKey3) {
                hashMap3.put(cls6, fVar3);
                Class cls7 = fVarArr3[0].f518a;
                Collections.unmodifiableMap(hashMap3);
                f[] fVarArr4 = {new f(2, cls)};
                HashMap hashMap4 = new HashMap();
                f fVar4 = fVarArr4[0];
                boolean containsKey4 = hashMap4.containsKey(fVar4.f518a);
                Class cls8 = fVar4.f518a;
                if (!containsKey4) {
                    hashMap4.put(cls8, fVar4);
                    Class cls9 = fVarArr4[0].f518a;
                    Collections.unmodifiableMap(hashMap4);
                    f[] fVarArr5 = {new f(6, cls)};
                    HashMap hashMap5 = new HashMap();
                    f fVar5 = fVarArr5[0];
                    boolean containsKey5 = hashMap5.containsKey(fVar5.f518a);
                    Class cls10 = fVar5.f518a;
                    if (!containsKey5) {
                        hashMap5.put(cls10, fVar5);
                        Class cls11 = fVarArr5[0].f518a;
                        Collections.unmodifiableMap(hashMap5);
                        f[] fVarArr6 = {new f(7, cls)};
                        HashMap hashMap6 = new HashMap();
                        f fVar6 = fVarArr6[0];
                        boolean containsKey6 = hashMap6.containsKey(fVar6.f518a);
                        Class cls12 = fVar6.f518a;
                        if (!containsKey6) {
                            hashMap6.put(cls12, fVar6);
                            Class cls13 = fVarArr6[0].f518a;
                            Collections.unmodifiableMap(hashMap6);
                            f[] fVarArr7 = {new f(5, cls)};
                            HashMap hashMap7 = new HashMap();
                            f fVar7 = fVarArr7[0];
                            boolean containsKey7 = hashMap7.containsKey(fVar7.f518a);
                            Class cls14 = fVar7.f518a;
                            if (!containsKey7) {
                                hashMap7.put(cls14, fVar7);
                                Class cls15 = fVarArr7[0].f518a;
                                Collections.unmodifiableMap(hashMap7);
                                f[] fVarArr8 = {new f(8, cls)};
                                HashMap hashMap8 = new HashMap();
                                f fVar8 = fVarArr8[0];
                                boolean containsKey8 = hashMap8.containsKey(fVar8.f518a);
                                Class cls16 = fVar8.f518a;
                                if (!containsKey8) {
                                    hashMap8.put(cls16, fVar8);
                                    Class cls17 = fVarArr8[0].f518a;
                                    Collections.unmodifiableMap(hashMap8);
                                    int i5 = s0.CONFIG_NAME_FIELD_NUMBER;
                                    try {
                                        a();
                                    } catch (GeneralSecurityException e6) {
                                        throw new ExceptionInInitializerError(e6);
                                    }
                                } else {
                                    throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls16.getCanonicalName());
                                }
                            } else {
                                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls14.getCanonicalName());
                            }
                        } else {
                            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls12.getCanonicalName());
                        }
                    } else {
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls10.getCanonicalName());
                    }
                } else {
                    throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls8.getCanonicalName());
                }
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls6.getCanonicalName());
            }
        } else {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls4.getCanonicalName());
        }
    }

    public static void a() {
        n.g(e.f517b);
        m.a();
        Class<C2.a> cls = C2.a.class;
        n.e(new h(C0118h.class, new f[]{new f(0, cls)}, 0), true);
        n.e(new h(C0133x.class, new f[]{new f(3, cls)}, 2), true);
        k kVar = p.f546a;
        i iVar = i.f1307b;
        iVar.e(p.f546a);
        iVar.d(p.f547b);
        iVar.c(p.f548c);
        iVar.b(p.d);
        if (!G2.a.f836b.get()) {
            n.e(new h(r.class, new f[]{new f(2, cls)}, 1), true);
            iVar.e(m.f540a);
            iVar.d(m.f541b);
            iVar.c(m.f542c);
            iVar.b(m.d);
            try {
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                n.e(new h(B.class, new f[]{new f(4, cls)}, 3), true);
                iVar.e(s.f551a);
                iVar.d(s.f552b);
                iVar.c(s.f553c);
                iVar.b(s.d);
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            }
            n.e(new h(J.class, new f[]{new f(5, cls)}, 4), true);
            k kVar2 = v.f554a;
            i iVar2 = i.f1307b;
            iVar2.e(v.f554a);
            iVar2.d(v.f555b);
            iVar2.c(v.f556c);
            iVar2.b(v.d);
            n.e(new h(m0.class, new f[]{new f(6, cls)}, 5), true);
            n.e(new h(p0.class, new f[]{new f(7, cls)}, 6), true);
            n.e(new h(u0.class, new f[]{new f(8, cls)}, 7), true);
            iVar2.e(z.f560a);
            iVar2.d(z.f561b);
            iVar2.c(z.f562c);
            iVar2.b(z.d);
        }
    }
}
