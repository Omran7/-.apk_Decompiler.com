package s4;

import K1.e;
import R2.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import j4.C0646w;
import j4.D;
import j4.p0;

/* renamed from: s4.b  reason: case insensitive filesystem */
public final class C0973b extends C0286s {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f11548m0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f11549d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f11550e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f11551f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f11552g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f11553h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f11554i0;

    /* renamed from: j0  reason: collision with root package name */
    public D f11555j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0590f f11556k0;

    /* renamed from: l0  reason: collision with root package name */
    public p0 f11557l0;

    public C0973b(Context context, int i2) {
        this.f11549d0 = context;
        this.f11550e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f11551f0 = inflate;
        this.f11552g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f11553h0 = (ListView) this.f11551f0.findViewById(R.id.fragment_basic_list_view);
        this.f11554i0 = (RelativeLayout) this.f11551f0.findViewById(R.id.fragment_basic_back_button);
        TextView textView = this.f11552g0;
        int i5 = this.f11550e0;
        switch (i5) {
            case 0:
                i2 = R.string.crime_type_one;
                break;
            case 1:
                i2 = R.string.crime_type_two;
                break;
            case 2:
                i2 = R.string.crime_type_three;
                break;
            case 3:
                i2 = R.string.crime_type_four;
                break;
            case 4:
                i2 = R.string.crime_type_five;
                break;
            case 5:
                i2 = R.string.crime_type_six;
                break;
            case zzaky.zzf.zzf:
                i2 = R.string.crime_type_seven;
                break;
            case zzaky.zzf.zzg:
                i2 = R.string.crime_type_eight;
                break;
            case 8:
                i2 = R.string.crime_type_nine;
                break;
            case 9:
                i2 = R.string.crime_type_ten;
                break;
            case 10:
                i2 = R.string.crime_type_eleven;
                break;
            case ModuleDescriptor.MODULE_VERSION:
                i2 = R.string.crime_type_twelve;
                break;
            case 12:
                i2 = R.string.crime_type_thirteen;
                break;
            case 13:
                i2 = R.string.crime_type_fourteen;
                break;
            case 14:
                i2 = R.string.crime_type_fifteen;
                break;
            case 15:
                i2 = R.string.crime_type_sixteen;
                break;
            case 16:
                i2 = R.string.crime_type_seventeen;
                break;
            default:
                i2 = -1;
                break;
        }
        textView.setText(i2);
        b.w(true);
        a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("stockObject").E("itemsInStock").E("grocery").E(e.x(android.support.v4.media.session.a.F(i5), 0)).E(android.support.v4.media.session.a.z()).d(new C0972a(this, 0));
        RelativeLayout relativeLayout = this.f11554i0;
        relativeLayout.setOnClickListener(new C0646w(this, relativeLayout, 8));
        return this.f11551f0;
    }

    public final void H() {
        p0 p0Var;
        this.f5157L = true;
        C0590f fVar = this.f11556k0;
        if (!(fVar == null || (p0Var = this.f11557l0) == null)) {
            fVar.u(p0Var);
        }
        this.f11556k0 = null;
        this.f11557l0 = null;
    }

    public final void I() {
        this.f5157L = true;
        C0590f v6 = a.v(a.x(C0592h.d().e(), "players"), "crimeObject");
        this.f11556k0 = v6;
        if (this.f11557l0 == null) {
            p0 p0Var = new p0(this, 15);
            this.f11557l0 = p0Var;
            v6.b(p0Var);
        }
    }
}
