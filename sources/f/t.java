package f;

import G.j;
import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class t {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static j b(Configuration configuration) {
        return j.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(j jVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(jVar.f805a.f806a.toLanguageTags()));
    }

    public static void d(Configuration configuration, j jVar) {
        configuration.setLocales(LocaleList.forLanguageTags(jVar.f805a.f806a.toLanguageTags()));
    }
}
