package com.mtma.criminal.city.utils;

import K4.u;
import Y4.D;
import a1.C0258c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import i3.C0592h;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import o3.d;

public abstract class U {

    /* renamed from: a  reason: collision with root package name */
    public static final TreeMap f7378a;

    static {
        TreeMap treeMap = new TreeMap();
        f7378a = treeMap;
        treeMap.put(1000L, "k");
        treeMap.put(1000000L, "M");
        treeMap.put(1000000000L, "B");
        treeMap.put(1000000000000L, "T");
        treeMap.put(1000000000000000L, "P");
        treeMap.put(1000000000000000000L, "E");
    }

    public static String a(long j6) {
        return new DecimalFormat("#,###,###").format(j6);
    }

    public static String b(long j6) {
        if (j6 == Long.MIN_VALUE) {
            return b(-9223372036854775807L);
        }
        if (j6 < 0) {
            return "-" + b(-j6);
        } else if (j6 < 1000) {
            return j6 + ".0";
        } else {
            Map.Entry floorEntry = f7378a.floorEntry(Long.valueOf(j6));
            String str = (String) floorEntry.getValue();
            double longValue = ((double) j6) / ((double) ((Long) floorEntry.getKey()).longValue());
            if (longValue >= 999.95d) {
                return d.i("999.9", str);
            }
            return String.format("%.1f%s", new Object[]{Double.valueOf(longValue), str});
        }
    }

    public static String c(long j6) {
        if (j6 == Long.MIN_VALUE) {
            return c(-9223372036854775807L);
        }
        if (j6 < 0) {
            return "-" + c(-j6);
        } else if (j6 < 1000) {
            return j6 + "";
        } else {
            Map.Entry floorEntry = f7378a.floorEntry(Long.valueOf(j6));
            String str = (String) floorEntry.getValue();
            long longValue = j6 / (((Long) floorEntry.getKey()).longValue() / 10);
            if (longValue < 100) {
                double d = ((double) longValue) / 10.0d;
                if (d != ((double) (longValue / 10))) {
                    return d + str;
                }
            }
            return (longValue / 10) + "" + str;
        }
    }

    public static long d(int i2) {
        if (i2 == 1) {
            return 20000;
        }
        if (i2 == 9) {
            return 200000;
        }
        if (i2 == 99) {
            return 2250000;
        }
        if (i2 == 499) {
            return 12500000;
        }
        if (i2 == 999) {
            return 30000000;
        }
        if (i2 == 4999) {
            return 160000000;
        }
        if (i2 == 9999) {
            return 350000000;
        }
        return i2 == 49999 ? 2000000000 : 0;
    }

    public static ArrayList e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new D(R.string.gift_first_buy_gold_estate_district_name, R.string.gift_first_buy_gold_estate_district_description, R.drawable.estate_district, 1));
        arrayList.add(new D(R.string.gift_first_buy_gold_flower_name, R.string.gift_first_buy_gold_flower_description, R.drawable.gift_buy_gold_flowers, 1));
        arrayList.add(new D(R.string.gift_first_buy_gold_cash_name, R.string.gift_first_buy_gold_cash_description, R.drawable.gift_buy_gold_cash, 1000000));
        a.s(arrayList, D.s(10054, 0, 1), 30004, 0, 1);
        a.s(arrayList, D.s(2026, 0, 2), 2001, 0, 2);
        a.s(arrayList, D.s(2002, 0, 2), 2005, 0, 2);
        arrayList.add(D.s(2008, 0, 2));
        return arrayList;
    }

    public static void f(int i2, long j6, S s6) {
        a.v(a.c(C0592h.b().e(), "players"), "moneyObject").H(new C0258c(i2, j6, (Object) s6, 7));
    }

    public static void g(String str, String str2, long j6, T t6) {
        d.d(C0592h.b().e(), "players", str, "moneyObject", str2).H(new u(j6, (Object) t6, 8));
    }
}
