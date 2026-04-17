package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.measurement.a;
import h0.C0552a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public final class zzdu implements Closeable {
    private final InputStream zza;
    private zzdt zzb;
    private final byte[] zzc = new byte[8];
    private final zzdv zzd = zzdv.zza();

    public zzdu(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() {
        if (this.zzb.zza() < 24) {
            long zza2 = (long) this.zzb.zza();
            this.zzb = null;
            return zza2;
        } else if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read != -1) {
                this.zzb = null;
                return ((long) read) & 255;
            }
            throw new EOFException();
        } else if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        } else if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            long j6 = (long) bArr2[0];
            long j7 = (((long) bArr2[1]) & 255) << 16;
            return (((long) bArr2[3]) & 255) | j7 | ((j6 & 255) << 24) | ((((long) bArr2[2]) & 255) << 8);
        } else if (this.zzb.zza() == 27) {
            zzk(this.zzc, 8);
            byte[] bArr3 = this.zzc;
            long j8 = (long) bArr3[0];
            long j9 = (long) bArr3[1];
            long j10 = (long) bArr3[2];
            long j11 = (long) bArr3[3];
            long j12 = (long) bArr3[4];
            long j13 = (long) bArr3[5];
            long j14 = (j9 & 255) << 48;
            long j15 = (((long) bArr3[6]) & 255) << 8;
            return (((long) bArr3[7]) & 255) | j15 | j14 | ((j8 & 255) << 56) | ((j10 & 255) << 40) | ((j11 & 255) << 32) | ((j12 & 255) << 24) | ((j13 & 255) << 16);
        } else {
            throw new IOException(C0552a.l("invalid additional information ", this.zzb.zza(), this.zzb.zzc(), " for major type "));
        }
    }

    private final void zzi() {
        zzd();
        if (this.zzb.zza() == 31) {
            throw new IllegalStateException(a.f(this.zzb.zza(), "expected definite length but found "));
        }
    }

    private final void zzj(byte b6) {
        zzd();
        if (this.zzb.zzb() != b6) {
            throw new IllegalStateException(C0552a.l("expected major type ", (b6 >> 5) & 7, this.zzb.zzc(), " but found "));
        }
    }

    private final void zzk(byte[] bArr, int i2) {
        int i5 = 0;
        while (i5 != i2) {
            int read = this.zza.read(bArr, i5, i2 - i5);
            if (read != -1) {
                i5 += read;
            } else {
                throw new EOFException();
            }
        }
        this.zzb = null;
    }

    private final byte[] zzl() {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        } else if (((long) this.zza.available()) >= zzh) {
            int i2 = (int) zzh;
            byte[] bArr = new byte[i2];
            zzk(bArr, i2);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final void close() {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        int i2 = (zzh > 0 ? 1 : (zzh == 0 ? 0 : -1));
        if (i2 >= 0) {
            if (i2 > 0) {
                this.zzd.zzg(zzh);
            }
            return zzh;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long zzb() {
        boolean z3;
        zzd();
        if (this.zzb.zzb() == 0) {
            z3 = true;
        } else if (this.zzb.zzb() == 32) {
            z3 = false;
        } else {
            throw new IllegalStateException(a.f(this.zzb.zzc(), "expected major type 0 or 1 but found "));
        }
        long zzh = zzh();
        if (zzh < 0) {
            throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
        } else if (z3) {
            return zzh;
        } else {
            return ~zzh;
        }
    }

    public final long zzc() {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        int i2 = (zzh > 0 ? 1 : (zzh == 0 ? 0 : -1));
        if (i2 < 0 || zzh > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (i2 > 0) {
            this.zzd.zzg(zzh + zzh);
        }
        return zzh;
    }

    public final zzdt zzd() {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzdt zzdt = new zzdt(read);
            this.zzb = zzdt;
            byte zzb2 = zzdt.zzb();
            if (!(zzb2 == Byte.MIN_VALUE || zzb2 == -96 || zzb2 == -64)) {
                if (zzb2 != -32) {
                    if (!(zzb2 == 0 || zzb2 == 32)) {
                        if (zzb2 == 64) {
                            this.zzd.zze(-1);
                        } else if (zzb2 == 96) {
                            this.zzd.zze(-2);
                        } else {
                            throw new IllegalStateException(a.f(this.zzb.zzc(), "invalid major type: "));
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() {
        zzj((byte) -32);
        if (this.zzb.zza() <= 24) {
            int zzh = (int) zzh();
            if (zzh == 20) {
                return false;
            }
            if (zzh == 21) {
                return true;
            }
            throw new IllegalStateException("expected FALSE or TRUE");
        }
        throw new IllegalStateException("expected simple value");
    }

    public final byte[] zzg() {
        zzj((byte) 64);
        return zzl();
    }
}
