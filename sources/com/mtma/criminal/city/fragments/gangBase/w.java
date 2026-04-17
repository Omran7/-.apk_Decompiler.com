package com.mtma.criminal.city.fragments.gangBase;

import B4.f;
import Y4.C;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import d5.o;
import j4.C0617c0;
import java.util.ArrayList;
import java.util.Map;

public final class w extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7307d0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f7308e0;

    /* renamed from: f0  reason: collision with root package name */
    public final String f7309f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f7310g0 = o.getGangObject().getPosition();

    /* renamed from: h0  reason: collision with root package name */
    public final Map f7311h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f7312i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f7313j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f7314k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f7315l0;

    /* renamed from: m0  reason: collision with root package name */
    public View f7316m0;

    /* renamed from: n0  reason: collision with root package name */
    public ListView f7317n0;

    /* renamed from: o0  reason: collision with root package name */
    public ConstraintLayout f7318o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f7319p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f7320q0;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f7321r0;
    public RelativeLayout s0;

    public w(Context context, String str, Map map, int i2, long j6, long j7, long j8) {
        this.f7307d0 = context;
        this.f7309f0 = str;
        this.f7311h0 = map;
        this.f7312i0 = i2;
        this.f7313j0 = j6;
        this.f7314k0 = j7;
        this.f7315l0 = j8;
        this.f7308e0 = true;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0617c0 c0Var;
        Integer num;
        View inflate = layoutInflater.inflate(R.layout.fragment_gang_skills, viewGroup, false);
        this.f7316m0 = inflate;
        this.f7317n0 = (ListView) inflate.findViewById(R.id.fragment_gang_skills_list_view);
        this.f7318o0 = (ConstraintLayout) this.f7316m0.findViewById(R.id.fragment_gang_skill_details_layout);
        this.f7319p0 = (TextView) this.f7316m0.findViewById(R.id.fragment_gang_skill_respect_value);
        this.f7320q0 = (TextView) this.f7316m0.findViewById(R.id.fragment_gang_skill_cash_value);
        this.f7321r0 = (TextView) this.f7316m0.findViewById(R.id.fragment_gang_skill_gold_value);
        this.s0 = (RelativeLayout) this.f7316m0.findViewById(R.id.fragment_gang_skills_back_button);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C(3, R.string.gang_skill_name_almighty, R.string.gang_skill_description_almighty, R.drawable.gang_skill_almighty, 0));
        arrayList.add(new C(4, R.string.gang_skill_name_hard_to_kill, R.string.gang_skill_description_hard_to_kill, R.drawable.gang_skill_hard_to_kill, 0));
        arrayList.add(new C(5, R.string.gang_skill_name_speed_demon, R.string.gang_skill_description_speed_demon, R.drawable.gang_skill_speed_demon, 0));
        arrayList.add(new C(6, R.string.gang_skill_name_shadow_moves, R.string.gang_skill_description_shadow_moves, R.drawable.gang_skill_shadow_moves, 0));
        arrayList.add(new C(7, R.string.gang_skill_name_weapons_expert, R.string.gang_skill_description_weapons_expert, R.drawable.gang_skill_weapons_expert, 0));
        arrayList.add(new C(8, R.string.gang_skill_name_armors_expert, R.string.gang_skill_description_armors_expert, R.drawable.gang_skill_armors_expert, 0));
        arrayList.add(new C(9, R.string.gang_skill_name_critical_hit, R.string.gang_skill_description_critical_hit, R.drawable.gang_skill_critical_hit, 0));
        arrayList.add(new C(10, R.string.gang_skill_name_bag, R.string.gang_skill_description_bag, R.drawable.gang_skill_bag, 0));
        arrayList.add(new C(11, R.string.gang_skill_name_prompt_recovery, R.string.gang_skill_description_prompt_recovery, R.drawable.gang_skill_prompt_recovery, 0));
        arrayList.add(new C(12, R.string.gang_skill_name_vigorous, R.string.gang_skill_description_vigorous, R.drawable.gang_skill_vigorous, 0));
        arrayList.add(new C(13, R.string.gang_skill_name_fearless, R.string.gang_skill_description_fearless, R.drawable.gang_skill_fearless, 0));
        arrayList.add(new C(14, R.string.gang_skill_name_gym_results, R.string.gang_skill_description_gym_results, R.drawable.gang_skill_gym_results, 0));
        arrayList.add(new C(15, R.string.gang_skill_name_chain_time, R.string.gang_skill_description_chain_time, R.drawable.gang_skill_chain_time, 0));
        Map map = this.f7311h0;
        for (String str : map.keySet()) {
            if (str != null) {
                int parseInt = Integer.parseInt(str.replace("id-", ""));
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((C) arrayList.get(i2)).f4285a == parseInt && (num = (Integer) map.getOrDefault(str, 0)) != null) {
                        ((C) arrayList.get(i2)).f4288e = num.intValue();
                    }
                }
            }
        }
        if (this.f7308e0) {
            this.f7318o0.setVisibility(0);
            this.f7319p0.setText(U.a(this.f7313j0));
            this.f7320q0.setText(U.a(this.f7314k0));
            this.f7321r0.setText(U.a(this.f7315l0));
            c0Var = new C0617c0(this.f7307d0, arrayList, this.f7312i0, this.f7313j0, this.f7314k0, this.f7315l0);
        } else {
            c0Var = new C0617c0(this.f7307d0, arrayList);
        }
        this.f7317n0.setAdapter(c0Var);
        RelativeLayout relativeLayout = this.s0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 23));
        return this.f7316m0;
    }

    public w(Context context, String str, Map map) {
        this.f7307d0 = context;
        this.f7309f0 = str;
        this.f7311h0 = map;
        this.f7308e0 = false;
    }
}
