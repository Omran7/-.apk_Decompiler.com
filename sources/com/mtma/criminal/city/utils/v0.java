package com.mtma.criminal.city.utils;

import H.j;
import K1.e;
import P4.q;
import R2.b;
import V4.g;
import Y4.D;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import f.C0518i;
import j4.C0614b;
import java.util.ArrayList;

public abstract class v0 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f7482a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f7483b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public static final q f7484c = new q(4);

    public static void a(D d, Context context, int i2) {
        String str;
        D d6 = d;
        if (!f7482a) {
            f7482a = true;
            f7483b.postDelayed(f7484c, 350);
            b.N0();
            View inflate = LayoutInflater.from(context).inflate(R.layout.toast_material_details, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.toast_material_details_name);
            TextView textView2 = (TextView) inflate.findViewById(R.id.toast_material_details_description);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.toast_material_details_special_equipment_properties);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.toast_material_details_package_content);
            TextView textView3 = (TextView) inflate.findViewById(R.id.toast_material_details_package_content_name);
            TextView textView4 = (TextView) inflate.findViewById(R.id.toast_material_details_package_content_count);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.toast_material_details_image);
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.toast_material_details_level_layout);
            TextView textView5 = (TextView) inflate.findViewById(R.id.toast_material_details_level);
            if (d6.f4298i == 0) {
                constraintLayout.setVisibility(8);
            } else {
                constraintLayout.setVisibility(0);
                textView5.setText(String.valueOf(d6.f4298i));
            }
            textView.setText(d6.f4295c);
            imageView.setImageResource(d6.d);
            if (d6.f4306q) {
                if (d6.f4307r) {
                    textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.toast_gun_description, new Object[]{Integer.valueOf(d.y()), Integer.valueOf(d.x())}));
                } else {
                    textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.toast_armor_description, new Object[]{Integer.valueOf(d.z()), Integer.valueOf(d.A())}));
                }
            } else if (d6.f4294b == 15) {
                linearLayout.setVisibility(0);
                LinearLayout linearLayout2 = (LinearLayout) linearLayout.getChildAt(0);
                for (int i5 = 0; i5 < d6.f4315z.size(); i5++) {
                    View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_equipment_skill, (ViewGroup) null, false);
                    inflate2.setRotationY(0.0f);
                    TextView textView6 = (TextView) inflate2.findViewById(R.id.item_equipment_skill_value);
                    ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.item_equipment_skill_image);
                    Integer num = (Integer) d6.f4289A.get(i5);
                    int intValue = num.intValue();
                    if (intValue < 0) {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_minus_sign, new Object[]{Integer.valueOf(Math.abs(intValue))});
                    } else {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_plus_sign, new Object[]{num});
                    }
                    textView6.setText(str);
                    imageView2.setImageResource(e.M(((Integer) d6.f4315z.get(i5)).intValue()));
                    inflate2.setPaddingRelative(e.m(16.0d), 0, 0, 0);
                    linearLayout2.addView(inflate2);
                }
                ((TextView) linearLayout.getChildAt(1).findViewById(R.id.toast_material_details_happiness)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_plus_sign, new Object[]{Integer.valueOf(d6.f4314y)}));
            } else {
                int i6 = d6.f4293a;
                if ((i6 < 2058 || i6 > 2069) && (i6 < 2084 || i6 > 2087)) {
                    textView2.setText(d6.f4296e);
                } else {
                    relativeLayout.setVisibility(0);
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    int intValue2 = ((Integer) I1.b.U(d6.f4293a).get(0)).intValue();
                    if (intValue2 == -100) {
                        sb.append(MyApplication.f7090a.getApplicationContext().getString(R.string.cash));
                        sb2.append("×");
                        sb2.append(U.a((long) ((Integer) I1.b.T(d6.f4293a).get(0)).intValue()));
                    } else {
                        sb.append(MyApplication.f7090a.getApplicationContext().getString(D.s(intValue2, 0, 1).f4295c));
                        sb2.append("×");
                        sb2.append(I1.b.T(d6.f4293a).get(0));
                    }
                    for (int i7 = 1; i7 < I1.b.U(d6.f4293a).size(); i7++) {
                        sb.append("\n");
                        sb.append(MyApplication.f7090a.getApplicationContext().getString(D.s(((Integer) I1.b.U(d6.f4293a).get(i7)).intValue(), 0, 1).f4295c));
                        sb2.append("\n×");
                        sb2.append(I1.b.T(d6.f4293a).get(i7));
                    }
                    textView3.setText(sb.toString());
                    textView4.setText(sb2.toString());
                }
            }
            v.e eVar = new v.e();
            eVar.topMargin = i2 - e.m(100.0d);
            eVar.setMarginStart(e.m(40.0d));
            eVar.setMarginEnd(e.m(40.0d));
            inflate.setLayoutParams(eVar);
            ViewGroup viewGroup = (ViewGroup) ((C0518i) context).getWindow().getDecorView().getRootView();
            viewGroup.addView(inflate);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(inflate, View.ALPHA, new float[]{0.0f});
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(3000);
            ofFloat.start();
            ofFloat.addListener(new t0(viewGroup, inflate, 0));
        }
    }

    public static void b(Context context, int i2, View view, String str) {
        if (!f7482a) {
            f7482a = true;
            f7483b.postDelayed(f7484c, 350);
            View inflate = LayoutInflater.from(context).inflate(R.layout.item_note, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.item_note_content)).setText(str);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
            layoutParams.bottomMargin = view.getHeight() + (i2 - i6);
            layoutParams.leftMargin = e.m(6.0d) + i5;
            inflate.setLayoutParams(layoutParams);
            ((ViewGroup) view.getRootView()).addView(inflate);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(inflate, View.ALPHA, new float[]{0.0f});
            ofFloat.setRepeatCount(0);
            ofFloat.setDuration(3000);
            ofFloat.start();
            ofFloat.addListener(new t0((ViewGroup) ((C0518i) context).getWindow().getDecorView().getRootView(), inflate, 2));
        }
    }

    public static void c(Context context, View view, String str) {
        b(context, Resources.getSystem().getDisplayMetrics().heightPixels, view, str);
    }

    public static void d(Context context, View view, String str) {
        if (!f7482a) {
            f7482a = true;
            f7483b.postDelayed(f7484c, 350);
            View inflate = LayoutInflater.from(context).inflate(R.layout.toast_basic, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.toast_basic_content)).setText(str);
            ((ViewGroup) view.getRootView()).addView(inflate);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(inflate, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.1f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.1f})});
            ofPropertyValuesHolder.setRepeatCount(3);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.start();
            ofPropertyValuesHolder.addListener(new s0(str, inflate, (ViewGroup) ((C0518i) context).getWindow().getDecorView().getRootView(), 1));
        }
    }

    public static void e(Context context, String str) {
        if (!f7482a) {
            f7482a = true;
            f7483b.postDelayed(f7484c, 350);
            View inflate = LayoutInflater.from(context).inflate(R.layout.toast_basic, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.toast_basic_content)).setText(str);
            ViewGroup viewGroup = (ViewGroup) ((C0518i) context).getWindow().getDecorView().getRootView();
            viewGroup.addView(inflate);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(inflate, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.1f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.1f})});
            ofPropertyValuesHolder.setRepeatCount(3);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.start();
            ofPropertyValuesHolder.addListener(new s0(str, inflate, viewGroup, 0));
        }
    }

    public static void f(Context context, ArrayList arrayList, u0 u0Var) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.toast_inflate_material, (ViewGroup) null, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.toast_inflate_items_grid_view);
        gridView.setNumColumns(5);
        C0614b bVar = new C0614b(context, new ArrayList(), 5);
        gridView.setAdapter(bVar);
        ViewGroup viewGroup = (ViewGroup) ((C0518i) context).getWindow().getDecorView().getRootView();
        viewGroup.addView(inflate);
        bVar.add((D) arrayList.get(0));
        bVar.notifyDataSetChanged();
        new Handler().postDelayed(new g(0, arrayList, bVar), 200);
        new Handler().postDelayed(new j((Object) inflate, (Object) viewGroup, (Object) u0Var, 15), ((long) arrayList.size()) * 400);
    }
}
