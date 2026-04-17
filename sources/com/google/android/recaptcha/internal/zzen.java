package com.google.android.recaptcha.internal;

import android.content.Context;

public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i2, String str, int i5, String str2, String str3, String str4, String str5, zzeo zzeo, zzcc zzcc, Context context, Integer num) {
        this.zzk = i2;
        this.zzb = str;
        this.zzl = i5;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeo;
        this.zzg = context;
        this.zzh = num;
    }

    /* JADX WARNING: type inference failed for: r12v29, types: [com.google.android.recaptcha.internal.zznd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0117 A[Catch:{ NameNotFoundException -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130 A[Catch:{ NameNotFoundException -> 0x015b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(int r12, com.google.android.recaptcha.internal.zzqq r13) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            com.google.android.recaptcha.internal.zzra r1 = com.google.android.recaptcha.internal.zzrc.zzi()
            int r2 = r11.zzk
            r1.zzy(r2)
            java.lang.String r2 = r11.zzc
            r1.zzq(r2)
            java.lang.String r2 = r11.zzd
            r1.zzt(r2)
            int r2 = r11.zzl
            r1.zzz(r2)
            java.lang.String r2 = r11.zze
            if (r2 == 0) goto L_0x0021
            r1.zzx(r2)
        L_0x0021:
            java.lang.Integer r2 = r11.zzh
            if (r2 == 0) goto L_0x002c
            int r2 = r2.intValue()
            r1.zzv(r2)
        L_0x002c:
            if (r13 == 0) goto L_0x0031
            r1.zzs(r13)
        L_0x0031:
            r1.zzA(r12)
            java.lang.String r12 = r11.zzi
            r1.zzw(r12)
            long r12 = r11.zzj
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r12
            r1.zzr(r2)
            int r12 = com.google.android.recaptcha.internal.zzav.zza
            com.google.android.recaptcha.internal.zzel r12 = com.google.android.recaptcha.internal.zzel.zza
            m5.g r12 = com.bumptech.glide.d.N0(r12)
            java.lang.Object r12 = r12.a()
            com.google.android.recaptcha.internal.zzaz r12 = (com.google.android.recaptcha.internal.zzaz) r12
            java.util.List r12 = r12.zza()
            java.util.Iterator r12 = r12.iterator()
        L_0x0059:
            boolean r13 = r12.hasNext()
            r2 = 0
            if (r13 == 0) goto L_0x006a
            java.lang.Object r13 = r12.next()
            com.google.android.recaptcha.internal.zzax r13 = (com.google.android.recaptcha.internal.zzax) r13
            r1.zzf(r2)
            goto L_0x0059
        L_0x006a:
            int r12 = com.google.android.recaptcha.internal.zzbk.zza
            int r12 = r11.zzk
            long r3 = r1.zze()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            int r12 = r12 + -2
            r13 = 4
            if (r12 == r13) goto L_0x0096
            r13 = 5
            if (r12 == r13) goto L_0x0093
            r13 = 6
            if (r12 == r13) goto L_0x0090
            r13 = 7
            if (r12 == r13) goto L_0x008d
            r13 = 14
            if (r12 == r13) goto L_0x008a
            com.google.android.recaptcha.internal.zzbl r12 = com.google.android.recaptcha.internal.zzbl.zza
            goto L_0x0098
        L_0x008a:
            com.google.android.recaptcha.internal.zzbl r12 = com.google.android.recaptcha.internal.zzbl.zzf
            goto L_0x0098
        L_0x008d:
            com.google.android.recaptcha.internal.zzbl r12 = com.google.android.recaptcha.internal.zzbl.zze
            goto L_0x0098
        L_0x0090:
            com.google.android.recaptcha.internal.zzbl r12 = com.google.android.recaptcha.internal.zzbl.zzd
            goto L_0x0098
        L_0x0093:
            com.google.android.recaptcha.internal.zzbl r12 = com.google.android.recaptcha.internal.zzbl.zzc
            goto L_0x0098
        L_0x0096:
            com.google.android.recaptcha.internal.zzbl r12 = com.google.android.recaptcha.internal.zzbl.zzb
        L_0x0098:
            int r12 = r12.zza()
            com.google.android.recaptcha.internal.zzbk.zza(r12, r3)
            com.google.android.recaptcha.internal.zzem r12 = com.google.android.recaptcha.internal.zzem.zza
            m5.g r12 = com.bumptech.glide.d.N0(r12)
            java.lang.Object r12 = r12.a()
            com.google.android.recaptcha.internal.zzbe r12 = (com.google.android.recaptcha.internal.zzbe) r12
            android.content.Context r12 = r11.zzg
            java.util.Set r13 = com.google.android.recaptcha.internal.zzbe.zza(r12)
            com.google.android.recaptcha.internal.zzqk r3 = zza
            if (r3 != 0) goto L_0x0165
            com.google.android.recaptcha.internal.zzqh r3 = com.google.android.recaptcha.internal.zzqk.zzf()
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.zzf(r4)
            java.lang.String r5 = "com.google.android.gms.version"
            r6 = 33
            java.lang.String r7 = "unknown"
            r8 = -1
            if (r4 < r6) goto L_0x00e6
            android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r9 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.PackageManager$ApplicationInfoFlags r10 = android.content.pm.PackageManager.ApplicationInfoFlags.of(128)     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00df }
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x00df }
            int r4 = r4.getInt(r5, r8)     // Catch:{ NameNotFoundException -> 0x00df }
            if (r4 != r8) goto L_0x00e1
        L_0x00df:
            r4 = r7
            goto L_0x0101
        L_0x00e1:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x0101
        L_0x00e6:
            android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r9 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x00df }
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00df }
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x00df }
            int r4 = r4.getInt(r5, r8)     // Catch:{ NameNotFoundException -> 0x00df }
            if (r4 != r8) goto L_0x00fd
            goto L_0x00df
        L_0x00fd:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x00df }
        L_0x0101:
            r3.zzs(r4)
            java.lang.String r4 = "18.6.1"
            r3.zzu(r4)
            java.lang.String r4 = android.os.Build.MODEL
            r3.zzr(r4)
            java.lang.String r4 = android.os.Build.MANUFACTURER
            r3.zzt(r4)
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x015b }
            if (r4 < r6) goto L_0x0130
            android.content.pm.PackageManager r2 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageManager$PackageInfoFlags r4 = android.content.pm.PackageManager.PackageInfoFlags.of(0)     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageInfo r12 = r2.getPackageInfo(r12, r4)     // Catch:{ NameNotFoundException -> 0x015b }
            long r4 = r12.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x015b }
            goto L_0x015b
        L_0x0130:
            r5 = 28
            if (r4 < r5) goto L_0x0149
            android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageInfo r12 = r4.getPackageInfo(r12, r2)     // Catch:{ NameNotFoundException -> 0x015b }
            long r4 = r12.getLongVersionCode()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ NameNotFoundException -> 0x015b }
            goto L_0x015b
        L_0x0149:
            android.content.pm.PackageManager r4 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageInfo r12 = r4.getPackageInfo(r12, r2)     // Catch:{ NameNotFoundException -> 0x015b }
            int r12 = r12.versionCode     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch:{ NameNotFoundException -> 0x015b }
        L_0x015b:
            r3.zzq(r7)
            com.google.android.recaptcha.internal.zznd r12 = r3.zzk()
            r3 = r12
            com.google.android.recaptcha.internal.zzqk r3 = (com.google.android.recaptcha.internal.zzqk) r3
        L_0x0165:
            zza = r3
            com.google.android.recaptcha.internal.zzmx r12 = r3.zzr()
            com.google.android.recaptcha.internal.zzqh r12 = (com.google.android.recaptcha.internal.zzqh) r12
            r12.zze(r13)
            com.google.android.recaptcha.internal.zznd r12 = r12.zzk()
            com.google.android.recaptcha.internal.zzqk r12 = (com.google.android.recaptcha.internal.zzqk) r12
            java.util.Locale r13 = java.util.Locale.getDefault()     // Catch:{ MissingResourceException -> 0x017f }
            java.lang.String r13 = r13.getISO3Language()     // Catch:{ MissingResourceException -> 0x017f }
            goto L_0x0180
        L_0x017f:
            r13 = r0
        L_0x0180:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ MissingResourceException -> 0x0188 }
            java.lang.String r0 = r2.getISO3Country()     // Catch:{ MissingResourceException -> 0x0188 }
        L_0x0188:
            java.lang.String r2 = r11.zzb
            com.google.android.recaptcha.internal.zzrm r3 = com.google.android.recaptcha.internal.zzro.zzf()
            r3.zzr(r2)
            r3.zze(r12)
            r3.zzq(r13)
            r3.zzf(r0)
            com.google.android.recaptcha.internal.zznd r12 = r3.zzk()
            com.google.android.recaptcha.internal.zzro r12 = (com.google.android.recaptcha.internal.zzro) r12
            r1.zzu(r12)
            com.google.android.recaptcha.internal.zztw r12 = com.google.android.recaptcha.internal.zztx.zzi()
            r12.zze(r1)
            com.google.android.recaptcha.internal.zznd r12 = r12.zzk()
            com.google.android.recaptcha.internal.zztx r12 = (com.google.android.recaptcha.internal.zztx) r12
            com.google.android.recaptcha.internal.zzeo r13 = r11.zzf
            r13.zza(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzen.zzc(int, com.google.android.recaptcha.internal.zzqq):void");
    }

    public final void zza() {
        zzc(3, (zzqq) null);
    }

    public final void zzb(zzbd zzbd) {
        zzqo zzg2 = zzqq.zzg();
        zzg2.zzr(String.valueOf(zzbd.zzb().zza()));
        zzg2.zze(zzbd.zza().zza());
        zzg2.zzq(zzbd.zzc().getErrorCode().getErrorCode());
        String zzd2 = zzbd.zzd();
        if (zzd2 != null) {
            zzg2.zzf(zzd2);
        }
        zzc(4, (zzqq) zzg2.zzk());
    }
}
