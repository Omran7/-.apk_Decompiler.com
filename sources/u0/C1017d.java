package u0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import n.e;

/* renamed from: u0.d  reason: case insensitive filesystem */
public final class C1017d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public C1028o f11781a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f11782b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f11783c;
    public e d;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
