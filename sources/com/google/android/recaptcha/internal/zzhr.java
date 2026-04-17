package com.google.android.recaptcha.internal;

public final class zzhr implements zzgx {
    public static final zzhr zza = new zzhr();

    private zzhr() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzueArr.length == 2) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof int[])) {
                zza2 = null;
            }
            int[] iArr = (int[]) zza2;
            if (iArr != null) {
                Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str = (String) zza3;
                if (str != null) {
                    zzge zzc = zzgd.zzc();
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (int charAt : iArr) {
                            sb.append(str.charAt(charAt));
                        }
                        zzc.zze(i2, sb.toString());
                    } catch (Exception e6) {
                        throw new zzce(4, 22, e6);
                    }
                } else {
                    throw new zzce(4, 5, (Throwable) null);
                }
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
