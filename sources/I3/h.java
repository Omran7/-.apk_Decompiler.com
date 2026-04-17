package I3;

import B0.C0008g;
import B0.C0009h;
import B0.D;
import B0.H;
import B0.I;
import B0.n;
import B2.a;
import D0.c;
import F3.r;
import G1.e;
import H0.b;
import I0.B;
import I0.C0055b;
import I0.C0057d;
import I0.p;
import I0.y;
import J2.m;
import K2.g;
import N5.f;
import T1.A;
import T1.C0157b1;
import T1.C0174h0;
import T1.C0192n0;
import T1.C0212u0;
import T1.I1;
import T1.L0;
import T1.V0;
import T1.Z;
import U0.k;
import U0.o;
import Y4.E;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.bumptech.glide.load.data.d;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.C0468a;
import h0.C0552a;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.j;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import org.json.JSONException;
import org.json.JSONObject;
import q.C0928e;
import z0.C1130f;
import z0.i;
import z0.l;

public final class h implements d, Callback, q, l, p, Continuation, zzo, L0 {
    public static h d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1178a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1179b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1180c;

    public /* synthetic */ h(Object obj, int i2) {
        this.f1178a = i2;
        this.f1180c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[SYNTHETIC, Splitter:B:15:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC, Splitter:B:19:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static I3.h b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0037, Error -> 0x0035, OverlappingFileLockException -> 0x0031 }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ IOException -> 0x0037, Error -> 0x0035, OverlappingFileLockException -> 0x0031 }
            r2.<init>(r5, r0)     // Catch:{ IOException -> 0x0037, Error -> 0x0035, OverlappingFileLockException -> 0x0031 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0037, Error -> 0x0035, OverlappingFileLockException -> 0x0031 }
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch:{ IOException -> 0x0037, Error -> 0x0035, OverlappingFileLockException -> 0x0031 }
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch:{ IOException -> 0x0037, Error -> 0x0035, OverlappingFileLockException -> 0x0031 }
            java.nio.channels.FileLock r0 = r5.lock()     // Catch:{ IOException -> 0x002f, Error -> 0x002d, OverlappingFileLockException -> 0x002a }
            I3.h r2 = new I3.h     // Catch:{ IOException -> 0x0028, Error -> 0x0026, OverlappingFileLockException -> 0x0024 }
            r3 = 17
            r4 = 0
            r2.<init>(r5, r0, r3, r4)     // Catch:{ IOException -> 0x0028, Error -> 0x0026, OverlappingFileLockException -> 0x0024 }
            return r2
        L_0x0024:
            r2 = move-exception
            goto L_0x0039
        L_0x0026:
            r2 = move-exception
            goto L_0x0039
        L_0x0028:
            r2 = move-exception
            goto L_0x0039
        L_0x002a:
            r2 = move-exception
        L_0x002b:
            r0 = r1
            goto L_0x0039
        L_0x002d:
            r2 = move-exception
            goto L_0x002b
        L_0x002f:
            r2 = move-exception
            goto L_0x002b
        L_0x0031:
            r2 = move-exception
        L_0x0032:
            r5 = r1
            r0 = r5
            goto L_0x0039
        L_0x0035:
            r2 = move-exception
            goto L_0x0032
        L_0x0037:
            r2 = move-exception
            goto L_0x0032
        L_0x0039:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L_0x0045
            r0.release()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.h.b(android.content.Context):I3.h");
    }

    public static String e(String str) {
        return C0552a.r(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    public static String f(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + str3.length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public static B g(ImageDecoder.Source source, int i2, int i5, i iVar) {
        Drawable i6 = ImageDecoder.decodeDrawable(source, new b(i2, i5, iVar));
        if (e.z(i6)) {
            return new B(e.h(i6), 2);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + i6);
    }

    public static synchronized h l() {
        h hVar;
        synchronized (h.class) {
            try {
                if (d == null) {
                    h hVar2 = new h(0);
                    hVar2.f1179b = null;
                    hVar2.f1180c = null;
                    d = hVar2;
                }
                hVar = d;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return hVar;
    }

    public void A(Call call, IOException iOException) {
        j.e(iOException, "e");
        boolean z3 = iOException instanceof InterruptedIOException;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1179b;
        if (z3) {
            taskCompletionSource.setException(new F3.j("DEADLINE_EXCEEDED", F3.i.f756e, (Exception) iOException));
        } else {
            taskCompletionSource.setException(new F3.j("INTERNAL", F3.i.f762t, (Exception) iOException));
        }
    }

    public void B(C0588d dVar) {
        int i2 = this.f1178a;
    }

    /* JADX INFO: finally extract failed */
    public void C(Call call, Response response) {
        F3.i iVar;
        Charset charset;
        Object obj;
        F3.j jVar;
        j.e(response, "response");
        F3.i iVar2 = F3.i.f753a;
        int i2 = response.f10651c;
        if (i2 == 200) {
            iVar = F3.i.f753a;
        } else if (i2 == 409) {
            iVar = F3.i.f760r;
        } else if (i2 == 429) {
            iVar = F3.i.f759q;
        } else if (i2 == 400) {
            iVar = F3.i.d;
        } else if (i2 == 401) {
            iVar = F3.i.f764v;
        } else if (i2 == 403) {
            iVar = F3.i.f758p;
        } else if (i2 == 404) {
            iVar = F3.i.f757f;
        } else if (i2 == 503) {
            iVar = F3.i.f763u;
        } else if (i2 != 504) {
            switch (i2) {
                case 499:
                    iVar = F3.i.f754b;
                    break;
                case 500:
                    iVar = F3.i.f762t;
                    break;
                case 501:
                    iVar = F3.i.f761s;
                    break;
                default:
                    iVar = F3.i.f755c;
                    break;
            }
        } else {
            iVar = F3.i.f756e;
        }
        ResponseBody responseBody = response.f10654p;
        j.b(responseBody);
        f k6 = responseBody.k();
        try {
            MediaType d6 = responseBody.d();
            if (d6 != null) {
                charset = Util.f10688i;
                try {
                    String str = d6.f10575b;
                    if (str != null) {
                        charset = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            } else {
                charset = Util.f10688i;
            }
            String i5 = k6.i(Util.b(k6, charset));
            Util.e(k6);
            int i6 = F3.j.f766b;
            F3.h hVar = (F3.h) this.f1180c;
            j.e(hVar.f750c, "serializer");
            String name = iVar.name();
            try {
                JSONObject jSONObject = new JSONObject(i5).getJSONObject("error");
                if (jSONObject.opt("status") instanceof String) {
                    String string = jSONObject.getString("status");
                    j.d(string, "error.getString(\"status\")");
                    iVar = F3.i.valueOf(string);
                    name = iVar.name();
                }
                if (jSONObject.opt("message") instanceof String) {
                    String string2 = jSONObject.getString("message");
                    j.d(string2, "error.getString(\"message\")");
                    if (string2.length() > 0) {
                        String string3 = jSONObject.getString("message");
                        j.d(string3, "error.getString(\"message\")");
                        name = string3;
                    }
                }
                obj = jSONObject.opt("details");
                if (obj != null) {
                    try {
                        obj = H3.f.d(obj);
                    } catch (IllegalArgumentException unused2) {
                        iVar = F3.i.f762t;
                        name = "INTERNAL";
                    } catch (JSONException unused3) {
                    }
                }
            } catch (IllegalArgumentException unused4) {
                obj = null;
                iVar = F3.i.f762t;
                name = "INTERNAL";
            } catch (JSONException unused5) {
                obj = null;
            }
            if (iVar == F3.i.f753a) {
                jVar = null;
            } else {
                jVar = new F3.j(name, iVar, obj);
            }
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1179b;
            if (jVar != null) {
                taskCompletionSource.setException(jVar);
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(i5);
                Object opt = jSONObject2.opt("data");
                if (opt == null) {
                    opt = jSONObject2.opt("result");
                }
                if (opt == null) {
                    taskCompletionSource.setException(new F3.j("Response is missing data field.", F3.i.f762t, (Object) null));
                    return;
                }
                hVar.f750c.getClass();
                taskCompletionSource.setResult(new r(H3.f.d(opt)));
            } catch (JSONException e6) {
                taskCompletionSource.setException(new F3.j("Response is not valid JSON object.", F3.i.f762t, (Exception) e6));
            }
        } catch (Throwable th) {
            Util.e(k6);
            throw th;
        }
    }

    public void D(H.f fVar) {
        int i2 = fVar.f975b;
        Handler handler = (Handler) this.f1180c;
        x1.i iVar = (x1.i) this.f1179b;
        if (i2 == 0) {
            handler.post(new a((Object) iVar, (Object) fVar.f974a, 3));
        } else {
            handler.post(new H.a((Object) iVar, i2, 0));
        }
    }

    public void E(C0.j jVar, Object obj) {
        HashMap hashMap = (HashMap) this.f1180c;
        C0.d dVar = (C0.d) hashMap.get(jVar);
        if (dVar == null) {
            dVar = new C0.d(jVar);
            dVar.d = dVar;
            C0.d dVar2 = (C0.d) this.f1179b;
            dVar.d = dVar2.d;
            dVar.f402c = dVar2;
            dVar2.d = dVar;
            dVar.d.f402c = dVar;
            hashMap.put(jVar, dVar);
        } else {
            jVar.a();
        }
        if (dVar.f401b == null) {
            dVar.f401b = new ArrayList();
        }
        dVar.f401b.add(obj);
    }

    public M3.b F() {
        JSONObject jSONObject;
        String str;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(k());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int[] iArr = new int[5];
        System.arraycopy(C0928e.f11062a, 0, iArr, 0, 5);
        int i2 = iArr[optInt];
        if (i2 != 0) {
            if (i2 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new M3.b(optString, i2, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
        throw th;
    }

    public void G(J2.l lVar) {
        m mVar = new m(lVar.f1311a, g.class);
        HashMap hashMap = (HashMap) this.f1179b;
        if (hashMap.containsKey(mVar)) {
            J2.l lVar2 = (J2.l) hashMap.get(mVar);
            if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + mVar);
            }
            return;
        }
        hashMap.put(mVar, lVar);
    }

    public void H(C2.m mVar) {
        if (mVar != null) {
            Class c3 = mVar.c();
            HashMap hashMap = (HashMap) this.f1180c;
            if (hashMap.containsKey(c3)) {
                C2.m mVar2 = (C2.m) hashMap.get(c3);
                if (!mVar2.equals(mVar) || !mVar.equals(mVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c3);
                }
                return;
            }
            hashMap.put(c3, mVar);
            return;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public void I(String str) {
        D0.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f1179b).get(str);
                U0.g.c(obj, "Argument must not be null");
                bVar = (D0.b) obj;
                int i2 = bVar.f487b;
                if (i2 >= 1) {
                    int i5 = i2 - 1;
                    bVar.f487b = i5;
                    if (i5 == 0) {
                        D0.b bVar2 = (D0.b) ((HashMap) this.f1179b).remove(str);
                        if (bVar2.equals(bVar)) {
                            c cVar = (c) this.f1180c;
                            synchronized (cVar.f488a) {
                                if (cVar.f488a.size() < 10) {
                                    cVar.f488a.offer(bVar2);
                                }
                            }
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f487b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f486a.unlock();
    }

    public void J() {
        try {
            ((FileLock) this.f1180c).release();
            ((FileChannel) this.f1179b).close();
        } catch (IOException e6) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e6);
        }
    }

    public Object K() {
        int i2;
        C0.d dVar = (C0.d) this.f1179b;
        C0.d dVar2 = dVar.d;
        while (true) {
            Object obj = null;
            if (dVar2.equals(dVar)) {
                return null;
            }
            ArrayList arrayList = dVar2.f401b;
            if (arrayList != null) {
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                obj = dVar2.f401b.remove(i2 - 1);
            }
            if (obj != null) {
                return obj;
            }
            C0.d dVar3 = dVar2.d;
            dVar3.f402c = dVar2.f402c;
            dVar2.f402c.d = dVar3;
            C0.j jVar = dVar2.f400a;
            ((HashMap) this.f1180c).remove(jVar);
            jVar.a();
            dVar2 = dVar2.d;
        }
    }

    public synchronized void L(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        String e6 = e(str);
        SharedPreferences sharedPreferences = (SharedPreferences) this.f1179b;
        if (!sharedPreferences.contains(e6)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(e(str), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            String string = sharedPreferences.getString(e(str), (String) null);
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            currentTimeMillis = 0;
        }
        ((n.e) this.f1180c).put(str, Long.valueOf(currentTimeMillis));
    }

    public void M() {
        C0212u0 u0Var = (C0212u0) ((C0157b1) this.f1180c).f398a;
        C0174h0 h0Var = u0Var.f3495q;
        C0212u0.i(h0Var);
        SparseArray u6 = h0Var.u();
        I1 i12 = (I1) this.f1179b;
        u6.put(i12.f2968c, Long.valueOf(i12.f2967b));
        C0174h0 h0Var2 = u0Var.f3495q;
        C0212u0.i(h0Var2);
        int[] iArr = new int[u6.size()];
        long[] jArr = new long[u6.size()];
        for (int i2 = 0; i2 < u6.size(); i2++) {
            iArr[i2] = u6.keyAt(i2);
            jArr[i2] = ((Long) u6.valueAt(i2)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        h0Var2.f3330x.N(bundle);
    }

    public void a(Exception exc) {
        F0.r rVar = (F0.r) this.f1179b;
        F0.r rVar2 = ((I) this.f1180c).f206f;
        if (rVar2 != null && rVar2 == rVar) {
            I i2 = (I) this.f1180c;
            n nVar = i2.f203b;
            C0008g gVar = i2.f207p;
            com.bumptech.glide.load.data.e eVar = ((F0.r) this.f1179b).f706c;
            nVar.e(gVar, exc, eVar, eVar.e());
        }
    }

    public void c(C0.b bVar, Bitmap bitmap) {
        IOException iOException = ((U0.f) this.f1180c).f3682b;
        if (iOException != null) {
            if (bitmap != null) {
                bVar.f(bitmap);
            }
            throw iOException;
        }
    }

    public void d(Object obj) {
        F0.r rVar = (F0.r) this.f1179b;
        F0.r rVar2 = ((I) this.f1180c).f206f;
        if (rVar2 != null && rVar2 == rVar) {
            I i2 = (I) this.f1180c;
            F0.r rVar3 = (F0.r) this.f1179b;
            B0.p pVar = i2.f202a.f242p;
            if (obj == null || !pVar.a(rVar3.f706c.e())) {
                n nVar = i2.f203b;
                C1130f fVar = rVar3.f704a;
                com.bumptech.glide.load.data.e eVar = rVar3.f706c;
                nVar.a(fVar, obj, eVar, eVar.e(), i2.f207p);
                return;
            }
            i2.f205e = obj;
            i2.f203b.z(2);
        }
    }

    public void h() {
        y yVar = (y) this.f1179b;
        synchronized (yVar) {
            yVar.f1145c = yVar.f1143a.length;
        }
    }

    public synchronized void i() {
        ((n.e) this.f1180c).clear();
        ((SharedPreferences) this.f1179b).edit().clear().commit();
    }

    public Object j(C0.j jVar) {
        int i2;
        HashMap hashMap = (HashMap) this.f1180c;
        C0.d dVar = (C0.d) hashMap.get(jVar);
        if (dVar == null) {
            dVar = new C0.d(jVar);
            hashMap.put(jVar, dVar);
        } else {
            jVar.a();
        }
        C0.d dVar2 = dVar.d;
        dVar2.f402c = dVar.f402c;
        dVar.f402c.d = dVar2;
        C0.d dVar3 = (C0.d) this.f1179b;
        dVar.d = dVar3;
        C0.d dVar4 = dVar3.f402c;
        dVar.f402c = dVar4;
        dVar4.d = dVar;
        dVar.d.f402c = dVar;
        ArrayList arrayList = dVar.f401b;
        if (arrayList != null) {
            i2 = arrayList.size();
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            return dVar.f401b.remove(i2 - 1);
        }
        return null;
    }

    public File k() {
        if (((File) this.f1179b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f1179b) == null) {
                        R2.i iVar = (R2.i) this.f1180c;
                        iVar.b();
                        File filesDir = iVar.f2490a.getFilesDir();
                        this.f1179b = new File(filesDir, "PersistedInstallation." + ((R2.i) this.f1180c).g() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f1179b;
    }

    public synchronized List m(String str) {
        List list;
        if (!((ArrayList) this.f1179b).contains(str)) {
            ((ArrayList) this.f1179b).add(str);
        }
        list = (List) ((HashMap) this.f1180c).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.f1180c).put(str, list);
        }
        return list;
    }

    public synchronized ArrayList n(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z3;
        arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) this.f1179b).iterator();
        while (it2.hasNext()) {
            List<P0.c> list = (List) ((HashMap) this.f1180c).get((String) it2.next());
            if (list != null) {
                for (P0.c cVar : list) {
                    if (!cVar.f2131a.isAssignableFrom(cls) || !cls2.isAssignableFrom(cVar.f2132b)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3 && !arrayList.contains(cVar.f2132b)) {
                        arrayList.add(cVar.f2132b);
                    }
                }
            }
        }
        return arrayList;
    }

    public int o(i iVar) {
        return 2;
    }

    public String p(C1130f fVar) {
        String str;
        synchronized (((k) this.f1179b)) {
            str = (String) ((k) this.f1179b).a(fVar);
        }
        if (str == null) {
            D0.i iVar = (D0.i) ((C0009h) this.f1180c).j();
            try {
                fVar.a(iVar.f502a);
                byte[] digest = iVar.f502a.digest();
                char[] cArr = o.f3698b;
                synchronized (cArr) {
                    for (int i2 = 0; i2 < digest.length; i2++) {
                        byte b6 = digest[i2];
                        int i5 = i2 * 2;
                        char[] cArr2 = o.f3697a;
                        cArr[i5] = cArr2[(b6 & 255) >>> 4];
                        cArr[i5 + 1] = cArr2[b6 & 15];
                    }
                    str = new String(cArr);
                }
                ((C0009h) this.f1180c).D(iVar);
            } catch (Throwable th) {
                ((C0009h) this.f1180c).D(iVar);
                throw th;
            }
        }
        synchronized (((k) this.f1179b)) {
            ((k) this.f1179b).d(fVar, str);
        }
        return str;
    }

    public boolean q(Context context) {
        boolean z3;
        if (((Boolean) this.f1180c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f1180c = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f1179b).booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f1180c).booleanValue();
    }

    public boolean r(Context context) {
        boolean z3;
        if (((Boolean) this.f1179b) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f1179b = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f1179b).booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f1179b).booleanValue();
    }

    public boolean s(Object obj, File file, i iVar) {
        return ((C0055b) this.f1180c).s(new C0057d((C0.b) this.f1179b, ((BitmapDrawable) ((D) obj).get()).getBitmap()), file, iVar);
    }

    public void t(M3.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f1829a);
            jSONObject.put("Status", C0928e.c(bVar.f1830b));
            jSONObject.put("AuthToken", bVar.f1831c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f1833f);
            jSONObject.put("ExpiresInSecs", bVar.f1832e);
            jSONObject.put("FisError", bVar.g);
            R2.i iVar = (R2.i) this.f1180c;
            iVar.b();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", iVar.f2490a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(k())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public Object then(Task task) {
        h hVar = (h) this.f1179b;
        Pair pair = (Pair) this.f1180c;
        synchronized (hVar) {
            ((n.e) hVar.f1180c).remove(pair);
        }
        return task;
    }

    public String toString() {
        int i2;
        switch (this.f1178a) {
            case 3:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C0.d dVar = (C0.d) this.f1179b;
                C0.d dVar2 = dVar.f402c;
                boolean z3 = false;
                while (!dVar2.equals(dVar)) {
                    sb.append('{');
                    sb.append(dVar2.f400a);
                    sb.append(':');
                    ArrayList arrayList = dVar2.f401b;
                    if (arrayList != null) {
                        i2 = arrayList.size();
                    } else {
                        i2 = 0;
                    }
                    sb.append(i2);
                    sb.append("}, ");
                    dVar2 = dVar2.f402c;
                    z3 = true;
                }
                if (z3) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 15:
                return "Bounds{lower=" + ((C.g) this.f1179b) + " upper=" + ((C.g) this.f1180c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(C0587c cVar) {
        switch (this.f1178a) {
            case 8:
                if (cVar.b()) {
                    H h = (H) this.f1180c;
                    ((H4.h) h.f201c).f1047q0 = (d5.k) cVar.f(d5.k.class);
                    H4.h.V((H4.h) h.f201c, (C0587c) this.f1179b);
                    return;
                }
                return;
            default:
                C0468a aVar = (C0468a) cVar.a("accountObject").f(C0468a.class);
                String str = (String) cVar.a("accountObject").a("email").f(String.class);
                int intValue = ((Integer) cVar.a("mainStatesObject").a("level").f(Integer.class)).intValue();
                com.bumptech.glide.d.v0(1, "server_number");
                int A6 = com.bumptech.glide.c.A(Long.valueOf(com.bumptech.glide.d.x0("server_created_time")));
                int A7 = com.bumptech.glide.c.A(Long.valueOf(aVar.getJoinTimeInMilli()));
                if (com.bumptech.glide.d.G0(intValue, A6, A7, aVar.isEmailVerified(), aVar.isBannedFromSystemBefore())) {
                    b5.d dVar = new b5.d();
                    dVar.setId(aVar.getId());
                    dVar.setFirebaseId(aVar.getFirebaseId());
                    dVar.setEmail(aVar.getEmail());
                    dVar.setReason((String) this.f1179b);
                    dVar.setVerified(aVar.isEmailVerified());
                    dVar.setLevel(intValue);
                    dVar.setAdminRequestsNumber(aVar.getAdminRequestsNumber() + 1);
                    dVar.setServerNumber(com.bumptech.glide.d.v0(1, "server_number"));
                    dVar.setServerAge(A6);
                    dVar.setPlayerAge(A7);
                    dVar.setUnixTime(com.bumptech.glide.c.f5744o);
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "accountObject", "hasAdminRequestNotReviewed").I(Boolean.TRUE);
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "accountObject", "adminRequestsNumber").I(Integer.valueOf(aVar.getAdminRequestsNumber() + 1));
                    C0592h.b().e().E("Admins").E("requests").E(d5.o.getAccountObject().getFirebaseId()).G().I(dVar).addOnSuccessListener(new P4.c(this, aVar, str, 0));
                    return;
                }
                R2.b.w(false);
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.not_has_admin_requirements, ((P4.d) this.f1180c).f2197i0, (String) null);
                return;
        }
    }

    public void v(String str, String str2, Bundle bundle, long j6) {
        try {
            ((zzde) this.f1179b).zzf(str, str2, bundle, j6);
        } catch (RemoteException e6) {
            C0212u0 u0Var = ((AppMeasurementDynamiteService) this.f1180c).f6266a;
            if (u0Var != null) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3175r.b(e6, "Event interceptor threw exception");
            }
        }
    }

    public void y(boolean z3) {
        W4.g gVar = (W4.g) this.f1180c;
        if (z3) {
            U.g(d5.o.getAccountObject().getId(), "cash", (long) ((int) ((K1.e.S(20) + 1.0d) * ((double) ((E) gVar.f4114n0.get(gVar.f4111k0)).f4319e))), new A((Object) this, 8));
            return;
        }
        R2.b.w(false);
        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_get_salary_twice, gVar.f4104d0, (String) null);
    }

    public void z(Throwable th) {
        C0157b1 b1Var = (C0157b1) this.f1180c;
        b1Var.o();
        b1Var.f3249r = false;
        C0212u0 u0Var = (C0212u0) b1Var.f398a;
        int i2 = 2;
        if (u0Var.f3494p.B((String) null, T1.H.f2891Z0)) {
            String message = th.getMessage();
            b1Var.f3254w = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        b1Var.f3254w = true;
                    }
                    i2 = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i2 = 3;
                }
            }
        }
        int i5 = i2 - 1;
        I1 i12 = (I1) this.f1179b;
        Z z3 = u0Var.f3496r;
        if (i5 == 0) {
            C0212u0.k(z3);
            z3.f3175r.c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", Z.w(u0Var.n().u()), Z.w(th.toString()));
            b1Var.f3250s = 1;
            b1Var.M().add(i12);
        } else if (i5 != 1) {
            C0212u0.k(z3);
            z3.f3172f.c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", Z.w(u0Var.n().u()), th);
            M();
            b1Var.f3250s = 1;
            b1Var.C();
        } else {
            b1Var.M().add(i12);
            if (b1Var.f3250s > ((Integer) T1.H.f2948v0.a((Object) null)).intValue()) {
                b1Var.f3250s = 1;
                C0212u0.k(z3);
                z3.f3175r.c("registerTriggerAsync failed. May try later. App ID, throwable", Z.w(u0Var.n().u()), Z.w(th.toString()));
                return;
            }
            C0212u0.k(z3);
            z3.f3175r.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", Z.w(u0Var.n().u()), Z.w(String.valueOf(b1Var.f3250s)), Z.w(th.toString()));
            int i6 = b1Var.f3250s;
            if (b1Var.f3251t == null) {
                b1Var.f3251t = new V0(b1Var, u0Var, 1);
            }
            b1Var.f3251t.c(((long) i6) * 1000);
            int i7 = b1Var.f3250s;
            b1Var.f3250s = i7 + i7;
        }
    }

    public String zza(String str) {
        Map map = (Map) ((C0192n0) this.f1180c).d.get((String) this.f1179b);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }

    public /* synthetic */ h(Object obj, Object obj2, int i2) {
        this.f1178a = i2;
        this.f1180c = obj;
        this.f1179b = obj2;
    }

    public /* synthetic */ h(Object obj, Object obj2, int i2, boolean z3) {
        this.f1178a = i2;
        this.f1179b = obj;
        this.f1180c = obj2;
    }

    public h(Context context) {
        boolean isEmpty;
        this.f1178a = 13;
        this.f1180c = new n.j(0);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f1179b = sharedPreferences;
        File file = new File(A.h.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseInstanceId", "App restored, clearing state");
                        i();
                    }
                }
            } catch (IOException e6) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e6.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    public h(ThreadPoolExecutor threadPoolExecutor) {
        this.f1178a = 12;
        this.f1180c = new n.j(0);
        this.f1179b = threadPoolExecutor;
    }

    public h(int i2) {
        this.f1178a = i2;
        switch (i2) {
            case 3:
                this.f1179b = new C0.d((C0.j) null);
                this.f1180c = new HashMap();
                return;
            case 4:
                this.f1179b = new HashMap();
                this.f1180c = new c(0);
                return;
            case 5:
                this.f1179b = new k(1000);
                this.f1180c = V0.c.a(10, new H3.f(5));
                return;
            case 14:
                this.f1179b = new HashMap();
                this.f1180c = new HashMap();
                return;
            case 20:
                this.f1179b = new AtomicReference();
                this.f1180c = new n.j(0);
                return;
            case 21:
                this.f1179b = new ArrayList();
                this.f1180c = new HashMap();
                return;
            default:
                return;
        }
    }

    private final void w(C0588d dVar) {
    }

    private final void x(C0588d dVar) {
    }

    public h(J2.n nVar) {
        this.f1178a = 14;
        this.f1179b = new HashMap(nVar.f1315a);
        this.f1180c = new HashMap(nVar.f1316b);
    }

    public h(ArrayList arrayList, ArrayList arrayList2) {
        this.f1178a = 1;
        int size = arrayList.size();
        this.f1179b = new int[size];
        this.f1180c = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            ((int[]) this.f1179b)[i2] = ((Integer) arrayList.get(i2)).intValue();
            ((float[]) this.f1180c)[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    public h(int i2, int i5) {
        this.f1178a = 1;
        this.f1179b = new int[]{i2, i5};
        this.f1180c = new float[]{0.0f, 1.0f};
    }

    public h(int i2, int i5, int i6) {
        this.f1178a = 1;
        this.f1179b = new int[]{i2, i5, i6};
        this.f1180c = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.text.Editable$Factory, W.a] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.widget.EditText r6) {
        /*
            r5 = this;
            r0 = 27
            r5.f1178a = r0
            r0 = 0
            r5.<init>()
            r5.f1179b = r6
            W.i r1 = new W.i
            r1.<init>(r6)
            r5.f1180c = r1
            r6.addTextChangedListener(r1)
            W.a r1 = W.a.f3854b
            if (r1 != 0) goto L_0x003b
            java.lang.Object r1 = W.a.f3853a
            monitor-enter(r1)
            W.a r2 = W.a.f3854b     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0037
            W.a r2 = new W.a     // Catch:{ all -> 0x0035 }
            r2.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<W.a> r4 = W.a.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x0032 }
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r4)     // Catch:{ all -> 0x0032 }
            W.a.f3855c = r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            W.a.f3854b = r2     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            r6 = move-exception
            goto L_0x0039
        L_0x0037:
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            throw r6
        L_0x003b:
            W.a r0 = W.a.f3854b
            r6.setEditableFactory(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.h.<init>(android.widget.EditText):void");
    }
}
