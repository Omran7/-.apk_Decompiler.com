package com.google.android.recaptcha.internal;

import G5.C;
import kotlin.jvm.internal.m;
import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

final class zzal extends h implements p {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ m zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzan, zzen zzen, m mVar, d dVar) {
        super(2, dVar);
        this.zzd = zzan;
        this.zze = zzen;
        this.zzf = mVar;
    }

    public final d create(Object obj, d dVar) {
        return new zzal(this.zzd, this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((C) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[SYNTHETIC, Splitter:B:11:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r7.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 == r3) goto L_0x0014
            boolean r1 = r7.zzb
            long r4 = r7.zza
            I1.b.I0(r8)
        L_0x0011:
            r8 = r1
            goto L_0x0080
        L_0x0014:
            long r4 = r7.zza
            I1.b.I0(r8)     // Catch:{ Exception -> 0x001a }
            goto L_0x0030
        L_0x001a:
            r8 = move-exception
            goto L_0x004c
        L_0x001c:
            I1.b.I0(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r3
        L_0x0022:
            if (r8 == 0) goto L_0x0084
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch:{ Exception -> 0x001a }
            r7.zza = r4     // Catch:{ Exception -> 0x001a }
            r7.zzc = r3     // Catch:{ Exception -> 0x001a }
            java.lang.Object r8 = r8.zzi(r7)     // Catch:{ Exception -> 0x001a }
            if (r8 == r0) goto L_0x004b
        L_0x0030:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzan r1 = r7.zzd     // Catch:{ Exception -> 0x001a }
            G5.r r1 = r1.zzf()     // Catch:{ Exception -> 0x001a }
            G5.s r1 = (G5.C0046s) r1     // Catch:{ Exception -> 0x001a }
            r1.A(r8)     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zzc     // Catch:{ Exception -> 0x001a }
            r8.zze = r1     // Catch:{ Exception -> 0x001a }
            com.google.android.recaptcha.internal.zzen r8 = r7.zze     // Catch:{ Exception -> 0x001a }
            r8.zza()     // Catch:{ Exception -> 0x001a }
            r8 = r2
            goto L_0x0022
        L_0x004b:
            return r0
        L_0x004c:
            kotlin.jvm.internal.m r1 = r7.zzf
            r1.f9656a = r8
            boolean r1 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r1 == 0) goto L_0x006d
            r1 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r1 = (com.google.android.play.core.integrity.StandardIntegrityException) r1
            int r1 = r1.getErrorCode()
            r6 = -100
            if (r1 == r6) goto L_0x006f
            r6 = -18
            if (r1 == r6) goto L_0x006f
            r6 = -12
            if (r1 == r6) goto L_0x006f
            r6 = -8
            if (r1 == r6) goto L_0x006f
            r6 = -3
            if (r1 == r6) goto L_0x006f
        L_0x006d:
            r1 = r2
            goto L_0x0070
        L_0x006f:
            r1 = r3
        L_0x0070:
            if (r1 == 0) goto L_0x0083
            r7.zza = r4
            r7.zzb = r3
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = G5.F.g(r4, r7)
            if (r8 == r0) goto L_0x0082
            goto L_0x0011
        L_0x0080:
            long r4 = r4 + r4
            goto L_0x0022
        L_0x0082:
            return r0
        L_0x0083:
            throw r8
        L_0x0084:
            m5.h r8 = m5.C0849h.f10203c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzal.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
