package T4;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

public final class b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3580a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3581b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LinearLayout f3582c;
    public final /* synthetic */ d d;

    public b(d dVar, ArrayList arrayList, int i2, LinearLayout linearLayout) {
        this.d = dVar;
        this.f3580a = arrayList;
        this.f3581b = i2;
        this.f3582c = linearLayout;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        d dVar = this.d;
        if (z3) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f3580a;
                int size = arrayList.size();
                int i5 = this.f3581b;
                if (i2 < size) {
                    if (i5 != i2) {
                        ((CheckBox) ((ConstraintLayout) this.f3582c.getChildAt(i2)).getChildAt(1)).setChecked(false);
                    }
                    i2++;
                } else {
                    dVar.f3601r0 = ((Integer) arrayList.get(i5)).intValue();
                    return;
                }
            }
        } else {
            dVar.f3601r0 = -1;
        }
    }
}
