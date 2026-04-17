package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class zzte extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzte zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    private int zzh;
    private int zzi;
    private zztc zzj;
    /* access modifiers changed from: private */
    public int zzk;
    private zztl zzl;

    static {
        zzte zzte = new zzte();
        zzb = zzte;
        zznd.zzI(zzte.class, zzte);
    }

    private zzte() {
    }

    public static /* synthetic */ void zzM(zzte zzte, int i2) {
        if (i2 != 1) {
            zzte.zzh = i2 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static /* synthetic */ void zzN(zzte zzte, int i2) {
        if (i2 != 1) {
            zzte.zzf = i2 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zztd zzf() {
        return (zztd) zzb.zzq();
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i5 == 3) {
            return new zzte();
        } else {
            if (i5 == 4) {
                return new zztd((zztj) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzte.class) {
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

    public final int zzk() {
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
            case 41:
                i2 = 43;
                break;
            case 42:
                i2 = 44;
                break;
            case 43:
                i2 = 45;
                break;
            case 44:
                i2 = 46;
                break;
            case 45:
                i2 = 47;
                break;
            case 46:
                i2 = 48;
                break;
            case 47:
                i2 = 49;
                break;
            case 48:
                i2 = 50;
                break;
            case 49:
                i2 = 51;
                break;
            case 50:
                i2 = 52;
                break;
            case 51:
                i2 = 53;
                break;
            case 52:
                i2 = 54;
                break;
            case 53:
                i2 = 55;
                break;
            case 54:
                i2 = 56;
                break;
            case 55:
                i2 = 57;
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

    public final int zzl() {
        int i2;
        switch (this.zzf) {
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
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
