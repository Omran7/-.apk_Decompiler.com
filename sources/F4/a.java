package F4;

import R2.b;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.C0431a;
import l4.C0796d;

public final class a implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f785a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f786b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f785a = i2;
        this.f786b = obj;
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.f785a) {
            case 0:
                b bVar = (b) this.f786b;
                C0269a aVar = new C0269a(bVar.p());
                aVar.h(bVar);
                aVar.e(false);
                return;
            case 1:
                ((MainActivity) this.f786b).f6991R.setVisibility(8);
                return;
            case 2:
                C0431a aVar2 = (C0431a) this.f786b;
                float f6 = aVar2.f7387b;
                int i2 = (f6 > 10.0f ? 1 : (f6 == 10.0f ? 0 : -1));
                ImageView imageView = aVar2.f7386a;
                if (i2 > 0) {
                    b.J0(imageView, f6 - 10.0f);
                    return;
                } else {
                    imageView.clearAnimation();
                    return;
                }
            default:
                ((C0796d) this.f786b).f9767b.f9785F0.setVisibility(4);
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        int i2 = this.f785a;
    }

    public final void onAnimationStart(Animation animation) {
        int i2 = this.f785a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }

    private final void f(Animation animation) {
    }

    private final void g(Animation animation) {
    }

    private final void h(Animation animation) {
    }
}
