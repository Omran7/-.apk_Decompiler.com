package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.List;

public final class zzuf extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzuf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private zznk zzg = zznd.zzB();

    static {
        zzuf zzuf = new zzuf();
        zzb = zzuf;
        zznd.zzI(zzuf.class, zzuf);
        zzls zzg2 = zzls.zzg();
        zzpw zzpw = zzpw.STRING;
        zznd.zzs(zzg2, "", (zzoi) null, (zzng) null, 490775251, zzpw, String.class);
        zznd.zzs(zzls.zzg(), "", (zzoi) null, (zzng) null, 490775252, zzpw, String.class);
    }

    private zzuf() {
    }

    public final int zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", zzue.class});
        } else if (i5 == 3) {
            return new zzuf();
        } else {
            if (i5 == 4) {
                return new zzuc((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzuf.class) {
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

    public final List zzj() {
        return this.zzg;
    }

    public final int zzk() {
        int i2;
        switch (this.zze) {
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
