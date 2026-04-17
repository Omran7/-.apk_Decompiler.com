package T1;

import java.util.concurrent.Callable;

public final class B0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2805b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f2806c;
    public final /* synthetic */ String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ D0 f2807e;

    public /* synthetic */ B0(D0 d02, String str, String str2, String str3, int i2) {
        this.f2804a = i2;
        this.f2805b = str;
        this.f2806c = str2;
        this.d = str3;
        this.f2807e = d02;
    }

    public final Object call() {
        switch (this.f2804a) {
            case 0:
                D0 d02 = this.f2807e;
                d02.f2818a.j();
                C0191n nVar = d02.f2818a.f3062c;
                T1.L(nVar);
                return nVar.x(this.f2805b, this.f2806c, this.d);
            case 1:
                D0 d03 = this.f2807e;
                d03.f2818a.j();
                C0191n nVar2 = d03.f2818a.f3062c;
                T1.L(nVar2);
                return nVar2.x(this.f2805b, this.f2806c, this.d);
            case 2:
                D0 d04 = this.f2807e;
                d04.f2818a.j();
                C0191n nVar3 = d04.f2818a.f3062c;
                T1.L(nVar3);
                return nVar3.t(this.f2805b, this.f2806c, this.d);
            default:
                D0 d05 = this.f2807e;
                d05.f2818a.j();
                C0191n nVar4 = d05.f2818a.f3062c;
                T1.L(nVar4);
                return nVar4.t(this.f2805b, this.f2806c, this.d);
        }
    }
}
