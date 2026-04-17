package x3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

public abstract class a {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String str2;
        String str3;
        int i2 = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e6) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb2);
                    if (valueOf.length() != 0) {
                        str3 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str3 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str3, e6);
                    String name2 = e6.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + String.valueOf(sb2).length() + 9);
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i5] = str2;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + str.length());
        int i6 = 0;
        while (i2 < objArr.length && (indexOf = str.indexOf("%s", i6)) != -1) {
            sb4.append(str, i6, indexOf);
            sb4.append(objArr[i2]);
            i6 = indexOf + 2;
            i2++;
        }
        sb4.append(str, i6, str.length());
        if (i2 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i2]);
            for (int i7 = i2 + 1; i7 < objArr.length; i7++) {
                sb4.append(", ");
                sb4.append(objArr[i7]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static HashMap b(String str) {
        try {
            return f(new JSONObject(str));
        } catch (JSONException e6) {
            throw new IOException(e6);
        }
    }

    public static String c(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e6) {
                throw new IOException("Could not serialize number", e6);
            }
        } else if (!(obj instanceof Boolean)) {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                d(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (JSONException e7) {
                throw new IOException("Failed to serialize JSON", e7);
            }
        } else if (((Boolean) obj).booleanValue()) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void d(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                d(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (obj instanceof Collection) {
            jSONStringer.array();
            for (Object d : (Collection) obj) {
                d(d, jSONStringer);
            }
            jSONStringer.endArray();
        } else {
            jSONStringer.value(obj);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof JSONObject) {
            return f((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(e(jSONArray.get(i2)));
            }
            return arrayList;
        } else if (obj.equals(JSONObject.NULL)) {
            return null;
        } else {
            return obj;
        }
    }

    public static HashMap f(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, e(jSONObject.get(next)));
        }
        return hashMap;
    }
}
