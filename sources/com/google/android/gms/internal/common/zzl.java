package com.google.android.gms.internal.common;

public final class zzl {
    public static Object zza(Class cls, String str, zzj... zzjArr) {
        return zzc(cls, "isIsolated", (Object) null, false, zzjArr);
    }

    public static Object zzb(String str, String str2, ClassLoader classLoader, zzj... zzjArr) {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", (Object) null, false, zzjArr);
    }

    private static Object zzc(Class cls, String str, Object obj, boolean z3, zzj... zzjArr) {
        int length = zzjArr.length;
        Class[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i2 = 0; i2 < zzjArr.length; i2++) {
            zzj zzj = zzjArr[i2];
            zzj.getClass();
            clsArr[i2] = zzj.zzc();
            objArr[i2] = zzjArr[i2].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke((Object) null, objArr);
    }
}
