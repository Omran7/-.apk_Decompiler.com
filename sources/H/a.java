package H;

import B.b;
import android.util.Log;
import androidx.emoji2.text.h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.internal.H;
import com.google.android.material.datepicker.k;
import java.util.ArrayList;
import java.util.List;
import m0.C0804F;
import x1.i;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f963a;

    /* renamed from: b  reason: collision with root package name */
    public final int f964b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f965c;

    public /* synthetic */ a(Object obj, int i2, int i5) {
        this.f963a = i5;
        this.f965c = obj;
        this.f964b = i2;
    }

    public final void run() {
        switch (this.f963a) {
            case 0:
                b bVar = (b) ((i) this.f965c).f12553b;
                if (bVar != null) {
                    bVar.g(this.f964b);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f965c;
                int size = arrayList.size();
                int i2 = 0;
                if (this.f964b != 1) {
                    while (i2 < size) {
                        ((h) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    return;
                }
                while (i2 < size) {
                    ((h) arrayList.get(i2)).a();
                    i2++;
                }
                return;
            case 2:
                ((H) this.f965c).h(this.f964b);
                return;
            default:
                RecyclerView recyclerView = ((k) this.f965c).f6419k0;
                if (!recyclerView.f5330D) {
                    C0804F f6 = recyclerView.f5378u;
                    if (f6 == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        f6.x0(recyclerView, this.f964b);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public a(List list, int i2, Throwable th) {
        this.f963a = 1;
        c.e(list, "initCallbacks cannot be null");
        this.f965c = new ArrayList(list);
        this.f964b = i2;
    }
}
