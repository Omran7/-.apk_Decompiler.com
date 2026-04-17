package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class zzue extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzue zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzue zzue = new zzue();
        zzb = zzue;
        zznd.zzI(zzue.class, zzue);
    }

    private zzue() {
    }

    public final zzle zzM() {
        if (this.zze == 3) {
            return (zzle) this.zzf;
        }
        return zzle.zzb;
    }

    public final String zzO() {
        if (this.zze == 4) {
            return (String) this.zzf;
        }
        return "";
    }

    public final String zzP() {
        if (this.zze == 12) {
            return (String) this.zzf;
        }
        return "";
    }

    public final boolean zzQ() {
        if (this.zze == 2) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final boolean zzR() {
        return this.zze == 1;
    }

    public final int zzS() {
        switch (this.zze) {
            case 0:
                return 16;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case zzaky.zzf.zzf:
                return 6;
            case zzaky.zzf.zzg:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case ModuleDescriptor.MODULE_VERSION:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public final double zzf() {
        if (this.zze == 11) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final float zzg() {
        if (this.zze == 10) {
            return ((Float) this.zzf).floatValue();
        }
        return 0.0f;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004Ȼ\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\bC\u0000\t6\u0000\n4\u0000\u000b3\u0000\fȻ\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[]{"zzf", "zze"});
        } else if (i5 == 3) {
            return new zzue();
        } else {
            if (i5 == 4) {
                return new zzud((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzue.class) {
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

    public final int zzi() {
        if (this.zze == 1) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final int zzj() {
        if (this.zze == 5) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final int zzk() {
        if (this.zze == 6) {
            return ((Integer) this.zzf).intValue();
        }
        return 0;
    }

    public final long zzl() {
        if (this.zze == 8) {
            return ((Long) this.zzf).longValue();
        }
        return 0;
    }
}
