package n3;

import androidx.fragment.app.D;
import i3.C0588d;
import i3.p;
import v3.s;

public final class l implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public C0866g f10288a;

    /* renamed from: b  reason: collision with root package name */
    public p f10289b;

    /* renamed from: c  reason: collision with root package name */
    public D f10290c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public long f10291e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10292f;

    /* renamed from: p  reason: collision with root package name */
    public int f10293p;

    /* renamed from: q  reason: collision with root package name */
    public C0588d f10294q;

    /* renamed from: r  reason: collision with root package name */
    public long f10295r;

    /* renamed from: s  reason: collision with root package name */
    public s f10296s;

    /* renamed from: t  reason: collision with root package name */
    public s f10297t;

    /* renamed from: u  reason: collision with root package name */
    public s f10298u;

    public final int compareTo(Object obj) {
        int i2 = (this.f10291e > ((l) obj).f10291e ? 1 : (this.f10291e == ((l) obj).f10291e ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        return 1;
    }
}
