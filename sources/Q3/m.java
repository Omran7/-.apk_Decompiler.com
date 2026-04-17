package q3;

import h0.C0552a;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import n3.C0866g;
import v3.C1048c;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f11101a = Pattern.compile("[\\[\\]\\.#$]");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f11102b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static void a(String str) {
        if (str != null && !str.equals(".info") && f11102b.matcher(str).find() && !str.equals("[MAX_KEY]") && !str.equals("[MIN_NAME]")) {
            throw new RuntimeException(C0552a.o("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
        }
    }

    public static void b(String str) {
        if (f11101a.matcher(str).find()) {
            throw new RuntimeException(C0552a.o("Invalid Firebase Database path: ", str, ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'"));
        }
    }

    public static void c(String str) {
        if (str.startsWith(".info")) {
            b(str.substring(5));
        } else if (str.startsWith("/.info")) {
            b(str.substring(6));
        } else {
            b(str);
        }
    }

    public static void d(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.containsKey(".sv")) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null || str.length() <= 0 || (!str.equals(".value") && !str.equals(".priority") && (str.startsWith(".") || f11102b.matcher(str).find()))) {
                        throw new RuntimeException(C0552a.o("Invalid key: ", str, ". Keys must not contain '/', '.', '#', '$', '[', or ']'"));
                    }
                    d(entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            for (Object d : (List) obj) {
                d(d);
            }
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            double doubleValue = ((Double) obj).doubleValue();
            if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                throw new RuntimeException("Invalid value: Value cannot be NaN, Inf or -Inf.");
            }
        }
    }

    public static void e(C0866g gVar) {
        C1048c z3 = gVar.z();
        if (z3 != null && z3.f12280a.startsWith(".")) {
            throw new RuntimeException("Invalid write location: " + gVar.toString());
        }
    }
}
