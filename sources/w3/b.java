package W3;

import B0.C0009h;
import R2.i;
import T1.B;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: j  reason: collision with root package name */
    public static final Uri f4074j = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: k  reason: collision with root package name */
    public static final B f4075k = new B(27);

    /* renamed from: a  reason: collision with root package name */
    public Exception f4076a;

    /* renamed from: b  reason: collision with root package name */
    public final C0009h f4077b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4078c;
    public Map d;

    /* renamed from: e  reason: collision with root package name */
    public int f4079e;

    /* renamed from: f  reason: collision with root package name */
    public String f4080f;
    public InputStream g;
    public HttpURLConnection h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f4081i = new HashMap();

    public b(C0009h hVar, i iVar) {
        I.g(iVar);
        this.f4077b = hVar;
        iVar.b();
        this.f4078c = iVar.f2490a;
        iVar.b();
        n("x-firebase-gmpid", iVar.f2492c.f2501b);
    }

    public final void a(HttpURLConnection httpURLConnection, String str, String str2) {
        byte[] bArr;
        int i2;
        I.g(httpURLConnection);
        if (!TextUtils.isEmpty(str)) {
            httpURLConnection.setRequestProperty("Authorization", "Firebase " + str);
        } else {
            Log.w("NetworkRequest", "no auth token for request");
        }
        if (!TextUtils.isEmpty(str2)) {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str2);
        } else {
            Log.w("NetworkRequest", "No App Check token for request.");
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/21.0.2");
        for (Map.Entry entry : this.f4081i.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject d6 = d();
        if (d6 != null) {
            bArr = d6.toString().getBytes("UTF-8");
            i2 = bArr.length;
        } else {
            bArr = e();
            i2 = f();
            if (i2 == 0 && bArr != null) {
                i2 = bArr.length;
            }
        }
        if (bArr == null || bArr.length <= 0) {
            httpURLConnection.setRequestProperty("Content-Length", "0");
        } else {
            if (d6 != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(i2));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (bArr != null && bArr.length > 0) {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            if (outputStream != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(bArr, 0, i2);
                } finally {
                    bufferedOutputStream.close();
                }
            } else {
                Log.e("NetworkRequest", "Unable to write to the http request!");
            }
        }
    }

    public final HttpURLConnection b() {
        Uri j6 = j();
        Map g5 = g();
        if (g5 != null) {
            Uri.Builder buildUpon = j6.buildUpon();
            for (Map.Entry entry : ((HashMap) g5).entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            j6 = buildUpon.build();
        }
        URL url = new URL(j6.toString());
        f4075k.getClass();
        return (HttpURLConnection) url.openConnection();
    }

    public abstract String c();

    public JSONObject d() {
        return null;
    }

    public byte[] e() {
        return null;
    }

    public int f() {
        return 0;
    }

    public Map g() {
        return null;
    }

    public final JSONObject h() {
        if (TextUtils.isEmpty(this.f4080f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f4080f);
        } catch (JSONException e6) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f4080f, e6);
            return new JSONObject();
        }
    }

    public final String i(String str) {
        List list;
        Map map = this.d;
        if (map == null || (list = (List) map.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    public Uri j() {
        return (Uri) this.f4077b.f229c;
    }

    public final boolean k() {
        int i2 = this.f4079e;
        if (i2 < 200 || i2 >= 300) {
            return false;
        }
        return true;
    }

    public final void l(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f4080f = sb.toString();
        if (!k()) {
            this.f4076a = new IOException(this.f4080f);
        }
    }

    public final void m(Context context, String str, String str2) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f4076a = new SocketException("Network subsystem is unavailable");
            this.f4079e = -2;
            return;
        }
        if (this.f4076a != null) {
            this.f4079e = -1;
        } else {
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "sending network request " + c() + " " + j());
            }
            NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) this.f4078c.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected()) {
                this.f4079e = -2;
                this.f4076a = new SocketException("Network subsystem is unavailable");
            } else {
                try {
                    HttpURLConnection b6 = b();
                    this.h = b6;
                    b6.setRequestMethod(c());
                    a(this.h, str, str2);
                    HttpURLConnection httpURLConnection = this.h;
                    I.g(httpURLConnection);
                    this.f4079e = httpURLConnection.getResponseCode();
                    this.d = httpURLConnection.getHeaderFields();
                    httpURLConnection.getContentLength();
                    if (k()) {
                        this.g = httpURLConnection.getInputStream();
                    } else {
                        this.g = httpURLConnection.getErrorStream();
                    }
                    if (Log.isLoggable("NetworkRequest", 3)) {
                        Log.d("NetworkRequest", "network request result " + this.f4079e);
                    }
                } catch (IOException e6) {
                    Log.w("NetworkRequest", "error sending network request " + c() + " " + j(), e6);
                    this.f4076a = e6;
                    this.f4079e = -2;
                }
            }
        }
        try {
            if (k()) {
                l(this.g);
            } else {
                l(this.g);
            }
        } catch (IOException e7) {
            Log.w("NetworkRequest", "error sending network request " + c() + " " + j(), e7);
            this.f4076a = e7;
            this.f4079e = -2;
        }
        HttpURLConnection httpURLConnection2 = this.h;
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
        }
    }

    public final void n(String str, String str2) {
        this.f4081i.put(str, str2);
    }
}
