package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.play_billing.zzhg;
import com.google.android.gms.internal.play_billing.zzhk;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzhk<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfv<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzjk zzc = zzjk.zzc();
    private int zzd = -1;

    private static zzhk zzB(zzhk zzhk, byte[] bArr, int i2, int i5, zzgw zzgw) {
        if (i5 == 0) {
            return zzhk;
        }
        zzhk zzp = zzhk.zzp();
        try {
            zzix zzb2 = zziu.zza().zzb(zzp.getClass());
            zzb2.zzh(zzp, bArr, 0, i5, new zzfz(zzgw));
            zzb2.zzf(zzp);
            return zzp;
        } catch (zzhr e6) {
            throw e6;
        } catch (zzji e7) {
            throw e7.zza();
        } catch (IOException e8) {
            if (e8.getCause() instanceof zzhr) {
                throw ((zzhr) e8.getCause());
            }
            throw new zzhr(e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final int zzc(zzix zzix) {
        return zziu.zza().zzb(getClass()).zza(this);
    }

    public static zzhk zzo(Class cls) {
        Map map = zzb;
        zzhk zzhk = (zzhk) map.get(cls);
        if (zzhk == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzhk = (zzhk) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (zzhk == null) {
            zzhk = (zzhk) ((zzhk) zzjq.zze(cls)).zzd(6, (Object) null, (Object) null);
            if (zzhk != null) {
                map.put(cls, zzhk);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzhk;
    }

    public static zzhk zzq(zzhk zzhk, byte[] bArr, zzgw zzgw) {
        zzhk zzB = zzB(zzhk, bArr, 0, bArr.length, zzgw);
        if (zzB == null || zzz(zzB, true)) {
            return zzB;
        }
        throw new zzji(zzB).zza();
    }

    public static zzhn zzr() {
        return zzhl.zzf();
    }

    public static zzho zzs() {
        return zziv.zze();
    }

    public static Object zzt(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static Object zzu(zzim zzim, String str, Object[] objArr) {
        return new zziw(zzim, str, objArr);
    }

    public static void zzx(Class cls, zzhk zzhk) {
        zzhk.zzw();
        zzb.put(cls, zzhk);
    }

    public static final boolean zzz(zzhk zzhk, boolean z3) {
        zzhk zzhk2;
        byte byteValue = ((Byte) zzhk.zzd(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zziu.zza().zzb(zzhk.getClass()).zzk(zzhk);
        if (z3) {
            if (true != zzk) {
                zzhk2 = null;
            } else {
                zzhk2 = zzhk;
            }
            zzhk.zzd(2, zzhk2, (Object) null);
        }
        return zzk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zziu.zza().zzb(getClass()).zzj(this, (zzhk) obj);
    }

    public final int hashCode() {
        if (zzA()) {
            return zzj();
        }
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int zzj = zzj();
        this.zza = zzj;
        return zzj;
    }

    public final String toString() {
        return zzio.zza(this, super.toString());
    }

    public final boolean zzA() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final /* synthetic */ zzil zzI() {
        return (zzhg) zzd(5, (Object) null, (Object) null);
    }

    public final void zzJ(zzgr zzgr) {
        zziu.zza().zzb(getClass()).zzi(this, zzgs.zza(zzgr));
    }

    public abstract Object zzd(int i2, Object obj, Object obj2);

    public final int zze(zzix zzix) {
        if (zzA()) {
            int zza = zzix.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(a.f(zza, "serialized size must be non-negative, was "));
        }
        int i2 = this.zzd & f.API_PRIORITY_OTHER;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int zza2 = zzix.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(a.f(zza2, "serialized size must be non-negative, was "));
    }

    public final /* synthetic */ zzim zzi() {
        return (zzhk) zzd(6, (Object) null, (Object) null);
    }

    public final int zzj() {
        return zziu.zza().zzb(getClass()).zzb(this);
    }

    public final int zzk() {
        int i2;
        if (zzA()) {
            i2 = zzc((zzix) null);
            if (i2 < 0) {
                throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
            }
        } else {
            i2 = this.zzd & f.API_PRIORITY_OTHER;
            if (i2 == Integer.MAX_VALUE) {
                i2 = zzc((zzix) null);
                if (i2 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i2;
                } else {
                    throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
                }
            }
        }
        return i2;
    }

    public final boolean zzl() {
        return zzz(this, true);
    }

    public final zzhg zzm() {
        return (zzhg) zzd(5, (Object) null, (Object) null);
    }

    public final zzhg zzn() {
        zzhg zzhg = (zzhg) zzd(5, (Object) null, (Object) null);
        zzhg.zze(this);
        return zzhg;
    }

    public final zzhk zzp() {
        return (zzhk) zzd(4, (Object) null, (Object) null);
    }

    public final void zzv() {
        zziu.zza().zzb(getClass()).zzf(this);
        zzw();
    }

    public final void zzw() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzy(int i2) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }
}
