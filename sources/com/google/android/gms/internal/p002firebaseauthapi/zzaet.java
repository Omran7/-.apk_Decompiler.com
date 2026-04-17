package com.google.android.gms.internal.p002firebaseauthapi;

import R2.i;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaet  reason: invalid package */
public final class zzaet extends zzafl implements zzagf {
    private zzaen zza;
    private zzaeq zzb;
    private zzafq zzc;
    private final zzaeu zzd;
    private final i zze;
    private String zzf;
    private zzaew zzg;

    public zzaet(i iVar, zzaeu zzaeu) {
        this(iVar, zzaeu, (zzafq) null, (zzaen) null, (zzaeq) null);
    }

    private final zzaew zzb() {
        if (this.zzg == null) {
            this.zzg = new zzaew(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    public final void zza(zzagk zzagk, zzafn<zzagn> zzafn) {
        I.g(zzagk);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/createAuthUri", this.zzf), zzagk, zzafn, zzagn.class, zzaen.zza);
    }

    private zzaet(i iVar, zzaeu zzaeu, zzafq zzafq, zzaen zzaen, zzaeq zzaeq) {
        this.zze = iVar;
        iVar.b();
        this.zzf = iVar.f2492c.f2500a;
        I.g(zzaeu);
        this.zzd = zzaeu;
        zza((zzafq) null, (zzaen) null, (zzaeq) null);
        zzagd.zza(this.zzf, this);
    }

    public final void zza(zzagm zzagm, zzafn<Void> zzafn) {
        I.g(zzagm);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/deleteAccount", this.zzf), zzagm, zzafn, Void.class, zzaen.zza);
    }

    public final void zza(zzagp zzagp, zzafn<zzago> zzafn) {
        I.g(zzagp);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/emailLinkSignin", this.zzf), zzagp, zzafn, zzago.class, zzaen.zza);
    }

    public final void zza(zzagr zzagr, zzafn<zzagq> zzafn) {
        I.g(zzagr);
        I.g(zzafn);
        zzaeq zzaeq = this.zzb;
        zzaeq.zza(zzaeq.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzagr, zzafn, zzagq.class, zzaeq.zza);
    }

    public final void zza(zzagt zzagt, zzafn<zzags> zzafn) {
        I.g(zzagt);
        I.g(zzafn);
        zzaeq zzaeq = this.zzb;
        zzaeq.zza(zzaeq.zza("/accounts/mfaSignIn:finalize", this.zzf), zzagt, zzafn, zzags.class, zzaeq.zza);
    }

    public final void zza(zzahb zzahb, zzafn<zzahn> zzafn) {
        I.g(zzahb);
        I.g(zzafn);
        zzafq zzafq = this.zzc;
        zzafm.zza(zzafq.zza("/token", this.zzf), zzahb, zzafn, zzahn.class, zzafq.zza);
    }

    public final void zza(zzaha zzaha, zzafn<zzahd> zzafn) {
        I.g(zzaha);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/getAccountInfo", this.zzf), zzaha, zzafn, zzahd.class, zzaen.zza);
    }

    public final void zza(zzahe zzahe, zzafn<zzahh> zzafn) {
        I.g(zzahe);
        I.g(zzafn);
        if (zzahe.zzb() != null) {
            zzb().zzb(zzahe.zzb().f7633q);
        }
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/getOobConfirmationCode", this.zzf), zzahe, zzafn, zzahh.class, zzaen.zza);
    }

    public final void zza(zzahg zzahg, zzafn<zzahj> zzafn) {
        I.g(zzahg);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/getRecaptchaParam", this.zzf), zzafn, zzahj.class, zzaen.zza);
    }

    public final void zza(zzahl zzahl, zzafn<zzahk> zzafn) {
        I.g(zzahl);
        I.g(zzafn);
        zzaeq zzaeq = this.zzb;
        String str = zzaeq.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzahl.zzb() + "&version=" + zzahl.zzc();
        if (!zzae.zzc(zzahl.zzd())) {
            str = d.g(str, "&tenantId=", zzahl.zzd());
        }
        zzafm.zza(str, zzafn, zzahk.class, zzaeq.zza);
    }

    public final void zza() {
        zza((zzafq) null, (zzaen) null, (zzaeq) null);
    }

    public final void zza(zzahu zzahu, zzafn<zzahx> zzafn) {
        I.g(zzahu);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/resetPassword", this.zzf), zzahu, zzafn, zzahx.class, zzaen.zza);
    }

    public final void zza(zzahw zzahw, zzafn<zzahy> zzafn) {
        I.g(zzahw);
        I.g(zzafn);
        zzaeq zzaeq = this.zzb;
        zzaeq.zza(zzaeq.zza("/accounts:revokeToken", this.zzf), zzahw, zzafn, zzahy.class, zzaeq.zza);
    }

    public final void zza(zzaib zzaib, zzafn<zzaia> zzafn) {
        I.g(zzaib);
        I.g(zzafn);
        if (!TextUtils.isEmpty(zzaib.zzc())) {
            zzb().zzb(zzaib.zzc());
        }
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/sendVerificationCode", this.zzf), zzaib, zzafn, zzaia.class, zzaen.zza);
    }

    public final void zza(zzaid zzaid, zzafn<zzaic> zzafn) {
        I.g(zzaid);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/setAccountInfo", this.zzf), zzaid, zzafn, zzaic.class, zzaen.zza);
    }

    public final void zza(String str, zzafn<Void> zzafn) {
        I.g(zzafn);
        zzb().zza(str);
        zzafn.zza(null);
    }

    public final void zza(zzaie zzaie, zzafn<zzaih> zzafn) {
        I.g(zzaie);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/signupNewUser", this.zzf), zzaie, zzafn, zzaih.class, zzaen.zza);
    }

    public final void zza(zzaig zzaig, zzafn<zzaij> zzafn) {
        I.g(zzaig);
        I.g(zzafn);
        if (zzaig instanceof zzaik) {
            zzaik zzaik = (zzaik) zzaig;
            if (!TextUtils.isEmpty(zzaik.zzb())) {
                zzb().zzb(zzaik.zzb());
            }
        }
        zzaeq zzaeq = this.zzb;
        zzaeq.zza(zzaeq.zza("/accounts/mfaEnrollment:start", this.zzf), zzaig, zzafn, zzaij.class, zzaeq.zza);
    }

    public final void zza(zzaii zzaii, zzafn<zzail> zzafn) {
        I.g(zzaii);
        I.g(zzafn);
        if (!TextUtils.isEmpty(zzaii.zzb())) {
            zzb().zzb(zzaii.zzb());
        }
        zzaeq zzaeq = this.zzb;
        zzaeq.zza(zzaeq.zza("/accounts/mfaSignIn:start", this.zzf), zzaii, zzafn, zzail.class, zzaeq.zza);
    }

    private final void zza(zzafq zzafq, zzaen zzaen, zzaeq zzaeq) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza2 = zzaga.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzagd.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza2);
        }
        if (this.zzc == null) {
            this.zzc = new zzafq(zza2, zzb());
        }
        String zza3 = zzaga.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzagd.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza3);
        }
        if (this.zza == null) {
            this.zza = new zzaen(zza3, zzb());
        }
        String zza4 = zzaga.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza4)) {
            zza4 = zzagd.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza4);
        }
        if (this.zzb == null) {
            this.zzb = new zzaeq(zza4, zzb());
        }
    }

    public final void zza(zzait zzait, zzafn<zzaiv> zzafn) {
        I.g(zzait);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/verifyAssertion", this.zzf), zzait, zzafn, zzaiv.class, zzaen.zza);
    }

    public final void zza(zzaiu zzaiu, zzafn<zzaix> zzafn) {
        I.g(zzaiu);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/verifyCustomToken", this.zzf), zzaiu, zzafn, zzaix.class, zzaen.zza);
    }

    public final void zza(zzaiw zzaiw, zzafn<zzaiz> zzafn) {
        I.g(zzaiw);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/verifyPassword", this.zzf), zzaiw, zzafn, zzaiz.class, zzaen.zza);
    }

    public final void zza(zzaiy zzaiy, zzafn<zzajb> zzafn) {
        I.g(zzaiy);
        I.g(zzafn);
        zzaen zzaen = this.zza;
        zzafm.zza(zzaen.zza("/verifyPhoneNumber", this.zzf), zzaiy, zzafn, zzajb.class, zzaen.zza);
    }

    public final void zza(zzaja zzaja, zzafn<zzajd> zzafn) {
        I.g(zzaja);
        I.g(zzafn);
        zzaeq zzaeq = this.zzb;
        zzaeq.zza(zzaeq.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzaja, zzafn, zzajd.class, zzaeq.zza);
    }
}
