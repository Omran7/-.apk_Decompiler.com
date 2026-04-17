package K;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f1398a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f1399b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f1400c;
    public static final boolean d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f1398a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f1399b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f1400c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e6.getMessage(), e6);
        }
    }
}
