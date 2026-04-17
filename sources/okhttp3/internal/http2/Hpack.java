package okhttp3.internal.http2;

import N5.d;
import N5.g;
import N5.n;
import N5.p;
import N5.u;
import com.google.android.gms.common.api.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;
import okhttp3.internal.http2.Huffman;

final class Hpack {

    /* renamed from: a  reason: collision with root package name */
    public static final Header[] f10794a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f10795b;

    public static final class Reader {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10796a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final p f10797b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10798c = 4096;
        public int d = 4096;

        /* renamed from: e  reason: collision with root package name */
        public Header[] f10799e = new Header[8];

        /* renamed from: f  reason: collision with root package name */
        public int f10800f = 7;
        public int g = 0;
        public int h = 0;

        public Reader(u uVar) {
            Logger logger = n.f1948a;
            this.f10797b = new p(uVar);
        }

        public final int a(int i2) {
            int i5;
            int i6 = 0;
            if (i2 > 0) {
                int length = this.f10799e.length;
                while (true) {
                    length--;
                    i5 = this.f10800f;
                    if (length < i5 || i2 <= 0) {
                        Header[] headerArr = this.f10799e;
                        System.arraycopy(headerArr, i5 + 1, headerArr, i5 + 1 + i6, this.g);
                        this.f10800f += i6;
                    } else {
                        int i7 = this.f10799e[length].f10793c;
                        i2 -= i7;
                        this.h -= i7;
                        this.g--;
                        i6++;
                    }
                }
                Header[] headerArr2 = this.f10799e;
                System.arraycopy(headerArr2, i5 + 1, headerArr2, i5 + 1 + i6, this.g);
                this.f10800f += i6;
            }
            return i6;
        }

