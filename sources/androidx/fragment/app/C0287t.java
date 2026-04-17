package androidx.fragment.app;

import J.a;
import android.content.Intent;
import android.content.res.Configuration;

/* renamed from: androidx.fragment.app.t  reason: case insensitive filesystem */
public final /* synthetic */ class C0287t implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0289v f5191b;

    public /* synthetic */ C0287t(C0289v vVar, int i2) {
        this.f5190a = i2;
        this.f5191b = vVar;
    }

    public final void accept(Object obj) {
        switch (this.f5190a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                this.f5191b.f5197C.l();
                return;
            default:
                Intent intent = (Intent) obj;
                this.f5191b.f5197C.l();
                return;
        }
    }
}
