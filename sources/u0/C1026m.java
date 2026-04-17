package u0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: u0.m  reason: case insensitive filesystem */
public final class C1026m extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f11821a;

    /* renamed from: b  reason: collision with root package name */
    public C1025l f11822b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f11823c;
    public PorterDuff.Mode d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11824e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f11825f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* renamed from: i  reason: collision with root package name */
    public int f11826i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11827j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11828k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f11829l;

    public int getChangingConfigurations() {
        return this.f11821a;
    }

    public final Drawable newDrawable() {
        return new C1028o(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C1028o(this);
    }
}
