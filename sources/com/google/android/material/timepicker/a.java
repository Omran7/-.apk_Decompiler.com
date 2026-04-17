package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import m2.j;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f6612a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f6612a = chipTextInputComboView;
    }

    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f6612a;
        if (isEmpty) {
            chipTextInputComboView.f6582a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a6 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f6582a;
        if (TextUtils.isEmpty(a6)) {
            a6 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a6);
    }
}
