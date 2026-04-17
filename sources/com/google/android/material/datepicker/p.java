package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

public final class p extends BaseAdapter {
    public static final int d = w.c((Calendar) null).getMaximum(4);

    /* renamed from: e  reason: collision with root package name */
    public static final int f6454e = ((w.c((Calendar) null).getMaximum(7) + w.c((Calendar) null).getMaximum(5)) - 1);

    /* renamed from: a  reason: collision with root package name */
    public final o f6455a;

    /* renamed from: b  reason: collision with root package name */
    public c f6456b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6457c;

    public p(o oVar, b bVar) {
        this.f6455a = oVar;
        this.f6457c = bVar;
        throw null;
    }

    public final int a() {
        int i2 = this.f6457c.f6395e;
        o oVar = this.f6455a;
        Calendar calendar = oVar.f6448a;
        int i5 = calendar.get(7);
        if (i2 <= 0) {
            i2 = calendar.getFirstDayOfWeek();
        }
        int i6 = i5 - i2;
        if (i6 < 0) {
            return i6 + oVar.d;
        }
        return i6;
    }

    /* renamed from: b */
    public final Long getItem(int i2) {
        if (i2 < a() || i2 > c()) {
            return null;
        }
        Calendar a6 = w.a(this.f6455a.f6448a);
        a6.set(5, (i2 - a()) + 1);
        return Long.valueOf(a6.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.f6455a.f6451e) - 1;
    }

    public final int getCount() {
        return f6454e;
    }

    public final long getItemId(int i2) {
        return (long) (i2 / this.f6455a.d);
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            com.google.android.material.datepicker.c r1 = r4.f6456b
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r4.f6456b = r1
        L_0x000f:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L_0x0027
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131493085(0x7f0c00dd, float:1.860964E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r6 = r4.a()
            int r6 = r5 - r6
            if (r6 < 0) goto L_0x005d
            com.google.android.material.datepicker.o r7 = r4.f6455a
            int r2 = r7.f6451e
            if (r6 < r2) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x0065
        L_0x005d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L_0x0065:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            return r0
        L_0x006f:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.w.b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.p.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
