package N3;

import A2.f;
import H3.e;
import H3.g;
import K3.b;
import R2.k;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static final Pattern d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f1905e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Context f1906a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1907b;

    /* renamed from: c  reason: collision with root package name */
    public final d f1908c = new d();

    public c(Context context, b bVar) {
        this.f1906a = context;
        this.f1907b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e6) {
            throw new k(e6.getMessage());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.io.InputStream r0 = r5.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x0048
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f1905e
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            r0.<init>()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            if (r3 == 0) goto L_0x002a
            r0.append(r3)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            goto L_0x0019
        L_0x0028:
            r5 = move-exception
            goto L_0x0044
        L_0x002a:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            int r4 = r5.getResponseCode()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.String r5 = r5.getResponseMessage()     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.Object[] r5 = new java.lang.Object[]{r4, r5, r0}     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
            java.lang.String r1 = java.lang.String.format(r3, r5)     // Catch:{ IOException -> 0x0040, all -> 0x0028 }
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0048
        L_0x0044:
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            throw r5
        L_0x0048:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x006b
            java.lang.String r5 = "Firebase-Installations"
            android.util.Log.w(r5, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r1 = ", "
            if (r0 == 0) goto L_0x005e
            java.lang.String r6 = ""
            goto L_0x0062
        L_0x005e:
            java.lang.String r6 = o3.d.i(r1, r6)
        L_0x0062:
            java.lang.String r0 = "Firebase options used while communicating with Firebase server APIs: "
            java.lang.String r6 = h0.C0552a.q(r0, r7, r1, r8, r6)
            android.util.Log.w(r5, r6)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        I.a("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f1905e));
        f a6 = b.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a6.f30c = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a6.d = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b b6 = a6.b();
                jsonReader.endObject();
                bVar = b6;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f1905e));
        f a6 = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a6.f30c = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a6.d = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a6.f29b = 1;
        return a6.b();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public final HttpURLConnection c(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f1906a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            g gVar = (g) this.f1907b.get();
            if (gVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((e) gVar).b()));
                } catch (ExecutionException e6) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e6);
                } catch (InterruptedException e7) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e7);
                }
            }
            String str2 = null;
            try {
                byte[] c3 = G1.c.c(context, context.getPackageName());
                if (c3 == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    str2 = G1.c.a(c3);
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e8);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new k("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
