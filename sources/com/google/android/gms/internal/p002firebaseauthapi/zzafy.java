package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafy  reason: invalid package */
final class zzafy extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzafu zzb;

    public zzafy(zzafu zzafu, String str) {
        this.zzb = zzafu;
        this.zza = str;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f6007a == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzagb zzagb = (zzagb) this.zzb.zzd.get(this.zza);
                if (zzagb == null) {
                    zzafu.zza.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zza2 = zzafu.zza(str);
                    zzagb.zze = zza2;
                    if (zza2 == null) {
                        zzafu.zza.c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzae.zzc(zzagb.zzd)) {
                        zzafu.zzb(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
