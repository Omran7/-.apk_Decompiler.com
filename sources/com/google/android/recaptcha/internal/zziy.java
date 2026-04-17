package com.google.android.recaptcha.internal;

import G5.C;
import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

final class zziy extends h implements p {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzja, zzen zzen, d dVar) {
        super(2, dVar);
        this.zzf = zzja;
        this.zzg = zzen;
    }

    public final d create(Object obj, d dVar) {
        return new zziy(this.zzf, this.zzg, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        if (r9.zzE(r1, r8) != r0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00bc, code lost:
        if (((G5.C0046s) r9).h(r8) != r0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00be, code lost:
        r9 = r8.zzf.zzm();
        r1 = com.google.android.recaptcha.internal.zzje.zzc;
        r8.zze = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        if (r9.zzc(r1, r8) != r0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d0, code lost:
        r8.zzg.zza();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        return m5.C0849h.f10203c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1 != 3) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r8.zze
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0029
            if (r1 == r4) goto L_0x0015
            I1.b.I0(r9)
            if (r1 == r3) goto L_0x009f
            if (r1 == r2) goto L_0x00be
            goto L_0x00d0
        L_0x0015:
            java.lang.Object r1 = r8.zzd
            com.google.android.recaptcha.internal.zzcg r1 = (com.google.android.recaptcha.internal.zzcg) r1
            java.lang.Object r4 = r8.zzc
            com.google.android.recaptcha.internal.zzsc r4 = (com.google.android.recaptcha.internal.zzsc) r4
            java.lang.Object r6 = r8.zzb
            com.google.android.recaptcha.internal.zzja r6 = (com.google.android.recaptcha.internal.zzja) r6
            java.lang.Object r7 = r8.zza
            com.google.android.recaptcha.internal.zzja r7 = (com.google.android.recaptcha.internal.zzja) r7
            I1.b.I0(r9)
            goto L_0x005d
        L_0x0029:
            I1.b.I0(r9)
            com.google.android.recaptcha.internal.zzja r6 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r9 = r6.zzf
            if (r9 != 0) goto L_0x0035
            r9 = r5
        L_0x0035:
            com.google.android.recaptcha.internal.zzja r1 = r8.zzf
            com.google.android.recaptcha.internal.zzcg r7 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzsc r1 = r1.zzf
            if (r1 != 0) goto L_0x0040
            r1 = r5
        L_0x0040:
            com.google.android.recaptcha.internal.zzle r1 = r1.zzf()
            r7.<init>(r1)
            com.google.android.recaptcha.internal.zzja r1 = r8.zzf
            r8.zza = r6
            r8.zzb = r6
            r8.zzc = r9
            r8.zzd = r7
            r8.zze = r4
            java.lang.Object r1 = r1.zzw(r8)
            if (r1 == r0) goto L_0x00d8
            r4 = r9
            r9 = r1
            r1 = r7
            r7 = r6
        L_0x005d:
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            com.google.android.recaptcha.internal.zzft r9 = r6.zzC(r4, r1, r9)
            r7.zzb = r9
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            G5.r r9 = r9.zzA()
            int r9 = r9.hashCode()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = r9.zzh
            r9.zzd()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = r9.zzh
            r9.zze()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r1 = r9.zzf
            if (r1 != 0) goto L_0x008f
            r1 = r5
        L_0x008f:
            r8.zza = r5
            r8.zzb = r5
            r8.zzc = r5
            r8.zzd = r5
            r8.zze = r3
            java.lang.Object r9 = r9.zzE(r1, r8)
            if (r9 == r0) goto L_0x00d8
        L_0x009f:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            G5.r r9 = r9.zzA()
            int r9 = r9.hashCode()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            G5.r r9 = r9.zzA()
            r8.zze = r2
            G5.s r9 = (G5.C0046s) r9
            java.lang.Object r9 = r9.h(r8)
            if (r9 == r0) goto L_0x00d8
        L_0x00be:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzcb r9 = r9.zzm()
            com.google.android.recaptcha.internal.zzje r1 = com.google.android.recaptcha.internal.zzje.zzc
            r2 = 4
            r8.zze = r2
            java.lang.Object r9 = r9.zzc(r1, r8)
            if (r9 != r0) goto L_0x00d0
            goto L_0x00d8
        L_0x00d0:
            com.google.android.recaptcha.internal.zzen r9 = r8.zzg
            r9.zza()
            m5.h r9 = m5.C0849h.f10203c
            return r9
        L_0x00d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
