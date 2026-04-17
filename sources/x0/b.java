package x0;

import S3.r;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12506a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f12507b;

    /* renamed from: c  reason: collision with root package name */
    public final File[] f12508c;
    public final File[] d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12509e;

    /* renamed from: f  reason: collision with root package name */
    public r f12510f;
    public final /* synthetic */ c g;

    public b(c cVar, String str) {
        this.g = cVar;
        this.f12506a = str;
        int i2 = cVar.f12516p;
        this.f12507b = new long[i2];
        this.f12508c = new File[i2];
        this.d = new File[i2];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i5 = 0; i5 < cVar.f12516p; i5++) {
            sb.append(i5);
            File[] fileArr = this.f12508c;
            String sb2 = sb.toString();
            File file = cVar.f12511a;
            fileArr[i5] = new File(file, sb2);
            sb.append(".tmp");
            this.d[i5] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.f12507b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }
}
