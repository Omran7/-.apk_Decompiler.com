package com.google.android.recaptcha.internal;

import G5.A;
import G5.C;
import G5.C0020a0;
import G5.C0034h0;
import G5.F;
import G5.N;
import G5.k0;
import I5.o;
import K5.e;
import R2.b;
import java.util.concurrent.Executors;
import o5.d;

public final class zzbi {
    private final C zza;
    private final C zzb;
    private final C zzc = F.b(N.f878b);
    private final C zzd;

    public zzbi() {
        k0 k0Var = new k0((C0034h0) null);
        e eVar = N.f877a;
        this.zza = new I5.e(b.v0(k0Var, o.f1276a));
        I5.e b6 = F.b(new C0020a0(Executors.newSingleThreadExecutor()));
        F.q(b6, (A) null, new zzbh((d) null), 3);
        this.zzb = b6;
        I5.e b7 = F.b(new C0020a0(Executors.newSingleThreadExecutor()));
        F.q(b7, (A) null, new zzbg((d) null), 3);
        this.zzd = b7;
    }

    public final C zza() {
        return this.zzc;
    }

    public final C zzb() {
        return this.zza;
    }

    public final C zzc() {
        return this.zzd;
    }

    public final C zzd() {
        return this.zzb;
    }
}
