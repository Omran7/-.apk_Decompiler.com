package K1;

import A5.b;
import H3.f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import java.lang.reflect.Field;
import s2.e;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final e f1448b = new e(11);

    /* renamed from: c  reason: collision with root package name */
    public static final f f1449c = new f(12);
    public static Boolean d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f1450e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1451f = false;
    public static int g = -1;
    public static Boolean h;

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal f1452i = new ThreadLocal();

    /* renamed from: j  reason: collision with root package name */
    public static final b f1453j = new b(3);

    /* renamed from: k  reason: collision with root package name */
    public static final f f1454k = new f(11);

    /* renamed from: l  reason: collision with root package name */
    public static i f1455l;

    /* renamed from: m  reason: collision with root package name */
    public static j f1456m;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1457a;

    public d(Context context) {
        this.f1457a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (I.j(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e6) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: K1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: K1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: K1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: K1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: K1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: K1.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static K1.d c(android.content.Context r23, K1.c r24, java.lang.String r25) {
        /*
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r0 = "No acceptable module "
            java.lang.String r4 = "VersionPolicy returned invalid code:"
            java.lang.String r5 = "Selected remote version of "
            java.lang.String r6 = "Selected remote version of "
            java.lang.String r7 = "Considering local module "
            android.content.Context r8 = r23.getApplicationContext()
            if (r8 == 0) goto L_0x0301
            java.lang.ThreadLocal r9 = f1452i
            java.lang.Object r10 = r9.get()
            K1.g r10 = (K1.g) r10
            K1.g r11 = new K1.g
            r11.<init>()
            r9.set(r11)
            A5.b r12 = f1453j
            java.lang.Object r13 = r12.get()
            java.lang.Long r13 = (java.lang.Long) r13
            long r14 = r13.longValue()
            r16 = 0
            long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02e3 }
            r20 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x02e3 }
            r12.set(r0)     // Catch:{ all -> 0x02e3 }
            H3.f r0 = f1454k     // Catch:{ all -> 0x02e3 }
            D0.h r12 = r2.g(r1, r3, r0)     // Catch:{ all -> 0x02e3 }
            java.lang.String r0 = "DynamiteModule"
            r18 = r4
            int r4 = r12.f499a     // Catch:{ all -> 0x02e3 }
            r19 = r10
            int r10 = r12.f500b     // Catch:{ all -> 0x02de }
            r21 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r11.<init>(r7)     // Catch:{ all -> 0x008d }
            r11.append(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r7 = ":"
            r11.append(r7)     // Catch:{ all -> 0x008d }
            r11.append(r4)     // Catch:{ all -> 0x008d }
            java.lang.String r4 = " and remote module "
            r11.append(r4)     // Catch:{ all -> 0x008d }
            r11.append(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r4 = ":"
            r11.append(r4)     // Catch:{ all -> 0x008d }
            r11.append(r10)     // Catch:{ all -> 0x008d }
            java.lang.String r4 = r11.toString()     // Catch:{ all -> 0x008d }
            android.util.Log.i(r0, r4)     // Catch:{ all -> 0x008d }
            int r0 = r12.f501c     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0087
            r4 = -1
            if (r0 != r4) goto L_0x0094
            int r0 = r12.f499a     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0087
            r0 = r4
            goto L_0x0094
        L_0x0087:
            r10 = r19
            r1 = r21
            goto L_0x02b1
        L_0x008d:
            r0 = move-exception
            r10 = r19
            r1 = r21
            goto L_0x02e5
        L_0x0094:
            r7 = 1
            if (r0 != r7) goto L_0x009b
            int r10 = r12.f500b     // Catch:{ all -> 0x008d }
            if (r10 == 0) goto L_0x0087
        L_0x009b:
            if (r0 != r4) goto L_0x00af
            java.lang.String r0 = "Selected local version of "
            java.lang.String r0 = r0.concat(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = "DynamiteModule"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x008d }
            K1.d r0 = new K1.d     // Catch:{ all -> 0x008d }
            r0.<init>(r8)     // Catch:{ all -> 0x008d }
            goto L_0x026a
        L_0x00af:
            if (r0 != r7) goto L_0x0299
            int r0 = r12.f500b     // Catch:{ a -> 0x0224 }
            java.lang.Class<K1.d> r10 = K1.d.class
            monitor-enter(r10)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            boolean r11 = g(r23)     // Catch:{ all -> 0x0210 }
            if (r11 == 0) goto L_0x0212
            java.lang.Boolean r11 = d     // Catch:{ all -> 0x0210 }
            monitor-exit(r10)     // Catch:{ all -> 0x0210 }
            if (r11 == 0) goto L_0x0208
            boolean r10 = r11.booleanValue()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r11 = 2
            if (r10 == 0) goto L_0x0173
            java.lang.String r5 = "DynamiteModule"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r10.<init>(r6)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r10.append(r3)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r6 = ", version >= "
            r10.append(r6)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r10.append(r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r6 = r10.toString()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            android.util.Log.i(r5, r6)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.Class<K1.d> r5 = K1.d.class
            monitor-enter(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            K1.j r6 = f1456m     // Catch:{ all -> 0x0170 }
            monitor-exit(r5)     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0168
            java.lang.Object r5 = r9.get()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            K1.g r5 = (K1.g) r5     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            if (r5 == 0) goto L_0x0160
            android.database.Cursor r9 = r5.f1463a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            if (r9 == 0) goto L_0x0160
            android.content.Context r9 = r23.getApplicationContext()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            android.database.Cursor r5 = r5.f1463a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r10 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7 = 0
            r10.<init>(r7)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.Class<K1.d> r7 = K1.d.class
            monitor-enter(r7)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            int r10 = g     // Catch:{ all -> 0x015d }
            if (r10 < r11) goto L_0x010b
            r22 = 1
            goto L_0x010e
        L_0x010b:
            r10 = 0
            r22 = r10
        L_0x010e:
            monitor-exit(r7)     // Catch:{ all -> 0x015d }
            if (r22 == 0) goto L_0x0130
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version >= 2, using loadModule2NoCrashUtils"
            android.util.Log.v(r7, r10)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r7 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7.<init>(r9)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r9 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r9.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.a r0 = r6.b(r7, r3, r0, r9)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            goto L_0x0145
        L_0x0127:
            r0 = move-exception
            goto L_0x021c
        L_0x012a:
            r0 = move-exception
            goto L_0x0226
        L_0x012d:
            r0 = move-exception
            goto L_0x0227
        L_0x0130:
            java.lang.String r7 = "DynamiteModule"
            java.lang.String r10 = "Dynamite loader version < 2, falling back to loadModule2"
            android.util.Log.w(r7, r10)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r7 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7.<init>(r9)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r9 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r9.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.a r0 = r6.a(r7, r3, r0, r9)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0145:
            java.lang.Object r0 = J1.b.b(r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            if (r0 == 0) goto L_0x0155
            K1.d r5 = new K1.d     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0152:
            r0 = r5
            goto L_0x026a
        L_0x0155:
            K1.a r0 = new K1.a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = "Failed to get module context"
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x015d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x015d }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0160:
            K1.a r0 = new K1.a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = "No result cursor"
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0168:
            K1.a r0 = new K1.a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = "DynamiteLoaderV2 was not cached."
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0170:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0170 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0173:
            java.lang.String r6 = "DynamiteModule"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7.append(r3)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = ", version >= "
            r7.append(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7.append(r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = r7.toString()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            android.util.Log.i(r6, r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            K1.i r5 = h(r23)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            if (r5 == 0) goto L_0x0200
            android.os.Parcel r6 = r5.zza()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7 = 6
            android.os.Parcel r6 = r5.zzB(r7, r6)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            int r7 = r6.readInt()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r6.recycle()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r6 = 3
            if (r7 < r6) goto L_0x01c6
            java.lang.Object r6 = r9.get()     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            K1.g r6 = (K1.g) r6     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            if (r6 == 0) goto L_0x01be
            J1.b r7 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r7.<init>(r1)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            android.database.Cursor r6 = r6.f1463a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r9 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r9.<init>(r6)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.a r0 = r5.b(r7, r3, r0, r9)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            goto L_0x01e9
        L_0x01be:
            K1.a r0 = new K1.a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = "No cached result cursor holder"
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x01c6:
            if (r7 != r11) goto L_0x01d9
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "IDynamite loader version = 2"
            android.util.Log.w(r6, r7)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r6 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r6.<init>(r1)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.a r0 = r5.j(r6, r3, r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            goto L_0x01e9
        L_0x01d9:
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "Dynamite loader version < 2, falling back to createModuleContext"
            android.util.Log.w(r6, r7)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.b r6 = new J1.b     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r6.<init>(r1)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            J1.a r0 = r5.a(r6, r3, r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x01e9:
            java.lang.Object r0 = J1.b.b(r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            if (r0 == 0) goto L_0x01f8
            K1.d r5 = new K1.d     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            r5.<init>(r0)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            goto L_0x0152
        L_0x01f8:
            K1.a r0 = new K1.a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = "Failed to load remote module."
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0200:
            K1.a r0 = new K1.a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = "Failed to create IDynamiteLoader."
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0208:
            K1.a r0 = new K1.a     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            java.lang.String r5 = "Failed to determine which loading route to use."
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x0210:
            r0 = move-exception
            goto L_0x021a
        L_0x0212:
            K1.a r0 = new K1.a     // Catch:{ all -> 0x0210 }
            java.lang.String r5 = "Remote loading disabled"
            r0.<init>(r5)     // Catch:{ all -> 0x0210 }
            throw r0     // Catch:{ all -> 0x0210 }
        L_0x021a:
            monitor-exit(r10)     // Catch:{ all -> 0x0210 }
            throw r0     // Catch:{ RemoteException -> 0x012d, a -> 0x012a, all -> 0x0127 }
        L_0x021c:
            K1.a r5 = new K1.a     // Catch:{ a -> 0x0224 }
            java.lang.String r6 = "Failed to load remote module."
            r5.<init>(r6, r0)     // Catch:{ a -> 0x0224 }
            throw r5     // Catch:{ a -> 0x0224 }
        L_0x0224:
            r0 = move-exception
            goto L_0x022f
        L_0x0226:
            throw r0     // Catch:{ a -> 0x0224 }
        L_0x0227:
            K1.a r5 = new K1.a     // Catch:{ a -> 0x0224 }
            java.lang.String r6 = "Failed to load remote module."
            r5.<init>(r6, r0)     // Catch:{ a -> 0x0224 }
            throw r5     // Catch:{ a -> 0x0224 }
        L_0x022f:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x008d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r7.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r9 = "Failed to load remote module: "
            r7.append(r9)     // Catch:{ all -> 0x008d }
            r7.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x008d }
            android.util.Log.w(r5, r6)     // Catch:{ all -> 0x008d }
            int r5 = r12.f499a     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x028b
            K1.h r6 = new K1.h     // Catch:{ all -> 0x008d }
            r6.<init>(r5)     // Catch:{ all -> 0x008d }
            D0.h r1 = r2.g(r1, r3, r6)     // Catch:{ all -> 0x008d }
            int r1 = r1.f501c     // Catch:{ all -> 0x008d }
            if (r1 != r4) goto L_0x028b
            java.lang.String r0 = "Selected local version of "
            java.lang.String r0 = r0.concat(r3)     // Catch:{ all -> 0x008d }
            java.lang.String r1 = "DynamiteModule"
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x008d }
            K1.d r0 = new K1.d     // Catch:{ all -> 0x008d }
            r0.<init>(r8)     // Catch:{ all -> 0x008d }
        L_0x026a:
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0276
            A5.b r1 = f1453j
            r1.remove()
        L_0x0273:
            r1 = r21
            goto L_0x027c
        L_0x0276:
            A5.b r1 = f1453j
            r1.set(r13)
            goto L_0x0273
        L_0x027c:
            android.database.Cursor r1 = r1.f1463a
            if (r1 == 0) goto L_0x0283
            r1.close()
        L_0x0283:
            java.lang.ThreadLocal r1 = f1452i
            r10 = r19
            r1.set(r10)
            return r0
        L_0x028b:
            r10 = r19
            r1 = r21
            K1.a r2 = new K1.a     // Catch:{ all -> 0x0297 }
            java.lang.String r3 = "Remote load failed. No local fallback found."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0297 }
            throw r2     // Catch:{ all -> 0x0297 }
        L_0x0297:
            r0 = move-exception
            goto L_0x02e5
        L_0x0299:
            r10 = r19
            r1 = r21
            K1.a r2 = new K1.a     // Catch:{ all -> 0x0297 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0297 }
            r4 = r18
            r3.<init>(r4)     // Catch:{ all -> 0x0297 }
            r3.append(r0)     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0297 }
            r2.<init>(r0)     // Catch:{ all -> 0x0297 }
            throw r2     // Catch:{ all -> 0x0297 }
        L_0x02b1:
            K1.a r0 = new K1.a     // Catch:{ all -> 0x0297 }
            int r2 = r12.f499a     // Catch:{ all -> 0x0297 }
            int r4 = r12.f500b     // Catch:{ all -> 0x0297 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0297 }
            r6 = r20
            r5.<init>(r6)     // Catch:{ all -> 0x0297 }
            r5.append(r3)     // Catch:{ all -> 0x0297 }
            java.lang.String r3 = " found. Local version is "
            r5.append(r3)     // Catch:{ all -> 0x0297 }
            r5.append(r2)     // Catch:{ all -> 0x0297 }
            java.lang.String r2 = " and remote version is "
            r5.append(r2)     // Catch:{ all -> 0x0297 }
            r5.append(r4)     // Catch:{ all -> 0x0297 }
            java.lang.String r2 = "."
            r5.append(r2)     // Catch:{ all -> 0x0297 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0297 }
            r0.<init>(r2)     // Catch:{ all -> 0x0297 }
            throw r0     // Catch:{ all -> 0x0297 }
        L_0x02de:
            r0 = move-exception
            r1 = r11
            r10 = r19
            goto L_0x02e5
        L_0x02e3:
            r0 = move-exception
            r1 = r11
        L_0x02e5:
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x02ef
            A5.b r2 = f1453j
            r2.remove()
            goto L_0x02f4
        L_0x02ef:
            A5.b r2 = f1453j
            r2.set(r13)
        L_0x02f4:
            android.database.Cursor r1 = r1.f1463a
            if (r1 == 0) goto L_0x02fb
            r1.close()
        L_0x02fb:
            java.lang.ThreadLocal r1 = f1452i
            r1.set(r10)
            throw r0
        L_0x0301:
            K1.a r0 = new K1.a
            java.lang.String r1 = "null application Context"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.c(android.content.Context, K1.c, java.lang.String):K1.d");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x00a2=Splitter:B:51:0x00a2, B:32:0x005c=Splitter:B:32:0x005c, B:18:0x003f=Splitter:B:18:0x003f} */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            java.lang.Class<K1.d> r0 = K1.d.class
            monitor-enter(r0)     // Catch:{ all -> 0x00eb }
            java.lang.Boolean r1 = d     // Catch:{ all -> 0x004c }
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L_0x00df
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r5 = com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class
            java.lang.String r5 = r5.getName()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Class r1 = r1.loadClass(r5)     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.String r5 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r5)     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Class r5 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            monitor-enter(r5)     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r6 = (java.lang.ClassLoader) r6     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            if (r6 != r7) goto L_0x003a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00b8
        L_0x0037:
            r1 = move-exception
            goto L_0x00ba
        L_0x003a:
            if (r6 == 0) goto L_0x0043
            f(r6)     // Catch:{ a -> 0x003f }
        L_0x003f:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            goto L_0x00b8
        L_0x0043:
            boolean r6 = g(r11)     // Catch:{ all -> 0x0037 }
            if (r6 != 0) goto L_0x004f
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return r3
        L_0x004c:
            r12 = move-exception
            goto L_0x0214
        L_0x004f:
            boolean r6 = f1451f     // Catch:{ all -> 0x0037 }
            if (r6 != 0) goto L_0x00af
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0037 }
            boolean r7 = r6.equals(r4)     // Catch:{ all -> 0x0037 }
            if (r7 == 0) goto L_0x005c
            goto L_0x00af
        L_0x005c:
            int r7 = e(r11, r12, r13, r2)     // Catch:{ a -> 0x00a5 }
            java.lang.String r8 = f1450e     // Catch:{ a -> 0x00a5 }
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.isEmpty()     // Catch:{ a -> 0x00a5 }
            if (r8 == 0) goto L_0x006b
            goto L_0x00a2
        L_0x006b:
            java.lang.ClassLoader r8 = K1.e.y0()     // Catch:{ a -> 0x00a5 }
            if (r8 == 0) goto L_0x0072
            goto L_0x0097
        L_0x0072:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ a -> 0x00a5 }
            r9 = 29
            if (r8 < r9) goto L_0x0089
            I0.D.c()     // Catch:{ a -> 0x00a5 }
            java.lang.String r8 = f1450e     // Catch:{ a -> 0x00a5 }
            com.google.android.gms.common.internal.I.g(r8)     // Catch:{ a -> 0x00a5 }
            java.lang.ClassLoader r9 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a5 }
            dalvik.system.DelegateLastClassLoader r8 = I0.D.b(r9, r8)     // Catch:{ a -> 0x00a5 }
            goto L_0x0097
        L_0x0089:
            K1.f r8 = new K1.f     // Catch:{ a -> 0x00a5 }
            java.lang.String r9 = f1450e     // Catch:{ a -> 0x00a5 }
            com.google.android.gms.common.internal.I.g(r9)     // Catch:{ a -> 0x00a5 }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ a -> 0x00a5 }
            r8.<init>(r9, r10)     // Catch:{ a -> 0x00a5 }
        L_0x0097:
            f(r8)     // Catch:{ a -> 0x00a5 }
            r1.set(r4, r8)     // Catch:{ a -> 0x00a5 }
            d = r6     // Catch:{ a -> 0x00a5 }
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return r7
        L_0x00a2:
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            return r7
        L_0x00a5:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r1.set(r4, r6)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
            goto L_0x00b8
        L_0x00af:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0037 }
            r1.set(r4, r6)     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0037 }
        L_0x00b8:
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            goto L_0x00dd
        L_0x00ba:
            monitor-exit(r5)     // Catch:{ all -> 0x0037 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00c0, IllegalAccessException -> 0x00be, NoSuchFieldException -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            goto L_0x00c1
        L_0x00be:
            r1 = move-exception
            goto L_0x00c1
        L_0x00c0:
            r1 = move-exception
        L_0x00c1:
            java.lang.String r5 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r6.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r7 = "Failed to load module via V2: "
            r6.append(r7)     // Catch:{ all -> 0x004c }
            r6.append(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x004c }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x004c }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004c }
        L_0x00dd:
            d = r1     // Catch:{ all -> 0x004c }
        L_0x00df:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x010a
            int r11 = e(r11, r12, r13, r3)     // Catch:{ a -> 0x00ee }
            return r11
        L_0x00eb:
            r12 = move-exception
            goto L_0x0216
        L_0x00ee:
            r12 = move-exception
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x00eb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            r0.<init>()     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x00eb }
            r0.append(r12)     // Catch:{ all -> 0x00eb }
            java.lang.String r12 = r0.toString()     // Catch:{ all -> 0x00eb }
            android.util.Log.w(r13, r12)     // Catch:{ all -> 0x00eb }
            return r3
        L_0x010a:
            K1.i r5 = h(r11)     // Catch:{ all -> 0x00eb }
            if (r5 != 0) goto L_0x0112
            goto L_0x020b
        L_0x0112:
            android.os.Parcel r0 = r5.zza()     // Catch:{ RemoteException -> 0x0139 }
            r1 = 6
            android.os.Parcel r0 = r5.zzB(r1, r0)     // Catch:{ RemoteException -> 0x0139 }
            int r1 = r0.readInt()     // Catch:{ RemoteException -> 0x0139 }
            r0.recycle()     // Catch:{ RemoteException -> 0x0139 }
            r0 = 3
            if (r1 < r0) goto L_0x019b
            java.lang.ThreadLocal r0 = f1452i     // Catch:{ RemoteException -> 0x0139 }
            java.lang.Object r1 = r0.get()     // Catch:{ RemoteException -> 0x0139 }
            K1.g r1 = (K1.g) r1     // Catch:{ RemoteException -> 0x0139 }
            if (r1 == 0) goto L_0x013c
            android.database.Cursor r1 = r1.f1463a     // Catch:{ RemoteException -> 0x0139 }
            if (r1 == 0) goto L_0x013c
            int r3 = r1.getInt(r3)     // Catch:{ RemoteException -> 0x0139 }
            goto L_0x020b
        L_0x0139:
            r12 = move-exception
            goto L_0x01eb
        L_0x013c:
            J1.b r6 = new J1.b     // Catch:{ RemoteException -> 0x0139 }
            r6.<init>(r11)     // Catch:{ RemoteException -> 0x0139 }
            A5.b r1 = f1453j     // Catch:{ RemoteException -> 0x0139 }
            java.lang.Object r1 = r1.get()     // Catch:{ RemoteException -> 0x0139 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ RemoteException -> 0x0139 }
            long r9 = r1.longValue()     // Catch:{ RemoteException -> 0x0139 }
            r7 = r12
            r8 = r13
            J1.a r12 = r5.B(r6, r7, r8, r9)     // Catch:{ RemoteException -> 0x0139 }
            java.lang.Object r12 = J1.b.b(r12)     // Catch:{ RemoteException -> 0x0139 }
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch:{ RemoteException -> 0x0139 }
            if (r12 == 0) goto L_0x0188
            boolean r13 = r12.moveToFirst()     // Catch:{ RemoteException -> 0x0186, all -> 0x0184 }
            if (r13 != 0) goto L_0x0162
            goto L_0x0188
        L_0x0162:
            int r13 = r12.getInt(r3)     // Catch:{ RemoteException -> 0x0186, all -> 0x0184 }
            if (r13 <= 0) goto L_0x017b
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0186, all -> 0x0184 }
            K1.g r0 = (K1.g) r0     // Catch:{ RemoteException -> 0x0186, all -> 0x0184 }
            if (r0 == 0) goto L_0x0177
            android.database.Cursor r1 = r0.f1463a     // Catch:{ RemoteException -> 0x0186, all -> 0x0184 }
            if (r1 != 0) goto L_0x0177
            r0.f1463a = r12     // Catch:{ RemoteException -> 0x0186, all -> 0x0184 }
            goto L_0x0178
        L_0x0177:
            r2 = r3
        L_0x0178:
            if (r2 == 0) goto L_0x017b
            goto L_0x017c
        L_0x017b:
            r4 = r12
        L_0x017c:
            if (r4 == 0) goto L_0x0181
            r4.close()     // Catch:{ all -> 0x00eb }
        L_0x0181:
            r3 = r13
            goto L_0x020b
        L_0x0184:
            r13 = move-exception
            goto L_0x0196
        L_0x0186:
            r13 = move-exception
            goto L_0x0199
        L_0x0188:
            java.lang.String r13 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r13, r0)     // Catch:{ RemoteException -> 0x0186, all -> 0x0184 }
            if (r12 == 0) goto L_0x020b
            r12.close()     // Catch:{ all -> 0x00eb }
            goto L_0x020b
        L_0x0196:
            r4 = r12
            goto L_0x020e
        L_0x0199:
            r4 = r12
            goto L_0x01ec
        L_0x019b:
            r2 = 2
            if (r1 != r2) goto L_0x01c4
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r1 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r1)     // Catch:{ RemoteException -> 0x0139 }
            J1.b r0 = new J1.b     // Catch:{ RemoteException -> 0x0139 }
            r0.<init>(r11)     // Catch:{ RemoteException -> 0x0139 }
            android.os.Parcel r1 = r5.zza()     // Catch:{ RemoteException -> 0x0139 }
            com.google.android.gms.internal.common.zzc.zze(r1, r0)     // Catch:{ RemoteException -> 0x0139 }
            r1.writeString(r12)     // Catch:{ RemoteException -> 0x0139 }
            r1.writeInt(r13)     // Catch:{ RemoteException -> 0x0139 }
            r12 = 5
            android.os.Parcel r12 = r5.zzB(r12, r1)     // Catch:{ RemoteException -> 0x0139 }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x0139 }
            r12.recycle()     // Catch:{ RemoteException -> 0x0139 }
            goto L_0x0181
        L_0x01c4:
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r1, r2)     // Catch:{ RemoteException -> 0x0139 }
            J1.b r1 = new J1.b     // Catch:{ RemoteException -> 0x0139 }
            r1.<init>(r11)     // Catch:{ RemoteException -> 0x0139 }
            android.os.Parcel r2 = r5.zza()     // Catch:{ RemoteException -> 0x0139 }
            com.google.android.gms.internal.common.zzc.zze(r2, r1)     // Catch:{ RemoteException -> 0x0139 }
            r2.writeString(r12)     // Catch:{ RemoteException -> 0x0139 }
            r2.writeInt(r13)     // Catch:{ RemoteException -> 0x0139 }
            android.os.Parcel r12 = r5.zzB(r0, r2)     // Catch:{ RemoteException -> 0x0139 }
            int r13 = r12.readInt()     // Catch:{ RemoteException -> 0x0139 }
            r12.recycle()     // Catch:{ RemoteException -> 0x0139 }
            goto L_0x0181
        L_0x01e9:
            r13 = r12
            goto L_0x020e
        L_0x01eb:
            r13 = r12
        L_0x01ec:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x020c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020c }
            r0.<init>()     // Catch:{ all -> 0x020c }
            java.lang.String r1 = "Failed to retrieve remote module version: "
            r0.append(r1)     // Catch:{ all -> 0x020c }
            r0.append(r13)     // Catch:{ all -> 0x020c }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x020c }
            android.util.Log.w(r12, r13)     // Catch:{ all -> 0x020c }
            if (r4 == 0) goto L_0x020b
            r4.close()     // Catch:{ all -> 0x00eb }
        L_0x020b:
            return r3
        L_0x020c:
            r12 = move-exception
            goto L_0x01e9
        L_0x020e:
            if (r4 == 0) goto L_0x0213
            r4.close()     // Catch:{ all -> 0x00eb }
        L_0x0213:
            throw r13     // Catch:{ all -> 0x00eb }
        L_0x0214:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r12     // Catch:{ all -> 0x00eb }
        L_0x0216:
            com.google.android.gms.common.internal.I.g(r11)     // Catch:{ Exception -> 0x021a }
            goto L_0x0222
        L_0x021a:
            r11 = move-exception
            java.lang.String r13 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r13, r0, r11)
        L_0x0222:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0131, code lost:
        if (r5 != false) goto L_0x013c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0056 */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e2 A[SYNTHETIC, Splitter:B:58:0x00e2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            r0 = 0
            A5.b r1 = f1453j     // Catch:{ Exception -> 0x014b }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x014b }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x014b }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x014b }
            java.lang.String r3 = "api_force_staging"
            java.lang.String r4 = "api"
            r5 = 1
            if (r5 == r14) goto L_0x0015
            r3 = r4
        L_0x0015:
            android.net.Uri$Builder r14 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x014b }
            r14.<init>()     // Catch:{ Exception -> 0x014b }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r14 = r14.scheme(r4)     // Catch:{ Exception -> 0x014b }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r14 = r14.authority(r4)     // Catch:{ Exception -> 0x014b }
            android.net.Uri$Builder r14 = r14.path(r3)     // Catch:{ Exception -> 0x014b }
            android.net.Uri$Builder r13 = r14.appendPath(r13)     // Catch:{ Exception -> 0x014b }
            java.lang.String r14 = "requestStartUptime"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x014b }
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r14, r1)     // Catch:{ Exception -> 0x014b }
            android.net.Uri r7 = r13.build()     // Catch:{ Exception -> 0x014b }
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch:{ Exception -> 0x014b }
            android.content.ContentProviderClient r12 = r12.acquireUnstableContentProviderClient(r7)     // Catch:{ Exception -> 0x014b }
            r13 = 0
            r14 = 2
            if (r12 != 0) goto L_0x004b
        L_0x0048:
            r4 = r0
            goto L_0x00e0
        L_0x004b:
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6 = r12
            android.database.Cursor r1 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ RemoteException -> 0x0056, all -> 0x00d1 }
            if (r1 != 0) goto L_0x005a
        L_0x0056:
            r12.release()     // Catch:{ Exception -> 0x014b }
            goto L_0x0048
        L_0x005a:
            int r2 = r1.getCount()     // Catch:{ all -> 0x0090 }
            int r3 = r1.getColumnCount()     // Catch:{ all -> 0x0090 }
            android.database.MatrixCursor r4 = new android.database.MatrixCursor     // Catch:{ all -> 0x0090 }
            java.lang.String[] r6 = r1.getColumnNames()     // Catch:{ all -> 0x0090 }
            r4.<init>(r6, r2)     // Catch:{ all -> 0x0090 }
            r6 = r13
        L_0x006c:
            if (r6 >= r2) goto L_0x00ca
            boolean r7 = r1.moveToPosition(r6)     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x00c2
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0090 }
            r8 = r13
        L_0x0077:
            if (r8 >= r3) goto L_0x00bc
            int r9 = r1.getType(r8)     // Catch:{ all -> 0x0090 }
            if (r9 == 0) goto L_0x00b7
            if (r9 == r5) goto L_0x00ac
            if (r9 == r14) goto L_0x00a1
            r10 = 3
            if (r9 == r10) goto L_0x009a
            r10 = 4
            if (r9 != r10) goto L_0x0092
            byte[] r9 = r1.getBlob(r8)     // Catch:{ all -> 0x0090 }
            r7[r8] = r9     // Catch:{ all -> 0x0090 }
            goto L_0x00b9
        L_0x0090:
            r2 = move-exception
            goto L_0x00d3
        L_0x0092:
            android.os.RemoteException r2 = new android.os.RemoteException     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "Unknown column type"
            r2.<init>(r3)     // Catch:{ all -> 0x0090 }
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x009a:
            java.lang.String r9 = r1.getString(r8)     // Catch:{ all -> 0x0090 }
            r7[r8] = r9     // Catch:{ all -> 0x0090 }
            goto L_0x00b9
        L_0x00a1:
            double r9 = r1.getDouble(r8)     // Catch:{ all -> 0x0090 }
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x0090 }
            r7[r8] = r9     // Catch:{ all -> 0x0090 }
            goto L_0x00b9
        L_0x00ac:
            long r9 = r1.getLong(r8)     // Catch:{ all -> 0x0090 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0090 }
            r7[r8] = r9     // Catch:{ all -> 0x0090 }
            goto L_0x00b9
        L_0x00b7:
            r7[r8] = r0     // Catch:{ all -> 0x0090 }
        L_0x00b9:
            int r8 = r8 + 1
            goto L_0x0077
        L_0x00bc:
            r4.addRow(r7)     // Catch:{ all -> 0x0090 }
            int r6 = r6 + 1
            goto L_0x006c
        L_0x00c2:
            android.os.RemoteException r2 = new android.os.RemoteException     // Catch:{ all -> 0x0090 }
            java.lang.String r3 = "Cursor read incomplete (ContentProvider dead?)"
            r2.<init>(r3)     // Catch:{ all -> 0x0090 }
            throw r2     // Catch:{ all -> 0x0090 }
        L_0x00ca:
            r1.close()     // Catch:{ RemoteException -> 0x0056, all -> 0x00d1 }
            r12.release()     // Catch:{ Exception -> 0x014b }
            goto L_0x00e0
        L_0x00d1:
            r13 = move-exception
            goto L_0x00dc
        L_0x00d3:
            r1.close()     // Catch:{ all -> 0x00d7 }
            goto L_0x00db
        L_0x00d7:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ RemoteException -> 0x0056, all -> 0x00d1 }
        L_0x00db:
            throw r2     // Catch:{ RemoteException -> 0x0056, all -> 0x00d1 }
        L_0x00dc:
            r12.release()     // Catch:{ Exception -> 0x014b }
            throw r13     // Catch:{ Exception -> 0x014b }
        L_0x00e0:
            if (r4 == 0) goto L_0x0153
            boolean r12 = r4.moveToFirst()     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            if (r12 == 0) goto L_0x0153
            int r12 = r4.getInt(r13)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            if (r12 <= 0) goto L_0x0134
            java.lang.Class<K1.d> r1 = K1.d.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            java.lang.String r14 = r4.getString(r14)     // Catch:{ all -> 0x0106 }
            f1450e = r14     // Catch:{ all -> 0x0106 }
            java.lang.String r14 = "loaderVersion"
            int r14 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x0106 }
            if (r14 < 0) goto L_0x0108
            int r14 = r4.getInt(r14)     // Catch:{ all -> 0x0106 }
            g = r14     // Catch:{ all -> 0x0106 }
            goto L_0x0108
        L_0x0106:
            r12 = move-exception
            goto L_0x0136
        L_0x0108:
            java.lang.String r14 = "disableStandaloneDynamiteLoader2"
            int r14 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x0106 }
            if (r14 < 0) goto L_0x011c
            int r14 = r4.getInt(r14)     // Catch:{ all -> 0x0106 }
            if (r14 == 0) goto L_0x0118
            r14 = r5
            goto L_0x0119
        L_0x0118:
            r14 = r13
        L_0x0119:
            f1451f = r14     // Catch:{ all -> 0x0106 }
            goto L_0x011d
        L_0x011c:
            r14 = r13
        L_0x011d:
            monitor-exit(r1)     // Catch:{ all -> 0x0106 }
            java.lang.ThreadLocal r1 = f1452i     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            K1.g r1 = (K1.g) r1     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            if (r1 == 0) goto L_0x012f
            android.database.Cursor r2 = r1.f1463a     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            if (r2 != 0) goto L_0x012f
            r1.f1463a = r4     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            goto L_0x0130
        L_0x012f:
            r5 = r13
        L_0x0130:
            r13 = r14
            if (r5 == 0) goto L_0x0134
            goto L_0x013c
        L_0x0134:
            r0 = r4
            goto L_0x013c
        L_0x0136:
            monitor-exit(r1)     // Catch:{ all -> 0x0106 }
            throw r12     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
        L_0x0138:
            r12 = move-exception
            goto L_0x0162
        L_0x013a:
            r12 = move-exception
            goto L_0x0164
        L_0x013c:
            if (r15 == 0) goto L_0x014d
            if (r13 != 0) goto L_0x0141
            goto L_0x014d
        L_0x0141:
            K1.a r12 = new K1.a     // Catch:{ Exception -> 0x014b }
            java.lang.String r13 = "forcing fallback to container DynamiteLoader impl"
            r12.<init>(r13)     // Catch:{ Exception -> 0x014b }
            throw r12     // Catch:{ Exception -> 0x014b }
        L_0x0149:
            r12 = move-exception
            goto L_0x0185
        L_0x014b:
            r12 = move-exception
            goto L_0x0165
        L_0x014d:
            if (r0 == 0) goto L_0x0152
            r0.close()
        L_0x0152:
            return r12
        L_0x0153:
            java.lang.String r12 = "DynamiteModule"
            java.lang.String r13 = "Failed to retrieve remote module version."
            android.util.Log.w(r12, r13)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            K1.a r12 = new K1.a     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            java.lang.String r13 = "Failed to connect to dynamite module ContentResolver."
            r12.<init>(r13)     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
            throw r12     // Catch:{ Exception -> 0x013a, all -> 0x0138 }
        L_0x0162:
            r0 = r4
            goto L_0x0185
        L_0x0164:
            r0 = r4
        L_0x0165:
            boolean r13 = r12 instanceof K1.a     // Catch:{ all -> 0x0149 }
            if (r13 == 0) goto L_0x016a
            throw r12     // Catch:{ all -> 0x0149 }
        L_0x016a:
            K1.a r13 = new K1.a     // Catch:{ all -> 0x0149 }
            java.lang.String r14 = r12.getMessage()     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            r15.<init>()     // Catch:{ all -> 0x0149 }
            java.lang.String r1 = "V2 version check failed: "
            r15.append(r1)     // Catch:{ all -> 0x0149 }
            r15.append(r14)     // Catch:{ all -> 0x0149 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x0149 }
            r13.<init>(r14, r12)     // Catch:{ all -> 0x0149 }
            throw r13     // Catch:{ all -> 0x0149 }
        L_0x0185:
            if (r0 == 0) goto L_0x018a
            r0.close()
        L_0x018a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(java.lang.ClassLoader r3) {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            java.lang.String r1 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            r1 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            java.lang.Object r3 = r3.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            if (r3 != 0) goto L_0x0016
            goto L_0x0030
        L_0x0016:
            android.os.IInterface r1 = r3.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            boolean r2 = r1 instanceof K1.j     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            if (r2 == 0) goto L_0x002b
            K1.j r1 = (K1.j) r1     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            goto L_0x0030
        L_0x0021:
            r3 = move-exception
            goto L_0x0033
        L_0x0023:
            r3 = move-exception
            goto L_0x0033
        L_0x0025:
            r3 = move-exception
            goto L_0x0033
        L_0x0027:
            r3 = move-exception
            goto L_0x0033
        L_0x0029:
            r3 = move-exception
            goto L_0x0033
        L_0x002b:
            K1.j r1 = new K1.j     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            r1.<init>(r3, r0)     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
        L_0x0030:
            f1456m = r1     // Catch:{ ClassNotFoundException -> 0x0029, IllegalAccessException -> 0x0027, InstantiationException -> 0x0025, InvocationTargetException -> 0x0023, NoSuchMethodException -> 0x0021 }
            return
        L_0x0033:
            K1.a r0 = new K1.a
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.f(java.lang.ClassLoader):void");
    }

    public static boolean g(Context context) {
        int i2;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals((Object) null) || bool.equals(h)) {
            return true;
        }
        boolean z3 = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i2 = 268435456;
            } else {
                i2 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i2);
            if (z1.f.f12811b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z3 = true;
            }
            h = Boolean.valueOf(z3);
            if (z3 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f1451f = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [com.google.android.gms.internal.common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static K1.i h(android.content.Context r5) {
        /*
            java.lang.String r0 = "Failed to load IDynamiteLoader from GmsCore: "
            java.lang.Class<K1.d> r1 = K1.d.class
            monitor-enter(r1)
            K1.i r2 = f1455l     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return r2
        L_0x000b:
            r5 = move-exception
            goto L_0x005c
        L_0x000d:
            r2 = 0
            java.lang.String r3 = "com.google.android.gms"
            r4 = 3
            android.content.Context r5 = r5.createPackageContext(r3, r4)     // Catch:{ Exception -> 0x0036 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0036 }
            java.lang.String r3 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r5 = r5.loadClass(r3)     // Catch:{ Exception -> 0x0036 }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x0036 }
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch:{ Exception -> 0x0036 }
            if (r5 != 0) goto L_0x0029
            r3 = r2
            goto L_0x003f
        L_0x0029:
            java.lang.String r3 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r3 = r5.queryLocalInterface(r3)     // Catch:{ Exception -> 0x0036 }
            boolean r4 = r3 instanceof K1.i     // Catch:{ Exception -> 0x0036 }
            if (r4 == 0) goto L_0x0038
            K1.i r3 = (K1.i) r3     // Catch:{ Exception -> 0x0036 }
            goto L_0x003f
        L_0x0036:
            r5 = move-exception
            goto L_0x0045
        L_0x0038:
            K1.i r3 = new K1.i     // Catch:{ Exception -> 0x0036 }
            java.lang.String r4 = "com.google.android.gms.dynamite.IDynamiteLoader"
            r3.<init>(r5, r4)     // Catch:{ Exception -> 0x0036 }
        L_0x003f:
            if (r3 == 0) goto L_0x005a
            f1455l = r3     // Catch:{ Exception -> 0x0036 }
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return r3
        L_0x0045:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x000b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x000b }
            r4.<init>(r0)     // Catch:{ all -> 0x000b }
            r4.append(r5)     // Catch:{ all -> 0x000b }
            java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x000b }
            android.util.Log.e(r3, r5)     // Catch:{ all -> 0x000b }
        L_0x005a:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            return r2
        L_0x005c:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.d.h(android.content.Context):K1.i");
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f1457a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e6) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e6);
        }
    }
}
