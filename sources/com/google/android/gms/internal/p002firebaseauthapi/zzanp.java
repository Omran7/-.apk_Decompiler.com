package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanp  reason: invalid package */
final class zzanp {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc = zzaji.zza();
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi = ((long) zzb(byte[].class));

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanp$zza */
    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final double zza(Object obj, long j6) {
            return Double.longBitsToDouble(zze(obj, j6));
        }

        public final float zzb(Object obj, long j6) {
            return Float.intBitsToFloat(zzd(obj, j6));
        }

        public final boolean zzc(Object obj, long j6) {
            if (zzanp.zza) {
                return zzanp.zzf(obj, j6);
            }
            return zzanp.zzg(obj, j6);
        }

        public final void zza(Object obj, long j6, boolean z3) {
            if (zzanp.zza) {
                zzanp.zzc(obj, j6, r3 ? (byte) 1 : 0);
            } else {
                zzanp.zzd(obj, j6, r3 ? (byte) 1 : 0);
            }
        }

        public final void zza(Object obj, long j6, byte b6) {
            if (zzanp.zza) {
                zzanp.zzc(obj, j6, b6);
            } else {
                zzanp.zzd(obj, j6, b6);
            }
        }

        public final void zza(Object obj, long j6, double d) {
            zza(obj, j6, Double.doubleToLongBits(d));
        }

        public final void zza(Object obj, long j6, float f6) {
            zza(obj, j6, Float.floatToIntBits(f6));
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanp$zzb */
    public static abstract class zzb {
        Unsafe zza;

        public zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j6);

        public abstract void zza(Object obj, long j6, byte b6);

        public abstract void zza(Object obj, long j6, double d);

        public abstract void zza(Object obj, long j6, float f6);

        public final void zza(Object obj, long j6, int i2) {
            this.zza.putInt(obj, j6, i2);
        }

        public abstract void zza(Object obj, long j6, boolean z3);

        public abstract float zzb(Object obj, long j6);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (zzanp.zze() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                Logger.getLogger(zzanp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j6);

        public final int zzd(Object obj, long j6) {
            return this.zza.getInt(obj, j6);
        }

        public final long zze(Object obj, long j6) {
            return this.zza.getLong(obj, j6);
        }

        public final void zza(Object obj, long j6, long j7) {
            this.zza.putLong(obj, j6, j7);
        }

        public final boolean zza() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls3.getMethod("arrayBaseOffset", new Class[]{cls});
                cls3.getMethod("arrayIndexScale", new Class[]{cls});
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", new Class[]{cls2, cls4});
                cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
                cls3.getMethod("getLong", new Class[]{cls2, cls4});
                cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
                cls3.getMethod("getObject", new Class[]{cls2, cls4});
                cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
                return true;
            } catch (Throwable th) {
                Logger.getLogger(zzanp.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanp$zzc */
    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final double zza(Object obj, long j6) {
            return Double.longBitsToDouble(zze(obj, j6));
        }

        public final float zzb(Object obj, long j6) {
            return Float.intBitsToFloat(zzd(obj, j6));
        }

        public final boolean zzc(Object obj, long j6) {
            if (zzanp.zza) {
                return zzanp.zzf(obj, j6);
            }
            return zzanp.zzg(obj, j6);
        }

        public final void zza(Object obj, long j6, boolean z3) {
            if (zzanp.zza) {
                zzanp.zzc(obj, j6, r3 ? (byte) 1 : 0);
            } else {
                zzanp.zzd(obj, j6, r3 ? (byte) 1 : 0);
            }
        }

        public final void zza(Object obj, long j6, byte b6) {
            if (zzanp.zza) {
                zzanp.zzc(obj, j6, b6);
            } else {
                zzanp.zzd(obj, j6, b6);
            }
        }

        public final void zza(Object obj, long j6, double d) {
            zza(obj, j6, Double.doubleToLongBits(d));
        }

        public final void zza(Object obj, long j6, float f6) {
            zza(obj, j6, Float.floatToIntBits(f6));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaji.zza()
            zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            zze = r2
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.firebase-auth-api.zzanp$zzc r1 = new com.google.android.gms.internal.firebase-auth-api.zzanp$zzc
            r1.<init>(r0)
            goto L_0x002f
        L_0x0026:
            if (r2 == 0) goto L_0x002e
            com.google.android.gms.internal.firebase-auth-api.zzanp$zza r1 = new com.google.android.gms.internal.firebase-auth-api.zzanp$zza
            r1.<init>(r0)
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            zzf = r1
            r0 = 0
            if (r1 != 0) goto L_0x0036
            r2 = r0
            goto L_0x003a
        L_0x0036:
            boolean r2 = r1.zzb()
        L_0x003a:
            zzg = r2
            if (r1 != 0) goto L_0x0040
            r2 = r0
            goto L_0x0044
        L_0x0040:
            boolean r2 = r1.zza()
        L_0x0044:
            zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            zzi = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<int[]> r2 = int[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<long[]> r2 = long[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<float[]> r2 = float[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<double[]> r2 = double[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            zzb(r2)
            zzc(r2)
            java.lang.reflect.Field r2 = zze()
            if (r2 == 0) goto L_0x008d
            if (r1 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r2)
        L_0x008d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L_0x0096
            r0 = 1
        L_0x0096:
            zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzanp.<clinit>():void");
    }

    private zzanp() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j6) {
        return zzf.zze(obj, j6);
    }

    public static Object zze(Object obj, long j6) {
        return zzf.zza.getObject(obj, j6);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j6) {
        if (((byte) (zzc(obj, -4 & j6) >>> ((int) (((~j6) & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j6) {
        if (((byte) (zzc(obj, -4 & j6) >>> ((int) ((j6 & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    public static boolean zzh(Object obj, long j6) {
        return zzf.zzc(obj, j6);
    }

    public static float zzb(Object obj, long j6) {
        return zzf.zzb(obj, j6);
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j6, byte b6) {
        long j7 = -4 & j6;
        int i2 = (((int) j6) & 3) << 3;
        zza(obj, j7, ((255 & b6) << i2) | (zzc(obj, j7) & (~(255 << i2))));
    }

    public static double zza(Object obj, long j6) {
        return zzf.zza(obj, j6);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j6) {
        return zzf.zzd(obj, j6);
    }

    /* access modifiers changed from: private */
    public static Field zze() {
        Class<Buffer> cls = Buffer.class;
        Field zza2 = zza((Class<?>) cls, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) cls, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void zzc(Object obj, long j6, boolean z3) {
        zzf.zza(obj, j6, z3);
    }

    private static boolean zzd(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        try {
            Class<?> cls3 = zzc;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzanr());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j6, byte b6) {
        long j7 = -4 & j6;
        int zzc2 = zzc(obj, j7);
        int i2 = ((~((int) j6)) & 3) << 3;
        zza(obj, j7, ((255 & b6) << i2) | (zzc2 & (~(255 << i2))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzc() {
        return zzh;
    }

    public static void zza(byte[] bArr, long j6, byte b6) {
        zzf.zza((Object) bArr, zzi + j6, b6);
    }

    public static void zza(Object obj, long j6, double d) {
        zzf.zza(obj, j6, d);
    }

    public static void zza(Object obj, long j6, float f6) {
        zzf.zza(obj, j6, f6);
    }

    public static void zza(Object obj, long j6, int i2) {
        zzf.zza(obj, j6, i2);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object obj, long j6, long j7) {
        zzf.zza(obj, j6, j7);
    }

    public static void zza(Object obj, long j6, Object obj2) {
        zzf.zza.putObject(obj, j6, obj2);
    }
}
