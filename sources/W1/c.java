package W1;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.Q;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import z1.C1132b;

public abstract class c extends zab {
    public final boolean zaa(int i2, Parcel parcel, Parcel parcel2, int i5) {
        switch (i2) {
            case 3:
                C1132b bVar = (C1132b) zac.zaa(parcel, C1132b.CREATOR);
                b bVar2 = (b) zac.zaa(parcel, b.CREATOR);
                zac.zab(parcel);
                break;
            case 4:
                Status status = (Status) zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case zzaky.zzf.zzf /*6*/:
                Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
                zac.zab(parcel);
                break;
            case zzaky.zzf.zzg /*7*/:
                Status status3 = (Status) zac.zaa(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zac.zaa(parcel, GoogleSignInAccount.CREATOR);
                zac.zab(parcel);
                break;
            case 8:
                zac.zab(parcel);
                Q q6 = (Q) this;
                q6.f6059b.post(new b0(q6, (g) zac.zaa(parcel, g.CREATOR), 3));
                break;
            case 9:
                e eVar = (e) zac.zaa(parcel, e.CREATOR);
                zac.zab(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
