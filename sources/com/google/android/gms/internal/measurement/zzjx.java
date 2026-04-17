package com.google.android.gms.internal.measurement;

import android.net.Uri;
import n.e;
import n.j;

public final class zzjx {
    public static final /* synthetic */ int zza = 0;
    private static final e zzb = new j(0);

    public static synchronized Uri zza(String str) {
        synchronized (zzjx.class) {
            e eVar = zzb;
            Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            eVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
