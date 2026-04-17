package n3;

import l3.C0782a;

/* renamed from: n3.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0863d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0782a f10263b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10264c;

    public /* synthetic */ C0863d(C0782a aVar, String str, int i2) {
        this.f10262a = i2;
        this.f10263b = aVar;
        this.f10264c = str;
    }

    public final void run() {
        switch (this.f10262a) {
            case 0:
                this.f10263b.a(this.f10264c);
                return;
            default:
                this.f10263b.b(this.f10264c);
                return;
        }
    }
}
