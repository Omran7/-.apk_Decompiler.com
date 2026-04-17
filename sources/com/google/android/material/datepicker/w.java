package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f6465a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar c3 = c(calendar);
        Calendar c6 = c((Calendar) null);
        c6.set(c3.get(1), c3.get(2), c3.get(5));
        return c6;
    }

    public static Calendar b() {
        v vVar = (v) f6465a.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar c(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
