package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

public final class a extends b {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5805e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, int i2) {
        super(1, uri, contentResolver);
        this.f5805e = i2;
    }

    public final Class b() {
        switch (this.f5805e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    public final void g(Object obj) {
        switch (this.f5805e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((ParcelFileDescriptor) obj).close();
                return;
        }
    }

    public final Object i(Uri uri, ContentResolver contentResolver) {
        switch (this.f5805e) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    return openAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}
