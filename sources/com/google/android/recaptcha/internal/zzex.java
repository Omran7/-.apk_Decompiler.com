package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;

public final class zzex {
    private final zzfm zza;

    public zzex() {
        this((zzfm) null, 1, (f) null);
    }

    public final zzew zza(String str) {
        try {
            HttpURLConnection zza2 = this.zza.zza(str);
            zza2.setRequestMethod("POST");
            zza2.setDoOutput(true);
            zza2.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(zza2);
        } catch (zzbd e6) {
            throw e6;
        } catch (Exception e7) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e7.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfm, int i2, f fVar) {
        this.zza = new zzfm();
    }
}
