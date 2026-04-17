package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

public final class e extends BaseAdapter {
    public static final int d;

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f6401a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6402b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6403c;

    static {
        int i2;
        if (Build.VERSION.SDK_INT >= 26) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        d = i2;
    }

    public e() {
        Calendar c3 = w.c((Calendar) null);
        this.f6401a = c3;
        this.f6402b = c3.getMaximum(7);
        this.f6403c = c3.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f6402b;
    }

    public final Object getItem(int i2) {
        int i5 = this.f6402b;
        if (i2 >= i5) {
            return null;
        }
        int i6 = i2 + this.f6403c;
        if (i6 > i5) {
            i6 -= i5;
        }
        return Integer.valueOf(i6);
    }

    public final long getItemId(int i2) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r5v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 != 0) goto L_0x0018
            android.content.Context r5 = r6.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r0 = 2131493086(0x7f0c00de, float:1.8609642E38)
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            int r5 = r3.f6403c
            int r4 = r4 + r5
            int r5 = r3.f6402b
            if (r4 <= r5) goto L_0x0020
            int r4 = r4 - r5
        L_0x0020:
            java.util.Calendar r5 = r3.f6401a
            r1 = 7
            r5.set(r1, r4)
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            int r2 = d
            java.lang.String r4 = r5.getDisplayName(r1, r2, r4)
            r0.setText(r4)
            android.content.Context r4 = r6.getContext()
            r6 = 2131888062(0x7f1207be, float:1.9410749E38)
            java.lang.String r4 = r4.getString(r6)
            r6 = 2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r1, r6, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.setContentDescription(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public e(int i2) {
        Calendar c3 = w.c((Calendar) null);
        this.f6401a = c3;
        this.f6402b = c3.getMaximum(7);
        this.f6403c = i2;
    }
}
