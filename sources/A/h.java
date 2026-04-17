package A;

import G.g;
import G.j;
import G.k;
import I1.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import h0.C0552a;
import java.io.File;
import java.util.concurrent.Executor;
import z.C1119A;
import z.e;
import z.i;
import z.z;

public abstract class h {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        } else if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } else {
            if (z.a(new C1119A(context).f12745a)) {
                return 0;
            }
            return -1;
        }
    }

    public static Context createAttributionContext(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.a(context, str);
        }
        return context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return c.a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return a.a(context);
    }

    public static int getColor(Context context, int i2) {
        return b.a(context, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r5.f155c == r8.hashCode()) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList getColorStateList(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            B.l r1 = new B.l
            r1.<init>(r0, r8)
            java.lang.Object r2 = B.p.f166c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = B.p.f165b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x003c }
            r4 = 0
            if (r3 == 0) goto L_0x0050
            int r5 = r3.size()     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x0050
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x003c }
            B.k r5 = (B.k) r5     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x0050
            android.content.res.Configuration r6 = r5.f154b     // Catch:{ all -> 0x003c }
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch:{ all -> 0x003c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x004d
            if (r8 != 0) goto L_0x003f
            int r6 = r5.f155c     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x0049
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            goto L_0x00b9
        L_0x003f:
            if (r8 == 0) goto L_0x004d
            int r6 = r5.f155c     // Catch:{ all -> 0x003c }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x003c }
            if (r6 != r7) goto L_0x004d
        L_0x0049:
            android.content.res.ColorStateList r3 = r5.f153a     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0052
        L_0x004d:
            r3.remove(r9)     // Catch:{ all -> 0x003c }
        L_0x0050:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            goto L_0x00b8
        L_0x0055:
            java.lang.ThreadLocal r2 = B.p.f164a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0067
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L_0x0067:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L_0x0076
            r3 = 31
            if (r2 > r3) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = B.c.a(r0, r2, r8)     // Catch:{ Exception -> 0x007f }
            goto L_0x0087
        L_0x007f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L_0x0087:
            if (r4 == 0) goto L_0x00b4
            java.lang.Object r2 = B.p.f166c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = B.p.f165b     // Catch:{ all -> 0x009f }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x009f }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x009f }
            if (r3 != 0) goto L_0x00a1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch:{ all -> 0x009f }
            r3.<init>()     // Catch:{ all -> 0x009f }
            r0.put(r1, r3)     // Catch:{ all -> 0x009f }
            goto L_0x00a1
        L_0x009f:
            r8 = move-exception
            goto L_0x00b2
        L_0x00a1:
            B.k r0 = new B.k     // Catch:{ all -> 0x009f }
            android.content.res.Resources r1 = r1.f156a     // Catch:{ all -> 0x009f }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x009f }
            r0.<init>(r4, r1, r8)     // Catch:{ all -> 0x009f }
            r3.append(r9, r0)     // Catch:{ all -> 0x009f }
            monitor-exit(r2)     // Catch:{ all -> 0x009f }
            r3 = r4
            goto L_0x00b8
        L_0x00b2:
            monitor-exit(r2)     // Catch:{ all -> 0x009f }
            throw r8
        L_0x00b4:
            android.content.res.ColorStateList r3 = B.j.b(r0, r9, r8)
        L_0x00b8:
            return r3
        L_0x00b9:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.getColorStateList(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Context getContextForLanguage(Context context) {
        j jVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            Object systemService = context.getSystemService("locale");
            if (systemService != null) {
                jVar = new j(new k(i.a(systemService)));
            } else {
                jVar = j.f804b;
            }
        } else {
            jVar = j.a(e.e(context));
        }
        if (i2 > 32 || jVar.f805a.f806a.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        G.e.b(configuration, jVar);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return c.b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.c(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i2) {
        return a.b(context, i2);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.a(context);
        }
        return new g(new Handler(context.getMainLooper()), 0);
    }

    public static File getNoBackupFilesDir(Context context) {
        return a.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i2) {
        return getContextForLanguage(context).getString(i2);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return b.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return c.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (b.n(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(C0552a.o("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        return registerReceiver(context, broadcastReceiver, intentFilter, (String) null, (Handler) null, i2);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, (Bundle) null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        int i5 = i2 & 1;
        if (i5 == 0 || (i2 & 4) == 0) {
            if (i5 != 0) {
                i2 |= 2;
            }
            int i6 = i2;
            int i7 = i6 & 2;
            if (i7 == 0 && (i6 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            } else if (i7 == 0 || (i6 & 4) == 0) {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 33) {
                    return g.a(context, broadcastReceiver, intentFilter, str, handler, i6);
                }
                if (i8 >= 26) {
                    return d.a(context, broadcastReceiver, intentFilter, str, handler, i6);
                }
                if ((i6 & 4) == 0 || str != null) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
                }
                return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
            } else {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            }
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
