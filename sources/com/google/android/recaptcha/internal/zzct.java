package com.google.android.recaptcha.internal;

import m5.C0849h;
import o5.d;
import q5.h;
import x5.p;

final class zzct extends h implements p {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcv, String str, long j6, zzcn zzcn, zzbi zzbi, zzch zzch, d dVar) {
        super(2, dVar);
        this.zzd = zzcv;
        this.zze = str;
        this.zzf = j6;
        this.zzg = zzcn;
        this.zzi = zzbi;
        this.zzh = zzch;
    }

    public final d create(Object obj, d dVar) {
        zzct zzct = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, dVar);
        zzct.zzc = obj;
        return zzct;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.recaptcha.internal.zzek} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r5.zzb
            if (r1 == 0) goto L_0x0012
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zzcn r0 = (com.google.android.recaptcha.internal.zzcn) r0
            java.lang.Object r1 = r5.zzc
            com.google.android.recaptcha.internal.zzek r1 = (com.google.android.recaptcha.internal.zzek) r1
            I1.b.I0(r6)
            goto L_0x004d
        L_0x0012:
            I1.b.I0(r6)
            java.lang.Object r6 = r5.zzc
            r1 = r6
            com.google.android.recaptcha.internal.zzek r1 = (com.google.android.recaptcha.internal.zzek) r1
            com.google.android.recaptcha.internal.zzcv r6 = r5.zzd
            java.lang.String r2 = r5.zze
            com.google.android.recaptcha.internal.zzdc r6 = com.google.android.recaptcha.internal.zzcv.zza(r6, r2)
            if (r6 == 0) goto L_0x0025
            return r6
        L_0x0025:
            com.google.android.recaptcha.internal.zzcv r6 = r5.zzd
            long r2 = r5.zzf
            com.google.android.recaptcha.internal.zzcv.zzc(r6, r2)
            com.google.android.recaptcha.internal.zzcn r6 = r5.zzg
            if (r6 != 0) goto L_0x003c
            com.google.android.recaptcha.internal.zzcv r6 = r5.zzd
            java.lang.String r2 = r5.zze
            com.google.android.recaptcha.internal.zzbi r3 = r5.zzi
            com.google.android.recaptcha.internal.zzch r4 = r5.zzh
            com.google.android.recaptcha.internal.zzcn r6 = com.google.android.recaptcha.internal.zzcv.zze(r6, r2, r3, r4, r1)
        L_0x003c:
            long r2 = r5.zzf
            r5.zzc = r1
            r5.zza = r6
            r4 = 1
            r5.zzb = r4
            java.lang.Object r2 = r6.zzb(r2, r5)
            if (r2 != r0) goto L_0x004c
            return r0
        L_0x004c:
            r0 = r6
        L_0x004d:
            java.lang.String r6 = r5.zze
            com.google.android.recaptcha.internal.zzbi r2 = r5.zzi
            com.google.android.recaptcha.internal.zzdc r3 = new com.google.android.recaptcha.internal.zzdc
            r3.<init>(r0, r6, r2, r1)
            com.google.android.recaptcha.internal.zzcv r6 = r5.zzd
            r6.zzc = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzct.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
