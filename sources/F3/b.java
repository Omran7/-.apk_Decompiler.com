package F3;

import J2.o;
import R2.i;
import S3.A;
import U3.c;
import android.content.SharedPreferences;
import android.support.v4.media.session.a;
import android.util.Log;
import c1.h;
import c1.j;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mtma.criminal.city.utils.C0448s;
import com.mtma.criminal.city.utils.J;
import d5.k;
import d5.u;
import g3.d;
import g3.p;
import h1.C0553a;
import j1.e;
import j1.g;
import java.util.concurrent.Executor;
import k1.C0757b;

public final /* synthetic */ class b implements SuccessContinuation, d, J, C0757b, e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f733b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f734c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Task task, d dVar, Task task2) {
        this.f732a = 0;
        this.f733b = task;
        this.d = dVar;
        this.f734c = task2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r6v10, types: [java.lang.Object, J2.o] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x007a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "bytes"
            java.lang.String r3 = "PRAGMA page_size"
            java.lang.String r4 = "PRAGMA page_count"
            r6 = 5
            r7 = 4
            r8 = 3
            f1.c r9 = f1.c.CACHE_FULL
            r10 = 2
            java.lang.Object r11 = r1.d
            r12 = 0
            java.lang.Object r13 = r1.f734c
            java.lang.Object r14 = r1.f733b
            r15 = 1
            int r0 = r1.f732a
            switch(r0) {
                case 5: goto L_0x0268;
                case 6: goto L_0x014e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            j1.g r14 = (j1.g) r14
            r14.getClass()
        L_0x0024:
            boolean r2 = r0.moveToNext()
            r5 = r13
            java.util.HashMap r5 = (java.util.HashMap) r5
            if (r2 == 0) goto L_0x008e
            java.lang.String r2 = r0.getString(r12)
            int r12 = r0.getInt(r15)
            f1.c r16 = f1.c.REASON_UNKNOWN
            if (r12 != 0) goto L_0x003d
        L_0x0039:
            r12 = r9
            r6 = r16
            goto L_0x0068
        L_0x003d:
            if (r12 != r15) goto L_0x0042
            f1.c r16 = f1.c.MESSAGE_TOO_OLD
            goto L_0x0039
        L_0x0042:
            if (r12 != r10) goto L_0x0047
            r6 = r9
            r12 = r6
            goto L_0x0068
        L_0x0047:
            if (r12 != r8) goto L_0x004c
            f1.c r16 = f1.c.PAYLOAD_TOO_BIG
            goto L_0x0039
        L_0x004c:
            if (r12 != r7) goto L_0x0051
            f1.c r16 = f1.c.MAX_RETRIES_REACHED
            goto L_0x0039
        L_0x0051:
            if (r12 != r6) goto L_0x0056
            f1.c r16 = f1.c.INVALID_PAYLOD
            goto L_0x0039
        L_0x0056:
            r6 = 6
            if (r12 != r6) goto L_0x005c
            f1.c r16 = f1.c.SERVER_ERROR
            goto L_0x0039
        L_0x005c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.String r12 = "SQLiteEventStore"
            java.lang.String r7 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            android.support.v4.media.session.a.o(r6, r12, r7)
            goto L_0x0039
        L_0x0068:
            long r8 = r0.getLong(r10)
            boolean r16 = r5.containsKey(r2)
            if (r16 != 0) goto L_0x007a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.put(r2, r7)
        L_0x007a:
            java.lang.Object r2 = r5.get(r2)
            java.util.List r2 = (java.util.List) r2
            f1.d r5 = new f1.d
            r5.<init>(r8, r6)
            r2.add(r5)
            r9 = r12
            r6 = 5
            r7 = 4
            r8 = 3
            r12 = 0
            goto L_0x0024
        L_0x008e:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r2 = r0.hasNext()
            r5 = r11
            S3.z r5 = (S3.z) r5
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r6 = f1.e.f7894c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r6 = r2.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            f1.e r7 = new f1.e
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r7.<init>(r6, r2)
            java.lang.Object r2 = r5.d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r7)
            goto L_0x0096
        L_0x00c9:
            l1.a r0 = r14.f8807b
            long r6 = r0.g()
            android.database.sqlite.SQLiteDatabase r2 = r14.c()
            r2.beginTransaction()
            r0 = 0
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0143 }
            java.lang.String r9 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r8 = r2.rawQuery(r9, r8)     // Catch:{ all -> 0x0143 }
            r8.moveToNext()     // Catch:{ all -> 0x0145 }
            long r9 = r8.getLong(r0)     // Catch:{ all -> 0x0145 }
            f1.g r0 = new f1.g     // Catch:{ all -> 0x0145 }
            r0.<init>(r9, r6)     // Catch:{ all -> 0x0145 }
            r8.close()     // Catch:{ all -> 0x0143 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0143 }
            r2.endTransaction()
            r5.f2712c = r0
            android.database.sqlite.SQLiteDatabase r0 = r14.c()
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r4)
            long r6 = r0.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r0 = r14.c()
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r3)
            long r2 = r0.simpleQueryForLong()
            long r2 = r2 * r6
            j1.a r0 = j1.C0605a.f8795f
            f1.f r4 = new f1.f
            long r6 = r0.f8796a
            r4.<init>(r2, r6)
            f1.b r0 = new f1.b
            r0.<init>(r4)
            r5.f2713e = r0
            l5.a r0 = r14.f8809e
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r5.f2711b = r0
            f1.a r0 = new f1.a
            java.lang.Object r2 = r5.f2712c
            f1.g r2 = (f1.g) r2
            java.lang.Object r3 = r5.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Object r4 = r5.f2713e
            f1.b r4 = (f1.b) r4
            java.lang.Object r5 = r5.f2711b
            java.lang.String r5 = (java.lang.String) r5
            r0.<init>(r2, r3, r4, r5)
            return r0
        L_0x0143:
            r0 = move-exception
            goto L_0x014a
        L_0x0145:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x014a:
            r2.endTransaction()
            throw r0
        L_0x014e:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            j1.g r14 = (j1.g) r14
            r14.getClass()
        L_0x0157:
            boolean r3 = r0.moveToNext()
            if (r3 == 0) goto L_0x0266
            r3 = 0
            long r4 = r0.getLong(r3)
            r3 = 7
            int r3 = r0.getInt(r3)
            if (r3 == 0) goto L_0x016b
            r3 = r15
            goto L_0x016c
        L_0x016b:
            r3 = 0
        L_0x016c:
            J2.o r6 = new J2.o
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r6.f1320e = r7
            java.lang.String r7 = r0.getString(r15)
            if (r7 == 0) goto L_0x025e
            r6.f1317a = r7
            long r7 = r0.getLong(r10)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.f1319c = r7
            r7 = 3
            long r8 = r0.getLong(r7)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.d = r8
            if (r3 == 0) goto L_0x01b8
            c1.l r3 = new c1.l
            r8 = 4
            java.lang.String r9 = r0.getString(r8)
            if (r9 != 0) goto L_0x01a4
            Z0.c r8 = j1.g.f8805f
        L_0x01a2:
            r9 = 5
            goto L_0x01aa
        L_0x01a4:
            Z0.c r8 = new Z0.c
            r8.<init>(r9)
            goto L_0x01a2
        L_0x01aa:
            byte[] r12 = r0.getBlob(r9)
            r3.<init>(r8, r12)
            r6.f1318b = r3
            r19 = r14
        L_0x01b5:
            r1 = 6
            goto L_0x022f
        L_0x01b8:
            r9 = 5
            c1.l r3 = new c1.l
            r8 = 4
            java.lang.String r12 = r0.getString(r8)
            if (r12 != 0) goto L_0x01c5
            Z0.c r12 = j1.g.f8805f
            goto L_0x01cb
        L_0x01c5:
            Z0.c r7 = new Z0.c
            r7.<init>(r12)
            r12 = r7
        L_0x01cb:
            android.database.sqlite.SQLiteDatabase r17 = r14.c()
            java.lang.String[] r19 = new java.lang.String[]{r2}
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String[] r21 = new java.lang.String[]{r7}
            r23 = 0
            java.lang.String r24 = "sequence_num"
            java.lang.String r18 = "event_payloads"
            java.lang.String r20 = "event_id = ?"
            r22 = 0
            android.database.Cursor r7 = r17.query(r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0259 }
            r8.<init>()     // Catch:{ all -> 0x0259 }
            r9 = 0
        L_0x01ef:
            boolean r17 = r7.moveToNext()     // Catch:{ all -> 0x0259 }
            if (r17 == 0) goto L_0x0202
            r10 = 0
            byte[] r15 = r7.getBlob(r10)     // Catch:{ all -> 0x0259 }
            r8.add(r15)     // Catch:{ all -> 0x0259 }
            int r10 = r15.length     // Catch:{ all -> 0x0259 }
            int r9 = r9 + r10
            r10 = 2
            r15 = 1
            goto L_0x01ef
        L_0x0202:
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x0259 }
            r10 = 0
            r15 = 0
        L_0x0206:
            int r1 = r8.size()     // Catch:{ all -> 0x0259 }
            if (r10 >= r1) goto L_0x0224
            java.lang.Object r1 = r8.get(r10)     // Catch:{ all -> 0x0259 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0259 }
            r26 = r8
            int r8 = r1.length     // Catch:{ all -> 0x0259 }
            r19 = r14
            r14 = 0
            java.lang.System.arraycopy(r1, r14, r9, r15, r8)     // Catch:{ all -> 0x0259 }
            int r1 = r1.length     // Catch:{ all -> 0x0259 }
            int r15 = r15 + r1
            r1 = 1
            int r10 = r10 + r1
            r8 = r26
            r14 = r19
            goto L_0x0206
        L_0x0224:
            r19 = r14
            r7.close()
            r3.<init>(r12, r9)
            r6.f1318b = r3
            goto L_0x01b5
        L_0x022f:
            boolean r3 = r0.isNull(r1)
            if (r3 != 0) goto L_0x023f
            int r3 = r0.getInt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.f1321f = r3
        L_0x023f:
            c1.h r3 = r6.k()
            j1.b r6 = new j1.b
            r7 = r11
            c1.j r7 = (c1.j) r7
            r6.<init>(r4, r7, r3)
            r3 = r13
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r6)
            r1 = r25
            r14 = r19
            r10 = 2
            r15 = 1
            goto L_0x0157
        L_0x0259:
            r0 = move-exception
            r7.close()
            throw r0
        L_0x025e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null transportName"
            r0.<init>(r1)
            throw r0
        L_0x0266:
            r0 = 0
            return r0
        L_0x0268:
            r12 = r9
            r0 = r26
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            j1.g r14 = (j1.g) r14
            android.database.sqlite.SQLiteDatabase r1 = r14.c()
            android.database.sqlite.SQLiteStatement r1 = r1.compileStatement(r4)
            long r4 = r1.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r1 = r14.c()
            android.database.sqlite.SQLiteStatement r1 = r1.compileStatement(r3)
            long r6 = r1.simpleQueryForLong()
            long r6 = r6 * r4
            j1.a r1 = r14.d
            long r3 = r1.f8796a
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            c1.h r13 = (c1.h) r13
            java.lang.String r4 = r13.f5598a
            if (r3 < 0) goto L_0x02a1
            r0 = 1
            r14.l(r0, r12, r4)
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x03d9
        L_0x02a1:
            c1.j r11 = (c1.j) r11
            java.lang.Long r3 = j1.g.d(r0, r11)
            if (r3 == 0) goto L_0x02ae
            long r5 = r3.longValue()
            goto L_0x02e8
        L_0x02ae:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r5 = "backend_name"
            java.lang.String r6 = r11.f5607a
            r3.put(r5, r6)
            Z0.d r5 = r11.f5609c
            int r5 = m1.C0834a.a(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "priority"
            r3.put(r6, r5)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.String r7 = "next_request_ms"
            r3.put(r7, r6)
            byte[] r6 = r11.f5608b
            if (r6 == 0) goto L_0x02e0
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r5)
            java.lang.String r5 = "extras"
            r3.put(r5, r6)
        L_0x02e0:
            java.lang.String r5 = "transport_contexts"
            r6 = 0
            long r7 = r0.insert(r5, r6, r3)
            r5 = r7
        L_0x02e8:
            c1.l r3 = r13.f5600c
            byte[] r7 = r3.f5616b
            int r8 = r7.length
            int r1 = r1.f8799e
            if (r8 > r1) goto L_0x02f3
            r8 = 1
            goto L_0x02f4
        L_0x02f3:
            r8 = 0
        L_0x02f4:
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "context_id"
            r9.put(r6, r5)
            java.lang.String r5 = "transport_name"
            r9.put(r5, r4)
            long r4 = r13.d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "timestamp_ms"
            r9.put(r5, r4)
            long r4 = r13.f5601e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "uptime_ms"
            r9.put(r5, r4)
            Z0.c r3 = r3.f5615a
            java.lang.String r3 = r3.f4465a
            java.lang.String r4 = "payload_encoding"
            r9.put(r4, r3)
            java.lang.String r3 = "code"
            java.lang.Integer r4 = r13.f5599b
            r9.put(r3, r4)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "num_attempts"
            r9.put(r5, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r8)
            java.lang.String r5 = "inline"
            r9.put(r5, r4)
            if (r8 == 0) goto L_0x0344
            r3 = r7
            goto L_0x0346
        L_0x0344:
            byte[] r3 = new byte[r3]
        L_0x0346:
            java.lang.String r4 = "payload"
            r9.put(r4, r3)
            java.lang.String r3 = "events"
            r4 = 0
            long r5 = r0.insert(r3, r4, r9)
            java.lang.String r3 = "event_id"
            if (r8 != 0) goto L_0x0392
            int r4 = r7.length
            double r8 = (double) r4
            double r10 = (double) r1
            double r8 = r8 / r10
            double r8 = java.lang.Math.ceil(r8)
            int r4 = (int) r8
            r8 = 1
        L_0x0360:
            if (r8 > r4) goto L_0x0392
            r9 = 1
            int r10 = r8 + -1
            int r10 = r10 * r1
            int r9 = r8 * r1
            int r11 = r7.length
            int r9 = java.lang.Math.min(r9, r11)
            byte[] r9 = java.util.Arrays.copyOfRange(r7, r10, r9)
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            r10.put(r3, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            java.lang.String r12 = "sequence_num"
            r10.put(r12, r11)
            r10.put(r2, r9)
            java.lang.String r9 = "event_payloads"
            r11 = 0
            r0.insert(r9, r11, r10)
            r9 = 1
            int r8 = r8 + r9
            goto L_0x0360
        L_0x0392:
            java.util.HashMap r1 = r13.f5602f
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x03a0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03d5
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            r4.put(r3, r7)
            java.lang.Object r7 = r2.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "name"
            r4.put(r8, r7)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r7 = "value"
            r4.put(r7, r2)
            java.lang.String r2 = "event_metadata"
            r7 = 0
            r0.insert(r2, r7, r4)
            goto L_0x03a0
        L_0x03d5:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
        L_0x03d9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.b.apply(java.lang.Object):java.lang.Object");
    }

    public Object b() {
        C0553a aVar = (C0553a) this.f733b;
        g gVar = (g) aVar.d;
        gVar.getClass();
        j jVar = (j) this.f734c;
        h hVar = (h) this.d;
        String f02 = a.f0("SQLiteEventStore");
        if (Log.isLoggable(f02, 3)) {
            Log.d(f02, "Storing event with priority=" + jVar.f5609c + ", name=" + hVar.f5598a + " for destination " + jVar.f5607a);
        }
        ((Long) gVar.j(new b(gVar, hVar, jVar, 5))).getClass();
        aVar.f8048a.a(jVar, 1, false);
        return null;
    }

    public Object f(o oVar) {
        return new Y2.a((i) oVar.a(i.class), oVar.c(X2.a.class), (Executor) oVar.e((p) this.f733b), (Executor) oVar.e((p) this.f734c), (Executor) oVar.e((p) this.d));
    }

    public void h(boolean z3, k kVar) {
        u uVar = (u) this.f733b;
        long level = ((long) uVar.getMainStatesObject().getLevel()) + 10 + ((long) (((u) this.f734c).getMainStatesObject().getLevel() - uVar.getMainStatesObject().getLevel()));
        com.bumptech.glide.d.l1(level, new C0448s((e) this.d, level, 1));
    }

    public Task then(Object obj) {
        String str;
        switch (this.f732a) {
            case 0:
                Void voidR = (Void) obj;
                d dVar = (d) this.d;
                kotlin.jvm.internal.j.e(dVar, "this$0");
                return Tasks.forResult(new q((String) ((Task) this.f733b).getResult(), ((I3.g) ((J3.a) dVar.f736b.get())).f1177a.f(), (String) ((Task) this.f734c).getResult()));
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f733b;
                String str2 = (String) this.f734c;
                A a6 = (A) this.d;
                String str3 = (String) obj;
                c c3 = FirebaseMessaging.c(firebaseMessaging.f6906c);
                i iVar = firebaseMessaging.f6904a;
                iVar.b();
                if ("[DEFAULT]".equals(iVar.f2491b)) {
                    str = "";
                } else {
                    str = iVar.g();
                }
                String a7 = firebaseMessaging.f6909i.a();
                synchronized (c3) {
                    String a8 = A.a(System.currentTimeMillis(), str3, a7);
                    if (a8 != null) {
                        SharedPreferences.Editor edit = ((SharedPreferences) c3.f3713b).edit();
                        edit.putString(str + "|T|" + str2 + "|*", a8);
                        edit.commit();
                    }
                }
                if (a6 == null || !str3.equals(a6.f2603a)) {
                    firebaseMessaging.f(str3);
                }
                return Tasks.forResult(str3);
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i2) {
        this.f732a = i2;
        this.f733b = obj;
        this.f734c = obj2;
        this.d = obj3;
    }
}
