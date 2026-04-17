package i3;

import S3.r;
import n3.C0865f;

public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8291a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0865f f8292b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f8293c;

    public /* synthetic */ m(r rVar, C0865f fVar, int i2) {
        this.f8291a = i2;
        this.f8293c = rVar;
        this.f8292b = fVar;
    }

    public final void run() {
        switch (this.f8291a) {
            case 0:
                ((n3.m) this.f8293c.f2694b).m(this.f8292b);
                return;
            default:
                ((n3.m) this.f8293c.f2694b).e(this.f8292b);
                return;
        }
    }
}
