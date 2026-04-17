package j4;

import E4.e;
import I1.b;
import P4.i;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0509f;
import f.C0518i;
import m4.C0841c;
import o3.d;
import p4.C0918a;
import p4.C0919b;
import s4.C0973b;
import s4.C0974c;
import t4.C1009a;
import v4.C1052a;
import x4.C1102e;

/* renamed from: j4.w  reason: case insensitive filesystem */
public final class C0646w extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9117a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9118b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0646w(Object obj, View view, int i2) {
        super(view);
        this.f9117a = i2;
        this.f9118b = obj;
    }

    public final void onClick(View view) {
        int i2;
        switch (this.f9117a) {
            case 0:
                View view2 = view;
                super.onClick(view);
                D d = (D) this.f9118b;
                int i5 = 1;
                if (d.d < 1) {
                    int i6 = d.f8857b;
                    switch (i6) {
                        case 0:
                        case 1:
                            i2 = 0;
                            break;
                        case 2:
                        case 3:
                        case 4:
                            i2 = 1;
                            break;
                        case 5:
                        case zzaky.zzf.zzf:
                            i2 = 3;
                            break;
                        case zzaky.zzf.zzg:
                        case 8:
                            i2 = 4;
                            break;
                        case 9:
                            i2 = 2;
                            break;
                        case 10:
                        case ModuleDescriptor.MODULE_VERSION:
                            i2 = 7;
                            break;
                        case 12:
                            i2 = 9;
                            break;
                        case 13:
                        case 14:
                            i2 = 5;
                            break;
                        case 15:
                            i2 = 8;
                            break;
                        case 16:
                            i2 = 10;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    int currentCity = o.getLocationObject().getCurrentCity();
                    Context context = d.f8856a;
                    if (i2 == currentCity) {
                        C0918a aVar = new C0918a(2, 2, context);
                        I l6 = ((C0518i) context).l();
                        C0269a b6 = d.b(l6, l6);
                        b6.f(R.id.activity_main_body_frame_layout, aVar, (String) null, 1);
                        a.j(b6, false);
                        return;
                    }
                    Context applicationContext = MyApplication.f7090a.getApplicationContext();
                    Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                    switch (i6) {
                        case 0:
                        case 1:
                            i5 = 0;
                            break;
                        case 2:
                        case 3:
                        case 4:
                            break;
                        case 5:
                        case zzaky.zzf.zzf:
                            i5 = 3;
                            break;
                        case zzaky.zzf.zzg:
                        case 8:
                            i5 = 4;
                            break;
                        case 9:
                            i5 = 2;
                            break;
                        case 10:
                        case ModuleDescriptor.MODULE_VERSION:
                            i5 = 7;
                            break;
                        case 12:
                            i5 = 9;
                            break;
                        case 13:
                        case 14:
                            i5 = 5;
                            break;
                        case 15:
                            i5 = 8;
                            break;
                        case 16:
                            i5 = 10;
                            break;
                        default:
                            i5 = -1;
                            break;
                    }
                    c.s0(context, applicationContext.getString(R.string.city_to_get_crime_tool, new Object[]{applicationContext2.getString(b.D(i5))}), (String) null);
                    return;
                }
                return;
            case 1:
                super.onClick(view);
                v0.c(((C0614b) this.f9118b).f8975b, view, MyApplication.f7090a.getApplicationContext().getString(R.string.happiness));
                return;
            case 2:
                super.onClick(view);
                N4.a aVar2 = (N4.a) this.f9118b;
                C0269a aVar3 = new C0269a(aVar2.p());
                aVar3.h(aVar2);
                aVar3.e(false);
                return;
            case 3:
                super.onClick(view);
                i iVar = (i) this.f9118b;
                C0269a aVar4 = new C0269a(iVar.p());
                aVar4.h(iVar);
                aVar4.e(false);
                return;
            case 4:
                super.onClick(view);
                C0841c cVar = (C0841c) this.f9118b;
                C0269a aVar5 = new C0269a(cVar.p());
                aVar5.h(cVar);
                aVar5.e(false);
                return;
            case 5:
                super.onClick(view);
                C0918a aVar6 = (C0918a) this.f9118b;
                C0269a aVar7 = new C0269a(aVar6.p());
                aVar7.h(aVar6);
                aVar7.e(false);
                return;
            case zzaky.zzf.zzf:
                super.onClick(view);
                C0918a aVar8 = (C0918a) this.f9118b;
                C0269a aVar9 = new C0269a(aVar8.p());
                aVar9.h(aVar8);
                aVar9.e(false);
                return;
            case zzaky.zzf.zzg:
                super.onClick(view);
                C0919b bVar = (C0919b) this.f9118b;
                C0269a aVar10 = new C0269a(bVar.p());
                aVar10.h(bVar);
                aVar10.e(false);
                return;
            case 8:
                super.onClick(view);
                C0973b bVar2 = (C0973b) this.f9118b;
                C0269a aVar11 = new C0269a(bVar2.p());
                aVar11.h(bVar2);
                aVar11.e(false);
                return;
            case 9:
                super.onClick(view);
                C0974c cVar2 = (C0974c) this.f9118b;
                C0269a aVar12 = new C0269a(cVar2.p());
                aVar12.h(cVar2);
                aVar12.e(false);
                return;
            case 10:
                super.onClick(view);
                J4.a aVar13 = (J4.a) this.f9118b;
                C0269a aVar14 = new C0269a(aVar13.p());
                aVar14.h(aVar13);
                aVar14.e(false);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                super.onClick(view);
                C0919b bVar3 = (C0919b) this.f9118b;
                C0269a aVar15 = new C0269a(bVar3.p());
                aVar15.h(bVar3);
                aVar15.e(false);
                return;
            case 12:
                super.onClick(view);
                i iVar2 = (i) this.f9118b;
                C0269a aVar16 = new C0269a(iVar2.p());
                aVar16.h(iVar2);
                aVar16.e(false);
                return;
            case 13:
                super.onClick(view);
                C1009a aVar17 = (C1009a) this.f9118b;
                C0269a aVar18 = new C0269a(aVar17.p());
                aVar18.h(aVar17);
                aVar18.e(false);
                return;
            case 14:
                super.onClick(view);
                e eVar = (e) this.f9118b;
                C0269a aVar19 = new C0269a(eVar.p());
                aVar19.h(eVar);
                aVar19.e(false);
                return;
            case 15:
                super.onClick(view);
                C0918a aVar20 = (C0918a) this.f9118b;
                C0269a aVar21 = new C0269a(aVar20.p());
                aVar21.h(aVar20);
                aVar21.e(false);
                return;
            case 16:
                super.onClick(view);
                C1052a aVar22 = (C1052a) this.f9118b;
                C0269a aVar23 = new C0269a(aVar22.p());
                aVar23.h(aVar22);
                aVar23.e(false);
                return;
            case 17:
                super.onClick(view);
                C1102e eVar2 = (C1102e) this.f9118b;
                C0269a aVar24 = new C0269a(eVar2.p());
                aVar24.h(eVar2);
                aVar24.e(false);
                return;
            case 18:
                super.onClick(view);
                C0918a aVar25 = (C0918a) this.f9118b;
                C0269a aVar26 = new C0269a(aVar25.p());
                aVar26.h(aVar25);
                aVar26.e(false);
                return;
            default:
                super.onClick(view);
                C0919b bVar4 = (C0919b) this.f9118b;
                C0269a aVar27 = new C0269a(bVar4.p());
                aVar27.h(bVar4);
                aVar27.e(false);
                return;
        }
    }
}
