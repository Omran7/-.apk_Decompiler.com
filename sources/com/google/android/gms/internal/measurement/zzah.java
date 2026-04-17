package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class zzah implements zzap {
    private final Double zza;

    public zzah(Double d) {
        if (d == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        return this.zza.equals(((zzah) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    public final zzap zzcz(String str, zzg zzg, List list) {
        if ("toString".equals(str)) {
            return new zzat(zzi());
        }
        String zzi = zzi();
        throw new IllegalArgumentException(zzi + "." + str + " is not a function.");
    }

    public final zzap zzd() {
        return new zzah(this.zza);
    }

    public final Boolean zzg() {
        Double d = this.zza;
        boolean z3 = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    public final Double zzh() {
        return this.zza;
    }

    public final String zzi() {
        BigDecimal bigDecimal;
        int scale;
        Double d = this.zza;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (!Double.isInfinite(d.doubleValue())) {
            BigDecimal valueOf = BigDecimal.valueOf(d.doubleValue());
            if (valueOf.signum() == 0) {
                bigDecimal = new BigDecimal(BigInteger.ZERO, 0);
            } else if (valueOf.signum() == 0) {
                bigDecimal = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                bigDecimal = valueOf.stripTrailingZeros();
            }
            DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (bigDecimal.scale() > 0) {
                scale = bigDecimal.precision();
            } else {
                scale = bigDecimal.scale();
            }
            decimalFormat.setMinimumFractionDigits(scale - 1);
            String format = decimalFormat.format(bigDecimal);
            int indexOf = format.indexOf("E");
            if (indexOf <= 0) {
                return format;
            }
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
                return format.replace("E-", "e-").replace("E", "e+");
            }
            return bigDecimal.toPlainString();
        } else if (d.doubleValue() > 0.0d) {
            return "Infinity";
        } else {
            return "-Infinity";
        }
    }

    public final Iterator zzl() {
        return null;
    }
}
