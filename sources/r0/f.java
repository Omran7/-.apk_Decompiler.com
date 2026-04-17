package R0;

import U0.g;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.ArrayList;

public final class f {
    public static Integer d;

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f2463a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2464b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public e f2465c;

    public f(ImageView imageView) {
        this.f2463a = imageView;
    }

    public final int a(int i2, int i5, int i6) {
        int i7 = i5 - i6;
        if (i7 > 0) {
            return i7;
        }
        int i8 = i2 - i6;
        if (i8 > 0) {
            return i8;
        }
        ImageView imageView = this.f2463a;
        if (imageView.isLayoutRequested() || i5 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = imageView.getContext();
        if (d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            g.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }
}
