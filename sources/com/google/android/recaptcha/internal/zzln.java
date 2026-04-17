package com.google.android.recaptcha.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzps.zzx();
    zzlo zza;

    private zzln() {
        throw null;
    }

    public static int zzA(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int zzB(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i2, zzoi zzoi, zzow zzow) {
        int zzA = zzA(i2 << 3);
        return ((zzko) zzoi).zza(zzow) + zzA + zzA;
    }

    public static int zzx(zzoi zzoi) {
        int zzo = zzoi.zzo();
        return zzA(zzo) + zzo;
    }

    public static int zzy(zzoi zzoi, zzow zzow) {
        int zza2 = ((zzko) zzoi).zza(zzow);
        return zzA(zza2) + zza2;
    }

    public static int zzz(String str) {
        int i2;
        try {
            i2 = zzpv.zzc(str);
        } catch (zzpu unused) {
            i2 = str.getBytes(zznl.zza).length;
        }
        return zzA(i2) + i2;
    }

    public final void zzC() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzpu zzpu) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzpu);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzll(e6);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b6);

    public abstract void zzd(int i2, boolean z3);

    public abstract void zze(int i2, zzle zzle);

    public abstract void zzf(int i2, int i5);

    public abstract void zzg(int i2);

    public abstract void zzh(int i2, long j6);

    public abstract void zzi(long j6);

    public abstract void zzj(int i2, int i5);

    public abstract void zzk(int i2);

    public abstract void zzl(byte[] bArr, int i2, int i5);

    public abstract void zzm(int i2, zzoi zzoi, zzow zzow);

    public abstract void zzn(int i2, zzoi zzoi);

    public abstract void zzo(int i2, zzle zzle);

    public abstract void zzp(int i2, String str);

    public abstract void zzr(int i2, int i5);

    public abstract void zzs(int i2, int i5);

    public abstract void zzt(int i2);

    public abstract void zzu(int i2, long j6);

    public abstract void zzv(long j6);

    public /* synthetic */ zzln(zzlm zzlm) {
    }
}
