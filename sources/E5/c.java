package E5;

import G5.r0;
import java.util.Iterator;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f657a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f658b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f657a = i2;
        this.f658b = obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Iterator, E5.e, java.lang.Object, o5.d] */
    public final Iterator iterator() {
        switch (this.f657a) {
            case 0:
                return new b(this);
            case 1:
                ? obj = new Object();
                obj.f661c = ((r0) this.f658b).create(obj, obj);
                return obj;
            default:
                return (Iterator) this.f658b;
        }
    }
}
