package com.google.android.recaptcha.internal;

import m5.C0849h;
import o5.d;

public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008f A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3 A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v3 java.lang.Object), (r0v11 java.lang.Object), (r0v11 java.lang.Object), (r0v1 java.lang.Object) binds: [B:42:0x00d0, B:29:0x008d, B:30:0x008f, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzc(java.lang.String r19, long r20, o5.d r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r0 = r22
            boolean r5 = r0 instanceof com.google.android.recaptcha.internal.zza
            if (r5 == 0) goto L_0x001b
            r5 = r0
            com.google.android.recaptcha.internal.zza r5 = (com.google.android.recaptcha.internal.zza) r5
            int r6 = r5.zze
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.zze = r6
            goto L_0x0020
        L_0x001b:
            com.google.android.recaptcha.internal.zza r5 = new com.google.android.recaptcha.internal.zza
            r5.<init>(r1, r0)
        L_0x0020:
            java.lang.Object r0 = r5.zzc
            p5.a r12 = p5.a.f11033a
            int r6 = r5.zze
            r13 = 3
            r7 = 2
            r8 = 1
            r14 = 0
            if (r6 == 0) goto L_0x0067
            if (r6 == r8) goto L_0x004a
            if (r6 == r7) goto L_0x003f
            if (r6 != r13) goto L_0x0037
            I1.b.I0(r0)
            goto L_0x00d3
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            java.lang.String r2 = r5.zzf
            java.lang.Object r3 = r5.zza
            com.google.android.recaptcha.internal.zze r3 = (com.google.android.recaptcha.internal.zze) r3
            I1.b.I0(r0)
            goto L_0x00c6
        L_0x004a:
            long r2 = r5.zzb
            com.google.android.recaptcha.internal.zzen r4 = r5.zzg
            java.lang.String r6 = r5.zzf
            java.lang.Object r8 = r5.zza
            com.google.android.recaptcha.internal.zze r8 = (com.google.android.recaptcha.internal.zze) r8
            I1.b.I0(r0)     // Catch:{ Exception -> 0x005e }
            r16 = r6
            r6 = r4
            r3 = r2
            r2 = r16
            goto L_0x0084
        L_0x005e:
            r0 = move-exception
            r10 = r0
            r16 = r2
            r2 = r6
        L_0x0063:
            r3 = r8
            r8 = r16
            goto L_0x009f
        L_0x0067:
            I1.b.I0(r0)
            com.google.android.recaptcha.internal.zzen r6 = r18.zza(r19)
            com.google.android.recaptcha.internal.zzb r0 = new com.google.android.recaptcha.internal.zzb     // Catch:{ Exception -> 0x009a }
            r0.<init>(r1, r2, r14)     // Catch:{ Exception -> 0x009a }
            r5.zza = r1     // Catch:{ Exception -> 0x009a }
            r5.zzf = r2     // Catch:{ Exception -> 0x009a }
            r5.zzg = r6     // Catch:{ Exception -> 0x009a }
            r5.zzb = r3     // Catch:{ Exception -> 0x009a }
            r5.zze = r8     // Catch:{ Exception -> 0x009a }
            java.lang.Object r0 = G5.F.x(r3, r0, r5)     // Catch:{ Exception -> 0x009a }
            if (r0 == r12) goto L_0x0099
            r8 = r1
        L_0x0084:
            m5.f r0 = (m5.C0847f) r0     // Catch:{ Exception -> 0x0093 }
            java.lang.Object r0 = r0.f10198a     // Catch:{ Exception -> 0x0093 }
            I1.b.I0(r0)     // Catch:{ Exception -> 0x0093 }
            com.google.android.recaptcha.internal.zzsi r0 = (com.google.android.recaptcha.internal.zzsi) r0     // Catch:{ Exception -> 0x0093 }
            if (r6 == 0) goto L_0x00d3
            r6.zza()     // Catch:{ Exception -> 0x0093 }
            goto L_0x00d3
        L_0x0093:
            r0 = move-exception
            r10 = r0
            r16 = r3
            r4 = r6
            goto L_0x0063
        L_0x0099:
            return r12
        L_0x009a:
            r0 = move-exception
            r10 = r0
            r8 = r3
            r4 = r6
            r3 = r1
        L_0x009f:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r6 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r11 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r15 = r10.getMessage()
            r0.<init>(r6, r11, r15)
            com.google.android.recaptcha.internal.zzbd r0 = com.google.android.recaptcha.internal.zzf.zza(r10, r0)
            if (r4 == 0) goto L_0x00b5
            r4.zzb(r0)
        L_0x00b5:
            r5.zza = r3
            r5.zzf = r2
            r5.zzg = r14
            r5.zze = r7
            r6 = r3
            r7 = r2
            r11 = r5
            java.lang.Object r0 = r6.zzi(r7, r8, r10, r11)
            if (r0 == r12) goto L_0x00d4
        L_0x00c6:
            r5.zza = r14
            r5.zzf = r14
            r5.zze = r13
            java.lang.Object r0 = r3.zzd(r2, r5)
            if (r0 != r12) goto L_0x00d3
            return r12
        L_0x00d3:
            return r0
        L_0x00d4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, o5.d):java.lang.Object");
    }

    public abstract Object zzd(String str, d dVar);

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r13 == r1) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082 A[Catch:{ Exception -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zze(long r10, com.google.android.recaptcha.internal.zzsc r12, o5.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.zzb
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzd
            m5.h r3 = m5.C0849h.f10203c
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r7) goto L_0x0047
            if (r2 == r6) goto L_0x003d
            if (r2 != r5) goto L_0x0035
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zzbd r10 = (com.google.android.recaptcha.internal.zzbd) r10
            I1.b.I0(r13)
            goto L_0x00b0
        L_0x0035:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003d:
            com.google.android.recaptcha.internal.zzen r10 = r0.zze
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            I1.b.I0(r13)
            goto L_0x009b
        L_0x0047:
            com.google.android.recaptcha.internal.zzen r10 = r0.zze
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            I1.b.I0(r13)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0077
        L_0x0051:
            r12 = move-exception
            goto L_0x008c
        L_0x0053:
            I1.b.I0(r13)
            com.google.android.recaptcha.internal.zzen r13 = r9.zzb()
            boolean r2 = r9.zza
            if (r2 == 0) goto L_0x0062
            r13.zza()
            return r3
        L_0x0062:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch:{ Exception -> 0x0088 }
            r2.<init>(r9, r12, r4)     // Catch:{ Exception -> 0x0088 }
            r0.zza = r9     // Catch:{ Exception -> 0x0088 }
            r0.zze = r13     // Catch:{ Exception -> 0x0088 }
            r0.zzd = r7     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r10 = G5.F.x(r10, r2, r0)     // Catch:{ Exception -> 0x0088 }
            if (r10 == r1) goto L_0x00b5
            r11 = r9
            r8 = r13
            r13 = r10
            r10 = r8
        L_0x0077:
            m5.f r13 = (m5.C0847f) r13     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r12 = r13.f10198a     // Catch:{ Exception -> 0x0051 }
            I1.b.I0(r12)     // Catch:{ Exception -> 0x0051 }
            r11.zza = r7     // Catch:{ Exception -> 0x0051 }
            if (r10 == 0) goto L_0x0085
            r10.zza()     // Catch:{ Exception -> 0x0051 }
        L_0x0085:
            return r3
        L_0x0086:
            r12 = r10
            goto L_0x008a
        L_0x0088:
            r10 = move-exception
            goto L_0x0086
        L_0x008a:
            r11 = r9
            r10 = r13
        L_0x008c:
            r13 = 0
            r11.zza = r13
            r0.zza = r11
            r0.zze = r10
            r0.zzd = r6
            java.lang.Object r13 = r11.zzj(r12, r0)
            if (r13 == r1) goto L_0x00b5
        L_0x009b:
            r12 = r13
            com.google.android.recaptcha.internal.zzbd r12 = (com.google.android.recaptcha.internal.zzbd) r12
            if (r10 == 0) goto L_0x00a3
            r10.zzb(r12)
        L_0x00a3:
            r0.zza = r12
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r10 = r11.zzg(r12, r0)
            if (r10 == r1) goto L_0x00b5
            r10 = r12
        L_0x00b0:
            m5.e r10 = I1.b.r(r10)
            return r10
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, o5.d):java.lang.Object");
    }

    public abstract Object zzf(String str, d dVar);

    public Object zzg(zzbd zzbd, d dVar) {
        return C0849h.f10203c;
    }

    public abstract Object zzh(zzsc zzsc, d dVar);

    public Object zzi(String str, long j6, Exception exc, d dVar) {
        return C0849h.f10203c;
    }

    public Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsr) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
