package H3;

import D0.h;
import D0.i;
import I0.E;
import I0.F;
import I0.p;
import K1.b;
import K1.c;
import P2.k;
import T1.C0167f;
import T1.H;
import V0.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import android.view.View;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.internal.measurement.zzrj;
import com.google.android.gms.internal.measurement.zzrp;
import java.nio.ByteBuffer;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.j;
import o3.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements a, p, F, b, c, k, C0167f, T1.F {

    /* renamed from: b  reason: collision with root package name */
    public static f f1015b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1016a;

    public /* synthetic */ f(int i2) {
        this.f1016a = i2;
    }

    public static Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("@type")) {
                String optString = jSONObject.optString("@type");
                String optString2 = jSONObject.optString("value");
                if (j.a(optString, "type.googleapis.com/google.protobuf.Int64Value")) {
                    try {
                        j.d(optString2, "value");
                        return Long.valueOf(Long.parseLong(optString2));
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(d.i("Invalid Long format:", optString2));
                    }
                } else if (j.a(optString, "type.googleapis.com/google.protobuf.UInt64Value")) {
                    try {
                        j.d(optString2, "value");
                        return Long.valueOf(Long.parseLong(optString2));
                    } catch (NumberFormatException unused2) {
                        throw new IllegalArgumentException(d.i("Invalid Long format:", optString2));
                    }
                }
            }
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object d = d(jSONObject.opt(next));
                j.d(next, "key");
                hashMap.put(next, d);
            }
            return hashMap;
        } else if (obj instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(d(jSONArray.opt(i2)));
            }
            return arrayList;
        } else if (obj == JSONObject.NULL) {
            return null;
        } else {
            throw new IllegalArgumentException("Object cannot be decoded from JSON: " + obj);
        }
    }

    public static Object i(Object obj) {
        boolean z3;
        boolean z4;
        if (obj == null || obj == JSONObject.NULL) {
            Object obj2 = JSONObject.NULL;
            j.d(obj2, "NULL");
            return obj2;
        } else if (obj instanceof Long) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@type", "type.googleapis.com/google.protobuf.Int64Value");
                jSONObject.put("value", String.valueOf(((Number) obj).longValue()));
                return jSONObject;
            } catch (JSONException e6) {
                throw new RuntimeException("Error encoding Long.", e6);
            }
        } else if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) || ((z3 = obj instanceof JSONObject)) || ((z4 = obj instanceof JSONArray))) {
            return obj;
        } else {
            if (obj instanceof Map) {
                JSONObject jSONObject2 = new JSONObject();
                Map map = (Map) obj;
                for (Object next : map.keySet()) {
                    if (next instanceof String) {
                        try {
                            jSONObject2.put((String) next, i(map.get(next)));
                        } catch (JSONException e7) {
                            throw new RuntimeException(e7);
                        }
                    } else {
                        throw new IllegalArgumentException("Object keys must be strings.");
                    }
                }
                return jSONObject2;
            } else if (obj instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object i2 : (List) obj) {
                    jSONArray.put(i(i2));
                }
                return jSONArray;
            } else if (z3) {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = (JSONObject) obj;
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next2 = keys.next();
                    if (next2 != null) {
                        try {
                            jSONObject3.put(next2, i(jSONObject4.opt(next2)));
                        } catch (JSONException e8) {
                            throw new RuntimeException(e8);
                        }
                    } else {
                        throw new IllegalArgumentException("Object keys cannot be null.");
                    }
                }
                return jSONObject3;
            } else if (z4) {
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = (JSONArray) obj;
                int length = jSONArray3.length();
                for (int i5 = 0; i5 < length; i5++) {
                    jSONArray2.put(i(jSONArray3.opt(i5)));
                }
                return jSONArray2;
            } else {
                throw new IllegalArgumentException("Object cannot be encoded in JSON: " + obj);
            }
        }
    }

    public String a(String str, String str2) {
        return null;
    }

    public Object b(String str, Provider provider) {
        switch (this.f1016a) {
            case 15:
                if (provider == null) {
                    return KeyAgreement.getInstance(str);
                }
                return KeyAgreement.getInstance(str, provider);
            case 16:
                if (provider == null) {
                    return KeyPairGenerator.getInstance(str);
                }
                return KeyPairGenerator.getInstance(str, provider);
            default:
                if (provider == null) {
                    return MessageDigest.getInstance(str);
                }
                return MessageDigest.getInstance(str, provider);
        }
    }

    public int e(Context context, String str) {
        return K1.d.a(context, str);
    }

    public int f(Context context, String str, boolean z3) {
        return K1.d.d(context, str, z3);
    }

    public h g(Context context, String str, b bVar) {
        int i2;
        h hVar = new h();
        int e6 = bVar.e(context, str);
        hVar.f499a = e6;
        int i5 = 1;
        int i6 = 0;
        if (e6 != 0) {
            i2 = bVar.f(context, str, false);
            hVar.f500b = i2;
        } else {
            i2 = bVar.f(context, str, true);
            hVar.f500b = i2;
        }
        int i7 = hVar.f499a;
        if (i7 != 0) {
            i6 = i7;
        } else if (i2 == 0) {
            i5 = 0;
            hVar.f501c = i5;
            return hVar;
        }
        if (i6 >= i2) {
            i5 = -1;
        }
        hVar.f501c = i5;
        return hVar;
    }

    public Object j() {
        try {
            return new i(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException(e6);
        }
    }

    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f1016a) {
            case 8:
                mediaMetadataRetriever.setDataSource(new E((ByteBuffer) obj));
                return;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
        }
    }

    public void m(MediaExtractor mediaExtractor, Object obj) {
        switch (this.f1016a) {
            case 8:
                mediaExtractor.setDataSource(new E((ByteBuffer) obj));
                return;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
        }
    }

    public Object zza() {
        switch (this.f1016a) {
            case 20:
                List list = H.f2892a;
                return Boolean.valueOf(zzpq.zzc());
            case 21:
                List list2 = H.f2892a;
                return Boolean.valueOf(zzpq.zze());
            case 22:
                List list3 = H.f2892a;
                return Boolean.valueOf(zzrp.zzc());
            case 23:
                List list4 = H.f2892a;
                return Integer.valueOf((int) zzpe.zza());
            case 24:
                List list5 = H.f2892a;
                return Boolean.valueOf(zzpn.zzd());
            case 25:
                List list6 = H.f2892a;
                return Boolean.valueOf(zzrd.zzc());
            case 26:
                List list7 = H.f2892a;
                return Boolean.valueOf(zzrj.zzd());
            case 27:
                List list8 = H.f2892a;
                return Boolean.valueOf(zzrj.zzi());
            case 28:
                List list9 = H.f2892a;
                return Boolean.valueOf(zzrj.zzg());
            default:
                List list10 = H.f2892a;
                return Boolean.valueOf(zzrj.zzc());
        }
    }

    public f() {
        this.f1016a = 6;
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public f(View view) {
        this.f1016a = 10;
    }

    public void h() {
    }

    public void c(C0.b bVar, Bitmap bitmap) {
    }
}
