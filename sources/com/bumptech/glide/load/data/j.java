package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

public final class j extends b {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5818e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AssetManager assetManager, String str, int i2) {
        super(0, str, assetManager);
        this.f5818e = i2;
    }

    public final Class b() {
        switch (this.f5818e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    public final void g(Object obj) {
        switch (this.f5818e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final Object h(AssetManager assetManager, String str) {
        switch (this.f5818e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
