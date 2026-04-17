package z1;

import D0.a;
import D0.e;
import J1.b;
import U0.g;
import U0.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.F;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zzc;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
import x1.i;

public final class j implements h {

    /* renamed from: c  reason: collision with root package name */
    public static j f12818c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f12819a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f12820b;

    public /* synthetic */ j(Object obj) {
        this.f12819a = obj;
    }

    public static j b(Context context) {
        I.g(context);
        synchronized (j.class) {
            if (f12818c == null) {
                o oVar = s.f12834a;
                synchronized (s.class) {
                    if (s.f12837e == null) {
                        s.f12837e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f12818c = new j(context);
            }
        }
        return f12818c;
    }

    public static final p d(PackageInfo packageInfo, p... pVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            q qVar = new q(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < pVarArr.length; i2++) {
                if (pVarArr[i2].equals(qVar)) {
                    return pVarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0027
        L_0x001a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L_0x0020
        L_0x001e:
            r5 = r1
            goto L_0x0027
        L_0x0020:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x001e
            r5 = r0
        L_0x0027:
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0048
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0039
            z1.p[] r4 = z1.r.f12833a
            z1.p r4 = d(r2, r4)
            goto L_0x0045
        L_0x0039:
            z1.p[] r4 = z1.r.f12833a
            r4 = r4[r1]
            z1.p[] r4 = new z1.p[]{r4}
            z1.p r4 = d(r2, r4)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.j.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, D0.d] */
    public a a() {
        File file;
        if (((a) this.f12820b) == null) {
            synchronized (this) {
                try {
                    if (((a) this.f12820b) == null) {
                        File cacheDir = ((e) ((i) this.f12819a).f12553b).f494b.getCacheDir();
                        Object obj = null;
                        if (cacheDir == null) {
                            file = null;
                        } else {
                            file = new File(cacheDir, "image_manager_disk_cache");
                        }
                        if (file != null) {
                            if (file.isDirectory() || file.mkdirs()) {
                                ? obj2 = new Object();
                                obj2.d = new I3.h(4);
                                obj2.f491c = file;
                                obj2.f489a = 262144000;
                                obj2.f490b = new I3.h(5);
                                obj = obj2;
                            }
                        }
                        this.f12820b = obj;
                    }
                    if (((a) this.f12820b) == null) {
                        this.f12820b = new s2.e(4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (a) this.f12820b;
    }

    public boolean c(int i2) {
        y yVar;
        int length;
        boolean z3;
        ApplicationInfo applicationInfo;
        y yVar2;
        String str;
        String str2;
        PackageManager.NameNotFoundException nameNotFoundException;
        String[] packagesForUid = ((Context) this.f12819a).getPackageManager().getPackagesForUid(i2);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            yVar = new y(false, "no pkgs", (Exception) null);
        } else {
            yVar = null;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    I.g(yVar);
                    break;
                }
                String str3 = packagesForUid[i5];
                if (str3 == null) {
                    yVar = new y(false, "null pkg", (Exception) null);
                } else if (!str3.equals((String) this.f12820b)) {
                    o oVar = s.f12834a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        s.b();
                        F f6 = (F) s.f12836c;
                        Parcel zzB = f6.zzB(7, f6.zza());
                        z3 = zzc.zzf(zzB);
                        zzB.recycle();
                    } catch (K1.a | RemoteException e6) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                        z3 = false;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    if (z3) {
                        boolean a6 = i.a((Context) this.f12819a);
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            I.g(s.f12837e);
                            try {
                                s.b();
                                str = "GoogleCertificates";
                                str2 = "Failed to get Google certificates from remote";
                                t tVar = new t(str3, a6, false, new b(s.f12837e), false, true);
                                F f7 = (F) s.f12836c;
                                Parcel zza = f7.zza();
                                zzc.zzc(zza, tVar);
                                Parcel zzB2 = f7.zzB(6, zza);
                                u uVar = (u) zzc.zza(zzB2, u.CREATOR);
                                zzB2.recycle();
                                if (uVar.f12843a) {
                                    m.b(uVar.d);
                                    yVar = new y(true, (String) null, (Exception) null);
                                    StrictMode.setThreadPolicy(allowThreadDiskReads2);
                                } else {
                                    String str4 = uVar.f12844b;
                                    if (v5.a.b(uVar.f12845c) == 4) {
                                        nameNotFoundException = new PackageManager.NameNotFoundException();
                                    } else {
                                        nameNotFoundException = null;
                                    }
                                    if (str4 == null) {
                                        str4 = "error checking package certificate";
                                    }
                                    m.b(uVar.d);
                                    v5.a.b(uVar.f12845c);
                                    yVar2 = new y(false, str4, nameNotFoundException);
                                    yVar = yVar2;
                                    StrictMode.setThreadPolicy(allowThreadDiskReads2);
                                }
                            } catch (K1.a e7) {
                                K1.a aVar = e7;
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", aVar);
                                yVar2 = new y(false, "module init: ".concat(String.valueOf(aVar.getMessage())), aVar);
                            }
                        } catch (RemoteException e8) {
                            Log.e(str, str2, e8);
                            yVar = new y(false, "module call", e8);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads2);
                            throw th2;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.f12819a).getPackageManager().getPackageInfo(str3, 64);
                            boolean a7 = i.a((Context) this.f12819a);
                            if (packageInfo == null) {
                                yVar = new y(false, "null pkg", (Exception) null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    yVar = new y(false, "single cert required", (Exception) null);
                                } else {
                                    q qVar = new q(packageInfo.signatures[0].toByteArray());
                                    String str5 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        y a8 = s.a(str5, qVar, a7, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                        if (!(!a8.f12851a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0)) {
                                            allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                y a9 = s.a(str5, qVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                                if (a9.f12851a) {
                                                    yVar = new y(false, "debuggable release cert app rejected", (Exception) null);
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                        yVar = a8;
                                    } finally {
                                        Throwable th4 = th3;
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e9) {
                            yVar = new y(false, "no pkg ".concat(str3), e9);
                        }
                    }
                    if (yVar.f12851a) {
                        this.f12820b = str3;
                    }
                } else {
                    yVar = y.d;
                }
                if (yVar.f12851a) {
                    break;
                }
                i5++;
            }
        }
        if (!yVar.f12851a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Exception exc = yVar.f12853c;
            if (exc != null) {
                Log.d("GoogleCertificatesRslt", yVar.a(), exc);
            } else {
                Log.d("GoogleCertificatesRslt", yVar.a());
            }
        }
        return yVar.f12851a;
    }

    public Object get() {
        if (this.f12820b == null) {
            synchronized (this) {
                try {
                    if (this.f12820b == null) {
                        Object obj = ((h) this.f12819a).get();
                        g.c(obj, "Argument must not be null");
                        this.f12820b = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f12820b;
    }

    public j(Context context) {
        this.f12819a = context.getApplicationContext();
    }

    public j() {
        this.f12819a = new CopyOnWriteArraySet();
    }
}
