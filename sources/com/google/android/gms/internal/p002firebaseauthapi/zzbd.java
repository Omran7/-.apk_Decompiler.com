package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd  reason: invalid package */
public final class zzbd implements zzby {
    private final InputStream zza;

    private zzbd(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzby zza(byte[] bArr) {
        return new zzbd(new ByteArrayInputStream(bArr));
    }

    public final zzxc zzb() {
        try {
            return zzxc.zza(this.zza, zzakk.zza());
        } finally {
            this.zza.close();
        }
    }

    public final zzvq zza() {
        try {
            return zzvq.zza(this.zza, zzakk.zza());
        } finally {
            this.zza.close();
        }
    }
}
