package w4;

import I1.b;
import K4.e;
import K4.r;
import V4.g;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.t0;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import j4.C0612a;
import java.util.ArrayList;

/* renamed from: w4.d  reason: case insensitive filesystem */
public final class C1088d extends C0286s {

    /* renamed from: T0  reason: collision with root package name */
    public static final /* synthetic */ int f12450T0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public RelativeLayout f12451A0;

    /* renamed from: B0  reason: collision with root package name */
    public RelativeLayout f12452B0;

    /* renamed from: C0  reason: collision with root package name */
    public TextView f12453C0;

    /* renamed from: D0  reason: collision with root package name */
    public ImageView f12454D0;

    /* renamed from: E0  reason: collision with root package name */
    public LinearLayout f12455E0;

    /* renamed from: F0  reason: collision with root package name */
    public ImageView f12456F0;

    /* renamed from: G0  reason: collision with root package name */
    public ImageView f12457G0;

    /* renamed from: H0  reason: collision with root package name */
    public ImageView f12458H0;

    /* renamed from: I0  reason: collision with root package name */
    public ConstraintLayout f12459I0;

    /* renamed from: J0  reason: collision with root package name */
    public ConstraintLayout f12460J0;

    /* renamed from: K0  reason: collision with root package name */
    public ConstraintLayout f12461K0;
    public ConstraintLayout L0;

    /* renamed from: M0  reason: collision with root package name */
    public C0612a f12462M0;

    /* renamed from: N0  reason: collision with root package name */
    public int f12463N0;
    public int O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f12464P0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f12465Q0;

    /* renamed from: R0  reason: collision with root package name */
    public int f12466R0 = 0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f12467S0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f12468d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f12469e0;

    /* renamed from: f0  reason: collision with root package name */
    public ConstraintLayout f12470f0;

    /* renamed from: g0  reason: collision with root package name */
    public ConstraintLayout f12471g0;

    /* renamed from: h0  reason: collision with root package name */
    public ConstraintLayout f12472h0;

    /* renamed from: i0  reason: collision with root package name */
    public ConstraintLayout f12473i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f12474j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f12475k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f12476l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f12477m0;

    /* renamed from: n0  reason: collision with root package name */
    public EditText f12478n0;

    /* renamed from: o0  reason: collision with root package name */
    public EditText f12479o0;

    /* renamed from: p0  reason: collision with root package name */
    public EditText f12480p0;

    /* renamed from: q0  reason: collision with root package name */
    public EditText f12481q0;

    /* renamed from: r0  reason: collision with root package name */
    public SeekBar f12482r0;
    public SeekBar s0;

    /* renamed from: t0  reason: collision with root package name */
    public SeekBar f12483t0;

    /* renamed from: u0  reason: collision with root package name */
    public SeekBar f12484u0;

    /* renamed from: v0  reason: collision with root package name */
    public ListView f12485v0;

    /* renamed from: w0  reason: collision with root package name */
    public TextView f12486w0;

    /* renamed from: x0  reason: collision with root package name */
    public ImageView f12487x0;

    /* renamed from: y0  reason: collision with root package name */
    public RelativeLayout f12488y0;

    /* renamed from: z0  reason: collision with root package name */
    public ImageView f12489z0;

    public C1088d(MainActivity mainActivity) {
        this.f12468d0 = mainActivity;
    }

