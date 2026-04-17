package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class zzrc extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzrc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf = 0;
    private Object zzg;
    /* access modifiers changed from: private */
    public int zzh;
    private int zzi;
    private String zzj = "";
    private String zzk = "";
    /* access modifiers changed from: private */
    public String zzl = "";
    private String zzm = "";
    /* access modifiers changed from: private */
    public long zzn;
    private zzml zzo;
    /* access modifiers changed from: private */
    public int zzp;
    private zzqq zzq;
    private zzro zzr;
    /* access modifiers changed from: private */
    public String zzs = "";
    private zzpj zzt;
    private zzml zzu;
    private zzni zzv = zznd.zzy();
    private int zzw;

    static {
        zzrc zzrc = new zzrc();
        zzb = zzrc;
        zznd.zzI(zzrc.class, zzrc);
    }

    private zzrc() {
    }

    public static /* synthetic */ void zzO(zzrc zzrc, int i2) {
        zzni zzni = zzrc.zzv;
        if (!zzni.zzc()) {
            zzrc.zzv = zznd.zzz(zzni);
        }
        zzrc.zzv.zzh(0);
    }

    public static /* synthetic */ void zzP(zzrc zzrc, String str) {
        str.getClass();
        zzrc.zzj = str;
    }

    public static /* synthetic */ void zzR(zzrc zzrc, zzqq zzqq) {
        zzrc.zzq = zzqq;
        zzrc.zze |= 2;
    }

    public static /* synthetic */ void zzS(zzrc zzrc, String str) {
        str.getClass();
        zzrc.zzk = str;
    }

    public static /* synthetic */ void zzT(zzrc zzrc, zzro zzro) {
        zzro.getClass();
        zzrc.zzr = zzro;
        zzrc.zze |= 4;
    }

    public static /* synthetic */ void zzU(zzrc zzrc, int i2) {
        zzrc.zze |= 32;
        zzrc.zzw = i2;
    }

    public static /* synthetic */ void zzab(zzrc zzrc, int i2) {
        if (i2 != 1) {
            zzrc.zzi = i2 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzra zzi() {
        return (zzra) zzb.zzq();
    }

    public static zzrc zzk() {
        return zzb;
    }

    public static zzrc zzl(byte[] bArr) {
        return (zzrc) zznd.zzx(zzb, bArr);
    }

    public final String zzM() {
        return this.zzk;
    }

    public final String zzN() {
        return this.zzl;
    }

    public final boolean zzX() {
        return (this.zze & 2) != 0;
    }

    public final int zzY() {
        int i2;
        switch (this.zzh) {
            case 0:
                i2 = 2;
                break;
            case 1:
                i2 = 3;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 7;
                break;
            case zzaky.zzf.zzf:
                i2 = 8;
                break;
            case zzaky.zzf.zzg:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 11;
                break;
            case 10:
                i2 = 12;
                break;
            case ModuleDescriptor.MODULE_VERSION:
                i2 = 13;
                break;
            case 12:
                i2 = 14;
                break;
            case 13:
                i2 = 15;
                break;
            case 14:
                i2 = 16;
                break;
            case 15:
                i2 = 17;
                break;
            case 16:
                i2 = 18;
                break;
            case 17:
                i2 = 19;
                break;
            case 18:
                i2 = 20;
                break;
            case 19:
                i2 = 21;
                break;
            case 20:
                i2 = 22;
                break;
            case 21:
                i2 = 23;
                break;
            case 22:
                i2 = 24;
                break;
            case 23:
                i2 = 25;
                break;
            case 24:
                i2 = 26;
                break;
            case 25:
                i2 = 27;
                break;
            case 26:
                i2 = 28;
                break;
            case 27:
                i2 = 29;
                break;
            case 28:
                i2 = 30;
                break;
            case 29:
                i2 = 31;
                break;
            case 30:
                i2 = 32;
                break;
            case 31:
                i2 = 33;
                break;
            case 32:
                i2 = 34;
                break;
            case 33:
                i2 = 35;
                break;
            case 34:
                i2 = 36;
                break;
            case 35:
                i2 = 37;
                break;
            case 36:
                i2 = 38;
                break;
            case 37:
                i2 = 39;
                break;
            case 38:
                i2 = 40;
                break;
            case 39:
                i2 = 41;
                break;
            case 40:
                i2 = 42;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzZ() {
        int i2 = this.zzp;
        int i5 = 2;
        if (i2 != 0) {
            i5 = i2 != 1 ? i2 != 2 ? 0 : 4 : 3;
        }
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    @Deprecated
    public final long zzf() {
        return this.zzn;
    }

    public final zzqq zzg() {
        zzqq zzqq = this.zzq;
        if (zzqq == null) {
            return zzqq.zzj();
        }
        return zzqq;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzqg.class, "zzv", "zzw", "zzi"});
        } else if (i5 == 3) {
            return new zzrc();
        } else {
            if (i5 == 4) {
                return new zzra((zzrb) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzrc.class) {
                    try {
                        zzoq = zzd;
                        if (zzoq == null) {
                            zzoq = new zzmy(zzb);
                            zzd = zzoq;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zzoq;
        }
    }
}
