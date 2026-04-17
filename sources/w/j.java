package W;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

public final class j implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f3872a;

    public j(TransformationMethod transformationMethod) {
        this.f3872a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3872a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.j.a().b() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.j a6 = androidx.emoji2.text.j.a();
        a6.getClass();
        return a6.e(charSequence, 0, charSequence.length());
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f3872a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i2, rect);
        }
    }
}
