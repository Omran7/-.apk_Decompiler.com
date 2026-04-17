package R0;

import Q0.c;
import Q0.f;
import U0.g;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.mtma.criminal.city.R;
import java.util.ArrayList;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f2458b;

    /* renamed from: c  reason: collision with root package name */
    public final f f2459c;
    public Animatable d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f2460e;

    public b(ImageView imageView, int i2) {
        this.f2460e = i2;
        g.c(imageView, "Argument must not be null");
        this.f2458b = imageView;
        this.f2459c = new f(imageView);
    }

    public final void a(f fVar) {
        this.f2459c.f2464b.remove(fVar);
    }

    public final void b(Drawable drawable) {
        l((Object) null);
        this.d = null;
        this.f2458b.setImageDrawable(drawable);
    }

    public final void c() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final void d(c cVar) {
        this.f2458b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    public final void e(f fVar) {
        int i2;
        f fVar2 = this.f2459c;
        ImageView imageView = fVar2.f2463a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i5 = 0;
        if (layoutParams != null) {
            i2 = layoutParams.width;
        } else {
            i2 = 0;
        }
        int a6 = fVar2.a(imageView.getWidth(), i2, paddingRight);
        ImageView imageView2 = fVar2.f2463a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        if (layoutParams2 != null) {
            i5 = layoutParams2.height;
        }
        int a7 = fVar2.a(imageView2.getHeight(), i5, paddingBottom);
        if ((a6 > 0 || a6 == Integer.MIN_VALUE) && (a7 > 0 || a7 == Integer.MIN_VALUE)) {
            fVar.n(a6, a7);
            return;
        }
        ArrayList arrayList = fVar2.f2464b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (fVar2.f2465c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            e eVar = new e(fVar2);
            fVar2.f2465c = eVar;
            viewTreeObserver.addOnPreDrawListener(eVar);
        }
    }

    public final void f(Drawable drawable) {
        l((Object) null);
        this.d = null;
        this.f2458b.setImageDrawable(drawable);
    }

    public final c g() {
        Object tag = this.f2458b.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof c) {
            return (c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final void h(Drawable drawable) {
        f fVar = this.f2459c;
        ViewTreeObserver viewTreeObserver = fVar.f2463a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(fVar.f2465c);
        }
        fVar.f2465c = null;
        fVar.f2464b.clear();
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
        l((Object) null);
        this.d = null;
        this.f2458b.setImageDrawable(drawable);
    }

    public final void i(Object obj) {
        l(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.d = animatable;
            animatable.start();
            return;
        }
        this.d = null;
    }

    public final void j() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void l(Object obj) {
        switch (this.f2460e) {
            case 0:
                this.f2458b.setImageBitmap((Bitmap) obj);
                return;
            default:
                this.f2458b.setImageDrawable((Drawable) obj);
                return;
        }
    }

    public final String toString() {
        return "Target for: " + this.f2458b;
    }
}
