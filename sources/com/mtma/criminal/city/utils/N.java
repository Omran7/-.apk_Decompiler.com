package com.mtma.criminal.city.utils;

import com.bumptech.glide.c;
import h0.C0552a;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import java.util.ArrayList;
import w0.C1056c;

public final class N implements q {

    /* renamed from: a  reason: collision with root package name */
    public int f7367a;

    /* renamed from: b  reason: collision with root package name */
    public String f7368b;

    /* JADX WARNING: type inference failed for: r0v0, types: [w0.c, java.lang.Object] */
    public C1056c a() {
        ? obj = new Object();
        obj.f12358a = this.f7367a;
        obj.f12359b = this.f7368b;
        return obj;
    }

    public void u(C0587c cVar) {
        if (cVar.b()) {
            long j6 = c.f5744o * 1000;
            try {
                j6 = ((Long) cVar.a("updatedTimeInMilli").f(Long.class)).longValue();
            } catch (Exception e6) {
                ArrayList arrayList = Q.f7375a;
                C0552a.x(e6, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "Q");
            }
            long A6 = (long) c.A(Long.valueOf(j6));
            Q.a(this.f7367a, this.f7368b, A6);
        }
    }

    public void B(C0588d dVar) {
    }
}
