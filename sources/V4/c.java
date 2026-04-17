package V4;

import K1.e;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.o;
import h0.C0552a;
import i3.C0587c;
import i3.C0588d;
import i3.q;

public final class c implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3792a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3793b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f3794c;

    public /* synthetic */ c(h hVar, TaskCompletionSource taskCompletionSource, int i2) {
        this.f3792a = i2;
        this.f3794c = hVar;
        this.f3793b = taskCompletionSource;
    }

    public final void B(C0588d dVar) {
        switch (this.f3792a) {
            case 0:
                this.f3793b.setResult(Boolean.FALSE);
                return;
            case 1:
                this.f3793b.setResult(Boolean.FALSE);
                return;
            case 2:
                this.f3793b.setResult(Boolean.FALSE);
                return;
            default:
                this.f3793b.setResult(Boolean.FALSE);
                return;
        }
    }

    public final void u(C0587c cVar) {
        int i2;
        long j6;
        int i5 = 0;
        TaskCompletionSource taskCompletionSource = this.f3793b;
        h hVar = this.f3794c;
        Class<Integer> cls = Integer.class;
        switch (this.f3792a) {
            case 0:
                try {
                    hVar.f3824V0 = ((Integer) cVar.a(e.x(3001, 0)).a("count").f(cls)).intValue();
                } catch (Exception e6) {
                    C0552a.x(e6, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                }
                try {
                    hVar.f3825W0 = ((Integer) cVar.a(e.x(3003, 0)).a("count").f(cls)).intValue();
                } catch (Exception e7) {
                    C0552a.x(e7, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                }
                if (hVar.f3824V0 >= hVar.X0) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                    return;
                } else {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
            case 1:
                try {
                    i2 = ((Integer) cVar.a("emblem").f(cls)).intValue();
                } catch (Exception e8) {
                    C0552a.x(e8, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                    i2 = 0;
                }
                try {
                    i5 = ((Integer) cVar.a("luckyLine").f(cls)).intValue();
                } catch (Exception e9) {
                    C0552a.x(e9, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                }
                o.getUpgradeObject().setEmblem(i2);
                o.getUpgradeObject().setLuckyLine(i5);
                if (i2 >= hVar.f3826Y0) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                    return;
                } else {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
            case 2:
                try {
                    hVar.f3824V0 = ((Integer) cVar.a(e.x(3001, 0)).a("count").f(cls)).intValue();
                } catch (Exception e10) {
                    C0552a.x(e10, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                }
                try {
                    hVar.f3825W0 = ((Integer) cVar.a(e.x(3003, 0)).a("count").f(cls)).intValue();
                } catch (Exception e11) {
                    C0552a.x(e11, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                }
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
            default:
                try {
                    j6 = (long) ((Integer) cVar.f(cls)).intValue();
                } catch (Exception e12) {
                    C0552a.x(e12, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                    j6 = 0;
                }
                if (j6 >= hVar.f3827Z0) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                    return;
                } else {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
        }
    }
}
