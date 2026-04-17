package U1;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import s2.e;
import z1.g;
import z1.h;

public final class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f3703a;

    public b(Context context, e eVar) {
        this.f3703a = context;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            a.a(this.f3703a);
            return 0;
        } catch (h e6) {
            return Integer.valueOf(e6.f12813a);
        } catch (g e7) {
            return Integer.valueOf(e7.f12812a);
        }
    }

    public final void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            F3.h.f746i.setResult(null);
            return;
        }
        a.f3700a.a(num.intValue(), this.f3703a, "pi");
        Log.d("FirebaseFunctions", "Failed to update ssl context");
        F3.h.f746i.setResult(null);
    }
}
