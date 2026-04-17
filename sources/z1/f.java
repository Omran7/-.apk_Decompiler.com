package z1;

import G1.c;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.V;
import java.util.concurrent.atomic.AtomicBoolean;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12810a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    public static final f f12811b = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [z1.f, java.lang.Object] */
    static {
        AtomicBoolean atomicBoolean = i.f12814a;
    }

    public Intent a(int i2, Context context, String str) {
        if (i2 == 1 || i2 == 2) {
            if (context == null || !c.f(context)) {
                StringBuilder sb = new StringBuilder("gcore_");
                sb.append(f12810a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(I1.c.a(context).i(0, context.getPackageName()).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                int i5 = V.f6163a;
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            int i6 = V.f6163a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i2 != 3) {
            return null;
        } else {
            int i7 = V.f6163a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public int b(Context context) {
        return c(context, f12810a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c(android.content.Context r10, int r11) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = z1.i.f12814a
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ all -> 0x000d }
            r1 = 2131886799(0x7f1202cf, float:1.9408187E38)
            r0.getString(r1)     // Catch:{ all -> 0x000d }
            goto L_0x0014
        L_0x000d:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0014:
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0097
            java.util.concurrent.atomic.AtomicBoolean r0 = z1.i.d
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x002a
            goto L_0x0097
        L_0x002a:
            java.lang.Object r0 = com.google.android.gms.common.internal.I.f6139a
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.common.internal.I.f6140b     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0035
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0062
        L_0x0033:
            r10 = move-exception
            goto L_0x0095
        L_0x0035:
            com.google.android.gms.common.internal.I.f6140b = r1     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0033 }
            D0.e r3 = I1.c.a(r10)     // Catch:{ all -> 0x0033 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.h(r4, r2)     // Catch:{ NameNotFoundException -> 0x0059 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0059 }
            if (r2 != 0) goto L_0x004b
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0062
        L_0x004b:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0059 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0059 }
            com.google.android.gms.common.internal.I.f6141c = r2     // Catch:{ NameNotFoundException -> 0x0059 }
            goto L_0x0061
        L_0x0059:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0033 }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
        L_0x0062:
            int r0 = com.google.android.gms.common.internal.I.f6141c
            if (r0 == 0) goto L_0x008f
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x006c
            goto L_0x0097
        L_0x006c:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            int r11 = f12810a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.<init>(r11)
            throw r10
        L_0x008f:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x0095:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r10
        L_0x0097:
            boolean r0 = G1.c.f(r10)
            r2 = 0
            if (r0 != 0) goto L_0x00cd
            java.lang.Boolean r0 = G1.c.f827e
            if (r0 != 0) goto L_0x00c3
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x00ba
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x00bc
        L_0x00ba:
            r0 = r1
            goto L_0x00bd
        L_0x00bc:
            r0 = r2
        L_0x00bd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            G1.c.f827e = r0
        L_0x00c3:
            java.lang.Boolean r0 = G1.c.f827e
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cd
            r0 = r1
            goto L_0x00ce
        L_0x00cd:
            r0 = r2
        L_0x00ce:
            if (r11 < 0) goto L_0x00d2
            r3 = r1
            goto L_0x00d3
        L_0x00d2:
            r3 = r2
        L_0x00d3:
            com.google.android.gms.common.internal.I.b(r3)
            java.lang.String r3 = r10.getPackageName()
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            r5 = 9
            if (r0 == 0) goto L_0x00fc
            java.lang.String r6 = "com.android.vending"
            r7 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x00eb }
            goto L_0x00fd
        L_0x00eb:
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.w(r3, r11)
            goto L_0x01c8
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            java.lang.String r7 = "com.google.android.gms"
            r8 = 64
            android.content.pm.PackageInfo r7 = r4.getPackageInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x01b8 }
            z1.j.b(r10)
            boolean r8 = z1.j.e(r7, r1)
            if (r8 != 0) goto L_0x011f
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.w(r3, r11)
            goto L_0x01c8
        L_0x011f:
            if (r0 == 0) goto L_0x013b
            com.google.android.gms.common.internal.I.g(r6)
            boolean r8 = z1.j.e(r6, r1)
            if (r8 != 0) goto L_0x013b
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.w(r3, r11)
            goto L_0x01c8
        L_0x013b:
            if (r0 == 0) goto L_0x015e
            if (r6 == 0) goto L_0x015e
            android.content.pm.Signature[] r0 = r6.signatures
            r0 = r0[r2]
            android.content.pm.Signature[] r6 = r7.signatures
            r6 = r6[r2]
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x015e
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.w(r3, r11)
            goto L_0x01c8
        L_0x015e:
            int r0 = r7.versionCode
            r5 = -1
            if (r0 != r5) goto L_0x0165
            r6 = r5
            goto L_0x0167
        L_0x0165:
            int r6 = r0 / 1000
        L_0x0167:
            if (r11 != r5) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            int r5 = r11 / 1000
        L_0x016c:
            if (r6 >= r5) goto L_0x0193
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Google Play services out of date for "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ".  Requires "
            r4.append(r3)
            r4.append(r11)
            java.lang.String r11 = " but found "
            r4.append(r11)
            r4.append(r0)
            java.lang.String r11 = r4.toString()
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.util.Log.w(r0, r11)
            r5 = 2
            goto L_0x01c8
        L_0x0193:
            android.content.pm.ApplicationInfo r11 = r7.applicationInfo
            if (r11 != 0) goto L_0x01b0
            java.lang.String r11 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r11 = r4.getApplicationInfo(r11, r2)     // Catch:{ NameNotFoundException -> 0x019e }
            goto L_0x01b0
        L_0x019e:
            r11 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r4 = "GooglePlayServicesUtil"
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.wtf(r4, r0, r11)
        L_0x01ae:
            r5 = r1
            goto L_0x01c8
        L_0x01b0:
            boolean r11 = r11.enabled
            if (r11 != 0) goto L_0x01b6
            r5 = 3
            goto L_0x01c8
        L_0x01b6:
            r5 = r2
            goto L_0x01c8
        L_0x01b8:
            java.lang.String r11 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r3 = "GooglePlayServicesUtil"
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.w(r3, r11)
            goto L_0x01ae
        L_0x01c8:
            r11 = 18
            if (r5 != r11) goto L_0x01cd
            goto L_0x01d5
        L_0x01cd:
            if (r5 != r1) goto L_0x01d4
            boolean r1 = z1.i.b(r10)
            goto L_0x01d5
        L_0x01d4:
            r1 = r2
        L_0x01d5:
            if (r1 == 0) goto L_0x01d8
            return r11
        L_0x01d8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.f.c(android.content.Context, int):int");
    }
}
