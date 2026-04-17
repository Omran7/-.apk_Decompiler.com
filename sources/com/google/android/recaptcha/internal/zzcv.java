package com.google.android.recaptcha.internal;

import A.h;
import M5.a;
import M5.d;
import android.app.Application;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

public final class zzcv {
    private final Application zza;
    private final a zzb = new d(false);
    /* access modifiers changed from: private */
    public zzdc zzc;
    private final String zzd = UUID.randomUUID().toString();
    private final zzl zze = new zzl((List) null, 1, (f) null);
    private zzbi zzf = new zzbi();

    public zzcv(Application application) {
        Application application2 = application;
        this.zza = application2;
        int i2 = zzav.zza;
        zzaw[] zzawArr = {new zzaw(915034652, new zzaz((List) null, 1, (f) null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex((zzfm) null, 1, (f) null)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application2), new zzaw(915034663, new zzbf(application2)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application2)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i5 = 0; i5 < 13; i5++) {
            zzaw zzaw = zzawArr[i5];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzaw.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzaw.zza()), zzaw);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcv, String str) {
        zzdc zzdc = zzcv.zzc;
        if (zzdc == null) {
            return null;
        }
        if (j.a(zzdc.zzd(), str)) {
            return zzdc;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, (String) null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcv, long j6) {
        if (j6 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, (String) null);
        } else if (h.checkSelfPermission(zzcv.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, (String) null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcv, String str, zzbi zzbi, zzch zzch, zzek zzek) {
        zzdt zzdt = new zzdt(str, zzbi, zzek, zzcv.zze);
        if (j.a(zzch, zzch.zza)) {
            return new zzef(zzdt);
        }
        return new zzec(zzdt, zzbi, zzek, new zzbo());
    }

    public static /* synthetic */ Object zzf(zzcv zzcv, String str, zzcn zzcn, zzbi zzbi, o5.d dVar, int i2, Object obj) {
        zzcv zzcv2 = zzcv;
        return zzh(zzcv2, str, 0, (zzcn) null, zzcv2.zzf, zzch.zzb, dVar, 2, (Object) null);
    }

    public static /* synthetic */ Object zzh(zzcv zzcv, String str, long j6, zzcn zzcn, zzbi zzbi, zzch zzch, o5.d dVar, int i2, Object obj) {
        zzbi zzbi2;
        zzch zzch2;
        long j7;
        if ((i2 & 8) != 0) {
            zzbi2 = zzcv.zzf;
        } else {
            zzcv zzcv2 = zzcv;
            zzbi2 = zzbi;
        }
        if ((i2 & 16) != 0) {
            zzch2 = zzch.zza;
        } else {
            zzch2 = zzch;
        }
        if ((i2 & 2) != 0) {
            j7 = 10000;
        } else {
            j7 = j6;
        }
        return zzcv.zzg(str, j7, (zzcn) null, zzbi2, zzch2, dVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzj(java.lang.String r6, int r7, x5.p r8, o5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            I1.b.I0(r9)     // Catch:{ zzbd -> 0x002b, Exception -> 0x0029 }
            goto L_0x004e
        L_0x0029:
            r7 = move-exception
            goto L_0x005a
        L_0x002b:
            r7 = move-exception
            goto L_0x0072
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            I1.b.I0(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r6 = r5.zzk(r6, r9, r7)
            r7 = 6
            com.google.android.recaptcha.internal.zzen r7 = r6.zzf(r7)
            r0.zzd = r7     // Catch:{ zzbd -> 0x0055, Exception -> 0x0053 }
            r0.zzc = r3     // Catch:{ zzbd -> 0x0055, Exception -> 0x0053 }
            java.lang.Object r9 = r8.invoke(r6, r0)     // Catch:{ zzbd -> 0x0055, Exception -> 0x0053 }
            if (r9 == r1) goto L_0x0052
            r6 = r7
        L_0x004e:
            r6.zza()     // Catch:{ zzbd -> 0x002b, Exception -> 0x0029 }
            return r9
        L_0x0052:
            return r1
        L_0x0053:
            r6 = move-exception
            goto L_0x0057
        L_0x0055:
            r6 = move-exception
            goto L_0x006f
        L_0x0057:
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x005a:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            com.google.android.recaptcha.RecaptchaException r6 = r8.zzc()
            throw r6
        L_0x006f:
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0072:
            r6.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r6 = r7.zzc()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, x5.p, o5.d):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbi, int i2) {
        String uuid = UUID.randomUUID().toString();
        int i5 = zzav.zza;
        zzes zzes = new zzes(this.zza, new zzeu(((zzbr) com.bumptech.glide.d.N0(zzcr.zza).a()).zzc()), zzbi.zza());
        String str2 = str;
        zzek zzek = new zzek(str2, this.zzd, uuid, i2, this.zza, zzes, (f) null);
        zzek.zzc(uuid);
        return zzek;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091 A[Catch:{ all -> 0x00cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzg(java.lang.String r23, long r24, com.google.android.recaptcha.internal.zzcn r26, com.google.android.recaptcha.internal.zzbi r27, com.google.android.recaptcha.internal.zzch r28, o5.d r29) {
        /*
            r22 = this;
            r1 = r22
            r0 = r29
            boolean r2 = r0 instanceof com.google.android.recaptcha.internal.zzcs
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.recaptcha.internal.zzcs r2 = (com.google.android.recaptcha.internal.zzcs) r2
            int r3 = r2.zzg
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.zzg = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.recaptcha.internal.zzcs r2 = new com.google.android.recaptcha.internal.zzcs
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.zze
            p5.a r3 = p5.a.f11033a
            int r4 = r2.zzg
            r5 = 1
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L_0x005c
            if (r4 == r5) goto L_0x003f
            if (r4 != r6) goto L_0x0037
            java.lang.Object r2 = r2.zza
            M5.a r2 = (M5.a) r2
            I1.b.I0(r0)     // Catch:{ all -> 0x0034 }
            goto L_0x00c7
        L_0x0034:
            r0 = move-exception
            goto L_0x00d1
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            long r4 = r2.zzd
            java.lang.Object r8 = r2.zzc
            M5.a r8 = (M5.a) r8
            com.google.android.recaptcha.internal.zzch r9 = r2.zzi
            com.google.android.recaptcha.internal.zzbi r10 = r2.zzj
            java.lang.String r11 = r2.zzh
            java.lang.Object r12 = r2.zza
            com.google.android.recaptcha.internal.zzcv r12 = (com.google.android.recaptcha.internal.zzcv) r12
            I1.b.I0(r0)
            r15 = r9
            r14 = r10
            r0 = r12
            r20 = r4
            r5 = r8
            r4 = r11
            r11 = r20
            goto L_0x0086
        L_0x005c:
            I1.b.I0(r0)
            M5.a r0 = r1.zzb
            r2.zza = r1
            r4 = r23
            r2.zzh = r4
            r2.zzb = r7
            r8 = r27
            r2.zzj = r8
            r9 = r28
            r2.zzi = r9
            r2.zzc = r0
            r10 = r24
            r2.zzd = r10
            r2.zzg = r5
            M5.d r0 = (M5.d) r0
            java.lang.Object r5 = r0.c(r2)
            if (r5 == r3) goto L_0x00d7
            r5 = r0
            r0 = r1
            r14 = r8
            r15 = r9
            r11 = r10
        L_0x0086:
            com.google.android.recaptcha.internal.zzch r8 = com.google.android.recaptcha.internal.zzch.zza     // Catch:{ all -> 0x00cf }
            boolean r8 = kotlin.jvm.internal.j.a(r15, r8)     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x0091
            r8 = 3
        L_0x008f:
            r13 = r8
            goto L_0x009c
        L_0x0091:
            com.google.android.recaptcha.internal.zzch r8 = com.google.android.recaptcha.internal.zzch.zzb     // Catch:{ all -> 0x00cf }
            boolean r8 = kotlin.jvm.internal.j.a(r15, r8)     // Catch:{ all -> 0x00cf }
            if (r8 == 0) goto L_0x009b
            r8 = 4
            goto L_0x008f
        L_0x009b:
            r13 = r6
        L_0x009c:
            com.google.android.recaptcha.internal.zzct r10 = new com.google.android.recaptcha.internal.zzct     // Catch:{ all -> 0x00cf }
            r16 = 0
            r17 = 0
            r8 = r10
            r9 = r0
            r18 = r10
            r10 = r4
            r19 = r13
            r13 = r17
            r8.<init>(r9, r10, r11, r13, r14, r15, r16)     // Catch:{ all -> 0x00cf }
            r2.zza = r5     // Catch:{ all -> 0x00cf }
            r2.zzh = r7     // Catch:{ all -> 0x00cf }
            r2.zzb = r7     // Catch:{ all -> 0x00cf }
            r2.zzj = r7     // Catch:{ all -> 0x00cf }
            r2.zzi = r7     // Catch:{ all -> 0x00cf }
            r2.zzc = r7     // Catch:{ all -> 0x00cf }
            r2.zzg = r6     // Catch:{ all -> 0x00cf }
            r6 = r18
            r8 = r19
            java.lang.Object r0 = r0.zzj(r4, r8, r6, r2)     // Catch:{ all -> 0x00cf }
            if (r0 == r3) goto L_0x00d7
            r2 = r5
        L_0x00c7:
            com.google.android.recaptcha.internal.zzdc r0 = (com.google.android.recaptcha.internal.zzdc) r0     // Catch:{ all -> 0x0034 }
            M5.d r2 = (M5.d) r2
            r2.d()
            return r0
        L_0x00cf:
            r0 = move-exception
            r2 = r5
        L_0x00d1:
            M5.d r2 = (M5.d) r2
            r2.d()
            throw r0
        L_0x00d7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, o5.d):java.lang.Object");
    }
}
