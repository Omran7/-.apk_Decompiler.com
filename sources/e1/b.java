package E1;

import D1.a;
import G1.c;
import G1.d;
import android.util.Base64;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class b {
    public static final void b(StringBuilder sb, a aVar, Object obj) {
        int i2 = aVar.f588b;
        if (i2 == 11) {
            Class cls = aVar.f593q;
            I.g(cls);
            sb.append(((b) cls.cast(obj)).toString());
        } else if (i2 == 7) {
            sb.append("\"");
            sb.append(d.a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    public static final Object zaD(a aVar, Object obj) {
        a aVar2 = aVar.f596t;
        if (aVar2 == null) {
            return obj;
        }
        String str = (String) aVar2.f506c.get(((Integer) obj).intValue());
        if (str != null || !aVar2.f505b.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    public final void a(a aVar, Object obj) {
        int i2 = aVar.d;
        a aVar2 = aVar.f596t;
        I.g(aVar2);
        HashMap hashMap = aVar2.f505b;
        Integer num = (Integer) hashMap.get((String) obj);
        if (num == null) {
            num = (Integer) hashMap.get("gms_unknown");
        }
        I.g(num);
        String str = aVar.f591f;
        switch (i2) {
            case 0:
                setIntegerInternal(aVar, str, num.intValue());
                return;
            case 1:
                zaf(aVar, str, (BigInteger) num);
                return;
            case 2:
                setLongInternal(aVar, str, ((Long) num).longValue());
                return;
            case 4:
                zan(aVar, str, ((Double) num).doubleValue());
                return;
            case 5:
                zab(aVar, str, (BigDecimal) num);
                return;
            case zzaky.zzf.zzf /*6*/:
                setBooleanInternal(aVar, str, ((Boolean) num).booleanValue());
                return;
            case zzaky.zzf.zzg /*7*/:
                setStringInternal(aVar, str, (String) num);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(aVar, str, (byte[]) num);
                return;
            default:
                throw new IllegalStateException(com.google.android.gms.internal.measurement.a.f(i2, "Unsupported type for conversion: "));
        }
    }

    public <T extends b> void addConcreteTypeArrayInternal(a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends b> void addConcreteTypeInternal(a aVar, String str, T t6) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, a> getFieldMappings();

    public Object getFieldValue(a aVar) {
        boolean z3;
        String str = aVar.f591f;
        if (aVar.f593q == null) {
            return getValueObject(str);
        }
        if (getValueObject(str) == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            try {
                return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), (Class[]) null).invoke(this, (Object[]) null);
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        } else {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + aVar.f591f);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(a aVar) {
        if (aVar.d != 11) {
            return isPrimitiveFieldSet(aVar.f591f);
        }
        if (aVar.f590e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(a aVar, String str, boolean z3) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(a aVar, String str, int i2) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(a aVar, String str, long j6) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, a> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String next : fieldMappings.keySet()) {
            a aVar = fieldMappings.get(next);
            if (isFieldSet(aVar)) {
                Object zaD = zaD(aVar, getFieldValue(aVar));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (zaD != null) {
                    switch (aVar.d) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 0));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64.encodeToString((byte[]) zaD, 10));
                            sb.append("\"");
                            break;
                        case 10:
                            c.h(sb, (HashMap) zaD);
                            break;
                        default:
                            if (!aVar.f589c) {
                                b(sb, aVar, zaD);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (i2 > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i2);
                                    if (obj != null) {
                                        b(sb, aVar, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    public final void zaA(a aVar, String str) {
        if (aVar.f596t != null) {
            a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f591f, str);
        }
    }

    public final void zaB(a aVar, Map map) {
        if (aVar.f596t != null) {
            a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f591f, map);
        }
    }

    public final void zaC(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f591f, arrayList);
        }
    }

    public final void zaa(a aVar, BigDecimal bigDecimal) {
        if (aVar.f596t != null) {
            a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f591f, bigDecimal);
        }
    }

    public void zab(a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f591f, arrayList);
        }
    }

    public void zad(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(a aVar, BigInteger bigInteger) {
        if (aVar.f596t != null) {
            a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f591f, bigInteger);
        }
    }

    public void zaf(a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f591f, arrayList);
        }
    }

    public void zah(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(a aVar, boolean z3) {
        if (aVar.f596t != null) {
            a(aVar, Boolean.valueOf(z3));
        } else {
            setBooleanInternal(aVar, aVar.f591f, z3);
        }
    }

    public final void zaj(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f591f, arrayList);
        }
    }

    public void zak(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(a aVar, byte[] bArr) {
        if (aVar.f596t != null) {
            a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f591f, bArr);
        }
    }

    public final void zam(a aVar, double d) {
        if (aVar.f596t != null) {
            a(aVar, Double.valueOf(d));
        } else {
            zan(aVar, aVar.f591f, d);
        }
    }

    public void zan(a aVar, String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f591f, arrayList);
        }
    }

    public void zap(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(a aVar, float f6) {
        if (aVar.f596t != null) {
            a(aVar, Float.valueOf(f6));
        } else {
            zar(aVar, aVar.f591f, f6);
        }
    }

    public void zar(a aVar, String str, float f6) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f591f, arrayList);
        }
    }

    public void zat(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(a aVar, int i2) {
        if (aVar.f596t != null) {
            a(aVar, Integer.valueOf(i2));
        } else {
            setIntegerInternal(aVar, aVar.f591f, i2);
        }
    }

    public final void zav(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f591f, arrayList);
        }
    }

    public void zaw(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(a aVar, long j6) {
        if (aVar.f596t != null) {
            a(aVar, Long.valueOf(j6));
        } else {
            setLongInternal(aVar, aVar.f591f, j6);
        }
    }

    public final void zay(a aVar, ArrayList arrayList) {
        if (aVar.f596t != null) {
            a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f591f, arrayList);
        }
    }

    public void zaz(a aVar, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
