package z;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f12760a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f12761b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12762c;
    public final boolean d = true;

    /* renamed from: e  reason: collision with root package name */
    public final int f12763e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f12764f;
    public final PendingIntent g;

    public k(String str, PendingIntent pendingIntent) {
        IconCompat b6 = IconCompat.b(2131165421);
        Bundle bundle = new Bundle();
        this.f12761b = b6;
        if (b6.d() == 2) {
            this.f12763e = b6.c();
        }
        this.f12764f = q.b(str);
        this.g = pendingIntent;
        this.f12760a = bundle;
        this.f12762c = true;
        this.d = true;
    }
}
