package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzoa extends AbstractMap {
    /* access modifiers changed from: private */
    public Object[] zza;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public Map zzc = Collections.emptyMap();
    private boolean zzd;
    private volatile zzny zze;
    private Map zzf = Collections.emptyMap();

    private zzoa() {
    }

    private final int zzl(Comparable comparable) {
        int i2 = this.zzb;
        int i5 = i2 - 1;
        int i6 = 0;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((zznw) this.zza[i5]).zza());
            if (compareTo > 0) {
                return -(i2 + 1);
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = comparable.compareTo(((zznw) this.zza[i7]).zza());
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else if (compareTo2 <= 0) {
                return i7;
            } else {
                i6 = i7 + 1;
            }
        }
        return -(i6 + 1);
    }

    /* access modifiers changed from: private */
    public final Object zzm(int i2) {
        zzo();
        Object value = ((zznw) this.zza[i2]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.zzb - i2) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it2 = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i5 = this.zzb;
            Map.Entry entry = (Map.Entry) it2.next();
            objArr2[i5] = new zznw(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it2.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzl(comparable) >= 0 || this.zzc.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzny(this, (zznz) null);
        }
        return this.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoa)) {
            return super.equals(obj);
        }
        zzoa zzoa = (zzoa) obj;
        int size = size();
        if (size != zzoa.size()) {
            return false;
        }
        int i2 = this.zzb;
        if (i2 != zzoa.zzb) {
            return entrySet().equals(zzoa.entrySet());
        }
        for (int i5 = 0; i5 < i2; i5++) {
            if (!zzg(i5).equals(zzoa.zzg(i5))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.zzc.equals(zzoa.zzc);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zznw) this.zza[zzl]).getValue();
        }
        return this.zzc.get(comparable);
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 += this.zza[i6].hashCode();
        }
        if (this.zzc.size() > 0) {
            return this.zzc.hashCode() + i5;
        }
        return i5;
    }

    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        Map map;
        Map map2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = map;
            if (this.zzf.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = map2;
            this.zzd = true;
        }
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    /* renamed from: zzf */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zznw) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i2 = -(zzl + 1);
        if (i2 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zznw zznw = (zznw) this.zza[15];
            this.zzb = 15;
            zzn().put(zznw.zza(), zznw.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i2, objArr, i2 + 1, 15 - i2);
        this.zza[i2] = new zznw(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i2) {
        if (i2 < this.zzb) {
            return (zznw) this.zza[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzoa(zznz zznz) {
    }
}
