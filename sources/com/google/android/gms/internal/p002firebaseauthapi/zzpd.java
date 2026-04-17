package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpd  reason: invalid package */
public final class zzpd {
    public static final zzaae zza = zzaae.zza(new byte[0]);

    public static final zzaae zza(int i2) {
        return zzaae.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i2).array());
    }

    public static final zzaae zzb(int i2) {
        return zzaae.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i2).array());
    }
}
