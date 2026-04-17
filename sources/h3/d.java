package H3;

import F3.k;
import G1.f;
import U3.b;
import Z2.h;
import android.util.Base64OutputStream;
import androidx.fragment.app.D;
import d3.C0467c;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1010b;

    public /* synthetic */ d(e eVar, int i2) {
        this.f1009a = i2;
        this.f1010b = eVar;
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [java.lang.Object, d3.a] */
    public final Object call() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.f1009a) {
            case 0:
                e eVar = (e) this.f1010b;
                synchronized (eVar) {
                    try {
                        i iVar = (i) eVar.f1011a.get();
                        ArrayList c3 = iVar.c();
                        iVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < c3.size(); i2++) {
                            a aVar = (a) c3.get(i2);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f1002a);
                            jSONObject.put("dates", new JSONArray(aVar.f1003b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            case 1:
                e eVar2 = (e) this.f1010b;
                synchronized (eVar2) {
                    ((i) eVar2.f1011a.get()).h(((b) eVar2.f1013c.get()).a(), System.currentTimeMillis());
                }
                return null;
            default:
                C0467c cVar = (C0467c) this.f1010b;
                cVar.getClass();
                byte[] bytes = new JSONObject().toString().getBytes("UTF-8");
                k kVar = cVar.f7528c;
                kVar.getClass();
                h hVar = cVar.f7530f;
                if (hVar.f4506b <= System.currentTimeMillis()) {
                    JSONObject jSONObject3 = new JSONObject(kVar.l(new URL("https://firebaseappcheck.googleapis.com/v1/projects/" + ((String) kVar.f771e) + "/apps/" + ((String) kVar.d) + ":generatePlayIntegrityChallenge?key=" + ((String) kVar.f770c)), bytes, hVar, false));
                    String a6 = f.a(jSONObject3.optString("challenge"));
                    String a7 = f.a(jSONObject3.optString("ttl"));
                    if (a6 == null || a7 == null) {
                        throw new R2.k("Unexpected server response.");
                    }
                    ? obj = new Object();
                    obj.f7523a = a6;
                    return obj;
                }
                throw new R2.k("Too many attempts.");
        }
        throw th;
        throw th;
    }

    public /* synthetic */ d(C0467c cVar, D d) {
        this.f1009a = 2;
        this.f1010b = cVar;
    }
}
