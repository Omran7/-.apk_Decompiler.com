package r0;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: r0.d  reason: case insensitive filesystem */
public final class C0943d {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f11133a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f11134b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f11135c;
    public final Paint d;

    /* renamed from: e  reason: collision with root package name */
    public float f11136e;

    /* renamed from: f  reason: collision with root package name */
    public float f11137f;
    public float g;
    public float h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f11138i;

    /* renamed from: j  reason: collision with root package name */
    public int f11139j;

    /* renamed from: k  reason: collision with root package name */
    public float f11140k;

    /* renamed from: l  reason: collision with root package name */
    public float f11141l;

    /* renamed from: m  reason: collision with root package name */
    public float f11142m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f11143n;

    /* renamed from: o  reason: collision with root package name */
    public Path f11144o;

    /* renamed from: p  reason: collision with root package name */
    public float f11145p;

    /* renamed from: q  reason: collision with root package name */
    public float f11146q;

    /* renamed from: r  reason: collision with root package name */
    public int f11147r;

    /* renamed from: s  reason: collision with root package name */
    public int f11148s;

    /* renamed from: t  reason: collision with root package name */
    public int f11149t;

    /* renamed from: u  reason: collision with root package name */
    public int f11150u;

    public C0943d() {
        Paint paint = new Paint();
        this.f11134b = paint;
        Paint paint2 = new Paint();
        this.f11135c = paint2;
        Paint paint3 = new Paint();
        this.d = paint3;
        this.f11136e = 0.0f;
        this.f11137f = 0.0f;
        this.g = 0.0f;
        this.h = 5.0f;
        this.f11145p = 1.0f;
        this.f11149t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i2) {
        this.f11139j = i2;
        this.f11150u = this.f11138i[i2];
    }
}
