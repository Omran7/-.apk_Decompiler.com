package com.google.android.recaptcha.internal;

import android.content.Context;
import kotlin.jvm.internal.f;

public final class zzek {
    private final String zza;
    private String zzb;
    private String zzc;
    private final Context zzd;
    private final zzeo zze;
    private String zzf;
    private Integer zzg;
    private final int zzh;

    private zzek(String str, String str2, String str3, int i2, Context context, zzeo zzeo) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzh = i2;
        this.zzd = context;
        this.zze = zzeo;
    }

    public final zzek zza() {
        return new zzek(this);
    }

    public final zzek zzb(int i2) {
        this.zzg = Integer.valueOf(i2);
        return this;
    }

    public final zzek zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(zztx zztx) {
        this.zze.zza(zztx);
    }

    public final zzen zzf(int i2) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzcc zzcc = new zzcc();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzen(i2, this.zza, this.zzh, str, str2, str3, (String) null, this.zze, zzcc, context, num);
    }

    public /* synthetic */ zzek(String str, String str2, String str3, int i2, Context context, zzeo zzeo, f fVar) {
        this(str, str2, str3, i2, context, zzeo);
    }

    private zzek(zzek zzek) {
        this(zzek.zza, zzek.zzb, zzek.zzc, zzek.zzh, zzek.zzd, zzek.zze);
        this.zzf = zzek.zzf;
        this.zzg = zzek.zzg;
    }
}
