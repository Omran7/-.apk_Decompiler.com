package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import y2.C1113d;
import y2.f;
import y2.l;
import y2.m;
import y2.z;

final class aj {

    /* renamed from: a  reason: collision with root package name */
    final C1113d f6642a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final z f6643b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f6644c;
    /* access modifiers changed from: private */
    public final at d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final k f6645e;

    public aj(Context context, z zVar, at atVar, k kVar) {
        this.f6644c = context.getPackageName();
        this.f6643b = zVar;
        this.d = atVar;
        this.f6645e = kVar;
        z zVar2 = f.f12703a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled && f.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                this.f6642a = new C1113d(context, zVar, "IntegrityService", ak.f6646a, ae.f6629a);
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        zVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", z.c(zVar.f12710a, "Phonesky is not installed.", objArr));
        }
        this.f6642a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l6, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f6644c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l6 != null) {
            bundle.putLong("cloud.prj", l6.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(l.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f6642a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        int i2 = bundle.getInt("dialog.intent.type");
        this.f6643b.b("requestAndShowDialog(%s, %s)", this.f6644c, Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6642a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i2), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f6642a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, (Throwable) null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
                ao aoVar = (ao) integrityTokenRequest;
            }
            this.f6643b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f6642a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, (Parcelable) null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e6) {
            return Tasks.forException(new IntegrityServiceException(-13, e6));
        }
    }
}
