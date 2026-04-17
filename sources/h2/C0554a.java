package h2;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

/* renamed from: h2.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0554a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f8052a;

    public /* synthetic */ C0554a(Chip chip) {
        this.f8052a = chip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f8052a.f6380r;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
        }
    }
}
