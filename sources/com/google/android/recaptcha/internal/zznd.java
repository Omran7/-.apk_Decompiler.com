package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import com.google.android.recaptcha.internal.zzmx;
import com.google.android.recaptcha.internal.zznd;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zznd<MessageType extends zznd<MessageType, BuilderType>, BuilderType extends zzmx<MessageType, BuilderType>> extends zzko<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzpm zzc = zzpm.zzc();
    private int zzd = -1;

    public static zznj zzA() {
        return zznx.zzf();
    }

    public static zznk zzB() {
        return zzot.zze();
    }

    public static zznk zzC(zznk zznk) {
        int size = zznk.size();
        return zznk.zzd(size + size);
    }

    public static Object zzE(Method method, Object obj, Object... objArr) {
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

    public static Object zzF(zzoi zzoi, String str, Object[] objArr) {
        return new zzou(zzoi, str, objArr);
    }

    public static void zzI(Class cls, zznd zznd) {
        zznd.zzH();
        zzb.put(cls, zznd);
    }

    public static final boolean zzK(zznd zznd, boolean z3) {
        zznd zznd2;
        byte byteValue = ((Byte) zznd.zzh(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzos.zza().zzb(zznd.getClass()).zzl(zznd);
        if (z3) {
            if (true != zzl) {
                zznd2 = null;
            } else {
                zznd2 = zznd;
            }
            zznd.zzh(2, zznd2, (Object) null);
        }
        return zzl;
    }

    private final int zzf(zzow zzow) {
        return zzos.zza().zzb(getClass()).zza(this);
    }

    private static zznd zzg(zznd zznd) {
        if (zznd == null || zzK(zznd, true)) {
            return zznd;
        }
        throw new zzpk(zznd).zza();
    }

    /* access modifiers changed from: private */
    public static zznd zzi(zznd zznd, byte[] bArr, int i2, int i5, zzmo zzmo) {
        if (i5 == 0) {
            return zznd;
        }
        zznd zzv = zznd.zzv();
        try {
            zzow zzb2 = zzos.zza().zzb(zzv.getClass());
            zzb2.zzi(zzv, bArr, 0, i5, new zzkt(zzmo));
            zzb2.zzf(zzv);
            return zzv;
        } catch (zznn e6) {
            if (e6.zzb()) {
                throw new zznn((IOException) e6);
            }
            throw e6;
        } catch (zzpk e7) {
            throw e7.zza();
        } catch (IOException e8) {
            if (e8.getCause() instanceof zznn) {
                throw ((zznn) e8.getCause());
            }
            throw new zznn(e8);
        } catch (IndexOutOfBoundsException unused) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zznc zzs(zzoi zzoi, Object obj, zzoi zzoi2, zzng zzng, int i2, zzpw zzpw, Class cls) {
        return new zznc(zzoi, "", (zzoi) null, new zznb((zzng) null, i2, zzpw, false, false), cls);
    }

    public static zznd zzu(Class cls) {
        Map map = zzb;
        zznd zznd = (zznd) map.get(cls);
        if (zznd == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zznd = (zznd) map.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (zznd == null) {
            zznd = (zznd) ((zznd) zzps.zze(cls)).zzh(6, (Object) null, (Object) null);
            if (zznd != null) {
                map.put(cls, zznd);
            } else {
                throw new IllegalStateException();
            }
        }
        return zznd;
    }

    public static zznd zzw(zznd zznd, InputStream inputStream) {
        zzli zzli;
        if (inputStream == null) {
            byte[] bArr = zznl.zzb;
            int length = bArr.length;
            zzli = zzli.zzH(bArr, 0, 0, false);
        } else {
            zzli = new zzlg(inputStream, 4096, (zzlh) null);
        }
        int i2 = zzmo.zzb;
        int i5 = zzos.zza;
        zzmo zzmo = zzmo.zza;
        zznd zzv = zznd.zzv();
        try {
            zzow zzb2 = zzos.zza().zzb(zzv.getClass());
            zzb2.zzh(zzv, zzlj.zzq(zzli), zzmo);
            zzb2.zzf(zzv);
            zzg(zzv);
            return zzv;
        } catch (zznn e6) {
            if (e6.zzb()) {
                throw new zznn((IOException) e6);
            }
            throw e6;
        } catch (zzpk e7) {
            throw e7.zza();
        } catch (IOException e8) {
            if (e8.getCause() instanceof zznn) {
                throw ((zznn) e8.getCause());
            }
            throw new zznn(e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof zznn) {
                throw ((zznn) e9.getCause());
            }
            throw e9;
        }
    }

    public static zznd zzx(zznd zznd, byte[] bArr) {
        int i2 = zzmo.zzb;
        int i5 = zzos.zza;
        zznd zzi = zzi(zznd, bArr, 0, bArr.length, zzmo.zza);
        zzg(zzi);
        return zzi;
    }

    public static zzni zzy() {
        return zzne.zzf();
    }

    public static zzni zzz(zzni zzni) {
        int size = zzni.size();
        return zzni.zzg(size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzos.zza().zzb(getClass()).zzk(this, (zznd) obj);
    }

    public final int hashCode() {
        if (zzL()) {
            return zzn();
        }
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int zzn = zzn();
        this.zza = zzn;
        return zzn;
    }

    public final String toString() {
        return zzok.zza(this, super.toString());
    }

    public final zzoq zzD() {
        return (zzoq) zzh(7, (Object) null, (Object) null);
    }

    public final void zzG() {
        zzos.zza().zzb(getClass()).zzf(this);
        zzH();
    }

    public final void zzH() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzJ(int i2) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int zza(zzow zzow) {
        if (zzL()) {
            int zza = zzow.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(a.f(zza, "serialized size must be non-negative, was "));
        }
        int i2 = this.zzd & f.API_PRIORITY_OTHER;
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        int zza2 = zzow.zza(this);
        if (zza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
            return zza2;
        }
        throw new IllegalStateException(a.f(zza2, "serialized size must be non-negative, was "));
    }

    public final /* synthetic */ zzoh zzad() {
        return (zzmx) zzh(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzoh zzae() {
        zzmx zzmx = (zzmx) zzh(5, (Object) null, (Object) null);
        zzmx.zzh(this);
        return zzmx;
    }

    public final void zze(zzln zzln) {
        zzos.zza().zzb(getClass()).zzj(this, zzlo.zza(zzln));
    }

    public abstract Object zzh(int i2, Object obj, Object obj2);

    public final /* synthetic */ zzoi zzm() {
        return (zznd) zzh(6, (Object) null, (Object) null);
    }

    public final int zzn() {
        return zzos.zza().zzb(getClass()).zzb(this);
    }

    public final int zzo() {
        int i2;
        if (zzL()) {
            i2 = zzf((zzow) null);
            if (i2 < 0) {
                throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
            }
        } else {
            i2 = this.zzd & f.API_PRIORITY_OTHER;
            if (i2 == Integer.MAX_VALUE) {
                i2 = zzf((zzow) null);
                if (i2 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i2;
                } else {
                    throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
                }
            }
        }
        return i2;
    }

    public final boolean zzp() {
        return zzK(this, true);
    }

    public final zzmx zzq() {
        return (zzmx) zzh(5, (Object) null, (Object) null);
    }

    public final zzmx zzr() {
        zzmx zzmx = (zzmx) zzh(5, (Object) null, (Object) null);
        zzmx.zzh(this);
        return zzmx;
    }

    public final zznd zzv() {
        return (zznd) zzh(4, (Object) null, (Object) null);
    }
}
