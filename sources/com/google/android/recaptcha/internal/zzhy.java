package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import n5.C0874f;
import n5.C0883o;

public final class zzhy {
    private List zza = C0883o.f10398a;

    public final long zza(long[] jArr) {
        List list = this.zza;
        List z12 = C0874f.z1(jArr);
        j.e(list, "<this>");
        ArrayList arrayList = new ArrayList(z12.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(z12);
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() ^ ((Number) it2.next()).longValue());
            }
            return ((Number) next).longValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void zzb(long[] jArr) {
        this.zza = C0874f.z1(jArr);
    }
}
