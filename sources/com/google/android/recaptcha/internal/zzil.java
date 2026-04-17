package com.google.android.recaptcha.internal;

import G5.C;
import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

final class zzil extends h implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzil(zzja zzja, d dVar) {
        super(2, dVar);
        this.zzc = zzja;
    }

    public final d create(Object obj, d dVar) {
        return new zzil(this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (r7 != r0) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r7 != r0) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        ((android.webkit.WebView) r7).addJavascriptInterface(r6.zzc.zzq(), "RN");
        r7 = r6.zzc;
        r6.zzb = 4;
        r7 = r7.zzw(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (r7 != r0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzik(r6.zzc));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        return m5.C0849h.f10203c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 != 3) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r7 != r0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r6.zzb
            java.lang.String r2 = "RN"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r5) goto L_0x001d
            if (r1 == r4) goto L_0x0015
            I1.b.I0(r7)
            if (r1 == r3) goto L_0x0055
            goto L_0x006c
        L_0x0015:
            java.lang.Object r1 = r6.zza
            com.google.android.recaptcha.internal.zzja r1 = (com.google.android.recaptcha.internal.zzja) r1
            I1.b.I0(r7)
            goto L_0x003f
        L_0x001d:
            I1.b.I0(r7)
            goto L_0x002e
        L_0x0021:
            I1.b.I0(r7)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zzb = r5
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L_0x007b
        L_0x002e:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            r7.removeJavascriptInterface(r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r6.zza = r7
            r6.zzb = r4
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L_0x007b
        L_0x003f:
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            android.webkit.WebSettings r7 = r7.getSettings()
            r7.setJavaScriptEnabled(r5)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 0
            r6.zza = r1
            r6.zzb = r3
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 == r0) goto L_0x007b
        L_0x0055:
            com.google.android.recaptcha.internal.zzja r1 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzij r1 = r1.zzq()
            r7.addJavascriptInterface(r1, r2)
            com.google.android.recaptcha.internal.zzja r7 = r6.zzc
            r1 = 4
            r6.zzb = r1
            java.lang.Object r7 = r7.zzw(r6)
            if (r7 != r0) goto L_0x006c
            goto L_0x007b
        L_0x006c:
            com.google.android.recaptcha.internal.zzja r0 = r6.zzc
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            com.google.android.recaptcha.internal.zzik r1 = new com.google.android.recaptcha.internal.zzik
            r1.<init>(r0)
            r7.setWebViewClient(r1)
            m5.h r7 = m5.C0849h.f10203c
            return r7
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzil.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
