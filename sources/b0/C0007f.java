package B0;

import F0.r;
import F0.s;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import z0.C1130f;

/* renamed from: B0.f  reason: case insensitive filesystem */
public final class C0007f implements j, d {

    /* renamed from: a  reason: collision with root package name */
    public final List f216a;

    /* renamed from: b  reason: collision with root package name */
    public final k f217b;

    /* renamed from: c  reason: collision with root package name */
    public final C0010i f218c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public C1130f f219e;

    /* renamed from: f  reason: collision with root package name */
    public List f220f;

    /* renamed from: p  reason: collision with root package name */
    public int f221p;

    /* renamed from: q  reason: collision with root package name */
    public volatile r f222q;

    /* renamed from: r  reason: collision with root package name */
    public File f223r;

    public C0007f(List list, k kVar, C0010i iVar) {
        this.f216a = list;
        this.f217b = kVar;
        this.f218c = iVar;
    }

    public final void a(Exception exc) {
        this.f218c.e(this.f219e, exc, this.f222q.f706c, 3);
    }

    public final boolean b() {
        while (true) {
            List list = this.f220f;
            boolean z3 = false;
            if (list == null || this.f221p >= list.size()) {
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 >= this.f216a.size()) {
                    return false;
                }
                C1130f fVar = (C1130f) this.f216a.get(this.d);
                k kVar = this.f217b;
                File a6 = kVar.h.a().a(new C0008g(fVar, kVar.f240n));
                this.f223r = a6;
                if (a6 != null) {
                    this.f219e = fVar;
                    this.f220f = this.f217b.f232c.a().f(a6);
                    this.f221p = 0;
                }
            } else {
                this.f222q = null;
                while (!z3 && this.f221p < this.f220f.size()) {
                    List list2 = this.f220f;
                    int i5 = this.f221p;
                    this.f221p = i5 + 1;
                    File file = this.f223r;
                    k kVar2 = this.f217b;
                    this.f222q = ((s) list2.get(i5)).a(file, kVar2.f233e, kVar2.f234f, kVar2.f235i);
                    if (!(this.f222q == null || this.f217b.c(this.f222q.f706c.b()) == null)) {
                        this.f222q.f706c.f(this.f217b.f241o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
        }
    }

    public final void cancel() {
        r rVar = this.f222q;
        if (rVar != null) {
            rVar.f706c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f218c.a(this.f219e, obj, this.f222q.f706c, 3, this.f219e);
    }
}
