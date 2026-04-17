package I3;

import H1.a;
import R2.b;
import R2.i;
import S3.B;
import S3.z;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1187a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1188b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f1189c;
    public final ThreadPoolExecutor d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f1190e;

    public k(FirebaseInstanceId firebaseInstanceId, long j6) {
        this.f1187a = 0;
        this.d = b.n0();
        this.f1190e = firebaseInstanceId;
        this.f1188b = j6;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f1189c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public Context a() {
        i iVar = ((FirebaseInstanceId) this.f1190e).f6894b;
        iVar.b();
        return iVar.f2490a;
    }

    public boolean b() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f1190e).f6906c.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        switch (this.f1187a) {
            case 0:
                FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f1190e;
                if (!firebaseInstanceId.j(firebaseInstanceId.g(e.b(firebaseInstanceId.f6894b), "*"))) {
                    return true;
                }
                try {
                    if (firebaseInstanceId.b() == null) {
                        Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                        return false;
                    } else if (!Log.isLoggable("FirebaseInstanceId", 3)) {
                        return true;
                    } else {
                        Log.d("FirebaseInstanceId", "Token successfully retrieved");
                        return true;
                    }
                } catch (IOException e6) {
                    String message = e6.getMessage();
                    if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                        String message2 = e6.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                        sb.append("Token retrieval failed: ");
                        sb.append(message2);
                        sb.append(". Will retry token retrieval");
                        Log.w("FirebaseInstanceId", sb.toString());
                    } else if (e6.getMessage() == null) {
                        Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                    } else {
                        throw e6;
                    }
                } catch (SecurityException unused) {
                    Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                }
                break;
            default:
                try {
                    if (((FirebaseMessaging) this.f1190e).a() == null) {
                        Log.e("FirebaseMessaging", "Token retrieval failed: null");
                        return false;
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Token successfully retrieved");
                    }
                    return true;
                } catch (IOException e7) {
                    String message3 = e7.getMessage();
                    if ("SERVICE_NOT_AVAILABLE".equals(message3) || "INTERNAL_SERVER_ERROR".equals(message3) || "InternalServerError".equals(message3)) {
                        Log.w("FirebaseMessaging", "Token retrieval failed: " + e7.getMessage() + ". Will retry token retrieval");
                        return false;
                    } else if (e7.getMessage() == null) {
                        Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                        return false;
                    } else {
                        throw e7;
                    }
                } catch (SecurityException unused2) {
                    Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                    return false;
                }
        }
    }

    public final void run() {
        boolean z3;
        NetworkInfo networkInfo;
        switch (this.f1187a) {
            case 0:
                FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f1190e;
                boolean r6 = h.l().r(a());
                PowerManager.WakeLock wakeLock = this.f1189c;
                if (r6) {
                    wakeLock.acquire();
                }
                try {
                    synchronized (firebaseInstanceId) {
                        z3 = true;
                        firebaseInstanceId.g = true;
                    }
                    if (!firebaseInstanceId.h()) {
                        synchronized (firebaseInstanceId) {
                            firebaseInstanceId.g = false;
                        }
                        if (!h.l().r(a())) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    }
                    if (h.l().q(a())) {
                        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
                        if (connectivityManager != null) {
                            networkInfo = connectivityManager.getActiveNetworkInfo();
                        } else {
                            networkInfo = null;
                        }
                        if (networkInfo == null || !networkInfo.isConnected()) {
                            z3 = false;
                        }
                        if (!z3) {
                            j jVar = new j();
                            jVar.f1186b = this;
                            jVar.a();
                            if (!h.l().r(a())) {
                                return;
                            }
                            wakeLock.release();
                            return;
                        }
                    }
                    if (c()) {
                        synchronized (firebaseInstanceId) {
                            firebaseInstanceId.g = false;
                        }
                    } else {
                        firebaseInstanceId.i(this.f1188b);
                    }
                    if (!h.l().r(a())) {
                        return;
                    }
                    wakeLock.release();
                    return;
                } catch (IOException e6) {
                    try {
                        String message = e6.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                        sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                        sb.append(message);
                        sb.append(". Won't retry the operation.");
                        Log.e("FirebaseInstanceId", sb.toString());
                        synchronized (firebaseInstanceId) {
                            firebaseInstanceId.g = false;
                            if (!h.l().r(a())) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (h.l().r(a())) {
                            wakeLock.release();
                        }
                        throw th;
                    }
                }
                break;
            default:
                z w6 = z.w();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f1190e;
                boolean y6 = w6.y(firebaseMessaging.f6906c);
                PowerManager.WakeLock wakeLock2 = this.f1189c;
                if (y6) {
                    wakeLock2.acquire();
                }
                try {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f6910j = true;
                    }
                    if (!firebaseMessaging.f6909i.e()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f6910j = false;
                        }
                        if (!z.w().y(firebaseMessaging.f6906c)) {
                            return;
                        }
                        wakeLock2.release();
                        return;
                    } else if (!z.w().x(firebaseMessaging.f6906c) || b()) {
                        if (c()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f6910j = false;
                            }
                        } else {
                            firebaseMessaging.h(this.f1188b);
                        }
                        if (!z.w().y(firebaseMessaging.f6906c)) {
                            return;
                        }
                        wakeLock2.release();
                        return;
                    } else {
                        B b6 = new B();
                        b6.f2608c = this;
                        b6.a();
                        if (!z.w().y(firebaseMessaging.f6906c)) {
                            return;
                        }
                        wakeLock2.release();
                        return;
                    }
                } catch (IOException e7) {
                    try {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e7.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f6910j = false;
                            if (!z.w().y(firebaseMessaging.f6906c)) {
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        if (z.w().y(firebaseMessaging.f6906c)) {
                            wakeLock2.release();
                        }
                        throw th2;
                    }
                }
                break;
        }
    }

    public k(FirebaseMessaging firebaseMessaging, long j6) {
        this.f1187a = 1;
        this.d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a("firebase-iid-executor"));
        this.f1190e = firebaseMessaging;
        this.f1188b = j6;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f6906c.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f1189c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
