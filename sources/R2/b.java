package R2;

import B0.H;
import D.a;
import K.O;
import K.Y;
import Q.m;
import Q.n;
import Q.q;
import S3.z;
import Y4.D;
import Y4.E;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.A;
import com.mtma.criminal.city.utils.C;
import com.mtma.criminal.city.utils.C0431a;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.V;
import com.mtma.criminal.city.utils.j0;
import d5.C0468a;
import d5.C0473f;
import d5.o;
import h0.C0552a;
import i3.C0592h;
import i3.C0595k;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.C0671K0;
import k.C0703b0;
import k.C0724m;
import kotlin.jvm.internal.j;
import n3.C0861b;
import n3.C0866g;
import n3.p;
import n3.y;
import o5.g;
import o5.h;
import o5.i;
import q3.C0936a;
import v3.C1048c;
import v3.C1051f;
import v3.s;
import z0.C1129e;

public abstract class b implements Y {

    /* renamed from: a  reason: collision with root package name */
    public static MediaPlayer f2472a;

    /* renamed from: b  reason: collision with root package name */
    public static MediaPlayer f2473b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f2474c;
    public static boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static Class f2475e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2476f;

    /* renamed from: p  reason: collision with root package name */
    public static Field f2477p;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f2478q;

    /* renamed from: r  reason: collision with root package name */
    public static Field f2479r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f2480s;

