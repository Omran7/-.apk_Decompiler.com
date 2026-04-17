package A0;

import F0.C;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12a;

    /* renamed from: b  reason: collision with root package name */
    public final Comparable f13b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14c;
    public Object d;

    public /* synthetic */ b(int i2, Comparable comparable, Object obj) {
        this.f12a = i2;
        this.f13b = comparable;
        this.f14c = obj;
    }

    public static b a(Context context, Uri uri, c cVar) {
        return new b(0, uri, new d(com.bumptech.glide.b.a(context).f5729c.a().e(), cVar, com.bumptech.glide.b.a(context).d, context.getContentResolver()));
    }

    public final Class b() {
        switch (this.f12a) {
            case 0:
                return InputStream.class;
            case 1:
                ((C) this.f14c).getClass();
                return InputStream.class;
            default:
                return ((C) this.f14c).b();
        }
    }

    public final void c() {
        switch (this.f12a) {
            case 0:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                try {
                    ((ByteArrayInputStream) this.d).close();
                    return;
                } catch (IOException unused2) {
                    return;
                }
            default:
                Object obj = this.d;
                if (obj != null) {
                    try {
                        switch (((C) this.f14c).f666a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                return;
                            default:
                                ((InputStream) obj).close();
                                return;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void cancel() {
        int i2 = this.f12a;
    }

    public final int e() {
        switch (this.f12a) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return 1;
        }
    }

    public final void f(f fVar, d dVar) {
        Object obj;
        switch (this.f12a) {
            case 0:
                try {
                    InputStream i2 = i();
                    this.d = i2;
                    dVar.d(i2);
                    return;
                } catch (FileNotFoundException e6) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e6);
                    }
                    dVar.a(e6);
                    return;
                }
            case 1:
                try {
                    ByteArrayInputStream a6 = C.a((String) this.f13b);
                    this.d = a6;
                    dVar.d(a6);
                    return;
                } catch (IllegalArgumentException e7) {
                    dVar.a(e7);
                    return;
                }
            default:
                try {
                    File file = (File) this.f13b;
                    switch (((C) this.f14c).f666a) {
                        case 8:
                            obj = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            obj = new FileInputStream(file);
                            break;
                    }
                    this.d = obj;
                    dVar.d(obj);
                    return;
                } catch (FileNotFoundException e8) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e8);
                    }
                    dVar.a(e8);
                    return;
                }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r6 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r6 == null) goto L_0x0030;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[Catch:{ all -> 0x0025 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream i() {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            java.lang.Comparable r1 = r12.f13b
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r2 = r12.f14c
            A0.d r2 = (A0.d) r2
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r4 = 3
            r5 = 0
            A0.c r6 = r2.f15a     // Catch:{ SecurityException -> 0x0035, all -> 0x0032 }
            android.database.Cursor r6 = r6.a(r1)     // Catch:{ SecurityException -> 0x0035, all -> 0x0032 }
            if (r6 == 0) goto L_0x002b
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x0029 }
            if (r7 == 0) goto L_0x002b
            r7 = 0
            java.lang.String r3 = r6.getString(r7)     // Catch:{ SecurityException -> 0x0029 }
            r6.close()
            goto L_0x004f
        L_0x0025:
            r0 = move-exception
            r5 = r6
            goto L_0x00e1
        L_0x0029:
            r7 = move-exception
            goto L_0x0037
        L_0x002b:
            if (r6 == 0) goto L_0x0030
        L_0x002d:
            r6.close()
        L_0x0030:
            r3 = r5
            goto L_0x004f
        L_0x0032:
            r0 = move-exception
            goto L_0x00e1
        L_0x0035:
            r7 = move-exception
            r6 = r5
        L_0x0037:
            boolean r8 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0025 }
            if (r8 == 0) goto L_0x004c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r8.<init>(r3)     // Catch:{ all -> 0x0025 }
            r8.append(r1)     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0025 }
            android.util.Log.d(r0, r3, r7)     // Catch:{ all -> 0x0025 }
        L_0x004c:
            if (r6 == 0) goto L_0x0030
            goto L_0x002d
        L_0x004f:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            android.content.ContentResolver r7 = r2.f17c
            if (r6 == 0) goto L_0x0059
        L_0x0057:
            r3 = r5
            goto L_0x009a
        L_0x0059:
            java.io.File r6 = new java.io.File
            r6.<init>(r3)
            boolean r3 = r6.exists()
            if (r3 == 0) goto L_0x0057
            long r8 = r6.length()
            r10 = 0
            int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0057
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            java.io.InputStream r3 = r7.openInputStream(r3)     // Catch:{ NullPointerException -> 0x0077 }
            goto L_0x009a
        L_0x0077:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "NPE opening uri: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " -> "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x009a:
            r6 = -1
            if (r3 == 0) goto L_0x00d7
            java.lang.String r8 = "Failed to open uri: "
            java.io.InputStream r5 = r7.openInputStream(r1)     // Catch:{ IOException -> 0x00b5, NullPointerException -> 0x00b3 }
            java.util.ArrayList r7 = r2.d     // Catch:{ IOException -> 0x00b5, NullPointerException -> 0x00b3 }
            C0.g r2 = r2.f16b     // Catch:{ IOException -> 0x00b5, NullPointerException -> 0x00b3 }
            int r0 = z0.C1129e.a(r7, r5, r2)     // Catch:{ IOException -> 0x00b5, NullPointerException -> 0x00b3 }
            if (r5 == 0) goto L_0x00d8
            r5.close()     // Catch:{ IOException -> 0x00d8 }
            goto L_0x00d8
        L_0x00b1:
            r0 = move-exception
            goto L_0x00d1
        L_0x00b3:
            r2 = move-exception
            goto L_0x00b6
        L_0x00b5:
            r2 = move-exception
        L_0x00b6:
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00b1 }
            if (r4 == 0) goto L_0x00cb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r4.<init>(r8)     // Catch:{ all -> 0x00b1 }
            r4.append(r1)     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00b1 }
            android.util.Log.d(r0, r1, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00cb:
            if (r5 == 0) goto L_0x00d7
            r5.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00d7
        L_0x00d1:
            if (r5 == 0) goto L_0x00d6
            r5.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            throw r0
        L_0x00d7:
            r0 = r6
        L_0x00d8:
            if (r0 == r6) goto L_0x00e0
            com.bumptech.glide.load.data.i r1 = new com.bumptech.glide.load.data.i
            r1.<init>(r3, r0)
            r3 = r1
        L_0x00e0:
            return r3
        L_0x00e1:
            if (r5 == 0) goto L_0x00e6
            r5.close()
        L_0x00e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.b.i():java.io.InputStream");
    }

    private final void d() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
