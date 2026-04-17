package com.mtma.criminal.city.fragments.gangBase;

import B4.f;
import R2.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import i3.C0592h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import o3.d;

public final class G extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7130d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Map f7131e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f7132f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7133g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f7134h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f7135i0;

    public G(Context context, Map map) {
        this.f7130d0 = context;
        this.f7131e0 = map;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f7132f0 = inflate;
        this.f7133g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f7134h0 = (ListView) this.f7132f0.findViewById(R.id.fragment_basic_list_view);
        this.f7135i0 = (RelativeLayout) this.f7132f0.findViewById(R.id.fragment_basic_back_button);
        b.w(true);
        this.f7133g0.setText(R.string.gang_members_title);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (String str : this.f7131e0.keySet()) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
            d.c(C0592h.b().e(), "players", str, "mainStatesObject").d(new E(hashMap, str, taskCompletionSource, 0));
            arrayList2.add(taskCompletionSource.getTask());
            d.c(C0592h.b().e(), "players", str, "locationObject").d(new E(hashMap2, str, taskCompletionSource2, 1));
            arrayList2.add(taskCompletionSource2.getTask());
            d.c(C0592h.b().e(), "players", str, "gangObject").d(new E(hashMap3, str, taskCompletionSource3, 2));
            arrayList2.add(taskCompletionSource3.getTask());
        }
        Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList2).addOnCompleteListener(new F(this, hashMap, hashMap2, hashMap3, arrayList));
        RelativeLayout relativeLayout = this.f7135i0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 25));
        return this.f7132f0;
    }
}
