package k5;

import android.database.DataSetObserver;
import android.os.Parcelable;

/* renamed from: k5.b  reason: case insensitive filesystem */
public final class C0765b extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public Parcelable f9484a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0773j f9485b;

    public C0765b(C0773j jVar) {
        this.f9485b = jVar;
    }

    public final void a() {
        Parcelable parcelable;
        C0773j jVar = this.f9485b;
        jVar.f9586s = true;
        jVar.f9593z = jVar.f9592y;
        jVar.f9592y = jVar.getAdapter().getCount();
        if (!jVar.getAdapter().hasStableIds() || (parcelable = this.f9484a) == null || jVar.f9593z != 0 || jVar.f9592y <= 0) {
            jVar.f();
        } else {
            jVar.onRestoreInstanceState(parcelable);
            this.f9484a = null;
        }
        jVar.a();
        jVar.requestLayout();
    }

    public final void b() {
        C0773j jVar = this.f9485b;
        jVar.f9586s = true;
        if (jVar.getAdapter().hasStableIds()) {
            this.f9484a = jVar.onSaveInstanceState();
        }
        jVar.f9593z = jVar.f9592y;
        jVar.f9592y = 0;
        jVar.f9589v = -1;
        jVar.f9590w = Long.MIN_VALUE;
        jVar.f9587t = -1;
        jVar.f9588u = Long.MIN_VALUE;
        jVar.f9582f = false;
        jVar.a();
        jVar.requestLayout();
    }

    public final void onChanged() {
        a();
    }

    public final void onInvalidated() {
        b();
    }
}
