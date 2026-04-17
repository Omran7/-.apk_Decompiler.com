package q4;

import N4.a;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.R;
import e5.C0509f;

public final class d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f11108b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, View view, int i2) {
        super(view);
        this.f11107a = i2;
        this.f11108b = eVar;
    }

    public final void onClick(View view) {
        switch (this.f11107a) {
            case 0:
                super.onClick(view);
                C0269a aVar = new C0269a(this.f11108b.p());
                aVar.f(R.id.activity_main_body_frame_layout, new a("شرح عملية الشراء داخل اللعبة", "يمكنك شراء الذهب أو الكاش داخل اللعبة بسهولة لتحسين تجربتك.\nإليك خطوات الشراء بالتفصيل:\n\n1. اختيار العنصر:\n- من داخل اللعبة، انتقل إلى قسم الشراء.\n- اختر ما إذا كنت ترغب بشراء الذهب أو الكاش.\n- حدد الكمية المطلوبة، ثم اضغط على زر \"شراء\".\n\n2. إتمام عملية الشراء:\n- سيتم توجيهك إلى متجر Google Play.\n- أكمل الدفع باستخدام إحدى طرق الدفع المتوفرة في حسابك.\n- بعد نجاح الدفع، ستتم إضافة الذهب أو الكاش إلى حسابك فورًا.\n\n3. في حال الشراء المعلق:\n- أحيانًا قد تكون عملية الشراء \"معلقة\" بسبب تأخير في معالجة الدفع.\n- إذا غادرت اللعبة أو انقطع الاتصال أثناء الشراء، لا تقلق.\n- عند عودتك إلى صفحة الشحن، سيتم التحقق تلقائيًا من حالة الشراء.\n- إذا كانت العملية لا تزال معلقة، فستُستكمل فورًا وسيُضاف الرصيد لحسابك.\n\n4. التأكد من نجاح الشراء:\n- عند إتمام العملية بنجاح، سيظهر الذهب أو الكاش مباشرة في حسابك.\n- سيصلك إشعار داخل اللعبة يؤكد نجاح الشحن ويعرض تفاصيل الرصيد المضاف.\n- في حال تأخر الرصيد أو حدوث أي مشكلة:\n   * راسل الدعم الفني عبر البريد الإلكتروني.\n   * استخدم عنوان الرسالة: \"Purchase\".\n   * أرفق صورة من إيصال الدفع من Google Play.\n- البريد الإلكتروني للدعم الفني: support@criminalcitygame.com\n\nملاحظات هامة:\n- تأكد من وجود اتصال جيد بالإنترنت قبل بدء عملية الشراء.\n- إذا واجهت أي مشاكل، يمكنك مراجعة إعدادات Google Play أو التواصل معنا عبر الدعم الفني.\n"), (String) null, 1);
                com.google.android.gms.internal.measurement.a.j(aVar, false);
                return;
            default:
                super.onClick(view);
                e eVar = this.f11108b;
                C0269a aVar2 = new C0269a(eVar.p());
                aVar2.h(eVar);
                aVar2.e(false);
                return;
        }
    }
}
