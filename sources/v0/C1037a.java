package v0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.e;

/* renamed from: v0.a  reason: case insensitive filesystem */
public abstract class C1037a {

    /* renamed from: a  reason: collision with root package name */
    public final e f12146a;

    /* renamed from: b  reason: collision with root package name */
    public final e f12147b;

    /* renamed from: c  reason: collision with root package name */
    public final e f12148c;

    public C1037a(e eVar, e eVar2, e eVar3) {
        this.f12146a = eVar;
        this.f12147b = eVar2;
        this.f12148c = eVar3;
    }

    public abstract C1038b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f12148c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        String name2 = cls.getPackage().getName();
        String simpleName = cls.getSimpleName();
        Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
        eVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        e eVar = this.f12146a;
        Method method = (Method) eVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<C1037a> cls = C1037a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        eVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f12147b;
        Method method = (Method) eVar.get(name);
        if (method != null) {
            return method;
        }
        Class b6 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b6.getDeclaredMethod("write", new Class[]{cls, C1037a.class});
        eVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final int f(int i2, int i5) {
        if (!e(i5)) {
            return i2;
        }
        return ((C1038b) this).f12149e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((C1038b) this).f12149e.readParcelable(C1038b.class.getClassLoader());
    }

    public final C1039c h() {
        String readString = ((C1038b) this).f12149e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (C1039c) c(readString).invoke((Object) null, new Object[]{a()});
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
        }
    }

    public abstract void i(int i2);

    public final void j(int i2, int i5) {
        i(i5);
        ((C1038b) this).f12149e.writeInt(i2);
    }

    public final void k(C1039c cVar) {
        if (cVar == null) {
            ((C1038b) this).f12149e.writeString((String) null);
            return;
        }
        try {
            ((C1038b) this).f12149e.writeString(b(cVar.getClass()).getName());
            C1038b a6 = a();
            try {
                d(cVar.getClass()).invoke((Object) null, new Object[]{cVar, a6});
                int i2 = a6.f12151i;
                if (i2 >= 0) {
                    int i5 = a6.d.get(i2);
                    Parcel parcel = a6.f12149e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (IllegalAccessException e6) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
            } catch (InvocationTargetException e7) {
                if (e7.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e7.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e8);
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e9);
            }
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }
}
