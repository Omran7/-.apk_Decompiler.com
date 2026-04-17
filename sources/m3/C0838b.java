package m3;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m3.b  reason: case insensitive filesystem */
public final class C0838b extends Reader {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10158a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10159b;

    /* renamed from: c  reason: collision with root package name */
    public int f10160c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f10161e;

    /* renamed from: f  reason: collision with root package name */
    public int f10162f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10163p;

    public C0838b() {
        this.f10158a = null;
        this.f10159b = false;
        this.f10161e = this.f10160c;
        this.f10162f = this.d;
        this.f10163p = false;
        this.f10158a = new ArrayList();
    }

    public final long c(long j6) {
        int i2;
        long j7 = 0;
        while (this.d < this.f10158a.size() && j7 < j6) {
            String j8 = j();
            if (j8 == null) {
                i2 = 0;
            } else {
                i2 = j8.length() - this.f10160c;
            }
            long j9 = j6 - j7;
            long j10 = (long) i2;
            if (j9 < j10) {
                this.f10160c = (int) (((long) this.f10160c) + j9);
                j7 += j9;
            } else {
                j7 += j10;
                this.f10160c = 0;
                this.d++;
            }
        }
        return j7;
    }

    public final void close() {
        d();
        this.f10159b = true;
    }

    public final void d() {
        if (this.f10159b) {
            throw new IOException("Stream already closed");
        } else if (!this.f10163p) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    public final String j() {
        int i2 = this.d;
        ArrayList arrayList = this.f10158a;
        if (i2 < arrayList.size()) {
            return (String) arrayList.get(this.d);
        }
        return null;
    }

    public final void mark(int i2) {
        d();
        this.f10161e = this.f10160c;
        this.f10162f = this.d;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read(CharBuffer charBuffer) {
        d();
        int remaining = charBuffer.remaining();
        String j6 = j();
        int i2 = 0;
        while (remaining > 0 && j6 != null) {
            int min = Math.min(j6.length() - this.f10160c, remaining);
            int i5 = this.f10160c;
            charBuffer.put((String) this.f10158a.get(this.d), i5, i5 + min);
            remaining -= min;
            i2 += min;
            c((long) min);
            j6 = j();
        }
        if (i2 > 0 || j6 != null) {
            return i2;
        }
        return -1;
    }

    public final boolean ready() {
        d();
        return true;
    }

    public final void reset() {
        this.f10160c = this.f10161e;
        this.d = this.f10162f;
    }

    public final long skip(long j6) {
        d();
        return c(j6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = this.f10158a.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
        return sb.toString();
    }

    public final int read() {
        d();
        String j6 = j();
        if (j6 == null) {
            return -1;
        }
        char charAt = j6.charAt(this.f10160c);
        c(1);
        return charAt;
    }

    public final int read(char[] cArr, int i2, int i5) {
        int i6;
        d();
        String j6 = j();
        int i7 = 0;
        while (j6 != null && i7 < i5) {
            String j7 = j();
            if (j7 == null) {
                i6 = 0;
            } else {
                i6 = j7.length() - this.f10160c;
            }
            int min = Math.min(i6, i5 - i7);
            int i8 = this.f10160c;
            j6.getChars(i8, i8 + min, cArr, i2 + i7);
            i7 += min;
            c((long) min);
            j6 = j();
        }
        if (i7 > 0 || j6 != null) {
            return i7;
        }
        return -1;
    }
}
