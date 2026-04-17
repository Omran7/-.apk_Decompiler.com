package z;

import C0.a;
import S3.z;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.mtma.criminal.city.R;
import java.util.ArrayList;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12768a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f12769b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f12770c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f12771e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f12772f;
    public PendingIntent g;
    public IconCompat h;

    /* renamed from: i  reason: collision with root package name */
    public int f12773i;

    /* renamed from: j  reason: collision with root package name */
    public int f12774j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12775k = true;

    /* renamed from: l  reason: collision with root package name */
    public a f12776l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12777m = false;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f12778n;

    /* renamed from: o  reason: collision with root package name */
    public int f12779o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f12780p = 0;

    /* renamed from: q  reason: collision with root package name */
    public String f12781q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f12782r;

    /* renamed from: s  reason: collision with root package name */
    public final Notification f12783s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f12784t;

    public q(Context context, String str) {
        Notification notification = new Notification();
        this.f12783s = notification;
        this.f12768a = context;
        this.f12781q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f12774j = 0;
        this.f12784t = new ArrayList();
        this.f12782r = true;
    }

    public static CharSequence b(String str) {
        if (str != null && str.length() > 5120) {
            return str.subSequence(0, 5120);
        }
        return str;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        z zVar = new z(this);
        q qVar = (q) zVar.d;
        a aVar = qVar.f12776l;
        if (aVar != null) {
            aVar.h(zVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) zVar.f2712c;
        if (i2 >= 26) {
            notification = builder.build();
        } else {
            notification = builder.build();
        }
        if (aVar != null) {
            qVar.f12776l.getClass();
        }
        if (!(aVar == null || (bundle = notification.extras) == null)) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", aVar.j());
        }
        return notification;
    }

    public final void c(boolean z3) {
        Notification notification = this.f12783s;
        if (z3) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f12768a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f4880k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f4882b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void e(a aVar) {
        if (this.f12776l != aVar) {
            this.f12776l = aVar;
            if (((q) aVar.f398a) != this) {
                aVar.f398a = this;
                e(aVar);
            }
        }
    }
}
