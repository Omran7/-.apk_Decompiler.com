package com.google.android.recaptcha.internal;

import F5.b;
import G5.F;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import kotlin.jvm.internal.j;
import o5.d;

public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final b zza = new b();
    /* access modifiers changed from: private */
    public final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcn, String str, zzbi zzbi, zzek zzek) {
        this.zzb = zzcn;
        this.zzc = str;
        this.zze = zzbi;
        this.zzd = zzek;
    }

    public static final void zze(zzdc zzdc, long j6, RecaptchaAction recaptchaAction) {
        zzbd zzbd;
        b bVar = zza;
        String action = recaptchaAction.getAction();
        bVar.getClass();
        j.e(action, "input");
        if (!bVar.f796a.matcher(action).matches()) {
            zzbd = new zzbd(zzbb.zzg, zzba.zzh, (String) null);
        } else {
            zzbd = null;
        }
        if (j6 < 5000) {
            zzbd = new zzbd(zzbb.zzb, zzba.zzI, (String) null);
        }
        if (zzbd != null) {
            throw zzbd;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r12, long r13, o5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.google.android.recaptcha.internal.zzcy
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.google.android.recaptcha.internal.zzcy r0 = (com.google.android.recaptcha.internal.zzcy) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcy r0 = new com.google.android.recaptcha.internal.zzcy
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            I1.b.I0(r15)     // Catch:{ zzbd -> 0x0027 }
            goto L_0x0050
        L_0x0027:
            r12 = move-exception
            goto L_0x0055
        L_0x0029:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0031:
            I1.b.I0(r15)
            java.util.UUID r15 = java.util.UUID.randomUUID()     // Catch:{ zzbd -> 0x0027 }
            java.lang.String r15 = r15.toString()     // Catch:{ zzbd -> 0x0027 }
            com.google.android.recaptcha.internal.zzcz r2 = new com.google.android.recaptcha.internal.zzcz     // Catch:{ zzbd -> 0x0027 }
            r10 = 0
            r4 = r2
            r5 = r11
            r6 = r13
            r8 = r12
            r9 = r15
            r4.<init>(r5, r6, r8, r9, r10)     // Catch:{ zzbd -> 0x0027 }
            r0.zzc = r3     // Catch:{ zzbd -> 0x0027 }
            java.lang.Object r15 = r11.zzg(r15, r2, r0)     // Catch:{ zzbd -> 0x0027 }
            if (r15 != r1) goto L_0x0050
            return r1
        L_0x0050:
            m5.f r15 = (m5.C0847f) r15     // Catch:{ zzbd -> 0x0027 }
            java.lang.Object r12 = r15.f10198a     // Catch:{ zzbd -> 0x0027 }
            goto L_0x005d
        L_0x0055:
            com.google.android.recaptcha.RecaptchaException r12 = r12.zzc()
            m5.e r12 = I1.b.r(r12)
        L_0x005d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzf(com.google.android.recaptcha.RecaptchaAction, long, o5.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzg(java.lang.String r5, x5.p r6, o5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzdb
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzdb r0 = (com.google.android.recaptcha.internal.zzdb) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdb r0 = new com.google.android.recaptcha.internal.zzdb
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            I1.b.I0(r7)     // Catch:{ zzbd -> 0x002b, Exception -> 0x0029 }
            goto L_0x0051
        L_0x0029:
            r6 = move-exception
            goto L_0x0056
        L_0x002b:
            r6 = move-exception
            goto L_0x0067
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            I1.b.I0(r7)
            com.google.android.recaptcha.internal.zzek r7 = r4.zzd
            com.google.android.recaptcha.internal.zzek r7 = r7.zza()
            r7.zzc(r5)
            r5 = 9
            com.google.android.recaptcha.internal.zzen r5 = r7.zzf(r5)
            r0.zzd = r5     // Catch:{ zzbd -> 0x002b, Exception -> 0x0029 }
            r0.zzc = r3     // Catch:{ zzbd -> 0x002b, Exception -> 0x0029 }
            java.lang.Object r7 = r6.invoke(r7, r0)     // Catch:{ zzbd -> 0x002b, Exception -> 0x0029 }
            if (r7 == r1) goto L_0x0055
        L_0x0051:
            r5.zza()     // Catch:{ zzbd -> 0x002b, Exception -> 0x0029 }
            return r7
        L_0x0055:
            return r1
        L_0x0056:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzX
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r0, r1, r6)
            r5.zzb(r7)
            throw r7
        L_0x0067:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzg(java.lang.String, x5.p, o5.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: execute-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m14execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r5, long r6, o5.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcw
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.recaptcha.internal.zzcw r0 = (com.google.android.recaptcha.internal.zzcw) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcw r0 = new com.google.android.recaptcha.internal.zzcw
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            I1.b.I0(r8)
            m5.f r8 = (m5.C0847f) r8
            java.lang.Object r5 = r8.f10198a
            goto L_0x003f
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            I1.b.I0(r8)
            r0.zzc = r3
            java.lang.Object r5 = r4.zzf(r5, r6, r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.m14execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, o5.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: execute-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m15executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, o5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            I1.b.I0(r6)
            m5.f r6 = (m5.C0847f) r6
            java.lang.Object r5 = r6.f10198a
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            I1.b.I0(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.m14execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.m15executegIAlus(com.google.android.recaptcha.RecaptchaAction, o5.d):java.lang.Object");
    }

    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(F.c(this.zze.zzb(), new zzda(this, recaptchaAction, 10000, (d) null)));
    }

    public final String zzd() {
        return this.zzc;
    }

    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j6) {
        return zzas.zza(F.c(this.zze.zzb(), new zzda(this, recaptchaAction, j6, (d) null)));
    }
}
