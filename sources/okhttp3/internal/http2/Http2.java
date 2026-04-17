package okhttp3.internal.http2;

import N5.g;
import h0.C0552a;
import java.io.IOException;
import java.util.Locale;
import okhttp3.internal.Util;

public final class Http2 {

    /* renamed from: a  reason: collision with root package name */
    public static final g f10806a = g.k("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f10807b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f10808c = new String[64];
    public static final String[] d = new String[256];

    static {
        int i2 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr = d;
            if (i5 >= strArr.length) {
                break;
            }
            byte[] bArr = Util.f10683a;
            strArr[i5] = String.format(Locale.US, "%8s", new Object[]{Integer.toBinaryString(i5)}).replace(' ', '0');
            i5++;
        }
        String[] strArr2 = f10808c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i6 = iArr[0];
        strArr2[i6 | 8] = C0552a.r(new StringBuilder(), strArr2[i6], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i7 = 0; i7 < 3; i7++) {
            int i8 = iArr2[i7];
            int i9 = iArr[0];
            String[] strArr3 = f10808c;
            int i10 = i9 | i8;
            strArr3[i10] = strArr3[i9] + '|' + strArr3[i8];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i9]);
            sb.append('|');
            strArr3[i10 | 8] = C0552a.r(sb, strArr3[i8], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f10808c;
            if (i2 < strArr4.length) {
                if (strArr4[i2] == null) {
                    strArr4[i2] = d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    private Http2() {
    }

    public static String a(boolean z3, int i2, int i5, byte b6, byte b7) {
        String str;
        String str2;
        String str3;
        String str4;
        String[] strArr = f10807b;
        if (b6 < strArr.length) {
            str = strArr[b6];
        } else {
            byte[] bArr = Util.f10683a;
            str = String.format(Locale.US, "0x%02x", new Object[]{Byte.valueOf(b6)});
        }
        if (b7 == 0) {
            str2 = "";
        } else {
            String[] strArr2 = d;
            if (!(b6 == 2 || b6 == 3)) {
                if (b6 == 4 || b6 == 6) {
                    if (b7 == 1) {
                        str2 = "ACK";
                    } else {
                        str2 = strArr2[b7];
                    }
                } else if (!(b6 == 7 || b6 == 8)) {
                    String[] strArr3 = f10808c;
                    if (b7 < strArr3.length) {
                        str4 = strArr3[b7];
                    } else {
                        str4 = strArr2[b7];
                    }
                    if (b6 == 5 && (4 & b7) != 0) {
                        str2 = str4.replace("HEADERS", "PUSH_PROMISE");
                    } else if (b6 != 0 || (b7 & 32) == 0) {
                        str2 = str4;
                    } else {
                        str2 = str4.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str2 = strArr2[b7];
        }
        if (z3) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        Object[] objArr = {str3, Integer.valueOf(i2), Integer.valueOf(i5), str, str2};
        byte[] bArr2 = Util.f10683a;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr);
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = Util.f10683a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) {
        byte[] bArr = Util.f10683a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
