package f3;

import C1.a;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.e;
import n.j;
import o3.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: f3.l  reason: case insensitive filesystem */
public abstract class C0535l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7944a = new a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        byte[] bArr;
        I.d(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        int size = zza.size();
        a aVar = f7944a;
        if (size < 2) {
            aVar.c(d.i("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = zza.get(1);
        try {
            if (str2 == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(str2, 11);
            }
            e d = d(new String(bArr, "UTF-8"));
            if (d == null) {
                return new HashMap();
            }
            return d;
        } catch (UnsupportedEncodingException e6) {
            aVar.b("Unable to decode token", e6, new Object[0]);
            return new HashMap();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n.e, n.j] */
    public static e c(JSONObject jSONObject) {
        ? jVar = new j(0);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            }
            jVar.put(next, obj);
        }
        return jVar;
    }

    public static e d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e6) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaag(e6);
        }
    }
}
