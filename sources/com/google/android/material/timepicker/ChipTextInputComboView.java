package com.google.android.material.timepicker;

import A4.a;
import K.O;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f6582a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f6583b;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f6582a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f6583b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = O.f1352a;
        editText.setId(View.generateViewId());
        ((TextView) findViewById(R.id.material_label)).setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final boolean isChecked() {
        return this.f6582a.isChecked();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6583b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public final void setChecked(boolean z3) {
        int i2;
        Chip chip = this.f6582a;
        chip.setChecked(z3);
        int i5 = 0;
        if (z3) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        EditText editText = this.f6583b;
        editText.setVisibility(i2);
        if (z3) {
            i5 = 8;
        }
        chip.setVisibility(i5);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new a(editText, 15));
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6582a.setOnClickListener(onClickListener);
    }

    public final void setTag(int i2, Object obj) {
        this.f6582a.setTag(i2, obj);
    }

    public final void toggle() {
        this.f6582a.toggle();
    }
}
