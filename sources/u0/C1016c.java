package u0;

import android.graphics.drawable.Drawable;

/* renamed from: u0.c  reason: case insensitive filesystem */
public final class C1016c implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1018e f11780a;

    public C1016c(C1018e eVar) {
        this.f11780a = eVar;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f11780a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        this.f11780a.scheduleSelf(runnable, j6);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f11780a.unscheduleSelf(runnable);
    }
}
