package e4;

import com.bumptech.glide.c;
import h0.C0552a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: e4.c  reason: case insensitive filesystem */
public abstract class C0503c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f7669a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: e4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: e4.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: e4.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            e4.b r0 = new e4.b     // Catch:{ NoSuchMethodException -> 0x0006 }
            r0.<init>()     // Catch:{ NoSuchMethodException -> 0x0006 }
            goto L_0x000b
        L_0x0006:
            e4.a r0 = new e4.a
            r0.<init>()
        L_0x000b:
            f7669a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0503c.<clinit>():void");
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb) {
        Class[] clsArr;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            clsArr = ((Method) accessibleObject).getParameterTypes();
        } else {
            clsArr = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(clsArr[i2].getSimpleName());
        }
        sb.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb);
        return sb.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z3) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            a(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z3 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e6) {
            throw new RuntimeException(C0552a.o("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e6);
        }
    }
}
