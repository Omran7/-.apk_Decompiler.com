package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafw  reason: invalid package */
final class zzafw implements OnFailureListener {
    public zzafw(zzafu zzafu) {
    }

    public final void onFailure(Exception exc) {
        zzafu.zza.c(d.i("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
