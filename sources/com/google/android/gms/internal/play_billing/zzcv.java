package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class zzcv extends zzcj implements Set {
    private transient zzco zza;

    public static int zzh(int i2) {
        int max = Math.max(i2, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    /* access modifiers changed from: private */
    public static zzcv zzl(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzdq.zza;
        }
        if (i2 != 1) {
            int zzh = zzh(i2);
            Object[] objArr2 = new Object[zzh];
            int i5 = zzh - 1;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                Object obj = objArr[i8];
                zzdd.zza(obj, i8);
                int hashCode = obj.hashCode();
                int zza2 = zzcg.zza(hashCode);
                while (true) {
                    int i9 = zza2 & i5;
                    Object obj2 = objArr2[i9];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza2++;
                    } else {
                        objArr[i7] = obj;
                        objArr2[i9] = obj;
                        i6 += hashCode;
                        i7++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i7, i2, (Object) null);
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new zzdt(obj3);
            }
            if (zzh(i7) < zzh / 2) {
                return zzl(i7, objArr);
            }
            int length = objArr.length;
            if (i7 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i7);
            }
            return new zzdq(objArr, i6, objArr2, i5, i7);
        }
        Object obj4 = objArr[0];
        Objects.requireNonNull(obj4);
        return new zzdt(obj4);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzcv) && zzk() && ((zzcv) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return zzds.zza(this);
    }

    public zzco zzd() {
        zzco zzco = this.zza;
        if (zzco != null) {
            return zzco;
        }
        zzco zzi = zzi();
        this.zza = zzi;
        return zzi;
    }

    /* renamed from: zze */
    public abstract zzdw iterator();

    public zzco zzi() {
        Object[] array = toArray();
        int i2 = zzco.zzd;
        return zzco.zzj(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
