package androidx.credentials.playservices;

import L1.a;
import O1.C0109y;
import R.b;
import R.c;
import R.d;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.fragment.app.D;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p001authapi.zbaw;
import com.google.android.gms.internal.p001authapi.zbbg;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.j;
import t1.C0991f;
import t1.C0995j;
import t1.C0997l;
import t1.C1003r;
import t1.C1004s;
import x1.i;

public class HiddenActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4917c = 0;

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f4918a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4919b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(f.API_PRIORITY_OTHER, bundle);
        finish();
    }

    public final void onActivityResult(int i2, int i5, Intent intent) {
        super.onActivityResult(i2, i5, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i2);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f4918a;
        if (resultReceiver != null) {
            resultReceiver.send(i5, bundle);
        }
        this.f4919b = false;
        finish();
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [t1.s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9, types: [t1.r, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [t1.s, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f4918a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f4919b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (!this.f4919b) {
            if (stringExtra != null) {
                Task task = null;
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals("BEGIN_SIGN_IN")) {
                            C0991f fVar = (C0991f) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (fVar != null) {
                                task = new zbbg((Activity) this, (C1004s) new Object()).beginSignIn(fVar).addOnSuccessListener(new b(new d(this, intExtra, 0), 3)).addOnFailureListener(new c(this, 3));
                            }
                            if (task == null) {
                                Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                            C0109y yVar = (C0109y) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (yVar != null) {
                                int i2 = a.f1705a;
                                com.google.android.gms.common.api.d dVar = e.g;
                                D d = new D(10);
                                Looper mainLooper = getMainLooper();
                                I.h(mainLooper, "Looper must not be null.");
                                k kVar = new k(d, mainLooper);
                                l lVar = new l(this, this, N1.a.f1896a, dVar, kVar);
                                C0370y a6 = C0371z.a();
                                a6.d = new i((N1.a) lVar, yVar);
                                a6.f6113b = 5407;
                                task = lVar.doRead((C0371z) a6.a()).addOnSuccessListener(new b(new d(this, intExtra2, 2), 0)).addOnFailureListener(new c(this, 0));
                            }
                            if (task == null) {
                                Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals("CREATE_PASSWORD")) {
                            C0997l lVar2 = (C0997l) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (lVar2 != null) {
                                task = new zbaw((Activity) this, (C1003r) new Object()).savePassword(lVar2).addOnSuccessListener(new b(new d(this, intExtra3, 1), 1)).addOnFailureListener(new c(this, 1));
                            }
                            if (task == null) {
                                Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals("SIGN_IN_INTENT")) {
                            C0995j jVar = (C0995j) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (jVar != null) {
                                task = new zbbg((Activity) this, (C1004s) new Object()).getSignInIntent(jVar).addOnSuccessListener(new b(new d(this, intExtra4, 3), 2)).addOnFailureListener(new c(this, 2));
                            }
                            if (task == null) {
                                Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
            Log.w("HiddenActivity", "Activity handed an unsupported type");
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        j.e(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f4919b);
        super.onSaveInstanceState(bundle);
    }
}
