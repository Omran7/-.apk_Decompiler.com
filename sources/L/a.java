package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f1687a;

    /* renamed from: b  reason: collision with root package name */
    public final j f1688b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1689c;

    public a(int i2, j jVar, int i5) {
        this.f1687a = i2;
        this.f1688b = jVar;
        this.f1689c = i5;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1687a);
        this.f1688b.f1702a.performAction(this.f1689c, bundle);
    }
}
