package okhttp3;

import h0.C0552a;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f10573c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f10574a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10575b;

    public MediaType(String str, String str2) {
        this.f10574a = str;
        this.f10575b = str2;
    }

    public static MediaType a(String str) {
        Matcher matcher = f10573c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Locale locale = Locale.US;
            group.toLowerCase(locale);
            matcher.group(2).toLowerCase(locale);
            Matcher matcher2 = d.matcher(str);
            int end = matcher.end();
            String str2 = null;
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group2 = matcher2.group(1);
                    if (group2 != null && group2.equalsIgnoreCase("charset")) {
                        String group3 = matcher2.group(2);
                        if (group3 == null) {
                            group3 = matcher2.group(3);
                        } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                            group3 = group3.substring(1, group3.length() - 1);
                        }
                        if (str2 == null || group3.equalsIgnoreCase(str2)) {
                            str2 = group3;
                        } else {
                            StringBuilder u6 = C0552a.u("Multiple charsets defined: \"", str2, "\" and: \"", group3, "\" for: \"");
                            u6.append(str);
                            u6.append('\"');
                            throw new IllegalArgumentException(u6.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
                }
            }
            return new MediaType(str, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MediaType) || !((MediaType) obj).f10574a.equals(this.f10574a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10574a.hashCode();
    }

    public final String toString() {
        return this.f10574a;
    }
}
