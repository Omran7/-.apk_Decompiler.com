package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzhe {
    public static zzgw zzb(Class cls) {
        String str;
        Class<zzhe> cls2 = zzhe.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(zzgw.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = cls.getPackage().getName() + ".BlazeGenerated" + cls.getSimpleName() + "Loader";
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (zzgw) cls.cast(((zzhe) Class.forName(str, true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null)).zza());
        } catch (NoSuchMethodException e6) {
            throw new IllegalStateException(e6);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException(e8);
        } catch (InvocationTargetException e9) {
            throw new IllegalStateException(e9);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it2 = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                try {
                    arrayList.add((zzgw) cls.cast(((zzhe) it2.next()).zza()));
                } catch (ServiceConfigurationError e10) {
                    Logger.getLogger(zzgr.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), e10);
                }
            }
            if (arrayList.size() == 1) {
                return (zzgw) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzgw) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException(e11);
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public abstract zzgw zza();
}
