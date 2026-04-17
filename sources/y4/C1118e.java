package y4;

import A2.f;
import B4.c;
import K1.e;
import P4.m;
import R2.b;
import T1.S0;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.C0451v;
import e5.C0505b;
import i3.C0592h;
import j4.C0612a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: y4.e  reason: case insensitive filesystem */
public final class C1118e extends C0286s {

    /* renamed from: B0  reason: collision with root package name */
    public static final /* synthetic */ int f12721B0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public int f12722A0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f12723d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f12724e0;

    /* renamed from: f0  reason: collision with root package name */
    public ImageView f12725f0;

    /* renamed from: g0  reason: collision with root package name */
    public ConstraintLayout f12726g0;

    /* renamed from: h0  reason: collision with root package name */
    public LinearLayout f12727h0;

    /* renamed from: i0  reason: collision with root package name */
    public LinearLayout f12728i0;

    /* renamed from: j0  reason: collision with root package name */
    public ListView f12729j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f12730k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f12731l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f12732m0;

    /* renamed from: n0  reason: collision with root package name */
    public C0612a f12733n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f12734o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f12735p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f12736q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f12737r0;
    public int s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList f12738t0;

    /* renamed from: u0  reason: collision with root package name */
    public ArrayList f12739u0;

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f12740v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList f12741w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f12742x0 = false;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f12743y0 = true;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f12744z0 = true;

    public C1118e(MainActivity mainActivity) {
        this.f12723d0 = mainActivity;
    }

    public static void V(C1118e eVar) {
        eVar.f12743y0 = true;
        eVar.f12744z0 = true;
        eVar.f12727h0.setBackgroundResource(R.drawable.lucky_wheel_button_enabled_dark);
        eVar.f12728i0.setBackgroundResource(R.drawable.lucky_wheel_button_enabled_dark);
        eVar.f12725f0.setImageResource(R.drawable.lucky_wheel_close_button);
    }

    public static int W(C1118e eVar) {
        int J5 = e.J(1, eVar.s0);
        long j6 = 0;
        for (int i2 = 0; i2 < eVar.f12739u0.size(); i2++) {
            j6 += ((Long) eVar.f12739u0.get(i2)).longValue();
            if (((long) J5) <= j6) {
                return i2;
            }
        }
        return -1;
    }

    public static void X(C1118e eVar, ArrayList arrayList, int i2) {
        eVar.getClass();
        a.v(a.c(C0592h.b().e(), "players"), "moneyObject").d(new f((Object) eVar, i2, (Object) arrayList, 23));
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_lucky_wheel, viewGroup, false);
        this.f12724e0 = inflate;
        this.f12725f0 = (ImageView) inflate.findViewById(R.id.fragment_lucky_wheel_close_button);
        this.f12726g0 = (ConstraintLayout) this.f12724e0.findViewById(R.id.fragment_lucky_wheel_main_prizes_layout);
        this.f12727h0 = (LinearLayout) this.f12724e0.findViewById(R.id.fragment_lucky_wheel_one_chance_button);
        this.f12728i0 = (LinearLayout) this.f12724e0.findViewById(R.id.fragment_lucky_wheel_ten_chance_button);
        this.f12731l0 = (TextView) this.f12724e0.findViewById(R.id.fragment_lucky_wheel_one_roll_cost);
        this.f12732m0 = (TextView) this.f12724e0.findViewById(R.id.fragment_lucky_wheel_ten_roll_cost);
        this.f12729j0 = (ListView) this.f12724e0.findViewById(R.id.fragment_lucky_wheel_starting_list_view);
        this.f12730k0 = (TextView) this.f12724e0.findViewById(R.id.fragment_lucky_wheel_opening_time);
        this.f12741w0 = new ArrayList();
        C0612a aVar = new C0612a(this.f12723d0, this.f12741w0, 5);
        this.f12733n0 = aVar;
        this.f12729j0.setAdapter(aVar);
        this.f12729j0.setOnItemClickListener(new m(this, 4));
        b.w(true);
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C0592h.b().e().E(b.Z()).E("luckyWheel").E("data").d(new E4.a(taskCompletionSource, 11));
        arrayList.add(taskCompletionSource.getTask());
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        C0592h.d().e().E(b.a0()).E("luckyWheel").E("winners").p(20).d(new c(taskCompletionSource2, 11));
        arrayList.add(taskCompletionSource2.getTask());
        Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new C0451v(this, 18));
        LinearLayout linearLayout = this.f12727h0;
        linearLayout.setOnClickListener(new C1115b(this, linearLayout, 0));
        LinearLayout linearLayout2 = this.f12728i0;
        linearLayout2.setOnClickListener(new C1115b(this, linearLayout2, 1));
        ImageView imageView = this.f12725f0;
        imageView.setOnClickListener(new C1115b(this, imageView, 2));
        return this.f12724e0;
    }

    public final void Y(boolean z3) {
        this.f12743y0 = false;
        this.f12744z0 = z3;
        this.f12727h0.setBackgroundResource(R.drawable.lucky_wheel_button_disabled);
        this.f12728i0.setBackgroundResource(R.drawable.lucky_wheel_button_disabled);
        if (!this.f12744z0) {
            this.f12725f0.setImageResource(R.drawable.lucky_wheel_close_button_disabled);
        }
    }

    public final void Z(long j6) {
        C0505b bVar = new C0505b(this.f12723d0, R.layout.dialog_ok_cancle);
        TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_title);
        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
        relativeLayout.setVisibility(0);
        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.lucky_wheel_closed);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance.setTimeInMillis(j6 * 1000);
        int i2 = instance.get(11);
        instance.set(12, 0);
        instance.set(13, 0);
        int i5 = this.f12736q0;
        if (i2 < i5) {
            instance.set(11, i5);
        } else {
            int i6 = i5 + 12;
            if (i2 < i6) {
                instance.set(11, i6);
            } else {
                instance.set(5, instance.get(5) + 1);
                instance.set(11, this.f12736q0);
            }
        }
        a0(textView, com.bumptech.glide.c.T(instance.getTimeInMillis() / 1000));
        relativeLayout.setOnClickListener(new com.mtma.criminal.city.activities.m(relativeLayout, bVar, 13));
        bVar.show();
    }

    public final void a0(TextView textView, long j6) {
        Date date = new Date(j6 * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        textView.setText(s(R.string.remaining_time_until_open_wheel, simpleDateFormat.format(date)));
        new Handler().postDelayed(new S0(this, textView, j6, 2), 1000);
    }
}
