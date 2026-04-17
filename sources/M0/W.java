package m0;

import androidx.recyclerview.widget.RecyclerView;

public final class W extends C0807I {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9910a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0829v f9911b;

    public W(C0829v vVar) {
        this.f9911b = vVar;
    }

    public final void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0 && this.f9910a) {
            this.f9910a = false;
            this.f9911b.f();
        }
    }

    public final void b(RecyclerView recyclerView, int i2, int i5) {
        if (i2 != 0 || i5 != 0) {
            this.f9910a = true;
        }
    }
}
