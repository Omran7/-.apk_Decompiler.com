package n1;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* renamed from: n1.b  reason: case insensitive filesystem */
public final class C0855b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HashMap f10235a;

    public C0855b(HashMap hashMap) {
        this.f10235a = hashMap;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.f10235a;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            zzi.zzb(263);
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 65);
                sb.append("Received non-success response code ");
                sb.append(responseCode);
                sb.append(" from pinging URL: ");
                sb.append(uri);
                Log.w("HttpUrlPinger", sb.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e6) {
            String message = e6.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            sb2.append("Error while parsing ping URL: ");
            sb2.append(uri);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e6);
        } catch (IOException | RuntimeException e7) {
            String message2 = e7.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message2).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e7);
        } catch (Throwable th) {
            zzi.zza();
            throw th;
        }
        zzi.zza();
    }
}
