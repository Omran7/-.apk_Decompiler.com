package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.I;
import q1.C0931a;

/* renamed from: com.google.android.gms.internal.auth-api.zbn  reason: invalid package */
public final class zbn {
    public static PendingIntent zba(Context context, C0931a aVar, HintRequest hintRequest, String str) {
        I.h(context, "context must not be null");
        I.h(hintRequest, "request must not be null");
        if (TextUtils.isEmpty(str)) {
            str = zbbj.zba();
        } else {
            I.g(str);
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", str);
        Parcel obtain = Parcel.obtain();
        hintRequest.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
        return PendingIntent.getActivity(context, 2000, putExtra, zbbk.zba | 134217728);
    }
}
