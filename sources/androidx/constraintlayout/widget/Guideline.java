package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import v.e;

public class Guideline extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4852a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i2, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f4852a = z3;
    }

    public void setGuidelineBegin(int i2) {
        e eVar = (e) getLayoutParams();
        if (!this.f4852a || eVar.f11985a != i2) {
            eVar.f11985a = i2;
            setLayoutParams(eVar);
        }
    }

    public void setGuidelineEnd(int i2) {
        e eVar = (e) getLayoutParams();
        if (!this.f4852a || eVar.f11987b != i2) {
            eVar.f11987b = i2;
            setLayoutParams(eVar);
        }
    }

    public void setGuidelinePercent(float f6) {
        e eVar = (e) getLayoutParams();
        if (!this.f4852a || eVar.f11989c != f6) {
            eVar.f11989c = f6;
            setLayoutParams(eVar);
        }
    }

    public void setVisibility(int i2) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
