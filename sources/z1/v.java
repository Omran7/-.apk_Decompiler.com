package z1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public final class v extends a {
    public static final Parcelable.Creator<v> CREATOR = new w(0);

    /* renamed from: a  reason: collision with root package name */
    public final String f12846a;

    /* renamed from: b  reason: collision with root package name */
    public final q f12847b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12848c;
    public final boolean d;

    public v(String str, q qVar, boolean z3, boolean z4) {
        this.f12846a = str;
        this.f12847b = qVar;
        this.f12848c = z3;
        this.d = z4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f12846a, false);
        q qVar = this.f12847b;
        if (qVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            qVar = null;
        }
        android.support.v4.media.session.a.M0(parcel, 2, qVar);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f12848c ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.internal.common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v(java.lang.String r6, android.os.IBinder r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.String r0 = "Could not unwrap certificate"
            java.lang.String r1 = "GoogleCertificatesQuery"
            r5.<init>()
            r5.f12846a = r6
            r6 = 0
            if (r7 != 0) goto L_0x000d
            goto L_0x003f
        L_0x000d:
            int r2 = z1.p.f12830b     // Catch:{ RemoteException -> 0x003b }
            java.lang.String r2 = "com.google.android.gms.common.internal.ICertData"
            android.os.IInterface r3 = r7.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x003b }
            boolean r4 = r3 instanceof com.google.android.gms.common.internal.D     // Catch:{ RemoteException -> 0x003b }
            if (r4 == 0) goto L_0x001c
            com.google.android.gms.common.internal.D r3 = (com.google.android.gms.common.internal.D) r3     // Catch:{ RemoteException -> 0x003b }
            goto L_0x0021
        L_0x001c:
            com.google.android.gms.common.internal.Y r3 = new com.google.android.gms.common.internal.Y     // Catch:{ RemoteException -> 0x003b }
            r3.<init>(r7, r2)     // Catch:{ RemoteException -> 0x003b }
        L_0x0021:
            J1.a r7 = r3.zzd()     // Catch:{ RemoteException -> 0x003b }
            if (r7 != 0) goto L_0x0029
            r7 = r6
            goto L_0x002f
        L_0x0029:
            java.lang.Object r7 = J1.b.b(r7)
            byte[] r7 = (byte[]) r7
        L_0x002f:
            if (r7 == 0) goto L_0x0037
            z1.q r6 = new z1.q
            r6.<init>(r7)
            goto L_0x003f
        L_0x0037:
            android.util.Log.e(r1, r0)
            goto L_0x003f
        L_0x003b:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
        L_0x003f:
            r5.f12847b = r6
            r5.f12848c = r8
            r5.d = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.v.<init>(java.lang.String, android.os.IBinder, boolean, boolean):void");
    }
}
