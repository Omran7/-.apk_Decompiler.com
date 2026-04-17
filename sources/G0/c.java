package G0;

import F0.s;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.FileNotFoundException;
import z0.i;

public final class c implements e {

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f810t = {"_data"};

    /* renamed from: a  reason: collision with root package name */
    public final Context f811a;

    /* renamed from: b  reason: collision with root package name */
    public final s f812b;

    /* renamed from: c  reason: collision with root package name */
    public final s f813c;
    public final Uri d;

    /* renamed from: e  reason: collision with root package name */
    public final int f814e;

    /* renamed from: f  reason: collision with root package name */
    public final int f815f;

    /* renamed from: p  reason: collision with root package name */
    public final i f816p;

    /* renamed from: q  reason: collision with root package name */
    public final Class f817q;

    /* renamed from: r  reason: collision with root package name */
    public volatile boolean f818r;

    /* renamed from: s  reason: collision with root package name */
    public volatile e f819s;

    public c(Context context, s sVar, s sVar2, Uri uri, int i2, int i5, i iVar, Class cls) {
        this.f811a = context.getApplicationContext();
        this.f812b = sVar;
        this.f813c = sVar2;
        this.d = uri;
        this.f814e = i2;
        this.f815f = i5;
        this.f816p = iVar;
        this.f817q = cls;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.data.e a() {
        /*
            r14 = this;
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            r1 = 0
            android.content.Context r2 = r14.f811a
            z0.i r3 = r14.f816p
            int r4 = r14.f815f
            int r5 = r14.f814e
            if (r0 == 0) goto L_0x0078
            android.net.Uri r0 = r14.d
            java.lang.String r12 = "Failed to media store entry for: "
            java.lang.String r13 = "File path was empty in media store for: "
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch:{ all -> 0x0071 }
            java.lang.String[] r8 = f810t     // Catch:{ all -> 0x0071 }
            r10 = 0
            r11 = 0
            r9 = 0
            r7 = r0
            android.database.Cursor r2 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x005f
            boolean r6 = r2.moveToFirst()     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "_data"
            int r6 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x004a }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x004a }
            if (r7 != 0) goto L_0x004d
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x004a }
            r0.<init>(r6)     // Catch:{ all -> 0x004a }
            r2.close()
            F0.s r2 = r14.f812b
            F0.r r0 = r2.a(r0, r5, r4, r3)
            goto L_0x00a3
        L_0x004a:
            r0 = move-exception
            r1 = r2
            goto L_0x0072
        L_0x004d:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>(r13)     // Catch:{ all -> 0x004a }
            r3.append(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x004a }
            r1.<init>(r0)     // Catch:{ all -> 0x004a }
            throw r1     // Catch:{ all -> 0x004a }
        L_0x005f:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>(r12)     // Catch:{ all -> 0x004a }
            r3.append(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x004a }
            r1.<init>(r0)     // Catch:{ all -> 0x004a }
            throw r1     // Catch:{ all -> 0x004a }
        L_0x0071:
            r0 = move-exception
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            r1.close()
        L_0x0077:
            throw r0
        L_0x0078:
            android.net.Uri r0 = r14.d
            boolean r6 = K1.e.e0(r0)
            F0.s r7 = r14.f813c
            if (r6 == 0) goto L_0x0093
            java.util.List r6 = r0.getPathSegments()
            java.lang.String r8 = "picker"
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto L_0x0093
            F0.r r0 = r7.a(r0, r5, r4, r3)
            goto L_0x00a3
        L_0x0093:
            java.lang.String r6 = "android.permission.ACCESS_MEDIA_LOCATION"
            int r2 = r2.checkSelfPermission(r6)
            if (r2 != 0) goto L_0x009f
            android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
        L_0x009f:
            F0.r r0 = r7.a(r0, r5, r4, r3)
        L_0x00a3:
            if (r0 == 0) goto L_0x00a7
            com.bumptech.glide.load.data.e r1 = r0.f706c
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.c.a():com.bumptech.glide.load.data.e");
    }

    public final Class b() {
        return this.f817q;
    }

    public final void c() {
        e eVar = this.f819s;
        if (eVar != null) {
            eVar.c();
        }
    }

    public final void cancel() {
        this.f818r = true;
        e eVar = this.f819s;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final int e() {
        return 1;
    }

    public final void f(f fVar, d dVar) {
        try {
            e a6 = a();
            if (a6 == null) {
                dVar.a(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                return;
            }
            this.f819s = a6;
            if (this.f818r) {
                cancel();
            } else {
                a6.f(fVar, dVar);
            }
        } catch (FileNotFoundException e6) {
            dVar.a(e6);
        }
    }
}
