package K4;

import B0.C0004c;
import F3.r;
import H4.d;
import H4.e;
import P4.w;
import R2.b;
import R2.i;
import S3.t;
import Z4.j;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaem;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import d5.k;
import d5.o;
import e3.C0499g;
import e3.m;
import f3.C0528e;
import f3.u;
import i3.C0592h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r4.C0951a;
import r4.C0956f;
import y2.C1113d;

public final class h implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1521a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f1522b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f1523c;

    public /* synthetic */ h(int i2) {
        this.f1521a = i2;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [e3.g, f3.t] */
    public final void onComplete(Task task) {
        int i2 = 0;
        switch (this.f1521a) {
            case 0:
                ((k) this.f1523c).f1552Z0.getMainStatesObject().setProfilePicUrl("no_profile_pic");
                ((TaskCompletionSource) this.f1522b).setResult(Boolean.TRUE);
                return;
            case 1:
                k mainStatesObject = o.getMainStatesObject();
                String str = (String) this.f1522b;
                mainStatesObject.setBio(str);
                boolean equals = str.equals("@empty_bio");
                l lVar = (l) this.f1523c;
                if (equals) {
                    ((o) ((m) lVar.f1578e).f1580b).f1585f0.setText("");
                } else {
                    ((o) ((m) lVar.f1578e).f1580b).f1585f0.setText(str);
                }
                b.w(false);
                a.l(MyApplication.f7090a, R.string.bio_updated, ((o) ((m) lVar.f1578e).f1580b).f1583d0, R.raw.add_new_item);
                return;
            case 2:
                boolean isSuccessful = task.isSuccessful();
                d dVar = (d) this.f1523c;
                if (isSuccessful) {
                    String str2 = (String) ((B4.d) dVar.f1024b).f351b;
                    m mVar = (m) this.f1522b;
                    mVar.getClass();
                    I.d(str2);
                    FirebaseAuth instance = FirebaseAuth.getInstance(i.f(((C0528e) mVar).f7922c));
                    instance.getClass();
                    I.d(str2);
                    instance.f6865e.zzc(instance.f6862a, mVar, str2, new C0499g(instance, 0)).addOnCompleteListener(new d((Object) this, 7));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.wrong_password, ((w) ((B4.d) dVar.f1024b).d).f2290d0, (String) null);
                return;
            case 3:
                o.setPlayerObject(((Z4.i) this.f1522b).userObject);
                c.s(false, new t(this, 14));
                return;
            case 4:
                if (task.isSuccessful()) {
                    C0592h.b().e().E(b.Z()).E("gangs").E("gangsData").E(((j) this.f1522b).gangObject.getId()).E("imageUrl").I(((Uri) task.getResult()).toString()).addOnSuccessListener(new e(this, 10));
                    return;
                }
                return;
            case 5:
                boolean isSuccessful2 = task.isSuccessful();
                X4.d dVar2 = (X4.d) this.f1522b;
                if (!isSuccessful2) {
                    dVar2.I(new Z4.a());
                    return;
                } else if (task.getResult() != null) {
                    Z3.d dVar3 = new Z3.d();
                    Z4.a aVar = (Z4.a) dVar3.b(Z4.a.class, dVar3.e((Map) ((r) task.getResult()).f784a));
                    if (aVar != null) {
                        dVar2.I(aVar);
                        if (aVar.isAllProcessSuccess) {
                            Q.h(132, (String) this.f1523c);
                            return;
                        }
                        return;
                    }
                    dVar2.I(new Z4.a());
                    return;
                } else {
                    dVar2.I(new Z4.a());
                    return;
                }
            case zzaky.zzf.zzf /*6*/:
                new Handler().postDelayed(new C0004c((Object) this, 24), 1000);
                return;
            case zzaky.zzf.zzg /*7*/:
                new Handler().postDelayed(new C0004c((Object) this, 25), 1000);
                return;
            case 8:
                int i5 = GenericIdpActivity.f6881J;
                Intent intent = new Intent("android.intent.action.VIEW");
                GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f1522b;
                ResolveInfo resolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
                String str3 = (String) this.f1523c;
                if (resolveActivity != null) {
                    List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent2.putExtra("com.android.browser.application_id", str3);
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                        intent2.addFlags(1073741824);
                        intent2.addFlags(268435456);
                        genericIdpActivity.startActivity(intent2);
                        return;
                    }
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    if (!intent3.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                        intent3.putExtras(bundle);
                    }
                    intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent3.putExtras(new Bundle());
                    intent3.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                    intent3.setData((Uri) task.getResult());
                    A.h.startActivity(genericIdpActivity, intent3, (Bundle) null);
                    return;
                }
                Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                zzaem.zzb(genericIdpActivity, str3);
                return;
            case 9:
                u uVar = RecaptchaActivity.f6884J;
                Intent intent4 = new Intent("android.intent.action.VIEW");
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f1522b;
                ResolveInfo resolveActivity2 = recaptchaActivity.getPackageManager().resolveActivity(intent4, 0);
                String str4 = (String) this.f1523c;
                if (resolveActivity2 != null) {
                    List<ResolveInfo> queryIntentServices2 = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices2 == null || queryIntentServices2.isEmpty()) {
                        Intent intent5 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                        intent5.putExtra("com.android.browser.application_id", str4);
                        intent5.addFlags(1073741824);
                        intent5.addFlags(268435456);
                        recaptchaActivity.startActivity(intent5);
                        return;
                    }
                    Intent intent6 = new Intent("android.intent.action.VIEW");
                    if (!intent6.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                        intent6.putExtras(bundle2);
                    }
                    intent6.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent6.putExtras(new Bundle());
                    intent6.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    intent6.addFlags(1073741824);
                    intent6.addFlags(268435456);
                    intent6.setData((Uri) task.getResult());
                    A.h.startActivity(recaptchaActivity, intent6, (Bundle) null);
                    return;
                }
                Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                zzaem.zzb(recaptchaActivity, str4);
                return;
            case 10:
                break;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                C0956f fVar = (C0956f) this.f1523c;
                fVar.X((b5.j) this.f1522b, fVar.f11227j0.size());
                fVar.f11228k0.notifyDataSetChanged();
                return;
            default:
                C1113d dVar4 = (C1113d) this.f1523c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1522b;
                synchronized (dVar4.f12696f) {
                    dVar4.f12695e.remove(taskCompletionSource);
                }
                return;
        }
        while (true) {
            ArrayList arrayList = (ArrayList) this.f1522b;
            int size = arrayList.size();
            C0951a aVar2 = (C0951a) this.f1523c;
            if (i2 < size) {
                if (((b5.j) arrayList.get(i2)).isFromSystem()) {
                    C0956f.V(aVar2.f11209a, (b5.j) arrayList.get(i2), i2);
                } else {
                    aVar2.f11209a.X((b5.j) arrayList.get(i2), i2);
                }
                i2++;
            } else {
                aVar2.f11209a.f11228k0.notifyDataSetChanged();
                aVar2.f11209a.f11225h0.setSelection(arrayList.size() - 1);
                return;
            }
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i2) {
        this.f1521a = i2;
        this.f1523c = obj;
        this.f1522b = obj2;
    }

    public h(X4.d dVar, String str) {
        this.f1521a = 5;
        this.f1522b = dVar;
        this.f1523c = str;
    }
}
