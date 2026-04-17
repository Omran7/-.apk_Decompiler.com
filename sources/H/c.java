package H;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f967a = new b(0);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.database.Cursor} */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static B0.l a(android.content.Context r21, F3.k r22) {
        /*
            r0 = r22
            android.content.pm.PackageManager r1 = r21.getPackageManager()
            android.content.res.Resources r2 = r21.getResources()
            java.lang.Object r3 = r0.f769b
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            android.content.pm.ProviderInfo r5 = r1.resolveContentProvider(r3, r4)
            if (r5 == 0) goto L_0x01c1
            java.lang.String r6 = r5.packageName
            java.lang.Object r7 = r0.f770c
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01b3
            java.lang.String r3 = r5.packageName
            r6 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r6)
            android.content.pm.Signature[] r1 = r1.signatures
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r1.length
            r7 = r4
        L_0x0032:
            if (r7 >= r6) goto L_0x0040
            r8 = r1[r7]
            byte[] r8 = r8.toByteArray()
            r3.add(r8)
            int r7 = r7 + 1
            goto L_0x0032
        L_0x0040:
            H.b r1 = f967a
            java.util.Collections.sort(r3, r1)
            java.lang.Object r6 = r0.f771e
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x004c
            goto L_0x0050
        L_0x004c:
            java.util.List r6 = B.b.j(r2, r4)
        L_0x0050:
            r2 = r4
        L_0x0051:
            int r7 = r6.size()
            r8 = 0
            if (r2 >= r7) goto L_0x0090
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r9 = r6.get(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            r7.<init>(r9)
            java.util.Collections.sort(r7, r1)
            int r9 = r3.size()
            int r10 = r7.size()
            if (r9 == r10) goto L_0x0071
            goto L_0x008a
        L_0x0071:
            r9 = r4
        L_0x0072:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x0091
            java.lang.Object r10 = r3.get(r9)
            byte[] r10 = (byte[]) r10
            java.lang.Object r11 = r7.get(r9)
            byte[] r11 = (byte[]) r11
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 != 0) goto L_0x008d
        L_0x008a:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x008d:
            int r9 = r9 + 1
            goto L_0x0072
        L_0x0090:
            r5 = r8
        L_0x0091:
            r1 = 1
            if (r5 != 0) goto L_0x009b
            B0.l r0 = new B0.l
            r2 = 1
            r0.<init>((int) r1, (java.lang.Object) r8, (int) r2)
            return r0
        L_0x009b:
            java.lang.String r2 = r5.authority
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.net.Uri$Builder r5 = new android.net.Uri$Builder
            r5.<init>()
            java.lang.String r6 = "content"
            android.net.Uri$Builder r5 = r5.scheme(r6)
            android.net.Uri$Builder r5 = r5.authority(r2)
            android.net.Uri r5 = r5.build()
            android.net.Uri$Builder r7 = new android.net.Uri$Builder
            r7.<init>()
            android.net.Uri$Builder r6 = r7.scheme(r6)
            android.net.Uri$Builder r2 = r6.authority(r2)
            java.lang.String r6 = "file"
            android.net.Uri$Builder r2 = r2.appendPath(r6)
            android.net.Uri r2 = r2.build()
            android.content.ContentResolver r6 = r21.getContentResolver()
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r5)
            java.lang.String r9 = "_id"
            java.lang.String r10 = "file_id"
            java.lang.String r11 = "font_ttc_index"
            java.lang.String r12 = "font_variation_settings"
            java.lang.String r13 = "font_weight"
            java.lang.String r14 = "font_italic"
            java.lang.String r15 = "result_code"
            java.lang.String[] r11 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15}     // Catch:{ all -> 0x0146 }
            java.lang.String r12 = "query = ?"
            java.lang.Object r0 = r0.d     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0146 }
            java.lang.String[] r13 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0146 }
            if (r6 != 0) goto L_0x00f3
            goto L_0x0105
        L_0x00f3:
            r14 = 0
            r15 = 0
            r9 = r6
            r10 = r5
            android.database.Cursor r8 = r9.query(r10, r11, r12, r13, r14, r15)     // Catch:{ RemoteException -> 0x00fc }
            goto L_0x0105
        L_0x00fc:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "FontsProvider"
            java.lang.String r9 = "Unable to query the content provider"
            android.util.Log.w(r0, r9, r7)     // Catch:{ all -> 0x0146 }
        L_0x0105:
            if (r8 == 0) goto L_0x018f
            int r0 = r8.getCount()     // Catch:{ all -> 0x0146 }
            if (r0 <= 0) goto L_0x018f
            java.lang.String r0 = "result_code"
            int r0 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x0146 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0146 }
            r3.<init>()     // Catch:{ all -> 0x0146 }
            java.lang.String r7 = "_id"
            int r7 = r8.getColumnIndex(r7)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = "file_id"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String r10 = "font_ttc_index"
            int r10 = r8.getColumnIndex(r10)     // Catch:{ all -> 0x0146 }
            java.lang.String r11 = "font_weight"
            int r11 = r8.getColumnIndex(r11)     // Catch:{ all -> 0x0146 }
            java.lang.String r12 = "font_italic"
            int r12 = r8.getColumnIndex(r12)     // Catch:{ all -> 0x0146 }
        L_0x0136:
            boolean r13 = r8.moveToNext()     // Catch:{ all -> 0x0146 }
            if (r13 == 0) goto L_0x018f
            r13 = -1
            if (r0 == r13) goto L_0x0149
            int r14 = r8.getInt(r0)     // Catch:{ all -> 0x0146 }
            r20 = r14
            goto L_0x014b
        L_0x0146:
            r0 = move-exception
            goto L_0x01a8
        L_0x0149:
            r20 = r4
        L_0x014b:
            if (r10 == r13) goto L_0x0154
            int r14 = r8.getInt(r10)     // Catch:{ all -> 0x0146 }
            r17 = r14
            goto L_0x0156
        L_0x0154:
            r17 = r4
        L_0x0156:
            if (r9 != r13) goto L_0x0163
            long r14 = r8.getLong(r7)     // Catch:{ all -> 0x0146 }
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r5, r14)     // Catch:{ all -> 0x0146 }
        L_0x0160:
            r16 = r14
            goto L_0x016c
        L_0x0163:
            long r14 = r8.getLong(r9)     // Catch:{ all -> 0x0146 }
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r2, r14)     // Catch:{ all -> 0x0146 }
            goto L_0x0160
        L_0x016c:
            if (r11 == r13) goto L_0x0175
            int r14 = r8.getInt(r11)     // Catch:{ all -> 0x0146 }
        L_0x0172:
            r18 = r14
            goto L_0x0178
        L_0x0175:
            r14 = 400(0x190, float:5.6E-43)
            goto L_0x0172
        L_0x0178:
            if (r12 == r13) goto L_0x0183
            int r13 = r8.getInt(r12)     // Catch:{ all -> 0x0146 }
            if (r13 != r1) goto L_0x0183
            r19 = r1
            goto L_0x0185
        L_0x0183:
            r19 = r4
        L_0x0185:
            H.h r13 = new H.h     // Catch:{ all -> 0x0146 }
            r15 = r13
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0146 }
            r3.add(r13)     // Catch:{ all -> 0x0146 }
            goto L_0x0136
        L_0x018f:
            if (r8 == 0) goto L_0x0194
            r8.close()
        L_0x0194:
            if (r6 == 0) goto L_0x0199
            r6.close()
        L_0x0199:
            H.h[] r0 = new H.h[r4]
            java.lang.Object[] r0 = r3.toArray(r0)
            H.h[] r0 = (H.h[]) r0
            B0.l r1 = new B0.l
            r2 = 1
            r1.<init>((int) r4, (java.lang.Object) r0, (int) r2)
            return r1
        L_0x01a8:
            if (r8 == 0) goto L_0x01ad
            r8.close()
        L_0x01ad:
            if (r6 == 0) goto L_0x01b2
            r6.close()
        L_0x01b2:
            throw r0
        L_0x01b3:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r1 = "Found content provider "
            java.lang.String r2 = ", but package was not "
            java.lang.String r1 = h0.C0552a.p(r1, r3, r2, r7)
            r0.<init>(r1)
            throw r0
        L_0x01c1:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            java.lang.String r1 = "No package found for authority: "
            java.lang.String r1 = o3.d.i(r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H.c.a(android.content.Context, F3.k):B0.l");
    }
}
