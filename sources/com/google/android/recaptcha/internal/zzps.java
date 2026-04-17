package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zzps {
    static final long zza = ((long) zzz(byte[].class));
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd = Memory.class;
    private static final boolean zze;
    private static final zzpr zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011a  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = zzg()
            zzc = r1
            int r2 = com.google.android.recaptcha.internal.zzks.zza
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            zzd = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = zzv(r2)
            zze = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = zzv(r4)
            r5 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            if (r3 == 0) goto L_0x0028
            com.google.android.recaptcha.internal.zzpq r5 = new com.google.android.recaptcha.internal.zzpq
            r5.<init>(r1)
            goto L_0x002f
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            com.google.android.recaptcha.internal.zzpp r5 = new com.google.android.recaptcha.internal.zzpp
            r5.<init>(r1)
        L_0x002f:
            zzf = r5
            java.lang.String r1 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.String r4 = "objectFieldOffset"
            r6 = 1
            r7 = 0
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            if (r5 != 0) goto L_0x003f
        L_0x003d:
            r2 = r7
            goto L_0x0061
        L_0x003f:
            sun.misc.Unsafe r5 = r5.zza
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x005c }
            java.lang.Class[] r9 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x005c }
            r5.getMethod(r4, r9)     // Catch:{ all -> 0x005c }
            java.lang.Class[] r2 = new java.lang.Class[]{r8, r2}     // Catch:{ all -> 0x005c }
            r5.getMethod(r1, r2)     // Catch:{ all -> 0x005c }
            java.lang.reflect.Field r2 = zzB()     // Catch:{ all -> 0x005c }
            if (r2 != 0) goto L_0x005a
            goto L_0x003d
        L_0x005a:
            r2 = r6
            goto L_0x0061
        L_0x005c:
            r2 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.recaptcha.internal.zzps.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
            goto L_0x003d
        L_0x0061:
            zzg = r2
            com.google.android.recaptcha.internal.zzpr r2 = zzf
            if (r2 != 0) goto L_0x0069
        L_0x0067:
            r0 = r7
            goto L_0x00c7
        L_0x0069:
            sun.misc.Unsafe r2 = r2.zza
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00c2 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r4, r3)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00c2 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r3, r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "getInt"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x00c2 }
            java.lang.Class[] r4 = new java.lang.Class[]{r8, r3}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r0, r4)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "putInt"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00c2 }
            java.lang.Class[] r4 = new java.lang.Class[]{r8, r3, r4}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r0, r4)     // Catch:{ all -> 0x00c2 }
            java.lang.Class[] r0 = new java.lang.Class[]{r8, r3}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "putLong"
            java.lang.Class[] r1 = new java.lang.Class[]{r8, r3, r3}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "getObject"
            java.lang.Class[] r1 = new java.lang.Class[]{r8, r3}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "putObject"
            java.lang.Class[] r1 = new java.lang.Class[]{r8, r3, r8}     // Catch:{ all -> 0x00c2 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00c2 }
            r0 = r6
            goto L_0x00c7
        L_0x00c2:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.recaptcha.internal.zzps.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x0067
        L_0x00c7:
            zzh = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = zzz(r0)
            long r0 = (long) r0
            zza = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<int[]> r0 = int[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<long[]> r0 = long[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<float[]> r0 = float[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<double[]> r0 = double[].class
            zzz(r0)
            zzA(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzz(r0)
            zzA(r0)
            java.lang.reflect.Field r0 = zzB()
            if (r0 == 0) goto L_0x0111
            com.google.android.recaptcha.internal.zzpr r1 = zzf
            if (r1 == 0) goto L_0x0111
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r0)
        L_0x0111:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r6 = r7
        L_0x011b:
            zzb = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzps.<clinit>():void");
    }

    private zzps() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i2 = zzks.zza;
        Class<Buffer> cls = Buffer.class;
        Field zzC = zzC(cls, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(cls, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzD(Object obj, long j6, byte b6) {
        zzpr zzpr = zzf;
        long j7 = -4 & j6;
        int i2 = zzpr.zza.getInt(obj, j7);
        int i5 = ((~((int) j6)) & 3) << 3;
        zzpr.zza.putInt(obj, j7, ((255 & b6) << i5) | (i2 & (~(255 << i5))));
    }

    /* access modifiers changed from: private */
    public static void zzE(Object obj, long j6, byte b6) {
        zzpr zzpr = zzf;
        long j7 = -4 & j6;
        int i2 = (((int) j6) & 3) << 3;
        zzpr.zza.putInt(obj, j7, ((255 & b6) << i2) | (zzpr.zza.getInt(obj, j7) & (~(255 << i2))));
    }

    public static double zza(Object obj, long j6) {
        return zzf.zza(obj, j6);
    }

    public static float zzb(Object obj, long j6) {
        return zzf.zzb(obj, j6);
    }

    public static int zzc(Object obj, long j6) {
        return zzf.zza.getInt(obj, j6);
    }

    public static long zzd(Object obj, long j6) {
        return zzf.zza.getLong(obj, j6);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static Object zzf(Object obj, long j6) {
        return zzf.zza.getObject(obj, j6);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzpo());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void zzm(Object obj, long j6, boolean z3) {
        zzf.zzc(obj, j6, z3);
    }

    public static void zzn(byte[] bArr, long j6, byte b6) {
        zzf.zzd(bArr, zza + j6, b6);
    }

    public static void zzo(Object obj, long j6, double d) {
        zzf.zze(obj, j6, d);
    }

    public static void zzp(Object obj, long j6, float f6) {
        zzf.zzf(obj, j6, f6);
    }

    public static void zzq(Object obj, long j6, int i2) {
        zzf.zza.putInt(obj, j6, i2);
    }

    public static void zzr(Object obj, long j6, long j7) {
        zzf.zza.putLong(obj, j6, j7);
    }

    public static void zzs(Object obj, long j6, Object obj2) {
        zzf.zza.putObject(obj, j6, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j6) {
        if (((byte) ((zzf.zza.getInt(obj, -4 & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j6) {
        if (((byte) ((zzf.zza.getInt(obj, -4 & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean zzv(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i2 = zzks.zza;
        try {
            Class cls3 = zzd;
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

    public static boolean zzw(Object obj, long j6) {
        return zzf.zzg(obj, j6);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
