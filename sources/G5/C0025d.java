package G5;

import kotlin.jvm.internal.j;

/* renamed from: G5.d  reason: case insensitive filesystem */
public final class C0025d implements C0037j {

    /* renamed from: a  reason: collision with root package name */
    public final C0023c[] f901a;

    public C0025d(C0023c[] cVarArr) {
        this.f901a = cVarArr;
    }

    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        C0023c[] cVarArr = this.f901a;
        int length = cVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            P p6 = cVarArr[i2].f899f;
            if (p6 != null) {
                p6.e();
                i2++;
            } else {
                j.g("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f901a + ']';
    }
}
