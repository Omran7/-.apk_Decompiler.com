package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagh  reason: invalid package */
final class zzagh extends zzahv {
    private final String zza;
    private final String zzb;

    public zzagh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzahv) {
            zzahv zzahv = (zzahv) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzahv.zzb()) : zzahv.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? !str2.equals(zzahv.zza()) : zzahv.zza() != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        String str = this.zza;
        int i5 = 0;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i6 = (i2 ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return i6 ^ i5;
    }

    public final String toString() {
        return C0552a.q("RecaptchaEnforcementState{provider=", this.zza, ", enforcementState=", this.zzb, "}");
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
