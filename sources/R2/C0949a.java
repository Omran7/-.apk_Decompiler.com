package r2;

import C.d;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: r2.a  reason: case insensitive filesystem */
public final class C0949a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f11194i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f11195j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f11196k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f11197l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f11198a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f11199b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f11200c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11201e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11202f;
    public final Path g = new Path();
    public final Paint h;

    public C0949a() {
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.f11198a = paint2;
        this.d = d.d(-16777216, 68);
        this.f11201e = d.d(-16777216, 20);
        this.f11202f = d.d(-16777216, 0);
        paint2.setColor(this.d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f11199b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f11200c = new Paint(paint3);
    }
}
