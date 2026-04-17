package com.google.android.gms.auth.api.signin.internal;

import B0.C0009h;
import B0.H;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C0289v;
import androidx.lifecycle.S;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import d0.C0456a;
import d0.C0457b;
import java.lang.reflect.Modifier;
import java.util.Set;
import k.C0724m;
import n.k;
import x1.C1096b;
import x1.d;
import x1.i;
import z1.C1132b;

public class SignInHubActivity extends C0289v {

    /* renamed from: M  reason: collision with root package name */
    public static boolean f5992M = false;

    /* renamed from: H  reason: collision with root package name */
    public boolean f5993H = false;

    /* renamed from: I  reason: collision with root package name */
    public SignInConfiguration f5994I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f5995J;

    /* renamed from: K  reason: collision with root package name */
    public int f5996K;

    /* renamed from: L  reason: collision with root package name */
    public Intent f5997L;

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void n() {
        C0009h hVar = new C0009h(e(), (S) C0457b.f7500f);
        Class<C0457b> cls = C0457b.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            C0457b bVar = (C0457b) hVar.v(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
            C0724m mVar = new C0724m(this, 20);
            if (bVar.f7501e) {
                throw new IllegalStateException("Called while creating a loader");
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                k kVar = bVar.d;
                C0456a aVar = (C0456a) kVar.d(0);
                if (aVar == null) {
                    Class<d> cls2 = d.class;
                    try {
                        bVar.f7501e = true;
                        Set set = o.f6122a;
                        synchronized (set) {
                        }
                        d dVar = new d(this, set);
                        if (cls2.isMemberClass()) {
                            if (!Modifier.isStatic(cls2.getModifiers())) {
                                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + dVar);
                            }
                        }
                        C0456a aVar2 = new C0456a(dVar);
                        kVar.g(0, aVar2);
                        bVar.f7501e = false;
                        H h = new H(aVar2.f7497l, mVar);
                        aVar2.d(this, h);
                        H h6 = aVar2.f7499n;
                        if (h6 != null) {
                            aVar2.h(h6);
                        }
                        aVar2.f7498m = this;
                        aVar2.f7499n = h;
                    } catch (Throwable th) {
                        bVar.f7501e = false;
                        throw th;
                    }
                } else {
                    H h7 = new H(aVar.f7497l, mVar);
                    aVar.d(this, h7);
                    H h8 = aVar.f7499n;
                    if (h8 != null) {
                        aVar.h(h8);
                    }
                    aVar.f7498m = this;
                    aVar.f7499n = h7;
                }
                f5992M = false;
            } else {
                throw new IllegalStateException("initLoader must be called on the main thread");
            }
        } else {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
    }

    public final void o(int i2) {
        Status status = new Status(i2, (String) null, (PendingIntent) null, (C1132b) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f5992M = false;
    }

    public final void onActivityResult(int i2, int i5, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.f5993H) {
            setResult(0);
            if (i2 == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.f5988b) != null) {
                        i H6 = i.H(this);
                        GoogleSignInOptions googleSignInOptions = this.f5994I.f5991b;
                        synchronized (H6) {
                            ((C1096b) H6.f12553b).d(googleSignInAccount, googleSignInOptions);
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.f5995J = true;
                        this.f5996K = i5;
                        this.f5997L = intent;
                        n();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        o(intExtra);
                        return;
                    }
                }
                o(8);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            o(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f5994I = signInConfiguration;
            if (bundle != null) {
                boolean z3 = bundle.getBoolean("signingInGoogleApiClients");
                this.f5995J = z3;
                if (z3) {
                    this.f5996K = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.f5997L = intent2;
                    n();
                }
            } else if (f5992M) {
                setResult(0);
                o(12502);
            } else {
                f5992M = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.f5994I);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f5993H = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    o(17);
                }
            }
        } else {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f5992M = false;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5995J);
        if (this.f5995J) {
            bundle.putInt("signInResultCode", this.f5996K);
            bundle.putParcelable("signInResultData", this.f5997L);
        }
    }
}
