package com.google.android.gms.internal.measurement;

import h0.C0552a;

final class zzbw extends zzcc {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public /* synthetic */ zzbw(String str, boolean z3, int i2, zzbs zzbs, zzbt zzbt, int i5, zzbv zzbv) {
        this.zzc = str;
        this.zzd = i2;
        this.zze = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcc) {
            zzcc zzcc = (zzcc) obj;
            if (this.zzc.equals(zzcc.zzc())) {
                zzcc.zzd();
                int i2 = this.zzd;
                int zze2 = zzcc.zze();
                if (i2 == 0) {
                    throw null;
                } else if (i2 == zze2) {
                    zzcc.zza();
                    zzcc.zzb();
                    int i5 = this.zze;
                    int zzf = zzcc.zzf();
                    if (i5 == 0) {
                        throw null;
                    } else if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzc.hashCode() ^ 1000003;
        int i2 = this.zzd;
        if (i2 != 0) {
            int i5 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i2;
            if (this.zze != 0) {
                return (i5 * 583896283) ^ 1;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i2 = this.zzd;
        String str2 = "null";
        if (i2 == 1) {
            str = "ALL_CHECKS";
        } else if (i2 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i2 == 3) {
            str = "SKIP_SECURITY_CHECK";
        } else if (i2 != 4) {
            str = str2;
        } else {
            str = "NO_CHECKS";
        }
        if (this.zze == 1) {
            str2 = "READ_AND_WRITE";
        }
        return C0552a.r(C0552a.u("FileComplianceOptions{fileOwner=", this.zzc, ", hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), str2, "}");
    }

    public final zzbs zza() {
        return null;
    }

    public final zzbt zzb() {
        return null;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return false;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zze;
    }
}
