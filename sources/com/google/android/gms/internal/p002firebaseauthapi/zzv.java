package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzv  reason: invalid package */
public final class zzv {
    /* access modifiers changed from: private */
    public final zzf zza;
    private final zzab zzb;
    /* access modifiers changed from: private */
    public final int zzc;

    private zzv(zzab zzab) {
        this(zzab, false, zzj.zza, f.API_PRIORITY_OTHER);
    }

    public static zzv zza(char c3) {
        zzh zzh = new zzh(c3);
        zzw.zza(zzh);
        return new zzv(new zzy(zzh));
    }

    private zzv(zzab zzab, boolean z3, zzf zzf, int i2) {
        this.zzb = zzab;
        this.zza = zzf;
        this.zzc = f.API_PRIORITY_OTHER;
    }

    public static zzv zza(String str) {
        zzl zza2 = zzr.zza(str);
        if (!zza2.zza("").zzc()) {
            return new zzv(new zzx(zza2));
        }
        throw new IllegalArgumentException(zzr.zza("The pattern may not match the empty string: %s", zza2));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzw.zza(charSequence);
        Iterator<String> zza2 = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza2.hasNext()) {
            arrayList.add(zza2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