        public final g b(int i2) {
            if (i2 >= 0) {
                Header[] headerArr = Hpack.f10794a;
                if (i2 <= headerArr.length - 1) {
                    return headerArr[i2].f10791a;
                }
            }
            int length = this.f10800f + 1 + (i2 - Hpack.f10794a.length);
            if (length >= 0) {
                Header[] headerArr2 = this.f10799e;
                if (length < headerArr2.length) {
                    return headerArr2[length].f10791a;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        public final void c(Header header) {
            this.f10796a.add(header);
            int i2 = this.d;
            int i5 = header.f10793c;
            if (i5 > i2) {
                Arrays.fill(this.f10799e, (Object) null);
                this.f10800f = this.f10799e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i5) - i2);
            int i6 = this.g + 1;
            Header[] headerArr = this.f10799e;
            if (i6 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f10800f = this.f10799e.length - 1;
                this.f10799e = headerArr2;
            }
            int i7 = this.f10800f;
            this.f10800f = i7 - 1;
            this.f10799e[i7] = header;
            this.g++;
            this.h += i5;
        }

        public final g d() {
            boolean z3;
            int i2;
            p pVar = this.f10797b;
            byte j6 = pVar.j();
            byte b6 = j6 & 255;
            if ((j6 & 128) == 128) {
                z3 = true;
            } else {
                z3 = false;
            }
            int e6 = e(b6, 127);
            if (!z3) {
                return pVar.k((long) e6);
            }
            Huffman huffman = Huffman.d;
            long j7 = (long) e6;
            pVar.q(j7);
            byte[] n2 = pVar.f1952a.n(j7);
            huffman.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Huffman.Node node = huffman.f10902a;
            Huffman.Node node2 = node;
            byte b7 = 0;
            int i5 = 0;
            for (byte b8 : n2) {
                b7 = (b7 << 8) | (b8 & 255);
                i5 += 8;
                while (i5 >= 8) {
                    node2 = node2.f10903a[(b7 >>> (i5 - 8)) & 255];
                    if (node2.f10903a == null) {
                        byteArrayOutputStream.write(node2.f10904b);
                        i5 -= node2.f10905c;
                        node2 = node;
                    } else {
                        i5 -= 8;
                    }
                }
            }
            while (i5 > 0) {
                Huffman.Node node3 = node2.f10903a[(b7 << (8 - i5)) & 255];
                if (node3.f10903a != null || (i2 = node3.f10905c) > i5) {
                    break;
                }
                byteArrayOutputStream.write(node3.f10904b);
                i5 -= i2;
                node2 = node;
            }
            return g.t(byteArrayOutputStream.toByteArray());
        }

        public final int e(int i2, int i5) {
            int i6 = i2 & i5;
            if (i6 < i5) {
                return i6;
            }
            int i7 = 0;
            while (true) {
                byte j6 = this.f10797b.j();
                byte b6 = j6 & 255;
                if ((j6 & 128) == 0) {
                    return i5 + (b6 << i7);
                }
                i5 += (j6 & Byte.MAX_VALUE) << i7;
                i7 += 7;
            }
        }
    }

    public static final class Writer {

        /* renamed from: a  reason: collision with root package name */
        public final d f10801a;

        /* renamed from: b  reason: collision with root package name */
        public int f10802b = f.API_PRIORITY_OTHER;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10803c;
        public int d = 4096;

        /* renamed from: e  reason: collision with root package name */
        public Header[] f10804e = new Header[8];

        /* renamed from: f  reason: collision with root package name */
        public int f10805f = 7;
        public int g = 0;
        public int h = 0;

        public Writer(d dVar) {
            this.f10801a = dVar;
        }

        public final void a(int i2) {
            int i5;
            if (i2 > 0) {
                int length = this.f10804e.length - 1;
                int i6 = 0;
                while (true) {
                    i5 = this.f10805f;
                    if (length < i5 || i2 <= 0) {
                        Header[] headerArr = this.f10804e;
                        int i7 = i5 + 1;
                        System.arraycopy(headerArr, i7, headerArr, i7 + i6, this.g);
                        Header[] headerArr2 = this.f10804e;
                        int i8 = this.f10805f + 1;
                        Arrays.fill(headerArr2, i8, i8 + i6, (Object) null);
                        this.f10805f += i6;
                    } else {
                        int i9 = this.f10804e[length].f10793c;
                        i2 -= i9;
                        this.h -= i9;
                        this.g--;
                        i6++;
                        length--;
                    }
                }
                Header[] headerArr3 = this.f10804e;
                int i72 = i5 + 1;
                System.arraycopy(headerArr3, i72, headerArr3, i72 + i6, this.g);
                Header[] headerArr22 = this.f10804e;
                int i82 = this.f10805f + 1;
                Arrays.fill(headerArr22, i82, i82 + i6, (Object) null);
                this.f10805f += i6;
            }
        }

        public final void b(Header header) {
            int i2 = this.d;
            int i5 = header.f10793c;
            if (i5 > i2) {
                Arrays.fill(this.f10804e, (Object) null);
                this.f10805f = this.f10804e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i5) - i2);
            int i6 = this.g + 1;
            Header[] headerArr = this.f10804e;
            if (i6 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f10805f = this.f10804e.length - 1;
                this.f10804e = headerArr2;
            }
            int i7 = this.f10805f;
            this.f10805f = i7 - 1;
            this.f10804e[i7] = header;
            this.g++;
            this.h += i5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: byte} */
        /* JADX WARNING: type inference failed for: r4v5, types: [N5.d, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(N5.g r14) {
            /*
                r13 = this;
                N5.d r0 = r13.f10801a
                okhttp3.internal.http2.Huffman r1 = okhttp3.internal.http2.Huffman.d
                r1.getClass()
                r1 = 0
                r2 = 0
                r4 = r1
                r5 = r2
            L_0x000c:
                int r7 = r14.x()
                r8 = 255(0xff, float:3.57E-43)
                if (r4 >= r7) goto L_0x0022
                byte r7 = r14.m(r4)
                r7 = r7 & r8
                byte[] r8 = okhttp3.internal.http2.Huffman.f10901c
                byte r7 = r8[r7]
                long r7 = (long) r7
                long r5 = r5 + r7
                int r4 = r4 + 1
                goto L_0x000c
            L_0x0022:
                r9 = 7
                long r5 = r5 + r9
                r4 = 3
                long r4 = r5 >> r4
                int r4 = (int) r4
                int r5 = r14.x()
                r6 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L_0x0081
                N5.d r4 = new N5.d
                r4.<init>()
                okhttp3.internal.http2.Huffman r5 = okhttp3.internal.http2.Huffman.d
                r5.getClass()
                r9 = r2
                r2 = r1
            L_0x003d:
                int r3 = r14.x()
                if (r1 >= r3) goto L_0x0064
                byte r3 = r14.m(r1)
                r3 = r3 & r8
                int[] r5 = okhttp3.internal.http2.Huffman.f10900b
                r5 = r5[r3]
                byte[] r7 = okhttp3.internal.http2.Huffman.f10901c
                byte r3 = r7[r3]
                long r9 = r9 << r3
                long r11 = (long) r5
                long r9 = r9 | r11
                int r2 = r2 + r3
            L_0x0054:
                r3 = 8
                if (r2 < r3) goto L_0x0061
                int r2 = r2 + -8
                long r11 = r9 >> r2
                int r3 = (int) r11
                r4.A(r3)
                goto L_0x0054
            L_0x0061:
                int r1 = r1 + 1
                goto L_0x003d
            L_0x0064:
                if (r2 <= 0) goto L_0x0071
                int r14 = 8 - r2
                long r9 = r9 << r14
                int r14 = r8 >>> r2
                long r1 = (long) r14
                long r1 = r1 | r9
                int r14 = (int) r1
                r4.A(r14)
            L_0x0071:
                N5.g r14 = r4.o()
                byte[] r1 = r14.f1934a
                int r1 = r1.length
                r2 = 128(0x80, float:1.794E-43)
                r13.d(r1, r6, r2)
                r14.B(r0)
                goto L_0x008b
            L_0x0081:
                int r2 = r14.x()
                r13.d(r2, r6, r1)
                r14.B(r0)
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.c(N5.g):void");
        }

        public final void d(int i2, int i5, int i6) {
            d dVar = this.f10801a;
            if (i2 < i5) {
                dVar.A(i2 | i6);
                return;
            }
            dVar.A(i6 | i5);
            int i7 = i2 - i5;
            while (i7 >= 128) {
                dVar.A(128 | (i7 & 127));
                i7 >>>= 7;
            }
            dVar.A(i7);
        }
    }

    static {
        Header header = r1;
        Header header2 = new Header(Header.f10790i, "");
        Header header3 = r2;
        g gVar = Header.f10789f;
        Header header4 = new Header(gVar, "GET");
        Header header5 = r4;
        Header header6 = new Header(gVar, "POST");
        Header header7 = r4;
        g gVar2 = Header.g;
        Header header8 = new Header(gVar2, "/");
        Header header9 = r6;
        Header header10 = new Header(gVar2, "/index.html");
        Header header11 = r6;
        g gVar3 = Header.h;
        Header header12 = new Header(gVar3, "http");
        Header header13 = r8;
        Header header14 = new Header(gVar3, "https");
        Header header15 = r8;
        g gVar4 = Header.f10788e;
        Header header16 = new Header(gVar4, "200");
        Header header17 = r9;
        Header header18 = new Header(gVar4, "204");
        Header header19 = r10;
        Header header20 = new Header(gVar4, "206");
        Header header21 = r11;
        Header header22 = new Header(gVar4, "304");
        Header header23 = r12;
        Header header24 = new Header(gVar4, "400");
        Header header25 = r13;
        Header header26 = header;
        Header header27 = new Header(gVar4, "404");
        Header header28 = r0;
        Header header29 = header3;
        Header header30 = new Header(gVar4, "500");
        Header header31 = r0;
        Header header32 = new Header("accept-charset", "");
        String str = "";
        Header header33 = r0;
        Header header34 = new Header("accept-encoding", "gzip, deflate");
        Header header35 = r0;
        Header header36 = new Header("accept-language", str);
        Header header37 = r0;
        Header header38 = new Header("accept-ranges", str);
        Header header39 = r0;
        Header header40 = new Header("accept", str);
        Header header41 = r0;
        Header header42 = new Header("access-control-allow-origin", str);
        Header header43 = r0;
        Header header44 = new Header("age", str);
        Header header45 = r0;
        Header header46 = new Header("allow", str);
        Header header47 = r0;
        Header header48 = new Header("authorization", str);
        Header header49 = r0;
        Header header50 = new Header("cache-control", str);
        Header header51 = r0;
        Header header52 = new Header("content-disposition", str);
        Header header53 = r0;
        Header header54 = new Header("content-encoding", str);
        Header header55 = r0;
        Header header56 = new Header("content-language", str);
        Header header57 = r0;
        Header header58 = new Header("content-length", str);
        Header header59 = r0;
        Header header60 = new Header("content-location", str);
        Header header61 = r0;
        Header header62 = new Header("content-range", str);
        Header header63 = r0;
        Header header64 = new Header("content-type", str);
        Header header65 = r0;
        Header header66 = new Header("cookie", str);
        Header header67 = r0;
        Header header68 = new Header("date", str);
        Header header69 = r0;
        Header header70 = new Header("etag", str);
        Header header71 = r0;
        Header header72 = new Header("expect", str);
        Header header73 = r0;
        Header header74 = new Header("expires", str);
        Header header75 = r0;
        Header header76 = new Header("from", str);
        Header header77 = r0;
        Header header78 = new Header("host", str);
        Header header79 = r0;
        Header header80 = new Header("if-match", str);
        Header header81 = r0;
        Header header82 = new Header("if-modified-since", str);
        Header header83 = r0;
        Header header84 = new Header("if-none-match", str);
        Header header85 = r0;
        Header header86 = new Header("if-range", str);
        Header header87 = r0;
        Header header88 = new Header("if-unmodified-since", str);
        Header header89 = r0;
        Header header90 = new Header("last-modified", str);
        Header header91 = r0;
        Header header92 = new Header("link", str);
        Header header93 = r0;
        Header header94 = new Header("location", str);
        Header header95 = r0;
        Header header96 = new Header("max-forwards", str);
        Header header97 = r0;
        Header header98 = new Header("proxy-authenticate", str);
        Header header99 = r0;
        Header header100 = new Header("proxy-authorization", str);
        Header header101 = r0;
        Header header102 = new Header("range", str);
        Header header103 = r0;
        Header header104 = new Header("referer", str);
        Header header105 = r0;
        Header header106 = new Header("refresh", str);
        Header header107 = r0;
        Header header108 = new Header("retry-after", str);
        Header header109 = r0;
        Header header110 = new Header("server", str);
        Header header111 = r0;
        Header header112 = new Header("set-cookie", str);
        Header header113 = r0;
        Header header114 = new Header("strict-transport-security", str);
        Header header115 = r0;
        Header header116 = new Header("transfer-encoding", str);
        Header header117 = r0;
        Header header118 = new Header("user-agent", str);
        Header header119 = r0;
        Header header120 = new Header("vary", str);
        Header header121 = r0;
        Header header122 = new Header("via", str);
        Header header123 = r0;
        Header header124 = new Header("www-authenticate", str);
        Header[] headerArr = {header26, header29, header5, header7, header9, header11, header13, header15, header17, header19, header21, header23, header25, header28, header31, header33, header35, header37, header39, header41, header43, header45, header47, header49, header51, header53, header55, header57, header59, header61, header63, header65, header67, header69, header71, header73, header75, header77, header79, header81, header83, header85, header87, header89, header91, header93, header95, header97, header99, header101, header103, header105, header107, header109, header111, header113, header115, header117, header119, header121, header123};
        f10794a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        for (int i2 = 0; i2 < headerArr.length; i2++) {
            if (!linkedHashMap.containsKey(headerArr[i2].f10791a)) {
                linkedHashMap.put(headerArr[i2].f10791a, Integer.valueOf(i2));
            }
        }
        f10795b = Collections.unmodifiableMap(linkedHashMap);
    }

    private Hpack() {
    }

    public static void a(g gVar) {
        int x6 = gVar.x();
        int i2 = 0;
        while (i2 < x6) {
            byte m6 = gVar.m(i2);
            if (m6 < 65 || m6 > 90) {
                i2++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + gVar.A());
            }
        }
    }
}
