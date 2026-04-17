package G5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: G5.e  reason: case insensitive filesystem */
public final class C0027e {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f903b = AtomicIntegerFieldUpdater.newUpdater(C0027e.class, "notCompletedCount$volatile");

    /* renamed from: a  reason: collision with root package name */
    public final I[] f904a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0027e(I[] iArr) {
        this.f904a = iArr;
        this.notCompletedCount$volatile = iArr.length;
    }
}
