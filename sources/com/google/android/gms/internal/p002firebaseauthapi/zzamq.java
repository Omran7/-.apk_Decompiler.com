package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamq  reason: invalid package */
final class zzamq<E> extends zzajj<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzamq<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzamq<>(objArr, 0, false);
    }

    public zzamq() {
        this(zza, 0, true);
    }

    private static int zzb(int i2) {
        return C0552a.i(i2, 3, 2, 1, 10);
    }

    private final String zzc(int i2) {
        return C0552a.l("Index:", i2, this.zzd, ", Size:");
    }

    public static <E> zzamq<E> zzd() {
        return zzb;
    }

    public final void add(int i2, E e6) {
        int i5;
        zza();
        if (i2 < 0 || i2 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i2));
        }
        E[] eArr = this.zzc;
        if (i5 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i5 - i2);
        } else {
            E[] eArr2 = new Object[zzb(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i2);
            System.arraycopy(this.zzc, i2, eArr2, i2 + 1, this.zzd - i2);
            this.zzc = eArr2;
        }
        this.zzc[i2] = e6;
        this.zzd++;
        this.modCount++;
    }

    public final E get(int i2) {
        zzd(i2);
        return this.zzc[i2];
    }

    public final E remove(int i2) {
        zza();
        zzd(i2);
        E[] eArr = this.zzc;
        E e6 = eArr[i2];
        int i5 = this.zzd;
        if (i2 < i5 - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (i5 - i2) - 1);
        }
        this.zzd--;
        this.modCount++;
        return e6;
    }

    public final E set(int i2, E e6) {
        zza();
        zzd(i2);
        E[] eArr = this.zzc;
        E e7 = eArr[i2];
        eArr[i2] = e6;
        this.modCount++;
        return e7;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* synthetic */ zzalc zza(int i2) {
        Object[] objArr;
        if (i2 >= this.zzd) {
            if (i2 == 0) {
                objArr = zza;
            } else {
                objArr = Arrays.copyOf(this.zzc, i2);
            }
            return new zzamq(objArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzamq(E[] eArr, int i2, boolean z3) {
        super(z3);
        this.zzc = eArr;
        this.zzd = i2;
    }

    private final void zzd(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i2));
        }
    }

    public final boolean add(E e6) {
        zza();
        int i2 = this.zzd;
        E[] eArr = this.zzc;
        if (i2 == eArr.length) {
            this.zzc = Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        eArr2[i5] = e6;
        this.modCount++;
        return true;
    }
}
