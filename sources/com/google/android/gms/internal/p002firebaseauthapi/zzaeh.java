package com.google.android.gms.internal.p002firebaseauthapi;

import C1.a;
import R2.i;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.I;
import com.google.firebase.auth.FirebaseAuth;
import h0.C0552a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeh  reason: invalid package */
public final class zzaeh extends AsyncTask<Void, Void, zzaek> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaej> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final i zzg;

    public zzaeh(String str, String str2, Intent intent, i iVar, zzaej zzaej) {
        I.d(str);
        this.zzb = str;
        I.g(iVar);
        this.zzg = iVar;
        I.d(str2);
        I.g(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        I.d(stringExtra);
        Uri.Builder buildUpon = Uri.parse(zzaej.zza(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        I.g(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaej);
        this.zze = zzaej.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final zzaek doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzaej zzaej = this.zzd.get();
            HttpURLConnection zza2 = zzaej.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzaew(zzaej.zza(), this.zzg, zzaeu.zza().zzb()).zza((URLConnection) zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                a aVar = zza;
                aVar.c("Error getting project config. Failed with " + zza3 + " " + responseCode, new Object[0]);
                return zzaek.zzb(zza3);
            }
            zzahi zzahi = new zzahi();
            zzahi.zza(new String(zza(zza2.getInputStream(), 128)));
            if (TextUtils.isEmpty(this.zzf)) {
                for (String next : zzahi.zza()) {
                    if (zza(next)) {
                        return zzaek.zza(next);
                    }
                }
                return null;
            } else if (!zzahi.zza().contains(this.zzf)) {
                return zzaek.zzb("UNAUTHORIZED_DOMAIN");
            } else {
                return zzaek.zza(this.zzf);
            }
        } catch (IOException e6) {
            zza.c(d.i("IOException occurred: ", e6.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e7) {
            zza.c(d.i("Null pointer encountered: ", e7.getMessage()), new Object[0]);
            return null;
        } catch (zzaci e8) {
            zza.c(d.i("ConversionException encountered: ", e8.getMessage()), new Object[0]);
            return null;
        }
    }

    public final /* synthetic */ void onCancelled(Object obj) {
        zzaek zzaek = (zzaek) obj;
        onPostExecute((zzaek) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzaep.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e6) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e6)), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final void onPostExecute(zzaek zzaek) {
        String str;
        String str2;
        Uri.Builder builder;
        zzaej zzaej = this.zzd.get();
        if (zzaek != null) {
            str2 = zzaek.zza();
            str = zzaek.zzb();
        } else {
            str2 = null;
            str = null;
        }
        if (zzaej == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.zze) == null) {
            zzaej.zza(this.zzb, c.G0(str));
        } else {
            builder.authority(str2);
            zzaej.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f6874p);
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host == null || (!host.endsWith("firebaseapp.com") && !host.endsWith("web.app"))) {
                return false;
            }
            return true;
        } catch (URISyntaxException e6) {
            zza.c(C0552a.p("Error parsing URL for auth domain check: ", str, ". ", e6.getMessage()), new Object[0]);
        }
    }

    private static byte[] zza(InputStream inputStream, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
