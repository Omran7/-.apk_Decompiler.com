package K4;

import R2.b;
import Z0.d;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import b5.k;
import c1.j;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import j1.e;
import m1.C0834a;

public final /* synthetic */ class t implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f1608a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1609b;

    public /* synthetic */ t(long j6, j jVar) {
        this.f1608a = j6;
        this.f1609b = jVar;
    }

    public void a(boolean z3, boolean z4) {
        v vVar = (v) ((u) this.f1609b).f1612c;
        if (z3) {
            b.w(false);
            v0.e(vVar.f1626d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
            b.M0(R.raw.money_pay);
            String id = o.getAccountObject().getId();
            String str = vVar.f1627e0;
            String str2 = vVar.f1628f0;
            long j6 = this.f1608a;
            c.k0(id, new k(7, str, str2, j6));
            c.k0(vVar.f1627e0, new k(8, o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), j6));
            Q.b(91, o.getAccountObject().getId(), (long) 1);
            return;
        }
        b.w(false);
        if (!z4) {
            c.x0(vVar.f1626d0);
            return;
        }
        a.n(MyApplication.f7090a, R.string.unknown_error_try_again, vVar.f1626d0, (String) null);
    }

    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1608a));
        j jVar = (j) this.f1609b;
        String str = jVar.f5607a;
        d dVar = jVar.f5609c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(C0834a.a(dVar))}) < 1) {
            contentValues.put("backend_name", jVar.f5607a);
            contentValues.put("priority", Integer.valueOf(C0834a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    public /* synthetic */ t(u uVar, long j6) {
        this.f1609b = uVar;
        this.f1608a = j6;
    }
}
