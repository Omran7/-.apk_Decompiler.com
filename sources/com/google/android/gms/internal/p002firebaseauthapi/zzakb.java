package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakb  reason: invalid package */
public abstract class zzakb {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzakf zzc;
    private int zze;
    private int zzf;

    public static long zza(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    public static int zze(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i2);

    public abstract float zzb();

    public abstract void zzb(int i2);

    public abstract int zzc();

    public abstract void zzc(int i2);

    public abstract int zzd();

    public abstract boolean zzd(int i2);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzajp zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    public final void zzv() {
        if (this.zza + this.zze >= this.zzf) {
            throw zzalf.zzh();
        }
    }

    public final void zzw() {
        if (this.zze == 0) {
            zzb(0);
        }
    }

    public final void zzx() {
        int zzi;
        do {
            zzi = zzi();
            if (zzi != 0) {
                zzv();
                this.zze++;
                this.zze--;
            } else {
                return;
            }
        } while (zzd(zzi));
    }

    private zzakb() {
        this.zzf = zzd;
        this.zzb = f.API_PRIORITY_OTHER;
    }

    public static zzakb zza(byte[] bArr, int i2, int i5, boolean z3) {
        zzaka zzaka = new zzaka(bArr, i2, i5, z3);
        try {
            zzaka.zza(i5);
            return zzaka;
        } catch (zzalf e6) {
            throw new IllegalArgumentException(e6);
        }
    }
}
