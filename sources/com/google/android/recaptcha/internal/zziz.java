package com.google.android.recaptcha.internal;

import G5.C;
import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

final class zziz extends h implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzja, zzen zzen, d dVar) {
        super(2, dVar);
        this.zzc = zzja;
        this.zzd = zzen;
    }

    public final d create(Object obj, d dVar) {
        return new zziz(this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r6.zzx(r5) != r0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (G5.F.x(20000, r6, r5) == r0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r5.zzb
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 == r2) goto L_0x0014
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zzbd r0 = (com.google.android.recaptcha.internal.zzbd) r0
            I1.b.I0(r6)
            goto L_0x0069
        L_0x0014:
            I1.b.I0(r6)     // Catch:{ Exception -> 0x0018 }
            goto L_0x006e
        L_0x0018:
            r6 = move-exception
            goto L_0x0040
        L_0x001a:
            I1.b.I0(r6)     // Catch:{ Exception -> 0x0018 }
            goto L_0x002b
        L_0x001e:
            I1.b.I0(r6)
            com.google.android.recaptcha.internal.zzja r6 = r5.zzc     // Catch:{ Exception -> 0x0018 }
            r5.zzb = r3     // Catch:{ Exception -> 0x0018 }
            java.lang.Object r6 = r6.zzx(r5)     // Catch:{ Exception -> 0x0018 }
            if (r6 == r0) goto L_0x0067
        L_0x002b:
            com.google.android.recaptcha.internal.zziy r6 = new com.google.android.recaptcha.internal.zziy     // Catch:{ Exception -> 0x0018 }
            com.google.android.recaptcha.internal.zzja r1 = r5.zzc     // Catch:{ Exception -> 0x0018 }
            com.google.android.recaptcha.internal.zzen r3 = r5.zzd     // Catch:{ Exception -> 0x0018 }
            r4 = 0
            r6.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x0018 }
            r5.zzb = r2     // Catch:{ Exception -> 0x0018 }
            r1 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r6 = G5.F.x(r1, r6, r5)     // Catch:{ Exception -> 0x0018 }
            if (r6 != r0) goto L_0x006e
            goto L_0x0067
        L_0x0040:
            r6.getMessage()
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zzV
            java.lang.String r4 = r6.getMessage()
            r1.<init>(r2, r3, r4)
            com.google.android.recaptcha.internal.zzbd r6 = com.google.android.recaptcha.internal.zzf.zza(r6, r1)
            com.google.android.recaptcha.internal.zzja r1 = r5.zzc
            com.google.android.recaptcha.internal.zzcb r1 = r1.zzm()
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zza
            r5.zza = r6
            r3 = 3
            r5.zzb = r3
            java.lang.Object r1 = r1.zzc(r2, r5)
            if (r1 != r0) goto L_0x0068
        L_0x0067:
            return r0
        L_0x0068:
            r0 = r6
        L_0x0069:
            com.google.android.recaptcha.internal.zzen r6 = r5.zzd
            r6.zzb(r0)
        L_0x006e:
            m5.h r6 = m5.C0849h.f10203c
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
