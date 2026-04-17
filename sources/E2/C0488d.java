package e2;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* renamed from: e2.d  reason: case insensitive filesystem */
public final class C0488d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f7592a;

    public C0488d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f7592a = materialButtonToggleGroup;
    }

    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.f6353x).compareTo(Boolean.valueOf(materialButton2.f6353x));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f7592a;
        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
    }
}
