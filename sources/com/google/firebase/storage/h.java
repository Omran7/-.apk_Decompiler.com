package com.google.firebase.storage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCanceledListener;

public final /* synthetic */ class h implements OnCanceledListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f6926a;

    public /* synthetic */ h(CancellationTokenSource cancellationTokenSource) {
        this.f6926a = cancellationTokenSource;
    }

    public final void onCanceled() {
        this.f6926a.cancel();
    }
}
