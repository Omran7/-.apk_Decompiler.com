package okhttp3.internal.http;

import java.net.ProtocolException;
import okhttp3.Protocol;

public final class StatusLine {

    /* renamed from: a  reason: collision with root package name */
    public final Protocol f10758a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10759b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10760c;

    public StatusLine(Protocol protocol, int i2, String str) {
        this.f10758a = protocol;
        this.f10759b = i2;
        this.f10760c = str;
    }

    public static StatusLine a(String str) {
        int i2;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        Protocol protocol = Protocol.HTTP_1_0;
        if (startsWith) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i2 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i5 = i2 + 3;
        if (str.length() >= i5) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i5));
                if (str.length() <= i5) {
                    str2 = "";
                } else if (str.charAt(i5) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new StatusLine(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f10758a == Protocol.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f10759b);
        String str2 = this.f10760c;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        return sb.toString();
    }
}
