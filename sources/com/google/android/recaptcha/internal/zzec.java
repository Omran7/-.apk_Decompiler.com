package com.google.android.recaptcha.internal;

import G5.A;
import G5.C0046s;
import G5.F;
import G5.r;
import kotlin.jvm.internal.j;
import m5.C0849h;
import o5.d;
import p5.a;

public final class zzec implements zzcn {
    /* access modifiers changed from: private */
    public final zzdt zza;
    /* access modifiers changed from: private */
    public final zzek zzb;
    /* access modifiers changed from: private */
    public r zzc = F.a();
    /* access modifiers changed from: private */
    public zzbd zzd;
    /* access modifiers changed from: private */
    public zzsc zze;
    /* access modifiers changed from: private */
    public zzcm zzf = zzcm.zza;
    private final zzbi zzg;

    public zzec(zzdt zzdt, zzbi zzbi, zzek zzek, zzbo zzbo) {
        this.zza = zzdt;
        this.zzg = zzbi;
        this.zzb = zzek;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzl(x5.l r5, o5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzdv
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzdv r0 = (com.google.android.recaptcha.internal.zzdv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdv r0 = new com.google.android.recaptcha.internal.zzdv
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            com.google.android.recaptcha.internal.zzbn r5 = r0.zzd
            I1.b.I0(r6)
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            I1.b.I0(r6)
            com.google.android.recaptcha.internal.zzbn r6 = new com.google.android.recaptcha.internal.zzbn
            r6.<init>()
            r0.zzd = r6
            r0.zzc = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 == r1) goto L_0x0053
            r5 = r6
        L_0x0044:
            r5.zzc()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r5.zza(r6)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            return r0
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzl(x5.l, o5.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[SYNTHETIC, Splitter:B:30:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzm(long r7, o5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdw
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.recaptcha.internal.zzdw r0 = (com.google.android.recaptcha.internal.zzdw) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdw r0 = new com.google.android.recaptcha.internal.zzdw
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.zzb
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            long r7 = r0.zza
            com.google.android.recaptcha.internal.zzec r0 = r0.zze
            I1.b.I0(r9)     // Catch:{ Exception -> 0x002f }
            goto L_0x0063
        L_0x002f:
            r7 = move-exception
            goto L_0x0082
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            long r7 = r0.zza
            com.google.android.recaptcha.internal.zzec r2 = r0.zze
            I1.b.I0(r9)
            goto L_0x0051
        L_0x0041:
            I1.b.I0(r9)
            r0.zze = r6
            r0.zza = r7
            r0.zzd = r4
            java.lang.Object r9 = r6.zzn(r7, r0)
            if (r9 == r1) goto L_0x00b8
            r2 = r6
        L_0x0051:
            com.google.android.recaptcha.internal.zzdy r9 = new com.google.android.recaptcha.internal.zzdy     // Catch:{ Exception -> 0x0080 }
            r9.<init>(r7, r2, r5)     // Catch:{ Exception -> 0x0080 }
            r0.zze = r2     // Catch:{ Exception -> 0x0080 }
            r0.zza = r7     // Catch:{ Exception -> 0x0080 }
            r0.zzd = r3     // Catch:{ Exception -> 0x0080 }
            java.lang.Object r9 = r2.zzl(r9, r0)     // Catch:{ Exception -> 0x0080 }
            if (r9 == r1) goto L_0x00b8
            r0 = r2
        L_0x0063:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch:{ Exception -> 0x002f }
            long r1 = r9.longValue()     // Catch:{ Exception -> 0x002f }
            long r7 = r7 - r1
            r1 = 500(0x1f4, double:2.47E-321)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0076
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r7)
            return r9
        L_0x0076:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd     // Catch:{ Exception -> 0x002f }
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzc     // Catch:{ Exception -> 0x002f }
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzar     // Catch:{ Exception -> 0x002f }
            r7.<init>(r8, r9, r5)     // Catch:{ Exception -> 0x002f }
            throw r7     // Catch:{ Exception -> 0x002f }
        L_0x0080:
            r7 = move-exception
            r0 = r2
        L_0x0082:
            boolean r8 = r7 instanceof com.google.android.recaptcha.internal.zzbd
            if (r8 == 0) goto L_0x0089
            r5 = r7
            com.google.android.recaptcha.internal.zzbd r5 = (com.google.android.recaptcha.internal.zzbd) r5
        L_0x0089:
            if (r5 != 0) goto L_0x0098
            com.google.android.recaptcha.internal.zzbd r5 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzar
            java.lang.String r7 = r7.getMessage()
            r5.<init>(r8, r9, r7)
        L_0x0098:
            com.google.android.recaptcha.internal.zzcm r7 = r0.zzf
            com.google.android.recaptcha.internal.zzci r8 = com.google.android.recaptcha.internal.zzcm.zzd
            boolean r7 = kotlin.jvm.internal.j.a(r7, r8)
            if (r7 != 0) goto L_0x00b2
            com.google.android.recaptcha.internal.zzcm r7 = r0.zzf
            com.google.android.recaptcha.internal.zzck r8 = com.google.android.recaptcha.internal.zzcm.zzc
            boolean r7 = kotlin.jvm.internal.j.a(r7, r8)
            if (r7 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            throw r5
        L_0x00b2:
            com.google.android.recaptcha.internal.zzbd r7 = r0.zzd
            if (r7 == 0) goto L_0x00b7
            r5 = r7
        L_0x00b7:
            throw r5
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzm(long, o5.d):java.lang.Object");
    }

    private final Object zzn(long j6, d dVar) {
        boolean a6 = j.a(this.zzf, zzcm.zzb);
        C0849h hVar = C0849h.f10203c;
        if (a6 || j.a(this.zzf, zzcm.zzc) || (j.a(this.zzf, zzcm.zzd) && !zzo(this.zzd))) {
            return hVar;
        }
        this.zzf = zzcm.zzc;
        C0046s a7 = F.a();
        this.zzc = a7;
        F.q(this.zzg.zza(), (A) null, new zzeb(this, a7, j6, (d) null), 3);
        return hVar;
    }

    /* access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbd = (zzbd) exc;
        if (j.a(zzbd.zzb(), zzbb.zzd) || j.a(zzbd.zzb(), zzbb.zze) || j.a(zzbd.zzb(), zzbb.zzf)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae A[Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6 A[Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, o5.d r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r22
            boolean r2 = r0 instanceof com.google.android.recaptcha.internal.zzdu
            if (r2 == 0) goto L_0x0018
            r2 = r0
            com.google.android.recaptcha.internal.zzdu r2 = (com.google.android.recaptcha.internal.zzdu) r2
            int r3 = r2.zzd
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.zzd = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            com.google.android.recaptcha.internal.zzdu r2 = new com.google.android.recaptcha.internal.zzdu
            r2.<init>(r1, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r8.zzb
            p5.a r2 = p5.a.f11033a
            int r3 = r8.zzd
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0061
            if (r3 == r6) goto L_0x0054
            if (r3 == r5) goto L_0x0046
            if (r3 != r4) goto L_0x003e
            java.lang.String r2 = r8.zzf
            com.google.android.recaptcha.internal.zzec r3 = r8.zze
            I1.b.I0(r0)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            goto L_0x00c8
        L_0x0038:
            r0 = move-exception
            goto L_0x00d5
        L_0x003b:
            r0 = move-exception
            goto L_0x00e3
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            double r5 = r8.zza
            com.google.android.recaptcha.RecaptchaAction r3 = r8.zzg
            java.lang.String r7 = r8.zzf
            com.google.android.recaptcha.internal.zzec r9 = r8.zze
            I1.b.I0(r0)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r10 = r9
            r9 = r7
            goto L_0x00a5
        L_0x0054:
            com.google.android.recaptcha.RecaptchaAction r3 = r8.zzg
            java.lang.String r6 = r8.zzf
            com.google.android.recaptcha.internal.zzec r7 = r8.zze
            I1.b.I0(r0)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r15 = r6
            r6 = r0
            r0 = r15
            goto L_0x007a
        L_0x0061:
            I1.b.I0(r0)
            r8.zze = r1     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r0 = r18
            r8.zzf = r0     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r3 = r19
            r8.zzg = r3     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zzd = r6     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r6 = r20
            java.lang.Object r6 = r1.zzm(r6, r8)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            if (r6 != r2) goto L_0x0079
            return r2
        L_0x0079:
            r7 = r1
        L_0x007a:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            long r9 = r6.longValue()     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            double r9 = (double) r9     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r6 = r7.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r11 = 4601778099247172813(0x3fdccccccccccccd, double:0.45)
            double r11 = r11 * r9
            r8.zze = r7     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zzf = r0     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zzg = r3     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r13 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            double r9 = r9 * r13
            r8.zza = r9     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zzd = r5     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            long r11 = (long) r11     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            java.lang.Object r5 = r6.zzl(r0, r11, r8)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            if (r5 == r2) goto L_0x00d4
            r15 = r9
            r9 = r0
            r0 = r5
            r10 = r7
            r5 = r15
        L_0x00a5:
            com.google.android.recaptcha.internal.zzsi r0 = (com.google.android.recaptcha.internal.zzsi) r0     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r7 = r10.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzsc r11 = r10.zze     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r12 = 0
            if (r11 != 0) goto L_0x00af
            r11 = r12
        L_0x00af:
            com.google.android.recaptcha.internal.zzsp r0 = r7.zzi(r3, r0, r11)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r3 = r10.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            long r6 = (long) r5     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zze = r10     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zzf = r9     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zzg = r12     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r8.zzd = r4     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r4 = r0
            r5 = r9
            java.lang.Object r0 = r3.zzm(r4, r5, r6, r8)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            if (r0 == r2) goto L_0x00d4
            r2 = r9
            r3 = r10
        L_0x00c8:
            com.google.android.recaptcha.internal.zzsr r0 = (com.google.android.recaptcha.internal.zzsr) r0     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            com.google.android.recaptcha.internal.zzdt r3 = r3.zza     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            r3.zzq(r2, r0)     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            java.lang.String r0 = r0.zzj()     // Catch:{ zzbd -> 0x003b, Exception -> 0x0038 }
            return r0
        L_0x00d4:
            return r2
        L_0x00d5:
            com.google.android.recaptcha.internal.zzbd r2 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r3 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r4 = com.google.android.recaptcha.internal.zzba.zzay
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r3, r4, r0)
            throw r2
        L_0x00e3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, o5.d):java.lang.Object");
    }

    public final Object zzb(long j6, d dVar) {
        Object zzn = zzn(j6, dVar);
        if (zzn == a.f11033a) {
            return zzn;
        }
        return C0849h.f10203c;
    }
}
