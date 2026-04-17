package okhttp3;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;

public final class Cookie {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f10538j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f10539k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f10540l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f10541m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f10542a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10543b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10544c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10545e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10546f;
    public final boolean g;
    public final boolean h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10547i;

    public static final class Builder {
    }

    public Cookie(String str, String str2, long j6, String str3, String str4, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f10542a = str;
        this.f10543b = str2;
        this.f10544c = j6;
        this.d = str3;
        this.f10545e = str4;
        this.f10546f = z3;
        this.g = z4;
        this.f10547i = z5;
        this.h = z6;
    }

    public static int a(int i2, int i5, String str, boolean z3) {
        boolean z4;
        while (i2 < i5) {
            char charAt = str.charAt(i2);
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4 == (!z3)) {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    public static long b(int i2, String str) {
        int a6 = a(0, i2, str, false);
        Pattern pattern = f10541m;
        Matcher matcher = pattern.matcher(str);
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        while (a6 < i2) {
            int a7 = a(a6 + 1, i2, str, true);
            matcher.region(a6, a7);
            if (i6 == -1 && matcher.usePattern(pattern).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
                i9 = Integer.parseInt(matcher.group(2));
                i10 = Integer.parseInt(matcher.group(3));
            } else if (i7 != -1 || !matcher.usePattern(f10540l).matches()) {
                if (i8 == -1) {
                    Pattern pattern2 = f10539k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i8 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i5 == -1 && matcher.usePattern(f10538j).matches()) {
                    i5 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i7 = Integer.parseInt(matcher.group(1));
            }
            a6 = a(a7 + 1, i2, str, false);
        }
        if (i5 >= 70 && i5 <= 99) {
            i5 += 1900;
        }
        if (i5 >= 0 && i5 <= 69) {
            i5 += 2000;
        }
        if (i5 < 1601) {
            throw new IllegalArgumentException();
        } else if (i8 == -1) {
            throw new IllegalArgumentException();
        } else if (i7 < 1 || i7 > 31) {
            throw new IllegalArgumentException();
        } else if (i6 < 0 || i6 > 23) {
            throw new IllegalArgumentException();
        } else if (i9 < 0 || i9 > 59) {
            throw new IllegalArgumentException();
        } else if (i10 < 0 || i10 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f10693n);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i5);
            gregorianCalendar.set(2, i8 - 1);
            gregorianCalendar.set(5, i7);
            gregorianCalendar.set(11, i6);
            gregorianCalendar.set(12, i9);
            gregorianCalendar.set(13, i10);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        if (cookie.f10542a.equals(this.f10542a) && cookie.f10543b.equals(this.f10543b) && cookie.d.equals(this.d) && cookie.f10545e.equals(this.f10545e) && cookie.f10544c == this.f10544c && cookie.f10546f == this.f10546f && cookie.g == this.g && cookie.h == this.h && cookie.f10547i == this.f10547i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10543b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.f10545e.hashCode();
        long j6 = this.f10544c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.f10542a.hashCode() + 527) * 31)) * 31)) * 31)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f10546f ^ true ? 1 : 0)) * 31) + (this.g ^ true ? 1 : 0)) * 31) + (this.h ^ true ? 1 : 0)) * 31) + (this.f10547i ^ true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10542a);
        sb.append('=');
        sb.append(this.f10543b);
        if (this.h) {
            long j6 = this.f10544c;
            if (j6 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) HttpDate.f10742a.get()).format(new Date(j6)));
            }
        }
        if (!this.f10547i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f10545e);
        if (this.f10546f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
