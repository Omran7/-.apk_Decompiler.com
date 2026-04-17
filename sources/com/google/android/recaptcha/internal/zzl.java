package com.google.android.recaptcha.internal;

import G5.F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import n5.C0883o;
import o5.d;

public final class zzl {
    private final List zza;
    /* access modifiers changed from: private */
    public zzek zzb;

    public zzl() {
        this((List) null, 1, (f) null);
    }

    private final void zzh(zze... zzeArr) {
        List list = this.zza;
        j.e(list, "<this>");
        j.e(zzeArr, "elements");
        List asList = Arrays.asList(zzeArr);
        j.d(asList, "asList(...)");
        list.addAll(asList);
    }

    public final Object zzb(String str, long j6, d dVar) {
        return F.f(new zzh(this, str, j6, (d) null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzc(long r13, com.google.android.recaptcha.internal.zzsc r15, com.google.android.recaptcha.internal.zzek r16, o5.d r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzi
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.google.android.recaptcha.internal.zzi r1 = (com.google.android.recaptcha.internal.zzi) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.zzc = r2
            r9 = r12
            goto L_0x001c
        L_0x0016:
            com.google.android.recaptcha.internal.zzi r1 = new com.google.android.recaptcha.internal.zzi
            r9 = r12
            r1.<init>(r12, r0)
        L_0x001c:
            java.lang.Object r0 = r1.zza
            p5.a r10 = p5.a.f11033a
            int r2 = r1.zzc
            r11 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r11) goto L_0x002b
            I1.b.I0(r0)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            I1.b.I0(r0)
            com.google.android.recaptcha.internal.zzk r0 = new com.google.android.recaptcha.internal.zzk
            r8 = 0
            r2 = r0
            r3 = r12
            r4 = r16
            r5 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r7, r8)
            r1.zzc = r11
            java.lang.Object r0 = G5.F.f(r0, r1)
            if (r0 != r10) goto L_0x004b
            return r10
        L_0x004b:
            m5.f r0 = (m5.C0847f) r0
            java.lang.Object r0 = r0.f10198a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzsc, com.google.android.recaptcha.internal.zzek, o5.d):java.lang.Object");
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeArr) {
        zzh((zze[]) Arrays.copyOf(zzeArr, 1));
    }

    public final void zzg(zzsr zzsr) {
        for (zze zzk : this.zza) {
            zzk.zzk(zzsr);
        }
    }

    public /* synthetic */ zzl(List list, int i2, f fVar) {
        C0883o oVar = C0883o.f10398a;
        this.zza = new ArrayList();
        zze[] zzeArr = (zze[]) oVar.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeArr, zzeArr.length));
    }
}