    public static void V(C1088d dVar) {
        dVar.f12467S0 = true;
        dVar.f12489z0.setImageResource(R.drawable.button_red);
        ((AnimationDrawable) dVar.f12454D0.getDrawable()).stop();
        dVar.f12454D0.setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [Y4.o, java.lang.Object] */
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gym, viewGroup, false);
        this.f12469e0 = inflate;
        this.f12470f0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_gym_strength_layout);
        this.f12471g0 = (ConstraintLayout) this.f12469e0.findViewById(R.id.fragment_gym_defense_layout);
        this.f12472h0 = (ConstraintLayout) this.f12469e0.findViewById(R.id.fragment_gym_speed_layout);
        this.f12473i0 = (ConstraintLayout) this.f12469e0.findViewById(R.id.fragment_gym_dexterity_layout);
        this.f12474j0 = (TextView) this.f12469e0.findViewById(R.id.fragment_gym_strength_value);
        this.f12478n0 = (EditText) this.f12469e0.findViewById(R.id.fragment_gym_strength_edit_text);
        this.f12482r0 = (SeekBar) this.f12469e0.findViewById(R.id.fragment_gym_strength_seekbar);
        this.f12475k0 = (TextView) this.f12469e0.findViewById(R.id.fragment_gym_defense_value);
        this.f12479o0 = (EditText) this.f12469e0.findViewById(R.id.fragment_gym_defense_edit_text);
        this.s0 = (SeekBar) this.f12469e0.findViewById(R.id.fragment_gym_defense_seekbar);
        this.f12476l0 = (TextView) this.f12469e0.findViewById(R.id.fragment_gym_speed_value);
        this.f12480p0 = (EditText) this.f12469e0.findViewById(R.id.fragment_gym_speed_edit_text);
        this.f12483t0 = (SeekBar) this.f12469e0.findViewById(R.id.fragment_gym_speed_seekbar);
        this.f12477m0 = (TextView) this.f12469e0.findViewById(R.id.fragment_gym_dexterity_value);
        this.f12481q0 = (EditText) this.f12469e0.findViewById(R.id.fragment_gym_dexterity_edit_text);
        this.f12484u0 = (SeekBar) this.f12469e0.findViewById(R.id.fragment_gym_dexterity_seekbar);
        this.f12487x0 = (ImageView) this.f12469e0.findViewById(R.id.fragment_gym_instruction_button);
        this.f12488y0 = (RelativeLayout) this.f12469e0.findViewById(R.id.fragment_gym_train_button);
        this.f12489z0 = (ImageView) this.f12469e0.findViewById(R.id.fragment_gym_train_button_image);
        this.f12486w0 = (TextView) this.f12469e0.findViewById(R.id.fragment_gym_maximum_statics);
        this.f12485v0 = (ListView) this.f12469e0.findViewById(R.id.fragment_gym_list_view);
        this.f12451A0 = (RelativeLayout) this.f12469e0.findViewById(R.id.fragment_gym_help_button);
        this.f12452B0 = (RelativeLayout) this.f12469e0.findViewById(R.id.fragment_gym_back_button);
        this.f12455E0 = (LinearLayout) this.f12469e0.findViewById(R.id.fragment_gym_progress_bar_layout);
        this.f12453C0 = (TextView) this.f12469e0.findViewById(R.id.fragment_gym_progress_title);
        this.f12456F0 = (ImageView) this.f12469e0.findViewById(R.id.fragment_gym_full_progress_bar);
        this.f12457G0 = (ImageView) this.f12469e0.findViewById(R.id.fragment_gym_full_progress_bar_white);
        this.f12454D0 = (ImageView) this.f12469e0.findViewById(R.id.fragment_gym_animation_imageview);
        this.f12458H0 = (ImageView) this.f12469e0.findViewById(R.id.fragment_gym_maximum_statics_layout);
        this.f12459I0 = (ConstraintLayout) this.f12469e0.findViewById(R.id.fragment_upgrade_lab_instruction_1);
        this.f12460J0 = (ConstraintLayout) this.f12469e0.findViewById(R.id.fragment_upgrade_lab_instruction_2);
        this.f12461K0 = (ConstraintLayout) this.f12469e0.findViewById(R.id.fragment_upgrade_lab_instruction_3);
        this.L0 = (ConstraintLayout) this.f12469e0.findViewById(R.id.fragment_upgrade_lab_instruction_4);
        MainActivity mainActivity = this.f12468d0;
        Animation loadAnimation = AnimationUtils.loadAnimation(mainActivity, R.anim.from_end_to_position);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(mainActivity, R.anim.from_start_to_position);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(mainActivity, R.anim.from_bottom_to_position);
        this.f12470f0.setAnimation(loadAnimation);
        this.f12472h0.setAnimation(loadAnimation);
        this.f12471g0.setAnimation(loadAnimation2);
        this.f12473i0.setAnimation(loadAnimation2);
        this.f12485v0.setAnimation(loadAnimation3);
        this.f12474j0.setText(b.x(o.getGymObject().getStrength()));
        this.f12475k0.setText(b.x(o.getGymObject().getDefense()));
        this.f12476l0.setText(b.x(o.getGymObject().getSpeed()));
        this.f12477m0.setText(b.x(o.getGymObject().getDexterity()));
        this.f12486w0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.maximum_static_gym, new Object[]{Long.valueOf(b.Q(o.getMainStatesObject().getLevel()))}));
        ArrayList arrayList = new ArrayList();
        boolean booleanValue = o.getGymObject().getGymLessonsOpenedStatesList().get(arrayList.size()).booleanValue();
        ? obj = new Object();
        obj.f4410f = false;
        obj.f4408c = R.drawable.gym_category_1_type_0;
        obj.f4406a = R.string.gym_category_one_type_zero_name;
        obj.f4407b = R.string.gym_category_one_type_zero_description;
        obj.g = booleanValue;
        arrayList.add(obj);
        arrayList.add(new Y4.o(R.drawable.gym_category_1_type_1, R.string.gym_category_one_type_one_name, R.drawable.gym_strength_icon, 20000, o.getGymObject().getGymLessonsOpenedStatesList().get(arrayList.size()).booleanValue()));
        arrayList.add(new Y4.o(R.drawable.gym_category_1_type_2, R.string.gym_category_one_type_two_name, R.drawable.gym_defense_icon, 100000, o.getGymObject().getGymLessonsOpenedStatesList().get(arrayList.size()).booleanValue()));
        arrayList.add(new Y4.o(R.drawable.gym_category_1_type_3, R.string.gym_category_one_type_three_name, R.drawable.gym_speed_icon, 500000, o.getGymObject().getGymLessonsOpenedStatesList().get(arrayList.size()).booleanValue()));
        arrayList.add(new Y4.o(R.drawable.gym_category_1_type_4, R.string.gym_category_one_type_four_name, R.drawable.gym_dexterity_icon, 1000000, o.getGymObject().getGymLessonsOpenedStatesList().get(arrayList.size()).booleanValue()));
        ((Y4.o) arrayList.get(o.getGymObject().getSelectedGymLesson())).f4410f = true;
        C0612a aVar = new C0612a(mainActivity, arrayList, 2);
        this.f12462M0 = aVar;
        this.f12485v0.setAdapter(aVar);
        this.f12456F0.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, 11));
        this.f12462M0.registerDataSetObserver(new r(this, 9));
        if (b.p0()) {
            this.f12458H0.setVisibility(0);
            this.f12489z0.setImageResource(R.drawable.button_gray);
        }
        this.f12482r0.setOnSeekBarChangeListener(new C1086b(this, 0));
        this.s0.setOnSeekBarChangeListener(new C1086b(this, 1));
        this.f12483t0.setOnSeekBarChangeListener(new C1086b(this, 2));
        this.f12484u0.setOnSeekBarChangeListener(new C1086b(this, 3));
        RelativeLayout relativeLayout = this.f12488y0;
        relativeLayout.setOnClickListener(new C1085a(this, relativeLayout, 3));
        ImageView imageView = this.f12487x0;
        imageView.setOnClickListener(new C1085a(this, imageView, 0));
        RelativeLayout relativeLayout2 = this.f12451A0;
        relativeLayout2.setOnClickListener(new C1085a(this, relativeLayout2, 1));
        RelativeLayout relativeLayout3 = this.f12452B0;
        relativeLayout3.setOnClickListener(new C1085a(this, relativeLayout3, 2));
        return this.f12469e0;
    }

    public final void W() {
        String str;
        if (o.getGymObject().getSelectedGymLesson() == 4) {
            str = MyApplication.f7090a.getApplicationContext().getString(R.string.gym_cities_available);
        } else {
            str = MyApplication.f7090a.getApplicationContext().getString(((Y4.o) this.f12462M0.getItem(o.getGymObject().getSelectedGymLesson() + 1)).f4406a);
        }
        this.f12453C0.setText(s(R.string.gym_progress_title, str));
        int intValue = o.getGymObject().getGymLessonsProgressList().get(o.getGymObject().getSelectedGymLesson()).intValue();
        int i2 = this.f12466R0;
        int intValue2 = i2 - ((intValue * i2) / b.a0(o.getGymObject().getSelectedGymLesson()).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, intValue2, 0);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20, -1);
        if (this.f12457G0.getVisibility() == 0) {
            this.f12457G0.setLayoutParams(layoutParams);
            this.f12457G0.setPaddingRelative(K1.e.m(1.0d), 2, -intValue2, K1.e.m(1.0d));
            this.f12457G0.startAnimation(AnimationUtils.loadAnimation(this.f12468d0, R.anim.progressbar_flash));
            new Handler().postDelayed(new g(this, layoutParams, intValue2, 4), 1000);
            return;
        }
        this.f12456F0.setLayoutParams(layoutParams);
        this.f12456F0.setPaddingRelative(K1.e.m(1.0d), 2, -intValue2, K1.e.m(1.0d));
    }

    public final void X(int i2, double d) {
        ConstraintLayout constraintLayout;
        int i5;
        if (i2 == 1) {
            constraintLayout = this.f12470f0;
        } else if (i2 == 2) {
            constraintLayout = this.f12471g0;
        } else if (i2 == 3) {
            constraintLayout = this.f12472h0;
        } else {
            constraintLayout = this.f12473i0;
        }
        int[] iArr = new int[2];
        constraintLayout.getLocationOnScreen(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        String string = MyApplication.f7090a.getApplicationContext().getString(R.string.text_with_plus_sign, new Object[]{K1.e.p(d)});
        boolean z3 = v0.f7482a;
        MainActivity mainActivity = this.f12468d0;
        View inflate = LayoutInflater.from(mainActivity).inflate(R.layout.toast_number_with_icon, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.toast_number_with_icon_content);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.toast_number_with_icon_icon);
        textView.setText(string);
        textView.setTextColor(mainActivity.getResources().getColor(R.color.gym_increasing, mainActivity.getTheme()));
        if (i2 == 1) {
            i5 = R.drawable.gym_strength_icon;
        } else if (i2 == 2) {
            i5 = R.drawable.gym_defense_icon;
        } else if (i2 == 3) {
            i5 = R.drawable.gym_speed_icon;
        } else if (i2 == 4) {
            i5 = R.drawable.gym_dexterity_icon;
        } else {
            i5 = -1;
        }
        imageView.setImageResource(i5);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
        layoutParams.bottomMargin = Resources.getSystem().getDisplayMetrics().heightPixels - i7;
        layoutParams.leftMargin = K1.e.m(6.0d) + i6;
        inflate.setLayoutParams(layoutParams);
        ViewGroup viewGroup = (ViewGroup) mainActivity.getWindow().getDecorView().getRootView();
        viewGroup.addView(inflate);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(inflate, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.1f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.1f})});
        ofPropertyValuesHolder.setRepeatCount(3);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.start();
        ofPropertyValuesHolder.addListener(new t0(inflate, viewGroup, 5));
    }
}
