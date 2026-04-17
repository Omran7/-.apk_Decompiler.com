package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzeq extends zzdq implements RandomAccess, zzey, zzgd {
    private static final zzeq zza;
    private float[] zzb;
    private int zzc;

    static {
        zzeq zzeq = new zzeq(new float[0], 0);
        zza = zzeq;
        zzeq.zzb();
    }

    public zzeq() {
        this(new float[10], 0);
    }

    private final String zzf(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
        float[] fArr = this.zzb;
        if (i5 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i5 - i2);
        } else {
            float[] fArr2 = new float[C0552a.h(i5, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.zzb, i2, fArr2, i2 + 1, this.zzc - i2);
            this.zzb = fArr2;
        }
        this.zzb[i2] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        zzez.zze(collection);
        if (!(collection instanceof zzeq)) {
            return super.addAll(collection);
        }
        zzeq zzeq = (zzeq) collection;
        int i2 = zzeq.zzc;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            float[] fArr = this.zzb;
            if (i6 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i6);
            }
            System.arraycopy(zzeq.zzb, 0, this.zzb, this.zzc, zzeq.zzc);
            this.zzc = i6;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeq)) {
            return super.equals(obj);
        }
        zzeq zzeq = (zzeq) obj;
        if (this.zzc != zzeq.zzc) {
            return false;
        }
        float[] fArr = zzeq.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Float.floatToIntBits(this.zzb[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Float.valueOf(this.zzb[i2]);
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.zzb[i5]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i2 = this.zzc;
        for (int i5 = 0; i5 < i2; i5++) {
            if (this.zzb[i5] == floatValue) {
                return i5;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        zzg(i2);
        float[] fArr = this.zzb;
        float f6 = fArr[i2];
        int i5 = this.zzc;
        if (i2 < i5 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i5 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Float.valueOf(f6);
    }

    public final void removeRange(int i2, int i5) {
        zza();
        if (i5 >= i2) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i5, fArr, i2, this.zzc - i5);
            this.zzc -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzg(i2);
        float[] fArr = this.zzb;
        float f6 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f6);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zzey zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzeq(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f6) {
        zza();
        int i2 = this.zzc;
        float[] fArr = this.zzb;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[C0552a.h(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        fArr3[i5] = f6;
    }

    private zzeq(float[] fArr, int i2) {
        this.zzb = fArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
