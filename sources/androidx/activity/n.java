package androidx.activity;

import B.m;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.M;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import m5.C0849h;
import x5.a;

public final class n extends k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f4640b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i2) {
        super(0);
        this.f4639a = i2;
        this.f4640b = oVar;
    }

    public final Object invoke() {
        Bundle bundle;
        switch (this.f4639a) {
            case 0:
                o oVar = this.f4640b;
                Application application = oVar.getApplication();
                if (oVar.getIntent() != null) {
                    bundle = oVar.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new M(application, oVar, bundle);
            case 1:
                this.f4640b.reportFullyDrawn();
                return C0849h.f10203c;
            case 2:
                o oVar2 = this.f4640b;
                return new q(oVar2.f4646f, new n(oVar2, 1));
            default:
                o oVar3 = this.f4640b;
                B b6 = new B(new d(oVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!j.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new m(oVar3, b6, 7));
                    } else {
                        oVar3.f12758a.a(new h(b6, oVar3));
                    }
                }
                return b6;
        }
    }
}
