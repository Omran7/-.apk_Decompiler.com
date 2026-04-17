package S3;

import android.util.Log;
import h0.C0552a;
import java.util.Arrays;
import java.util.regex.Pattern;
import o3.d;

public final class C {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f2609a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2610b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2611c;

    public C(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            throw new IllegalArgumentException(C0552a.o("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f2609a = str3;
        this.f2610b = str;
        this.f2611c = d.g(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c3 = (C) obj;
        if (!this.f2609a.equals(c3.f2609a) || !this.f2610b.equals(c3.f2610b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2610b, this.f2609a});
    }
}
