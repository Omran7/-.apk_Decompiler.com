package com.mtma.criminal.city.fragments.gangBase;

import B4.c;
import E4.a;
import R2.b;
import W0.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0281m;
import androidx.fragment.app.C0286s;
import b5.f;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.views.SquareView;
import d5.o;
import e5.C0505b;
import i3.C0592h;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.i  reason: case insensitive filesystem */
public final class C0429i extends C0286s {

    /* renamed from: A0  reason: collision with root package name */
    public RelativeLayout f7184A0;

    /* renamed from: B0  reason: collision with root package name */
    public RelativeLayout f7185B0;

    /* renamed from: C0  reason: collision with root package name */
    public f f7186C0;

    /* renamed from: D0  reason: collision with root package name */
    public String f7187D0;

    /* renamed from: E0  reason: collision with root package name */
    public Bitmap f7188E0 = null;

    /* renamed from: F0  reason: collision with root package name */
    public C0505b f7189F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f7190G0 = false;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f7191H0 = false;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f7192I0 = false;

    /* renamed from: J0  reason: collision with root package name */
    public final C0281m f7193J0 = ((C0281m) O(new u(0), new C0424d(this)));

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7194d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f7195e0;

    /* renamed from: f0  reason: collision with root package name */
    public ImageView f7196f0;

    /* renamed from: g0  reason: collision with root package name */
    public ImageView f7197g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f7198h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f7199i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f7200j0;

    /* renamed from: k0  reason: collision with root package name */
    public SquareView f7201k0;

    /* renamed from: l0  reason: collision with root package name */
    public LinearLayout f7202l0;

    /* renamed from: m0  reason: collision with root package name */
    public LinearLayout f7203m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f7204n0;

    /* renamed from: o0  reason: collision with root package name */
    public ScrollView f7205o0;

    /* renamed from: p0  reason: collision with root package name */
    public ConstraintLayout f7206p0;

    /* renamed from: q0  reason: collision with root package name */
    public ConstraintLayout f7207q0;

    /* renamed from: r0  reason: collision with root package name */
    public LinearLayout f7208r0;
    public RelativeLayout s0;

    /* renamed from: t0  reason: collision with root package name */
    public RelativeLayout f7209t0;

    /* renamed from: u0  reason: collision with root package name */
    public RelativeLayout f7210u0;

    /* renamed from: v0  reason: collision with root package name */
    public RelativeLayout f7211v0;

    /* renamed from: w0  reason: collision with root package name */
    public RelativeLayout f7212w0;

    /* renamed from: x0  reason: collision with root package name */
    public RelativeLayout f7213x0;

    /* renamed from: y0  reason: collision with root package name */
    public RelativeLayout f7214y0;

    /* renamed from: z0  reason: collision with root package name */
    public RelativeLayout f7215z0;

    public C0429i(Context context) {
        this.f7194d0 = context;
    }

