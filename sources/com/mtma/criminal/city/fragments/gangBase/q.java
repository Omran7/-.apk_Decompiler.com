package com.mtma.criminal.city.fragments.gangBase;

import N4.a;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.mtma.criminal.city.R;
import e5.C0509f;

public final class q extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7250a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f7251b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, View view, int i2) {
        super(view);
        this.f7250a = i2;
        this.f7251b = rVar;
    }

    public final void onClick(View view) {
        switch (this.f7250a) {
            case 0:
                super.onClick(view);
                C0269a aVar = new C0269a(this.f7251b.p());
                aVar.f(R.id.activity_main_body_frame_layout, new a("شرح الميليشيا", "نظام الميليشيات داخل العصابة\n\n1. عند انضمامك إلى ميليشيا:\n   تساهم بإضافة نقطة تقدم واحدة للميليشيا.\n   تحصل مباشرة على المكافآت التالية:\n   - نقاط ولاء شخصية لك داخل العصابة.\n   - نقاط ولاء للعصابة بشكل عام.\n   - نقاط مساهمة تدل علي مساهمتك قوة العصابة.\n   - نقاط خبرة تساعدك على رفع مستواك (اللفل).\n   - كريستال عشوائي (متوفر في بعض الميليشيات المتقدمة فقط).\n\n2. الانضمام إلى الميليشيا متاح مرة واحدة فقط حتى تكتمل بالكامل.\n\n3. عند اكتمال الميليشيا بنسبة 100% (من حيث عدد الأعضاء المشتركين):\n   تحصل العصابة على نقاط احترام، والتي تُستخدم في:\n   - تطوير نجوم العصابة.\n   - ترقية مهارات العصابة.\n\n4. بعد انتهاء ميليشيا، تبدأ واحدة جديدة يمكنك الانضمام إليها من جديد.\n\n5. كلما ارتفع مستوى العصابة (النجوم):\n   زاد عدد الميليشيات المتاحة.\n   زادت قيمة الجوائز والمكافآت.\n\nــــــــــــــــــــــــــــــــــــ\n\nأهمية الاحترام\n\n1. يمثل قوة العصابة ومكانتها بين العصابات الأخرى.\n2. يُستخدم في تطوير مستوى العصابة (نجوم العصابة).\n3. ضروري لترقية مهارات العصابة الجماعية.\n\nــــــــــــــــــــــــــــــــــــ\n\nأهمية الولاء\n\nيوجد نوعان من الولاء داخل العصابة:\n\n1. ولاء العصابة:\n   يعبر عن مدى تماسك العصابة ككل.\n   يُستخدم في إضافة مواد إلى متجر العصابة ليستفيد منها جميع الأعضاء.\n   فقط الأعضاء أصحاب المناصب (بدءًا من منصب المستشار) يمكنهم الإضافة إلى المتجر.\n\n2. الولاء الشخصي:\n   يمثل مدى ولائك الفردي داخل العصابة.\n   يُستخدم في شراء المواد من متجر العصابة.\n   يمكن لأي لاعب استخدامه في الشراء."), (String) null, 1);
                com.google.android.gms.internal.measurement.a.j(aVar, false);
                return;
            default:
                super.onClick(view);
                r rVar = this.f7251b;
                C0269a aVar2 = new C0269a(rVar.p());
                aVar2.h(rVar);
                aVar2.e(false);
                return;
        }
    }
}
