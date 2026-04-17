package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: i.c  reason: case insensitive filesystem */
public final class C0573c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f8181f;

    /* renamed from: a  reason: collision with root package name */
    public int f8182a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f8183b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f8184c;
    public Configuration d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f8185e;

    public C0573c(Context context, int i2) {
        super(context);
        this.f8182a = i2;
    }

    public final void a(Configuration configuration) {
        if (this.f8185e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.d == null) {
            this.d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f8183b == null) {
            this.f8183b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8183b.setTo(theme);
            }
        }
        this.f8183b.applyStyle(this.f8182a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals(f8181f) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f8185e
            if (r0 != 0) goto L_0x0038
            android.content.res.Configuration r0 = r3.d
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0025
            android.content.res.Configuration r1 = f8181f
            if (r1 != 0) goto L_0x001c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            f8181f = r1
        L_0x001c:
            android.content.res.Configuration r1 = f8181f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            android.content.res.Configuration r0 = r3.d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f8185e = r0
            goto L_0x0038
        L_0x0032:
            android.content.res.Resources r0 = super.getResources()
            r3.f8185e = r0
        L_0x0038:
            android.content.res.Resources r0 = r3.f8185e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0573c.getResources():android.content.res.Resources");
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8184c == null) {
            this.f8184c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8184c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f8183b;
        if (theme != null) {
            return theme;
        }
        if (this.f8182a == 0) {
            this.f8182a = 2131952161;
        }
        b();
        return this.f8183b;
    }

    public final void setTheme(int i2) {
        if (this.f8182a != i2) {
            this.f8182a = i2;
            b();
        }
    }
}
