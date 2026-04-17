package S3;

import I1.b;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class w implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2705a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2706b;

    public /* synthetic */ w(Context context, boolean z3) {
        this.f2705a = context;
        this.f2706b = z3;
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        SharedPreferences.Editor edit = b.X(this.f2705a).edit();
        edit.putBoolean("proxy_retention", this.f2706b);
        edit.apply();
    }
}
