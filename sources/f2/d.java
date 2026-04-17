package f2;

import com.google.android.material.carousel.CarouselLayoutManager;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f7906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7907b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f7908c;

    public d(int i2) {
        this.f7906a = i2;
    }

    public final int a() {
        switch (this.f7907b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f7908c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f9859n;
                }
                return 0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager, int i2) {
        this(1);
        this.f7907b = i2;
        switch (i2) {
            case 1:
                this.f7908c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f7908c = carouselLayoutManager;
                return;
        }
    }
}
