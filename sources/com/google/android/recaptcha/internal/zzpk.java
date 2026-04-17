package com.google.android.recaptcha.internal;

public final class zzpk extends RuntimeException {
    public zzpk(zzoi zzoi) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zznn zza() {
        return new zznn(getMessage());
    }
}
