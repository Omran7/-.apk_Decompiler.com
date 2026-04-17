package c1;

import A.h;
import B0.H;
import F3.k;
import H4.g;
import K.O;
import R2.b;
import S3.z;
import X4.d;
import Y4.D;
import Z4.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.v;
import androidx.fragment.app.C0286s;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.t;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.B;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.f0;
import d5.C0473f;
import d5.o;
import e0.C0478b;
import e1.C0483b;
import e1.C0484c;
import e5.C0509f;
import f.C0518i;
import h0.C0552a;
import i1.C0583b;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0589e;
import i3.C0590f;
import i3.C0592h;
import i3.C0595k;
import i3.n;
import i3.p;
import i3.q;
import j4.C0639o;
import j4.F;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import k.C0687T;
import k.C0740u;
import k.e1;
import l5.C0797a;
import m0.C0831x;
import m0.T;
import m0.a0;
import n3.C0861b;
import n3.C0866g;
import n3.G;
import q.C0928e;
import q3.j;
import s.e;
import t.C0976b;
import t3.C1007a;
import u3.C1031a;
import v.f;
import v3.C1048c;
import v3.l;
import v3.m;
import v3.s;

public final class i implements C0483b, q, p, C1007a {

    /* renamed from: e  reason: collision with root package name */
    public static i f5603e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5604a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5605b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5606c;
    public Object d;

    public /* synthetic */ i(int i2) {
        this.f5604a = i2;
    }

    public static i A(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new i(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    public static void O(HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new RuntimeException("connection failed: missing header field in server handshake: Upgrade");
        } else if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new RuntimeException("connection failed: missing header field in server handshake: Connection");
        }
    }

