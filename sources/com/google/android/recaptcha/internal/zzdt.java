package com.google.android.recaptcha.internal;

import G5.F;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bumptech.glide.d;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import m5.C0844c;
import m5.C0848g;
import n5.C0875g;
import n5.C0877i;
import n5.C0886r;

public final class zzdt {
    /* access modifiers changed from: private */
    public final String zza;
    /* access modifiers changed from: private */
    public final zzek zzb;
    private final zzl zzc;
    private final C0844c zzd = d.N0(zzdm.zza);
    private final C0844c zze = d.N0(zzdn.zza);
    private final C0844c zzf = d.N0(zzdo.zza);
    private final C0844c zzg = d.N0(zzdp.zza);
    private final C0844c zzh = d.N0(zzdq.zza);
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbi, zzek zzek, zzl zzl) {
        this.zza = str;
        this.zzi = zzbi;
        this.zzb = zzek;
        this.zzc = zzl;
        int i2 = zzav.zza;
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdt) {
        return (zzbr) ((C0848g) zzdt.zze).a();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdt) {
        return (zzff) ((C0848g) zzdt.zzd).a();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdt) {
        return (zzfj) ((C0848g) zzdt.zzg).a();
    }

    /* access modifiers changed from: private */
    public final Application zzr() {
        return (Application) ((C0848g) this.zzh).a();
    }

    /* access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbd) {
        if (!zzx()) {
            return new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage());
        }
        return zzbd;
    }

    /* access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) ((C0848g) this.zzf).a();
    }

    /* access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza2 = this.zzb.zza();
        zza2.zzc(str);
        return zza2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r10, long r11, o5.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzdj
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.recaptcha.internal.zzdj r0 = (com.google.android.recaptcha.internal.zzdj) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdj r0 = new com.google.android.recaptcha.internal.zzdj
            r0.<init>(r9, r13)
        L_0x0018:
            java.lang.Object r13 = r0.zzb
            p5.a r7 = p5.a.f11033a
            int r1 = r0.zzd
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 == r2) goto L_0x0037
            if (r1 == r8) goto L_0x002e
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002e:
            java.lang.Object r10 = r0.zza
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            I1.b.I0(r13)
            goto L_0x00dc
        L_0x0037:
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zzdt r10 = (com.google.android.recaptcha.internal.zzdt) r10
            I1.b.I0(r13)
            m5.f r13 = (m5.C0847f) r13
            java.lang.Object r11 = r13.f10198a
            goto L_0x007e
        L_0x0043:
            I1.b.I0(r13)
            java.lang.String r13 = r10.zzO()
            zzy(r13)
            java.util.List r13 = r9.zzw()
            java.util.Iterator r13 = r13.iterator()
        L_0x0055:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r13.next()
            com.google.android.recaptcha.internal.zze r1 = (com.google.android.recaptcha.internal.zze) r1
            com.google.android.recaptcha.internal.zzl r3 = r9.zzc
            com.google.android.recaptcha.internal.zze[] r1 = new com.google.android.recaptcha.internal.zze[]{r1}
            r3.zzf(r1)
            goto L_0x0055
        L_0x006b:
            com.google.android.recaptcha.internal.zzl r1 = r9.zzc
            com.google.android.recaptcha.internal.zzek r5 = r9.zzb
            r0.zza = r9
            r0.zzd = r2
            r2 = r11
            r4 = r10
            r6 = r0
            java.lang.Object r11 = r1.zzc(r2, r4, r5, r6)
            if (r11 != r7) goto L_0x007d
            goto L_0x00da
        L_0x007d:
            r10 = r9
        L_0x007e:
            java.lang.Throwable r11 = m5.C0847f.a(r11)
            if (r11 != 0) goto L_0x0087
            m5.h r10 = m5.C0849h.f10203c
            return r10
        L_0x0087:
            com.google.android.recaptcha.internal.zzbi r12 = r10.zzi
            G5.C r12 = r12.zzd()
            o5.i r12 = r12.b()
            G5.B r13 = G5.B.f856b
            o5.g r12 = r12.get(r13)
            G5.h0 r12 = (G5.C0034h0) r12
            if (r12 == 0) goto L_0x00b6
            E5.d r12 = r12.getChildren()
            if (r12 == 0) goto L_0x00b6
            java.util.Iterator r12 = r12.iterator()
        L_0x00a5:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00b6
            java.lang.Object r1 = r12.next()
            G5.h0 r1 = (G5.C0034h0) r1
            r2 = 0
            r1.cancel(r2)
            goto L_0x00a5
        L_0x00b6:
            com.google.android.recaptcha.internal.zzbi r10 = r10.zzi
            G5.C r10 = r10.zzd()
            o5.i r10 = r10.b()
            o5.g r12 = r10.get(r13)
            G5.h0 r12 = (G5.C0034h0) r12
            if (r12 == 0) goto L_0x00dd
            E5.d r10 = r12.getChildren()
            java.util.List r10 = E5.f.I0(r10)
            r0.zza = r11
            r0.zzd = r8
            java.lang.Object r10 = G5.F.o(r10, r0)
            if (r10 != r7) goto L_0x00db
        L_0x00da:
            return r7
        L_0x00db:
            r10 = r11
        L_0x00dc:
            throw r10
        L_0x00dd:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Current context doesn't contain Job in it: "
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, o5.d):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, (List) null, 8, (f) null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return C0875g.Z0(arrayList);
    }

    private final boolean zzx() {
        int i2 = zzav.zza;
        zzbe zzbe = (zzbe) d.N0(zzdi.zza).a();
        try {
            Object systemService = zzr().getSystemService("connectivity");
            j.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return false;
            }
            if (!networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i2 = zzav.zza;
            ((zzfu) d.N0(zzde.zza).a()).zza(zzj);
        } catch (Exception e6) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e6.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsi, zzsc zzsc) {
        zzso zzf2 = zzsp.zzf();
        zzf2.zzs(this.zza);
        zzf2.zze(recaptchaAction.getAction());
        zzf2.zzf(zzsc.zzN());
        zzf2.zzq(zzsc.zzM());
        zzf2.zzr(zzsi);
        return (zzsp) zzf2.zzk();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzl(java.lang.String r6, long r7, o5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            com.google.android.recaptcha.internal.zzen r6 = r0.zzd
            I1.b.I0(r9)     // Catch:{ zzbd -> 0x002d, E0 -> 0x002b, Exception -> 0x0029 }
            goto L_0x0053
        L_0x0029:
            r7 = move-exception
            goto L_0x0064
        L_0x002b:
            r7 = move-exception
            goto L_0x0076
        L_0x002d:
            r7 = move-exception
            goto L_0x0088
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            I1.b.I0(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r2 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzl r2 = r5.zzc     // Catch:{ zzbd -> 0x0060, E0 -> 0x005d, Exception -> 0x005a }
            r0.zzd = r9     // Catch:{ zzbd -> 0x0060, E0 -> 0x005d, Exception -> 0x005a }
            r0.zzc = r3     // Catch:{ zzbd -> 0x0060, E0 -> 0x005d, Exception -> 0x005a }
            java.lang.Object r6 = r2.zzb(r6, r7, r0)     // Catch:{ zzbd -> 0x0060, E0 -> 0x005d, Exception -> 0x005a }
            if (r6 == r1) goto L_0x0059
            r4 = r9
            r9 = r6
            r6 = r4
        L_0x0053:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch:{ zzbd -> 0x002d, E0 -> 0x002b, Exception -> 0x0029 }
            r6.zza()     // Catch:{ zzbd -> 0x002d, E0 -> 0x002b, Exception -> 0x0029 }
            return r9
        L_0x0059:
            return r1
        L_0x005a:
            r6 = move-exception
            r7 = r6
            goto L_0x0063
        L_0x005d:
            r6 = move-exception
            r7 = r6
            goto L_0x0075
        L_0x0060:
            r6 = move-exception
            r7 = r6
            goto L_0x0087
        L_0x0063:
            r6 = r9
        L_0x0064:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L_0x0075:
            r6 = r9
        L_0x0076:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r9, r0, r7)
            r6.zzb(r8)
            throw r8
        L_0x0087:
            r6 = r9
        L_0x0088:
            r6.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, o5.d):java.lang.Object");
    }

    public final Object zzm(zzsp zzsp, String str, long j6, o5.d dVar) {
        return F.w(this.zzi.zza().b(), new zzdg(this, str, j6, zzsp, (o5.d) null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r11, long r12, o5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            I1.b.I0(r14)     // Catch:{ zzbd -> 0x002b, E0 -> 0x0029, Exception -> 0x0027 }
            goto L_0x004b
        L_0x0027:
            r11 = move-exception
            goto L_0x004e
        L_0x0029:
            r11 = move-exception
            goto L_0x005c
        L_0x002b:
            r11 = move-exception
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0035:
            I1.b.I0(r14)
            com.google.android.recaptcha.internal.zzdl r14 = new com.google.android.recaptcha.internal.zzdl     // Catch:{ zzbd -> 0x002b, E0 -> 0x0029, Exception -> 0x0027 }
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch:{ zzbd -> 0x002b, E0 -> 0x0029, Exception -> 0x0027 }
            r0.zzc = r3     // Catch:{ zzbd -> 0x002b, E0 -> 0x0029, Exception -> 0x0027 }
            java.lang.Object r11 = G5.F.x(r12, r14, r0)     // Catch:{ zzbd -> 0x002b, E0 -> 0x0029, Exception -> 0x0027 }
            if (r11 != r1) goto L_0x004b
            return r1
        L_0x004b:
            m5.h r11 = m5.C0849h.f10203c
            return r11
        L_0x004e:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L_0x005c:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r13, r14, r11)
            throw r12
        L_0x006a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, o5.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzo(long r7, o5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            com.google.android.recaptcha.internal.zzen r7 = r0.zze
            com.google.android.recaptcha.internal.zzdt r8 = r0.zzd
            I1.b.I0(r9)     // Catch:{ zzbd -> 0x002f, E0 -> 0x002d, Exception -> 0x002b }
            goto L_0x005b
        L_0x002b:
            r9 = move-exception
            goto L_0x0069
        L_0x002d:
            r9 = move-exception
            goto L_0x0082
        L_0x002f:
            r9 = move-exception
            goto L_0x009b
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            I1.b.I0(r9)
            com.google.android.recaptcha.internal.zzek r9 = r6.zzb
            r2 = 22
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r2)
            com.google.android.recaptcha.internal.zzds r2 = new com.google.android.recaptcha.internal.zzds     // Catch:{ zzbd -> 0x0063, E0 -> 0x0061, Exception -> 0x005f }
            r4 = 0
            r2.<init>(r6, r9, r4)     // Catch:{ zzbd -> 0x0063, E0 -> 0x0061, Exception -> 0x005f }
            r0.zzd = r6     // Catch:{ zzbd -> 0x0063, E0 -> 0x0061, Exception -> 0x005f }
            r0.zze = r9     // Catch:{ zzbd -> 0x0063, E0 -> 0x0061, Exception -> 0x005f }
            r0.zzc = r3     // Catch:{ zzbd -> 0x0063, E0 -> 0x0061, Exception -> 0x005f }
            java.lang.Object r7 = G5.F.x(r7, r2, r0)     // Catch:{ zzbd -> 0x0063, E0 -> 0x0061, Exception -> 0x005f }
            if (r7 == r1) goto L_0x005e
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L_0x005b:
            com.google.android.recaptcha.internal.zzsc r9 = (com.google.android.recaptcha.internal.zzsc) r9     // Catch:{ zzbd -> 0x002f, E0 -> 0x002d, Exception -> 0x002b }
            return r9
        L_0x005e:
            return r1
        L_0x005f:
            r7 = move-exception
            goto L_0x0065
        L_0x0061:
            r7 = move-exception
            goto L_0x007e
        L_0x0063:
            r7 = move-exception
            goto L_0x0097
        L_0x0065:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L_0x0069:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L_0x007e:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L_0x0082:
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r3 = r9.getMessage()
            r0.<init>(r1, r2, r3)
            com.google.android.recaptcha.internal.zzbd r8 = r8.zzs(r9, r0)
            r7.zzb(r8)
            throw r8
        L_0x0097:
            r8 = r6
            r5 = r9
            r9 = r7
            r7 = r5
        L_0x009b:
            com.google.android.recaptcha.internal.zzbb r0 = r9.zzb()
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r0 = kotlin.jvm.internal.j.a(r0, r1)
            if (r0 == 0) goto L_0x00ab
            com.google.android.recaptcha.internal.zzbd r9 = r8.zzs(r9, r9)
        L_0x00ab:
            r7.zzb(r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, o5.d):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsr) {
        zzen zzf2 = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsr.zzk();
            int z02 = C0886r.z0(C0877i.T0(zzk));
            if (z02 < 16) {
                z02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(z02);
            for (zzst zzst : zzk) {
                linkedHashMap.put(zzst.zzg(), zzst.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsr);
            zzf2.zza();
        } catch (zzbd e6) {
            zzf2.zzb(e6);
        } catch (Exception e7) {
            zzf2.zzb(new zzbd(zzbb.zzb, zzba.zzas, e7.getMessage()));
        }
    }
}
