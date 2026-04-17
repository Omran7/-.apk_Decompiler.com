package B;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f153a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f154b;

    /* renamed from: c  reason: collision with root package name */
    public final int f155c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int i2;
        this.f153a = colorStateList;
        this.f154b = configuration;
        if (theme == null) {
            i2 = 0;
        } else {
            i2 = theme.hashCode();
        }
        this.f155c = i2;
    }
}
