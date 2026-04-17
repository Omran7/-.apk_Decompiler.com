package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import m5.C0845d;
import n5.C0886r;

public final class zzbd extends Exception {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final Map zzb;
    private final zzbb zzc;
    private final zzba zzd;
    private final String zze;
    private final Map zzf;

    static {
        C0845d dVar = new C0845d(zztv.JS_NETWORK_ERROR, new zzbd(zzbb.zzc, zzba.zzd, (String) null));
        zztv zztv = zztv.JS_INTERNAL_ERROR;
        zzbb zzbb = zzbb.zzb;
        zzb = C0886r.A0(dVar, new C0845d(zztv, new zzbd(zzbb, zzba.zzc, (String) null)), new C0845d(zztv.JS_INVALID_SITE_KEY, new zzbd(zzbb.zzd, zzba.zze, (String) null)), new C0845d(zztv.JS_INVALID_SITE_KEY_TYPE, new zzbd(zzbb.zze, zzba.zzf, (String) null)), new C0845d(zztv.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbd(zzbb.zzf, zzba.zzg, (String) null)), new C0845d(zztv.JS_INVALID_ACTION, new zzbd(zzbb.zzg, zzba.zzh, (String) null)), new C0845d(zztv.JS_PROGRAM_ERROR, new zzbd(zzbb, zzba.zzj, (String) null)));
    }

    public zzbd(zzbb zzbb, zzba zzba, String str) {
        this.zzc = zzbb;
        this.zzd = zzba;
        this.zze = str;
        zzbb zzbb2 = zzbb.zzc;
        RecaptchaErrorCode recaptchaErrorCode = RecaptchaErrorCode.NETWORK_ERROR;
        this.zzf = C0886r.A0(new C0845d(zzbb2, new RecaptchaException(recaptchaErrorCode, (String) null, 2, (f) null)), new C0845d(zzbb.zzh, new RecaptchaException(recaptchaErrorCode, (String) null, 2, (f) null)), new C0845d(zzbb.zzi, new RecaptchaException(recaptchaErrorCode, (String) null, 2, (f) null)), new C0845d(zzbb.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, (String) null, 2, (f) null)), new C0845d(zzbb.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, (String) null, 2, (f) null)), new C0845d(zzbb.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, (String) null, 2, (f) null)), new C0845d(zzbb.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, (String) null, 2, (f) null)), new C0845d(zzbb.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, (String) null, 2, (f) null)), new C0845d(zzbb.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, (String) null, 2, (f) null)));
    }

    public final zzba zza() {
        return this.zzd;
    }

    public final zzbb zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        zzba zzba = this.zzd;
        if (j.a(zzba, zzba.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, (String) null, 2, (f) null);
        }
        if (j.a(zzba, zzba.zzao)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, (String) null, 2, (f) null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        if (recaptchaException == null) {
            return new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, (String) null, 2, (f) null);
        }
        return recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
