package com.google.android.recaptcha.internal;

import com.bumptech.glide.d;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.j;
import m5.C0844c;
import m5.C0848g;

public final class zzfm {
    private final C0844c zza = d.N0(zzfl.zza);

    public zzfm() {
        int i2 = zzav.zza;
    }

    public final HttpURLConnection zza(String str) {
        if (((zzfk) ((C0848g) this.zza).a()).zzb(str)) {
            URLConnection openConnection = new URL(str).openConnection();
            j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            return (HttpURLConnection) openConnection;
        }
        throw new zzbd(zzbb.zzc, zzba.zzQ, (String) null);
    }
}
