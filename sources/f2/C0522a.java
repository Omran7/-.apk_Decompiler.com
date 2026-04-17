package f2;

import A4.a;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: f2.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0522a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f7901a;

    public /* synthetic */ C0522a(CarouselLayoutManager carouselLayoutManager) {
        this.f7901a = carouselLayoutManager;
    }

    public final void onLayoutChange(View view, int i2, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager = this.f7901a;
        carouselLayoutManager.getClass();
        if (i2 != i8 || i5 != i9 || i6 != i10 || i7 != i11) {
            view.post(new a(carouselLayoutManager, 13));
        }
    }
}
