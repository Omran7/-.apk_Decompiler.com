package com.google.firebase.auth.internal;

import K3.b;
import K4.h;
import R2.i;
import Z2.e;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C0289v;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeh;
import com.google.android.gms.internal.p002firebaseauthapi.zzaej;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaev;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import f0.C0520a;
import f3.C0538o;
import f3.s;
import f3.u;
import f3.w;
import f3.x;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;

public class RecaptchaActivity extends C0289v implements zzaej {

    /* renamed from: I  reason: collision with root package name */
    public static long f6883I;

    /* renamed from: J  reason: collision with root package name */
    public static final u f6884J = u.f7957b;

    /* renamed from: H  reason: collision with root package name */
    public boolean f6885H = false;

    public final Uri.Builder n(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        i f6 = i.f(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(f6);
        w wVar = w.f7959a;
        Context applicationContext = getApplicationContext();
        synchronized (wVar) {
            I.d(str);
            I.d(uuid);
            SharedPreferences a6 = w.a(applicationContext, str);
            w.b(a6);
            SharedPreferences.Editor edit = a6.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra3);
            edit.apply();
        }
        String b6 = x.a(getApplicationContext(), f6.g()).b();
        String str3 = null;
        if (TextUtils.isEmpty(b6)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            o(c.G0("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (instance.g) {
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            synchronized (instance.g) {
            }
        } else {
            str3 = zzaev.zza();
        }
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid);
        appendQueryParameter.appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b6);
        return builder;
    }

    public final void o(Status status) {
        f6883I = 0;
        this.f6885H = false;
        Intent intent = new Intent();
        HashMap hashMap = s.f7956a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0520a.a(this).b(intent);
        f6884J.f7958a.getClass();
        C0538o.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f6883I < 30000) {
                Log.e("RecaptchaActivity", "Could not start operation - already in progress");
                return;
            }
            f6883I = currentTimeMillis;
            if (bundle != null) {
                this.f6885H = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
        p();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String str;
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                o(s.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                p();
            } else {
                String stringExtra = intent.getStringExtra("link");
                w wVar = w.f7959a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (wVar) {
                    I.d(packageName);
                    I.d(stringExtra2);
                    SharedPreferences a6 = w.a(applicationContext, packageName);
                    String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                    str = null;
                    String string = a6.getString(str2, (String) null);
                    String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                    String string2 = a6.getString(str3, (String) null);
                    SharedPreferences.Editor edit = a6.edit();
                    edit.remove(str2);
                    edit.remove(str3);
                    edit.apply();
                    if (!TextUtils.isEmpty(string)) {
                        str = string2;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
                    o(c.G0("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = x.a(getApplicationContext(), i.f(str).g()).c(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f6883I = 0;
                this.f6885H = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                C0520a.a(this).b(intent2);
                SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit2.putString("recaptchaToken", queryParameter);
                edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                edit2.putLong("timestamp", System.currentTimeMillis());
                edit2.commit();
                finish();
            }
        } else if (!this.f6885H) {
            Intent intent3 = getIntent();
            String packageName2 = getPackageName();
            try {
                String lowerCase = G1.c.a(G1.c.c(this, packageName2)).toLowerCase(Locale.US);
                i f6 = i.f(intent3.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth instance = FirebaseAuth.getInstance(f6);
                if (!zzagd.zza(f6)) {
                    new zzaeh(packageName2, lowerCase, intent3, f6, this).executeOnExecutor(instance.f6877s, new Void[0]);
                } else {
                    f6.b();
                    zza(n(Uri.parse(zzagd.zza(f6.f2492c.f2500a)).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, instance.f6874p);
                }
            } catch (PackageManager.NameNotFoundException e6) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName2 + " " + String.valueOf(e6));
                zzaem.zzb(this, packageName2);
            }
            this.f6885H = true;
        } else {
            p();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f6885H);
    }

    public final void p() {
        f6883I = 0;
        this.f6885H = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0520a.a(this).b(intent);
        f6884J.f7958a.getClass();
        C0538o.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return n(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public final String zza(String str) {
        String zza = zzaga.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza)) {
            return zzagd.zzb(str);
        }
        Log.e("RecaptchaActivity", "Found hermetic configuration for identityToolkit URL: " + zza);
        return zza;
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaej.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    public final void zza(String str, Status status) {
        if (status == null) {
            p();
        } else {
            o(status);
        }
    }

    public final void zza(Uri uri, String str, b bVar) {
        Task task;
        b3.b bVar2 = (b3.b) bVar.get();
        if (bVar2 != null) {
            Task b6 = ((e) bVar2).b(false);
            com.mtma.criminal.city.fragments.gangBase.I i2 = new com.mtma.criminal.city.fragments.gangBase.I(22);
            i2.f7143b = uri;
            task = b6.continueWith(i2);
        } else {
            task = Tasks.forResult(uri);
        }
        h hVar = new h(9);
        hVar.f1522b = this;
        hVar.f1523c = str;
        task.addOnCompleteListener(hVar);
    }
}
