package com.google.android.play.core.integrity;

import android.os.Bundle;

public final class j implements k {
    public final com.google.android.gms.common.api.j a(Bundle bundle) {
        int i2 = bundle.getInt("error");
        if (i2 == 0) {
            return null;
        }
        return new StandardIntegrityException(i2, (Throwable) null);
    }
}
