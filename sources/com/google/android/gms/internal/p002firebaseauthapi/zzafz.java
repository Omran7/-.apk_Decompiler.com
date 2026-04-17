package com.google.android.gms.internal.p002firebaseauthapi;

import C1.a;
import R2.b;
import com.google.android.gms.common.api.Status;
import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafz  reason: invalid package */
final class zzafz extends zzaeg {
    private final String zza;
    private final /* synthetic */ zzafu zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzafz(zzafu zzafu, zzaeg zzaeg, String str) {
        super(zzaeg);
        this.zzb = zzafu;
        this.zza = str;
    }

    public final void zza(Status status) {
        a zza2 = zzafu.zza;
        StringBuilder t6 = C0552a.t("SMS verification code request failed: ", b.b0(status.f6007a), " ");
        t6.append(status.f6008b);
        zza2.c(t6.toString(), new Object[0]);
        zzagb zzagb = (zzagb) this.zzb.zzd.get(this.zza);
        if (zzagb != null) {
            for (zzaeg zza3 : zzagb.zzb) {
                zza3.zza(status);
            }
            this.zzb.zzb(this.zza);
        }
    }

    public final void zzb(String str) {
        zzafu.zza.a("onCodeSent", new Object[0]);
        zzagb zzagb = (zzagb) this.zzb.zzd.get(this.zza);
        if (zzagb != null) {
            for (zzaeg zzb2 : zzagb.zzb) {
                zzb2.zzb(str);
            }
            zzagb.zzg = true;
            zzagb.zzd = str;
            if (zzagb.zza <= 0) {
                this.zzb.zze(this.zza);
            } else if (!zzagb.zzc) {
                this.zzb.zzd(this.zza);
            } else if (!zzae.zzc(zzagb.zze)) {
                zzafu.zzb(this.zzb, this.zza);
            }
        }
    }
}
