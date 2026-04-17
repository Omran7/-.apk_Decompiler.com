package n3;

import i3.C0588d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import q3.l;
import s3.C0964b;
import s3.C0965c;
import s3.C0969g;

/* renamed from: n3.f  reason: case insensitive filesystem */
public abstract class C0865f {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f10273a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public H f10274b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10275c = false;

    public abstract C0865f a(C0969g gVar);

    public abstract C0965c b(C0964b bVar, C0969g gVar);

    public abstract void c(C0588d dVar);

    public abstract void d(C0965c cVar);

    public abstract C0969g e();

    public abstract boolean f(C0865f fVar);

    public abstract boolean g(int i2);

    public final void h() {
        H h;
        int i2 = 0;
        boolean z3 = true;
        if (this.f10273a.compareAndSet(false, true) && (h = this.f10274b) != null) {
            synchronized (h.f10254a) {
                try {
                    List list = (List) h.f10254a.get(this);
                    int i5 = 0;
                    if (list != null) {
                        while (true) {
                            if (i5 >= list.size()) {
                                i5 = 0;
                                break;
                            } else if (list.get(i5) == this) {
                                list.remove(i5);
                                i5 = 1;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (list.isEmpty()) {
                            h.f10254a.remove(this);
                        }
                    }
                    if (i5 == 0) {
                        if (this.f10275c) {
                            z3 = false;
                        }
                    }
                    l.c(z3);
                    if (!e().b()) {
                        C0865f a6 = a(C0969g.a(e().f11538a));
                        List list2 = (List) h.f10254a.get(a6);
                        if (list2 != null) {
                            while (true) {
                                if (i2 >= list2.size()) {
                                    break;
                                } else if (list2.get(i2) == this) {
                                    list2.remove(i2);
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (list2.isEmpty()) {
                                h.f10254a.remove(a6);
                            }
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.f10274b = null;
        }
    }
}
