package com.google.android.recaptcha.internal;

import G5.C;
import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

final class zzfs extends h implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgd, zzft zzft, String str, d dVar) {
        super(2, dVar);
        this.zzd = zzgd;
        this.zze = zzft;
        this.zzf = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzfs(this.zzd, this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r1.zzh(r7, r2, r6) != r0) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 == r2) goto L_0x000e
            I1.b.I0(r7)
            goto L_0x0082
        L_0x000e:
            java.lang.Object r1 = r6.zzb
            com.google.android.recaptcha.internal.zzjh r1 = (com.google.android.recaptcha.internal.zzjh) r1
            java.lang.Object r2 = r6.zza
            com.google.android.recaptcha.internal.zzub r2 = (com.google.android.recaptcha.internal.zzub) r2
            I1.b.I0(r7)     // Catch:{ Exception -> 0x001a }
            goto L_0x005d
        L_0x001a:
            r7 = move-exception
            goto L_0x006f
        L_0x001c:
            I1.b.I0(r7)
            com.google.android.recaptcha.internal.zzgd r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbn r1 = new com.google.android.recaptcha.internal.zzbn
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzkh r1 = com.google.android.recaptcha.internal.zzkh.zzh()     // Catch:{ Exception -> 0x001a }
            byte[] r7 = r1.zzj(r7)     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzub r7 = com.google.android.recaptcha.internal.zzub.zzi(r7)     // Catch:{ Exception -> 0x001a }
            r7.zzf()     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzft r1 = r6.zze     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzhx r1 = r1.zzc     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zztz r1 = r1.zza(r7)     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzjh r3 = com.google.android.recaptcha.internal.zzjh.zzb()     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzft r4 = r6.zze     // Catch:{ Exception -> 0x001a }
            java.util.List r1 = r1.zzi()     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzgd r5 = r6.zzd     // Catch:{ Exception -> 0x001a }
            r6.zza = r7     // Catch:{ Exception -> 0x001a }
            r6.zzb = r3     // Catch:{ Exception -> 0x001a }
            r6.zzc = r2     // Catch:{ Exception -> 0x001a }
            java.lang.Object r1 = r4.zzg(r1, r5, r6)     // Catch:{ Exception -> 0x001a }
            if (r1 == r0) goto L_0x0081
            r2 = r7
            r1 = r3
        L_0x005d:
            r1.zzf()     // Catch:{ Exception -> 0x001a }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Exception -> 0x001a }
            long r3 = r1.zza(r7)     // Catch:{ Exception -> 0x001a }
            java.lang.Long r7 = new java.lang.Long     // Catch:{ Exception -> 0x001a }
            r7.<init>(r3)     // Catch:{ Exception -> 0x001a }
            r2.zzf()     // Catch:{ Exception -> 0x001a }
            goto L_0x0082
        L_0x006f:
            com.google.android.recaptcha.internal.zzft r1 = r6.zze
            com.google.android.recaptcha.internal.zzgd r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r7 = r1.zzh(r7, r2, r6)
            if (r7 != r0) goto L_0x0082
        L_0x0081:
            return r0
        L_0x0082:
            m5.h r7 = m5.C0849h.f10203c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
