package k;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: k.r0  reason: case insensitive filesystem */
public abstract class C0735r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f9367a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f9367a = field;
    }
}
