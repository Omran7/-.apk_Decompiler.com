package w5;

import D5.c;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.j;

public abstract class a {
    public static String a(int i2, int i5, String str) {
        if (i2 < 0) {
            return x3.a.a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i5 >= 0) {
            return x3.a.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void b(int i2, int i5) {
        String str;
        if (i2 < 0 || i2 >= i5) {
            if (i2 < 0) {
                str = x3.a.a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (i5 >= 0) {
                str = x3.a.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i5));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i5);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void c(int i2, int i5) {
        if (i2 < 0 || i2 > i5) {
            throw new IndexOutOfBoundsException(a(i2, i5, "index"));
        }
    }

    public static void d(int i2, int i5, int i6) {
        String str;
        if (i2 < 0 || i5 < i2 || i5 > i6) {
            if (i2 < 0 || i2 > i6) {
                str = a(i2, i6, "start index");
            } else if (i5 < 0 || i5 > i6) {
                str = a(i5, i6, "end index");
            } else {
                str = x3.a.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static final Class e(c cVar) {
        j.e(cVar, "<this>");
        Class a6 = ((d) cVar).a();
        if (!a6.isPrimitive()) {
            return a6;
        }
        String name = a6.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return a6;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return a6;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return a6;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return a6;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return a6;
                }
                return Long.class;
            case 3625364:
                if (!name.equals("void")) {
                    return a6;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return a6;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return a6;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return a6;
                }
                return Short.class;
            default:
                return a6;
        }
    }
}
