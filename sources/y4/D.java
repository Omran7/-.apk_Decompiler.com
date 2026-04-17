package Y4;

import I1.b;
import b5.n;
import com.mtma.criminal.city.R;
import i4.C0597b;
import java.util.ArrayList;
import java.util.Objects;

public final class D {

    /* renamed from: A  reason: collision with root package name */
    public ArrayList f4289A;

    /* renamed from: B  reason: collision with root package name */
    public long f4290B;

    /* renamed from: C  reason: collision with root package name */
    public long f4291C;

    /* renamed from: D  reason: collision with root package name */
    public int f4292D;

    /* renamed from: a  reason: collision with root package name */
    public int f4293a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f4294b;

    /* renamed from: c  reason: collision with root package name */
    public int f4295c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f4296e;

    /* renamed from: f  reason: collision with root package name */
    public long f4297f;
    public long g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public int f4298i = 0;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f4299j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4300k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4301l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4302m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4303n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4304o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4305p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4306q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4307r = false;

    /* renamed from: s  reason: collision with root package name */
    public int f4308s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f4309t;

    /* renamed from: u  reason: collision with root package name */
    public int f4310u;

    /* renamed from: v  reason: collision with root package name */
    public int f4311v;

    /* renamed from: w  reason: collision with root package name */
    public int f4312w;

    /* renamed from: x  reason: collision with root package name */
    public int f4313x;

    /* renamed from: y  reason: collision with root package name */
    public int f4314y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList f4315z;

    public D() {
    }

    public static D a() {
        return new D(R.string.add_cell, -1, R.drawable.stock_add_cell);
    }

