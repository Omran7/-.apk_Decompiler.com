package U0;

import B0.H;
import K1.e;
import Y4.C;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.Q;
import d5.k;
import d5.o;
import d5.q;
import d5.r;
import f.C0518i;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.n;
import i3.p;
import j4.C0614b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l4.i;

public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3673a;

    /* renamed from: b  reason: collision with root package name */
    public int f3674b;

    /* renamed from: c  reason: collision with root package name */
    public int f3675c;
    public final Object d;

    public /* synthetic */ b(int i2, int i5, Object obj, int i6) {
        this.f3673a = i6;
        this.f3674b = i2;
        this.f3675c = i5;
        this.d = obj;
    }

    public void a(boolean z3, r rVar) {
        C0614b bVar = (C0614b) this.d;
        int i2 = this.f3674b;
        if (z3) {
            R2.b.w(false);
            R2.b.M0(R.raw.add_new_item);
        } else if (e.q() < o.getSkillsObject().getMeritSkillLevel(i2) + 1) {
            R2.b.w(false);
            a.n(MyApplication.f7090a, R.string.toast_not_enough_merits, bVar.f8975b, (String) null);
        } else if (o.getSkillsObject().getMeritSkillLevel(i2) == 10) {
            R2.b.w(false);
            a.n(MyApplication.f7090a, R.string.toast_reach_to_maximum_level, bVar.f8975b, (String) null);
        } else {
            R2.b.w(false);
            c.s0(bVar.f8975b, (String) null, (String) null);
        }
        if (rVar != null) {
            int i5 = this.f3675c;
            if (((C) bVar.getItem(i5)).f4288e != o.getSkillsObject().getMeritSkillLevel(i2)) {
                ((C) bVar.getItem(i5)).f4288e = o.getSkillsObject().getMeritSkillLevel(i2);
                bVar.notifyDataSetChanged();
                if (i2 == 0) {
                    o.getStockObject().setBagFreeSpace(o.getStockObject().getBagFreeSpace() + 1);
                }
                if (i2 == 21) {
                    c.d(c.f5744o);
                }
                Context context = bVar.f8975b;
                if (i2 == 12 || i2 == 13 || i2 == 14 || i2 == 2) {
                    Iterator it2 = ((C0518i) context).l().f5000c.v().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C0286s sVar = (C0286s) it2.next();
                        if (sVar instanceof i) {
                            ((i) sVar).d0();
                            break;
                        }
                    }
                    if (i2 == 12) {
                        d.h1(0);
                    }
                    if (i2 == 13) {
                        d.h1(1);
                    }
                    if (i2 == 14 || i2 == 2) {
                        d.h1(3);
                    }
                }
                for (C0286s sVar2 : ((C0518i) context).l().f5000c.v()) {
                    if (sVar2 instanceof K4.o) {
                        K4.o oVar = (K4.o) sVar2;
                        oVar.b0();
                        oVar.a0();
                        return;
                    }
                }
            }
        }
    }

    public synchronized int b() {
        PackageInfo packageInfo;
        if (this.f3674b == 0) {
            try {
                packageInfo = I1.c.a((Context) this.d).i(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e6) {
                Log.w("Metadata", "Failed to find package ".concat(e6.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f3674b = packageInfo.versionCode;
            }
        }
        return this.f3674b;
    }

    public synchronized int c() {
        int i2 = this.f3675c;
        if (i2 != 0) {
            return i2;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (I1.c.a(context).f494b.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i5 = 1;
        if (!G1.c.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f3675c = i5;
                return i5;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true == G1.c.d()) {
                i5 = 2;
            }
            this.f3675c = i5;
            return i5;
        }
        i5 = 2;
        this.f3675c = i5;
        return i5;
    }

    public H f(C0595k kVar) {
        switch (this.f3673a) {
            case 1:
                k kVar2 = (k) kVar.c(k.class);
                if (kVar2 == null) {
                    return R2.b.W0(kVar);
                }
                int i2 = this.f3675c;
                int i5 = this.f3674b;
                if (i5 == 0) {
                    if ((i2 > 0 && kVar2.getPowerCurrent() + i2 > 5000) || kVar2.getPowerCurrent() + i2 < 0) {
                        return R2.b.a();
                    }
                    kVar2.setPowerCurrent(kVar2.getPowerCurrent() + i2);
                    kVar2.setPowerChangeTimeInMilli(n.f8294a);
                } else if (i5 == 1) {
                    if (kVar2.getCourageCurrent() + i2 < 0) {
                        return R2.b.a();
                    }
                    kVar2.setCourageCurrent(kVar2.getCourageCurrent() + i2);
                    kVar2.setCourageChangeTimeInMilli(n.f8294a);
                } else if (i5 == 2) {
                    if (kVar2.getNobilityCurrent() + i2 > 100) {
                        kVar2.setNobilityCurrent(100);
                    } else if (kVar2.getNobilityCurrent() + i2 < 0) {
                        kVar2.setNobilityCurrent(0);
                    } else {
                        kVar2.setNobilityCurrent(kVar2.getNobilityCurrent() + i2);
                    }
                    kVar2.setNobilityChangeTimeInMilli(n.f8294a);
                } else if (i5 == 3) {
                    long j6 = (long) i2;
                    if (kVar2.getHealthCurrent() + j6 < 0) {
                        kVar2.setHealthCurrent(0);
                    } else {
                        kVar2.setHealthCurrent(kVar2.getHealthCurrent() + j6);
                    }
                    kVar2.setHealthChangeTimeInMilli(n.f8294a);
                }
                kVar.d(kVar2);
                return R2.b.W0(kVar);
            default:
                if (kVar.b() == null) {
                    return R2.b.W0(kVar);
                }
                q qVar = (q) kVar.c(q.class);
                for (int i6 = 0; i6 < qVar.getLawLessons().size(); i6++) {
                    if (qVar.getLawLessons().get(i6).intValue() == 1) {
                        qVar.getLawLessons().set(i6, 0);
                    }
                }
                for (int i7 = 0; i7 < qVar.getMilitaryLessons().size(); i7++) {
                    if (qVar.getMilitaryLessons().get(i7).intValue() == 1) {
                        qVar.getMilitaryLessons().set(i7, 0);
                    }
                }
                for (int i8 = 0; i8 < qVar.getHistoryLessons().size(); i8++) {
                    if (qVar.getHistoryLessons().get(i8).intValue() == 1) {
                        qVar.getHistoryLessons().set(i8, 0);
                    }
                }
                for (int i9 = 0; i9 < qVar.getScienceLessons().size(); i9++) {
                    if (qVar.getScienceLessons().get(i9).intValue() == 1) {
                        qVar.getScienceLessons().set(i9, 0);
                    }
                }
                for (int i10 = 0; i10 < qVar.getGymLessons().size(); i10++) {
                    if (qVar.getGymLessons().get(i10).intValue() == 1) {
                        qVar.getGymLessons().set(i10, 0);
                    }
                }
                int i11 = this.f3675c;
                int i12 = this.f3674b;
                if (i12 == 0) {
                    qVar.getLawLessons().set(i11, 1);
                } else if (i12 == 1) {
                    qVar.getMilitaryLessons().set(i11, 1);
                } else if (i12 == 2) {
                    qVar.getHistoryLessons().set(i11, 1);
                } else if (i12 == 3) {
                    qVar.getScienceLessons().set(i11, 1);
                } else if (i12 == 4) {
                    qVar.getGymLessons().set(i11, 1);
                }
                qVar.setStudying(true);
                qVar.setStartStudyingTimeInMilli(n.f8294a);
                kVar.d(qVar);
                return R2.b.W0(kVar);
        }
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        switch (this.f3673a) {
            case 1:
                k kVar = (k) cVar.f(k.class);
                J j6 = (J) this.d;
                if (dVar == null && z3 && cVar.b()) {
                    o.setMainStatesObject(kVar);
                    if (j6 != null) {
                        j6.h(true, kVar);
                    }
                    if (this.f3674b == 2 && kVar.getNobilityCurrent() == 0) {
                        Q.b(129, o.getAccountObject().getId(), (long) 1);
                        return;
                    }
                    return;
                } else if (j6 != null) {
                    j6.h(false, kVar);
                    return;
                } else {
                    return;
                }
            default:
                o.setSchoolObject((q) cVar.f(q.class));
                I i2 = (I) this.d;
                if (dVar != null || !cVar.b() || !z3) {
                    i2.c(false);
                    return;
                } else {
                    i2.c(true);
                    return;
                }
        }
    }

    public b(Context context) {
        this.f3673a = 5;
        this.f3675c = 0;
        this.d = context;
    }

    public /* synthetic */ b(Object obj, int i2, int i5, int i6) {
        this.f3673a = i6;
        this.d = obj;
        this.f3674b = i2;
        this.f3675c = i5;
    }

    public b(Context context, XmlResourceParser xmlResourceParser) {
        this.f3673a = 4;
        this.d = new ArrayList();
        this.f3675c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.q.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f3674b = obtainStyledAttributes.getResourceId(index, this.f3674b);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3675c);
                this.f3675c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new v.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
