package z1;

import G1.c;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0289v;
import androidx.fragment.app.I;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C0359m;
import com.google.android.gms.common.internal.C0394x;
import com.google.android.gms.common.internal.C0395y;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import h0.C0552a;
import o3.d;
import z.k;
import z.q;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f12809c = new Object();
    public static final e d = new Object();

    public static AlertDialog e(Activity activity, int i2, C0395y yVar, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(C0394x.b(activity, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i2 == 1) {
            str = resources.getString(R.string.common_google_play_services_install_button);
        } else if (i2 == 2) {
            str = resources.getString(R.string.common_google_play_services_update_button);
        } else if (i2 != 3) {
            str = resources.getString(17039370);
        } else {
            str = resources.getString(R.string.common_google_play_services_enable_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, yVar);
        }
        String c3 = C0394x.c(activity, i2);
        if (c3 != null) {
            builder.setTitle(c3);
        }
        Log.w("GoogleApiAvailability", a.f(i2, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [z1.c, android.app.DialogFragment] */
    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C0289v) {
                I l6 = ((C0289v) activity).l();
                k kVar = new k();
                com.google.android.gms.common.internal.I.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                kVar.f12821r0 = alertDialog;
                if (onCancelListener != null) {
                    kVar.s0 = onCancelListener;
                }
                kVar.f5128o0 = false;
                kVar.f5129p0 = true;
                C0269a b6 = d.b(l6, l6);
                b6.f5081p = true;
                b6.f(0, kVar, str, 1);
                b6.e(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment = new DialogFragment();
        com.google.android.gms.common.internal.I.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment.f12803a = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f12804b = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final int b(Context context) {
        return c(context, f.f12810a);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i2, GoogleApiActivity googleApiActivity2) {
        AlertDialog e6 = e(googleApiActivity, i2, new C0395y(super.a(i2, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (e6 != null) {
            f(googleApiActivity, e6, "GooglePlayServicesErrorDialog", googleApiActivity2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, z.o, C0.a] */
    public final void g(Context context, int i2, PendingIntent pendingIntent) {
        String str;
        String str2;
        int i5;
        Log.w("GoogleApiAvailability", C0552a.k(i2, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i2 == 6) {
                str = C0394x.e(context, "common_google_play_services_resolution_required_title");
            } else {
                str = C0394x.c(context, i2);
            }
            if (str == null) {
                str = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i2 == 6 || i2 == 19) {
                str2 = C0394x.d(context, "common_google_play_services_resolution_required_text", C0394x.a(context));
            } else {
                str2 = C0394x.b(context, i2);
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            com.google.android.gms.common.internal.I.g(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            q qVar = new q(context, (String) null);
            qVar.f12777m = true;
            qVar.c(true);
            qVar.f12771e = q.b(str);
            ? obj = new Object();
            obj.f12767b = q.b(str2);
            qVar.e(obj);
            PackageManager packageManager = context.getPackageManager();
            if (c.f826c == null) {
                c.f826c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (c.f826c.booleanValue()) {
                qVar.f12783s.icon = context.getApplicationInfo().icon;
                qVar.f12774j = 2;
                if (c.f(context)) {
                    qVar.f12769b.add(new k(resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    qVar.g = pendingIntent;
                }
            } else {
                qVar.f12783s.icon = 17301642;
                String string = resources.getString(R.string.common_google_play_services_notification_ticker);
                qVar.f12783s.tickerText = q.b(string);
                qVar.f12783s.when = System.currentTimeMillis();
                qVar.g = pendingIntent;
                qVar.f12772f = q.b(str2);
            }
            if (c.d()) {
                if (c.d()) {
                    synchronized (f12809c) {
                    }
                    NotificationChannel b6 = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String string2 = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (b6 == null) {
                        notificationManager.createNotificationChannel(Y0.a.c(string2));
                    } else if (!string2.contentEquals(b6.getName())) {
                        b6.setName(string2);
                        notificationManager.createNotificationChannel(b6);
                    }
                    qVar.f12781q = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            }
            Notification a6 = qVar.a();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i.f12814a.set(false);
                i5 = 10436;
            } else {
                i5 = 39789;
            }
            notificationManager.notify(i5, a6);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public final void h(Activity activity, C0359m mVar, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e6 = e(activity, i2, new C0395y(super.a(i2, activity, "d"), mVar, 1), onCancelListener);
        if (e6 != null) {
            f(activity, e6, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }
}
