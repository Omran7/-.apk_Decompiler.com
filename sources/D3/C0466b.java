package d3;

import I5.u;
import S3.C0149j;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* renamed from: d3.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0466b implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7524a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0467c f7525b;

    public /* synthetic */ C0466b(C0467c cVar, int i2) {
        this.f7524a = i2;
        this.f7525b = cVar;
    }

    public final Task then(Object obj) {
        switch (this.f7524a) {
            case 0:
                C0467c cVar = this.f7525b;
                cVar.getClass();
                return Tasks.call(cVar.f7529e, new C0149j(cVar, new u(((IntegrityTokenResponse) obj).token(), 3), 2));
            default:
                C0467c cVar2 = this.f7525b;
                cVar2.getClass();
                return cVar2.f7527b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(cVar2.f7526a)).setNonce(((C0465a) obj).f7523a).build());
        }
    }
}
