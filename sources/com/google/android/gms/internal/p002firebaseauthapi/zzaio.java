package com.google.android.gms.internal.p002firebaseauthapi;

import G1.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaio  reason: invalid package */
public final class zzaio {
    private List<String> zza;

    public zzaio() {
        this((List<String>) null);
    }

    public static zzaio zza() {
        return new zzaio((List<String>) null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzaio(List<String> list) {
        this.zza = new ArrayList();
    }

    public zzaio(int i2, List<String> list) {
        if (list == null || list.isEmpty()) {
            this.zza = Collections.emptyList();
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.set(i5, f.a(list.get(i5)));
        }
        this.zza = Collections.unmodifiableList(list);
    }
}
