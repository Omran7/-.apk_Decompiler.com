package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import h0.C0552a;
import java.io.IOException;

final class zzcy extends zzdc {
    final /* synthetic */ zzhu zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzcz, String str, Object obj, boolean z3, zzhu zzhu, byte[] bArr) {
        super(zzcz, "getTokenRefactor__blocked_packages", obj, true, (zzdb) null);
        this.zza = zzhu;
    }

    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder t6 = C0552a.t("Invalid byte[] value for ", zzc(), ": ");
            t6.append((String) obj);
            Log.e("PhenotypeFlag", t6.toString());
            return null;
        }
    }
}
