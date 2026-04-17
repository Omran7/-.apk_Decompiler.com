package v2;

import C.d;
import D.a;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

public final class q extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public ColorStateList f12250a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f12251b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f12252c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context, int i2, String[] strArr) {
        super(context, i2, strArr);
        this.f12252c = rVar;
        a();
    }

    public final void a() {
        boolean z3;
        ColorStateList colorStateList;
        r rVar = this.f12252c;
        ColorStateList colorStateList2 = rVar.f12260u;
        if (colorStateList2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z3) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f12251b = colorStateList;
        if (!(rVar.f12259t == 0 || rVar.f12260u == null)) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{d.b(rVar.f12260u.getColorForState(iArr3, 0), rVar.f12259t), d.b(rVar.f12260u.getColorForState(iArr2, 0), rVar.f12259t), rVar.f12259t});
        }
        this.f12250a = colorStateList3;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            r rVar = this.f12252c;
            RippleDrawable rippleDrawable = null;
            if (rVar.getText().toString().contentEquals(textView.getText()) && rVar.f12259t != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(rVar.f12259t);
                if (this.f12251b != null) {
                    a.h(colorDrawable, this.f12250a);
                    rippleDrawable = new RippleDrawable(this.f12251b, colorDrawable, (Drawable) null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = O.f1352a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
