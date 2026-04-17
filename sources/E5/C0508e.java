package e5;

import K4.e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.C0289v;
import com.mtma.criminal.city.R;

/* renamed from: e5.e  reason: case insensitive filesystem */
public final class C0508e extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public C0286s f7696a;

    /* renamed from: b  reason: collision with root package name */
    public final View f7697b;

    /* renamed from: c  reason: collision with root package name */
    public final View f7698c;
    public final C0289v d;

    /* renamed from: e  reason: collision with root package name */
    public int f7699e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f7700f = 0;

    public C0508e(C0289v vVar) {
        super(vVar);
        this.d = vVar;
        View inflate = ((LayoutInflater) vVar.getSystemService("layout_inflater")).inflate(R.layout.keyboard_height_usage, (ViewGroup) null, false);
        this.f7697b = inflate;
        setContentView(inflate);
        setSoftInputMode(21);
        setInputMethodMode(1);
        this.f7698c = vVar.findViewById(16908290);
        setWidth(0);
        setHeight(-1);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, 4));
    }
}
