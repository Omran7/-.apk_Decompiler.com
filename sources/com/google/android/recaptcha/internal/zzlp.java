package com.google.android.recaptcha.internal;

final class zzlp implements zznh {
    static final zznh zza = new zzlp();

    private zzlp() {
    }

    public final boolean zza(int i2) {
        zzlq zzlq;
        zzlq zzlq2 = zzlq.EDITION_UNKNOWN;
        if (i2 == 0) {
            zzlq = zzlq.EDITION_UNKNOWN;
        } else if (i2 == 1) {
            zzlq = zzlq.EDITION_1_TEST_ONLY;
        } else if (i2 == 2) {
            zzlq = zzlq.EDITION_2_TEST_ONLY;
        } else if (i2 == 900) {
            zzlq = zzlq.EDITION_LEGACY;
        } else if (i2 != Integer.MAX_VALUE) {
            switch (i2) {
                case 998:
                    zzlq = zzlq.EDITION_PROTO2;
                    break;
                case 999:
                    zzlq = zzlq.EDITION_PROTO3;
                    break;
                case 1000:
                    zzlq = zzlq.EDITION_2023;
                    break;
                case 1001:
                    zzlq = zzlq.EDITION_2024;
                    break;
                default:
                    switch (i2) {
                        case 99997:
                            zzlq = zzlq.EDITION_99997_TEST_ONLY;
                            break;
                        case 99998:
                            zzlq = zzlq.EDITION_99998_TEST_ONLY;
                            break;
                        case 99999:
                            zzlq = zzlq.EDITION_99999_TEST_ONLY;
                            break;
                        default:
                            zzlq = null;
                            break;
                    }
            }
        } else {
            zzlq = zzlq.EDITION_MAX;
        }
        if (zzlq != null) {
            return true;
        }
        return false;
    }
}
