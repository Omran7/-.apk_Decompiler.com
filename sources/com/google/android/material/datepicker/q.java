package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f6458a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f6459b;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f6459b = sVar;
        this.f6458a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j6) {
        MaterialCalendarGridView materialCalendarGridView = this.f6458a;
        p a6 = materialCalendarGridView.a();
        if (i2 >= a6.a() && i2 <= a6.c()) {
            if (materialCalendarGridView.a().getItem(i2).longValue() >= ((k) this.f6459b.d.f2700b).f6414f0.f6394c.f6400a) {
                throw null;
            }
        }
    }
}
