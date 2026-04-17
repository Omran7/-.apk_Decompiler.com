package e5;

import android.app.Dialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.V;

/* renamed from: e5.b  reason: case insensitive filesystem */
public final class C0505b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7671a = true;

    public C0505b(Context context, int i2) {
        super(context, R.style.CustomDialog);
        a(i2, false);
    }

    public final void a(int i2, boolean z3) {
        requestWindowFeature(1);
        setContentView(i2);
        setCancelable(z3);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setBackgroundDrawableResource(17170445);
        }
    }

    public final void show() {
        super.show();
        if (this.f7671a && PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getBoolean("buttons_and_ui_transitions_sounds", true)) {
            MediaPlayer create = MediaPlayer.create(MyApplication.f7090a.getApplicationContext(), R.raw.dialog_showen);
            create.start();
            create.setOnCompletionListener(new V(2));
        }
    }
}
