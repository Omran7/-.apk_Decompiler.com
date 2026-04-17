package c4;

import Z3.d;
import Z3.p;
import e4.C0503c;
import g4.C0551a;
import h0.C0552a;
import h4.C0567b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f5644a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f5645b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5646c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5647e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f5648f;
    public final /* synthetic */ Method g;
    public final /* synthetic */ boolean h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ p f5649i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f5650j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C0551a f5651k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f5652l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f5653m;

    public i(String str, Field field, boolean z3, boolean z4, boolean z5, Method method, boolean z6, p pVar, d dVar, C0551a aVar, boolean z7, boolean z8) {
        this.f5648f = z5;
        this.g = method;
        this.h = z6;
        this.f5649i = pVar;
        this.f5650j = dVar;
        this.f5651k = aVar;
        this.f5652l = z7;
        this.f5653m = z8;
        this.f5644a = str;
        this.f5645b = field;
        this.f5646c = field.getName();
        this.d = z3;
        this.f5647e = z4;
    }

    public final void a(C0567b bVar, Object obj) {
        Object obj2;
        if (this.d) {
            Field field = this.f5645b;
            boolean z3 = this.f5648f;
            Method method = this.g;
            if (z3) {
                if (method == null) {
                    m.b(obj, field);
                } else {
                    m.b(obj, method);
                }
            }
            if (method != null) {
                try {
                    obj2 = method.invoke(obj, (Object[]) null);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException(C0552a.o("Accessor ", C0503c.d(method, false), " threw exception"), e6.getCause());
                }
            } else {
                obj2 = field.get(obj);
            }
            if (obj2 != obj) {
                bVar.n(this.f5644a);
                boolean z4 = this.h;
                p pVar = this.f5649i;
                if (!z4) {
                    pVar = new n(this.f5650j, pVar, this.f5651k.f8045b);
                }
                pVar.b(bVar, obj2);
            }
        }
    }
}
