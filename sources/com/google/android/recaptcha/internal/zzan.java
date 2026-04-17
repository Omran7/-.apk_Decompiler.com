package com.google.android.recaptcha.internal;

import G5.C;
import G5.r;
import M5.a;
import M5.d;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import m5.C0849h;

public final class zzan {
    public r zza;
    /* access modifiers changed from: private */
    public final C zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    /* access modifiers changed from: private */
    public zzao zze = zzao.zza;
    private long zzf;
    private final a zzg = new d(false);
    private boolean zzh;

    public zzan(Context context, C c3, zzek zzek, StandardIntegrityManager standardIntegrityManager, long j6) {
        this.zzb = c3;
        this.zzc = zzek;
        this.zzd = standardIntegrityManager;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzi(o5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            I1.b.I0(r7)
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x002f:
            I1.b.I0(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            G5.I r7 = com.google.android.recaptcha.internal.zzbx.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L_0x0053
            return r1
        L_0x0053:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(o5.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r7 != r1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (r7 != r1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzj(java.lang.String r6, o5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            I1.b.I0(r7)
            goto L_0x006d
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.String r6 = r0.zzd
            I1.b.I0(r7)
            goto L_0x004b
        L_0x0038:
            I1.b.I0(r7)
            G5.r r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            G5.s r7 = (G5.C0046s) r7
            java.lang.Object r7 = r7.h(r0)
            if (r7 == r1) goto L_0x0074
        L_0x004b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            G5.I r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, o5.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzc(java.lang.String r7, o5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            I1.b.I0(r8)
            goto L_0x0074
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            I1.b.I0(r8)
            goto L_0x0067
        L_0x003d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            I1.b.I0(r8)     // Catch:{ Exception -> 0x005a }
            goto L_0x0056
        L_0x0045:
            I1.b.I0(r8)
            r0.zzd = r6     // Catch:{ Exception -> 0x0059 }
            r0.zze = r7     // Catch:{ Exception -> 0x0059 }
            r0.zzc = r5     // Catch:{ Exception -> 0x0059 }
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch:{ Exception -> 0x0059 }
            if (r8 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x005a }
            goto L_0x0076
        L_0x0059:
            r2 = r6
        L_0x005a:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L_0x0077
        L_0x0074:
            java.lang.String r8 = (java.lang.String) r8
        L_0x0076:
            return r8
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, o5.d):java.lang.Object");
    }

    public final Object zzd(long j6, o5.d dVar) {
        this.zzf = j6;
        return C0849h.f10203c;
    }

    /* JADX WARNING: type inference failed for: r14v10, types: [M5.a, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[SYNTHETIC, Splitter:B:22:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zze(o5.d r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.zzb
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzd
            m5.h r3 = m5.C0849h.f10203c
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0035
            if (r2 != r4) goto L_0x002d
            I1.b.I0(r14)
            goto L_0x00b1
        L_0x002d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0035:
            java.lang.Object r2 = r0.zza
            M5.a r2 = (M5.a) r2
            com.google.android.recaptcha.internal.zzan r6 = r0.zze
            I1.b.I0(r14)
            goto L_0x0054
        L_0x003f:
            I1.b.I0(r14)
            M5.a r14 = r13.zzg
            r0.zze = r13
            r0.zza = r14
            r0.zzd = r5
            r2 = r14
            M5.d r2 = (M5.d) r2
            java.lang.Object r14 = r2.c(r0)
            if (r14 == r1) goto L_0x00b9
            r6 = r13
        L_0x0054:
            com.google.android.recaptcha.internal.zzao r14 = r6.zze     // Catch:{ all -> 0x00b2 }
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zza     // Catch:{ all -> 0x00b2 }
            boolean r14 = kotlin.jvm.internal.j.a(r14, r7)     // Catch:{ all -> 0x00b2 }
            if (r14 != 0) goto L_0x0064
            M5.d r2 = (M5.d) r2
            r2.d()
            return r3
        L_0x0064:
            com.google.android.recaptcha.internal.zzao r14 = com.google.android.recaptcha.internal.zzao.zzb     // Catch:{ all -> 0x00b2 }
            r6.zze = r14     // Catch:{ all -> 0x00b2 }
            M5.d r2 = (M5.d) r2
            r2.d()
            com.google.android.recaptcha.internal.zzek r14 = r6.zzc
            java.lang.String r2 = r14.zzd()
            r14.zzc(r2)
            r14.zzb(r4)
            r2 = 38
            com.google.android.recaptcha.internal.zzen r14 = r14.zzf(r2)
            G5.s r2 = G5.F.a()
            r6.zza = r2
            G5.C r2 = r6.zzb
            com.google.android.recaptcha.internal.zzam r7 = new com.google.android.recaptcha.internal.zzam
            r8 = 0
            r7.<init>(r6, r14, r8)
            r14 = 3
            G5.F.q(r2, r8, r7, r14)
            r0.zze = r8
            r0.zza = r8
            r0.zzd = r4
            boolean r14 = r6.zzh
            if (r14 != 0) goto L_0x00ae
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzai r8 = new com.google.android.recaptcha.internal.zzai
            r8.<init>(r6)
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r11
            r7.schedule(r8, r9, r11)
            r6.zzh = r5
        L_0x00ae:
            if (r3 != r1) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            return r3
        L_0x00b2:
            r14 = move-exception
            M5.d r2 = (M5.d) r2
            r2.d()
            throw r14
        L_0x00b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(o5.d):java.lang.Object");
    }

    public final r zzf() {
        r rVar = this.zza;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }
}