    public static D b(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4306q = true;
        d6.f4307r = false;
        d6.f4300k = true;
        d6.f4301l = true;
        if (i2 == 20001) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_main_armor_leather_vest_name;
            d6.d = R.drawable.market_main_armor_leather_vest;
            d6.f4297f = 500;
            d6.f4311v = 5;
            d6.f4312w = 9;
        } else if (i2 == 20002) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_armor_motorcycle_helmet_name;
            d6.d = R.drawable.market_main_armor_motocycle_helemt;
            d6.f4297f = 1000;
            d6.f4311v = 10;
            d6.f4312w = 13;
        } else if (i2 == 20003) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_armor_chain_mail_name;
            d6.d = R.drawable.market_dubai_armor_chain_mail;
            d6.f4297f = 20000;
            d6.f4311v = 30;
            d6.f4312w = 29;
        } else if (i2 == 20004) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_armor_carbon_helmet_name;
            d6.d = R.drawable.market_gaza_armor_carbon_helmet;
            d6.f4297f = 10000;
            d6.f4311v = 25;
            d6.f4312w = 25;
        } else if (i2 == 20005) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_armor_outer_tactical_vest_name;
            d6.d = R.drawable.market_riyadh_armor_outer_tactical_vest;
            d6.f4297f = 100000;
            d6.f4311v = 40;
            d6.f4312w = 37;
        } else if (i2 == 20006) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_armor_full_body_armor_name;
            d6.d = R.drawable.market_sanaa_armor_full_body_armor;
            d6.f4297f = 4000;
            d6.f4311v = 20;
            d6.f4312w = 21;
        } else if (i2 == 20007) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_armor_kevlar_trench_coat_name;
            d6.d = R.drawable.market_cairo_armor_kevlar_trench_coat;
            d6.f4297f = 200000;
            d6.f4311v = 45;
            d6.f4312w = 41;
        } else if (i2 == 20008) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_armor_flexible_body_armor_name;
            d6.d = R.drawable.market_doha_armor_flexible_body_armor;
            d6.f4297f = 50000;
            d6.f4311v = 35;
            d6.f4312w = 33;
        } else if (i2 == 20009) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_armor_bulletproof_vest_name;
            d6.d = R.drawable.market_tehran_armor_bulletproof_vest;
            d6.f4297f = 2000;
            d6.f4311v = 15;
            d6.f4312w = 17;
        } else if (i2 == 20010) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_armor_liquid_body_armor_name;
            d6.d = R.drawable.market_rabat_armor_liquid_body_armor;
            d6.f4297f = 500000;
            d6.f4311v = 50;
            d6.f4312w = 45;
        } else if (i2 == 20011) {
            ArrayList arrayList11 = C0597b.f8459a;
            d6.f4295c = R.string.armor_captain_shield;
            d6.d = R.drawable.armor_captain_shield;
            d6.f4297f = 2;
            d6.f4311v = 120;
            d6.f4312w = 10;
            d6.f4292D = 8;
            d6.f4303n = true;
        } else if (i2 == 20012) {
            ArrayList arrayList12 = C0597b.f8459a;
            d6.f4295c = R.string.armor_superman_cap;
            d6.d = R.drawable.armor_superman_cap;
            d6.f4297f = 2;
            d6.f4311v = 50;
            d6.f4312w = 60;
            d6.f4292D = 8;
            d6.f4303n = true;
        } else if (i2 == 20013) {
            ArrayList arrayList13 = C0597b.f8459a;
            d6.f4295c = R.string.armor_champion_cloak;
            d6.d = R.drawable.armor_champion_cloak;
            d6.f4297f = 2;
            d6.f4311v = 60;
            d6.f4312w = 60;
            d6.f4292D = 8;
            d6.f4303n = true;
        } else if (i2 == 20014) {
            ArrayList arrayList14 = C0597b.f8459a;
            d6.f4295c = R.string.armor_cupid_crown;
            d6.d = R.drawable.armor_cupid_crown;
            d6.f4297f = 2;
            d6.f4311v = 65;
            d6.f4312w = 175;
            d6.f4292D = 12;
            d6.f4303n = true;
        } else if (i2 == 20015) {
            ArrayList arrayList15 = C0597b.f8459a;
            d6.f4295c = R.string.armor_military_armor;
            d6.d = R.drawable.armor_military_armor;
            d6.f4297f = 2;
            d6.f4311v = 180;
            d6.f4312w = 55;
            d6.f4292D = 12;
            d6.f4303n = true;
        }
        d6.f4293a = i2;
        d6.f4294b = 1;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D c(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        d6.f4300k = true;
        d6.f4293a = i2;
        d6.f4294b = 16;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D d(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4300k = true;
        d6.f4301l = true;
        if (i2 == 701) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_card_swimming_name;
            d6.d = R.drawable.market_gaza_cards_swimming;
            d6.f4296e = R.string.city_gaza_card_swimming_description;
            d6.f4297f = 100000000;
        } else if (i2 == 702) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_cards_sprinting_name;
            d6.d = R.drawable.market_cairo_card_sprinting;
            d6.f4296e = R.string.city_cairo_card_sprinting_description;
            d6.f4297f = 100000000;
        } else if (i2 == 703) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_cards_weightlifting_name;
            d6.d = R.drawable.market_doha_card_weightlifting;
            d6.f4296e = R.string.city_doha_card_weightlifting_description;
            d6.f4297f = 100000000;
        } else if (i2 == 704) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_cards_tennis_name;
            d6.d = R.drawable.market_tehran_card_tennis;
            d6.f4296e = R.string.city_tehran_card_tennis_description;
            d6.f4297f = 100000000;
        }
        d6.f4293a = i2;
        d6.f4294b = 11;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D e(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 1001) {
            d6.f4295c = C0597b.f8353I0;
            d6.d = C0597b.f8366K0;
            d6.f4296e = C0597b.f8360J0;
            d6.f4297f = 10;
        } else if (i2 == 1002) {
            d6.f4295c = C0597b.L0;
            d6.d = C0597b.f8386N0;
            d6.f4296e = C0597b.f8379M0;
            d6.f4297f = 20;
        } else if (i2 == 1003) {
            d6.f4295c = C0597b.O0;
            d6.d = C0597b.f8403Q0;
            d6.f4296e = C0597b.f8397P0;
            d6.f4297f = 50;
        } else if (i2 == 1004) {
            d6.f4295c = C0597b.f8409R0;
            d6.d = C0597b.f8421T0;
            d6.f4296e = C0597b.f8415S0;
            d6.f4297f = 100;
        } else if (i2 == 1005) {
            d6.f4295c = C0597b.f8427U0;
            d6.d = C0597b.f8439W0;
            d6.f4296e = C0597b.f8433V0;
            d6.f4297f = 200;
        } else if (i2 == 1006) {
            d6.f4295c = C0597b.X0;
            d6.d = C0597b.f8454Z0;
            d6.f4296e = C0597b.f8449Y0;
            d6.f4297f = 50;
        } else if (i2 == 1007) {
            d6.f4295c = C0597b.f8461a1;
            d6.d = C0597b.f8475c1;
            d6.f4296e = C0597b.f8468b1;
            d6.f4297f = 100;
        } else if (i2 == 1008) {
            d6.f4295c = C0597b.f8480d1;
            d6.d = C0597b.f8494f1;
            d6.f4296e = C0597b.f8487e1;
            d6.f4297f = 50;
        } else if (i2 == 1009) {
            d6.f4295c = C0597b.g1;
            d6.d = C0597b.f8511i1;
            d6.f4296e = C0597b.f8504h1;
            d6.f4297f = 50;
        } else if (i2 == 1010) {
            d6.f4295c = C0597b.f8516j1;
            d6.d = C0597b.f8530l1;
            d6.f4296e = C0597b.f8523k1;
            d6.f4297f = 100000;
        } else if (i2 == 1011) {
            d6.f4295c = C0597b.f8537m1;
            d6.d = C0597b.f8550o1;
            d6.f4296e = C0597b.f8544n1;
            d6.f4297f = 1000000;
        } else if (i2 == 1012) {
            d6.f4295c = C0597b.f8557p1;
            d6.d = C0597b.f8571r1;
            d6.f4296e = C0597b.f8564q1;
            d6.f4297f = 1000000;
        } else if (i2 == 1013) {
            d6.f4295c = C0597b.f8577s1;
            d6.d = C0597b.f8591u1;
            d6.f4296e = C0597b.f8584t1;
            d6.f4297f = 10000;
        } else if (i2 == 1014) {
            d6.f4295c = C0597b.f8598v1;
            d6.d = C0597b.f8612x1;
            d6.f4296e = C0597b.f8605w1;
            d6.f4297f = 10000;
        } else if (i2 == 1015) {
            d6.f4295c = C0597b.f8619y1;
            d6.d = C0597b.f8300A1;
            d6.f4296e = C0597b.f8626z1;
            d6.f4297f = 10000;
        }
        d6.f4293a = i2;
        d6.f4294b = 6;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D f() {
        return new D(R.string.empty_cell, -1, R.drawable.stock_empty_frame);
    }

    public static D g(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 301) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_main_flowers_chrysanthemum_name;
            d6.d = R.drawable.market_main_flower;
            d6.f4296e = R.string.city_main_flowers_chrysanthemum_description;
            d6.f4297f = 100;
        } else if (i2 == 302) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_flowers_clear_quartz_name;
            d6.d = R.drawable.market_main_crystal;
            d6.f4296e = R.string.city_main_flowers_clear_quartz_description;
            d6.f4297f = 100;
        } else if (i2 == 303) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_flowers_sagebrush_name;
            d6.d = R.drawable.market_dubai_flower;
            d6.f4296e = R.string.city_dubai_flowers_sagebrush_description;
            d6.f4297f = 100;
        } else if (i2 == 304) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_flowers_green_phantom_name;
            d6.d = R.drawable.market_dubai_crystal;
            d6.f4296e = R.string.city_dubai_flowers_green_phantom_description;
            d6.f4297f = 100;
        } else if (i2 == 305) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_flowers_peony_name;
            d6.d = R.drawable.market_gaza_flower;
            d6.f4296e = R.string.city_gaza_flowers_peony_description;
            d6.f4297f = 100;
        } else if (i2 == 306) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_flowers_topaz_name;
            d6.d = R.drawable.market_gaza_crystal;
            d6.f4296e = R.string.city_gaza_flowers_topaz_description;
            d6.f4297f = 100;
        } else if (i2 == 307) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_flowers_cherry_blossom_name;
            d6.d = R.drawable.market_riyadh_flower;
            d6.f4296e = R.string.city_riyadh_flowers_cherry_blossom_description;
            d6.f4297f = 100;
        } else if (i2 == 308) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_flowers_amber_name;
            d6.d = R.drawable.market_riyadh_crystal;
            d6.f4296e = R.string.city_riyadh_flowers_amber_description;
            d6.f4297f = 100;
        } else if (i2 == 309) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_flowers_dahlia_name;
            d6.d = R.drawable.market_sanaa_flower;
            d6.f4296e = R.string.city_sanaa_flowers_dahlia_description;
            d6.f4297f = 100;
        } else if (i2 == 310) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_flowers_red_quartz_name;
            d6.d = R.drawable.market_sanaa_crystal;
            d6.f4296e = R.string.city_sanaa_flowers_red_quartz_description;
            d6.f4297f = 100;
        } else if (i2 == 311) {
            ArrayList arrayList11 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_flowers_daisy_name;
            d6.d = R.drawable.market_cairo_flower;
            d6.f4296e = R.string.city_cairo_flowers_daisy_description;
            d6.f4297f = 100;
        } else if (i2 == 312) {
            ArrayList arrayList12 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_flowers_water_agate_name;
            d6.d = R.drawable.market_cairo_crystal;
            d6.f4296e = R.string.city_cairo_flowers_water_agate_description;
            d6.f4297f = 100;
        } else if (i2 == 313) {
            ArrayList arrayList13 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_flowers_crab_cactus_name;
            d6.d = R.drawable.market_doha_flower;
            d6.f4296e = R.string.city_doha_flowers_crab_cactus_description;
            d6.f4297f = 100;
        } else if (i2 == 314) {
            ArrayList arrayList14 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_flowers_golden_hair_quartz_name;
            d6.d = R.drawable.market_doha_crystal;
            d6.f4296e = R.string.city_doha_flowers_golden_hair_quartz_description;
            d6.f4297f = 100;
        } else if (i2 == 315) {
            ArrayList arrayList15 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_flowers_protea_name;
            d6.d = R.drawable.market_tehran_flower;
            d6.f4296e = R.string.city_tehran_flowers_protea_description;
            d6.f4297f = 100;
        } else if (i2 == 316) {
            ArrayList arrayList16 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_flowers_rose_quartz_name;
            d6.d = R.drawable.market_tehran_crystal;
            d6.f4296e = R.string.city_tehran_flowers_rose_quartz_description;
            d6.f4297f = 100;
        } else if (i2 == 317) {
            ArrayList arrayList17 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_flowers_red_rose_name;
            d6.d = R.drawable.market_tripoli_flower;
            d6.f4296e = R.string.city_tripoli_flowers_red_rose_description;
            d6.f4297f = 100;
        } else if (i2 == 318) {
            ArrayList arrayList18 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_flowers_red_agate_name;
            d6.d = R.drawable.market_tripoli_crystal;
            d6.f4296e = R.string.city_tripoli_flowers_red_agate_description;
            d6.f4297f = 100;
        } else if (i2 == 319) {
            ArrayList arrayList19 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_flowers_water_lily_name;
            d6.d = R.drawable.market_idlib_flower;
            d6.f4296e = R.string.city_idlib_flowers_water_lily_description;
            d6.f4297f = 100;
        } else if (i2 == 320) {
            ArrayList arrayList20 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_flowers_amethyst_name;
            d6.d = R.drawable.market_idlib_crystal;
            d6.f4296e = R.string.city_idlib_flowers_amethyst_description;
            d6.f4297f = 100;
        } else if (i2 == 321) {
            ArrayList arrayList21 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_flowers_tulip_name;
            d6.d = R.drawable.market_rabat_flower;
            d6.f4296e = R.string.city_rabat_flowers_tulip_description;
            d6.f4297f = 100;
        } else if (i2 == 322) {
            ArrayList arrayList22 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_flowers_blue_agate_name;
            d6.d = R.drawable.market_rabat_crystal;
            d6.f4296e = R.string.city_rabat_flowers_blue_agate_description;
            d6.f4297f = 100;
        }
        d6.f4293a = i2;
        d6.f4294b = 4;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D h(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 401) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_main_food_flour_name;
            d6.d = R.drawable.market_main_food;
            d6.f4296e = R.string.city_main_food_flour_description;
            d6.f4297f = 10000;
        } else if (i2 == 402) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_food_mustard_name;
            d6.d = R.drawable.market_dubai_food_mustard;
            d6.f4296e = R.string.city_dubai_food_mustard_description;
            d6.f4297f = 10000;
        } else if (i2 == 403) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_food_salt_name;
            d6.d = R.drawable.market_dubai_food_salt;
            d6.f4296e = R.string.city_dubai_food_salt_description;
            d6.f4297f = 10000;
        } else if (i2 == 404) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_food_wine_name;
            d6.d = R.drawable.market_dubai_food_wine;
            d6.f4296e = R.string.city_dubai_food_wine_description;
            d6.f4297f = 10000;
        } else if (i2 == 405) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_food_soy_sauce_name;
            d6.d = R.drawable.market_gaza_food_soy_sauce;
            d6.f4296e = R.string.city_gaza_food_soy_sauce_description;
            d6.f4297f = 10000;
        } else if (i2 == 406) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_food_lamb_meat_name;
            d6.d = R.drawable.market_gaza_food_lamb_meat;
            d6.f4296e = R.string.city_gaza_food_lamb_meat_description;
            d6.f4297f = 10000;
        } else if (i2 == 407) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_food_perch_name;
            d6.d = R.drawable.market_riyadh_food_perch;
            d6.f4296e = R.string.city_riyadh_food_perch_description;
            d6.f4297f = 10000;
        } else if (i2 == 408) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_food_cucumber_name;
            d6.d = R.drawable.market_riyadh_food_cucumber;
            d6.f4296e = R.string.city_riyadh_food_cucumber_description;
            d6.f4297f = 10000;
        } else if (i2 == 409) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_food_potato_name;
            d6.d = R.drawable.market_sanaa_food_potato;
            d6.f4296e = R.string.city_sanaa_food_potato_description;
            d6.f4297f = 10000;
        } else if (i2 == 410) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_food_spices_name;
            d6.d = R.drawable.market_sanaa_food_spices;
            d6.f4296e = R.string.city_sanaa_food_spices_description;
            d6.f4297f = 10000;
        } else if (i2 == 411) {
            ArrayList arrayList11 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_food_shrimps_name;
            d6.d = R.drawable.market_cairo_food_shrimps;
            d6.f4296e = R.string.city_cairo_food_shrimps_description;
            d6.f4297f = 10000;
        } else if (i2 == 412) {
            ArrayList arrayList12 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_food_chili_sauce_name;
            d6.d = R.drawable.market_doha_food_chili_sauce;
            d6.f4296e = R.string.city_doha_food_chili_sauce_description;
            d6.f4297f = 10000;
        } else if (i2 == 413) {
            ArrayList arrayList13 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_food_egg_name;
            d6.d = R.drawable.market_doha_food_egg;
            d6.f4296e = R.string.city_doha_food_egg_description;
            d6.f4297f = 10000;
        } else if (i2 == 414) {
            ArrayList arrayList14 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_food_vegetable_oil_name;
            d6.d = R.drawable.market_tehran_food_vegetable_oil;
            d6.f4296e = R.string.city_tehran_food_vegetable_oil_description;
            d6.f4297f = 10000;
        } else if (i2 == 415) {
            ArrayList arrayList15 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_food_rice_name;
            d6.d = R.drawable.market_tehran_food_rice;
            d6.f4296e = R.string.city_tehran_food_rice_description;
            d6.f4297f = 10000;
        } else if (i2 == 416) {
            ArrayList arrayList16 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_food_cream_name;
            d6.d = R.drawable.market_tripoli_food_cream;
            d6.f4296e = R.string.city_tripoli_food_cream_description;
            d6.f4297f = 50000;
        } else if (i2 == 417) {
            ArrayList arrayList17 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_food_granulated_sugar_name;
            d6.d = R.drawable.market_idlib_food_granulated_sugar;
            d6.f4296e = R.string.city_idlib_food_granulated_sugar_description;
            d6.f4297f = 50000;
        } else if (i2 == 418) {
            ArrayList arrayList18 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_food_squid_name;
            d6.d = R.drawable.market_idlib_food_squid;
            d6.f4296e = R.string.city_idlib_food_squid_description;
            d6.f4297f = 10000;
        } else if (i2 == 419) {
            ArrayList arrayList19 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_food_barbecue_sauce_name;
            d6.d = R.drawable.market_rabat_food_barbecue_sauce;
            d6.f4296e = R.string.city_rabat_food_barbecue_sauce_description;
            d6.f4297f = 10000;
        }
        d6.f4293a = i2;
        d6.f4294b = 5;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D i(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 11) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_main_grocery_ring_name;
            d6.d = R.drawable.market_main_grocery_ring;
            d6.f4296e = R.string.city_main_grocery_ring_description;
            d6.f4297f = 100000;
        } else if (i2 == 12) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_grocery_sunglasses_name;
            d6.d = R.drawable.market_main_grocery_sunglasses;
            d6.f4296e = R.string.city_main_grocery_sunglasses_description;
            d6.f4297f = 25;
        } else if (i2 == 13) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_grocery_dvd_name;
            d6.d = R.drawable.market_main_grocery_dvd;
            d6.f4296e = R.string.city_main_grocery_dvd_description;
            d6.f4297f = 30;
        } else if (i2 == 14) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_grocery_bike_name;
            d6.d = R.drawable.market_dubai_grocery_bike;
            d6.f4296e = R.string.city_dubai_grocery_bike_description;
            d6.f4297f = 20;
        } else if (i2 == 15) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_grocery_razor_name;
            d6.d = R.drawable.market_dubai_grocery_razor;
            d6.f4296e = R.string.city_dubai_grocery_razor_description;
            d6.f4297f = 250;
        } else if (i2 == 16) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_grocery_crowbar_name;
            d6.d = R.drawable.market_dubai_grocery_crowbar;
            d6.f4296e = R.string.city_dubai_grocery_crowbar_description;
            d6.f4297f = 250;
        } else if (i2 == 17) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_grocery_lighter_name;
            d6.d = R.drawable.market_gaza_grocery_lighter;
            d6.f4296e = R.string.city_gaza_grocery_lighter_description;
            d6.f4297f = 5000;
        } else if (i2 == 18) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_grocery_gasoline_name;
            d6.d = R.drawable.market_gaza_grocery_gasoline;
            d6.f4296e = R.string.city_gaza_grocery_gasoline_description;
            d6.f4297f = 2000;
        } else if (i2 == 19) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_grocery_mask_name;
            d6.d = R.drawable.market_riyadh_grocery_mask;
            d6.f4296e = R.string.city_riyadh_grocery_mask_description;
            d6.f4297f = 4500;
        } else if (i2 == 20) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_grocery_driving_license_name;
            d6.d = R.drawable.market_riyadh_grocery_driving_license;
            d6.f4296e = R.string.city_riyadh_grocery_driving_license_description;
            d6.f4297f = 1800;
        } else if (i2 == 21) {
            ArrayList arrayList11 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_grocery_computer_name;
            d6.d = R.drawable.market_riyadh_grocery_computer;
            d6.f4296e = R.string.city_riyadh_grocery_computer_description;
            d6.f4297f = 5000;
        } else if (i2 == 22) {
            ArrayList arrayList12 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_grocery_grocery_wireless_keyboard_name;
            d6.d = R.drawable.market_sanaa_grocery_wireless_keyboard;
            d6.f4296e = R.string.city_sanaa_grocery_grocery_wireless_keyboard_description;
            d6.f4297f = 1500;
        } else if (i2 == 23) {
            ArrayList arrayList13 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_grocery_tracing_device_name;
            d6.d = R.drawable.market_sanaa_grocery_tracing_device;
            d6.f4296e = R.string.city_sanaa_grocery_tracing_device_description;
            d6.f4297f = 6400;
        } else if (i2 == 24) {
            ArrayList arrayList14 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_grocery_grocery_chloroform_name;
            d6.d = R.drawable.market_cairo_grocery_chloroform;
            d6.f4296e = R.string.city_cairo_grocery_grocery_chloroform_description;
            d6.f4297f = 12000;
        } else if (i2 == 25) {
            ArrayList arrayList15 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_grocery_padlock_name;
            d6.d = R.drawable.market_cairo_grocery_padlock;
            d6.f4296e = R.string.city_cairo_grocery_padlock_description;
            d6.f4297f = 20000;
        } else if (i2 == 26) {
            ArrayList arrayList16 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_grocery_grocery_printing_paper_name;
            d6.d = R.drawable.market_doha_grocery_printing_paper;
            d6.f4296e = R.string.city_doha_grocery_grocery_printing_paper_description;
            d6.f4297f = 50;
        } else if (i2 == 27) {
            ArrayList arrayList17 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_grocery_blank_chips_name;
            d6.d = R.drawable.market_doha_grocery_blank_chips;
            d6.f4296e = R.string.city_doha_grocery_blank_chips_description;
            d6.f4297f = 200;
        } else if (i2 == 28) {
            ArrayList arrayList18 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_grocery_grocery_screwdriver_name;
            d6.d = R.drawable.market_tehran_grocery_screwdriver;
            d6.f4296e = R.string.city_tehran_grocery_grocery_screwdriver_description;
            d6.f4297f = 10000;
        } else if (i2 == 29) {
            ArrayList arrayList19 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_grocery_fake_antique_name;
            d6.d = R.drawable.market_tehran_grocery_fake_antique;
            d6.f4296e = R.string.city_tehran_grocery_fake_antique_description;
            d6.f4297f = 8000;
        } else if (i2 == 30) {
            ArrayList arrayList20 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_grocery_grocery_explosives_name;
            d6.d = R.drawable.market_tripoli_grocery_explosives;
            d6.f4296e = R.string.city_tripoli_grocery_grocery_explosives_description;
            d6.f4297f = 17000;
        } else if (i2 == 31) {
            ArrayList arrayList21 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_grocery_tape_name;
            d6.d = R.drawable.market_tripoli_grocery_tape;
            d6.f4296e = R.string.city_tripoli_grocery_tape_description;
            d6.f4297f = 50;
        } else if (i2 == 32) {
            ArrayList arrayList22 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_grocery_grocery_blank_credit_name;
            d6.d = R.drawable.market_idlib_grocery_blank_credit_card;
            d6.f4296e = R.string.city_idlib_grocery_grocery_blank_credit_description;
            d6.f4297f = 1000;
        } else if (i2 == 33) {
            ArrayList arrayList23 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_grocery_copier_name;
            d6.d = R.drawable.market_idlib_grocery_copier;
            d6.f4296e = R.string.city_idlib_grocery_copier_description;
            d6.f4297f = 3600;
        } else if (i2 == 34) {
            ArrayList arrayList24 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_grocery_grocery_wireless_transceiver_name;
            d6.d = R.drawable.market_rabat_grocery_wireless_transceiver;
            d6.f4296e = R.string.city_rabat_grocery_grocery_wireless_transceiver_description;
            d6.f4297f = 12000;
        }
        d6.f4293a = i2;
        d6.f4294b = 2;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D j(int i2, int i5, boolean z3) {
        int i6 = i2;
        D d6 = new D();
        d6.f4306q = true;
        d6.f4307r = true;
        d6.f4300k = true;
        d6.f4301l = true;
        if (i6 == 10001) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_slingshot_name;
            d6.d = R.drawable.market_main_gun_slingshot;
            d6.f4297f = 10;
            d6.f4308s = 0;
            d6.f4309t = 5;
            d6.f4310u = 14;
        } else if (i6 == 10002) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_high_heels_name;
            d6.d = R.drawable.market_main_gun_heals;
            d6.f4297f = 100;
            d6.f4308s = 0;
            d6.f4309t = 4;
            d6.f4310u = 19;
        } else if (i6 == 10003) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_brick_name;
            d6.d = R.drawable.market_main_gun_brick;
            d6.f4297f = 100;
            d6.f4308s = 0;
            d6.f4309t = 13;
            d6.f4310u = 14;
        } else if (i6 == 10004) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_pear_name;
            d6.d = R.drawable.market_main_gun_bear;
            d6.f4297f = 200;
            d6.f4308s = 0;
            d6.f4309t = 9;
            d6.f4310u = 22;
        } else if (i6 == 10005) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_leather_whip_name;
            d6.d = R.drawable.market_main_gun_leather_whip;
            d6.f4297f = 500;
            d6.f4308s = 0;
            d6.f4309t = 18;
            d6.f4310u = 17;
        } else if (i6 == 10006) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_basketball_bat_name;
            d6.d = R.drawable.market_main_gun_basketball_bat;
            d6.f4297f = 1000;
            d6.f4308s = 0;
            d6.f4309t = 15;
            d6.f4310u = 24;
        } else if (i6 == 10007) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_usp_tactical_name;
            d6.d = R.drawable.market_main_gun_usp_45;
            d6.f4297f = 2000;
            d6.f4308s = 1;
            d6.f4309t = 35;
            d6.f4310u = 9;
        } else if (i6 == 10008) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_g18_automatic_name;
            d6.d = R.drawable.market_main_gun_g18_auto;
            d6.f4297f = 3000;
            d6.f4308s = 1;
            d6.f4309t = 42;
            d6.f4310u = 5;
        } else if (i6 == 10009) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_sig_sauer_name;
            d6.d = R.drawable.market_main_gun_sig_sauer;
            d6.f4297f = 5000;
            d6.f4308s = 1;
            d6.f4309t = 44;
            d6.f4310u = 6;
        } else if (i6 == 10010) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_desert_eagle_50_name;
            d6.d = R.drawable.market_main_gun_desert_eagle;
            d6.f4297f = 8000;
            d6.f4308s = 1;
            d6.f4309t = 43;
            d6.f4310u = 10;
        } else if (i6 == 10011) {
            ArrayList arrayList11 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_m92_name;
            d6.d = R.drawable.market_main_gun_m92;
            d6.f4297f = 10000;
            d6.f4308s = 1;
            d6.f4309t = 48;
            d6.f4310u = 8;
        } else if (i6 == 10012) {
            ArrayList arrayList12 = C0597b.f8459a;
            d6.f4295c = R.string.city_main_gun_fn_five_seven_name;
            d6.d = R.drawable.market_main_gun_fn57;
            d6.f4297f = 15000;
            d6.f4308s = 1;
            d6.f4309t = 50;
            d6.f4310u = 9;
        } else if (i6 == 10013) {
            ArrayList arrayList13 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_gun_chain_whip_name;
            d6.d = R.drawable.market_dubai_gun_chain_whip;
            d6.f4297f = 70000;
            d6.f4308s = 0;
            d6.f4309t = 39;
            d6.f4310u = 36;
        } else if (i6 == 10014) {
            ArrayList arrayList14 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_gun_dual_scimitars_name;
            d6.d = R.drawable.market_dubai_gun_dual_scimitars;
            d6.f4297f = 100000;
            d6.f4308s = 0;
            d6.f4309t = 39;
            d6.f4310u = 40;
        } else if (i6 == 10015) {
            ArrayList arrayList15 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_gun_colt_m4a1_name;
            d6.d = R.drawable.market_dubai_gun_colt_m4a1;
            d6.f4297f = 150000;
            d6.f4308s = 4;
            d6.f4309t = 63;
            d6.f4310u = 23;
        } else if (i6 == 10016) {
            ArrayList arrayList16 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_gun_ak47_name;
            d6.d = R.drawable.market_dubai_gun_ak47;
            d6.f4297f = 170000;
            d6.f4308s = 4;
            d6.f4309t = 60;
            d6.f4310u = 29;
        } else if (i6 == 10017) {
            ArrayList arrayList17 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_gun_hook_shot_name;
            d6.d = R.drawable.market_dubai_gun_hook_shot;
            d6.f4297f = 10000;
            d6.f4308s = 0;
            d6.f4309t = 1;
            d6.f4310u = 1;
            d6.f4292D = 4;
            d6.f4303n = true;
        } else if (i6 == 10018) {
            ArrayList arrayList18 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_gun_steel_pipe_name;
            d6.d = R.drawable.market_gaza_gun_steel_pipe;
            d6.f4297f = 6000;
            d6.f4308s = 0;
            d6.f4309t = 30;
            d6.f4310u = 21;
        } else if (i6 == 10019) {
            ArrayList arrayList19 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_gun_switchblade_name;
            d6.d = R.drawable.market_gaza_gun_switchblade;
            d6.f4297f = 9000;
            d6.f4308s = 0;
            d6.f4309t = 36;
            d6.f4310u = 19;
        } else if (i6 == 10020) {
            ArrayList arrayList20 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_gun_benelli_m1014_name;
            d6.d = R.drawable.market_gaza_gun_benelli_m1014;
            d6.f4297f = 70000;
            d6.f4308s = 3;
            d6.f4309t = 44;
            d6.f4310u = 24;
        } else if (i6 == 10021) {
            ArrayList arrayList21 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_gun_ingram_m11_name;
            d6.d = R.drawable.market_gaza_gun_ingram_m11;
            d6.f4297f = 80000;
            d6.f4308s = 2;
            d6.f4309t = 53;
            d6.f4310u = 18;
        } else if (i6 == 10022) {
            ArrayList arrayList22 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_gun_samurai_sword_name;
            d6.d = R.drawable.market_riyadh_gun_samurai_sword;
            d6.f4297f = 200000;
            d6.f4308s = 0;
            d6.f4309t = 47;
            d6.f4310u = 44;
        } else if (i6 == 10023) {
            ArrayList arrayList23 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_gun_bayonet_name;
            d6.d = R.drawable.market_riyadh_gun_bayonet;
            d6.f4297f = 220000;
            d6.f4308s = 0;
            d6.f4309t = 36;
            d6.f4310u = 59;
        } else if (i6 == 10024) {
            ArrayList arrayList24 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_gun_g3g3_name;
            d6.d = R.drawable.market_riyadh_gun_g3a3;
            d6.f4297f = 230000;
            d6.f4308s = 4;
            d6.f4309t = 79;
            d6.f4310u = 19;
        } else if (i6 == 10025) {
            ArrayList arrayList25 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_gun_famas_f1_name;
            d6.d = R.drawable.market_riyadh_gun_famas_f1;
            d6.f4297f = 250000;
            d6.f4308s = 4;
            d6.f4309t = 72;
            d6.f4310u = 29;
        } else if (i6 == 10026) {
            ArrayList arrayList26 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_gun_rainbow_trout_name;
            d6.d = R.drawable.market_sanaa_gun_rainbow_trout;
            d6.f4297f = 20000;
            d6.f4308s = 0;
            d6.f4309t = 38;
            d6.f4310u = 29;
        } else if (i6 == 10027) {
            ArrayList arrayList27 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_gun_scimitar_name;
            d6.d = R.drawable.market_sanaa_gun_scimitar;
            d6.f4297f = 30000;
            d6.f4308s = 0;
            d6.f4309t = 37;
            d6.f4310u = 34;
        } else if (i6 == 10028) {
            ArrayList arrayList28 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_gun_fn_p90_name;
            d6.d = R.drawable.market_sanaa_gun_fn_p90;
            d6.f4297f = 110000;
            d6.f4308s = 3;
            d6.f4309t = 67;
            d6.f4310u = 13;
        } else if (i6 == 10029) {
            ArrayList arrayList29 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_gun_hk_ump_45_name;
            d6.d = R.drawable.market_sanaa_gun_hk_ump_45;
            d6.f4297f = 120000;
            d6.f4308s = 2;
            d6.f4309t = 64;
            d6.f4310u = 19;
        } else if (i6 == 10030) {
            ArrayList arrayList30 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_gun_mad_dog_atak_name;
            d6.d = R.drawable.market_cairo_gun_mad_dog_atak;
            d6.f4297f = 250000;
            d6.f4308s = 0;
            d6.f4309t = 35;
            d6.f4310u = 64;
        } else if (i6 == 10031) {
            ArrayList arrayList31 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_gun_kung_fu_axes_name;
            d6.d = R.drawable.market_cairo_gun_kung_fu_axes;
            d6.f4297f = 280000;
            d6.f4308s = 0;
            d6.f4309t = 44;
            d6.f4310u = 59;
        } else if (i6 == 10032) {
            ArrayList arrayList32 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_gun_imi_galil_name;
            d6.d = R.drawable.market_cairo_gun_imi_galil;
            d6.f4297f = 270000;
            d6.f4308s = 4;
            d6.f4309t = 88;
            d6.f4310u = 16;
        } else if (i6 == 10033) {
            ArrayList arrayList33 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_gun_steyr_scout_name;
            d6.d = R.drawable.market_cairo_gun_steyr_scout;
            d6.f4297f = 300000;
            d6.f4308s = 5;
            d6.f4309t = 53;
            d6.f4310u = 54;
        } else if (i6 == 10034) {
            ArrayList arrayList34 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_gun_naval_cutlass_sword_name;
            d6.d = R.drawable.market_doha_gun_naval_cutlass_sword;
            d6.f4297f = 120000;
            d6.f4308s = 0;
            d6.f4309t = 38;
            d6.f4310u = 45;
        } else if (i6 == 10035) {
            ArrayList arrayList35 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_gun_swiss_army_knife_name;
            d6.d = R.drawable.market_doha_gun_swiss_army_knife;
            d6.f4297f = 160000;
            d6.f4308s = 0;
            d6.f4309t = 39;
            d6.f4310u = 48;
        } else if (i6 == 10036) {
            ArrayList arrayList36 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_gun_steyr_aug_name;
            d6.d = R.drawable.market_doha_gun_steyr_aug;
            d6.f4297f = 190000;
            d6.f4308s = 4;
            d6.f4309t = 73;
            d6.f4310u = 19;
        } else if (i6 == 10037) {
            ArrayList arrayList37 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_gun_sig552_name;
            d6.d = R.drawable.market_doha_gun_sig552;
            d6.f4297f = 210000;
            d6.f4308s = 4;
            d6.f4309t = 71;
            d6.f4310u = 24;
        } else if (i6 == 10038) {
            ArrayList arrayList38 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_gun_naval_nunchucks_name;
            d6.d = R.drawable.market_tehran_gun_nunchucks;
            d6.f4297f = 2000;
            d6.f4308s = 0;
            d6.f4309t = 23;
            d6.f4310u = 20;
        } else if (i6 == 10039) {
            ArrayList arrayList39 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_gun_frying_pan_name;
            d6.d = R.drawable.market_tehran_gun_frying_pan;
            d6.f4297f = 4000;
            d6.f4308s = 0;
            d6.f4309t = 11;
            d6.f4310u = 36;
        } else if (i6 == 10040) {
            ArrayList arrayList40 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_gun_desert_eagle_napalm_name;
            d6.d = R.drawable.market_tehran_gun_desert_eagle_napalm;
            d6.f4297f = 30000;
            d6.f4308s = 1;
            d6.f4309t = 52;
            d6.f4310u = 10;
        } else if (i6 == 10041) {
            ArrayList arrayList41 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_gun_benelli_m1_super_90_name;
            d6.d = R.drawable.market_tehran_gun_benelli_m1_super_90;
            d6.f4297f = 50000;
            d6.f4308s = 3;
            d6.f4309t = 46;
            d6.f4310u = 19;
        } else if (i6 == 10042) {
            ArrayList arrayList42 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_gun_chainsaw_name;
            d6.d = R.drawable.market_tripoli_gun_chainsaw;
            d6.f4297f = 300000;
            d6.f4308s = 0;
            d6.f4309t = 48;
            d6.f4310u = 59;
        } else if (i6 == 10043) {
            ArrayList arrayList43 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_gun_ninja_claws_name;
            d6.d = R.drawable.market_tripoli_gun_ninja_claws;
            d6.f4297f = 400000;
            d6.f4308s = 0;
            d6.f4309t = 42;
            d6.f4310u = 69;
        } else if (i6 == 10044) {
            ArrayList arrayList44 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_gun_ai_l96a1_awp_name;
            d6.d = R.drawable.market_tripoli_gun_ai_l96a1_awp;
            d6.f4297f = 350000;
            d6.f4308s = 5;
            d6.f4309t = 61;
            d6.f4310u = 49;
        } else if (i6 == 10045) {
            ArrayList arrayList45 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_gun_sig_550_sniper_name;
            d6.d = R.drawable.market_tripoli_gun_sig_550_sniper;
            d6.f4297f = 400000;
            d6.f4308s = 5;
            d6.f4309t = 54;
            d6.f4310u = 59;
        } else if (i6 == 10046) {
            ArrayList arrayList46 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_gun_ice_pick_name;
            d6.d = R.drawable.market_idlib_gun_ice_pick;
            d6.f4297f = 11000;
            d6.f4308s = 0;
            d6.f4309t = 40;
            d6.f4310u = 19;
        } else if (i6 == 10047) {
            ArrayList arrayList47 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_gun_mace_name;
            d6.d = R.drawable.market_idlib_gun_mace;
            d6.f4297f = 15000;
            d6.f4308s = 0;
            d6.f4309t = 29;
            d6.f4310u = 34;
        } else if (i6 == 10048) {
            ArrayList arrayList48 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_gun_steyr_tmp_name;
            d6.d = R.drawable.market_idlib_gun_steyr_tmp;
            d6.f4297f = 90000;
            d6.f4308s = 2;
            d6.f4309t = 63;
            d6.f4310u = 11;
        } else if (i6 == 10049) {
            ArrayList arrayList49 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_gun_hk_mp5_a5_name;
            d6.d = R.drawable.market_idlib_gun_hk_mp5_a5;
            d6.f4297f = 100000;
            d6.f4308s = 2;
            d6.f4309t = 53;
            d6.f4310u = 24;
        } else if (i6 == 10050) {
            ArrayList arrayList50 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_gun_knuckle_dusters_name;
            d6.d = R.drawable.market_rabat_gun_knuckle_dusters;
            d6.f4297f = 500000;
            d6.f4308s = 0;
            d6.f4309t = 46;
            d6.f4310u = 69;
        } else if (i6 == 10051) {
            ArrayList arrayList51 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_gun_fn_minimi_para_name;
            d6.d = R.drawable.market_rabat_gun_fn_minimi_para;
            d6.f4297f = 450000;
            d6.f4308s = 6;
            d6.f4309t = 99;
            d6.f4310u = 15;
        } else if (i6 == 10052) {
            ArrayList arrayList52 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_gun_flamethrower_name;
            d6.d = R.drawable.market_rabat_gun_flamethrower;
            d6.f4297f = 500000;
            d6.f4308s = 7;
            d6.f4309t = 90;
            d6.f4310u = 29;
        } else if (i6 == 10053) {
            ArrayList arrayList53 = C0597b.f8459a;
            d6.f4295c = R.string.gun_grim_reaper;
            d6.d = R.drawable.gun_grim_reaper;
            d6.f4297f = 2;
            d6.f4308s = 5;
            d6.f4309t = 150;
            d6.f4310u = 15;
            d6.f4292D = 8;
            d6.f4303n = true;
        } else if (i6 == 10054) {
            ArrayList arrayList54 = C0597b.f8459a;
            d6.f4295c = R.string.gun_candy_cane;
            d6.d = R.drawable.gun_candy_cane;
            d6.f4297f = 2;
            d6.f4308s = 0;
            d6.f4309t = 90;
            d6.f4310u = 80;
            d6.f4292D = 10;
            d6.f4303n = true;
        } else if (i6 == 10055) {
            ArrayList arrayList55 = C0597b.f8459a;
            d6.f4295c = R.string.gun_light_saber;
            d6.d = R.drawable.gun_light_saber;
            d6.f4297f = 2;
            d6.f4308s = 0;
            d6.f4309t = 100;
            d6.f4310u = 100;
            d6.f4292D = 12;
            d6.f4303n = true;
        } else if (i6 == 10056) {
            ArrayList arrayList56 = C0597b.f8459a;
            d6.f4295c = R.string.gun_champion_gloves;
            d6.d = R.drawable.gun_champion_gloves;
            d6.f4297f = 2;
            d6.f4308s = 0;
            d6.f4309t = 110;
            d6.f4310u = 110;
            d6.f4292D = 12;
            d6.f4303n = true;
        } else if (i6 == 10057) {
            ArrayList arrayList57 = C0597b.f8459a;
            d6.f4295c = R.string.gun_white_ivory;
            d6.d = R.drawable.gun_white_ivory;
            d6.f4297f = 2;
            d6.f4308s = 1;
            d6.f4309t = 120;
            d6.f4310u = 110;
            d6.f4292D = 14;
            d6.f4303n = true;
        }
        d6.f4293a = i6;
        d6.f4294b = 0;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D k(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4300k = true;
        d6.f4301l = true;
        if (i2 == 601) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_herbs_ketamine_name;
            d6.d = R.drawable.market_dubai_herb_ketamine;
            d6.f4296e = R.string.city_dubai_herbs_ketamine_description;
            d6.f4297f = 5000;
        } else if (i2 == 602) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_herbs_shroom_name;
            d6.d = R.drawable.market_gaza_herb_shrooms;
            d6.f4296e = R.string.city_gaza_herbs_shroom_description;
            d6.f4297f = 5000;
        } else if (i2 == 603) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_herbs_red_bull_name;
            d6.d = R.drawable.market_riyadh_herb_red_bull;
            d6.f4296e = R.string.city_riyadh_herbs_red_bull_description;
            d6.f4297f = 150000;
        } else if (i2 == 604) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_herbs_speed_name;
            d6.d = R.drawable.market_sanaa_herb_speed;
            d6.f4296e = R.string.city_sanaa_herbs_speed_description;
            d6.f4297f = 5000;
        } else if (i2 == 605) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_herbs_ayahuasca_name;
            d6.d = R.drawable.market_cairo_herb_ayahuasca;
            d6.f4296e = R.string.city_cairo_herbs_ayahuasca_description;
            d6.f4297f = 200000;
        } else if (i2 == 606) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_herbs_lsd_name;
            d6.d = R.drawable.market_doha_herb_lsd;
            d6.f4296e = R.string.city_doha_herbs_lsd_description;
            d6.f4297f = 10000;
        } else if (i2 == 607) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_herbs_kave_cola_name;
            d6.d = R.drawable.market_tehran_herb_kava_cola;
            d6.f4296e = R.string.city_tehran_herbs_kave_cola_description;
            d6.f4297f = 5000;
        } else if (i2 == 608) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_herbs_willow_bark_name;
            d6.d = R.drawable.market_tripoli_herb_willow_bark;
            d6.f4296e = R.string.city_tripoli_herbs_willow_bark_description;
            d6.f4297f = 200000;
        } else if (i2 == 609) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_herbs_protective_oil_name;
            d6.d = R.drawable.market_idlib_herb_protective_oil;
            d6.f4296e = R.string.city_idlib_herbs_protective_oil_description;
            d6.f4297f = 5000;
        } else if (i2 == 610) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_herbs_ginseng_name;
            d6.d = R.drawable.market_rabat_herb_ginseng;
            d6.f4296e = R.string.city_rabat_herbs_ginseng_description;
            d6.f4297f = 500000;
        }
        d6.f4293a = i2;
        d6.f4294b = 10;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D l(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 201) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_main_pharmacy_stickers_name;
            d6.d = R.drawable.market_main_medicine;
            d6.f4296e = R.string.city_main_pharmacy_stickers_description;
            d6.f4297f = 200;
        } else if (i2 == 202) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_pharmacy_first_aid_kit_name;
            d6.d = R.drawable.market_dubai_medicine;
            d6.f4296e = R.string.city_dubai_pharmacy_first_aid_kit_description;
            d6.f4297f = 1000;
        } else if (i2 == 203) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_pharmacy_penicillin_name;
            d6.d = R.drawable.market_idlib_pharamcy_penicillin;
            d6.f4296e = R.string.city_idlib_pharmacy_penicillin_description;
            d6.f4297f = 10000;
        }
        d6.f4293a = i2;
        d6.f4294b = 3;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D m(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 4001) {
            d6.f4295c = C0597b.R6;
            d6.d = C0597b.T6;
            d6.f4296e = C0597b.S6;
            d6.f4297f = 5000;
        } else if (i2 == 4002) {
            d6.f4295c = C0597b.U6;
            d6.d = C0597b.W6;
            d6.f4296e = C0597b.V6;
            d6.f4297f = 10000;
        } else if (i2 == 4003) {
            d6.f4295c = C0597b.X6;
            d6.d = C0597b.Z6;
            d6.f4296e = C0597b.Y6;
            d6.f4297f = 10000;
        }
        d6.f4293a = i2;
        d6.f4294b = 17;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D n(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4300k = true;
        d6.f4301l = true;
        if (i2 == 5001) {
            d6.f4295c = C0597b.a7;
            d6.d = C0597b.c7;
            d6.f4296e = C0597b.b7;
            d6.f4297f = 10000;
        } else if (i2 == 5002) {
            d6.f4295c = C0597b.d7;
            d6.d = C0597b.f7;
            d6.f4296e = C0597b.e7;
            d6.f4297f = 10000;
        } else if (i2 == 5003) {
            d6.f4295c = C0597b.g7;
            d6.d = C0597b.i7;
            d6.f4296e = C0597b.h7;
            d6.f4297f = 10000;
        } else if (i2 == 5004) {
            d6.f4295c = C0597b.j7;
            d6.d = C0597b.l7;
            d6.f4296e = C0597b.k7;
            d6.f4297f = 10000;
        } else if (i2 == 5005) {
            d6.f4295c = C0597b.m7;
            d6.d = C0597b.o7;
            d6.f4296e = C0597b.n7;
            d6.f4297f = 10000;
        }
        d6.f4293a = i2;
        d6.f4294b = 18;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D o(int i2, int i5, boolean z3) {
        int i6 = i2;
        D d6 = new D();
        d6.f4301l = false;
        d6.f4297f = 2;
        if (i6 == 2001) {
            d6.f4295c = C0597b.f8307B1;
            d6.d = C0597b.f8321D1;
            d6.f4296e = C0597b.f8314C1;
            d6.f4290B = 50;
            d6.f4291C = 500;
            d6.f4300k = true;
        } else if (i6 == 2002) {
            d6.f4295c = C0597b.f8327E1;
            d6.d = C0597b.f8340G1;
            d6.f4296e = C0597b.f8333F1;
            d6.f4290B = 50;
            d6.f4291C = 500;
            d6.f4300k = true;
        } else if (i6 == 2003) {
            d6.f4295c = C0597b.f8347H1;
            d6.d = C0597b.f8361J1;
            d6.f4296e = C0597b.f8354I1;
            d6.f4290B = 100;
            d6.f4291C = 1000;
            d6.f4300k = true;
        } else if (i6 == 2004) {
            d6.f4295c = C0597b.f8367K1;
            d6.d = C0597b.f8380M1;
            d6.f4296e = C0597b.f8373L1;
            d6.f4290B = 50;
            d6.f4291C = 500;
            d6.f4300k = true;
        } else if (i6 == 2005) {
            d6.f4295c = C0597b.f8387N1;
            d6.d = C0597b.f8398P1;
            d6.f4296e = C0597b.f8393O1;
            d6.f4290B = 50;
            d6.f4291C = 500;
            d6.f4300k = true;
        } else if (i6 == 2006) {
            d6.f4295c = C0597b.f8404Q1;
            d6.d = C0597b.f8416S1;
            d6.f4296e = C0597b.f8410R1;
            d6.f4290B = 50;
            d6.f4291C = 500;
            d6.f4300k = true;
        } else if (i6 == 2007) {
            d6.f4295c = C0597b.f8422T1;
            d6.d = C0597b.f8434V1;
            d6.f4296e = C0597b.f8428U1;
            d6.f4290B = 50;
            d6.f4291C = 500;
            d6.f4300k = true;
        } else if (i6 == 2008) {
            d6.f4295c = C0597b.f8440W1;
            d6.d = C0597b.f8450Y1;
            d6.f4296e = C0597b.f8445X1;
            d6.f4290B = 200;
            d6.f4291C = 2000;
            d6.f4300k = true;
        } else if (i6 == 2009) {
            d6.f4295c = C0597b.f8455Z1;
            d6.d = C0597b.f8469b2;
            d6.f4296e = C0597b.f8462a2;
            d6.f4290B = 500;
            d6.f4291C = 5000;
            d6.f4300k = true;
        } else if (i6 == 2010) {
            d6.f4295c = C0597b.f8476c2;
            d6.d = C0597b.f8488e2;
            d6.f4296e = C0597b.f8481d2;
            d6.f4290B = 200;
            d6.f4291C = 2000;
            d6.f4300k = true;
        } else if (i6 == 2011) {
            d6.f4295c = C0597b.f8495f2;
            d6.d = C0597b.f8505h2;
            d6.f4296e = C0597b.f8500g2;
            d6.f4290B = 100;
            d6.f4300k = true;
        } else if (i6 == 2012) {
            d6.f4295c = C0597b.i2;
            d6.d = C0597b.f8524k2;
            d6.f4296e = C0597b.f8517j2;
            d6.f4290B = 800;
            d6.f4300k = true;
        } else if (i6 == 2013) {
            d6.f4295c = C0597b.f8531l2;
            d6.d = C0597b.n2;
            d6.f4296e = C0597b.f8538m2;
            d6.f4290B = 100;
            d6.f4300k = true;
        } else if (i6 == 2014) {
            d6.f4295c = C0597b.f8551o2;
            d6.d = C0597b.f8565q2;
            d6.f4296e = C0597b.f8558p2;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2015) {
            d6.f4295c = C0597b.f8572r2;
            d6.d = C0597b.f8585t2;
            d6.f4296e = C0597b.f8578s2;
            d6.f4290B = 1499;
            d6.f4300k = true;
        } else if (i6 == 2016) {
            d6.f4295c = C0597b.f8592u2;
            d6.d = C0597b.f8606w2;
            d6.f4296e = C0597b.f8599v2;
            d6.f4290B = 1999;
            d6.f4300k = true;
        } else if (i6 == 2017) {
            d6.f4295c = C0597b.f8613x2;
            d6.d = C0597b.f8627z2;
            d6.f4296e = C0597b.f8620y2;
            d6.f4290B = 5;
            d6.f4291C = 50;
            d6.f4300k = true;
        } else if (i6 == 2018) {
            d6.f4295c = C0597b.f8301A2;
            d6.d = C0597b.f8315C2;
            d6.f4296e = C0597b.f8308B2;
            d6.f4290B = 25;
            d6.f4291C = 250;
            d6.f4300k = true;
        } else if (i6 == 2019) {
            d6.f4295c = C0597b.f8322D2;
            d6.d = C0597b.f8334F2;
            d6.f4296e = C0597b.f8328E2;
            d6.f4290B = 1000;
            d6.f4300k = true;
        } else if (i6 == 2020) {
            d6.f4295c = C0597b.f8341G2;
            d6.d = C0597b.f8355I2;
            d6.f4296e = C0597b.f8348H2;
            d6.f4290B = 25;
            d6.f4291C = 250;
            d6.f4300k = true;
        } else if (i6 == 2021) {
            d6.f4295c = C0597b.f8362J2;
            d6.d = C0597b.f8374L2;
            d6.f4296e = C0597b.f8368K2;
            d6.f4290B = 25;
            d6.f4300k = true;
        } else if (i6 == 2022) {
            d6.f4295c = C0597b.f8381M2;
            d6.d = C0597b.f8394O2;
            d6.f4296e = C0597b.f8388N2;
            d6.f4290B = 20;
        } else if (i6 == 2023) {
            d6.f4295c = C0597b.f8399P2;
            d6.d = C0597b.f8411R2;
            d6.f4296e = C0597b.f8405Q2;
            d6.f4290B = 30;
        } else if (i6 == 2024) {
            d6.f4295c = C0597b.f8417S2;
            d6.d = C0597b.f8429U2;
            d6.f4296e = C0597b.f8423T2;
            d6.f4290B = 50;
        } else if (i6 == 2025) {
            d6.f4295c = C0597b.f8435V2;
            d6.d = C0597b.f8446X2;
            d6.f4296e = C0597b.f8441W2;
            d6.f4290B = 200;
        } else if (i6 == 2026) {
            d6.f4295c = C0597b.f8451Y2;
            d6.d = C0597b.f8463a3;
            d6.f4296e = C0597b.f8456Z2;
            d6.f4290B = 50;
            d6.f4300k = true;
            d6.f4301l = true;
        } else if (i6 == 2027) {
            d6.f4295c = C0597b.f8470b3;
            d6.d = C0597b.f8482d3;
            d6.f4296e = C0597b.c3;
            d6.f4290B = 300;
            d6.f4300k = true;
            d6.f4301l = true;
        } else if (i6 == 2028) {
            d6.f4295c = C0597b.f8489e3;
            d6.d = C0597b.f8501g3;
            d6.f4296e = C0597b.f8496f3;
            d6.f4290B = 1000;
            d6.f4300k = true;
            d6.f4301l = true;
        } else if (i6 == 2029) {
            d6.f4295c = C0597b.f8506h3;
            d6.d = C0597b.f8518j3;
            d6.f4296e = C0597b.f8512i3;
            d6.f4290B = 10000;
            d6.f4300k = true;
            d6.f4301l = true;
        } else if (i6 == 2030) {
            d6.f4295c = C0597b.f8525k3;
            d6.d = C0597b.f8539m3;
            d6.f4296e = C0597b.f8532l3;
            d6.f4290B = 1000;
            d6.f4300k = true;
        } else if (i6 == 2031) {
            d6.f4295c = C0597b.f8545n3;
            d6.d = C0597b.f8559p3;
            d6.f4296e = C0597b.f8552o3;
            d6.f4290B = 500;
            d6.f4300k = true;
        } else if (i6 == 2032) {
            d6.f4295c = C0597b.f8566q3;
            d6.d = C0597b.f8579s3;
            d6.f4296e = C0597b.f8573r3;
            d6.f4290B = 250;
            d6.f4300k = true;
        } else if (i6 == 2033) {
            d6.f4295c = C0597b.f8586t3;
            d6.d = C0597b.f8600v3;
            d6.f4296e = C0597b.f8593u3;
            d6.f4290B = 250;
            d6.f4300k = true;
        } else if (i6 == 2034) {
            d6.f4295c = C0597b.f8607w3;
            d6.d = C0597b.f8621y3;
            d6.f4296e = C0597b.f8614x3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2035) {
            d6.f4295c = C0597b.z3;
            d6.d = C0597b.f8309B3;
            d6.f4296e = C0597b.f8302A3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2036) {
            d6.f4295c = C0597b.f8316C3;
            d6.d = C0597b.f8329E3;
            d6.f4296e = C0597b.f8323D3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2037) {
            d6.f4295c = C0597b.f8335F3;
            d6.d = C0597b.f8349H3;
            d6.f4296e = C0597b.f8342G3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2038) {
            d6.f4295c = C0597b.f8356I3;
            d6.d = C0597b.f8369K3;
            d6.f4296e = C0597b.f8363J3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2039) {
            d6.f4295c = C0597b.f8375L3;
            d6.d = C0597b.f8389N3;
            d6.f4296e = C0597b.f8382M3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2040) {
            d6.f4295c = C0597b.O3;
            d6.d = C0597b.f8406Q3;
            d6.f4296e = C0597b.f8400P3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2041) {
            d6.f4295c = C0597b.f8412R3;
            d6.d = C0597b.f8424T3;
            d6.f4296e = C0597b.f8418S3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2042) {
            d6.f4295c = C0597b.f8430U3;
            d6.d = C0597b.f8442W3;
            d6.f4296e = C0597b.f8436V3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2043) {
            d6.f4295c = C0597b.X3;
            d6.d = C0597b.f8457Z3;
            d6.f4296e = C0597b.Y3;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2044) {
            d6.f4295c = C0597b.f8464a4;
            d6.d = C0597b.f8477c4;
            d6.f4296e = C0597b.f8471b4;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2045) {
            d6.f4295c = C0597b.f8483d4;
            d6.d = C0597b.f8497f4;
            d6.f4296e = C0597b.f8490e4;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2046) {
            d6.f4295c = C0597b.f8502g4;
            d6.d = C0597b.f8513i4;
            d6.f4296e = C0597b.f8507h4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2047) {
            d6.f4295c = C0597b.f8519j4;
            d6.d = C0597b.f8533l4;
            d6.f4296e = C0597b.f8526k4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2048) {
            d6.f4295c = C0597b.f8540m4;
            d6.d = C0597b.f8553o4;
            d6.f4296e = C0597b.f8546n4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2049) {
            d6.f4295c = C0597b.f8560p4;
            d6.d = C0597b.f8574r4;
            d6.f4296e = C0597b.f8567q4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2050) {
            d6.f4295c = C0597b.f8580s4;
            d6.d = C0597b.f8594u4;
            d6.f4296e = C0597b.f8587t4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2051) {
            d6.f4295c = C0597b.f8601v4;
            d6.d = C0597b.f8615x4;
            d6.f4296e = C0597b.f8608w4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2052) {
            d6.f4295c = C0597b.f8622y4;
            d6.d = C0597b.f8303A4;
            d6.f4296e = C0597b.z4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2053) {
            d6.f4295c = C0597b.f8310B4;
            d6.d = C0597b.D4;
            d6.f4296e = C0597b.f8317C4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2054) {
            d6.f4295c = C0597b.f8330E4;
            d6.d = C0597b.f8343G4;
            d6.f4296e = C0597b.f8336F4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2055) {
            d6.f4295c = C0597b.f8350H4;
            d6.d = C0597b.f8364J4;
            d6.f4296e = C0597b.f8357I4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2056) {
            d6.f4295c = C0597b.f8370K4;
            d6.d = C0597b.f8383M4;
            d6.f4296e = C0597b.f8376L4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2057) {
            d6.f4295c = C0597b.f8390N4;
            d6.d = C0597b.f8401P4;
            d6.f4296e = C0597b.f8395O4;
            d6.f4290B = 999;
            d6.f4300k = true;
        } else if (i6 == 2058) {
            d6.f4295c = C0597b.f8407Q4;
            d6.d = C0597b.f8419S4;
            d6.f4296e = C0597b.f8413R4;
            d6.f4290B = 399;
            d6.f4300k = true;
        } else if (i6 == 2059) {
            d6.f4295c = C0597b.f8425T4;
            d6.d = C0597b.f8437V4;
            d6.f4296e = C0597b.f8431U4;
            d6.f4290B = 699;
            d6.f4300k = true;
        } else if (i6 == 2060) {
            d6.f4295c = C0597b.f8443W4;
            d6.d = C0597b.f8452Y4;
            d6.f4296e = C0597b.f8447X4;
            d6.f4290B = 1599;
            d6.f4300k = true;
        } else if (i6 == 2061) {
            d6.f4295c = C0597b.f8458Z4;
            d6.d = C0597b.f8472b5;
            d6.f4296e = C0597b.f8465a5;
            d6.f4290B = 4999;
            d6.f4300k = true;
        } else if (i6 == 2062) {
            d6.f4295c = C0597b.f8478c5;
            d6.d = C0597b.f8491e5;
            d6.f4296e = C0597b.f8484d5;
            d6.f4290B = 6999;
            d6.f4300k = true;
        } else if (i6 == 2063) {
            d6.f4295c = C0597b.f8498f5;
            d6.d = C0597b.f8508h5;
            d6.f4296e = C0597b.g5;
            d6.f4290B = 14999;
            d6.f4300k = true;
        } else if (i6 == 2064) {
            d6.f4295c = C0597b.i5;
            d6.d = C0597b.f8527k5;
            d6.f4296e = C0597b.f8520j5;
            d6.f4290B = 24999;
            d6.f4300k = true;
        } else if (i6 == 2065) {
            d6.f4295c = C0597b.f8534l5;
            d6.d = C0597b.f8547n5;
            d6.f4296e = C0597b.f8541m5;
            d6.f4290B = 29999;
            d6.f4300k = true;
        } else if (i6 == 2066) {
            d6.f4295c = C0597b.f8554o5;
            d6.d = C0597b.f8568q5;
            d6.f4296e = C0597b.f8561p5;
            d6.f4290B = 39999;
            d6.f4300k = true;
        } else if (i6 == 2067) {
            d6.f4295c = C0597b.f8575r5;
            d6.d = C0597b.f8588t5;
            d6.f4296e = C0597b.f8581s5;
            d6.f4290B = 59999;
            d6.f4300k = true;
        } else if (i6 == 2068) {
            d6.f4295c = C0597b.f8595u5;
            d6.d = C0597b.f8609w5;
            d6.f4296e = C0597b.f8602v5;
            d6.f4290B = 79999;
            d6.f4300k = true;
        } else if (i6 == 2069) {
            d6.f4295c = C0597b.f8616x5;
            d6.d = C0597b.z5;
            d6.f4296e = C0597b.f8623y5;
            d6.f4290B = 99999;
            d6.f4300k = true;
        } else if (i6 == 2070) {
            d6.f4295c = C0597b.f8304A5;
            d6.d = C0597b.f8318C5;
            d6.f4296e = C0597b.f8311B5;
            d6.f4290B = 399;
            d6.f4300k = true;
        } else if (i6 == 2071) {
            d6.f4295c = C0597b.f8324D5;
            d6.d = C0597b.f8337F5;
            d6.f4296e = C0597b.f8331E5;
            d6.f4290B = 699;
            d6.f4300k = true;
        } else if (i6 == 2072) {
            d6.f4295c = C0597b.f8344G5;
            d6.d = C0597b.f8358I5;
            d6.f4296e = C0597b.f8351H5;
            d6.f4290B = 1599;
            d6.f4300k = true;
        } else if (i6 == 2073) {
            d6.f4295c = C0597b.J5;
            d6.d = C0597b.f8377L5;
            d6.f4296e = C0597b.f8371K5;
            d6.f4290B = 2999;
            d6.f4300k = true;
        } else if (i6 == 2074) {
            d6.f4295c = C0597b.f8384M5;
            d6.d = C0597b.O5;
            d6.f4296e = C0597b.f8391N5;
            d6.f4290B = 3999;
            d6.f4300k = true;
        } else if (i6 == 2075) {
            d6.f4295c = C0597b.P5;
            d6.d = C0597b.R5;
            d6.f4296e = C0597b.Q5;
            d6.f4290B = 9999;
            d6.f4300k = true;
        } else if (i6 == 2076) {
            d6.f4295c = C0597b.S5;
            d6.d = C0597b.U5;
            d6.f4296e = C0597b.T5;
            d6.f4290B = 19999;
            d6.f4300k = true;
        } else if (i6 == 2077) {
            d6.f4295c = C0597b.V5;
            d6.d = C0597b.X5;
            d6.f4296e = C0597b.W5;
            d6.f4290B = 26999;
            d6.f4300k = true;
        } else if (i6 == 2078) {
            d6.f4295c = C0597b.Y5;
            d6.d = C0597b.a6;
            d6.f4296e = C0597b.Z5;
            d6.f4290B = 29999;
            d6.f4300k = true;
        } else if (i6 == 2079) {
            d6.f4295c = C0597b.b6;
            d6.d = C0597b.d6;
            d6.f4296e = C0597b.c6;
            d6.f4290B = 39999;
            d6.f4300k = true;
        } else if (i6 == 2080) {
            d6.f4295c = C0597b.e6;
            d6.d = C0597b.g6;
            d6.f4296e = C0597b.f6;
            d6.f4290B = 49999;
            d6.f4300k = true;
        } else if (i6 == 2081) {
            d6.f4295c = C0597b.h6;
            d6.d = C0597b.j6;
            d6.f4296e = C0597b.i6;
            d6.f4290B = 69999;
            d6.f4300k = true;
        } else if (i6 == 2082) {
            d6.f4295c = C0597b.k6;
            d6.d = C0597b.m6;
            d6.f4296e = C0597b.l6;
            d6.f4290B = 99;
            d6.f4300k = true;
        } else if (i6 == 2083) {
            d6.f4295c = C0597b.n6;
            d6.d = C0597b.p6;
            d6.f4296e = C0597b.o6;
            d6.f4290B = 49;
            d6.f4300k = true;
        } else if (i6 == 2084) {
            d6.f4295c = C0597b.q6;
            d6.d = C0597b.s6;
            d6.f4296e = C0597b.r6;
            d6.f4290B = 19999;
            d6.f4300k = true;
        } else if (i6 == 2085) {
            d6.f4295c = C0597b.t6;
            d6.d = C0597b.v6;
            d6.f4296e = C0597b.u6;
            d6.f4290B = 19999;
            d6.f4300k = true;
        } else if (i6 == 2086) {
            d6.f4295c = C0597b.w6;
            d6.d = C0597b.y6;
            d6.f4296e = C0597b.x6;
            d6.f4290B = 24999;
            d6.f4300k = true;
        } else if (i6 == 2087) {
            d6.f4295c = C0597b.z6;
            d6.d = C0597b.B6;
            d6.f4296e = C0597b.A6;
            d6.f4290B = 24999;
            d6.f4300k = true;
        }
        d6.f4293a = i6;
        d6.f4294b = 7;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D p(int i2, int i5, boolean z3) {
        int i6 = i2;
        D d6 = new D();
        d6.f4301l = true;
        d6.f4300k = true;
        if (i6 == 30001) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.special_equipment_bag_small;
            d6.d = R.drawable.special_equipment_bag_small;
            d6.f4313x = 0;
            d6.f4314y = 5;
            d6.f4315z = C0597b.f8459a;
            d6.f4289A = C0597b.f8466b;
            d6.f4297f = 500000;
        } else if (i6 == 30002) {
            d6.f4295c = C0597b.f8473c;
            d6.d = C0597b.d;
            d6.f4313x = 0;
            d6.f4314y = 10;
            d6.f4315z = C0597b.f8485e;
            d6.f4289A = C0597b.f8492f;
            d6.f4297f = 1000000;
        } else if (i6 == 30003) {
            d6.f4295c = C0597b.g;
            d6.d = C0597b.h;
            d6.f4313x = 0;
            d6.f4314y = 30;
            d6.f4315z = C0597b.f8509i;
            d6.f4289A = C0597b.f8514j;
            d6.f4297f = 5000000;
        } else if (i6 == 30004) {
            d6.f4295c = C0597b.f8521k;
            d6.d = C0597b.f8528l;
            d6.f4313x = 0;
            d6.f4314y = 20;
            d6.f4315z = C0597b.f8535m;
            d6.f4289A = C0597b.f8542n;
            d6.f4297f = 3000000;
        } else if (i6 == 30005) {
            d6.f4295c = C0597b.f8548o;
            d6.d = C0597b.f8555p;
            d6.f4313x = 0;
            d6.f4314y = 100;
            d6.f4315z = C0597b.f8562q;
            d6.f4289A = C0597b.f8569r;
            d6.f4297f = 10000000;
            d6.f4290B = 1000;
        } else if (i6 == 30006) {
            d6.f4295c = C0597b.f8576s;
            d6.d = C0597b.f8582t;
            d6.f4313x = 1;
            d6.f4314y = 5;
            d6.f4315z = C0597b.f8589u;
            d6.f4289A = C0597b.f8596v;
            d6.f4297f = 50000;
        } else if (i6 == 30007) {
            d6.f4295c = C0597b.f8603w;
            d6.d = C0597b.f8610x;
            d6.f4313x = 1;
            d6.f4314y = 5;
            d6.f4315z = C0597b.f8617y;
            d6.f4289A = C0597b.f8624z;
            d6.f4297f = 50000;
        } else if (i6 == 30008) {
            d6.f4295c = C0597b.f8298A;
            d6.d = C0597b.f8305B;
            d6.f4313x = 1;
            d6.f4314y = 20;
            d6.f4315z = C0597b.f8312C;
            d6.f4289A = C0597b.f8319D;
            d6.f4297f = 100000;
        } else if (i6 == 30009) {
            d6.f4295c = C0597b.f8325E;
            d6.d = C0597b.F;
            d6.f4313x = 1;
            d6.f4314y = 100;
            d6.f4315z = C0597b.f8338G;
            d6.f4289A = C0597b.f8345H;
            d6.f4297f = 500000;
        } else if (i6 == 30010) {
            d6.f4295c = C0597b.f8352I;
            d6.d = C0597b.f8359J;
            d6.f4313x = 2;
            d6.f4314y = 10;
            d6.f4315z = C0597b.f8365K;
            d6.f4289A = C0597b.f8372L;
            d6.f4297f = 500000;
        } else if (i6 == 30011) {
            d6.f4295c = C0597b.f8378M;
            d6.d = C0597b.f8385N;
            d6.f4313x = 2;
            d6.f4314y = 100;
            d6.f4315z = C0597b.f8392O;
            d6.f4289A = C0597b.f8396P;
            d6.f4297f = 1000000;
        } else if (i6 == 30012) {
            d6.f4295c = C0597b.f8402Q;
            d6.d = C0597b.f8408R;
            d6.f4313x = 2;
            d6.f4314y = 300;
            d6.f4315z = C0597b.f8414S;
            d6.f4289A = C0597b.f8420T;
            d6.f4297f = 500000;
        } else if (i6 == 30013) {
            d6.f4295c = C0597b.f8426U;
            d6.d = C0597b.f8432V;
            d6.f4313x = 2;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8438W;
            d6.f4289A = C0597b.f8444X;
            d6.f4297f = 1000000;
        } else if (i6 == 30014) {
            d6.f4295c = C0597b.f8448Y;
            d6.d = C0597b.f8453Z;
            d6.f4313x = 2;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8460a0;
            d6.f4289A = C0597b.f8467b0;
            d6.f4297f = 50000000;
        } else if (i6 == 30015) {
            d6.f4295c = C0597b.f8474c0;
            d6.d = C0597b.f8479d0;
            d6.f4313x = 2;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8486e0;
            d6.f4289A = C0597b.f8493f0;
            d6.f4297f = 50000000;
        } else if (i6 == 30016) {
            d6.f4295c = C0597b.f8499g0;
            d6.d = C0597b.f8503h0;
            d6.f4313x = 1;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8510i0;
            d6.f4289A = C0597b.f8515j0;
            d6.f4297f = 50000000;
        } else if (i6 == 30017) {
            d6.f4295c = C0597b.f8522k0;
            d6.d = C0597b.f8529l0;
            d6.f4313x = 0;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8536m0;
            d6.f4289A = C0597b.f8543n0;
            d6.f4297f = 2000000;
            d6.f4290B = 3500;
        } else if (i6 == 30018) {
            d6.f4295c = C0597b.f8549o0;
            d6.d = C0597b.f8556p0;
            d6.f4313x = 2;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8563q0;
            d6.f4289A = C0597b.f8570r0;
            d6.f4297f = 20000000;
            d6.f4290B = 10000;
        } else if (i6 == 30019) {
            d6.f4295c = C0597b.s0;
            d6.d = C0597b.f8583t0;
            d6.f4313x = 2;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8590u0;
            d6.f4289A = C0597b.f8597v0;
            d6.f4297f = 40000000;
            d6.f4290B = 20000;
        } else if (i6 == 30020) {
            d6.f4295c = C0597b.f8604w0;
            d6.d = C0597b.f8611x0;
            d6.f4313x = 0;
            d6.f4314y = 500;
            d6.f4315z = C0597b.f8618y0;
            d6.f4289A = C0597b.f8625z0;
            d6.f4297f = 2;
            d6.f4290B = 2;
        } else if (i6 == 30021) {
            d6.f4295c = C0597b.f8299A0;
            d6.d = C0597b.f8306B0;
            d6.f4313x = 1;
            d6.f4314y = 1000;
            d6.f4315z = C0597b.f8313C0;
            d6.f4289A = C0597b.f8320D0;
            d6.f4297f = 2;
            d6.f4290B = 2;
        } else if (i6 == 30022) {
            d6.f4295c = C0597b.f8326E0;
            d6.d = C0597b.f8332F0;
            d6.f4313x = 2;
            d6.f4314y = 1000;
            d6.f4315z = C0597b.f8339G0;
            d6.f4289A = C0597b.f8346H0;
            d6.f4297f = 2;
            d6.f4290B = 2;
        }
        d6.f4293a = i6;
        d6.f4294b = 15;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D q(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 501) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_specialties_electronics_name;
            d6.d = R.drawable.market_dubai_specialties_electronics;
            d6.f4296e = R.string.city_dubai_specialties_electronics_description;
            d6.f4297f = 45000;
        } else if (i2 == 502) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_specialties_blueberry_name;
            d6.d = R.drawable.market_dubai_specialties_blueberry;
            d6.f4296e = R.string.city_dubai_specialties_blueberry_description;
            d6.f4297f = 21000;
        } else if (i2 == 503) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_specialties_american_ginseng_name;
            d6.d = R.drawable.market_dubai_specialties_ginseng;
            d6.f4296e = R.string.city_dubai_specialties_american_ginseng_description;
            d6.f4297f = 13000;
        } else if (i2 == 504) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_specialties_pottery_name;
            d6.d = R.drawable.market_gaza_specialties_pottery;
            d6.f4296e = R.string.city_gaza_specialties_pottery_description;
            d6.f4297f = 95000;
        } else if (i2 == 505) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_specialties_tea_leaves_name;
            d6.d = R.drawable.market_gaza_specialties_tea_leaves;
            d6.f4296e = R.string.city_gaza_specialties_tea_leaves_description;
            d6.f4297f = 20000;
        } else if (i2 == 506) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_specialties_silk_name;
            d6.d = R.drawable.market_gaza_specialties_silk;
            d6.f4296e = R.string.city_gaza_specialties_silk_description;
            d6.f4297f = 30000;
        } else if (i2 == 507) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_specialties_gundam_model_name;
            d6.d = R.drawable.market_riyadh_specialties_gundam_model;
            d6.f4296e = R.string.city_riyadh_specialties_gundam_model_description;
            d6.f4297f = 13000;
        } else if (i2 == 508) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_specialties_sashimi_name;
            d6.d = R.drawable.market_riyadh_specialties_sashimi;
            d6.f4296e = R.string.city_riyadh_specialties_sashimi_description;
            d6.f4297f = 30000;
        } else if (i2 == 509) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_specialties_kimono_name;
            d6.d = R.drawable.market_riyadh_specialties_kimono;
            d6.f4296e = R.string.city_riyadh_specialties_kimono_description;
            d6.f4297f = 26000;
        } else if (i2 == 510) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_specialties_tequila_name;
            d6.d = R.drawable.market_sanaa_specialties_tequila;
            d6.f4296e = R.string.city_sanaa_specialties_tequila_description;
            d6.f4297f = 38000;
        } else if (i2 == 511) {
            ArrayList arrayList11 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_specialties_leather_carving_name;
            d6.d = R.drawable.market_sanaa_specialties_leather_carving;
            d6.f4296e = R.string.city_sanaa_specialties_leather_carving_description;
            d6.f4297f = 53000;
        } else if (i2 == 512) {
            ArrayList arrayList12 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_specialties_silverware_name;
            d6.d = R.drawable.market_sanaa_specialties_silverware;
            d6.f4296e = R.string.city_sanaa_specialties_silverware_description;
            d6.f4297f = 35000;
        } else if (i2 == 513) {
            ArrayList arrayList13 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_specialties_fashionable_suit_name;
            d6.d = R.drawable.market_cairo_specialties_fashionable_suit;
            d6.f4296e = R.string.city_cairo_specialties_fashionable_suit_description;
            d6.f4297f = 37000;
        } else if (i2 == 514) {
            ArrayList arrayList14 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_specialties_ornaments_name;
            d6.d = R.drawable.market_cairo_specialties_ornaments;
            d6.f4296e = R.string.city_cairo_specialties_ornaments_description;
            d6.f4297f = 29000;
        } else if (i2 == 515) {
            ArrayList arrayList15 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_specialties_perfume_name;
            d6.d = R.drawable.market_cairo_specialties_perfume;
            d6.f4296e = R.string.city_cairo_specialties_perfume_description;
            d6.f4297f = 14000;
        } else if (i2 == 516) {
            ArrayList arrayList16 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_specialties_propolis_name;
            d6.d = R.drawable.market_doha_specialties_propolis;
            d6.f4296e = R.string.city_doha_specialties_propolis_description;
            d6.f4297f = 27000;
        } else if (i2 == 517) {
            ArrayList arrayList17 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_specialties_cachaca_name;
            d6.d = R.drawable.market_doha_specialties_cachaca;
            d6.f4296e = R.string.city_doha_specialties_cachaca_description;
            d6.f4297f = 53000;
        } else if (i2 == 518) {
            ArrayList arrayList18 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_specialties_coffee_name;
            d6.d = R.drawable.market_doha_specialties_coffee;
            d6.f4296e = R.string.city_doha_specialties_coffee_description;
            d6.f4297f = 32000;
        } else if (i2 == 519) {
            ArrayList arrayList19 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_specialties_ostrich_egg_name;
            d6.d = R.drawable.market_tehran_specialties_ostrich_egg;
            d6.f4296e = R.string.city_tehran_specialties_ostrich_egg_description;
            d6.f4297f = 40000;
        } else if (i2 == 520) {
            ArrayList arrayList20 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_specialties_african_wood_carving_name;
            d6.d = R.drawable.market_tehran_specialties_african_wood_carving;
            d6.f4296e = R.string.city_tehran_specialties_african_wood_carving_description;
            d6.f4297f = 35000;
        } else if (i2 == 521) {
            ArrayList arrayList21 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_specialties_diamond_name;
            d6.d = R.drawable.market_tehran_specialties_diamond;
            d6.f4296e = R.string.city_tehran_specialties_diamond_description;
            d6.f4297f = 45000;
        } else if (i2 == 522) {
            ArrayList arrayList22 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_specialties_pipe_name;
            d6.d = R.drawable.market_tripoli_specialties_pipe;
            d6.f4296e = R.string.city_tripoli_specialties_pipe_description;
            d6.f4297f = 38000;
        } else if (i2 == 523) {
            ArrayList arrayList23 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_specialties_whiskey_name;
            d6.d = R.drawable.market_tripoli_specialties_whiskey;
            d6.f4296e = R.string.city_tripoli_specialties_whiskey_description;
            d6.f4297f = 74000;
        } else if (i2 == 524) {
            ArrayList arrayList24 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_specialties_english_tea_name;
            d6.d = R.drawable.market_tripoli_specialties_english_tea;
            d6.f4296e = R.string.city_tripoli_specialties_english_tea_description;
            d6.f4297f = 47000;
        } else if (i2 == 525) {
            ArrayList arrayList25 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_specialties_glassware_name;
            d6.d = R.drawable.market_idlib_specialties_glassware;
            d6.f4296e = R.string.city_idlib_specialties_glassware_description;
            d6.f4297f = 51000;
        } else if (i2 == 526) {
            ArrayList arrayList26 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_specialties_scarab_ornament_name;
            d6.d = R.drawable.market_idlib_specialties_scarab_ornament;
            d6.f4296e = R.string.city_idlib_specialties_scarab_ornament_description;
            d6.f4297f = 70000;
        } else if (i2 == 527) {
            ArrayList arrayList27 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_specialties_pyramid_model_name;
            d6.d = R.drawable.market_idlib_specialties_pyramid_model;
            d6.f4296e = R.string.city_idlib_specialties_pyramid_model_description;
            d6.f4297f = 47000;
        } else if (i2 == 528) {
            ArrayList arrayList28 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_specialties_herring_name;
            d6.d = R.drawable.market_rabat_specialties_herring;
            d6.f4296e = R.string.city_rabat_specialties_herring_description;
            d6.f4297f = 80000;
        } else if (i2 == 529) {
            ArrayList arrayList29 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_specialties_cheese_name;
            d6.d = R.drawable.market_rabat_specialties_cheese;
            d6.f4296e = R.string.city_rabat_specialties_cheese_description;
            d6.f4297f = 48000;
        } else if (i2 == 530) {
            ArrayList arrayList30 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_specialties_sabot_name;
            d6.d = R.drawable.market_rabat_specialties_sabot;
            d6.f4296e = R.string.city_rabat_specialties_sabot_description;
            d6.f4297f = 48000;
        }
        d6.f4293a = i2;
        d6.f4294b = 9;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D r(n nVar) {
        D d6;
        if (nVar.getLevel() > 0) {
            d6 = v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked());
        } else {
            d6 = s(nVar.getId(), nVar.getLevel(), nVar.getCount());
        }
        d6.f4302m = nVar.isLocked();
        d6.f4304o = nVar.isUsedInArming();
        d6.f4298i = nVar.getLevel();
        if (nVar.isUsedInMuseum()) {
            d6.f4305p = nVar.isUsedInMuseum();
            d6.f4299j = nVar.getMuseumPositions();
        }
        return d6;
    }

    public static D s(int i2, int i5, int i6) {
        if (i5 > 0) {
            return v(i2, i6, i5, false);
        }
        if (i2 < 100) {
            return i(i2, i6, false);
        }
        if (i2 < 200) {
            return w(i2, i6, false);
        }
        if (i2 < 300) {
            return l(i2, i6, false);
        }
        if (i2 < 400) {
            return g(i2, i6, false);
        }
        if (i2 < 500) {
            return h(i2, i6, false);
        }
        if (i2 < 600) {
            return q(i2, i6, false);
        }
        if (i2 < 700) {
            return k(i2, i6, false);
        }
        if (i2 < 800) {
            return d(i2, i6, false);
        }
        if (i2 < 900) {
            return t(i2, i6, false);
        }
        if (i2 < 1000) {
            return c(i2, i6, false);
        }
        if (i2 < 2000) {
            return e(i2, i6, false);
        }
        if (i2 < 3000) {
            return o(i2, i6, false);
        }
        if (i2 < 4000) {
            return u(i2, i6, false);
        }
        if (i2 < 5000) {
            return m(i2, i6, false);
        }
        if (i2 < 6000) {
            return n(i2, i6, false);
        }
        if (i2 < 20000) {
            return j(i2, i6, false);
        }
        if (i2 < 30000) {
            return b(i2, i6, false);
        }
        if (i2 < 40000) {
            return p(i2, i6, false);
        }
        return null;
    }

    public static D t(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 801) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_tunnel_blood_tonic_name;
            d6.d = R.drawable.market_tehran_tunnel_blood_tonic;
            d6.f4296e = R.string.city_tehran_tunnel_blood_tonic_description;
            d6.f4297f = 5000;
        } else if (i2 == 802) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_tunnel_energizing_tonic_name;
            d6.d = R.drawable.market_tehran_tunnel_energizing_tonic;
            d6.f4296e = R.string.city_tehran_tunnel_energizing_tonic_description;
            d6.f4297f = 500000;
        }
        d6.f4293a = i2;
        d6.f4294b = 12;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D u(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        d6.f4300k = false;
        if (i2 == 3001) {
            d6.f4295c = C0597b.C6;
            d6.d = C0597b.E6;
            d6.f4296e = C0597b.D6;
            d6.f4297f = 1000000;
            d6.f4290B = 199;
        } else if (i2 == 3002) {
            d6.f4295c = C0597b.F6;
            d6.d = C0597b.H6;
            d6.f4296e = C0597b.G6;
            d6.f4297f = 2;
            d6.f4290B = 5;
        } else if (i2 == 3003) {
            d6.f4295c = C0597b.I6;
            d6.d = C0597b.K6;
            d6.f4296e = C0597b.J6;
            d6.f4297f = 2;
        } else if (i2 == 3004) {
            d6.f4295c = C0597b.L6;
            d6.d = C0597b.N6;
            d6.f4296e = C0597b.M6;
            d6.f4297f = 2;
        } else if (i2 == 3005) {
            d6.f4295c = C0597b.O6;
            d6.d = C0597b.Q6;
            d6.f4296e = C0597b.P6;
            d6.f4297f = 2;
        }
        d6.f4293a = i2;
        d6.f4294b = 13;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public static D v(int i2, int i5, int i6, boolean z3) {
        D s6 = s(i2, 0, 1);
        s6.f4293a = i2;
        s6.f4294b = 14;
        s6.h = i5;
        s6.f4302m = z3;
        s6.f4303n = true;
        s6.f4298i = i6;
        return s6;
    }

    public static D w(int i2, int i5, boolean z3) {
        D d6 = new D();
        d6.f4301l = true;
        if (i2 == 101) {
            ArrayList arrayList = C0597b.f8459a;
            d6.f4295c = R.string.city_main_work_audio_name;
            d6.d = R.drawable.market_main_work_audio;
            d6.f4296e = R.string.city_main_work_audio_description;
            d6.f4297f = 100000;
        } else if (i2 == 102) {
            ArrayList arrayList2 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_work_business_license_name;
            d6.d = R.drawable.market_dubai_work_business_license;
            d6.f4296e = R.string.city_dubai_work_business_license_description;
            d6.f4297f = 500000;
        } else if (i2 == 103) {
            ArrayList arrayList3 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_work_medical_licence_name;
            d6.d = R.drawable.market_dubai_work_medical_license;
            d6.f4296e = R.string.city_dubai_work_medical_licence_description;
            d6.f4297f = 10000;
        } else if (i2 == 104) {
            ArrayList arrayList4 = C0597b.f8459a;
            d6.f4295c = R.string.city_dubai_work_engineering_diploma_name;
            d6.d = R.drawable.market_dubai_work_engineering_diploma;
            d6.f4296e = R.string.city_dubai_work_engineering_diploma_description;
            d6.f4297f = 10000;
        } else if (i2 == 105) {
            ArrayList arrayList5 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_work_lease_contract_name;
            d6.d = R.drawable.market_gaza_work_lease_contract;
            d6.f4296e = R.string.city_gaza_work_lease_contract_description;
            d6.f4297f = 100000;
        } else if (i2 == 106) {
            ArrayList arrayList6 = C0597b.f8459a;
            d6.f4295c = R.string.city_gaza_work_accounting_license_name;
            d6.d = R.drawable.market_gaza_work_accounting_lecense;
            d6.f4296e = R.string.city_gaza_work_accounting_license_description;
            d6.f4297f = 10000;
        } else if (i2 == 107) {
            ArrayList arrayList7 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_work_artist_certificate_name;
            d6.d = R.drawable.market_riyadh_work_artist_certificate;
            d6.f4296e = R.string.city_riyadh_work_artist_certificate_description;
            d6.f4297f = 10000;
        } else if (i2 == 108) {
            ArrayList arrayList8 = C0597b.f8459a;
            d6.f4295c = R.string.city_riyadh_work_trophy_name;
            d6.d = R.drawable.market_riyadh_work_trophy;
            d6.f4296e = R.string.city_riyadh_work_trophy_description;
            d6.f4297f = 100000;
        } else if (i2 == 109) {
            ArrayList arrayList9 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_work_pilot_license_name;
            d6.d = R.drawable.market_sanaa_work_pilot_license;
            d6.f4296e = R.string.city_sanaa_work_pilot_license_description;
            d6.f4297f = 10000;
        } else if (i2 == 110) {
            ArrayList arrayList10 = C0597b.f8459a;
            d6.f4295c = R.string.city_sanaa_work_development_license_name;
            d6.d = R.drawable.market_sanaa_work_development_license;
            d6.f4296e = R.string.city_sanaa_work_development_license_description;
            d6.f4297f = 100000;
        } else if (i2 == 111) {
            ArrayList arrayList11 = C0597b.f8459a;
            d6.f4295c = R.string.city_cairo_work_neurological_items_name;
            d6.d = R.drawable.market_cairo_work_neurological_items;
            d6.f4296e = R.string.city_cairo_work_neurological_items_description;
            d6.f4297f = 100000;
        } else if (i2 == 112) {
            ArrayList arrayList12 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_work_barman_license_name;
            d6.d = R.drawable.market_doha_work_barman_license;
            d6.f4296e = R.string.city_doha_work_barman_license_description;
            d6.f4297f = 10000;
        } else if (i2 == 113) {
            ArrayList arrayList13 = C0597b.f8459a;
            d6.f4295c = R.string.city_doha_work_fitness_certificate_name;
            d6.d = R.drawable.market_doha_work_fitness_certificate;
            d6.f4296e = R.string.city_doha_work_fitness_certificate_description;
            d6.f4297f = 100000;
        } else if (i2 == 114) {
            ArrayList arrayList14 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_work_medical_record_name;
            d6.d = R.drawable.market_tehran_work_medical_record;
            d6.f4296e = R.string.city_tehran_work_medical_record_description;
            d6.f4297f = 100000;
        } else if (i2 == 115) {
            ArrayList arrayList15 = C0597b.f8459a;
            d6.f4295c = R.string.city_tehran_work_award_certificate_name;
            d6.d = R.drawable.market_tehran_work_award_certificate;
            d6.f4296e = R.string.city_tehran_work_award_certificate_description;
            d6.f4297f = 500000;
        } else if (i2 == 116) {
            ArrayList arrayList16 = C0597b.f8459a;
            d6.f4295c = R.string.city_tripoli_work_law_diploma_name;
            d6.d = R.drawable.market_tripoli_work_law_diploma;
            d6.f4296e = R.string.city_tripoli_work_law_diploma_description;
            d6.f4297f = 10000;
        } else if (i2 == 117) {
            ArrayList arrayList17 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_work_chef_certificate_name;
            d6.d = R.drawable.market_idlib_work_chef_certificate;
            d6.f4296e = R.string.city_idlib_work_chef_certificate_description;
            d6.f4297f = 10000;
        } else if (i2 == 118) {
            ArrayList arrayList18 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_work_chef_license_name;
            d6.d = R.drawable.market_idlib_work_chef_license;
            d6.f4296e = R.string.city_idlib_work_chef_license_description;
            d6.f4297f = 100000;
        } else if (i2 == 119) {
            ArrayList arrayList19 = C0597b.f8459a;
            d6.f4295c = R.string.city_idlib_work_expert_certificate_name;
            d6.d = R.drawable.market_idlib_work_expert_certificate;
            d6.f4296e = R.string.city_idlib_work_expert_certificate_description;
            d6.f4297f = 100000;
        } else if (i2 == 120) {
            ArrayList arrayList20 = C0597b.f8459a;
            d6.f4295c = R.string.city_rabat_work_computer_certificate_name;
            d6.d = R.drawable.market_rabat_work_computer_certificate;
            d6.f4296e = R.string.city_rabat_work_computer_certificate_description;
            d6.f4297f = 10000;
        }
        d6.f4293a = i2;
        d6.f4294b = 8;
        d6.h = i5;
        d6.f4302m = z3;
        return d6;
    }

    public final int A() {
        return b.j0(this.f4312w, this.f4298i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        D d6 = (D) obj;
        if (this.f4293a == d6.f4293a && this.f4294b == d6.f4294b && this.f4295c == d6.f4295c && this.d == d6.d && this.f4296e == d6.f4296e && this.f4297f == d6.f4297f && this.g == d6.g && this.h == d6.h && this.f4298i == d6.f4298i && this.f4300k == d6.f4300k && this.f4301l == d6.f4301l && this.f4302m == d6.f4302m && this.f4303n == d6.f4303n && this.f4304o == d6.f4304o && this.f4305p == d6.f4305p && this.f4306q == d6.f4306q && this.f4307r == d6.f4307r && this.f4308s == d6.f4308s && this.f4309t == d6.f4309t && this.f4310u == d6.f4310u && this.f4311v == d6.f4311v && this.f4312w == d6.f4312w && this.f4313x == d6.f4313x && this.f4314y == d6.f4314y && this.f4290B == d6.f4290B && this.f4291C == d6.f4291C && Objects.equals(this.f4299j, d6.f4299j) && Objects.equals(this.f4315z, d6.f4315z) && Objects.equals(this.f4289A, d6.f4289A)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "StockObject{id=" + this.f4293a + ", type=" + this.f4294b + ", nameResourceId=" + this.f4295c + ", imageResourceId=" + this.d + ", descriptionResourceId=" + this.f4296e + ", cost=" + this.f4297f + ", specialtiesCost=" + this.g + ", count=" + this.h + ", level=" + this.f4298i + ", museumPositions=" + this.f4299j + ", canUse=" + this.f4300k + ", canSell=" + this.f4301l + ", isLocked=" + this.f4302m + ", isRare=" + this.f4303n + ", isUsedInArming=" + this.f4304o + ", isUsedInMuseum=" + this.f4305p + ", isWeapon=" + this.f4306q + ", isGun=" + this.f4307r + ", gunType=" + this.f4308s + ", damage=" + this.f4309t + ", accuracy=" + this.f4310u + ", defense=" + this.f4311v + ", evasion=" + this.f4312w + ", specialEquipmentType=" + this.f4313x + ", happiness=" + this.f4314y + ", skillsType=" + this.f4315z + ", skillsValues=" + this.f4289A + ", costGold=" + this.f4290B + ", costCheck=" + this.f4291C + ", limit=0, effect=0, palladium=" + this.f4292D + '}';
    }

    public final int x() {
        return b.j0(this.f4310u, this.f4298i);
    }

    public final int y() {
        return b.j0(this.f4309t, this.f4298i);
    }

    public final int z() {
        return b.j0(this.f4311v, this.f4298i);
    }

    public D(int i2, int i5, int i6) {
        this.f4295c = i2;
        this.f4296e = i5;
        this.d = i6;
    }

    public D(int i2, int i5, int i6, int i7) {
        this.f4295c = i2;
        this.f4296e = i5;
        this.d = i6;
        this.h = i7;
    }
}
