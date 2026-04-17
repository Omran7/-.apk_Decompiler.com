package com.mtma.criminal.city.fragments.gangBase;

import I1.b;
import K1.e;
import Y4.x;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b5.f;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import i3.C0590f;
import i3.C0592h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n3.C0866g;
import v3.m;
import v3.q;
import v3.s;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0425e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7174a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0429i f7175b;

    public /* synthetic */ C0425e(C0429i iVar, int i2) {
        this.f7174a = i2;
        this.f7175b = iVar;
    }

    public final void onComplete(Task task) {
        switch (this.f7174a) {
            case 0:
                C0429i iVar = this.f7175b;
                iVar.getClass();
                f fVar = (f) ((C0587c) ((Task) ((List) task.getResult()).get(0)).getResult()).f(f.class);
                iVar.f7186C0 = fVar;
                if (fVar != null) {
                    b.u(iVar.f7201k0, o.getGangObject().getId(), iVar.f7186C0.getImageUrl());
                    iVar.f7199i0.setText(iVar.f7186C0.getName());
                    iVar.f7200j0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.text_between_square_brackets_with_spaces, new Object[]{iVar.f7186C0.getTag()}));
                    String name = iVar.f7186C0.getName();
                    ImageView imageView = iVar.f7196f0;
                    imageView.setOnClickListener(new C0428h(iVar, imageView, name, 1));
                    Context context = iVar.f7194d0;
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.from_top_to_position);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.from_bottom_to_position);
                    iVar.f7207q0.setAnimation(loadAnimation);
                    iVar.f7205o0.setAnimation(loadAnimation2);
                    iVar.f7208r0.setAnimation(loadAnimation2);
                    iVar.f7208r0.setAnimation(loadAnimation2);
                    for (int i2 = 0; i2 < iVar.f7186C0.getLevel(); i2++) {
                        ImageView imageView2 = new ImageView(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart(e.m(2.0d));
                        layoutParams.setMarginEnd(e.m(2.0d));
                        imageView2.setLayoutParams(layoutParams);
                        imageView2.setImageResource(R.drawable.gang_level_star_icon);
                        iVar.f7202l0.addView(imageView2);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new x(R.string.gang_created_date, c.y(iVar.f7186C0.getCreatedTimeInMilli())));
                    String string = MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(iVar.f7186C0.getMembersWithPositions().size()), Integer.valueOf(d.y0(iVar.f7186C0.getLevel()))});
                    int i5 = R.string.gang_members;
                    arrayList.add(new x(R.string.gang_members, string));
                    arrayList.add(new x(R.string.gang_cash, U.a(iVar.f7186C0.getCash())));
                    arrayList.add(new x(R.string.gang_loyalty, U.a(iVar.f7186C0.getLoyalty())));
                    arrayList.add(new x(R.string.gang_available_respect, U.a(iVar.f7186C0.getAvailableRespect())));
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new x(R.string.gang_id, iVar.f7186C0.getId()));
                    arrayList2.add(new x(R.string.gang_position, MyApplication.f7090a.getApplicationContext().getString(d.n0(iVar.f7186C0.getMembersWithPositions().get(o.getAccountObject().getId()).intValue()))));
                    arrayList2.add(new x(R.string.gang_gold, U.a(iVar.f7186C0.getGold())));
                    arrayList2.add(new x(R.string.gang_top_chain, String.valueOf(iVar.f7186C0.getTopChain())));
                    arrayList2.add(new x(R.string.gang_total_respect, U.a(iVar.f7186C0.getRespect())));
                    String str = null;
                    View inflate = LayoutInflater.from(context).inflate(R.layout.item_profile_main_section, (ViewGroup) null, false);
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.item_profile_section_left_list_View);
                    LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.item_profile_section_right_list_View);
                    Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.from_start_to_position);
                    Animation loadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.from_end_to_position);
                    ((RelativeLayout) inflate.findViewById(R.id.item_profile_left_layout)).setAnimation(loadAnimation3);
                    linearLayout2.setAnimation(loadAnimation4);
                    ((RelativeLayout) inflate.findViewById(R.id.item_profile_section_title_layout)).setVisibility(8);
                    ((ImageView) inflate.findViewById(R.id.item_profile_section_left_image)).setVisibility(8);
                    int i6 = 0;
                    while (true) {
                        int size = arrayList.size();
                        int i7 = R.id.item_profile_value_info_value;
                        int i8 = R.id.item_profile_value_info_title;
                        if (i6 < size) {
                            View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_profile_value_info, (ViewGroup) null, false);
                            TextView textView = (TextView) inflate2.findViewById(R.id.item_profile_value_info_value);
                            ((TextView) inflate2.findViewById(R.id.item_profile_value_info_title)).setText(((x) arrayList.get(i6)).f4446a);
                            textView.setText(((x) arrayList.get(i6)).f4447b);
                            linearLayout.addView(inflate2);
                            if (((x) arrayList.get(i6)).f4446a == i5) {
                                textView.setTag("members_numbers_view_tag");
                            } else if (((x) arrayList.get(i6)).f4446a == R.string.gang_cash) {
                                textView.setTag("cash_view_tag");
                            } else {
                                if (((x) arrayList.get(i6)).f4446a == R.string.gang_loyalty) {
                                    textView.setTag("loyalty_view_tag");
                                } else if (((x) arrayList.get(i6)).f4446a == R.string.gang_available_respect) {
                                    textView.setTag("available_respect_view_tag");
                                }
                                i6++;
                                i5 = R.string.gang_members;
                            }
                            i6++;
                            i5 = R.string.gang_members;
                        } else {
                            int i9 = 0;
                            while (i9 < arrayList2.size()) {
                                View inflate3 = LayoutInflater.from(context).inflate(R.layout.item_profile_value_info, (ViewGroup) null, false);
                                TextView textView2 = (TextView) inflate3.findViewById(i7);
                                ImageView imageView3 = (ImageView) inflate3.findViewById(R.id.item_profile_value_info_copy_button);
                                ((TextView) inflate3.findViewById(i8)).setText(((x) arrayList2.get(i9)).f4446a);
                                textView2.setText(((x) arrayList2.get(i9)).f4447b);
                                if (((x) arrayList2.get(i9)).f4446a == R.string.gang_id) {
                                    String str2 = ((x) arrayList2.get(i9)).f4447b;
                                    imageView3.setImageResource(R.drawable.copy_button);
                                    imageView3.setVisibility(0);
                                    imageView3.setOnClickListener(new C0428h(iVar, imageView3, str2, 0));
                                }
                                if (((x) arrayList2.get(i9)).f4446a == R.string.gang_gold) {
                                    textView2.setTag("gold_view_tag");
                                } else if (((x) arrayList2.get(i9)).f4446a == R.string.gang_total_respect) {
                                    textView2.setTag("total_respect_view_tag");
                                }
                                linearLayout2.addView(inflate3);
                                i9++;
                                i7 = R.id.item_profile_value_info_value;
                                i8 = R.id.item_profile_value_info_title;
                            }
                            iVar.f7203m0.addView(inflate, 0);
                            if (iVar.f7186C0.getMembersWithPositions().get(o.getAccountObject().getId()).intValue() == 0) {
                                iVar.f7197g0.setImageResource(R.drawable.button_gray);
                                iVar.f7187D0 = iVar.f7186C0.getImageUrl();
                            } else {
                                iVar.f7197g0.setImageResource(R.drawable.button_red);
                            }
                            int intValue = iVar.f7186C0.getMembersWithPositions().get(o.getAccountObject().getId()).intValue();
                            if (intValue == 0 || intValue == 1 || intValue == 2 || intValue == 3) {
                                iVar.f7198h0.setImageResource(R.drawable.button_blue);
                            } else {
                                iVar.f7198h0.setImageResource(R.drawable.button_gray);
                            }
                            if (((C0587c) ((Task) ((List) task.getResult()).get(1)).getResult()).g()) {
                                C0586b c3 = ((C0587c) ((Task) ((List) task.getResult()).get(1)).getResult()).c();
                                while (true) {
                                    Iterator it2 = c3.f8276a;
                                    if (it2.hasNext()) {
                                        q qVar = (q) it2.next();
                                        C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                                        m t6 = m.t(qVar.f12305b);
                                        E6.E("unixTimeInMilli");
                                        C0866g gVar = new C0866g("unixTimeInMilli");
                                        s sVar = t6.f12296a;
                                        String f6 = o3.d.f(c.z(r3.b.c(Long.class, m.t(sVar.f(gVar)).f12296a.getValue())), "\n");
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(f6);
                                        E6.E("content");
                                        sb.append((String) r3.b.c(String.class, m.t(sVar.f(new C0866g("content"))).f12296a.getValue()));
                                        str = sb.toString();
                                    } else {
                                        iVar.f7204n0.setText(str);
                                    }
                                }
                            } else {
                                iVar.f7204n0.setText(R.string.gang_last_message_empty);
                            }
                            iVar.f7206p0.setVisibility(0);
                        }
                    }
                }
                R2.b.w(false);
                return;
            default:
                C0429i iVar2 = this.f7175b;
                iVar2.getClass();
                if (task.isSuccessful()) {
                    String uri = ((Uri) task.getResult()).toString();
                    C0592h.b().e().E(R2.b.Z()).E("gangs").E("gangsData").E(o.getGangObject().getId()).E("imageUrl").I(uri).addOnSuccessListener(new A4.d(iVar2, uri, 1));
                    return;
                }
                return;
        }
    }
}
