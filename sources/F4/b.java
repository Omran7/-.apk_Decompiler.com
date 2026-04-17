package F4;

import B4.f;
import U.d;
import Y4.v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import d5.o;
import j4.C0614b;
import java.util.ArrayList;

public final class b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f787d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f788e0;

    /* renamed from: f0  reason: collision with root package name */
    public FrameLayout f789f0;

    /* renamed from: g0  reason: collision with root package name */
    public ConstraintLayout f790g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f791h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f792i0;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f793j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0614b f794k0;

    public b(Context context) {
        this.f787d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_phone_dialog, viewGroup, false);
        this.f788e0 = inflate;
        this.f789f0 = (FrameLayout) inflate.findViewById(R.id.fragment_phone_dialog_main_layout);
        this.f790g0 = (ConstraintLayout) this.f788e0.findViewById(R.id.fragment_phone_dialog_dialog_layout);
        this.f792i0 = (GridView) this.f788e0.findViewById(R.id.fragment_phone_dialog_grid_view);
        this.f791h0 = (ImageView) this.f788e0.findViewById(R.id.fragment_phone_dialog_close_button);
        ConstraintLayout constraintLayout = this.f790g0;
        Context context = this.f787d0;
        constraintLayout.setAnimation(AnimationUtils.loadAnimation(context, R.anim.phone_dialog));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new v(R.string.phone_notification_button, R.drawable.notifications_icon, o.getNotificationObject().isHasUnReadNotification()));
        arrayList.add(new v(R.string.phone_messages_button, R.drawable.message_icon, o.getNotificationObject().isHasUnReadPrivateMessage()));
        arrayList.add(new v(R.string.phone_support_button, R.drawable.support_icon, o.getNotificationObject().isHasUnReadSupportMessage()));
        arrayList.add(new v(R.string.phone_twitter_button, R.drawable.phone_x_icon));
        arrayList.add(new v(R.string.phone_facebook_button, R.drawable.phone_facebook_icon));
        arrayList.add(new v(R.string.phone_instagram_button, R.drawable.phone_instagram_icon));
        arrayList.add(new v(R.string.phone_site_button, R.drawable.phone_site_icon));
        arrayList.add(new v(R.string.phone_settings_button, R.drawable.settings_icon));
        this.f793j0 = arrayList;
        C0614b bVar = new C0614b(context, this.f793j0, 10);
        this.f794k0 = bVar;
        this.f792i0.setAdapter(bVar);
        ImageView imageView = this.f791h0;
        imageView.setOnClickListener(new f(this, imageView, 5));
        return this.f788e0;
    }

    public final void V() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f787d0, R.anim.phone_dialog);
        loadAnimation.setInterpolator(new d(1));
        loadAnimation.setAnimationListener(new a(this, 0));
        this.f789f0.setBackgroundResource(0);
        this.f790g0.clearAnimation();
        this.f790g0.setAnimation(loadAnimation);
    }
}
