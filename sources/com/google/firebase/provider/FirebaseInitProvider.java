package com.google.firebase.provider;

import R2.a;
import R2.i;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6913a = new a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f6914b = new AtomicBoolean(false);

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        I.h(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        AtomicBoolean atomicBoolean = f6914b;
        try {
            atomicBoolean.set(true);
            if (i.i(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            atomicBoolean.set(false);
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
