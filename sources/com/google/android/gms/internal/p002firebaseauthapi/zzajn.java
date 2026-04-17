package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajn  reason: invalid package */
final class zzajn extends zzajj<Boolean> implements zzalc<Boolean>, RandomAccess {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzajn(zArr, 0, false);
    }

    public zzajn() {
        this(zza, 0, true);
    }

    private static int zzc(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzd(int i2) {
        return C0552a.l("Index:", i2, this.zzc, ", Size:");
    }

    private final void zze(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i2));
        }
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        int i5;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i2));
        }
        boolean[] zArr = this.zzb;
        if (i5 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i5 - i2);
        } else {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i2);
            System.arraycopy(this.zzb, i2, zArr2, i2 + 1, this.zzc - i2);
            this.zzb = zArr2;
        }
        this.zzb[i2] = booleanValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzalb.zza(collection);
        if (!(collection instanceof zzajn)) {
            return super.addAll(collection);
        }
        zzajn zzajn = (zzajn) collection;
        int i2 = zzajn.zzc;
        if (i2 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (f.API_PRIORITY_OTHER - i5 >= i2) {
            int i6 = i5 + i2;
            boolean[] zArr = this.zzb;
            if (i6 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i6);
            }
            System.arraycopy(zzajn.zzb, 0, this.zzb, this.zzc, zzajn.zzc);
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
        if (!(obj instanceof zzajn)) {
            return super.equals(obj);
        }
        zzajn zzajn = (zzajn) obj;
        if (this.zzc != zzajn.zzc) {
            return false;
        }
        boolean[] zArr = zzajn.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i2) {
        return Boolean.valueOf(zzb(i2));
    }

    public final int hashCode() {
        int i2 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i2 = (i2 * 31) + zzalb.zza(this.zzb[i5]);
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.zzb[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i2) {
        zza();
        zze(i2);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i2];
        int i5 = this.zzc;
        if (i2 < i5 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i5 - i2) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Boolean.valueOf(z3);
    }

    public final void removeRange(int i2, int i5) {
        zza();
        if (i5 >= i2) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i5, zArr, i2, this.zzc - i5);
            this.zzc -= i5 - i2;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zze(i2);
        boolean[] zArr = this.zzb;
        boolean z3 = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z3);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzalc zza(int i2) {
        if (i2 >= this.zzc) {
            return new zzajn(i2 == 0 ? zza : Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzb(int i2) {
        zze(i2);
        return this.zzb[i2];
    }

    private zzajn(boolean[] zArr, int i2, boolean z3) {
        super(z3);
        this.zzb = zArr;
        this.zzc = i2;
    }

    public final void zza(boolean z3) {
        zza();
        int i2 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, this.zzc);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zArr3[i5] = z3;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
