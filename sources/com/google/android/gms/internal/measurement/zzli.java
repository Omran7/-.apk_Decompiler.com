package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

public final class zzli extends IOException {
    public zzli() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzli(long j6, long j7, int i2, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j6 + ", limit: " + j7 + ", len: " + i2), th);
        Locale locale = Locale.US;
    }

    public zzli(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
