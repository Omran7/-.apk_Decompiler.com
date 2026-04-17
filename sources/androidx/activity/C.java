package androidx.activity;

import W0.p;
import androidx.fragment.app.I;
import com.mtma.criminal.city.activities.MainActivity;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.i;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4604a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f4605b;

    /* renamed from: c  reason: collision with root package name */
    public i f4606c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4607e;

    public C(boolean z3) {
        this.f4604a = z3;
        this.f4605b = new CopyOnWriteArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C(boolean z3, p pVar) {
        this(z3);
        this.d = 0;
        this.f4607e = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C(I i2) {
        this(false);
        this.d = 1;
        this.f4607e = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C(MainActivity mainActivity) {
        this(true);
        this.d = 2;
        this.f4607e = mainActivity;
    }
}
