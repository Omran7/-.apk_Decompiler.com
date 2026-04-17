package androidx.activity;

import G3.c;
import K1.e;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0303n;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import c.C0326a;
import c.C0327b;
import c.C0329d;
import c.C0330e;
import c.C0331f;
import c.C0333h;
import c.C0334i;
import h0.C0552a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import z.C1121a;
import z.C1122b;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f4634a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f4635b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f4636c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final transient LinkedHashMap f4637e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f4638f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ o h;

    public m(o oVar) {
        this.h = oVar;
    }

    public final boolean a(int i2, int i5, Intent intent) {
        C0327b bVar;
        String str = (String) this.f4634a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        C0330e eVar = (C0330e) this.f4637e.get(str);
        if (eVar != null) {
            bVar = eVar.f5565a;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                eVar.f5565a.e(eVar.f5566b.p0(intent, i5));
                arrayList.remove(str);
                return true;
            }
        }
        this.f4638f.remove(str);
        this.g.putParcelable(str, new C0326a(intent, i5));
        return true;
    }

    public final void b(int i2, a aVar, Object obj) {
        Bundle bundle;
        String[] strArr;
        o oVar = this.h;
        c e02 = aVar.e0(oVar, obj);
        if (e02 != null) {
            new Handler(Looper.getMainLooper()).post(new l(this, i2, e02, 0));
            return;
        }
        Intent m6 = aVar.m(oVar, obj);
        if (m6.getExtras() != null) {
            Bundle extras = m6.getExtras();
            j.b(extras);
            if (extras.getClassLoader() == null) {
                m6.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (m6.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = m6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            m6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(m6.getAction())) {
            String[] stringArrayExtra = m6.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            int i5 = 0;
            while (i5 < stringArrayExtra.length) {
                if (!TextUtils.isEmpty(stringArrayExtra[i5])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i5], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i5));
                    }
                    i5++;
                } else {
                    throw new IllegalArgumentException(C0552a.r(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[(stringArrayExtra.length - size)];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < stringArrayExtra.length; i7++) {
                        if (!hashSet.contains(Integer.valueOf(i7))) {
                            strArr[i6] = stringArrayExtra[i7];
                            i6++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (oVar instanceof C1122b) {
                C1122b bVar = (C1122b) oVar;
            }
            C1121a.b(oVar, stringArrayExtra, i2);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(m6.getAction())) {
            C0334i iVar = (C0334i) m6.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                j.b(iVar);
                oVar.startIntentSenderForResult(iVar.f5573a, i2, iVar.f5574b, iVar.f5575c, iVar.d, 0, bundle);
            } catch (IntentSender.SendIntentException e6) {
                new Handler(Looper.getMainLooper()).post(new l(this, i2, e6, 1));
            }
        } else {
            oVar.startActivityForResult(m6, i2, bundle);
        }
    }

    public final C0333h c(String str, a aVar, C0327b bVar) {
        j.e(str, "key");
        e(str);
        this.f4637e.put(str, new C0330e(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f4638f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            bVar.e(obj);
        }
        Bundle bundle = this.g;
        C0326a aVar2 = (C0326a) e.G(bundle, str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.e(aVar.p0(aVar2.f5561b, aVar2.f5560a));
        }
        return new C0333h(this, str, aVar, 1);
    }

    public final C0333h d(String str, C0307s sVar, a aVar, C0327b bVar) {
        j.e(str, "key");
        C0309u h6 = sVar.h();
        if (h6.f5278c.compareTo(C0303n.d) < 0) {
            e(str);
            LinkedHashMap linkedHashMap = this.f4636c;
            C0331f fVar = (C0331f) linkedHashMap.get(str);
            if (fVar == null) {
                fVar = new C0331f(h6);
            }
            C0329d dVar = new C0329d(this, str, bVar, aVar);
            fVar.f5567a.a(dVar);
            fVar.f5568b.add(dVar);
            linkedHashMap.put(str, fVar);
            return new C0333h(this, str, aVar, 0);
        }
        throw new IllegalStateException(("LifecycleOwner " + sVar + " is attempting to register while current state is " + h6.f5278c + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f4635b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it2 = new E5.a(new E5.c(new k(1), 0)).iterator();
            while (it2.hasNext()) {
                Number number = (Number) it2.next();
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f4634a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(intValue2));
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final void f(String str) {
        Integer num;
        j.e(str, "key");
        if (!this.d.contains(str) && (num = (Integer) this.f4635b.remove(str)) != null) {
            this.f4634a.remove(num);
        }
        this.f4637e.remove(str);
        LinkedHashMap linkedHashMap = this.f4638f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder t6 = C0552a.t("Dropping pending result for request ", str, ": ");
            t6.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", t6.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0326a) e.G(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f4636c;
        C0331f fVar = (C0331f) linkedHashMap2.get(str);
        if (fVar != null) {
            ArrayList arrayList = fVar.f5568b;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                fVar.f5567a.f((C0306q) it2.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
