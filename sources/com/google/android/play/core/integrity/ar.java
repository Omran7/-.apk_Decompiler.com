package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class ar extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ as f6657a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.f6657a = asVar;
    }

    public final void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            this.f6657a.f6658a.trySetResult(3);
        } else if (i2 == 2) {
            this.f6657a.f6658a.trySetResult(2);
        } else if (i2 == 3) {
            this.f6657a.f6658a.trySetResult(1);
        }
    }
}
