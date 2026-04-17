package com.google.android.gms.internal.play_billing;

import w0.C1065l;

public final class zzv {
    public static zzeu zza(C1065l lVar) {
        zzr zzr = new zzr();
        zzu zzu = new zzu(zzr);
        zzr.zzb = zzu;
        zzr.zza = lVar.getClass();
        try {
            lVar.a(zzr);
            zzr.zza = "billingOverrideService.getBillingOverride";
        } catch (Exception e6) {
            zzu.zzc(e6);
        }
        return zzu;
    }
}
