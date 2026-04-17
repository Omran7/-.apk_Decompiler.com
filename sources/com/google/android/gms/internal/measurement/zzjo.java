package com.google.android.gms.internal.measurement;

import android.net.Uri;
import n.j;

public final class zzjo {
    private final j zza;

    public zzjo(j jVar) {
        this.zza = jVar;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        j jVar;
        if (uri != null) {
            jVar = (j) this.zza.get(uri.toString());
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return null;
        }
        return (String) jVar.get("".concat(str3));
    }
}
