package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.f;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5806a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5807b;

    /* renamed from: c  reason: collision with root package name */
    public final Comparable f5808c;
    public final Object d;

    public /* synthetic */ b(int i2, Comparable comparable, Object obj) {
        this.f5806a = i2;
        this.d = obj;
        this.f5808c = comparable;
    }

    public final void c() {
        switch (this.f5806a) {
            case 0:
                Object obj = this.f5807b;
                if (obj != null) {
                    try {
                        g(obj);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    return;
                }
            default:
                Object obj2 = this.f5807b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void cancel() {
        int i2 = this.f5806a;
    }

    public final int e() {
        switch (this.f5806a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final void f(f fVar, d dVar) {
        switch (this.f5806a) {
            case 0:
                try {
                    Object h = h((AssetManager) this.d, (String) this.f5808c);
                    this.f5807b = h;
                    dVar.d(h);
                    return;
                } catch (IOException e6) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e6);
                    }
                    dVar.a(e6);
                    return;
                }
            default:
                try {
                    Object i2 = i((Uri) this.f5808c, (ContentResolver) this.d);
                    this.f5807b = i2;
                    dVar.d(i2);
                    return;
                } catch (FileNotFoundException e7) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e7);
                    }
                    dVar.a(e7);
                    return;
                }
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);

    private final void a() {
    }

    private final void d() {
    }
}
