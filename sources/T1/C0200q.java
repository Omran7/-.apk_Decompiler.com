package T1;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o3.d;

/* renamed from: T1.q  reason: case insensitive filesystem */
public final class C0200q extends E0 {

    /* renamed from: c  reason: collision with root package name */
    public long f3433c;
    public String d;

    public final boolean p() {
        Calendar instance = Calendar.getInstance();
        this.f3433c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.d = d.g(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long s() {
        q();
        return this.f3433c;
    }

    public final String t() {
        q();
        return this.d;
    }
}
