package com.mtma.criminal.city.utils;

import com.google.android.gms.internal.measurement.a;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f7394a = new ArrayList(Arrays.asList(new Integer[]{1, 7, 13, 15, 20, 25, 35, 50, 80, 100, 150, 200, 250, 300, 350, 400, 450, 500}));

    public static boolean a() {
        int i2 = 0;
        while (i2 < o.getPrizeObject().getLevelRewardsCollectState().size() && o.getMainStatesObject().getLevel() >= ((Integer) f7394a.get(i2)).intValue()) {
            if (!o.getPrizeObject().getLevelRewardsCollectState().get(i2).booleanValue()) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public static void b() {
        a.d(a.c(C0592h.b().e(), "players"), "notificationObject", "hasUnCollectedPrize").I(Boolean.valueOf(a()));
    }
}
