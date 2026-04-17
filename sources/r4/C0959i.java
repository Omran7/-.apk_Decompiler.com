package r4;

import N4.a;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;
import java.util.ArrayList;
import l4.C0794b;

/* renamed from: r4.i  reason: case insensitive filesystem */
public final class C0959i extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11241a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f11242b;

    public /* synthetic */ C0959i(j jVar, int i2) {
        this.f11241a = i2;
        this.f11242b = jVar;
    }

    public final void onClick(View view) {
        String str;
        switch (this.f11241a) {
            case 0:
                super.onClick(view);
                C0269a aVar = new C0269a(this.f11242b.p());
                aVar.f(R.id.activity_main_body_frame_layout, new a("تعليمات الشات", "أولاً: قواعد الشات\n\n1. الرجاء الانتباه للمحتالين، هناك عدد كبير من اللاعبين الذين يأخذون أموالك أو أغراضك داخل اللعبة أو خارجها ولا يعطونك أي شيء في المقابل حتى وإن تم الاتفاق مسبقًا. تعاملتَ مع هؤلاء على مسؤوليتك الشخصية، ورغم أن الإدارة لا تؤيد عمليات الاحتيال، فإننا لا نضمن استرجاع أي من أغراضك أو أموالك.\n\n2. يمنع بيع أو شراء الحسابات، ويُمنع عرض حسابات للبيع أو طلب شراء حساب في أي من قنوات الدردشة.\n\n3. يُمنع استخدام الألفاظ البذيئة أو المهينة تجاه لاعبين أو عصابات أخرى.\n\n4. يُمنع أي نوع من العنصرية، سواء كانت على أساس العِرق أو الجنسية أو الجنس أو التوجه الجنسي أو الديني.\n\n5. يُمنع تكرار إرسال نفس الرسالة (سبام)، أو وضع روابط إلكترونية، ويُعد ذلك مخالفة قد تؤدي إلى الحظر.\n\n6. يُمنع نشر أي إعلانات أو محاولات بيع أغراض خارج اللعبة، وسيؤدي ذلك إلى الحظر.\n\n7. يُمنع إفشاء معلومات شخصية تخص لاعبًا آخر أو الإدارة، مثل الأسماء الحقيقية، العناوين، البريد الإلكتروني، أرقام الهواتف، وغيرها، ويؤدي ذلك إلى حظر فوري.\n\n8. يُمنع التحدث في أمور الجنس أو الأديان.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nثانيًا: قواعد الصور:\n\nإنشاء أو استخدام صور تُسيء إلى لاعبين أو عصابات أخرى غير مسموح به مطلقًا، ويشمل ذلك الصور الجنسية أو التمييزية أو نشرها.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nثالثًا: قواعد التعامل مع المشرفين:\n\n- يُمنع رد الفعل العدائي تجاه أي مشرف قام بواجبه. إذا تم حظرك أو معاقبتك من قِبل مشرف، يُمنع شتمه أو الهجوم عليه في الشات أو وضع منحة لرأسه.\n\n- في حال تم حظرك بغير وجه حق، يمكنك التواصل مع الإدارة لحل المشكلة.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nرابعًا: قواعد الإشراف:\n\n- تتم محاسبة المشرف إذا خالف ما يلي:\n\n1. حظر لاعب دون وجود سبب واضح وفقًا لقوانين الشات (باستثناء الحالات التي تحددها الإدارة).\n2. مخالفة المشرف بنفسه لقوانين الشات.\n3. استخدام صورة شخصية مخالفة.\n4. غياب المشرف عن الشات لأكثر من 3 أيام.\n5. توفر دليل على أن المشرف تجاهل مخالفات في الشات.\n6. استغلال صلاحياته للنصب على اللاعبين أو لتحقيق مكاسب شخصية.\n7. معرفة المشرف بمشكلة في السيرفر أو وجود ثغرات وعدم الإبلاغ عنها فورًا.\n8. معرفة المشرف بوجود حساب تم بيعه أو شراؤه وعدم التبليغ عنه.\n9. تغيير المشرف لجنسه (ذكر أو أنثى) لأي سبب.\n10. تغيير اسم حسابه بشكل متكرر.\n\n- في حال ارتكاب أي من المخالفات أعلاه، يتم سحب الإشراف مباشرة.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nخامسًا: قواعد الإشراف العام:\n\n- يتم تعيين مشرف عام في السيرفر بعد مرور 4 أشهر على فتحه، بشرط أن يكون قد قضى 3 أشهر كمشرف أول.\n- لا يحق الترشح للإشراف العام في حال وجود مخالفات سابقة كمشرف.\n\nصلاحيات المشرف العام:\n1. فك الحظر عن أي لاعب في السيرفر.\n2. حظر اللاعبين المخالفين حتى من الرسائل الخاصة.\n3. حظر أي مشرف أول في حال خالف القوانين.\n4. أولوية الرد من الإدارة.\n5. التواصل الفوري مع الإدارة عند وجود مشاكل في السيرفر.\n\n- يتم سحب الإشراف العام إذا تم خرق قوانين الإشراف ثلاث مرات:\n1. الالتزام بالقواعد العامة للإشراف.\n2. لا يحق فك الحظر عن أعضاء العصابة الخاصة به.\n3. لا يحق الغياب عن الشات أكثر من 3 أيام.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nسادسًا: قواعد الترشح للإشراف:\n\n- يجب على اللاعب الراغب في الإشراف تلبية الشروط التالية:\n1. تأكيد البريد الإلكتروني للحساب.\n2. عدم وجود حظر سابق من قِبل الإدارة.\n3. الوصول إلى المستوى المناسب:\n- السيرفر (1): لفل 80.\n4. أن يكون عمر الحساب شهرين على الأقل (أو نصف عمر السيرفر إذا لم يتجاوز عمره 3 أشهر).\n5. إثبات وجود دعم من 5 لاعبين من أعلى 20 لاعب في السيرفر بالمستوى.\n\n- بعد استيفاء الشروط (1 إلى 4)، يتم التواصل مع اللاعب عبر البريد لتقديم دليل الشرط (5).\n- إذا استوفى جميع الشروط، سيتم اختياره وإبلاغه عبر البريد الإلكتروني.\n\n- تنبيه هام: إذا تبيّن أن الحساب لا يفي بالشروط، قد يتم استبعاده نهائيًا من الترشح مستقبلًا.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nسابعًا: الإشراف المؤقت:\n\n1. التواجد في الشات والإجابة على استفسارات اللاعبين، خاصة الجدد.\n2. الإبلاغ عن أي كلام مسيء في الشات.\n3. لا يملك صلاحيات الحظر أو حذف الصور.\n4. الإشراف على عمليات تبادل المواد (وليس الشراء أو البيع).\n5. التواصل المباشر مع الدعم الفني وأولوية في الرد.\n6. الإبلاغ عن أي مشكلة فورية في السيرفر.\n7. لا علاقة بين الإشراف المؤقت والترشح الرسمي.\n8. الإشراف المؤقت مؤقت بطبيعته ولا يعني ترشيح دائم.\n9. قد تُعدّل المهام حسب ما تراه الإدارة مناسبًا.\n\nملحوظة هامة: لا توجد قواعد للترشح للإشراف المؤقت، حيث يتم تعيين المشرف مباشرة من قِبل الإدارة. ولن يُنظر في الطلبات المرسلة لهذا الغرض."), (String) null, 1);
                com.google.android.gms.internal.measurement.a.j(aVar, false);
                return;
            case 1:
                super.onClick(view);
                j jVar = this.f11242b;
                C0269a aVar2 = new C0269a(jVar.p());
                aVar2.h(jVar);
                aVar2.e(false);
                MainActivity mainActivity = (MainActivity) jVar.l();
                if (mainActivity != null) {
                    C0794b bVar = mainActivity.f6971A0;
                    bVar.f9762u0 = false;
                    bVar.W();
                    return;
                }
                return;
            case 2:
                super.onClick(view);
                j jVar2 = this.f11242b;
                int i2 = jVar2.f11258q0;
                ArrayList arrayList = jVar2.f11259r0;
                if (i2 != arrayList.indexOf(jVar2.f11247f0)) {
                    int indexOf = arrayList.indexOf(jVar2.f11247f0);
                    jVar2.f11258q0 = indexOf;
                    jVar2.f11261u0 = "worldwide";
                    jVar2.Y(indexOf);
                    jVar2.W(new C0956f(jVar2.f11245d0, jVar2.f11261u0), true);
                    return;
                }
                return;
            case 3:
                super.onClick(view);
                j jVar3 = this.f11242b;
                int i5 = jVar3.f11258q0;
                ArrayList arrayList2 = jVar3.f11259r0;
                if (i5 != arrayList2.indexOf(jVar3.f11248g0)) {
                    jVar3.f11258q0 = arrayList2.indexOf(jVar3.f11248g0);
                    jVar3.f11261u0 = "gangs/" + o.getGangObject().getId();
                    jVar3.Y(jVar3.f11258q0);
                    jVar3.W(new C0956f(jVar3.f11245d0, jVar3.f11261u0), true);
                    return;
                }
                return;
            case 4:
                super.onClick(view);
                j jVar4 = this.f11242b;
                int i6 = jVar4.f11258q0;
                ArrayList arrayList3 = jVar4.f11259r0;
                if (i6 != arrayList3.indexOf(jVar4.f11249h0)) {
                    jVar4.f11258q0 = arrayList3.indexOf(jVar4.f11249h0);
                    int currentPlace = o.getLocationObject().getCurrentPlace();
                    if (currentPlace == 1) {
                        str = "hospital";
                    } else if (currentPlace == 2) {
                        str = "prison";
                    } else if (currentPlace != 3) {
                        str = null;
                    } else {
                        str = "plan";
                    }
                    jVar4.f11261u0 = str;
                    Context context = jVar4.f11245d0;
                    if (str != null) {
                        jVar4.Y(jVar4.f11258q0);
                        jVar4.W(new C0956f(context, jVar4.f11261u0), true);
                        return;
                    }
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.chat_channel_not_available, context, (String) null);
                    jVar4.f11249h0.setVisibility(8);
                    arrayList3.remove(jVar4.f11249h0);
                    return;
                }
                return;
            default:
                super.onClick(view);
                ((InputMethodManager) MyApplication.f7090a.getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                j jVar5 = this.f11242b;
                String g = com.google.android.gms.internal.measurement.a.g(jVar5.f11251j0);
                boolean isBannedFromChat = o.getAccountObject().isBannedFromChat();
                Context context2 = jVar5.f11245d0;
                if (isBannedFromChat || o.getAccountObject().isBannedFromChatFromSystem()) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_message_cause_banned_from_using_it, context2, (String) null);
                    return;
                } else if (g.isEmpty()) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_empty_message, context2, (String) null);
                    return;
                } else if (jVar5.f11258q0 != jVar5.f11259r0.indexOf(jVar5.f11247f0)) {
                    j.V(jVar5, g, false);
                    return;
                } else if (d.I0()) {
                    j.V(jVar5, g, false);
                    return;
                } else if (o.getChatObject().getSpeakersNumber() < 1) {
                    jVar5.X();
                    return;
                } else {
                    j.V(jVar5, g, true);
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0959i(j jVar, View view, int i2) {
        super(view);
        this.f11241a = i2;
        this.f11242b = jVar;
    }
}
