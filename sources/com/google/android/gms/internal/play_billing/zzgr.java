package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgr extends zzgc {
    private static final Logger zzb = Logger.getLogger(zzgr.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzjq.zzx();
    zzgs zza;

    private zzgr() {
        throw null;
    }

    public static int zzA(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i2, zzim zzim, zzix zzix) {
        int zzz = zzz(i2 << 3);
        return ((zzfv) zzim).zze(zzix) + zzz + zzz;
    }

    public static int zzx(zzim zzim, zzix zzix) {
        int zze = ((zzfv) zzim).zze(zzix);
        return zzz(zze) + zze;
    }

    public static int zzy(String str) {
        int i2;
        try {
            i2 = zzjt.zzc(str);
        } catch (zzjs unused) {
            i2 = str.getBytes(zzhp.zza).length;
        }
        return zzz(i2) + i2;
    }

    public static int zzz(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzjs zzjs) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzjs);
        byte[] bytes = str.getBytes(zzhp.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzgp(e6);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b6);

    public abstract void zzd(int i2, boolean z3);

    public abstract void zze(int i2, zzgk zzgk);

    public abstract void zzf(int i2, int i5);

    public abstract void zzg(int i2);

    public abstract void zzh(int i2, long j6);

    public abstract void zzi(long j6);

    public abstract void zzj(int i2, int i5);

    public abstract void zzk(int i2);

    public abstract void zzl(byte[] bArr, int i2, int i5);

    public abstract void zzm(int i2, zzim zzim, zzix zzix);

    public abstract void zzn(int i2, zzim zzim);

    public abstract void zzo(int i2, zzgk zzgk);

    public abstract void zzp(int i2, String str);

    public abstract void zzr(int i2, int i5);

    public abstract void zzs(int i2, int i5);

    public abstract void zzt(int i2);

    public abstract void zzu(int i2, long j6);

    public abstract void zzv(long j6);

    public /* synthetic */ zzgr(zzgq zzgq) {
    }
}
