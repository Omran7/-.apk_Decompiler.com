package J1;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.measurement.a;
import java.lang.reflect.Field;

public final class b extends zzb implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1293a;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f1293a = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.common.zza, J1.a] */
    public static a a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object b(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f1293a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i2 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 == 1) {
            I.g(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e6) {
                    throw new IllegalArgumentException("Binder object is null.", e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(a.f(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
    }
}
