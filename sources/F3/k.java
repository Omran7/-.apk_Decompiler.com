package F3;

import D2.l;
import G1.c;
import G1.f;
import H3.e;
import H3.g;
import J.b;
import J2.o;
import R2.m;
import S3.C0147h;
import S3.t;
import W0.u;
import Z2.a;
import Z2.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import c.C0333h;
import c1.i;
import com.canhub.cropper.CropImageActivity;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import com.mtma.criminal.city.R;
import e1.C0483b;
import g3.d;
import g3.p;
import h1.C0553a;
import j4.p0;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import k1.C0758c;
import kotlin.jvm.internal.j;
import l5.C0797a;
import m0.C0809a;
import m0.C0830w;
import n5.C0876h;
import org.json.JSONObject;
import q.C0928e;

public final class k implements d, C0483b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f768a;

    /* renamed from: b  reason: collision with root package name */
    public Object f769b;

    /* renamed from: c  reason: collision with root package name */
    public Object f770c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f771e;

    /* renamed from: f  reason: collision with root package name */
    public Object f772f;

    public /* synthetic */ k() {
        this.f768a = 7;
    }

    public static k c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        k kVar = new k(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) kVar.f771e)) {
            try {
                ((ArrayDeque) kVar.f771e).clear();
                String string = ((SharedPreferences) kVar.f769b).getString((String) kVar.f770c, "");
                if (!TextUtils.isEmpty(string)) {
                    if (string.contains((String) kVar.d)) {
                        String[] split = string.split((String) kVar.d, -1);
                        if (split.length == 0) {
                            Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                        }
                        for (String str : split) {
                            if (!TextUtils.isEmpty(str)) {
                                ((ArrayDeque) kVar.f771e).add(str);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public boolean a(int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0809a aVar = (C0809a) arrayList.get(i5);
            int i6 = aVar.f9921a;
            if (i6 == 8) {
                if (h(aVar.f9923c, i5 + 1) == i2) {
                    return true;
                }
            } else if (i6 == 1) {
                int i7 = aVar.f9922b;
                int i8 = aVar.f9923c + i7;
                while (i7 < i8) {
                    if (h(i7, i5 + 1) == i2) {
                        return true;
                    }
                    i7++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0830w) this.f771e).a((C0809a) arrayList.get(i2));
        }
        o(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f770c;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C0809a aVar = (C0809a) arrayList2.get(i5);
            int i6 = aVar.f9921a;
            C0830w wVar = (C0830w) this.f771e;
            if (i6 == 1) {
                wVar.a(aVar);
                wVar.d(aVar.f9922b, aVar.f9923c);
            } else if (i6 == 2) {
                wVar.a(aVar);
                int i7 = aVar.f9922b;
                int i8 = aVar.f9923c;
                RecyclerView recyclerView = wVar.f10066a;
                recyclerView.O(i7, i8, true);
                recyclerView.f5368o0 = true;
                recyclerView.f5365l0.f9877c += i8;
            } else if (i6 == 4) {
                wVar.a(aVar);
                wVar.c(aVar.f9922b, aVar.f9923c);
            } else if (i6 == 8) {
                wVar.a(aVar);
                wVar.e(aVar.f9922b, aVar.f9923c);
            }
        }
        o(arrayList2);
    }

    public void d(C0809a aVar) {
        int i2;
        int i5 = aVar.f9921a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int r6 = r(aVar.f9922b, i5);
        int i6 = aVar.f9922b;
        int i7 = aVar.f9921a;
        if (i7 == 2) {
            i2 = 0;
        } else if (i7 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + aVar);
        }
        int i8 = 1;
        for (int i9 = 1; i9 < aVar.f9923c; i9++) {
            int r7 = r((i2 * i9) + aVar.f9922b, aVar.f9921a);
            int i10 = aVar.f9921a;
            if (i10 == 2 ? r7 != r6 : !(i10 == 4 && r7 == r6 + 1)) {
                C0809a m6 = m(i10, r6, i8);
                e(m6, i6);
                ((b) this.f769b).c(m6);
                if (aVar.f9921a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                r6 = r7;
            } else {
                i8++;
            }
        }
        ((b) this.f769b).c(aVar);
        if (i8 > 0) {
            C0809a m7 = m(aVar.f9921a, r6, i8);
            e(m7, i6);
            ((b) this.f769b).c(m7);
        }
    }

    public void e(C0809a aVar, int i2) {
        C0830w wVar = (C0830w) this.f771e;
        wVar.a(aVar);
        int i5 = aVar.f9921a;
        if (i5 == 2) {
            int i6 = aVar.f9923c;
            RecyclerView recyclerView = wVar.f10066a;
            recyclerView.O(i2, i6, true);
            recyclerView.f5368o0 = true;
            recyclerView.f5365l0.f9877c += i6;
        } else if (i5 == 4) {
            wVar.c(i2, aVar.f9923c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public Object f(o oVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((p) this.f769b, (p) this.f770c, (p) this.d, (p) this.f771e, (p) this.f772f, oVar);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [Z2.a, java.lang.Object] */
    public a g(byte[] bArr, int i2, h hVar) {
        String str;
        if (hVar.f4506b <= System.currentTimeMillis()) {
            if (i2 == 2) {
                str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
            } else if (i2 == 3) {
                str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
            } else {
                throw new IllegalArgumentException("Unknown token type.");
            }
            JSONObject jSONObject = new JSONObject(l(new URL(String.format(str, new Object[]{(String) this.f771e, (String) this.d, (String) this.f770c})), bArr, hVar, true));
            String a6 = f.a(jSONObject.optString("token"));
            String a7 = f.a(jSONObject.optString("ttl"));
            if (a6 == null || a7 == null) {
                throw new R2.k("Unexpected server response.");
            }
            ? obj = new Object();
            obj.f4478a = a6;
            obj.f4479b = a7;
            return obj;
        }
        throw new R2.k("Too many attempts.");
    }

    public Object get() {
        return new C0553a((Executor) ((C0797a) this.f772f).get(), (d1.f) ((C0797a) this.f769b).get(), (i1.d) ((i) this.f770c).get(), (j1.d) ((C0797a) this.d).get(), (C0758c) ((C0797a) this.f771e).get());
    }

    public int h(int i2, int i5) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i5 < size) {
            C0809a aVar = (C0809a) arrayList.get(i5);
            int i6 = aVar.f9921a;
            if (i6 == 8) {
                int i7 = aVar.f9922b;
                if (i7 == i2) {
                    i2 = aVar.f9923c;
                } else {
                    if (i7 < i2) {
                        i2--;
                    }
                    if (aVar.f9923c <= i2) {
                        i2++;
                    }
                }
            } else {
                int i8 = aVar.f9922b;
                if (i8 > i2) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = aVar.f9923c;
                    if (i2 < i8 + i9) {
                        return -1;
                    }
                    i2 -= i9;
                } else if (i6 == 1) {
                    i2 += aVar.f9923c;
                }
            }
            i5++;
        }
        return i2;
    }

    public String i() {
        Context context = (Context) this.f769b;
        try {
            byte[] c3 = c.c(context, context.getPackageName());
            if (c3 != null) {
                return c.a(c3);
            }
            Log.e("F3.k", "Could not get fingerprint hash for package: " + context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            Log.e("F3.k", "No such package: " + context.getPackageName(), e6);
            return null;
        }
    }

    public ArrayList j(PackageManager packageManager, String str) {
        Intent intent;
        List<ResolveInfo> list;
        Object obj;
        ArrayList arrayList = new ArrayList();
        if (str.equals("android.intent.action.GET_CONTENT")) {
            intent = new Intent(str);
        } else {
            intent = new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
        intent.setType("image/*");
        if (Build.VERSION.SDK_INT >= 33) {
            list = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of((long) 0));
        } else {
            list = packageManager.queryIntentActivities(intent, 0);
        }
        j.b(list);
        for (ResolveInfo next : list) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = next.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(next.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : (List) this.d) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (j.a(((Intent) obj).getPackage(), str2)) {
                    break;
                }
            }
            Intent intent3 = (Intent) obj;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    public boolean k() {
        if (((ArrayList) this.f770c).size() > 0) {
            return true;
        }
        return false;
    }

    public String l(URL url, byte[] bArr, h hVar, boolean z3) {
        String str;
        BufferedOutputStream bufferedOutputStream;
        boolean z4;
        InputStream inputStream;
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        boolean z5 = true;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            g gVar = (g) ((K3.b) this.f772f).get();
            str = null;
            if (gVar != null) {
                str = (String) Tasks.await(((e) gVar).b());
            }
        } catch (Exception unused) {
            Log.w("F3.k", "Unable to get heartbeats!");
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Firebase-Client", str);
        }
        httpURLConnection.setRequestProperty("X-Android-Package", ((Context) this.f769b).getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
        bufferedOutputStream.write(bArr, 0, bArr.length);
        bufferedOutputStream.close();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 200 || responseCode >= 300) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            inputStream = httpURLConnection.getInputStream();
        } else {
            inputStream = httpURLConnection.getErrorStream();
        }
        StringBuilder sb = new StringBuilder();
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            sb.append(readLine);
        }
        bufferedReader.close();
        String sb2 = sb.toString();
        if (responseCode < 200 || responseCode >= 300) {
            z5 = false;
        }
        if (!z5) {
            hVar.f4505a++;
            if (responseCode != 400) {
                if (responseCode != 404) {
                    hVar.f4506b = Math.min((long) (Math.pow(2.0d, ((double) hVar.f4505a) * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000) + System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject(new JSONObject(sb2).optString("error"));
                    throw new R2.k("Error returned from API. code: " + jSONObject.optInt("code") + " body: " + jSONObject.optString("message"));
                }
            }
            hVar.f4506b = System.currentTimeMillis() + 86400000;
            JSONObject jSONObject2 = new JSONObject(new JSONObject(sb2).optString("error"));
            throw new R2.k("Error returned from API. code: " + jSONObject2.optInt("code") + " body: " + jSONObject2.optString("message"));
        }
        if (z3) {
            hVar.f4505a = 0;
            hVar.f4506b = -1;
        }
        httpURLConnection.disconnect();
        return sb2;
        throw th;
        throw th;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [m0.a, java.lang.Object] */
    public C0809a m(int i2, int i5, int i6) {
        C0809a aVar = (C0809a) ((b) this.f769b).a();
        if (aVar == null) {
            ? obj = new Object();
            obj.f9921a = i2;
            obj.f9922b = i5;
            obj.f9923c = i6;
            return obj;
        }
        aVar.f9921a = i2;
        aVar.f9922b = i5;
        aVar.f9923c = i6;
        return aVar;
    }

    public void n(C0809a aVar) {
        ((ArrayList) this.d).add(aVar);
        int i2 = aVar.f9921a;
        C0830w wVar = (C0830w) this.f771e;
        if (i2 == 1) {
            wVar.d(aVar.f9922b, aVar.f9923c);
        } else if (i2 == 2) {
            int i5 = aVar.f9922b;
            int i6 = aVar.f9923c;
            RecyclerView recyclerView = wVar.f10066a;
            recyclerView.O(i5, i6, false);
            recyclerView.f5368o0 = true;
        } else if (i2 == 4) {
            wVar.c(aVar.f9922b, aVar.f9923c);
        } else if (i2 == 8) {
            wVar.e(aVar.f9922b, aVar.f9923c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    public void o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0809a aVar = (C0809a) arrayList.get(i2);
            aVar.getClass();
            ((b) this.f769b).c(aVar);
        }
        arrayList.clear();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, J2.o] */
    public void p(Z0.a aVar) {
        l lVar = new l(24);
        c1.j jVar = (c1.j) this.f769b;
        c1.p pVar = (c1.p) this.f772f;
        Z0.d dVar = Z0.d.f4466a;
        i a6 = c1.j.a();
        a6.H(jVar.f5607a);
        a6.d = dVar;
        a6.f5606c = jVar.f5608b;
        c1.j c3 = a6.c();
        ? obj = new Object();
        obj.f1320e = new HashMap();
        obj.f1319c = Long.valueOf(pVar.f5623a.g());
        obj.d = Long.valueOf(pVar.f5624b.g());
        obj.f1317a = (String) this.f770c;
        obj.f1318b = new c1.l((Z0.c) this.d, (byte[]) ((Z0.e) this.f771e).apply(aVar.f4462a));
        obj.f1321f = null;
        c1.h k6 = obj.k();
        C0553a aVar2 = (C0553a) pVar.f5625c;
        aVar2.getClass();
        aVar2.f8049b.execute(new C0147h(aVar2, c3, lVar, k6));
    }

    public Task q() {
        int i2;
        String str;
        String str2;
        U3.b bVar;
        int a6;
        PackageInfo d6;
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f769b;
        String str3 = (String) this.f770c;
        String str4 = (String) this.d;
        String str5 = (String) this.f771e;
        I3.i iVar = (I3.i) this.f772f;
        o oVar = firebaseInstanceId.d;
        oVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("scope", str5);
        bundle.putString("sender", str4);
        bundle.putString("subtype", str4);
        bundle.putString("appid", str3);
        R2.i iVar2 = (R2.i) oVar.f1317a;
        iVar2.b();
        bundle.putString("gmp_app_id", iVar2.f2492c.f2501b);
        I3.e eVar = (I3.e) oVar.f1318b;
        synchronized (eVar) {
            try {
                if (eVar.f1172e == 0 && (d6 = eVar.d("com.google.android.gms")) != null) {
                    eVar.f1172e = d6.versionCode;
                }
                i2 = eVar.f1172e;
            } finally {
                while (true) {
                }
            }
        }
        bundle.putString("gmsv", Integer.toString(i2));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((I3.e) oVar.f1318b).a());
        I3.e eVar2 = (I3.e) oVar.f1318b;
        synchronized (eVar2) {
            try {
                if (((String) eVar2.d) == null) {
                    eVar2.g();
                }
                str = (String) eVar2.d;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        bundle.putString("app_ver_name", str);
        R2.i iVar3 = (R2.i) oVar.f1317a;
        iVar3.b();
        try {
            str2 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(iVar3.f2491b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str2 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str2);
        try {
            String str6 = ((L3.a) Tasks.await(((L3.d) ((L3.e) oVar.f1321f)).d())).f1709a;
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str6);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (ExecutionException e6) {
            e = e6;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
            bundle.putString("cliv", "fiid-21.1.0");
            H3.h hVar = (H3.h) ((K3.b) oVar.f1320e).get();
            bVar = (U3.b) ((K3.b) oVar.d).get();
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(C0928e.c(a6)));
            bundle.putString("Firebase-Client", bVar.a());
            return ((y1.b) oVar.f1319c).a(bundle).continueWith(I3.a.f1160b, new x1.i((Object) oVar, 14)).onSuccessTask(firebaseInstanceId.f6893a, new I3.b(firebaseInstanceId, str4, str5, str3)).addOnSuccessListener((Executor) I3.a.d, new H4.g(firebaseInstanceId, iVar, 2, false));
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
            bundle.putString("cliv", "fiid-21.1.0");
            H3.h hVar2 = (H3.h) ((K3.b) oVar.f1320e).get();
            bVar = (U3.b) ((K3.b) oVar.d).get();
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(C0928e.c(a6)));
            bundle.putString("Firebase-Client", bVar.a());
            return ((y1.b) oVar.f1319c).a(bundle).continueWith(I3.a.f1160b, new x1.i((Object) oVar, 14)).onSuccessTask(firebaseInstanceId.f6893a, new I3.b(firebaseInstanceId, str4, str5, str3)).addOnSuccessListener((Executor) I3.a.d, new H4.g(firebaseInstanceId, iVar, 2, false));
        }
        bundle.putString("cliv", "fiid-21.1.0");
        H3.h hVar22 = (H3.h) ((K3.b) oVar.f1320e).get();
        bVar = (U3.b) ((K3.b) oVar.d).get();
        if (!(hVar22 == null || bVar == null || (a6 = ((e) hVar22).a()) == 1)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(C0928e.c(a6)));
            bundle.putString("Firebase-Client", bVar.a());
        }
        return ((y1.b) oVar.f1319c).a(bundle).continueWith(I3.a.f1160b, new x1.i((Object) oVar, 14)).onSuccessTask(firebaseInstanceId.f6893a, new I3.b(firebaseInstanceId, str4, str5, str3)).addOnSuccessListener((Executor) I3.a.d, new H4.g(firebaseInstanceId, iVar, 2, false));
    }

    public int r(int i2, int i5) {
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0809a aVar = (C0809a) arrayList.get(size);
            int i8 = aVar.f9921a;
            if (i8 == 8) {
                int i9 = aVar.f9922b;
                int i10 = aVar.f9923c;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i2 < i7 || i2 > i6) {
                    if (i2 < i9) {
                        if (i5 == 1) {
                            aVar.f9922b = i9 + 1;
                            aVar.f9923c = i10 + 1;
                        } else if (i5 == 2) {
                            aVar.f9922b = i9 - 1;
                            aVar.f9923c = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        aVar.f9923c = i10 + 1;
                    } else if (i5 == 2) {
                        aVar.f9923c = i10 - 1;
                    }
                    i2++;
                } else {
                    if (i5 == 1) {
                        aVar.f9922b = i9 + 1;
                    } else if (i5 == 2) {
                        aVar.f9922b = i9 - 1;
                    }
                    i2--;
                }
            } else {
                int i11 = aVar.f9922b;
                if (i11 <= i2) {
                    if (i8 == 1) {
                        i2 -= aVar.f9923c;
                    } else if (i8 == 2) {
                        i2 += aVar.f9923c;
                    }
                } else if (i5 == 1) {
                    aVar.f9922b = i11 + 1;
                } else if (i5 == 2) {
                    aVar.f9922b = i11 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0809a aVar2 = (C0809a) arrayList.get(size2);
            if (aVar2.f9921a == 8) {
                int i12 = aVar2.f9923c;
                if (i12 == aVar2.f9922b || i12 < 0) {
                    arrayList.remove(size2);
                    ((b) this.f769b).c(aVar2);
                }
            } else if (aVar2.f9923c <= 0) {
                arrayList.remove(size2);
                ((b) this.f769b).c(aVar2);
            }
        }
        return i2;
    }

    public String toString() {
        switch (this.f768a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f769b) + ", mProviderPackage: " + ((String) this.f770c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i2 = 0;
                while (true) {
                    List list = (List) this.f771e;
                    if (i2 < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i2);
                        for (int i5 = 0; i5 < list2.size(); i5++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i2++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k(Object obj, String str, Object obj2, Object obj3, Object obj4, int i2) {
        this.f768a = i2;
        this.f769b = obj;
        this.f770c = str;
        this.d = obj2;
        this.f771e = obj3;
        this.f772f = obj4;
    }

    public k(CropImageActivity cropImageActivity, t tVar) {
        this.f768a = 4;
        this.f769b = tVar;
        String string = cropImageActivity.getString(R.string.pick_image_chooser_title);
        j.d(string, "getString(...)");
        this.f770c = string;
        this.d = C0876h.S0("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        this.f772f = (C0333h) cropImageActivity.k(new u(4), new e((Object) this, 3));
    }

    public k(C0797a aVar, C0797a aVar2, i iVar, C0797a aVar3, C0797a aVar4) {
        this.f768a = 8;
        this.f772f = aVar;
        this.f769b = aVar2;
        this.f770c = iVar;
        this.d = aVar3;
        this.f771e = aVar4;
    }

    public k(G3.c cVar, x1.i iVar, C0797a aVar, G3.c cVar2, G3.c cVar3) {
        this.f768a = 0;
        this.f769b = cVar;
        this.f771e = iVar;
        this.f772f = aVar;
        this.f770c = cVar2;
        this.d = cVar3;
    }

    public k(String str, String str2, String str3, List list) {
        this.f768a = 1;
        str.getClass();
        this.f769b = str;
        str2.getClass();
        this.f770c = str2;
        this.d = str3;
        list.getClass();
        this.f771e = list;
        this.f772f = str + "-" + str2 + "-" + str3;
    }

    public k(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f768a = 3;
        this.f771e = new ArrayDeque();
        this.f769b = sharedPreferences;
        this.f770c = "topic_operation_queue";
        this.d = ",";
        this.f772f = scheduledThreadPoolExecutor;
    }

    public k(C0830w wVar) {
        this.f768a = 9;
        this.f769b = new b(30);
        this.f770c = new ArrayList();
        this.d = new ArrayList();
        this.f771e = wVar;
        this.f772f = new p0(this, 8);
    }

    public k(R2.i iVar) {
        this.f768a = 5;
        iVar.b();
        iVar.b();
        K3.b bVar = ((Z2.e) iVar.c(Z2.e.class)).f4489b;
        Context context = iVar.f2490a;
        I.g(context);
        m mVar = iVar.f2492c;
        I.g(mVar);
        I.g(bVar);
        this.f769b = context;
        this.f770c = mVar.f2500a;
        this.d = mVar.f2501b;
        String str = mVar.g;
        this.f771e = str;
        if (str != null) {
            this.f772f = bVar;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }
}
