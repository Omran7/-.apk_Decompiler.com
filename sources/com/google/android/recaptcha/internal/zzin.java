package com.google.android.recaptcha.internal;

import G5.C;
import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

final class zzin extends h implements p {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzja, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzja;
        this.zzc = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzin(this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r1 != 1) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r4 != r0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r4.zzF(r1, r3) == r0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        return m5.C0849h.f10203c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r3.zza
            r2 = 1
            I1.b.I0(r4)
            if (r1 == 0) goto L_0x000d
            if (r1 == r2) goto L_0x0017
            goto L_0x002a
        L_0x000d:
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            r3.zza = r2
            java.lang.Object r4 = r4.zzw(r3)
            if (r4 == r0) goto L_0x002d
        L_0x0017:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r4.clearCache(r2)
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            java.lang.String r1 = r3.zzc
            r2 = 2
            r3.zza = r2
            java.lang.Object r4 = r4.zzF(r1, r3)
            if (r4 != r0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            m5.h r4 = m5.C0849h.f10203c
            return r4
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
