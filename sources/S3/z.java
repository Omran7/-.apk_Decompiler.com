package S3;

import B0.A;
import B0.C0003b;
import B0.C0004c;
import B0.C0005d;
import B0.D;
import B0.v;
import E.a;
import F3.d;
import G.c;
import G3.b;
import J2.o;
import J2.p;
import O2.f0;
import O2.r0;
import R2.i;
import T1.C0174h0;
import T1.C0212u0;
import T1.H;
import T1.Z;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.C0274f;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.K;
import androidx.fragment.app.O;
import androidx.fragment.app.U;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.internal.p002firebaseauthapi.zzbe;
import com.google.android.gms.internal.p002firebaseauthapi.zzcn;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import e1.C0483b;
import e3.F;
import e3.w;
import f3.C0526c;
import f3.C0528e;
import f3.C0529f;
import f3.C0540q;
import g3.n;
import i.C0571a;
import i.C0575e;
import i3.C0587c;
import i3.C0588d;
import j.r;
import j4.p0;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k1.C0758c;
import k3.f;
import k3.g;
import k3.h;
import k3.j;
import k3.l;
import k3.m;
import l3.q;
import l5.C0797a;
import n3.C0859D;
import n3.C0866g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.C0968f;
import s3.C0969g;
import t3.C1007a;
import t3.C1008b;
import v3.C1048c;
import v3.k;
import v3.s;
import z.t;
import z.u;
import z.x;
import z.y;

public final class z implements b, c, Continuation, C0483b, q, C1008b {

    /* renamed from: f  reason: collision with root package name */
    public static z f2709f;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2710a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2711b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2712c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f2713e;

    public /* synthetic */ z(int i2, boolean z3) {
        this.f2710a = i2;
    }

