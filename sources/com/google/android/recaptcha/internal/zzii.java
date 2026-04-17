package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import m5.C0845d;
import n5.C0886r;

public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = C0886r.A0(new C0845d(2, Context.ACTIVITY_SERVICE), new C0845d(3, Context.TELEPHONY_SERVICE), new C0845d(4, Context.INPUT_METHOD_SERVICE), new C0845d(5, Context.AUDIO_SERVICE));

    public zzii(Context context) {
        this.zza = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Integer num = objArr[0];
        if (true != (num instanceof Integer)) {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            Object obj = this.zzb.get(Integer.valueOf(num2.intValue()));
            if (obj != null) {
                return this.zza.getSystemService((String) obj);
            }
            throw new zzce(4, 4, (Throwable) null);
        }
        throw new zzce(4, 5, (Throwable) null);
    }
}
