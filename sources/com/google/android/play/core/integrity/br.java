package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a  reason: collision with root package name */
    private final String f6707a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6708b;

    public br(String str, y yVar) {
        this.f6707a = str;
        this.f6708b = yVar;
    }

    public final Task<Integer> showDialog(Activity activity, int i2) {
        return this.f6708b.a(activity, i2);
    }

    public final String token() {
        return this.f6707a;
    }
}
