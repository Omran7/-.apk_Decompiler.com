package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

final class aq extends IntegrityTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f6655a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6656b;

    public aq(String str, y yVar) {
        this.f6655a = str;
        this.f6656b = yVar;
    }

    public final Task<Integer> showDialog(Activity activity, int i2) {
        return this.f6656b.a(activity, i2);
    }

    public final String token() {
        return this.f6655a;
    }
}
