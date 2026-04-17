package w4;

import I1.b;
import N4.a;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0509f;
import h0.C0552a;

/* renamed from: w4.a  reason: case insensitive filesystem */
public final class C1085a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12441a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1088d f12442b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1085a(C1088d dVar, View view, int i2) {
        super(view);
        this.f12441a = i2;
        this.f12442b = dVar;
    }

    public final void onClick(View view) {
        int i2;
        int i5;
        int i6;
        int i7;
        C1088d dVar = this.f12442b;
        int i8 = 0;
        switch (this.f12441a) {
            case 0:
                super.onClick(view);
                if (dVar.f12459I0.getVisibility() == 0) {
                    i8 = 8;
                }
                dVar.f12459I0.setVisibility(i8);
                dVar.f12460J0.setVisibility(i8);
                dVar.f12461K0.setVisibility(i8);
                if (dVar.f12455E0.isShown()) {
                    dVar.L0.setVisibility(i8);
                    return;
                }
                return;
            case 1:
                super.onClick(view);
                C0269a aVar = new C0269a(dVar.p());
                aVar.f(R.id.activity_main_body_frame_layout, new a("إرشادات الجيم", "الجيم هو أساس قوتك في اللعبة. كلما زادت إحصائيات المعركة لديك (قوة - سرعة - دفاع - مهارة)، زادت قوتك وستتمكن من هزيمة أعدائك بسهولة.\n\n1. التدريب في الجيم يعتمد على استخدام الطاقة فقط.\n\n2. كلما زادت السعادة الناتجة عن العقار المستخدم والمعدات الخاصة (الحقائب - السيارات - الطائرات)، زادت نتيجة التدريب.\n\n3. يُنصح باستخدام الأعشاب المناسبة لزيادة السعادة وبالتالي زيادة نتيجة التدريب (مثل عشبة الأياهواسكا).\n\n4. قم بتغيير درس الجيم واختر الدرس المناسب للتدريب، حيث إن كل درس يزيد من نتيجة التدريب في إحصائيات معينة.\n\n5. عند احتلال المدن، اذهب واستعمل الجيم فيها، حيث إن نتيجة التدريب هناك تكون أكبر بكثير من الجيم العادي.\n\n6. اهتم بدروس المدرسة أيضًا، فهناك دروس لها علاقة بزيادة نتيجة التدريب في الجيم.\n\nــــــــــــــــــــــــــــــــــــ\n\n\n- القوة: تعادل الضرر في السلاح. كلما زادت قوتك، زادت قوة ضربتك لخصمك، وبالتالي تنقص من صحته أكثر.\n\n- السرعة: تعادل الدقة في السلاح. كلما زادت سرعتك، زادت إمكانية إصابة خصمك وعدم قدرته على تفادي الضربات.\n\n- المهارة: تعادل المراوغة في الدرع. كلما زادت مهارتك، زادت إمكانية تفادي ضربات خصمك وعدم قدرته على إصابتك.\n\n- الدفاع: كلما زاد دفاعك، زادت صحتك، وبالتالي لن تفقد الكثير من صحتك الكلية عند إصابتك من خصمك، وسيحتاج خصمك إلى إصابتك مرات عديدة حتى يهزمك.\n\n"), (String) null, 1);
                com.google.android.gms.internal.measurement.a.j(aVar, false);
                return;
            case 2:
                super.onClick(view);
                if (dVar.f12467S0) {
                    C0269a aVar2 = new C0269a(dVar.p());
                    aVar2.h(dVar);
                    aVar2.e(false);
                    return;
                }
                v0.e(dVar.f12468d0, MyApplication.f7090a.getApplicationContext().getString(R.string.wait_until_training_finished));
                return;
            default:
                super.onClick(view);
                C1088d dVar2 = this.f12442b;
                boolean z3 = dVar2.f12467S0;
                MainActivity mainActivity = dVar2.f12468d0;
                if (!z3) {
                    v0.e(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.please_wait));
                    return;
                } else if (o.getMainStatesObject().getPowerCurrent() < 1) {
                    c.p(mainActivity, 2001);
                    return;
                } else {
                    String g = com.google.android.gms.internal.measurement.a.g(dVar2.f12478n0);
                    String g5 = com.google.android.gms.internal.measurement.a.g(dVar2.f12479o0);
                    String g6 = com.google.android.gms.internal.measurement.a.g(dVar2.f12480p0);
                    String g7 = com.google.android.gms.internal.measurement.a.g(dVar2.f12481q0);
                    try {
                        i2 = Integer.parseInt(g);
                    } catch (Exception e6) {
                        C0552a.x(e6, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "d");
                        i2 = 0;
                    }
                    try {
                        i5 = Integer.parseInt(g5);
                    } catch (Exception e7) {
                        C0552a.x(e7, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "d");
                        i5 = 0;
                    }
                    try {
                        i6 = Integer.parseInt(g6);
                    } catch (Exception e8) {
                        C0552a.x(e8, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "d");
                        i6 = 0;
                    }
                    try {
                        i7 = Integer.parseInt(g7);
                    } catch (Exception e9) {
                        C0552a.x(e9, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "d");
                        i7 = 0;
                    }
                    if (b.p0()) {
                        com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.gym_reach_maximum_statics, mainActivity, (String) null);
                        return;
                    } else if (i2 > 0 || i5 > 0 || i6 > 0 || i7 > 0) {
                        int i9 = i2 + i5 + i6 + i7;
                        if (i9 > o.getMainStatesObject().getPowerCurrent()) {
                            com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.not_has_enough_power_for_training, mainActivity, (String) null);
                            return;
                        } else if (b.s0(o.getGymObject(), i2, i5, i6, i7)) {
                            com.google.android.gms.internal.measurement.a.p(MyApplication.f7090a, R.string.will_reach_maximum_gym_statics_value, mainActivity, (String) null);
                            return;
                        } else {
                            R2.b.w(true);
                            dVar2.f12467S0 = false;
                            dVar2.f12489z0.setImageResource(R.drawable.button_gray);
                            ((AnimationDrawable) dVar2.f12454D0.getDrawable()).start();
                            dVar2.f12454D0.setVisibility(0);
                            d.m1(0, -i9, false, new C1087c(dVar2, i2, i5, i6, i7, i9));
                            return;
                        }
                    } else {
                        v0.e(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_use_power_to_train));
                        return;
                    }
                }
        }
    }
}
