package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import y2.C1113d;
import y2.x;
import y2.z;

final class as extends x {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource f6658a;

    /* renamed from: b  reason: collision with root package name */
    final C1113d f6659b;

    /* renamed from: c  reason: collision with root package name */
    private final z f6660c = new z("RequestDialogCallbackImpl");
    private final String d;

    /* renamed from: e  reason: collision with root package name */
    private final k f6661e;

    /* renamed from: f  reason: collision with root package name */
    private final Activity f6662f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, C1113d dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.d = context.getPackageName();
        this.f6661e = kVar;
        this.f6658a = taskCompletionSource;
        this.f6662f = activity;
        this.f6659b = dVar;
    }

    public final void b(Bundle bundle) {
        this.f6659b.d(this.f6658a);
        this.f6660c.b("onRequestDialog(%s)", this.d);
        j a6 = this.f6661e.a(bundle);
        if (a6 != null) {
            this.f6658a.trySetException(a6);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            z zVar = this.f6660c;
            Object[] objArr = {this.d};
            zVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", z.c(zVar.f12710a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f6658a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f6662f, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f6659b.a()));
        z zVar2 = this.f6660c;
        Object[] objArr2 = new Object[0];
        zVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", z.c(zVar2.f12710a, "Starting dialog intent...", objArr2));
        }
        this.f6662f.startActivityForResult(intent, 0);
    }
}
