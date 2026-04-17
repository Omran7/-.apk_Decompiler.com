package androidx.emoji2.text;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zze;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f4926a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4927b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Object f4928c;

    public /* synthetic */ f(Object obj) {
        this.f4927b = obj;
    }

    public boolean a() {
        Context context = (Context) this.f4927b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e6) {
            zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e6);
            return false;
        }
    }
}
