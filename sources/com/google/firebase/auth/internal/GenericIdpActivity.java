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
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.C0289v;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeh;
import com.google.android.gms.internal.p002firebaseauthapi.zzaej;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaga;
import com.google.android.gms.internal.p002firebaseauthapi.zzagd;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.utils.K;
import f0.C0520a;
import f3.C0538o;
import f3.s;
import f3.u;
import f3.w;
import f3.x;
import f3.y;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class GenericIdpActivity extends C0289v implements zzaej {

    /* renamed from: I  reason: collision with root package name */
    public static long f6880I;

    /* renamed from: J  reason: collision with root package name */
    public static final /* synthetic */ int f6881J = 0;

    /* renamed from: H  reason: collision with root package name */
    public boolean f6882H = false;

    static {
        u uVar = u.f7957b;
    }

    public final Uri.Builder n(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String str4;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String str5 = str;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            str3 = null;
        } else {
            str3 = TextUtils.join(",", stringArrayListExtra);
        }
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str4 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String next : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(next, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            str4 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzaem.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        w wVar = w.f7959a;
        Context applicationContext = getApplicationContext();
        String str6 = str4;
        String str7 = str3;
        String str8 = stringExtra;
        synchronized (wVar) {
            I.d(str);
            I.d(uuid);
            I.d(zza);
            I.d(stringExtra4);
            SharedPreferences a6 = w.a(applicationContext, str5);
            w.b(a6);
            SharedPreferences.Editor edit = a6.edit();
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".SESSION_ID", zza);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".OPERATION", action);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".PROVIDER_ID", stringExtra2);
            edit.putString("com.google.firebase.auth.internal.EVENT_ID." + uuid + ".FIREBASE_APP_NAME", stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String b6 = x.a(getApplicationContext(), i.f(stringExtra4).g()).b();
        if (TextUtils.isEmpty(b6)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            o(c.G0("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (zza == null) {
            return null;
        } else {
            Uri.Builder appendQueryParameter = builder2.appendQueryParameter("eid", "p");
            appendQueryParameter.appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", str8).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b6);
            if (!TextUtils.isEmpty(str7)) {
                builder2.appendQueryParameter("scopes", str7);
            }
            if (!TextUtils.isEmpty(str6)) {
                builder2.appendQueryParameter("customParameters", str6);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder2.appendQueryParameter("tid", stringExtra3);
            }
            return builder2;
        }
    }

    public final void o(Status status) {
        f6880I = 0;
        this.f6882H = false;
        Intent intent = new Intent();
        HashMap hashMap = s.f7956a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0520a.a(this).b(intent);
        C0538o.a(getApplicationContext(), status);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f6880I < 30000) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f6880I = currentTimeMillis;
            if (bundle != null) {
                this.f6882H = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
        p();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String str;
        y yVar;
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                o(s.a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                p();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (w.f7959a) {
                    I.d(packageName);
                    I.d(stringExtra2);
                    SharedPreferences a6 = w.a(this, packageName);
                    String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
                    String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
                    String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
                    String str5 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
                    str = null;
                    String string = a6.getString(str2, (String) null);
                    String string2 = a6.getString(str3, (String) null);
                    String string3 = a6.getString(str4, (String) null);
                    String string4 = a6.getString("com.google.firebase.auth.api.gms.config.tenant.id", (String) null);
                    String string5 = a6.getString(str5, (String) null);
                    SharedPreferences.Editor edit = a6.edit();
                    edit.remove(str2);
                    edit.remove(str3);
                    edit.remove(str4);
                    edit.remove(str5);
                    edit.apply();
                    if (string == null || string2 == null || string3 == null) {
                        yVar = null;
                    } else {
                        yVar = new y(string, string2, string3, string4, string5);
                    }
                }
                if (yVar == null) {
                    p();
                }
                if (booleanExtra) {
                    stringExtra = x.a(getApplicationContext(), i.f(yVar.f7967e).g()).c(stringExtra);
                }
                zzait zzait = new zzait(yVar, stringExtra);
                String str6 = yVar.d;
                String str7 = yVar.f7965b;
                zzait.zzb(str6);
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str7) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str7) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str7)) {
                    f6880I = 0;
                    this.f6882H = false;
                    Intent intent2 = new Intent();
                    Parcel obtain = Parcel.obtain();
                    zzait.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str7);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    C0520a.a(this).b(intent2);
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    Parcel obtain2 = Parcel.obtain();
                    zzait.writeToParcel(obtain2, 0);
                    byte[] marshall2 = obtain2.marshall();
                    obtain2.recycle();
                    if (marshall2 != null) {
                        str = Base64.encodeToString(marshall2, 10);
                    }
                    edit2.putString("verifyAssertionRequest", str);
                    edit2.putString("operation", str7);
                    edit2.putString("tenantId", str6);
                    edit2.putLong("timestamp", System.currentTimeMillis());
                    edit2.commit();
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(str7));
                p();
            }
        } else if (!this.f6882H) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = G1.c.a(G1.c.c(this, packageName2)).toLowerCase(Locale.US);
                i f6 = i.f(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth instance = FirebaseAuth.getInstance(f6);
                if (!zzagd.zza(f6)) {
                    new zzaeh(packageName2, lowerCase, getIntent(), f6, this).executeOnExecutor(instance.f6877s, new Void[0]);
                } else {
                    f6.b();
                    zza(n(Uri.parse(zzagd.zza(f6.f2492c.f2500a)).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, instance.f6874p);
                }
            } catch (PackageManager.NameNotFoundException e6) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + String.valueOf(e6));
                zzaem.zzb(this, packageName2);
            }
            this.f6882H = true;
        } else {
            p();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f6882H);
    }

    public final void p() {
        f6880I = 0;
        this.f6882H = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0520a.a(this).b(intent);
        C0538o.a(this, c.G0("WEB_CONTEXT_CANCELED"));
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
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + zza);
        return zza;
    }

    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
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
            K k6 = new K(18);
            k6.f7360b = uri;
            task = b6.continueWith(k6);
        } else {
            task = Tasks.forResult(uri);
        }
        h hVar = new h(8);
        hVar.f1522b = this;
        hVar.f1523c = str;
        task.addOnCompleteListener(hVar);
    }
}
