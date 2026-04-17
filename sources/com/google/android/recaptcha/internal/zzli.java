package com.google.android.recaptcha.internal;

public abstract class zzli {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzlj zzc;

    private zzli() {
    }

    public static int zzF(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zzG(long j6) {
        return (j6 >>> 1) ^ (-(1 & j6));
    }

    public static zzli zzH(byte[] bArr, int i2, int i5, boolean z3) {
        zzlf zzlf = new zzlf(bArr, 0, 0, false, (zzlh) null);
        try {
            zzlf.zze(0);
            return zzlf;
        } catch (zznn e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public abstract void zzA(int i2);

    public abstract boolean zzC();

    public abstract boolean zzD();

    public abstract boolean zzE(int i2);

    public final void zzI() {
        int zzm;
        do {
            zzm = zzm();
            if (zzm != 0) {
                int i2 = this.zza;
                if (i2 < this.zzb) {
                    this.zza = i2 + 1;
                    this.zza--;
                } else {
                    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (zzE(zzm));
    }

    public abstract double zzb();

    public abstract float zzc();

    public abstract int zzd();

    public abstract int zze(int i2);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract int zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract long zzt();

    public abstract long zzu();

    public abstract long zzv();

    public abstract zzle zzw();

    public abstract String zzx();

    public abstract String zzy();

    public abstract void zzz(int i2);

    public /* synthetic */ zzli(zzlh zzlh) {
    }
}
