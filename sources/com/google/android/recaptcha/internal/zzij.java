package com.google.android.recaptcha.internal;

import G5.C0046s;
import G5.r;
import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;
import m5.C0849h;

public final class zzij {
    final /* synthetic */ zzja zza;
    private Long zzb;
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzja) {
        this.zza = zzja;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzja zzja = this.zza;
        if (zzja.zzq().zzb == null) {
            zzen zzo = zzja.zzp;
            if (zzo != null) {
                zzo.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzl = zzrc.zzl(zzbt.zza(str));
        zztw zzi = zztx.zzi();
        zzi.zzf(zzl);
        this.zza.zzj.zze((zztx) zzi.zzk());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zztw zzi = zztx.zzi();
        zzi.zzq(zzrr.zzi(zzbt.zza(str)));
        this.zza.zzj.zze((zztx) zzi.zzk());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzts zzg = zzts.zzg(zzbt.zza(str));
        zzg.zzi().name();
        if (zzg.zzi() == zztv.JS_CODE_SUCCESS) {
            this.zza.zzA().hashCode();
            if (!((C0046s) this.zza.zzA()).A(C0849h.f10203c)) {
                this.zza.zzA().hashCode();
                return;
            }
            return;
        }
        zzg.zzi().name();
        int i2 = zzbd.zza;
        zzbd zza2 = zzbc.zza(zzg.zzi());
        this.zza.zzA().hashCode();
        ((C0046s) this.zza.zzA()).L(zza2);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzfo zzfo = this.zza.zzb;
        if (zzfo == null) {
            zzfo = null;
        }
        zzfo.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzsi zzi = zzsi.zzi(zzbt.zza(str));
        zzi.toString();
        r rVar = (r) this.zza.zze.remove(zzi.zzk());
        if (rVar != null) {
            ((C0046s) rVar).A(zzi);
        }
    }
}
