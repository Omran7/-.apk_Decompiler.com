package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

public abstract class IntegrityTokenResponse {
    public abstract Task<Integer> showDialog(Activity activity, int i2);

    public abstract String token();
}
