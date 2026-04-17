package C1;

import android.util.Log;
import java.util.Locale;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f430a;

    /* renamed from: b  reason: collision with root package name */
    public final String f431b;

    /* renamed from: c  reason: collision with root package name */
    public final int f432c;

    public a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f431b = str2;
        this.f430a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length <= 23) {
            int i2 = 2;
            while (i2 <= 7 && !Log.isLoggable(this.f430a, i2)) {
                i2++;
            }
            this.f432c = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public final void a(String str, Object... objArr) {
        if (this.f432c <= 3) {
            Log.d(this.f430a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f430a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f430a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f431b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f432c <= 2) {
            Log.v(this.f430a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f430a, d(str, objArr));
    }
}
