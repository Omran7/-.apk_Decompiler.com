package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.C0377f;
import com.google.android.gms.common.internal.C0381j;
import com.google.android.gms.common.internal.C0389s;
import com.google.android.gms.common.internal.C0390t;
import com.google.android.gms.common.internal.C0391u;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import z1.C1132b;

public final class N implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0354h f6047a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6048b;

    /* renamed from: c  reason: collision with root package name */
    public final C0347a f6049c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6050e;

    public N(C0354h hVar, int i2, C0347a aVar, long j6, long j7) {
        this.f6047a = hVar;
        this.f6048b = i2;
        this.f6049c = aVar;
        this.d = j6;
        this.f6050e = j7;
    }

    public static C0381j a(H h, C0377f fVar, int i2) {
        C0381j telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f6179b) {
            int i5 = 0;
            int[] iArr = telemetryConfiguration.d;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f6182f;
                if (iArr2 != null) {
                    while (i5 < iArr2.length) {
                        if (iArr2[i5] != i2) {
                            i5++;
                        }
                    }
                }
            } else {
                while (i5 < iArr.length) {
                    if (iArr[i5] != i2) {
                        i5++;
                    }
                }
            }
            if (h.f6037m < telemetryConfiguration.f6181e) {
                return telemetryConfiguration;
            }
            return null;
        }
        return null;
    }

    public final void onComplete(Task task) {
        H h;
        boolean z3;
        int i2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j6;
        long j7;
        int i10;
        C0354h hVar = this.f6047a;
        if (hVar.c()) {
            C0391u uVar = (C0391u) C0390t.e().f6216a;
            if ((uVar == null || uVar.f6218b) && (h = (H) hVar.f6099j.get(this.f6049c)) != null) {
                g gVar = h.f6029b;
                if (gVar instanceof C0377f) {
                    C0377f fVar = (C0377f) gVar;
                    long j8 = this.d;
                    int i11 = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
                    boolean z4 = true;
                    if (i11 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int gCoreServiceId = fVar.getGCoreServiceId();
                    if (uVar != null) {
                        z3 &= uVar.f6219c;
                        boolean hasConnectionInfo = fVar.hasConnectionInfo();
                        i2 = uVar.d;
                        int i12 = uVar.f6217a;
                        if (!hasConnectionInfo || fVar.isConnecting()) {
                            i6 = uVar.f6220e;
                            i5 = i12;
                        } else {
                            C0381j a6 = a(h, fVar, this.f6048b);
                            if (a6 != null) {
                                if (!a6.f6180c || i11 <= 0) {
                                    z4 = false;
                                }
                                i6 = a6.f6181e;
                                i5 = i12;
                                z3 = z4;
                            } else {
                                return;
                            }
                        }
                    } else {
                        i2 = 5000;
                        i5 = 0;
                        i6 = 100;
                    }
                    int i13 = i2;
                    if (task.isSuccessful()) {
                        i8 = 0;
                        i7 = 0;
                    } else if (task.isCanceled()) {
                        i8 = -1;
                        i7 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof j) {
                            Status status = ((j) exception).getStatus();
                            i10 = status.f6007a;
                            C1132b bVar = status.d;
                            if (bVar != null) {
                                i8 = bVar.f12801b;
                                i7 = i10;
                            }
                        } else {
                            i10 = 101;
                        }
                        i8 = -1;
                        i7 = i10;
                    }
                    if (z3) {
                        long currentTimeMillis = System.currentTimeMillis();
                        i9 = (int) (SystemClock.elapsedRealtime() - this.f6050e);
                        j7 = j8;
                        j6 = currentTimeMillis;
                    } else {
                        i9 = -1;
                        j7 = 0;
                        j6 = 0;
                    }
                    O o6 = new O(new C0389s(this.f6048b, i7, i8, j7, j6, (String) null, (String) null, gCoreServiceId, i9), i5, (long) i13, i6);
                    zau zau = hVar.f6103n;
                    zau.sendMessage(zau.obtainMessage(18, o6));
                }
            }
        }
    }
}
