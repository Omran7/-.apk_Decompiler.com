package z;

import android.app.LocaleManager;
import android.os.LocaleList;

public abstract class i {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
