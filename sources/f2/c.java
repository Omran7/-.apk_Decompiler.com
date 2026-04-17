package f2;

import C.d;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.C0802D;

public final class c extends C0802D {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f7904a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7905b = Collections.unmodifiableList(new ArrayList());

    public c() {
        Paint paint = new Paint();
        this.f7904a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i2;
        int i5;
        int i6;
        int i7;
        Paint paint = this.f7904a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (e eVar : this.f7905b) {
            eVar.getClass();
            ThreadLocal threadLocal = d.f372a;
            float f6 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f6)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f6)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f6)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f6))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                d dVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f6367q;
                switch (dVar.f7907b) {
                    case 0:
                        i6 = 0;
                        break;
                    default:
                        i6 = dVar.f7908c.G();
                        break;
                }
                float f7 = (float) i6;
                d dVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f6367q;
                switch (dVar2.f7907b) {
                    case 0:
                        i7 = dVar2.f7908c.f9860o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = dVar2.f7908c;
                        i7 = carouselLayoutManager.f9860o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f7, 0.0f, (float) i7, paint);
            } else {
                d dVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f6367q;
                switch (dVar3.f7907b) {
                    case 0:
                        i2 = dVar3.f7908c.E();
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                float f8 = (float) i2;
                d dVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f6367q;
                switch (dVar4.f7907b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = dVar4.f7908c;
                        i5 = carouselLayoutManager2.f9859n - carouselLayoutManager2.F();
                        break;
                    default:
                        i5 = dVar4.f7908c.f9859n;
                        break;
                }
                canvas.drawLine(f8, 0.0f, (float) i5, 0.0f, paint);
            }
        }
    }
}
