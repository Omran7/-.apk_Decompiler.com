package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzakt;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakr  reason: invalid package */
final class zzakr<T extends zzakt<T>> {
    private static final zzakr<?> zzb = new zzakr<>(true);
    final zzamw<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzakr() {
        this.zza = new zzamz();
    }

    public static int zza(zzanw zzanw, int i2, Object obj) {
        int zzi = zzakg.zzi(i2);
        if (zzanw == zzanw.GROUP) {
            zzalb.zza((zzamc) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzanw, obj);
    }

    public static <T extends zzakt<T>> zzakr<T> zzb() {
        return zzb;
    }

    public final /* synthetic */ Object clone() {
        zzakr zzakr = new zzakr();
        int zza2 = this.zza.zza();
        for (int i2 = 0; i2 < zza2; i2++) {
            Map.Entry<T, Object> zza3 = this.zza.zza(i2);
            zzakr.zzb((zzakt) zza3.getKey(), zza3.getValue());
        }
        for (Map.Entry next : this.zza.zzb()) {
            zzakr.zzb((zzakt) next.getKey(), next.getValue());
        }
        zzakr.zzd = this.zzd;
        return zzakr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzakr)) {
            return false;
        }
        return this.zza.equals(((zzakr) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzali(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzali(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (!this.zzc) {
            int zza2 = this.zza.zza();
            for (int i2 = 0; i2 < zza2; i2++) {
                Object value = this.zza.zza(i2).getValue();
                if (value instanceof zzaky) {
                    ((zzaky) value).zzs();
                }
            }
            for (Map.Entry<T, Object> value2 : this.zza.zzb()) {
                Object value3 = value2.getValue();
                if (value3 instanceof zzaky) {
                    ((zzaky) value3).zzs();
                }
            }
            this.zza.zzd();
            this.zzc = true;
        }
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zza2 = this.zza.zza();
        for (int i2 = 0; i2 < zza2; i2++) {
            if (!zzc(this.zza.zza(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzc2 : this.zza.zzb()) {
            if (!zzc(zzc2)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        Object obj;
        zzakt zzakt = (zzakt) entry.getKey();
        Object value = entry.getValue();
        boolean z3 = value instanceof zzalg;
        if (zzakt.zze()) {
            if (!z3) {
                Object zza2 = zza(zzakt);
                List list = (List) value;
                int size = list.size();
                if (zza2 == null) {
                    zza2 = new ArrayList(size);
                }
                List list2 = (List) zza2;
                for (int i2 = 0; i2 < size; i2++) {
                    list2.add(zza(list.get(i2)));
                }
                this.zza.put(zzakt, zza2);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (zzakt.zzc() == zzaod.MESSAGE) {
            Object zza3 = zza(zzakt);
            if (zza3 == null) {
                this.zza.put(zzakt, zza(value));
                if (z3) {
                    this.zzd = true;
                }
            } else if (!z3) {
                if (zza3 instanceof zzaml) {
                    obj = zzakt.zza((zzaml) zza3, (zzaml) value);
                } else {
                    obj = zzakt.zza(((zzamc) zza3).zzr(), (zzamc) value).zze();
                }
                this.zza.put(zzakt, obj);
            } else {
                throw new NoSuchMethodError();
            }
        } else if (!z3) {
            this.zza.put(zzakt, zza(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private zzakr(zzamw<T, Object> zzamw) {
        this.zza = zzamw;
        zze();
    }

    private static int zza(zzanw zzanw, Object obj) {
        switch (zzakq.zzb[zzanw.ordinal()]) {
            case 1:
                return zzakg.zza(((Double) obj).doubleValue());
            case 2:
                return zzakg.zza(((Float) obj).floatValue());
            case 3:
                return zzakg.zzd(((Long) obj).longValue());
            case 4:
                return zzakg.zzg(((Long) obj).longValue());
            case 5:
                return zzakg.zze(((Integer) obj).intValue());
            case zzaky.zzf.zzf /*6*/:
                return zzakg.zzc(((Long) obj).longValue());
            case zzaky.zzf.zzg /*7*/:
                return zzakg.zzd(((Integer) obj).intValue());
            case 8:
                return zzakg.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzakg.zza((zzamc) obj);
            case 10:
                if (obj instanceof zzalg) {
                    return zzakg.zza((zzalk) (zzalg) obj);
                }
                return zzakg.zzb((zzamc) obj);
            case ModuleDescriptor.MODULE_VERSION:
                if (obj instanceof zzajp) {
                    return zzakg.zza((zzajp) obj);
                }
                return zzakg.zza((String) obj);
            case 12:
                if (obj instanceof zzajp) {
                    return zzakg.zza((zzajp) obj);
                }
                return zzakg.zza((byte[]) obj);
            case 13:
                return zzakg.zzj(((Integer) obj).intValue());
            case 14:
                return zzakg.zzg(((Integer) obj).intValue());
            case 15:
                return zzakg.zze(((Long) obj).longValue());
            case 16:
                return zzakg.zzh(((Integer) obj).intValue());
            case 17:
                return zzakg.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzala) {
                    return zzakg.zzc(((zzala) obj).zza());
                }
                return zzakg.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzala) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalg) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzc(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.firebase-auth-api.zzanw r0 = r3.zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzalb.zza(r4)
            int[] r1 = com.google.android.gms.internal.p002firebaseauthapi.zzakq.zza
            com.google.android.gms.internal.firebase-auth-api.zzaod r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0041;
                case 3: goto L_0x003e;
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x0035;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = r2
            goto L_0x0046
        L_0x001a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzamc
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalg
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0023:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzala
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x002c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzajp
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0035:
            boolean r1 = r4 instanceof java.lang.String
            goto L_0x0046
        L_0x0038:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L_0x0046
        L_0x003b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L_0x0046
        L_0x003e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L_0x0046
        L_0x0041:
            boolean r1 = r4 instanceof java.lang.Long
            goto L_0x0046
        L_0x0044:
            boolean r1 = r4 instanceof java.lang.Integer
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.firebase-auth-api.zzanw r3 = r3.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzaod r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzakr.zzc(com.google.android.gms.internal.firebase-auth-api.zzakt, java.lang.Object):void");
    }

    private zzakr(boolean z3) {
        this(new zzamz());
        zze();
    }

    private static <T extends zzakt<T>> boolean zzc(Map.Entry<T, Object> entry) {
        zzakt zzakt = (zzakt) entry.getKey();
        if (zzakt.zzc() != zzaod.MESSAGE) {
            return true;
        }
        if (!zzakt.zze()) {
            return zzb(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!zzb(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(T t6, Object obj) {
        if (!t6.zze()) {
            zzc(t6, obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                zzc(t6, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzalg) {
            this.zzd = true;
        }
        this.zza.put(t6, obj);
    }

    public static int zza(zzakt<?> zzakt, Object obj) {
        zzanw zzb2 = zzakt.zzb();
        int zza2 = zzakt.zza();
        if (!zzakt.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!zzakt.zzd()) {
            int i5 = 0;
            while (i2 < size) {
                i5 += zza(zzb2, zza2, list.get(i2));
                i2++;
            }
            return i5;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int i6 = 0;
            while (i2 < size) {
                i6 += zza(zzb2, list.get(i2));
                i2++;
            }
            return zzakg.zzj(i6) + zzakg.zzi(zza2) + i6;
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzame) {
            return ((zzame) obj).zzj();
        }
        if (obj instanceof zzalg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int zza2 = this.zza.zza();
        int i2 = 0;
        for (int i5 = 0; i5 < zza2; i5++) {
            i2 += zza(this.zza.zza(i5));
        }
        for (Map.Entry<T, Object> zza3 : this.zza.zzb()) {
            i2 += zza(zza3);
        }
        return i2;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        zzakt zzakt = (zzakt) entry.getKey();
        Object value = entry.getValue();
        if (zzakt.zzc() != zzaod.MESSAGE || zzakt.zze() || zzakt.zzd()) {
            return zza((zzakt<?>) zzakt, value);
        }
        if (value instanceof zzalg) {
            return zzakg.zza(((zzakt) entry.getKey()).zza(), (zzalk) (zzalg) value);
        }
        return zzakg.zza(((zzakt) entry.getKey()).zza(), (zzamc) value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzaml) {
            return ((zzaml) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t6) {
        Object obj = this.zza.get(t6);
        if (!(obj instanceof zzalg)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    public final void zza(zzakr<T> zzakr) {
        int zza2 = zzakr.zza.zza();
        for (int i2 = 0; i2 < zza2; i2++) {
            zzb(zzakr.zza.zza(i2));
        }
        for (Map.Entry<T, Object> zzb2 : zzakr.zza.zzb()) {
            zzb(zzb2);
        }
    }

    public static void zza(zzakg zzakg, zzanw zzanw, int i2, Object obj) {
        if (zzanw == zzanw.GROUP) {
            zzamc zzamc = (zzamc) obj;
            zzalb.zza(zzamc);
            zzakg.zzk(i2, 3);
            zzamc.zza(zzakg);
            zzakg.zzk(i2, 4);
            return;
        }
        zzakg.zzk(i2, zzanw.zza());
        switch (zzakq.zzb[zzanw.ordinal()]) {
            case 1:
                zzakg.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzakg.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzakg.zzj(((Long) obj).longValue());
                return;
            case 4:
                zzakg.zzj(((Long) obj).longValue());
                return;
            case 5:
                zzakg.zzl(((Integer) obj).intValue());
                return;
            case zzaky.zzf.zzf /*6*/:
                zzakg.zzh(((Long) obj).longValue());
                return;
            case zzaky.zzf.zzg /*7*/:
                zzakg.zzk(((Integer) obj).intValue());
                return;
            case 8:
                zzakg.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzamc) obj).zza(zzakg);
                return;
            case 10:
                zzakg.zzc((zzamc) obj);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                if (obj instanceof zzajp) {
                    zzakg.zzb((zzajp) obj);
                    return;
                } else {
                    zzakg.zzb((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzajp) {
                    zzakg.zzb((zzajp) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzakg.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzakg.zzn(((Integer) obj).intValue());
                return;
            case 14:
                zzakg.zzk(((Integer) obj).intValue());
                return;
            case 15:
                zzakg.zzh(((Long) obj).longValue());
                return;
            case 16:
                zzakg.zzm(((Integer) obj).intValue());
                return;
            case 17:
                zzakg.zzi(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzala) {
                    zzakg.zzl(((zzala) obj).zza());
                    return;
                } else {
                    zzakg.zzl(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
