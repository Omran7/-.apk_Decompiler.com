package f;

import K4.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.mtma.criminal.city.R;
import e.C0476a;
import java.lang.ref.WeakReference;

/* renamed from: f.e  reason: case insensitive filesystem */
public final class C0514e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7760a;

    /* renamed from: b  reason: collision with root package name */
    public final C0515f f7761b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f7762c;
    public CharSequence d;

    /* renamed from: e  reason: collision with root package name */
    public AlertController$RecycleListView f7763e;

    /* renamed from: f  reason: collision with root package name */
    public Button f7764f;
    public Button g;
    public Button h;

    /* renamed from: i  reason: collision with root package name */
    public NestedScrollView f7765i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f7766j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f7767k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f7768l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f7769m;

    /* renamed from: n  reason: collision with root package name */
    public View f7770n;

    /* renamed from: o  reason: collision with root package name */
    public ListAdapter f7771o;

    /* renamed from: p  reason: collision with root package name */
    public int f7772p = -1;

    /* renamed from: q  reason: collision with root package name */
    public final int f7773q;

    /* renamed from: r  reason: collision with root package name */
    public final int f7774r;

    /* renamed from: s  reason: collision with root package name */
    public final int f7775s;

    /* renamed from: t  reason: collision with root package name */
    public final int f7776t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f7777u;

    /* renamed from: v  reason: collision with root package name */
    public final C0512c f7778v;

    /* renamed from: w  reason: collision with root package name */
    public final m f7779w = new m(this, 2);

    public C0514e(Context context, C0515f fVar, Window window) {
        this.f7760a = context;
        this.f7761b = fVar;
        this.f7762c = window;
        C0512c cVar = new C0512c();
        cVar.f7759b = new WeakReference(fVar);
        this.f7778v = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0476a.f7535e, R.attr.alertDialogStyle, 0);
        this.f7773q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f7774r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f7775s = obtainStyledAttributes.getResourceId(7, 0);
        this.f7776t = obtainStyledAttributes.getResourceId(3, 0);
        this.f7777u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        fVar.e().f(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
