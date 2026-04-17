package com.google.android.gms.internal.play_billing;

import java.util.Set;

public final class zzds {
    public static int zza(Set set) {
        int i2;
        int i5 = 0;
        for (Object next : set) {
            if (next != null) {
                i2 = next.hashCode();
            } else {
                i2 = 0;
            }
            i5 += i2;
        }
        return i5;
    }
}
