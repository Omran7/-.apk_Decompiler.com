package com.google.android.gms.internal.p002firebaseauthapi;

import H3.g;
import R2.i;
import R2.k;
import Z2.c;
import Z2.e;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import b3.b;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaew  reason: invalid package */
public final class zzaew {
    private Context zza;
    private zzafp zzb;
    private String zzc;
    private final i zzd;
    private boolean zze;
    private String zzf;

    public zzaew(Context context, i iVar, String str) {
        this.zze = false;
        I.g(context);
        this.zza = context;
        I.g(iVar);
        this.zzd = iVar;
        this.zzc = d.i("Android/Fallback/", str);
    }

    private static String zza(i iVar) {
        b bVar = (b) FirebaseAuth.getInstance(iVar).f6874p.get();
        if (bVar == null) {
            return null;
        }
        try {
            c cVar = (c) Tasks.await(((e) bVar).b(false));
            k kVar = cVar.f4484b;
            if (kVar != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(kVar)));
            }
            return cVar.f4483a;
        } catch (ExecutionException e6) {
            e = e6;
            String message = e.getMessage();
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + message);
            return null;
        } catch (InterruptedException e7) {
            e = e7;
            String message2 = e.getMessage();
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + message2);
            return null;
        }
    }

    private static String zzb(i iVar) {
        g gVar = (g) FirebaseAuth.getInstance(iVar).f6875q.get();
        if (gVar != null) {
            try {
                return (String) Tasks.await(((H3.e) gVar).b());
            } catch (InterruptedException | ExecutionException e6) {
                String message = e6.getMessage();
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + message);
            }
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = d.f(this.zzc, "/FirebaseUI-Android");
        } else {
            str = d.f(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzafp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaev.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        i iVar = this.zzd;
        iVar.b();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", iVar.f2492c.f2501b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza2 = zza(this.zzd);
        if (!TextUtils.isEmpty(zza2)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza2);
        }
        this.zzf = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzaew(i iVar, String str) {
        this(iVar.f2490a, iVar, str);
        iVar.b();
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
