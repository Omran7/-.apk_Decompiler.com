package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import y2.C1109A;
import y2.e;

abstract class bm extends C1109A {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ bn f6697f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f6697f = bnVar;
    }

    public final void a(Exception exc) {
        if (!(exc instanceof e)) {
            super.a(exc);
        } else if (bn.k(this.f6697f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
