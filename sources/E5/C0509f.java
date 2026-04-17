package e5;

import B4.b;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.view.View;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.V;

/* renamed from: e5.f  reason: case insensitive filesystem */
public abstract class C0509f implements View.OnClickListener {
    public C0509f(View view) {
        view.setOnTouchListener(new b(view, 5));
    }

    public void onClick(View view) {
        if (PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getBoolean("buttons_and_ui_transitions_sounds", true)) {
            MediaPlayer create = MediaPlayer.create(MyApplication.f7090a.getApplicationContext(), R.raw.button_clicked);
            create.start();
            create.setOnCompletionListener(new V(1));
        }
    }
}
