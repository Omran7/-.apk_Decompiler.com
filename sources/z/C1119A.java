package z;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* renamed from: z.A  reason: case insensitive filesystem */
public final class C1119A {

    /* renamed from: a  reason: collision with root package name */
    public final NotificationManager f12745a;

    static {
        new HashSet();
    }

    public C1119A(Context context) {
        this.f12745a = (NotificationManager) context.getSystemService("notification");
    }
}
