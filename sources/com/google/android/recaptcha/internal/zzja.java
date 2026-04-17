package com.google.android.recaptcha.internal;

import G5.C0046s;
import G5.E0;
import G5.F;
import G5.r;
import android.app.Application;
import android.webkit.WebView;
import com.bumptech.glide.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import m5.C0844c;
import m5.C0848g;
import m5.C0849h;
import n5.C0875g;
import p5.a;

public final class zzja extends zze {
    public r zza;
    public zzfo zzb;
    private final zzek zzc;
    /* access modifiers changed from: private */
    public final Map zzd = zzjb.zza();
    /* access modifiers changed from: private */
    public final Map zze = new LinkedHashMap();
    /* access modifiers changed from: private */
    public zzsc zzf;
    private final zzcb zzg = new zzcb(zzje.zza);
    /* access modifiers changed from: private */
    public final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);
    /* access modifiers changed from: private */
    public final zzek zzj;
    private final C0844c zzk;
    private final C0844c zzl;
    private final C0844c zzm;
    private final C0844c zzn;
    private final C0844c zzo;
    /* access modifiers changed from: private */
    public zzen zzp;
    private final zzbi zzq;

    public zzja(zzek zzek, zzbi zzbi) {
        this.zzc = zzek;
        this.zzq = zzbi;
        zzek zza2 = zzek.zza();
        zza2.zzc(zzek.zzd());
        this.zzj = zza2;
        int i2 = zzav.zza;
        this.zzk = d.N0(zzis.zza);
        this.zzl = d.N0(zzit.zza);
        this.zzm = d.N0(zziu.zza);
        this.zzn = d.N0(zziv.zza);
        this.zzo = d.N0(zziw.zza);
    }

    private final Application zzD() {
        return (Application) ((C0848g) this.zzo).a();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r5, o5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            com.google.android.recaptcha.internal.zzja r5 = r0.zzd
            I1.b.I0(r6)     // Catch:{ zzbd -> 0x0029 }
            goto L_0x004e
        L_0x0029:
            r6 = move-exception
            goto L_0x0064
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            I1.b.I0(r6)
            m5.c r6 = r4.zzn     // Catch:{ zzbd -> 0x0061 }
            m5.g r6 = (m5.C0848g) r6     // Catch:{ zzbd -> 0x0061 }
            java.lang.Object r6 = r6.a()     // Catch:{ zzbd -> 0x0061 }
            com.google.android.recaptcha.internal.zzff r6 = (com.google.android.recaptcha.internal.zzff) r6     // Catch:{ zzbd -> 0x0061 }
            com.google.android.recaptcha.internal.zzek r2 = r4.zzj     // Catch:{ zzbd -> 0x0061 }
            r0.zzd = r4     // Catch:{ zzbd -> 0x0061 }
            r0.zzc = r3     // Catch:{ zzbd -> 0x0061 }
            java.lang.Object r6 = r6.zzd(r5, r2, r0)     // Catch:{ zzbd -> 0x0061 }
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r5 = r4
        L_0x004e:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ zzbd -> 0x0029 }
            com.google.android.recaptcha.internal.zzbi r0 = r5.zzq     // Catch:{ zzbd -> 0x0029 }
            G5.C r0 = r0.zzb()     // Catch:{ zzbd -> 0x0029 }
            com.google.android.recaptcha.internal.zzin r1 = new com.google.android.recaptcha.internal.zzin     // Catch:{ zzbd -> 0x0029 }
            r2 = 0
            r1.<init>(r5, r6, r2)     // Catch:{ zzbd -> 0x0029 }
            r6 = 3
            G5.F.q(r0, r2, r1, r6)     // Catch:{ zzbd -> 0x0029 }
            goto L_0x006d
        L_0x0061:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x0064:
            G5.r r5 = r5.zzA()
            G5.s r5 = (G5.C0046s) r5
            r5.L(r6)
        L_0x006d:
            m5.h r5 = m5.C0849h.f10203c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, o5.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzF(java.lang.String r9, o5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            I1.b.I0(r10)     // Catch:{ Exception -> 0x002f }
            r3 = r9
            r4 = r1
            goto L_0x0066
        L_0x002f:
            r9 = move-exception
            goto L_0x0075
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            I1.b.I0(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            m5.c r10 = r8.zzl     // Catch:{ Exception -> 0x0073 }
            m5.g r10 = (m5.C0848g) r10     // Catch:{ Exception -> 0x0073 }
            java.lang.Object r10 = r10.a()     // Catch:{ Exception -> 0x0073 }
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch:{ Exception -> 0x0073 }
            java.lang.String r10 = r10.zza()     // Catch:{ Exception -> 0x0073 }
            r0.zzd = r8     // Catch:{ Exception -> 0x0073 }
            r0.zze = r9     // Catch:{ Exception -> 0x0073 }
            r0.zzf = r10     // Catch:{ Exception -> 0x0073 }
            r0.zzc = r3     // Catch:{ Exception -> 0x0073 }
            java.lang.Object r0 = r8.zzw(r0)     // Catch:{ Exception -> 0x0073 }
            if (r0 == r1) goto L_0x0072
            r4 = r9
            r3 = r10
            r10 = r0
            r0 = r8
        L_0x0066:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch:{ Exception -> 0x002f }
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x002f }
            goto L_0x0095
        L_0x0072:
            return r1
        L_0x0073:
            r9 = move-exception
            r0 = r8
        L_0x0075:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r1, r2, r9)
            com.google.android.recaptcha.internal.zzen r9 = r0.zzp
            if (r9 == 0) goto L_0x0089
            r9.zzb(r10)
        L_0x0089:
            r9 = 0
            r0.zzp = r9
            G5.r r9 = r0.zzA()
            G5.s r9 = (G5.C0046s) r9
            r9.L(r10)
        L_0x0095:
            m5.h r9 = m5.C0849h.f10203c
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, o5.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzG(java.lang.String r9, o5.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzix
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.recaptcha.internal.zzix r0 = (com.google.android.recaptcha.internal.zzix) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzix r0 = new com.google.android.recaptcha.internal.zzix
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            m5.h r3 = m5.C0849h.f10203c
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            I1.b.I0(r10)
            goto L_0x0077
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            I1.b.I0(r10)
            goto L_0x005c
        L_0x0040:
            I1.b.I0(r10)
            com.google.android.recaptcha.internal.zzcb r10 = r8.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzd
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzc
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzb
            com.google.android.recaptcha.internal.zzje[] r2 = new com.google.android.recaptcha.internal.zzje[]{r2, r6, r7}
            r0.zzd = r8
            r0.zze = r9
            r0.zzc = r5
            java.lang.Object r10 = r10.zzb(r2, r0)
            if (r10 == r1) goto L_0x0099
            r2 = r8
        L_0x005c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0065
            return r3
        L_0x0065:
            com.google.android.recaptcha.internal.zzcb r10 = r2.zzg
            com.google.android.recaptcha.internal.zzje r5 = com.google.android.recaptcha.internal.zzje.zzb
            r0.zzd = r2
            r0.zze = r9
            r0.zzc = r4
            java.lang.Object r10 = r10.zzc(r5, r0)
            if (r10 != r1) goto L_0x0076
            goto L_0x0099
        L_0x0076:
            r0 = r2
        L_0x0077:
            G5.s r10 = G5.F.a()
            r0.zza = r10
            com.google.android.recaptcha.internal.zzek r10 = r0.zzj
            r10.zzc(r9)
            r9 = 42
            com.google.android.recaptcha.internal.zzen r9 = r10.zzf(r9)
            com.google.android.recaptcha.internal.zzbi r10 = r0.zzq
            G5.C r10 = r10.zza()
            com.google.android.recaptcha.internal.zziz r1 = new com.google.android.recaptcha.internal.zziz
            r2 = 0
            r1.<init>(r0, r9, r2)
            r9 = 3
            G5.F.q(r10, r2, r1, r9)
            return r3
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, o5.d):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzja) {
        return (zzfk) ((C0848g) zzja.zzm).a();
    }

    public final r zzA() {
        r rVar = this.zza;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    public final zzft zzC(zzsc zzsc, zzcg zzcg, WebView webView) {
        zzfw zzfw = new zzfw(webView, this.zzq.zzb());
        zzhy zzhy = new zzhy();
        zzhy.zzb(C0875g.a1(zzsc.zzP()));
        zzgf zzgf = new zzgf(zzfw, zzcg, new zzbo());
        zzhz zzhz = new zzhz(zzhy, new zzhw());
        zzgf.zze(3, zzD());
        zzgf.zze(5, zzig.zza());
        zzgf.zze(6, new zzia(zzD()));
        zzgf.zze(7, new zzic());
        zzgf.zze(8, new zzii(zzD()));
        zzgf.zze(9, new zzid(zzD()));
        zzgf.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgf, zzhz, zzfn.zza());
    }

    public final zzen zza(String str) {
        zzek zzek = this.zzc;
        zzek.zzc(str);
        return zzek.zzf(33);
    }

    public final zzen zzb() {
        zzek zzek = this.zzc;
        zzek.zzc(zzek.zzd());
        return zzek.zzf(32);
    }

    public final Object zzd(String str, o5.d dVar) {
        zzsh zzf2 = zzsi.zzf();
        zzf2.zze(str);
        return zzf2.zzk();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        if (r12 != r1) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        if (((G5.C0046s) r12).h(r0) == r1) goto L_0x013b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(java.lang.String r11, o5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzip
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.recaptcha.internal.zzip r0 = (com.google.android.recaptcha.internal.zzip) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzip r0 = new com.google.android.recaptcha.internal.zzip
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 0
            r4 = 3
            r5 = 5
            r6 = 4
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0069
            if (r2 == r8) goto L_0x0061
            if (r2 == r7) goto L_0x0059
            if (r2 == r4) goto L_0x0051
            if (r2 == r6) goto L_0x0044
            if (r2 != r5) goto L_0x003c
            java.lang.String r11 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            I1.b.I0(r12)     // Catch:{ Exception -> 0x0039 }
            goto L_0x010a
        L_0x0039:
            r12 = move-exception
            goto L_0x013c
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0044:
            java.lang.String r11 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            I1.b.I0(r12)     // Catch:{ Exception -> 0x004d }
            goto L_0x00cb
        L_0x004d:
            r12 = move-exception
            r0 = r2
            goto L_0x013c
        L_0x0051:
            java.lang.String r11 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            I1.b.I0(r12)
            goto L_0x00b9
        L_0x0059:
            java.lang.String r11 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            I1.b.I0(r12)
            goto L_0x00a3
        L_0x0061:
            java.lang.String r11 = r0.zze
            com.google.android.recaptcha.internal.zzja r2 = r0.zzd
            I1.b.I0(r12)
            goto L_0x007d
        L_0x0069:
            I1.b.I0(r12)
            com.google.android.recaptcha.internal.zzcb r12 = r10.zzg
            com.google.android.recaptcha.internal.zzje r2 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzd = r10
            r0.zze = r11
            r0.zzc = r8
            java.lang.Object r12 = r12.zza(r2, r0)
            if (r12 == r1) goto L_0x0161
            r2 = r10
        L_0x007d:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0093
            com.google.android.recaptcha.internal.zzbd r11 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r12 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r11.<init>(r12, r0, r3)
            m5.e r11 = I1.b.r(r11)
            return r11
        L_0x0093:
            com.google.android.recaptcha.internal.zzcb r12 = r2.zzg
            com.google.android.recaptcha.internal.zzje r8 = com.google.android.recaptcha.internal.zzje.zzc
            r0.zzd = r2
            r0.zze = r11
            r0.zzc = r7
            java.lang.Object r12 = r12.zza(r8, r0)
            if (r12 == r1) goto L_0x0161
        L_0x00a3:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x00b9
            r0.zzd = r2
            r0.zze = r11
            r0.zzc = r4
            java.lang.Object r12 = r2.zzG(r11, r0)
            if (r12 == r1) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            return r1
        L_0x00b9:
            G5.r r12 = r2.zzA()     // Catch:{ Exception -> 0x004d }
            r0.zzd = r2     // Catch:{ Exception -> 0x004d }
            r0.zze = r11     // Catch:{ Exception -> 0x004d }
            r0.zzc = r6     // Catch:{ Exception -> 0x004d }
            G5.s r12 = (G5.C0046s) r12     // Catch:{ Exception -> 0x004d }
            java.lang.Object r12 = r12.h(r0)     // Catch:{ Exception -> 0x004d }
            if (r12 == r1) goto L_0x013b
        L_0x00cb:
            G5.s r12 = G5.F.a()     // Catch:{ Exception -> 0x004d }
            java.util.Map r6 = r2.zze     // Catch:{ Exception -> 0x004d }
            r6.put(r11, r12)     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zztp r6 = com.google.android.recaptcha.internal.zztq.zzf()     // Catch:{ Exception -> 0x004d }
            r6.zze(r11)     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zznd r6 = r6.zzk()     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zztq r6 = (com.google.android.recaptcha.internal.zztq) r6     // Catch:{ Exception -> 0x004d }
            byte[] r6 = r6.zzd()     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zzkh r7 = com.google.android.recaptcha.internal.zzkh.zzh()     // Catch:{ Exception -> 0x004d }
            int r8 = r6.length     // Catch:{ Exception -> 0x004d }
            r9 = 0
            java.lang.String r6 = r7.zzi(r6, r9, r8)     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zzbi r7 = r2.zzq     // Catch:{ Exception -> 0x004d }
            G5.C r7 = r7.zzb()     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zziq r8 = new com.google.android.recaptcha.internal.zziq     // Catch:{ Exception -> 0x004d }
            r8.<init>(r2, r6, r3)     // Catch:{ Exception -> 0x004d }
            G5.F.q(r7, r3, r8, r4)     // Catch:{ Exception -> 0x004d }
            r0.zzd = r2     // Catch:{ Exception -> 0x004d }
            r0.zze = r11     // Catch:{ Exception -> 0x004d }
            r0.zzc = r5     // Catch:{ Exception -> 0x004d }
            java.lang.Object r12 = r12.h(r0)     // Catch:{ Exception -> 0x004d }
            if (r12 == r1) goto L_0x013b
            r0 = r2
        L_0x010a:
            com.google.android.recaptcha.internal.zzsi r12 = (com.google.android.recaptcha.internal.zzsi) r12     // Catch:{ Exception -> 0x0039 }
            com.google.android.recaptcha.internal.zzsh r1 = com.google.android.recaptcha.internal.zzsi.zzf()     // Catch:{ Exception -> 0x0039 }
            r1.zze(r11)     // Catch:{ Exception -> 0x0039 }
            com.google.android.recaptcha.internal.zzsl r2 = com.google.android.recaptcha.internal.zzsm.zzf()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r3 = r12.zzl()     // Catch:{ Exception -> 0x0039 }
            r2.zze(r3)     // Catch:{ Exception -> 0x0039 }
            r1.zzq(r2)     // Catch:{ Exception -> 0x0039 }
            com.google.android.recaptcha.internal.zzsj r2 = com.google.android.recaptcha.internal.zzsk.zzf()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r3 = r12.zzj()     // Catch:{ Exception -> 0x0039 }
            r2.zze(r3)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r12 = r12.zzM()     // Catch:{ Exception -> 0x0039 }
            r2.zzf(r12)     // Catch:{ Exception -> 0x0039 }
            r1.zzr(r2)     // Catch:{ Exception -> 0x0039 }
            com.google.android.recaptcha.internal.zznd r11 = r1.zzk()     // Catch:{ Exception -> 0x0039 }
            goto L_0x0160
        L_0x013b:
            return r1
        L_0x013c:
            com.google.android.recaptcha.internal.zzbd r1 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r2 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r3 = com.google.android.recaptcha.internal.zzba.zzW
            java.lang.String r4 = r12.getMessage()
            r1.<init>(r2, r3, r4)
            com.google.android.recaptcha.internal.zzbd r12 = com.google.android.recaptcha.internal.zzf.zza(r12, r1)
            java.util.Map r0 = r0.zze
            java.lang.Object r11 = r0.remove(r11)
            G5.r r11 = (G5.r) r11
            if (r11 == 0) goto L_0x015c
            G5.s r11 = (G5.C0046s) r11
            r11.L(r12)
        L_0x015c:
            m5.e r11 = I1.b.r(r12)
        L_0x0160:
            return r11
        L_0x0161:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, o5.d):java.lang.Object");
    }

    public final Object zzg(zzbd zzbd, o5.d dVar) {
        if (j.a(zzbd.zza(), zzba.zzb)) {
            zzen zzen = this.zzp;
            if (zzen != null) {
                zzen.zzb(zzbd);
            }
            this.zzp = null;
        }
        return C0849h.f10203c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (zzG(r6, r0) != r1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r6.zzc(r7, r0) == r1) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, o5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            I1.b.I0(r7)
            goto L_0x005c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            I1.b.I0(r7)
            goto L_0x006c
        L_0x0036:
            I1.b.I0(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L_0x004c
            goto L_0x005f
        L_0x004c:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L_0x006b
        L_0x005c:
            m5.h r6 = m5.C0849h.f10203c
            return r6
        L_0x005f:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L_0x006c
        L_0x006b:
            return r1
        L_0x006c:
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            m5.e r6 = I1.b.r(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, o5.d):java.lang.Object");
    }

    public final Object zzi(String str, long j6, Exception exc, o5.d dVar) {
        exc.getMessage();
        r rVar = (r) this.zze.remove(str);
        if (rVar != null) {
            ((C0046s) rVar).L(exc);
        }
        return C0849h.f10203c;
    }

    public final Object zzj(Exception exc, o5.d dVar) {
        Long zza2 = this.zzi.zza();
        if ((exc instanceof E0) && zza2 == null) {
            return new zzbd(zzbb.zzc, zzba.zzH, (String) null);
        }
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(o5.d dVar) {
        return F.w(this.zzq.zzb().b(), new zzjc((zzjd) ((C0848g) this.zzk).a(), zzD(), (o5.d) null), dVar);
    }

    public final Object zzx(o5.d dVar) {
        Object w6 = F.w(this.zzq.zzb().b(), new zzil(this, (o5.d) null), dVar);
        if (w6 == a.f11033a) {
            return w6;
        }
        return C0849h.f10203c;
    }
}
