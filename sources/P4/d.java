package P4;

import B4.c;
import E4.a;
import R2.b;
import X4.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;
import java.util.Collection;

public final class d extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f2192d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2193e0;

    /* renamed from: f0  reason: collision with root package name */
    public ImageView f2194f0;

    /* renamed from: g0  reason: collision with root package name */
    public RelativeLayout f2195g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f2196h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Context f2197i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f2198j0;

    /* renamed from: k0  reason: collision with root package name */
    public ViewGroup f2199k0;

    /* renamed from: l0  reason: collision with root package name */
    public Object f2200l0;

    /* renamed from: m0  reason: collision with root package name */
    public Object f2201m0;

    public d(StartActivity startActivity) {
        this.f2192d0 = 1;
        this.f2196h0 = false;
        this.f2201m0 = "";
        this.f2197i0 = startActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f2192d0) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.fragment_admins, viewGroup, false);
                this.f2193e0 = inflate;
                this.f2198j0 = (TextView) inflate.findViewById(R.id.fragment_admins_empty_view);
                this.f2199k0 = (ListView) this.f2193e0.findViewById(R.id.fragment_admins_list_view);
                this.f2194f0 = (ImageView) this.f2193e0.findViewById(R.id.fragment_admins_request_button_image);
                this.f2195g0 = (RelativeLayout) this.f2193e0.findViewById(R.id.fragment_admins_request_button);
                this.f2200l0 = (RelativeLayout) this.f2193e0.findViewById(R.id.fragment_admins_help_button);
                this.f2201m0 = (RelativeLayout) this.f2193e0.findViewById(R.id.fragment_admins_back_button);
                if (o.getAccountObject().isHasAdminRequestNotReviewed()) {
                    this.f2194f0.setImageResource(R.drawable.button_gray_large);
                } else {
                    this.f2194f0.setImageResource(R.drawable.button_blue_large);
                }
                b.w(true);
                ArrayList arrayList = new ArrayList();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                C0592h.b().e().E(b.Z()).E("players").q("accountObject/admin").j().d(new a(taskCompletionSource, 3));
                arrayList.add(taskCompletionSource.getTask());
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                C0592h.b().e().E(b.Z()).E("players").q("accountObject/temporaryAdmin").j().d(new c(taskCompletionSource2, 6));
                arrayList.add(taskCompletionSource2.getTask());
                Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new a(this, 0));
                RelativeLayout relativeLayout = this.f2195g0;
                relativeLayout.setOnClickListener(new b(this, relativeLayout, 0));
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f2200l0;
                relativeLayout2.setOnClickListener(new b(this, relativeLayout2, 1));
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f2201m0;
                relativeLayout3.setOnClickListener(new b(this, relativeLayout3, 2));
                return this.f2193e0;
            default:
                View inflate2 = layoutInflater.inflate(R.layout.fragment_reset_password, viewGroup, false);
                this.f2193e0 = inflate2;
                this.f2198j0 = (EditText) inflate2.findViewById(R.id.fragment_reset_password_email_field);
                this.f2195g0 = (RelativeLayout) this.f2193e0.findViewById(R.id.fragment_reset_password_send_button);
                this.f2194f0 = (ImageView) this.f2193e0.findViewById(R.id.fragment_reset_password_close_button);
                this.f2199k0 = (LinearLayout) this.f2193e0.findViewById(R.id.fragment_reset_password_progress_bar);
                Animation loadAnimation = AnimationUtils.loadAnimation((StartActivity) this.f2197i0, R.anim.from_top_to_position);
                loadAnimation.setDuration(750);
                this.f2193e0.setAnimation(loadAnimation);
                this.f2200l0 = C0592h.b().f("Users");
                RelativeLayout relativeLayout4 = this.f2195g0;
                relativeLayout4.setOnClickListener(new e(this, relativeLayout4, 0));
                ImageView imageView = this.f2194f0;
                imageView.setOnClickListener(new e(this, imageView, 1));
                return this.f2193e0;
        }
    }

    public d(Context context) {
        this.f2192d0 = 0;
        this.f2196h0 = false;
        this.f2197i0 = context;
    }
}
