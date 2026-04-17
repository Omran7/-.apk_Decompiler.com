package K;

import G1.h;
import Q.r;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import x1.i;

public final class L implements OnReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0077q f1348a;

    public L(C0077q qVar) {
        this.f1348a = qVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0066f fVar = new C0066f(new i(contentInfo));
        C0066f a6 = ((r) this.f1348a).a(view, fVar);
        if (a6 == null) {
            return null;
        }
        if (a6 == fVar) {
            return contentInfo;
        }
        ContentInfo p6 = a6.f1383a.p();
        Objects.requireNonNull(p6);
        return h.i(p6);
    }
}
