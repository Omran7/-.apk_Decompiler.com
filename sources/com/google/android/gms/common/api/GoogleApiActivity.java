package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.internal.C0354h;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
import h0.C0552a;
import z1.C1132b;
import z1.e;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f5998b = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f5999a = 0;

    public final void onActivityResult(int i2, int i5, Intent intent) {
        super.onActivityResult(i2, i5, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5999a = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                C0354h h = C0354h.h(this);
                if (i5 == -1) {
                    zau zau = h.f6103n;
                    zau.sendMessage(zau.obtainMessage(3));
                } else if (i5 == 0) {
                    h.i(new C1132b(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f5999a = 0;
            setResult(i5, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f5999a = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5999a = bundle.getInt("resolution");
        }
        if (this.f5999a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.f5999a = 1;
                } catch (ActivityNotFoundException e6) {
                    if (extras.getBoolean("notify_manager", true)) {
                        C0354h.h(this).i(new C1132b(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String o6 = C0552a.o("Activity not found while launching ", pendingIntent.toString(), ".");
                        if (Build.FINGERPRINT.contains("generic")) {
                            o6 = o6.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", o6, e6);
                    }
                    this.f5999a = 1;
                    finish();
                } catch (IntentSender.SendIntentException e7) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e7);
                    finish();
                }
            } else {
                I.g(num);
                e.d.d(this, num.intValue(), this);
                this.f5999a = 1;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5999a);
        super.onSaveInstanceState(bundle);
    }
}
