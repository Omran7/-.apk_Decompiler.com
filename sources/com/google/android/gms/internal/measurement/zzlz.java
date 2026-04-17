package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;
import java.io.IOException;

public class zzlz<MessageType extends zzmd<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzkn<MessageType, BuilderType> {
    protected zzmd zza;
    private final zzmd zzb;

    public zzlz(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzcw()) {
            this.zza = messagetype.zzcj();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zznp.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ zzkn zzaS(byte[] bArr, int i2, int i5) {
        int i6 = zzlp.zzb;
        int i7 = zznp.zza;
        zzaZ(bArr, 0, i5, zzlp.zza);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzkn zzaT(byte[] bArr, int i2, int i5, zzlp zzlp) {
        zzaZ(bArr, 0, i5, zzlp);
        return this;
    }

    /* renamed from: zzaX */
    public final zzlz zzaR() {
        zzlz zzlz = (zzlz) this.zzb.zzl(5, (Object) null, (Object) null);
        zzlz.zza = zzbc();
        return zzlz;
    }

    public final zzlz zzaY(zzmd zzmd) {
        if (!this.zzb.equals(zzmd)) {
            if (!this.zza.zzcw()) {
                zzbf();
            }
            zza(this.zza, zzmd);
        }
        return this;
    }

    public final zzlz zzaZ(byte[] bArr, int i2, int i5, zzlp zzlp) {
        if (!this.zza.zzcw()) {
            zzbf();
        }
        try {
            zznp.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i5, new zzks(zzlp));
            return this;
        } catch (zzmm e6) {
            throw e6;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        }
    }

    public final MessageType zzba() {
        MessageType zzbb = zzbc();
        if (zzbb.zzcD()) {
            return zzbb;
        }
        throw new zzod(zzbb);
    }

    /* renamed from: zzbb */
    public MessageType zzbc() {
        if (!this.zza.zzcw()) {
            return this.zza;
        }
        this.zza.zzcr();
        return this.zza;
    }

    public final void zzbe() {
        if (!this.zza.zzcw()) {
            zzbf();
        }
    }

    public void zzbf() {
        zzmd zzcj = this.zzb.zzcj();
        zza(zzcj, this.zza);
        this.zza = zzcj;
    }

    public final /* bridge */ /* synthetic */ zznh zzcC() {
        throw null;
    }

    public final boolean zzcD() {
        return zzmd.zzd(this.zza, false);
    }
}
