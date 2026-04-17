package okhttp3.internal;

import N5.f;
import N5.g;
import N5.u;
import h0.C0552a;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;

public final class Util {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f10683a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f10684b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final ResponseBody f10685c;
    public static final g d = g.e("efbbbf");

    /* renamed from: e  reason: collision with root package name */
    public static final g f10686e = g.e("feff");

    /* renamed from: f  reason: collision with root package name */
    public static final g f10687f = g.e("fffe");
    public static final g g = g.e("0000ffff");
    public static final g h = g.e("ffff0000");

    /* renamed from: i  reason: collision with root package name */
    public static final Charset f10688i = Charset.forName("UTF-8");

    /* renamed from: j  reason: collision with root package name */
    public static final Charset f10689j = Charset.forName("UTF-16BE");

    /* renamed from: k  reason: collision with root package name */
    public static final Charset f10690k = Charset.forName("UTF-16LE");

    /* renamed from: l  reason: collision with root package name */
    public static final Charset f10691l = Charset.forName("UTF-32BE");

    /* renamed from: m  reason: collision with root package name */
    public static final Charset f10692m = Charset.forName("UTF-32LE");

    /* renamed from: n  reason: collision with root package name */
    public static final TimeZone f10693n = TimeZone.getTimeZone("GMT");

    /* renamed from: o  reason: collision with root package name */
    public static final Comparator f10694o = new Comparator<String>() {
        public final int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    };

