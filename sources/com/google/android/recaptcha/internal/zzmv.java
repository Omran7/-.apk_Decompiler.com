package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzmv extends zzkr implements RandomAccess, zznk, zzor {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzmv(fArr, 0, false);
    }

    public zzmv() {
        this(zza, 0, true);
    }

    private static int zzh(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzi(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzj(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
        int i6 = i2 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i5 < length) {
            System.arraycopy(fArr, i2, fArr, i6, i5 - i2);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i2);
            System.arraycopy(this.zzb, i2, fArr2, i6, this.zzc - i2);
            this.zzb = fArr2;
        }
        this.zzb[i2] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzmv)) {
            return super.addAll(collection);
        }
        zzmv zzmv = (zzmv) collection;
        int i2 = zzmv.zzc;
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
            System.arraycopy(zzmv.zzb, 0, this.zzb, this.zzc, zzmv.zzc);
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
        if (!(obj instanceof zzmv)) {
            return super.equals(obj);
        }
        zzmv zzmv = (zzmv) obj;
        if (this.zzc != zzmv.zzc) {
            return false;
        }
        float[] fArr = zzmv.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Float.floatToIntBits(this.zzb[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        zzj(i2);
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
        zzj(i2);
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
        zzj(i2);
        float[] fArr = this.zzb;
        float f6 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f6);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* bridge */ /* synthetic */ zznk zzd(int i2) {
        float[] fArr;
        if (i2 >= this.zzc) {
            if (i2 == 0) {
                fArr = zza;
            } else {
                fArr = Arrays.copyOf(this.zzb, i2);
            }
            return new zzmv(fArr, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i2) {
        zzj(i2);
        return this.zzb[i2];
    }

    public final void zzf(float f6) {
        zza();
        int i2 = this.zzc;
        int length = this.zzb.length;
        if (i2 == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        fArr2[i5] = f6;
    }

    public final void zzg(int i2) {
        int length = this.zzb.length;
        if (i2 > length) {
            if (length != 0) {
                while (length < i2) {
                    length = zzh(length);
                }
                this.zzb = Arrays.copyOf(this.zzb, length);
                return;
            }
            this.zzb = new float[Math.max(i2, 10)];
        }
    }

    private zzmv(float[] fArr, int i2, boolean z3) {
        super(z3);
        this.zzb = fArr;
        this.zzc = i2;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
