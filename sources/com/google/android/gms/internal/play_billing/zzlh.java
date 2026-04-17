package com.google.android.gms.internal.play_billing;

public final class zzlh extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlh zzb;
    private zzho zzd = zzhk.zzs();

    static {
        zzlh zzlh = new zzlh();
        zzb = zzlh;
        zzhk.zzx(zzlh.class, zzlh);
    }

    private zzlh() {
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzlf.class});
        } else if (i5 == 3) {
            return new zzlh();
        } else {
            if (i5 == 4) {
                return new zzlc((zzlg) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
