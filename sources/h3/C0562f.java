package h3;

import B.m;
import com.mtma.criminal.city.utils.K;
import java.util.concurrent.Callable;

/* renamed from: h3.f  reason: case insensitive filesystem */
public final /* synthetic */ class C0562f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0563g f8135a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f8136b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K f8137c;

    public /* synthetic */ C0562f(C0563g gVar, Callable callable, K k6) {
        this.f8135a = gVar;
        this.f8136b = callable;
        this.f8137c = k6;
    }

    public final Object call() {
        C0563g gVar = this.f8135a;
        gVar.getClass();
        return gVar.f8138a.submit(new m(this.f8136b, this.f8137c, 13));
    }
}
