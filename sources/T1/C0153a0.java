package T1;

import android.os.Bundle;

/* renamed from: T1.a0  reason: case insensitive filesystem */
public final class C0153a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3220a = 1;

    /* renamed from: b  reason: collision with root package name */
    public long f3221b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3222c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3223e;

    public /* synthetic */ C0153a0(C0158c cVar) {
        this.f3223e = cVar;
    }

    public static C0153a0 c(C0214v vVar) {
        Bundle v6 = vVar.f3509b.v();
        long j6 = vVar.d;
        return new C0153a0(vVar.f3508a, vVar.f3510c, v6, j6);
    }

    public C0214v a() {
        return new C0214v((String) this.f3222c, new C0211u(new Bundle((Bundle) this.f3223e)), (String) this.d, this.f3221b);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fa, code lost:
        if (r4 != null) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.measurement.zzhm b(com.google.android.gms.internal.measurement.zzhm r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r8 = r20
            r3 = r21
            java.lang.String r0 = r20.zzh()
            java.util.List r9 = r20.zzi()
            java.lang.Object r2 = r1.f3223e
            T1.c r2 = (T1.C0158c) r2
            T1.T1 r4 = r2.f2982b
            r4.a()
            java.lang.String r5 = "_eid"
            java.io.Serializable r6 = T1.C0162d0.y(r8, r5)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L_0x0211
            java.lang.String r7 = "_ep"
            boolean r7 = r0.equals(r7)
            java.lang.Object r10 = r2.f398a
            T1.u0 r10 = (T1.C0212u0) r10
            if (r7 == 0) goto L_0x01d1
            r4.a()
            java.lang.String r0 = "_en"
            java.io.Serializable r0 = T1.C0162d0.y(r8, r0)
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r7 = 0
            if (r0 == 0) goto L_0x004d
            T1.Z r0 = r10.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            T1.X r0 = r0.f3173p
            r0.b(r6, r2)
            return r7
        L_0x004d:
            java.lang.Object r0 = r1.f3222c
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            T1.T1 r14 = r2.f2982b
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r1.d
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x006b
            long r15 = r6.longValue()
            java.lang.Object r0 = r1.d
            java.lang.Long r0 = (java.lang.Long) r0
            long r17 = r0.longValue()
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
        L_0x006b:
            T1.n r0 = r4.f3062c
            T1.T1.L(r0)
            java.lang.Object r2 = r0.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            r0.o()
            r0.p()
            android.database.sqlite.SQLiteDatabase r0 = r0.k0()     // Catch:{ SQLiteException -> 0x00e8, all -> 0x00e6 }
            java.lang.String r4 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            java.lang.String r15 = r6.toString()     // Catch:{ SQLiteException -> 0x00e8, all -> 0x00e6 }
            java.lang.String[] r15 = new java.lang.String[]{r3, r15}     // Catch:{ SQLiteException -> 0x00e8, all -> 0x00e6 }
            android.database.Cursor r4 = r0.rawQuery(r4, r15)     // Catch:{ SQLiteException -> 0x00e8, all -> 0x00e6 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x00a5 }
            if (r0 != 0) goto L_0x00a7
            T1.Z r0 = r2.f3496r     // Catch:{ SQLiteException -> 0x00a5 }
            T1.C0212u0.k(r0)     // Catch:{ SQLiteException -> 0x00a5 }
            T1.X r0 = r0.f3180w     // Catch:{ SQLiteException -> 0x00a5 }
            java.lang.String r15 = "Main event not found"
            r0.a(r15)     // Catch:{ SQLiteException -> 0x00a5 }
            r4.close()
            r0 = r7
            goto L_0x00fd
        L_0x00a3:
            r0 = move-exception
            goto L_0x00e3
        L_0x00a5:
            r0 = move-exception
            goto L_0x00ee
        L_0x00a7:
            r0 = 0
            byte[] r0 = r4.getBlob(r0)     // Catch:{ SQLiteException -> 0x00a5 }
            r15 = 1
            long r15 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x00a5 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00a5 }
            com.google.android.gms.internal.measurement.zzhl r7 = com.google.android.gms.internal.measurement.zzhm.zze()     // Catch:{ IOException -> 0x00cd }
            com.google.android.gms.internal.measurement.zzng r0 = T1.C0162d0.U(r7, r0)     // Catch:{ IOException -> 0x00cd }
            com.google.android.gms.internal.measurement.zzhl r0 = (com.google.android.gms.internal.measurement.zzhl) r0     // Catch:{ IOException -> 0x00cd }
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzba()     // Catch:{ IOException -> 0x00cd }
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0     // Catch:{ IOException -> 0x00cd }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00a5 }
            r4.close()
            goto L_0x00fd
        L_0x00cd:
            r0 = move-exception
            T1.Z r7 = r2.f3496r     // Catch:{ SQLiteException -> 0x00a5 }
            T1.C0212u0.k(r7)     // Catch:{ SQLiteException -> 0x00a5 }
            T1.X r7 = r7.f3172f     // Catch:{ SQLiteException -> 0x00a5 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            T1.Y r11 = T1.Z.w(r21)     // Catch:{ SQLiteException -> 0x00a5 }
            r7.d(r15, r11, r6, r0)     // Catch:{ SQLiteException -> 0x00a5 }
        L_0x00de:
            r4.close()
        L_0x00e1:
            r0 = 0
            goto L_0x00fd
        L_0x00e3:
            r7 = r4
            goto L_0x01cb
        L_0x00e6:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e8:
            r0 = move-exception
            goto L_0x00ed
        L_0x00ea:
            r7 = 0
            goto L_0x01cb
        L_0x00ed:
            r4 = 0
        L_0x00ee:
            T1.Z r2 = r2.f3496r     // Catch:{ all -> 0x00a3 }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x00a3 }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x00a3 }
            java.lang.String r7 = "Error selecting main event"
            r2.b(r0, r7)     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x00e1
            goto L_0x00de
        L_0x00fd:
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r2 = r0.first
            if (r2 != 0) goto L_0x0105
            goto L_0x01bd
        L_0x0105:
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2
            r1.f3222c = r2
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            r1.f3221b = r11
            r14.a()
            java.lang.Object r0 = r1.f3222c
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            java.io.Serializable r0 = T1.C0162d0.y(r0, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.d = r0
        L_0x0122:
            long r4 = r1.f3221b
            r11 = -1
            long r4 = r4 + r11
            r1.f3221b = r4
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            T1.n r0 = r14.f3062c
            T1.T1.L(r0)
            r0.o()
            java.lang.Object r2 = r0.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.Z r4 = r2.f3496r
            T1.C0212u0.k(r4)
            java.lang.String r5 = "Clearing complex main event info. appId"
            T1.X r4 = r4.f3180w
            r4.b(r3, r5)
            android.database.sqlite.SQLiteDatabase r0 = r0.k0()     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.String r4 = "delete from main_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r21}     // Catch:{ SQLiteException -> 0x0155 }
            r0.execSQL(r4, r3)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x0176
        L_0x0155:
            r0 = move-exception
            T1.Z r2 = r2.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r3 = "Error clearing complex main event"
            T1.X r2 = r2.f3172f
            r2.b(r0, r3)
            goto L_0x0176
        L_0x0163:
            T1.n r2 = r14.f3062c
            T1.T1.L(r2)
            long r11 = r1.f3221b
            java.lang.Object r0 = r1.f3222c
            r7 = r0
            com.google.android.gms.internal.measurement.zzhm r7 = (com.google.android.gms.internal.measurement.zzhm) r7
            r3 = r21
            r4 = r6
            r5 = r11
            r2.a0(r3, r4, r5, r7)
        L_0x0176:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r2 = r1.f3222c
            com.google.android.gms.internal.measurement.zzhm r2 = (com.google.android.gms.internal.measurement.zzhm) r2
            java.util.List r2 = r2.zzi()
            java.util.Iterator r2 = r2.iterator()
        L_0x0187:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01a4
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzhq r3 = (com.google.android.gms.internal.measurement.zzhq) r3
            r14.a()
            java.lang.String r4 = r3.zzg()
            com.google.android.gms.internal.measurement.zzhq r4 = T1.C0162d0.x(r8, r4)
            if (r4 != 0) goto L_0x0187
            r0.add(r3)
            goto L_0x0187
        L_0x01a4:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01af
            r0.addAll(r9)
            r9 = r0
            goto L_0x01bb
        L_0x01af:
            T1.Z r0 = r10.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r2 = "No unique parameters in main event. eventName"
            T1.X r0 = r0.f3173p
            r0.b(r13, r2)
        L_0x01bb:
            r0 = r13
            goto L_0x0211
        L_0x01bd:
            T1.Z r0 = r10.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            T1.X r0 = r0.f3173p
            r0.c(r2, r13, r6)
            r2 = 0
            return r2
        L_0x01cb:
            if (r7 == 0) goto L_0x01d0
            r7.close()
        L_0x01d0:
            throw r0
        L_0x01d1:
            r1.d = r6
            r1.f3222c = r8
            r4.a()
            r11 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            java.lang.String r5 = "_epc"
            java.io.Serializable r5 = T1.C0162d0.y(r8, r5)
            if (r5 != 0) goto L_0x01e7
            goto L_0x01e8
        L_0x01e7:
            r2 = r5
        L_0x01e8:
            java.lang.Long r2 = (java.lang.Long) r2
            long r13 = r2.longValue()
            r1.f3221b = r13
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x0201
            T1.Z r2 = r10.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            T1.X r2 = r2.f3173p
            r2.b(r0, r3)
            goto L_0x0211
        L_0x0201:
            T1.n r2 = r4.f3062c
            T1.T1.L(r2)
            long r10 = r1.f3221b
            r3 = r21
            r4 = r6
            r5 = r10
            r7 = r20
            r2.a0(r3, r4, r5, r7)
        L_0x0211:
            com.google.android.gms.internal.measurement.zzlz r2 = r20.zzch()
            com.google.android.gms.internal.measurement.zzhl r2 = (com.google.android.gms.internal.measurement.zzhl) r2
            r2.zzi(r0)
            r2.zzg()
            r2.zzd(r9)
            com.google.android.gms.internal.measurement.zzmd r0 = r2.zzba()
            com.google.android.gms.internal.measurement.zzhm r0 = (com.google.android.gms.internal.measurement.zzhm) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0153a0.b(com.google.android.gms.internal.measurement.zzhm, java.lang.String):com.google.android.gms.internal.measurement.zzhm");
    }

    public String toString() {
        switch (this.f3220a) {
            case 0:
                String obj = ((Bundle) this.f3223e).toString();
                return "origin=" + ((String) this.d) + ",name=" + ((String) this.f3222c) + ",params=" + obj;
            default:
                return super.toString();
        }
    }

    public C0153a0(String str, String str2, Bundle bundle, long j6) {
        this.f3222c = str;
        this.d = str2;
        this.f3223e = bundle;
        this.f3221b = j6;
    }
}
