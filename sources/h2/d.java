package h2;

import L.e;
import L.j;
import U.b;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.mtma.criminal.city.R;
import java.util.ArrayList;

public final class d extends b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Chip f8056q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f8056q = chip;
    }

    public final void l(ArrayList arrayList) {
        boolean z3 = false;
        arrayList.add(0);
        Rect rect = Chip.F;
        Chip chip = this.f8056q;
        if (chip.c()) {
            f fVar = chip.f6376e;
            if (fVar != null && fVar.f8084T) {
                z3 = true;
            }
            if (z3 && chip.f6379q != null) {
                arrayList.add(1);
            }
        }
    }

    public final void o(int i2, j jVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = jVar.f1702a;
        CharSequence charSequence = "";
        if (i2 == 1) {
            Chip chip = this.f8056q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, new Object[]{charSequence}).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            jVar.b(e.f1691e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.F);
    }
}
