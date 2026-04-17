package com.google.android.gms.internal.p002firebaseauthapi;

import C1.a;
import K3.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaej  reason: invalid package */
public interface zzaej {
    public static final a zza = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, b bVar);

    void zza(String str, Status status);
}
