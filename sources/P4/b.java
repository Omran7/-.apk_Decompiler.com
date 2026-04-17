package P4;

import A4.h;
import A4.i;
import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0509f;

public final class b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2187a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2188b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, View view, int i2) {
        super(view);
        this.f2187a = i2;
        this.f2188b = dVar;
    }

    public final void onClick(View view) {
        d dVar = this.f2188b;
        switch (this.f2187a) {
            case 0:
                super.onClick(view);
                boolean isHasAdminRequestNotReviewed = o.getAccountObject().isHasAdminRequestNotReviewed();
                d dVar2 = this.f2188b;
                if (isHasAdminRequestNotReviewed) {
                    a.n(MyApplication.f7090a, R.string.can_not_send_admin_request_again, dVar2.f2197i0, (String) null);
                    return;
                }
                int A6 = c.A(Long.valueOf(d.x0("server_created_time")));
                int A7 = c.A(Long.valueOf(o.getAccountObject().getJoinTimeInMilli()));
                boolean isEmailVerified = o.getAccountObject().isEmailVerified();
                boolean isBannedFromSystemBefore = o.getAccountObject().isBannedFromSystemBefore();
                int level = o.getMainStatesObject().getLevel();
                o.getAccountObject().getCurrentOpenedServer();
                if (!d.G0(level, A6, A7, isEmailVerified, isBannedFromSystemBefore)) {
                    a.n(MyApplication.f7090a, R.string.not_has_admin_requirements, dVar2.f2197i0, (String) null);
                    return;
                } else if (!dVar2.f2196h0) {
                    dVar2.f2196h0 = true;
                    C0505b bVar = new C0505b(dVar2.f2197i0, R.layout.dialog_admin_request);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_admin_request_close_button);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_admin_request_edit_text);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_admin_request_send_button);
                    ((TextView) bVar.findViewById(R.id.dialog_admin_request_email)).setText(o.getAccountObject().getEmail());
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(500)});
                    relativeLayout.setOnClickListener(new i(dVar2, relativeLayout, editText, bVar, 3));
                    imageView.setOnClickListener(new h(dVar2, imageView, bVar, 4));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case 1:
                super.onClick(view);
                Context context = dVar.f2197i0;
                N4.a aVar = new N4.a("تعليمات الإشراف", "أولًا: تقييم المشرفين\n\n1. يمكنك تقييم المشرفين، وسيصل هذا التقييم إلينا ويتم مراجعته.\n\n2. تقييمك للمشرف سيساعدنا على معرفة أداء هذا المشرف.\n\n3. إذا شعرت بأن أحد المشرفين اتخذ إجراءً ضدك دون وجه حق، يمكنك إرسال ما يثبت ذلك، وسيتم اتخاذ الإجراء اللازم معه إن ثبتت صحة كلامك.\n\n4. إذا تم حظرك أو معاقبتك من قِبل مشرف، يُمنع منعًا باتًا شتمه في الشات الخاص أو العام أو وضع منحة على رأسه أو مهاجمته كنوع من الانتقام.\n\n5. إن تم حظرك لسبب غير قانوني، يمكنك مراسلة الإدارة وسيتم حل المشكلة من طرفنا.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nثانيًا: مهام المشرف:\n\n1. الحفاظ على الشات نظيفًا طوال الوقت (يشمل ذلك الشات العام والشات الفرعي كشات الطائرة وما إلى ذلك...).\n\n2. إزالة صور اللاعبين في حال احتوائها على مخالفات مثل الإساءة للاعب أو عصابة أو احتوائها على محتوى سياسي أو جنسي.\n\n3. حظر اللاعبين المخربين للشات، وفي حالة تكرار الأمر من نفس اللاعب، يجب تبليغ الإدارة.\n\n4. الحصول على أولوية في الرد من قِبل الإدارة.\n\n5. الاتصال بالإدارة للإبلاغ عن مشاكل السيرفر فور حدوثها، مع ضمان التواصل المستمر بين الإدارة والمشرفين واللاعبين.\n\n6. عدم تجاهل رسائل اللاعبين، خاصة إذا كانت تتعلق بمشكلات داخل اللعبة.\n\n7. التعاون مع اللاعبين في عمليات المقايضة (لحين تفعيل خاصية المقايضة في اللعبة).\n\nــــــــــــــــــــــــــــــــــــ\n\n\nثالثًا: قواعد الإشراف:\n\n- ستقوم الإدارة بمحاسبة المشرف في الحالات التالية:\n\n1. حظر لاعب بدون سبب منصوص عليه في قانون الشات (الاستثناءات بقرار من الإدارة فقط).\n\n2. مخالفة المشرف لقوانين الشات.\n\n3. وضع المشرف لصورة شخصية مخالفة.\n\n4. غياب المشرف عن الشات لأكثر من 3 أيام.\n\n5. وجود دليل على تجاهل المشرف للمخالفات في الشات.\n\n6. استغلال المشرف صلاحياته للنصب على اللاعبين أو لتحقيق مكاسب شخصية.\n\n7. علم المشرف بوجود مشاكل أو ثغرات في السيرفر وعدم الإبلاغ عنها.\n\n8. علم المشرف بوجود حساب تم بيعه أو شراؤه وعدم التبليغ.\n\n9. قيام المشرف بتغيير جنسه (ذكر أو أنثى) لأي سبب.\n\n10. تكرار تغيير اسم حسابه.\n\n- عند مخالفة أي من ما سبق، سيتم سحب الإشراف منه فورًا.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nرابعًا: قواعد الترشح للإشراف:\n\n- للترشح للإشراف، يجب إرسال طلب للإدارة، مع توفر الشروط التالية:\n\n1. تأكيد البريد الإلكتروني المرتبط بالحساب (سيتم التواصل عبره فقط).\n\n2. لم يتم حظر الحساب من قِبل الإدارة مسبقًا.\n\n3. الوصول إلى المستوى المناسب حسب السيرفر:\n- السيرفر (1): مستوى 80.\n\n4. أن يكون عمر الحساب على السيرفر شهرين على الأقل (يسقط هذا الشرط إذا لم يمضِ على افتتاح السيرفر 3 أشهر، ويُكتفى حينها بأن يكون عمر الحساب أكبر من نصف عمر السيرفر).\n\n5. أن يقدّم المتقدم للإشراف ما يثبت موافقة 5 لاعبين من بين أعلى 20 لاعبًا (حسب المستوى) على ترشحه، مع إرسال صور للمراسلات التي تتضمن موافقتهم وأرقام تحقيق الهوية الخاصة بهم.\n\n- بعد تقديم الطلب، ستقوم الإدارة بمراجعة الحساب لتأكد توفر الشروط (1، 2، 3، 4)، ثم سيتم التواصل عبر البريد الإلكتروني لتقديم إثبات للشرط (5).\n\n- إذا تم استيفاء جميع الشروط، وتم تقييم اللاعب بأنه مناسب، سيتم اختياره كمشرف، وسيتم إبلاغه عبر البريد الإلكتروني.\n\n- \"تنبيه هام\": يجب استيفاء جميع الشروط قبل تقديم الطلب. في حال عدم توفر أحد الشروط، سيتم استبعاد الحساب من قائمة المرشحين مستقبلًا، وقد يكون هذا الاستبعاد دائمًا.\n\nــــــــــــــــــــــــــــــــــــ\n\n\nخامسًا: الإشراف المؤقت:\n\nمهام المشرف المؤقت:\n\n1. التواجد الدائم في الشات والإجابة على أسئلة اللاعبين، خاصة الجدد.\n\n2. الإبلاغ عن أي لاعب يستخدم كلمات مسيئة (عنصرية - دينية - سياسية - ...إلخ)، وستتخذ الإدارة الإجراء المناسب.\n\n3. صلاحيات المشرف المؤقت محدودة جدًا، ولا تشمل إمكانية الحظر أو حذف الصور.\n\n4. الإشراف على عمليات المقايضة بين اللاعبين فقط (وليس عمليات الشراء).\n\n5. يحصل على أولوية في الرد عند التواصل مع الدعم الفني.\n\n6. الإبلاغ الفوري عن أي مشكلة في السيرفر.\n\n7. الإشراف المؤقت لا يعطي أولوية في الترشح للإشراف الرسمي لاحقًا، وستُطبق الشروط كاملة عند الترشح.\n\n8. الإشراف المؤقت هو وسيلة تواصل مؤقتة بين الإدارة واللاعبين، ولا يُعتبر دائمًا.\n\n9. قد يتم تعديل هذه المهام مستقبلًا حسب ما تراه الإدارة مناسبًا.\n\nملحوظة هامة: لا توجد قواعد للترشح للإشراف المؤقت، حيث يتم اختيار المشرفين المؤقتين مباشرة من قِبل الإدارة، ولن يتم النظر في أي طلب يُرسل لهذا الغرض.\n\n");
                C0269a aVar2 = new C0269a(dVar.p());
                aVar2.f(R.id.activity_main_body_frame_layout, aVar, (String) null, 1);
                aVar2.c();
                aVar2.e(false);
                R2.b.N0();
                return;
            default:
                super.onClick(view);
                C0269a aVar3 = new C0269a(dVar.p());
                aVar3.h(dVar);
                aVar3.e(false);
                return;
        }
    }
}
