package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzmd<MessageType extends zzmd<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzko<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzof zzc = zzof.zzc();
    private int zzd = -1;

    private final int zzc(zzns zzns) {
        return zznp.zza().zzb(getClass()).zza(this);
    }

    public static zzmd zzci(Class cls) {
        Map map = zzb;
        zzmd zzmd = (zzmd) map.get(cls);
        if (zzmd == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzmd = (zzmd) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (zzmd == null) {
            zzmd = (zzmd) ((zzmd) zzol.zze(cls)).zzl(6, (Object) null, (Object) null);
            if (zzmd != null) {
                map.put(cls, zzmd);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzmd;
    }

    public static zzmh zzck() {
        return zzme.zzf();
    }

    public static zzmi zzcl() {
        return zzmw.zzf();
    }

    public static zzmi zzcm(zzmi zzmi) {
        int size = zzmi.size();
        return zzmi.zze(size + size);
    }

    public static zzmj zzcn() {
        return zznq.zze();
    }

    public static zzmj zzco(zzmj zzmj) {
        int size = zzmj.size();
        return zzmj.zzd(size + size);
    }

    public static Object zzcp(Method method, Object obj, Object... objArr) {
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

    public static Object zzcq(zznh zznh, String str, Object[] objArr) {
        return new zznr(zznh, str, objArr);
    }

    public static void zzct(Class cls, zzmd zzmd) {
        zzmd.zzcs();
        zzb.put(cls, zzmd);
    }

    /* access modifiers changed from: private */
    public static final boolean zzd(zzmd zzmd, boolean z3) {
        zzmd zzmd2;
        byte byteValue = ((Byte) zzmd.zzl(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zznp.zza().zzb(zzmd.getClass()).zzk(zzmd);
        if (z3) {
            if (true != zzk) {
                zzmd2 = null;
            } else {
                zzmd2 = zzmd;
            }
            zzmd.zzl(2, zzmd2, (Object) null);
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
        return zznp.zza().zzb(getClass()).zzj(this, (zzmd) obj);
    }

    public final int hashCode() {
        if (zzcw()) {
            return zzce();
        }
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int zzce = zzce();
        this.zza = zzce;
        return zzce;
    }

    public final String toString() {
        return zznj.zza(this, super.toString());
    }

    public final /* synthetic */ zzng zzcA() {
        return (zzlz) zzl(5, (Object) null, (Object) null);
    }

    public final void zzcB(zzlk zzlk) {
        zznp.zza().zzb(getClass()).zzi(this, zzll.zza(zzlk));
    }

    public final /* synthetic */ zznh zzcC() {
        return (zzmd) zzl(6, (Object) null, (Object) null);
    }

    public final boolean zzcD() {
        return zzd(this, true);
    }

    public final int zzca(zzns zzns) {
        if (zzcw()) {
            int zza = zzns.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(a.f(zza, "serialized size must be non-negative, was "));
        }
        int i2 = this.zzd & f.API_PRIORITY_OTHER;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int zza2 = zzns.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(a.f(zza2, "serialized size must be non-negative, was "));
    }

    public final int zzce() {
        return zznp.zza().zzb(getClass()).zzb(this);
    }

    public final int zzcf() {
        int i2;
        if (zzcw()) {
            i2 = zzc((zzns) null);
            if (i2 < 0) {
                throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
            }
        } else {
            i2 = this.zzd & f.API_PRIORITY_OTHER;
            if (i2 == Integer.MAX_VALUE) {
                i2 = zzc((zzns) null);
                if (i2 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i2;
                } else {
                    throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
                }
            }
        }
        return i2;
    }

    public final zzlz zzcg() {
        return (zzlz) zzl(5, (Object) null, (Object) null);
    }

    public final zzlz zzch() {
        zzlz zzlz = (zzlz) zzl(5, (Object) null, (Object) null);
        zzlz.zzaY(this);
        return zzlz;
    }

    public final zzmd zzcj() {
        return (zzmd) zzl(4, (Object) null, (Object) null);
    }

    public final void zzcr() {
        zznp.zza().zzb(getClass()).zzf(this);
        zzcs();
    }

    public final void zzcs() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzcu(int i2) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    public final boolean zzcw() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object zzl(int i2, Object obj, Object obj2);
}
