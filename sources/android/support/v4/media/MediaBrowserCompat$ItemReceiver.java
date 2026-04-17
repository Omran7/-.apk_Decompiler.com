package android.support.v4.media;

import a.C0253e;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;

class MediaBrowserCompat$ItemReceiver extends C0253e {
    public final void a(int i2, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a.class.getClassLoader());
        }
        if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
