package R4;

import H4.d;
import K1.e;
import N4.a;
import Y4.D;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C0269a;
import b5.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import e5.C0509f;
import java.util.ArrayList;
import java.util.Collection;

public final class b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2511a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2512b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, View view, int i2) {
        super(view);
        this.f2511a = i2;
        this.f2512b = dVar;
    }

    public final void onClick(View view) {
        switch (this.f2511a) {
            case 0:
                super.onClick(view);
                d dVar = this.f2512b;
                if (dVar.f2534j0.getVisibility() == 8) {
                    dVar.f2534j0.setVisibility(0);
                    dVar.f2534j0.setAnimation(AnimationUtils.loadAnimation(dVar.f2528d0, R.anim.from_bottom_to_position));
                    return;
                }
                dVar.f2534j0.setAnimation(AnimationUtils.loadAnimation(dVar.f2528d0, R.anim.from_position_to_bottom));
                dVar.f2534j0.setVisibility(8);
                return;
            case 1:
                super.onClick(view);
                d dVar2 = this.f2512b;
                Context context = dVar2.f2528d0;
                a aVar = new a("شرح إقفال العناصر", "1. إقفال المادة يمنع بيع العناصر المقفلة داخل اللعبة بطريقة غير مقصودة، أو إرسالها إلى لاعبين آخرين عن طريق الخطأ، أو عرضها داخل الكشك للبيع.\n\n2. يمكن استخدام العناصر المقفلة بشكل طبيعي.\n\n3. لإقفال العنصر أو فتحه، انقر عليه ثم انقر على زر \"حفظ\" لحفظ التغييرات.\n\n4. عند الحاجة إلى فك القفل عن العنصر لأي غرض، يمكنك الرجوع إلى شاشة إقفال العناصر مرة أخرى لتحديث حالة هذا العنصر.");
                C0269a aVar2 = new C0269a(dVar2.p());
                aVar2.f(R.id.activity_main_body_frame_layout, aVar, (String) null, 1);
                aVar2.c();
                aVar2.e(false);
                R2.b.N0();
                return;
            default:
                super.onClick(view);
                d dVar3 = this.f2512b;
                int visibility = dVar3.f2534j0.getVisibility();
                Context context2 = dVar3.f2528d0;
                if (visibility == 0) {
                    dVar3.f2534j0.setVisibility(8);
                    dVar3.f2534j0.setAnimation(AnimationUtils.loadAnimation(context2, R.anim.from_position_to_bottom));
                    return;
                }
                R2.b.w(true);
                dVar3.V();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = dVar3.f2543t0;
                    if (i2 < arrayList2.size()) {
                        if (((D) arrayList2.get(i2)).f4302m) {
                            arrayList.add((D) arrayList2.get(i2));
                        }
                        i2++;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        int i5 = 0;
                        boolean z3 = false;
                        while (true) {
                            int size = arrayList.size();
                            ArrayList arrayList4 = dVar3.s0;
                            if (i5 < size) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                        dVar3.f2541q0.E(e.y(((D) arrayList.get(i5)).f4294b)).E(e.x(((D) arrayList.get(i5)).f4293a, ((D) arrayList.get(i5)).f4298i)).E("locked").I(Boolean.TRUE).addOnCompleteListener(new c(taskCompletionSource, 0));
                                        arrayList3.add(taskCompletionSource.getTask());
                                        z3 = true;
                                    } else if (((D) arrayList.get(i5)).f4293a == ((n) arrayList4.get(i6)).getId() && ((D) arrayList.get(i5)).f4298i == ((n) arrayList4.get(i6)).getLevel()) {
                                        arrayList4.remove(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                i5++;
                            } else {
                                int i7 = 0;
                                while (i7 < arrayList4.size()) {
                                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                                    dVar3.f2541q0.E(e.y(((n) arrayList4.get(i7)).getType())).E(e.x(((n) arrayList4.get(i7)).getId(), ((n) arrayList4.get(i7)).getLevel())).E("locked").I(Boolean.FALSE).addOnCompleteListener(new c(taskCompletionSource2, 1));
                                    arrayList3.add(taskCompletionSource2.getTask());
                                    i7++;
                                    z3 = true;
                                }
                                if (z3) {
                                    Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList3).addOnCompleteListener(new d((Object) dVar3, 10));
                                    return;
                                }
                                R2.b.w(false);
                                v0.e(context2, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_no_change_happened));
                                C0269a aVar3 = new C0269a(dVar3.p());
                                aVar3.h(dVar3);
                                aVar3.e(false);
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
