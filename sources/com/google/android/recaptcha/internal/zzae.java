package com.google.android.recaptcha.internal;

import G5.C;
import G5.F;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import o5.d;

public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zzan zzc;
    private boolean zzd = true;
    /* access modifiers changed from: private */
    public String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzek, Context context, C c3, zzan zzan, zzbs zzbs) {
        this.zza = zzek;
        this.zzb = context;
        this.zzc = zzan;
        this.zzf = zzbs;
    }

    private static final String zzi(zzle zzle) {
        zzkh zzg = zzkh.zzg();
        byte[] zzl = zzle.zzl();
        byte[] zzd2 = zzjz.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzk = zzle.zzk(zzd2, 0, zzd2.length);
        zzkh zzh = zzkh.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    public final int zza() {
        return 2;
    }

    public final zzek zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        return F.f(new zzac(this, str, (d) null), dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        if (r13.zze(r0) != r1) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzd(com.google.android.recaptcha.internal.zzse r12, o5.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzad
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.recaptcha.internal.zzad r0 = (com.google.android.recaptcha.internal.zzad) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzad r0 = new com.google.android.recaptcha.internal.zzad
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.zzb
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzd
            m5.h r3 = m5.C0849h.f10203c
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r6) goto L_0x0039
            if (r2 != r5) goto L_0x0031
            java.lang.Object r12 = r0.zza
            com.google.android.recaptcha.internal.zzen r12 = (com.google.android.recaptcha.internal.zzen) r12
            I1.b.I0(r13)
            goto L_0x008d
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0039:
            com.google.android.recaptcha.internal.zzen r12 = r0.zze
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzae r2 = (com.google.android.recaptcha.internal.zzae) r2
            I1.b.I0(r13)
            goto L_0x007e
        L_0x0043:
            I1.b.I0(r13)
            com.google.android.recaptcha.internal.zzen r13 = com.google.android.recaptcha.internal.zzz.zzc(r11)
            com.google.android.recaptcha.internal.zzbs r2 = r11.zzf
            android.content.Context r7 = r11.zzb
            int r2 = r2.zza(r7)
            r7 = 3
            if (r2 != r7) goto L_0x0092
            long r7 = r12.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0060
            goto L_0x0092
        L_0x0060:
            com.google.android.recaptcha.internal.zzle r2 = r12.zzg()
            java.lang.String r2 = zzi(r2)
            r11.zze = r2
            com.google.android.recaptcha.internal.zzan r2 = r11.zzc
            long r7 = r12.zzf()
            r0.zza = r11
            r0.zze = r13
            r0.zzd = r6
            java.lang.Object r12 = r2.zzd(r7, r0)
            if (r12 == r1) goto L_0x0091
            r2 = r11
            r12 = r13
        L_0x007e:
            com.google.android.recaptcha.internal.zzan r13 = r2.zzc
            r0.zza = r12
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r13 = r13.zze(r0)
            if (r13 != r1) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            r12.zza()
            return r3
        L_0x0091:
            return r1
        L_0x0092:
            r12 = 0
            r11.zzd = r12
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzab
            r12.<init>(r0, r1, r4)
            r13.zzb(r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzae.zzd(com.google.android.recaptcha.internal.zzse, o5.d):java.lang.Object");
    }

    public final void zze(zzsr zzsr) {
        this.zze = zzi(zzsr.zzf());
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
