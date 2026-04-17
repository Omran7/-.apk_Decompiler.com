package com.mtma.criminal.city.fragments.gangBase;

import com.google.android.gms.tasks.TaskCompletionSource;
import d5.C0474g;
import d5.j;
import d5.k;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import java.util.HashMap;

public final class E implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap f7124b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7125c;
    public final /* synthetic */ TaskCompletionSource d;

    public /* synthetic */ E(HashMap hashMap, String str, TaskCompletionSource taskCompletionSource, int i2) {
        this.f7123a = i2;
        this.f7124b = hashMap;
        this.f7125c = str;
        this.d = taskCompletionSource;
    }

    public final void B(C0588d dVar) {
        switch (this.f7123a) {
            case 0:
                this.d.setResult(Boolean.FALSE);
                return;
            case 1:
                this.d.setResult(Boolean.FALSE);
                return;
            case 2:
                this.d.setResult(Boolean.FALSE);
                return;
            case 3:
                this.d.setResult(Boolean.FALSE);
                return;
            case 4:
                this.d.setResult(Boolean.FALSE);
                return;
            case 5:
                this.d.setResult(Boolean.FALSE);
                return;
            default:
                this.d.setResult(Boolean.FALSE);
                return;
        }
    }

    public final void u(C0587c cVar) {
        switch (this.f7123a) {
            case 0:
                this.f7124b.put(this.f7125c, (k) cVar.f(k.class));
                this.d.setResult(Boolean.TRUE);
                return;
            case 1:
                this.f7124b.put(this.f7125c, (j) cVar.f(j.class));
                this.d.setResult(Boolean.TRUE);
                return;
            case 2:
                this.f7124b.put(this.f7125c, (C0474g) cVar.f(C0474g.class));
                this.d.setResult(Boolean.TRUE);
                return;
            case 3:
                this.f7124b.put(this.f7125c, (k) cVar.f(k.class));
                this.d.setResult(Boolean.TRUE);
                return;
            case 4:
                this.f7124b.put(this.f7125c, (C0474g) cVar.f(C0474g.class));
                this.d.setResult(Boolean.TRUE);
                return;
            case 5:
                this.f7124b.put(this.f7125c, (k) cVar.f(k.class));
                this.d.setResult(Boolean.TRUE);
                return;
            default:
                this.f7124b.put(this.f7125c, (k) cVar.f(k.class));
                this.d.setResult(Boolean.TRUE);
                return;
        }
    }
}
