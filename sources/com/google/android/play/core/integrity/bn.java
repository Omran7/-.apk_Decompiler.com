package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import y2.C1113d;
import y2.l;
import y2.m;
import y2.z;

final class bn {

    /* renamed from: a  reason: collision with root package name */
    final C1113d f6698a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final z f6699b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f6700c;
    /* access modifiers changed from: private */
    public final TaskCompletionSource d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final at f6701e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final k f6702f;

    public bn(Context context, z zVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d = taskCompletionSource;
        this.f6700c = context.getPackageName();
        this.f6699b = zVar;
        this.f6701e = atVar;
        this.f6702f = kVar;
        C1113d dVar = new C1113d(context, zVar, "ExpressIntegrityService", bo.f6703a, bd.f6677a);
        this.f6698a = dVar;
        dVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j6, long j7, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f6700c);
        bundle.putLong("cloud.prj", j6);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j7);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(l.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j6, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f6700c);
        bundle.putLong("cloud.prj", j6);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(l.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        if (!bnVar.d.getTask().isSuccessful() || ((Integer) bnVar.d.getTask().getResult()).intValue() != 0) {
            return false;
        }
        return true;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i2 = bundle.getInt("dialog.intent.type");
        this.f6699b.b("requestAndShowDialog(%s)", Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6698a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i2), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j6, long j7, int i2) {
        this.f6699b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6698a.c(new bg(this, taskCompletionSource, 0, str, j6, j7, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j6, int i2) {
        this.f6699b.b("warmUpIntegrityToken(%s)", Long.valueOf(j6));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6698a.c(new bf(this, taskCompletionSource, 0, j6, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
