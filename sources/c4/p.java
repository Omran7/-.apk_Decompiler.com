package c4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

public final class p implements PrivilegedAction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f5668a;

    public p(Class cls) {
        this.f5668a = cls;
    }

    public final Object run() {
        Field[] declaredFields = this.f5668a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
