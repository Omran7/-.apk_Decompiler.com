package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafm  reason: invalid package */
public final class zzafm {
    private static final boolean zza(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzafn<?> zzafn, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (zza(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (!zza(responseCode)) {
                zzafn.zza((String) zzaep.zza(sb2, String.class));
            } else {
                zzafn.zza((zzaer) zzaep.zza(sb2, type));
            }
            httpURLConnection.disconnect();
            return;
        } catch (SocketTimeoutException unused) {
            zzafn.zza("TIMEOUT");
            httpURLConnection.disconnect();
            return;
        } catch (IOException e6) {
            e = e6;
            try {
                zzafn.zza(e.getMessage());
                httpURLConnection.disconnect();
                return;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (zzaci e7) {
            e = e7;
            zzafn.zza(e.getMessage());
            httpURLConnection.disconnect();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static void zza(String str, zzafn<?> zzafn, Type type, zzaew zzaew) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaew.zza((URLConnection) httpURLConnection);
            zza(httpURLConnection, zzafn, type);
        } catch (SocketTimeoutException unused) {
            zzafn.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzafn.zza("<<Network Error>>");
        } catch (IOException e6) {
            zzafn.zza(e6.getMessage());
        }
    }

    public static void zza(String str, zzaes zzaes, zzafn<?> zzafn, Type type, zzaew zzaew) {
        BufferedOutputStream bufferedOutputStream;
        try {
            I.g(zzaes);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaes.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaew.zza((URLConnection) httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            bufferedOutputStream.close();
            zza(httpURLConnection, zzafn, type);
            return;
        } catch (SocketTimeoutException unused) {
            zzafn.zza("TIMEOUT");
            return;
        } catch (UnknownHostException unused2) {
            zzafn.zza("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e6) {
            zzafn.zza(e6.getMessage());
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
