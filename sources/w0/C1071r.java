package w0;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;

/* renamed from: w0.r  reason: case insensitive filesystem */
public abstract /* synthetic */ class C1071r {
    static {
        int i2 = C1072s.f12392o;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbf.zzb(exc.getMessage());
            int i2 = zze.zza;
            if (str.length() > 40) {
                return str.substring(0, 40);
            }
            return str;
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzjz b(int i2, int i5, C1056c cVar) {
        try {
            zzjx zzc = zzjz.zzc();
            zzke zzc2 = zzki.zzc();
            zzc2.zzn(cVar.f12358a);
            zzc2.zzm(cVar.f12359b);
            zzc2.zzo(i2);
            zzc.zza(zzc2);
            zzc.zzn(i5);
            return (zzjz) zzc.zzf();
        } catch (Exception e6) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }

    public static zzjz c(int i2, int i5, C1056c cVar, String str) {
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(cVar.f12358a);
            zzc.zzm(cVar.f12359b);
            zzc.zzo(i2);
            if (str != null) {
                zzc.zza(str);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(i5);
            return (zzjz) zzc2.zzf();
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzkd d(int i2) {
        try {
            zzkb zzc = zzkd.zzc();
            zzc.zzn(i2);
            return (zzkd) zzc.zzf();
        } catch (Exception e6) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }
}
