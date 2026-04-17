package k5;

import E2.d;
import android.widget.ListAdapter;

/* renamed from: k5.f  reason: case insensitive filesystem */
public final class C0769f extends d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public int f9490c;
    public final /* synthetic */ C0773j d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0769f(C0773j jVar) {
        super(jVar);
        this.d = jVar;
    }

    public final void run() {
        C0773j jVar = this.d;
        if (!jVar.f9586s) {
            ListAdapter listAdapter = jVar.f9529Q;
            int i2 = this.f9490c;
            if (listAdapter != null && jVar.f9592y > 0 && i2 != -1 && i2 < listAdapter.getCount() && E() && jVar.getChildAt(i2 - jVar.f9578a) != null) {
                jVar.E(i2, listAdapter.getItemId(i2));
            }
        }
    }
}
