package N4;

import B4.f;
import U3.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0592h;
import j4.C0646w;

public final class a extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f1913d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1914e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f1915f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f1916g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f1917h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f1918i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f1919j0;

    public a(String str, String str2) {
        this.f1918i0 = str;
        this.f1919j0 = str2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f1913d0) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.fragment_medals, viewGroup, false);
                this.f1914e0 = inflate;
                this.f1919j0 = (ListView) inflate.findViewById(R.id.fragment_medals_list_view);
                this.f1915f0 = (TextView) this.f1914e0.findViewById(R.id.fragment_medals_medals_number);
                this.f1916g0 = (TextView) this.f1914e0.findViewById(R.id.fragment_medals_empty_view);
                this.f1917h0 = (RelativeLayout) this.f1914e0.findViewById(R.id.fragment_medals_back_button);
                com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(com.google.android.gms.internal.measurement.a.e(true), "players"), "medalsObject", "allMedalsList").d(new c((Object) this, 19));
                if (o.getNotificationObject().isHasUnSeenMedal()) {
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "notificationObject", "hasUnSeenMedal").I(Boolean.FALSE);
                }
                RelativeLayout relativeLayout = this.f1917h0;
                relativeLayout.setOnClickListener(new f(this, relativeLayout, 11));
                return this.f1914e0;
            default:
                View inflate2 = layoutInflater.inflate(R.layout.fragment_help, viewGroup, false);
                this.f1914e0 = inflate2;
                this.f1915f0 = (TextView) inflate2.findViewById(R.id.fragment_help_title);
                this.f1916g0 = (TextView) this.f1914e0.findViewById(R.id.fragment_help_content);
                this.f1917h0 = (RelativeLayout) this.f1914e0.findViewById(R.id.fragment_help_back_button);
                this.f1915f0.setText((String) this.f1918i0);
                this.f1916g0.setText((String) this.f1919j0);
                RelativeLayout relativeLayout2 = this.f1917h0;
                relativeLayout2.setOnClickListener(new C0646w(this, relativeLayout2, 2));
                return this.f1914e0;
        }
    }

    public a(Context context) {
        this.f1918i0 = context;
    }
}
