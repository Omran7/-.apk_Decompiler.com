package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.bumptech.glide.c;
import e3.G;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabm  reason: invalid package */
final class zzabm implements zzafn<zzajd> {
    private final /* synthetic */ zzaeg zza;
    private final /* synthetic */ zzabj zzb;

    public zzabm(zzabj zzabj, zzaeg zzaeg) {
        this.zza = zzaeg;
        this.zzb = zzabj;
    }

    public final void zza(String str) {
        this.zza.zza(c.G0(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzajd zzajd = (zzajd) obj;
        if (TextUtils.isEmpty(zzajd.zza()) || TextUtils.isEmpty(zzajd.zzb())) {
            this.zza.zza(c.G0("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        this.zzb.zza.zza(new zzahn(zzajd.zzb(), zzajd.zza(), Long.valueOf(zzahp.zza(zzajd.zza())), "Bearer"), (String) null, (String) null, Boolean.FALSE, (G) null, this.zza, this);
    }
}
