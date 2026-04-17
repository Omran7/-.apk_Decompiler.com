package G;

import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class e {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, j jVar) {
        configuration.setLocales(jVar.f805a.f806a);
    }
}
