package x0;

import S3.r;
import T1.C0186l0;
import android.os.Build;
import android.os.StrictMode;
import j4.p0;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final File f12511a;

    /* renamed from: b  reason: collision with root package name */
    public final File f12512b;

    /* renamed from: c  reason: collision with root package name */
    public final File f12513c;
    public final File d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12514e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12515f;

    /* renamed from: p  reason: collision with root package name */
    public final int f12516p;

    /* renamed from: q  reason: collision with root package name */
    public long f12517q = 0;

    /* renamed from: r  reason: collision with root package name */
    public BufferedWriter f12518r;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashMap f12519s = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: t  reason: collision with root package name */
    public int f12520t;

    /* renamed from: u  reason: collision with root package name */
    public long f12521u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final ThreadPoolExecutor f12522v = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Object());

    /* renamed from: w  reason: collision with root package name */
    public final C0186l0 f12523w = new C0186l0(this, 4);

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public c(File file, long j6) {
        File file2 = file;
        this.f12511a = file2;
        this.f12514e = 1;
        this.f12512b = new File(file2, "journal");
        this.f12513c = new File(file2, "journal.tmp");
        this.d = new File(file2, "journal.bkp");
        this.f12516p = 1;
        this.f12515f = j6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(x0.c r9, S3.r r10, boolean r11) {
        /*
            monitor-enter(r9)
            java.lang.Object r0 = r10.f2694b     // Catch:{ all -> 0x002d }
            x0.b r0 = (x0.b) r0     // Catch:{ all -> 0x002d }
            S3.r r1 = r0.f12510f     // Catch:{ all -> 0x002d }
            if (r1 != r10) goto L_0x00f7
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f12509e     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0011:
            int r3 = r9.f12516p     // Catch:{ all -> 0x002d }
            if (r2 >= r3) goto L_0x004d
            java.lang.Object r3 = r10.f2695c     // Catch:{ all -> 0x002d }
            boolean[] r3 = (boolean[]) r3     // Catch:{ all -> 0x002d }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0033
            java.io.File[] r3 = r0.d     // Catch:{ all -> 0x002d }
            r3 = r3[r2]     // Catch:{ all -> 0x002d }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0030
            r10.a()     // Catch:{ all -> 0x002d }
            monitor-exit(r9)
            goto L_0x00f6
        L_0x002d:
            r10 = move-exception
            goto L_0x00fd
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0033:
            r10.a()     // Catch:{ all -> 0x002d }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r11.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x002d }
            r11.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x002d }
            r10.<init>(r11)     // Catch:{ all -> 0x002d }
            throw r10     // Catch:{ all -> 0x002d }
        L_0x004d:
            int r10 = r9.f12516p     // Catch:{ all -> 0x002d }
            if (r1 >= r10) goto L_0x007d
            java.io.File[] r10 = r0.d     // Catch:{ all -> 0x002d }
            r10 = r10[r1]     // Catch:{ all -> 0x002d }
            if (r11 == 0) goto L_0x0077
            boolean r2 = r10.exists()     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x007a
            java.io.File[] r2 = r0.f12508c     // Catch:{ all -> 0x002d }
            r2 = r2[r1]     // Catch:{ all -> 0x002d }
            r10.renameTo(r2)     // Catch:{ all -> 0x002d }
            long[] r10 = r0.f12507b     // Catch:{ all -> 0x002d }
            r3 = r10[r1]     // Catch:{ all -> 0x002d }
            long r5 = r2.length()     // Catch:{ all -> 0x002d }
            long[] r10 = r0.f12507b     // Catch:{ all -> 0x002d }
            r10[r1] = r5     // Catch:{ all -> 0x002d }
            long r7 = r9.f12517q     // Catch:{ all -> 0x002d }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f12517q = r7     // Catch:{ all -> 0x002d }
            goto L_0x007a
        L_0x0077:
            j(r10)     // Catch:{ all -> 0x002d }
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x007d:
            int r10 = r9.f12520t     // Catch:{ all -> 0x002d }
            r1 = 1
            int r10 = r10 + r1
            r9.f12520t = r10     // Catch:{ all -> 0x002d }
            r10 = 0
            r0.f12510f = r10     // Catch:{ all -> 0x002d }
            boolean r10 = r0.f12509e     // Catch:{ all -> 0x002d }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bc
            r0.f12509e = r1     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            r10.append(r3)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r0.f12506a     // Catch:{ all -> 0x002d }
            r10.append(r1)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x002d }
            r10.append(r0)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            r10.append(r2)     // Catch:{ all -> 0x002d }
            if (r11 == 0) goto L_0x00db
            long r10 = r9.f12521u     // Catch:{ all -> 0x002d }
            r0 = 1
            long r10 = r10 + r0
            r9.f12521u = r10     // Catch:{ all -> 0x002d }
            goto L_0x00db
        L_0x00bc:
            java.util.LinkedHashMap r10 = r9.f12519s     // Catch:{ all -> 0x002d }
            java.lang.String r11 = r0.f12506a     // Catch:{ all -> 0x002d }
            r10.remove(r11)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            r10.append(r3)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            java.lang.String r11 = r0.f12506a     // Catch:{ all -> 0x002d }
            r10.append(r11)     // Catch:{ all -> 0x002d }
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            r10.append(r2)     // Catch:{ all -> 0x002d }
        L_0x00db:
            java.io.BufferedWriter r10 = r9.f12518r     // Catch:{ all -> 0x002d }
            l(r10)     // Catch:{ all -> 0x002d }
            long r10 = r9.f12517q     // Catch:{ all -> 0x002d }
            long r0 = r9.f12515f     // Catch:{ all -> 0x002d }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ee
            boolean r10 = r9.n()     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x00f5
        L_0x00ee:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f12522v     // Catch:{ all -> 0x002d }
            T1.l0 r11 = r9.f12523w     // Catch:{ all -> 0x002d }
            r10.submit(r11)     // Catch:{ all -> 0x002d }
        L_0x00f5:
            monitor-exit(r9)
        L_0x00f6:
            return
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            r10.<init>()     // Catch:{ all -> 0x002d }
            throw r10     // Catch:{ all -> 0x002d }
        L_0x00fd:
            monitor-exit(r9)     // Catch:{ all -> 0x002d }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.c.c(x0.c, S3.r, boolean):void");
    }

    public static void d(BufferedWriter bufferedWriter) {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void j(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void l(BufferedWriter bufferedWriter) {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static c o(File file, long j6) {
        if (j6 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    t(file2, file3, false);
                }
            }
            c cVar = new c(file, j6);
            if (cVar.f12512b.exists()) {
                try {
                    cVar.q();
                    cVar.p();
                    return cVar;
                } catch (IOException e6) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                    cVar.close();
                    f.a(cVar.f12511a);
                }
            }
            file.mkdirs();
            c cVar2 = new c(file, j6);
            cVar2.s();
            return cVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void t(File file, File file2, boolean z3) {
        if (z3) {
            j(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized void close() {
        try {
            if (this.f12518r != null) {
                Iterator it2 = new ArrayList(this.f12519s.values()).iterator();
                while (it2.hasNext()) {
                    r rVar = ((b) it2.next()).f12510f;
                    if (rVar != null) {
                        rVar.a();
                    }
                }
                u();
                d(this.f12518r);
                this.f12518r = null;
            }
        } finally {
            while (true) {
            }
        }
    }

    public final r k(String str) {
        synchronized (this) {
            try {
                if (this.f12518r != null) {
                    b bVar = (b) this.f12519s.get(str);
                    if (bVar == null) {
                        bVar = new b(this, str);
                        this.f12519s.put(str, bVar);
                    } else if (bVar.f12510f != null) {
                        return null;
                    }
                    r rVar = new r(this, bVar);
                    bVar.f12510f = rVar;
                    this.f12518r.append("DIRTY");
                    this.f12518r.append(' ');
                    this.f12518r.append(str);
                    this.f12518r.append(10);
                    l(this.f12518r);
                    return rVar;
                }
                throw new IllegalStateException("cache is closed");
            } finally {
            }
        }
    }

    public final synchronized p0 m(String str) {
        if (this.f12518r != null) {
            b bVar = (b) this.f12519s.get(str);
            if (bVar == null) {
                return null;
            }
            if (!bVar.f12509e) {
                return null;
            }
            for (File exists : bVar.f12508c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f12520t++;
            this.f12518r.append("READ");
            this.f12518r.append(' ');
            this.f12518r.append(str);
            this.f12518r.append(10);
            if (n()) {
                this.f12522v.submit(this.f12523w);
            }
            return new p0(bVar.f12508c, 26);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean n() {
        int i2 = this.f12520t;
        if (i2 < 2000 || i2 < this.f12519s.size()) {
            return false;
        }
        return true;
    }

    public final void p() {
        j(this.f12513c);
        Iterator it2 = this.f12519s.values().iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            r rVar = bVar.f12510f;
            int i2 = this.f12516p;
            int i5 = 0;
            if (rVar == null) {
                while (i5 < i2) {
                    this.f12517q += bVar.f12507b[i5];
                    i5++;
                }
            } else {
                bVar.f12510f = null;
                while (i5 < i2) {
                    j(bVar.f12508c[i5]);
                    j(bVar.d[i5]);
                    i5++;
                }
                it2.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:17|18|(1:20)(1:21)|(3:22|23|36)) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10.f12520t = r0 - r10.f12519s.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (r2.f12528e == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r10.f12518r = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r4, true), x0.f.f12529a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0063 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0063=Splitter:B:17:0x0063, B:27:0x008f=Splitter:B:27:0x008f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r10 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            x0.e r2 = new x0.e
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r10.f12512b
            r3.<init>(r4)
            java.nio.charset.Charset r5 = x0.f.f12529a
            r2.<init>(r3, r5)
            java.lang.String r3 = r2.c()     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = r2.c()     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r2.c()     // Catch:{ all -> 0x0061 }
            java.lang.String r7 = r2.c()     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = r2.c()     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = "libcore.io.DiskLruCache"
            boolean r9 = r9.equals(r3)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x008f
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r5)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x008f
            int r9 = r10.f12514e     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x0061 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x008f
            int r6 = r10.f12516p     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0061 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x008f
            java.lang.String r6 = ""
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x008f
            r0 = 0
        L_0x0057:
            java.lang.String r1 = r2.c()     // Catch:{ EOFException -> 0x0063 }
            r10.r(r1)     // Catch:{ EOFException -> 0x0063 }
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0061:
            r0 = move-exception
            goto L_0x00b8
        L_0x0063:
            java.util.LinkedHashMap r1 = r10.f12519s     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            int r0 = r0 - r1
            r10.f12520t = r0     // Catch:{ all -> 0x0061 }
            int r0 = r2.f12528e     // Catch:{ all -> 0x0061 }
            r1 = -1
            if (r0 != r1) goto L_0x0075
            r10.s()     // Catch:{ all -> 0x0061 }
            goto L_0x0089
        L_0x0075:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0061 }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0061 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0061 }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0061 }
            java.nio.charset.Charset r4 = x0.f.f12529a     // Catch:{ all -> 0x0061 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0061 }
            r0.<init>(r1)     // Catch:{ all -> 0x0061 }
            r10.f12518r = r0     // Catch:{ all -> 0x0061 }
        L_0x0089:
            r2.close()     // Catch:{ RuntimeException -> 0x008d, Exception -> 0x008c }
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            throw r0
        L_0x008f:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r6.<init>(r1)     // Catch:{ all -> 0x0061 }
            r6.append(r3)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            r6.append(r5)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            r6.append(r7)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            r6.append(r8)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0061 }
            r4.<init>(r0)     // Catch:{ all -> 0x0061 }
            throw r4     // Catch:{ all -> 0x0061 }
        L_0x00b8:
            r2.close()     // Catch:{ RuntimeException -> 0x00bc, Exception -> 0x00bb }
        L_0x00bb:
            throw r0
        L_0x00bc:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.c.q():void");
    }

    public final void r(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            LinkedHashMap linkedHashMap = this.f12519s;
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            b bVar = (b) linkedHashMap.get(str2);
            if (bVar == null) {
                bVar = new b(this, str2);
                linkedHashMap.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f12509e = true;
                bVar.f12510f = null;
                if (split.length == bVar.g.f12516p) {
                    int i5 = 0;
                    while (i5 < split.length) {
                        try {
                            bVar.f12507b[i5] = Long.parseLong(split[i5]);
                            i5++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f12510f = new r(this, bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        d(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void s() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.io.BufferedWriter r0 = r6.f12518r     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0008
            d(r0)     // Catch:{ all -> 0x00bd }
        L_0x0008:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bd }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bd }
            java.io.File r3 = r6.f12513c     // Catch:{ all -> 0x00bd }
            r2.<init>(r3)     // Catch:{ all -> 0x00bd }
            java.nio.charset.Charset r3 = x0.f.f12529a     // Catch:{ all -> 0x00bd }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x00bd }
            r0.<init>(r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            int r1 = r6.f12514e     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0086 }
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            int r1 = r6.f12516p     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0086 }
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap r1 = r6.f12519s     // Catch:{ all -> 0x0086 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0086 }
        L_0x005a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x00a9
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0086 }
            x0.b r2 = (x0.b) r2     // Catch:{ all -> 0x0086 }
            S3.r r3 = r2.f12510f     // Catch:{ all -> 0x0086 }
            r4 = 10
            if (r3 == 0) goto L_0x0088
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r3.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r2.f12506a     // Catch:{ all -> 0x0086 }
            r3.append(r2)     // Catch:{ all -> 0x0086 }
            r3.append(r4)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0086 }
            r0.write(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x005a
        L_0x0086:
            r1 = move-exception
            goto L_0x00e3
        L_0x0088:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r3.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "CLEAN "
            r3.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = r2.f12506a     // Catch:{ all -> 0x0086 }
            r3.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r2.a()     // Catch:{ all -> 0x0086 }
            r3.append(r2)     // Catch:{ all -> 0x0086 }
            r3.append(r4)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0086 }
            r0.write(r2)     // Catch:{ all -> 0x0086 }
            goto L_0x005a
        L_0x00a9:
            d(r0)     // Catch:{ all -> 0x00bd }
            java.io.File r0 = r6.f12512b     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00bd }
            r1 = 1
            if (r0 == 0) goto L_0x00bf
            java.io.File r0 = r6.f12512b     // Catch:{ all -> 0x00bd }
            java.io.File r2 = r6.d     // Catch:{ all -> 0x00bd }
            t(r0, r2, r1)     // Catch:{ all -> 0x00bd }
            goto L_0x00bf
        L_0x00bd:
            r0 = move-exception
            goto L_0x00e7
        L_0x00bf:
            java.io.File r0 = r6.f12513c     // Catch:{ all -> 0x00bd }
            java.io.File r2 = r6.f12512b     // Catch:{ all -> 0x00bd }
            r3 = 0
            t(r0, r2, r3)     // Catch:{ all -> 0x00bd }
            java.io.File r0 = r6.d     // Catch:{ all -> 0x00bd }
            r0.delete()     // Catch:{ all -> 0x00bd }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bd }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bd }
            java.io.File r4 = r6.f12512b     // Catch:{ all -> 0x00bd }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00bd }
            java.nio.charset.Charset r1 = x0.f.f12529a     // Catch:{ all -> 0x00bd }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00bd }
            r0.<init>(r2)     // Catch:{ all -> 0x00bd }
            r6.f12518r = r0     // Catch:{ all -> 0x00bd }
            monitor-exit(r6)
            return
        L_0x00e3:
            d(r0)     // Catch:{ all -> 0x00bd }
            throw r1     // Catch:{ all -> 0x00bd }
        L_0x00e7:
            monitor-exit(r6)     // Catch:{ all -> 0x00bd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.c.s():void");
    }

    public final void u() {
        while (this.f12517q > this.f12515f) {
            String str = (String) ((Map.Entry) this.f12519s.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f12518r != null) {
                        b bVar = (b) this.f12519s.get(str);
                        if (bVar != null) {
                            if (bVar.f12510f == null) {
                                for (int i2 = 0; i2 < this.f12516p; i2++) {
                                    File file = bVar.f12508c[i2];
                                    if (file.exists()) {
                                        if (!file.delete()) {
                                            throw new IOException("failed to delete " + file);
                                        }
                                    }
                                    long j6 = this.f12517q;
                                    long[] jArr = bVar.f12507b;
                                    this.f12517q = j6 - jArr[i2];
                                    jArr[i2] = 0;
                                }
                                this.f12520t++;
                                this.f12518r.append("REMOVE");
                                this.f12518r.append(' ');
                                this.f12518r.append(str);
                                this.f12518r.append(10);
                                this.f12519s.remove(str);
                                if (n()) {
                                    this.f12522v.submit(this.f12523w);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("cache is closed");
                    }
                } finally {
                }
            }
        }
    }
}
