package c4;

import Z3.e;
import Z3.f;
import Z3.i;
import Z3.j;
import Z3.p;
import b4.h;
import b4.k;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import h0.C0552a;
import h4.C0566a;
import h4.C0567b;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import q.C0928e;

public final class g extends p {

    /* renamed from: b  reason: collision with root package name */
    public static final f f5640b = new f(new g(0), 0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5641a;

    public /* synthetic */ g(int i2) {
        this.f5641a = i2;
    }

    public static f c(C0566a aVar, int i2) {
        int c3 = C0928e.c(i2);
        if (c3 == 5) {
            return new j(aVar.A());
        }
        if (c3 == 6) {
            return new j((Number) new h(aVar.A()));
        }
        if (c3 == 7) {
            return new j(Boolean.valueOf(aVar.s()));
        }
        if (c3 == 8) {
            aVar.y();
            return Z3.h.f4527a;
        }
        throw new IllegalStateException("Unexpected token: ".concat(a.y(i2)));
    }

    public static void d(C0567b bVar, f fVar) {
        boolean z3;
        if (fVar == null || (fVar instanceof Z3.h)) {
            bVar.p();
            return;
        }
        boolean z4 = fVar instanceof j;
        if (!z4) {
            boolean z5 = fVar instanceof e;
            if (z5) {
                bVar.d();
                if (z5) {
                    Iterator it2 = ((e) fVar).f4526a.iterator();
                    while (it2.hasNext()) {
                        d(bVar, (f) it2.next());
                    }
                    bVar.l();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + fVar);
            }
            boolean z6 = fVar instanceof i;
            if (z6) {
                bVar.j();
                if (z6) {
                    Iterator it3 = ((b4.j) ((i) fVar).f4528a.entrySet()).iterator();
                    while (((b4.i) it3).hasNext()) {
                        k b6 = ((b4.i) it3).b();
                        bVar.n((String) b6.getKey());
                        d(bVar, (f) b6.getValue());
                    }
                    bVar.m();
                    return;
                }
                throw new IllegalStateException("Not a JSON Object: " + fVar);
            }
            throw new IllegalArgumentException("Couldn't write " + fVar.getClass());
        } else if (z4) {
            j jVar = (j) fVar;
            Serializable serializable = jVar.f4529a;
            if (serializable instanceof Number) {
                bVar.u(jVar.k());
            } else if (serializable instanceof Boolean) {
                if (serializable instanceof Boolean) {
                    z3 = ((Boolean) serializable).booleanValue();
                } else {
                    z3 = Boolean.parseBoolean(jVar.t());
                }
                bVar.w(z3);
            } else {
                bVar.v(jVar.t());
            }
        } else {
            throw new IllegalStateException("Not a JSON Primitive: " + fVar);
        }
    }

    public final Object a(C0566a aVar) {
        String str;
        String str2;
        f fVar;
        String str3;
        f fVar2;
        boolean z3;
        boolean z4;
        switch (this.f5641a) {
            case 0:
                int C6 = aVar.C();
                int c3 = C0928e.c(C6);
                if (c3 == 5 || c3 == 6) {
                    return new h(aVar.A());
                }
                if (c3 == 8) {
                    aVar.y();
                    return null;
                }
                throw new RuntimeException("Expecting number, got: " + a.y(C6) + "; at path " + aVar.o(false));
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.p()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.u()));
                    } catch (NumberFormatException e6) {
                        throw new RuntimeException(e6);
                    }
                }
                aVar.l();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            case 2:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.v());
                } catch (NumberFormatException e7) {
                    throw new RuntimeException(e7);
                }
            case 3:
                if (aVar.C() != 9) {
                    return Float.valueOf((float) aVar.t());
                }
                aVar.y();
                return null;
            case 4:
                if (aVar.C() != 9) {
                    return Double.valueOf(aVar.t());
                }
                aVar.y();
                return null;
            case 5:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A6 = aVar.A();
                if (A6.length() == 1) {
                    return Character.valueOf(A6.charAt(0));
                }
                StringBuilder t6 = C0552a.t("Expecting character, got: ", A6, "; at ");
                t6.append(aVar.o(true));
                throw new RuntimeException(t6.toString());
            case zzaky.zzf.zzf /*6*/:
                int C7 = aVar.C();
                if (C7 == 9) {
                    aVar.y();
                    return null;
                } else if (C7 == 8) {
                    return Boolean.toString(aVar.s());
                } else {
                    return aVar.A();
                }
            case zzaky.zzf.zzg /*7*/:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A7 = aVar.A();
                try {
                    return new BigDecimal(A7);
                } catch (NumberFormatException e8) {
                    StringBuilder t7 = C0552a.t("Failed parsing '", A7, "' as BigDecimal; at path ");
                    t7.append(aVar.o(true));
                    throw new RuntimeException(t7.toString(), e8);
                }
            case 8:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A8 = aVar.A();
                try {
                    return new BigInteger(A8);
                } catch (NumberFormatException e9) {
                    StringBuilder t8 = C0552a.t("Failed parsing '", A8, "' as BigInteger; at path ");
                    t8.append(aVar.o(true));
                    throw new RuntimeException(t8.toString(), e9);
                }
            case 9:
                if (aVar.C() != 9) {
                    return new h(aVar.A());
                }
                aVar.y();
                return null;
            case 10:
                if (aVar.C() != 9) {
                    return new StringBuilder(aVar.A());
                }
                aVar.y();
                return null;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (aVar.C() != 9) {
                    return new StringBuffer(aVar.A());
                }
                aVar.y();
                return null;
            case 13:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A9 = aVar.A();
                if ("null".equals(A9)) {
                    return null;
                }
                return new URL(A9);
            case 14:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                try {
                    String A10 = aVar.A();
                    if ("null".equals(A10)) {
                        return null;
                    }
                    return new URI(A10);
                } catch (URISyntaxException e10) {
                    throw new RuntimeException(e10);
                }
            case 15:
                if (aVar.C() != 9) {
                    return InetAddress.getByName(aVar.A());
                }
                aVar.y();
                return null;
            case 16:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A11 = aVar.A();
                try {
                    return UUID.fromString(A11);
                } catch (IllegalArgumentException e11) {
                    StringBuilder t9 = C0552a.t("Failed parsing '", A11, "' as UUID; at path ");
                    t9.append(aVar.o(true));
                    throw new RuntimeException(t9.toString(), e11);
                }
            case 17:
                String A12 = aVar.A();
                try {
                    return Currency.getInstance(A12);
                } catch (IllegalArgumentException e12) {
                    StringBuilder t10 = C0552a.t("Failed parsing '", A12, "' as Currency; at path ");
                    t10.append(aVar.o(true));
                    throw new RuntimeException(t10.toString(), e12);
                }
            case 18:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                aVar.d();
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (aVar.C() != 4) {
                    String w6 = aVar.w();
                    int u6 = aVar.u();
                    if ("year".equals(w6)) {
                        i5 = u6;
                    } else if ("month".equals(w6)) {
                        i6 = u6;
                    } else if ("dayOfMonth".equals(w6)) {
                        i7 = u6;
                    } else if ("hourOfDay".equals(w6)) {
                        i8 = u6;
                    } else if ("minute".equals(w6)) {
                        i9 = u6;
                    } else if ("second".equals(w6)) {
                        i10 = u6;
                    }
                }
                aVar.m();
                return new GregorianCalendar(i5, i6, i7, i8, i9, i10);
            case 19:
                String str4 = null;
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.A(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str4 = stringTokenizer.nextToken();
                }
                if (str2 == null && str4 == null) {
                    return new Locale(str);
                }
                if (str4 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str4);
            case 20:
                int C8 = aVar.C();
                int c6 = C0928e.c(C8);
                if (c6 == 0) {
                    aVar.c();
                    fVar = new e();
                } else if (c6 != 2) {
                    fVar = null;
                } else {
                    aVar.d();
                    fVar = new i();
                }
                if (fVar == null) {
                    return c(aVar, C8);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (aVar.p()) {
                        if (fVar instanceof i) {
                            str3 = aVar.w();
                        } else {
                            str3 = null;
                        }
                        int C9 = aVar.C();
                        int c7 = C0928e.c(C9);
                        if (c7 == 0) {
                            aVar.c();
                            fVar2 = new e();
                        } else if (c7 != 2) {
                            fVar2 = null;
                        } else {
                            aVar.d();
                            fVar2 = new i();
                        }
                        if (fVar2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fVar2 == null) {
                            fVar2 = c(aVar, C9);
                        }
                        if (fVar instanceof e) {
                            ((e) fVar).f4526a.add(fVar2);
                        } else {
                            ((i) fVar).f4528a.put(str3, fVar2);
                        }
                        if (z3) {
                            arrayDeque.addLast(fVar);
                            fVar = fVar2;
                        }
                    } else {
                        if (fVar instanceof e) {
                            aVar.l();
                        } else {
                            aVar.m();
                        }
                        if (arrayDeque.isEmpty()) {
                            return fVar;
                        }
                        fVar = (f) arrayDeque.removeLast();
                    }
                }
            case 21:
                BitSet bitSet = new BitSet();
                aVar.c();
                int C10 = aVar.C();
                int i11 = 0;
                while (C10 != 2) {
                    int c8 = C0928e.c(C10);
                    if (c8 == 5 || c8 == 6) {
                        int u7 = aVar.u();
                        if (u7 == 0) {
                            z4 = false;
                        } else if (u7 == 1) {
                            z4 = true;
                        } else {
                            StringBuilder s6 = C0552a.s(u7, "Invalid bitset value ", ", expected 0 or 1; at path ");
                            s6.append(aVar.o(true));
                            throw new RuntimeException(s6.toString());
                        }
                    } else if (c8 == 7) {
                        z4 = aVar.s();
                    } else {
                        throw new RuntimeException("Invalid bitset value type: " + a.y(C10) + "; at path " + aVar.o(false));
                    }
                    if (z4) {
                        bitSet.set(i11);
                    }
                    i11++;
                    C10 = aVar.C();
                }
                aVar.l();
                return bitSet;
            case 22:
                int C11 = aVar.C();
                if (C11 == 9) {
                    aVar.y();
                    return null;
                } else if (C11 == 6) {
                    return Boolean.valueOf(Boolean.parseBoolean(aVar.A()));
                } else {
                    return Boolean.valueOf(aVar.s());
                }
            case 23:
                if (aVar.C() != 9) {
                    return Boolean.valueOf(aVar.A());
                }
                aVar.y();
                return null;
            case 24:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                try {
                    int u8 = aVar.u();
                    if (u8 <= 255 && u8 >= -128) {
                        return Byte.valueOf((byte) u8);
                    }
                    StringBuilder s7 = C0552a.s(u8, "Lossy conversion from ", " to byte; at path ");
                    s7.append(aVar.o(true));
                    throw new RuntimeException(s7.toString());
                } catch (NumberFormatException e13) {
                    throw new RuntimeException(e13);
                }
            case 25:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                try {
                    int u9 = aVar.u();
                    if (u9 <= 65535 && u9 >= -32768) {
                        return Short.valueOf((short) u9);
                    }
                    StringBuilder s8 = C0552a.s(u9, "Lossy conversion from ", " to short; at path ");
                    s8.append(aVar.o(true));
                    throw new RuntimeException(s8.toString());
                } catch (NumberFormatException e14) {
                    throw new RuntimeException(e14);
                }
            case 26:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.u());
                } catch (NumberFormatException e15) {
                    throw new RuntimeException(e15);
                }
            case 27:
                try {
                    return new AtomicInteger(aVar.u());
                } catch (NumberFormatException e16) {
                    throw new RuntimeException(e16);
                }
            default:
                return new AtomicBoolean(aVar.s());
        }
    }

    public final void b(C0567b bVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        switch (this.f5641a) {
            case 0:
                bVar.u((Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                bVar.d();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    bVar.t((long) atomicIntegerArray.get(i2));
                }
                bVar.l();
                return;
            case 2:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.p();
                    return;
                } else {
                    bVar.t(number.longValue());
                    return;
                }
            case 3:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.p();
                    return;
                }
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(number2.floatValue());
                }
                bVar.u(number2);
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    bVar.p();
                    return;
                } else {
                    bVar.s(number3.doubleValue());
                    return;
                }
            case 5:
                Character ch = (Character) obj;
                if (ch == null) {
                    str = null;
                } else {
                    str = String.valueOf(ch);
                }
                bVar.v(str);
                return;
            case zzaky.zzf.zzf /*6*/:
                bVar.v((String) obj);
                return;
            case zzaky.zzf.zzg /*7*/:
                bVar.u((BigDecimal) obj);
                return;
            case 8:
                bVar.u((BigInteger) obj);
                return;
            case 9:
                bVar.u((h) obj);
                return;
            case 10:
                StringBuilder sb = (StringBuilder) obj;
                if (sb == null) {
                    str2 = null;
                } else {
                    str2 = sb.toString();
                }
                bVar.v(str2);
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer == null) {
                    str3 = null;
                } else {
                    str3 = stringBuffer.toString();
                }
                bVar.v(str3);
                return;
            case 13:
                URL url = (URL) obj;
                if (url == null) {
                    str4 = null;
                } else {
                    str4 = url.toExternalForm();
                }
                bVar.v(str4);
                return;
            case 14:
                URI uri = (URI) obj;
                if (uri == null) {
                    str5 = null;
                } else {
                    str5 = uri.toASCIIString();
                }
                bVar.v(str5);
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    str6 = null;
                } else {
                    str6 = inetAddress.getHostAddress();
                }
                bVar.v(str6);
                return;
            case 16:
                UUID uuid = (UUID) obj;
                if (uuid == null) {
                    str7 = null;
                } else {
                    str7 = uuid.toString();
                }
                bVar.v(str7);
                return;
            case 17:
                bVar.v(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    bVar.p();
                    return;
                }
                bVar.j();
                bVar.n("year");
                bVar.t((long) calendar.get(1));
                bVar.n("month");
                bVar.t((long) calendar.get(2));
                bVar.n("dayOfMonth");
                bVar.t((long) calendar.get(5));
                bVar.n("hourOfDay");
                bVar.t((long) calendar.get(11));
                bVar.n("minute");
                bVar.t((long) calendar.get(12));
                bVar.n("second");
                bVar.t((long) calendar.get(13));
                bVar.m();
                return;
            case 19:
                Locale locale = (Locale) obj;
                if (locale == null) {
                    str8 = null;
                } else {
                    str8 = locale.toString();
                }
                bVar.v(str8);
                return;
            case 20:
                d(bVar, (f) obj);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                bVar.d();
                int length2 = bitSet.length();
                for (int i5 = 0; i5 < length2; i5++) {
                    bVar.t(bitSet.get(i5) ? 1 : 0);
                }
                bVar.l();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    bVar.p();
                    return;
                }
                bVar.x();
                bVar.c();
                if (bool.booleanValue()) {
                    str9 = "true";
                } else {
                    str9 = "false";
                }
                bVar.f8170a.write(str9);
                return;
            case 23:
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null) {
                    str10 = "null";
                } else {
                    str10 = bool2.toString();
                }
                bVar.v(str10);
                return;
            case 24:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    bVar.p();
                    return;
                } else {
                    bVar.t((long) number4.byteValue());
                    return;
                }
            case 25:
                Number number5 = (Number) obj;
                if (number5 == null) {
                    bVar.p();
                    return;
                } else {
                    bVar.t((long) number5.shortValue());
                    return;
                }
            case 26:
                Number number6 = (Number) obj;
                if (number6 == null) {
                    bVar.p();
                    return;
                } else {
                    bVar.t((long) number6.intValue());
                    return;
                }
            case 27:
                bVar.t((long) ((AtomicInteger) obj).get());
                return;
            default:
                bVar.w(((AtomicBoolean) obj).get());
                return;
        }
    }
}
