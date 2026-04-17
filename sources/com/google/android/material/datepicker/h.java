package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import m0.C0802D;

public final class h extends C0802D {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f6408a;

    public h(k kVar) {
        this.f6408a = kVar;
        w.c((Calendar) null);
        w.c((Calendar) null);
    }

    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            y yVar = (y) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            this.f6408a.getClass();
            throw null;
        }
    }
}
