package android.support.v4.media;

import a.C0253e;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver extends C0253e {
    public final void a(int i2, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(a.class.getClassLoader());
        }
        if (i2 != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
