package I3;

import G1.c;
import K.i0;
import K.v0;
import R2.i;
import R2.m;
import Z1.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1169a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1170b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1171c;
    public Serializable d;

    /* renamed from: e  reason: collision with root package name */
    public int f1172e;

    /* renamed from: f  reason: collision with root package name */
    public int f1173f;

    public /* synthetic */ e(Context context, int i2) {
        this.f1169a = i2;
        this.f1173f = 0;
        this.f1170b = context;
    }

    public static String b(i iVar) {
        iVar.b();
        m mVar = iVar.f2492c;
        String str = mVar.f2503e;
        if (str != null) {
            return str;
        }
        iVar.b();
        String str2 = mVar.f2501b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static String c(i iVar) {
        iVar.b();
        m mVar = iVar.f2492c;
        String str = mVar.f2503e;
        if (str != null) {
            return str;
        }
        iVar.b();
        String str2 = mVar.f2501b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        int i2 = this.f1169a;
        synchronized (this) {
            switch (i2) {
                case 0:
                    try {
                        if (((String) this.f1171c) == null) {
                            g();
                        }
                        String str = (String) this.f1171c;
                        return str;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                default:
                    try {
                        if (((String) this.f1171c) == null) {
                            g();
                        }
                        String str2 = (String) this.f1171c;
                        return str2;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
            }
        }
    }

    public PackageInfo d(String str) {
        switch (this.f1169a) {
            case 0:
                try {
                    return ((Context) this.f1170b).getPackageManager().getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException e6) {
                    String valueOf = String.valueOf(e6);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                    sb.append("Failed to find package ");
                    sb.append(valueOf);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return null;
                }
            default:
                try {
                    return ((Context) this.f1170b).getPackageManager().getPackageInfo(str, 0);
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("FirebaseMessaging", "Failed to find package " + e7);
                    return null;
                }
        }
    }

    public boolean e() {
        int i2;
        synchronized (this) {
            i2 = this.f1173f;
            if (i2 == 0) {
                PackageManager packageManager = ((Context) this.f1170b).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!c.d()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f1173f = 1;
                            i2 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (c.d()) {
                            this.f1173f = 2;
                        } else {
                            this.f1173f = 1;
                        }
                        i2 = this.f1173f;
                    } else {
                        this.f1173f = 2;
                        i2 = 2;
                    }
                }
            }
        }
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    public void f(v0 v0Var, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i0 i0Var = (i0) it2.next();
            if ((i0Var.f1397a.c() & 8) != 0) {
                ((View) this.f1171c).setTranslationY((float) a.c(this.f1173f, 0, i0Var.f1397a.b()));
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void g() {
        /*
            r2 = this;
            int r0 = r2.f1169a
            monitor-enter(r2)
            switch(r0) {
                case 0: goto L_0x0027;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r0 = r2.f1170b     // Catch:{ all -> 0x0021 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0021 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0021 }
            android.content.pm.PackageInfo r0 = r2.d(r0)     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0023
            int r1 = r0.versionCode     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0021 }
            r2.f1171c = r1     // Catch:{ all -> 0x0021 }
            java.lang.String r0 = r0.versionName     // Catch:{ all -> 0x0021 }
            r2.d = r0     // Catch:{ all -> 0x0021 }
            goto L_0x0023
        L_0x0021:
            r0 = move-exception
            goto L_0x0025
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r0
        L_0x0027:
            java.lang.Object r0 = r2.f1170b     // Catch:{ all -> 0x0043 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0043 }
            android.content.pm.PackageInfo r0 = r2.d(r0)     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0041
            int r1 = r0.versionCode     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0043 }
            r2.f1171c = r1     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r0.versionName     // Catch:{ all -> 0x0043 }
            r2.d = r0     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r2)
            goto L_0x0045
        L_0x0043:
            r0 = move-exception
            goto L_0x0046
        L_0x0045:
            return
        L_0x0046:
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.e.g():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [int[], java.io.Serializable] */
    public e(View view) {
        this.f1169a = 2;
        this.d = new int[2];
        this.f1171c = view;
    }
}
