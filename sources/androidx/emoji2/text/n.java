package androidx.emoji2.text;

import V.a;
import java.nio.ByteBuffer;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public int f4942a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final q f4943b;

    /* renamed from: c  reason: collision with root package name */
    public q f4944c;
    public q d;

    /* renamed from: e  reason: collision with root package name */
    public int f4945e;

    /* renamed from: f  reason: collision with root package name */
    public int f4946f;

    public n(q qVar) {
        this.f4943b = qVar;
        this.f4944c = qVar;
    }

    public final void a() {
        this.f4942a = 1;
        this.f4944c = this.f4943b;
        this.f4946f = 0;
    }

    public final boolean b() {
        a c3 = this.f4944c.f4955b.c();
        int a6 = c3.a(6);
        if ((a6 == 0 || ((ByteBuffer) c3.d).get(a6 + c3.f1342a) == 0) && this.f4945e != 65039) {
            return false;
        }
        return true;
    }
}
