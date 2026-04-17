package com.google.android.gms.internal.auth;

import E1.c;
import android.util.Log;
import java.io.UnsupportedEncodingException;

public abstract class zzbz extends c {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e6) {
            Log.e("AUTH", "Error serializing object.", e6);
            return null;
        }
    }
}
