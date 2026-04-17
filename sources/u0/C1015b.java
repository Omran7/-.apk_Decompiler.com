package u0;

import D.a;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import g2.C0547a;
import g2.c;

/* renamed from: u0.b  reason: case insensitive filesystem */
public final class C1015b extends Animatable2.AnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0547a f11779a;

    public C1015b(C0547a aVar) {
        this.f11779a = aVar;
    }

    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f11779a.f7983b.f8005x;
        if (colorStateList != null) {
            a.h(drawable, colorStateList);
        }
    }

    public final void onAnimationStart(Drawable drawable) {
        c cVar = this.f11779a.f7983b;
        ColorStateList colorStateList = cVar.f8005x;
        if (colorStateList != null) {
            a.g(drawable, colorStateList.getColorForState(cVar.f7990B, colorStateList.getDefaultColor()));
        }
    }
}
