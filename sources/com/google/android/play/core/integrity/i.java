package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.j;

public final class i implements k {
    public final j a(Bundle bundle) {
        int i2 = bundle.getInt("error");
        if (i2 == 0) {
            return null;
        }
        return new IntegrityServiceException(i2, (Throwable) null);
    }
}
