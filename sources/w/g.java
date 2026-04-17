package W;

import I1.b;
import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.j;

public final class g extends b {

    /* renamed from: p  reason: collision with root package name */
    public final f f3867p;

    public g(TextView textView) {
        this.f3867p = new f(textView);
    }

    public final void C0(boolean z3) {
        boolean z4;
        if (j.f4933k != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f3867p.C0(z3);
        }
    }

    public final void D0(boolean z3) {
        boolean z4;
        if (j.f4933k != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        f fVar = this.f3867p;
        if (!z4) {
            fVar.f3866r = z3;
        } else {
            fVar.D0(z3);
        }
    }

    public final InputFilter[] I(InputFilter[] inputFilterArr) {
        boolean z3;
        if (j.f4933k != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return inputFilterArr;
        }
        return this.f3867p.I(inputFilterArr);
    }
}
