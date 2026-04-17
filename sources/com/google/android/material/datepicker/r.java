package com.google.android.material.datepicker;

import K.C0084y;
import K.O;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;
import m0.T;

public final class r extends T {

    /* renamed from: t  reason: collision with root package name */
    public final TextView f6460t;

    /* renamed from: u  reason: collision with root package name */
    public final MaterialCalendarGridView f6461u;

    public r(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f6460t = textView;
        WeakHashMap weakHashMap = O.f1352a;
        new C0084y(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(textView, Boolean.TRUE);
        this.f6461u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z3) {
            textView.setVisibility(8);
        }
    }
}
