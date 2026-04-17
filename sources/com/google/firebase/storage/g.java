package com.google.firebase.storage;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class g implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6924a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f6925b;

    public /* synthetic */ g(k kVar, int i2) {
        this.f6924a = i2;
        this.f6925b = kVar;
    }

    public final void b(Object obj, p pVar) {
        switch (this.f6924a) {
            case 0:
                k kVar = this.f6925b;
                kVar.getClass();
                l.f6940c.a(kVar);
                ((OnSuccessListener) obj).onSuccess(pVar);
                return;
            case 1:
                k kVar2 = this.f6925b;
                kVar2.getClass();
                l.f6940c.a(kVar2);
                ((OnFailureListener) obj).onFailure(pVar.f6951a);
                return;
            case 2:
                k kVar3 = this.f6925b;
                kVar3.getClass();
                l.f6940c.a(kVar3);
                ((OnCompleteListener) obj).onComplete(kVar3);
                return;
            default:
                k kVar4 = this.f6925b;
                kVar4.getClass();
                l.f6940c.a(kVar4);
                ((OnCanceledListener) obj).onCanceled();
                return;
        }
    }
}
