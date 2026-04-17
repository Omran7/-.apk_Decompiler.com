package l4;

import F4.a;
import I1.b;
import W0.A;
import W0.v;
import W0.w;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.d;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.firebase.storage.c;
import com.google.firebase.storage.f;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.Executor;

/* renamed from: l4.d  reason: case insensitive filesystem */
public final class C0796d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9766a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f9767b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0796d(i iVar, View view, int i2) {
        super(view);
        this.f9766a = i2;
        this.f9767b = iVar;
    }

    public final void onClick(View view) {
        switch (this.f9766a) {
            case 0:
                super.onClick(view);
                i.V(this.f9767b, 0);
                return;
            case 1:
                super.onClick(view);
                i.V(this.f9767b, 1);
                return;
            case 2:
                super.onClick(view);
                i iVar = this.f9767b;
                iVar.f9785F0.setVisibility(0);
                iVar.f9785F0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_text, new Object[]{U.a(o.getMainStatesObject().getHealthCurrent()), U.a(d.o0())}));
                Animation loadAnimation = AnimationUtils.loadAnimation(iVar.f9806d0, R.anim.fade_to_hide);
                iVar.f9785F0.setAnimation(loadAnimation);
                loadAnimation.setAnimationListener(new a(this, 3));
                return;
            case 3:
                super.onClick(view);
                boolean isBannedFromChangeProfilePic = o.getAccountObject().isBannedFromChangeProfilePic();
                i iVar2 = this.f9767b;
                if (isBannedFromChangeProfilePic || o.getAccountObject().isBannedFromChangeProfilePicFromSystem()) {
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_change_profile_pic_cause_ban, iVar2.f9806d0, (String) null);
                    return;
                } else if (!iVar2.f9801Y0) {
                    iVar2.f9801Y0 = true;
                    iVar2.X0 = null;
                    iVar2.f9800W0 = null;
                    C0505b bVar = new C0505b(iVar2.f9806d0, R.layout.dialog_change_profile_pic);
                    iVar2.X0 = bVar;
                    ImageView imageView = (ImageView) iVar2.X0.findViewById(R.id.dialog_profile_pic_image_view);
                    ImageView imageView2 = (ImageView) iVar2.X0.findViewById(R.id.dialog_profile_pic_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) iVar2.X0.findViewById(R.id.dialog_profile_pic_change_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) iVar2.X0.findViewById(R.id.dialog_profile_pic_ok_button);
                    RelativeLayout relativeLayout3 = (RelativeLayout) iVar2.X0.findViewById(R.id.dialog_profile_pic_remove_button);
                    ((TextView) bVar.findViewById(R.id.dialog_profile_pic_title)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.change_profile_picture));
                    b.v(imageView, o.getMainStatesObject().getProfilePicUrl());
                    if (R2.b.k0(o.getMainStatesObject().getVipEndTime())) {
                        imageView.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                        iVar2.f9811i0.setVisibility(0);
                    } else {
                        imageView.setBackgroundResource(R.drawable.profile_pic_frame_default);
                        iVar2.f9811i0.setVisibility(8);
                    }
                    relativeLayout3.setOnClickListener(new C0796d(iVar2, relativeLayout3, 4));
                    relativeLayout2.setOnClickListener(new C0796d(iVar2, relativeLayout2, 5));
                    relativeLayout.setOnClickListener(new C0796d(iVar2, relativeLayout, 6));
                    imageView2.setOnClickListener(new C0796d(iVar2, imageView2, 7));
                    iVar2.X0.show();
                    return;
                } else {
                    return;
                }
            case 4:
                super.onClick(view);
                boolean equals = o.getMainStatesObject().getProfilePicUrl().equals("no_profile_pic");
                i iVar3 = this.f9767b;
                if (equals) {
                    v0.d(iVar3.f9806d0, view, MyApplication.f7090a.getApplicationContext().getString(R.string.profile_pic_not_have_image));
                    return;
                }
                if (!iVar3.f9802Z0) {
                    iVar3.f9802Z0 = true;
                    C0505b bVar2 = new C0505b(iVar3.f9806d0, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout4 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout5 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.want_remove_profile_picture);
                    ((LinearLayout) bVar2.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    relativeLayout4.setOnClickListener(new e(iVar3, relativeLayout4, bVar2, 0));
                    relativeLayout5.setOnClickListener(new e(iVar3, relativeLayout5, bVar2, 1));
                    bVar2.show();
                }
                iVar3.X0.dismiss();
                iVar3.f9801Y0 = false;
                return;
            case 5:
                super.onClick(view);
                i iVar4 = this.f9767b;
                Bitmap bitmap = iVar4.f9800W0;
                MainActivity mainActivity = iVar4.f9806d0;
                if (bitmap == null) {
                    v0.d(mainActivity, view, MyApplication.f7090a.getApplicationContext().getString(R.string.choose_picture_first));
                    return;
                } else if (o.getAccountObject().isBannedFromChangeProfilePic() || o.getAccountObject().isBannedFromChangeProfilePicFromSystem()) {
                    com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.can_not_change_profile_pic_cause_ban, mainActivity, (String) null);
                    return;
                } else {
                    R2.b.w(true);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    iVar4.f9800W0.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    f a6 = c.a().c().a(R2.b.Z()).a("players").a(o.getAccountObject().getId()).a("profilePic");
                    f a7 = a6.a(o.getAccountObject().getId() + ".jpg");
                    a7.k(byteArray).a((Executor) null, new X4.d(iVar4, a7, 28)).addOnCompleteListener(new C0451v(iVar4, 17));
                    iVar4.X0.dismiss();
                    iVar4.f9801Y0 = false;
                    return;
                }
            case zzaky.zzf.zzf:
                super.onClick(view);
                w wVar = new w();
                wVar.f3985C = true;
                wVar.f4030q = A.f3874b;
                wVar.f4008a = true;
                wVar.f4010b = true;
                wVar.f4041w = true;
                this.f9767b.f9805c1.a(new v(wVar));
                return;
            default:
                super.onClick(view);
                i iVar5 = this.f9767b;
                iVar5.X0.dismiss();
                iVar5.f9801Y0 = false;
                return;
        }
    }
}
