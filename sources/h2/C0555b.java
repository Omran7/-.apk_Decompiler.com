package h2;

import I1.b;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import m2.h;
import m2.i;

/* renamed from: h2.b  reason: case insensitive filesystem */
public final class C0555b extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f8053p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f8054q;

    public /* synthetic */ C0555b(Object obj, int i2) {
        this.f8053p = i2;
        this.f8054q = obj;
    }

    public final void w0(int i2) {
        switch (this.f8053p) {
            case 0:
                return;
            default:
                i iVar = (i) this.f8054q;
                iVar.d = true;
                h hVar = (h) iVar.f10146e.get();
                if (hVar != null) {
                    f fVar = (f) hVar;
                    fVar.u();
                    fVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    public final void x0(Typeface typeface, boolean z3) {
        CharSequence charSequence;
        switch (this.f8053p) {
            case 0:
                Chip chip = (Chip) this.f8054q;
                f fVar = chip.f6376e;
                if (fVar.L0) {
                    charSequence = fVar.f8077N;
                } else {
                    charSequence = chip.getText();
                }
                chip.setText(charSequence);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z3) {
                    i iVar = (i) this.f8054q;
                    iVar.d = true;
                    h hVar = (h) iVar.f10146e.get();
                    if (hVar != null) {
                        f fVar2 = (f) hVar;
                        fVar2.u();
                        fVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void S0(int i2) {
    }
}
