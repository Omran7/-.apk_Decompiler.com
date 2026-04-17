package n5;

import com.bumptech.glide.c;
import h0.C0552a;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* renamed from: n5.b  reason: case insensitive filesystem */
public final class C0870b extends C0871c implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final C0871c f10390a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10391b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10392c;

    public C0870b(C0871c cVar, int i2, int i5) {
        j.e(cVar, "list");
        this.f10390a = cVar;
        this.f10391b = i2;
        c.g(i2, i5, cVar.k());
        this.f10392c = i5 - i2;
    }

    public final Object get(int i2) {
        int i5 = this.f10392c;
        if (i2 < 0 || i2 >= i5) {
            throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, i5, ", size: "));
        }
        return this.f10390a.get(this.f10391b + i2);
    }

    public final int k() {
        return this.f10392c;
    }
}
