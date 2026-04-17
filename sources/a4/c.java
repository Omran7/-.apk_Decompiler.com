package A4;

import D2.l;
import J2.o;
import K3.a;
import S3.C0151l;
import a5.C0264a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import b5.b;
import c1.i;
import c1.j;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.utils.C0434d;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.T;
import d5.k;
import g3.C0549b;
import g3.d;
import i3.C0592h;
import j1.C0605a;
import j1.C0606b;
import j1.e;
import j1.f;
import j1.g;
import j4.E0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import k1.C0757b;

public final /* synthetic */ class c implements T, Continuation, d, J, a, C0757b, e, C0434d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f67a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f68b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f69c;

    public /* synthetic */ c(Object obj, Object obj2, int i2) {
        this.f67a = i2;
        this.f69c = obj;
        this.f68b = obj2;
    }

    /* JADX INFO: finally extract failed */
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        g gVar = (g) this.f69c;
        C0605a aVar = gVar.d;
        int i2 = aVar.f8797b;
        j jVar = (j) this.f68b;
        ArrayList k6 = gVar.k(sQLiteDatabase, jVar, i2);
        for (Z0.d dVar : Z0.d.values()) {
            if (dVar != jVar.f5609c) {
                int size = aVar.f8797b - k6.size();
                if (size <= 0) {
                    break;
                }
                i a6 = j.a();
                a6.H(jVar.f5607a);
                if (dVar != null) {
                    a6.d = dVar;
                    a6.f5606c = jVar.f5608b;
                    k6.addAll(gVar.k(sQLiteDatabase, a6.c(), size));
                } else {
                    throw new NullPointerException("Null priority");
                }
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i5 = 0; i5 < k6.size(); i5++) {
            sb.append(((C0606b) k6.get(i5)).f8800a);
            if (i5 < k6.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null);
        while (query.moveToNext()) {
            try {
                long j6 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j6));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j6), set);
                }
                set.add(new f(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = k6.listIterator();
        while (listIterator.hasNext()) {
            C0606b bVar = (C0606b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(bVar.f8800a))) {
                o c3 = bVar.f8802c.c();
                long j7 = bVar.f8800a;
                for (f fVar : (Set) hashMap.get(Long.valueOf(j7))) {
                    c3.i(fVar.f8803a, fVar.f8804b);
                }
                listIterator.set(new C0606b(j7, bVar.f8801b, c3.k()));
            }
        }
        return k6;
    }

    public Object b() {
        switch (this.f67a) {
            case zzaky.zzf.zzg /*7*/:
                g gVar = (g) ((i1.i) this.f69c).f8269c;
                gVar.getClass();
                Iterable iterable = (Iterable) this.f68b;
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                gVar.c().compileStatement("DELETE FROM events WHERE _id in " + g.n(iterable)).execute();
                return null;
            default:
                i1.i iVar = (i1.i) this.f69c;
                iVar.getClass();
                for (Map.Entry entry : ((HashMap) this.f68b).entrySet()) {
                    ((g) iVar.f8272i).l((long) ((Integer) entry.getValue()).intValue(), f1.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    public void c(boolean z3) {
        j jVar = (j) this.f69c;
        jVar.getClass();
        if (z3) {
            String id = d5.o.getAccountObject().getId();
            String str = (String) this.f68b;
            b bVar = new b(id, str);
            jVar.f94I0.E("playerAds").E(com.bumptech.glide.c.f5744o + jVar.f94I0.E("playerAds").G().F()).I(bVar).addOnSuccessListener(new d(jVar, str, 0));
            return;
        }
        R2.b.w(false);
        com.bumptech.glide.c.x0(jVar.f107d0);
    }

    public void d(int i2, boolean z3) {
        r4.j jVar = (r4.j) this.f69c;
        jVar.getClass();
        if (z3) {
            String F = com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "chats").E(jVar.f11261u0).G().F();
            com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "chats").E(jVar.f11261u0).E(com.bumptech.glide.c.f5744o + F).I((HashMap) this.f68b).addOnSuccessListener(new E0(jVar, i2, 1));
            return;
        }
        R2.b.w(false);
        if (i2 < 1) {
            jVar.f11252k0.setText(String.valueOf(0));
            jVar.X();
            return;
        }
        com.bumptech.glide.c.s0(jVar.f11245d0, (String) null, (String) null);
    }

    public Object f(o oVar) {
        String str;
        switch (this.f67a) {
            case 2:
                Context context = (Context) oVar.a(Context.class);
                switch (((l) this.f69c).f539a) {
                    case 13:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 14:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case 15:
                        int i2 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i2 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str = "embedded";
                                        break;
                                    } else {
                                        str = "";
                                        break;
                                    }
                                } else {
                                    str = "auto";
                                    break;
                                }
                            } else {
                                str = "watch";
                                break;
                            }
                        } else {
                            str = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            str = "";
                            break;
                        } else {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new U3.a((String) this.f68b, str);
            default:
                String str2 = (String) this.f68b;
                C0549b bVar = (C0549b) this.f69c;
                try {
                    Trace.beginSection(str2);
                    return bVar.f8017f.f(oVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    public void g(K3.b bVar) {
        ((a) this.f69c).g(bVar);
        ((a) this.f68b).g(bVar);
    }

    public void h(boolean z3, k kVar) {
        ((Z2.d) this.f69c).a(z3, ((C0264a) this.f68b).currentPlace, 0);
    }

    public Object then(Task task) {
        switch (this.f67a) {
            case 1:
                C0151l lVar = (C0151l) this.f69c;
                String str = (String) this.f68b;
                synchronized (lVar) {
                    ((n.e) lVar.f2684b).remove(str);
                }
                return task;
            default:
                C0429i iVar = (C0429i) this.f69c;
                iVar.getClass();
                if (!task.isSuccessful()) {
                    R2.b.w(false);
                    com.bumptech.glide.c.s0(iVar.f7194d0, MyApplication.f7090a.getApplicationContext().getString(R.string.unknown_error), (String) null);
                }
                return ((com.google.firebase.storage.f) this.f68b).e();
        }
    }

    public /* synthetic */ c(String str, int i2, Object obj) {
        this.f67a = i2;
        this.f68b = str;
        this.f69c = obj;
    }
}
