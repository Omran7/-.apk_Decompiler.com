package m2;

import android.text.TextPaint;
import h2.C0555b;
import h2.f;
import java.lang.ref.WeakReference;
import p2.C0916d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f10143a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final C0555b f10144b = new C0555b(this, 1);

    /* renamed from: c  reason: collision with root package name */
    public float f10145c;
    public boolean d = true;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f10146e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public C0916d f10147f;

    public i(f fVar) {
        this.f10146e = new WeakReference(fVar);
    }

    public final float a(String str) {
        float f6;
        if (!this.d) {
            return this.f10145c;
        }
        TextPaint textPaint = this.f10143a;
        if (str == null) {
            f6 = 0.0f;
        } else {
            f6 = textPaint.measureText(str, 0, str.length());
        }
        this.f10145c = f6;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f10145c;
    }
}
