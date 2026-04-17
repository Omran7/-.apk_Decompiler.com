package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbg  reason: invalid package */
public final class zzbg implements zzbx {
    private final OutputStream zza;

    private zzbg(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzbx zza(OutputStream outputStream) {
        return new zzbg(outputStream);
    }

    public final void zza(zzvq zzvq) {
        try {
            ((zzvq) ((zzaky) ((zzvq.zza) zzvq.zzn()).zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    public final void zza(zzxc zzxc) {
        try {
            zzxc.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
