package r0;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: r0.f  reason: case insensitive filesystem */
public final class C0945f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f11160b;

    public /* synthetic */ C0945f(SwipeRefreshLayout swipeRefreshLayout, int i2) {
        this.f11159a = i2;
        this.f11160b = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        j jVar;
        switch (this.f11159a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f11160b;
                if (swipeRefreshLayout.f5433c) {
                    swipeRefreshLayout.f5420I.setAlpha(255);
                    swipeRefreshLayout.f5420I.start();
                    if (swipeRefreshLayout.f5425N && (jVar = swipeRefreshLayout.f5432b) != null) {
                        jVar.a();
                    }
                    swipeRefreshLayout.f5443w = swipeRefreshLayout.f5415C.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f11160b;
                swipeRefreshLayout2.getClass();
                g gVar = new g(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.f5422K = gVar;
                gVar.setDuration(150);
                C0940a aVar = swipeRefreshLayout2.f5415C;
                aVar.f11127a = null;
                aVar.clearAnimation();
                swipeRefreshLayout2.f5415C.startAnimation(swipeRefreshLayout2.f5422K);
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        int i2 = this.f11159a;
    }

    public final void onAnimationStart(Animation animation) {
        int i2 = this.f11159a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
