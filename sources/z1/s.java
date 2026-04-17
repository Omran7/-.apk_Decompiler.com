package z1;

import J1.b;
import K1.a;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.F;
import com.google.android.gms.common.internal.H;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zzc;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final o f12834a = new o(p.a("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"), 2);

    /* renamed from: b  reason: collision with root package name */
    public static final o f12835b = new o(p.a("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"), 3);

    /* renamed from: c  reason: collision with root package name */
    public static volatile H f12836c;
    public static final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static Context f12837e;

    static {
        new o(p.a("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"), 0);
        new o(p.a("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"), 1);
    }

    public static y a(String str, q qVar, boolean z3, boolean z4) {
        try {
            b();
            I.g(f12837e);
            v vVar = new v(str, qVar, z3, z4);
            try {
                H h = f12836c;
                b bVar = new b(f12837e.getPackageManager());
                F f6 = (F) h;
                Parcel zza = f6.zza();
                zzc.zzc(zza, vVar);
                zzc.zze(zza, bVar);
                Parcel zzB = f6.zzB(5, zza);
                boolean zzf = zzc.zzf(zzB);
                zzB.recycle();
                if (zzf) {
                    return y.d;
                }
                return new x(new n(z3, str, qVar));
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                return new y(false, "module call", e6);
            }
        } catch (a e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            return new y(false, "module init: ".concat(String.valueOf(e7.getMessage())), e7);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.internal.common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
            com.google.android.gms.common.internal.H r0 = f12836c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r0 = f12837e
            com.google.android.gms.common.internal.I.g(r0)
            java.lang.Object r0 = d
            monitor-enter(r0)
            com.google.android.gms.common.internal.H r1 = f12836c     // Catch:{ all -> 0x003e }
            if (r1 != 0) goto L_0x0040
            android.content.Context r1 = f12837e     // Catch:{ all -> 0x003e }
            H3.f r2 = K1.d.f1449c     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            K1.d r1 = K1.d.c(r1, r2, r3)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.b(r2)     // Catch:{ all -> 0x003e }
            int r2 = com.google.android.gms.common.internal.G.f6138a     // Catch:{ all -> 0x003e }
            if (r1 != 0) goto L_0x0027
            r1 = 0
            goto L_0x003b
        L_0x0027:
            java.lang.String r2 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r3 = r1.queryLocalInterface(r2)     // Catch:{ all -> 0x003e }
            boolean r4 = r3 instanceof com.google.android.gms.common.internal.H     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x0035
            r1 = r3
            com.google.android.gms.common.internal.H r1 = (com.google.android.gms.common.internal.H) r1     // Catch:{ all -> 0x003e }
            goto L_0x003b
        L_0x0035:
            com.google.android.gms.common.internal.F r3 = new com.google.android.gms.common.internal.F     // Catch:{ all -> 0x003e }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x003e }
            r1 = r3
        L_0x003b:
            f12836c = r1     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x003e:
            r1 = move-exception
            goto L_0x0042
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.s.b():void");
    }
}
