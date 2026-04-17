package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import v0.C1037a;
import v0.C1038b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C1037a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f4875a;
        boolean z3 = true;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        remoteActionCompat.f4875a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f4876b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1038b) aVar).f12149e);
        }
        remoteActionCompat.f4876b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4877c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1038b) aVar).f12149e);
        }
        remoteActionCompat.f4877c = charSequence2;
        remoteActionCompat.d = (PendingIntent) aVar.g(remoteActionCompat.d, 4);
        boolean z4 = remoteActionCompat.f4878e;
        if (aVar.e(5)) {
            if (((C1038b) aVar).f12149e.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        remoteActionCompat.f4878e = z4;
        boolean z5 = remoteActionCompat.f4879f;
        if (aVar.e(6)) {
            if (((C1038b) aVar).f12149e.readInt() == 0) {
                z3 = false;
            }
            z5 = z3;
        }
        remoteActionCompat.f4879f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C1037a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4875a;
        aVar.i(1);
        aVar.k(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4876b;
        aVar.i(2);
        Parcel parcel = ((C1038b) aVar).f12149e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4877c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f4878e;
        aVar.i(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f4879f;
        aVar.i(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
