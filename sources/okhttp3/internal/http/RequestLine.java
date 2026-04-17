package okhttp3.internal.http;

import okhttp3.HttpUrl;
import okhttp3.internal.Util;

public final class RequestLine {
    private RequestLine() {
    }

    public static String a(HttpUrl httpUrl) {
        String str = httpUrl.f10567i;
        int indexOf = str.indexOf(47, httpUrl.f10562a.length() + 3);
        String substring = str.substring(indexOf, Util.j(str, indexOf, str.length(), "?#"));
        String e6 = httpUrl.e();
        if (e6 == null) {
            return substring;
        }
        return substring + '?' + e6;
    }
}
