package H3;

import K3.b;
import android.content.Context;

public final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1006a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f1007b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f1008c;

    public /* synthetic */ c(int i2, Context context, String str) {
        this.f1006a = i2;
        this.f1007b = context;
        this.f1008c = str;
    }

    public final Object get() {
        switch (this.f1006a) {
            case 0:
                return new i(this.f1007b, this.f1008c);
            default:
                return this.f1007b.getSharedPreferences(this.f1008c, 0);
        }
    }
}
