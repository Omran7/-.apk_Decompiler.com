package androidx.activity;

import java.util.ListIterator;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import m5.C0849h;
import n5.C0873e;
import x5.l;

public final class t extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B f4667b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(B b6, int i2) {
        super(1);
        this.f4666a = i2;
        this.f4667b = b6;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4666a) {
            case 0:
                j.e((C0267b) obj, "backEvent");
                B b6 = this.f4667b;
                C0873e eVar = b6.f4600b;
                ListIterator listIterator = eVar.listIterator(eVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((C) obj2).f4604a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C c3 = (C) obj2;
                if (b6.f4601c != null) {
                    b6.c();
                }
                b6.f4601c = c3;
                return C0849h.f10203c;
            default:
                j.e((C0267b) obj, "backEvent");
                B b7 = this.f4667b;
                if (b7.f4601c == null) {
                    C0873e eVar2 = b7.f4600b;
                    ListIterator listIterator2 = eVar2.listIterator(eVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((C) obj3).f4604a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    C c6 = (C) obj3;
                }
                return C0849h.f10203c;
        }
    }
}
