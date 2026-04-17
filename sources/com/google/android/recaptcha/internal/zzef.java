package com.google.android.recaptcha.internal;

public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb = zzcm.zza;
    private zzsc zzc;

    public zzef(zzdt zzdt) {
        this.zza = zzdt;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0096 A[Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, o5.d r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r22
            boolean r3 = r2 instanceof com.google.android.recaptcha.internal.zzed
            if (r3 == 0) goto L_0x001a
            r3 = r2
            com.google.android.recaptcha.internal.zzed r3 = (com.google.android.recaptcha.internal.zzed) r3
            int r4 = r3.zzd
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001a
            int r4 = r4 - r5
            r3.zzd = r4
        L_0x0018:
            r9 = r3
            goto L_0x0020
        L_0x001a:
            com.google.android.recaptcha.internal.zzed r3 = new com.google.android.recaptcha.internal.zzed
            r3.<init>(r1, r2)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r2 = r9.zzb
            p5.a r3 = p5.a.f11033a
            int r4 = r9.zzd
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0059
            if (r4 == r6) goto L_0x0046
            if (r4 != r5) goto L_0x003e
            java.lang.String r0 = r9.zzf
            com.google.android.recaptcha.internal.zzef r3 = r9.zze
            I1.b.I0(r2)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            goto L_0x00b0
        L_0x0038:
            r0 = move-exception
            goto L_0x00c7
        L_0x003b:
            r0 = move-exception
            goto L_0x00d5
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            double r10 = r9.zza
            com.google.android.recaptcha.RecaptchaAction r0 = r9.zzg
            java.lang.String r4 = r9.zzf
            com.google.android.recaptcha.internal.zzef r6 = r9.zze
            I1.b.I0(r2)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r11 = r10
            r10 = r6
            r16 = r4
            r4 = r0
            r0 = r16
            goto L_0x008e
        L_0x0059:
            I1.b.I0(r2)
            com.google.android.recaptcha.internal.zzcm r2 = r1.zzb     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzcj r4 = com.google.android.recaptcha.internal.zzcm.zzb     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            boolean r2 = kotlin.jvm.internal.j.a(r2, r4)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            if (r2 == 0) goto L_0x00bd
            r10 = r20
            double r10 = (double) r10     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r2 = r1.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r12 = 4601778099247172813(0x3fdccccccccccccd, double:0.45)
            double r12 = r12 * r10
            r9.zze = r1     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r9.zzf = r0     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r4 = r19
            r9.zzg = r4     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r14 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            double r10 = r10 * r14
            r9.zza = r10     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r9.zzd = r6     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            long r12 = (long) r12     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            java.lang.Object r2 = r2.zzl(r0, r12, r9)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            if (r2 == r3) goto L_0x00bc
            r11 = r10
            r10 = r1
        L_0x008e:
            com.google.android.recaptcha.internal.zzsi r2 = (com.google.android.recaptcha.internal.zzsi) r2     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r6 = r10.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzsc r8 = r10.zzc     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            if (r8 != 0) goto L_0x0097
            r8 = r7
        L_0x0097:
            com.google.android.recaptcha.internal.zzsp r2 = r6.zzi(r4, r2, r8)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r4 = r10.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            long r11 = (long) r11     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r9.zze = r10     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r9.zzf = r0     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r9.zzg = r7     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r9.zzd = r5     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r5 = r2
            r6 = r0
            r7 = r11
            java.lang.Object r2 = r4.zzm(r5, r6, r7, r9)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            if (r2 == r3) goto L_0x00bc
            r3 = r10
        L_0x00b0:
            com.google.android.recaptcha.internal.zzsr r2 = (com.google.android.recaptcha.internal.zzsr) r2     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r3 = r3.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r3.zzq(r0, r2)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            java.lang.String r0 = r2.zzj()     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            return r0
        L_0x00bc:
            return r3
        L_0x00bd:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zzar     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r0.<init>(r2, r3, r7)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            throw r0     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
        L_0x00c7:
            com.google.android.recaptcha.internal.zzbd r2 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r3 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r4 = com.google.android.recaptcha.internal.zzba.zzaz
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r3, r4, r0)
            throw r2
        L_0x00d5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, o5.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r12.zza.zzn(r2, (long) r13, r0) == r1) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzb(long r12, o5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzee
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.recaptcha.internal.zzee r0 = (com.google.android.recaptcha.internal.zzee) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzee r0 = new com.google.android.recaptcha.internal.zzee
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.zzb
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzd
            m5.h r3 = m5.C0849h.f10203c
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            com.google.android.recaptcha.internal.zzef r12 = r0.zze
            I1.b.I0(r14)     // Catch:{ zzbd -> 0x002f }
            goto L_0x009b
        L_0x002f:
            r13 = move-exception
            goto L_0x00a6
        L_0x0032:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003a:
            double r12 = r0.zza
            com.google.android.recaptcha.internal.zzef r2 = r0.zze
            I1.b.I0(r14)     // Catch:{ zzbd -> 0x0046 }
            r10 = r2
            r2 = r14
            r13 = r12
            r12 = r10
            goto L_0x008a
        L_0x0046:
            r13 = move-exception
            r12 = r2
            goto L_0x00a6
        L_0x0049:
            I1.b.I0(r14)
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzcj r2 = com.google.android.recaptcha.internal.zzcm.zzb
            boolean r14 = kotlin.jvm.internal.j.a(r14, r2)
            if (r14 != 0) goto L_0x00ad
            com.google.android.recaptcha.internal.zzcm r14 = r11.zzb
            com.google.android.recaptcha.internal.zzci r2 = com.google.android.recaptcha.internal.zzcm.zzd
            boolean r14 = kotlin.jvm.internal.j.a(r14, r2)
            if (r14 == 0) goto L_0x0065
            goto L_0x00ad
        L_0x0065:
            com.google.android.recaptcha.internal.zzck r14 = com.google.android.recaptcha.internal.zzcm.zzc
            r11.zzb = r14
            double r12 = (double) r12
            com.google.android.recaptcha.internal.zzdt r14 = r11.zza     // Catch:{ zzbd -> 0x00a3 }
            r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r6 = r6 * r12
            r0.zze = r11     // Catch:{ zzbd -> 0x00a3 }
            r8 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r12 = r12 * r8
            r0.zza = r12     // Catch:{ zzbd -> 0x00a3 }
            r0.zzd = r5     // Catch:{ zzbd -> 0x00a3 }
            long r5 = (long) r6     // Catch:{ zzbd -> 0x00a3 }
            java.lang.Object r14 = r14.zzo(r5, r0)     // Catch:{ zzbd -> 0x00a3 }
            if (r14 == r1) goto L_0x00a2
            r2 = r14
            r13 = r12
            r12 = r11
        L_0x008a:
            com.google.android.recaptcha.internal.zzsc r2 = (com.google.android.recaptcha.internal.zzsc) r2     // Catch:{ zzbd -> 0x002f }
            r12.zzc = r2     // Catch:{ zzbd -> 0x002f }
            com.google.android.recaptcha.internal.zzdt r5 = r12.zza     // Catch:{ zzbd -> 0x002f }
            long r13 = (long) r13     // Catch:{ zzbd -> 0x002f }
            r0.zze = r12     // Catch:{ zzbd -> 0x002f }
            r0.zzd = r4     // Catch:{ zzbd -> 0x002f }
            java.lang.Object r13 = r5.zzn(r2, r13, r0)     // Catch:{ zzbd -> 0x002f }
            if (r13 == r1) goto L_0x00a2
        L_0x009b:
            com.google.android.recaptcha.internal.zzcj r13 = com.google.android.recaptcha.internal.zzcm.zzb     // Catch:{ zzbd -> 0x002f }
            r12.zzb = r13     // Catch:{ zzbd -> 0x002f }
            return r3
        L_0x00a2:
            return r1
        L_0x00a3:
            r12 = move-exception
            r13 = r12
            r12 = r11
        L_0x00a6:
            com.google.android.recaptcha.internal.zzci r14 = com.google.android.recaptcha.internal.zzcm.zzd
            r12.zzb = r14
            throw r13
        L_0x00ad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzef.zzb(long, o5.d):java.lang.Object");
    }
}
