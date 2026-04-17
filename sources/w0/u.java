package W0;

import A.h;
import G3.c;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.Log;
import c.C0326a;
import c.C0334i;
import com.canhub.cropper.CropImageActivity;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;
import m5.C0845d;
import n5.C0877i;
import n5.C0884p;
import n5.C0886r;

public final class u extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3980b;

    public /* synthetic */ u(int i2) {
        this.f3980b = i2;
    }

    public c e0(Context context, Object obj) {
        switch (this.f3980b) {
            case 2:
                j.e((String) obj, "input");
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                j.e(strArr, "input");
                if (strArr.length == 0) {
                    return new c(C0884p.f10399a);
                }
                for (String checkSelfPermission : strArr) {
                    if (h.checkSelfPermission(context, checkSelfPermission) != 0) {
                        return null;
                    }
                }
                int z02 = C0886r.z0(strArr.length);
                if (z02 < 16) {
                    z02 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(z02);
                for (String put : strArr) {
                    linkedHashMap.put(put, Boolean.TRUE);
                }
                return new c(linkedHashMap);
            case zzaky.zzf.zzf /*6*/:
                j.e((Uri) obj, "input");
                return null;
            default:
                return super.e0(context, obj);
        }
    }

    public final Intent m(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f3980b) {
            case 0:
                v vVar = (v) obj;
                j.e(vVar, "input");
                Intent intent = new Intent(context, CropImageActivity.class);
                Bundle bundle = new Bundle(2);
                bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", (Parcelable) null);
                bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", vVar.f3981a);
                intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
                return intent;
            case 1:
                C0334i iVar = (C0334i) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = iVar.f5574b;
                if (!(intent3 == null || (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = iVar.f5573a;
                        j.e(intentSender, "intentSender");
                        iVar = new C0334i(intentSender, (Intent) null, iVar.f5575c, iVar.d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
            case 2:
                String str = (String) obj;
                j.e(str, "input");
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
                j.d(type, "Intent(Intent.ACTION_GET…          .setType(input)");
                return type;
            case 3:
                String[] strArr = (String[]) obj;
                j.e(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                j.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 4:
                Intent intent4 = (Intent) obj;
                j.e(intent4, "input");
                return intent4;
            case 5:
                C0334i iVar2 = (C0334i) obj;
                j.e(iVar2, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar2);
                j.d(putExtra2, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return putExtra2;
            default:
                Uri uri = (Uri) obj;
                j.e(uri, "input");
                Intent putExtra3 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
                j.d(putExtra3, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
                return putExtra3;
        }
    }

    public final Object p0(Intent intent, int i2) {
        boolean z3;
        boolean z4;
        switch (this.f3980b) {
            case 0:
                Parcelable parcelable = null;
                if (intent != null) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
                    if (parcelableExtra instanceof C0241m) {
                        parcelable = parcelableExtra;
                    }
                    parcelable = (C0241m) parcelable;
                }
                if (parcelable == null || i2 == 0) {
                    return C0242n.f3964r;
                }
                return parcelable;
            case 1:
                return new C0326a(intent, i2);
            case 2:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 3:
                C0884p pVar = C0884p.f10399a;
                if (i2 != -1 || intent == null) {
                    return pVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return pVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i5 : intArrayExtra) {
                    if (i5 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList.add(Boolean.valueOf(z3));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Iterator it3 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(C0877i.T0(arrayList2), C0877i.T0(arrayList)));
                while (it2.hasNext() && it3.hasNext()) {
                    arrayList3.add(new C0845d(it2.next(), it3.next()));
                }
                return C0886r.C0(arrayList3);
            case 4:
                return new C0326a(intent, i2);
            case 5:
                return new C0326a(intent, i2);
            default:
                if (i2 == -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
        }
    }
}
