package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import m0.C0804F;
import m0.C0807I;

public final class j extends C0807I {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f6410a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f6411b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f6412c;

    public j(k kVar, s sVar, MaterialButton materialButton) {
        this.f6412c = kVar;
        this.f6410a = sVar;
        this.f6411b = materialButton;
    }

    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f6411b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i2, int i5) {
        int i6;
        k kVar = this.f6412c;
        if (i2 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.f6419k0.getLayoutManager();
            View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            if (M02 == null) {
                i6 = -1;
            } else {
                i6 = C0804F.H(M02);
            }
        } else {
            i6 = ((LinearLayoutManager) kVar.f6419k0.getLayoutManager()).K0();
        }
        b bVar = this.f6410a.f6462c;
        Calendar a6 = w.a(bVar.f6392a.f6448a);
        a6.add(2, i6);
        kVar.f6415g0 = new o(a6);
        Calendar a7 = w.a(bVar.f6392a.f6448a);
        a7.add(2, i6);
        a7.set(5, 1);
        Calendar a8 = w.a(a7);
        a8.get(2);
        a8.get(1);
        a8.getMaximum(7);
        a8.getActualMaximum(5);
        a8.getTimeInMillis();
        long timeInMillis = a8.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = w.f6465a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f6411b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
