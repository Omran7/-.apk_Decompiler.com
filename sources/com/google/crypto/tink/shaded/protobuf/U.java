package com.google.crypto.tink.shaded.protobuf;

import I0.x;
import a1.C0258c;
import com.bumptech.glide.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import h0.C0552a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

public final class U implements d0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f6767o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f6768p = p0.m();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6769a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f6770b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6771c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final C0396a f6772e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6773f;
    public final boolean g;
    public final int[] h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6774i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6775j;

    /* renamed from: k  reason: collision with root package name */
    public final W f6776k;

    /* renamed from: l  reason: collision with root package name */
    public final J f6777l;

    /* renamed from: m  reason: collision with root package name */
    public final h0 f6778m;

    /* renamed from: n  reason: collision with root package name */
    public final O f6779n;

    public U(int[] iArr, Object[] objArr, int i2, int i5, C0396a aVar, boolean z3, int[] iArr2, int i6, int i7, W w6, J j6, h0 h0Var, C0412q qVar, O o6) {
        this.f6769a = iArr;
        this.f6770b = objArr;
        this.f6771c = i2;
        this.d = i5;
        this.f6773f = aVar instanceof C0418x;
        this.g = z3;
        this.h = iArr2;
        this.f6774i = i6;
        this.f6775j = i7;
        this.f6776k = w6;
        this.f6777l = j6;
        this.f6778m = h0Var;
        this.f6772e = aVar;
        this.f6779n = o6;
    }

    public static U C(c0 c0Var, W w6, J j6, h0 h0Var, C0412q qVar, O o6) {
        if (c0Var instanceof c0) {
            return D(c0Var, w6, j6, h0Var, qVar, o6);
        }
        c0Var.getClass();
        throw new ClassCastException();
    }

    public static U D(c0 c0Var, W w6, J j6, h0 h0Var, C0412q qVar, O o6) {
        boolean z3;
        int i2;
        char c3;
        int i5;
        char c6;
        int[] iArr;
        char c7;
        char c8;
        char c9;
        int i6;
        int i7;
        int i8;
        int i9;
        char c10;
        int i10;
        char c11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Field field;
        char charAt;
        int i17;
        int i18;
        char c12;
        Field Q5;
        Field field2;
        int i19;
        char charAt2;
        int i20;
        char charAt3;
        int i21;
        char charAt4;
        int i22;
        char charAt5;
        int i23;
        char charAt6;
        int i24;
        char charAt7;
        int i25;
        char charAt8;
        int i26;
        char charAt9;
        int i27;
        char charAt10;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        char c13 = 0;
        if (c0Var.d() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        String c14 = c0Var.c();
        int length = c14.length();
        if (c14.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i2 = i31 + 1;
                if (c14.charAt(i31) < 55296) {
                    break;
                }
                i31 = i2;
            }
        } else {
            i2 = 1;
        }
        int i32 = i2 + 1;
        char charAt14 = c14.charAt(i2);
        if (charAt14 >= 55296) {
            char c15 = charAt14 & 8191;
            int i33 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt13 = c14.charAt(i32);
                if (charAt13 < 55296) {
                    break;
                }
                c15 |= (charAt13 & 8191) << i33;
                i33 += 13;
                i32 = i30;
            }
            charAt14 = c15 | (charAt13 << i33);
            i32 = i30;
        }
        if (charAt14 == 0) {
            c8 = 0;
            c7 = 0;
            c6 = 0;
            i5 = 0;
            c3 = 0;
            iArr = f6767o;
            c9 = 0;
        } else {
            int i34 = i32 + 1;
            char charAt15 = c14.charAt(i32);
            if (charAt15 >= 55296) {
                char c16 = charAt15 & 8191;
                int i35 = 13;
                while (true) {
                    i29 = i34 + 1;
                    charAt12 = c14.charAt(i34);
                    if (charAt12 < 55296) {
                        break;
                    }
                    c16 |= (charAt12 & 8191) << i35;
                    i35 += 13;
                    i34 = i29;
                }
                charAt15 = c16 | (charAt12 << i35);
                i34 = i29;
            }
            int i36 = i34 + 1;
            char charAt16 = c14.charAt(i34);
            if (charAt16 >= 55296) {
                char c17 = charAt16 & 8191;
                int i37 = 13;
                while (true) {
                    i28 = i36 + 1;
                    charAt11 = c14.charAt(i36);
                    if (charAt11 < 55296) {
                        break;
                    }
                    c17 |= (charAt11 & 8191) << i37;
                    i37 += 13;
                    i36 = i28;
                }
                charAt16 = c17 | (charAt11 << i37);
                i36 = i28;
            }
            int i38 = i36 + 1;
            char charAt17 = c14.charAt(i36);
            if (charAt17 >= 55296) {
                char c18 = charAt17 & 8191;
                int i39 = 13;
                while (true) {
                    i27 = i38 + 1;
                    charAt10 = c14.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    c18 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i38 = i27;
                }
                charAt17 = c18 | (charAt10 << i39);
                i38 = i27;
            }
            int i40 = i38 + 1;
            c7 = c14.charAt(i38);
            if (c7 >= 55296) {
                char c19 = c7 & 8191;
                int i41 = 13;
                while (true) {
                    i26 = i40 + 1;
                    charAt9 = c14.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    c19 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i40 = i26;
                }
                c7 = c19 | (charAt9 << i41);
                i40 = i26;
            }
            int i42 = i40 + 1;
            char charAt18 = c14.charAt(i40);
            if (charAt18 >= 55296) {
                char c20 = charAt18 & 8191;
                int i43 = 13;
                while (true) {
                    i25 = i42 + 1;
                    charAt8 = c14.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    c20 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i42 = i25;
                }
                charAt18 = c20 | (charAt8 << i43);
                i42 = i25;
            }
            int i44 = i42 + 1;
            c6 = c14.charAt(i42);
            if (c6 >= 55296) {
                char c21 = c6 & 8191;
                int i45 = 13;
                while (true) {
                    i24 = i44 + 1;
                    charAt7 = c14.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    c21 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i44 = i24;
                }
                c6 = c21 | (charAt7 << i45);
                i44 = i24;
            }
            int i46 = i44 + 1;
            char charAt19 = c14.charAt(i44);
            if (charAt19 >= 55296) {
                char c22 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i46 + 1;
                    charAt6 = c14.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    c22 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i46 = i23;
                }
                charAt19 = c22 | (charAt6 << i47);
                i46 = i23;
            }
            int i48 = i46 + 1;
            c3 = c14.charAt(i46);
            if (c3 >= 55296) {
                char c23 = c3 & 8191;
                int i49 = i48;
                int i50 = 13;
                while (true) {
                    i22 = i49 + 1;
                    charAt5 = c14.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    c23 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i49 = i22;
                }
                c3 = c23 | (charAt5 << i50);
                i48 = i22;
            }
            i5 = (charAt15 * 2) + charAt16;
            c9 = charAt17;
            c8 = charAt18;
            iArr = new int[(c3 + c6 + charAt19)];
            c13 = charAt15;
            i32 = i48;
        }
        Unsafe unsafe = f6768p;
        Object[] b6 = c0Var.b();
        Class<?> cls = c0Var.a().getClass();
        int[] iArr2 = new int[(c8 * 3)];
        Object[] objArr = new Object[(c8 * 2)];
        int i51 = c6 + c3;
        int i52 = i51;
        char c24 = c3;
        int i53 = 0;
        int i54 = 0;
        while (i32 < length) {
            int i55 = i32 + 1;
            int charAt20 = c14.charAt(i32);
            if (charAt20 >= 55296) {
                int i56 = charAt20 & 8191;
                int i57 = i55;
                int i58 = 13;
                while (true) {
                    i21 = i57 + 1;
                    charAt4 = c14.charAt(i57);
                    i6 = length;
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i57 = i21;
                    length = i6;
                }
                charAt20 = i56 | (charAt4 << i58);
                i7 = i21;
            } else {
                i6 = length;
                i7 = i55;
            }
            int i59 = i7 + 1;
            char charAt21 = c14.charAt(i7);
            int i60 = i59;
            if (charAt21 >= 55296) {
                char c25 = charAt21 & 8191;
                int i61 = i60;
                int i62 = 13;
                while (true) {
                    i20 = i61 + 1;
                    charAt3 = c14.charAt(i61);
                    i8 = i51;
                    if (charAt3 < 55296) {
                        break;
                    }
                    c25 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i61 = i20;
                    i51 = i8;
                }
                charAt21 = c25 | (charAt3 << i62);
                i9 = i20;
            } else {
                i8 = i51;
                i9 = i60;
            }
            char c26 = charAt21 & 255;
            char c27 = c3;
            if ((charAt21 & 1024) != 0) {
                iArr[i53] = i54;
                i53++;
            }
            if (c26 >= '3') {
                int i63 = i9 + 1;
                char charAt22 = c14.charAt(i9);
                int i64 = i63;
                if (charAt22 >= 55296) {
                    char c28 = charAt22 & 8191;
                    int i65 = i64;
                    int i66 = 13;
                    while (true) {
                        i19 = i65 + 1;
                        charAt2 = c14.charAt(i65);
                        c10 = c7;
                        if (charAt2 < 55296) {
                            break;
                        }
                        c28 |= (charAt2 & 8191) << i66;
                        i66 += 13;
                        i65 = i19;
                        c7 = c10;
                    }
                    charAt22 = c28 | (charAt2 << i66);
                    i18 = i19;
                } else {
                    c10 = c7;
                    i18 = i64;
                }
                int i67 = c26 - '3';
                int i68 = i18;
                if (i67 == 9 || i67 == 17) {
                    c12 = 2;
                    objArr[((i54 / 3) * 2) + 1] = b6[i5];
                    i5++;
                } else {
                    if (i67 == 12 && !z3) {
                        objArr[((i54 / 3) * 2) + 1] = b6[i5];
                        i5++;
                    }
                    c12 = 2;
                }
                int i69 = charAt22 * c12;
                Object obj = b6[i69];
                if (obj instanceof Field) {
                    Q5 = (Field) obj;
                } else {
                    Q5 = Q(cls, (String) obj);
                    b6[i69] = Q5;
                }
                int i70 = i5;
                i12 = (int) unsafe.objectFieldOffset(Q5);
                int i71 = i69 + 1;
                Object obj2 = b6[i71];
                if (obj2 instanceof Field) {
                    field2 = (Field) obj2;
                } else {
                    field2 = Q(cls, (String) obj2);
                    b6[i71] = field2;
                }
                i11 = (int) unsafe.objectFieldOffset(field2);
                i14 = 0;
                int i72 = i68;
                c11 = c9;
                i13 = i70;
                i10 = i72;
            } else {
                c10 = c7;
                int i73 = i5 + 1;
                Field Q6 = Q(cls, (String) b6[i5]);
                c11 = c9;
                if (c26 == 9 || c26 == 17) {
                    objArr[((i54 / 3) * 2) + 1] = Q6.getType();
                } else {
                    if (c26 == 27 || c26 == '1') {
                        i17 = i5 + 2;
                        objArr[((i54 / 3) * 2) + 1] = b6[i73];
                    } else if (c26 == 12 || c26 == 30 || c26 == ',') {
                        if (!z3) {
                            i17 = i5 + 2;
                            objArr[((i54 / 3) * 2) + 1] = b6[i73];
                        }
                    } else if (c26 == '2') {
                        int i74 = c24 + 1;
                        iArr[c24] = i54;
                        int i75 = (i54 / 3) * 2;
                        int i76 = i5 + 2;
                        objArr[i75] = b6[i73];
                        if ((charAt21 & 2048) != 0) {
                            i73 = i5 + 3;
                            objArr[i75 + 1] = b6[i76];
                            c24 = i74;
                        } else {
                            c24 = i74;
                            i73 = i76;
                        }
                    }
                    i73 = i17;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(Q6);
                if ((charAt21 & 4096) != 4096 || c26 > 17) {
                    i11 = 1048575;
                    i10 = i9;
                    i14 = 0;
                } else {
                    int i77 = i9 + 1;
                    char charAt23 = c14.charAt(i9);
                    if (charAt23 >= 55296) {
                        char c29 = charAt23 & 8191;
                        int i78 = 13;
                        while (true) {
                            i10 = i77 + 1;
                            charAt = c14.charAt(i77);
                            if (charAt < 55296) {
                                break;
                            }
                            c29 |= (charAt & 8191) << i78;
                            i78 += 13;
                            i77 = i10;
                        }
                        charAt23 = c29 | (charAt << i78);
                    } else {
                        i10 = i77;
                    }
                    int i79 = (charAt23 / ' ') + (c13 * 2);
                    Object obj3 = b6[i79];
                    if (obj3 instanceof Field) {
                        field = (Field) obj3;
                    } else {
                        field = Q(cls, (String) obj3);
                        b6[i79] = field;
                    }
                    i11 = (int) unsafe.objectFieldOffset(field);
                    i14 = charAt23 % ' ';
                }
                if (c26 >= 18 && c26 <= '1') {
                    iArr[i52] = objectFieldOffset;
                    i52++;
                }
                int i80 = i73;
                i12 = objectFieldOffset;
                i13 = i80;
            }
            int i81 = i54 + 1;
            iArr2[i54] = charAt20;
            int i82 = i54 + 2;
            String str = c14;
            if ((charAt21 & 512) != 0) {
                i15 = 536870912;
            } else {
                i15 = 0;
            }
            if ((charAt21 & 256) != 0) {
                i16 = 268435456;
            } else {
                i16 = 0;
            }
            iArr2[i81] = i15 | i16 | (c26 << 20) | i12;
            i54 += 3;
            iArr2[i82] = (i14 << 20) | i11;
            i5 = i13;
            c3 = c27;
            c14 = str;
            c9 = c11;
            length = i6;
            i51 = i8;
            i32 = i10;
            c7 = c10;
        }
        char c30 = c9;
        int i83 = i51;
        return new U(iArr2, objArr, c9, c7, c0Var.a(), z3, iArr, c3, i51, w6, j6, h0Var, qVar, o6);
    }

    public static long E(int i2) {
        return (long) (i2 & 1048575);
    }

    public static int F(Object obj, long j6) {
        return ((Integer) p0.f6845c.i(obj, j6)).intValue();
    }

    public static long G(Object obj, long j6) {
        return ((Long) p0.f6845c.i(obj, j6)).longValue();
    }

    public static Field Q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder t6 = C0552a.t("Field ", str, " for ");
            t6.append(cls.getName());
            t6.append(" not found. Known fields are ");
            t6.append(Arrays.toString(declaredFields));
            throw new RuntimeException(t6.toString());
        }
    }

    public static int W(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static void Z(int i2, Object obj, M m6) {
        if (obj instanceof String) {
            String str = (String) obj;
            C0408m mVar = (C0408m) m6.f6761a;
            mVar.w1(i2, 2);
            int i5 = mVar.f6837s;
            try {
                int m12 = C0408m.m1(str.length() * 3);
                int m13 = C0408m.m1(str.length());
                byte[] bArr = mVar.f6835q;
                int i6 = mVar.f6836r;
                if (m13 == m12) {
                    int i7 = i5 + m13;
                    mVar.f6837s = i7;
                    int r6 = s0.f6855a.r(str, bArr, i7, i6 - i7);
                    mVar.f6837s = i5;
                    mVar.x1((r6 - i5) - m13);
                    mVar.f6837s = r6;
                    return;
                }
                mVar.x1(s0.b(str));
                int i8 = mVar.f6837s;
                mVar.f6837s = s0.f6855a.r(str, bArr, i8, i6 - i8);
            } catch (r0 e6) {
                mVar.f6837s = i5;
                C0408m.f6832t.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e6);
                byte[] bytes = str.getBytes(B.f6742a);
                try {
                    mVar.x1(bytes.length);
                    mVar.q1(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e7) {
                    throw new x(e7);
                }
            } catch (IndexOutOfBoundsException e8) {
                throw new x(e8);
            }
        } else {
            m6.b(i2, (C0404i) obj);
        }
    }

    public static void l(Object obj) {
        if (!t(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C0418x) {
            return ((C0418x) obj).p();
        }
        return true;
    }

    public static List v(C0418x xVar, long j6) {
        return (List) p0.f6845c.i(xVar, j6);
    }

    public final Object A(int i2, Object obj) {
        d0 p6 = p(i2);
        long X3 = (long) (X(i2) & 1048575);
        if (!s(i2, obj)) {
            return p6.i();
        }
        Object object = f6768p.getObject(obj, X3);
        if (t(object)) {
            return object;
        }
        Object i5 = p6.i();
        if (object != null) {
            p6.c(i5, object);
        }
        return i5;
    }

    public final Object B(int i2, Object obj, int i5) {
        d0 p6 = p(i5);
        if (!u(i2, obj, i5)) {
            return p6.i();
        }
        Object object = f6768p.getObject(obj, (long) (X(i5) & 1048575));
        if (t(object)) {
            return object;
        }
        Object i6 = p6.i();
        if (object != null) {
            p6.c(i6, object);
        }
        return i6;
    }

    public final void H(long j6, Object obj, int i2) {
        Unsafe unsafe = f6768p;
        Object o6 = o(i2);
        Object object = unsafe.getObject(obj, j6);
        this.f6779n.getClass();
        if (O.c(object)) {
            N e6 = O.e();
            O.d(e6, object);
            unsafe.putObject(obj, j6, e6);
        }
        O.a(o6);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i2, int i5, int i6, int i7, int i8, int i9, int i10, long j6, int i11, C0258c cVar) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        int i13 = i7;
        int i14 = i8;
        long j7 = j6;
        int i15 = i11;
        C0258c cVar2 = cVar;
        Unsafe unsafe = f6768p;
        long j8 = (long) (this.f6769a[i15 + 2] & 1048575);
        boolean z3 = true;
        switch (i10) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj2, j7, Double.valueOf(d.r(bArr, i2)));
                    int i16 = i12 + 8;
                    unsafe.putInt(obj2, j8, i13);
                    return i16;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj2, j7, Float.valueOf(d.x(bArr, i2)));
                    int i17 = i12 + 4;
                    unsafe.putInt(obj2, j8, i13);
                    return i17;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int U5 = d.U(bArr2, i12, cVar2);
                    unsafe.putObject(obj2, j7, Long.valueOf(cVar2.f4551c));
                    unsafe.putInt(obj2, j8, i13);
                    return U5;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int S5 = d.S(bArr2, i12, cVar2);
                    unsafe.putObject(obj2, j7, Integer.valueOf(cVar2.f4550b));
                    unsafe.putInt(obj2, j8, i13);
                    return S5;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj2, j7, Long.valueOf(d.v(bArr, i2)));
                    int i18 = i12 + 8;
                    unsafe.putInt(obj2, j8, i13);
                    return i18;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj2, j7, Integer.valueOf(d.t(bArr, i2)));
                    int i19 = i12 + 4;
                    unsafe.putInt(obj2, j8, i13);
                    return i19;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int U6 = d.U(bArr2, i12, cVar2);
                    if (cVar2.f4551c == 0) {
                        z3 = false;
                    }
                    unsafe.putObject(obj2, j7, Boolean.valueOf(z3));
                    unsafe.putInt(obj2, j8, i13);
                    return U6;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int S6 = d.S(bArr2, i12, cVar2);
                    int i20 = cVar2.f4550b;
                    if (i20 == 0) {
                        unsafe.putObject(obj2, j7, "");
                    } else if ((i9 & 536870912) == 0 || s0.e(bArr2, S6, S6 + i20)) {
                        unsafe.putObject(obj2, j7, new String(bArr2, S6, i20, B.f6742a));
                        S6 += i20;
                    } else {
                        throw D.b();
                    }
                    unsafe.putInt(obj2, j8, i13);
                    return S6;
                }
                break;
            case 60:
                if (i14 == 2) {
                    Object B6 = B(i13, obj2, i15);
                    int R02 = d.R0(B6, p(i15), bArr, i2, i5, cVar);
                    V(obj2, i13, i15, B6);
                    return R02;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int p6 = d.p(bArr2, i12, cVar2);
                    unsafe.putObject(obj2, j7, cVar2.d);
                    unsafe.putInt(obj2, j8, i13);
                    return p6;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int S7 = d.S(bArr2, i12, cVar2);
                    int i21 = cVar2.f4550b;
                    n(i15);
                    unsafe.putObject(obj2, j7, Integer.valueOf(i21));
                    unsafe.putInt(obj2, j8, i13);
                    return S7;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int S8 = d.S(bArr2, i12, cVar2);
                    unsafe.putObject(obj2, j7, Integer.valueOf(E2.d.d(cVar2.f4550b)));
                    unsafe.putInt(obj2, j8, i13);
                    return S8;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int U7 = d.U(bArr2, i12, cVar2);
                    unsafe.putObject(obj2, j7, Long.valueOf(E2.d.e(cVar2.f4551c)));
                    unsafe.putInt(obj2, j8, i13);
                    return U7;
                }
                break;
            case 68:
                if (i14 == 3) {
                    Object B7 = B(i13, obj2, i15);
                    Object obj3 = B7;
                    int Q02 = d.Q0(obj3, p(i15), bArr, i2, i5, (i6 & -8) | 4, cVar);
                    V(obj2, i13, i15, B7);
                    return Q02;
                }
                break;
        }
        return i12;
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [com.google.crypto.tink.shaded.protobuf.A, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e5, code lost:
        r4 = r11 | r7;
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e9, code lost:
        r2 = r12;
        r1 = r17;
        r3 = r18;
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ff, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0121, code lost:
        r4 = r11 | r7;
        r11 = r35;
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0293, code lost:
        r2 = r6;
        r27 = r8;
        r28 = r12;
        r7 = r18;
        r24 = r19;
        r6 = r36;
        r19 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03dd  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int J(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, a1.C0258c r37) {
        /*
            r31 = this;
            r14 = r31
            r15 = r32
            r13 = r33
            r11 = r35
            r12 = r36
            r10 = r37
            l(r32)
            sun.misc.Unsafe r8 = f6768p
            r0 = r34
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r11) goto L_0x03fd
            int r3 = r0 + 1
            byte r0 = r13[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.bumptech.glide.d.R(r0, r13, r3, r10)
            int r3 = r10.f4550b
            goto L_0x002e
        L_0x0029:
            r29 = r3
            r3 = r0
            r0 = r29
        L_0x002e:
            int r6 = r3 >>> 3
            r9 = r3 & 7
            int r7 = r14.d
            r19 = r0
            int r0 = r14.f6771c
            r20 = r3
            r3 = 3
            if (r6 <= r1) goto L_0x004c
            int r2 = r2 / r3
            if (r6 < r0) goto L_0x0047
            if (r6 > r7) goto L_0x0047
            int r0 = r14.T(r6, r2)
            goto L_0x0048
        L_0x0047:
            r0 = -1
        L_0x0048:
            r2 = r0
            r1 = -1
            r7 = 0
            goto L_0x005a
        L_0x004c:
            if (r6 < r0) goto L_0x0056
            if (r6 > r7) goto L_0x0056
            r7 = 0
            int r0 = r14.T(r6, r7)
            goto L_0x0058
        L_0x0056:
            r7 = 0
            r0 = -1
        L_0x0058:
            r2 = r0
            r1 = -1
        L_0x005a:
            if (r2 != r1) goto L_0x0071
            r24 = r5
            r17 = r6
            r21 = r7
            r28 = r21
            r27 = r8
            r6 = r12
            r2 = r19
            r7 = r20
            r20 = r1
            r19 = r4
            goto L_0x03c6
        L_0x0071:
            int r0 = r2 + 1
            int[] r1 = r14.f6769a
            r0 = r1[r0]
            int r3 = W(r0)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r0 & r16
            long r11 = (long) r7
            r7 = 17
            r22 = r0
            if (r3 > r7) goto L_0x02a4
            int r7 = r2 + 2
            r1 = r1[r7]
            int r7 = r1 >>> 20
            r0 = 1
            int r7 = r0 << r7
            r24 = r11
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r11
            if (r1 == r5) goto L_0x00a6
            if (r5 == r11) goto L_0x009e
            long r11 = (long) r5
            r8.putInt(r15, r11, r4)
        L_0x009e:
            long r4 = (long) r1
            int r4 = r8.getInt(r15, r4)
            r12 = r1
            r11 = r4
            goto L_0x00a8
        L_0x00a6:
            r11 = r4
            r12 = r5
        L_0x00a8:
            r1 = 5
            switch(r3) {
                case 0: goto L_0x0279;
                case 1: goto L_0x025f;
                case 2: goto L_0x0242;
                case 3: goto L_0x0242;
                case 4: goto L_0x0228;
                case 5: goto L_0x0209;
                case 6: goto L_0x01ef;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01a2;
                case 9: goto L_0x017b;
                case 10: goto L_0x0160;
                case 11: goto L_0x0228;
                case 12: goto L_0x0144;
                case 13: goto L_0x01ef;
                case 14: goto L_0x0209;
                case 15: goto L_0x0127;
                case 16: goto L_0x0102;
                case 17: goto L_0x00b9;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r17 = r6
            r6 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            goto L_0x0293
        L_0x00b9:
            r0 = 3
            if (r9 != r0) goto L_0x00f4
            java.lang.Object r9 = r14.A(r2, r15)
            int r0 = r6 << 3
            r5 = r0 | 4
            com.google.crypto.tink.shaded.protobuf.d0 r1 = r14.p(r2)
            r4 = r19
            r0 = r9
            r17 = -1
            r3 = r2
            r2 = r33
            r19 = r12
            r18 = r20
            r12 = r3
            r3 = r4
            r4 = r35
            r20 = r17
            r17 = r6
            r6 = r37
            int r0 = com.bumptech.glide.d.Q0(r0, r1, r2, r3, r4, r5, r6)
            r14.U(r12, r15, r9)
        L_0x00e5:
            r4 = r11 | r7
            r11 = r35
        L_0x00e9:
            r2 = r12
            r1 = r17
            r3 = r18
            r5 = r19
        L_0x00f0:
            r12 = r36
            goto L_0x001a
        L_0x00f4:
            r17 = r6
            r4 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
        L_0x00ff:
            r6 = r4
            goto L_0x0293
        L_0x0102:
            r17 = r6
            r4 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            if (r9 != 0) goto L_0x00ff
            int r6 = com.bumptech.glide.d.U(r13, r4, r10)
            long r0 = r10.f4551c
            long r4 = E2.d.e(r0)
            r0 = r8
            r1 = r32
            r2 = r24
            r0.putLong(r1, r2, r4)
        L_0x0121:
            r4 = r11 | r7
            r11 = r35
            r0 = r6
            goto L_0x00e9
        L_0x0127:
            r17 = r6
            r4 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            if (r9 != 0) goto L_0x00ff
            int r0 = com.bumptech.glide.d.S(r13, r4, r10)
            int r1 = r10.f4550b
            int r1 = E2.d.d(r1)
            r2 = r24
            r8.putInt(r15, r2, r1)
            goto L_0x00e5
        L_0x0144:
            r17 = r6
            r4 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != 0) goto L_0x00ff
            int r0 = com.bumptech.glide.d.S(r13, r4, r10)
            int r1 = r10.f4550b
            r14.n(r12)
            r8.putInt(r15, r2, r1)
            goto L_0x00e5
        L_0x0160:
            r17 = r6
            r4 = r19
            r18 = r20
            r0 = 2
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != r0) goto L_0x00ff
            int r0 = com.bumptech.glide.d.p(r13, r4, r10)
            java.lang.Object r1 = r10.d
            r8.putObject(r15, r2, r1)
            goto L_0x00e5
        L_0x017b:
            r17 = r6
            r4 = r19
            r18 = r20
            r0 = 2
            r20 = -1
            r19 = r12
            r12 = r2
            if (r9 != r0) goto L_0x00ff
            java.lang.Object r6 = r14.A(r12, r15)
            com.google.crypto.tink.shaded.protobuf.d0 r1 = r14.p(r12)
            r0 = r6
            r2 = r33
            r3 = r4
            r4 = r35
            r5 = r37
            int r0 = com.bumptech.glide.d.R0(r0, r1, r2, r3, r4, r5)
            r14.U(r12, r15, r6)
            goto L_0x00e5
        L_0x01a2:
            r17 = r6
            r4 = r19
            r18 = r20
            r0 = 2
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != r0) goto L_0x00ff
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x01bd
            int r0 = com.bumptech.glide.d.M(r13, r4, r10)
            goto L_0x01c1
        L_0x01bd:
            int r0 = com.bumptech.glide.d.P(r13, r4, r10)
        L_0x01c1:
            java.lang.Object r1 = r10.d
            r8.putObject(r15, r2, r1)
            goto L_0x00e5
        L_0x01c8:
            r17 = r6
            r4 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != 0) goto L_0x00ff
            int r1 = com.bumptech.glide.d.U(r13, r4, r10)
            long r4 = r10.f4551c
            r22 = 0
            int r4 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r4 == 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            com.google.crypto.tink.shaded.protobuf.p0.n(r15, r2, r0)
            r4 = r11 | r7
            r11 = r35
            r0 = r1
            goto L_0x00e9
        L_0x01ef:
            r17 = r6
            r4 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != r1) goto L_0x00ff
            int r0 = com.bumptech.glide.d.t(r13, r4)
            r8.putInt(r15, r2, r0)
            int r0 = r4 + 4
            goto L_0x00e5
        L_0x0209:
            r17 = r6
            r4 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != r0) goto L_0x00ff
            long r5 = com.bumptech.glide.d.v(r13, r4)
            r0 = r8
            r1 = r32
            r9 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            int r0 = r9 + 8
            goto L_0x00e5
        L_0x0228:
            r17 = r6
            r6 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != 0) goto L_0x0293
            int r0 = com.bumptech.glide.d.S(r13, r6, r10)
            int r1 = r10.f4550b
            r8.putInt(r15, r2, r1)
            goto L_0x00e5
        L_0x0242:
            r17 = r6
            r6 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != 0) goto L_0x0293
            int r6 = com.bumptech.glide.d.U(r13, r6, r10)
            long r4 = r10.f4551c
            r0 = r8
            r1 = r32
            r0.putLong(r1, r2, r4)
            goto L_0x0121
        L_0x025f:
            r17 = r6
            r6 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != r1) goto L_0x0293
            float r0 = com.bumptech.glide.d.x(r13, r6)
            com.google.crypto.tink.shaded.protobuf.p0.s(r15, r2, r0)
            int r0 = r6 + 4
            goto L_0x00e5
        L_0x0279:
            r17 = r6
            r6 = r19
            r18 = r20
            r20 = -1
            r19 = r12
            r12 = r2
            r2 = r24
            if (r9 != r0) goto L_0x0293
            double r0 = com.bumptech.glide.d.r(r13, r6)
            com.google.crypto.tink.shaded.protobuf.p0.r(r15, r2, r0)
            int r0 = r6 + 8
            goto L_0x00e5
        L_0x0293:
            r2 = r6
            r27 = r8
            r28 = r12
            r7 = r18
            r24 = r19
            r21 = 0
            r6 = r36
            r19 = r11
            goto L_0x03c6
        L_0x02a4:
            r17 = r6
            r6 = r19
            r18 = r20
            r20 = -1
            r29 = r11
            r12 = r2
            r1 = r29
            r0 = 27
            if (r3 != r0) goto L_0x0309
            r0 = 2
            if (r9 != r0) goto L_0x02fc
            java.lang.Object r0 = r8.getObject(r15, r1)
            com.google.crypto.tink.shaded.protobuf.A r0 = (com.google.crypto.tink.shaded.protobuf.A) r0
            com.google.crypto.tink.shaded.protobuf.b r0 = (com.google.crypto.tink.shaded.protobuf.C0397b) r0
            boolean r3 = r0.t()
            if (r3 != 0) goto L_0x02d8
            int r3 = r0.size()
            if (r3 != 0) goto L_0x02cf
            r3 = 10
            goto L_0x02d1
        L_0x02cf:
            int r3 = r3 * 2
        L_0x02d1:
            com.google.crypto.tink.shaded.protobuf.A r0 = r0.a(r3)
            r8.putObject(r15, r1, r0)
        L_0x02d8:
            r7 = r0
            com.google.crypto.tink.shaded.protobuf.d0 r0 = r14.p(r12)
            r1 = r18
            r2 = r33
            r3 = r6
            r19 = r4
            r4 = r35
            r24 = r5
            r5 = r7
            r6 = r37
            int r0 = com.bumptech.glide.d.A(r0, r1, r2, r3, r4, r5, r6)
            r11 = r35
            r2 = r12
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r24
            goto L_0x00f0
        L_0x02fc:
            r19 = r4
            r24 = r5
            r14 = r6
            r27 = r8
            r28 = r12
            r21 = 0
            goto L_0x036e
        L_0x0309:
            r19 = r4
            r24 = r5
            r0 = 49
            if (r3 > r0) goto L_0x035b
            r0 = r22
            long r4 = (long) r0
            r0 = r31
            r25 = r1
            r1 = r32
            r2 = r33
            r11 = r3
            r3 = r6
            r22 = r4
            r4 = r35
            r5 = r18
            r7 = r6
            r6 = r9
            r9 = r7
            r21 = 0
            r7 = r12
            r27 = r8
            r14 = r9
            r8 = r22
            r10 = r11
            r28 = r12
            r11 = r25
            r13 = r37
            int r0 = r0.L(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r13)
            if (r0 == r14) goto L_0x0354
            r14 = r31
            r13 = r33
            r11 = r35
            r12 = r36
            r10 = r37
            r1 = r17
            r3 = r18
        L_0x034a:
            r4 = r19
            r5 = r24
            r8 = r27
            r2 = r28
            goto L_0x001a
        L_0x0354:
            r6 = r36
            r2 = r0
        L_0x0357:
            r7 = r18
            goto L_0x03c6
        L_0x035b:
            r25 = r1
            r11 = r3
            r14 = r6
            r27 = r8
            r28 = r12
            r0 = r22
            r21 = 0
            r1 = 50
            if (r11 != r1) goto L_0x037d
            r1 = 2
            if (r9 == r1) goto L_0x0372
        L_0x036e:
            r6 = r36
            r2 = r14
            goto L_0x0357
        L_0x0372:
            r14 = r31
            r7 = r25
            r13 = r28
            r14.H(r7, r15, r13)
            r12 = 0
            throw r12
        L_0x037d:
            r12 = 0
            r16 = r0
            r10 = r14
            r7 = r25
            r13 = r28
            r14 = r31
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r10
            r4 = r35
            r5 = r18
            r6 = r17
            r22 = r7
            r7 = r9
            r8 = r16
            r9 = r11
            r14 = r10
            r10 = r22
            r12 = r13
            r16 = r13
            r13 = r37
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x03c0
            r14 = r31
            r13 = r33
            r11 = r35
            r12 = r36
            r10 = r37
            r2 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r24
            r8 = r27
            goto L_0x001a
        L_0x03c0:
            r6 = r36
            r2 = r0
            r28 = r16
            goto L_0x0357
        L_0x03c6:
            if (r7 != r6) goto L_0x03d4
            if (r6 == 0) goto L_0x03d4
            r0 = r2
            r3 = r7
            r4 = r19
            r5 = r24
        L_0x03d0:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0405
        L_0x03d4:
            r0 = r15
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.C0418x) r0
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.g0 r3 = com.google.crypto.tink.shaded.protobuf.g0.f6805f
            if (r1 != r3) goto L_0x03e3
            com.google.crypto.tink.shaded.protobuf.g0 r1 = com.google.crypto.tink.shaded.protobuf.g0.c()
            r0.unknownFields = r1
        L_0x03e3:
            r4 = r1
            r0 = r7
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.bumptech.glide.d.Q(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r13 = r33
            r11 = r35
            r10 = r37
            r12 = r6
            r3 = r7
            r1 = r17
            goto L_0x034a
        L_0x03fd:
            r19 = r4
            r24 = r5
            r27 = r8
            r6 = r12
            goto L_0x03d0
        L_0x0405:
            if (r5 == r1) goto L_0x040d
            long r1 = (long) r5
            r5 = r27
            r5.putInt(r15, r1, r4)
        L_0x040d:
            r1 = r31
            int r2 = r1.f6774i
        L_0x0411:
            int r4 = r1.f6775j
            if (r2 >= r4) goto L_0x0420
            int[] r4 = r1.h
            r4 = r4[r2]
            r5 = 0
            r1.m(r4, r15, r5)
            int r2 = r2 + 1
            goto L_0x0411
        L_0x0420:
            if (r6 != 0) goto L_0x042c
            r2 = r35
            if (r0 != r2) goto L_0x0427
            goto L_0x0432
        L_0x0427:
            com.google.crypto.tink.shaded.protobuf.D r0 = com.google.crypto.tink.shaded.protobuf.D.f()
            throw r0
        L_0x042c:
            r2 = r35
            if (r0 > r2) goto L_0x0433
            if (r3 != r6) goto L_0x0433
        L_0x0432:
            return r0
        L_0x0433:
            com.google.crypto.tink.shaded.protobuf.D r0 = com.google.crypto.tink.shaded.protobuf.D.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.J(java.lang.Object, byte[], int, int, int, a1.c):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r0v25, types: [com.google.crypto.tink.shaded.protobuf.A, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ba, code lost:
        r5 = r6 | r17;
        r6 = r7;
        r2 = r8;
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r5 = r6 | r17;
        r11 = r34;
        r6 = r7;
        r2 = r8;
        r1 = r19;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0171, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b7, code lost:
        r26 = r6;
        r6 = r7;
        r27 = r8;
        r28 = r10;
        r2 = r11;
        r18 = 0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(java.lang.Object r31, byte[] r32, int r33, int r34, a1.C0258c r35) {
        /*
            r30 = this;
            r14 = r30
            r15 = r31
            r13 = r32
            r11 = r34
            r12 = r35
            l(r31)
            sun.misc.Unsafe r10 = f6768p
            r9 = 0
            r0 = r33
            r2 = r9
            r5 = r2
            r1 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0018:
            if (r0 >= r11) goto L_0x02fe
            int r3 = r0 + 1
            byte r0 = r13[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.bumptech.glide.d.R(r0, r13, r3, r12)
            int r3 = r12.f4550b
            r4 = r0
            r16 = r3
            goto L_0x002d
        L_0x002a:
            r16 = r0
            r4 = r3
        L_0x002d:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            int r8 = r14.d
            int r7 = r14.f6771c
            if (r3 <= r1) goto L_0x0046
            int r2 = r2 / 3
            if (r3 < r7) goto L_0x0042
            if (r3 > r8) goto L_0x0042
            int r1 = r14.T(r3, r2)
            goto L_0x0043
        L_0x0042:
            r1 = -1
        L_0x0043:
            r8 = r1
            r7 = -1
            goto L_0x004f
        L_0x0046:
            if (r3 < r7) goto L_0x0042
            if (r3 > r8) goto L_0x0042
            int r1 = r14.T(r3, r9)
            goto L_0x0043
        L_0x004f:
            if (r8 != r7) goto L_0x0060
            r19 = r3
            r2 = r4
            r26 = r5
            r17 = r7
            r18 = r9
            r27 = r18
            r28 = r10
            goto L_0x02d4
        L_0x0060:
            int r1 = r8 + 1
            int[] r2 = r14.f6769a
            r1 = r2[r1]
            int r11 = W(r1)
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r1 & r17
            r19 = r3
            r33 = r4
            long r3 = (long) r7
            r7 = 17
            if (r11 > r7) goto L_0x01c5
            int r7 = r8 + 2
            r2 = r2[r7]
            int r7 = r2 >>> 20
            r9 = 1
            int r7 = r9 << r7
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r9
            r17 = r7
            if (r2 == r6) goto L_0x0099
            if (r6 == r9) goto L_0x008f
            long r6 = (long) r6
            r10.putInt(r15, r6, r5)
        L_0x008f:
            if (r2 == r9) goto L_0x0096
            long r5 = (long) r2
            int r5 = r10.getInt(r15, r5)
        L_0x0096:
            r7 = r2
        L_0x0097:
            r6 = r5
            goto L_0x009b
        L_0x0099:
            r7 = r6
            goto L_0x0097
        L_0x009b:
            r2 = 5
            switch(r11) {
                case 0: goto L_0x01aa;
                case 1: goto L_0x019b;
                case 2: goto L_0x0184;
                case 3: goto L_0x0184;
                case 4: goto L_0x0175;
                case 5: goto L_0x015e;
                case 6: goto L_0x014f;
                case 7: goto L_0x0138;
                case 8: goto L_0x011f;
                case 9: goto L_0x0102;
                case 10: goto L_0x00f3;
                case 11: goto L_0x0175;
                case 12: goto L_0x00e5;
                case 13: goto L_0x014f;
                case 14: goto L_0x015e;
                case 15: goto L_0x00c6;
                case 16: goto L_0x00a3;
                default: goto L_0x009f;
            }
        L_0x009f:
            r11 = r33
            goto L_0x01b7
        L_0x00a3:
            if (r0 != 0) goto L_0x009f
            r5 = r33
            int r11 = com.bumptech.glide.d.U(r13, r5, r12)
            long r0 = r12.f4551c
            long r21 = E2.d.e(r0)
            r0 = r10
            r1 = r31
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
        L_0x00ba:
            r5 = r6 | r17
            r6 = r7
            r2 = r8
            r0 = r11
        L_0x00bf:
            r1 = r19
            r9 = 0
            r11 = r34
            goto L_0x0018
        L_0x00c6:
            r5 = r33
            if (r0 != 0) goto L_0x00e2
            int r0 = com.bumptech.glide.d.S(r13, r5, r12)
            int r1 = r12.f4550b
            int r1 = E2.d.d(r1)
            r10.putInt(r15, r3, r1)
        L_0x00d7:
            r5 = r6 | r17
            r11 = r34
            r6 = r7
            r2 = r8
            r1 = r19
            r9 = 0
            goto L_0x0018
        L_0x00e2:
            r11 = r5
            goto L_0x01b7
        L_0x00e5:
            r5 = r33
            if (r0 != 0) goto L_0x00e2
            int r0 = com.bumptech.glide.d.S(r13, r5, r12)
            int r1 = r12.f4550b
            r10.putInt(r15, r3, r1)
            goto L_0x00d7
        L_0x00f3:
            r5 = r33
            r1 = 2
            if (r0 != r1) goto L_0x00e2
            int r0 = com.bumptech.glide.d.p(r13, r5, r12)
            java.lang.Object r1 = r12.d
            r10.putObject(r15, r3, r1)
            goto L_0x00d7
        L_0x0102:
            r5 = r33
            r1 = 2
            if (r0 != r1) goto L_0x00e2
            java.lang.Object r11 = r14.A(r8, r15)
            com.google.crypto.tink.shaded.protobuf.d0 r1 = r14.p(r8)
            r0 = r11
            r2 = r32
            r3 = r5
            r4 = r34
            r5 = r35
            int r0 = com.bumptech.glide.d.R0(r0, r1, r2, r3, r4, r5)
            r14.U(r8, r15, r11)
            goto L_0x00d7
        L_0x011f:
            r5 = r33
            r2 = 2
            if (r0 != r2) goto L_0x00e2
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x012e
            int r0 = com.bumptech.glide.d.M(r13, r5, r12)
            goto L_0x0132
        L_0x012e:
            int r0 = com.bumptech.glide.d.P(r13, r5, r12)
        L_0x0132:
            java.lang.Object r1 = r12.d
            r10.putObject(r15, r3, r1)
            goto L_0x00d7
        L_0x0138:
            r5 = r33
            if (r0 != 0) goto L_0x00e2
            int r0 = com.bumptech.glide.d.U(r13, r5, r12)
            long r1 = r12.f4551c
            r23 = 0
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x014a
            r1 = 1
            goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            com.google.crypto.tink.shaded.protobuf.p0.n(r15, r3, r1)
            goto L_0x00d7
        L_0x014f:
            r5 = r33
            if (r0 != r2) goto L_0x00e2
            int r0 = com.bumptech.glide.d.t(r13, r5)
            r10.putInt(r15, r3, r0)
            int r0 = r5 + 4
            goto L_0x00d7
        L_0x015e:
            r5 = r33
            r1 = 1
            if (r0 != r1) goto L_0x00e2
            long r21 = com.bumptech.glide.d.v(r13, r5)
            r0 = r10
            r1 = r31
            r2 = r3
            r11 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
        L_0x0171:
            int r0 = r11 + 8
            goto L_0x00d7
        L_0x0175:
            r11 = r33
            if (r0 != 0) goto L_0x01b7
            int r0 = com.bumptech.glide.d.S(r13, r11, r12)
            int r1 = r12.f4550b
            r10.putInt(r15, r3, r1)
            goto L_0x00d7
        L_0x0184:
            r11 = r33
            if (r0 != 0) goto L_0x01b7
            int r11 = com.bumptech.glide.d.U(r13, r11, r12)
            long r1 = r12.f4551c
            r0 = r10
            r21 = r1
            r1 = r31
            r2 = r3
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x00ba
        L_0x019b:
            r11 = r33
            if (r0 != r2) goto L_0x01b7
            float r0 = com.bumptech.glide.d.x(r13, r11)
            com.google.crypto.tink.shaded.protobuf.p0.s(r15, r3, r0)
            int r0 = r11 + 4
            goto L_0x00d7
        L_0x01aa:
            r11 = r33
            r1 = 1
            if (r0 != r1) goto L_0x01b7
            double r0 = com.bumptech.glide.d.r(r13, r11)
            com.google.crypto.tink.shaded.protobuf.p0.r(r15, r3, r0)
            goto L_0x0171
        L_0x01b7:
            r26 = r6
            r6 = r7
            r27 = r8
            r28 = r10
            r2 = r11
            r17 = -1
            r18 = 0
            goto L_0x02d4
        L_0x01c5:
            r7 = r33
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 27
            if (r11 != r2) goto L_0x021b
            r2 = 2
            if (r0 != r2) goto L_0x020b
            java.lang.Object r0 = r10.getObject(r15, r3)
            com.google.crypto.tink.shaded.protobuf.A r0 = (com.google.crypto.tink.shaded.protobuf.A) r0
            com.google.crypto.tink.shaded.protobuf.b r0 = (com.google.crypto.tink.shaded.protobuf.C0397b) r0
            boolean r1 = r0.t()
            if (r1 != 0) goto L_0x01f1
            int r1 = r0.size()
            if (r1 != 0) goto L_0x01e8
            r1 = 10
            goto L_0x01ea
        L_0x01e8:
            int r1 = r1 * 2
        L_0x01ea:
            com.google.crypto.tink.shaded.protobuf.A r0 = r0.a(r1)
            r10.putObject(r15, r3, r0)
        L_0x01f1:
            r11 = r0
            com.google.crypto.tink.shaded.protobuf.d0 r0 = r14.p(r8)
            r1 = r16
            r2 = r32
            r3 = r7
            r4 = r34
            r7 = r5
            r5 = r11
            r11 = r6
            r6 = r35
            int r0 = com.bumptech.glide.d.A(r0, r1, r2, r3, r4, r5, r6)
            r5 = r7
            r2 = r8
            r6 = r11
            goto L_0x00bf
        L_0x020b:
            r11 = r6
            r26 = r5
            r14 = r7
            r27 = r8
            r28 = r10
            r25 = r11
            r17 = -1
            r18 = 0
            goto L_0x0288
        L_0x021b:
            r29 = r6
            r6 = r5
            r5 = r29
            r2 = 49
            if (r11 > r2) goto L_0x026e
            long r1 = (long) r1
            r33 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r23 = r3
            r3 = r7
            r4 = r34
            r25 = r5
            r5 = r16
            r26 = r6
            r6 = r33
            r14 = r7
            r17 = -1
            r7 = r8
            r27 = r8
            r18 = 0
            r8 = r21
            r28 = r10
            r10 = r11
            r11 = r23
            r13 = r35
            int r0 = r0.L(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r13)
            if (r0 == r14) goto L_0x0269
            r14 = r30
            r13 = r32
            r11 = r34
            r12 = r35
            r9 = r18
            r1 = r19
            r6 = r25
        L_0x0261:
            r5 = r26
            r2 = r27
        L_0x0265:
            r10 = r28
            goto L_0x0018
        L_0x0269:
            r2 = r0
        L_0x026a:
            r6 = r25
            goto L_0x02d4
        L_0x026e:
            r33 = r0
            r23 = r3
            r25 = r5
            r26 = r6
            r14 = r7
            r27 = r8
            r28 = r10
            r17 = -1
            r18 = 0
            r0 = 50
            if (r11 != r0) goto L_0x0295
            r7 = r33
            r0 = 2
            if (r7 == r0) goto L_0x028a
        L_0x0288:
            r2 = r14
            goto L_0x026a
        L_0x028a:
            r14 = r30
            r9 = r23
            r13 = r27
            r14.H(r9, r15, r13)
            r0 = 0
            throw r0
        L_0x0295:
            r7 = r33
            r12 = r14
            r9 = r23
            r13 = r27
            r14 = r30
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r12
            r4 = r34
            r5 = r16
            r6 = r19
            r20 = r9
            r9 = r11
            r10 = r20
            r14 = r12
            r12 = r13
            r20 = r13
            r13 = r35
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02d0
            r14 = r30
            r13 = r32
            r11 = r34
            r12 = r35
            r9 = r18
            r1 = r19
            r2 = r20
            r6 = r25
            r5 = r26
            goto L_0x0265
        L_0x02d0:
            r2 = r0
            r27 = r20
            goto L_0x026a
        L_0x02d4:
            r0 = r15
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.C0418x) r0
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.g0 r3 = com.google.crypto.tink.shaded.protobuf.g0.f6805f
            if (r1 != r3) goto L_0x02e3
            com.google.crypto.tink.shaded.protobuf.g0 r1 = com.google.crypto.tink.shaded.protobuf.g0.c()
            r0.unknownFields = r1
        L_0x02e3:
            r4 = r1
            r0 = r16
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.bumptech.glide.d.Q(r0, r1, r2, r3, r4, r5)
            r14 = r30
            r13 = r32
            r11 = r34
            r12 = r35
            r9 = r18
            r1 = r19
            goto L_0x0261
        L_0x02fe:
            r26 = r5
            r7 = r6
            r28 = r10
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0310
            long r1 = (long) r7
            r5 = r26
            r3 = r28
            r3.putInt(r15, r1, r5)
        L_0x0310:
            r1 = r34
            if (r0 != r1) goto L_0x0315
            return
        L_0x0315:
            com.google.crypto.tink.shaded.protobuf.D r0 = com.google.crypto.tink.shaded.protobuf.D.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.K(java.lang.Object, byte[], int, int, a1.c):void");
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [com.google.crypto.tink.shaded.protobuf.A, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int L(java.lang.Object r14, byte[] r15, int r16, int r17, int r18, int r19, int r20, long r21, int r23, long r24, a1.C0258c r26) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r19
            r7 = r20
            r5 = r24
            r8 = r26
            sun.misc.Unsafe r9 = f6768p
            java.lang.Object r10 = r9.getObject(r14, r5)
            com.google.crypto.tink.shaded.protobuf.A r10 = (com.google.crypto.tink.shaded.protobuf.A) r10
            com.google.crypto.tink.shaded.protobuf.b r10 = (com.google.crypto.tink.shaded.protobuf.C0397b) r10
            boolean r11 = r10.t()
            r12 = 2
            if (r11 != 0) goto L_0x002f
            int r11 = r10.size()
            if (r11 != 0) goto L_0x0027
            r11 = 10
            goto L_0x0028
        L_0x0027:
            int r11 = r11 * r12
        L_0x0028:
            com.google.crypto.tink.shaded.protobuf.A r10 = r10.a(r11)
            r9.putObject(r14, r5, r10)
        L_0x002f:
            r1 = 1
            r5 = 5
            switch(r23) {
                case 18: goto L_0x0193;
                case 19: goto L_0x017b;
                case 20: goto L_0x0163;
                case 21: goto L_0x0163;
                case 22: goto L_0x014a;
                case 23: goto L_0x0130;
                case 24: goto L_0x0116;
                case 25: goto L_0x00fc;
                case 26: goto L_0x00cf;
                case 27: goto L_0x00b5;
                case 28: goto L_0x00a3;
                case 29: goto L_0x014a;
                case 30: goto L_0x0085;
                case 31: goto L_0x0116;
                case 32: goto L_0x0130;
                case 33: goto L_0x006b;
                case 34: goto L_0x0051;
                case 35: goto L_0x0193;
                case 36: goto L_0x017b;
                case 37: goto L_0x0163;
                case 38: goto L_0x0163;
                case 39: goto L_0x014a;
                case 40: goto L_0x0130;
                case 41: goto L_0x0116;
                case 42: goto L_0x00fc;
                case 43: goto L_0x014a;
                case 44: goto L_0x0085;
                case 45: goto L_0x0116;
                case 46: goto L_0x0130;
                case 47: goto L_0x006b;
                case 48: goto L_0x0051;
                case 49: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x01ab
        L_0x0036:
            r1 = 3
            if (r4 != r1) goto L_0x01ab
            com.google.crypto.tink.shaded.protobuf.d0 r1 = r13.p(r7)
            r19 = r1
            r20 = r18
            r21 = r15
            r22 = r16
            r23 = r17
            r24 = r10
            r25 = r26
            int r1 = com.bumptech.glide.d.z(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01ac
        L_0x0051:
            if (r4 != r12) goto L_0x0059
            int r1 = com.bumptech.glide.d.H(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x0059:
            if (r4 != 0) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.L(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x006b:
            if (r4 != r12) goto L_0x0073
            int r1 = com.bumptech.glide.d.G(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x0073:
            if (r4 != 0) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.K(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x0085:
            if (r4 != r12) goto L_0x008c
            int r1 = com.bumptech.glide.d.I(r15, r3, r10, r8)
            goto L_0x009c
        L_0x008c:
            if (r4 != 0) goto L_0x01ab
            r1 = r18
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r10
            r6 = r26
            int r1 = com.bumptech.glide.d.T(r1, r2, r3, r4, r5, r6)
        L_0x009c:
            r13.n(r7)
            java.lang.Class r2 = com.google.crypto.tink.shaded.protobuf.e0.f6799a
            goto L_0x01ac
        L_0x00a3:
            if (r4 != r12) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.q(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x00b5:
            if (r4 != r12) goto L_0x01ab
            com.google.crypto.tink.shaded.protobuf.d0 r1 = r13.p(r7)
            r19 = r1
            r20 = r18
            r21 = r15
            r22 = r16
            r23 = r17
            r24 = r10
            r25 = r26
            int r1 = com.bumptech.glide.d.A(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01ac
        L_0x00cf:
            if (r4 != r12) goto L_0x01ab
            r4 = 536870912(0x20000000, double:2.652494739E-315)
            long r4 = r21 & r4
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00ec
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.N(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x00ec:
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.O(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x00fc:
            if (r4 != r12) goto L_0x0104
            int r1 = com.bumptech.glide.d.B(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x0104:
            if (r4 != 0) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.o(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x0116:
            if (r4 != r12) goto L_0x011e
            int r1 = com.bumptech.glide.d.D(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x011e:
            if (r4 != r5) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.u(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x0130:
            if (r4 != r12) goto L_0x0138
            int r1 = com.bumptech.glide.d.E(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x0138:
            if (r4 != r1) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.w(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x014a:
            if (r4 != r12) goto L_0x0152
            int r1 = com.bumptech.glide.d.I(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x0152:
            if (r4 != 0) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.T(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x0163:
            if (r4 != r12) goto L_0x016a
            int r1 = com.bumptech.glide.d.J(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x016a:
            if (r4 != 0) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.V(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x017b:
            if (r4 != r12) goto L_0x0182
            int r1 = com.bumptech.glide.d.F(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x0182:
            if (r4 != r5) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.y(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x0193:
            if (r4 != r12) goto L_0x019a
            int r1 = com.bumptech.glide.d.C(r15, r3, r10, r8)
            goto L_0x01ac
        L_0x019a:
            if (r4 != r1) goto L_0x01ab
            r19 = r15
            r20 = r16
            r21 = r17
            r22 = r10
            r23 = r26
            int r1 = com.bumptech.glide.d.s(r18, r19, r20, r21, r22, r23)
            goto L_0x01ac
        L_0x01ab:
            r1 = r3
        L_0x01ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.L(java.lang.Object, byte[], int, int, int, int, int, long, int, long, a1.c):int");
    }

    public final void M(Object obj, long j6, C0407l lVar, d0 d0Var, C0411p pVar) {
        int B6;
        List c3 = this.f6777l.c(obj, j6);
        int i2 = lVar.f6829a;
        if ((i2 & 7) == 3) {
            do {
                Object i5 = d0Var.i();
                lVar.d(i5, d0Var, pVar);
                d0Var.d(i5);
                c3.add(i5);
                E2.d dVar = (E2.d) lVar.d;
                if (!dVar.g() && lVar.f6831c == 0) {
                    B6 = dVar.B();
                } else {
                    return;
                }
            } while (B6 == i2);
            lVar.f6831c = B6;
            return;
        }
        throw D.c();
    }

    public final void N(Object obj, int i2, C0407l lVar, d0 d0Var, C0411p pVar) {
        int B6;
        List c3 = this.f6777l.c(obj, (long) (i2 & 1048575));
        int i5 = lVar.f6829a;
        if ((i5 & 7) == 2) {
            do {
                Object i6 = d0Var.i();
                lVar.e(i6, d0Var, pVar);
                d0Var.d(i6);
                c3.add(i6);
                E2.d dVar = (E2.d) lVar.d;
                if (!dVar.g() && lVar.f6831c == 0) {
                    B6 = dVar.B();
                } else {
                    return;
                }
            } while (B6 == i5);
            lVar.f6831c = B6;
            return;
        }
        throw D.c();
    }

    public final void O(Object obj, int i2, C0407l lVar) {
        boolean z3;
        if ((536870912 & i2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            lVar.x(2);
            p0.v(obj, (long) (i2 & 1048575), ((E2.d) lVar.d).A());
        } else if (this.f6773f) {
            lVar.x(2);
            p0.v(obj, (long) (i2 & 1048575), ((E2.d) lVar.d).z());
        } else {
            p0.v(obj, (long) (i2 & 1048575), lVar.g());
        }
    }

    public final void P(Object obj, int i2, C0407l lVar) {
        boolean z3;
        if ((536870912 & i2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        J j6 = this.f6777l;
        if (z3) {
            lVar.t(j6.c(obj, (long) (i2 & 1048575)), true);
        } else {
            lVar.t(j6.c(obj, (long) (i2 & 1048575)), false);
        }
    }

    public final void R(int i2, Object obj) {
        int i5 = this.f6769a[i2 + 2];
        long j6 = (long) (1048575 & i5);
        if (j6 != 1048575) {
            p0.t(j6, obj, (1 << (i5 >>> 20)) | p0.f6845c.g(obj, j6));
        }
    }

    public final void S(int i2, Object obj, int i5) {
        p0.t((long) (this.f6769a[i5 + 2] & 1048575), obj, i2);
    }

    public final int T(int i2, int i5) {
        int[] iArr = this.f6769a;
        int length = (iArr.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i2 == i8) {
                return i7;
            }
            if (i2 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public final void U(int i2, Object obj, Object obj2) {
        f6768p.putObject(obj, (long) (X(i2) & 1048575), obj2);
        R(i2, obj);
    }

    public final void V(Object obj, int i2, int i5, Object obj2) {
        f6768p.putObject(obj, (long) (X(i5) & 1048575), obj2);
        S(i2, obj, i5);
    }

    public final int X(int i2) {
        return this.f6769a[i2 + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0433, code lost:
        r8 = r8 + 3;
        r6 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0251, code lost:
        r13 = r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(java.lang.Object r18, com.google.crypto.tink.shaded.protobuf.M r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int[] r3 = r0.f6769a
            int r4 = r3.length
            sun.misc.Unsafe r5 = f6768p
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r6
            r8 = 0
            r10 = 0
        L_0x0011:
            if (r8 >= r4) goto L_0x043a
            int r11 = r0.X(r8)
            r12 = r3[r8]
            int r13 = W(r11)
            r14 = 17
            r15 = 1
            if (r13 > r14) goto L_0x0035
            int r14 = r8 + 2
            r14 = r3[r14]
            r7 = r14 & r6
            if (r7 == r9) goto L_0x0030
            long r9 = (long) r7
            int r10 = r5.getInt(r1, r9)
            r9 = r7
        L_0x0030:
            int r7 = r14 >>> 20
            int r7 = r15 << r7
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            r11 = r11 & r6
            r16 = r7
            long r6 = (long) r11
            switch(r13) {
                case 0: goto L_0x0425;
                case 1: goto L_0x0416;
                case 2: goto L_0x0409;
                case 3: goto L_0x03fc;
                case 4: goto L_0x03ef;
                case 5: goto L_0x03e2;
                case 6: goto L_0x03d5;
                case 7: goto L_0x03c6;
                case 8: goto L_0x03b8;
                case 9: goto L_0x03a6;
                case 10: goto L_0x0396;
                case 11: goto L_0x0388;
                case 12: goto L_0x037a;
                case 13: goto L_0x036c;
                case 14: goto L_0x035e;
                case 15: goto L_0x0350;
                case 16: goto L_0x0342;
                case 17: goto L_0x0330;
                case 18: goto L_0x0322;
                case 19: goto L_0x0314;
                case 20: goto L_0x0306;
                case 21: goto L_0x02f8;
                case 22: goto L_0x02ea;
                case 23: goto L_0x02dc;
                case 24: goto L_0x02ce;
                case 25: goto L_0x02c0;
                case 26: goto L_0x02b3;
                case 27: goto L_0x02a2;
                case 28: goto L_0x0295;
                case 29: goto L_0x0288;
                case 30: goto L_0x027b;
                case 31: goto L_0x026e;
                case 32: goto L_0x0261;
                case 33: goto L_0x0254;
                case 34: goto L_0x0245;
                case 35: goto L_0x0238;
                case 36: goto L_0x022b;
                case 37: goto L_0x021e;
                case 38: goto L_0x0211;
                case 39: goto L_0x0204;
                case 40: goto L_0x01f7;
                case 41: goto L_0x01ea;
                case 42: goto L_0x01dd;
                case 43: goto L_0x01d0;
                case 44: goto L_0x01c3;
                case 45: goto L_0x01b6;
                case 46: goto L_0x01a9;
                case 47: goto L_0x019c;
                case 48: goto L_0x018f;
                case 49: goto L_0x017e;
                case 50: goto L_0x0168;
                case 51: goto L_0x0151;
                case 52: goto L_0x013a;
                case 53: goto L_0x012b;
                case 54: goto L_0x011c;
                case 55: goto L_0x010d;
                case 56: goto L_0x00fe;
                case 57: goto L_0x00ef;
                case 58: goto L_0x00d8;
                case 59: goto L_0x00c9;
                case 60: goto L_0x00b6;
                case 61: goto L_0x00a6;
                case 62: goto L_0x0098;
                case 63: goto L_0x008a;
                case 64: goto L_0x007c;
                case 65: goto L_0x006e;
                case 66: goto L_0x0060;
                case 67: goto L_0x0052;
                case 68: goto L_0x0040;
                default: goto L_0x003d;
            }
        L_0x003d:
            r13 = 0
            goto L_0x0433
        L_0x0040:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r6 = r5.getObject(r1, r6)
            com.google.crypto.tink.shaded.protobuf.d0 r7 = r0.p(r8)
            r2.h(r12, r6, r7)
            goto L_0x003d
        L_0x0052:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            long r6 = G(r1, r6)
            r2.o(r12, r6)
            goto L_0x003d
        L_0x0060:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            int r6 = F(r1, r6)
            r2.n(r12, r6)
            goto L_0x003d
        L_0x006e:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            long r6 = G(r1, r6)
            r2.m(r12, r6)
            goto L_0x003d
        L_0x007c:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            int r6 = F(r1, r6)
            r2.l(r12, r6)
            goto L_0x003d
        L_0x008a:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            int r6 = F(r1, r6)
            r2.d(r12, r6)
            goto L_0x003d
        L_0x0098:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            int r6 = F(r1, r6)
            r2.p(r12, r6)
            goto L_0x003d
        L_0x00a6:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r6 = r5.getObject(r1, r6)
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.C0404i) r6
            r2.b(r12, r6)
            goto L_0x003d
        L_0x00b6:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r6 = r5.getObject(r1, r6)
            com.google.crypto.tink.shaded.protobuf.d0 r7 = r0.p(r8)
            r2.k(r12, r6, r7)
            goto L_0x003d
        L_0x00c9:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            java.lang.Object r6 = r5.getObject(r1, r6)
            Z(r12, r6, r2)
            goto L_0x003d
        L_0x00d8:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r11 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r6 = r11.i(r1, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r2.a(r12, r6)
            goto L_0x003d
        L_0x00ef:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            int r6 = F(r1, r6)
            r2.e(r12, r6)
            goto L_0x003d
        L_0x00fe:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            long r6 = G(r1, r6)
            r2.f(r12, r6)
            goto L_0x003d
        L_0x010d:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            int r6 = F(r1, r6)
            r2.i(r12, r6)
            goto L_0x003d
        L_0x011c:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            long r6 = G(r1, r6)
            r2.q(r12, r6)
            goto L_0x003d
        L_0x012b:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            long r6 = G(r1, r6)
            r2.j(r12, r6)
            goto L_0x003d
        L_0x013a:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r11 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r6 = r11.i(r1, r6)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r2.g(r12, r6)
            goto L_0x003d
        L_0x0151:
            boolean r11 = r0.u(r12, r1, r8)
            if (r11 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r11 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r6 = r11.i(r1, r6)
            java.lang.Double r6 = (java.lang.Double) r6
            double r6 = r6.doubleValue()
            r2.c(r12, r6)
            goto L_0x003d
        L_0x0168:
            java.lang.Object r6 = r5.getObject(r1, r6)
            if (r6 != 0) goto L_0x0170
            goto L_0x003d
        L_0x0170:
            java.lang.Object r1 = r0.o(r8)
            com.google.crypto.tink.shaded.protobuf.O r2 = r0.f6779n
            r2.getClass()
            h0.C0552a.y(r1)
            r1 = 0
            throw r1
        L_0x017e:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0 r7 = r0.p(r8)
            com.google.crypto.tink.shaded.protobuf.e0.K(r11, r6, r2, r7)
            goto L_0x003d
        L_0x018f:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.R(r11, r6, r2, r15)
            goto L_0x003d
        L_0x019c:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.Q(r11, r6, r2, r15)
            goto L_0x003d
        L_0x01a9:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.P(r11, r6, r2, r15)
            goto L_0x003d
        L_0x01b6:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.O(r11, r6, r2, r15)
            goto L_0x003d
        L_0x01c3:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.G(r11, r6, r2, r15)
            goto L_0x003d
        L_0x01d0:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.T(r11, r6, r2, r15)
            goto L_0x003d
        L_0x01dd:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.D(r11, r6, r2, r15)
            goto L_0x003d
        L_0x01ea:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.H(r11, r6, r2, r15)
            goto L_0x003d
        L_0x01f7:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.I(r11, r6, r2, r15)
            goto L_0x003d
        L_0x0204:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.L(r11, r6, r2, r15)
            goto L_0x003d
        L_0x0211:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.U(r11, r6, r2, r15)
            goto L_0x003d
        L_0x021e:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.M(r11, r6, r2, r15)
            goto L_0x003d
        L_0x022b:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.J(r11, r6, r2, r15)
            goto L_0x003d
        L_0x0238:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.F(r11, r6, r2, r15)
            goto L_0x003d
        L_0x0245:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            com.google.crypto.tink.shaded.protobuf.e0.R(r11, r6, r2, r12)
        L_0x0251:
            r13 = r12
            goto L_0x0433
        L_0x0254:
            r12 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.Q(r11, r6, r2, r12)
            goto L_0x0251
        L_0x0261:
            r12 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.P(r11, r6, r2, r12)
            goto L_0x0251
        L_0x026e:
            r12 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.O(r11, r6, r2, r12)
            goto L_0x0251
        L_0x027b:
            r12 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.G(r11, r6, r2, r12)
            goto L_0x0251
        L_0x0288:
            r12 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.T(r11, r6, r2, r12)
            goto L_0x0251
        L_0x0295:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.E(r11, r6, r2)
            goto L_0x003d
        L_0x02a2:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0 r7 = r0.p(r8)
            com.google.crypto.tink.shaded.protobuf.e0.N(r11, r6, r2, r7)
            goto L_0x003d
        L_0x02b3:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.S(r11, r6, r2)
            goto L_0x003d
        L_0x02c0:
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r13 = 0
            com.google.crypto.tink.shaded.protobuf.e0.D(r11, r6, r2, r13)
            goto L_0x0433
        L_0x02ce:
            r13 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.H(r11, r6, r2, r13)
            goto L_0x0433
        L_0x02dc:
            r13 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.I(r11, r6, r2, r13)
            goto L_0x0433
        L_0x02ea:
            r13 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.L(r11, r6, r2, r13)
            goto L_0x0433
        L_0x02f8:
            r13 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.U(r11, r6, r2, r13)
            goto L_0x0433
        L_0x0306:
            r13 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.M(r11, r6, r2, r13)
            goto L_0x0433
        L_0x0314:
            r13 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.J(r11, r6, r2, r13)
            goto L_0x0433
        L_0x0322:
            r13 = 0
            r11 = r3[r8]
            java.lang.Object r6 = r5.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.e0.F(r11, r6, r2, r13)
            goto L_0x0433
        L_0x0330:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            java.lang.Object r6 = r5.getObject(r1, r6)
            com.google.crypto.tink.shaded.protobuf.d0 r7 = r0.p(r8)
            r2.h(r12, r6, r7)
            goto L_0x0433
        L_0x0342:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            long r6 = r5.getLong(r1, r6)
            r2.o(r12, r6)
            goto L_0x0433
        L_0x0350:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            int r6 = r5.getInt(r1, r6)
            r2.n(r12, r6)
            goto L_0x0433
        L_0x035e:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            long r6 = r5.getLong(r1, r6)
            r2.m(r12, r6)
            goto L_0x0433
        L_0x036c:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            int r6 = r5.getInt(r1, r6)
            r2.l(r12, r6)
            goto L_0x0433
        L_0x037a:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            int r6 = r5.getInt(r1, r6)
            r2.d(r12, r6)
            goto L_0x0433
        L_0x0388:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            int r6 = r5.getInt(r1, r6)
            r2.p(r12, r6)
            goto L_0x0433
        L_0x0396:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            java.lang.Object r6 = r5.getObject(r1, r6)
            com.google.crypto.tink.shaded.protobuf.i r6 = (com.google.crypto.tink.shaded.protobuf.C0404i) r6
            r2.b(r12, r6)
            goto L_0x0433
        L_0x03a6:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            java.lang.Object r6 = r5.getObject(r1, r6)
            com.google.crypto.tink.shaded.protobuf.d0 r7 = r0.p(r8)
            r2.k(r12, r6, r7)
            goto L_0x0433
        L_0x03b8:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            java.lang.Object r6 = r5.getObject(r1, r6)
            Z(r12, r6, r2)
            goto L_0x0433
        L_0x03c6:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            com.google.crypto.tink.shaded.protobuf.o0 r11 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            boolean r6 = r11.c(r1, r6)
            r2.a(r12, r6)
            goto L_0x0433
        L_0x03d5:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            int r6 = r5.getInt(r1, r6)
            r2.e(r12, r6)
            goto L_0x0433
        L_0x03e2:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            long r6 = r5.getLong(r1, r6)
            r2.f(r12, r6)
            goto L_0x0433
        L_0x03ef:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            int r6 = r5.getInt(r1, r6)
            r2.i(r12, r6)
            goto L_0x0433
        L_0x03fc:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            long r6 = r5.getLong(r1, r6)
            r2.q(r12, r6)
            goto L_0x0433
        L_0x0409:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            long r6 = r5.getLong(r1, r6)
            r2.j(r12, r6)
            goto L_0x0433
        L_0x0416:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            com.google.crypto.tink.shaded.protobuf.o0 r11 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            float r6 = r11.f(r1, r6)
            r2.g(r12, r6)
            goto L_0x0433
        L_0x0425:
            r13 = 0
            r11 = r10 & r16
            if (r11 == 0) goto L_0x0433
            com.google.crypto.tink.shaded.protobuf.o0 r11 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            double r6 = r11.e(r1, r6)
            r2.c(r12, r6)
        L_0x0433:
            int r8 = r8 + 3
            r6 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0011
        L_0x043a:
            com.google.crypto.tink.shaded.protobuf.h0 r3 = r0.f6778m
            r3.getClass()
            com.google.crypto.tink.shaded.protobuf.x r1 = (com.google.crypto.tink.shaded.protobuf.C0418x) r1
            com.google.crypto.tink.shaded.protobuf.g0 r1 = r1.unknownFields
            r1.e(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.Y(java.lang.Object, com.google.crypto.tink.shaded.protobuf.M):void");
    }

    public final int a(C0418x xVar) {
        if (this.g) {
            return r(xVar);
        }
        return q(xVar);
    }

    public final void b(Object obj, byte[] bArr, int i2, int i5, C0258c cVar) {
        if (this.g) {
            K(obj, bArr, i2, i5, cVar);
        } else {
            J(obj, bArr, i2, i5, 0, cVar);
        }
    }

    public final void c(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f6769a;
            if (i2 < iArr.length) {
                int X3 = X(i2);
                long j6 = (long) (1048575 & X3);
                int i5 = iArr[i2];
                switch (W(X3)) {
                    case 0:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.r(obj, j6, p0.f6845c.e(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 1:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.s(obj, j6, p0.f6845c.f(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 2:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.u(obj, j6, p0.f6845c.h(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 3:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.u(obj, j6, p0.f6845c.h(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 4:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.t(j6, obj, p0.f6845c.g(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 5:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.u(obj, j6, p0.f6845c.h(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case zzaky.zzf.zzf:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.t(j6, obj, p0.f6845c.g(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case zzaky.zzf.zzg:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.n(obj, j6, p0.f6845c.c(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 8:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.v(obj, j6, p0.f6845c.i(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 9:
                        y(i2, obj, obj2);
                        break;
                    case 10:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.v(obj, j6, p0.f6845c.i(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.t(j6, obj, p0.f6845c.g(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 12:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.t(j6, obj, p0.f6845c.g(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 13:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.t(j6, obj, p0.f6845c.g(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 14:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.u(obj, j6, p0.f6845c.h(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 15:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.t(j6, obj, p0.f6845c.g(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 16:
                        if (!s(i2, obj2)) {
                            break;
                        } else {
                            p0.u(obj, j6, p0.f6845c.h(obj2, j6));
                            R(i2, obj);
                            break;
                        }
                    case 17:
                        y(i2, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f6777l.b(obj, j6, obj2);
                        break;
                    case 50:
                        Class cls = e0.f6799a;
                        o0 o0Var = p0.f6845c;
                        Object i6 = o0Var.i(obj, j6);
                        Object i7 = o0Var.i(obj2, j6);
                        this.f6779n.getClass();
                        p0.v(obj, j6, O.d(i6, i7));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!u(i5, obj2, i2)) {
                            break;
                        } else {
                            p0.v(obj, j6, p0.f6845c.i(obj2, j6));
                            S(i5, obj, i2);
                            break;
                        }
                    case 60:
                        z(i2, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!u(i5, obj2, i2)) {
                            break;
                        } else {
                            p0.v(obj, j6, p0.f6845c.i(obj2, j6));
                            S(i5, obj, i2);
                            break;
                        }
                    case 68:
                        z(i2, obj, obj2);
                        break;
                }
                i2 += 3;
            } else {
                e0.B(this.f6778m, obj, obj2);
                return;
            }
        }
    }

    public final void d(Object obj) {
        if (t(obj)) {
            if (obj instanceof C0418x) {
                C0418x xVar = (C0418x) obj;
                xVar.i();
                xVar.h();
                xVar.q();
            }
            int length = this.f6769a.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int X3 = X(i2);
                long j6 = (long) (1048575 & X3);
                int W5 = W(X3);
                if (W5 != 9) {
                    switch (W5) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f6777l.a(obj, j6);
                            continue;
                        case 50:
                            Unsafe unsafe = f6768p;
                            Object object = unsafe.getObject(obj, j6);
                            if (object != null) {
                                this.f6779n.getClass();
                                O.f(object);
                                unsafe.putObject(obj, j6, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (s(i2, obj)) {
                    p(i2).d(f6768p.getObject(obj, j6));
                }
            }
            this.f6778m.getClass();
            h0.b(obj);
        }
    }

    public final boolean e(Object obj) {
        boolean z3;
        int i2 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z4 = true;
            if (i5 >= this.f6774i) {
                return true;
            }
            int i7 = this.h[i5];
            int[] iArr = this.f6769a;
            int i8 = iArr[i7];
            int X3 = X(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i2) {
                if (i10 != 1048575) {
                    i6 = f6768p.getInt(obj, (long) i10);
                }
                i2 = i10;
            }
            if ((268435456 & X3) != 0) {
                if (i2 == 1048575) {
                    z3 = s(i7, obj);
                } else if ((i6 & i11) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return false;
                }
            }
            int W5 = W(X3);
            if (W5 == 9 || W5 == 17) {
                if (i2 == 1048575) {
                    z4 = s(i7, obj);
                } else if ((i11 & i6) == 0) {
                    z4 = false;
                }
                if (z4) {
                    if (!p(i7).e(p0.f6845c.i(obj, (long) (X3 & 1048575)))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                if (W5 != 27) {
                    if (W5 == 60 || W5 == 68) {
                        if (u(i8, obj, i7)) {
                            if (!p(i7).e(p0.f6845c.i(obj, (long) (X3 & 1048575)))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (W5 != 49) {
                        if (W5 != 50) {
                            continue;
                        } else {
                            Object i12 = p0.f6845c.i(obj, (long) (X3 & 1048575));
                            this.f6779n.getClass();
                            if (!((N) i12).isEmpty()) {
                                C0552a.y(o(i7));
                                throw null;
                            }
                        }
                    }
                }
                List list = (List) p0.f6845c.i(obj, (long) (X3 & 1048575));
                if (list.isEmpty()) {
                    continue;
                } else {
                    d0 p6 = p(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!p6.e(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                }
            }
            i5++;
        }
    }

    public final void f(Object obj, C0407l lVar, C0411p pVar) {
        pVar.getClass();
        l(obj);
        w(this.f6778m, obj, lVar, pVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (com.google.crypto.tink.shaded.protobuf.e0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009e, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0108, code lost:
        if (com.google.crypto.tink.shaded.protobuf.e0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        if (com.google.crypto.tink.shaded.protobuf.e0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        if (com.google.crypto.tink.shaded.protobuf.e0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014c, code lost:
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0160, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0176, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018a, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019f, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b4, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (com.google.crypto.tink.shaded.protobuf.e0.C(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(com.google.crypto.tink.shaded.protobuf.C0418x r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r0 = r11.f6769a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            r4 = 1
            if (r3 >= r1) goto L_0x01f5
            int r5 = r11.X(r3)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5 & r6
            long r7 = (long) r7
            int r5 = W(r5)
            switch(r5) {
                case 0: goto L_0x01d2;
                case 1: goto L_0x01b7;
                case 2: goto L_0x01a2;
                case 3: goto L_0x018d;
                case 4: goto L_0x017a;
                case 5: goto L_0x0164;
                case 6: goto L_0x0150;
                case 7: goto L_0x013c;
                case 8: goto L_0x0124;
                case 9: goto L_0x010c;
                case 10: goto L_0x00f4;
                case 11: goto L_0x00e0;
                case 12: goto L_0x00cc;
                case 13: goto L_0x00b8;
                case 14: goto L_0x00a2;
                case 15: goto L_0x008e;
                case 16: goto L_0x0078;
                case 17: goto L_0x0060;
                case 18: goto L_0x0050;
                case 19: goto L_0x0050;
                case 20: goto L_0x0050;
                case 21: goto L_0x0050;
                case 22: goto L_0x0050;
                case 23: goto L_0x0050;
                case 24: goto L_0x0050;
                case 25: goto L_0x0050;
                case 26: goto L_0x0050;
                case 27: goto L_0x0050;
                case 28: goto L_0x0050;
                case 29: goto L_0x0050;
                case 30: goto L_0x0050;
                case 31: goto L_0x0050;
                case 32: goto L_0x0050;
                case 33: goto L_0x0050;
                case 34: goto L_0x0050;
                case 35: goto L_0x0050;
                case 36: goto L_0x0050;
                case 37: goto L_0x0050;
                case 38: goto L_0x0050;
                case 39: goto L_0x0050;
                case 40: goto L_0x0050;
                case 41: goto L_0x0050;
                case 42: goto L_0x0050;
                case 43: goto L_0x0050;
                case 44: goto L_0x0050;
                case 45: goto L_0x0050;
                case 46: goto L_0x0050;
                case 47: goto L_0x0050;
                case 48: goto L_0x0050;
                case 49: goto L_0x0050;
                case 50: goto L_0x0040;
                case 51: goto L_0x001b;
                case 52: goto L_0x001b;
                case 53: goto L_0x001b;
                case 54: goto L_0x001b;
                case 55: goto L_0x001b;
                case 56: goto L_0x001b;
                case 57: goto L_0x001b;
                case 58: goto L_0x001b;
                case 59: goto L_0x001b;
                case 60: goto L_0x001b;
                case 61: goto L_0x001b;
                case 62: goto L_0x001b;
                case 63: goto L_0x001b;
                case 64: goto L_0x001b;
                case 65: goto L_0x001b;
                case 66: goto L_0x001b;
                case 67: goto L_0x001b;
                case 68: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x01ee
        L_0x001b:
            int r5 = r3 + 2
            r5 = r0[r5]
            r5 = r5 & r6
            long r5 = (long) r5
            com.google.crypto.tink.shaded.protobuf.o0 r9 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r10 = r9.g(r12, r5)
            int r5 = r9.g(r13, r5)
            if (r10 != r5) goto L_0x003d
            java.lang.Object r5 = r9.i(r12, r7)
            java.lang.Object r6 = r9.i(r13, r7)
            boolean r5 = com.google.crypto.tink.shaded.protobuf.e0.C(r5, r6)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x003d:
            r4 = r2
            goto L_0x01ee
        L_0x0040:
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r5 = r4.i(r12, r7)
            java.lang.Object r4 = r4.i(r13, r7)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.e0.C(r5, r4)
            goto L_0x01ee
        L_0x0050:
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r5 = r4.i(r12, r7)
            java.lang.Object r4 = r4.i(r13, r7)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.e0.C(r5, r4)
            goto L_0x01ee
        L_0x0060:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r6 = r5.i(r12, r7)
            java.lang.Object r5 = r5.i(r13, r7)
            boolean r5 = com.google.crypto.tink.shaded.protobuf.e0.C(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x0078:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r9 = r5.h(r12, r7)
            long r5 = r5.h(r13, r7)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x008e:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r6 = r5.g(r12, r7)
            int r5 = r5.g(r13, r7)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00a2:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r9 = r5.h(r12, r7)
            long r5 = r5.h(r13, r7)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x00b8:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r6 = r5.g(r12, r7)
            int r5 = r5.g(r13, r7)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00cc:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r6 = r5.g(r12, r7)
            int r5 = r5.g(r13, r7)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00e0:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r6 = r5.g(r12, r7)
            int r5 = r5.g(r13, r7)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x00f4:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r6 = r5.i(r12, r7)
            java.lang.Object r5 = r5.i(r13, r7)
            boolean r5 = com.google.crypto.tink.shaded.protobuf.e0.C(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x010c:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r6 = r5.i(r12, r7)
            java.lang.Object r5 = r5.i(r13, r7)
            boolean r5 = com.google.crypto.tink.shaded.protobuf.e0.C(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x0124:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r6 = r5.i(r12, r7)
            java.lang.Object r5 = r5.i(r13, r7)
            boolean r5 = com.google.crypto.tink.shaded.protobuf.e0.C(r6, r5)
            if (r5 == 0) goto L_0x003d
            goto L_0x01ee
        L_0x013c:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            boolean r6 = r5.c(r12, r7)
            boolean r5 = r5.c(r13, r7)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x0150:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r6 = r5.g(r12, r7)
            int r5 = r5.g(r13, r7)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x0164:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r9 = r5.h(r12, r7)
            long r5 = r5.h(r13, r7)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x017a:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r6 = r5.g(r12, r7)
            int r5 = r5.g(r13, r7)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x018d:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r9 = r5.h(r12, r7)
            long r5 = r5.h(r13, r7)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x01a2:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r9 = r5.h(r12, r7)
            long r5 = r5.h(r13, r7)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            goto L_0x01ee
        L_0x01b7:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            float r6 = r5.f(r12, r7)
            int r6 = java.lang.Float.floatToIntBits(r6)
            float r5 = r5.f(r13, r7)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r6 != r5) goto L_0x003d
            goto L_0x01ee
        L_0x01d2:
            boolean r5 = r11.k(r12, r13, r3)
            if (r5 == 0) goto L_0x003d
            com.google.crypto.tink.shaded.protobuf.o0 r5 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            double r9 = r5.e(r12, r7)
            long r9 = java.lang.Double.doubleToLongBits(r9)
            double r5 = r5.e(r13, r7)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
        L_0x01ee:
            if (r4 != 0) goto L_0x01f1
            return r2
        L_0x01f1:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x01f5:
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r11.f6778m
            r0.getClass()
            com.google.crypto.tink.shaded.protobuf.g0 r12 = r12.unknownFields
            com.google.crypto.tink.shaded.protobuf.x r13 = (com.google.crypto.tink.shaded.protobuf.C0418x) r13
            com.google.crypto.tink.shaded.protobuf.g0 r13 = r13.unknownFields
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0207
            return r2
        L_0x0207:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.g(com.google.crypto.tink.shaded.protobuf.x, java.lang.Object):boolean");
    }

    public final void h(Object obj, M m6) {
        m6.getClass();
        if (this.g) {
            int[] iArr = this.f6769a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int X3 = X(i2);
                int i5 = iArr[i2];
                switch (W(X3)) {
                    case 0:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.c(i5, p0.f6845c.e(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 1:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.g(i5, p0.f6845c.f(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 2:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.j(i5, p0.f6845c.h(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 3:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.q(i5, p0.f6845c.h(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 4:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.i(i5, p0.f6845c.g(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 5:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.f(i5, p0.f6845c.h(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case zzaky.zzf.zzf:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.e(i5, p0.f6845c.g(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case zzaky.zzf.zzg:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.a(i5, p0.f6845c.c(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 8:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            Z(i5, p0.f6845c.i(obj, (long) (X3 & 1048575)), m6);
                            break;
                        }
                    case 9:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.k(i5, p0.f6845c.i(obj, (long) (X3 & 1048575)), p(i2));
                            break;
                        }
                    case 10:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.b(i5, (C0404i) p0.f6845c.i(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.p(i5, p0.f6845c.g(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 12:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.d(i5, p0.f6845c.g(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 13:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.l(i5, p0.f6845c.g(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 14:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.m(i5, p0.f6845c.h(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 15:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.n(i5, p0.f6845c.g(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 16:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.o(i5, p0.f6845c.h(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 17:
                        if (!s(i2, obj)) {
                            break;
                        } else {
                            m6.h(i5, p0.f6845c.i(obj, (long) (X3 & 1048575)), p(i2));
                            break;
                        }
                    case 18:
                        e0.F(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 19:
                        e0.J(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 20:
                        e0.M(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 21:
                        e0.U(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 22:
                        e0.L(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 23:
                        e0.I(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 24:
                        e0.H(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 25:
                        e0.D(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 26:
                        e0.S(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6);
                        break;
                    case 27:
                        e0.N(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, p(i2));
                        break;
                    case 28:
                        e0.E(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6);
                        break;
                    case 29:
                        e0.T(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 30:
                        e0.G(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 31:
                        e0.O(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 32:
                        e0.P(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 33:
                        e0.Q(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 34:
                        e0.R(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, false);
                        break;
                    case 35:
                        e0.F(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 36:
                        e0.J(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 37:
                        e0.M(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 38:
                        e0.U(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 39:
                        e0.L(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 40:
                        e0.I(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 41:
                        e0.H(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 42:
                        e0.D(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 43:
                        e0.T(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 44:
                        e0.G(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 45:
                        e0.O(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 46:
                        e0.P(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 47:
                        e0.Q(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 48:
                        e0.R(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, true);
                        break;
                    case 49:
                        e0.K(iArr[i2], (List) p0.f6845c.i(obj, (long) (X3 & 1048575)), m6, p(i2));
                        break;
                    case 50:
                        if (p0.f6845c.i(obj, (long) (X3 & 1048575)) == null) {
                            break;
                        } else {
                            Object o6 = o(i2);
                            this.f6779n.getClass();
                            C0552a.y(o6);
                            throw null;
                        }
                    case 51:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.c(i5, ((Double) p0.f6845c.i(obj, (long) (X3 & 1048575))).doubleValue());
                            break;
                        }
                    case 52:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.g(i5, ((Float) p0.f6845c.i(obj, (long) (X3 & 1048575))).floatValue());
                            break;
                        }
                    case 53:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.j(i5, G(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 54:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.q(i5, G(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 55:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.i(i5, F(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 56:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.f(i5, G(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 57:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.e(i5, F(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 58:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.a(i5, ((Boolean) p0.f6845c.i(obj, (long) (X3 & 1048575))).booleanValue());
                            break;
                        }
                    case 59:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            Z(i5, p0.f6845c.i(obj, (long) (X3 & 1048575)), m6);
                            break;
                        }
                    case 60:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.k(i5, p0.f6845c.i(obj, (long) (X3 & 1048575)), p(i2));
                            break;
                        }
                    case 61:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.b(i5, (C0404i) p0.f6845c.i(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 62:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.p(i5, F(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 63:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.d(i5, F(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 64:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.l(i5, F(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 65:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.m(i5, G(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 66:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.n(i5, F(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 67:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.o(i5, G(obj, (long) (X3 & 1048575)));
                            break;
                        }
                    case 68:
                        if (!u(i5, obj, i2)) {
                            break;
                        } else {
                            m6.h(i5, p0.f6845c.i(obj, (long) (X3 & 1048575)), p(i2));
                            break;
                        }
                }
            }
            this.f6778m.getClass();
            ((C0418x) obj).unknownFields.e(m6);
            return;
        }
        Y(obj, m6);
    }

    public final Object i() {
        this.f6776k.getClass();
        return ((C0418x) this.f6772e).s();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r4 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0198, code lost:
        r3 = (r3 * 53) + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r3 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0216, code lost:
        if (r4 != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0278, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j(com.google.crypto.tink.shaded.protobuf.C0418x r12) {
        /*
            r11 = this;
            int[] r0 = r11.f6769a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x027c
            int r4 = r11.X(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r6 = (long) r6
            int r4 = W(r4)
            r8 = 1237(0x4d5, float:1.733E-42)
            r9 = 1231(0x4cf, float:1.725E-42)
            r10 = 37
            switch(r4) {
                case 0: goto L_0x0266;
                case 1: goto L_0x0258;
                case 2: goto L_0x024a;
                case 3: goto L_0x023c;
                case 4: goto L_0x0232;
                case 5: goto L_0x0224;
                case 6: goto L_0x021a;
                case 7: goto L_0x020c;
                case 8: goto L_0x01fc;
                case 9: goto L_0x01ef;
                case 10: goto L_0x01e1;
                case 11: goto L_0x01d7;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01c3;
                case 14: goto L_0x01b5;
                case 15: goto L_0x01ab;
                case 16: goto L_0x019d;
                case 17: goto L_0x018c;
                case 18: goto L_0x017e;
                case 19: goto L_0x017e;
                case 20: goto L_0x017e;
                case 21: goto L_0x017e;
                case 22: goto L_0x017e;
                case 23: goto L_0x017e;
                case 24: goto L_0x017e;
                case 25: goto L_0x017e;
                case 26: goto L_0x017e;
                case 27: goto L_0x017e;
                case 28: goto L_0x017e;
                case 29: goto L_0x017e;
                case 30: goto L_0x017e;
                case 31: goto L_0x017e;
                case 32: goto L_0x017e;
                case 33: goto L_0x017e;
                case 34: goto L_0x017e;
                case 35: goto L_0x017e;
                case 36: goto L_0x017e;
                case 37: goto L_0x017e;
                case 38: goto L_0x017e;
                case 39: goto L_0x017e;
                case 40: goto L_0x017e;
                case 41: goto L_0x017e;
                case 42: goto L_0x017e;
                case 43: goto L_0x017e;
                case 44: goto L_0x017e;
                case 45: goto L_0x017e;
                case 46: goto L_0x017e;
                case 47: goto L_0x017e;
                case 48: goto L_0x017e;
                case 49: goto L_0x017e;
                case 50: goto L_0x0170;
                case 51: goto L_0x0152;
                case 52: goto L_0x0138;
                case 53: goto L_0x0126;
                case 54: goto L_0x0114;
                case 55: goto L_0x0106;
                case 56: goto L_0x00f4;
                case 57: goto L_0x00e6;
                case 58: goto L_0x00c9;
                case 59: goto L_0x00b3;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008d;
                case 62: goto L_0x0080;
                case 63: goto L_0x0073;
                case 64: goto L_0x0066;
                case 65: goto L_0x0055;
                case 66: goto L_0x0048;
                case 67: goto L_0x0037;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0278
        L_0x0021:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
        L_0x0033:
            int r4 = r4 + r3
            r3 = r4
            goto L_0x0278
        L_0x0037:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = G(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0048:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = F(r12, r6)
            goto L_0x0033
        L_0x0055:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = G(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0066:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = F(r12, r6)
            goto L_0x0033
        L_0x0073:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = F(r12, r6)
            goto L_0x0033
        L_0x0080:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = F(r12, r6)
            goto L_0x0033
        L_0x008d:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x00a0:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            int r3 = r3 * 53
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x00b3:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x00c9:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.nio.charset.Charset r5 = com.google.crypto.tink.shaded.protobuf.B.f6742a
            if (r4 == 0) goto L_0x00e2
        L_0x00e1:
            r8 = r9
        L_0x00e2:
            int r8 = r8 + r3
            r3 = r8
            goto L_0x0278
        L_0x00e6:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = F(r12, r6)
            goto L_0x0033
        L_0x00f4:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = G(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0106:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            int r4 = F(r12, r6)
            goto L_0x0033
        L_0x0114:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = G(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0126:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            long r4 = G(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0138:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x0033
        L_0x0152:
            boolean r4 = r11.u(r5, r12, r2)
            if (r4 == 0) goto L_0x0278
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0170:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x017e:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x018c:
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            if (r4 == 0) goto L_0x0198
            int r10 = r4.hashCode()
        L_0x0198:
            int r3 = r3 * 53
            int r3 = r3 + r10
            goto L_0x0278
        L_0x019d:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r4 = r4.h(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x01ab:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r4 = r4.g(r12, r6)
            goto L_0x0033
        L_0x01b5:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r4 = r4.h(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x01c3:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r4 = r4.g(r12, r6)
            goto L_0x0033
        L_0x01cd:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r4 = r4.g(r12, r6)
            goto L_0x0033
        L_0x01d7:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r4 = r4.g(r12, r6)
            goto L_0x0033
        L_0x01e1:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x01ef:
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            if (r4 == 0) goto L_0x0198
            int r10 = r4.hashCode()
            goto L_0x0198
        L_0x01fc:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            java.lang.Object r4 = r4.i(r12, r6)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x0033
        L_0x020c:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            boolean r4 = r4.c(r12, r6)
            java.nio.charset.Charset r5 = com.google.crypto.tink.shaded.protobuf.B.f6742a
            if (r4 == 0) goto L_0x00e2
            goto L_0x00e1
        L_0x021a:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r4 = r4.g(r12, r6)
            goto L_0x0033
        L_0x0224:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r4 = r4.h(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0232:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            int r4 = r4.g(r12, r6)
            goto L_0x0033
        L_0x023c:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r4 = r4.h(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x024a:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            long r4 = r4.h(r12, r6)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0258:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            float r4 = r4.f(r12, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x0033
        L_0x0266:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.o0 r4 = com.google.crypto.tink.shaded.protobuf.p0.f6845c
            double r4 = r4.e(r12, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r4 = com.google.crypto.tink.shaded.protobuf.B.b(r4)
            goto L_0x0033
        L_0x0278:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x027c:
            int r3 = r3 * 53
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r11.f6778m
            r0.getClass()
            com.google.crypto.tink.shaded.protobuf.g0 r12 = r12.unknownFields
            int r12 = r12.hashCode()
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.j(com.google.crypto.tink.shaded.protobuf.x):int");
    }

    public final boolean k(C0418x xVar, Object obj, int i2) {
        if (s(i2, xVar) == s(i2, obj)) {
            return true;
        }
        return false;
    }

    public final void m(int i2, Object obj, Object obj2) {
        int i5 = this.f6769a[i2];
        if (p0.f6845c.i(obj, (long) (X(i2) & 1048575)) != null) {
            n(i2);
        }
    }

    public final void n(int i2) {
        if (this.f6770b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object o(int i2) {
        return this.f6770b[(i2 / 3) * 2];
    }

    public final d0 p(int i2) {
        int i5 = (i2 / 3) * 2;
        Object[] objArr = this.f6770b;
        d0 d0Var = (d0) objArr[i5];
        if (d0Var != null) {
            return d0Var;
        }
        d0 a6 = a0.f6785c.a((Class) objArr[i5 + 1]);
        objArr[i5] = a6;
        return a6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        r4 = r7 + r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int q(com.google.crypto.tink.shaded.protobuf.C0418x r14) {
        /*
            r13 = this;
            sun.misc.Unsafe r0 = f6768p
            r1 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r1
            r4 = r3
            r6 = r4
            r5 = r2
        L_0x000a:
            int[] r7 = r13.f6769a
            int r8 = r7.length
            if (r3 >= r8) goto L_0x0463
            int r8 = r13.X(r3)
            r9 = r7[r3]
            int r10 = W(r8)
            r11 = 17
            if (r10 > r11) goto L_0x0031
            int r11 = r3 + 2
            r7 = r7[r11]
            r11 = r7 & r2
            int r7 = r7 >>> 20
            r12 = 1
            int r7 = r12 << r7
            if (r11 == r5) goto L_0x0032
            long r5 = (long) r11
            int r6 = r0.getInt(r14, r5)
            r5 = r11
            goto L_0x0032
        L_0x0031:
            r7 = r1
        L_0x0032:
            r8 = r8 & r2
            long r11 = (long) r8
            switch(r10) {
                case 0: goto L_0x0456;
                case 1: goto L_0x044d;
                case 2: goto L_0x0440;
                case 3: goto L_0x0433;
                case 4: goto L_0x0426;
                case 5: goto L_0x041d;
                case 6: goto L_0x0414;
                case 7: goto L_0x040b;
                case 8: goto L_0x03f0;
                case 9: goto L_0x03df;
                case 10: goto L_0x03d0;
                case 11: goto L_0x03c3;
                case 12: goto L_0x03b6;
                case 13: goto L_0x03ad;
                case 14: goto L_0x03a4;
                case 15: goto L_0x0397;
                case 16: goto L_0x038a;
                case 17: goto L_0x0377;
                case 18: goto L_0x036b;
                case 19: goto L_0x035f;
                case 20: goto L_0x0353;
                case 21: goto L_0x0347;
                case 22: goto L_0x033b;
                case 23: goto L_0x032f;
                case 24: goto L_0x0323;
                case 25: goto L_0x0317;
                case 26: goto L_0x030b;
                case 27: goto L_0x02fb;
                case 28: goto L_0x02ef;
                case 29: goto L_0x02e3;
                case 30: goto L_0x02d7;
                case 31: goto L_0x02cb;
                case 32: goto L_0x02bf;
                case 33: goto L_0x02b3;
                case 34: goto L_0x02a7;
                case 35: goto L_0x0291;
                case 36: goto L_0x027b;
                case 37: goto L_0x0265;
                case 38: goto L_0x024f;
                case 39: goto L_0x0239;
                case 40: goto L_0x0223;
                case 41: goto L_0x020d;
                case 42: goto L_0x01f7;
                case 43: goto L_0x01e1;
                case 44: goto L_0x01cb;
                case 45: goto L_0x01b5;
                case 46: goto L_0x019f;
                case 47: goto L_0x0189;
                case 48: goto L_0x0173;
                case 49: goto L_0x0163;
                case 50: goto L_0x0151;
                case 51: goto L_0x0145;
                case 52: goto L_0x0139;
                case 53: goto L_0x0129;
                case 54: goto L_0x0119;
                case 55: goto L_0x0109;
                case 56: goto L_0x00fd;
                case 57: goto L_0x00f1;
                case 58: goto L_0x00e5;
                case 59: goto L_0x00c6;
                case 60: goto L_0x00b3;
                case 61: goto L_0x00a2;
                case 62: goto L_0x0093;
                case 63: goto L_0x0084;
                case 64: goto L_0x0079;
                case 65: goto L_0x006e;
                case 66: goto L_0x005f;
                case 67: goto L_0x0050;
                case 68: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x045f
        L_0x0039:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.crypto.tink.shaded.protobuf.a r7 = (com.google.crypto.tink.shaded.protobuf.C0396a) r7
            com.google.crypto.tink.shaded.protobuf.d0 r8 = r13.p(r3)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.a1(r9, r7, r8)
        L_0x004d:
            int r4 = r4 + r7
            goto L_0x045f
        L_0x0050:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            long r7 = G(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.h1(r9, r7)
            goto L_0x004d
        L_0x005f:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = F(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.g1(r9, r7)
            goto L_0x004d
        L_0x006e:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.f1(r9)
            goto L_0x004d
        L_0x0079:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.e1(r9)
            goto L_0x004d
        L_0x0084:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = F(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.W0(r9, r7)
            goto L_0x004d
        L_0x0093:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = F(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.l1(r9, r7)
            goto L_0x004d
        L_0x00a2:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.crypto.tink.shaded.protobuf.i r7 = (com.google.crypto.tink.shaded.protobuf.C0404i) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r9, r7)
            goto L_0x004d
        L_0x00b3:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.crypto.tink.shaded.protobuf.d0 r8 = r13.p(r3)
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.o(r9, r7, r8)
            goto L_0x004d
        L_0x00c6:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            boolean r8 = r7 instanceof com.google.crypto.tink.shaded.protobuf.C0404i
            if (r8 == 0) goto L_0x00de
            com.google.crypto.tink.shaded.protobuf.i r7 = (com.google.crypto.tink.shaded.protobuf.C0404i) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r9, r7)
        L_0x00da:
            int r7 = r7 + r4
            r4 = r7
            goto L_0x045f
        L_0x00de:
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.i1(r9, r7)
            goto L_0x00da
        L_0x00e5:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.S0(r9)
            goto L_0x004d
        L_0x00f1:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.X0(r9)
            goto L_0x004d
        L_0x00fd:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.Y0(r9)
            goto L_0x004d
        L_0x0109:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = F(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.b1(r9, r7)
            goto L_0x004d
        L_0x0119:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            long r7 = G(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.n1(r9, r7)
            goto L_0x004d
        L_0x0129:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            long r7 = G(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.d1(r9, r7)
            goto L_0x004d
        L_0x0139:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.Z0(r9)
            goto L_0x004d
        L_0x0145:
            boolean r7 = r13.u(r9, r14, r3)
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.V0(r9)
            goto L_0x004d
        L_0x0151:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.lang.Object r8 = r13.o(r3)
            com.google.crypto.tink.shaded.protobuf.O r9 = r13.f6779n
            r9.getClass()
            com.google.crypto.tink.shaded.protobuf.O.b(r7, r8)
            goto L_0x045f
        L_0x0163:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.d0 r8 = r13.p(r3)
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.j(r9, r7, r8)
            goto L_0x004d
        L_0x0173:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.t(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x0189:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.r(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x019f:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.i(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x01b5:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.g(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x01cb:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.e(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x01e1:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.w(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x01f7:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.b(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x020d:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.g(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x0223:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.i(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x0239:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.l(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x024f:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.y(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x0265:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.n(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x027b:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.g(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x0291:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.i(r7)
            if (r7 <= 0) goto L_0x045f
            int r8 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r9)
            int r4 = com.google.android.gms.internal.measurement.a.b(r7, r8, r7, r4)
            goto L_0x045f
        L_0x02a7:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.s(r9, r7)
            goto L_0x004d
        L_0x02b3:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.q(r9, r7)
            goto L_0x004d
        L_0x02bf:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.h(r9, r7)
            goto L_0x004d
        L_0x02cb:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.f(r9, r7)
            goto L_0x004d
        L_0x02d7:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.d(r9, r7)
            goto L_0x004d
        L_0x02e3:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.v(r9, r7)
            goto L_0x004d
        L_0x02ef:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.c(r9, r7)
            goto L_0x004d
        L_0x02fb:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            com.google.crypto.tink.shaded.protobuf.d0 r8 = r13.p(r3)
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.p(r9, r7, r8)
            goto L_0x004d
        L_0x030b:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.u(r9, r7)
            goto L_0x004d
        L_0x0317:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.a(r9, r7)
            goto L_0x004d
        L_0x0323:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.f(r9, r7)
            goto L_0x004d
        L_0x032f:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.h(r9, r7)
            goto L_0x004d
        L_0x033b:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.k(r9, r7)
            goto L_0x004d
        L_0x0347:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.x(r9, r7)
            goto L_0x004d
        L_0x0353:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.m(r9, r7)
            goto L_0x004d
        L_0x035f:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.f(r9, r7)
            goto L_0x004d
        L_0x036b:
            java.lang.Object r7 = r0.getObject(r14, r11)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.h(r9, r7)
            goto L_0x004d
        L_0x0377:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.crypto.tink.shaded.protobuf.a r7 = (com.google.crypto.tink.shaded.protobuf.C0396a) r7
            com.google.crypto.tink.shaded.protobuf.d0 r8 = r13.p(r3)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.a1(r9, r7, r8)
            goto L_0x004d
        L_0x038a:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            long r7 = r0.getLong(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.h1(r9, r7)
            goto L_0x004d
        L_0x0397:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.g1(r9, r7)
            goto L_0x004d
        L_0x03a4:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.f1(r9)
            goto L_0x004d
        L_0x03ad:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.e1(r9)
            goto L_0x004d
        L_0x03b6:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.W0(r9, r7)
            goto L_0x004d
        L_0x03c3:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.l1(r9, r7)
            goto L_0x004d
        L_0x03d0:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.crypto.tink.shaded.protobuf.i r7 = (com.google.crypto.tink.shaded.protobuf.C0404i) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r9, r7)
            goto L_0x004d
        L_0x03df:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            com.google.crypto.tink.shaded.protobuf.d0 r8 = r13.p(r3)
            int r7 = com.google.crypto.tink.shaded.protobuf.e0.o(r9, r7, r8)
            goto L_0x004d
        L_0x03f0:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            java.lang.Object r7 = r0.getObject(r14, r11)
            boolean r8 = r7 instanceof com.google.crypto.tink.shaded.protobuf.C0404i
            if (r8 == 0) goto L_0x0403
            com.google.crypto.tink.shaded.protobuf.i r7 = (com.google.crypto.tink.shaded.protobuf.C0404i) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r9, r7)
            goto L_0x00da
        L_0x0403:
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.i1(r9, r7)
            goto L_0x00da
        L_0x040b:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.S0(r9)
            goto L_0x004d
        L_0x0414:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.X0(r9)
            goto L_0x004d
        L_0x041d:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.Y0(r9)
            goto L_0x004d
        L_0x0426:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = r0.getInt(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.b1(r9, r7)
            goto L_0x004d
        L_0x0433:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            long r7 = r0.getLong(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.n1(r9, r7)
            goto L_0x004d
        L_0x0440:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            long r7 = r0.getLong(r14, r11)
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.d1(r9, r7)
            goto L_0x004d
        L_0x044d:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.Z0(r9)
            goto L_0x004d
        L_0x0456:
            r7 = r7 & r6
            if (r7 == 0) goto L_0x045f
            int r7 = com.google.crypto.tink.shaded.protobuf.C0408m.V0(r9)
            goto L_0x004d
        L_0x045f:
            int r3 = r3 + 3
            goto L_0x000a
        L_0x0463:
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r13.f6778m
            r0.getClass()
            com.google.crypto.tink.shaded.protobuf.g0 r14 = r14.unknownFields
            int r14 = r14.b()
            int r14 = r14 + r4
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.q(com.google.crypto.tink.shaded.protobuf.x):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r(com.google.crypto.tink.shaded.protobuf.C0418x r10) {
        /*
            r9 = this;
            sun.misc.Unsafe r0 = f6768p
            r1 = 0
            r2 = r1
        L_0x0004:
            int[] r3 = r9.f6769a
            int r4 = r3.length
            if (r1 >= r4) goto L_0x046d
            int r4 = r9.X(r1)
            int r5 = W(r4)
            r6 = r3[r1]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.crypto.tink.shaded.protobuf.s r4 = com.google.crypto.tink.shaded.protobuf.C0413s.DOUBLE_LIST_PACKED
            int r4 = r4.a()
            if (r5 < r4) goto L_0x002c
            com.google.crypto.tink.shaded.protobuf.s r4 = com.google.crypto.tink.shaded.protobuf.C0413s.SINT64_LIST_PACKED
            int r4 = r4.a()
            if (r5 > r4) goto L_0x002c
            int r4 = r1 + 2
            r3 = r3[r4]
        L_0x002c:
            switch(r5) {
                case 0: goto L_0x045d;
                case 1: goto L_0x0451;
                case 2: goto L_0x0441;
                case 3: goto L_0x0431;
                case 4: goto L_0x0421;
                case 5: goto L_0x0415;
                case 6: goto L_0x0409;
                case 7: goto L_0x03fd;
                case 8: goto L_0x03df;
                case 9: goto L_0x03cb;
                case 10: goto L_0x03b9;
                case 11: goto L_0x03a9;
                case 12: goto L_0x0399;
                case 13: goto L_0x038d;
                case 14: goto L_0x0381;
                case 15: goto L_0x0371;
                case 16: goto L_0x0361;
                case 17: goto L_0x034b;
                case 18: goto L_0x0341;
                case 19: goto L_0x0337;
                case 20: goto L_0x032d;
                case 21: goto L_0x0323;
                case 22: goto L_0x0319;
                case 23: goto L_0x030f;
                case 24: goto L_0x0305;
                case 25: goto L_0x02fb;
                case 26: goto L_0x02f1;
                case 27: goto L_0x02e3;
                case 28: goto L_0x02d9;
                case 29: goto L_0x02cf;
                case 30: goto L_0x02c5;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02b1;
                case 33: goto L_0x02a7;
                case 34: goto L_0x029d;
                case 35: goto L_0x0287;
                case 36: goto L_0x0271;
                case 37: goto L_0x025b;
                case 38: goto L_0x0245;
                case 39: goto L_0x022f;
                case 40: goto L_0x0219;
                case 41: goto L_0x0203;
                case 42: goto L_0x01ed;
                case 43: goto L_0x01d7;
                case 44: goto L_0x01c1;
                case 45: goto L_0x01ab;
                case 46: goto L_0x0195;
                case 47: goto L_0x017f;
                case 48: goto L_0x0169;
                case 49: goto L_0x015b;
                case 50: goto L_0x0149;
                case 51: goto L_0x013d;
                case 52: goto L_0x0131;
                case 53: goto L_0x0121;
                case 54: goto L_0x0111;
                case 55: goto L_0x0101;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00e9;
                case 58: goto L_0x00dd;
                case 59: goto L_0x00bf;
                case 60: goto L_0x00ac;
                case 61: goto L_0x009b;
                case 62: goto L_0x008c;
                case 63: goto L_0x007d;
                case 64: goto L_0x0072;
                case 65: goto L_0x0067;
                case 66: goto L_0x0058;
                case 67: goto L_0x0049;
                case 68: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0469
        L_0x0031:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            com.google.crypto.tink.shaded.protobuf.a r3 = (com.google.crypto.tink.shaded.protobuf.C0396a) r3
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r9.p(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.a1(r6, r3, r4)
        L_0x0045:
            int r3 = r3 + r2
            r2 = r3
            goto L_0x0469
        L_0x0049:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            long r3 = G(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.h1(r6, r3)
            goto L_0x0045
        L_0x0058:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = F(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.g1(r6, r3)
            goto L_0x0045
        L_0x0067:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.f1(r6)
            goto L_0x0045
        L_0x0072:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.e1(r6)
            goto L_0x0045
        L_0x007d:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = F(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.W0(r6, r3)
            goto L_0x0045
        L_0x008c:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = F(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.l1(r6, r3)
            goto L_0x0045
        L_0x009b:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.C0404i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r6, r3)
            goto L_0x0045
        L_0x00ac:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r9.p(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.o(r6, r3, r4)
            goto L_0x0045
        L_0x00bf:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.C0404i
            if (r4 == 0) goto L_0x00d5
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.C0404i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r6, r3)
            goto L_0x0045
        L_0x00d5:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.i1(r6, r3)
            goto L_0x0045
        L_0x00dd:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.S0(r6)
            goto L_0x0045
        L_0x00e9:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.X0(r6)
            goto L_0x0045
        L_0x00f5:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.Y0(r6)
            goto L_0x0045
        L_0x0101:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = F(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.b1(r6, r3)
            goto L_0x0045
        L_0x0111:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            long r3 = G(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.n1(r6, r3)
            goto L_0x0045
        L_0x0121:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            long r3 = G(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.d1(r6, r3)
            goto L_0x0045
        L_0x0131:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.Z0(r6)
            goto L_0x0045
        L_0x013d:
            boolean r3 = r9.u(r6, r10, r1)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.V0(r6)
            goto L_0x0045
        L_0x0149:
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            java.lang.Object r4 = r9.o(r1)
            com.google.crypto.tink.shaded.protobuf.O r5 = r9.f6779n
            r5.getClass()
            com.google.crypto.tink.shaded.protobuf.O.b(r3, r4)
            goto L_0x0469
        L_0x015b:
            java.util.List r3 = v(r10, r7)
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r9.p(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.j(r6, r3, r4)
            goto L_0x0045
        L_0x0169:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.t(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x017f:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.r(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x0195:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.i(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x01ab:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.g(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x01c1:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.e(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x01d7:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.w(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x01ed:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.b(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x0203:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.g(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x0219:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.i(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x022f:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.l(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x0245:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.y(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x025b:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.n(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x0271:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.g(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x0287:
            java.lang.Object r3 = r0.getObject(r10, r7)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.i(r3)
            if (r3 <= 0) goto L_0x0469
            int r4 = com.google.crypto.tink.shaded.protobuf.C0408m.k1(r6)
            int r2 = com.google.android.gms.internal.measurement.a.b(r3, r4, r3, r2)
            goto L_0x0469
        L_0x029d:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.s(r6, r3)
            goto L_0x0045
        L_0x02a7:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.q(r6, r3)
            goto L_0x0045
        L_0x02b1:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.h(r6, r3)
            goto L_0x0045
        L_0x02bb:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.f(r6, r3)
            goto L_0x0045
        L_0x02c5:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.d(r6, r3)
            goto L_0x0045
        L_0x02cf:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.v(r6, r3)
            goto L_0x0045
        L_0x02d9:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.c(r6, r3)
            goto L_0x0045
        L_0x02e3:
            java.util.List r3 = v(r10, r7)
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r9.p(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.p(r6, r3, r4)
            goto L_0x0045
        L_0x02f1:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.u(r6, r3)
            goto L_0x0045
        L_0x02fb:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.a(r6, r3)
            goto L_0x0045
        L_0x0305:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.f(r6, r3)
            goto L_0x0045
        L_0x030f:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.h(r6, r3)
            goto L_0x0045
        L_0x0319:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.k(r6, r3)
            goto L_0x0045
        L_0x0323:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.x(r6, r3)
            goto L_0x0045
        L_0x032d:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.m(r6, r3)
            goto L_0x0045
        L_0x0337:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.f(r6, r3)
            goto L_0x0045
        L_0x0341:
            java.util.List r3 = v(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.h(r6, r3)
            goto L_0x0045
        L_0x034b:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            com.google.crypto.tink.shaded.protobuf.a r3 = (com.google.crypto.tink.shaded.protobuf.C0396a) r3
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r9.p(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.a1(r6, r3, r4)
            goto L_0x0045
        L_0x0361:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            long r3 = com.google.crypto.tink.shaded.protobuf.p0.k(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.h1(r6, r3)
            goto L_0x0045
        L_0x0371:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.p0.j(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.g1(r6, r3)
            goto L_0x0045
        L_0x0381:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.f1(r6)
            goto L_0x0045
        L_0x038d:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.e1(r6)
            goto L_0x0045
        L_0x0399:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.p0.j(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.W0(r6, r3)
            goto L_0x0045
        L_0x03a9:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.p0.j(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.l1(r6, r3)
            goto L_0x0045
        L_0x03b9:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.C0404i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r6, r3)
            goto L_0x0045
        L_0x03cb:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r9.p(r1)
            int r3 = com.google.crypto.tink.shaded.protobuf.e0.o(r6, r3, r4)
            goto L_0x0045
        L_0x03df:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = com.google.crypto.tink.shaded.protobuf.p0.l(r10, r7)
            boolean r4 = r3 instanceof com.google.crypto.tink.shaded.protobuf.C0404i
            if (r4 == 0) goto L_0x03f5
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.C0404i) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.T0(r6, r3)
            goto L_0x0045
        L_0x03f5:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.i1(r6, r3)
            goto L_0x0045
        L_0x03fd:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.S0(r6)
            goto L_0x0045
        L_0x0409:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.X0(r6)
            goto L_0x0045
        L_0x0415:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.Y0(r6)
            goto L_0x0045
        L_0x0421:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.p0.j(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.b1(r6, r3)
            goto L_0x0045
        L_0x0431:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            long r3 = com.google.crypto.tink.shaded.protobuf.p0.k(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.n1(r6, r3)
            goto L_0x0045
        L_0x0441:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            long r3 = com.google.crypto.tink.shaded.protobuf.p0.k(r10, r7)
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.d1(r6, r3)
            goto L_0x0045
        L_0x0451:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.Z0(r6)
            goto L_0x0045
        L_0x045d:
            boolean r3 = r9.s(r1, r10)
            if (r3 == 0) goto L_0x0469
            int r3 = com.google.crypto.tink.shaded.protobuf.C0408m.V0(r6)
            goto L_0x0045
        L_0x0469:
            int r1 = r1 + 3
            goto L_0x0004
        L_0x046d:
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r9.f6778m
            r0.getClass()
            com.google.crypto.tink.shaded.protobuf.g0 r10 = r10.unknownFields
            int r10 = r10.b()
            int r10 = r10 + r2
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.r(com.google.crypto.tink.shaded.protobuf.x):int");
    }

    public final boolean s(int i2, Object obj) {
        int i5 = this.f6769a[i2 + 2];
        long j6 = (long) (i5 & 1048575);
        if (j6 == 1048575) {
            int X3 = X(i2);
            long j7 = (long) (X3 & 1048575);
            switch (W(X3)) {
                case 0:
                    if (Double.doubleToRawLongBits(p0.f6845c.e(obj, j7)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(p0.f6845c.f(obj, j7)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (p0.f6845c.h(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (p0.f6845c.h(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (p0.f6845c.g(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (p0.f6845c.h(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case zzaky.zzf.zzf:
                    if (p0.f6845c.g(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case zzaky.zzf.zzg:
                    return p0.f6845c.c(obj, j7);
                case 8:
                    Object i6 = p0.f6845c.i(obj, j7);
                    if (i6 instanceof String) {
                        return !((String) i6).isEmpty();
                    }
                    if (i6 instanceof C0404i) {
                        return !C0404i.f6810b.equals(i6);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (p0.f6845c.i(obj, j7) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C0404i.f6810b.equals(p0.f6845c.i(obj, j7));
                case ModuleDescriptor.MODULE_VERSION:
                    if (p0.f6845c.g(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (p0.f6845c.g(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (p0.f6845c.g(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (p0.f6845c.h(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (p0.f6845c.g(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (p0.f6845c.h(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (p0.f6845c.i(obj, j7) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & p0.f6845c.g(obj, j6)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean u(int i2, Object obj, int i5) {
        if (p0.f6845c.g(obj, (long) (this.f6769a[i5 + 2] & 1048575)) == i2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v35 */
    /* JADX WARNING: type inference failed for: r15v36 */
    /* JADX WARNING: type inference failed for: r15v38 */
    /* JADX WARNING: type inference failed for: r15v39 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0253, code lost:
        r7 = r15;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x05d8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x05dd A[Catch:{ all -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x05fc A[LOOP:5: B:143:0x05fa->B:144:0x05fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x05e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0011 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(com.google.crypto.tink.shaded.protobuf.h0 r18, java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.C0407l r20, com.google.crypto.tink.shaded.protobuf.C0411p r21) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            r0 = r20
            r11 = r21
            int[] r12 = r8.h
            int r13 = r8.f6775j
            int r14 = r8.f6774i
            r7 = 0
        L_0x0011:
            int r1 = r20.c()     // Catch:{ all -> 0x0023 }
            int r2 = r8.f6771c     // Catch:{ all -> 0x0023 }
            r3 = 0
            if (r1 < r2) goto L_0x0026
            int r2 = r8.d     // Catch:{ all -> 0x0023 }
            if (r1 > r2) goto L_0x0026
            int r2 = r8.T(r1, r3)     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r0 = move-exception
            goto L_0x05fa
        L_0x0026:
            r2 = -1
        L_0x0027:
            if (r2 >= 0) goto L_0x0065
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0043
        L_0x002e:
            if (r14 >= r13) goto L_0x0038
            r0 = r12[r14]
            r8.m(r0, r10, r7)
            int r14 = r14 + 1
            goto L_0x002e
        L_0x0038:
            if (r7 == 0) goto L_0x0042
            r18.getClass()
            r0 = r10
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.C0418x) r0
            r0.unknownFields = r7
        L_0x0042:
            return
        L_0x0043:
            r18.getClass()     // Catch:{ all -> 0x0023 }
            if (r7 != 0) goto L_0x004c
            com.google.crypto.tink.shaded.protobuf.g0 r7 = com.google.crypto.tink.shaded.protobuf.h0.a(r19)     // Catch:{ all -> 0x0023 }
        L_0x004c:
            boolean r1 = com.google.crypto.tink.shaded.protobuf.h0.c(r7, r0)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0053
            goto L_0x0011
        L_0x0053:
            if (r14 >= r13) goto L_0x005d
            r0 = r12[r14]
            r8.m(r0, r10, r7)
            int r14 = r14 + 1
            goto L_0x0053
        L_0x005d:
            if (r7 == 0) goto L_0x0064
            r0 = r10
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.C0418x) r0
            r0.unknownFields = r7
        L_0x0064:
            return
        L_0x0065:
            int r4 = r8.X(r2)     // Catch:{ all -> 0x0023 }
            int r5 = W(r4)     // Catch:{ C -> 0x0081 }
            r15 = 3
            java.lang.Object r6 = r0.d
            E2.d r6 = (E2.d) r6
            com.google.crypto.tink.shaded.protobuf.J r3 = r8.f6777l
            switch(r5) {
                case 0: goto L_0x05c2;
                case 1: goto L_0x05ac;
                case 2: goto L_0x0596;
                case 3: goto L_0x0580;
                case 4: goto L_0x056a;
                case 5: goto L_0x0554;
                case 6: goto L_0x053e;
                case 7: goto L_0x0528;
                case 8: goto L_0x051e;
                case 9: goto L_0x0506;
                case 10: goto L_0x04f4;
                case 11: goto L_0x04de;
                case 12: goto L_0x04c5;
                case 13: goto L_0x04af;
                case 14: goto L_0x0499;
                case 15: goto L_0x0483;
                case 16: goto L_0x046d;
                case 17: goto L_0x0456;
                case 18: goto L_0x0446;
                case 19: goto L_0x0436;
                case 20: goto L_0x0426;
                case 21: goto L_0x0416;
                case 22: goto L_0x0406;
                case 23: goto L_0x03f6;
                case 24: goto L_0x03e6;
                case 25: goto L_0x03d6;
                case 26: goto L_0x03ce;
                case 27: goto L_0x03b9;
                case 28: goto L_0x03a9;
                case 29: goto L_0x0399;
                case 30: goto L_0x0383;
                case 31: goto L_0x0373;
                case 32: goto L_0x0363;
                case 33: goto L_0x0353;
                case 34: goto L_0x0343;
                case 35: goto L_0x0333;
                case 36: goto L_0x0323;
                case 37: goto L_0x0313;
                case 38: goto L_0x0303;
                case 39: goto L_0x02f3;
                case 40: goto L_0x02e3;
                case 41: goto L_0x02d3;
                case 42: goto L_0x02c4;
                case 43: goto L_0x02b5;
                case 44: goto L_0x02a0;
                case 45: goto L_0x0291;
                case 46: goto L_0x0282;
                case 47: goto L_0x0273;
                case 48: goto L_0x0264;
                case 49: goto L_0x023d;
                case 50: goto L_0x0233;
                case 51: goto L_0x021b;
                case 52: goto L_0x0203;
                case 53: goto L_0x01eb;
                case 54: goto L_0x01d3;
                case 55: goto L_0x01bb;
                case 56: goto L_0x01a3;
                case 57: goto L_0x018b;
                case 58: goto L_0x0173;
                case 59: goto L_0x016b;
                case 60: goto L_0x0155;
                case 61: goto L_0x0145;
                case 62: goto L_0x012d;
                case 63: goto L_0x0113;
                case 64: goto L_0x00fc;
                case 65: goto L_0x00e5;
                case 66: goto L_0x00ce;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a0;
                default: goto L_0x0077;
            }
        L_0x0077:
            if (r7 != 0) goto L_0x0085
            r18.getClass()     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.g0 r7 = com.google.crypto.tink.shaded.protobuf.h0.a(r19)     // Catch:{ C -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r16 = 0
            goto L_0x05d8
        L_0x0085:
            r18.getClass()     // Catch:{ C -> 0x0081 }
            boolean r1 = com.google.crypto.tink.shaded.protobuf.h0.c(r7, r0)     // Catch:{ C -> 0x0081 }
            if (r1 != 0) goto L_0x00b3
        L_0x008e:
            if (r14 >= r13) goto L_0x0098
            r0 = r12[r14]
            r8.m(r0, r10, r7)
            int r14 = r14 + 1
            goto L_0x008e
        L_0x0098:
            if (r7 == 0) goto L_0x009f
            r0 = r10
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.C0418x) r0
            r0.unknownFields = r7
        L_0x009f:
            return
        L_0x00a0:
            java.lang.Object r3 = r8.B(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.a r3 = (com.google.crypto.tink.shaded.protobuf.C0396a) r3     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r8.p(r2)     // Catch:{ C -> 0x0081 }
            r0.x(r15)     // Catch:{ C -> 0x0081 }
            r0.d(r3, r4, r11)     // Catch:{ C -> 0x0081 }
            r8.V(r10, r1, r2, r3)     // Catch:{ C -> 0x0081 }
        L_0x00b3:
            r16 = 0
            goto L_0x0011
        L_0x00b7:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 0
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            long r5 = r6.y()     // Catch:{ C -> 0x0081 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x00ce:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 0
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            int r5 = r6.x()     // Catch:{ C -> 0x0081 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x00e5:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 1
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            long r5 = r6.w()     // Catch:{ C -> 0x0081 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x00fc:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 5
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            int r5 = r6.v()     // Catch:{ C -> 0x0081 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x0113:
            r3 = 0
            r0.x(r3)     // Catch:{ C -> 0x0081 }
            int r3 = r6.p()     // Catch:{ C -> 0x0081 }
            r8.n(r2)     // Catch:{ C -> 0x0081 }
            long r4 = E(r4)     // Catch:{ C -> 0x0081 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r4, r3)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x012d:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 0
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            int r5 = r6.C()     // Catch:{ C -> 0x0081 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x0145:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.i r5 = r20.g()     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x0155:
            java.lang.Object r3 = r8.B(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.a r3 = (com.google.crypto.tink.shaded.protobuf.C0396a) r3     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.d0 r4 = r8.p(r2)     // Catch:{ C -> 0x0081 }
            r5 = 2
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            r0.e(r3, r4, r11)     // Catch:{ C -> 0x0081 }
            r8.V(r10, r1, r2, r3)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x016b:
            r8.O(r10, r4, r0)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x0173:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 0
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            boolean r5 = r6.m()     // Catch:{ C -> 0x0081 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x018b:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 5
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            int r5 = r6.q()     // Catch:{ C -> 0x0081 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x01a3:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 1
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            long r5 = r6.r()     // Catch:{ C -> 0x0081 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x01bb:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 0
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            int r5 = r6.t()     // Catch:{ C -> 0x0081 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x01d3:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 0
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            long r5 = r6.D()     // Catch:{ C -> 0x0081 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x01eb:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 0
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            long r5 = r6.u()     // Catch:{ C -> 0x0081 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x0203:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 5
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            float r5 = r6.s()     // Catch:{ C -> 0x0081 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x021b:
            long r3 = E(r4)     // Catch:{ C -> 0x0081 }
            r5 = 1
            r0.x(r5)     // Catch:{ C -> 0x0081 }
            double r5 = r6.o()     // Catch:{ C -> 0x0081 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ C -> 0x0081 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r5)     // Catch:{ C -> 0x0081 }
            r8.S(r1, r10, r2)     // Catch:{ C -> 0x0081 }
            goto L_0x00b3
        L_0x0233:
            java.lang.Object r1 = r8.o(r2)     // Catch:{ C -> 0x0081 }
            r8.x(r2, r10, r1)     // Catch:{ C -> 0x0081 }
            r16 = 0
            throw r16     // Catch:{ C -> 0x05d8 }
        L_0x023d:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x0261, all -> 0x025d }
            com.google.crypto.tink.shaded.protobuf.d0 r6 = r8.p(r2)     // Catch:{ C -> 0x0261, all -> 0x025d }
            r1 = r17
            r2 = r19
            r5 = r20
            r15 = r7
            r7 = r21
            r1.M(r2, r3, r5, r6, r7)     // Catch:{ C -> 0x025a, all -> 0x0256 }
        L_0x0253:
            r7 = r15
            goto L_0x0011
        L_0x0256:
            r0 = move-exception
            r7 = r15
            goto L_0x05fa
        L_0x025a:
            r7 = r15
            goto L_0x05d8
        L_0x025d:
            r0 = move-exception
            r15 = r7
            goto L_0x05fa
        L_0x0261:
            r15 = r7
            goto L_0x05d8
        L_0x0264:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.s(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0273:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.r(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0282:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.q(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0291:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.p(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x02a0:
            r15 = r7
            r16 = 0
            long r4 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r3 = r3.c(r10, r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.j(r3)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r8.n(r2)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            com.google.crypto.tink.shaded.protobuf.e0.z(r10, r1, r3, r15, r9)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x02b5:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.u(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x02c4:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.f(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x02d3:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.k(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x02e3:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.l(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x02f3:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.n(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0303:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.v(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0313:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.o(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0323:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.m(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0333:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.i(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0343:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.s(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0353:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.r(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0363:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.q(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0373:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.p(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0383:
            r15 = r7
            r16 = 0
            long r4 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r3 = r3.c(r10, r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.j(r3)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r8.n(r2)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            com.google.crypto.tink.shaded.protobuf.e0.z(r10, r1, r3, r15, r9)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0399:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.u(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x03a9:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.h(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x03b9:
            r15 = r7
            r16 = 0
            com.google.crypto.tink.shaded.protobuf.d0 r5 = r8.p(r2)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r1 = r17
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.N(r2, r3, r4, r5, r6)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x03ce:
            r15 = r7
            r16 = 0
            r8.P(r10, r4, r0)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x03d6:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.f(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x03e6:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.k(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x03f6:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.l(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0406:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.n(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0416:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.v(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0426:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.o(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0436:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.m(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0446:
            r15 = r7
            r16 = 0
            long r1 = E(r4)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            java.util.List r1 = r3.c(r10, r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            r0.i(r1)     // Catch:{ C -> 0x025a, all -> 0x0256 }
            goto L_0x0253
        L_0x0456:
            r16 = 0
            java.lang.Object r1 = r8.A(r2, r10)     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.a r1 = (com.google.crypto.tink.shaded.protobuf.C0396a) r1     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.d0 r3 = r8.p(r2)     // Catch:{ C -> 0x05d8 }
            r0.x(r15)     // Catch:{ C -> 0x05d8 }
            r0.d(r1, r3, r11)     // Catch:{ C -> 0x05d8 }
            r8.U(r2, r10, r1)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x046d:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            long r5 = r6.y()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.u(r10, r3, r5)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x0483:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            int r1 = r6.x()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.t(r3, r10, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x0499:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 1
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            long r5 = r6.w()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.u(r10, r3, r5)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x04af:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 5
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            int r1 = r6.v()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.t(r3, r10, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x04c5:
            r1 = 0
            r16 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            int r1 = r6.p()     // Catch:{ C -> 0x05d8 }
            r8.n(r2)     // Catch:{ C -> 0x05d8 }
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.t(r3, r10, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x04de:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            int r1 = r6.C()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.t(r3, r10, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x04f4:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.i r1 = r20.g()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.v(r10, r3, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x0506:
            r16 = 0
            java.lang.Object r1 = r8.A(r2, r10)     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.a r1 = (com.google.crypto.tink.shaded.protobuf.C0396a) r1     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.d0 r3 = r8.p(r2)     // Catch:{ C -> 0x05d8 }
            r4 = 2
            r0.x(r4)     // Catch:{ C -> 0x05d8 }
            r0.e(r1, r3, r11)     // Catch:{ C -> 0x05d8 }
            r8.U(r2, r10, r1)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x051e:
            r16 = 0
            r8.O(r10, r4, r0)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x0528:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            boolean r1 = r6.m()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.n(r10, r3, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x053e:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 5
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            int r1 = r6.q()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.t(r3, r10, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x0554:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 1
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            long r5 = r6.r()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.u(r10, r3, r5)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x056a:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            int r1 = r6.t()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.t(r3, r10, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x0580:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            long r5 = r6.D()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.u(r10, r3, r5)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x0596:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 0
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            long r5 = r6.u()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.u(r10, r3, r5)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x05ac:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 5
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            float r1 = r6.s()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.s(r10, r3, r1)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x05c2:
            r16 = 0
            long r3 = E(r4)     // Catch:{ C -> 0x05d8 }
            r1 = 1
            r0.x(r1)     // Catch:{ C -> 0x05d8 }
            double r5 = r6.o()     // Catch:{ C -> 0x05d8 }
            com.google.crypto.tink.shaded.protobuf.p0.r(r10, r3, r5)     // Catch:{ C -> 0x05d8 }
            r8.R(r2, r10)     // Catch:{ C -> 0x05d8 }
            goto L_0x0011
        L_0x05d8:
            r18.getClass()     // Catch:{ all -> 0x0023 }
            if (r7 != 0) goto L_0x05e2
            com.google.crypto.tink.shaded.protobuf.g0 r1 = com.google.crypto.tink.shaded.protobuf.h0.a(r19)     // Catch:{ all -> 0x0023 }
            r7 = r1
        L_0x05e2:
            boolean r1 = com.google.crypto.tink.shaded.protobuf.h0.c(r7, r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0011
        L_0x05e8:
            if (r14 >= r13) goto L_0x05f2
            r0 = r12[r14]
            r8.m(r0, r10, r7)
            int r14 = r14 + 1
            goto L_0x05e8
        L_0x05f2:
            if (r7 == 0) goto L_0x05f9
            r0 = r10
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.C0418x) r0
            r0.unknownFields = r7
        L_0x05f9:
            return
        L_0x05fa:
            if (r14 >= r13) goto L_0x0604
            r1 = r12[r14]
            r8.m(r1, r10, r7)
            int r14 = r14 + 1
            goto L_0x05fa
        L_0x0604:
            if (r7 == 0) goto L_0x060e
            r18.getClass()
            r1 = r10
            com.google.crypto.tink.shaded.protobuf.x r1 = (com.google.crypto.tink.shaded.protobuf.C0418x) r1
            r1.unknownFields = r7
        L_0x060e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.w(com.google.crypto.tink.shaded.protobuf.h0, java.lang.Object, com.google.crypto.tink.shaded.protobuf.l, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    public final void x(int i2, Object obj, Object obj2) {
        long X3 = (long) (X(i2) & 1048575);
        Object i5 = p0.f6845c.i(obj, X3);
        O o6 = this.f6779n;
        if (i5 != null) {
            o6.getClass();
            if (O.c(i5)) {
                N c3 = N.f6762b.c();
                O.d(c3, i5);
                p0.v(obj, X3, c3);
                i5 = c3;
            }
        } else {
            o6.getClass();
            i5 = N.f6762b.c();
            p0.v(obj, X3, i5);
        }
        o6.getClass();
        N n2 = (N) i5;
        C0552a.y(obj2);
        throw null;
    }

    public final void y(int i2, Object obj, Object obj2) {
        if (s(i2, obj2)) {
            long X3 = (long) (X(i2) & 1048575);
            Unsafe unsafe = f6768p;
            Object object = unsafe.getObject(obj2, X3);
            if (object != null) {
                d0 p6 = p(i2);
                if (!s(i2, obj)) {
                    if (!t(object)) {
                        unsafe.putObject(obj, X3, object);
                    } else {
                        Object i5 = p6.i();
                        p6.c(i5, object);
                        unsafe.putObject(obj, X3, i5);
                    }
                    R(i2, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, X3);
                if (!t(object2)) {
                    Object i6 = p6.i();
                    p6.c(i6, object2);
                    unsafe.putObject(obj, X3, i6);
                    object2 = i6;
                }
                p6.c(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.f6769a[i2] + " is present but null: " + obj2);
        }
    }

    public final void z(int i2, Object obj, Object obj2) {
        int[] iArr = this.f6769a;
        int i5 = iArr[i2];
        if (u(i5, obj2, i2)) {
            long X3 = (long) (X(i2) & 1048575);
            Unsafe unsafe = f6768p;
            Object object = unsafe.getObject(obj2, X3);
            if (object != null) {
                d0 p6 = p(i2);
                if (!u(i5, obj, i2)) {
                    if (!t(object)) {
                        unsafe.putObject(obj, X3, object);
                    } else {
                        Object i6 = p6.i();
                        p6.c(i6, object);
                        unsafe.putObject(obj, X3, i6);
                    }
                    S(i5, obj, i2);
                    return;
                }
                Object object2 = unsafe.getObject(obj, X3);
                if (!t(object2)) {
                    Object i7 = p6.i();
                    p6.c(i7, object2);
                    unsafe.putObject(obj, X3, i7);
                    object2 = i7;
                }
                p6.c(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
        }
    }
}
