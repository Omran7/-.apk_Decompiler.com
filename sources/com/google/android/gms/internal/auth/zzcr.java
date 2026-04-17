package com.google.android.gms.internal.auth;

import android.net.Uri;
import n.e;
import n.j;

public final class zzcr {
    private static final e zza = new j(0);

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            e eVar = zza;
            Uri uri = (Uri) eVar.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            eVar.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
