package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzdr extends zzcw {
    static final zzdr zzc = new zzdr(zzdk.zza, zzdc.zza);
    final transient zzco zzd;

    static {
        int i2 = zzco.zzd;
    }

    public zzdr(zzco zzco, Comparator comparator) {
        super(comparator);
        this.zzd = zzco;
    }

    public final Object ceiling(Object obj) {
        zzco zzco = this.zzd;
        int zzt = zzt(obj, true);
        if (zzt == zzco.size()) {
            return null;
        }
        return this.zzd.get(zzt);
    }

    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, this.zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzdb) {
            collection = ((zzdb) collection).zza();
        }
        if (!zzdv.zza(this.zza, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zzdx zzn = this.zzd.listIterator(0);
        Iterator it2 = collection.iterator();
        if (!zzn.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = zzn.next();
        while (true) {
            try {
                int compare = this.zza.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    } else if (!it2.hasNext()) {
                        return true;
                    } else {
                        next = it2.next();
                    }
                } else if (!zzn.hasNext()) {
                    return false;
                } else {
                    next2 = zzn.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[Catch:{ ClassCastException | NoSuchElementException -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r7 = (java.util.Set) r7
            com.google.android.gms.internal.play_billing.zzco r1 = r6.zzd
            int r1 = r1.size()
            int r3 = r7.size()
            if (r1 == r3) goto L_0x0019
            return r2
        L_0x0019:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0020
            return r0
        L_0x0020:
            java.util.Comparator r1 = r6.zza
            boolean r1 = com.google.android.gms.internal.play_billing.zzdv.zza(r1, r7)
            if (r1 == 0) goto L_0x004d
            java.util.Iterator r7 = r7.iterator()
            com.google.android.gms.internal.play_billing.zzco r1 = r6.zzd     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            com.google.android.gms.internal.play_billing.zzdx r1 = r1.listIterator(r2)     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
        L_0x0032:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            java.lang.Object r4 = r7.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            if (r4 == 0) goto L_0x004a
            java.util.Comparator r5 = r6.zza     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            int r3 = r5.compare(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x004c }
            if (r3 == 0) goto L_0x0032
        L_0x004a:
            return r2
        L_0x004b:
            return r0
        L_0x004c:
            return r2
        L_0x004d:
            boolean r7 = r6.containsAll(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzdr.equals(java.lang.Object):boolean");
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.zzd.get(0);
        }
        throw new NoSuchElementException();
    }

    public final Object floor(Object obj) {
        int zzs = zzs(obj, true) - 1;
        if (zzs == -1) {
            return null;
        }
        return this.zzd.get(zzs);
    }

    public final Object higher(Object obj) {
        zzco zzco = this.zzd;
        int zzt = zzt(obj, false);
        if (zzt == zzco.size()) {
            return null;
        }
        return this.zzd.get(zzt);
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    public final Object last() {
        if (!isEmpty()) {
            zzco zzco = this.zzd;
            return zzco.get(zzco.size() - 1);
        }
        throw new NoSuchElementException();
    }

    public final Object lower(Object obj) {
        int zzs = zzs(obj, false) - 1;
        if (zzs == -1) {
            return null;
        }
        return this.zzd.get(zzs);
    }

    public final int size() {
        return this.zzd.size();
    }

    public final int zza(Object[] objArr, int i2) {
        return this.zzd.zza(objArr, 0);
    }

    public final int zzb() {
        return this.zzd.zzb();
    }

    public final int zzc() {
        return this.zzd.zzc();
    }

    public final zzco zzd() {
        return this.zzd;
    }

    public final zzdw zze() {
        return this.zzd.listIterator(0);
    }

    public final boolean zzf() {
        throw null;
    }

    public final Object[] zzg() {
        return this.zzd.zzg();
    }

    public final zzcw zzl() {
        Comparator reverseOrder = Collections.reverseOrder(this.zza);
        if (isEmpty()) {
            return zzcw.zzq(reverseOrder);
        }
        return new zzdr(this.zzd.zzh(), reverseOrder);
    }

    public final zzcw zzm(Object obj, boolean z3) {
        return zzu(0, zzs(obj, z3));
    }

    public final zzcw zzo(Object obj, boolean z3, Object obj2, boolean z4) {
        return zzp(obj, z3).zzm(obj2, z4);
    }

    public final zzcw zzp(Object obj, boolean z3) {
        return zzu(zzt(obj, z3), this.zzd.size());
    }

    /* renamed from: zzr */
    public final zzdw descendingIterator() {
        return this.zzd.zzh().listIterator(0);
    }

    public final int zzs(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, this.zza);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z3) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    public final int zzt(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.zzd, obj, this.zza);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z3) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    public final zzdr zzu(int i2, int i5) {
        if (i2 == 0) {
            if (i5 == this.zzd.size()) {
                return this;
            }
            i2 = 0;
        }
        if (i2 >= i5) {
            return zzcw.zzq(this.zza);
        }
        zzco zzco = this.zzd;
        return new zzdr(zzco.subList(i2, i5), this.zza);
    }
}
