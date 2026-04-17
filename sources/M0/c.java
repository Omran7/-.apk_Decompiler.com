package M0;

import U0.g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

public final class c extends Drawable implements f, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final b f1783a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1784b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1785c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1786e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f1787f;

    /* renamed from: p  reason: collision with root package name */
    public final int f1788p = -1;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1789q;

    /* renamed from: r  reason: collision with root package name */
    public Paint f1790r;

    /* renamed from: s  reason: collision with root package name */
    public Rect f1791s;

    public c(b bVar) {
        g.c(bVar, "Argument must not be null");
        this.f1783a = bVar;
    }

    public final void a() {
        g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        h hVar = (h) this.f1783a.f1782b;
        if (hVar.f1801a.f12639l.f12622c == 1) {
            invalidateSelf();
        } else if (!this.f1784b) {
            this.f1784b = true;
            if (!hVar.f1807j) {
                ArrayList arrayList = hVar.f1803c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !hVar.f1805f) {
                        hVar.f1805f = true;
                        hVar.f1807j = false;
                        hVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.d) {
            if (this.f1789q) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.f1791s == null) {
                    this.f1791s = new Rect();
                }
                Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f1791s);
                this.f1789q = false;
            }
            h hVar = (h) this.f1783a.f1782b;
            e eVar = hVar.f1806i;
            if (eVar != null) {
                bitmap = eVar.f1798p;
            } else {
                bitmap = hVar.f1809l;
            }
            if (this.f1791s == null) {
                this.f1791s = new Rect();
            }
            Rect rect = this.f1791s;
            if (this.f1790r == null) {
                this.f1790r = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f1790r);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f1783a;
    }

    public final int getIntrinsicHeight() {
        return ((h) this.f1783a.f1782b).f1813p;
    }

    public final int getIntrinsicWidth() {
        return ((h) this.f1783a.f1782b).f1812o;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.f1784b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1789q = true;
    }

    public final void setAlpha(int i2) {
        if (this.f1790r == null) {
            this.f1790r = new Paint(2);
        }
        this.f1790r.setAlpha(i2);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f1790r == null) {
            this.f1790r = new Paint(2);
        }
        this.f1790r.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z3, boolean z4) {
        g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.f1786e = z3;
        if (!z3) {
            this.f1784b = false;
            h hVar = (h) this.f1783a.f1782b;
            ArrayList arrayList = hVar.f1803c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f1805f = false;
            }
        } else if (this.f1785c) {
            a();
        }
        return super.setVisible(z3, z4);
    }

    public final void start() {
        this.f1785c = true;
        this.f1787f = 0;
        if (this.f1786e) {
            a();
        }
    }

    public final void stop() {
        this.f1785c = false;
        this.f1784b = false;
        h hVar = (h) this.f1783a.f1782b;
        ArrayList arrayList = hVar.f1803c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f1805f = false;
        }
    }
}
