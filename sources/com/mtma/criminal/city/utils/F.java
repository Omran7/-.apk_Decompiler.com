package com.mtma.criminal.city.utils;

import F3.r;
import Z3.d;
import a5.C0264a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;

public final /* synthetic */ class F implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7351a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f7352b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7353c;

    public /* synthetic */ F(H h, String str, int i2) {
        this.f7351a = i2;
        this.f7352b = h;
        this.f7353c = str;
    }

    public final void onComplete(Task task) {
        switch (this.f7351a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                H h = this.f7352b;
                if (!isSuccessful) {
                    h.a(new C0264a());
                    return;
                } else if (task.getResult() != null) {
                    d dVar = new d();
                    C0264a aVar = (C0264a) dVar.b(C0264a.class, dVar.e((Map) ((r) task.getResult()).f784a));
                    if (aVar != null) {
                        h.a(aVar);
                        if (aVar.isAllProcessSuccess) {
                            Q.b(30, this.f7353c, (long) 1);
                            return;
                        }
                        return;
                    }
                    h.a(new C0264a());
                    return;
                } else {
                    h.a(new C0264a());
                    return;
                }
            default:
                boolean isSuccessful2 = task.isSuccessful();
                H h6 = this.f7352b;
                if (isSuccessful2) {
                    if (task.getResult() != null) {
                        d dVar2 = new d();
                        C0264a aVar2 = (C0264a) dVar2.b(C0264a.class, dVar2.e((Map) ((r) task.getResult()).f784a));
                        if (aVar2 != null) {
                            if (h6 != null) {
                                h6.a(aVar2);
                            }
                            if (aVar2.isAllProcessSuccess) {
                                Q.b(33, this.f7353c, (long) 1);
                                return;
                            }
                            return;
                        } else if (h6 != null) {
                            h6.a(new C0264a());
                            return;
                        } else {
                            return;
                        }
                    } else if (h6 != null) {
                        h6.a(new C0264a());
                        return;
                    } else {
                        return;
                    }
                } else if (h6 != null) {
                    h6.a(new C0264a());
                    return;
                } else {
                    return;
                }
        }
    }
}