    public static m k(List list, Map map, Comparator comparator) {
        boolean z3;
        z zVar = new z(list, map);
        Collections.sort(list, comparator);
        l lVar = new l(list.size());
        int i2 = lVar.f9478b - 1;
        int size = list.size();
        while (i2 >= 0) {
            if ((lVar.f9477a & ((long) (1 << i2))) == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int pow = (int) Math.pow(2.0d, (double) i2);
            i2--;
            size -= pow;
            if (z3) {
                zVar.l(2, pow, size);
            } else {
                zVar.l(2, pow, size);
                size -= pow;
                zVar.l(1, pow, size);
            }
        }
        h hVar = (j) zVar.d;
        if (hVar == null) {
            hVar = g.f9470a;
        }
        return new m(hVar, comparator);
    }

    public static synchronized z w() {
        z zVar;
        synchronized (z.class) {
            try {
                if (f2709f == null) {
                    f2709f = new z(0);
                }
                zVar = f2709f;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return zVar;
    }

    public v3.m A(v3.m mVar, v3.m mVar2, A a6) {
        v3.m mVar3;
        if (mVar2.f12296a.h()) {
            mVar3 = new v3.m(k.f12295e, (v3.l) this.f2712c);
        } else {
            v3.m mVar4 = new v3.m(mVar2.f12296a.b(k.f12295e), mVar2.f12298c, mVar2.f12297b);
            Iterator it2 = mVar2.iterator();
            mVar3 = mVar4;
            while (it2.hasNext()) {
                v3.q qVar = (v3.q) it2.next();
                if (!C(qVar)) {
                    mVar3 = mVar3.v(qVar.f12304a, k.f12295e);
                }
            }
        }
        ((p0) this.f2711b).A(mVar, mVar3, a6);
        return mVar3;
    }

    public void B(O o6) {
        C0286s sVar = o6.f5048c;
        if (sVar.f5155J) {
            ((K) this.f2713e).e(sVar);
        }
        if (((O) ((HashMap) this.f2712c).put(sVar.f5177e, (Object) null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + sVar);
        }
    }

    public boolean C(v3.q qVar) {
        v3.l lVar = (v3.l) this.f2712c;
        if (lVar.compare((v3.q) this.d, qVar) > 0 || lVar.compare(qVar, (v3.q) this.f2713e) > 0) {
            return false;
        }
        return true;
    }

    public boolean D(C0571a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2711b).onActionItemClicked(s(aVar), new r((Context) this.f2712c, (a) menuItem));
    }

    public boolean E(C0571a aVar, j.k kVar) {
        C0575e s6 = s(aVar);
        n.j jVar = (n.j) this.f2713e;
        Menu menu = (Menu) jVar.get(kVar);
        if (menu == null) {
            menu = new j.z((Context) this.f2712c, kVar);
            jVar.put(kVar, menu);
        }
        return ((ActionMode.Callback) this.f2711b).onCreateActionMode(s6, menu);
    }

    public void F(J2.a aVar) {
        aVar.getClass();
        J2.q qVar = new J2.q(o.class, aVar.f1294a);
        HashMap hashMap = (HashMap) this.f2712c;
        if (hashMap.containsKey(qVar)) {
            J2.a aVar2 = (J2.a) hashMap.get(qVar);
            if (!aVar2.equals(aVar) || !aVar.equals(aVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
            }
            return;
        }
        hashMap.put(qVar, aVar);
    }

    public void G(J2.b bVar) {
        J2.r rVar = new J2.r(bVar.f1296a, o.class);
        HashMap hashMap = (HashMap) this.f2711b;
        if (hashMap.containsKey(rVar)) {
            J2.b bVar2 = (J2.b) hashMap.get(rVar);
            if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
            }
            return;
        }
        hashMap.put(rVar, bVar);
    }

    public void H(J2.j jVar) {
        jVar.getClass();
        J2.q qVar = new J2.q(p.class, jVar.f1309a);
        HashMap hashMap = (HashMap) this.f2713e;
        if (hashMap.containsKey(qVar)) {
            J2.j jVar2 = (J2.j) hashMap.get(qVar);
            if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
            }
            return;
        }
        hashMap.put(qVar, jVar);
    }

    public void I(J2.k kVar) {
        J2.r rVar = new J2.r(kVar.f1310a, p.class);
        HashMap hashMap = (HashMap) this.d;
        if (hashMap.containsKey(rVar)) {
            J2.k kVar2 = (J2.k) hashMap.get(rVar);
            if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
            }
            return;
        }
        hashMap.put(rVar, kVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:59|60|71) */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r6 = r0.f3496r;
        T1.C0212u0.k(r6);
        r6.f3172f.a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0123 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011b A[Catch:{ NumberFormatException | JSONException -> 0x0123 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle J() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.d
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L_0x0008
            goto L_0x014e
        L_0x0008:
            java.lang.Object r0 = r15.f2713e
            T1.h0 r0 = (T1.C0174h0) r0
            android.content.SharedPreferences r1 = r0.t()
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            java.lang.Object r2 = r15.f2711b
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x0142
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x0136 }
            r2.<init>()     // Catch:{ JSONException -> 0x0136 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0136 }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x0136 }
            r1 = 0
            r5 = r1
        L_0x002b:
            int r6 = r4.length()     // Catch:{ JSONException -> 0x0136 }
            if (r5 >= r6) goto L_0x0133
            org.json.JSONObject r6 = r4.getJSONObject(r5)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            java.lang.String r7 = "n"
            java.lang.String r7 = r6.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            java.lang.String r8 = "t"
            java.lang.String r8 = r6.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            int r9 = r8.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r10 = 1
            r11 = 100
            r12 = 2
            r13 = 3
            r14 = 4
            if (r9 == r11) goto L_0x0086
            r11 = 108(0x6c, float:1.51E-43)
            if (r9 == r11) goto L_0x007c
            r11 = 115(0x73, float:1.61E-43)
            if (r9 == r11) goto L_0x0072
            r11 = 3352(0xd18, float:4.697E-42)
            if (r9 == r11) goto L_0x0068
            r11 = 3445(0xd75, float:4.827E-42)
            if (r9 == r11) goto L_0x005e
            goto L_0x0090
        L_0x005e:
            java.lang.String r9 = "la"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0090
            r9 = r14
            goto L_0x0091
        L_0x0068:
            java.lang.String r9 = "ia"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0090
            r9 = r13
            goto L_0x0091
        L_0x0072:
            java.lang.String r9 = "s"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0090
            r9 = r1
            goto L_0x0091
        L_0x007c:
            java.lang.String r9 = "l"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0090
            r9 = r12
            goto L_0x0091
        L_0x0086:
            java.lang.String r9 = "d"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0090
            r9 = r10
            goto L_0x0091
        L_0x0090:
            r9 = -1
        L_0x0091:
            java.lang.String r11 = "v"
            if (r9 == 0) goto L_0x011b
            if (r9 == r10) goto L_0x010f
            if (r9 == r12) goto L_0x0103
            if (r9 == r13) goto L_0x00d7
            if (r9 == r14) goto L_0x00ab
            T1.Z r6 = r0.f3496r     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            T1.C0212u0.k(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            T1.X r6 = r6.f3172f     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            java.lang.String r7 = "Unrecognized persisted bundle type. Type"
            r6.b(r8, r7)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            goto L_0x012f
        L_0x00ab:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            T1.g r8 = r0.f3494p     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            T1.G r9 = T1.H.f2886W0     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            boolean r8 = r8.B(r3, r9)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            if (r8 == 0) goto L_0x012f
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            java.lang.String r6 = r6.getString(r11)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r8.<init>(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            int r6 = r8.length()     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            long[] r9 = new long[r6]     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r10 = r1
        L_0x00c8:
            if (r10 >= r6) goto L_0x00d3
            long r11 = r8.optLong(r10)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r9[r10] = r11     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            int r10 = r10 + 1
            goto L_0x00c8
        L_0x00d3:
            r2.putLongArray(r7, r9)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            goto L_0x012f
        L_0x00d7:
            com.google.android.gms.internal.measurement.zzqr.zzb()     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            T1.g r8 = r0.f3494p     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            T1.G r9 = T1.H.f2886W0     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            boolean r8 = r8.B(r3, r9)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            if (r8 == 0) goto L_0x012f
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            java.lang.String r6 = r6.getString(r11)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r8.<init>(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            int r6 = r8.length()     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            int[] r9 = new int[r6]     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r10 = r1
        L_0x00f4:
            if (r10 >= r6) goto L_0x00ff
            int r11 = r8.optInt(r10)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r9[r10] = r11     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            int r10 = r10 + 1
            goto L_0x00f4
        L_0x00ff:
            r2.putIntArray(r7, r9)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            goto L_0x012f
        L_0x0103:
            java.lang.String r6 = r6.getString(r11)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            long r8 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r2.putLong(r7, r8)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            goto L_0x012f
        L_0x010f:
            java.lang.String r6 = r6.getString(r11)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            double r8 = java.lang.Double.parseDouble(r6)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r2.putDouble(r7, r8)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            goto L_0x012f
        L_0x011b:
            java.lang.String r6 = r6.getString(r11)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            r2.putString(r7, r6)     // Catch:{ NumberFormatException | JSONException -> 0x0123 }
            goto L_0x012f
        L_0x0123:
            T1.Z r6 = r0.f3496r     // Catch:{ JSONException -> 0x0136 }
            T1.C0212u0.k(r6)     // Catch:{ JSONException -> 0x0136 }
            T1.X r6 = r6.f3172f     // Catch:{ JSONException -> 0x0136 }
            java.lang.String r7 = "Error reading value from SharedPreferences. Value dropped"
            r6.a(r7)     // Catch:{ JSONException -> 0x0136 }
        L_0x012f:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x0133:
            r15.d = r2     // Catch:{ JSONException -> 0x0136 }
            goto L_0x0142
        L_0x0136:
            T1.Z r0 = r0.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            T1.X r0 = r0.f3172f
            r0.a(r1)
        L_0x0142:
            java.lang.Object r0 = r15.d
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 != 0) goto L_0x014e
            java.lang.Object r0 = r15.f2712c
            android.os.Bundle r0 = (android.os.Bundle) r0
            r15.d = r0
        L_0x014e:
            android.os.Bundle r0 = new android.os.Bundle
            java.lang.Object r1 = r15.d
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.common.internal.I.g(r1)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.z.J():android.os.Bundle");
    }

    public C0528e K(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Object obj;
        C0529f a6;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z3 = jSONObject.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(C0526c.v(jSONArray3.getString(i2)));
            }
            C0528e eVar = new C0528e(i.f(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzahn zzb = zzahn.zzb(string);
                I.g(zzb);
                eVar.f7920a = zzb;
            }
            if (!z3) {
                eVar.f7926q = Boolean.FALSE;
            }
            eVar.f7925p = str;
            if (jSONObject.has("userMetadata") && (a6 = C0529f.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                eVar.f7927r = a6;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i5));
                    String optString = jSONObject2.optString("factorIdKey");
                    if ("phone".equals(optString)) {
                        obj = w.x(jSONObject2);
                    } else if (Objects.equals(optString, "totp")) {
                        obj = e3.z.x(jSONObject2);
                    } else {
                        obj = null;
                    }
                    arrayList2.add(obj);
                }
                eVar.z(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    arrayList3.add(F.w(new JSONObject(jSONArray.getString(i6))));
                }
                eVar.f7931v = arrayList3;
            }
            return eVar;
        } catch (JSONException e6) {
            e = e6;
            Log.wtf(((C1.a) this.f2713e).f430a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e7) {
            e = e7;
            Log.wtf(((C1.a) this.f2713e).f430a, e);
            return null;
        } catch (IllegalArgumentException e8) {
            e = e8;
            Log.wtf(((C1.a) this.f2713e).f430a, e);
            return null;
        } catch (zzaag e9) {
            e = e9;
            Log.wtf(((C1.a) this.f2713e).f430a, e);
            return null;
        }
    }

    public String L(String str) {
        String str2;
        String string = ((SharedPreferences) this.d).getString(str, (String) null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        C0540q a6 = C0540q.a((Context) this.f2712c, (String) this.f2711b);
        String substring = string.substring(10);
        a6.getClass();
        I.g(substring);
        zzmy zzmy = a6.f7952b;
        if (zzmy == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmy) {
                str2 = new String(((zzbe) a6.f7952b.zza().zza(zzcn.zza(), zzbe.class)).zza(Base64.decode(substring, 2), (byte[]) null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e6) {
            String message = e6.getMessage();
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + message);
            return null;
        }
    }

    public void M(String str, String str2) {
        String encodeToString;
        C0540q a6 = C0540q.a((Context) this.f2712c, (String) this.f2711b);
        a6.getClass();
        I.g(str2);
        zzmy zzmy = a6.f7952b;
        String str3 = null;
        if (zzmy == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (zzmy) {
                    encodeToString = Base64.encodeToString(((zzbe) a6.f7952b.zza().zza(zzcn.zza(), zzbe.class)).zzb(str2.getBytes(StandardCharsets.UTF_8), (byte[]) null), 2);
                }
                str3 = encodeToString;
            } catch (GeneralSecurityException e6) {
                String message = e6.getMessage();
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + message);
            }
        }
        if (str3 != null) {
            ((SharedPreferences) this.d).edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }

    public void N(Bundle bundle) {
        Bundle bundle2;
        Iterator<String> it2;
        Bundle bundle3 = bundle;
        if (bundle3 == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle3);
        }
        C0174h0 h0Var = (C0174h0) this.f2713e;
        SharedPreferences.Editor edit = h0Var.t().edit();
        int size = bundle2.size();
        String str = (String) this.f2711b;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it3 = bundle2.keySet().iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        zzqr.zzb();
                        C0212u0 u0Var = (C0212u0) h0Var.f398a;
                        boolean B6 = u0Var.f3494p.B((String) null, H.f2886W0);
                        it2 = it3;
                        Z z3 = u0Var.f3496r;
                        if (B6) {
                            try {
                                if (obj instanceof String) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", "s");
                                } else if (obj instanceof Long) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", "l");
                                } else if (obj instanceof int[]) {
                                    jSONObject.put("v", Arrays.toString((int[]) obj));
                                    jSONObject.put("t", "ia");
                                } else if (obj instanceof long[]) {
                                    jSONObject.put("v", Arrays.toString((long[]) obj));
                                    jSONObject.put("t", "la");
                                } else if (obj instanceof Double) {
                                    jSONObject.put("v", obj.toString());
                                    jSONObject.put("t", "d");
                                } else {
                                    C0212u0.k(z3);
                                    z3.f3172f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                    it3 = it2;
                                }
                            } catch (JSONException e6) {
                                e = e6;
                                Z z4 = ((C0212u0) h0Var.f398a).f3496r;
                                C0212u0.k(z4);
                                z4.f3172f.b(e, "Cannot serialize bundle value to SharedPreferences");
                                it3 = it2;
                            }
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                C0212u0.k(z3);
                                z3.f3172f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                it3 = it2;
                            }
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e7) {
                        e = e7;
                        it2 = it3;
                        Z z42 = ((C0212u0) h0Var.f398a).f3496r;
                        C0212u0.k(z42);
                        z42.f3172f.b(e, "Cannot serialize bundle value to SharedPreferences");
                        it3 = it2;
                    }
                    it3 = it2;
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.d = bundle2;
    }

    public synchronized void a(v vVar, B0.w wVar) {
        C0005d dVar = (C0005d) ((HashMap) this.f2712c).put(vVar, new C0005d(vVar, wVar, (ReferenceQueue) this.d));
        if (dVar != null) {
            dVar.f215c = null;
            dVar.clear();
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [S3.r, i3.f] */
    public void c(String str, String str2) {
        C0588d dVar;
        n3.m mVar;
        if (str != null) {
            dVar = C0588d.b(str, str2);
        } else {
            dVar = null;
        }
        C0866g gVar = (C0866g) this.f2711b;
        n3.m mVar2 = (n3.m) this.f2713e;
        n3.m.c(mVar2, "Transaction", gVar, dVar);
        ArrayList arrayList = new ArrayList();
        List<n3.l> list = (List) this.f2712c;
        if (dVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                mVar = (n3.m) this.d;
                if (!hasNext) {
                    break;
                }
                n3.l lVar = (n3.l) it2.next();
                lVar.d = 4;
                arrayList.addAll(mVar2.f10309n.c(lVar.f10295r, false, false, mVar2.f10300b));
                s sVar = lVar.f10298u;
                C0866g gVar2 = lVar.f10288a;
                arrayList2.add(new j3.g(lVar, new C0587c(new r(mVar, gVar2), v3.m.t(sVar)), 4));
                mVar2.m(new C0859D(mVar2, lVar.f10290c, C0969g.a(gVar2)));
            }
            mVar2.l(mVar2.f10303f.J(gVar));
            c1.i iVar = mVar2.f10303f;
            mVar2.l(iVar);
            mVar2.p(iVar);
            mVar.k(arrayList);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                mVar2.j((Runnable) arrayList2.get(i2));
            }
            return;
        }
        if (dVar.f8281a == -1) {
            for (n3.l lVar2 : list) {
                if (lVar2.d == 5) {
                    lVar2.d = 6;
                } else {
                    lVar2.d = 2;
                }
            }
        } else {
            for (n3.l lVar3 : list) {
                lVar3.d = 6;
                lVar3.f10294q = dVar;
            }
        }
        mVar2.n(gVar);
    }

    public void d() {
        View view = (View) this.f2711b;
        view.clearAnimation();
        ((ViewGroup) this.f2712c).endViewTransition(view);
        ((C0274f) this.d).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.f2713e) + " has been cancelled.");
        }
    }

    public void e(C0286s sVar) {
        if (!((ArrayList) this.f2711b).contains(sVar)) {
            synchronized (((ArrayList) this.f2711b)) {
                ((ArrayList) this.f2711b).add(sVar);
            }
            sVar.f5183t = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + sVar);
    }

    public void f(Object obj, Object obj2, f0 f0Var, boolean z3) {
        byte[] array;
        if (((ConcurrentHashMap) this.f2712c) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        } else if (f0Var.F() == O2.Z.ENABLED) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f2712c;
            Integer valueOf = Integer.valueOf(f0Var.D());
            byte[] bArr = null;
            if (f0Var.E() == r0.RAW) {
                valueOf = null;
            }
            C2.b a6 = J2.i.f1307b.a(o.l(f0Var.C().D(), f0Var.C().E(), f0Var.C().C(), f0Var.E(), valueOf));
            int ordinal = f0Var.E().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        array = C2.b.f433a;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                array = ByteBuffer.allocate(5).put((byte) 0).putInt(f0Var.D()).array();
            } else {
                array = ByteBuffer.allocate(5).put((byte) 1).putInt(f0Var.D()).array();
            }
            C2.k kVar = new C2.k(obj, obj2, array, f0Var.F(), f0Var.E(), f0Var.D(), f0Var.C().D(), a6);
            ArrayList arrayList = new ArrayList();
            arrayList.add(kVar);
            byte[] bArr2 = kVar.f446c;
            if (bArr2 != null) {
                bArr = Arrays.copyOf(bArr2, bArr2.length);
            }
            C2.l lVar = new C2.l(bArr);
            List list = (List) concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(kVar);
                concurrentHashMap.put(lVar, Collections.unmodifiableList(arrayList2));
            }
            if (!z3) {
                return;
            }
            if (((C2.k) this.d) == null) {
                this.d = kVar;
                return;
            }
            throw new IllegalStateException("you cannot set two primary primitives");
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public v3.m g(v3.m mVar, C1048c cVar, s sVar, C0866g gVar, C1007a aVar, A a6) {
        if (!C(new v3.q(cVar, sVar))) {
            sVar = k.f12295e;
        }
        return ((p0) this.f2711b).g(mVar, cVar, sVar, gVar, aVar, a6);
    }

    public Object get() {
        switch (this.f2710a) {
            case 3:
                return new d((K3.b) ((G3.c) this.f2711b).f840a, (K3.b) ((G3.c) this.f2712c).f840a, (n) ((G3.c) this.d).f840a, (Executor) ((G3.c) this.f2713e).f840a);
            default:
                return new i1.j((Executor) ((C0797a) this.f2711b).get(), (j1.d) ((C0797a) this.f2712c).get(), (i1.d) ((c1.i) this.d).get(), (C0758c) ((C0797a) this.f2713e).get());
        }
    }

    public K2.k h() {
        Integer num = (Integer) this.f2711b;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        } else if (((Integer) this.f2712c) == null) {
            throw new GeneralSecurityException("tag size is not set");
        } else if (((K2.d) this.d) == null) {
            throw new GeneralSecurityException("hash type is not set");
        } else if (((K2.d) this.f2713e) == null) {
            throw new GeneralSecurityException("variant is not set");
        } else if (num.intValue() >= 16) {
            Integer num2 = (Integer) this.f2712c;
            int intValue = num2.intValue();
            K2.d dVar = (K2.d) this.d;
            if (intValue >= 10) {
                if (dVar == K2.d.g) {
                    if (intValue > 20) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[]{num2}));
                    }
                } else if (dVar == K2.d.h) {
                    if (intValue > 28) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[]{num2}));
                    }
                } else if (dVar == K2.d.f1472i) {
                    if (intValue > 32) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[]{num2}));
                    }
                } else if (dVar == K2.d.f1473j) {
                    if (intValue > 48) {
                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[]{num2}));
                    }
                } else if (dVar != K2.d.f1474k) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                } else if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[]{num2}));
                }
                return new K2.k(((Integer) this.f2711b).intValue(), ((Integer) this.f2712c).intValue(), (K2.d) this.f2713e, (K2.d) this.d);
            }
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{num2}));
        } else {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[]{(Integer) this.f2711b}));
        }
    }

    public h i(int i2, int i5) {
        if (i5 == 0) {
            return g.f9470a;
        }
        Map map = (Map) this.f2712c;
        List list = (List) this.f2711b;
        if (i5 == 1) {
            Object obj = list.get(i2);
            return new f(obj, map.get(obj), (h) null, (h) null);
        }
        int i6 = i5 / 2;
        int i7 = i2 + i6;
        h i8 = i(i2, i6);
        h i9 = i(i7 + 1, i6);
        Object obj2 = list.get(i7);
        return new f(obj2, map.get(obj2), i8, i9);
    }

    public p0 j() {
        return (p0) this.f2711b;
    }

    public void l(int i2, int i5, int i6) {
        j jVar;
        h i7 = i(i6 + 1, i5 - 1);
        Object obj = ((List) this.f2711b).get(i6);
        Map map = (Map) this.f2712c;
        if (i2 == 1) {
            jVar = new j(obj, map.get(obj), (h) null, i7);
        } else {
            jVar = new f(obj, map.get(obj), (h) null, i7);
        }
        if (((j) this.d) == null) {
            this.d = jVar;
            this.f2713e = jVar;
            return;
        }
        ((j) this.f2713e).r(jVar);
        this.f2713e = jVar;
    }

    public boolean m() {
        return true;
    }

    public v3.l n() {
        return (v3.l) this.f2712c;
    }

    public void o(C0005d dVar) {
        synchronized (this) {
            ((HashMap) this.f2712c).remove(dVar.f213a);
            if (dVar.f214b) {
                D d6 = dVar.f215c;
                if (d6 != null) {
                    ((B0.q) this.f2713e).e(dVar.f213a, new B0.w(d6, true, false, dVar.f213a, (B0.q) this.f2713e));
                }
            }
        }
    }

    public void p(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((n.j) this.f2712c).get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        p(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public C0286s q(String str) {
        O o6 = (O) ((HashMap) this.f2712c).get(str);
        if (o6 != null) {
            return o6.f5048c;
        }
        return null;
    }

    public C0286s r(String str) {
        for (O o6 : ((HashMap) this.f2712c).values()) {
            if (o6 != null) {
                C0286s sVar = o6.f5048c;
                if (!str.equals(sVar.f5177e)) {
                    sVar = sVar.f5149C.f5000c.r(str);
                }
                if (sVar != null) {
                    return sVar;
                }
            }
        }
        return null;
    }

    public C0575e s(C0571a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0575e eVar = (C0575e) arrayList.get(i2);
            if (eVar != null && eVar.f8192b == aVar) {
                return eVar;
            }
        }
        C0575e eVar2 = new C0575e((Context) this.f2712c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (O o6 : ((HashMap) this.f2712c).values()) {
            if (o6 != null) {
                arrayList.add(o6);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r9v12, types: [java.lang.Object, J2.o] */
    public Object then(Task task) {
        o oVar;
        o oVar2;
        switch (this.f2710a) {
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                RecaptchaAction recaptchaAction = (RecaptchaAction) this.f2712c;
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.d;
                String str = (String) this.f2711b;
                com.mtma.criminal.city.utils.K k6 = (com.mtma.criminal.city.utils.K) this.f2713e;
                if (task.isSuccessful()) {
                    return Tasks.forResult(task.getResult());
                }
                Exception exception = task.getException();
                I.g(exception);
                if (zzaei.zzd(exception)) {
                    if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
                        Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
                    }
                    synchronized (firebaseAuth) {
                        oVar = firebaseAuth.f6868j;
                    }
                    if (oVar == null) {
                        i iVar = firebaseAuth.f6862a;
                        Object obj = new Object();
                        ? obj2 = new Object();
                        obj2.f1317a = new Object();
                        obj2.f1318b = new HashMap();
                        obj2.d = iVar;
                        obj2.f1320e = firebaseAuth;
                        obj2.f1321f = obj;
                        synchronized (firebaseAuth) {
                            firebaseAuth.f6868j = obj2;
                        }
                    }
                    synchronized (firebaseAuth) {
                        oVar2 = firebaseAuth.f6868j;
                    }
                    Task t6 = oVar2.t(str, Boolean.FALSE, recaptchaAction);
                    return t6.continueWithTask(k6).continueWithTask(new z(str, oVar2, recaptchaAction, k6, 12));
                }
                String valueOf = String.valueOf(recaptchaAction);
                String message = exception.getMessage();
                Log.e("RecaptchaCallWrapper", "Initial task failed for action " + valueOf + "with exception - " + message);
                return Tasks.forException(exception);
            default:
                if (task.isSuccessful()) {
                    return task;
                }
                Exception exception2 = task.getException();
                I.g(exception2);
                if (!zzaei.zzc(exception2)) {
                    return task;
                }
                boolean isLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
                String str2 = (String) this.f2711b;
                if (isLoggable) {
                    Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str2);
                }
                return ((o) this.f2712c).t(str2, Boolean.TRUE, (RecaptchaAction) this.d).continueWithTask((com.mtma.criminal.city.utils.K) this.f2713e);
        }
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (O o6 : ((HashMap) this.f2712c).values()) {
            if (o6 != null) {
                arrayList.add(o6.f5048c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public List v() {
        ArrayList arrayList;
        if (((ArrayList) this.f2711b).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f2711b)) {
            arrayList = new ArrayList((ArrayList) this.f2711b);
        }
        return arrayList;
    }

    public boolean x(Context context) {
        boolean z3;
        if (((Boolean) this.d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.d = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f2712c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean y(Context context) {
        boolean z3;
        if (((Boolean) this.f2712c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f2712c = Boolean.valueOf(z3);
        }
        if (!((Boolean) this.f2712c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f2712c).booleanValue();
    }

    public void z(O o6) {
        C0286s sVar = o6.f5048c;
        String str = sVar.f5177e;
        HashMap hashMap = (HashMap) this.f2712c;
        if (hashMap.get(str) == null) {
            hashMap.put(sVar.f5177e, o6);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Added fragment to active set " + sVar);
            }
        }
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f2710a = i2;
        this.f2711b = obj;
        this.f2712c = obj2;
        this.d = obj3;
        this.f2713e = obj4;
    }

    public z(C0174h0 h0Var, String str) {
        this.f2710a = 6;
        this.f2713e = h0Var;
        I.d(str);
        this.f2711b = str;
        this.f2712c = new Bundle();
    }

    public z(C0968f fVar) {
        v3.q qVar;
        v3.q qVar2;
        this.f2710a = 19;
        v3.l lVar = fVar.g;
        this.f2711b = new p0(lVar, 17);
        this.f2712c = lVar;
        if (!fVar.e()) {
            qVar = v3.q.f12303c;
        } else if (fVar.e()) {
            C1048c cVar = fVar.d;
            cVar = cVar == null ? C1048c.f12278b : cVar;
            v3.l lVar2 = fVar.g;
            if (fVar.e()) {
                qVar = lVar2.c(cVar, fVar.f11535c);
            } else {
                throw new IllegalArgumentException("Cannot get index start value if start has not been set");
            }
        } else {
            throw new IllegalArgumentException("Cannot get index start name if start has not been set");
        }
        this.d = qVar;
        if (!fVar.c()) {
            qVar2 = fVar.g.d();
        } else if (fVar.c()) {
            C1048c cVar2 = fVar.f11537f;
            cVar2 = cVar2 == null ? C1048c.f12279c : cVar2;
            v3.l lVar3 = fVar.g;
            if (fVar.c()) {
                qVar2 = lVar3.c(cVar2, fVar.f11536e);
            } else {
                throw new IllegalArgumentException("Cannot get index end value if start has not been set");
            }
        } else {
            throw new IllegalArgumentException("Cannot get index end name if start has not been set");
        }
        this.f2713e = qVar2;
    }

    public z(J2.s sVar) {
        this.f2710a = 4;
        this.f2711b = new HashMap(sVar.f1327a);
        this.f2712c = new HashMap(sVar.f1328b);
        this.d = new HashMap(sVar.f1329c);
        this.f2713e = new HashMap(sVar.d);
    }

    public z(z.q qVar) {
        Icon icon;
        Bundle bundle;
        int i2;
        ArrayList arrayList;
        Bundle bundle2;
        int i5;
        z.q qVar2 = qVar;
        this.f2710a = 21;
        new ArrayList();
        this.f2713e = new Bundle();
        this.d = qVar2;
        Context context = qVar2.f12768a;
        this.f2711b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2712c = z.v.a(context, qVar2.f12781q);
        } else {
            this.f2712c = new Notification.Builder(qVar2.f12768a);
        }
        Notification notification = qVar2.f12783s;
        int i6 = 0;
        ((Notification.Builder) this.f2712c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qVar2.f12771e).setContentText(qVar2.f12772f).setContentInfo((CharSequence) null).setContentIntent(qVar2.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : true).setNumber(qVar2.f12773i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f2712c;
        IconCompat iconCompat = qVar2.h;
        if (iconCompat == null) {
            icon = null;
        } else {
            icon = D.c.c(iconCompat, context);
        }
        t.b(builder, icon);
        ((Notification.Builder) this.f2712c).setSubText((CharSequence) null).setUsesChronometer(false).setPriority(qVar2.f12774j);
        Iterator it2 = qVar2.f12769b.iterator();
        while (it2.hasNext()) {
            z.k kVar = (z.k) it2.next();
            if (kVar.f12761b == null && (i5 = kVar.f12763e) != 0) {
                kVar.f12761b = IconCompat.b(i5);
            }
            IconCompat iconCompat2 = kVar.f12761b;
            Notification.Action.Builder a6 = t.a(iconCompat2 != null ? D.c.c(iconCompat2, (Context) null) : null, kVar.f12764f, kVar.g);
            Bundle bundle3 = kVar.f12760a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z3 = kVar.f12762c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z3);
            int i7 = Build.VERSION.SDK_INT;
            u.a(a6, z3);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                z.w.b(a6, 0);
            }
            if (i7 >= 29) {
                x.c(a6, false);
            }
            if (i7 >= 31) {
                y.a(a6, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", kVar.d);
            z.r.b(a6, bundle2);
            z.r.a((Notification.Builder) this.f2712c, z.r.d(a6));
        }
        Bundle bundle4 = qVar2.f12778n;
        if (bundle4 != null) {
            ((Bundle) this.f2713e).putAll(bundle4);
        }
        int i8 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f2712c).setShowWhen(qVar2.f12775k);
        z.r.i((Notification.Builder) this.f2712c, qVar2.f12777m);
        z.r.g((Notification.Builder) this.f2712c, (String) null);
        z.r.j((Notification.Builder) this.f2712c, (String) null);
        z.r.h((Notification.Builder) this.f2712c, false);
        z.s.b((Notification.Builder) this.f2712c, (String) null);
        z.s.c((Notification.Builder) this.f2712c, qVar2.f12779o);
        z.s.f((Notification.Builder) this.f2712c, qVar2.f12780p);
        z.s.d((Notification.Builder) this.f2712c, (Notification) null);
        z.s.e((Notification.Builder) this.f2712c, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList2 = qVar2.f12784t;
        ArrayList arrayList3 = qVar2.f12770c;
        if (i8 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    throw o3.d.e(it3);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    n.f fVar = new n.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList<>(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (String a7 : arrayList2) {
                z.s.a((Notification.Builder) this.f2712c, a7);
            }
        }
        ArrayList arrayList4 = qVar2.d;
        if (arrayList4.size() > 0) {
            if (qVar2.f12778n == null) {
                qVar2.f12778n = new Bundle();
            }
            Bundle bundle5 = qVar2.f12778n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList4.size()) {
                String num = Integer.toString(i9);
                z.k kVar2 = (z.k) arrayList4.get(i9);
                Bundle bundle8 = new Bundle();
                if (kVar2.f12761b == null && (i2 = kVar2.f12763e) != 0) {
                    kVar2.f12761b = IconCompat.b(i2);
                }
                IconCompat iconCompat3 = kVar2.f12761b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i6);
                bundle8.putCharSequence("title", kVar2.f12764f);
                bundle8.putParcelable("actionIntent", kVar2.g);
                Bundle bundle9 = kVar2.f12760a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", kVar2.f12762c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", (Parcelable[]) null);
                bundle8.putBoolean("showsUserInterface", kVar2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i9++;
                i6 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (qVar2.f12778n == null) {
                qVar2.f12778n = new Bundle();
            }
            qVar2.f12778n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f2713e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i10 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f2712c).setExtras(qVar2.f12778n);
        u.e((Notification.Builder) this.f2712c, (CharSequence[]) null);
        if (i10 >= 26) {
            z.v.b((Notification.Builder) this.f2712c, 0);
            z.v.e((Notification.Builder) this.f2712c, (CharSequence) null);
            z.v.f((Notification.Builder) this.f2712c, (String) null);
            z.v.g((Notification.Builder) this.f2712c, 0);
            z.v.d((Notification.Builder) this.f2712c, 0);
            if (!TextUtils.isEmpty(qVar2.f12781q)) {
                ((Notification.Builder) this.f2712c).setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i10 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                throw o3.d.e(it4);
            }
        }
        if (i10 >= 29) {
            x.a((Notification.Builder) this.f2712c, qVar2.f12782r);
            x.b((Notification.Builder) this.f2712c, (Notification.BubbleMetadata) null);
        }
    }

    public v3.m b(v3.m mVar, s sVar) {
        return mVar;
    }

    public z(Typeface typeface, V.b bVar) {
        int i2;
        int i5;
        this.f2710a = 7;
        this.f2713e = typeface;
        this.f2711b = bVar;
        this.d = new androidx.emoji2.text.q(1024);
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i6 = a6 + bVar.f1342a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f2712c = new char[(i2 * 2)];
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i7 = a7 + bVar.f1342a;
            i5 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i7) + i7);
        } else {
            i5 = 0;
        }
        for (int i8 = 0; i8 < i5; i8++) {
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(this, i8);
            V.a c3 = tVar.c();
            int a8 = c3.a(4);
            Character.toChars(a8 != 0 ? ((ByteBuffer) c3.d).getInt(a8 + c3.f1342a) : 0, (char[]) this.f2712c, i8 * 2);
            com.bumptech.glide.c.b("invalid metadata codepoint length", tVar.b() > 0);
            ((androidx.emoji2.text.q) this.d).a(tVar, 0, tVar.b() - 1);
        }
    }

    public z(int i2) {
        this.f2710a = i2;
        switch (i2) {
            case 1:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C0003b(0));
                this.f2712c = new HashMap();
                this.d = new ReferenceQueue();
                this.f2711b = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new C0004c((Object) this, 0));
                return;
            case 4:
                this.f2711b = new HashMap();
                this.f2712c = new HashMap();
                this.d = new HashMap();
                this.f2713e = new HashMap();
                return;
            case 9:
                this.f2711b = new ArrayList();
                this.f2712c = new HashMap();
                this.d = new HashMap();
                return;
            case 18:
                this.f2711b = new n.j(0);
                this.f2712c = new SparseArray();
                this.d = new n.g();
                this.f2713e = new n.j(0);
                return;
            case 20:
                this.f2711b = new J.b(10);
                this.f2712c = new n.j(0);
                this.d = new ArrayList();
                this.f2713e = new HashSet();
                return;
            default:
                this.f2711b = null;
                this.f2712c = null;
                this.d = null;
                this.f2713e = new ArrayDeque();
                return;
        }
    }

    public z(Context context, ActionMode.Callback callback) {
        this.f2710a = 14;
        this.f2712c = context;
        this.f2711b = callback;
        this.d = new ArrayList();
        this.f2713e = new n.j(0);
    }

    public z(List list, Map map) {
        this.f2710a = 16;
        this.f2711b = list;
        this.f2712c = map;
    }

    public z(Class cls) {
        this.f2710a = 2;
        this.f2712c = new ConcurrentHashMap();
        this.f2711b = cls;
        this.f2713e = M2.a.f1819b;
    }

    public z(n3.m mVar, C0866g gVar, List list, n3.m mVar2) {
        this.f2710a = 17;
        this.f2713e = mVar;
        this.f2711b = gVar;
        this.f2712c = list;
        this.d = mVar2;
    }
}
