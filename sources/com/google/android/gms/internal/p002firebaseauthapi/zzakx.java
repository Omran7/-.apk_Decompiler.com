package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakx  reason: invalid package */
final class zzakx extends zzajj<Float> implements zzalc<Float>, RandomAccess {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzakx(fArr, 0, false);
    }

    public zzakx() {
        this(zza, 0, true);
    }

    private static int zzd(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zze(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zzf(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i2));
        }
        float[] fArr = this.zzb;
        if (i5 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i5 - i2);
        } else {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i2);
            System.arraycopy(this.zzb, i2, fArr2, i2 + 1, this.zzc - i2);
            this.zzb = fArr2;
        }
        this.zzb[i2] = floatValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzalb.zza(collection);
        if (!(collection instanceof zzakx)) {
            return super.addAll(collection);
        }
        zzakx zzakx = (zzakx) collection;
        int i2 = zzakx.zzc;
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
            System.arraycopy(zzakx.zzb, 0, this.zzb, this.zzc, zzakx.zzc);
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
        if (!(obj instanceof zzakx)) {
            return super.equals(obj);
        }
        zzakx zzakx = (zzakx) obj;
        if (this.zzc != zzakx.zzc) {
            return false;
        }
        float[] fArr = zzakx.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Float.floatToIntBits(this.zzb[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        return Float.valueOf(zzb(i2));
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
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzb[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i2) {
        zza();
        zzf(i2);
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

    public final /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzf(i2);
        float[] fArr = this.zzb;
        float f6 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f6);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzalc zza(int i2) {
        if (i2 >= this.zzc) {
            return new zzakx(i2 == 0 ? zza : Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzb(int i2) {
        zzf(i2);
        return this.zzb[i2];
    }

    public final void zzc(int i2) {
        float[] fArr = this.zzb;
        if (i2 > fArr.length) {
            if (fArr.length == 0) {
                this.zzb = new float[Math.max(i2, 10)];
                return;
            }
            int length = fArr.length;
            while (length < i2) {
                length = zzd(length);
            }
            this.zzb = Arrays.copyOf(this.zzb, length);
        }
    }

    private zzakx(float[] fArr, int i2, boolean z3) {
        super(z3);
        this.zzb = fArr;
        this.zzc = i2;
    }

    public final void zza(float f6) {
        zza();
        int i2 = this.zzc;
        float[] fArr = this.zzb;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, this.zzc);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        fArr3[i5] = f6;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
