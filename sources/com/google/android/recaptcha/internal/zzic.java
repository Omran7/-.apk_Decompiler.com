package com.google.android.recaptcha.internal;

import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;

public final class zzic implements zzih {
    private static final boolean zzb(int i2) {
        try {
            new Socket("localhost", i2).close();
            return true;
        } catch (ConnectException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        int length = objArr.length;
        ArrayList<Number> arrayList = new ArrayList<>(length);
        int i2 = 0;
        while (i2 < length) {
            Integer num = objArr[i2];
            if (true != (num instanceof Integer)) {
                num = null;
            }
            Integer num2 = num;
            if (num2 != null) {
                arrayList.add(Integer.valueOf(num2.intValue()));
                i2++;
            } else {
                throw new zzce(4, 5, (Throwable) null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            if (zzb(intValue2)) {
                arrayList2.add(Integer.valueOf(intValue2));
            }
        }
        return arrayList2;
    }
}
