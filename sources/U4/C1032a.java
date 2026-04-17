package u4;

import N4.a;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.R;
import e5.C0509f;

/* renamed from: u4.a  reason: case insensitive filesystem */
public final class C1032a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11850a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1033b f11851b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1032a(C1033b bVar, View view, int i2) {
        super(view);
        this.f11850a = i2;
        this.f11851b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f11850a) {
            case 0:
                super.onClick(view);
                C0269a aVar = new C0269a(this.f11851b.p());
                aVar.f(R.id.activity_main_body_frame_layout, new a("معلومات عن نادي القتال", "- يمكنك مهاجمة اللاعبين داخل نادي القتال للحصول على جوائز مثل الكاش والخبرة، ولإظهار قوتك أمام الآخرين.\n\nعند فوزك بالمعركة، يتاح لك اختيار أحد الخيارات التالية:\n\n1. السرقة: تقوم بسرقة جزء من كاش خصمك الموجود خارج البنك. تزداد النسبة المسروقة كلما طورت مهارات السرقة في ملفك الشخصي.\n\n2. المغادرة: تترك خصمك بعد هزيمته وتكتفي بالحصول على الخبرة لرفع مستواك. كلما كان خصمك أقوى، حصلت على خبرة أكثر.\n\n3. الإعاقة: تُسبب ضررًا كبيرًا لخصمك يجعله يقضي وقتًا أطول في المستشفى (30 دقيقة أو أكثر). يمكنك زيادة مدة الإعاقة عبر تطوير مهارات البروفايل والدراسة في المدرسة.\n\nــــــــــــــــــــــــــــــــــــ\n\n- في مدينة العصابات:\nيعرض النادي اللاعبين الذين يقل مستواهم عنك بـ 5 مستويات أو يزيد عنه بـ 5 مستويات.\n\nــــــــــــــــــــــــــــــــــــ\n\n- في المدن الأخرى:\nيعرض النادي جميع اللاعبين المتواجدين في نفس المدينة، ويتم ترتيبهم حسب آخر ظهور.\n\nــــــــــــــــــــــــــــــــــــ\n\n- نظام الشهامة:\n\nإذا هاجمت لاعبين أضعف بكثير منك (الذين مستوى الجيم لديهم أقل من جيمك بـ 10 مرات)، فإن شهامتك ستنخفض.\n\nكلما انخفضت الشهامة، انخفضت قوتك في الهجوم على لاعبين آخرين. مثال: إذا أصبحت شهامتك 50%، فإن قوتك الهجومية تقل للنصف.\n\nتأثير الشهامة يطبق فقط عند الهجوم، ولا يؤثر عند الدفاع. أي إذا قام لاعب بمهاجمتك وأنت شهامتك منخفضة، ستدافع بكامل قوتك.\n"), (String) null, 1);
                com.google.android.gms.internal.measurement.a.j(aVar, false);
                return;
            default:
                super.onClick(view);
                C1033b bVar = this.f11851b;
                C0269a aVar2 = new C0269a(bVar.p());
                aVar2.h(bVar);
                aVar2.e(false);
                return;
        }
    }
}
