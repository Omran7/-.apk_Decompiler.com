package K1;

import B.m;
import B0.l;
import F3.h;
import G.b;
import K.O;
import Q.j;
import R2.i;
import Y4.C;
import Y4.D;
import a1.C0258c;
import android.animation.TimeInterpolator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.EditText;
import androidx.emoji2.text.v;
import b5.g;
import c.C0326a;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.A;
import com.mtma.criminal.city.utils.C0435e;
import com.mtma.criminal.city.utils.C0447q;
import com.mtma.criminal.city.utils.F;
import com.mtma.criminal.city.utils.H;
import com.mtma.criminal.city.utils.i0;
import com.mtma.criminal.city.utils.v0;
import d5.C0469b;
import d5.o;
import d5.q;
import d5.r;
import d5.u;
import e3.C0490A;
import e3.C0495c;
import e3.C0497e;
import e3.G;
import e3.p;
import e3.x;
import h0.C0552a;
import i3.C0590f;
import i3.C0592h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.ThreadLocalRandom;
import l2.C0781a;
import o3.d;

public abstract class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f1458a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f1459b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1460c = false;
    public static Method d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1461e = false;

    /* renamed from: f  reason: collision with root package name */
    public static Field f1462f = null;
    public static boolean g = false;
    public static boolean h = false;

    public static long A(u uVar, u uVar2) {
        double strength = uVar.getGymObject().getStrength();
        if (a.t(uVar.getAccountObject().getId()) && uVar.getMainStatesObject().getNobilityCurrent() < 100) {
            strength *= ((double) uVar.getMainStatesObject().getNobilityCurrent()) / 100.0d;
        }
        long T5 = (long) ((T(1, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) + 1.0d) * ((double) ((long) (((((double) uVar.getMainStatesObject().getLevel()) * 0.002d) + 1.0d) * strength))));
        if (uVar.getArmingObject().getGunId() != -1) {
            T5 = (long) (((((T(5, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) + 1.0d) * ((double) D.s(uVar.getArmingObject().getGunId(), uVar.getArmingObject().getGunLevel(), 1).y())) / 100.0d) + 1.0d) * ((double) T5));
        }
        long healthCurrent = uVar2.getMainStatesObject().getHealthCurrent();
        if (uVar2.getArmingObject().getArmorId() != -1) {
            healthCurrent = (long) (((((T(6, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) + 1.0d) * ((double) D.s(uVar2.getArmingObject().getArmorId(), uVar2.getArmingObject().getArmorLevel(), 1).z())) / 100.0d) + 1.0d) * ((double) healthCurrent));
        }
        long healthCurrent2 = (long) (((double) uVar2.getMainStatesObject().getHealthCurrent()) * (((double) T5) / ((double) healthCurrent)));
        if (uVar2.getSchoolObject().getScienceLessons().get(0).intValue() == 2) {
            healthCurrent2 = (long) ((1.0d - c.H(3, 0)) * ((double) healthCurrent2));
        }
        double d6 = (double) healthCurrent2;
        long nextLong = ThreadLocalRandom.current().nextLong((long) (d6 * 0.5d), ((long) (1.5d * d6)) + 1);
        if (nextLong == 0) {
            return (long) J(1, 5);
        }
        return nextLong;
    }

    public static String B(int i2) {
        Date date = new Date(((long) (i2 * 3600)) * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static float C(int i2, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static Paint D(int i2, float f6) {
        if (f6 <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i2);
        paint.setStrokeWidth(f6);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    public static int E(u uVar, u uVar2, int i2) {
        long T5 = (long) ((T(1, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) + 1.0d) * uVar.getGymObject().getStrength());
        long T6 = (long) ((T(2, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) + 1.0d) * uVar.getGymObject().getDefense());
        long T7 = (long) ((T(3, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) + 1.0d) * uVar.getGymObject().getSpeed());
        long j6 = T5 + T6 + T7;
        long T8 = j6 + ((long) ((T(4, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) + 1.0d) * uVar.getGymObject().getDexterity()));
        long T9 = (long) ((T(1, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) + 1.0d) * uVar2.getGymObject().getStrength());
        long T10 = (long) ((T(2, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) + 1.0d) * uVar2.getGymObject().getDefense());
        long T11 = (long) ((T(3, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) + 1.0d) * uVar2.getGymObject().getSpeed());
        long j7 = T9 + T10 + T11;
        int T12 = (int) (T8 / (j7 + ((long) ((T(4, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) + 1.0d) * uVar2.getGymObject().getDexterity()))));
        if (T12 > 10) {
            return (T12 - 10) * i2;
        }
        return 0;
    }

    public static String F() {
        return MyApplication.f7090a.getApplicationContext().getPackageName();
    }

    public static Object G(Bundle bundle, String str) {
        Class cls = C0326a.class;
        if (Build.VERSION.SDK_INT >= 34) {
            return b.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList H() {
        ArrayList arrayList = new ArrayList();
        d.h(R.string.skill_perks_description_bag, arrayList, R.string.skill_perks_description_almighty, R.string.skill_perks_description_hard_to_kill, R.string.skill_perks_description_speed_demon);
        d.h(R.string.skill_perks_description_shadow_moves, arrayList, R.string.skill_perks_description_weapons_expert, R.string.skill_perks_description_armors_expert, R.string.skill_perks_description_critical_hit);
        d.h(R.string.skill_perks_description_prompt_recovery, arrayList, R.string.skill_perks_description_merciless, R.string.skill_perks_description_master_bandit, R.string.skill_perks_description_licence_to_kill);
        d.h(R.string.skill_perks_description_vigorous, arrayList, R.string.skill_perks_description_fearless, R.string.skill_perks_description_longevity_guru, R.string.skill_perks_description_experienced);
        d.h(R.string.skill_perks_description_lucky_lucky, arrayList, R.string.skill_perks_description_frequent_flyer, R.string.skill_perks_description_hard_bargainer, R.string.skill_perks_description_moneymaker);
        d.h(R.string.skill_perks_description_top_employee, arrayList, R.string.skill_perks_description_prodigy, R.string.skill_perks_description_finders_keepers, R.string.skill_perks_description_trained_handler);
        d.h(R.string.skill_perks_description_mercenary_conviction, arrayList, R.string.skill_perks_description_mercenary_almighty, R.string.skill_perks_description_mercenary_hard_to_kill, R.string.skill_perks_description_mercenary_speed_demon);
        arrayList.add(Integer.valueOf(R.string.skill_perks_description_mercenary_shadow_moves));
        arrayList.add(Integer.valueOf(R.string.skill_perks_description_racing_gas_frenzy));
        arrayList.add(Integer.valueOf(R.string.skill_perks_description_racing_benevolence));
        return arrayList;
    }

    public static long I(u uVar) {
        double speed = uVar.getGymObject().getSpeed();
        if (a.t(uVar.getAccountObject().getId()) && uVar.getMainStatesObject().getNobilityCurrent() < 100) {
            speed *= ((double) uVar.getMainStatesObject().getNobilityCurrent()) / 100.0d;
        }
        return (long) ((T(3, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) + 1.0d) * ((double) ((long) (((((double) uVar.getMainStatesObject().getLevel()) * 0.002d) + 1.0d) * speed))));
    }

    public static int J(int i2, int i5) {
        return ThreadLocalRandom.current().nextInt(i2, i5 + 1);
    }

    public static String K(double d6) {
        Date date = new Date((long) (d6 * 1000.0d));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static String L(String str, long j6) {
        Date date = new Date(j6 * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static int M(int i2) {
        switch (i2) {
            case 0:
                return R.drawable.skill_bag;
            case 1:
                return R.drawable.skill_almighty;
            case 2:
                return R.drawable.skill_hard_to_kill;
            case 3:
                return R.drawable.skill_speed_demon;
            case 4:
                return R.drawable.skill_shadow_moves;
            case 5:
                return R.drawable.skill_weapons_expert;
            case zzaky.zzf.zzf /*6*/:
                return R.drawable.skill_armor_expert;
            case zzaky.zzf.zzg /*7*/:
                return R.drawable.skill_critical_hit;
            case 8:
                return R.drawable.skill_prompt_recovery;
            case 9:
                return R.drawable.skill_merciless;
            case 10:
                return R.drawable.skill_master_bandit;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return R.drawable.skill_license_to_kill;
            case 12:
                return R.drawable.skill_vigorous;
            case 13:
                return R.drawable.skill_fearless;
            case 14:
                return R.drawable.skill_longevity_guru;
            case 15:
                return R.drawable.skill_experienced;
            case 16:
                return R.drawable.skill_lucky_lucky;
            case 17:
                return R.drawable.skill_frequent_flyer;
            case 18:
                return R.drawable.skill_hard_bargainer;
            case 19:
                return R.drawable.skill_money_maker;
            case 20:
                return R.drawable.skill_top_employee;
            case 21:
                return R.drawable.skill_prodigy;
            case 22:
                return R.drawable.skill_finders_keepers;
            default:
                return 0;
        }
    }

    public static int N(int i2, r rVar) {
        if (i2 == 1) {
            return rVar.getStrengthCards();
        }
        if (i2 == 2) {
            return rVar.getDefenseCards();
        }
        if (i2 == 3) {
            return rVar.getSpeedCards();
        }
        if (i2 == 4) {
            return rVar.getDexterityCards();
        }
        return 0;
    }

    public static int O(int i2, r rVar) {
        Integer orDefault;
        int intValue;
        int B6;
        if (rVar.getGangSkills() != null) {
            if (i2 == 1) {
                Integer orDefault2 = rVar.getGangSkills().getOrDefault(w(3), 0);
                if (orDefault2 != null) {
                    intValue = orDefault2.intValue();
                    B6 = c.B(3);
                }
            } else if (i2 == 2) {
                Integer orDefault3 = rVar.getGangSkills().getOrDefault(w(4), 0);
                if (orDefault3 != null) {
                    intValue = orDefault3.intValue();
                    B6 = c.B(4);
                }
            } else if (i2 == 3) {
                Integer orDefault4 = rVar.getGangSkills().getOrDefault(w(5), 0);
                if (orDefault4 != null) {
                    intValue = orDefault4.intValue();
                    B6 = c.B(5);
                }
            } else if (i2 == 4) {
                Integer orDefault5 = rVar.getGangSkills().getOrDefault(w(6), 0);
                if (orDefault5 != null) {
                    intValue = orDefault5.intValue();
                    B6 = c.B(6);
                }
            } else if (i2 == 5) {
                Integer orDefault6 = rVar.getGangSkills().getOrDefault(w(7), 0);
                if (orDefault6 != null) {
                    return orDefault6.intValue();
                }
            } else if (i2 == 6) {
                Integer orDefault7 = rVar.getGangSkills().getOrDefault(w(8), 0);
                if (orDefault7 != null) {
                    return orDefault7.intValue();
                }
            } else if (i2 == 7) {
                Integer orDefault8 = rVar.getGangSkills().getOrDefault(w(9), 0);
                if (orDefault8 != null) {
                    return orDefault8.intValue();
                }
            } else if (i2 == 0) {
                Integer orDefault9 = rVar.getGangSkills().getOrDefault(w(10), 0);
                if (orDefault9 != null) {
                    return orDefault9.intValue();
                }
            } else if (i2 == 8) {
                Integer orDefault10 = rVar.getGangSkills().getOrDefault(w(11), 0);
                if (orDefault10 != null) {
                    return orDefault10.intValue();
                }
            } else if (i2 == 12) {
                Integer orDefault11 = rVar.getGangSkills().getOrDefault(w(12), 0);
                if (orDefault11 != null) {
                    return orDefault11.intValue();
                }
            } else if (i2 == 13 && (orDefault = rVar.getGangSkills().getOrDefault(w(13), 0)) != null) {
                return orDefault.intValue();
            }
            return B6 * intValue;
        }
        return 0;
    }

    public static int P(int i2, q qVar, C0469b bVar) {
        if (i2 == 1) {
            if (qVar.getGymLessons().get(5).intValue() == 2) {
                return (int) c.H(4, 5);
            }
            if (qVar.getGymLessons().get(1).intValue() == 2) {
                return (int) c.H(4, 1);
            }
        } else if (i2 == 2) {
            if (qVar.getGymLessons().get(6).intValue() == 2) {
                return (int) c.H(4, 6);
            }
            if (qVar.getGymLessons().get(2).intValue() == 2) {
                return (int) c.H(4, 2);
            }
        } else if (i2 == 3) {
            if (qVar.getGymLessons().get(7).intValue() == 2) {
                return (int) c.H(4, 7);
            }
            if (qVar.getGymLessons().get(3).intValue() == 2) {
                return (int) c.H(4, 3);
            }
        } else if (i2 == 4) {
            if (qVar.getGymLessons().get(8).intValue() == 2) {
                return (int) c.H(4, 8);
            }
            if (qVar.getGymLessons().get(4).intValue() == 2) {
                return (int) c.H(4, 4);
            }
        } else if (i2 == 5 && bVar.getGunId() != -1) {
            if (D.s(bVar.getGunId(), 0, 1).f4308s == 0) {
                if (qVar.getMilitaryLessons().get(5).intValue() == 2) {
                    return (int) ((c.H(1, 5) * 100.0d) / ((double) U(i2)));
                }
                if (qVar.getMilitaryLessons().get(2).intValue() == 2) {
                    return (int) ((c.H(1, 2) * 100.0d) / ((double) U(i2)));
                }
            } else if (qVar.getMilitaryLessons().get(4).intValue() == 2) {
                return (int) ((c.H(1, 4) * 100.0d) / ((double) U(i2)));
            } else {
                if (qVar.getMilitaryLessons().get(1).intValue() == 2) {
                    return (int) ((c.H(1, 1) * 100.0d) / ((double) U(i2)));
                }
            }
        }
        return 0;
    }

    public static int Q(int i2, C0469b bVar) {
        if (bVar.getSpecialEquipmentId() != -1) {
            D s6 = D.s(bVar.getSpecialEquipmentId(), 0, 1);
            if (s6.f4315z.contains(Integer.valueOf(i2))) {
                return ((Integer) s6.f4289A.get(s6.f4315z.indexOf(Integer.valueOf(i2)))).intValue();
            }
        }
        return 0;
    }

    public static int R(int i2) {
        switch (i2) {
            case 0:
                return R.string.skill_name_bag;
            case 1:
                return R.string.skill_name_almighty;
            case 2:
                return R.string.skill_name_hard_to_kill;
            case 3:
                return R.string.skill_name_speed_demon;
            case 4:
                return R.string.skill_name_shadow_moves;
            case 5:
                return R.string.skill_name_weapons_expert;
            case zzaky.zzf.zzf /*6*/:
                return R.string.skill_name_armors_expert;
            case zzaky.zzf.zzg /*7*/:
                return R.string.skill_name_critical_hit;
            case 8:
                return R.string.skill_name_prompt_recovery;
            case 9:
                return R.string.skill_name_merciless;
            case 10:
                return R.string.skill_name_master_bandit;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return R.string.skill_name_licence_to_kill;
            case 12:
                return R.string.skill_name_vigorous;
            case 13:
                return R.string.skill_name_fearless;
            case 14:
                return R.string.skill_name_longevity_guru;
            case 15:
                return R.string.skill_name_experienced;
            case 16:
                return R.string.skill_name_lucky_lucky;
            case 17:
                return R.string.skill_name_frequent_flyer;
            case 18:
                return R.string.skill_name_hard_bargainer;
            case 19:
                return R.string.skill_name_money_maker;
            case 20:
                return R.string.skill_name_top_employee;
            case 21:
                return R.string.skill_name_prodigy;
            case 22:
                return R.string.skill_name_finders_keepers;
            default:
                return 0;
        }
    }

    public static double S(int i2) {
        return (((double) U(i2)) / 100.0d) * ((double) X(i2));
    }

    public static double T(int i2, r rVar, C0469b bVar, q qVar) {
        return (((double) U(i2)) / 100.0d) * ((double) Y(i2, rVar, bVar, qVar));
    }

    public static int U(int i2) {
        switch (i2) {
            case 5:
            case zzaky.zzf.zzf /*6*/:
            case 8:
            case ModuleDescriptor.MODULE_VERSION /*11*/:
            case 20:
                return 5;
            case zzaky.zzf.zzg /*7*/:
            case 12:
            case 14:
            case 16:
            case 17:
            case 18:
            case 21:
                return 2;
            case 9:
            case 19:
            case 22:
                return 10;
            case 10:
                return 15;
            case 15:
                return 3;
            default:
                return 1;
        }
    }

    public static ArrayList V() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C(0, R.string.skill_name_bag, R.string.skill_description_bag, R.drawable.skill_bag));
        arrayList.add(new C(1, R.string.skill_name_almighty, R.string.skill_description_almighty, R.drawable.skill_almighty));
        arrayList.add(new C(2, R.string.skill_name_hard_to_kill, R.string.skill_description_hard_to_kill, R.drawable.skill_hard_to_kill));
        arrayList.add(new C(3, R.string.skill_name_speed_demon, R.string.skill_description_speed_demon, R.drawable.skill_speed_demon));
        arrayList.add(new C(4, R.string.skill_name_shadow_moves, R.string.skill_description_shadow_moves, R.drawable.skill_shadow_moves));
        arrayList.add(new C(5, R.string.skill_name_weapons_expert, R.string.skill_description_weapons_expert, R.drawable.skill_weapons_expert));
        arrayList.add(new C(6, R.string.skill_name_armors_expert, R.string.skill_description_armors_expert, R.drawable.skill_armor_expert));
        arrayList.add(new C(7, R.string.skill_name_critical_hit, R.string.skill_description_critical_hit, R.drawable.skill_critical_hit));
        arrayList.add(new C(8, R.string.skill_name_prompt_recovery, R.string.skill_description_prompt_recovery, R.drawable.skill_prompt_recovery));
        arrayList.add(new C(9, R.string.skill_name_merciless, R.string.skill_description_merciless, R.drawable.skill_merciless));
        arrayList.add(new C(10, R.string.skill_name_master_bandit, R.string.skill_description_master_bandit, R.drawable.skill_master_bandit));
        arrayList.add(new C(11, R.string.skill_name_licence_to_kill, R.string.skill_description_licence_to_kill, R.drawable.skill_license_to_kill));
        arrayList.add(new C(12, R.string.skill_name_vigorous, R.string.skill_description_vigorous, R.drawable.skill_vigorous));
        arrayList.add(new C(13, R.string.skill_name_fearless, R.string.skill_description_fearless, R.drawable.skill_fearless));
        arrayList.add(new C(14, R.string.skill_name_longevity_guru, R.string.skill_description_longevity_guru, R.drawable.skill_longevity_guru));
        arrayList.add(new C(15, R.string.skill_name_experienced, R.string.skill_description_experienced, R.drawable.skill_experienced));
        arrayList.add(new C(16, R.string.skill_name_lucky_lucky, R.string.skill_description_lucky_lucky, R.drawable.skill_lucky_lucky));
        arrayList.add(new C(17, R.string.skill_name_frequent_flyer, R.string.skill_description_frequent_flyer, R.drawable.skill_frequent_flyer));
        arrayList.add(new C(18, R.string.skill_name_hard_bargainer, R.string.skill_description_hard_bargainer, R.drawable.skill_hard_bargainer));
        arrayList.add(new C(19, R.string.skill_name_money_maker, R.string.skill_description_moneymaker, R.drawable.skill_money_maker));
        arrayList.add(new C(20, R.string.skill_name_top_employee, R.string.skill_description_top_employee, R.drawable.skill_top_employee));
        arrayList.add(new C(21, R.string.skill_name_prodigy, R.string.skill_description_prodigy, R.drawable.skill_prodigy));
        arrayList.add(new C(22, R.string.skill_name_finders_keepers, R.string.skill_description_finders_keepers, R.drawable.skill_finders_keepers));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C) arrayList.get(i2)).f4288e = o.getSkillsObject().getMeritSkillLevel(((C) arrayList.get(i2)).f4285a);
        }
        return arrayList;
    }

    public static long W(long j6, u uVar, u uVar2) {
        double d6 = 0.0d;
        if (Y(9, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) > 0) {
            d6 = 0.0d + T(9, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject());
        }
        if (uVar.getSchoolObject().getMilitaryLessons().get(0).intValue() == 2) {
            d6 += c.H(1, 0);
        }
        double d7 = (double) j6;
        long j7 = (long) ((d6 + 1.0d) * d7);
        if (Y(8, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) > 0) {
            return j7 - ((long) (T(8, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) * d7));
        }
        return j7;
    }

    public static int X(int i2) {
        int i5;
        if (i2 != 0) {
            i5 = 0;
        } else {
            i5 = 5;
        }
        int meritSkillLevel = o.getSkillsObject().getMeritSkillLevel(i2);
        int Q5 = Q(i2, o.getArmingObject());
        int N6 = N(i2, o.getSkillsObject());
        return i5 + meritSkillLevel + Q5 + N6 + P(i2, o.getSchoolObject(), o.getArmingObject()) + O(i2, o.getSkillsObject());
    }

    public static int Y(int i2, r rVar, C0469b bVar, q qVar) {
        int i5;
        if (i2 != 0) {
            i5 = 0;
        } else {
            i5 = 5;
        }
        int meritSkillLevel = rVar.getMeritSkillLevel(i2);
        int Q5 = Q(i2, bVar);
        int N6 = N(i2, rVar);
        return i5 + meritSkillLevel + Q5 + N6 + P(i2, qVar, bVar) + O(i2, rVar);
    }

    public static boolean Z(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            if ((i5 > i6 || rect.left >= i6) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i2 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            if ((i7 > i8 || rect.top >= i8) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i2 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            if ((i9 < i10 || rect.right <= i10) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i2 == 130) {
            int i11 = rect.top;
            int i12 = rect2.top;
            if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static void a(long j6) {
        g gVar = new g();
        gVar.setPlayerId(o.getAccountObject().getId());
        gVar.setServerNumber(o.getAccountObject().getCurrentOpenedServer());
        gVar.setHackType("time_hack");
        gVar.setCurrentServerTime(j6);
        gVar.setHackMessage("from the fetch method in TimeUtil.java class");
        C0590f E6 = C0592h.b().e().E("Hackers").E(o.getAccountObject().getFirebaseId());
        E6.E("ServerNumber-" + o.getAccountObject().getCurrentOpenedServer()).E(o.getAccountObject().getId()).E("details").G().I(gVar);
        C0590f E7 = C0592h.b().e().E("Hackers").E(o.getAccountObject().getFirebaseId());
        a.d(E7.E("ServerNumber-" + o.getAccountObject().getCurrentOpenedServer()), "basicData", "hackingAttemptsNumber").H(new v(15));
    }

    public static boolean a0(int i2) {
        boolean z3;
        double d6;
        double d7;
        double d8;
        if (i2 != 0) {
            ThreadLocal threadLocal = C.d.f372a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length == 3) {
                double d9 = ((double) red) / 255.0d;
                if (d9 < 0.04045d) {
                    d6 = d9 / 12.92d;
                } else {
                    d6 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
                }
                double d10 = ((double) green) / 255.0d;
                if (d10 < 0.04045d) {
                    d7 = d10 / 12.92d;
                } else {
                    d7 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = ((double) blue) / 255.0d;
                if (d11 < 0.04045d) {
                    d8 = d11 / 12.92d;
                } else {
                    d8 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                z3 = false;
                dArr[0] = ((0.1805d * d8) + (0.3576d * d7) + (0.4124d * d6)) * 100.0d;
                double d12 = ((0.0722d * d8) + (0.7152d * d7) + (0.2126d * d6)) * 100.0d;
                dArr[1] = d12;
                double d13 = d8 * 0.9505d;
                dArr[2] = (d13 + (d7 * 0.1192d) + (d6 * 0.0193d)) * 100.0d;
                if (d12 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z3 = false;
        }
        return z3;
    }

    public static void b(String str, long j6, String str2, H h6) {
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", str);
        hashMap.put("secondsMustSpentInPlace", Long.valueOf(j6));
        hashMap.put("reason", str2);
        h.b().a("addPlayerToPrison").q(hashMap).addOnCompleteListener(new F(h6, str, 1));
    }

    public static boolean b0(u uVar) {
        if (J(1, 100) <= ((int) (T(7, uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject()) * 100.0d))) {
            return true;
        }
        return false;
    }

    public static void c(Context context, String str, String str2, String str3) {
        ((ClipboardManager) MyApplication.f7090a.getApplicationContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str));
        v0.e(context, str3);
    }

    public static boolean c0(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static String d(int i2, long j6) {
        return String.format(C0552a.k(i2, "%0", "d"), new Object[]{Long.valueOf(j6)});
    }

    public static boolean d0(String str, String str2) {
        if (!str.startsWith(str2.concat("(")) || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = f(r9, r10, r11)
            boolean r1 = f(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x000f
            goto L_0x0078
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0077
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0077
        L_0x0043:
            if (r9 == r5) goto L_0x0077
            if (r9 != r4) goto L_0x0048
            goto L_0x0077
        L_0x0048:
            int r11 = i0(r9, r10, r11)
            if (r9 == r5) goto L_0x006a
            if (r9 == r3) goto L_0x0065
            if (r9 == r4) goto L_0x0060
            if (r9 != r1) goto L_0x005a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L_0x0058:
            int r9 = r9 - r10
            goto L_0x006f
        L_0x005a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0060:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0058
        L_0x0065:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0058
        L_0x006a:
            int r9 = r10.left
            int r10 = r12.left
            goto L_0x0058
        L_0x006f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x0076
            r2 = r6
        L_0x0076:
            return r2
        L_0x0077:
            return r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.e.e(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean e0(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    public static boolean f(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static boolean f0(u uVar, u uVar2) {
        long I6 = I(uVar);
        if (uVar.getArmingObject().getGunId() != -1) {
            I6 = (long) (((((double) D.s(uVar.getArmingObject().getGunId(), uVar.getArmingObject().getGunLevel(), 1).x()) / 100.0d) + 1.0d) * ((double) I6));
        }
        double dexterity = uVar2.getGymObject().getDexterity();
        if (a.t(uVar2.getAccountObject().getId()) && uVar2.getMainStatesObject().getNobilityCurrent() < 100) {
            dexterity *= ((double) uVar2.getMainStatesObject().getNobilityCurrent()) / 100.0d;
        }
        long T5 = (long) ((T(4, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject()) + 1.0d) * ((double) ((long) (((((double) uVar2.getMainStatesObject().getLevel()) * 0.002d) + 1.0d) * dexterity))));
        if (uVar2.getArmingObject().getArmorId() != -1) {
            T5 = (long) (((((double) D.s(uVar2.getArmingObject().getArmorId(), uVar2.getArmingObject().getArmorLevel(), 1).A()) / 100.0d) + 1.0d) * ((double) T5));
        }
        double d6 = (double) I6;
        double d7 = (double) T5;
        if (ThreadLocalRandom.current().nextLong((long) (d6 * 0.8d), ((long) (d6 * 1.2d)) + 1) > ThreadLocalRandom.current().nextLong((long) (d7 * 0.8d), ((long) (1.2d * d7)) + 1)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.emoji2.text.g, androidx.emoji2.text.p] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.p g(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000e
            androidx.emoji2.text.c r0 = new androidx.emoji2.text.c
            r1 = 28
            r0.<init>(r1)
            goto L_0x0015
        L_0x000e:
            T1.C r0 = new T1.C
            r1 = 28
            r0.<init>(r1)
        L_0x0015:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            com.bumptech.glide.c.e(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L_0x002e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L_0x002e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L_0x002e
            goto L_0x004b
        L_0x004a:
            r4 = r5
        L_0x004b:
            if (r4 != 0) goto L_0x004f
        L_0x004d:
            r1 = r5
            goto L_0x007e
        L_0x004f:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0077 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0077 }
            android.content.pm.Signature[] r0 = r0.a(r1, r4)     // Catch:{ NameNotFoundException -> 0x0077 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0077 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0077 }
        L_0x005d:
            if (r3 >= r6) goto L_0x006b
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0077 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0077 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0077 }
            int r3 = r3 + 1
            goto L_0x005d
        L_0x006b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0077 }
            F3.k r1 = new F3.k     // Catch:{ NameNotFoundException -> 0x0077 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L_0x004d
        L_0x007e:
            if (r1 != 0) goto L_0x0081
            goto L_0x008b
        L_0x0081:
            androidx.emoji2.text.p r5 = new androidx.emoji2.text.p
            androidx.emoji2.text.o r0 = new androidx.emoji2.text.o
            r0.<init>(r8, r1)
            r5.<init>((androidx.emoji2.text.i) r0)
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.e.g(android.content.Context):androidx.emoji2.text.p");
    }

    public static boolean g0(r rVar, C0469b bVar, q qVar) {
        double T5 = T(11, rVar, bVar, qVar);
        if (T5 != 0.0d && ((double) J(0, 100)) <= T5 * 100.0d) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 147 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.h h(com.bumptech.glide.b r27, java.util.ArrayList r28) {
        /*
            r0 = r27
            C0.b r1 = r0.f5727a
            com.bumptech.glide.e r2 = r0.f5729c
            android.content.Context r3 = r2.getApplicationContext()
            T1.A r2 = r2.h
            com.bumptech.glide.h r4 = new com.bumptech.glide.h
            r4.<init>()
            I0.n r5 = new I0.n
            r5.<init>()
            x1.i r6 = r4.g
            monitor-enter(r6)
            java.lang.Object r7 = r6.f12553b     // Catch:{ all -> 0x03b0 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x03b0 }
            r7.add(r5)     // Catch:{ all -> 0x03b0 }
            monitor-exit(r6)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 27
            if (r5 < r6) goto L_0x003c
            I0.u r6 = new I0.u
            r6.<init>()
            x1.i r7 = r4.g
            monitor-enter(r7)
            java.lang.Object r8 = r7.f12553b     // Catch:{ all -> 0x003a }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x003a }
            r8.add(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r7)
            goto L_0x003c
        L_0x0038:
            monitor-exit(r7)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003a:
            r0 = move-exception
            goto L_0x0038
        L_0x003c:
            android.content.res.Resources r6 = r3.getResources()
            java.util.ArrayList r7 = r4.e()
            M0.a r8 = new M0.a
            C0.g r0 = r0.d
            r8.<init>(r3, r7, r1, r0)
            I0.G r9 = new I0.G
            H3.f r10 = new H3.f
            r11 = 9
            r10.<init>((int) r11)
            r9.<init>(r1, r10)
            I0.q r10 = new I0.q
            java.util.ArrayList r11 = r4.e()
            android.util.DisplayMetrics r12 = r6.getDisplayMetrics()
            r10.<init>(r11, r12, r1, r0)
            r11 = 28
            if (r5 < r11) goto L_0x0081
            java.lang.Object r2 = r2.f2796b
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Class<com.bumptech.glide.c> r12 = com.bumptech.glide.c.class
            boolean r2 = r2.containsKey(r12)
            if (r2 == 0) goto L_0x0081
            I0.g r2 = new I0.g
            r12 = 1
            r2.<init>(r12)
            I0.g r12 = new I0.g
            r13 = 0
            r12.<init>(r13)
            goto L_0x008d
        L_0x0081:
            I0.f r12 = new I0.f
            r2 = 0
            r12.<init>(r10, r2)
            I0.a r2 = new I0.a
            r13 = 2
            r2.<init>(r10, r0, r13)
        L_0x008d:
            java.lang.String r13 = "Animation"
            java.lang.Class<java.nio.ByteBuffer> r14 = java.nio.ByteBuffer.class
            java.lang.Class<android.graphics.drawable.Drawable> r15 = android.graphics.drawable.Drawable.class
            r16 = r8
            java.lang.Class<java.io.InputStream> r8 = java.io.InputStream.class
            if (r5 < r11) goto L_0x00c2
            K0.b r11 = new K0.b
            r17 = r5
            I3.h r5 = new I3.h
            r18 = r6
            r6 = 16
            r27 = r9
            r9 = 0
            r5.<init>(r7, r0, r6, r9)
            r6 = 1
            r11.<init>(r5, r6)
            r4.d(r13, r8, r15, r11)
            K0.b r5 = new K0.b
            I3.h r6 = new I3.h
            r9 = 16
            r11 = 0
            r6.<init>(r7, r0, r9, r11)
            r9 = 0
            r5.<init>(r6, r9)
            r4.d(r13, r14, r15, r5)
            goto L_0x00c8
        L_0x00c2:
            r17 = r5
            r18 = r6
            r27 = r9
        L_0x00c8:
            K0.d r5 = new K0.d
            r5.<init>(r3)
            I0.b r6 = new I0.b
            r6.<init>(r0)
            B0.l r9 = new B0.l
            r9.<init>()
            N0.d r11 = new N0.d
            r19 = r9
            r9 = 1
            r11.<init>(r9)
            android.content.ContentResolver r9 = r3.getContentResolver()
            r20 = r11
            F0.C r11 = new F0.C
            r21 = r9
            r9 = 5
            r11.<init>(r9)
            r4.b(r14, r11)
            x1.i r9 = new x1.i
            r11 = 6
            r9.<init>((java.lang.Object) r0, (int) r11)
            r4.b(r8, r9)
            java.lang.String r9 = "Bitmap"
            java.lang.Class<android.graphics.Bitmap> r11 = android.graphics.Bitmap.class
            r4.d(r9, r14, r11, r12)
            r4.d(r9, r8, r11, r2)
            r22 = r3
            java.lang.String r3 = "robolectric"
            r23 = r5
            java.lang.String r5 = android.os.Build.FINGERPRINT
            boolean r3 = r3.equals(r5)
            r24 = r5
            java.lang.Class<android.os.ParcelFileDescriptor> r5 = android.os.ParcelFileDescriptor.class
            if (r3 != 0) goto L_0x0121
            I0.f r3 = new I0.f
            r25 = r15
            r15 = 1
            r3.<init>(r10, r15)
            r4.d(r9, r5, r11, r3)
            goto L_0x0123
        L_0x0121:
            r25 = r15
        L_0x0123:
            I0.G r3 = new I0.G
            s2.e r10 = new s2.e
            r15 = 7
            r10.<init>((int) r15)
            r3.<init>(r1, r10)
            java.lang.Class<android.content.res.AssetFileDescriptor> r10 = android.content.res.AssetFileDescriptor.class
            r4.d(r9, r10, r11, r3)
            r3 = r27
            r4.d(r9, r5, r11, r3)
            F0.C r15 = F0.C.f665b
            r4.a(r11, r11, r15)
            r27 = r10
            I0.C r10 = new I0.C
            r26 = r15
            r15 = 0
            r10.<init>(r15)
            r4.d(r9, r11, r11, r10)
            r4.c(r11, r6)
            I0.a r10 = new I0.a
            r15 = r18
            r10.<init>(r15, r12)
            java.lang.String r12 = "BitmapDrawable"
            r18 = r9
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r9 = android.graphics.drawable.BitmapDrawable.class
            r4.d(r12, r14, r9, r10)
            I0.a r10 = new I0.a
            r10.<init>(r15, r2)
            r4.d(r12, r8, r9, r10)
            I0.a r2 = new I0.a
            r2.<init>(r15, r3)
            r4.d(r12, r5, r9, r2)
            I3.h r2 = new I3.h
            r3 = 9
            r10 = 0
            r2.<init>(r1, r6, r3, r10)
            r4.c(r9, r2)
            M0.j r2 = new M0.j
            r3 = r16
            r2.<init>(r7, r3, r0)
            java.lang.Class<M0.c> r6 = M0.c.class
            r4.d(r13, r8, r6, r2)
            r4.d(r13, r14, r6, r3)
            s2.e r2 = new s2.e
            r3 = 13
            r2.<init>((int) r3)
            r4.c(r6, r2)
            java.lang.Class<y0.d> r2 = y0.d.class
            r3 = r26
            r4.a(r2, r2, r3)
            I0.c r7 = new I0.c
            r7.<init>(r1)
            r10 = r18
            r4.d(r10, r2, r11, r7)
            java.lang.String r2 = "legacy_append"
            java.lang.Class<android.net.Uri> r7 = android.net.Uri.class
            r12 = r23
            r10 = r25
            r4.d(r2, r7, r10, r12)
            I0.a r13 = new I0.a
            r16 = r6
            r6 = 1
            r13.<init>(r12, r1, r6)
            r4.d(r2, r7, r11, r13)
            J0.a r6 = new J0.a
            r12 = 0
            r6.<init>(r12)
            r4.h(r6)
            F0.C r6 = new F0.C
            r12 = 6
            r6.<init>(r12)
            java.lang.Class<java.io.File> r12 = java.io.File.class
            r4.a(r12, r14, r6)
            F0.h r6 = new F0.h
            F0.C r13 = new F0.C
            r18 = r1
            r1 = 9
            r13.<init>(r1)
            r6.<init>((java.lang.Object) r13)
            r4.a(r12, r8, r6)
            I0.C r1 = new I0.C
            r6 = 2
            r1.<init>(r6)
            r4.d(r2, r12, r12, r1)
            F0.h r1 = new F0.h
            F0.C r6 = new F0.C
            r13 = 8
            r6.<init>(r13)
            r1.<init>((java.lang.Object) r6)
            r4.a(r12, r5, r1)
            r4.a(r12, r12, r3)
            com.bumptech.glide.load.data.l r1 = new com.bumptech.glide.load.data.l
            r1.<init>(r0)
            r4.h(r1)
            java.lang.String r0 = "robolectric"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0213
            J0.a r0 = new J0.a
            r1 = 2
            r0.<init>(r1)
            r4.h(r0)
        L_0x0213:
            D0.e r0 = new D0.e
            r1 = 2
            r6 = r22
            r0.<init>(r6, r1)
            D0.e r1 = new D0.e
            r13 = 1
            r1.<init>(r6, r13)
            F0.e r13 = new F0.e
            r22 = r9
            r9 = 0
            r13.<init>(r6, r9)
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4.a(r9, r8, r0)
            r23 = r11
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            r4.a(r11, r8, r0)
            r0 = r27
            r4.a(r9, r0, r1)
            r4.a(r11, r0, r1)
            r4.a(r9, r10, r13)
            r4.a(r11, r10, r13)
            D0.e r1 = new D0.e
            r13 = 3
            r1.<init>(r6, r13)
            r4.a(r7, r8, r1)
            F0.e r1 = new F0.e
            r13 = 2
            r1.<init>(r6, r13)
            r4.a(r7, r0, r1)
            F0.z r1 = new F0.z
            r13 = 1
            r1.<init>(r15, r13)
            F0.z r13 = new F0.z
            r27 = r2
            r2 = 0
            r13.<init>(r15, r2)
            F0.A r2 = new F0.A
            r2.<init>(r15)
            r4.a(r11, r7, r1)
            r4.a(r9, r7, r1)
            r4.a(r11, r0, r13)
            r4.a(r9, r0, r13)
            r4.a(r11, r8, r2)
            r4.a(r9, r8, r2)
            x1.i r1 = new x1.i
            r2 = 5
            r1.<init>((int) r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r4.a(r2, r8, r1)
            x1.i r1 = new x1.i
            r9 = 5
            r1.<init>((int) r9)
            r4.a(r7, r8, r1)
            F0.C r1 = new F0.C
            r9 = 13
            r1.<init>(r9)
            r4.a(r2, r8, r1)
            F0.C r1 = new F0.C
            r9 = 12
            r1.<init>(r9)
            r4.a(r2, r5, r1)
            F0.C r1 = new F0.C
            r9 = 11
            r1.<init>(r9)
            r4.a(r2, r0, r1)
            U3.c r1 = new U3.c
            android.content.res.AssetManager r2 = r6.getAssets()
            r9 = 8
            r1.<init>((java.lang.Object) r2, (int) r9)
            r4.a(r7, r8, r1)
            x1.i r1 = new x1.i
            android.content.res.AssetManager r2 = r6.getAssets()
            r9 = 4
            r1.<init>((java.lang.Object) r2, (int) r9)
            r4.a(r7, r0, r1)
            D0.e r1 = new D0.e
            r2 = 4
            r1.<init>(r6, r2)
            r4.a(r7, r8, r1)
            F0.e r1 = new F0.e
            r2 = 3
            r1.<init>(r6, r2)
            r4.a(r7, r8, r1)
            r1 = 29
            r2 = r17
            if (r2 < r1) goto L_0x02ef
            G0.b r1 = new G0.b
            r1.<init>(r6, r8)
            r4.a(r7, r8, r1)
            G0.b r1 = new G0.b
            r1.<init>(r6, r5)
            r4.a(r7, r5, r1)
        L_0x02ef:
            F0.E r1 = new F0.E
            r2 = 1
            r9 = r21
            r1.<init>(r9, r2)
            r4.a(r7, r8, r1)
            x1.i r1 = new x1.i
            r2 = 7
            r1.<init>((java.lang.Object) r9, (int) r2)
            r4.a(r7, r5, r1)
            F0.E r1 = new F0.E
            r2 = 0
            r1.<init>(r9, r2)
            r4.a(r7, r0, r1)
            F0.C r0 = new F0.C
            r1 = 14
            r0.<init>(r1)
            r4.a(r7, r8, r0)
            s2.e r0 = new s2.e
            r1 = 6
            r0.<init>((int) r1)
            java.lang.Class<java.net.URL> r1 = java.net.URL.class
            r4.a(r1, r8, r0)
            F0.e r0 = new F0.e
            r1 = 1
            r0.<init>(r6, r1)
            r4.a(r7, r12, r0)
            x1.i r0 = new x1.i
            r1 = 9
            r0.<init>((int) r1)
            java.lang.Class<F0.i> r1 = F0.i.class
            r4.a(r1, r8, r0)
            F0.C r0 = new F0.C
            r1 = 2
            r0.<init>(r1)
            java.lang.Class<byte[]> r1 = byte[].class
            r4.a(r1, r14, r0)
            F0.C r0 = new F0.C
            r2 = 4
            r0.<init>(r2)
            r4.a(r1, r8, r0)
            r4.a(r7, r7, r3)
            r4.a(r10, r10, r3)
            I0.C r0 = new I0.C
            r2 = 1
            r0.<init>(r2)
            r2 = r27
            r4.d(r2, r10, r10, r0)
            F0.A r0 = new F0.A
            r0.<init>(r15)
            r3 = r22
            r2 = r23
            r4.i(r2, r3, r0)
            r0 = r19
            r4.i(r2, r1, r0)
            B0.h r5 = new B0.h
            r6 = 17
            r7 = r18
            r8 = r20
            r5.<init>((java.lang.Object) r7, (java.lang.Object) r0, (java.lang.Object) r8, (int) r6)
            r4.i(r10, r1, r5)
            r0 = r16
            r4.i(r0, r1, r8)
            I0.G r0 = new I0.G
            H3.f r1 = new H3.f
            r5 = 8
            r1.<init>((int) r5)
            r0.<init>(r7, r1)
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            java.lang.String r5 = "legacy_append"
            r4.d(r5, r1, r2, r0)
            I0.a r1 = new I0.a
            r1.<init>(r15, r0)
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            java.lang.String r2 = "legacy_append"
            r4.d(r2, r0, r3, r1)
            java.util.Iterator r0 = r28.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x03a9
            return r4
        L_0x03a9:
            java.lang.ClassCastException r0 = o3.d.e(r0)
            throw r0
        L_0x03ae:
            monitor-exit(r6)     // Catch:{ all -> 0x03b0 }
            throw r0
        L_0x03b0:
            r0 = move-exception
            goto L_0x03ae
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.e.h(com.bumptech.glide.b, java.util.ArrayList):com.bumptech.glide.h");
    }

    public static int h0(int i2, int i5, float f6) {
        return C.d.b(C.d.d(i5, Math.round(((float) Color.alpha(i5)) * f6)), i2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, I1.b] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, I1.b] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, I1.b] */
    public static I1.b i(int i2) {
        if (i2 == 0) {
            return new Object();
        }
        if (i2 != 1) {
            return new Object();
        }
        return new Object();
    }

    public static int i0(int i2, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i2 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i2 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i2 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else if (i2 == 130) {
            i5 = rect2.top;
            i6 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i5 - i6);
    }

    public static byte[] j(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < 16; i2++) {
                byte b6 = (byte) ((bArr[i2] << 1) & 254);
                bArr2[i2] = b6;
                if (i2 < 15) {
                    bArr2[i2] = (byte) (((byte) ((bArr[i2 + 1] >> 7) & 1)) | b6);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static Typeface j0(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, com.bumptech.glide.d.h(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, K.N] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean k(android.view.View r4, android.view.KeyEvent r5) {
        /*
            java.util.WeakHashMap r0 = K.O.f1352a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L_0x000b
            goto L_0x009e
        L_0x000b:
            java.util.ArrayList r0 = K.N.d
            r0 = 2131298475(0x7f0908ab, float:1.8214924E38)
            java.lang.Object r1 = r4.getTag(r0)
            K.N r1 = (K.N) r1
            r3 = 0
            if (r1 != 0) goto L_0x0027
            K.N r1 = new K.N
            r1.<init>()
            r1.f1349a = r3
            r1.f1350b = r3
            r1.f1351c = r3
            r4.setTag(r0, r1)
        L_0x0027:
            java.lang.ref.WeakReference r4 = r1.f1351c
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L_0x0032
            goto L_0x009e
        L_0x0032:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r5)
            r1.f1351c = r4
            android.util.SparseArray r4 = r1.f1350b
            if (r4 != 0) goto L_0x0044
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r1.f1350b = r4
        L_0x0044:
            android.util.SparseArray r4 = r1.f1350b
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != r1) goto L_0x0060
            int r0 = r5.getKeyCode()
            int r0 = r4.indexOfKey(r0)
            if (r0 < 0) goto L_0x0060
            java.lang.Object r3 = r4.valueAt(r0)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r4.removeAt(r0)
        L_0x0060:
            if (r3 != 0) goto L_0x006d
            int r5 = r5.getKeyCode()
            java.lang.Object r4 = r4.get(r5)
            r3 = r4
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
        L_0x006d:
            if (r3 == 0) goto L_0x009e
            java.lang.Object r4 = r3.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x009d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L_0x009d
            r5 = 2131298476(0x7f0908ac, float:1.8214926E38)
            java.lang.Object r4 = r4.getTag(r5)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x009d
            int r5 = r4.size()
            int r5 = r5 - r1
            if (r5 >= 0) goto L_0x0090
            goto L_0x009d
        L_0x0090:
            java.lang.Object r4 = r4.get(r5)
            r4.getClass()
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L_0x009d:
            r2 = r1
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.e.k(android.view.View, android.view.KeyEvent):boolean");
    }

    public static int k0(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean l(K.C0070j r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            boolean r6 = r6.b(r9)
            return r6
        L_0x000f:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0081
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L_0x0064
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L_0x0064
            if (r7 == 0) goto L_0x0064
            boolean r1 = f1460c
            if (r1 != 0) goto L_0x004c
            java.lang.Class r1 = r7.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            d = r1     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            f1460c = r3
        L_0x004c:
            java.lang.reflect.Method r1 = d
            if (r1 == 0) goto L_0x0061
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            if (r7 != 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
            boolean r0 = r7.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0061 }
        L_0x0061:
            if (r0 == 0) goto L_0x0064
            goto L_0x0080
        L_0x0064:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L_0x006b
            goto L_0x0080
        L_0x006b:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = K.O.b(r6, r9)
            if (r7 == 0) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            if (r6 == 0) goto L_0x007c
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L_0x007c:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L_0x0080:
            return r3
        L_0x0081:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto L_0x00d4
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = f1461e
            if (r6 != 0) goto L_0x009a
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0098 }
            f1462f = r6     // Catch:{ NoSuchFieldException -> 0x0098 }
            r6.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0098 }
        L_0x0098:
            f1461e = r3
        L_0x009a:
            java.lang.reflect.Field r6 = f1462f
            if (r6 == 0) goto L_0x00a5
            java.lang.Object r6 = r6.get(r8)     // Catch:{ IllegalAccessException -> 0x00a5 }
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch:{ IllegalAccessException -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
            r6 = r2
        L_0x00a6:
            if (r6 == 0) goto L_0x00b3
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto L_0x00b3
            goto L_0x00d3
        L_0x00b3:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L_0x00be
            goto L_0x00d3
        L_0x00be:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = K.O.b(r6, r9)
            if (r7 == 0) goto L_0x00c9
            goto L_0x00d3
        L_0x00c9:
            if (r6 == 0) goto L_0x00cf
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L_0x00cf:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L_0x00d3:
            return r3
        L_0x00d4:
            if (r7 == 0) goto L_0x00dc
            boolean r7 = K.O.b(r7, r9)
            if (r7 != 0) goto L_0x00e2
        L_0x00dc:
            boolean r6 = r6.b(r9)
            if (r6 == 0) goto L_0x00e3
        L_0x00e2:
            r0 = r3
        L_0x00e3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.e.l(K.j, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static String l0(int i2) {
        if (i2 > 0) {
            return a.f(i2, "x");
        }
        return "x0";
    }

    public static int m(double d6) {
        return (int) Math.round(d6 * ((double) (MyApplication.f7090a.getApplicationContext().getResources().getDisplayMetrics().xdpi / 160.0f)));
    }

    public static float m0(EdgeEffect edgeEffect, float f6, float f7) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.c(edgeEffect, f6, f7);
        }
        Q.d.a(edgeEffect, f6, f7);
        return f6;
    }

    public static String n(C0404i iVar) {
        StringBuilder sb = new StringBuilder(iVar.size());
        for (int i2 = 0; i2 < iVar.size(); i2++) {
            byte k6 = iVar.k(i2);
            if (k6 == 34) {
                sb.append("\\\"");
            } else if (k6 == 39) {
                sb.append("\\'");
            } else if (k6 != 92) {
                switch (k6) {
                    case zzaky.zzf.zzg /*7*/:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*11*/:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (k6 >= 32 && k6 <= 126) {
                            sb.append((char) k6);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((k6 >>> 6) & 3) + 48));
                            sb.append((char) (((k6 >>> 3) & 7) + 48));
                            sb.append((char) ((k6 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int n0(int i2, int i5, Context context) {
        TypedValue h02 = c.h0(context, i2);
        if (h02 == null || h02.type != 16) {
            return i5;
        }
        return h02.data;
    }

    public static int o(int i2, int i5) {
        if (i5 >= 0) {
            int i6 = i2 + (i2 >> 1) + 1;
            if (i6 < i5) {
                i6 = Integer.highestOneBit(i5 - 1) << 1;
            }
            if (i6 < 0) {
                return f.API_PRIORITY_OTHER;
            }
            return i6;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public static TimeInterpolator o0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!d0(valueOf, "cubic-bezier") && !d0(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (d0(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return M.a.b(C(0, split), C(1, split), C(2, split), C(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (d0(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    C.j.b(c.k(substring), path);
                    return M.a.c(path);
                } catch (RuntimeException e6) {
                    throw new RuntimeException("Error in parsing ".concat(substring), e6);
                }
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static String p(double d6) {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(d6);
    }

    public static void p0() {
        FirebaseMessaging instance;
        Task task;
        String E02 = com.bumptech.glide.d.E0("notification_token", "no_set_yet");
        boolean z3 = true;
        try {
            A2.f fVar = new A2.f(MyApplication.f7090a.getApplicationContext());
            fVar.w();
            z3 = o0.b.a(MyApplication.f7090a.getApplicationContext(), fVar.e()).getBoolean("server_maximum_level", true);
        } catch (Exception unused) {
        }
        if ((E02.equals("no_set_yet") || z3) && o.getAccountObject() != null && o.getAccountObject().getId() != null) {
            U3.c cVar = FirebaseMessaging.f6901l;
            synchronized (FirebaseMessaging.class) {
                instance = FirebaseMessaging.getInstance(i.e());
            }
            J3.a aVar = instance.f6905b;
            if (aVar != null) {
                task = ((I3.g) aVar).a();
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                instance.g.execute(new m(instance, taskCompletionSource, 2));
                task = taskCompletionSource.getTask();
            }
            task.addOnSuccessListener(new C0435e(0));
        }
    }

    public static int q() {
        int meritsFromMedals = o.getSkillsObject().getMeritsFromMedals() + o.getSkillsObject().getMeritsFromChecksOrItems();
        for (String orDefault : o.getSkillsObject().getMeritsSkills().keySet()) {
            Integer orDefault2 = o.getSkillsObject().getMeritsSkills().getOrDefault(orDefault, 0);
            if (orDefault2 != null && orDefault2.intValue() > 0) {
                meritsFromMedals -= (int) ((((double) orDefault2.intValue()) * 0.5d) * ((double) (orDefault2.intValue() + 1)));
            }
        }
        return meritsFromMedals;
    }

    public static void q0(View view, s2.g gVar) {
        C0781a aVar = gVar.f11459a.f11442b;
        if (aVar != null && aVar.f9665a) {
            float f6 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = O.f1352a;
                f6 += K.D.i((View) parent);
            }
            s2.f fVar = gVar.f11459a;
            if (fVar.f11449l != f6) {
                fVar.f11449l = f6;
                gVar.m();
            }
        }
    }

    public static long r(long j6, long j7) {
        long W5 = (c.W(Long.valueOf(j6)) - j7) * 50;
        if (W5 < 0) {
            return 0;
        }
        return W5;
    }

    public static void r0(String str, int i2, C0447q qVar) {
        d.d(C0592h.b().e(), "players", str, "moneyObject", "cash").H(new C0258c(i2, qVar));
    }

    public static int s(int i2, int i5, Context context) {
        Integer num;
        int i6;
        TypedValue h02 = c.h0(context, i2);
        if (h02 != null) {
            int i7 = h02.resourceId;
            if (i7 != 0) {
                i6 = A.h.getColor(context, i7);
            } else {
                i6 = h02.data;
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i5;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [C5.f, C5.d] */
    public static C5.f s0(int i2, int i5) {
        if (i5 > Integer.MIN_VALUE) {
            return new C5.d(i2, i5 - 1, 1);
        }
        C5.f fVar = C5.f.d;
        return C5.f.d;
    }

    public static int t(View view, int i2) {
        Context context = view.getContext();
        TypedValue j02 = c.j0(i2, view.getContext(), view.getClass().getCanonicalName());
        int i5 = j02.resourceId;
        if (i5 != 0) {
            return A.h.getColor(context, i5);
        }
        return j02.data;
    }

    public static void t0(int i2, i0 i0Var) {
        a.d(a.c(C0592h.b().e(), "players"), "skillsObject", "meritsFromChecksOrItems").H(new l(i2, (Object) i0Var, 14));
    }

    public static String u() {
        return Settings.Secure.getString(MyApplication.f7090a.getApplicationContext().getContentResolver(), "android_id");
    }

    public static void u0(Context context, D d6) {
        R2.b.w(true);
        android.support.v4.media.session.a.B0(d6.f4293a, 11, 0, -1, new A(d6, context, 3), o.getAccountObject().getId(), android.support.v4.media.session.a.z(), false);
    }

    public static float v(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Q.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void v0(Context context, D d6) {
        int i2 = d6.f4293a;
        int i5 = d6.f4294b;
        if (i5 == 3) {
            android.support.v4.media.session.a.H0(context, i2);
        } else if (i5 == 7) {
            w0(context, d6);
        } else if (i5 == 0 || i5 == 1 || i5 == 14 || i5 == 15 || i5 == 16) {
            android.support.v4.media.session.a.F0(context, d6, (X4.d) null);
        } else if (i5 == 11) {
            u0(context, d6);
        } else if (i5 == 10) {
            R2.b.Z0(context, d6);
        } else if (i5 == 18) {
            R2.b.b1(context, d6);
        }
    }

    public static String w(int i2) {
        return a.f(i2, "id-");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0322, code lost:
        if ((d5.o.getGymObject().getStrength() - ((double) r1)) >= 0.0d) goto L_0x0326;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void w0(android.content.Context r21, Y4.D r22) {
        /*
            r0 = r21
            r1 = r22
            r3 = 6
            r4 = 12
            r5 = 11
            r6 = 1
            r7 = 0
            int r8 = r1.f4293a
            r9 = 2001(0x7d1, float:2.804E-42)
            r10 = 0
            if (r8 != r9) goto L_0x0049
            d5.k r1 = d5.o.getMainStatesObject()
            int r1 = r1.getPowerCurrent()
            int r2 = com.bumptech.glide.d.A0()
            if (r1 < r2) goto L_0x002a
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            r2 = 2131886986(0x7f12038a, float:1.9408566E38)
            com.google.android.gms.internal.measurement.a.n(r1, r2, r0, r10)
            goto L_0x044f
        L_0x002a:
            R2.b.w(r6)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r13 = r1.getId()
            java.lang.String r14 = android.support.v4.media.session.a.z()
            D0.e r12 = new D0.e
            r1 = 9
            r12.<init>(r0, r1)
            r9 = 7
            r10 = 0
            r11 = -1
            r15 = 0
            android.support.v4.media.session.a.B0(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x044f
        L_0x0049:
            r9 = 2002(0x7d2, float:2.805E-42)
            if (r8 != r9) goto L_0x0084
            d5.k r1 = d5.o.getMainStatesObject()
            int r1 = r1.getCourageCurrent()
            int r2 = com.bumptech.glide.d.d0()
            if (r1 < r2) goto L_0x0065
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            r2 = 2131886980(0x7f120384, float:1.9408554E38)
            com.google.android.gms.internal.measurement.a.n(r1, r2, r0, r10)
            goto L_0x044f
        L_0x0065:
            R2.b.w(r6)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r13 = r1.getId()
            java.lang.String r14 = android.support.v4.media.session.a.z()
            D0.e r12 = new D0.e
            r1 = 10
            r12.<init>(r0, r1)
            r9 = 7
            r10 = 0
            r11 = -1
            r15 = 0
            android.support.v4.media.session.a.B0(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x044f
        L_0x0084:
            r9 = 2003(0x7d3, float:2.807E-42)
            if (r8 != r9) goto L_0x00bb
            d5.k r1 = d5.o.getMainStatesObject()
            int r1 = r1.getNobilityCurrent()
            r2 = 100
            if (r1 < r2) goto L_0x009e
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            r2 = 2131886984(0x7f120388, float:1.9408562E38)
            com.google.android.gms.internal.measurement.a.n(r1, r2, r0, r10)
            goto L_0x044f
        L_0x009e:
            R2.b.w(r6)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r13 = r1.getId()
            java.lang.String r14 = android.support.v4.media.session.a.z()
            D0.e r12 = new D0.e
            r12.<init>(r0, r5)
            r9 = 7
            r10 = 0
            r11 = -1
            r15 = 0
            android.support.v4.media.session.a.B0(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x044f
        L_0x00bb:
            r9 = 2004(0x7d4, float:2.808E-42)
            if (r8 != r9) goto L_0x00c4
            android.support.v4.media.session.a.G0(r0, r10, r7)
            goto L_0x044f
        L_0x00c4:
            r9 = 2005(0x7d5, float:2.81E-42)
            if (r8 == r9) goto L_0x03ed
            r9 = 2006(0x7d6, float:2.811E-42)
            if (r8 == r9) goto L_0x03ed
            r9 = 2007(0x7d7, float:2.812E-42)
            if (r8 != r9) goto L_0x00d2
            goto L_0x03ed
        L_0x00d2:
            r9 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r9) goto L_0x00f5
            R2.b.w(r6)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r10 = r1.getId()
            java.lang.String r11 = android.support.v4.media.session.a.z()
            D0.e r9 = new D0.e
            r9.<init>(r0, r4)
            r6 = 7
            r7 = 0
            r5 = 2008(0x7d8, float:2.814E-42)
            r8 = -1
            r12 = 0
            android.support.v4.media.session.a.B0(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x044f
        L_0x00f5:
            r9 = 2020(0x7e4, float:2.83E-42)
            r11 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r12 = 2131296622(0x7f09016e, float:1.8211166E38)
            r13 = 2131296617(0x7f090169, float:1.8211156E38)
            r14 = 2131296620(0x7f09016c, float:1.8211162E38)
            r15 = 2131296615(0x7f090167, float:1.8211152E38)
            r5 = 2131296625(0x7f090171, float:1.8211172E38)
            r2 = 2131492929(0x7f0c0041, float:1.8609324E38)
            if (r8 != r9) goto L_0x01b2
            boolean r1 = h
            if (r1 == 0) goto L_0x0114
            goto L_0x044f
        L_0x0114:
            h = r6
            e5.b r1 = new e5.b
            r1.<init>(r0, r2)
            android.view.View r2 = r1.findViewById(r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r4 = r1.findViewById(r15)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.View r5 = r1.findViewById(r14)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            android.view.View r6 = r1.findViewById(r13)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            android.view.View r8 = r1.findViewById(r12)
            android.widget.TextView r8 = (android.widget.TextView) r8
            d5.k r9 = d5.o.getMainStatesObject()
            int r9 = r9.getGender()
            r10 = 2131887478(0x7f120576, float:1.9409564E38)
            r12 = 2131887479(0x7f120577, float:1.9409566E38)
            r13 = 2131886423(0x7f120157, float:1.9407424E38)
            if (r9 != 0) goto L_0x0172
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r14 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r14 = r14.getApplicationContext()
            java.lang.String r12 = r14.getString(r12)
            com.mtma.criminal.city.app.MyApplication r14 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r14 = r14.getApplicationContext()
            java.lang.String r10 = r14.getString(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r12, r10}
            java.lang.String r9 = r9.getString(r13, r10)
            r2.setText(r9)
            goto L_0x0197
        L_0x0172:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            com.mtma.criminal.city.app.MyApplication r14 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r14 = r14.getApplicationContext()
            java.lang.String r10 = r14.getString(r10)
            com.mtma.criminal.city.app.MyApplication r14 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r14 = r14.getApplicationContext()
            java.lang.String r12 = r14.getString(r12)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r12}
            java.lang.String r9 = r9.getString(r13, r10)
            r2.setText(r9)
        L_0x0197:
            r4.setVisibility(r7)
            r8.setText(r11)
            com.mtma.criminal.city.utils.i r2 = new com.mtma.criminal.city.utils.i
            r2.<init>(r5, r1, r0)
            r5.setOnClickListener(r2)
            com.mtma.criminal.city.activities.m r0 = new com.mtma.criminal.city.activities.m
            r0.<init>(r6, r1, r3)
            r6.setOnClickListener(r0)
            r1.show()
            goto L_0x044f
        L_0x01b2:
            r9 = 2018(0x7e2, float:2.828E-42)
            if (r8 != r9) goto L_0x0230
            boolean r1 = g
            if (r1 == 0) goto L_0x01bc
            goto L_0x044f
        L_0x01bc:
            g = r6
            e5.b r1 = new e5.b
            r2 = 2131492935(0x7f0c0047, float:1.8609336E38)
            r1.<init>(r0, r2)
            r2 = 2131296696(0x7f0901b8, float:1.8211316E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131296692(0x7f0901b4, float:1.8211308E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r5 = 2131296693(0x7f0901b5, float:1.821131E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r8 = 2131296694(0x7f0901b6, float:1.8211312E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r9 = 2131296695(0x7f0901b7, float:1.8211314E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131296691(0x7f0901b3, float:1.8211306E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r11 = 2131886989(0x7f12038d, float:1.9408572E38)
            r2.setText(r11)
            r2 = 2131886150(0x7f120046, float:1.940687E38)
            r3.setText(r2)
            r2 = 2131886255(0x7f1200af, float:1.9407084E38)
            r9.setText(r2)
            android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
            r2.<init>(r4)
            android.text.InputFilter[] r3 = new android.text.InputFilter[r6]
            r3[r7] = r2
            r5.setFilters(r3)
            A4.i r2 = new A4.i
            r2.<init>(r8, r5, r0, r1)
            r8.setOnClickListener(r2)
            com.mtma.criminal.city.activities.m r0 = new com.mtma.criminal.city.activities.m
            r2 = 7
            r0.<init>(r10, r1, r2)
            r10.setOnClickListener(r0)
            r1.show()
            goto L_0x044f
        L_0x0230:
            r4 = 2082(0x822, float:2.918E-42)
            if (r8 != r4) goto L_0x027b
            d5.k r2 = d5.o.getMainStatesObject()
            int r2 = r2.getPowerCurrent()
            int r2 = r2 + 500
            r4 = 5000(0x1388, float:7.006E-42)
            if (r2 <= r4) goto L_0x025c
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 2131888298(0x7f1208aa, float:1.9411227E38)
            java.lang.String r1 = r1.getString(r3, r2)
            com.bumptech.glide.c.s0(r0, r1, r10)
            goto L_0x044f
        L_0x025c:
            R2.b.w(r6)
            d5.a r2 = d5.o.getAccountObject()
            java.lang.String r9 = r2.getId()
            java.lang.String r10 = android.support.v4.media.session.a.z()
            int r4 = r1.f4293a
            F0.e r8 = new F0.e
            r8.<init>(r0, r3)
            r5 = 7
            r6 = 0
            r7 = -1
            r11 = 0
            android.support.v4.media.session.a.B0(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x044f
        L_0x027b:
            r1 = 2083(0x823, float:2.919E-42)
            if (r8 != r1) goto L_0x0281
            goto L_0x044f
        L_0x0281:
            r1 = 2030(0x7ee, float:2.845E-42)
            if (r8 != r1) goto L_0x028f
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            r2 = 2131888124(0x7f1207fc, float:1.9410874E38)
            com.google.android.gms.internal.measurement.a.n(r1, r2, r0, r10)
            goto L_0x044f
        L_0x028f:
            r1 = 2026(0x7ea, float:2.839E-42)
            if (r8 == r1) goto L_0x029f
            r1 = 2027(0x7eb, float:2.84E-42)
            if (r8 == r1) goto L_0x029f
            r1 = 2028(0x7ec, float:2.842E-42)
            if (r8 == r1) goto L_0x029f
            r1 = 2029(0x7ed, float:2.843E-42)
            if (r8 != r1) goto L_0x02a2
        L_0x029f:
            r3 = r8
            goto L_0x03ce
        L_0x02a2:
            r1 = 2058(0x80a, float:2.884E-42)
            if (r8 < r1) goto L_0x02aa
            r1 = 2070(0x816, float:2.9E-42)
            if (r8 <= r1) goto L_0x02b2
        L_0x02aa:
            r1 = 2084(0x824, float:2.92E-42)
            if (r8 < r1) goto L_0x02d0
            r1 = 2087(0x827, float:2.925E-42)
            if (r8 > r1) goto L_0x02d0
        L_0x02b2:
            R2.b.w(r6)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r13 = r1.getId()
            java.lang.String r14 = android.support.v4.media.session.a.z()
            com.mtma.criminal.city.utils.M r12 = new com.mtma.criminal.city.utils.M
            r1 = 2
            r12.<init>(r8, r1, r0)
            r9 = 7
            r10 = 0
            r11 = -1
            r15 = 0
            android.support.v4.media.session.a.B0(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x044f
        L_0x02d0:
            r1 = 2034(0x7f2, float:2.85E-42)
            if (r8 < r1) goto L_0x044f
            r1 = 2057(0x809, float:2.882E-42)
            if (r8 > r1) goto L_0x044f
            switch(r8) {
                case 2034: goto L_0x02e0;
                case 2035: goto L_0x02e0;
                case 2036: goto L_0x02e0;
                case 2037: goto L_0x02e0;
                case 2038: goto L_0x02e0;
                case 2039: goto L_0x02e0;
                case 2040: goto L_0x02e0;
                case 2041: goto L_0x02e0;
                case 2042: goto L_0x02e0;
                case 2043: goto L_0x02e0;
                case 2044: goto L_0x02e0;
                case 2045: goto L_0x02e0;
                case 2046: goto L_0x02dd;
                case 2047: goto L_0x02dd;
                case 2048: goto L_0x02dd;
                case 2049: goto L_0x02dd;
                case 2050: goto L_0x02dd;
                case 2051: goto L_0x02dd;
                case 2052: goto L_0x02dd;
                case 2053: goto L_0x02dd;
                case 2054: goto L_0x02dd;
                case 2055: goto L_0x02dd;
                case 2056: goto L_0x02dd;
                case 2057: goto L_0x02dd;
                default: goto L_0x02db;
            }
        L_0x02db:
            r1 = r7
            goto L_0x02e2
        L_0x02dd:
            r1 = 10000(0x2710, float:1.4013E-41)
            goto L_0x02e2
        L_0x02e0:
            r1 = 1000(0x3e8, float:1.401E-42)
        L_0x02e2:
            java.lang.String r3 = "strength"
            java.lang.String r4 = "dexterity"
            java.lang.String r9 = "speed"
            java.lang.String r10 = "defense"
            java.lang.String r16 = ""
            switch(r8) {
                case 2034: goto L_0x02f8;
                case 2035: goto L_0x02f6;
                case 2036: goto L_0x02f4;
                case 2037: goto L_0x02f2;
                case 2038: goto L_0x02f6;
                case 2039: goto L_0x02f4;
                case 2040: goto L_0x02f2;
                case 2041: goto L_0x02f8;
                case 2042: goto L_0x02f4;
                case 2043: goto L_0x02f2;
                case 2044: goto L_0x02f8;
                case 2045: goto L_0x02f6;
                case 2046: goto L_0x02f8;
                case 2047: goto L_0x02f6;
                case 2048: goto L_0x02f4;
                case 2049: goto L_0x02f2;
                case 2050: goto L_0x02f6;
                case 2051: goto L_0x02f4;
                case 2052: goto L_0x02f2;
                case 2053: goto L_0x02f8;
                case 2054: goto L_0x02f4;
                case 2055: goto L_0x02f2;
                case 2056: goto L_0x02f8;
                case 2057: goto L_0x02f6;
                default: goto L_0x02ef;
            }
        L_0x02ef:
            r11 = r16
            goto L_0x02f9
        L_0x02f2:
            r11 = r3
            goto L_0x02f9
        L_0x02f4:
            r11 = r4
            goto L_0x02f9
        L_0x02f6:
            r11 = r9
            goto L_0x02f9
        L_0x02f8:
            r11 = r10
        L_0x02f9:
            switch(r8) {
                case 2034: goto L_0x0305;
                case 2035: goto L_0x0305;
                case 2036: goto L_0x0305;
                case 2037: goto L_0x0303;
                case 2038: goto L_0x0303;
                case 2039: goto L_0x0303;
                case 2040: goto L_0x0301;
                case 2041: goto L_0x0301;
                case 2042: goto L_0x0301;
                case 2043: goto L_0x02ff;
                case 2044: goto L_0x02ff;
                case 2045: goto L_0x02ff;
                case 2046: goto L_0x0305;
                case 2047: goto L_0x0305;
                case 2048: goto L_0x0305;
                case 2049: goto L_0x0303;
                case 2050: goto L_0x0303;
                case 2051: goto L_0x0303;
                case 2052: goto L_0x0301;
                case 2053: goto L_0x0301;
                case 2054: goto L_0x0301;
                case 2055: goto L_0x02ff;
                case 2056: goto L_0x02ff;
                case 2057: goto L_0x02ff;
                default: goto L_0x02fc;
            }
        L_0x02fc:
            r12 = r16
            goto L_0x0306
        L_0x02ff:
            r12 = r4
            goto L_0x0306
        L_0x0301:
            r12 = r9
            goto L_0x0306
        L_0x0303:
            r12 = r10
            goto L_0x0306
        L_0x0305:
            r12 = r3
        L_0x0306:
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            r11 = r11[r7]
            boolean r3 = r11.equals(r3)
            r17 = 0
            if (r3 == 0) goto L_0x0325
            d5.h r3 = d5.o.getGymObject()
            double r19 = r3.getStrength()
            r3 = r8
            double r7 = (double) r1
            double r19 = r19 - r7
            int r7 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r7 < 0) goto L_0x0362
            goto L_0x0326
        L_0x0325:
            r3 = r8
        L_0x0326:
            boolean r7 = r11.equals(r10)
            if (r7 == 0) goto L_0x033a
            d5.h r7 = d5.o.getGymObject()
            double r7 = r7.getDefense()
            double r12 = (double) r1
            double r7 = r7 - r12
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 < 0) goto L_0x0362
        L_0x033a:
            boolean r7 = r11.equals(r9)
            if (r7 == 0) goto L_0x034e
            d5.h r7 = d5.o.getGymObject()
            double r7 = r7.getSpeed()
            double r9 = (double) r1
            double r7 = r7 - r9
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 < 0) goto L_0x0362
        L_0x034e:
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x03c9
            d5.h r4 = d5.o.getGymObject()
            double r7 = r4.getDexterity()
            double r9 = (double) r1
            double r7 = r7 - r9
            int r1 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r1 >= 0) goto L_0x03c9
        L_0x0362:
            boolean r1 = I1.b.f1152f
            if (r1 == 0) goto L_0x0368
            goto L_0x044f
        L_0x0368:
            I1.b.f1152f = r6
            e5.b r1 = new e5.b
            r1.<init>(r0, r2)
            r2 = 2131296626(0x7f090172, float:1.8211174E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.View r4 = r1.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r5 = r1.findViewById(r15)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            android.view.View r6 = r1.findViewById(r14)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r7 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r8 = 2131296622(0x7f09016e, float:1.8211166E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 0
            r5.setVisibility(r9)
            r5 = 2131888159(0x7f12081f, float:1.9410945E38)
            r2.setText(r5)
            r2 = 2131886161(0x7f120051, float:1.9406893E38)
            r4.setText(r2)
            r2 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r8.setText(r2)
            com.mtma.criminal.city.utils.j r2 = new com.mtma.criminal.city.utils.j
            r2.<init>((android.widget.RelativeLayout) r6, (e5.C0505b) r1, (android.content.Context) r0, (int) r3)
            r6.setOnClickListener(r2)
            com.mtma.criminal.city.activities.m r0 = new com.mtma.criminal.city.activities.m
            r2 = 11
            r0.<init>(r7, r1, r2)
            r7.setOnClickListener(r0)
            r1.show()
            goto L_0x044f
        L_0x03c9:
            I1.b.G0(r0, r3)
            goto L_0x044f
        L_0x03ce:
            R2.b.w(r6)
            d5.a r1 = d5.o.getAccountObject()
            java.lang.String r13 = r1.getId()
            java.lang.String r14 = android.support.v4.media.session.a.z()
            com.mtma.criminal.city.utils.M r1 = new com.mtma.criminal.city.utils.M
            r2 = 0
            r1.<init>(r3, r2, r0)
            r9 = 7
            r10 = 0
            r11 = -1
            r15 = 0
            r8 = r3
            r12 = r1
            android.support.v4.media.session.a.B0(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x044f
        L_0x03ed:
            d5.i r2 = d5.o.getHerbObject()
            java.util.ArrayList r2 = r2.getHerbIdsList()
            int r3 = r1.f4293a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x0443
            d5.i r2 = d5.o.getHerbObject()
            java.util.ArrayList r2 = r2.getHerbIdsList()
            d5.i r3 = d5.o.getHerbObject()
            java.util.ArrayList r3 = r3.getHerbUsingStartTimeList()
            int r4 = r1.f4293a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r4 = r2.indexOf(r4)
            java.lang.Object r3 = r3.get(r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = R2.b.T(r2)
            long r2 = r2 + r7
            long r4 = com.bumptech.glide.c.f5744o
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0443
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a
            r2 = 2131886412(0x7f12014c, float:1.9407402E38)
            com.google.android.gms.internal.measurement.a.n(r1, r2, r0, r10)
            goto L_0x044f
        L_0x0443:
            R2.b.w(r6)
            com.mtma.criminal.city.utils.A r2 = new com.mtma.criminal.city.utils.A
            r3 = 2
            r2.<init>((Y4.D) r1, (android.content.Context) r0, (int) r3)
            com.bumptech.glide.c.s(r6, r2)
        L_0x044f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.e.w0(android.content.Context, Y4.D):void");
    }

    public static String x(int i2, int i5) {
        if (i5 <= 0) {
            return a.f(i2, "id-");
        }
        String d6 = d(2, (long) i5);
        return "id-" + d6 + i2;
    }

    public static zzait x0(C0495c cVar, String str) {
        I.g(cVar);
        if (p.class.isAssignableFrom(cVar.getClass())) {
            p pVar = (p) cVar;
            return new zzait(pVar.f7652a, pVar.f7653b, "google.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        if (C0497e.class.isAssignableFrom(cVar.getClass())) {
            return new zzait((String) null, ((C0497e) cVar).f7644a, "facebook.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        if (C0490A.class.isAssignableFrom(cVar.getClass())) {
            C0490A a6 = (C0490A) cVar;
            return new zzait((String) null, a6.f7597a, "twitter.com", (String) null, a6.f7598b, (String) null, str, (String) null, (String) null);
        }
        if (e3.o.class.isAssignableFrom(cVar.getClass())) {
            return new zzait((String) null, ((e3.o) cVar).f7651a, "github.com", (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        if (x.class.isAssignableFrom(cVar.getClass())) {
            return new zzait((String) null, (String) null, "playgames.google.com", (String) null, (String) null, ((x) cVar).f7661a, str, (String) null, (String) null);
        }
        if (G.class.isAssignableFrom(cVar.getClass())) {
            G g5 = (G) cVar;
            zzait zzait = g5.d;
            if (zzait != null) {
                return zzait;
            }
            return new zzait(g5.f7618b, g5.f7619c, g5.f7617a, (String) null, g5.f7621f, (String) null, str, g5.f7620e, g5.f7622p);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }

    public static String y(int i2) {
        if (i2 == 0) {
            return "guns";
        }
        if (i2 == 1) {
            return "armors";
        }
        if (i2 == 2) {
            return "grocery";
        }
        if (i2 == 3) {
            return "pharmacy";
        }
        if (i2 == 4) {
            return "flowers";
        }
        if (i2 == 5) {
            return "food";
        }
        if (i2 == 6) {
            return "crimeReward";
        }
        if (i2 == 7) {
            return "shop";
        }
        if (i2 == 8) {
            return "work";
        }
        if (i2 == 9) {
            return "specialties";
        }
        if (i2 == 10) {
            return "herbs";
        }
        if (i2 == 11) {
            return "cards";
        }
        if (i2 == 12) {
            return "tunnel";
        }
        if (i2 == 13) {
            return "upgrade";
        }
        if (i2 == 15) {
            return "specialEquipments";
        }
        if (i2 == 16) {
            return "bioChemical";
        }
        if (i2 == 14) {
            return "upgradedWeapons";
        }
        if (i2 == 17) {
            return "pieces";
        }
        if (i2 == 18) {
            return "plates";
        }
        return "others";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a4, code lost:
        if (r1 == null) goto L_0x00d1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader y0() {
        /*
            java.lang.Class<K1.e> r0 = K1.e.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = f1458a     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x00d6
            java.lang.Thread r1 = f1459b     // Catch:{ all -> 0x00a7 }
            r2 = 0
            if (r1 != 0) goto L_0x00ab
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00a7 }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x00a7 }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x001d
            r1 = r2
            goto L_0x00a2
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x00a7 }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x0042 }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x0042 }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x0042 }
            r6 = 0
            r7 = r6
        L_0x002b:
            if (r7 >= r4) goto L_0x0044
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x0042 }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x0042 }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x0042 }
            if (r9 == 0) goto L_0x003c
            goto L_0x0045
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x003f:
            r1 = move-exception
            goto L_0x00a9
        L_0x0042:
            r1 = move-exception
            goto L_0x0084
        L_0x0044:
            r8 = r2
        L_0x0045:
            if (r8 != 0) goto L_0x004e
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0042 }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x0042 }
        L_0x004e:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x0042 }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x0042 }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x0042 }
        L_0x0057:
            if (r6 >= r1) goto L_0x006b
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x0042 }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x0042 }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x0042 }
            if (r7 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x0057
        L_0x006b:
            r5 = r2
        L_0x006c:
            if (r5 != 0) goto L_0x00a0
            E0.a r1 = new E0.a     // Catch:{ SecurityException -> 0x0082 }
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch:{ SecurityException -> 0x0082 }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x007d }
            r1.start()     // Catch:{ SecurityException -> 0x007d }
            r5 = r1
            goto L_0x00a0
        L_0x007d:
            r4 = move-exception
            r5 = r1
            goto L_0x0086
        L_0x0080:
            r4 = r1
            goto L_0x0086
        L_0x0082:
            r1 = move-exception
            goto L_0x0080
        L_0x0084:
            r4 = r1
            r5 = r2
        L_0x0086:
            java.lang.String r1 = "DynamiteLoaderV2CL"
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x003f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r6.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r7 = "Failed to enumerate thread/threadgroup "
            r6.append(r7)     // Catch:{ all -> 0x003f }
            r6.append(r4)     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x003f }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x003f }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            r1 = r5
        L_0x00a2:
            f1459b = r1     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x00ab
            goto L_0x00d1
        L_0x00a7:
            r1 = move-exception
            goto L_0x00da
        L_0x00a9:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00ab:
            monitor-enter(r1)     // Catch:{ all -> 0x00a7 }
            java.lang.Thread r3 = f1459b     // Catch:{ SecurityException -> 0x00b5 }
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch:{ SecurityException -> 0x00b5 }
            goto L_0x00d0
        L_0x00b3:
            r2 = move-exception
            goto L_0x00d4
        L_0x00b5:
            r3 = move-exception
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r5.<init>()     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = "Failed to get thread context classloader "
            r5.append(r6)     // Catch:{ all -> 0x00b3 }
            r5.append(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00b3 }
            android.util.Log.w(r4, r3)     // Catch:{ all -> 0x00b3 }
        L_0x00d0:
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
        L_0x00d1:
            f1458a = r2     // Catch:{ all -> 0x00a7 }
            goto L_0x00d6
        L_0x00d4:
            monitor-exit(r1)     // Catch:{ all -> 0x00b3 }
            throw r2     // Catch:{ all -> 0x00a7 }
        L_0x00d6:
            java.lang.ClassLoader r1 = f1458a     // Catch:{ all -> 0x00a7 }
            monitor-exit(r0)
            return r1
        L_0x00da:
            monitor-exit(r0)     // Catch:{ all -> 0x00a7 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.e.y0():java.lang.ClassLoader");
    }

    public static int z(int i2) {
        return (int) (((double) i2) * (1.0d - S(17)));
    }
}
