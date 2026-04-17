package com.google.android.material.datepicker;

import S3.t;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mtma.criminal.city.R;
import java.util.Calendar;
import m0.C0805G;
import m0.C0832y;
import m0.T;

public final class s extends C0832y {

    /* renamed from: c  reason: collision with root package name */
    public final b f6462c;
    public final t d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6463e;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, t tVar) {
        int i2;
        o oVar = bVar.f6392a;
        o oVar2 = bVar.d;
        if (oVar.f6448a.compareTo(oVar2.f6448a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (oVar2.f6448a.compareTo(bVar.f6393b.f6448a) <= 0) {
            int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * p.d;
            if (l.Y(contextThemeWrapper, 16843277)) {
                i2 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            } else {
                i2 = 0;
            }
            this.f6463e = dimensionPixelSize + i2;
            this.f6462c = bVar;
            this.d = tVar;
            if (!this.f10068a.a()) {
                this.f10069b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int a() {
        return this.f6462c.f6397p;
    }

    public final long b(int i2) {
        Calendar a6 = w.a(this.f6462c.f6392a.f6448a);
        a6.add(2, i2);
        a6.set(5, 1);
        Calendar a7 = w.a(a6);
        a7.get(2);
        a7.get(1);
        a7.getMaximum(7);
        a7.getActualMaximum(5);
        a7.getTimeInMillis();
        return a7.getTimeInMillis();
    }

    public final void c(T t6, int i2) {
        r rVar = (r) t6;
        b bVar = this.f6462c;
        Calendar a6 = w.a(bVar.f6392a.f6448a);
        a6.add(2, i2);
        o oVar = new o(a6);
        rVar.f6460t.setText(oVar.j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f6461u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f6455a)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final T d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!l.Y(viewGroup.getContext(), 16843277)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0805G(-1, this.f6463e));
        return new r(linearLayout, true);
    }
}
