package G;

import I.c;
import java.util.Locale;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Locale[] f803a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f803a;
        int length = localeArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                int length2 = localeArr.length;
                int i5 = 0;
                while (i5 < length2) {
                    if (!localeArr[i5].equals(locale2)) {
                        i5++;
                    }
                }
                String c3 = c.c(c.a(c.b(locale)));
                if (!c3.isEmpty()) {
                    return c3.equals(c.c(c.a(c.b(locale2))));
                }
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            } else if (localeArr[i2].equals(locale)) {
                break;
            } else {
                i2++;
            }
        }
        return false;
    }
}
