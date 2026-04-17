package com.google.android.recaptcha.internal;

import G5.C;
import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f;
import n5.C0876h;
import n5.C0877i;
import n5.C0884p;
import n5.C0886r;
import o5.d;

public final class zzv extends zze {
    private final zzek zza;
    /* access modifiers changed from: private */
    public final List zzb;
    /* access modifiers changed from: private */
    public zzle zzc;
    private final Map zzd = new LinkedHashMap();

    public zzv(Context context, zzek zzek, zzbi zzbi, List list, int i2, f fVar) {
        zzab zzab = new zzab(zzek.zza());
        zzp zzp = new zzp(zzek.zza());
        zzm zzm = new zzm(zzek.zza(), context.getContentResolver());
        zzn zzn = new zzn(zzek.zza());
        zzek zza2 = zzek.zza();
        C zzc2 = zzbi.zzc();
        zzan zzan = new zzan(context, zzc2, zza2, IntegrityManagerFactory.createStandard(context), 28800000);
        List S02 = C0876h.S0(zzab, zzp, zzm, zzn, new zzae(zza2, context, zzc2, zzan, new zzbs(z1.f.f12811b)));
        this.zza = zzek;
        this.zzb = S02;
    }

    /* access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map map;
        List<zzaa> list = (List) this.zzd.remove(str);
        if (list != null) {
            int z02 = C0886r.z0(C0877i.T0(list));
            if (z02 < 16) {
                z02 = 16;
            }
            map = new LinkedHashMap(z02);
            for (zzaa zzaa : list) {
                map.put(Integer.valueOf(zzaa.zzb()), zzaa);
            }
        } else {
            map = C0884p.f10399a;
        }
        zzsz zzs = zzs(map, str);
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        zzsf zzf2 = zzsg.zzf();
        byte[] zzd2 = zzs.zzd();
        zzf2.zze(zzkh.zzh().zzi(zzd2, 0, zzd2.length));
        zzf.zzf(zzf2);
        return (zzsi) zzf.zzk();
    }

    private final zzsx zzr(zzaa zzaa) {
        zzsv zzf = zzsx.zzf();
        zzf.zzq(3);
        zzle zzle = null;
        if (zzaa instanceof zzx) {
            zzti zza2 = ((zzx) zzaa).zza();
            zzle zzle2 = this.zzc;
            if (zzle2 != null) {
                zzle = zzle2;
            }
            byte[] zzd2 = zza2.zzd();
            zzf.zzf(zzcf.zza(zzkh.zzh().zzi(zzd2, 0, zzd2.length), zzle));
        } else if (zzaa instanceof zzw) {
            zzte zza3 = ((zzw) zzaa).zza();
            zzle zzle3 = this.zzc;
            if (zzle3 != null) {
                zzle = zzle3;
            }
            byte[] zzd3 = zza3.zzd();
            zzf.zze(zzcf.zza(zzkh.zzh().zzi(zzd3, 0, zzd3.length), zzle));
        } else {
            throw new RuntimeException();
        }
        return (zzsx) zzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzf = zzsz.zzf();
        zzf.zzq(str);
        List list = this.zzb;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((zzy) next).zzf()) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zzy zzy = (zzy) it2.next();
            if (!map.containsKey(Integer.valueOf(zzy.zza()))) {
                int zza2 = zzy.zza();
                zztd zzf2 = zzte.zzf();
                zzf2.zzf(zza2);
                zzf2.zzr(13);
                zzf2.zzq(27);
                zzf.zzf(zzr(new zzw(zza2, (zzte) zzf2.zzk())));
            }
        }
        Collection<zzaa> values = map.values();
        ArrayList arrayList2 = new ArrayList(C0877i.T0(values));
        for (zzaa zzr : values) {
            arrayList2.add(zzr(zzr));
        }
        zzf.zze(arrayList2);
        return (zzsz) zzf.zzk();
    }

    public final zzen zza(String str) {
        zzek zzek = this.zza;
        zzek.zzc(str);
        return zzek.zzf(35);
    }

    public final zzen zzb() {
        zzek zzek = this.zza;
        zzek.zzc(zzek.zzd());
        return zzek.zzf(34);
    }

    public final Object zzd(String str, d dVar) {
        return zzq(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(java.lang.String r5, o5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            I1.b.I0(r6)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            I1.b.I0(r6)
            com.google.android.recaptcha.internal.zzs r6 = new com.google.android.recaptcha.internal.zzs
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.zzc = r3
            java.lang.Object r6 = G5.F.f(r6, r0)
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            m5.f r6 = (m5.C0847f) r6
            java.lang.Object r5 = r6.f10198a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzf(java.lang.String, o5.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r5, o5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzt
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzt r0 = (com.google.android.recaptcha.internal.zzt) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzt r0 = new com.google.android.recaptcha.internal.zzt
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            I1.b.I0(r6)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            I1.b.I0(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = G5.F.f(r6, r0)
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            m5.f r6 = (m5.C0847f) r6
            java.lang.Object r5 = r6.f10198a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzv.zzh(com.google.android.recaptcha.internal.zzsc, o5.d):java.lang.Object");
    }

    public final void zzk(zzsr zzsr) {
        for (zzy zze : this.zzb) {
            zze.zze(zzsr);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
