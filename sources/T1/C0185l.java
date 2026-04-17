package T1;

import B0.H;
import R2.b;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzhl;
import com.google.android.gms.internal.measurement.zzhm;
import d5.k;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.n;
import i3.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u4.C1034c;

/* renamed from: T1.l  reason: case insensitive filesystem */
public final class C0185l implements p {

    /* renamed from: a  reason: collision with root package name */
    public long f3370a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3371b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3372c;

    public C0185l(C0191n nVar, String str) {
        this.f3372c = nVar;
        I.d(str);
        this.f3371b = str;
        this.f3370a = -1;
    }

    public List a() {
        List list;
        C0191n nVar = (C0191n) this.f3372c;
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(this.f3370a);
        String str = this.f3371b;
        Cursor cursor = null;
        try {
            cursor = nVar.k0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, valueOf}, (String) null, (String) null, "rowid", "1000");
            if (cursor.moveToFirst()) {
                do {
                    boolean z3 = false;
                    long j6 = cursor.getLong(0);
                    long j7 = cursor.getLong(3);
                    if (cursor.getLong(5) == 1) {
                        z3 = true;
                    }
                    byte[] blob = cursor.getBlob(4);
                    if (j6 > this.f3370a) {
                        this.f3370a = j6;
                    }
                    try {
                        zzhl zzhl = (zzhl) C0162d0.U(zzhm.zze(), blob);
                        String string = cursor.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        zzhl.zzi(string);
                        zzhl.zzm(cursor.getLong(2));
                        arrayList.add(new C0182k(j6, j7, z3, (zzhm) zzhl.zzba()));
                    } catch (IOException e6) {
                        Z z4 = ((C0212u0) nVar.f398a).f3496r;
                        C0212u0.k(z4);
                        z4.f3172f.c("Data loss. Failed to merge raw event. appId", Z.w(str), e6);
                    }
                } while (cursor.moveToNext());
                list = arrayList;
            } else {
                list = Collections.emptyList();
            }
        } catch (SQLiteException e7) {
            Z z5 = ((C0212u0) nVar.f398a).f3496r;
            C0212u0.k(z5);
            z5.f3172f.c("Data loss. Error querying raw events batch. appId", Z.w(str), e7);
            list = arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public H f(C0595k kVar) {
        k kVar2 = (k) kVar.c(k.class);
        if (kVar2 == null) {
            return b.W0(kVar);
        }
        long j6 = this.f3370a;
        if (j6 < 0) {
            return b.a();
        }
        kVar2.setHealthCurrent(j6);
        kVar2.setHealthChangeTimeInMilli(n.f8294a);
        kVar.d(kVar2);
        return b.W0(kVar);
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        k kVar = (k) cVar.f(k.class);
        C1034c cVar2 = (C1034c) this.f3372c;
        if (dVar == null && z3 && cVar.b()) {
            if (this.f3371b.equals(o.getAccountObject().getId())) {
                o.setMainStatesObject(kVar);
            }
            if (cVar2 != null) {
                cVar2.h(true, kVar);
            }
        } else if (cVar2 != null) {
            cVar2.h(false, kVar);
        }
    }

    public C0185l(C0191n nVar, String str, long j6) {
        this.f3372c = nVar;
        I.d(str);
        this.f3371b = str;
        this.f3370a = nVar.g0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j6)}, -1);
    }

    public C0185l(long j6, String str, C1034c cVar) {
        this.f3370a = j6;
        this.f3372c = cVar;
        this.f3371b = str;
    }
}
