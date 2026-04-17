package l2;

import K1.e;
import android.content.Context;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;

/* renamed from: l2.a  reason: case insensitive filesystem */
public final class C0781a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f9664f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9665a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9666b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9667c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final float f9668e;

    public C0781a(Context context) {
        boolean i02 = c.i0(context, R.attr.elevationOverlayEnabled, false);
        int s6 = e.s(R.attr.elevationOverlayColor, 0, context);
        int s7 = e.s(R.attr.elevationOverlayAccentColor, 0, context);
        int s8 = e.s(R.attr.colorSurface, 0, context);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f9665a = i02;
        this.f9666b = s6;
        this.f9667c = s7;
        this.d = s8;
        this.f9668e = f6;
    }
}
