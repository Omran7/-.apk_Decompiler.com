package com.google.android.gms.internal.p002firebaseauthapi;

import R2.i;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafr  reason: invalid package */
public final class zzafr {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafr(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        String str;
        String str2;
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        i iVar = this.zza.f6862a;
        iVar.b();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", iVar.f2492c.f2500a);
        FirebaseAuth firebaseAuth = this.zza;
        synchronized (firebaseAuth.h) {
            str = firebaseAuth.f6867i;
        }
        if (!TextUtils.isEmpty(str)) {
            FirebaseAuth firebaseAuth2 = this.zza;
            synchronized (firebaseAuth2.h) {
                str2 = firebaseAuth2.f6867i;
            }
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", str2);
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaeu.zza().zzb());
        i iVar2 = this.zza.f6862a;
        iVar2.b();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", iVar2.f2491b);
        this.zza.getClass();
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", (String) null);
        this.zzb.startActivity(intent);
    }
}
