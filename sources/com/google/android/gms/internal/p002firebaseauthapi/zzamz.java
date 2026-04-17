package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamz  reason: invalid package */
final class zzamz extends zzamw {
    public zzamz() {
        super();
    }

    public final void zzd() {
        if (!zze()) {
            for (int i2 = 0; i2 < zza(); i2++) {
                Map.Entry zza = zza(i2);
                if (((zzakt) zza.getKey()).zze()) {
                    zza.setValue(Collections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzakt) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
