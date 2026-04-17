package h2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: h2.c  reason: case insensitive filesystem */
public final class C0556c extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f8055a;

    public C0556c(Chip chip) {
        this.f8055a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        f fVar = this.f8055a.f6376e;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
