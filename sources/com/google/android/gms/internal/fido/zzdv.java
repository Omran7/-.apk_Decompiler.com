package com.google.android.gms.internal.fido;

import h0.C0552a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

final class zzdv {
    private final Deque zza = new ArrayDeque(16);

    private zzdv(boolean z3) {
    }

    public static zzdv zza() {
        return new zzdv(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j6) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j6));
    }

    public final void zzb() {
        if (!this.zza.isEmpty()) {
            int size = this.zza.size();
            long zzh = zzh();
            throw new IOException("data item not completed, stackSize: " + size + " scope: " + zzh);
        }
    }

    public final void zzc() {
        long zzh = zzh();
        if (zzh >= 0) {
            throw new IOException(C0552a.m("expected indefinite length scope but found ", zzh));
        } else if (zzh != -5) {
            this.zza.pop();
        } else {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
    }

    public final void zzd() {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh == -2) {
                zzh = -2;
            } else {
                return;
            }
        }
        throw new IOException(C0552a.m("expected non-string scope but found ", zzh));
    }

    public final void zze(long j6) {
        long zzh = zzh();
        if (zzh != j6) {
            if (zzh != -1) {
                if (zzh == -2) {
                    zzh = -2;
                } else {
                    return;
                }
            }
            throw new IOException("expected non-string scope or scope " + j6 + " but found " + zzh);
        }
    }

    public final void zzf() {
        long zzh = zzh();
        int i2 = (zzh > 1 ? 1 : (zzh == 1 ? 0 : -1));
        if (i2 == 0) {
            this.zza.pop();
        } else if (i2 > 0) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5);
        } else if (zzh == -5) {
            zzi(-4);
        }
    }

    public final void zzg(long j6) {
        this.zza.push(Long.valueOf(j6));
    }
}
