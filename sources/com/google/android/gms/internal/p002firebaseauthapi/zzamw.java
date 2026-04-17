package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamw  reason: invalid package */
class zzamw<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* access modifiers changed from: private */
    public Object[] zza;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public Map<K, V> zzc;
    private boolean zzd;
    private volatile zzanc zze;
    /* access modifiers changed from: private */
    public Map<K, V> zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza(comparable) >= 0 || this.zzc.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzanc(this);
        }
        return this.zze;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzamw)) {
            return super.equals(obj);
        }
        zzamw zzamw = (zzamw) obj;
        int size = size();
        if (size != zzamw.size()) {
            return false;
        }
        int i2 = this.zzb;
        if (i2 != zzamw.zzb) {
            return entrySet().equals(zzamw.entrySet());
        }
        for (int i5 = 0; i5 < i2; i5++) {
            if (!zza(i5).equals(zzamw.zza(i5))) {
                return false;
            }
        }
        if (i2 != size) {
            return this.zzc.equals(zzamw.zzc);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        if (zza2 >= 0) {
            return ((zzana) this.zza[zza2]).getValue();
        }
        return this.zzc.get(comparable);
    }

    public int hashCode() {
        int i2 = this.zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 += this.zza[i6].hashCode();
        }
        if (this.zzc.size() > 0) {
            return i5 + this.zzc.hashCode();
        }
        return i5;
    }

    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        if (zza2 >= 0) {
            return zzb(zza2);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public int size() {
        return this.zzc.size() + this.zzb;
    }

    private zzamw() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzc() {
        return new zzanb(this);
    }

    public void zzd() {
        Map<K, V> map;
        Map<K, V> map2;
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

    public final boolean zze() {
        return this.zzd;
    }

    private final int zza(K k6) {
        int i2;
        int i5 = this.zzb;
        int i6 = i5 - 1;
        if (i6 >= 0) {
            int compareTo = k6.compareTo((Comparable) ((zzana) this.zza[i6]).getKey());
            if (compareTo > 0) {
                i2 = i5 + 1;
                return -i2;
            } else if (compareTo == 0) {
                return i6;
            }
        }
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) / 2;
            int compareTo2 = k6.compareTo((Comparable) ((zzana) this.zza[i8]).getKey());
            if (compareTo2 < 0) {
                i6 = i8 - 1;
            } else if (compareTo2 <= 0) {
                return i8;
            } else {
                i7 = i8 + 1;
            }
        }
        i2 = i7 + 1;
        return -i2;
    }

    /* access modifiers changed from: private */
    public final V zzb(int i2) {
        zzg();
        V value = ((zzana) this.zza[i2]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i2 + 1, objArr, i2, (this.zzb - i2) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it2 = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzana(this, (Map.Entry) it2.next());
            this.zzb++;
            it2.remove();
        }
        return value;
    }

    public final int zza() {
        return this.zzb;
    }

    /* renamed from: zza */
    public final V put(K k6, V v6) {
        zzg();
        int zza2 = zza(k6);
        if (zza2 >= 0) {
            return ((zzana) this.zza[zza2]).setValue(v6);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i2 = -(zza2 + 1);
        if (i2 >= 16) {
            return zzf().put(k6, v6);
        }
        int i5 = this.zzb;
        if (i5 == 16) {
            zzana zzana = (zzana) this.zza[15];
            this.zzb = i5 - 1;
            zzf().put((Comparable) zzana.getKey(), zzana.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i2, objArr, i2 + 1, (objArr.length - i2) - 1);
        this.zza[i2] = new zzana(this, k6, v6);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i2) {
        if (i2 < this.zzb) {
            return (zzana) this.zza[i2];
        }
        throw new ArrayIndexOutOfBoundsException(i2);
    }
}
