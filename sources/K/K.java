package K;

import G1.h;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import x1.i;

public abstract class K {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0066f b(View view, C0066f fVar) {
        ContentInfo p6 = fVar.f1383a.p();
        Objects.requireNonNull(p6);
        ContentInfo i2 = h.i(p6);
        ContentInfo performReceiveContent = view.performReceiveContent(i2);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == i2) {
            return fVar;
        }
        return new C0066f(new i(performReceiveContent));
    }

    public static void c(View view, String[] strArr, C0077q qVar) {
        if (qVar == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new L(qVar));
        }
    }
}
