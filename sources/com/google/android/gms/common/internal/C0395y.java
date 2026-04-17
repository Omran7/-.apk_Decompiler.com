package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C0359m;

/* renamed from: com.google.android.gms.common.internal.y  reason: case insensitive filesystem */
public final class C0395y implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6227a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f6228b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6229c;

    public /* synthetic */ C0395y(Intent intent, Object obj, int i2) {
        this.f6227a = i2;
        this.f6228b = intent;
        this.f6229c = obj;
    }

    public final void a() {
        switch (this.f6227a) {
            case 0:
                Intent intent = this.f6228b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f6229c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f6228b;
                if (intent2 != null) {
                    ((C0359m) this.f6229c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException e6) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e6);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
