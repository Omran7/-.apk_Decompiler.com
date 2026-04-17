package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class zzjj extends zzjn implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzjj(int i2) {
        if (i2 >= 0) {
            this.zzb = new ArrayDeque(i2);
            this.zza = i2;
            return;
        }
        throw new IllegalArgumentException(zzji.zza("maxSize (%s) must >= 0", Integer.valueOf(i2)));
    }

    public static zzjj zza(int i2) {
        return new zzjj(i2);
    }

    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        boolean z3;
        int size = collection.size();
        if (size < this.zza) {
            return zzjq.zza(this, collection.iterator());
        }
        clear();
        int i2 = size - this.zza;
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzjf.zzb(z3, "number to skip cannot be negative");
        return zzjq.zza(this, new zzjp(collection, i2).iterator());
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    public final Queue zzd() {
        return this.zzb;
    }
}
