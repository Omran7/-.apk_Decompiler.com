package com.google.android.gms.internal.p002firebaseauthapi;

import com.bumptech.glide.d;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import e3.r;
import f3.v;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacj  reason: invalid package */
final class zzacj extends zzaex<Object, v> {
    private final String zzu;
    private final String zzv;

    public zzacj(String str, String str2) {
        super(4);
        I.e(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    public final String zza() {
        return "checkActionCode";
    }

    public final void zzb() {
        char c3 = 5;
        zzahx zzahx = this.zzm;
        Object obj = new Object();
        if (zzahx.zzg()) {
            zzahx.zzc();
        } else {
            zzahx.zzb();
        }
        zzahx.zzb();
        if (zzahx.zzh()) {
            String zzd = zzahx.zzd();
            zzd.getClass();
            char c6 = 65535;
            switch (zzd.hashCode()) {
                case -1874510116:
                    if (zzd.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case -1452371317:
                    if (zzd.equals("PASSWORD_RESET")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case -1341836234:
                    if (zzd.equals("VERIFY_EMAIL")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case -1099157829:
                    if (zzd.equals("VERIFY_AND_CHANGE_EMAIL")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 870738373:
                    if (zzd.equals("EMAIL_SIGNIN")) {
                        c6 = 4;
                        break;
                    }
                    break;
                case 970484929:
                    if (zzd.equals("RECOVER_EMAIL")) {
                        c6 = 5;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                    c3 = 6;
                    break;
                case 1:
                    c3 = 0;
                    break;
                case 2:
                    c3 = 1;
                    break;
                case 3:
                    break;
                case 4:
                    c3 = 4;
                    break;
                case 5:
                    c3 = 2;
                    break;
                default:
                    c3 = 3;
                    break;
            }
            if (!(c3 == 4 || c3 == 3)) {
                if (zzahx.zzf()) {
                    String zzb = zzahx.zzb();
                    r r12 = d.r1(zzahx.zza());
                    I.d(zzb);
                    I.g(r12);
                } else if (zzahx.zzg()) {
                    String zzc = zzahx.zzc();
                    String zzb2 = zzahx.zzb();
                    I.d(zzc);
                    I.d(zzb2);
                } else if (zzahx.zze()) {
                    I.d(zzahx.zzb());
                }
            }
        }
        zzb(obj);
    }

    public final void zza(TaskCompletionSource taskCompletionSource, zzaef zzaef) {
        this.zzg = new zzafh(this, taskCompletionSource);
        zzaef.zzd(this.zzu, this.zzv, this.zzb);
    }
}
