package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky.zza;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaky  reason: invalid package */
public abstract class zzaky<MessageType extends zzaky<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzajf<MessageType, BuilderType> {
    private static Map<Class<?>, zzaky<?, ?>> zzc = new ConcurrentHashMap();
    protected zzann zzb = zzann.zzc();
    private int zzd = -1;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaky$zzb */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzaky<MessageType, BuilderType> implements zzame {
        protected zzakr<zze> zzc = zzakr.zzb();

        public final zzakr<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzakr) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaky$zzc */
    public static class zzc<T extends zzaky<T, ?>> extends zzajg<T> {
        public zzc(T t6) {
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaky$zzd */
    public static class zzd<ContainingType extends zzamc, Type> extends zzakl<ContainingType, Type> {
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaky$zze */
    public static final class zze implements zzakt<zze> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zzanw zzb() {
            throw new NoSuchMethodError();
        }

        public final zzaod zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzamf zza(zzamf zzamf, zzamc zzamc) {
            throw new NoSuchMethodError();
        }

        public final zzaml zza(zzaml zzaml, zzaml zzaml2) {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaky$zzf */
    public static final class zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    private final int zzb(zzamv<?> zzamv) {
        if (zzamv == null) {
            return zzamr.zza().zza(this).zza(this);
        }
        return zzamv.zza(this);
    }

    public static <E> zzalc<E> zzp() {
        return zzamq.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzamr.zza().zza(this).zzb(this, (zzaky) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzamh.zza((zzamc) this, super.toString());
    }

    public abstract Object zza(int i2, Object obj, Object obj2);

    public final /* synthetic */ zzamc zzg() {
        return (zzaky) zza(zzf.zzf, (Object) null, (Object) null);
    }

    public final int zzi() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    public final boolean zzj() {
        return zzb(this, true);
    }

    public final int zzl() {
        return zza((zzamv) null);
    }

    public final <MessageType2 extends zzaky<MessageType2, BuilderType2>, BuilderType2 extends zza<MessageType2, BuilderType2>> BuilderType2 zzm() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (zzaky) zza(zzf.zzd, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzamf zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzamf zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final void zzs() {
        zzamr.zza().zza(this).zzd(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final boolean zzu() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    private final int zza() {
        return zzamr.zza().zza(this).zzb(this);
    }

    private static <T extends zzaky<T, ?>> T zzb(T t6, zzajp zzajp, zzakk zzakk) {
        zzakb zzc2 = zzajp.zzc();
        T zza2 = zza(t6, zzc2, zzakk);
        zzc2.zzb(0);
        return zza2;
    }

    public final int zza(zzamv zzamv) {
        if (zzu()) {
            int zzb2 = zzb((zzamv<?>) zzamv);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(a.f(zzb2, "serialized size must be non-negative, was "));
        } else if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        } else {
            int zzb3 = zzb((zzamv<?>) zzamv);
            zzb(zzb3);
            return zzb3;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaky$zza */
    public static abstract class zza<MessageType extends zzaky<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzaje<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzu()) {
                this.zza = messagetype.zzo();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public /* synthetic */ Object clone() {
            zza zza2 = (zza) this.zzb.zza(zzf.zze, (Object) null, (Object) null);
            zza2.zza = (zzaky) zzf();
            return zza2;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        public final /* synthetic */ zzaje zzb() {
            return (zza) clone();
        }

        /* renamed from: zzc */
        public final MessageType zze() {
            MessageType messagetype = (zzaky) zzf();
            if (messagetype.zzj()) {
                return messagetype;
            }
            throw new zzanl(messagetype);
        }

        /* renamed from: zzd */
        public MessageType zzf() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        public final /* synthetic */ zzamc zzg() {
            return this.zzb;
        }

        public final void zzh() {
            if (!this.zza.zzu()) {
                zzi();
            }
        }

        public void zzi() {
            MessageType zzo = this.zzb.zzo();
            zza(zzo, this.zza);
            this.zza = zzo;
        }

        public final boolean zzj() {
            return zzaky.zzb(this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzamr.zza().zza(messagetype).zza(messagetype, messagetype2);
        }
    }

    public final void zzb(int i2) {
        if (i2 >= 0) {
            this.zzd = (i2 & f.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
    }

    /* access modifiers changed from: private */
    public static final <T extends zzaky<T, ?>> boolean zzb(T t6, boolean z3) {
        byte byteValue = ((Byte) t6.zza(zzf.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzamr.zza().zza(t6).zze(t6);
        if (z3) {
            t6.zza(zzf.zzb, (Object) zze2 ? t6 : null, (Object) null);
        }
        return zze2;
    }

    private static <T extends zzaky<T, ?>> T zza(T t6) {
        if (t6 == null || zzb(t6, true)) {
            return t6;
        }
        zzalf zza2 = new zzanl(t6).zza();
        zza2.getClass();
        throw zza2;
    }

    public static <T extends zzaky<?, ?>> T zza(Class<T> cls) {
        T t6 = (zzaky) zzc.get(cls);
        if (t6 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t6 = (zzaky) zzc.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (t6 == null) {
            t6 = (zzaky) ((zzaky) zzanp.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (t6 != null) {
                zzc.put(cls, t6);
            } else {
                throw new IllegalStateException();
            }
        }
        return t6;
    }

    public static <T extends zzaky<T, ?>> T zza(T t6, zzajp zzajp, zzakk zzakk) {
        return zza(zzb(t6, zzajp, zzakk));
    }

    public static <T extends zzaky<T, ?>> T zza(T t6, InputStream inputStream, zzakk zzakk) {
        zzakb zzakb;
        if (inputStream == null) {
            byte[] bArr = zzalb.zzb;
            zzakb = zzakb.zza(bArr, 0, bArr.length, false);
        } else {
            zzakb = new zzakd(inputStream);
        }
        return zza(zza(t6, zzakb, zzakk));
    }

    public static <T extends zzaky<T, ?>> T zza(T t6, byte[] bArr, zzakk zzakk) {
        return zza(zza(t6, bArr, 0, bArr.length, zzakk));
    }

    private static <T extends zzaky<T, ?>> T zza(T t6, zzakb zzakb, zzakk zzakk) {
        T zzo = t6.zzo();
        try {
            zzamv zza2 = zzamr.zza().zza(zzo);
            zza2.zza(zzo, zzakf.zza(zzakb), zzakk);
            zza2.zzd(zzo);
            return zzo;
        } catch (zzalf e6) {
            e = e6;
            if (e.zzl()) {
                e = new zzalf((IOException) e);
            }
            throw e;
        } catch (zzanl e7) {
            zzalf zza3 = e7.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e8) {
            if (e8.getCause() instanceof zzalf) {
                throw ((zzalf) e8.getCause());
            }
            throw new zzalf(e8);
        } catch (RuntimeException e9) {
            if (e9.getCause() instanceof zzalf) {
                throw ((zzalf) e9.getCause());
            }
            throw e9;
        }
    }

    private static <T extends zzaky<T, ?>> T zza(T t6, byte[] bArr, int i2, int i5, zzakk zzakk) {
        if (i5 == 0) {
            return t6;
        }
        T zzo = t6.zzo();
        try {
            zzamv zza2 = zzamr.zza().zza(zzo);
            zza2.zza(zzo, bArr, 0, i5, new zzajk(zzakk));
            zza2.zzd(zzo);
            return zzo;
        } catch (zzalf e6) {
            e = e6;
            if (e.zzl()) {
                e = new zzalf((IOException) e);
            }
            throw e;
        } catch (zzanl e7) {
            zzalf zza3 = e7.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e8) {
            if (e8.getCause() instanceof zzalf) {
                throw ((zzalf) e8.getCause());
            }
            throw new zzalf(e8);
        } catch (IndexOutOfBoundsException unused) {
            zzalf zzj = zzalf.zzj();
            zzj.getClass();
            throw zzj;
        }
    }

    public static <E> zzalc<E> zza(zzalc<E> zzalc) {
        return zzalc.zza(zzalc.size() << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
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

    public static Object zza(zzamc zzamc, String str, Object[] objArr) {
        return new zzamt(zzamc, str, objArr);
    }

    public static <T extends zzaky<?, ?>> void zza(Class<T> cls, T t6) {
        t6.zzt();
        zzc.put(cls, t6);
    }

    public final void zza(zzakg zzakg) {
        zzamr.zza().zza(this).zza(this, (zzaof) zzakj.zza(zzakg));
    }
}
