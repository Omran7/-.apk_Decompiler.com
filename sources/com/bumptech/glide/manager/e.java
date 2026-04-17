package com.bumptech.glide.manager;

import android.view.View;
import androidx.fragment.app.C0289v;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Set f5831a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f5832b;

    public final void c(C0289v vVar) {
        if (!this.f5832b && this.f5831a.add(vVar)) {
            View decorView = vVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new d(this, decorView));
        }
    }
}
