package j4;

import A2.f;
import A4.i;
import F0.C0015e;
import K1.e;
import K4.l;
import R2.b;
import X4.d;
import Y4.C0246c;
import Y4.D;
import android.content.Context;
import android.text.InputFilter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.m;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.h0;
import d5.o;
import e5.C0505b;
import i3.C0592h;
import java.util.ArrayList;

public final class Z extends ArrayAdapter {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8964a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8965b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8966c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8967e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8968f;

    public Z(Context context, ArrayList arrayList, int i2, int i5) {
        super(context, 0, arrayList);
        this.f8967e = false;
        this.f8968f = false;
        this.f8965b = context;
        this.f8966c = i2;
        this.d = i5;
    }

    public static void a(Z z3, int i2) {
        z3.getClass();
        a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "level").d(new d(z3, D.s(i2, 0, 1), 25));
    }

    public static void b(Z z3, int i2, int i5) {
        long j6;
        String str;
        z3.getClass();
        D s6 = D.s(i2, 0, 1);
        int i6 = z3.d;
        if (i6 == 0) {
            j6 = s6.f4290B;
        } else {
            j6 = s6.f4291C;
        }
        long j7 = j6 * ((long) i5);
        String id = o.getAccountObject().getId();
        if (i6 == 0) {
            str = "gold";
        } else if (i6 == 1) {
            str = "check";
        } else {
            str = null;
        }
        U.g(id, str, -j7, new f((Object) z3, (Object) s6, i5, 16));
    }

    public static void c(Z z3, int i2) {
        if (!z3.f8968f) {
            z3.f8968f = true;
            C0505b bVar = new C0505b(z3.f8965b, R.layout.dialog_money_icon);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_money_icon_cost);
            ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_money_icon_cost_image);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_money_icon_description);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_ok_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_cancel_button);
            b.c((LinearLayout) bVar.findViewById(R.id.dialog_money_icon_money_layout), 3);
            D s6 = D.s(i2, 0, 1);
            if (s6.f4293a != 2004 || o.getLocationObject().getCurrentCity() == 0) {
                int i5 = s6.f4293a;
                if (i5 == 2010) {
                    s6.f4290B = I1.b.f0(o.getStockObject().getStockSpace(), 200);
                    s6.f4291C = I1.b.f0(o.getStockObject().getStockSpace(), 2000);
                } else if (i5 == 2013) {
                    s6.f4290B = (((long) o.getStockObject().getMuseumSpace()) * 100) + 100;
                }
            } else {
                s6.f4290B *= 4;
                s6.f4291C *= 4;
            }
            int i6 = z3.d;
            if (i6 == 0) {
                textView.setText(U.a(s6.f4290B));
                imageView.setImageResource(R.drawable.gold_icon);
            } else if (i6 == 1) {
                textView.setText(U.a(s6.f4291C));
                imageView.setImageResource(R.drawable.check_icon);
            }
            textView2.setText(R.string.confirm_buy_material);
            relativeLayout.setOnClickListener(new i(z3, relativeLayout, s6, bVar, 9));
            relativeLayout2.setOnClickListener(new t0(z3, relativeLayout2, bVar, 1));
            bVar.show();
        }
    }

    public static void d(Z z3, int i2) {
        LinearLayout linearLayout;
        long j6;
        long gold;
        Z z4 = z3;
        if (!z4.f8967e) {
            z4.f8967e = true;
            C0505b bVar = new C0505b(z4.f8965b, R.layout.dialog_buy_item);
            ConstraintLayout constraintLayout = (ConstraintLayout) bVar.findViewById(R.id.dialog_buy_item_main_layout);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_buy_item_total_cost);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_buy_item_name);
            TextView textView3 = (TextView) bVar.findViewById(R.id.dialog_buy_item_description);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) bVar.findViewById(R.id.dialog_buy_item_special_equipment_layout);
            TextView textView4 = (TextView) bVar.findViewById(R.id.dialog_buy_item_special_equipment_happiness);
            GridView gridView = (GridView) bVar.findViewById(R.id.dialog_buy_item_special_equipment_skill_grid_view);
            ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_buy_item_type_cost_image);
            LinearLayout linearLayout2 = (LinearLayout) bVar.findViewById(R.id.dialog_buy_item_cost_layout);
            ImageView imageView2 = (ImageView) bVar.findViewById(R.id.dialog_buy_item_image);
            EditText editText = (EditText) bVar.findViewById(R.id.dialog_buy_item_edit_text);
            SeekBar seekBar = (SeekBar) bVar.findViewById(R.id.dialog_buy_item_seekbar_view);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_buy_item_buy_button);
            C0505b bVar2 = bVar;
            ImageView imageView3 = (ImageView) bVar.findViewById(R.id.dialog_buy_item_close_button);
            D s6 = D.s(i2, 0, 1);
            if (s6.f4293a != 2004 || o.getLocationObject().getCurrentCity() == 0) {
                LinearLayout linearLayout3 = linearLayout2;
                int i5 = s6.f4293a;
                if (i5 == 2010) {
                    linearLayout = linearLayout3;
                    s6.f4290B = I1.b.f0(o.getStockObject().getStockSpace(), 200);
                    imageView = imageView;
                    s6.f4291C = I1.b.f0(o.getStockObject().getStockSpace(), 2000);
                } else {
                    linearLayout = linearLayout3;
                    if (i5 == 2013) {
                        s6.f4290B = (((long) o.getStockObject().getMuseumSpace()) * 100) + 100;
                    }
                }
            } else {
                s6.f4290B *= 4;
                s6.f4291C *= 4;
                linearLayout = linearLayout2;
            }
            textView2.setText(s6.f4295c);
            imageView2.setImageResource(s6.d);
            if (s6.f4306q) {
                textView3.setTextSize(14.0f);
                if (s6.f4308s != -1) {
                    textView3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gun_description, new Object[]{Integer.valueOf(s6.y()), Integer.valueOf(s6.x())}));
                } else {
                    textView3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.armor_description, new Object[]{Integer.valueOf(s6.z()), Integer.valueOf(s6.A())}));
                }
            } else if (s6.f4294b == 15) {
                constraintLayout2.setVisibility(0);
                textView4.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_plus_sign, new Object[]{Integer.valueOf(s6.f4314y)}));
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < s6.f4315z.size(); i6++) {
                    arrayList.add(new C0246c(e.R(((Integer) s6.f4315z.get(i6)).intValue()), ((Integer) s6.f4289A.get(i6)).intValue(), e.M(((Integer) s6.f4315z.get(i6)).intValue())));
                }
                constraintLayout.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new M(z3, constraintLayout, arrayList, gridView, 2));
            } else {
                textView3.setText(s6.f4296e);
            }
            if (z4.d == 1) {
                j6 = s6.f4291C;
                gold = (long) o.getMoneyObject().getCheck();
                textView.setText(U.a(j6));
                imageView.setImageResource(R.drawable.check_icon);
            } else {
                j6 = s6.f4290B;
                gold = (long) o.getMoneyObject().getGold();
                textView.setText(U.a(j6));
                imageView.setImageResource(R.drawable.gold_icon);
            }
            long j7 = gold;
            long j8 = j6;
            b.c(linearLayout, 3);
            editText.setText("1");
            seekBar.setProgress((int) ((1.0d / ((double) (j7 / j8))) * 100.0d));
            D d6 = s6;
            ImageView imageView4 = imageView3;
            SeekBar seekBar2 = seekBar;
            seekBar2.setOnSeekBarChangeListener(new r0(editText, j7, j8));
            Z z5 = z3;
            RelativeLayout relativeLayout2 = relativeLayout;
            editText.addTextChangedListener(new s0(z5, j8, j7, editText, seekBar2, textView));
            relativeLayout2.setOnClickListener(new l(z5, relativeLayout2, editText, d6, bVar2, 8));
            C0505b bVar3 = bVar2;
            imageView4.setOnClickListener(new t0(z4, imageView4, bVar3, 0));
            bVar3.show();
        }
    }

    public static void e(Z z3, Y4.l lVar) {
        Z z4 = z3;
        Y4.l lVar2 = lVar;
        if (!z4.f8968f) {
            z4.f8968f = true;
            Context context = z4.f8965b;
            C0505b bVar = new C0505b(context, R.layout.dialog_gang_positions);
            ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_gang_position_close_button);
            RadioGroup radioGroup = (RadioGroup) bVar.findViewById(R.id.dialog_gang_position_radio_group);
            RadioButton radioButton = (RadioButton) bVar.findViewById(R.id.dialog_gang_position_vise_radio_button);
            RadioButton radioButton2 = (RadioButton) bVar.findViewById(R.id.dialog_gang_position_advisor_radio_button);
            RadioButton radioButton3 = (RadioButton) bVar.findViewById(R.id.dialog_gang_position_operation_chief_radio_button);
            RadioButton radioButton4 = (RadioButton) bVar.findViewById(R.id.dialog_gang_position_fighter_radio_button);
            RadioButton radioButton5 = (RadioButton) bVar.findViewById(R.id.dialog_gang_position_new_radio_button);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_gang_position_change_button);
            if (lVar2.h == 1) {
                radioButton.setChecked(true);
                radioButton.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_vise_with_current_position_word));
                radioButton.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.fight_green_text, context.getTheme()));
            } else {
                int j6 = z4.j(1);
                if (j6 == 0 || o.getGangObject().getPosition() >= 1) {
                    radioButton.setEnabled(false);
                    radioButton.setFocusable(false);
                    radioButton.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_vise_with_not_available_word));
                    radioButton.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.red_rust, context.getTheme()));
                } else {
                    radioButton.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_vise_with_available_word, new Object[]{Integer.valueOf(j6)}));
                }
            }
            if (lVar2.h == 2) {
                radioButton2.setChecked(true);
                radioButton2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_advisor_with_current_position_word));
                radioButton2.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.fight_green_text, context.getTheme()));
            } else {
                int j7 = z4.j(2);
                if (j7 == 0 || o.getGangObject().getPosition() >= 2) {
                    radioButton2.setEnabled(false);
                    radioButton2.setFocusable(false);
                    radioButton2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_advisor_with_not_available_word));
                    radioButton2.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.red_rust, context.getTheme()));
                } else {
                    radioButton2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_advisor_with_available_word, new Object[]{Integer.valueOf(j7)}));
                }
            }
            if (lVar2.h == 3) {
                radioButton3.setChecked(true);
                radioButton3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_operation_chief_with_current_position_word));
                radioButton3.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.fight_green_text, context.getTheme()));
            } else {
                int j8 = z4.j(3);
                if (j8 == 0 || o.getGangObject().getPosition() >= 3) {
                    radioButton3.setEnabled(false);
                    radioButton3.setFocusable(false);
                    radioButton3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_operation_chief_with_not_available_word));
                    radioButton3.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.red_rust, context.getTheme()));
                } else {
                    radioButton3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_operation_chief_with_available_word, new Object[]{Integer.valueOf(j8)}));
                }
            }
            if (lVar2.h == 4) {
                radioButton4.setChecked(true);
                radioButton4.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_fighter_with_current_position_word));
                radioButton4.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.fight_green_text, context.getTheme()));
            } else {
                radioButton4.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_fighter_with_available_word));
            }
            if (lVar2.h == 5) {
                radioButton5.setChecked(true);
                radioButton5.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_new_with_current_position_word));
                radioButton5.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.fight_green_text, context.getTheme()));
            } else {
                radioButton5.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_position_new_with_available_word));
            }
            relativeLayout.setOnClickListener(new l(z3, relativeLayout, radioGroup, lVar, bVar, 5));
            imageView.setOnClickListener(new X(z4, imageView, bVar, 0));
            bVar.show();
        }
    }

    public static void f(Z z3, Y4.l lVar, int i2) {
        if (!z3.f8967e) {
            z3.f8967e = true;
            Context context = z3.f8965b;
            C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            TextView textView3 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            if (i2 == 1) {
                a.o(MyApplication.f7090a, R.string.dialog_gang_fire_member_description, textView2);
            } else if (i2 == 2) {
                a.o(MyApplication.f7090a, R.string.alert, textView);
                a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.maximum_word_color, textView);
                a.o(MyApplication.f7090a, R.string.dialog_gang_transfer_boss_position_description, textView2);
            }
            linearLayout.setVisibility(0);
            textView3.setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new Y((ArrayAdapter) z3, relativeLayout, i2, (Object) lVar, bVar, 0));
            relativeLayout2.setOnClickListener(new X(z3, relativeLayout2, bVar, 1));
            bVar.show();
        }
    }

    public static void g(Z z3, int i2, int i5) {
        z3.getClass();
        b.w(true);
        if (o.getLocationObject().getCurrentCity() == 0) {
            android.support.v4.media.session.a.O(new o0(z3, i5, i2, 0));
            return;
        }
        android.support.v4.media.session.a.N(o.getAccountObject().getId(), new o0(z3, i5, i2, 1));
    }

    public static void h(Z z3, int i2, int i5) {
        Z z4 = z3;
        int i6 = i2;
        int i7 = i5;
        Context context = z4.f8965b;
        int i8 = z4.f8966c;
        if (i8 == 6) {
            if (i6 == 2001) {
                I1.b.N0(context, "gold", 50);
            } else if (i6 == 2002) {
                I1.b.K0(context, "gold", 50);
            } else if (i6 == 2003) {
                if (o.getMainStatesObject().getNobilityCurrent() >= 100) {
                    a.n(MyApplication.f7090a, R.string.current_nobility_is_full, context, (String) null);
                    return;
                }
                b.w(true);
                U.g(o.getAccountObject().getId(), "gold", -100, new C0015e(context, 7));
            } else if (i6 == 2004) {
                android.support.v4.media.session.a.G0(context, "gold", true);
            } else if (i6 == 2005) {
                I1.b.O0(2005, 50, context, "gold");
            } else if (i6 == 2006) {
                I1.b.O0(2006, 50, context, "gold");
            } else if (i6 == 2007) {
                I1.b.O0(2007, 50, context, "gold");
            } else if (i6 == 2008) {
                b.w(true);
                U.g(o.getAccountObject().getId(), "gold", -(((long) i7) * 200), new f(i7, context, "gold"));
            } else if (i6 == 2009) {
                b.w(true);
                U.g(o.getAccountObject().getId(), "gold", -500, new h0(2, context, "gold"));
            } else if (i6 == 2010) {
                I1.b.f(context, "gold");
            } else if (i6 == 2011) {
                I1.b.d(context, i7, false);
            } else if (i6 == 2012) {
                I1.b.d(context, 9, true);
            } else if (i6 == 2013) {
                a.d(a.c(a.e(true), "players"), "stockObject", "museumSpace").d(new D0.e(context, 13));
            } else if (i6 == 2014) {
                I1.b.c(context, 4);
            } else if (i6 == 2015) {
                I1.b.c(context, 5);
            } else if (i6 == 2016) {
                I1.b.c(context, 6);
            } else if (i6 == 2017) {
                I1.b.g(context, i5, "gold", 5, (F3.e) null);
            } else if (i6 == 2020) {
                I1.b.L0(context, "gold", 25);
            } else if (i6 == 2018) {
                I1.b.M0(context, "gold", 25);
            } else if (i6 == 2019 && !I1.b.d) {
                I1.b.d = true;
                Context context2 = z4.f8965b;
                C0505b bVar = new C0505b(context2, R.layout.dialog_with_two_edit_field);
                EditText editText = (EditText) bVar.findViewById(R.id.dialog_with_two_edit_field_edit_text_for_field_one);
                EditText editText2 = (EditText) bVar.findViewById(R.id.dialog_with_two_edit_field_edit_text_for_field_two);
                RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_with_two_edit_field_ok_button);
                ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_with_two_edit_field_close_button);
                ((TextView) bVar.findViewById(R.id.dialog_with_two_edit_field_title)).setText(R.string.dialog_change_gang_data_title);
                ((TextView) bVar.findViewById(R.id.dialog_with_two_edit_field_description_for_field_one)).setText(R.string.gang_name_field);
                ((TextView) bVar.findViewById(R.id.dialog_with_two_edit_field_description_for_field_two)).setText(R.string.gang_tag_field);
                ((TextView) bVar.findViewById(R.id.dialog_with_two_edit_field_ok_button_text)).setText(R.string.button_change);
                editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
                editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                relativeLayout.setOnClickListener(new l(relativeLayout, editText, editText2, context2, bVar));
                imageView.setOnClickListener(new m(imageView, bVar, 10));
                bVar.show();
            }
        } else if (i8 == 7) {
            if (i6 == 2001) {
                I1.b.N0(context, "check", 500);
            } else if (i6 == 2002) {
                I1.b.K0(context, "check", 500);
            } else if (i6 == 2004) {
                android.support.v4.media.session.a.G0(context, "check", true);
            } else if (i6 == 2005) {
                I1.b.O0(2005, 500, context, "check");
            } else if (i6 == 2006) {
                I1.b.O0(2006, 500, context, "check");
            } else if (i6 == 2007) {
                I1.b.O0(2007, 500, context, "check");
            } else if (i6 == 2008) {
                b.w(true);
                U.g(o.getAccountObject().getId(), "check", -(((long) i7) * 2000), new f(i7, context, "check"));
            } else if (i6 == 2009) {
                b.w(true);
                U.g(o.getAccountObject().getId(), "check", -5000, new h0(2, context, "check"));
            } else if (i6 == 2010) {
                I1.b.f(context, "check");
            } else if (i6 == 2017) {
                I1.b.g(context, i5, "check", 50, (F3.e) null);
            } else if (i6 == 2020) {
                I1.b.L0(context, "check", 250);
            } else if (i6 == 2018) {
                I1.b.M0(context, "check", 250);
            }
        } else if (i8 != 11) {
        } else {
            if (i6 == 2031) {
                I1.b.O0(2031, 500, context, "gold");
            } else if (i6 == 2032) {
                I1.b.O0(2032, 250, context, "gold");
            } else if (i6 == 2033) {
                I1.b.O0(2033, 250, context, "gold");
            }
        }
    }

    public static void i(Z z3, int i2) {
        z3.getClass();
        b.w(true);
        U.g(o.getAccountObject().getId(), "gold", -(((long) i2) * 5), new B0.l((Object) z3, i2, 28));
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            int r2 = r0.f8964a
            switch(r2) {
                case 0: goto L_0x0310;
                default: goto L_0x0009;
            }
        L_0x0009:
            android.content.Context r2 = r0.f8965b
            r3 = 0
            if (r20 != 0) goto L_0x001a
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r2)
            r5 = 2131493050(0x7f0c00ba, float:1.860957E38)
            android.view.View r1 = r4.inflate(r5, r1, r3)
            goto L_0x001c
        L_0x001a:
            r1 = r20
        L_0x001c:
            r4 = 2131298111(0x7f09073f, float:1.8214186E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131298101(0x7f090735, float:1.8214166E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131298104(0x7f090738, float:1.8214172E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131298112(0x7f090740, float:1.8214188E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131298114(0x7f090742, float:1.8214192E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131298105(0x7f090739, float:1.8214174E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131298108(0x7f09073c, float:1.821418E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131298107(0x7f09073b, float:1.8214178E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.GridView r11 = (android.widget.GridView) r11
            r12 = 2131298110(0x7f09073e, float:1.8214184E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r13 = 2131298102(0x7f090736, float:1.8214168E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r14 = 2131298100(0x7f090734, float:1.8214164E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r15 = 2131298106(0x7f09073a, float:1.8214176E38)
            android.view.View r15 = r1.findViewById(r15)
            androidx.constraintlayout.widget.ConstraintLayout r15 = (androidx.constraintlayout.widget.ConstraintLayout) r15
            r3 = 2131298113(0x7f090741, float:1.821419E38)
            android.view.View r3 = r1.findViewById(r3)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r20 = r11
            r11 = 2131298099(0x7f090733, float:1.8214162E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            java.lang.Object r16 = r18.getItem(r19)
            r21 = r1
            r1 = r16
            Y4.D r1 = (Y4.D) r1
            r16 = r11
            int r11 = r1.f4295c
            r4.setText(r11)
            int r4 = r1.d
            r12.setImageResource(r4)
            int r4 = r0.d
            r11 = 1
            if (r4 != r11) goto L_0x00d2
            r4 = 2131165419(0x7f0700eb, float:1.7945055E38)
            r13.setImageResource(r4)
            r4 = r12
            long r11 = r1.f4291C
            java.lang.String r11 = com.mtma.criminal.city.utils.U.a(r11)
            r5.setText(r11)
            android.content.res.Resources r11 = r2.getResources()
            r12 = 2131034167(0x7f050037, float:1.7678844E38)
            com.google.android.gms.internal.measurement.a.i(r2, r11, r12, r5)
            goto L_0x00e2
        L_0x00d2:
            r4 = r12
            r11 = 2131165707(0x7f07020b, float:1.7945639E38)
            r13.setImageResource(r11)
            long r11 = r1.f4290B
            java.lang.String r11 = com.mtma.criminal.city.utils.U.a(r11)
            r5.setText(r11)
        L_0x00e2:
            r5 = 3
            int r11 = r0.f8966c
            if (r11 == r5) goto L_0x00ed
            r5 = 4
            if (r11 == r5) goto L_0x00ed
            r5 = 5
            if (r11 != r5) goto L_0x0222
        L_0x00ed:
            r5 = 0
            r6.setVisibility(r5)
            r8.setVisibility(r5)
            r3.setVisibility(r5)
            int r3 = r1.f4293a
            r5 = 2058(0x80a, float:2.884E-42)
            if (r3 != r5) goto L_0x0101
            r3 = 460(0x1cc, float:6.45E-43)
            goto L_0x01d7
        L_0x0101:
            r5 = 2059(0x80b, float:2.885E-42)
            if (r3 != r5) goto L_0x0109
            r3 = 795(0x31b, float:1.114E-42)
            goto L_0x01d7
        L_0x0109:
            r5 = 2060(0x80c, float:2.887E-42)
            if (r3 != r5) goto L_0x0111
            r3 = 1950(0x79e, float:2.733E-42)
            goto L_0x01d7
        L_0x0111:
            r5 = 2061(0x80d, float:2.888E-42)
            if (r3 != r5) goto L_0x0119
            r3 = 5240(0x1478, float:7.343E-42)
            goto L_0x01d7
        L_0x0119:
            r5 = 2062(0x80e, float:2.89E-42)
            if (r3 != r5) goto L_0x0121
            r3 = 8135(0x1fc7, float:1.14E-41)
            goto L_0x01d7
        L_0x0121:
            r5 = 2063(0x80f, float:2.891E-42)
            if (r3 != r5) goto L_0x0129
            r3 = 24880(0x6130, float:3.4864E-41)
            goto L_0x01d7
        L_0x0129:
            r5 = 2064(0x810, float:2.892E-42)
            if (r3 != r5) goto L_0x0132
            r3 = 33290(0x820a, float:4.6649E-41)
            goto L_0x01d7
        L_0x0132:
            r5 = 2065(0x811, float:2.894E-42)
            if (r3 != r5) goto L_0x013b
            r3 = 42860(0xa76c, float:6.006E-41)
            goto L_0x01d7
        L_0x013b:
            r5 = 2066(0x812, float:2.895E-42)
            if (r3 != r5) goto L_0x0144
            r3 = 46950(0xb766, float:6.5791E-41)
            goto L_0x01d7
        L_0x0144:
            r5 = 2067(0x813, float:2.896E-42)
            if (r3 != r5) goto L_0x014d
            r3 = 69940(0x11134, float:9.8007E-41)
            goto L_0x01d7
        L_0x014d:
            r5 = 2068(0x814, float:2.898E-42)
            if (r3 != r5) goto L_0x0156
            r3 = 182000(0x2c6f0, float:2.55036E-40)
            goto L_0x01d7
        L_0x0156:
            r5 = 2069(0x815, float:2.899E-42)
            if (r3 != r5) goto L_0x015f
            r3 = 304000(0x4a380, float:4.25995E-40)
            goto L_0x01d7
        L_0x015f:
            r5 = 2070(0x816, float:2.9E-42)
            if (r3 != r5) goto L_0x0167
            r3 = 600(0x258, float:8.41E-43)
            goto L_0x01d7
        L_0x0167:
            r5 = 2071(0x817, float:2.902E-42)
            if (r3 != r5) goto L_0x016f
            r3 = 1075(0x433, float:1.506E-42)
            goto L_0x01d7
        L_0x016f:
            r5 = 2072(0x818, float:2.903E-42)
            if (r3 != r5) goto L_0x0177
            r3 = 2150(0x866, float:3.013E-42)
            goto L_0x01d7
        L_0x0177:
            r5 = 2073(0x819, float:2.905E-42)
            if (r3 != r5) goto L_0x017f
            r3 = 4190(0x105e, float:5.871E-42)
            goto L_0x01d7
        L_0x017f:
            r5 = 2074(0x81a, float:2.906E-42)
            if (r3 != r5) goto L_0x0186
            r3 = 6385(0x18f1, float:8.947E-42)
            goto L_0x01d7
        L_0x0186:
            r5 = 2075(0x81b, float:2.908E-42)
            if (r3 != r5) goto L_0x018d
            r3 = 19330(0x4b82, float:2.7087E-41)
            goto L_0x01d7
        L_0x018d:
            r5 = 2076(0x81c, float:2.909E-42)
            if (r3 != r5) goto L_0x0195
            r3 = 35470(0x8a8e, float:4.9704E-41)
            goto L_0x01d7
        L_0x0195:
            r5 = 2077(0x81d, float:2.91E-42)
            if (r3 != r5) goto L_0x019d
            r3 = 66210(0x102a2, float:9.278E-41)
            goto L_0x01d7
        L_0x019d:
            r5 = 2078(0x81e, float:2.912E-42)
            if (r3 != r5) goto L_0x01a5
            r3 = 115200(0x1c200, float:1.6143E-40)
            goto L_0x01d7
        L_0x01a5:
            r5 = 2079(0x81f, float:2.913E-42)
            if (r3 != r5) goto L_0x01ad
            r3 = 131400(0x20148, float:1.8413E-40)
            goto L_0x01d7
        L_0x01ad:
            r5 = 2080(0x820, float:2.915E-42)
            if (r3 != r5) goto L_0x01b5
            r3 = 158430(0x26ade, float:2.22008E-40)
            goto L_0x01d7
        L_0x01b5:
            r5 = 2081(0x821, float:2.916E-42)
            if (r3 != r5) goto L_0x01bd
            r3 = 202920(0x318a8, float:2.84351E-40)
            goto L_0x01d7
        L_0x01bd:
            r5 = 2084(0x824, float:2.92E-42)
            r6 = 24999(0x61a7, float:3.5031E-41)
            if (r3 != r5) goto L_0x01c5
        L_0x01c3:
            r3 = r6
            goto L_0x01d7
        L_0x01c5:
            r5 = 2085(0x825, float:2.922E-42)
            if (r3 != r5) goto L_0x01ca
            goto L_0x01c3
        L_0x01ca:
            r5 = 2086(0x826, float:2.923E-42)
            r6 = 29999(0x752f, float:4.2038E-41)
            if (r3 != r5) goto L_0x01d1
            goto L_0x01c3
        L_0x01d1:
            r5 = 2087(0x827, float:2.925E-42)
            if (r3 != r5) goto L_0x01d6
            goto L_0x01c3
        L_0x01d6:
            r3 = -1
        L_0x01d7:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.setText(r3)
            d5.s r3 = d5.o.getStockObject()
            java.util.Map r3 = r3.getTimeBuyPackages()
            int r5 = r1.f4293a
            r6 = 0
            java.lang.String r5 = K1.e.x(r5, r6)
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r3 = r3.getOrDefault(r5, r6)
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            boolean r3 = I1.b.m(r5)
            if (r3 == 0) goto L_0x021c
            d5.k r3 = d5.o.getMainStatesObject()
            int r3 = r3.getLevel()
            int r5 = r1.f4293a
            int r5 = I1.b.V(r5)
            if (r3 >= r5) goto L_0x0214
            goto L_0x021c
        L_0x0214:
            r3 = 2131165341(0x7f07009d, float:1.7944896E38)
            r14.setImageResource(r3)
            r11 = 1
            goto L_0x0223
        L_0x021c:
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r14.setImageResource(r3)
        L_0x0222:
            r11 = 0
        L_0x0223:
            int r3 = r1.f4294b
            r5 = 15
            r6 = 8
            if (r3 != r5) goto L_0x029d
            r9.setVisibility(r6)
            r3 = 0
            r15.setVisibility(r3)
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            int r5 = r1.f4314y
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = 2131888212(0x7f120854, float:1.9411053E38)
            java.lang.String r3 = r3.getString(r6, r5)
            r10.setText(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
        L_0x0252:
            java.util.ArrayList r6 = r1.f4315z
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0291
            java.util.ArrayList r6 = r1.f4289A
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.ArrayList r7 = r1.f4315z
            java.lang.Object r7 = r7.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r7 = K1.e.R(r7)
            java.util.ArrayList r8 = r1.f4315z
            java.lang.Object r8 = r8.get(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = K1.e.M(r8)
            Y4.c r9 = new Y4.c
            r9.<init>(r7, r6, r8)
            r3.add(r9)
            int r5 = r5 + 1
            goto L_0x0252
        L_0x0291:
            j4.q r5 = new j4.q
            r6 = 3
            r5.<init>((android.content.Context) r2, (java.util.ArrayList) r3, (int) r6)
            r2 = r20
            r2.setAdapter(r5)
            goto L_0x02fb
        L_0x029d:
            r2 = 0
            r9.setVisibility(r2)
            r15.setVisibility(r6)
            boolean r2 = r1.f4306q
            if (r2 == 0) goto L_0x02f6
            boolean r2 = r1.f4307r
            if (r2 == 0) goto L_0x02d1
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            int r3 = r1.y()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r1.x()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            r5 = 2131887503(0x7f12058f, float:1.9409615E38)
            java.lang.String r2 = r2.getString(r5, r3)
            r9.setText(r2)
            goto L_0x02fb
        L_0x02d1:
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            int r3 = r1.z()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r1.A()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            r5 = 2131886187(0x7f12006b, float:1.9406946E38)
            java.lang.String r2 = r2.getString(r5, r3)
            r9.setText(r2)
            goto L_0x02fb
        L_0x02f6:
            int r2 = r1.f4296e
            r9.setText(r2)
        L_0x02fb:
            j4.f0 r2 = new j4.f0
            r3 = 13
            r2.<init>(r0, r4, r1, r3)
            r4.setOnClickListener(r2)
            j4.q0 r2 = new j4.q0
            r3 = r16
            r2.<init>(r0, r3, r1, r11)
            r3.setOnClickListener(r2)
            return r21
        L_0x0310:
            r2 = 0
            if (r20 != 0) goto L_0x0321
            android.content.Context r3 = r0.f8965b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131493019(0x7f0c009b, float:1.8609506E38)
            android.view.View r1 = r3.inflate(r4, r1, r2)
            goto L_0x0323
        L_0x0321:
            r1 = r20
        L_0x0323:
            r3 = 2131297895(0x7f090667, float:1.8213748E38)
            android.view.View r3 = r1.findViewById(r3)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r4 = 2131297894(0x7f090666, float:1.8213746E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131297892(0x7f090664, float:1.8213742E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r6 = 2131297888(0x7f090660, float:1.8213734E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 2131297898(0x7f09066a, float:1.8213754E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131297891(0x7f090663, float:1.821374E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131297889(0x7f090661, float:1.8213736E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131297893(0x7f090665, float:1.8213744E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131297897(0x7f090669, float:1.8213752E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131297896(0x7f090668, float:1.821375E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131297882(0x7f09065a, float:1.8213721E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r14 = 2131297883(0x7f09065b, float:1.8213723E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r15 = 2131297884(0x7f09065c, float:1.8213726E38)
            android.view.View r15 = r1.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r2 = 2131297885(0x7f09065d, float:1.8213728E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r20 = r13
            r13 = 2131297886(0x7f09065e, float:1.821373E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r21 = r3
            r3 = 2131297887(0x7f09065f, float:1.8213732E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r16 = r18.getItem(r19)
            r17 = r1
            r1 = r16
            Y4.l r1 = (Y4.l) r1
            r16 = r2
            java.lang.String r2 = r1.f4386b
            r8.setText(r2)
            int r2 = r1.d
            int r2 = R2.b.M(r2)
            r6.setImageResource(r2)
            int r2 = r1.f4388e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r9.setText(r2)
            int r2 = r1.h
            int r2 = com.bumptech.glide.d.n0(r2)
            r10.setText(r2)
            long r8 = r1.f4393l
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r2 = com.bumptech.glide.c.X(r2)
            r11.setText(r2)
            long r8 = r1.f4390i
            java.lang.String r2 = com.mtma.criminal.city.utils.U.a(r8)
            r12.setText(r2)
            java.lang.String r2 = r1.f4387c
            I1.b.v(r4, r2)
            boolean r2 = r1.f4394m
            if (r2 == 0) goto L_0x040d
            r2 = 2131166617(0x7f070599, float:1.7947484E38)
            r4.setBackgroundResource(r2)
            r2 = 0
            r7.setVisibility(r2)
            goto L_0x0418
        L_0x040d:
            r2 = 2131166616(0x7f070598, float:1.7947482E38)
            r4.setBackgroundResource(r2)
            r2 = 8
            r7.setVisibility(r2)
        L_0x0418:
            boolean r2 = r1.f4395n
            if (r2 == 0) goto L_0x0423
            r2 = 2131166585(0x7f070579, float:1.794742E38)
            r5.setImageResource(r2)
            goto L_0x0429
        L_0x0423:
            r2 = 2131166584(0x7f070578, float:1.7947417E38)
            r5.setImageResource(r2)
        L_0x0429:
            r2 = 2131165341(0x7f07009d, float:1.7944896E38)
            r4 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r5 = r0.f8966c
            if (r5 != 0) goto L_0x045e
            com.mtma.criminal.city.app.MyApplication r5 = com.mtma.criminal.city.app.MyApplication.f7090a
            r6 = 2131886255(0x7f1200af, float:1.9407084E38)
            com.google.android.gms.internal.measurement.a.o(r5, r6, r15)
            com.mtma.criminal.city.app.MyApplication r5 = com.mtma.criminal.city.app.MyApplication.f7090a
            r6 = 2131886278(0x7f1200c6, float:1.940713E38)
            com.google.android.gms.internal.measurement.a.o(r5, r6, r3)
            int r3 = r1.h
            boolean r3 = com.bumptech.glide.d.J0(r3)
            if (r3 == 0) goto L_0x0457
            r14.setImageResource(r2)
            r2 = 2131165393(0x7f0700d1, float:1.7945002E38)
            r13.setImageResource(r2)
        L_0x0454:
            r5 = r16
            goto L_0x047a
        L_0x0457:
            r14.setImageResource(r4)
            r13.setImageResource(r4)
            goto L_0x0454
        L_0x045e:
            r3 = 1
            if (r5 != r3) goto L_0x0454
            r3 = 4
            r5 = r16
            r5.setVisibility(r3)
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            r6 = 2131886325(0x7f1200f5, float:1.9407226E38)
            com.google.android.gms.internal.measurement.a.o(r3, r6, r15)
            int r3 = r1.h
            if (r3 != 0) goto L_0x0477
            r14.setImageResource(r4)
            goto L_0x047a
        L_0x0477:
            r14.setImageResource(r2)
        L_0x047a:
            j4.W r2 = new j4.W
            r3 = 0
            r4 = r21
            r2.<init>(r0, r4, r1, r3)
            r4.setOnClickListener(r2)
            j4.W r2 = new j4.W
            r3 = 1
            r13 = r20
            r2.<init>(r0, r13, r1, r3)
            r13.setOnClickListener(r2)
            j4.W r2 = new j4.W
            r3 = 2
            r2.<init>(r0, r5, r1, r3)
            r5.setOnClickListener(r2)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.Z.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int j(int i2) {
        int i5 = 0;
        for (int i6 = 0; i6 < getCount(); i6++) {
            if (((Y4.l) getItem(i6)).h == i2) {
                i5++;
            }
        }
        int i7 = this.d;
        if (i2 == 1) {
            i7 = 1;
        } else if (!(i2 == 2 || i2 == 3)) {
            i7 = 0;
        }
        if (i5 < i7) {
            return i7 - i5;
        }
        return 0;
    }

    public Z(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.f8967e = false;
        this.f8968f = false;
        this.d = 0;
        this.f8965b = context;
        this.f8966c = i2;
    }
}
