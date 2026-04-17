package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.D;
import com.mtma.criminal.city.R;
import java.util.Locale;
import m0.C0832y;
import m0.T;

public final class y extends C0832y {

    /* renamed from: c  reason: collision with root package name */
    public final k f6467c;

    public y(k kVar) {
        this.f6467c = kVar;
    }

    public final int a() {
        return this.f6467c.f6414f0.f6396f;
    }

    public final void c(T t6, int i2) {
        String str;
        k kVar = this.f6467c;
        int i5 = kVar.f6414f0.f6392a.f6450c + i2;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i5)});
        TextView textView = ((x) t6).f6466t;
        textView.setText(format);
        Context context = textView.getContext();
        if (w.b().get(1) == i5) {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i5)});
        } else {
            str = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i5)});
        }
        textView.setContentDescription(str);
        c cVar = kVar.f6417i0;
        if (w.b().get(1) == i5) {
            D d = cVar.f6399b;
        } else {
            D d6 = cVar.f6398a;
        }
        throw null;
    }

    public final T d(ViewGroup viewGroup) {
        return new x((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