    public static void V(C0429i iVar, C0286s sVar) {
        C0269a aVar = new C0269a(iVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.c();
        aVar.e(false);
        b.N0();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gang_details, viewGroup, false);
        this.f7195e0 = inflate;
        this.f7206p0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_gang_details_main_layout);
        this.f7205o0 = (ScrollView) this.f7195e0.findViewById(R.id.fragment_gang_details_scroll_view);
        this.f7207q0 = (ConstraintLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_top_part_layout);
        this.f7201k0 = (SquareView) this.f7195e0.findViewById(R.id.fragment_gang_details_image);
        this.f7196f0 = (ImageView) this.f7195e0.findViewById(R.id.fragment_gang_details_name_copy_button);
        this.f7199i0 = (TextView) this.f7195e0.findViewById(R.id.fragment_gang_details_name);
        this.f7200j0 = (TextView) this.f7195e0.findViewById(R.id.fragment_gang_details_tag);
        this.f7202l0 = (LinearLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_level_layout);
        this.f7203m0 = (LinearLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_container);
        this.f7204n0 = (TextView) this.f7195e0.findViewById(R.id.fragment_gang_details_last_message);
        this.f7197g0 = (ImageView) this.f7195e0.findViewById(R.id.fragment_gang_details_leave_button_image);
        this.f7208r0 = (LinearLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_buttons_section);
        this.s0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_militia_button);
        this.f7209t0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_leave_button);
        this.f7210u0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_wars_button);
        this.f7211v0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_management_button);
        this.f7198h0 = (ImageView) this.f7195e0.findViewById(R.id.fragment_gang_details_management_button_image);
        this.f7212w0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_skills_button);
        this.f7213x0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_donate_button);
        this.f7214y0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_members_button);
        this.f7215z0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_shop_button);
        this.f7184A0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_notification_button);
        this.f7185B0 = (RelativeLayout) this.f7195e0.findViewById(R.id.fragment_gang_details_back_button);
        b.w(true);
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C0592h.b().e().E(b.Z()).E("gangs").E("gangsData").E(o.getGangObject().getId()).d(new c(taskCompletionSource, 7));
        arrayList.add(taskCompletionSource.getTask());
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C0592h.d().e().E(b.a0()).E("gangs").E("gangMessages").E(o.getGangObject().getId()).p(1).d(new a(taskCompletionSource2, 5));
        arrayList.add(taskCompletionSource2.getTask());
        Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new C0425e(this, 0));
        SquareView squareView = this.f7201k0;
        squareView.setOnClickListener(new C0427g(this, squareView, 10));
        RelativeLayout relativeLayout = this.s0;
        relativeLayout.setOnClickListener(new C0427g(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f7209t0;
        relativeLayout2.setOnClickListener(new C0427g(this, relativeLayout2, 1));
        RelativeLayout relativeLayout3 = this.f7210u0;
        relativeLayout3.setOnClickListener(new C0427g(this, relativeLayout3, 2));
        RelativeLayout relativeLayout4 = this.f7211v0;
        relativeLayout4.setOnClickListener(new C0427g(this, relativeLayout4, 3));
        RelativeLayout relativeLayout5 = this.f7212w0;
        relativeLayout5.setOnClickListener(new C0427g(this, relativeLayout5, 4));
        RelativeLayout relativeLayout6 = this.f7213x0;
        relativeLayout6.setOnClickListener(new C0427g(this, relativeLayout6, 5));
        RelativeLayout relativeLayout7 = this.f7214y0;
        relativeLayout7.setOnClickListener(new C0427g(this, relativeLayout7, 6));
        RelativeLayout relativeLayout8 = this.f7215z0;
        relativeLayout8.setOnClickListener(new C0427g(this, relativeLayout8, 7));
        RelativeLayout relativeLayout9 = this.f7184A0;
        relativeLayout9.setOnClickListener(new C0427g(this, relativeLayout9, 8));
        RelativeLayout relativeLayout10 = this.f7185B0;
        relativeLayout10.setOnClickListener(new C0427g(this, relativeLayout10, 9));
        return this.f7195e0;
    }

    public final void W(long j6) {
        this.f7186C0.setCash(j6);
        ((TextView) this.f7203m0.getRootView().findViewWithTag("cash_view_tag")).setText(U.a(j6));
    }

    public final void X(int i2, String str) {
        if (i2 < 0) {
            this.f7186C0.getMembersWithPositions().remove(str);
        } else if (i2 > 0) {
            this.f7186C0.getMembersWithPositions().put(str, 5);
        }
        ((TextView) this.f7203m0.getRootView().findViewWithTag("members_numbers_view_tag")).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(this.f7186C0.getMembersWithPositions().size()), Integer.valueOf(d.y0(this.f7186C0.getLevel()))}));
    }

    public final void Y() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f7188E0.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        com.google.firebase.storage.f a6 = com.google.firebase.storage.c.a().c().a(b.Z()).a("gangs").a(o.getGangObject().getId()).a("gangsPic");
        com.google.firebase.storage.f a7 = a6.a(o.getGangObject().getId() + ".jpg");
        a7.k(byteArray).a((Executor) null, new A4.c((Object) this, (Object) a7, 4)).addOnCompleteListener(new C0425e(this, 1));
    }
}
