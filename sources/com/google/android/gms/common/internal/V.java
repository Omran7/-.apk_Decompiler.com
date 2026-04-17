package com.google.android.gms.common.internal;

import android.net.Uri;

public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f6163a = 0;

    static {
        Uri.parse("https://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
    }
}
