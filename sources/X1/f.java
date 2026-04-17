package x1;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapi.zbb;
import com.google.android.gms.internal.p001authapi.zbc;

public final class f extends zbb implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12547a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f12548b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i2) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        this.f12547a = i2;
        this.f12548b = gVar;
    }

    public void w(Status status) {
        switch (this.f12547a) {
            case 1:
                this.f12548b.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i5) {
        switch (i2) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                throw new UnsupportedOperationException();
            case 102:
                zbc.zbb(parcel);
                zbc((Status) zbc.zba(parcel, Status.CREATOR));
                break;
            case 103:
                zbc.zbb(parcel);
                w((Status) zbc.zba(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public void zbc(Status status) {
        switch (this.f12547a) {
            case 0:
                this.f12548b.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
