package s2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import l2.C0781a;

public class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public k f11441a;

    /* renamed from: b  reason: collision with root package name */
    public C0781a f11442b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f11443c = null;
    public ColorStateList d = null;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f11444e = null;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f11445f = PorterDuff.Mode.SRC_IN;
    public Rect g = null;
    public final float h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f11446i = 1.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f11447j;

    /* renamed from: k  reason: collision with root package name */
    public int f11448k = 255;

    /* renamed from: l  reason: collision with root package name */
    public float f11449l = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f11450m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    public int f11451n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f11452o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Paint.Style f11453p = Paint.Style.FILL_AND_STROKE;

    public f(k kVar) {
        this.f11441a = kVar;
        this.f11442b = null;
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f11462e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f11441a = fVar.f11441a;
        this.f11442b = fVar.f11442b;
        this.f11447j = fVar.f11447j;
        this.f11443c = fVar.f11443c;
        this.d = fVar.d;
        this.f11445f = fVar.f11445f;
        this.f11444e = fVar.f11444e;
        this.f11448k = fVar.f11448k;
        this.h = fVar.h;
        this.f11452o = fVar.f11452o;
        this.f11446i = fVar.f11446i;
        this.f11449l = fVar.f11449l;
        this.f11450m = fVar.f11450m;
        this.f11451n = fVar.f11451n;
        this.f11453p = fVar.f11453p;
        if (fVar.g != null) {
            this.g = new Rect(fVar.g);
        }
    }
}