    /* renamed from: p  reason: collision with root package name */
    public static final Method f10695p;

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f10696q = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        Class<Throwable> cls = Throwable.class;
        byte[] bArr = new byte[0];
        f10683a = bArr;
        f10685c = ResponseBody.j(bArr);
        Method method = null;
        RequestBody.c((MediaType) null, bArr);
        Charset.forName("ISO-8859-1");
        try {
            method = cls.getDeclaredMethod("addSuppressed", new Class[]{cls});
        } catch (Exception unused) {
        }
        f10695p = method;
    }

    private Util() {
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset b(f fVar, Charset charset) {
        g gVar = d;
        if (fVar.h(gVar)) {
            fVar.a((long) gVar.f1934a.length);
            return f10688i;
        }
        g gVar2 = f10686e;
        if (fVar.h(gVar2)) {
            fVar.a((long) gVar2.f1934a.length);
            return f10689j;
        }
        g gVar3 = f10687f;
        if (fVar.h(gVar3)) {
            fVar.a((long) gVar3.f1934a.length);
            return f10690k;
        }
        g gVar4 = g;
        if (fVar.h(gVar4)) {
            fVar.a((long) gVar4.f1934a.length);
            return f10691l;
        }
        g gVar5 = h;
        if (!fVar.h(gVar5)) {
            return charset;
        }
        fVar.a((long) gVar5.f1934a.length);
        return f10692m;
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [N5.d, java.lang.Object] */
    public static String c(String str) {
        InetAddress inetAddress;
        int i2 = -1;
        int i5 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = h(0, str.length(), str);
            } else {
                inetAddress = h(1, str.length() - 1, str);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i6 = 0;
                int i7 = 0;
                while (i6 < address.length) {
                    int i8 = i6;
                    while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                        i8 += 2;
                    }
                    int i9 = i8 - i6;
                    if (i9 > i7 && i9 >= 4) {
                        i2 = i6;
                        i7 = i9;
                    }
                    i6 = i8 + 2;
                }
                ? obj = new Object();
                while (i5 < address.length) {
                    if (i5 == i2) {
                        obj.A(58);
                        i5 += i7;
                        if (i5 == 16) {
                            obj.A(58);
                        }
                    } else {
                        if (i5 > 0) {
                            obj.A(58);
                        }
                        obj.B((long) (((address[i5] & 255) << 8) | (address[i5 + 1] & 255)));
                        i5 += 2;
                    }
                }
                return obj.u();
            }
            throw new AssertionError(C0552a.o("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            while (i5 < lowerCase.length()) {
                char charAt = lowerCase.charAt(i5);
                if (charAt > 31) {
                    if (charAt < 127) {
                        if (" #%/:?@[\\]".indexOf(charAt) == -1) {
                            i5++;
                        }
                    }
                }
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int d(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(70);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout too large.");
            } else if (millis != 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException("timeout too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static void f(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e6) {
                if (!p(e6)) {
                    throw e6;
                }
            } catch (RuntimeException e7) {
                if (!"bio == null".equals(e7.getMessage())) {
                    throw e7;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static int g(char c3) {
        if (c3 >= '0' && c3 <= '9') {
            return c3 - '0';
        }
        if (c3 >= 'a' && c3 <= 'f') {
            return c3 - 'W';
        }
        if (c3 < 'A' || c3 > 'F') {
            return -1;
        }
        return c3 - '7';
    }

    public static InetAddress h(int i2, int i5, String str) {
        int i6;
        int i7 = i5;
        String str2 = str;
        int i8 = 16;
        byte[] bArr = new byte[16];
        int i9 = 0;
        int i10 = i2;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            if (i10 >= i7) {
                i6 = i8;
                break;
            } else if (i11 == i8) {
                return null;
            } else {
                int i14 = i10 + 2;
                if (i14 > i7 || !str2.regionMatches(i10, "::", i9, 2)) {
                    if (i11 != 0) {
                        if (str2.regionMatches(i10, ":", i9, 1)) {
                            i10++;
                        } else if (!str2.regionMatches(i10, ".", i9, 1)) {
                            return null;
                        } else {
                            int i15 = i11 - 2;
                            int i16 = i15;
                            loop1:
                            while (true) {
                                if (i13 < i7) {
                                    if (i16 == i8) {
                                        break;
                                    }
                                    if (i16 != i15) {
                                        if (str2.charAt(i13) != '.') {
                                            break;
                                        }
                                        i13++;
                                    }
                                    int i17 = i9;
                                    int i18 = i13;
                                    while (true) {
                                        if (i18 < i7) {
                                            char charAt = str2.charAt(i18);
                                            if (charAt >= '0' && charAt <= '9') {
                                                if ((i17 == 0 && i13 != i18) || (i17 = ((i17 * 10) + charAt) - 48) > 255) {
                                                    break loop1;
                                                }
                                                i18++;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    if (i18 - i13 == 0) {
                                        break;
                                    }
                                    bArr[i16] = (byte) i17;
                                    i16++;
                                    i13 = i18;
                                    i8 = 16;
                                    i9 = 0;
                                } else if (i16 == i11 + 2) {
                                    i11 += 2;
                                    i6 = 16;
                                }
                            }
                            return null;
                        }
                    }
                    i13 = i10;
                } else if (i12 != -1) {
                    return null;
                } else {
                    i11 += 2;
                    if (i14 == i7) {
                        i6 = i8;
                        i12 = i11;
                        break;
                    }
                    i12 = i11;
                    i13 = i14;
                }
                i10 = i13;
                int i19 = 0;
                while (i10 < i7) {
                    int g5 = g(str2.charAt(i10));
                    if (g5 == -1) {
                        break;
                    }
                    i19 = (i19 << 4) + g5;
                    i10++;
                }
                int i20 = i10 - i13;
                if (i20 == 0 || i20 > 4) {
                    return null;
                }
                int i21 = i11 + 1;
                bArr[i11] = (byte) ((i19 >>> 8) & 255);
                i11 += 2;
                bArr[i21] = (byte) (i19 & 255);
                i8 = 16;
                i9 = 0;
            }
        }
        if (i11 != i6) {
            if (i12 == -1) {
                return null;
            }
            int i22 = i11 - i12;
            System.arraycopy(bArr, i12, bArr, 16 - i22, i22);
            Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int i(String str, int i2, int i5, char c3) {
        while (i2 < i5) {
            if (str.charAt(i2) == c3) {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    public static int j(String str, int i2, int i5, String str2) {
        while (i2 < i5) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static String l(HttpUrl httpUrl, boolean z3) {
        boolean contains = httpUrl.d.contains(":");
        String str = httpUrl.d;
        if (contains) {
            str = C0552a.o("[", str, "]");
        }
        int i2 = httpUrl.f10565e;
        if (!z3 && i2 == HttpUrl.b(httpUrl.f10562a)) {
            return str;
        }
        return str + ":" + i2;
    }

    public static List m(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List n(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] o(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean p(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    public static boolean q(Comparator comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [N5.d, java.lang.Object] */
    public static boolean r(u uVar, int i2, TimeUnit timeUnit) {
        long j6;
        long nanoTime = System.nanoTime();
        if (uVar.b().e()) {
            j6 = uVar.b().c() - nanoTime;
        } else {
            j6 = Long.MAX_VALUE;
        }
        uVar.b().d(Math.min(j6, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            ? obj = new Object();
            while (uVar.e(8192, obj) != -1) {
                obj.c();
            }
            if (j6 == Long.MAX_VALUE) {
                uVar.b().a();
                return true;
            }
            uVar.b().d(nanoTime + j6);
            return true;
        } catch (InterruptedIOException unused) {
            if (j6 == Long.MAX_VALUE) {
                uVar.b().a();
                return false;
            }
            uVar.b().d(nanoTime + j6);
            return false;
        } catch (Throwable th) {
            if (j6 == Long.MAX_VALUE) {
                uVar.b().a();
            } else {
                uVar.b().d(nanoTime + j6);
            }
            throw th;
        }
    }

    public static int s(int i2, int i5, String str) {
        while (i2 < i5) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i5;
    }

    public static int t(int i2, int i5, String str) {
        for (int i6 = i5 - 1; i6 >= i2; i6--) {
            char charAt = str.charAt(i6);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i6 + 1;
            }
        }
        return i2;
    }

    public static ThreadFactory u(final String str, final boolean z3) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z3);
                return thread;
            }
        };
    }

    public static Headers v(ArrayList arrayList) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Header header = (Header) it2.next();
            Internal.f10681a.b(builder, header.f10791a.A(), header.f10792b.A());
        }
        return new Headers(builder);
    }
}
