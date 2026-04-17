package com.google.android.gms.internal.auth;

import android.net.Uri;
import n.j;

public final class zzci {
    private final j zza;

    public zzci(j jVar) {
        this.zza = jVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        j jVar = (j) this.zza.get(uri.toString());
        if (jVar == null) {
            return null;
        }
        return (String) jVar.get("".concat(String.valueOf(str3)));
    }
}
