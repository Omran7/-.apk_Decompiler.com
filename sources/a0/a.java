package A0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

public final class a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f9c = {"_data"};
    public static final String[] d = {"_data"};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f11b;

    public /* synthetic */ a(ContentResolver contentResolver, int i2) {
        this.f10a = i2;
        this.f11b = contentResolver;
    }

    public final Cursor a(Uri uri) {
        switch (this.f10a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f11b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f9c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f11b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, (String) null);
        }
    }
}