    public static HashMap A(C0936a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(aVar.e()));
        return hashMap;
    }

    public static int A0(int i2, Parcel parcel) {
        f1(parcel, i2, 4);
        return parcel.readInt();
    }

    public static g B(g gVar, h hVar) {
        j.e(hVar, "key");
        if (j.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Integer B0(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        if (E02 == 0) {
            return null;
        }
        e1(parcel, E02, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static String C(C0468a aVar) {
        if (aVar.isBannedFromSystem()) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_banned);
        }
        if (aVar.isBannedFromChat() || aVar.isBannedFromPrivateMessages() || aVar.isBannedFromNews() || aVar.isBannedFromChatFromSystem() || aVar.isBannedFromPrivateMessagesFromSystem() || aVar.isBannedFromNewsFromSystem()) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_banned_chat);
        }
        if (aVar.isNeedReview()) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_need_review);
        }
        if (aVar.isAdmin()) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_admin);
        }
        if (aVar.isTemporaryAdmin()) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_temporary_admin);
        }
        return MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_normal);
    }

    public static long C0(int i2, Parcel parcel) {
        f1(parcel, i2, 8);
        return parcel.readLong();
    }

    public static ArrayList D() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_army_one_name, R.string.work_army_one_description, R.drawable.work_army_one, 20000, 0, 1, 0, 0, 0));
        arrayList.add(new E(R.string.work_army_two_name, R.string.work_army_two_description, R.drawable.work_army_two, 50000, 5, 50, 0, 0, 0));
        arrayList.add(new E(R.string.work_army_three_name, R.string.work_army_three_description, R.drawable.work_army_three, 100000, 10, 150, 0, 0, 0));
        arrayList.add(new E(R.string.work_army_four_name, R.string.work_army_four_description, R.drawable.work_army_four, 300000, 15, 500, 0, 0, 0, 109));
        arrayList.add(new E(R.string.work_army_five_name, R.string.work_army_five_description, R.drawable.work_army_five, 400000, 20, 1000, 0, 0, 0, 113));
        arrayList.add(new E(R.string.work_army_six_name, R.string.work_army_six_description, R.drawable.work_army_six, 500000, 30, 5000, 0, 0, 0, 119));
        return arrayList;
    }

    public static Long D0(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        if (E02 == 0) {
            return null;
        }
        e1(parcel, E02, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static ArrayList E() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_bank_one_name, R.string.work_bank_one_description, R.drawable.work_bank_one, 20000, 0, 0, 1, 0, 0));
        arrayList.add(new E(R.string.work_bank_two_name, R.string.work_bank_two_description, R.drawable.work_bank_two, 50000, 5, 0, 50, 0, 0));
        arrayList.add(new E(R.string.work_bank_three_name, R.string.work_bank_three_description, R.drawable.work_bank_three, 100000, 10, 0, 150, 0, 0));
        arrayList.add(new E(R.string.work_bank_four_name, R.string.work_bank_four_description, R.drawable.work_bank_four, 300000, 15, 0, 500, 0, 0, 112));
        arrayList.add(new E(R.string.work_bank_five_name, R.string.work_bank_five_description, R.drawable.work_bank_five, 400000, 20, 0, 1000, 0, 0, 101));
        arrayList.add(new E(R.string.work_bank_six_name, R.string.work_bank_six_description, R.drawable.work_bank_six, 500000, 30, 0, 5000, 0, 0, 102));
        return arrayList;
    }

    public static int E0(int i2, Parcel parcel) {
        if ((i2 & -65536) != -65536) {
            return (char) (i2 >> 16);
        }
        return parcel.readInt();
    }

    public static int F(int i2) {
        switch (i2) {
            case 101:
                return R.string.city_name_main_city_without_city_word;
            case 102:
            case 103:
            case 104:
                return R.string.city_name_dubai;
            case 105:
            case 106:
                return R.string.city_name_gaza;
            case 107:
            case 108:
                return R.string.city_name_riyadh;
            case 109:
            case 110:
                return R.string.city_name_sanaa;
            case 111:
                return R.string.city_name_cairo;
            case 112:
            case 113:
                return R.string.city_name_doha;
            case 114:
            case 115:
                return R.string.city_name_tehran;
            case 116:
                return R.string.city_name_tripoli;
            case 117:
            case 118:
            case 119:
                return R.string.city_name_idlib;
            case 120:
                return R.string.city_name_rabat;
            default:
                return -1;
        }
    }

    public static void F0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            a.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static ArrayList G() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_cinema_one_name, R.string.work_cinema_one_description, R.drawable.work_cenima_one, 20000, 0, 1, 1, 0, 0));
        arrayList.add(new E(R.string.work_cinema_two_name, R.string.work_cinema_two_description, R.drawable.work_cenima_two, 50000, 5, 25, 25, 0, 0));
        arrayList.add(new E(R.string.work_cinema_three_name, R.string.work_cinema_three_description, R.drawable.work_cenima_three, 100000, 10, 75, 75, 0, 0));
        arrayList.add(new E(R.string.work_cinema_four_name, R.string.work_cinema_four_description, R.drawable.work_cenima_four, 300000, 15, 250, 250, 0, 0, 107));
        arrayList.add(new E(R.string.work_cinema_five_name, R.string.work_cinema_five_description, R.drawable.work_cenima_five, 400000, 20, 500, 500, 0, 0, 114));
        arrayList.add(new E(R.string.work_cinema_six_name, R.string.work_cinema_six_description, R.drawable.work_cenima_six, 500000, 30, 2500, 2500, 0, 0, 115));
        return arrayList;
    }

    public static Object G0(Object obj, android.support.v4.media.session.a aVar, HashMap hashMap) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (!map.containsKey(".sv")) {
            return obj;
        }
        Object obj2 = map.get(".sv");
        Long l6 = null;
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if ("timestamp".equals(str) && hashMap.containsKey(str)) {
                l6 = hashMap.get(str);
            }
        } else if (obj2 instanceof Map) {
            Map map2 = (Map) obj2;
            if (map2.containsKey("increment")) {
                Object obj3 = map2.get("increment");
                if (obj3 instanceof Number) {
                    Number number = (Number) obj3;
                    s m02 = aVar.m0();
                    l6 = number;
                    if (m02.h()) {
                        l6 = number;
                        if (m02.getValue() instanceof Number) {
                            Number number2 = (Number) m02.getValue();
                            if (!(number instanceof Double) && !(number instanceof Float) && !(number2 instanceof Double) && !(number2 instanceof Float)) {
                                long longValue = number.longValue();
                                long longValue2 = number2.longValue();
                                long j6 = longValue + longValue2;
                                if (((longValue ^ j6) & (longValue2 ^ j6)) >= 0) {
                                    l6 = Long.valueOf(j6);
                                }
                            }
                            l6 = Double.valueOf(number2.doubleValue() + number.doubleValue());
                        }
                    }
                }
            }
        }
        if (l6 == null) {
            return obj;
        }
        return l6;
    }

    public static ArrayList H() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_coal_mining_one_name, R.string.work_coal_mining_one_description, R.drawable.work_coal_mining_one, 20000, 0, 1, 1, 0, 1));
        arrayList.add(new E(R.string.work_coal_mining_two_name, R.string.work_coal_mining_two_description, R.drawable.work_coal_mining_two, 50000, 5, 20, 20, 0, 20));
        arrayList.add(new E(R.string.work_coal_mining_three_name, R.string.work_coal_mining_three_description, R.drawable.work_coal_mining_three, 100000, 10, 50, 50, 0, 50));
        arrayList.add(new E(R.string.work_coal_mining_four_name, R.string.work_coal_mining_four_description, R.drawable.work_coal_mining_four, 300000, 15, 200, 200, 0, 200, 104));
        arrayList.add(new E(R.string.work_coal_mining_five_name, R.string.work_coal_mining_five_description, R.drawable.work_coal_mining_five, 400000, 20, 400, 400, 0, 400, 110));
        arrayList.add(new E(R.string.work_coal_mining_six_name, R.string.work_coal_mining_six_description, R.drawable.work_coal_mining_six, 500000, 30, 2000, 2000, 0, 2000, 102));
        return arrayList;
    }

    public static C0861b H0(C0861b bVar, y yVar, C0866g gVar, HashMap hashMap) {
        C0861b bVar2 = C0861b.f10257b;
        Iterator it2 = bVar.f10258a.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            bVar2 = bVar2.k((C0866g) entry.getKey(), I0((s) entry.getValue(), new n3.E(yVar, gVar.t((C0866g) entry.getKey())), hashMap));
        }
        return bVar2;
    }

    public static String I(int i2, int i5) {
        if (i5 == 0) {
            return MyApplication.f7090a.getApplicationContext().getString(I1.b.D(i2));
        }
        if (i5 == 3) {
            return MyApplication.f7090a.getApplicationContext().getString(c.K(i5)) + " " + MyApplication.f7090a.getApplicationContext().getString(R.string.travel_to, new Object[]{MyApplication.f7090a.getApplicationContext().getString(I1.b.E(i2))});
        }
        return MyApplication.f7090a.getApplicationContext().getString(c.K(i5)) + " " + MyApplication.f7090a.getApplicationContext().getString(R.string.text_between_brackets, new Object[]{MyApplication.f7090a.getApplicationContext().getString(I1.b.E(i2))});
    }

    public static s I0(s sVar, android.support.v4.media.session.a aVar, HashMap hashMap) {
        Object value = sVar.c().getValue();
        Object G02 = G0(value, aVar.Q(C1048c.e(".priority")), hashMap);
        boolean z3 = false;
        if (sVar.h()) {
            Object G03 = G0(sVar.getValue(), aVar, hashMap);
            if (G03.equals(sVar.getValue())) {
                if (G02 == value) {
                    z3 = true;
                } else if (!(G02 == null || value == null)) {
                    z3 = G02.equals(value);
                }
                if (z3) {
                    return sVar;
                }
            }
            return android.support.v4.media.session.a.a(G03, C1129e.e((C0866g) null, G02));
        } else if (sVar.isEmpty()) {
            return sVar;
        } else {
            C1051f fVar = (C1051f) sVar;
            C0724m mVar = new C0724m(fVar, 7);
            fVar.t(new p(aVar, hashMap, mVar), false);
            if (!((s) mVar.f9345b).c().equals(G02)) {
                return ((s) mVar.f9345b).b(C1129e.e((C0866g) null, G02));
            }
            return (s) mVar.f9345b;
        }
    }

    public static Drawable J(Context context, int i2) {
        return C0671K0.b().c(context, i2);
    }

    public static void J0(ImageView imageView, float f6) {
        imageView.clearAnimation();
        float width = (float) (imageView.getWidth() / 2);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f6, width, 0.0f);
        rotateAnimation.setDuration((long) (3.0f * f6));
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setRepeatMode(2);
        imageView.startAnimation(rotateAnimation);
        rotateAnimation.setAnimationListener(new C0431a(imageView, f6, width));
    }

    public static long K(int i2) {
        if (i2 == 605) {
            return 1200;
        }
        if (i2 == 607) {
            return 3600;
        }
        if (i2 == 608) {
            return 1200;
        }
        switch (i2) {
            case 2005:
            case 2006:
            case 2007:
                return 14400;
            default:
                switch (i2) {
                    case 2031:
                        return 86400;
                    case 2032:
                    case 2033:
                        return 600;
                    default:
                        switch (i2) {
                            case 5001:
                            case 5002:
                            case 5003:
                            case 5004:
                                return 3600;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static void K0() {
        if (PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getBoolean("game_music", true)) {
            f2472a.pause();
            if (f2473b == null) {
                MediaPlayer create = MediaPlayer.create(MyApplication.f7090a.getApplicationContext(), R.raw.fight_mian);
                f2473b = create;
                create.setLooping(true);
            }
            f2473b.start();
            return;
        }
        MediaPlayer mediaPlayer = f2473b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            f2473b = null;
        }
    }

    public static ArrayList L() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_freelancer_one_name, R.string.work_freelancer_one_description, R.drawable.work_freelancer_one, 20000, 0, 0, 1, 1, 1));
        arrayList.add(new E(R.string.work_freelancer_two_name, R.string.work_freelancer_two_description, R.drawable.work_freelancer_two, 50000, 5, 0, 20, 20, 20));
        arrayList.add(new E(R.string.work_freelancer_three_name, R.string.work_freelancer_three_description, R.drawable.work_freelancer_three, 100000, 10, 0, 50, 50, 50));
        arrayList.add(new E(R.string.work_freelancer_four_name, R.string.work_freelancer_four_description, R.drawable.work_freelancer_four, 300000, 15, 0, 200, 200, 200, 107));
        arrayList.add(new E(R.string.work_freelancer_five_name, R.string.work_freelancer_five_description, R.drawable.work_freelancer_five, 400000, 20, 0, 400, 400, 400, 105));
        arrayList.add(new E(R.string.work_freelancer_six_name, R.string.work_freelancer_six_description, R.drawable.work_freelancer_six, 500000, 30, 0, 2000, 2000, 2000, 115));
        return arrayList;
    }

    public static void L0() {
        if (!PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getBoolean("game_music", true) || o.getLocationObject().getCurrentPlace() != 0) {
            MediaPlayer mediaPlayer = f2472a;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                f2472a = null;
                return;
            }
            return;
        }
        if (f2472a == null) {
            MediaPlayer create = MediaPlayer.create(MyApplication.f7090a.getApplicationContext(), R.raw.main_music);
            f2472a = create;
            create.setLooping(true);
        }
        f2472a.start();
    }

    public static int M(int i2) {
        if (i2 == 1) {
            return R.drawable.gender_female;
        }
        return R.drawable.gender_male;
    }

    public static void M0(int i2) {
        if (PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getBoolean("buttons_and_ui_transitions_sounds", true)) {
            MediaPlayer create = MediaPlayer.create(MyApplication.f7090a.getApplicationContext(), i2);
            create.start();
            create.setOnCompletionListener(new V(0));
        }
    }

    public static int N(C0473f fVar) {
        int i2;
        if (fVar == null) {
            fVar = o.getEstateObject();
        }
        int i5 = ((Y4.h) d.m0().get(fVar.getId())).g;
        ArrayList l02 = d.l0(fVar.getId());
        int i6 = 0;
        for (int i7 = 0; i7 < l02.size(); i7++) {
            if (((Y4.g) l02.get(i7)).g) {
                if (d.M0(fVar.getServantContractsStartTimeInMilliList().get(i6).longValue(), c.f5744o)) {
                    i2 = ((Y4.g) l02.get(i7)).d;
                } else {
                    i2 = 0;
                }
                i6++;
            } else if (fVar.getFixedModificationList().get(i7).booleanValue()) {
                i2 = ((Y4.g) l02.get(i7)).d;
            } else {
                i2 = 0;
            }
            if (o.getSchoolObject().getScienceLessons().get(6).intValue() == 2) {
                i2 = (int) ((c.H(3, 6) + 1.0d) * ((double) i2));
            }
            i5 += i2;
        }
        if (o.getArmingObject().getSpecialEquipmentId() == -1) {
            return i5;
        }
        int i8 = D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4314y;
        if (o.getSchoolObject().getScienceLessons().get(5).intValue() == 2) {
            i8 = (int) (c.H(3, 5) * ((double) i8));
        }
        return i5 + i8;
    }

    public static void N0() {
        if (PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getBoolean("buttons_and_ui_transitions_sounds", true)) {
            MediaPlayer create = MediaPlayer.create(MyApplication.f7090a.getApplicationContext(), R.raw.ui_transition);
            create.start();
            create.setOnCompletionListener(new V(3));
        }
    }

    public static int O(int i2, boolean z3) {
        if (z3) {
            if (i2 == 605) {
                return R.string.herb_description_effect_herb_ayahuasca;
            }
            if (i2 == 607) {
                return R.string.herb_description_effect_herb_kava_cola;
            }
            if (i2 == 608) {
                return R.string.herb_description_effect_herb_willow_bark;
            }
            switch (i2) {
                case 5001:
                    return R.string.plate_fish_description;
                case 5002:
                    return R.string.plate_seafood_description;
                case 5003:
                    return R.string.plate_sushi_description;
                case 5004:
                    return R.string.plate_lamb_description;
                default:
                    return 0;
            }
        } else if (i2 == 603) {
            return R.string.herb_description_type_herb_red_bull;
        } else {
            if (i2 == 605 || i2 == 610) {
                return R.string.herb_description_type_herb;
            }
            if (i2 == 607) {
                return R.string.herb_description_type_herb_kava_cola;
            }
            if (i2 == 608) {
                return R.string.herb_description_type_herb;
            }
            switch (i2) {
                case 2005:
                    return R.string.herb_description_effect_double_exp;
                case 2006:
                    return R.string.herb_description_effect_double_courage_recovery;
                case 2007:
                    return R.string.herb_description_effect_double_health_recovery;
                default:
                    switch (i2) {
                        case 2031:
                            return R.string.herb_description_effect_police_protection;
                        case 2032:
                            return R.string.herb_description_effect_hire_lookout;
                        case 2033:
                            return R.string.herb_description_effect_paramedic;
                        default:
                            switch (i2) {
                                case 5001:
                                case 5002:
                                case 5003:
                                case 5004:
                                case 5005:
                                    return R.string.herb_description_effect_herb_type;
                                default:
                                    return 0;
                            }
                    }
            }
        }
    }

    public static void O0(TextView textView, int i2) {
        int i5;
        c.c(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            Q.o.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i5 = fontMetricsInt.top;
        } else {
            i5 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static int P(int i2, boolean z3) {
        if (z3) {
            if (i2 == 605) {
                return R.drawable.herb_double_happiness;
            }
            if (i2 == 607) {
                return R.drawable.herb_crirme_success;
            }
            if (i2 == 608) {
                return R.drawable.herb_power_half_usage;
            }
            switch (i2) {
                case 5001:
                    return R.drawable.herb_plate_strength_training;
                case 5002:
                    return R.drawable.herb_plate_defense_training;
                case 5003:
                    return R.drawable.herb_plate_speed_training;
                case 5004:
                    return R.drawable.herb_plate_dextirety_training;
                default:
                    return 0;
            }
        } else if (i2 == 603 || i2 == 605 || i2 == 610 || i2 == 607 || i2 == 608) {
            return R.drawable.herb_type_herb;
        } else {
            switch (i2) {
                case 2005:
                    return R.drawable.herb_double_exp;
                case 2006:
                    return R.drawable.herb_double_courage;
                case 2007:
                    return R.drawable.herb_double_health;
                default:
                    switch (i2) {
                        case 2031:
                            return R.drawable.herb_police_protection;
                        case 2032:
                            return R.drawable.herb_hire_lookout;
                        case 2033:
                            return R.drawable.herb_paramedic;
                        default:
                            switch (i2) {
                                case 5001:
                                case 5002:
                                case 5003:
                                case 5004:
                                case 5005:
                                    return R.drawable.herb_type_plates;
                                default:
                                    return 0;
                            }
                    }
            }
        }
    }

    public static void P0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z3;
        WeakHashMap weakHashMap = O.f1352a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z4 = false;
        int i2 = 1;
        if (onLongClickListener != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (hasOnClickListeners || z3) {
            z4 = true;
        }
        checkableImageButton.setFocusable(z4);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        if (!z4) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    public static ArrayList Q() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_hospital_one_name, R.string.work_hospital_one_description, R.drawable.work_hospital_one, 20000, 0, 1, 0, 1, 0));
        arrayList.add(new E(R.string.work_hospital_two_name, R.string.work_hospital_two_description, R.drawable.work_hospital_two, 50000, 5, 25, 0, 25, 0));
        arrayList.add(new E(R.string.work_hospital_three_name, R.string.work_hospital_three_description, R.drawable.work_hospital_three, 100000, 10, 75, 0, 75, 0));
        arrayList.add(new E(R.string.work_hospital_four_name, R.string.work_hospital_four_description, R.drawable.work_hospital_four, 300000, 15, 250, 0, 250, 0, 103));
        arrayList.add(new E(R.string.work_hospital_five_name, R.string.work_hospital_five_description, R.drawable.work_hospital_five, 400000, 20, 500, 0, 500, 0, 119));
        arrayList.add(new E(R.string.work_hospital_six_name, R.string.work_hospital_six_description, R.drawable.work_hospital_six, 500000, 30, 2500, 0, 2500, 0, 110));
        return arrayList;
    }

    public static void Q0(TextView textView, int i2) {
        int i5;
        c.c(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i5 = fontMetricsInt.bottom;
        } else {
            i5 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i5);
        }
    }

    public static E R(int i2, int i5) {
        if (i2 == 0) {
            return (E) W().get(i5);
        }
        if (i2 == 1) {
            return (E) E().get(i5);
        }
        if (i2 == 2) {
            return (E) G().get(i5);
        }
        if (i2 == 3) {
            return (E) Y().get(i5);
        }
        if (i2 == 4) {
            return (E) D().get(i5);
        }
        if (i2 == 5) {
            return (E) Q().get(i5);
        }
        if (i2 == 6) {
            return (E) H().get(i5);
        }
        if (i2 == 7) {
            return (E) L().get(i5);
        }
        if (i2 == 8) {
            return (E) X().get(i5);
        }
        return null;
    }

    public static void R0(TextView textView, int i2) {
        c.c(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    public static int S(int i2, int i5) {
        if (i2 == 0) {
            return ((E) W().get(i5)).f4316a;
        }
        if (i2 == 1) {
            return ((E) E().get(i5)).f4316a;
        }
        if (i2 == 2) {
            return ((E) G().get(i5)).f4316a;
        }
        if (i2 == 3) {
            return ((E) Y().get(i5)).f4316a;
        }
        if (i2 == 4) {
            return ((E) D().get(i5)).f4316a;
        }
        if (i2 == 5) {
            return ((E) Q().get(i5)).f4316a;
        }
        if (i2 == 6) {
            return ((E) H().get(i5)).f4316a;
        }
        if (i2 == 7) {
            return ((E) L().get(i5)).f4316a;
        }
        if (i2 == 8) {
            return ((E) X().get(i5)).f4316a;
        }
        return R.string.not_has_job_yet;
    }

    public static void S0(Drawable drawable, int i2) {
        a.g(drawable, i2);
    }

    public static long T(int i2) {
        if (i2 == 603) {
            return 4800;
        }
        if (i2 == 605 || i2 == 610) {
            return 14400;
        }
        if (i2 == 607) {
            return 3600;
        }
        if (i2 == 608) {
            return 14400;
        }
        switch (i2) {
            case 2005:
            case 2006:
            case 2007:
                return 14400;
            default:
                switch (i2) {
                    case 2031:
                        return 86400;
                    case 2032:
                    case 2033:
                        return 600;
                    default:
                        switch (i2) {
                            case 5001:
                            case 5002:
                            case 5003:
                            case 5004:
                            case 5005:
                                return 7200;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static void T0(int i2, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + E0(i2, parcel));
    }

    public static final int U(int i2, int i5, int i6) {
        if (i6 > 0) {
            if (i2 >= i5) {
                return i5;
            }
            int i7 = i5 % i6;
            if (i7 < 0) {
                i7 += i6;
            }
            int i8 = i2 % i6;
            if (i8 < 0) {
                i8 += i6;
            }
            int i9 = (i7 - i8) % i6;
            if (i9 < 0) {
                i9 += i6;
            }
            return i5 - i9;
        } else if (i6 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i2 <= i5) {
            return i5;
        } else {
            int i10 = -i6;
            int i11 = i2 % i10;
            if (i11 < 0) {
                i11 += i10;
            }
            int i12 = i5 % i10;
            if (i12 < 0) {
                i12 += i10;
            }
            int i13 = (i11 - i12) % i10;
            if (i13 < 0) {
                i13 += i10;
            }
            return i5 + i13;
        }
    }

    public static void U0() {
        MediaPlayer mediaPlayer = f2472a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            f2472a.release();
            f2472a = null;
        }
    }

    public static String V(int i2, String str) {
        return str + "-" + i2;
    }

    public static ArrayList V0(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!split[i2].isEmpty()) {
                arrayList.add(split[i2]);
            }
        }
        return arrayList;
    }

    public static ArrayList W() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_restaurant_one_name, R.string.work_restaurant_one_description, R.drawable.work_restaurant_one, 20000, 0, 0, 0, 0, 1));
        arrayList.add(new E(R.string.work_restaurant_two_name, R.string.work_restaurant_two_description, R.drawable.work_restaurant_two, 50000, 5, 0, 0, 0, 50));
        arrayList.add(new E(R.string.work_restaurant_three_name, R.string.work_restaurant_three_description, R.drawable.work_restaurant_three, 100000, 10, 0, 0, 0, 150));
        arrayList.add(new E(R.string.work_restaurant_four_name, R.string.work_restaurant_four_description, R.drawable.work_restaurant_four, 300000, 15, 0, 0, 0, 500, 117));
        arrayList.add(new E(R.string.work_restaurant_five_name, R.string.work_restaurant_five_description, R.drawable.work_restaurant_five, 400000, 20, 0, 0, 0, 1000, 116));
        arrayList.add(new E(R.string.work_restaurant_six_name, R.string.work_restaurant_six_description, R.drawable.work_restaurant_six, 500000, 30, 0, 0, 0, 5000, 118));
        return arrayList;
    }

    public static H W0(C0595k kVar) {
        return new H(true, ((s) kVar.f8289a.f9345b).f(kVar.f8290b));
    }

    public static ArrayList X() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_school_one_name, R.string.work_school_one_description, R.drawable.work_school_one, 20000, 0, 0, 1, 1, 1));
        arrayList.add(new E(R.string.work_school_two_name, R.string.work_school_two_description, R.drawable.work_school_two, 50000, 5, 0, 20, 20, 20));
        arrayList.add(new E(R.string.work_school_three_name, R.string.work_school_three_description, R.drawable.work_school_three, 100000, 10, 0, 50, 50, 50));
        arrayList.add(new E(R.string.work_school_four_name, R.string.work_school_four_description, R.drawable.work_school_four, 300000, 15, 0, 200, 200, 200, 102));
        arrayList.add(new E(R.string.work_school_five_name, R.string.work_school_five_description, R.drawable.work_school_five, 400000, 20, 0, 400, 400, 400, 111));
        arrayList.add(new E(R.string.work_school_six_name, R.string.work_school_six_description, R.drawable.work_school_six, 500000, 30, 0, 2000, 2000, 2000, 119));
        return arrayList;
    }

    public static ArrayList Y() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new E(R.string.work_science_lap_one_name, R.string.work_science_lap_one_description, R.drawable.work_science_lab_one, 20000, 0, 1, 1, 0, 0));
        arrayList.add(new E(R.string.work_science_lap_two_name, R.string.work_science_lap_two_description, R.drawable.work_science_lab_two, 50000, 5, 25, 25, 0, 0));
        arrayList.add(new E(R.string.work_science_lap_three_name, R.string.work_science_lap_three_description, R.drawable.work_science_lab_three, 100000, 10, 75, 75, 0, 0));
        arrayList.add(new E(R.string.work_science_lap_four_name, R.string.work_science_lap_four_description, R.drawable.work_science_lab_four, 300000, 15, 250, 250, 0, 0, 103));
        arrayList.add(new E(R.string.work_science_lap_five_name, R.string.work_science_lap_five_description, R.drawable.work_science_lab_five, 400000, 20, 500, 500, 0, 0, 111));
        arrayList.add(new E(R.string.work_science_lap_six_name, R.string.work_science_lap_six_description, R.drawable.work_science_lab_six, 500000, 30, 2500, 2500, 0, 0, 105));
        return arrayList;
    }

    public static ActionMode.Callback Y0(ActionMode.Callback callback) {
        if (!(callback instanceof q) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((q) callback).f2333a;
    }

    public static String Z() {
        return "Servers/" + o.getAccountObject().getCurrentOpenedServer();
    }

    public static void Z0(Context context, D d6) {
        int i2;
        int i5 = d6.f4293a;
        if (i5 == 610 || i5 == 603) {
            if (i5 == 610) {
                i2 = 300;
            } else if (i5 == 603) {
                i2 = 100;
            } else {
                i2 = 0;
            }
            if (o.getMainStatesObject().getPowerCurrent() + i2 > 5000) {
                c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.power_rich_maximum_limit, new Object[]{5000}), (String) null);
                return;
            }
        }
        if (o.getHerbObject().getHerbTypesList().contains(1)) {
            ArrayList<Integer> herbTypesList = o.getHerbObject().getHerbTypesList();
            ArrayList<Integer> herbIdsList = o.getHerbObject().getHerbIdsList();
            ArrayList<Long> herbUsingStartTimeList = o.getHerbObject().getHerbUsingStartTimeList();
            int indexOf = herbTypesList.indexOf(1);
            long longValue = herbUsingStartTimeList.get(indexOf).longValue();
            if (c.f5744o < T(herbIdsList.get(indexOf).intValue()) + longValue) {
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_use_herb, context, (String) null);
                return;
            }
        }
        w(true);
        c.s(true, new A(context, d6, 0));
    }

    public static H a() {
        return new H(false, (s) null);
    }

    public static String a0() {
        return "Servers/server-" + o.getAccountObject().getCurrentOpenedServer();
    }

    public static void a1(int i2, int i5, long j6, com.mtma.criminal.city.utils.D d6) {
        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "herbObject").H(new C(i5, i2, j6, d6));
    }

    public static String b0(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case zzaky.zzf.zzf /*6*/:
                return "RESOLUTION_REQUIRED";
            case zzaky.zzf.zzg /*7*/:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            default:
                return com.google.android.gms.internal.measurement.a.f(i2, "unknown status code: ");
        }
    }

    public static void b1(Context context, D d6) {
        if (d6.f4293a != 5005 || o.getMainStatesObject().getPowerCurrent() + 100 <= 5000) {
            if (o.getHerbObject().getHerbTypesList().contains(2)) {
                ArrayList<Integer> herbTypesList = o.getHerbObject().getHerbTypesList();
                ArrayList<Integer> herbIdsList = o.getHerbObject().getHerbIdsList();
                ArrayList<Long> herbUsingStartTimeList = o.getHerbObject().getHerbUsingStartTimeList();
                int indexOf = herbTypesList.indexOf(2);
                long longValue = herbUsingStartTimeList.get(indexOf).longValue();
                if (c.f5744o < T(herbIdsList.get(indexOf).intValue()) + longValue) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_use_plate, context, (String) null);
                    return;
                }
            }
            w(true);
            c.s(true, new A(context, d6, 1));
            return;
        }
        c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.power_rich_maximum_limit, new Object[]{5000}), (String) null);
    }

    public static void c(View view, int i2) {
        if (((double) view.getScaleX()) == 1.0d) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.3f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.3f})});
            ofPropertyValuesHolder.setRepeatCount(i2);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.start();
        }
    }

    public static I.d c0(C0703b0 b0Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new I.d(Q.o.c(b0Var));
        }
        TextPaint textPaint = new TextPaint(b0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a6 = m.a(b0Var);
        int d6 = m.d(b0Var);
        if (b0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z3 = true;
            if (i2 < 28 || (b0Var.getInputType() & 15) != 3) {
                if (b0Var.getLayoutDirection() != 1) {
                    z3 = false;
                }
                switch (b0Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case zzaky.zzf.zzf /*6*/:
                        break;
                    case zzaky.zzf.zzg /*7*/:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(Q.o.b(n.a(b0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new I.d(textPaint, textDirectionHeuristic, a6, d6);
    }

    public static int c1(Parcel parcel) {
        int readInt = parcel.readInt();
        int E02 = E0(readInt, parcel);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 == 20293) {
            int i2 = E02 + dataPosition;
            if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
                return i2;
            }
            throw new A1.b(C0552a.l("Size read is invalid start=", dataPosition, i2, " end="), parcel);
        }
        throw new A1.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ActionMode.Callback d1(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i2 > 27 || (callback instanceof q) || callback == null) {
            return callback;
        }
        return new q(callback, textView);
    }

    public static void e1(Parcel parcel, int i2, int i5) {
        if (i2 != i5) {
            throw new A1.b(C0552a.r(com.google.android.gms.internal.measurement.a.h("Expected size ", i5, " got ", i2, " (0x"), Integer.toHexString(i2), ")"), parcel);
        }
    }

    public static void f(String str, int i2, int i5, int i6, j0 j0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("buyerPlayerId", o.getAccountObject().getId());
        hashMap.put("sellerPlayerId", str);
        hashMap.put("stallCellNumber", Integer.valueOf(i2));
        hashMap.put("materialId", Integer.valueOf(i5));
        hashMap.put("changeValue", Integer.valueOf(i6));
        F3.h.b().a("buyFromStall").q(hashMap).addOnCompleteListener(new C0451v(j0Var, 11));
    }

    public static int f0(int i2) {
        switch (i2) {
            case 0:
                return R.string.work_restaurant;
            case 1:
                return R.string.work_bank;
            case 2:
                return R.string.work_cinema;
            case 3:
                return R.string.work_science_lap;
            case 4:
                return R.string.work_camp_army;
            case 5:
                return R.string.work_hospital;
            case zzaky.zzf.zzf /*6*/:
                return R.string.work_coal_mining;
            case zzaky.zzf.zzg /*7*/:
                return R.string.work_freelancer;
            default:
                return R.string.work_school;
        }
    }

    public static void f1(Parcel parcel, int i2, int i5) {
        int E02 = E0(i2, parcel);
        if (E02 != i5) {
            throw new A1.b(C0552a.r(com.google.android.gms.internal.measurement.a.h("Expected size ", i5, " got ", E02, " (0x"), Integer.toHexString(E02), ")"), parcel);
        }
    }

    public static void g0(boolean z3, String str, Object... objArr) {
        if (!z3) {
            throw new AssertionError("hardAssert failed: ".concat(String.format(str, objArr)));
        }
    }

    public static void h(int i2, Object[] objArr) {
        int i5 = 0;
        while (i5 < i2) {
            if (objArr[i5] != null) {
                i5++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static o5.d h0(o5.d dVar) {
        q5.c cVar;
        o5.d intercepted;
        j.e(dVar, "<this>");
        if (dVar instanceof q5.c) {
            cVar = (q5.c) dVar;
        } else {
            cVar = null;
        }
        if (cVar == null || (intercepted = cVar.intercepted()) == null) {
            return dVar;
        }
        return intercepted;
    }

    public static boolean i0(int i2) {
        if (!o.getHerbObject().getHerbIdsList().contains(Integer.valueOf(i2))) {
            return false;
        }
        if (K(i2) + o.getHerbObject().getHerbUsingStartTimeList().get(o.getHerbObject().getHerbIdsList().indexOf(Integer.valueOf(i2))).longValue() > c.f5744o) {
            return true;
        }
        return false;
    }

    public static boolean j0(byte b6) {
        if (b6 > -65) {
            return true;
        }
        return false;
    }

    public static ImageView.ScaleType k(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i2 != 6) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    public static boolean k0(long j6) {
        if (j6 > c.f5744o) {
            return true;
        }
        return false;
    }

    public static long[] l(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static boolean l0(long j6) {
        if (c.f5744o - (j6 / 1000) < 600) {
            return true;
        }
        return false;
    }

    public static BigDecimal m(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + E02);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static i m0(g gVar, h hVar) {
        j.e(hVar, "key");
        if (j.a(gVar.getKey(), hVar)) {
            return o5.j.f10479a;
        }
        return gVar;
    }

    public static Bundle n(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + E02);
        return readBundle;
    }

    public static ThreadPoolExecutor n0() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new H1.a("firebase-iid-executor"));
    }

    public static byte[] o(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + E02);
        return createByteArray;
    }

    public static int[] p(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + E02);
        return createIntArray;
    }

    public static Parcelable q(Parcel parcel, int i2, Parcelable.Creator creator) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + E02);
        return parcelable;
    }

    public static String r(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + E02);
        return readString;
    }

    public static String[] s(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + E02);
        return createStringArray;
    }

    public static ArrayList t(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + E02);
        return createStringArrayList;
    }

    public static Object[] u(Parcel parcel, int i2, Parcelable.Creator creator) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + E02);
        return createTypedArray;
    }

    public static String u0(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        boolean z3 = true;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!z3) {
                sb.append("/");
            }
            sb.append(str);
            z3 = false;
        }
        return sb.toString();
    }

    public static ArrayList v(Parcel parcel, int i2, Parcelable.Creator creator) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + E02);
        return createTypedArrayList;
    }

    public static i v0(g gVar, i iVar) {
        j.e(iVar, "context");
        if (iVar == o5.j.f10479a) {
            return gVar;
        }
        return (i) iVar.fold(gVar, o5.b.f10474c);
    }

    public static void w(boolean z3) {
        PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).edit().putBoolean("progressbar_visibility", z3).apply();
    }

    public static boolean w0(int i2, Parcel parcel) {
        f1(parcel, i2, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static void x(int i2, Parcel parcel) {
        if (parcel.dataPosition() != i2) {
            throw new A1.b(com.google.android.gms.internal.measurement.a.f(i2, "Overread allowed size end="), parcel);
        }
    }

    public static Boolean x0(int i2, Parcel parcel) {
        boolean z3;
        int E02 = E0(i2, parcel);
        if (E02 == 0) {
            return null;
        }
        e1(parcel, E02, 4);
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    public static String y(long j6) {
        long j7 = c.f5744o - (j6 / 1000);
        if (j7 < 60) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.online_now);
        }
        long j8 = j7 / 60;
        if (j8 < 60) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.minute_word_with_number, new Object[]{Long.valueOf(j8)});
        }
        long j9 = j7 / 3600;
        if (j9 < 24) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.hour_word_with_number, new Object[]{Long.valueOf(j9)});
        }
        long j10 = j7 / 86400;
        if (j10 < 30) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.day_word_with_number, new Object[]{Long.valueOf(j10)});
        }
        long j11 = j7 / 2592000;
        if (j11 < 12) {
            return MyApplication.f7090a.getApplicationContext().getString(R.string.month_word_with_number, new Object[]{Long.valueOf(j11)});
        }
        return MyApplication.f7090a.getApplicationContext().getString(R.string.year_word_with_number, new Object[]{Long.valueOf(j7 / 31104000)});
    }

    public static Double y0(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        if (E02 == 0) {
            return null;
        }
        e1(parcel, E02, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static String z(String str, String str2) {
        String str3;
        if (!o.getContactsObject().getFriendsMap().containsKey(str) || (str3 = o.getContactsObject().getFriendsMap().get(str)) == null || str3.equals("no_friend_name_value")) {
            return str2;
        }
        return str2 + " (" + str3 + ")";
    }

    public static IBinder z0(int i2, Parcel parcel) {
        int E02 = E0(i2, parcel);
        int dataPosition = parcel.dataPosition();
        if (E02 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + E02);
        return readStrongBinder;
    }

    public abstract boolean X0(View view, int i2);

    public int d0(View view) {
        return 0;
    }

    public int e0() {
        return 0;
    }

    public abstract int i(View view, int i2);

    public abstract int j(View view, int i2);

    public abstract void o0(Throwable th);

    public abstract void p0(z zVar);

    public abstract void r0(int i2);

    public abstract void s0(View view, int i2, int i5);

    public abstract void t0(View view, float f6, float f7);

    public void e() {
    }

    public void g() {
    }

    public void q0(View view, int i2) {
    }
}
