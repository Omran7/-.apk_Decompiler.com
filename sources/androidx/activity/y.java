package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.j;
import x5.a;
import x5.l;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f4676a = new Object();

    public final OnBackInvokedCallback a(l lVar, l lVar2, a aVar, a aVar2) {
        j.e(lVar, "onBackStarted");
        j.e(lVar2, "onBackProgressed");
        j.e(aVar, "onBackInvoked");
        j.e(aVar2, "onBackCancelled");
        return new x(lVar, lVar2, aVar, aVar2);
    }
}
