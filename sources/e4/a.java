package E4;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.o;
import h0.C0552a;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import l3.C0782a;

public final class a implements q, C0782a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f623b;

    public /* synthetic */ a(TaskCompletionSource taskCompletionSource, int i2) {
        this.f622a = i2;
        this.f623b = taskCompletionSource;
    }

    public void B(C0588d dVar) {
        switch (this.f622a) {
            case 0:
                this.f623b.setException(dVar.c());
                return;
            case 1:
                this.f623b.setException(dVar.c());
                return;
            case 2:
                this.f623b.setException(dVar.c());
                return;
            case 3:
                this.f623b.setException(dVar.c());
                return;
            case 4:
                this.f623b.setResult(Boolean.FALSE);
                return;
            case 5:
                this.f623b.setException(dVar.c());
                return;
            case zzaky.zzf.zzf /*6*/:
                this.f623b.setException(dVar.c());
                return;
            case zzaky.zzf.zzg /*7*/:
                this.f623b.setException(dVar.c());
                return;
            case 8:
                this.f623b.setException(dVar.c());
                return;
            case 10:
                this.f623b.setException(dVar.c());
                return;
            default:
                this.f623b.setException(dVar.c());
                return;
        }
    }

    public void a(String str) {
        this.f623b.setResult(str);
    }

    public void b(String str) {
        this.f623b.setException(new Exception(str));
    }

    public void u(C0587c cVar) {
        int i2;
        TaskCompletionSource taskCompletionSource = this.f623b;
        switch (this.f622a) {
            case 0:
                taskCompletionSource.setResult(cVar);
                return;
            case 1:
                taskCompletionSource.setResult(cVar);
                return;
            case 2:
                taskCompletionSource.setResult(cVar);
                return;
            case 3:
                taskCompletionSource.setResult(cVar);
                return;
            case 4:
                Class<Integer> cls = Integer.class;
                int i5 = 0;
                try {
                    i2 = ((Integer) cVar.a("emblem").f(cls)).intValue();
                } catch (Exception e6) {
                    C0552a.x(e6, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                    i2 = 0;
                }
                try {
                    i5 = ((Integer) cVar.a("luckyLine").f(cls)).intValue();
                } catch (Exception e7) {
                    C0552a.x(e7, "Exception from try-catch block when get integer from Firebase (ignore it, default value added 0).", "h");
                }
                o.getUpgradeObject().setEmblem(i2);
                o.getUpgradeObject().setLuckyLine(i5);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
            case 5:
                taskCompletionSource.setResult(cVar);
                return;
            case zzaky.zzf.zzf /*6*/:
                taskCompletionSource.setResult(cVar);
                return;
            case zzaky.zzf.zzg /*7*/:
                taskCompletionSource.setResult(cVar);
                return;
            case 8:
                taskCompletionSource.setResult(cVar);
                return;
            case 10:
                taskCompletionSource.setResult(cVar);
                return;
            default:
                taskCompletionSource.setResult(cVar);
                return;
        }
    }
}
