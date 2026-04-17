package okhttp3;

import h0.C0552a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import okhttp3.internal.Util;

public final class Headers {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f10559a;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10560a = new ArrayList(20);

        public final void a(String str, String str2) {
            ArrayList arrayList = this.f10560a;
            arrayList.add(str);
            arrayList.add(str2.trim());
        }

        public final void b(String str) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f10560a;
                if (i2 < arrayList.size()) {
                    if (str.equalsIgnoreCase((String) arrayList.get(i2))) {
                        arrayList.remove(i2);
                        arrayList.remove(i2);
                        i2 -= 2;
                    }
                    i2 += 2;
                } else {
                    return;
                }
            }
        }

        public final void c(String str, String str2) {
            int i2 = 0;
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char charAt = str.charAt(i5);
                    if (charAt <= ' ' || charAt >= 127) {
                        Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i5), str};
                        byte[] bArr = Util.f10683a;
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    while (i2 < length2) {
                        char charAt2 = str2.charAt(i2);
                        if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                            i2++;
                        } else {
                            Object[] objArr2 = {Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2};
                            byte[] bArr2 = Util.f10683a;
                            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
                        }
                    }
                    b(str);
                    a(str, str2);
                    return;
                }
                throw new NullPointerException(C0552a.o("value for name ", str, " == null"));
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }
    }

    public Headers(Builder builder) {
        ArrayList arrayList = builder.f10560a;
        this.f10559a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String a(String str) {
        String[] strArr = this.f10559a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String b(int i2) {
        return this.f10559a[i2 * 2];
    }

    public final Builder c() {
        Builder builder = new Builder();
        Collections.addAll(builder.f10560a, this.f10559a);
        return builder;
    }

    public final int d() {
        return this.f10559a.length / 2;
    }

    public final String e(int i2) {
        return this.f10559a[(i2 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Headers) || !Arrays.equals(((Headers) obj).f10559a, this.f10559a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10559a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int d = d();
        for (int i2 = 0; i2 < d; i2++) {
            sb.append(b(i2));
            sb.append(": ");
            sb.append(e(i2));
            sb.append("\n");
        }
        return sb.toString();
    }
}
