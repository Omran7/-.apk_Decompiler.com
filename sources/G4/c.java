package G4;

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
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;
import x1.i;

public final class c extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f845d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f846e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f847f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f848g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f849h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f850i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f851j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public float f852k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f853l0;

    public c(Context context) {
        this.f845d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f846e0 = inflate;
        this.f847f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f848g0 = (ListView) this.f846e0.findViewById(R.id.fragment_basic_list_view);
        this.f849h0 = (TextView) this.f846e0.findViewById(R.id.fragment_basic_empty_view);
        this.f850i0 = (RelativeLayout) this.f846e0.findViewById(R.id.fragment_basic_back_button);
        if (o.getNotificationObject().isHasUnReadNotification()) {
            a.d(a.c(C0592h.b().e(), "players"), "notificationObject", "hasUnReadNotification").I(Boolean.FALSE);
        }
        this.f848g0.setOnItemClickListener(new a(this, 0));
        this.f848g0.setOnScrollListener(new B4.a(this, 2));
        this.f848g0.setOnTouchListener(new b(this, 0));
        this.f847f0.setText(R.string.notification_title);
        this.f849h0.setText(R.string.empty_notifications);
        b.w(true);
        a.x(C0592h.d().e(), "notifications").E(o.getAccountObject().getId()).q("unixTimeInMilli").p(30).d(new i((Object) this, 10));
        RelativeLayout relativeLayout = this.f850i0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 6));
        return this.f846e0;
    }
}