    public static void P(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new RuntimeException("connection failed: proxy authentication not supported");
        } else if (parseInt == 404) {
            throw new RuntimeException("connection failed: 404 not found");
        } else if (parseInt != 101) {
            throw new RuntimeException(a.f(parseInt, "connection failed: unknown status code "));
        }
    }

    public void B(C0588d dVar) {
        switch (this.f5604a) {
            case 2:
                c.s0(((t) this.d).f7081b.f7028I, (String) null, (String) null);
                return;
            default:
                return;
        }
    }

    public void F(u uVar) {
        if (uVar.isAllProcessSuccess) {
            o.setArmingObject(uVar.armingObject);
            b.w(false);
            b.M0(R.raw.arming_equipment);
            d dVar = (d) this.f5605b;
            if (dVar != null) {
                D d6 = (D) dVar.f4209b;
                d6.f4304o = true;
                C0639o oVar = (C0639o) dVar.f4210c;
                oVar.f9066b.Y(d6, 0);
                Iterator it2 = ((C0518i) oVar.f9065a).l().f5000c.v().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0286s sVar = (C0286s) it2.next();
                    if (sVar instanceof K4.o) {
                        K4.o oVar2 = (K4.o) sVar;
                        oVar2.Z();
                        oVar2.b0();
                        oVar2.a0();
                        break;
                    }
                }
            }
            if (((D) this.f5606c).f4294b == 15) {
                Q.b(59, o.getAccountObject().getId(), (long) b.N((C0473f) null));
                return;
            }
            return;
        }
        b.w(false);
        boolean z3 = uVar.isMaterialDataUpdated;
        Context context = (Context) this.d;
        if (!z3) {
            a.n(MyApplication.f7090a, R.string.no_enough_items_for_using, context, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, context, (String) null);
        }
    }

    public void G() {
        ((TypedArray) this.f5606c).recycle();
    }

    public void H(String str) {
        if (str != null) {
            this.f5605b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void I(e eVar, int i2, int i5, int i6) {
        eVar.getClass();
        int i7 = eVar.f11317b0;
        int i8 = eVar.f11319c0;
        eVar.f11317b0 = 0;
        eVar.f11319c0 = 0;
        eVar.O(i5);
        eVar.L(i6);
        if (i7 < 0) {
            eVar.f11317b0 = 0;
        } else {
            eVar.f11317b0 = i7;
        }
        if (i8 < 0) {
            eVar.f11319c0 = 0;
        } else {
            eVar.f11319c0 = i8;
        }
        e eVar2 = (e) this.d;
        eVar2.f11366t0 = i2;
        eVar2.U();
    }

    public i J(C0866g gVar) {
        j jVar;
        C1048c z3 = gVar.z();
        i iVar = this;
        while (z3 != null) {
            j jVar2 = (j) iVar.d;
            if (jVar2.f11097a.containsKey(z3)) {
                jVar = (j) jVar2.f11097a.get(z3);
            } else {
                jVar = new j();
            }
            i iVar2 = new i((Object) z3, (Object) iVar, (Object) jVar, 14);
            gVar = gVar.C();
            z3 = gVar.z();
            iVar = iVar2;
        }
        return iVar;
    }

    public String K(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String str2 = (String) this.d;
        if (str2 == null) {
            return str;
        }
        return o3.d.g(str2, " - ", str);
    }

    public void L(View view) {
        if (((ArrayList) this.d).remove(view)) {
            C0831x xVar = (C0831x) this.f5605b;
            T I6 = RecyclerView.I(view);
            if (I6 != null) {
                int i2 = I6.f9905p;
                RecyclerView recyclerView = xVar.f10067a;
                if (recyclerView.L()) {
                    I6.f9906q = i2;
                    recyclerView.f5387y0.add(I6);
                } else {
                    WeakHashMap weakHashMap = O.f1352a;
                    I6.f9893a.setImportantForAccessibility(i2);
                }
                I6.f9905p = 0;
            }
        }
    }

    public void M(e eVar) {
        ArrayList arrayList = (ArrayList) this.f5605b;
        arrayList.clear();
        int size = eVar.f11364q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            s.d dVar = (s.d) eVar.f11364q0.get(i2);
            int[] iArr = dVar.f11342p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.s0.f11577b = true;
    }

    public void N() {
        boolean z3;
        i iVar = (i) this.f5606c;
        if (iVar != null) {
            j jVar = (j) this.d;
            if (jVar.f11098b != null || !jVar.f11097a.isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
            j jVar2 = (j) iVar.d;
            HashMap hashMap = jVar2.f11097a;
            C1048c cVar = (C1048c) this.f5605b;
            boolean containsKey = hashMap.containsKey(cVar);
            HashMap hashMap2 = jVar2.f11097a;
            if (z3 && containsKey) {
                hashMap2.remove(cVar);
                iVar.N();
            } else if (!z3 && !containsKey) {
                hashMap2.put(cVar, jVar);
                iVar.N();
            }
        }
    }

    public void Q(String str) {
        String K6 = K(str, new Object[0]);
        System.currentTimeMillis();
        ((C1031a) this.f5606c).a(3, (String) this.f5605b, K6);
    }

    public void a(View view, int i2, boolean z3) {
        int i5;
        RecyclerView recyclerView = ((C0831x) this.f5605b).f10067a;
        if (i2 < 0) {
            i5 = recyclerView.getChildCount();
        } else {
            i5 = r(i2);
        }
        ((K4.u) this.f5606c).g(i5, z3);
        if (z3) {
            x(view);
        }
        recyclerView.addView(view, i5);
        RecyclerView.I(view);
    }

    public void b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z3) {
        int i5;
        RecyclerView recyclerView = ((C0831x) this.f5605b).f10067a;
        if (i2 < 0) {
            i5 = recyclerView.getChildCount();
        } else {
            i5 = r(i2);
        }
        ((K4.u) this.f5606c).g(i5, z3);
        if (z3) {
            x(view);
        }
        T I6 = RecyclerView.I(view);
        if (I6 != null) {
            if (I6.k() || I6.p()) {
                I6.f9899j &= -257;
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I6 + recyclerView.y());
            }
        }
        recyclerView.attachViewToParent(view, i5, layoutParams);
    }

    public j c() {
        String str;
        if (((String) this.f5605b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((Z0.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new j((String) this.f5605b, (byte[]) this.f5606c, (Z0.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void d(String str, Throwable th, Object... objArr) {
        if (y()) {
            String K6 = K(str, objArr);
            if (th != null) {
                StringBuilder b6 = C0928e.b(K6, "\n");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                b6.append(stringWriter.toString());
                K6 = b6.toString();
            }
            System.currentTimeMillis();
            ((C1031a) this.f5606c).a(1, (String) this.f5605b, K6);
        }
    }

    public void e(int i2) {
        T I6;
        int r6 = r(i2);
        ((K4.u) this.f5606c).m(r6);
        RecyclerView recyclerView = ((C0831x) this.f5605b).f10067a;
        View childAt = recyclerView.getChildAt(r6);
        if (!(childAt == null || (I6 = RecyclerView.I(childAt)) == null)) {
            if (!I6.k() || I6.p()) {
                I6.a(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + I6 + recyclerView.y());
            }
        }
        recyclerView.detachViewFromParent(r6);
    }

    public H f(C0595k kVar) {
        if (kVar.b() == null) {
            return b.W0(kVar);
        }
        String str = (String) this.f5605b;
        C0473f fVar = (C0473f) kVar.a(str).c(C0473f.class);
        this.f5606c = fVar;
        if (fVar == null || fVar.isUsed() || ((C0473f) this.f5606c).isSpouseUsed() || ((C0473f) this.f5606c).isForRent() || ((C0473f) this.f5606c).isForSale() || str.equals("--defaultEstate")) {
            return b.a();
        }
        kVar.a(str).d((Object) null);
        return b.W0(kVar);
    }

    public void g(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(K(str, new Object[0]));
        sb.append("\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        sb.append(stringWriter.toString());
        String sb2 = sb.toString();
        System.currentTimeMillis();
        ((C1031a) this.f5606c).a(4, (String) this.f5605b, sb2);
    }

    public Object get() {
        switch (this.f5604a) {
            case 1:
                return new p(new androidx.fragment.app.D(21), new v(21), (h1.b) ((k) this.f5605b).get(), (i1.i) ((e1) this.f5606c).get(), (i1.j) ((z) this.d).get());
            default:
                return new i1.d((Context) ((C0484c) this.f5605b).f7573a, (j1.d) ((C0797a) this.f5606c).get(), (C0583b) ((androidx.fragment.app.D) this.d).get());
        }
    }

    public v3.q h(l lVar, v3.q qVar, boolean z3) {
        int i2;
        int i5;
        s sVar = (s) this.d;
        if (sVar == null) {
            sVar = ((a0) this.f5606c).l();
        }
        a0 a0Var = (a0) this.f5605b;
        C0861b x6 = ((C0861b) ((G) a0Var.f9926c).f10250a).x((C0866g) a0Var.f9925b);
        s<v3.q> z4 = x6.z(C0866g.d);
        v3.q qVar2 = null;
        if (z4 == null) {
            if (sVar != null) {
                z4 = x6.v(sVar);
            }
            return qVar2;
        }
        for (v3.q qVar3 : z4) {
            if (z3) {
                i2 = lVar.compare(qVar, qVar3);
            } else {
                i2 = lVar.compare(qVar3, qVar);
            }
            if (i2 > 0) {
                if (qVar2 != null) {
                    if (z3) {
                        i5 = lVar.compare(qVar2, qVar3);
                    } else {
                        i5 = lVar.compare(qVar3, qVar2);
                    }
                    if (i5 >= 0) {
                    }
                }
                qVar2 = qVar3;
            }
        }
        return qVar2;
    }

    public void i(n3.j jVar, boolean z3) {
        if (z3) {
            jVar.f10286a.b(this);
        }
        Object[] array = ((j) this.d).f11097a.entrySet().toArray();
        for (Object obj : array) {
            Map.Entry entry = (Map.Entry) obj;
            new i((Object) (C1048c) entry.getKey(), (Object) this, (Object) (j) entry.getValue(), 14).i(jVar, true);
        }
    }

    public View j(int i2) {
        return ((C0831x) this.f5605b).f10067a.getChildAt(r(i2));
    }

    public int k() {
        return ((C0831x) this.f5605b).f10067a.getChildCount() - ((ArrayList) this.d).size();
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        F f6 = (F) this.d;
        if (dVar != null || !z3 || !cVar.b()) {
            f6.b(false, (C0473f) cVar.a((String) this.f5605b).f(C0473f.class));
        } else {
            f6.b(true, (C0473f) this.f5606c);
        }
    }

    public ColorStateList m(int i2) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f5606c;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateList = h.getColorStateList((Context) this.f5605b, resourceId)) == null) {
            return typedArray.getColorStateList(i2);
        }
        return colorStateList;
    }

    public Drawable n(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f5606c;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return typedArray.getDrawable(i2);
        }
        return b.J((Context) this.f5605b, resourceId);
    }

    public Drawable o(int i2) {
        int resourceId;
        Drawable d6;
        if (!((TypedArray) this.f5606c).hasValue(i2) || (resourceId = ((TypedArray) this.f5606c).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C0740u a6 = C0740u.a();
        Context context = (Context) this.f5605b;
        synchronized (a6) {
            d6 = a6.f9391a.d(context, resourceId, true);
        }
        return d6;
    }

    public Typeface p(int i2, int i5, C0687T t6) {
        int resourceId = ((TypedArray) this.f5606c).getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = B.p.f164a;
        Context context = (Context) this.f5605b;
        if (context.isRestricted()) {
            return null;
        }
        return B.p.b(context, resourceId, typedValue, i5, t6, true, false);
    }

    public byte[] q() {
        String str;
        URI uri = (URI) this.f5606c;
        String path = uri.getPath();
        String query = uri.getQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        if (query == null) {
            str = "";
        } else {
            str = "?".concat(query);
        }
        sb.append(str);
        String sb2 = sb.toString();
        String host = uri.getHost();
        if (uri.getPort() != -1) {
            StringBuilder b6 = C0928e.b(host, ":");
            b6.append(uri.getPort());
            host = b6.toString();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", (String) this.f5605b);
        HashMap hashMap = (HashMap) this.d;
        for (String str2 : hashMap.keySet()) {
            if (!linkedHashMap.containsKey(str2)) {
                linkedHashMap.put(str2, (String) hashMap.get(str2));
            }
        }
        String o6 = C0552a.o("GET ", sb2, " HTTP/1.1\r\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(o6);
        String str3 = new String();
        for (String str4 : linkedHashMap.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str4);
            sb4.append(": ");
            str3 = C0552a.r(sb4, (String) linkedHashMap.get(str4), "\r\n");
        }
        sb3.append(str3);
        byte[] bytes = o3.d.f(sb3.toString(), "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public int r(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((C0831x) this.f5605b).f10067a.getChildCount();
        int i5 = i2;
        while (i5 < childCount) {
            K4.u uVar = (K4.u) this.f5606c;
            int b6 = i2 - (i5 - uVar.b(i5));
            if (b6 == 0) {
                while (uVar.e(i5)) {
                    i5++;
                }
                return i5;
            }
            i5 += b6;
        }
        return -1;
    }

    public C0866g s() {
        boolean z3;
        C1048c cVar = (C1048c) this.f5605b;
        i iVar = (i) this.f5606c;
        if (iVar != null) {
            if (cVar != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            q3.l.c(z3);
            return iVar.s().v(cVar);
        } else if (cVar != null) {
            return new C0866g(cVar);
        } else {
            return C0866g.d;
        }
    }

    public View t(int i2) {
        return ((C0831x) this.f5605b).f10067a.getChildAt(i2);
    }

    public String toString() {
        String str;
        switch (this.f5604a) {
            case 12:
                return ((K4.u) this.f5606c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            case 14:
                C1048c cVar = (C1048c) this.f5605b;
                if (cVar == null) {
                    str = "<anon>";
                } else {
                    str = cVar.f12280a;
                }
                StringBuilder t6 = C0552a.t("", str, "\n");
                t6.append(((j) this.d).a("\t"));
                return t6.toString();
            case 20:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f5605b);
                sb.append('{');
                a0 a0Var = (a0) ((a0) this.f5606c).f9926c;
                String str2 = "";
                while (a0Var != null) {
                    Object obj = a0Var.f9925b;
                    sb.append(str2);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    a0Var = (a0) a0Var.f9926c;
                    str2 = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(C0587c cVar) {
        switch (this.f5604a) {
            case 2:
                boolean b6 = cVar.b();
                t tVar = (t) this.d;
                if (b6) {
                    d5.u uVar = (d5.u) cVar.f(d5.u.class);
                    if (uVar == null) {
                        c.s0(tVar.f7081b.f7028I, (String) null, (String) null);
                        return;
                    } else if (uVar.getAccountObject().isBannedFromSystem()) {
                        c.r0(tVar.f7081b.f7028I);
                        return;
                    } else if (uVar.getAccountObject().isNeedReview()) {
                        c.w0(tVar.f7081b.f7028I);
                        return;
                    } else {
                        o.setPlayerObject(uVar);
                        C0592h.b().e().E("Servers").E((String) this.f5605b).E("players").E((String) this.f5606c).E("accountObject").E("deviceId").I(K1.e.u()).addOnSuccessListener(new H4.e(this, 8));
                        return;
                    }
                } else {
                    c.s0(tVar.f7081b.f7028I, (String) null, (String) null);
                    return;
                }
            case 4:
                boolean g = cVar.g();
                B b7 = (B) this.f5606c;
                if (g) {
                    ArrayList arrayList = new ArrayList();
                    Integer num = (Integer) cVar.a(o.getAccountObject().getId()).f(Integer.class);
                    if (num == null || !(num.intValue() == 0 || num.intValue() == 1)) {
                        b7.c(false, false);
                        return;
                    }
                    C0586b c3 = cVar.c();
                    while (true) {
                        Iterator it2 = c3.f8276a;
                        boolean hasNext = it2.hasNext();
                        String str = (String) this.f5605b;
                        if (hasNext) {
                            v3.q qVar = (v3.q) it2.next();
                            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            m.t(qVar.f12305b);
                            String F = E6.F();
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            b5.j jVar = new b5.j("@gang", str, true, false);
                            b5.l lVar = new b5.l("@gang", MyApplication.f7090a.getApplicationContext().getString(R.string.gang));
                            C0590f E7 = C0592h.d().e().E(b.a0()).E("messages").E(F);
                            HashMap hashMap = new HashMap();
                            hashMap.put("chatData/@gang", lVar);
                            hashMap.put("chatMessages/@gang/" + (c.f5744o + E7.E("chatMessages").E("@gang").G().F()), jVar);
                            E7.J(hashMap).addOnSuccessListener(new g(F, taskCompletionSource, 5, false));
                            arrayList.add(taskCompletionSource.getTask());
                        } else {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("content", str);
                            hashMap2.put("unixTimeInMilli", n.f8294a);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            C0592h.d().e().E(b.a0()).E("gangs").E("gangMessages").E((String) this.d).G().I(hashMap2).addOnSuccessListener(new H4.e(taskCompletionSource2, 13));
                            arrayList.add(taskCompletionSource2.getTask());
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new H4.d((Object) this, 18));
                            return;
                        }
                    }
                } else {
                    b7.c(false, true);
                    return;
                }
                break;
            case zzaky.zzf.zzf /*6*/:
                if (cVar.b()) {
                    b.w(false);
                    a.n(MyApplication.f7090a, R.string.name_already_exist, (Context) ((A4.i) this.d).d, (String) null);
                    return;
                }
                android.support.v4.media.session.a.B0(2018, 7, 0, -1, new K(this, 5), o.getAccountObject().getId(), android.support.v4.media.session.a.z(), false);
                return;
            default:
                boolean b8 = cVar.b();
                f0 f0Var = (f0) this.d;
                if (b8) {
                    b.w(false);
                    a.n(MyApplication.f7090a, R.string.name_already_exist, f0Var.f7410b, (String) null);
                    return;
                }
                U.g(o.getAccountObject().getId(), f0Var.d, -f0Var.f7412e, new K(this, 8));
                return;
        }
    }

    public int v() {
        return ((C0831x) this.f5605b).f10067a.getChildCount();
    }

    public void w(Throwable th) {
        String str;
        if (th instanceof OutOfMemoryError) {
            str = "Firebase Database encountered an OutOfMemoryError. You may need to reduce the amount of data you are syncing to the client (e.g. by using queries or syncing a deeper path). See https://firebase.google.com/docs/database/ios/structure-data#best_practices_for_data_structure and https://firebase.google.com/docs/database/android/retrieve-data#filtering_data";
        } else if (th instanceof NoClassDefFoundError) {
            str = "A symbol that the Firebase Database SDK depends on failed to load. This usually indicates that your project includes an incompatible version of another Firebase dependency. If updating your dependencies to the latest version does not resolve this issue, please file a report at https://github.com/firebase/firebase-android-sdk";
        } else if (th instanceof C0589e) {
            str = "";
        } else {
            str = "Uncaught exception in Firebase Database runloop (21.0.0). If you are not already on the latest version of the Firebase SDKs, try updating your dependencies. Should this problem persist, please file a report at https://github.com/firebase/firebase-android-sdk";
        }
        ((i) this.f5606c).g(str, th);
        new Handler(((Context) ((d) this.d).f4209b).getMainLooper()).post(new j3.g(str, th, 0));
        ((q3.b) this.f5605b).shutdownNow();
    }

    public void x(View view) {
        ((ArrayList) this.d).add(view);
        C0831x xVar = (C0831x) this.f5605b;
        T I6 = RecyclerView.I(view);
        if (I6 != null) {
            int i2 = I6.f9906q;
            View view2 = I6.f9893a;
            if (i2 != -1) {
                I6.f9905p = i2;
            } else {
                WeakHashMap weakHashMap = O.f1352a;
                I6.f9905p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = xVar.f10067a;
            if (recyclerView.L()) {
                I6.f9906q = 4;
                recyclerView.f5387y0.add(I6);
                return;
            }
            WeakHashMap weakHashMap2 = O.f1352a;
            view2.setImportantForAccessibility(4);
        }
    }

    public boolean y() {
        if (C0928e.c(((C1031a) this.f5606c).f11848a) <= 0) {
            return true;
        }
        return false;
    }

    public boolean z(int i2, s.d dVar, f fVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int[] iArr = dVar.f11342p0;
        int i5 = iArr[0];
        C0976b bVar = (C0976b) this.f5606c;
        bVar.f11567a = i5;
        bVar.f11568b = iArr[1];
        bVar.f11569c = dVar.q();
        bVar.d = dVar.k();
        bVar.f11572i = false;
        bVar.f11573j = i2;
        if (bVar.f11567a == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVar.f11568b == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3 || dVar.f11310W <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z4 || dVar.f11310W <= 0.0f) {
            z6 = false;
        } else {
            z6 = true;
        }
        int[] iArr2 = dVar.f11346t;
        if (z5 && iArr2[0] == 4) {
            bVar.f11567a = 1;
        }
        if (z6 && iArr2[1] == 4) {
            bVar.f11568b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f11570e);
        dVar.L(bVar.f11571f);
        dVar.f11293E = bVar.h;
        dVar.I(bVar.g);
        bVar.f11573j = 0;
        return bVar.f11572i;
    }

    public /* synthetic */ i(int i2, Object obj, String str, String str2) {
        this.f5604a = i2;
        this.f5606c = obj;
        this.f5605b = str;
        this.d = str2;
    }

    public /* synthetic */ i(C0509f fVar, C0590f fVar2, String str, int i2) {
        this.f5604a = i2;
        this.d = fVar;
        this.f5606c = fVar2;
        this.f5605b = str;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i2) {
        this.f5604a = i2;
        this.f5605b = obj;
        this.f5606c = obj2;
        this.d = obj3;
    }

    public i(C0831x xVar) {
        this.f5604a = 12;
        this.f5605b = xVar;
        this.f5606c = new K4.u();
        this.d = new ArrayList();
    }

    public i(d dVar, i iVar) {
        this.f5604a = 10;
        this.d = dVar;
        this.f5606c = iVar;
        q3.b bVar = new q3.b(this, new C0478b(this));
        this.f5605b = bVar;
        bVar.setKeepAliveTime(3, TimeUnit.SECONDS);
    }

    public i(Context context, TypedArray typedArray) {
        this.f5604a = 11;
        this.f5605b = context;
        this.f5606c = typedArray;
    }

    public i(Context context, LocationManager locationManager) {
        this.f5604a = 8;
        this.d = new Object();
        this.f5605b = context;
        this.f5606c = locationManager;
    }

    public i(e eVar) {
        this.f5604a = 17;
        this.f5605b = new ArrayList();
        this.f5606c = new Object();
        this.d = eVar;
    }

    public i(String str) {
        this.f5604a = 20;
        a0 a0Var = new a0(24);
        this.f5606c = a0Var;
        this.d = a0Var;
        this.f5605b = str;
    }

    public i(t tVar, String str, String str2) {
        this.f5604a = 2;
        this.d = tVar;
        this.f5605b = str;
        this.f5606c = str2;
    }

    public i(String str, F f6) {
        this.f5604a = 5;
        this.f5605b = str;
        this.d = f6;
        this.f5606c = null;
    }

    private final void C(C0588d dVar) {
    }

    private final void D(C0588d dVar) {
    }

    private final void E(C0588d dVar) {
    }
}
