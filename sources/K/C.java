package K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public final class C implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public v0 f1345a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1346b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0076p f1347c;

    public C(View view, C0076p pVar) {
        this.f1346b = view;
        this.f1347c = pVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v0 g = v0.g(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        C0076p pVar = this.f1347c;
        if (i2 < 30) {
            D.a(windowInsets, this.f1346b);
            if (g.equals(this.f1345a)) {
                return pVar.b(view, g).f();
            }
        }
        this.f1345a = g;
        v0 b6 = pVar.b(view, g);
        if (i2 >= 30) {
            return b6.f();
        }
        WeakHashMap weakHashMap = O.f1352a;
        B.c(view);
        return b6.f();
    }
}
