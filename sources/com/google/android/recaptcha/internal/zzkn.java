package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzko;
import h0.C0552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzkn<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zzoh {
    public static void zzd(Iterable iterable, List list) {
        byte[] bArr = zznl.zzb;
        iterable.getClass();
        if (iterable instanceof zznu) {
            List zza = ((zznu) iterable).zza();
            zznu zznu = (zznu) list;
            int size = list.size();
            for (Object next : zza) {
                if (next == null) {
                    String k6 = C0552a.k(zznu.size() - size, "Element at index ", " is null.");
                    int size2 = zznu.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            zznu.remove(size2);
                        } else {
                            throw new NullPointerException(k6);
                        }
                    }
                } else if (next instanceof zzle) {
                    zzle zzle = (zzle) next;
                    zznu.zzb();
                } else if (next instanceof byte[]) {
                    byte[] bArr2 = (byte[]) next;
                    zzle.zzk(bArr2, 0, bArr2.length);
                    zznu.zzb();
                } else {
                    zznu.add((String) next);
                }
            }
        } else if (!(iterable instanceof zzor)) {
            if (iterable instanceof Collection) {
                int size3 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size3);
                }
                if (list instanceof zzot) {
                    ((zzot) list).zzf(list.size() + size3);
                }
            }
            int size4 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (Object next2 : iterable) {
                    if (next2 == null) {
                        zze(list, size4);
                    }
                    list.add(next2);
                }
                return;
            }
            List list2 = (List) iterable;
            int size5 = list2.size();
            for (int i2 = 0; i2 < size5; i2++) {
                Object obj = list2.get(i2);
                if (obj == null) {
                    zze(list, size4);
                }
                list.add(obj);
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    private static void zze(List list, int i2) {
        String k6 = C0552a.k(list.size() - i2, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size >= i2) {
                list.remove(size);
            } else {
                throw new NullPointerException(k6);
            }
        }
    }

    /* renamed from: zza */
    public abstract zzkn clone();

    public abstract zzkn zzb(zzko zzko);

    public final /* bridge */ /* synthetic */ zzoh zzc(zzoi zzoi) {
        if (zzm().getClass().isInstance(zzoi)) {
            return zzb((zzko) zzoi);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
