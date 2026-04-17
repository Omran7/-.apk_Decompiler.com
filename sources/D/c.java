package D;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public abstract class c {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", (Class[]) null).invoke(obj, (Object[]) null);
        } catch (IllegalAccessException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.e("IconCompat", "Unable to get icon uri", e8);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Icon c(androidx.core.graphics.drawable.IconCompat r7, android.content.Context r8) {
        /*
            int r0 = r7.f4881a
            r1 = 26
            r2 = 0
            java.lang.String r3 = "IconCompat"
            r4 = 0
            switch(r0) {
                case -1: goto L_0x0185;
                case 0: goto L_0x000b;
                case 1: goto L_0x016c;
                case 2: goto L_0x00fe;
                case 3: goto L_0x00f0;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00ca;
                case 6: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unknown type"
            r7.<init>(r8)
            throw r7
        L_0x0013:
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r0 < r5) goto L_0x0023
            android.net.Uri r8 = r7.e()
            android.graphics.drawable.Icon r8 = D.f.a(r8)
            goto L_0x0174
        L_0x0023:
            if (r8 == 0) goto L_0x00b2
            android.net.Uri r0 = r7.e()
            java.lang.String r5 = r0.getScheme()
            java.lang.String r6 = "content"
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L_0x0061
            java.lang.String r6 = "file"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x003e
            goto L_0x0061
        L_0x003e:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004e }
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x004e }
            java.lang.Object r6 = r7.f4882b     // Catch:{ FileNotFoundException -> 0x004e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ FileNotFoundException -> 0x004e }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x004e }
            r8.<init>(r5)     // Catch:{ FileNotFoundException -> 0x004e }
            r2 = r8
            goto L_0x007c
        L_0x004e:
            r8 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to load image from path: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r3, r0, r8)
            goto L_0x007c
        L_0x0061:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x006a }
            java.io.InputStream r2 = r8.openInputStream(r0)     // Catch:{ Exception -> 0x006a }
            goto L_0x007c
        L_0x006a:
            r8 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to load image from URI: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r3, r0, r8)
        L_0x007c:
            if (r2 == 0) goto L_0x009a
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L_0x008c
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2)
            android.graphics.drawable.Icon r8 = D.d.b(r8)
            goto L_0x0174
        L_0x008c:
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r2)
            android.graphics.Bitmap r8 = androidx.core.graphics.drawable.IconCompat.a(r8, r4)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto L_0x0174
        L_0x009a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.e()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00b2:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.<init>(r1)
            android.net.Uri r7 = r7.e()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00ca:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L_0x00d8
            java.lang.Object r8 = r7.f4882b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = D.d.b(r8)
            goto L_0x0174
        L_0x00d8:
            java.lang.Object r8 = r7.f4882b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap r8 = androidx.core.graphics.drawable.IconCompat.a(r8, r4)
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
            goto L_0x0174
        L_0x00e6:
            java.lang.Object r8 = r7.f4882b
            java.lang.String r8 = (java.lang.String) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithContentUri(r8)
            goto L_0x0174
        L_0x00f0:
            java.lang.Object r8 = r7.f4882b
            byte[] r8 = (byte[]) r8
            int r0 = r7.f4884e
            int r1 = r7.f4885f
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithData(r8, r0, r1)
            goto L_0x0174
        L_0x00fe:
            r8 = -1
            if (r0 != r8) goto L_0x0134
            int r8 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r0 = r7.f4882b
            java.lang.String r1 = "Unable to get icon package"
            r4 = 28
            if (r8 < r4) goto L_0x0110
            java.lang.String r2 = D.e.b(r0)
            goto L_0x0151
        L_0x0110:
            java.lang.Class r8 = r0.getClass()     // Catch:{ IllegalAccessException -> 0x0126, InvocationTargetException -> 0x0124, NoSuchMethodException -> 0x0122 }
            java.lang.String r4 = "getResPackage"
            java.lang.reflect.Method r8 = r8.getMethod(r4, r2)     // Catch:{ IllegalAccessException -> 0x0126, InvocationTargetException -> 0x0124, NoSuchMethodException -> 0x0122 }
            java.lang.Object r8 = r8.invoke(r0, r2)     // Catch:{ IllegalAccessException -> 0x0126, InvocationTargetException -> 0x0124, NoSuchMethodException -> 0x0122 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalAccessException -> 0x0126, InvocationTargetException -> 0x0124, NoSuchMethodException -> 0x0122 }
            r2 = r8
            goto L_0x0151
        L_0x0122:
            r8 = move-exception
            goto L_0x0128
        L_0x0124:
            r8 = move-exception
            goto L_0x012c
        L_0x0126:
            r8 = move-exception
            goto L_0x0130
        L_0x0128:
            android.util.Log.e(r3, r1, r8)
            goto L_0x0151
        L_0x012c:
            android.util.Log.e(r3, r1, r8)
            goto L_0x0151
        L_0x0130:
            android.util.Log.e(r3, r1, r8)
            goto L_0x0151
        L_0x0134:
            r1 = 2
            if (r0 != r1) goto L_0x0158
            java.lang.String r0 = r7.f4887j
            if (r0 == 0) goto L_0x0145
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0145
        L_0x0142:
            java.lang.String r2 = r7.f4887j
            goto L_0x0151
        L_0x0145:
            java.lang.Object r0 = r7.f4882b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ":"
            java.lang.String[] r8 = r0.split(r1, r8)
            r2 = r8[r4]
        L_0x0151:
            int r8 = r7.f4884e
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithResource(r2, r8)
            goto L_0x0174
        L_0x0158:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "called getResPackage() on "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x016c:
            java.lang.Object r8 = r7.f4882b
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.drawable.Icon r8 = android.graphics.drawable.Icon.createWithBitmap(r8)
        L_0x0174:
            android.content.res.ColorStateList r0 = r7.g
            if (r0 == 0) goto L_0x017b
            r8.setTintList(r0)
        L_0x017b:
            android.graphics.PorterDuff$Mode r7 = r7.h
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f4880k
            if (r7 == r0) goto L_0x0184
            r8.setTintMode(r7)
        L_0x0184:
            return r8
        L_0x0185:
            java.lang.Object r7 = r7.f4882b
            android.graphics.drawable.Icon r7 = (android.graphics.drawable.Icon) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D.c.c(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
